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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class SurfacePreview extends JComponent {
    private RadianceColorScheme2 colorScheme;

    public SurfacePreview(RadianceColorScheme2 colorScheme) {
        this.colorScheme = colorScheme;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 20);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        int height = getHeight();
        int smallGap = 3;
        int bigGap = 8;
        int xOffset = 10;

        // Surface colors
        paintSquare(g2d, xOffset, height, colorScheme.getSurfaceDim());
        xOffset += (height + smallGap);
        paintSquare(g2d, xOffset, height, colorScheme.getSurface());
        xOffset += (height + smallGap);
        paintSquare(g2d, xOffset, height, colorScheme.getSurfaceBright());

        g2d.dispose();
    }

    private void paintSquare(Graphics2D g2d, int xOffset, int size, Color color) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.translate(xOffset, 0);
        g2d.setColor(color);
        g2d.fillRect(0, 0, size, size);

        g2d.setColor(Color.BLACK);
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0, size, size, (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
            graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
            graphics1X.draw(new Rectangle2D.Float(x, y, scaledWidth - 1, scaledHeight - 1));
        });

        g2d.translate(-xOffset, 0);
    }
}
