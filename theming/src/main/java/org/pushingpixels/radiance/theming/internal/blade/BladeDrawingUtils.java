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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.shaper.RadianceComponentShaper;
import org.pushingpixels.radiance.theming.internal.painter.OutlinePainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceOutlineUtilities;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class BladeDrawingUtils {

    public static void paintBladeBorder(Graphics2D g, Component c, ComponentState state,
        int x, int y, int width, int height, float baseRadius, ContainerColorTokens colorTokens) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
            (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {

                RadianceComponentShaper.ShapeSupplier bladeShapeSupplier =
                    (shapeComponent, shapeWidth, shapeHeight, shapeInsets, shapeRadiusAdjustment, shapeScaleFactor) -> {
                        float scaledRadius = (float) scaleFactor * baseRadius - shapeRadiusAdjustment;
                        return RadianceOutlineUtilities.getBaseOutline(
                            shapeComponent.getComponentOrientation(),
                            shapeWidth - 1.0f, shapeHeight - 1.0f, scaledRadius,
                            null, shapeInsets);
                    };

                OutlinePainterUtils.paintOutline(graphics1X, c, state,
                    scaledWidth, scaledHeight, scaleFactor, 1.0f, bladeShapeSupplier, colorTokens);
            });
        graphics.dispose();
    }

    public static void paintBladeBorder(Graphics2D g, Component c, ComponentState state,
        int x, int y, int width, int height, ContainerColorTokens colorTokens) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(c);
        RadianceComponentShaper.ShapeSupplier shapeSupplier = componentShaper.getBaselineShapeSupplier();

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
            (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                OutlinePainterUtils.paintOutline(graphics1X, c, state,
                    scaledWidth - 1.0f, scaledHeight - 1.0f, scaleFactor, 1.0f, shapeSupplier, colorTokens);
            });
        graphics.dispose();
    }

    public static void paintBladeSimpleBorder(Component c, Graphics2D g, int width, int height,
        float baseRadius, ContainerColorTokens colorTokens) {
        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                Color borderColor = colorTokens.getContainerOutline();
                graphics1X.setColor(borderColor);
                if (baseRadius == 0.0f) {
                    graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
                    graphics1X.draw(new Rectangle2D.Float(0.0f, 0.0f, scaledWidth - 1.0f, scaledHeight - 1.0f));
                } else {
                    float scaledRadius = (float) scaleFactor * baseRadius;
                    graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
                    graphics1X.draw(new RoundRectangle2D.Float(
                        0.0f, 0.0f, scaledWidth - 1.0f, scaledHeight - 1.0f, scaledRadius, scaledRadius));
                }
            });
        graphics.dispose();
    }

    public static void paintBladeSimpleBorder(Component c, Graphics2D g, int width, int height,
        RadianceComponentShaper.ShapeSupplier shapeSupplier, ContainerColorTokens colorTokens) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                Color borderColor = colorTokens.getContainerOutline();
                graphics1X.setColor(borderColor);
                graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
                graphics1X.draw(shapeSupplier.getShape(c,
                    scaledWidth - 1.0f, scaledHeight - 1.0f, 0.0f, 0.0f, scaleFactor));
            });
        graphics.dispose();
    }
}
