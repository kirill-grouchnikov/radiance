/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
public class CookbookBorderLeft implements Border {
    private float alphaTop;
    private float alphaBottom;
    private boolean skipTopPixel;
    private boolean skipBottomPixel;

    public CookbookBorderLeft(boolean skipTopPixel, boolean skipBottomPixel) {
        this(skipTopPixel, skipBottomPixel, 1.0f, 1.0f);
    }

    public CookbookBorderLeft(boolean skipTopPixel, boolean skipBottomPixel, float alphaTop,
            float alphaBottom) {
        this.skipTopPixel = skipTopPixel;
        this.skipBottomPixel = skipBottomPixel;
        this.alphaTop = alphaTop;
        this.alphaBottom = alphaBottom;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 1, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        RadianceColorScheme scheme = RadianceThemingCortex.ComponentScope.getCurrentSkin(c)
                .getColorScheme(c, ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

        Graphics2D g2d = (Graphics2D) g.create();

        // light line on the left-hand side
        g2d.setComposite(AlphaComposite.SrcOver);
        Color baseColor = scheme.getLightColor();
        g2d.setPaint(new GradientPaint(x, y,
                new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(),
                        (int) (baseColor.getAlpha() * this.alphaTop)),
                x, y + height, new Color(baseColor.getRed(), baseColor.getGreen(),
                        baseColor.getBlue(), (int) (baseColor.getAlpha() * this.alphaBottom))));
        // start one pixel lower so that the top border painted by the
        // decoration painter on footers doesn't get overriden
        float borderStrokeWidth = 1.0f / (float) RadianceCommonCortex.getScaleFactor(c);
        g2d.setStroke(new BasicStroke(borderStrokeWidth));
        float topY = y + (skipTopPixel ? borderStrokeWidth : 0);
        float bottomY = y + height - borderStrokeWidth - (skipBottomPixel ? borderStrokeWidth : 0);
        Line2D.Float line = new Line2D.Float(x, topY, x, bottomY);
        g2d.draw(line);

        g2d.dispose();
    }

}
