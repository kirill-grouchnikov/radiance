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
package org.pushingpixels.radiance.laf.internal.painter;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.laf.api.RadianceSkin;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.internal.utils.*;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.laf.api.painter.highlight.RadianceHighlightPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.EnumSet;
import java.util.Set;

/**
 * Contains utility methods related to highlight painters. This class is for internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class HighlightPainterUtils {
    /**
     * Cache for small objects.
     */
    private final static LazyResettableHashMap<BufferedImage> smallCache =
            new LazyResettableHashMap<>("RadianceHighlightUtils");

    /**
     * Paints the highlight for the specified component.
     * 
     * @param g
     *            Graphic context.
     * @param rendererPane
     *            Renderer pane. Can be <code>null</code>.
     * @param c
     *            Component.
     * @param rect
     *            Rectangle to highlight.
     * @param borderAlpha
     *            Border alpha.
     * @param openSides
     *            The sides specified in this set will not be painted. Can be <code>null</code> or
     *            empty.
     * @param fillScheme
     *            The fill color scheme.
     * @param borderScheme
     *            The border color scheme.
     */
    public static void paintHighlight(Graphics g, CellRendererPane rendererPane, Component c,
            Rectangle rect, float borderAlpha, Set<RadianceLafSlices.Side> openSides, RadianceColorScheme fillScheme,
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
            openSides = EnumSet.noneOf(RadianceLafSlices.Side.class);
        }
        if (rect.width * rect.height < 100000) {
            String openKey = "";
            for (RadianceLafSlices.Side oSide : openSides) {
                openKey += oSide.name() + "-";
            }

            double scale = RadianceCommonCortex.getScaleFactor(c);
            ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                    scale, highlightPainter.getDisplayName(),
                    highlightBorderPainter.getDisplayName(), rect.width, rect.height,
                    fillScheme.getDisplayName(), borderScheme.getDisplayName(), borderAlpha,
                    openKey);
            BufferedImage result = smallCache.get(key);
            if (result == null) {
                result = createHighlighterImage(c, rect, borderAlpha, openSides, fillScheme,
                        borderScheme, highlightPainter, highlightBorderPainter);
                smallCache.put(key, result);
            }
            RadianceCommonCortex.drawImageWithScale(g2d, scale, result, 0, 0);
        }
    }

    private static BufferedImage createHighlighterImage(Component c, Rectangle rect,
            float borderAlpha, Set<RadianceLafSlices.Side> openSides, RadianceColorScheme currScheme,
            RadianceColorScheme currBorderScheme, RadianceHighlightPainter highlightPainter,
            RadianceBorderPainter highlightBorderPainter) {
        double scale = RadianceCommonCortex.getScaleFactor(c);
        BufferedImage result = RadianceCoreUtilities.getBlankImage(scale, rect.width, rect.height);
        Graphics2D resGraphics = result.createGraphics();
        highlightPainter.paintHighlight(resGraphics, c, rect.width, rect.height, currScheme);
        paintHighlightBorder(resGraphics, c, rect.width, rect.height, borderAlpha, openSides,
                highlightBorderPainter, currBorderScheme);
        resGraphics.dispose();
        return result;
    }

    /**
     * Paints the highlight border for the specified component.
     * 
     * @param graphics
     *            Graphic context.
     * @param comp
     *            Component.
     * @param width
     *            Border width.
     * @param height
     *            Border width.
     * @param borderAlpha
     *            Border alpha.
     * @param openSides
     *            The sides specified in this set will not be painted. Can be <code>null</code> or
     *            empty.
     * @param highlightBorderPainter
     *            Border painter for the highlights.
     * @param borderColorScheme
     *            The border color scheme.
     */
    public static void paintHighlightBorder(Graphics2D graphics, Component comp, int width,
            int height, float borderAlpha, Set<RadianceLafSlices.Side> openSides,
            RadianceBorderPainter highlightBorderPainter, RadianceColorScheme borderColorScheme) {
        if (borderAlpha <= 0.0f) {
            return;
        }

        int openDelta = 3 + (int) (Math.ceil(3.0 * RadianceSizeUtils.getBorderStrokeWidth(comp)));
        int deltaLeft = openSides.contains(RadianceLafSlices.Side.LEFT) ? openDelta : 0;
        int deltaRight = openSides.contains(RadianceLafSlices.Side.RIGHT) ? openDelta : 0;
        int deltaTop = openSides.contains(RadianceLafSlices.Side.TOP) ? openDelta : 0;
        int deltaBottom = openSides.contains(RadianceLafSlices.Side.BOTTOM) ? openDelta : 0;

        float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(comp);
        Shape contour = new Rectangle2D.Float(borderDelta / 2.0f, borderDelta / 2.0f,
                width + deltaLeft + deltaRight - borderDelta,
                height + deltaTop + deltaBottom - borderDelta);

        Graphics2D g2d = (Graphics2D) graphics.create();
        g2d.translate(-deltaLeft, -deltaTop);
        g2d.setComposite(WidgetUtilities.getAlphaComposite(null, borderAlpha, graphics));
        Shape contourInner = new Rectangle2D.Float(1.5f * borderDelta, 1.5f * borderDelta,
                width + deltaLeft + deltaRight - 3 * borderDelta,
                height + deltaTop + deltaBottom - 3 * borderDelta);

        highlightBorderPainter.paintBorder(g2d, comp, width + deltaLeft + deltaRight,
                height + deltaTop + deltaBottom, contour, contourInner, borderColorScheme);
        g2d.dispose();
    }
}
