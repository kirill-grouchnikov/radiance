/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.radiance.swing.ktx.addDelayedMouseListener
import org.pushingpixels.radiance.swing.ktx.awt.render
import org.pushingpixels.radiance.animation.ktx.from
import org.pushingpixels.radiance.animation.ktx.repaintTimeline
import org.pushingpixels.radiance.animation.ktx.timeline
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior
import java.awt.*
import java.awt.geom.Ellipse2D
import java.awt.geom.Rectangle2D
import java.util.*
import javax.swing.JComponent
import javax.swing.JFrame

class ShapesPanel : JComponent() {
    private val shapes: MutableList<MyShape>
    private var toAddRectangle: Boolean = false

    var topColor: Color = ColorBlue

    var bottomColor: Color = ColorGreen

    init {
        this.shapes = ArrayList()
        this.topColor = ColorBlue
        this.bottomColor = ColorGreen

        this.addDelayedMouseListener(onMousePressed = { e -> addShape(e!!.point) })

        // animate the gradient endpoint colors in an infinite repaintTimeline
        this.repaintTimeline {
            property(::topColor from ColorBlue to ColorGreen)
            property(::bottomColor from ColorGreen to ColorBlue)
            duration = 1000
        }.playLoop(RepeatBehavior.REVERSE)
    }

    fun addShape(shape: MyShape) {
        synchronized(this.shapes) {
            this.shapes.add(shape)
        }
    }

    fun removeShape(shape: MyShape) {
        synchronized(this.shapes) {
            this.shapes.remove(shape)
        }
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.paint = GradientPaint(0f, 0f, this.topColor, 0f, height.toFloat(), this.bottomColor)
            it.fillRect(0, 0, width, height)

            synchronized(this.shapes) {
                for (shape in this.shapes) {
                    shape.paint(it)
                }
            }
        }
    }

    private fun addShape(point: Point) {
        val x = point.x
        val y = point.y

        if (toAddRectangle) {
            val shape = MyRectangle(x.toFloat(), y.toFloat(), 0f, 0f)
            addShape(shape)
            shape.timeline {
                property(shape::x from x to x - 100)
                property(shape::y from y to y - 100)
                property(shape::width from 0 to 200)
                property(shape::height from 0 to 200)
                property(shape::rotation from 0 to 180)
                property(shape::opacity from 1.0f to 0.0f)
                onTimelineDone { removeShape(shape) }
                duration = 1000
            }.play()
        } else {
            val shape = MyCircle(x.toFloat(), y.toFloat(), 0f)
            addShape(shape)
            shape.timeline {
                property(shape::radius from 0 to 100)
                property(shape::opacity from 1.0f to 0.0f)
                onTimelineDone { removeShape(shape) }
                duration = 1000
            }.play()
        }
        toAddRectangle = !toAddRectangle
    }
}

interface MyShape {
    fun paint(g: Graphics)
}

class MyRectangle(internal var x: Float, internal var y: Float, internal var width: Float,
                  internal var height: Float) : MyShape {
    internal var opacity = 1.0f
    internal var rotation = 0.0f

    override fun paint(g: Graphics) {
        g.render {
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)
            it.composite = AlphaComposite.SrcOver.derive(this.opacity)
            it.color = ColorGreen
            val xc = this.x + this.width / 2
            val yc = this.y + this.height / 2
            it.translate(xc.toInt(), yc.toInt())
            it.rotate(this.rotation * Math.PI / 180.0)
            it.fill(Rectangle2D.Float(-this.width / 2, -this.height / 2, this.width,
                    this.height))
        }
    }
}

class MyCircle(internal var x: Float, internal var y: Float, internal var radius: Float) : MyShape {
    internal var opacity = 1.0f

    override fun paint(g: Graphics) {
        g.render {
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)
            it.composite = AlphaComposite.SrcOver.derive(this.opacity)
            it.color = ColorGreen
            it.fill(Ellipse2D.Float(this.x - this.radius, this.y - this.radius, 2 * radius, 2 * radius))
        }
    }
}

private val ColorBlue = Color(128, 128, 255)
private val ColorGreen = Color(128, 255, 128)

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        val frame = JFrame()
        val sPanel = ShapesPanel()
        frame.add(sPanel, BorderLayout.CENTER)

        frame.setSize(600, 500)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        frame.isVisible = true
    }
}
