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
package org.pushingpixels.demo.spyglass.cookbook;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

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
        RadianceColorScheme scheme = RadianceThemingCortex.ComponentScope.getCurrentSkin(c)
                .getColorScheme(c, ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

        Graphics2D g2d = (Graphics2D) g.create();
        // dark line on the right-hand side
        float borderStrokeWidth = 1.0f / (float) RadianceCommonCortex.getScaleFactor(c);
        g2d.setStroke(new BasicStroke(borderStrokeWidth));
        Line2D.Float line = new Line2D.Float(x + width - borderStrokeWidth, y,
                x + width - borderStrokeWidth, y + height);

        Color baseDarkColor = scheme.getDarkColor();
        Color baseUltraDarkColor = scheme.getUltraDarkColor();
        int baseRed = (int) (0.2f * baseDarkColor.getRed() + 0.8f * baseUltraDarkColor.getRed());
        int baseGreen = (int) (0.2f * baseDarkColor.getGreen()
                + 0.8f * baseUltraDarkColor.getGreen());
        int baseBlue = (int) (0.2f * baseDarkColor.getBlue() + 0.8f * baseUltraDarkColor.getBlue());
        int baseAlpha = (int) (0.2f * baseDarkColor.getAlpha()
                + 0.8f * baseUltraDarkColor.getAlpha());

        g2d.setPaint(new GradientPaint(x, y,
                new Color(baseRed, baseGreen, baseBlue, (int) (baseAlpha * this.alphaTop)), x,
                y + height,
                new Color(baseRed, baseGreen, baseBlue, (int) (baseAlpha * this.alphaBottom))));

        g2d.draw(line);

        g2d.dispose();
    }
}
