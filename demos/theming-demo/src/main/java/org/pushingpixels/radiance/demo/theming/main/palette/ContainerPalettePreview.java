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
package org.pushingpixels.radiance.demo.theming.main.palette;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class ContainerPalettePreview extends JComponent {
    private ContainerColorTokens colorTokens;

    public ContainerPalettePreview(ContainerColorTokens colorTokens) {
        this.colorTokens = colorTokens;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(220, 20);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        int height = getHeight();
        int smallGap = 3;
        int bigGap = 8;
        int xOffset = 0;

        // Container colors
        paintSquare(g2d, xOffset, height, colorTokens.getContainerLowest());
        xOffset += (height + smallGap);
        paintSquare(g2d, xOffset, height, colorTokens.getContainerLow());
        xOffset += (height + smallGap);
        paintSquare(g2d, xOffset, height, colorTokens.getContainer());
        xOffset += (height + smallGap);
        paintSquare(g2d, xOffset, height, colorTokens.getContainerHigh());
        xOffset += (height + smallGap);
        paintSquare(g2d, xOffset, height, colorTokens.getContainerHighest());

        xOffset += (height + bigGap);

        // On container colors
        paintSquare(g2d, xOffset, height, colorTokens.getOnContainer());
        xOffset += (height + smallGap);
        paintSquare(g2d, xOffset, height, colorTokens.getOnContainerVariant());

        xOffset += (height + bigGap);

        // Container outline colors
        paintSquare(g2d, xOffset, height, colorTokens.getContainerOutline());
        xOffset += (height + smallGap);
        paintSquare(g2d, xOffset, height, colorTokens.getContainerOutlineVariant());

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
