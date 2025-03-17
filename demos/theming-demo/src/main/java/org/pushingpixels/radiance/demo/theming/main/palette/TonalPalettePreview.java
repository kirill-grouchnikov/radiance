/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.palette;

import org.pushingpixels.ephemeral.chroma.palettes.BaseTonalPalette;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TonalPalettePreview extends JComponent {
    private BaseTonalPalette tonalPalette;
    private boolean showLegend;

    public TonalPalettePreview(BaseTonalPalette tonalPalette) {
        this(tonalPalette, true);
    }

    public TonalPalettePreview(BaseTonalPalette tonalPalette, boolean showLegend) {
        this.tonalPalette = tonalPalette;
        this.showLegend = showLegend;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(440, showLegend ? 40 : 20);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        FontMetrics fm = g2d.getFontMetrics();

        int xOffset = 10;

        for (int tone = 0; tone <= 100; tone += 5) {
            if (showLegend) {
                String toneLabel = "" + tone;
                int toneLabelWidth = fm.stringWidth(toneLabel);
                g2d.drawString(toneLabel, xOffset + (20 - toneLabelWidth) / 2, 15);
            }

            int toneRgb = this.tonalPalette.tone(tone);
            Color toneColor = new Color(toneRgb);
            paintSquare(g2d, xOffset, showLegend ? 20 : 0, 20, toneColor);
            g2d.setColor(RadianceThemingCortex.ComponentScope.getCurrentSkin(this)
                .getContainerTokens(this, ComponentState.ENABLED, RadianceThemingSlices.ContainerType.NEUTRAL)
                .getOnContainer());
            xOffset += 20;
        }

        g2d.dispose();
    }

    private void paintSquare(Graphics2D g2d, int xOffset, int yOffset, int size, Color color) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.translate(xOffset, yOffset);
        g2d.setColor(color);
        g2d.fillRect(0, 0, size, size);

        g2d.setColor(Color.BLACK);
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0, size, size, (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
            graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
            graphics1X.draw(new Rectangle2D.Float(x, y, scaledWidth - 1, scaledHeight - 1));
        });

        g2d.translate(-xOffset, -yOffset);
    }
}
