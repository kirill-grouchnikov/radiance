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
package org.pushingpixels.radiance.theming.internal.painter;

import org.pushingpixels.radiance.common.internal.contrib.flatlaf.HiDPIUtils;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.highlight.RadianceHighlightPainter;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.EnumSet;
import java.util.Set;

/**
 * Contains utility methods related to highlight painters. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class HighlightPainterUtils {
    /**
     * Paints the highlight for the specified component.
     *
     * @param g            Graphic context.
     * @param rendererPane Renderer pane. Can be <code>null</code>.
     * @param c            Component.
     * @param rect         Rectangle to highlight.
     * @param borderAlpha  Border alpha.
     * @param openSides    The sides specified in this set will not be painted. Can be <code>null</code> or
     *                     empty.
     * @param fillScheme   The fill color scheme.
     * @param borderScheme The border color scheme.
     */
    public static void paintHighlight(Graphics g, CellRendererPane rendererPane, Component c,
            Rectangle rect, float borderAlpha, Set<RadianceThemingSlices.Side> openSides, RadianceColorScheme fillScheme,
            RadianceColorScheme borderScheme) {
        // fix for bug 65
        if ((rect.width <= 0) || (rect.height <= 0)) {
            return;
        }

        Component compForQuerying = (rendererPane != null) ? rendererPane : c;
        RadianceSkin skin = RadianceCoreUtilities.getSkin(compForQuerying);
        RadianceHighlightPainter highlightPainter = skin.getHighlightPainter();
        RadianceBorderPainter highlightBorderPainter = RadianceCoreUtilities
                .getHighlightBorderPainter(compForQuerying);
        Graphics2D g2d = (Graphics2D) g.create(rect.x, rect.y, rect.width, rect.height);

        if (openSides == null) {
            openSides = EnumSet.noneOf(RadianceThemingSlices.Side.class);
        }
        paintHighlight(g2d, c, rect, borderAlpha, openSides, fillScheme,
                borderScheme, highlightPainter, highlightBorderPainter);
    }

    private static void paintHighlight(Graphics2D g, Component c, Rectangle rect,
            float borderAlpha, Set<RadianceThemingSlices.Side> openSides, RadianceColorScheme currScheme,
            RadianceColorScheme currBorderScheme, RadianceHighlightPainter highlightPainter,
            RadianceBorderPainter highlightBorderPainter) {
        Graphics2D resGraphics = (Graphics2D) g.create();
        highlightPainter.paintHighlight(resGraphics, c, rect.width, rect.height, currScheme);
        paintHighlightBorder1X(resGraphics, c, rect.width, rect.height, borderAlpha, openSides,
                highlightBorderPainter, currBorderScheme);
        resGraphics.dispose();
    }

    /**
     * Paints the highlight border for the specified component.
     */
    public static void paintHighlightBorder1X(Graphics2D g, Component comp, int width,
            int height, float borderAlpha, Set<RadianceThemingSlices.Side> openSides,
            RadianceBorderPainter highlightBorderPainter, RadianceColorScheme borderColorScheme) {
        if (borderAlpha <= 0.0f) {
            return;
        }

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    int openDelta = (int) (scaleFactor * 6.0);
                    int deltaLeft = openSides.contains(RadianceThemingSlices.Side.LEFT) ? openDelta : 0;
                    int deltaRight = openSides.contains(RadianceThemingSlices.Side.RIGHT) ? openDelta : 0;
                    int deltaTop = openSides.contains(RadianceThemingSlices.Side.TOP) ? openDelta : 0;
                    int deltaBottom = openSides.contains(RadianceThemingSlices.Side.BOTTOM) ? openDelta : 0;

                    Shape contour = new Rectangle2D.Float(0.0f, 0.0f,
                            scaledWidth + deltaLeft + deltaRight - 1.0f,
                            scaledHeight + deltaTop + deltaBottom - 1.0f);

                    graphics1X.translate(-deltaLeft, -deltaTop);
                    graphics1X.setComposite(WidgetUtilities.getAlphaComposite(null, borderAlpha, graphics1X));
                    Shape contourInner = new Rectangle2D.Float(
                            1.0f, 1.0f,
                            scaledWidth + deltaLeft + deltaRight - 3.0f,
                            scaledHeight + deltaTop + deltaBottom - 3.0f);

                    highlightBorderPainter.paintBorder(graphics1X, comp,
                            scaledWidth + deltaLeft + deltaRight,
                            scaledHeight + deltaTop + deltaBottom,
                            contour, contourInner, borderColorScheme);
                    graphics1X.translate(deltaLeft, deltaTop);
                });
        graphics.dispose();
    }
}
