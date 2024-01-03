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
package org.pushingpixels.radiance.theming.api.painter.border;

import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceInternalArrowButton;

import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;

/**
 * The default border painter. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class StandardBorderPainter implements RadianceBorderPainter {
    @Override
    public String getDisplayName() {
        return "Standard";
    }

    @Override
    public boolean isPaintingInnerContour() {
        return false;
    }

    @Override
    public void paintBorder(Graphics g, Component c, float width, float height, Shape contour,
            Shape innerContour, RadianceColorScheme borderScheme) {
        if (contour == null)
            return;

        Graphics2D graphics = (Graphics2D) g.create();

        Color topBorderColor = getTopBorderColor(borderScheme);
        Color midBorderColor = getMidBorderColor(borderScheme);
        Color bottomBorderColor = getBottomBorderColor(borderScheme);

        if ((topBorderColor != null) && (midBorderColor != null) && (bottomBorderColor != null)) {
            // issue 433 - the "c" can be null when painting
            // the border of a tree icon used outside the
            // JTree context.
            boolean isSpecialButton = (c != null)
                    && c.getClass().isAnnotationPresent(RadianceInternalArrowButton.class);
            int joinKind = isSpecialButton ? BasicStroke.JOIN_MITER : BasicStroke.JOIN_ROUND;
            int capKind = isSpecialButton ? BasicStroke.CAP_SQUARE : BasicStroke.CAP_BUTT;
            graphics.setStroke(new BasicStroke(1.0f, capKind, joinKind));

            MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0, height,
                    new float[] { 0.0f, 0.5f, 1.0f },
                    new Color[] { topBorderColor, midBorderColor, bottomBorderColor },
                    CycleMethod.REPEAT);
            graphics.setPaint(gradient);
            // graphics.setColor(Color.green);
            graphics.draw(contour);
        }

        graphics.dispose();
    }

    /**
     * Computes the color of the top portion of the border. Override to provide different visual.
     * 
     * @param borderScheme
     *            The border color scheme.
     * @return The color of the top portion of the border.
     */
    public Color getTopBorderColor(RadianceColorScheme borderScheme) {
        return RadianceColorUtilities.getTopBorderColor(borderScheme);
    }

    /**
     * Computes the color of the middle portion of the border. Override to provide different visual.
     * 
     * @param borderScheme
     *            The border color scheme.
     * @return The color of the middle portion of the border.
     */
    public Color getMidBorderColor(RadianceColorScheme borderScheme) {
        return RadianceColorUtilities.getMidBorderColor(borderScheme);
    }

    /**
     * Computes the color of the bottom portion of the border. Override to provide different visual.
     * 
     * @param borderScheme
     *            The border color scheme.
     * @return The color of the bottom portion of the border.
     */
    public Color getBottomBorderColor(RadianceColorScheme borderScheme) {
        return RadianceColorUtilities.getBottomBorderColor(borderScheme);
    }

    @Override
    public Color getRepresentativeColor(RadianceColorScheme borderScheme) {
        return this.getMidBorderColor(borderScheme);
    }
}
