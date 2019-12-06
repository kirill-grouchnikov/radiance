/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.torch.swing

import org.pushingpixels.meteor.addDelayedComponentListener
import org.pushingpixels.meteor.addDelayedMouseListener
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.torch.componentTimeline
import org.pushingpixels.torch.from
import org.pushingpixels.torch.goingThrough
import org.pushingpixels.torch.repaintTimeline
import org.pushingpixels.trident.api.Timeline
import org.pushingpixels.trident.api.Timeline.RepeatBehavior
import org.pushingpixels.trident.api.interpolator.KeyFrames
import org.pushingpixels.trident.api.interpolator.KeyTimes
import org.pushingpixels.trident.api.interpolator.KeyValues
import java.awt.*
import java.awt.geom.RoundRectangle2D
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

class ProgressPanel : JPanel() {
    var xPosition = 0
    var alpha = 0.0f
    private var started = false

    private var progressTimeline: Timeline? = null

    init {
        this.addDelayedMouseListener(onMouseClicked = {
            if (!started) {
                start()
                started = true
            }
        })

        this.addDelayedComponentListener(onComponentResized = {
            if (started) {
                progressTimeline!!.cancel()
                start()
            }
        })

        this.repaintTimeline().playLoop(RepeatBehavior.LOOP)
    }

    fun start() {
        val startX = (width - INNER_WIDTH) / 2 + 18 + HIGHLIGHTER_WIDTH / 2
        val endX = (width + INNER_WIDTH) / 2 - 18 - HIGHLIGHTER_WIDTH / 2

        val alphaValues = KeyValues.create(0.0f, 1.0f, 1.0f, 0.0f)
        val alphaTimes = KeyTimes(0.0f, 0.3f, 0.7f, 1.0f)

        progressTimeline = this.componentTimeline {
            property(::xPosition from startX to endX)
            property(::alpha goingThrough KeyFrames(alphaValues, alphaTimes))
            duration = 1500
        }

        progressTimeline!!.playLoop(RepeatBehavior.LOOP)
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)

            val w = width
            val h = height

            // Full background
            it.color = Color(12, 12, 12)
            it.fillRect(0, 0, w, h)

            if (!started) {
                it.color = Color.white
                it.font = Font("Tahoma", Font.PLAIN, 18)
                val caption = "Click to start"
                it.drawString(caption, (w - it.fontMetrics.stringWidth(caption)) / 2, h / 3)
            }

            // Inner gradient fill
            val innerContour = RoundRectangle2D.Double((w - INNER_WIDTH) / 2.0,
                    (h - INNER_HEIGHT) / 2.0, INNER_WIDTH.toDouble(), INNER_HEIGHT.toDouble(), 10.0, 10.0)
            it.paint = GradientPaint((w - INNER_WIDTH) / 2.0f, (h - INNER_HEIGHT) / 2.0f,
                    Color(47, 47, 47), (w - INNER_WIDTH) / 2.0f, (h + INNER_HEIGHT) / 2.0f,
                    Color.black)
            it.fill(innerContour)

            // Inner contour
            it.color = Color(67, 67, 67)
            it.draw(innerContour)

            // Progress track
            val trackWidth = INNER_WIDTH - 36
            val trackHeight = 1
            it.color = Color(91, 91, 91)
            for (i in 2 downTo 0) {
                val trackContour = RoundRectangle2D.Double(((w - INNER_WIDTH) / 2 + 18 - i).toDouble(),
                        (h / 2 - i - 1).toDouble(), (trackWidth + i * 2).toDouble(), (trackHeight + i * 2).toDouble(),
                        (2 * i).toDouble(), (2 * i).toDouble())
                var alpha = 1.0f
                if (i == 1)
                    alpha = 0.3f
                if (i == 2)
                    alpha = 0.1f
                it.composite = AlphaComposite.SrcOver.derive(alpha)
                it.draw(trackContour)
            }

            // Highlighter
            it.color = Color(13, 106, 206)
            it.composite = AlphaComposite.SrcOver.derive(0.1f * this.alpha)
            for (i in 6 downTo 0) {
                it.fillOval(this.xPosition - HIGHLIGHTER_WIDTH / 2 - i,
                        h / 2 - HIGHLIGHTER_HEIGHT / 2 - i, HIGHLIGHTER_WIDTH + 2 * i,
                        HIGHLIGHTER_HEIGHT + 2 * i)
            }

            // Highlighter on track
            it.composite = AlphaComposite.SrcOver.derive(this.alpha)
            it.color = Color(136, 182, 231)
            it.fillRect(this.xPosition - 28, h / 2 - 1, 56, 2)
        }
    }

    companion object {
        private val INNER_HEIGHT = 60

        private val INNER_WIDTH = 300

        private val HIGHLIGHTER_HEIGHT = 2

        private val HIGHLIGHTER_WIDTH = 58
    }
}

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Swing progress")
        frame.add(ProgressPanel())

        frame.setSize(400, 300)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.isVisible = true
    }
}
