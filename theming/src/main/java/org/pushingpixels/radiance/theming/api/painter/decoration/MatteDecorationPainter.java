/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.painter.decoration;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import java.awt.*;

/**
 * Implementation of {@link RadianceDecorationPainter} that uses matte painting
 * on decoration areas.
 *
 * @author Kirill Grouchnikov
 */
public class MatteDecorationPainter extends RadianceDecorationPainter {
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
        RadianceThemingSlices.DecorationAreaType decorationAreaType,
        int width, int height, double scaleFactor, ContainerColorTokens colorTokens) {

        if ((decorationAreaType == RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE) ||
            (decorationAreaType == RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE)) {
            this.paintTitleBackground(graphics, width, height, scaleFactor, colorTokens);
        } else {
            this.paintExtraBackground(graphics, comp, width, height, scaleFactor, colorTokens);
        }
    }

    private void paintTitleBackground(Graphics2D graphics, int width, int height, double scaleFactor,
        ContainerColorTokens colorTokens) {
        Graphics2D g2d = (Graphics2D) graphics.create();
        this.fill(g2d, colorTokens, 0, 0, 0, width, height, scaleFactor);
        g2d.dispose();
    }

    private void paintExtraBackground(Graphics2D graphics, Component comp,
        int width, int height, double scaleFactor, ContainerColorTokens colorTokens) {

        Point offset = RadianceCoreUtilities.getOffsetInRootPaneCoords(comp);
        Graphics2D g2d = (Graphics2D) graphics.create();
        this.fill(g2d, colorTokens, (int) (offset.y * scaleFactor), 0, 0, width, height, scaleFactor);
        g2d.dispose();
    }

    private void fill(Graphics2D graphics, ContainerColorTokens colorTokens,
        int offsetY, int x, int y, int width, int height, double scaleFactor) {
        // 0 - flex point : gradient
        // flex point - : flat fill

        Color startColor = colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
            : colorTokens.getContainerSurfaceLowest();
        Color endColor = colorTokens.getContainerSurface();

        int scaledFlexPoint = (int) (FLEX_POINT * scaleFactor);

        // Three cases:
        // A: The area is fully within the gradient
        // B: The area is fully within the flat fill
        // C: The area is partially within the gradient and partially with the flat fill

        // Case A
        if ((y + height) <= scaledFlexPoint) {
            graphics.setPaint(new GradientPaint(0, y - offsetY, startColor,
                0, y - offsetY + scaledFlexPoint, endColor));
            graphics.fillRect(x, y, width, height);
            return;
        }

        // Case B
        if (y >= scaledFlexPoint) {
            graphics.setColor(endColor);
            graphics.fillRect(x, y, width, height);
            return;
        }

        // Case C
        Paint paint =
            new LinearGradientPaint(
                0, y - offsetY, 0, y + height,
                new float[] { 0.0f, (float) scaledFlexPoint / (float) (height + offsetY), 1.0f },
                new Color[] { startColor, endColor, endColor },
                MultipleGradientPaint.CycleMethod.NO_CYCLE);

        graphics.setPaint(paint);
        graphics.fillRect(x, y, width, height);
    }
}
