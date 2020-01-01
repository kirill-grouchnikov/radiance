/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.meteor.awt.render
import org.pushingpixels.torch.componentTimeline
import org.pushingpixels.torch.from
import org.pushingpixels.torch.repaintTimeline
import org.pushingpixels.torch.timeline
import org.pushingpixels.trident.api.Timeline.RepeatBehavior
import org.pushingpixels.trident.api.TimelineScenario
import org.pushingpixels.trident.api.ease.Spline
import java.awt.*
import java.awt.geom.Ellipse2D
import java.util.*
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

class CropCircle(private val xc: Float, private val yc: Float, val initialRadius: Float) {
    var radius = 0.0f
    var opacity = 0.0f

    fun paint(g: Graphics) {
        if (this.opacity == 0.0f) {
            return
        }

        g.render {
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)
            it.composite = AlphaComposite.SrcOver.derive(this.opacity)
            it.color = Color(241, 237, 190)
            it.fill(Ellipse2D.Float(this.xc - this.radius, this.yc - this.radius,
                    2 * this.radius, 2 * this.radius))
        }
    }
}

class CropArc(x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float) {
    val centerX: Float

    var centerY = 0.0f
        private set

    private val radius: Float

    private var cs: MutableList<CropCircle>? = null

    val circles: List<CropCircle>
        get() = Collections.unmodifiableList(this.cs!!)

    init {
        val ma = (y2 - y1) / (x2 - x1)
        val mb = (y3 - y2) / (x3 - x2)
        this.centerX = (ma * mb * (y1 - y3) + mb * (x1 + x2) - ma * (x2 + x3)) / (2 * (mb - ma))
        if (ma.toDouble() == 0.0) {
            this.centerY = (y2 + y3) / 2 - (this.centerX - (x2 + x3) / 2) / mb
        } else {
            this.centerY = (y1 + y2) / 2 - (this.centerX - (x1 + x2) / 2) / ma
        }
        this.radius = Math.sqrt(((x1 - this.centerX) * (x1 - this.centerX) +
                (y1 - this.centerY) * (y1 - this.centerY)).toDouble()).toFloat()
    }

    fun populate(startAngle: Float, startRadius: Float, factor: Float) {
        this.cs = ArrayList()
        var currRad = startRadius
        var currAngle = startAngle
        while (currRad > 2) {
            val b = Math.abs(Math.acos(1.0 - currRad * currRad / (2f * this.radius * this.radius)))

            currRad *= factor
            val g = Math.abs(Math.acos(1.0 - currRad * currRad / (2f * this.radius * this.radius)))
            currAngle -= (b + g).toFloat()
            this.cs!!.add(CropCircle(this.centerX + this.radius * Math.cos(currAngle.toDouble()).toFloat(),
                    this.centerY - this.radius * Math.sin(currAngle.toDouble()).toFloat(), currRad))
        }
    }

    fun paint(g: Graphics) {
        if (this.cs != null) {
            for (c in this.cs!!) {
                c.paint(g)
            }
        }
    }
}

class CropPanel : JPanel() {
    internal var arc1: CropArc
    internal var arc2: CropArc
    internal var arc3: CropArc
    internal var center: CropCircle
    internal var center1: CropCircle
    internal var center2: CropCircle
    internal var center3: CropCircle
    internal var rotation = 0.0f

    private val scenario: TimelineScenario
        get() {
            val showScenario = TimelineScenario.RendezvousSequence()
            val circles1 = this.arc1.circles
            val circles2 = this.arc2.circles
            val circles3 = this.arc3.circles
            val count = circles1.size

            for (i in count - 1 downTo 0) {
                val durationTotal = 200 + (count - i) * 70

                val c1 = circles1[i]
                val t1 = c1.timeline {
                    property(c1::opacity from 0.0f to 1.0f)
                    property(c1::radius from 0.0f to c1.initialRadius)
                    duration = durationTotal.toLong()
                    ease = Spline(0.9f)
                }

                val c2 = circles2[i]
                val t2 = c2.timeline {
                    property(c2::opacity from 0.0f to 1.0f)
                    property(c2::radius from 0.0f to c2.initialRadius)
                    duration = durationTotal.toLong()
                    ease = Spline(0.9f)
                }

                val c3 = circles3[i]
                val t3 = c3.timeline {
                    property(c3::opacity from 0.0f to 1.0f)
                    property(c3::radius from 0.0f to c3.initialRadius)
                    duration = durationTotal.toLong()
                    ease = Spline(0.9f)
                }

                showScenario.addScenarioActor(t1)
                showScenario.addScenarioActor(t2)
                showScenario.addScenarioActor(t3)

                showScenario.rendezvous()
            }

            val tCenter = this.center.timeline {
                property(center::opacity from 0.0f to 1.0f)
                property(center::radius from 0.0f to center.initialRadius)
                duration = 800
            }

            showScenario.addScenarioActor(tCenter)
            showScenario.rendezvous()

            val fadeOut = this.timeline {
                property(::opacity from 1.0f to 0.0f)
                initialDelay = 500
            }
            showScenario.addScenarioActor(fadeOut)
            return showScenario
        }

    init {
        val xc = 300
        val yc = 200
        val rad = 80

        val x1 = xc.toFloat()
        val y1 = yc - rad * Math.sin(-Math.PI / 2).toFloat()

        val x2 = xc + rad * Math.cos(5 * Math.PI / 6).toFloat()
        val y2 = yc - rad * Math.sin(5 * Math.PI / 6).toFloat()

        val x3 = xc + rad * Math.cos(Math.PI / 6).toFloat()
        val y3 = yc - rad * Math.sin(Math.PI / 6).toFloat()

        this.arc1 = CropArc(xc.toFloat(), yc.toFloat(), x2, y2, x3, y3)
        this.arc2 = CropArc(xc.toFloat(), yc.toFloat(), x2, y2, x1, y1)
        this.arc3 = CropArc(xc.toFloat(), yc.toFloat(), x3, y3, x1, y1)

        this.rotation = 0.0f

        val startRadius = 46
        val factor = 0.79f
        this.arc1.populate((-Math.PI / 2).toFloat(), startRadius.toFloat(), factor)
        this.arc2.populate((Math.PI / 6).toFloat(), startRadius.toFloat(), factor)
        this.arc3.populate((5 * Math.PI / 6).toFloat(), startRadius.toFloat(), factor)

        this.center = CropCircle(xc.toFloat(), yc.toFloat(), (startRadius - 2).toFloat())

        val smallRadius = 15
        this.center1 = CropCircle(this.arc1.centerX, this.arc1.centerY,
                smallRadius.toFloat())
        this.center1.radius = smallRadius.toFloat()
        this.center2 = CropCircle(this.arc2.centerX, this.arc2.centerY,
                smallRadius.toFloat())
        this.center2.radius = smallRadius.toFloat()
        this.center3 = CropCircle(this.arc3.centerX, this.arc3.centerY,
                smallRadius.toFloat())
        this.center3.radius = smallRadius.toFloat()

        // Pulsating centers
        timeline {
            property(center1::opacity from 0.0f to 1.0f)
            property(center2::opacity from 0.0f to 1.0f)
            property(center3::opacity from 0.0f to 1.0f)
            duration = 750
            ease = Spline(0.9f)
        }.playLoop(RepeatBehavior.REVERSE)

        // Looping rotation timeline
        this.componentTimeline {
            property(::rotation from 0.0f to (2 * Math.PI).toFloat())
            duration = 10000
        }.playLoop(RepeatBehavior.LOOP)

        // Looping repaint timeline
        this.repaintTimeline().playLoop(RepeatBehavior.LOOP)

        scenario.playLoop()
    }

    var opacity : Float = 0.0f
        set(value) {
            arc1.circles.forEach { it.opacity = value }
            arc2.circles.forEach { it.opacity = value }
            arc3.circles.forEach { it.opacity = value }
            center.opacity = value
        }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.color = Color(74, 86, 40)
            it.fillRect(0, 0, width, height)

            it.translate(300, 200)
            it.rotate(this.rotation.toDouble())
            it.translate(-300, -200)

            this.arc1.paint(it)
            this.arc2.paint(it)
            this.arc3.paint(it)
            this.center.paint(it)
            this.center1.paint(it)
            this.center2.paint(it)
            this.center3.paint(it)
        }
    }
}

fun main() {
    SwingUtilities.invokeLater {
        val fr = JFrame()
        fr.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        val panel = CropPanel()
        panel.preferredSize = Dimension(600, 400)
        fr.add(panel)
        fr.pack()
        fr.setLocationRelativeTo(null)
        fr.isVisible = true
    }
}
