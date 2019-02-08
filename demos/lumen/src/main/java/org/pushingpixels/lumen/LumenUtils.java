/*
 * Copyright (c) 2009-2019 Lumen Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Lumen Kirill Grouchnikov nor the names of
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
package org.pushingpixels.lumen;

import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.TimelineState;
import org.pushingpixels.trident.callback.UIThreadTimelineCallbackAdapter;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.AffineTransform;
import java.text.AttributedString;

public class LumenUtils {
    public static int getMultilineTextHeight(Font font, String text,
            int availableWidth) {
        AttributedString attributedDescription = new AttributedString(text);
        if (text.length() == 0)
            return 0;

        attributedDescription.addAttribute(TextAttribute.FONT, font);
        FontRenderContext frc = new FontRenderContext(new AffineTransform(),
                false, false);
        LineBreakMeasurer lineBreakMeasurer = new LineBreakMeasurer(
                attributedDescription.getIterator(), frc);
        int currOffset = 0;
        int lineCount = 0;
        while (true) {
            TextLayout tl = lineBreakMeasurer.nextLayout(availableWidth);
            if (tl == null)
                break;

            int charCount = tl.getCharacterCount();

            lineCount++;
            currOffset += charCount;
        }

        LineMetrics lm = font.getLineMetrics("", frc);
        float height = lm.getHeight() + (lineCount - 1) * lm.getAscent();

        return (int) height;
    }

    public static int paintMultilineText(Graphics2D g2d, String text,
            int textX, int textWidth, int textY, int maxTextLineCount) {
        NeonCortex.installDesktopHints(g2d);
        FontRenderContext frc = new FontRenderContext(new AffineTransform(),
                true, false);
        int fa = g2d.getFontMetrics().getAscent();

        if (text.length() == 0)
            return textY;

        int currOffset = 0;
        AttributedString attributedDescription = new AttributedString(text);
        attributedDescription.addAttribute(TextAttribute.FONT, g2d.getFont());
        LineBreakMeasurer lineBreakMeasurer = new LineBreakMeasurer(
                attributedDescription.getIterator(), frc);
        int lineCount = 0;
        while (true) {
            TextLayout tl = lineBreakMeasurer.nextLayout(textWidth);
            if (tl == null)
                break;

            int charCount = tl.getCharacterCount();
            String line = text.substring(currOffset, currOffset + charCount);

            g2d.drawString(line, textX, textY);

            textY += fa;
            currOffset += charCount;

            lineCount++;
            if ((maxTextLineCount > 0) && (lineCount == maxTextLineCount))
                break;
        }

        // textY += fh;

        return textY;
    }

    public static void fadeOutAndDispose(final Window window, int fadeOutDuration) {
        Timeline.builder(window)
                .addPropertyToInterpolate(Timeline.<Float>property("opacity").from(1.0f).to(0.0f))
                .addCallback(new UIThreadTimelineCallbackAdapter() {
                    @Override
                    public void onTimelineStateChanged(TimelineState oldState,
                            TimelineState newState, float durationFraction,
                            float timelinePosition) {
                        if (newState == TimelineState.DONE) {
                            window.dispose();
                        }
                    }
                })
                .setDuration(fadeOutDuration)
                .play();
    }
}
