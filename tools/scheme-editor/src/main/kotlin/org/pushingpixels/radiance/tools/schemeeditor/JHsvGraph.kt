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
package org.pushingpixels.radiance.tools.schemeeditor

import org.pushingpixels.radiance.swing.ktx.awt.brightness
import org.pushingpixels.radiance.swing.ktx.awt.hue
import org.pushingpixels.radiance.swing.ktx.awt.render
import org.pushingpixels.radiance.swing.ktx.awt.saturation
import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex
import java.awt.Color
import java.awt.Font
import java.awt.Graphics
import java.awt.RenderingHints
import javax.swing.JComponent

class JHsvGraph : JComponent() {

    var colors: Array<Color>? = null
        set(value) {
            field = value
            this.repaint()
        }

    override fun paintComponent(g: Graphics) {
        val w = width
        val h = height

        g.render {
            it.font = RadianceThemingCortex.GlobalScope.getFontPolicy().fontSet.controlFont.deriveFont(Font.BOLD)
            RadianceCommonCortex.installDesktopHints(it, it.font)

            it.color = Color.black

            val xOffset = it.fontMetrics.stringWidth("255") + 5
            val yOffset = 2 * it.fontMetrics.height

            it.drawLine(xOffset, yOffset / 2, xOffset, h - yOffset)
            it.drawLine(xOffset, h - yOffset, w - 1, h - yOffset)

            val keys = "0123456789ABCDEF"
            for (i in 0 until keys.length) {
                val key = keys[i] + "F"
                val y = yOffset + (h - 2 * yOffset) - (h - 2 * yOffset) * (i + 1) / 16
                it.color = Color.lightGray
                it.drawLine(xOffset + 1, y, w - 1, y)
                it.color = Color.gray
                it.drawString(key, xOffset - 5 - it.fontMetrics.stringWidth(key),
                        y + it.fontMetrics.descent)
            }

            if (this.colors != null) {
                val hue = FloatArray(this.colors!!.size)
                val sat = FloatArray(this.colors!!.size)
                val bri = FloatArray(this.colors!!.size)
                for ((index, color) in this.colors!!.withIndex()) {
                    hue[index] = color.hue()
                    sat[index] = color.saturation()
                    bri[index] = color.brightness()
                }

                it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON)

                // Hue
                it.color = COLOR_HUE
                for (i in this.colors!!.indices) {
                    val x = xOffset + 5 + (w - 1 - xOffset - 10) * i / (this.colors!!.size - 1)
                    val yHue = yOffset + (h - 2 * yOffset) - ((h - 2 * yOffset) * hue[i]).toInt()
                    it.fillRect(x - 2, yHue - 2, 5, 5)

                    if (i > 0) {
                        val prevHue = yOffset + (h - 2 * yOffset) -
                                ((h - 2 * yOffset) * hue[i - 1]).toInt()
                        val xPrev = xOffset + 5 +
                                (w - 1 - xOffset - 10) * (i - 1) / (this.colors!!.size - 1)
                        it.drawLine(xPrev, prevHue, x, yHue)
                    }
                }

                // Saturation
                it.color = COLOR_SAT
                for (i in this.colors!!.indices) {
                    val x = xOffset + 5 + (w - 1 - xOffset - 10) * i / (this.colors!!.size - 1)
                    val ySat = yOffset + (h - 2 * yOffset) - ((h - 2 * yOffset) * sat[i]).toInt()
                    it.fillRect(x - 2, ySat - 2, 5, 5)

                    if (i > 0) {
                        val prevSat = yOffset + (h - 2 * yOffset) -
                                ((h - 2 * yOffset) * sat[i - 1]).toInt()
                        val xPrev = xOffset + 5 +
                                (w - 1 - xOffset - 10) * (i - 1) / (this.colors!!.size - 1)
                        it.drawLine(xPrev, prevSat, x, ySat)
                    }
                }

                // Brightness
                it.color = COLOR_BRI
                for (i in this.colors!!.indices) {
                    val x = xOffset + 5 + (w - 1 - xOffset - 10) * i / (this.colors!!.size - 1)
                    val yBri = yOffset + (h - 2 * yOffset) - ((h - 2 * yOffset) * bri[i]).toInt()
                    it.fillRect(x - 2, yBri - 2, 5, 5)

                    if (i > 0) {
                        val prevBri = yOffset + (h - 2 * yOffset) -
                                ((h - 2 * yOffset) * bri[i - 1]).toInt()
                        val xPrev = xOffset + 5 +
                                (w - 1 - xOffset - 10) * (i - 1) / (this.colors!!.size - 1)
                        it.drawLine(xPrev, prevBri, x, yBri)
                    }
                }

                val labelWidth = it.fontMetrics.stringWidth("WWW") + 20
                var xLabel = xOffset + (w - xOffset - 3 * labelWidth) / 2

                val lh = h - it.fontMetrics.ascent / 2 + 2 - yOffset / 2
                it.color = COLOR_HUE
                it.drawLine(xLabel, lh, xLabel + 15, lh)
                it.fillRect(xLabel + 6, lh - 2, 5, 5)
                it.drawString("Hue", xLabel + 20, h - yOffset / 2)
                xLabel += labelWidth

                it.color = COLOR_SAT
                it.drawLine(xLabel, lh, xLabel + 15, lh)
                it.fillRect(xLabel + 6, lh - 2, 5, 5)
                it.drawString("Sat", xLabel + 20, h - yOffset / 2)
                xLabel += labelWidth

                it.color = COLOR_BRI
                it.drawLine(xLabel, lh, xLabel + 15, lh)
                it.fillRect(xLabel + 6, lh - 2, 5, 5)
                it.drawString("Bri", xLabel + 20, h - yOffset / 2)
                xLabel += labelWidth
            }
        }
    }

    companion object {
        private val COLOR_HUE = Color(159, 41, 54)
        private val COLOR_SAT = Color(27, 88, 124)
        private val COLOR_BRI = Color(241, 135, 23)
    }
}
