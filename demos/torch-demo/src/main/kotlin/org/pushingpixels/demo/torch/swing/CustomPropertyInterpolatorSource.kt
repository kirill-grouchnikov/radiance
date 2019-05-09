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

import org.pushingpixels.meteor.awt.render
import org.pushingpixels.torch.from
import org.pushingpixels.torch.repaintTimeline
import org.pushingpixels.torch.timeline
import org.pushingpixels.trident.Timeline.RepeatBehavior
import org.pushingpixels.trident.TridentConfig
import org.pushingpixels.trident.ease.Sine
import org.pushingpixels.trident.interpolator.PropertyInterpolator
import java.awt.Color
import java.awt.Graphics
import java.awt.RenderingHints
import java.awt.geom.Ellipse2D
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

private class Ellipse2DPropertyInterpolator : PropertyInterpolator<Ellipse2D> {
    override fun getBasePropertyClass(): Class<*> {
        return Ellipse2D::class.java
    }

    override fun interpolate(from: Ellipse2D, to: Ellipse2D, timelinePosition: Float): Ellipse2D {
        val x = from.x + timelinePosition * (to.x - from.x)
        val y = from.y + timelinePosition * (to.y - from.y)
        val w = from.width + timelinePosition * (to.width - from.width)
        val h = from.height + timelinePosition * (to.height - from.height)
        return Ellipse2D.Double(x, y, w, h)
    }
}

fun main() {
    SwingUtilities.invokeLater {
        TridentConfig.getInstance().addPropertyInterpolator(Ellipse2DPropertyInterpolator())

        val from = Ellipse2D.Double(10.0, 10.0, 100.0, 50.0)
        val to = Ellipse2D.Double(40.0, 40.0, 200.0, 120.0)

        val ellipsePanel = object : JPanel() {
            var ellipse = from.clone() as Ellipse2D
            override fun paintComponent(g: Graphics) {
                super.paintComponent(g)
                g.render {
                    it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON)
                    it.color = Color.red
                    it.fill(ellipse)
                }
            }
        }
        ellipsePanel.background = Color.black

        timeline {
            property(ellipsePanel::ellipse from from to to)
            duration = 2000
            ease = Sine()
        }.playLoop(RepeatBehavior.REVERSE)

        ellipsePanel.repaintTimeline().playLoop(RepeatBehavior.LOOP)

        val frame = JFrame()
        frame.add(ellipsePanel)

        frame.setSize(400, 300)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.isVisible = true
    }
}
