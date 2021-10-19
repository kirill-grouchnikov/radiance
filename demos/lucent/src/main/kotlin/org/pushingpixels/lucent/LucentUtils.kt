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
package org.pushingpixels.lucent

import org.pushingpixels.radiance.common.api.RadianceCommonCortex
import org.pushingpixels.radiance.animation.ktx.RadianceWindow
import org.pushingpixels.radiance.animation.ktx.windowTimeline
import java.awt.Font
import java.awt.Graphics2D
import java.awt.Window
import java.awt.font.FontRenderContext
import java.awt.font.LineBreakMeasurer
import java.awt.font.TextAttribute
import java.awt.geom.AffineTransform
import java.text.AttributedString

object LucentUtils {
    fun getMultilineTextHeight(font: Font, text: String, availableWidth: Int): Int {
        val attributedDescription = AttributedString(text)
        if (text.isEmpty()) {
            return 0
        }

        attributedDescription.addAttribute(TextAttribute.FONT, font)
        val frc = FontRenderContext(AffineTransform(), false, false)
        val lineBreakMeasurer = LineBreakMeasurer(attributedDescription.iterator, frc)
        var currOffset = 0
        var lineCount = 0
        while (true) {
            val tl = lineBreakMeasurer.nextLayout(availableWidth.toFloat()) ?: break

            val charCount = tl.characterCount

            lineCount++
            currOffset += charCount
        }

        val lm = font.getLineMetrics("", frc)
        val height = lm.height + (lineCount - 1) * lm.ascent

        return height.toInt()
    }

    fun paintMultilineText(g2d: Graphics2D, text: String,
                           textX: Int, textWidth: Int, textY: Int, maxTextLineCount: Int): Int {
        var currTextY = textY
        RadianceCommonCortex.installDesktopHints(g2d, g2d.font)
        val frc = FontRenderContext(AffineTransform(), true, false)
        val fa = g2d.fontMetrics.ascent

        if (text.isEmpty()) {
            return currTextY
        }

        var currOffset = 0
        val attributedDescription = AttributedString(text)
        attributedDescription.addAttribute(TextAttribute.FONT, g2d.font)
        val lineBreakMeasurer = LineBreakMeasurer(attributedDescription.iterator, frc)
        var lineCount = 0
        while (true) {
            val tl = lineBreakMeasurer.nextLayout(textWidth.toFloat()) ?: break

            val charCount = tl.characterCount
            val line = text.substring(currOffset, currOffset + charCount)

            g2d.drawString(line, textX, currTextY)

            currTextY += fa
            currOffset += charCount

            lineCount++
            if (maxTextLineCount > 0 && lineCount == maxTextLineCount) {
                break
            }
        }

        return currTextY
    }

    fun fadeOutAndDispose(window: Window, fadeOutDuration: Long) {
        window.windowTimeline {
            property(RadianceWindow.opacity from 1.0f to 0.0f)
            onTimelineDone { window.dispose() }
            duration = fadeOutDuration
        }.play()
    }
}
