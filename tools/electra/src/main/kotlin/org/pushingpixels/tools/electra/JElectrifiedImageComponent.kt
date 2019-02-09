/*
 * Copyright (c) 2005-2019 Radiance Electra Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Electra Kirill Grouchnikov nor the names of
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
package org.pushingpixels.tools.electra

import org.pushingpixels.meteor.addTypedDelayedPropertyChangeListener
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.meteor.swing.addAction
import org.pushingpixels.meteor.swing.wireActionToKeyStroke
import org.pushingpixels.neon.NeonCortex
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.tools.common.JImageComponent
import java.awt.*
import java.awt.event.KeyEvent
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.event.MouseMotionAdapter
import java.awt.geom.Arc2D
import java.awt.geom.Ellipse2D
import java.awt.geom.GeneralPath
import java.awt.geom.Point2D
import java.awt.image.BufferedImage
import java.awt.image.ConvolveOp
import java.awt.image.Kernel
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.io.PrintWriter
import java.util.*
import javax.imageio.ImageIO
import javax.swing.*

class JElectrifiedImageComponent(private val originalImageComponent: JImageComponent) : JComponent() {
    private var originalImage: BufferedImage? = null
    private var electrifiedImage: BufferedImage? = null
    private var electrifiedWidth: Int = 0
    private var electrifiedHeight: Int = 0
    private var scaleFactor: Float = 0.toFloat()
    private var imageOffsetX: Int = 0
    private var imageOffsetY: Int = 0
    private val zoomBubbles = ArrayList<ZoomBubble>()
    private val captionEditor: JTextField
    private var mouseDragHandler: MouseDragHandler? = null

    init {
        this.originalImageComponent.addTypedDelayedPropertyChangeListener<BufferedImage?>(
                JImageComponent::image.name) { event ->
            originalImage = event.newValue
            reset()
        }
        this.originalImageComponent.addTypedDelayedPropertyChangeListener<File>(
                JImageComponent::originalFile.name) { event ->
            if (event.newValue != null) {
                val file = event.newValue!!
                val layers = File(file.parent, file.name + ".layers")
                if (layers.exists()) {
                    loadBubbles(layers)
                }
            }
        }

        this.addMouseListener(object : MouseAdapter() {
            override fun mousePressed(e: MouseEvent?) {
                if (!e!!.isPopupTrigger) {
                    // stop editing if any
                    stopCaptionEdit(true)
                    for (zoomBubble in zoomBubbles) {
                        zoomBubble.isSelected = false
                    }

                    val pressed = getInfoForDrag(e.point)
                    if (pressed == null) {
                        repaint()
                        return
                    }

                    pressed.zoomBubble.isSelected = true

                    mouseDragHandler = when (pressed.dragType) {
                        JElectrifiedImageComponent.DragType.BUBBLE_DRAG ->
                            ZoomBubbleDragHandler(pressed.zoomBubble)
                        JElectrifiedImageComponent.DragType.BUBBLE_RESIZE ->
                            ZoomBubbleResizeHandler(pressed.zoomBubble)
                        JElectrifiedImageComponent.DragType.CAPTION_DRAG ->
                            ZoomBubbleCaptionDragHandler(pressed.zoomBubble)
                    }

                    mouseDragHandler!!.onStart(e.point)
                    repaint()
                } else {
                    val pressed = getInfoForDrag(e.point) ?: return
                    val popupMenu = JPopupMenu()
                    popupMenu.addAction("remove") {
                        zoomBubbles.remove(pressed.zoomBubble)
                        repaint()
                    }
                    popupMenu.addAction("invert caption colors") {
                        pressed.zoomBubble.isInverted = !pressed.zoomBubble.isInverted
                        repaint()
                    }
                    val pt = SwingUtilities.convertPoint(e.component, e.point,
                            this@JElectrifiedImageComponent)
                    popupMenu.show(this@JElectrifiedImageComponent, pt.x, pt.y)
                }
            }

            override fun mouseClicked(e: MouseEvent?) {
                if (e!!.clickCount != 2)
                    return

                for (zoomBubble in zoomBubbles) {
                    if (zoomBubble.isSelected && zoomBubble.caption == null) {
                        if (zoomBubble.centerX < originalImage!!.width / 2) {
                            zoomBubble.captionOffsetX = (zoomBubble.radius + 30) / NeonCortex.getScaleFactor()
                        } else {
                            zoomBubble.captionOffsetX = (-zoomBubble.radius - 30) / NeonCortex.getScaleFactor()
                        }
                        zoomBubble.captionOffsetY = 0.0
                        startCaptionEdit(zoomBubble)
                        return
                    }
                }
                for (zoomBubble in zoomBubbles) {
                    if (zoomBubble.captionRectangle != null) {
                        if (zoomBubble.captionRectangle!!.contains(e.point)) {
                            startCaptionEdit(zoomBubble)
                            break
                        }
                    }
                }
            }

            override fun mouseReleased(e: MouseEvent?) {
                if (mouseDragHandler != null) {
                    mouseDragHandler!!.onEnd(e!!.point)
                    mouseDragHandler = null
                }
            }
        })

        this.addMouseMotionListener(object : MouseMotionAdapter() {
            override fun mouseDragged(e: MouseEvent?) {
                if (mouseDragHandler != null) {
                    mouseDragHandler!!.onDrag(e!!.point)
                }
            }

            override fun mouseMoved(e: MouseEvent?) {
                val underMouse = getInfoForDrag(e!!.point)
                if (underMouse == null) {
                    cursor = Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR)
                    return
                }

                cursor = when (underMouse.dragType) {
                    JElectrifiedImageComponent.DragType.BUBBLE_DRAG,
                    JElectrifiedImageComponent.DragType.CAPTION_DRAG ->
                        Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
                    JElectrifiedImageComponent.DragType.BUBBLE_RESIZE ->
                        Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR)
                }
            }
        })

        this.captionEditor = JTextField(25)

        this.captionEditor.wireActionToKeyStroke("enter",
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0)) {
            stopCaptionEdit(true)
        }
        this.captionEditor.wireActionToKeyStroke("escape",
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0)) {
            stopCaptionEdit(false)
        }

        this.captionEditor.isVisible = false
        this.add(this.captionEditor)
        this.layout = null
    }

    internal fun getInfoForDrag(viewPoint: Point): BubbleDragPair? {
        for (zoomBubble in zoomBubbles) {
            val zoomViewCenter = originalToView(
                    Point2D.Double(zoomBubble.centerX, zoomBubble.centerY))
            val diffX = zoomViewCenter.x - viewPoint.x
            val diffY = zoomViewCenter.y - viewPoint.y
            val distFromCenter = Math.sqrt(diffX * diffX + diffY * diffY)
            if (distFromCenter < zoomBubble.radius / 2) {
                return BubbleDragPair(zoomBubble, DragType.BUBBLE_DRAG)
            }
            if (distFromCenter < zoomBubble.radius) {
                return BubbleDragPair(zoomBubble, DragType.BUBBLE_RESIZE)
            }
        }

        // caption?
        for (zoomBubble in zoomBubbles) {
            if (zoomBubble.captionRectangle != null) {
                if (zoomBubble.captionRectangle!!.contains(viewPoint)) {
                    return BubbleDragPair(zoomBubble, DragType.CAPTION_DRAG)
                }
            }
        }
        return null
    }

    private fun reset() {
        if (originalImage == null) {
            electrifiedImage = null
        } else {
            // scale down
            this.scaleFactor = WIDTH.toFloat() / originalImage!!.width.toFloat()
            if (this.scaleFactor < 1.0f) {
                electrifiedImage = NeonCortex.createThumbnail(originalImage, WIDTH)
            } else {
                this.scaleFactor = 1.0f
                electrifiedImage = originalImage
            }
            // and blur
            val kernelSide = (3 * NeonCortex.getScaleFactor()).toInt()
            val kernelData = FloatArray(kernelSide * kernelSide)
            for (i in kernelData.indices) {
                kernelData[i] = 1.0f / kernelData.size
            }
            val kernel = Kernel(kernelSide, kernelSide, kernelData)
            electrifiedImage = ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null)
                    .filter(electrifiedImage!!, null)
            electrifiedWidth = (electrifiedImage!!.width / NeonCortex.getScaleFactor()).toInt()
            electrifiedHeight = (electrifiedImage!!.height / NeonCortex.getScaleFactor()).toInt()
            preferredSize = Dimension(size.width, electrifiedHeight + 50)
            SwingUtilities.getAncestorOfClass(JScrollPane::class.java, this).revalidate()
        }
        zoomBubbles.clear()
        repaint()
    }

    override fun paintComponent(g: Graphics) {
        if (electrifiedImage != null) {
            g.render {
                val width = width
                val height = height
                this.imageOffsetX = (width - electrifiedWidth) / 2
                this.imageOffsetY = (height - electrifiedHeight) / 2
                paintElectrified(it, true, this.imageOffsetX, this.imageOffsetY)
            }
        }
    }

    private fun paintElectrified(g2d: Graphics2D, isOnScreen: Boolean, offsetX: Int, offsetY: Int) {
        if (electrifiedImage != null) {
            g2d.drawImage(this.electrifiedImage, offsetX, offsetY, this.electrifiedWidth,
                    this.electrifiedHeight, null)

            g2d.color = Color(0, 0, 0, 32)
            g2d.fillRect(offsetX, offsetY, this.electrifiedWidth,
                    this.electrifiedHeight)

            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)
            // bubbles
            for (zoomBubble in zoomBubbles) {
                val bubbleCenterViewX = offsetX + zoomBubble.centerX * this.scaleFactor
                val bubbleCenterViewY = offsetY + zoomBubble.centerY * this.scaleFactor
                val bubbleVisibleRadius = zoomBubble.radius / NeonCortex.getScaleFactor()

                val currClip = g2d.clip

                val centerViewX = bubbleCenterViewX.toInt()
                val centerViewY = bubbleCenterViewY.toInt()
                g2d.clip(Ellipse2D.Double(centerViewX - bubbleVisibleRadius,
                        centerViewY - bubbleVisibleRadius, 2 * bubbleVisibleRadius,
                        2 * bubbleVisibleRadius))

                var sx1 = (zoomBubble.centerX - zoomBubble.radius).toInt()
                var dx1 = (centerViewX - bubbleVisibleRadius).toInt()
                var sx2 = (zoomBubble.centerX + zoomBubble.radius).toInt()
                var dx2 = (centerViewX + bubbleVisibleRadius).toInt()

                if (sx1 < 0) {
                    dx1 -= (sx1 / NeonCortex.getScaleFactor()).toInt()
                    sx1 = 0
                }
                if (sx2 > originalImage!!.width) {
                    dx2 -= ((sx2 - originalImage!!.width) / NeonCortex.getScaleFactor()).toInt()
                    sx2 = originalImage!!.width
                }

                var sy1 = (zoomBubble.centerY - zoomBubble.radius).toInt()
                var dy1 = (centerViewY - bubbleVisibleRadius).toInt()
                var sy2 = (zoomBubble.centerY + zoomBubble.radius).toInt()
                var dy2 = (centerViewY + bubbleVisibleRadius).toInt()

                if (sy1 < 0) {
                    dy1 -= (sy1 / NeonCortex.getScaleFactor()).toInt()
                    sy1 = 0
                }
                if (sy2 > originalImage!!.height) {
                    dy2 -= ((sy2 - originalImage!!.height) / NeonCortex.getScaleFactor()).toInt()
                    sy2 = originalImage!!.height
                }

                g2d.drawImage(this.originalImage, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null)
                g2d.clip = currClip

                val totalRadius = (bubbleVisibleRadius + (RIM_THICKNESS / 2).toDouble()
                        + OUTER_SHADOW_THICKNESS.toDouble()).toFloat()
                val rimPaint = RadialGradientPaint(centerViewX.toFloat(), centerViewY.toFloat(),
                        totalRadius,
                        floatArrayOf(0.0f, ((bubbleVisibleRadius - (RIM_THICKNESS / 2).toDouble()
                                - INNER_SHADOW_THICKNESS.toDouble()) / totalRadius).toFloat(),
                                ((bubbleVisibleRadius - RIM_THICKNESS / 2) / totalRadius).toFloat(),
                                ((bubbleVisibleRadius + RIM_THICKNESS / 2) / totalRadius).toFloat(),
                                ((bubbleVisibleRadius + (RIM_THICKNESS / 2).toDouble()
                                        + (OUTER_SHADOW_THICKNESS / 3).toDouble()) / totalRadius).toFloat(), 1.0f),
                        arrayOf(Color(0, 0, 0, 0), Color(0, 0, 0, 0), Color(0, 0, 0, 128), Color(0, 0, 0, 128),
                                Color(0, 0, 0, 32), Color(0, 0, 0, 0)))
                g2d.paint = rimPaint
                g2d.fill(Ellipse2D.Double((centerViewX - totalRadius).toDouble(),
                        (centerViewY - totalRadius).toDouble(),
                        (2 * totalRadius).toDouble(), (2 * totalRadius).toDouble()))
                g2d.color = Color.white
                g2d.stroke = BasicStroke(RIM_THICKNESS)
                g2d.draw(Ellipse2D.Double(centerViewX - bubbleVisibleRadius,
                        centerViewY - bubbleVisibleRadius, 2 * bubbleVisibleRadius,
                        2 * bubbleVisibleRadius))

                if (zoomBubble.isSelected && isOnScreen) {
                    g2d.color = Color(0, 0, 0, 196)

                    val selectionCornerSide = 6

                    val selectionLeftX = (centerViewX.toDouble() - bubbleVisibleRadius
                            - (RIM_THICKNESS / 2).toDouble()).toInt()
                    val selectionRightX = (centerViewX.toDouble() + bubbleVisibleRadius
                            + (RIM_THICKNESS / 2).toDouble()).toInt()
                    val selectionTopY =
                            (centerViewY.toDouble() - bubbleVisibleRadius - (RIM_THICKNESS / 2).toDouble()).toInt()
                    val selectionBottomY = (centerViewY.toDouble() + bubbleVisibleRadius
                            + (RIM_THICKNESS / 2).toDouble()).toInt()

                    g2d.stroke = BasicStroke(1.2f)
                    g2d.drawRect(selectionLeftX - selectionCornerSide / 2,
                            selectionTopY - selectionCornerSide / 2, selectionCornerSide,
                            selectionCornerSide)
                    g2d.drawRect(selectionLeftX - selectionCornerSide / 2,
                            selectionBottomY - selectionCornerSide / 2, selectionCornerSide,
                            selectionCornerSide)
                    g2d.drawRect(selectionRightX - selectionCornerSide / 2,
                            selectionTopY - selectionCornerSide / 2, selectionCornerSide,
                            selectionCornerSide)
                    g2d.drawRect(selectionRightX - selectionCornerSide / 2,
                            selectionBottomY - selectionCornerSide / 2, selectionCornerSide,
                            selectionCornerSide)

                    g2d.stroke = BasicStroke(1.2f, BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_ROUND, 0.0f, floatArrayOf(2.0f, 1.0f), 0.0f)
                    g2d.drawLine(selectionLeftX + selectionCornerSide / 2, selectionTopY,
                            selectionRightX - selectionCornerSide / 2, selectionTopY)
                    g2d.drawLine(selectionLeftX + selectionCornerSide / 2, selectionBottomY,
                            selectionRightX - selectionCornerSide / 2, selectionBottomY)
                    g2d.drawLine(selectionLeftX, selectionTopY + selectionCornerSide / 2,
                            selectionLeftX, selectionBottomY - selectionCornerSide / 2)
                    g2d.drawLine(selectionRightX, selectionTopY + selectionCornerSide / 2,
                            selectionRightX, selectionBottomY - selectionCornerSide / 2)
                }

                // caption
                if (zoomBubble.caption != null && !zoomBubble.isInTextEdit) {
                    val font = SubstanceCortex.GlobalScope.getFontPolicy()
                            .fontSet.controlFont
                    g2d.font = font
                    val strWidth = g2d.fontMetrics.stringWidth(zoomBubble.caption!!)
                    val fontHeight = g2d.fontMetrics.height

                    val captionHeight = fontHeight + 8
                    val captionWidth = strWidth + 8

                    val radius = 3
                    val x = (centerViewX + zoomBubble.captionOffsetX).toInt()
                    val y = (centerViewY + zoomBubble.captionOffsetY).toInt()

                    val outerContour = if (zoomBubble.captionOffsetX < 0)
                        getCaptionOutlinePointingToRight(captionHeight, captionWidth, radius, 0)
                    else
                        getCaptionOutlinePointingToLeft(captionHeight, captionWidth, radius, 0)
                    val innerContour = if (zoomBubble.captionOffsetX < 0)
                        getCaptionOutlinePointingToRight(captionHeight, captionWidth, radius, 1)
                    else
                        getCaptionOutlinePointingToLeft(captionHeight, captionWidth, radius, 1)

                    val isInverted = zoomBubble.isInverted

                    g2d.translate(x, y)
                    g2d.paint = GradientPaint(0f, 0f,
                            if (isInverted) Color(224, 224, 224, 240) else Color(32, 32, 32, 240),
                            0f, captionHeight.toFloat(),
                            if (isInverted) Color(255, 255, 255, 240) else Color(0, 0, 0, 240))
                    g2d.fill(outerContour)

                    for (i in TEXT_OUTER_SHADOW_THICKNESS downTo 0) {
                        g2d.color = Color(0, 0, 0, 12)
                        g2d.stroke = BasicStroke(i.toFloat())
                        g2d.draw(outerContour)
                    }
                    g2d.color = if (isInverted) Color(255, 255, 255, 196) else Color(0, 0, 0, 196)
                    g2d.stroke = BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)
                    g2d.draw(outerContour)

                    g2d.paint = LinearGradientPaint(0f, 0f, 0f, captionHeight.toFloat(),
                            floatArrayOf(0.0f, 0.8f, 1.0f),
                            arrayOf(
                                    if (isInverted) Color(64, 64, 64, 64) else Color(192, 192, 192, 64),
                                    if (isInverted) Color(64, 64, 64, 48) else Color(192, 192, 192, 48),
                                    if (isInverted) Color(64, 64, 64, 16) else Color(192, 192, 192, 16)))
                    g2d.stroke = BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)
                    g2d.draw(innerContour)

                    g2d.translate(-x, -y)

                    NeonCortex.installDesktopHints(g2d, g2d.font)
                    val textY = y + 4 + g2d.fontMetrics.ascent
                    val textX = if (zoomBubble.captionOffsetX < 0)
                        x + captionHeight / 6 + 4
                    else
                        x + captionHeight / 3 + 4

                    g2d.color = if (isInverted) Color(255, 255, 255, 128) else Color(0, 0, 0, 196)
                    g2d.drawString(zoomBubble.caption, textX - 1, textY)
                    g2d.drawString(zoomBubble.caption, textX + 1, textY)
                    g2d.drawString(zoomBubble.caption, textX, textY - 1)
                    g2d.drawString(zoomBubble.caption, textX, textY + 1)
                    g2d.color = if (isInverted) Color(0, 0, 0) else Color(224, 224, 224)
                    g2d.drawString(zoomBubble.caption, textX, textY)

                    if (zoomBubble.captionOffsetX < 0) {
                        zoomBubble.captionRectangle = Rectangle(x + captionHeight / 6, y,
                                captionWidth, captionHeight)
                    } else {
                        zoomBubble.captionRectangle = Rectangle(x + captionHeight / 3, y,
                                captionWidth, captionHeight)
                    }
                }
            }
        }
    }

    private fun getCaptionOutlinePointingToRight(captionHeight: Int, captionWidth: Int, radius: Int,
            insets: Int): Shape {
        val contour = GeneralPath()
        contour.moveTo(radius.toFloat(), insets.toFloat())
        contour.lineTo(captionWidth.toFloat(), insets.toFloat())
        contour.lineTo((captionWidth + captionHeight / 2 - insets).toFloat(), (captionHeight / 2).toFloat())
        contour.lineTo(captionWidth.toFloat(), (captionHeight - insets).toFloat())
        // bottom left corner
        contour.append(Arc2D.Double(insets.toDouble(), (captionHeight - 2 * radius + insets).toDouble(),
                (2 * radius - 2 * insets).toDouble(), (2 * radius - 2 * insets).toDouble(),
                270.0, -90.0, Arc2D.OPEN), true)
        contour.lineTo(insets.toFloat(), radius.toFloat())
        // top left corner
        contour.append(Arc2D.Double(insets.toDouble(), insets.toDouble(),
                (2 * radius - 2 * insets).toDouble(),
                (2 * radius - 2 * insets).toDouble(), 180.0, -90.0, Arc2D.OPEN), true)
        contour.closePath()
        return contour
    }

    private fun getCaptionOutlinePointingToLeft(captionHeight: Int, captionWidth: Int, radius: Int,
            insets: Int): Shape {
        val contour = GeneralPath()
        contour.moveTo(insets.toFloat(), (captionHeight / 2).toFloat())
        contour.lineTo((captionHeight / 2).toFloat(), insets.toFloat())
        contour.lineTo((captionWidth + captionHeight / 2 - radius).toFloat(), insets.toFloat())
        // top right corner
        contour.append(
                Arc2D.Double((captionWidth + captionHeight / 2 - 2 * radius + insets).toDouble(),
                        insets.toDouble(), (2 * radius - 2 * insets).toDouble(),
                        (2 * radius - 2 * insets).toDouble(), 90.0, -90.0,
                        Arc2D.OPEN), true)
        contour.lineTo((captionWidth + captionHeight / 2 - insets).toFloat(),
                (captionHeight - radius - insets).toFloat())
        // bottom right corner
        contour.append(Arc2D.Double((captionWidth + captionHeight / 2 - 2 * radius + insets).toDouble(),
                (captionHeight - 2 * radius + insets).toDouble(), (2 * radius - 2 * insets).toDouble(),
                (2 * radius - 2 * insets).toDouble(), 0.0, -90.0, Arc2D.OPEN), true)
        contour.lineTo((captionHeight / 2).toFloat(), (captionHeight - insets).toFloat())
        contour.closePath()
        return contour
    }

    internal fun addZoomBubble(x: Int, y: Int, radius: Int) {
        val zoomBubble = ZoomBubble()
        zoomBubble.centerX = x.toDouble()
        zoomBubble.centerY = y.toDouble()
        zoomBubble.radius = radius.toDouble()
        zoomBubble.isInverted = false
        this.zoomBubbles.add(zoomBubble)
        repaint()
    }

    internal fun originalToView(original: Point2D): Point2D {
        val viewX = this.imageOffsetX + original.x * this.scaleFactor
        val viewY = this.imageOffsetY + original.y * this.scaleFactor
        return Point2D.Double(viewX, viewY)
    }

    internal fun viewToOriginal(view: Point2D): Point2D {
        val origX = (view.x - imageOffsetX) / scaleFactor
        val origY = (view.y - imageOffsetY) / scaleFactor
        return Point2D.Double(origX, origY)
    }

    internal fun startCaptionEdit(bubble: ZoomBubble) {
        bubble.isInTextEdit = true

        if (bubble.caption != null) {
            captionEditor.text = bubble.caption
            captionEditor.selectAll()
        } else {
            captionEditor.text = ""
        }
        val pref = captionEditor.preferredSize
        val bubbleCenterView = originalToView(
                Point2D.Double(bubble.centerX, bubble.centerY))
        captionEditor.setBounds((bubbleCenterView.x + bubble.captionOffsetX).toInt(),
                (bubbleCenterView.y + bubble.captionOffsetY).toInt(), pref.width, pref.height)
        captionEditor.isVisible = true
        captionEditor.requestFocus()
        repaint()
    }

    internal fun stopCaptionEdit(saveChanges: Boolean) {
        if (!this.captionEditor.isVisible)
            return

        // get the text
        var text: String? = captionEditor.text
        if (text!!.isEmpty()) {
            text = null
        }
        if (saveChanges) {
            for (zoomBubble in zoomBubbles) {
                if (zoomBubble.isInTextEdit) {
                    zoomBubble.caption = text
                    zoomBubble.isInTextEdit = false
                }
            }
        }

        captionEditor.isVisible = false
        repaint()
    }

    internal fun save(originalFile: File) {
        var extraTop = 0
        var extraBottom = 0
        var extraLeft = 0
        var extraRight = 0
        for (zoomBubble in zoomBubbles) {
            val bubbleCenterView = originalToView(
                    Point2D.Double(zoomBubble.centerX, zoomBubble.centerY))
            var l = (bubbleCenterView.x - zoomBubble.radius - imageOffsetX.toDouble()
                    - (RIM_THICKNESS / 2).toDouble() - OUTER_SHADOW_THICKNESS.toDouble())
            var r = (bubbleCenterView.x + zoomBubble.radius - imageOffsetX
                    + (RIM_THICKNESS / 2).toDouble() + OUTER_SHADOW_THICKNESS.toDouble())
            var t = (bubbleCenterView.y - zoomBubble.radius - imageOffsetY.toDouble()
                    - (RIM_THICKNESS / 2).toDouble() - OUTER_SHADOW_THICKNESS.toDouble())
            var b = (bubbleCenterView.y + zoomBubble.radius - imageOffsetY
                    + (RIM_THICKNESS / 2).toDouble() + OUTER_SHADOW_THICKNESS.toDouble())

            if (zoomBubble.captionRectangle != null) {
                l = Math.min(l, zoomBubble.captionRectangle!!.minX - imageOffsetX.toDouble()
                        - TEXT_OUTER_SHADOW_THICKNESS.toDouble())
                r = Math.max(r, zoomBubble.captionRectangle!!.maxX - imageOffsetX + TEXT_OUTER_SHADOW_THICKNESS)
                t = Math.min(t, zoomBubble.captionRectangle!!.minY - imageOffsetY.toDouble()
                        - TEXT_OUTER_SHADOW_THICKNESS.toDouble())
                b = Math.max(b, zoomBubble.captionRectangle!!.maxY - imageOffsetY + TEXT_OUTER_SHADOW_THICKNESS)
            }

            if (l < 0) {
                extraLeft = Math.max(extraLeft, Math.ceil(-l).toInt())
            }
            if (r > WIDTH) {
                extraRight = Math.max(extraRight, Math.ceil(r - WIDTH).toInt())
            }
            if (t < 0) {
                extraTop = Math.max(extraTop, Math.ceil(-t).toInt())
            }
            if (b > electrifiedHeight) {
                extraBottom = Math.max(extraBottom,
                        Math.ceil(b - electrifiedHeight).toInt())
            }
        }

        val finalWidth = WIDTH + extraLeft + extraRight
        val finalHeight = electrifiedHeight + extraTop + extraBottom

        val compatibleImage = NeonCortex.getBlankImage(finalWidth, finalHeight)

        compatibleImage.render {
            it.translate(extraLeft, extraTop)
            this.paintElectrified(it, false, 0, 0)
        }

        try {
            val origFileName = originalFile.name
            val targetFileName = origFileName.substring(0, origFileName.lastIndexOf('.')) + ".electra.png"
            ImageIO.write(compatibleImage, "png",
                    File(originalFile.parentFile, targetFileName))
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }

        saveBubbles(File(originalFile.parentFile, originalFile.name + ".layers"))
    }

    private fun saveBubbles(file: File) {
        try {
            val pw = PrintWriter(file)
            pw.println("count=" + this.zoomBubbles.size)
            for (i in this.zoomBubbles.indices) {
                val zoomBubble = this.zoomBubbles[i]
                pw.println("bubble" + i + ".centerX=" + zoomBubble.centerX)
                pw.println("bubble" + i + ".centerY=" + zoomBubble.centerY)
                pw.println("bubble" + i + ".radius=" + zoomBubble.radius)
                if (zoomBubble.caption != null) {
                    pw.println("bubble" + i + ".caption=" + zoomBubble.caption)
                    pw.println("bubble" + i + ".captionOffsetX=" + zoomBubble.captionOffsetX)
                    pw.println("bubble" + i + ".captionOffsetY=" + zoomBubble.captionOffsetY)
                }
                pw.println("bubble" + i + ".isInverted=" + zoomBubble.isInverted)
            }
            pw.flush()
            pw.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun loadBubbles(file: File) {
        try {
            val props = Properties()
            props.load(FileReader(file))

            zoomBubbles.clear()
            val count = Integer.parseInt(props.getProperty("count"))
            for (i in 0 until count) {
                val zoomBubble = ZoomBubble()
                zoomBubble.centerX = java.lang.Double
                        .parseDouble(props.getProperty("bubble$i.centerX"))
                zoomBubble.centerY = java.lang.Double
                        .parseDouble(props.getProperty("bubble$i.centerY"))
                zoomBubble.radius = java.lang.Double.parseDouble(props.getProperty("bubble$i.radius"))
                zoomBubble.caption = props.getProperty("bubble$i.caption")
                if (zoomBubble.caption != null) {
                    zoomBubble.captionOffsetX = java.lang.Double
                            .parseDouble(props.getProperty("bubble$i.captionOffsetX"))
                    zoomBubble.captionOffsetY = java.lang.Double
                            .parseDouble(props.getProperty("bubble$i.captionOffsetY"))
                }
                val invertedKey = "bubble$i.isInverted"
                if (props.containsKey(invertedKey)) {
                    zoomBubble.isInverted = java.lang.Boolean.parseBoolean(props.getProperty(invertedKey))
                } else {
                    zoomBubble.isInverted = false
                }
                zoomBubbles.add(zoomBubble)
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    internal enum class DragType {
        BUBBLE_DRAG, BUBBLE_RESIZE, CAPTION_DRAG
    }

    private interface MouseDragHandler {
        fun onStart(point: Point)

        fun onDrag(point: Point)

        fun onEnd(point: Point)
    }

    internal class ZoomBubble {
        internal var centerX: Double = 0.toDouble()

        internal var centerY: Double = 0.toDouble()

        internal var radius: Double = 0.toDouble()

        internal var isSelected: Boolean = false

        internal var isInTextEdit: Boolean = false

        internal var caption: String? = null

        internal var captionOffsetX: Double = 0.toDouble()

        internal var captionOffsetY: Double = 0.toDouble()

        internal var captionRectangle: Rectangle? = null

        internal var isInverted: Boolean = false
    }

    private inner class ZoomBubbleDragHandler(private val zoomBubble: ZoomBubble) : MouseDragHandler {

        private var lastDragPoint: Point? = null

        override fun onStart(point: Point) {
            this.lastDragPoint = point
        }

        override fun onDrag(point: Point) {
            val dx = ((point.x - lastDragPoint!!.x) / scaleFactor).toDouble()
            val dy = ((point.y - lastDragPoint!!.y) / scaleFactor).toDouble()

            zoomBubble.centerX += dx
            zoomBubble.centerY += dy

            lastDragPoint = point
            repaint()
        }

        override fun onEnd(point: Point) {}
    }

    private inner class ZoomBubbleResizeHandler(private val zoomBubble: ZoomBubble) : MouseDragHandler {

        private var lastDragPoint: Point? = null

        override fun onStart(point: Point) {
            this.lastDragPoint = point
        }

        override fun onDrag(point: Point) {
            val bubbleCenterView = originalToView(
                    Point2D.Double(zoomBubble.centerX, zoomBubble.centerY))
            val ndx = point.x - bubbleCenterView.x
            val ndy = point.y - bubbleCenterView.y
            val newRadius = Math.sqrt(ndx * ndx + ndy * ndy)

            val odx = lastDragPoint!!.x - bubbleCenterView.x
            val ody = lastDragPoint!!.y - bubbleCenterView.y
            val oldRadius = Math.sqrt(odx * odx + ody * ody)

            zoomBubble.radius += newRadius - oldRadius

            lastDragPoint = point
            repaint()
        }

        override fun onEnd(point: Point) {}
    }

    private inner class ZoomBubbleCaptionDragHandler(private val zoomBubble: ZoomBubble) : MouseDragHandler {

        private var lastDragPoint: Point? = null

        override fun onStart(point: Point) {
            this.lastDragPoint = point
        }

        override fun onDrag(point: Point) {
            val dx = point.x - lastDragPoint!!.x
            val dy = point.y - lastDragPoint!!.y

            zoomBubble.captionOffsetX += dx.toDouble()
            zoomBubble.captionOffsetY += dy.toDouble()

            lastDragPoint = point
            repaint()
        }

        override fun onEnd(point: Point) {}
    }

    internal data class BubbleDragPair(val zoomBubble: ZoomBubble, val dragType: DragType)

    companion object {
        private const val WIDTH = 720
        private const val RIM_THICKNESS = 3.0f
        private const val OUTER_SHADOW_THICKNESS = 8.0f
        private const val INNER_SHADOW_THICKNESS = 3.0f
        private const val TEXT_OUTER_SHADOW_THICKNESS = 6

        /**
         * Convenience method that returns a scaled instance of the provided `BufferedImage`. Adopted from
         * [article by Chris Campbell](http://today.java.net/pub/a/today/2007/04/03/perils-of-image-getscaledinstance.html).
         *
         * @param img           the original image to be scaled
         * @param targetWidth   the desired width of the scaled instance, in pixels
         * @param targetHeight  the desired height of the scaled instance, in pixels
         * @param hint          one of the rendering hints that corresponds to `RenderingHints.KEY_INTERPOLATION` (e.g. `RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR`, `RenderingHints.VALUE_INTERPOLATION_BILINEAR`, `RenderingHints.VALUE_INTERPOLATION_BICUBIC`)
         * @param higherQuality if true, this method will use a multi-step scaling technique that
         * provides higher
         * quality than the usual one-step technique (only useful in downscaling
         * cases, where
         * `targetWidth` or `targetHeight` is smaller than the original
         * dimensions, and generally only when the `BILINEAR` hint is
         * specified)
         * @return a scaled version of the original `BufferedImage`
         */
        internal fun getScaledInstance(img: BufferedImage, targetWidth: Int, targetHeight: Int): BufferedImage {
            val type = if (img.transparency == Transparency.OPAQUE)
                BufferedImage.TYPE_INT_RGB
            else
                BufferedImage.TYPE_INT_ARGB
            var ret = img
            var w: Int
            var h: Int
            // Use multi-step technique: start with original size, then
            // scale down in multiple passes with drawImage()
            // until the target size is reached
            w = img.width
            h = img.height

            do {
                if (w > targetWidth) {
                    w /= 2
                    if (w < targetWidth) {
                        w = targetWidth
                    }
                }

                if (h > targetHeight) {
                    h /= 2
                    if (h < targetHeight) {
                        h = targetHeight
                    }
                }

                val tmp = BufferedImage(w, h, type)
                val g2 = tmp.createGraphics()
                g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BICUBIC)
                g2.drawImage(ret, 0, 0, w, h, null)
                g2.dispose()

                ret = tmp
            } while (w != targetWidth || h != targetHeight)

            return ret
        }
    }
}
