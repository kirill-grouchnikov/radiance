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
package org.pushingpixels.radiance.theming.internal.painter;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.RadianceSurfacePainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceComponentShaper;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
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
     * @param state        Component state.
     * @param alpha        Alpha.
     * @param openSides    The sides specified in this set will not be painted. Can be <code>null</code> or
     *                     empty.
     * @param colorTokens  The fill tokens to use.
     */
    public static void paintHighlight(Graphics g, CellRendererPane rendererPane, Component c,
        Rectangle rect, ComponentState state, float alpha, boolean paintHighlightBorders,
        Set<RadianceThemingSlices.Side> openSides,
        ContainerColorTokens colorTokens) {
        // fix for bug 65
        if ((rect.width <= 0) || (rect.height <= 0)) {
            return;
        }

        if (openSides == null) {
            openSides = EnumSet.noneOf(RadianceThemingSlices.Side.class);
        }

        Component compForQuerying = (rendererPane != null) ? rendererPane : c;
        RadianceSkin skin = RadianceCoreUtilities.getSkin(compForQuerying);
        RadianceSurfacePainter highlightPainter = skin.getHighlightSurfacePainter();
        RadianceOutlinePainter highlightOutlinePainter = RadianceCoreUtilities
            .getHighlightOutlinePainter(compForQuerying);

        Graphics2D g2d = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.translate(rect.x, rect.y);
        Set<RadianceThemingSlices.Side> finalOpenSides = openSides;
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0, rect.width, rect.height,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) ->
                paintHighlight1X(g2d, c, scaledWidth, scaledHeight, scaleFactor,
                    state, alpha, paintHighlightBorders, finalOpenSides, colorTokens,
                    highlightPainter, highlightOutlinePainter));
        g2d.dispose();
    }

    private static void paintHighlight1X(Graphics graphics1X, Component c,
        int scaledWidth, int scaledHeight, double scaleFactor,
        ComponentState state, float alpha, boolean paintHighlightBorders,
        Set<RadianceThemingSlices.Side> openSides, ContainerColorTokens colorTokens,
        RadianceSurfacePainter highlightPainter, RadianceOutlinePainter highlightOutlinePainter) {

        Graphics2D g2d = (Graphics2D) graphics1X.create();

        // Fill
        float fillAlpha = alpha * (state.isDisabled()
            ? colorTokens.getContainerSurfaceDisabledAlpha()
            : colorTokens.getContainerSurfaceEnabledAlpha());
        g2d.setComposite(WidgetUtilities.getAlphaComposite(c, fillAlpha, graphics1X));
        highlightPainter.paintSurface(g2d, c, scaledWidth, scaledHeight, scaleFactor,
            new Rectangle2D.Double(0, 0, scaledWidth, scaledHeight), colorTokens);

        // Border
        if (paintHighlightBorders) {
            float borderAlpha = alpha * (state.isDisabled() ? colorTokens.getContainerOutlineDisabledAlpha()
                : colorTokens.getContainerOutlineEnabledAlpha());
            g2d.setComposite(WidgetUtilities.getAlphaComposite(c, borderAlpha, graphics1X));
            paintHighlightBorder1X(g2d, c, scaledWidth, scaledHeight, scaleFactor, 1.0f, openSides,
                highlightOutlinePainter, colorTokens);
        }

        g2d.dispose();
    }

    public static void paintHighlightBorder1X(Graphics2D graphics1X, Component comp,
        int scaledWidth, int scaledHeight, double scaleFactor, float borderAlpha,
        Set<RadianceThemingSlices.Side> openSides, RadianceOutlinePainter highlightOutlinePainter,
        ContainerColorTokens colorTokens) {

        if (borderAlpha <= 0.0f) {
            return;
        }

        ComponentOrientation orientation = comp.getComponentOrientation();
        RadianceThemingSlices.Side leftSide =
            orientation.isLeftToRight()
                ? RadianceThemingSlices.Side.LEADING
                : RadianceThemingSlices.Side.TRAILING;
        RadianceThemingSlices.Side rightSide =
            orientation.isLeftToRight()
                ? RadianceThemingSlices.Side.TRAILING
                : RadianceThemingSlices.Side.LEADING;

        int openDelta = (int) (scaleFactor * 6.0);
        int deltaLeft = openSides.contains(leftSide) ? openDelta : 0;
        int deltaRight = openSides.contains(rightSide) ? openDelta : 0;
        int deltaTop = openSides.contains(RadianceThemingSlices.Side.TOP) ? openDelta : 0;
        int deltaBottom = openSides.contains(RadianceThemingSlices.Side.BOTTOM) ? openDelta : 0;

        RadianceComponentShaper.ShapeSupplier outlineShapeSupplier =
            (c, shapeWidth, shapeHeight, shapeInsets, shapeRadiusAdjustment, shapeScaleFactor) ->
                getBorderPath(c.getComponentOrientation(), shapeWidth, shapeHeight,
                    shapeInsets, openSides);

        graphics1X.setComposite(WidgetUtilities.getAlphaComposite(comp, borderAlpha, graphics1X));

        graphics1X.translate(-deltaLeft, -deltaTop);

        highlightOutlinePainter.paintOutline(graphics1X, comp,
            scaledWidth + deltaLeft + deltaRight,
            scaledHeight + deltaTop + deltaBottom,
            scaleFactor, outlineShapeSupplier, colorTokens);

        graphics1X.translate(deltaLeft, deltaTop);
    }

    private static Path2D getBorderPath(ComponentOrientation orientation,
            float width, float height, float insets,
            Set<RadianceThemingSlices.Side> openSides) {
        RadianceThemingSlices.Side leftSide =
                orientation.isLeftToRight()
                        ? RadianceThemingSlices.Side.LEADING
                        : RadianceThemingSlices.Side.TRAILING;
        RadianceThemingSlices.Side rightSide =
                orientation.isLeftToRight()
                        ? RadianceThemingSlices.Side.TRAILING
                        : RadianceThemingSlices.Side.LEADING;

        Path2D result = new Path2D.Float();
        // Top-left
        result.moveTo(insets, insets);
        // Jump or move to top-right
        if (openSides.contains(RadianceThemingSlices.Side.TOP)) {
            result.moveTo(width - 1.0f - insets, insets);
        } else {
            result.lineTo(width - 1.0f - insets, insets);
        }
        // Jump or move to bottom-right
        if (openSides.contains(rightSide)) {
            result.moveTo(width - 1.0f - insets, height - 1.0f - insets);
        } else {
            result.lineTo(width - 1.0f - insets, height - 1.0f - insets);
        }
        // Jump or move to bottom-left
        if (openSides.contains(RadianceThemingSlices.Side.BOTTOM)) {
            result.moveTo(insets, height - 1.0f - insets);
        } else {
            result.lineTo(insets, height - 1.0f - insets);
        }
        // Jump or move to top-left
        if (openSides.contains(leftSide)) {
            result.moveTo(insets, insets);
        } else {
            result.lineTo(insets, insets);
        }

        return result;
    }
}
