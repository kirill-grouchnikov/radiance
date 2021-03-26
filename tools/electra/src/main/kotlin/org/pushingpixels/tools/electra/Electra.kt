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
package org.pushingpixels.tools.electra

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.meteor.addDelayedActionListener
import org.pushingpixels.meteor.addDelayedMouseListener
import org.pushingpixels.meteor.awt.deriveByBrightness
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.api.NeonCortex
import org.pushingpixels.substance.api.ComponentState
import org.pushingpixels.substance.api.SubstanceCortex
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind
import org.pushingpixels.substance.api.skin.GeminiSkin
import org.pushingpixels.tools.common.JImageComponent
import org.pushingpixels.tools.common.RadianceLogo
import java.awt.*
import java.awt.geom.Line2D
import javax.swing.*
import javax.swing.border.Border
import javax.swing.border.EmptyBorder

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)
        SubstanceCortex.GlobalScope.setSkin(GeminiSkin())

        val electraFrame = JFrame("Electra")
        electraFrame.iconImage = RadianceLogo.getTitlePaneLogoImage(electraFrame)

        electraFrame.layout = GridLayout(1, 2)

        val jic = JImageComponent(false)
        jic.setLegend(arrayOf("\tDrag and drop an image file from local disk"))
        jic.border = object : Border {
            override fun paintBorder(c: Component, g: Graphics, x: Int, y: Int, width: Int, height: Int) {
                g.render {
                    val borderColorScheme = SubstanceCortex.ComponentScope.getCurrentSkin(c).getColorScheme(c,
                            ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED)
                    val strokeWidth = 1.0f / NeonCortex.getScaleFactor().toFloat()
                    it.stroke = BasicStroke(strokeWidth, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)

                    it.color = borderColorScheme.midColor
                    val leftX = x + width - 1 - strokeWidth
                    it.draw(Line2D.Float(leftX, y.toFloat(), leftX, (y + height).toFloat()))

                    it.composite = AlphaComposite.SrcOver.derive(0.8f)
                    val rightX = leftX + strokeWidth
                    it.color = borderColorScheme.extraLightColor.deriveByBrightness(0.4)
                    it.draw(Line2D.Float(rightX, y.toFloat(), rightX, (y + height).toFloat()))
                }
            }

            override fun isBorderOpaque(): Boolean {
                return false
            }

            override fun getBorderInsets(c: Component): Insets {
                return Insets(0, 0, 0, 2)
            }
        }
        electraFrame.add(jic)

        val electrifiedImageComponent = JElectrifiedImageComponent(jic)
        val electrifiedContainer = JPanel(BorderLayout())
        val scroller = JScrollPane(electrifiedImageComponent,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER)
        scroller.border = EmptyBorder(0, 0, 0, 0)
        electrifiedContainer.add(scroller, BorderLayout.CENTER)

        val saveElectrified = JButton("save")
        saveElectrified.addDelayedActionListener {
            val originalFile = jic.originalFile
            if (originalFile != null) {
                electrifiedImageComponent.save(originalFile)
            }
        }
        val controls = JPanel(FlowLayout(FlowLayout.TRAILING))
        controls.add(saveElectrified)
        electrifiedContainer.add(controls, BorderLayout.SOUTH)

        electraFrame.add(electrifiedContainer)

        jic.addDelayedMouseListener(onMouseClicked = { e ->
            if (e!!.clickCount == 2) {
                val absPoint = jic.toOriginalImageCoords(e.x, e.y)
                electrifiedImageComponent.addZoomBubble(absPoint.x, absPoint.y, 80)
            }
        })

        electraFrame.setSize(1200, 800)
        electraFrame.setLocationRelativeTo(null)
        electraFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        electraFrame.isVisible = true
    }
}
