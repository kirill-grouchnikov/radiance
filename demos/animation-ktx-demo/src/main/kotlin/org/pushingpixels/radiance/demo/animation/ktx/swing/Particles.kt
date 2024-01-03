/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.swing.ktx.awt.render
import org.pushingpixels.radiance.animation.ktx.from
import org.pushingpixels.radiance.animation.ktx.repaintTimeline
import org.pushingpixels.radiance.animation.ktx.timeline
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior
import org.pushingpixels.radiance.animation.api.ease.Spline
import java.awt.*
import java.awt.geom.Ellipse2D
import java.awt.geom.GeneralPath
import java.awt.image.*
import java.util.*
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

/**
 * This class is based on Romain Guy's work from
 * http://www.jroller.com/gfx/entry/new_blendings_modes_for_java2d available
 * under BSD license.
 */
private class AddContext(private val add: Add) : CompositeContext {

    override fun dispose() {}

    override fun compose(src: Raster, dstIn: Raster, dstOut: WritableRaster) {
        if (src.sampleModel.dataType != DataBuffer.TYPE_INT
                || dstIn.sampleModel.dataType != DataBuffer.TYPE_INT
                || dstOut.sampleModel.dataType != DataBuffer.TYPE_INT) {
            throw IllegalStateException("Source and destination must store pixels as INT.")
        }

        val width = Math.min(src.width, dstIn.width)
        val height = Math.min(src.height, dstIn.height)

        val alpha = this.add.alpha

        val srcPixel = IntArray(4)
        val dstPixel = IntArray(4)
        val srcPixels = IntArray(width)
        val dstPixels = IntArray(width)

        for (y in 0 until height) {
            src.getDataElements(0, y, width, 1, srcPixels)
            dstIn.getDataElements(0, y, width, 1, dstPixels)
            for (x in 0 until width) {
                var pixel = srcPixels[x]
                srcPixel[0] = pixel.ushr(24) and 0xFF
                srcPixel[1] = pixel.ushr(16) and 0xFF
                srcPixel[2] = pixel.ushr(8) and 0xFF
                srcPixel[3] = pixel and 0xFF

                pixel = dstPixels[x]
                dstPixel[0] = pixel.ushr(24) and 0xFF
                dstPixel[1] = pixel.ushr(16) and 0xFF
                dstPixel[2] = pixel.ushr(8) and 0xFF
                dstPixel[3] = pixel and 0xFF

                val result = intArrayOf(Math.min(255, srcPixel[0] + dstPixel[0]),
                        Math.min(255, srcPixel[1] * srcPixel[0] / 255 + dstPixel[1] * dstPixel[0] / 255),
                        Math.min(255, srcPixel[2] * srcPixel[0] / 255 + dstPixel[2] * dstPixel[0] / 255),
                        Math.min(255, srcPixel[3] * srcPixel[0] / 255 + dstPixel[3] * dstPixel[0] / 255))

                dstPixels[x] = ((dstPixel[0] + (result[0] - dstPixel[0]) * alpha).toInt() and 0xFF shl 24
                        or ((dstPixel[1] + (result[1] - dstPixel[1]) * alpha).toInt() and 0xFF shl 16)
                        or ((dstPixel[2] + (result[2] - dstPixel[2]) * alpha).toInt() and 0xFF shl 8)
                        or ((dstPixel[3] + (result[3] - dstPixel[3]) * alpha).toInt() and 0xFF))
            }
            dstOut.setDataElements(0, y, width, 1, dstPixels)
        }
    }
}

class Add(val alpha: Float) : Composite {
    override fun createContext(srcColorModel: ColorModel, dstColorModel: ColorModel,
                               hints: RenderingHints): CompositeContext {
        return AddContext(this)
    }
}

class Particle(internal var x: Float, internal var y: Float, internal var size: Int,
               internal var color: Color, internal var angle: Float) {

    internal var opacity = 1.0f

    fun paint(g: Graphics) {
        g.render {
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)
            it.composite = Add(this.opacity)

            it.translate(this.x.toDouble(), this.y.toDouble())
            it.paint = RadialGradientPaint(0f, 0f, this.size / 2.0f,
                    floatArrayOf(0.0f, 0.6f, 1.0f),
                    arrayOf(this.color, this.color, Color(this.color.red,
                            this.color.green, this.color.blue, 96)))

            it.fill(Ellipse2D.Float(-this.size / 2.0f, -this.size / 2.0f, this.size.toFloat(),
                    this.size.toFloat()))

            val d1 = (Math.cos(this.angle.toDouble()) * this.size / 3).toFloat()
            val d2 = (Math.sin(this.angle.toDouble()) * this.size / 3).toFloat()
            val rh = GeneralPath()
            rh.moveTo(d1, d2)
            rh.lineTo(d2, -d1)
            rh.lineTo(-d1, -d2)
            rh.lineTo(-d2, d1)
            rh.closePath()

            it.paint = RadialGradientPaint(0f, 0f, this.size / 3.0f, floatArrayOf(0.0f, 1.0f),
                    arrayOf(Color(255, 255, 255, 96), Color(255, 255, 255, 32)))
            it.fill(rh)

            val c1 = Color(255, 255, 255, 16)
            val c2 = Color(255, 255, 255, 32)
            it.paint = LinearGradientPaint(d1, d2, -d1, -d2, floatArrayOf(0.0f, 0.5f, 1.0f),
                    arrayOf(c1, c2, c1))
            it.drawLine(d1.toInt(), d2.toInt(), -d1.toInt(), -d2.toInt())
            it.paint = LinearGradientPaint(-d2, d1, d2, -d1, floatArrayOf(0.0f, 0.5f, 1.0f),
                    arrayOf(c1, c2, c1))
            it.drawLine(-d2.toInt(), d1.toInt(), d2.toInt(), -d1.toInt())
        }
    }
}

class ParticlesPanel : JPanel() {
    private val particles: MutableList<Particle>

    internal var wasMouseInside: Boolean = false

    internal var lastX: Int = 0
    internal var lastY: Int = 0

    internal var offscreen: BufferedImage? = null

    init {
        this.particles = ArrayList()

        // Infinitely looping timeline to track the mouse
        timeline {
            onTimelinePulse { _, _ ->
                val mouseLoc = MouseInfo.getPointerInfo().location
                SwingUtilities.convertPointFromScreen(mouseLoc, this@ParticlesPanel)
                val isInside = (mouseLoc.x >= 0 && mouseLoc.y >= 0
                        && mouseLoc.x < width && mouseLoc.y < height)
                if (isInside) {
                    val x = mouseLoc.x
                    val y = mouseLoc.y
                    if (wasMouseInside) {
                        val dist = Math.sqrt(((lastX - x) * (lastX - x) +
                                (lastY - y) * (lastY - y)).toDouble()).toInt()
                        makeParticles(lastX, lastY, x, y, 1 + dist / 16)
                    }
                    lastX = x
                    lastY = y
                    wasMouseInside = true
                } else {
                    wasMouseInside = false
                }
            }
        }.playLoop(RepeatBehavior.LOOP)

        this.repaintTimeline().playLoop(RepeatBehavior.LOOP)
    }

    @Synchronized
    private fun makeParticles(x1: Int, y1: Int, x2: Int, y2: Int, numParticles: Int) {

        val randomizer = Random()
        val cs = arrayOf(Color.red, Color.blue, Color.green, Color.magenta, Color.cyan, Color.yellow)
        for (i in 0 until numParticles) {
            val size = 4 + randomizer.nextInt(44)
            val animationDuration = (200 - size) * 3L
            val moveDistance = 4 + randomizer.nextInt(76 - size)
            val moveDirection = 2.0 * Math.PI * Math.random()

            val startX = x1 + i * (x2 - x1) / numParticles
            val startY = y1 + i * (y2 - y1) / numParticles
            val goalX = startX + (moveDistance * Math.cos(moveDirection)).toInt()
            val goalY = startY + (moveDistance * Math.sin(moveDirection)).toInt()
            val startAngle = (2.0 * Math.PI * Math.random()).toFloat()
            val endAngle = (startAngle + 4.0 * Math.PI * Math.random() - 2 * Math.PI).toFloat()

            val particle = Particle(startX.toFloat(), startY.toFloat(), size,
                    cs[randomizer.nextInt(cs.size)], startAngle)
            this.particles.add(particle)

            particle.timeline {
                property(particle::x from startX to goalX)
                property(particle::y from startY to goalY)
                property(particle::opacity from 1.0f to 0.0f)
                property(particle::angle from startAngle to endAngle)
                onTimelineDone {
                    synchronized(this@ParticlesPanel) {
                        particles.remove(particle)
                    }
                }
                duration = animationDuration
                ease = Spline(1.0f)
            }.play()
        }
    }

    override fun paintComponent(g: Graphics) {
        g.color = Color.black
        val w = width
        val h = height
        g.fillRect(0, 0, w, h)

        if (offscreen == null || offscreen!!.width != w
                || offscreen!!.height != h) {
            offscreen = GraphicsEnvironment.getLocalGraphicsEnvironment()
                    .defaultScreenDevice.defaultConfiguration
                    .createCompatibleImage(w, h, BufferedImage.TRANSLUCENT)
        }

        offscreen!!.render {
            it.color = Color(0, 0, 0, 0)
            it.composite = AlphaComposite.Src
            it.fillRect(0, 0, w, h)
            synchronized(this) {
                for (p in this.particles) {
                    p.paint(it)
                }
            }
        }

        g.drawImage(offscreen, 0, 0, null)
    }
}

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        val frame = JFrame("Particles")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        val panel = ParticlesPanel()
        panel.preferredSize = Dimension(400, 300)
        frame.add(panel)
        frame.pack()
        frame.setLocationRelativeTo(null)

        frame.isVisible = true
    }
}
