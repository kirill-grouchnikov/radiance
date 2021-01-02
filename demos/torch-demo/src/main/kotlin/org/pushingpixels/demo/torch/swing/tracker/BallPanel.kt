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
package org.pushingpixels.demo.torch.swing.tracker

import org.pushingpixels.meteor.awt.deriveByBrightness
import org.pushingpixels.meteor.awt.render
import java.awt.Color
import java.awt.Graphics
import java.awt.RadialGradientPaint
import java.awt.RenderingHints
import java.awt.geom.Ellipse2D
import javax.swing.JComponent

class BallPanel : JComponent() {
    var ballY = RADIUS

    override fun paintComponent(g: Graphics) {
        g.render {
            it.color = Color.gray
            it.fillRect(0, 0, width, height)

            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)

            val shape = Ellipse2D.Double((this.width / 2 - RADIUS).toDouble(),
                    (this.ballY - RADIUS).toDouble(),
                    (2 * RADIUS).toDouble(), (2 * RADIUS).toDouble())
            it.paint = RadialGradientPaint(this.width / 2 - RADIUS / 4,
                    this.ballY - RADIUS / 5, RADIUS + RADIUS / 4,
                    floatArrayOf(0.0f, 1.0f),
                    arrayOf(Color.green, Color.green.deriveByBrightness(-0.7)))
            it.fill(shape)
            it.color = Color(0, 64, 0)
            it.draw(shape)
        }
    }

    companion object {
        val RADIUS = 20.0f
    }
}
