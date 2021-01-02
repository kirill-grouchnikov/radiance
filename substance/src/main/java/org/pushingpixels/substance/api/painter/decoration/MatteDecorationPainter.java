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
package org.pushingpixels.substance.api.painter.decoration;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

import java.awt.*;

/**
 * Implementation of {@link SubstanceDecorationPainter} that uses matte painting
 * on decoration areas.
 *
 * @author Kirill Grouchnikov
 */
public class MatteDecorationPainter implements SubstanceDecorationPainter {
    /**
     * The display name for the decoration painters of this class.
     */
    public static final String DISPLAY_NAME = "Matte";

    private static final int FLEX_POINT = 50;

    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }

    @Override
    public void paintDecorationArea(Graphics2D graphics, Component comp,
            DecorationAreaType decorationAreaType, int width, int height, SubstanceSkin skin) {
        SubstanceColorScheme colorScheme = skin.getBackgroundColorScheme(decorationAreaType);
        if ((decorationAreaType == DecorationAreaType.PRIMARY_TITLE_PANE)
                || (decorationAreaType == DecorationAreaType.SECONDARY_TITLE_PANE)) {
            this.paintTitleBackground(graphics, width, height, colorScheme);
        } else {
            this.paintExtraBackground(graphics, comp, width, height, colorScheme);
        }
    }

    /**
     * Paints the title background.
     *
     * @param graphics Graphics context.
     * @param width    Width.
     * @param height   Height.
     * @param scheme   Color scheme for painting the title background.
     */
    private void paintTitleBackground(Graphics2D graphics, int width, int height,
            SubstanceColorScheme scheme) {
        Graphics2D g2d = (Graphics2D) graphics.create();
        this.fill(g2d, scheme, 0, 0, 0, width, height);
        g2d.dispose();
    }

    /**
     * Paints the background of non-title decoration areas.
     *
     * @param graphics Graphics context.
     * @param comp     Component.
     * @param width    Width.
     * @param height   Height.
     * @param scheme   Color scheme for painting the title background.
     */
    private void paintExtraBackground(Graphics2D graphics, Component comp, int width, int height,
            SubstanceColorScheme scheme) {
        Point offset = SubstanceCoreUtilities.getOffsetInRootPaneCoords(comp);
        Graphics2D g2d = (Graphics2D) graphics.create();
        this.fill(g2d, scheme, offset.y, 0, 0, width, height);
        g2d.dispose();
    }

    /**
     * Fills the relevant part with the gradient fill.
     *
     * @param graphics Graphics.
     * @param scheme   Color scheme to use.
     * @param offsetY  Vertical offset.
     * @param x        X coordinate of the fill area.
     * @param y        Y coordinate of the fill area.
     * @param width    Fill area width.
     * @param height   Fill area height.
     */
    protected void fill(Graphics2D graphics, SubstanceColorScheme scheme,
            int offsetY, int x, int y, int width, int height) {
        // 0 - flex : light -> medium
        // flex - : medium fill

        Color startColor = scheme.getLightColor();
        Color endColor = SubstanceColorUtilities.getInterpolatedColor(startColor,
                scheme.getMidColor(), 0.4f);

        int gradientHeight = Math.max(FLEX_POINT, height + offsetY);
        Paint paint = (gradientHeight == FLEX_POINT) ?
                new GradientPaint(0, y - offsetY, startColor, 0, y + gradientHeight - offsetY,
                        endColor) :
                new LinearGradientPaint(
                        0, y - offsetY, 0, y + height - offsetY,
                        new float[] { 0.0f, (float) FLEX_POINT / (float) gradientHeight, 1.0f },
                        new Color[] { startColor, endColor, endColor },
                        MultipleGradientPaint.CycleMethod.NO_CYCLE);

        graphics.setPaint(paint);
        graphics.fillRect(x, y, width, height);
    }

    @Override
    public void paintDecorationArea(Graphics2D graphics, Component comp, DecorationAreaType
            decorationAreaType, Shape contour, SubstanceColorScheme colorScheme) {
        Point offset = SubstanceCoreUtilities.getOffsetInRootPaneCoords(comp);

        Color startColor = colorScheme.getLightColor();
        Color endColor = SubstanceColorUtilities.getInterpolatedColor(startColor,
                colorScheme.getMidColor(), 0.4f);

        int gradientHeight = Math.max(FLEX_POINT, comp.getHeight() + offset.y);
        Paint paint = (gradientHeight == FLEX_POINT) ?
                new GradientPaint(0, -offset.y, startColor, 0, gradientHeight - offset.y,
                        endColor) :
                new LinearGradientPaint(
                        0, -offset.y, 0, comp.getHeight() - offset.y,
                        new float[] { 0.0f, (float) FLEX_POINT / (float) gradientHeight, 1.0f },
                        new Color[] { startColor, endColor, endColor },
                        MultipleGradientPaint.CycleMethod.NO_CYCLE);

        graphics.setPaint(paint);
        graphics.fill(contour);
    }
}
