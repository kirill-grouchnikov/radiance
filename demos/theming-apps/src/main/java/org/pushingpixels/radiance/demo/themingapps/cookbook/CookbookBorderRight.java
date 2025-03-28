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
package org.pushingpixels.radiance.demo.themingapps.cookbook;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Custom border to provide separation lines between the main application panels.
 * 
 * @author Kirill Grouchnikov
 */
public class CookbookBorderRight implements Border {
    private float alphaTop;
    private float alphaBottom;

    public CookbookBorderRight() {
        this(1.0f, 1.0f);
    }

    public CookbookBorderRight(float alphaTop, float alphaBottom) {
        this.alphaTop = alphaTop;
        this.alphaBottom = alphaBottom;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 1);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        ContainerColorTokens tokens = RadianceThemingCortex.ComponentScope.getCurrentSkin(c)
            .getNeutralContainerTokens(c);

        Graphics2D g2d = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.translate(x, y);
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0, width, height,
            (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                // dark line on the right-hand side
                graphics1X.setStroke(new BasicStroke(1.0f));
                Line2D.Float line = new Line2D.Float(scaledWidth - 1.0f, 0,
                    scaledWidth - 1.0f, scaledHeight);

                Color baseColor = tokens.getContainerOutline();
                int baseRed = baseColor.getRed();
                int baseGreen = baseColor.getGreen();
                int baseBlue = baseColor.getBlue();
                int baseAlpha = baseColor.getAlpha();

                graphics1X.setPaint(new GradientPaint(0, 0,
                    new Color(baseRed, baseGreen, baseBlue, (int) (baseAlpha * this.alphaTop)),
                    0, scaledHeight,
                    new Color(baseRed, baseGreen, baseBlue, (int) (baseAlpha * this.alphaBottom))));

                graphics1X.draw(line);
            }
        );
        g2d.dispose();
    }
}
