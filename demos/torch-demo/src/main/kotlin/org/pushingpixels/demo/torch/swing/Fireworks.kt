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
package org.pushingpixels.demo.torch.swing

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.meteor.addDelayedMouseListener
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.torch.from
import org.pushingpixels.torch.repaintTimeline
import org.pushingpixels.torch.timeline
import org.pushingpixels.trident.api.Timeline.RepeatBehavior
import org.pushingpixels.trident.api.TimelineScenario
import org.pushingpixels.trident.api.ease.Spline
import java.awt.*
import java.awt.event.ComponentAdapter
import java.awt.event.ComponentEvent
import java.awt.geom.Ellipse2D
import java.util.*
import java.util.concurrent.CountDownLatch
import javax.swing.JFrame
import javax.swing.JPanel
import kotlin.collections.HashMap

class SingleExplosion(var color: Color, var x: Float, var y: Float, var radius: Float) {
    var opacity = 1.0f

    fun paint(g: Graphics) {
        g.render {
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)
            it.composite = AlphaComposite.SrcOver.derive(this.opacity)
            it.color = this.color
            it.fill(Ellipse2D.Float(this.x - this.radius, this.y - this.radius, 2 * radius,
                    2 * radius))
        }
    }
}

class VolleyExplosion(private val x: Int, private val y: Int, private val color: Color) {
    private val circles: MutableSet<SingleExplosion> = HashSet()

    val explosionScenario: TimelineScenario
        get() {
            val scenario = TimelineScenario.Parallel()

            val randomizer = Random()
            val durationTotal = 1000 + randomizer.nextInt(1000)
            for (i in 0..17) {
                val dist = (50 + 10 * Math.random()).toFloat()
                val radius = (2 + 2 * Math.random()).toFloat()
                var delta = 0.6f
                while (delta <= 1.0f) {
                    val circleRadius = radius * delta

                    val degrees = 20.0 * (i + Math.random())
                    val radians = (2.0 * Math.PI * degrees / 360.0).toFloat()

                    val initDist = delta * dist / 10.0f
                    val finalDist = delta * dist
                    val initX = (this.x + initDist * Math.cos(radians.toDouble())).toFloat()
                    val initY = (this.y + initDist * Math.sin(radians.toDouble())).toFloat()
                    val finalX = (this.x + finalDist * Math.cos(radians.toDouble())).toFloat()
                    val finalY = (this.y + finalDist * Math.sin(radians.toDouble())).toFloat()

                    val circle = SingleExplosion(this.color, initX, initY, circleRadius)
                    val timeline = circle.timeline {
                        property(circle::x from initX to finalX)
                        property(circle::y from initY to finalY)
                        property(circle::opacity from 1.0f to 0.0f)
                        duration = (durationTotal - 200 + randomizer.nextInt(400)).toLong()
                        ease = Spline(0.4f)
                    }

                    synchronized(this.circles) {
                        circles.add(circle)
                    }
                    scenario.addScenarioActor(timeline)
                    delta += 0.2f
                }
            }

            return scenario
        }

    fun paint(g: Graphics) {
        synchronized(this.circles) {
            for (circle in this.circles) {
                circle.paint(g)
            }
        }
    }
}

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        val frame = JFrame("Fireworks")
        val volleys: MutableSet<VolleyExplosion> = HashSet()

        val volleyScenarios: MutableMap<VolleyExplosion, TimelineScenario> = HashMap()

        val mainPanel = object : JPanel() {
            override fun paintComponent(g: Graphics) {
                super.paintComponent(g)
                synchronized(volleys) {
                    for (exp in volleys) {
                        exp.paint(g)
                    }
                }
            }
        }
        mainPanel.background = Color.black
        mainPanel.preferredSize = Dimension(480, 320)

        mainPanel.repaintTimeline().playLoop(RepeatBehavior.LOOP)

        mainPanel.addDelayedMouseListener(
                onMousePressed = {
                    synchronized(volleys) {
                        for (scenario in volleyScenarios.values)
                            scenario.suspend()
                    }
                },
                onMouseReleased = {
                    synchronized(volleys) {
                        for (scenario in volleyScenarios.values)
                            scenario.resume()
                    }
                })

        mainPanel.addComponentListener(object : ComponentAdapter() {
            private fun addExplosions(count: Int) {
                val latch = CountDownLatch(count)

                val randomizer = Random()
                for (i in 0 until count) {
                    val r = randomizer.nextInt(255)
                    val g = 100 + randomizer.nextInt(155)
                    val b = 50 + randomizer.nextInt(205)
                    val color = Color(r, g, b)

                    val x = 60 + randomizer.nextInt(mainPanel.width - 120)
                    val y = 60 + randomizer.nextInt(mainPanel.height - 120)
                    val exp = VolleyExplosion(x, y, color)
                    synchronized(volleys) {
                        volleys.add(exp)
                        val scenario = exp.explosionScenario
                        scenario.addCallback {
                            synchronized(volleys) {
                                volleys.remove(exp)
                                volleyScenarios.remove(exp)
                                latch.countDown()
                            }
                        }
                        volleyScenarios[exp] = scenario
                        scenario.play()
                    }
                }

                try {
                    latch.await()
                } catch (exc: Exception) {
                }

            }

            override fun componentResized(e: ComponentEvent?) {
                if ((mainPanel.width == 0) || (mainPanel.height == 0)) {
                    return
                }
                Thread {
                    while (true) {
                        addExplosions(5)
                    }
                }.start()
            }
        })

        frame.add(mainPanel)
        frame.pack()
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}


