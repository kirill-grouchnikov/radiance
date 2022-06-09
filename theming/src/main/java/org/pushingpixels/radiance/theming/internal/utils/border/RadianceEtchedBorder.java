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
package org.pushingpixels.radiance.theming.internal.utils.border;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.internal.contrib.flatlaf.HiDPIUtils;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Custom implementation of etched border.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceEtchedBorder implements Border {
    /**
     * Returns the highlight color for the specified component.
     *
     * @param c Component.
     * @return Matching highlight color.
     */
    private Color getHighlightColor(Component c) {
        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.getColorScheme(
                c, RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);
        return colorScheme.getSeparatorPrimaryColor();
    }

    /**
     * Returns the shadow color for the specified component.
     *
     * @param c Component.
     * @return Matching shadow color.
     */
    private Color getShadowColor(Component c) {
        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.getColorScheme(
                c, RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);
        return colorScheme.getSeparatorSecondaryColor();
    }

    public boolean isBorderOpaque() {
        return false;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width,
            int height) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);

        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_OFF);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_ROUND));

                    graphics1X.setColor(getShadowColor(c));
                    graphics1X.draw(new Rectangle2D.Float(0.0f, 0.0f,
                            scaledWidth - 2.0f, scaledHeight - 2.0f));

                    graphics1X.setColor(getHighlightColor(c));
                    // left
                    graphics1X.drawLine(1, 1, 1, scaledHeight - 3);
                    // top
                    graphics1X.drawLine(1, 1, scaledWidth - 3, 1);
                    // right
                    graphics1X.drawLine(scaledWidth - 1, 0, scaledWidth - 1, scaledHeight - 1);
                    // bottom
                    graphics1X.drawLine(0, scaledHeight - 1, scaledWidth - 2, scaledHeight - 1);
                });

        graphics.dispose();

        // this is a fix for defect 248 - in order to paint the TitledBorder
        // text respecting the AA settings of the display, we have to
        // set rendering hints on the passed Graphics object.
        RadianceCommonCortex.installDesktopHints((Graphics2D) g, c.getFont());
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(2, 2, 2, 2);
    }
}
