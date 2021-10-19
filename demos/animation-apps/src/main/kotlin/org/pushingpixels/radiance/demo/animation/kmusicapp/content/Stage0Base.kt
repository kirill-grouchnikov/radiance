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
package org.pushingpixels.radiance.demo.animation.kmusicapp.content

import org.pushingpixels.radiance.swing.ktx.addDelayedHierarchyListener
import org.pushingpixels.radiance.swing.ktx.awt.render
import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.animation.ktx.componentTimeline
import org.pushingpixels.radiance.animation.ktx.from
import java.awt.*
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.awt.geom.RoundRectangle2D
import javax.swing.JComponent
import javax.swing.SwingUtilities
import kotlin.math.pow

/**
 * The basis of the album scroller container. Provides the functionality of:
 *
 * <ul>
 * <li>Fading in once it becomes a part of the host window hierarchy</li>
 * <li>Dragging the host window with the mouse</li>
 * <li>Painting a rounded translucent background</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
open class Stage0Base : JComponent() {

    /**
     * The alpha value for this container. Is updated in the fade-in timeline
     * which starts when this container becomes a part of the host window
     * hierarchy.
     */
    var alpha = 0.0f

    /**
     * The search string.
     */
    internal var searchString: String? = null

    /**
     * Creates the basic container.
     */
    init {
        this.isOpaque = false

        // mouse listener for dragging the host window
        val adapter = object : MouseAdapter() {
            private var lastX: Int = 0
            private var lastY: Int = 0

            override fun mousePressed(e: MouseEvent) {
                val source = e.source as Component

                var eventLocationOnScreen: Point? = e.locationOnScreen
                if (eventLocationOnScreen == null) {
                    eventLocationOnScreen = Point(e.x + source.locationOnScreen.x, 
                            e.y + source.locationOnScreen.y)
                }

                lastX = eventLocationOnScreen.x
                lastY = eventLocationOnScreen.y
            }

            override fun mouseDragged(e: MouseEvent) {
                val source = e.source as Component

                var eventLocationOnScreen: Point? = e.locationOnScreen
                if (eventLocationOnScreen == null) {
                    eventLocationOnScreen = Point(e.x + source.locationOnScreen.x, 
                            e.y + source.locationOnScreen.y)
                }

                val dx = eventLocationOnScreen!!.x - lastX
                val dy = eventLocationOnScreen!!.y - lastY
                val win = SwingUtilities.getWindowAncestor(this@Stage0Base)
                val loc = win.location
                win.setLocation(loc.x + dx, loc.y + dy)
                lastX = eventLocationOnScreen!!.x
                lastY = eventLocationOnScreen!!.y
            }
        }
        this.addMouseListener(adapter)
        this.addMouseMotionListener(adapter)

        // fade in the container once it's part of the window hierarchy
        this.addDelayedHierarchyListener {
            this@Stage0Base.componentTimeline { 
                property(::alpha from 0.0f to 0.9f)
                repaintCallback()
                duration = 500
            }.play()
        }
    }

    fun setSearchString(searchString: String) {
        this.searchString = searchString
        this.repaint()
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            val clip = it.clip

            it.stroke = BasicStroke(1.0f)
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)

            val radius = 16

            val contour = RoundRectangle2D.Double(0.0, 0.0, (width - 1).toDouble(),
                    (height - 1).toDouble(), radius.toDouble(), radius.toDouble())
            val innerContour = RoundRectangle2D.Double(1.0, 1.0, (width - 3).toDouble(),
                    (height - 3).toDouble(), (radius - 1).toDouble(), (radius - 1).toDouble())

            it.composite = AlphaComposite.SrcOver.derive(1.0f - (1.0f - alpha).toDouble().pow(3.0).toFloat())

            // top part
            it.clipRect(0, 0, width, TITLE_HEIGHT)
            it.paint = LinearGradientPaint(0f, 0f, 0f, TITLE_HEIGHT.toFloat(),
                    floatArrayOf(0.0f, 0.49999f, 0.5f, 1.0f),
                    arrayOf(Color(119, 152, 251), Color(80, 127, 250), Color(48, 109, 250), Color(10, 97, 250)))
            it.fill(contour)
            it.paint = GradientPaint(0f, 0f, Color(151, 179, 253), 0f,
                    TITLE_HEIGHT.toFloat(), Color(19, 92, 233))
            it.draw(innerContour)
            it.color = Color(11, 61, 200)
            it.draw(contour)

            it.clip = clip

            if (this.searchString != null) {
                it.font = RadianceCommonCortex.getDefaultFontPolicy().fontSet.controlFont
                        .deriveFont(14.0f).deriveFont(Font.BOLD)
                RadianceCommonCortex.installDesktopHints(it, it.font)
                val fa = it.fontMetrics.ascent
                val x = (width - it.fontMetrics.stringWidth(this.searchString!!)) / 2
                val y = (TITLE_HEIGHT + fa) / 2
                it.color = Color(31, 60, 114)
                it.drawString(this.searchString, x, y + 1)
                it.color = Color(255, 255, 255)
                it.drawString(this.searchString, x, y)
            }

            // bottom part
            it.composite = AlphaComposite.SrcOver.derive(this.alpha)
            it.clipRect(0, TITLE_HEIGHT, width, height - TITLE_HEIGHT + 1)

            it.color = Color(0, 0, 0)
            it.fill(contour)
            it.paint = GradientPaint(0f, TITLE_HEIGHT.toFloat(), Color(57, 56, 57),
                    0f, (height - TITLE_HEIGHT).toFloat(), Color(50, 48, 50))
            it.draw(innerContour)
            it.paint = GradientPaint(0f, TITLE_HEIGHT.toFloat(), Color(13, 11, 15),
                    0f, (height - TITLE_HEIGHT).toFloat(), Color(15, 8, 13))
            it.draw(contour)

            // separator
            it.clip = clip
            it.color = Color(12, 11, 12)
            it.drawLine(1, TITLE_HEIGHT, width - 2, TITLE_HEIGHT)
        }
    }

    companion object {
        const val TITLE_HEIGHT = 24
    }
}
