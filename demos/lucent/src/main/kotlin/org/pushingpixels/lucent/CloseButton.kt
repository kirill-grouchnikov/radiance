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
package org.pushingpixels.lucent

import org.pushingpixels.lucent.details.DetailsWindowManager
import org.pushingpixels.meteor.addDelayedActionListener
import org.pushingpixels.meteor.addDelayedHierarchyListener
import org.pushingpixels.meteor.addDelayedMouseListener
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.torch.TorchComponent
import org.pushingpixels.torch.componentTimeline
import org.pushingpixels.torch.from
import java.awt.*
import java.awt.geom.Ellipse2D
import javax.swing.JButton
import javax.swing.SwingUtilities

/**
 * The close button of the Lucent demo.
 *
 * @author Kirill Grouchnikov
 */
class CloseButton : JButton() {
    /**
     * The alpha value of this button. Is updated in the fade-in timeline which
     * starts when this button becomes a part of the host window hierarchy.
     */
    var alpha = 0.0f

    /**
     * Creates a new close button.
     */
    init {
        // mark the button as non-opaque since it will be
        // round shaped and translucent
        this.isOpaque = false
        this.foreground = Color(158, 205, 255)
        this.alpha = 0.0f

        this.addDelayedActionListener {
            // dispose the host window
            val windowAncestor = SwingUtilities.getWindowAncestor(this@CloseButton)
            LucentUtils.fadeOutAndDispose(windowAncestor, 500)
            DetailsWindowManager.disposeCurrentlyShowing()
        }

        // timeline for the rollover effect (interpolating the button's foreground color)
        val rolloverTimeline = this.componentTimeline {
            property(TorchComponent.foreground from Color(158, 205, 255) to Color(64, 140, 255))
            duration = 200
        }

        // and register a mouse listener to play the rollover timeline
        this.addDelayedMouseListener(
                onMouseEntered = { rolloverTimeline.play() },
                onMouseExited = { rolloverTimeline.playReverse() })

        // fade in the component once it's part of the window hierarchy
        this.addDelayedHierarchyListener {
            this@CloseButton.componentTimeline {
                property(::alpha from 0.0f to 1.0f)
                repaintCallback()
                duration = 500
            }.play()
        }
    }

    override fun paintBorder(g: Graphics) {
        // overriden to remove the default border painting
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)

            // use the current alpha
            it.composite = AlphaComposite.SrcOver.derive(this.alpha)

            // paint the background - black fill and a dark outline
            // based on the current foreground color
            val contour = Ellipse2D.Double(1.0, 1.0, (width - 3).toDouble(), (height - 3).toDouble())
            it.color = Color.black
            it.stroke = BasicStroke(2.0f)
            it.fill(contour)
            it.color = this.foreground.darker().darker()
            it.draw(contour)

            // paint the outer cross (always white)
            it.color = Color.white
            it.stroke = BasicStroke(6.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)
            val offset = width / 3
            it.drawLine(offset, offset, width - offset - 1, height - offset - 1)
            it.drawLine(width - offset - 1, offset, offset, height - offset - 1)

            // paint the inner cross (using the current foreground color)
            it.color = this.foreground
            it.stroke = BasicStroke(4.2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)
            it.drawLine(offset, offset, width - offset - 1, height - offset - 1)
            it.drawLine(width - offset - 1, offset, offset, height - offset - 1)
        }
    }
}
