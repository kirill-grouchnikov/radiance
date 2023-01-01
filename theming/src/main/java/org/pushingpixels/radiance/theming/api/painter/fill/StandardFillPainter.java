/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.painter.fill;

import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;

/**
 * Fill painter that draws visuals with subtle 3D gradient appearance. This class is part of
 * officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class StandardFillPainter implements RadianceFillPainter {
    @Override
    public String getDisplayName() {
        return "Standard";
    }

    @Override
    public void paintContourBackground(Graphics g, Component comp, float width, float height,
            Shape contour, RadianceColorScheme fillScheme) {

        // long millis = System.nanoTime();

        Graphics2D graphics = (Graphics2D) g.create();

        Color topFillColor = this.getTopFillColor(fillScheme);
        Color midFillColorTop = this.getMidFillColorTop(fillScheme);
        Color midFillColorBottom = this.getMidFillColorBottom(fillScheme);
        Color bottomFillColor = this.getBottomFillColor(fillScheme);

        // Fill background
        // long millis000 = System.nanoTime();

        MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0, height,
                new float[]{0.0f, 0.4999999f, 0.5f, 1.0f},
                new Color[]{topFillColor, midFillColorTop, midFillColorBottom, bottomFillColor},
                CycleMethod.REPEAT);
        graphics.setPaint(gradient);
        graphics.fill(contour);

        graphics.dispose();
    }

    /**
     * Computes the color of the top portion of the fill. Override to provide different visual.
     *
     * @param fillScheme
     *         The fill scheme.
     * @return The color of the top portion of the fill.
     */
    public Color getTopFillColor(RadianceColorScheme fillScheme) {
        return RadianceColorUtilities.getTopFillColor(fillScheme);
    }

    /**
     * Computes the color of the middle portion of the fill from the top. Override to provide
     * different visual.
     *
     * @param fillScheme
     *         The fill scheme.
     * @return The color of the middle portion of the fill from the top.
     */
    public Color getMidFillColorTop(RadianceColorScheme fillScheme) {
        return RadianceColorUtilities.getMidFillColor(fillScheme);
    }

    /**
     * Computes the color of the middle portion of the fill from the bottom. Override to provide
     * different visual.
     *
     * @param fillScheme
     *         The fill scheme.
     * @return The color of the middle portion of the fill from the bottom.
     */
    public Color getMidFillColorBottom(RadianceColorScheme fillScheme) {
        return this.getMidFillColorTop(fillScheme);
    }

    /**
     * Computes the color of the bottom portion of the fill. Override to provide different visual.
     *
     * @param fillScheme
     *         The fill scheme.
     * @return The color of the bottom portion of the fill.
     */
    public Color getBottomFillColor(RadianceColorScheme fillScheme) {
        return RadianceColorUtilities.getBottomFillColor(fillScheme);
    }
    @Override
    public Color getRepresentativeColor(RadianceColorScheme fillScheme) {
        return this.getMidFillColorTop(fillScheme);
    }
}
