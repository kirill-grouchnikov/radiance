/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.common

import org.pushingpixels.meteor.awt.render
import org.pushingpixels.meteor.swing.KeyboardActionScopeType
import org.pushingpixels.meteor.swing.wireActionToKeyStroke
import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex

import javax.imageio.ImageIO
import javax.swing.*
import java.awt.*
import java.awt.datatransfer.*
import java.awt.event.*
import java.awt.image.BufferedImage
import java.io.File
import java.net.URL
import kotlin.properties.Delegates

class JImageComponent(hasKeyboardZoom: Boolean) : JPanel() {
    var image: BufferedImage? by Delegates.observable(null) {
        prop, old, new -> this.firePropertyChange(prop.name, old, new)
    }

    private var leftX: Double = 0.0

    private var topY: Double = 0.0

    private var zoom: Double = 0.0

    private var isDragging: Boolean = false

    private var lastDragPoint: Point? = null

    var selectedColor: Color? by Delegates.observable(null) {
        prop, old, new -> this.firePropertyChange(prop.name, old, new)
    }

    private var rolloverColor: Color? = null

    var originalFile: File? by Delegates.observable(null) {
        prop, old, new -> this.firePropertyChange(prop.name, old, new)
    }

    private var legend: Array<String>? = null

    init {
        this.transferHandler = object : TransferHandler() {
            override fun canImport(support: TransferHandler.TransferSupport): Boolean {
                // can import a list of files
                if (support.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                    return true
                }
                // an image
                if (support.isDataFlavorSupported(DataFlavor.imageFlavor)) {
                    return true
                }
                for (df in support.dataFlavors) {
                    // and a flavor represented by URL
                    if (df.representationClass == URL::class.java) {
                        return true
                    }
                }
                return false
            }

            override fun importData(support: TransferHandler.TransferSupport): Boolean {
                val t = support.transferable

                try {
                    if (t.isDataFlavorSupported(DataFlavor.imageFlavor)) {
                        // load the image
                        val data = t.getTransferData(DataFlavor.imageFlavor) as Image
                        originalFile = null
                        image = BufferedImage(data.getWidth(null), data.getHeight(null),
                                BufferedImage.TYPE_INT_ARGB)
                        image!!.graphics.drawImage(data, 0, 0, null)
                        reset()
                        repaint()

                        return true
                    }

                    if (t.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                        // load the image from the file
                        val l = t.getTransferData(DataFlavor.javaFileListFlavor) as List<*>

                        if (l.size == 1) {
                            image = ImageIO.read(l[0] as File)
                            originalFile = l[0] as File
                            reset()
                            repaint()
                        }
                        return true
                    }

                    for (df in support.dataFlavors) {
                        if (df.representationClass == URL::class.java) {
                            // load the image from the URL
                            val url = t.getTransferData(df) as URL
                            originalFile = null
                            val data = ImageIO.read(url)
                            if (data != null) {
                                image = BufferedImage(data.getWidth(null), data.getHeight(null),
                                        BufferedImage.TYPE_INT_ARGB)
                                image!!.graphics.drawImage(data, 0, 0, null)
                                reset()
                                repaint()

                                return true
                            }
                        }
                    }
                    return true
                } catch (thr: Throwable) {
                    thr.printStackTrace()
                    return false
                }
            }
        }

        this.addMouseListener(object : MouseAdapter() {
            override fun mousePressed(e: MouseEvent?) {
                if (image == null) {
                    return
                }

                if (!e!!.isPopupTrigger) {
                    lastDragPoint = e.point
                } else {
                    processPopup(e)
                }
            }

            override fun mouseReleased(e: MouseEvent?) {
                if (e!!.isPopupTrigger) {
                    processPopup(e)
                } else {
                    if (image == null) {
                        return
                    }

                    if (!isDragging) {
                        val xRel = e.x
                        val yRel = e.y
                        val xAbs = (xRel / zoom + leftX).toInt()
                        val yAbs = (yRel / zoom + topY).toInt()

                        if (xAbs >= 0 && xAbs < image!!.width
                                && yAbs >= 0 && yAbs < image!!.height) {
                            selectedColor = Color(image!!.getRGB(xAbs, yAbs))
                        }
                    }
                    isDragging = false
                }
            }

            private fun processPopup(e: MouseEvent) {
                val editMenu = JPopupMenu()
                editMenu.add(object : AbstractAction("paste from clipboard") {
                    override fun actionPerformed(e: ActionEvent) {
                        try {
                            val clipboard = Toolkit.getDefaultToolkit().systemClipboard
                            val flavors = clipboard.availableDataFlavors
                            if (flavors != null) {
                                for (flavor in flavors) {
                                    if (Image::class.java == flavor.representationClass) {
                                        val data = clipboard.getData(flavor) as Image

                                        originalFile = null
                                        image = BufferedImage(data.getWidth(null),
                                                data.getHeight(null),
                                                BufferedImage.TYPE_INT_ARGB)
                                        image!!.graphics.drawImage(data, 0, 0, null)
                                        reset()
                                        repaint()
                                        break
                                    }
                                }
                            }
                            repaint()
                        } catch (thr: Throwable) {
                        }

                    }

                    override fun isEnabled(): Boolean {
                        val clipboard = Toolkit.getDefaultToolkit().systemClipboard
                        val flavors = clipboard.availableDataFlavors
                        if (flavors != null) {
                            for (flavor in flavors) {
                                if (Image::class.java == flavor.representationClass) {
                                    return true
                                }
                            }
                        }
                        return false
                    }
                })
                val pt = SwingUtilities.convertPoint(e.component, e.point,
                        this@JImageComponent)
                editMenu.show(this@JImageComponent, pt.x, pt.y)
            }

        })

        this.addMouseMotionListener(object : MouseMotionAdapter() {
            override fun mouseDragged(e: MouseEvent?) {
                if (image == null) {
                    return
                }

                isDragging = true

                val currDragPoint = e!!.point
                val dx = (currDragPoint.x - lastDragPoint!!.x) / zoom
                val dy = (currDragPoint.y - lastDragPoint!!.y) / zoom
                leftX -= dx
                topY -= dy

                lastDragPoint = currDragPoint
                repaint()
            }

            override fun mouseMoved(e: MouseEvent?) {
                if (image == null) {
                    return
                }

                val xRel = e!!.x
                val yRel = e.y
                val xAbs = (xRel / zoom + leftX).toInt()
                val yAbs = (yRel / zoom + topY).toInt()

                // System.out.println(xRel + ":" + yRel + "->" + xAbs + ":"
                // + yAbs);

                if (xAbs >= 0 && xAbs < image!!.width && yAbs >= 0
                        && yAbs < image!!.height) {
                    val old = rolloverColor
                    rolloverColor = Color(image!!.getRGB(xAbs, yAbs))
                    firePropertyChange("rolloverColor", old, rolloverColor)
                }
            }
        })

        this.addMouseWheelListener { e ->
            zoom += e.scrollAmount * e.wheelRotation / 10.0
            zoom = Math.max(1.0, zoom)
            repaint()
        }

        if (hasKeyboardZoom) {
            // Wire zooming with I and O keys
            this.wireActionToKeyStroke("zoomin", KeyStroke.getKeyStroke("I"),
                    KeyboardActionScopeType.WHEN_IN_FOCUSED_WINDOW_TYPE) {
                zoom += 0.1
                repaint()
            }
            this.wireActionToKeyStroke("zoomout", KeyStroke.getKeyStroke("O"),
                    KeyboardActionScopeType.WHEN_IN_FOCUSED_WINDOW_TYPE) {
                zoom -= 0.1
                zoom = Math.max(1.0, zoom)
                repaint()
            }
        }

        this.zoom = 1.0
    }

    fun setLegend(legend: Array<String>) {
        this.legend = legend
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.color = Color.white
            it.fillRect(0, 0, width, height)

            if (this.image != null) {
                // zoom from the visible top-left pixel
                it.scale(zoom, zoom)
                it.translate(-this.leftX, -this.topY)
                it.drawImage(this.image, 0, 0, null)
            } else {
                RadianceCommonCortex.installDesktopHints(it, font)
                it.font = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().controlFont
                it.color = Color.black

                val fh = it.fontMetrics.height
                if (this.legend != null) {
                    for (i in this.legend!!.indices) {
                        it.drawString(this.legend!![i], 10, 20 + i * fh)
                    }
                }
            }
        }
    }

    private fun reset() {
        leftX = 0.0
        topY = 0.0
        zoom = 1.0
    }

    fun toOriginalImageCoords(x: Int, y: Int): Point {
        val xAbs = (x / zoom + leftX).toInt()
        val yAbs = (y / zoom + topY).toInt()
        return Point(xAbs, yAbs)
    }
}
