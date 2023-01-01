/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.radiance.tools.shapeeditor

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.swing.ktx.addDelayedMouseListener
import org.pushingpixels.radiance.swing.ktx.addDelayedMouseMotionListener
import org.pushingpixels.radiance.swing.ktx.awt.render
import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin
import org.pushingpixels.radiance.theming.extras.api.shaperpack.CanonicalPath
import org.pushingpixels.radiance.theming.extras.api.shaperpack.ShaperRepository
import org.pushingpixels.radiance.tools.common.RadianceLogo
import java.awt.*
import java.awt.geom.Point2D
import java.awt.image.BufferedImage
import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.*
import javax.imageio.ImageIO
import javax.swing.*
import javax.swing.border.TitledBorder

class ShapeEditor : JFrame() {
    private var majorPoints: ArrayList<Point2D>? = null

    private var minorPoints: ArrayList<Point2D>? = null

    private var isInEditMajorMode: Boolean = false

    private var isShowImage: Boolean = false

    private var isShowPath: Boolean = false

    private val loadImageButton: JButton

    private val loadContourButton: JButton

    private val showImageCB: JCheckBox

    private val showPathCB: JCheckBox

    private val editMajorRB: JRadioButton

    private val editMinorRB: JRadioButton

    private val addModeRB: JRadioButton

    private val deleteModeRB: JRadioButton

    private val editModeRB: JRadioButton

    private val saveContourButton: JButton

    private val cancelButton: JButton

    private lateinit var shapePanel: ShapePanel

    private class ShapePanel(private val editorFrame: ShapeEditor) : JPanel() {
        internal var image: BufferedImage? = null

        private var selectedPointIndex: Int = -1

        val ratio: Double
            get() = if (this.image == null) {
                1.0
            } else this.image!!.width.toDouble() / this.image!!.height.toDouble()

        init {
            this.addDelayedMouseListener(onMousePressed = onMousePressed@{ e ->
                if (editorFrame.addModeRB.isSelected) {
                    if (selectedPointIndex >= 0) {
                        // add new major point at click
                        val major = editorFrame.majorPoints
                        val minor = editorFrame.minorPoints
                        val newMajor = Point2D.Double(e!!.x.toDouble() / width,
                                e.y.toDouble() / height)
                        val selectedX = major!![selectedPointIndex].x
                        val selectedY = major[selectedPointIndex].y
                        val newMinor = Point2D.Double(
                                (width * selectedX + e.x) / (2.0 * width),
                                (height * selectedY + e.y) / (2.0 * height))
                        major.add(selectedPointIndex + 1, newMajor)
                        minor!!.add(selectedPointIndex, newMinor)
                        selectedPointIndex++

                        val majorNext = if (selectedPointIndex == major.size - 1) {
                            major[0]
                        } else {
                            major[selectedPointIndex + 1]
                        }
                        minor[selectedPointIndex].setLocation(
                                0.5 * (newMajor.getX() + majorNext.x),
                                0.5 * (newMajor.getY() + majorNext.y))

                        editorFrame.repaint()
                        return@onMousePressed
                    }
                }

                val majorIndex = getMajorPointIndex(e!!.point)
                if (majorIndex >= 0) {
                    if (editorFrame.deleteModeRB.isSelected) {
                        if (editorFrame.majorPoints!!.size > 1) {
                            // delete major and previous minor
                            editorFrame.majorPoints!!.removeAt(majorIndex)
                            val minorToRemove: Point2D
                            if (majorIndex != 0) {
                                minorToRemove = editorFrame.minorPoints!![majorIndex - 1]
                            } else {
                                minorToRemove = editorFrame.minorPoints!![editorFrame.minorPoints!!.size - 1]
                            }
                            val newMinorX = 0.5 * (minorToRemove.x + editorFrame.minorPoints!![majorIndex].x)
                            val newMinorY = 0.5 * (minorToRemove.y + editorFrame.minorPoints!![majorIndex].y)
                            editorFrame.minorPoints!![majorIndex].setLocation(newMinorX,
                                    newMinorY)
                            editorFrame.minorPoints!!.remove(minorToRemove)
                            if (majorIndex == 0) {
                                editorFrame.minorPoints!!.add(editorFrame.minorPoints!!.removeAt(0))
                            }
                            selectedPointIndex = -1
                        }
                    } else {
                        selectedPointIndex = majorIndex
                        editorFrame.editMajorRB.isSelected = true
                        editorFrame.isInEditMajorMode = true
                    }
                    editorFrame.repaint()
                    return@onMousePressed
                }
                if (!editorFrame.addModeRB.isSelected) {
                    val minorIndex = getMinorPointIndex(e.point)
                    if (minorIndex >= 0) {
                        selectedPointIndex = minorIndex
                        editorFrame.editMinorRB.isSelected = true
                        editorFrame.isInEditMajorMode = false
                        editorFrame.repaint()
                        return@onMousePressed
                    }
                }
                selectedPointIndex = -1
                editorFrame.repaint()
            })

            this.addDelayedMouseMotionListener(onMouseDragged = { e ->
                if (editorFrame.editModeRB.isSelected && (selectedPointIndex >= 0)) {
                    val newX = e!!.x.toDouble() / width
                    val newY = e.y.toDouble() / height

                    if (editorFrame.isInEditMajorMode) {
                        editorFrame.majorPoints!![selectedPointIndex].setLocation(newX, newY)
                    } else {
                        editorFrame.minorPoints!![selectedPointIndex].setLocation(newX, newY)
                    }
                    editorFrame.repaint()
                }
            })
        }

        fun translate(relative: Point2D): Point2D {
            return Point2D.Double(relative.x * this.width, relative.y * this.height)
        }

        fun getMajorPointIndex(point: Point): Int {
            for (i in this.editorFrame.majorPoints!!.indices) {
                val majorPoint = this.editorFrame.majorPoints!![i]
                if (point.distance(this.translate(majorPoint)) < 3.0) {
                    return i
                }
            }
            return -1
        }

        fun getMinorPointIndex(point: Point): Int {
            for (i in this.editorFrame.minorPoints!!.indices) {
                val minorPoint = this.editorFrame.minorPoints!![i]
                if (point.distance(this.translate(minorPoint)) < 3.0) {
                    return i
                }
            }
            return -1
        }

        override fun paint(g: Graphics) {
            g.render {
                it.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
                val controlFont = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().controlFont
                it.font = controlFont.deriveFont(10f)
                RadianceCommonCortex.installDesktopHints(it, it.font)

                val width = this.width
                val height = this.height

                // image
                if (this.image != null && this.editorFrame.isShowImage) {
                    it.drawImage(this.image, 0, 0, width, height, 0, 0, this.image!!.width,
                            this.image!!.height, null)
                }

                val strokeSize = 1.0f / RadianceCommonCortex.getScaleFactor(this.editorFrame).toFloat()
                // grid
                it.color = Color(0, 0, 0, 128)
                it.stroke = BasicStroke(strokeSize, BasicStroke.CAP_ROUND,
                        BasicStroke.JOIN_BEVEL, 1.0f, floatArrayOf(3.0f, 2.0f), 0.0f)
                for (i in 0..10) {
                    val x = i * width / 10
                    it.drawLine(x, 0, x, height)
                    val y = i * height / 10
                    it.drawLine(0, y, width, y)
                }

                it.stroke = BasicStroke(strokeSize)
                // points
                for (i in this.editorFrame.majorPoints!!.indices) {
                    val majorPoint = this.translate(this.editorFrame.majorPoints!![i])
                    val x = majorPoint.x.toInt()
                    val y = majorPoint.y.toInt()
                    this.paintOval(it, x, y, 3, Color.black, Color(0, 128, 255))

                    val isSelected = this.editorFrame.isInEditMajorMode && i == this.selectedPointIndex
                    if (isSelected) {
                        this.paintOval(it, x, y - 4, 1, Color.green, Color(0, 128, 0))
                        this.paintOval(it, x - 4, y, 1, Color.green, Color(0, 128, 0))
                        this.paintOval(it, x, y + 4, 1, Color.green, Color(0, 128, 0))
                        this.paintOval(it, x + 4, y, 1, Color.green, Color(0, 128, 0))
                    }

                    it.color = Color.black
                    it.drawString("" + i, x + 5, y)
                }

                for (i in this.editorFrame.minorPoints!!.indices) {
                    val minorPoint = this.translate(this.editorFrame.minorPoints!![i])
                    val x = minorPoint.x.toInt()
                    val y = minorPoint.y.toInt()
                    this.paintOval(it, x, y, 3, Color.black, Color(128, 255, 255))

                    val isSelected = !this.editorFrame.isInEditMajorMode && i == this.selectedPointIndex
                    if (isSelected) {
                        this.paintOval(it, x, y - 4, 1, Color.green, Color(0, 128, 0))
                        this.paintOval(it, x - 4, y, 1, Color.green, Color(0, 128, 0))
                        this.paintOval(it, x, y + 4, 1, Color.green, Color(0, 128, 0))
                        this.paintOval(it, x + 4, y, 1, Color.green, Color(0, 128, 0))
                    }

                    it.color = Color.black
                    it.drawString("" + i, x + 5, y)
                }

                // path
                if (this.editorFrame.isShowPath) {
                    val canonical =
                        CanonicalPath(
                            this.editorFrame.majorPoints!!,
                            this.editorFrame.minorPoints!!, this.ratio
                        )
                    val path = canonical.getPath(width.toFloat(), height.toFloat(), 0f)

                    it.color = Color(96, 0, 0, 200)
                    it.stroke = BasicStroke(strokeSize * 1.4f)
                    it.draw(path)
                }
            }
        }

        private fun paintOval(graphics: Graphics2D, x: Int, y: Int, radius: Int, outer: Color,
                inner: Color) {
            graphics.color = inner
            graphics.fillOval(x - radius, y - radius, 2 * radius, 2 * radius)
            graphics.color = outer
            graphics.drawOval(x - radius, y - radius, 2 * radius, 2 * radius)
        }
    }

    init {
        this.loadImageButton = JButton("Load image")
        this.loadContourButton = JButton("Load contour")
        this.showImageCB = JCheckBox("Show image")
        this.showPathCB = JCheckBox("Show path")
        this.editMajorRB = JRadioButton("Edit major points")
        this.editMinorRB = JRadioButton("Edit minor points")
        this.addModeRB = JRadioButton("Add mode")
        this.deleteModeRB = JRadioButton("Delete mode")
        this.editModeRB = JRadioButton("Edit mode")
        this.saveContourButton = JButton("Save contour")
        this.cancelButton = JButton("Cancel")

        val editGroup = ButtonGroup()
        editGroup.add(this.editMajorRB)
        editGroup.add(this.editMinorRB)

        val addDeleteGroup = ButtonGroup()
        addDeleteGroup.add(this.addModeRB)
        addDeleteGroup.add(this.deleteModeRB)
        addDeleteGroup.add(this.editModeRB)

        this.editMajorRB.isSelected = true
        this.addModeRB.isSelected = true

        this.showPathCB.isSelected = true
        this.isShowPath = true
        this.showImageCB.isSelected = true
        this.isShowImage = true
        this.showImageCB.isEnabled = false

        this.loadImageButton.addActionListener {
            val chooser = JFileChooser()
            chooser.fileSelectionMode = JFileChooser.FILES_ONLY
            // modalize on the main frame
            val returnVal = chooser.showOpenDialog(this@ShapeEditor)
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                val selected = chooser.selectedFile
                try {
                    val image = ImageIO.read(selected)
                    shapePanel.image = image
                    showImageCB.isEnabled = true
                } catch (exc: Exception) {
                    shapePanel.image = null
                    showImageCB.isEnabled = false
                }

                repaint()
            }
        }

        this.loadContourButton.addActionListener {
            val chooser = JFileChooser()
            chooser.fileSelectionMode = JFileChooser.FILES_ONLY
            // modalize on the main frame
            val returnVal = chooser.showOpenDialog(this@ShapeEditor)
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                val selected = chooser.selectedFile
                try {
                    val path = ShaperRepository.read(FileInputStream(selected))
                    if (path != null) {
                        majorPoints = path.majorPoints
                        minorPoints = path.minorPoints
                    }
                } catch (exc: Exception) {
                }

                repaint()
            }
        }

        this.saveContourButton.addActionListener {
            val chooser = JFileChooser()
            chooser.fileSelectionMode = JFileChooser.FILES_ONLY
            // modalize on the main frame
            val returnVal = chooser.showOpenDialog(this@ShapeEditor)
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                val selected = chooser.selectedFile
                try {
                    val path =
                        CanonicalPath(
                            majorPoints!!,
                            minorPoints!!,
                            shapePanel.ratio
                        )
                    ShaperRepository.write(FileOutputStream(selected), path)
                } catch (exc: Exception) {
                }

                repaint()
            }
        }

        this.showImageCB.addActionListener {
            isShowImage = showImageCB.isSelected
            repaint()
        }

        this.showPathCB.addActionListener {
            isShowPath = showPathCB.isSelected
            repaint()
        }

        this.addModeRB.addActionListener {
            editMajorRB.isSelected = true
            isInEditMajorMode = true
            repaint()
        }

        val topPanel = JPanel(FlowLayout(FlowLayout.CENTER))
        topPanel.add(this.loadImageButton)
        topPanel.add(this.loadContourButton)

        val midPanel = JPanel(GridLayout(3, 1))
        val showPanel = JPanel(GridLayout(2, 1))
        showPanel.add(this.showImageCB)
        showPanel.add(this.showPathCB)
        showPanel.border = TitledBorder("Show controls")
        midPanel.add(showPanel)

        val editModePanel = JPanel(GridLayout(2, 1))
        editModePanel.add(this.editMajorRB)
        editModePanel.add(this.editMinorRB)
        editModePanel.border = TitledBorder("Major / minor mode")
        midPanel.add(editModePanel)

        val addDeleteModePanel = JPanel(GridLayout(3, 1))
        addDeleteModePanel.add(this.addModeRB)
        addDeleteModePanel.add(this.deleteModeRB)
        addDeleteModePanel.add(this.editModeRB)
        addDeleteModePanel.border = TitledBorder("Work mode")
        midPanel.add(addDeleteModePanel)

        val bottomPanel = JPanel(FlowLayout(FlowLayout.CENTER))
        bottomPanel.add(this.saveContourButton)
        bottomPanel.add(this.cancelButton)

        val controlPanel = JPanel(BorderLayout())
        controlPanel.add(topPanel, BorderLayout.NORTH)
        controlPanel.add(midPanel, BorderLayout.CENTER)
        controlPanel.add(bottomPanel, BorderLayout.SOUTH)

        this.layout = BorderLayout()
        this.add(controlPanel, BorderLayout.WEST)

        this.shapePanel = ShapePanel(this)
        this.add(this.shapePanel, BorderLayout.CENTER)

        this.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        this.majorPoints = ArrayList()
        this.majorPoints!!.add(Point2D.Double(0.5, 0.5))
        this.minorPoints = ArrayList()
        this.minorPoints!!.add(Point2D.Double(0.55, 0.55))

        this.iconImage = RadianceLogo.getTitlePaneLogoImage(this)
    }
}

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        RadianceThemingCortex.GlobalScope.setSkin(
            BusinessBlackSteelSkin()
        )

        val editor = ShapeEditor()
        editor.preferredSize = Dimension(600, 400)
        editor.size = editor.preferredSize
        editor.setLocationRelativeTo(null)

        editor.isVisible = true
    }
}
