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
package org.pushingpixels.radiance.demo.animation.ktx.swing

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.radiance.animation.ktx.from
import org.pushingpixels.radiance.animation.ktx.timeline
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior
import org.pushingpixels.radiance.animation.api.RadianceAnimationCortex
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline
import java.awt.*
import java.awt.geom.GeneralPath
import java.util.*
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

class Star(var x: Double, var y: Double, var outerSpan: Double) {
    var alpha = 1.0f
    var color = Color.white
    var rotation = 0.0f

    val currentShape: Shape
        get() {
            val innerSpan = this.outerSpan * (0.1f + 0.1f * outerSpan / 20)
            val POINTS = 5
            val result = GeneralPath()
            for (i in 0 until POINTS) {
                val outerAngle = this.rotation + i.toDouble() * 2.0 * Math.PI / POINTS
                val xOuter = this.x + this.outerSpan * Math.cos(outerAngle)
                val yOuter = this.y + this.outerSpan * Math.sin(outerAngle)
                if (i == 0) {
                    result.moveTo(xOuter, yOuter)
                } else {
                    result.lineTo(xOuter, yOuter)
                }
                val innerAngle = outerAngle + Math.PI / POINTS
                val xInner = this.x + innerSpan * Math.cos(innerAngle)
                val yInner = this.y + innerSpan * Math.sin(innerAngle)
                result.lineTo(xInner, yInner)
            }
            result.closePath()
            return result
        }
}

class MainPanel(private val stars: Deque<Star>) : JPanel() {
    override fun paintComponent(g: Graphics) {
        g.render {
            it.color = Color.black
            it.fillRect(0, 0, width, height)

            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)
            synchronized(stars) {
                for (star in stars) {
                    it.color = star.color
                    it.composite = AlphaComposite.SrcOver.derive(star.alpha)

                    val starShape = star.currentShape
                    it.fill(starShape)
                }
            }
        }
    }
}

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        val stars: Deque<Star> = LinkedList()

        val frame = JFrame("Star dust")

        val mainPanel = MainPanel(stars)
        frame.add(mainPanel)

        // higher pulse rate to create 50 stars a second
        RadianceAnimationCortex.setPulseSource(
            RadianceAnimationCortex.FixedRatePulseSource(20))

        // Timeline to spawn the stars
        var currHue = 0.0f
        timeline {
            onTimelinePulse { _, _ ->
                val mouseLoc = MouseInfo.getPointerInfo().location
                SwingUtilities.convertPointFromScreen(mouseLoc, mainPanel)
                val currX = mouseLoc.getX()
                val currY = mouseLoc.getY()
                if (currX < 0 || currY < 0 || (currX > mainPanel.width) || (currY > mainPanel.height)) {
                    return@onTimelinePulse
                }

                val outerStartSpan = 5.0
                val outerFinalSpan = 20.0
                val star = Star(currX, currY, outerStartSpan)
                synchronized(stars) {
                    stars.addFirst(star)
                }
                val angle = Math.random() * 2.0 * Math.PI
                val distance = 20.0 + 30.0 * Math.random()

                star.timeline {
                    property(star::x from currX to currX + distance * Math.cos(angle))
                    property(star::y from currY to currY + distance * Math.sin(angle))
                    property(star::alpha from 1.0f to 0.0f)
                    property(star::rotation from 0.0f to (2.0 * Math.PI * Math.random()).toFloat())
                    property(star::outerSpan from outerStartSpan to outerFinalSpan)
                    property(star::color from Color.white to Color(Color.HSBtoRGB(currHue, 0.8f, 0.7f)))
                    onTimelineDone {
                        // should be the last one in the list
                        synchronized(stars) {
                            stars.removeLast()
                        }
                    }
                    duration = 3000
                }.play()

                // Increment hue
                currHue += 0.01f
                if (currHue > 1.0f) {
                    currHue = 0.0f
                }
            }
        }.playLoop(RepeatBehavior.LOOP)

        SwingRepaintTimeline.repaintBuilder(mainPanel).playLoop(RepeatBehavior.LOOP)

        frame.setSize(400, 300)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE

        frame.isVisible = true
    }
}
