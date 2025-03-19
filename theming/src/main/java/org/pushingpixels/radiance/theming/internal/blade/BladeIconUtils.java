/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

public class BladeIconUtils {

    private static class SimplisticSoftBorderReverseTonalFillPainter extends FractionBasedFillPainter {
        /**
         * Singleton instance.
         */
        public static final RadianceFillPainter INSTANCE = new SimplisticSoftBorderReverseTonalFillPainter();

        private SimplisticSoftBorderReverseTonalFillPainter() {
            super("Simplistic Soft Border Reverse Tonal",
                new float[] {0.0f, 0.5f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getContainerSurfaceLowest,
                    ContainerColorTokens::getContainerSurfaceLow,
                    ContainerColorTokens::getContainerSurface
                }
            );
        }
    }

    public static void drawTonalCheckBox(Graphics2D g, JComponent component, RadianceFillPainter fillPainter,
        RadianceOutlinePainter outlinePainter, int dimension, ComponentState currentState,
        ContainerColorTokens colorTokens, float checkMarkVisibility,
        float checkMarkFlatness, boolean isCheckMarkFadingOut) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, dimension, dimension,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                float cornerRadius = (float) scaleFactor *
                    RadianceSizeUtils.getClassicButtonCornerRadius(
                        RadianceSizeUtils.getComponentFontSize(component));

                int contourDim = scaledWidth - 1;
                Shape contourOuter = RadianceOutlineUtilities.getBaseOutline(
                    component.getComponentOrientation(),
                    contourDim, contourDim,
                    cornerRadius, null, 0.0f);

                float containerAlpha = currentState.isDisabled()
                    ? colorTokens.getContainerSurfaceDisabledAlpha() : 1.0f;
                graphics1X.setComposite(getAlphaComposite(containerAlpha));
                Shape contourFill = RadianceOutlineUtilities.getBaseOutline(
                    component.getComponentOrientation(),
                    contourDim + 1, contourDim + 1,
                    cornerRadius, null, 0.5f);
                fillPainter.paintContourBackground(graphics1X, component,
                    contourDim, contourDim,
                    contourFill, colorTokens);

                Shape contourInner = outlinePainter.isPaintingInnerContour() ?
                    RadianceOutlineUtilities.getBaseOutline(
                        component.getComponentOrientation(),
                        contourDim, contourDim, cornerRadius, null, 1.0f)
                    : null;
                float containerOutlineAlpha = currentState.isDisabled()
                    ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f;
                graphics1X.setComposite(getAlphaComposite(containerOutlineAlpha));
                outlinePainter.paintOutline(graphics1X, component, contourDim, contourDim,
                    contourOuter, contourInner, colorTokens);

                float finalCheckMarkVisibility = isCheckMarkFadingOut && (checkMarkVisibility > 0.0f) ?
                    1.0f : checkMarkVisibility;
                float onContainerOutlineAlpha = currentState.isDisabled()
                    ? colorTokens.getOnContainerDisabledAlpha() : 1.0f;
                if (finalCheckMarkVisibility > 0.0) {
                    Graphics2D graphicsForCheckMark = (Graphics2D) graphics1X.create();
                    if (isCheckMarkFadingOut) {
                        graphicsForCheckMark.setComposite(getAlphaComposite(
                            onContainerOutlineAlpha * checkMarkVisibility));
                    } else {
                        graphicsForCheckMark.setComposite(getAlphaComposite(onContainerOutlineAlpha));
                    }

                    drawCheckMarkAtScale1X(graphicsForCheckMark, scaledWidth, colorTokens,
                        checkMarkFlatness);

                    graphicsForCheckMark.dispose();
                }
            });
        graphics.dispose();
    }

    private static void drawCheckMarkAtScale1X(Graphics2D graphics1X, int dimension,
        ContainerColorTokens colorTokens, float checkMarkFlatness) {
        // create straight checkbox path
        GeneralPath path = new GeneralPath();
        path.moveTo(0.25f * dimension, 0.47f * dimension + 0.03f * dimension * checkMarkFlatness);
        path.lineTo(0.48f * dimension, 0.72f * dimension - 0.22f * dimension * checkMarkFlatness);
        path.lineTo(0.76f * dimension, 0.27f * dimension + 0.23f * dimension * checkMarkFlatness);

        graphics1X.setColor(colorTokens.getOnContainer());
        Stroke stroke = new BasicStroke((float) 0.15 * dimension, BasicStroke.CAP_ROUND,
            BasicStroke.JOIN_ROUND);
        graphics1X.setStroke(stroke);
        graphics1X.draw(path);
    }

    public static void drawTonalRadioButton(Graphics2D g, AbstractButton button, RadianceFillPainter fillPainter,
        RadianceOutlinePainter outlinePainter, int dimension, ComponentState currentState,
        ContainerColorTokens colorTokens, float checkMarkVisibility) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, dimension, dimension,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                int contourDim = scaledWidth;
                Shape contourOuter = new Ellipse2D.Float(0.0f, 0.0f, contourDim, contourDim);

                float containerAlpha = currentState.isDisabled()
                    ? colorTokens.getContainerSurfaceDisabledAlpha() : 1.0f;
                graphics1X.setComposite(getAlphaComposite(containerAlpha));
                fillPainter.paintContourBackground(graphics1X, button,
                    contourDim, contourDim,
                    new Ellipse2D.Float(0.5f, 0.5f, contourDim, contourDim),
                    colorTokens);

                Shape contourInner = outlinePainter.isPaintingInnerContour() ?
                    new Ellipse2D.Float(1.0f, 1.0f, contourDim - 2.0f, contourDim - 2.0f)
                    : null;
                float containerOutlineAlpha = currentState.isDisabled()
                    ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f;
                graphics1X.setComposite(getAlphaComposite(containerOutlineAlpha));
                outlinePainter.paintOutline(graphics1X, button, contourDim, contourDim,
                    contourOuter, contourInner, colorTokens);

                float rc = contourDim / 2.0f + 0.5f;
                float radius = contourDim / 4.5f;
                Shape markOval = new Ellipse2D.Double(rc - radius, rc - radius, 2 * radius, 2 * radius);
                Graphics2D graphicsForCheckMark = (Graphics2D) graphics1X.create();

                float onContainerOutlineAlpha = currentState.isDisabled()
                    ? colorTokens.getOnContainerDisabledAlpha() : 1.0f;
                if (checkMarkVisibility > 0.0) {
                    // mark
                    graphicsForCheckMark.setComposite(getAlphaComposite(
                        onContainerOutlineAlpha * checkMarkVisibility));
                    graphicsForCheckMark.setColor(colorTokens.getOnContainer());
                } else {
                    // draw ghost mark holder
                    graphicsForCheckMark.setComposite(getAlphaComposite(onContainerOutlineAlpha * 0.3f));
                    graphicsForCheckMark.setPaint(
                        new GradientPaint(
                            rc + radius, rc - radius,
                            colorTokens.getContainerSurfaceHigh(),
                            rc - radius, rc + radius,
                            colorTokens.getContainerSurfaceLow()));
                }
                graphicsForCheckMark.fill(markOval);
                graphicsForCheckMark.dispose();
            });
        graphics.dispose();
    }

    public static void drawSliderThumbHorizontal(Graphics2D g, JSlider slider,
        RadianceFillPainter fillPainter, RadianceOutlinePainter outlinePainter,
        int width, int height, ContainerColorTokens colorTokens, ComponentState currState) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                float containerSurfaceAlpha =
                    (currState.isDisabled() ? colorTokens.getContainerSurfaceDisabledAlpha() : 1.0f);
                graphics1X.setComposite(WidgetUtilities.getAlphaComposite(slider,
                    containerSurfaceAlpha, g));
                fillPainter.paintContourBackground(graphics1X, slider,
                    scaledWidth, scaledHeight,
                    RadianceOutlineUtilities.getTriangleButtonOutline(
                        scaledWidth, scaledHeight, 2 * (float) scaleFactor, 1.5f),
                    colorTokens);

                Shape contourOuter = RadianceOutlineUtilities.getTriangleButtonOutline(
                    scaledWidth, scaledHeight, 2 * (float) scaleFactor, 1.0f);
                Shape contourInner = RadianceOutlineUtilities.getTriangleButtonOutline(
                    scaledWidth, scaledHeight, 2 * (float) scaleFactor, 2.0f);
                float containerOutlineAlpha =
                    (currState.isDisabled() ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f);
                graphics1X.setComposite(WidgetUtilities.getAlphaComposite(slider,
                    containerOutlineAlpha, g));
                outlinePainter.paintOutline(graphics1X, slider,
                    scaledWidth, scaledHeight, contourOuter, contourInner, colorTokens);
            });
        graphics.dispose();
    }

    public static void drawSliderThumbVertical(Graphics2D g, JSlider slider,
        RadianceFillPainter fillPainter, RadianceOutlinePainter outlinePainter,
        int width, int height, ContainerColorTokens colorTokens, ComponentState currState) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, height, width,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                AffineTransform at = AffineTransform.getTranslateInstance(0, scaledHeight);
                at.rotate(-Math.PI / 2);
                graphics1X.transform(at);

                if (!slider.getComponentOrientation().isLeftToRight()) {
                    AffineTransform mirror = AffineTransform.getTranslateInstance(scaledWidth, scaledHeight);
                    mirror.rotate(Math.PI);
                    graphics1X.transform(mirror);
                }

                float containerSurfaceAlpha =
                    (currState.isDisabled() ? colorTokens.getContainerSurfaceDisabledAlpha() : 1.0f);
                graphics1X.setComposite(WidgetUtilities.getAlphaComposite(slider,
                    containerSurfaceAlpha, g));
                fillPainter.paintContourBackground(graphics1X, slider,
                    scaledWidth, scaledHeight,
                    RadianceOutlineUtilities.getTriangleButtonOutline(
                        scaledWidth, scaledHeight, 2 * (float) scaleFactor, 1.5f),
                    colorTokens);

                Shape contourOuter = RadianceOutlineUtilities.getTriangleButtonOutline(
                    scaledWidth, scaledHeight, 2 * (float) scaleFactor, 1.0f);
                Shape contourInner = RadianceOutlineUtilities.getTriangleButtonOutline(
                    scaledWidth, scaledHeight, 2 * (float) scaleFactor, 2.0f);
                float containerOutlineAlpha =
                    (currState.isDisabled() ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f);
                graphics1X.setComposite(WidgetUtilities.getAlphaComposite(slider,
                    containerOutlineAlpha, g));
                outlinePainter.paintOutline(graphics1X, slider,
                    scaledWidth, scaledHeight,
                    contourOuter, contourInner, colorTokens);
            });
        graphics.dispose();
    }

    public static void drawSliderThumbRound(Graphics2D g, JSlider slider,
        RadianceFillPainter fillPainter, RadianceOutlinePainter outlinePainter,
        int dimension, ContainerColorTokens colorTokens, ComponentState currState) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, dimension, dimension,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                float containerSurfaceAlpha =
                    (currState.isDisabled() ? colorTokens.getContainerSurfaceDisabledAlpha() : 1.0f);
                graphics1X.setComposite(WidgetUtilities.getAlphaComposite(slider,
                    containerSurfaceAlpha, g));
                fillPainter.paintContourBackground(graphics1X, slider,
                    scaledWidth, scaledHeight,
                    new Ellipse2D.Float(0.5f, 0.5f,
                        scaledWidth - 2.0f, scaledHeight - 2.0f),
                    colorTokens);

                Shape contourOuter = new Ellipse2D.Float(0.0f, 0.0f,
                    scaledWidth - 1.0f, scaledHeight - 1.0f);
                Shape contourInner = new Ellipse2D.Float(1.0f, 1.0f,
                    scaledWidth - 3.0f, scaledHeight - 3.0f);
                float containerOutlineAlpha =
                    (currState.isDisabled() ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f);
                graphics1X.setComposite(WidgetUtilities.getAlphaComposite(slider,
                    containerOutlineAlpha, g));
                outlinePainter.paintOutline(graphics1X, slider,
                    scaledWidth, scaledHeight, contourOuter, contourInner, colorTokens);
            });
        graphics.dispose();
    }

    public static void drawTreeIcon(Graphics2D g, JTree tree, int size,
        ContainerColorTokens colorTokens, boolean isCollapsed) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, size, size,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                RadianceFillPainter fillPainter = SimplisticSoftBorderReverseTonalFillPainter.INSTANCE;
                RadianceOutlinePainter outlinePainter = new FlatOutlinePainter();

                Shape contour = RadianceOutlineUtilities.getBaseOutline(
                    tree.getComponentOrientation(),
                    scaledWidth, scaledHeight,
                    (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(
                        RadianceSizeUtils.getComponentFontSize(tree)) / 1.5f, null,
                    1.0f);

                fillPainter.paintContourBackground(graphics1X, tree, scaledWidth, scaledHeight,
                    contour, colorTokens);
                outlinePainter.paintOutline(graphics1X, tree, scaledWidth, scaledHeight, contour,
                    null, colorTokens);

                Color signColor = colorTokens.getOnContainer();
                graphics1X.setColor(signColor);
                float gap = 5.0f * scaledWidth / 24.0f;
                float mid = scaledWidth / 2.0f;
                // Horizontal stroke
                graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND));
                graphics1X.draw(new Line2D.Float(gap, mid, scaledWidth - gap + 1, mid));
                if (isCollapsed) {
                    // Vertical stroke
                    graphics1X.draw(new Line2D.Float(mid, gap, mid, scaledHeight - gap + 1));
                }
            });
        graphics.dispose();
    }

    public static void drawCloseIcon(Graphics2D g, int iconSize,
            float primaryStrokeWidth, ContainerColorTokens colorTokens) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        int start = iconSize / 4;
        int end = iconSize - start;

        Color primaryColor = colorTokens.getOnContainer();

        Stroke primaryStroke = new BasicStroke(primaryStrokeWidth,
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

        graphics.setStroke(primaryStroke);
        graphics.setColor(primaryColor);
        graphics.drawLine(start, start, end, end);
        graphics.drawLine(start, end, end, start);

        graphics.dispose();
    }

    public static void drawIconifyIcon(Graphics2D g, int iconSize,
            ContainerColorTokens colorTokens) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        int start = iconSize / 4 - 2;
        int end = 3 * iconSize / 4;
        int size = end - start - 2;

        Color primaryColor = colorTokens.getOnContainer();

        graphics.setColor(primaryColor);
        graphics.fillRect(start + 2, end - 1, size, 3);
        graphics.dispose();
    }

    public static void drawMaximizeIcon(Graphics2D g, int iconSize,
            ContainerColorTokens colorTokens) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        int start = iconSize / 4 - 1;
        int end = iconSize - start;

        Color primaryColor = colorTokens.getOnContainer();

        graphics.setColor(primaryColor);
        // top (thicker)
        graphics.fillRect(start, start, end - start, 2);
        // left
        graphics.fillRect(start, start, 1, end - start);
        // right
        graphics.fillRect(end - 1, start, 1, end - start);
        // bottom
        graphics.fillRect(start, end - 1, end - start, 1);
        graphics.dispose();
    }

    public static void drawRestoreIcon(Graphics2D g, int iconSize,
            ContainerColorTokens colorTokens) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        int start = iconSize / 4 - 1;
        int end = iconSize - start;
        int smallSquareSize = end - start - 3;
        Color primaryColor = colorTokens.getOnContainer();

        graphics.setColor(primaryColor);

        // "Main" rectangle
        int mainStartX = start;
        int mainStartY = end - smallSquareSize;
        // top (thicker)
        graphics.fillRect(mainStartX, mainStartY, smallSquareSize, 2);
        // left
        graphics.fillRect(mainStartX, mainStartY, 1, smallSquareSize);
        // right
        graphics.fillRect(mainStartX + smallSquareSize - 1, mainStartY, 1, smallSquareSize);
        // bottom
        graphics.fillRect(mainStartX, mainStartY + smallSquareSize - 1, smallSquareSize, 1);

        // "Secondary rectangle"
        int secondaryStartX = mainStartX + 3;
        int secondaryStartY = mainStartY - 3;
        // top (thicker)
        graphics.fillRect(secondaryStartX, secondaryStartY, smallSquareSize, 2);
        // right
        graphics.fillRect(secondaryStartX + smallSquareSize - 1, secondaryStartY, 1,
                smallSquareSize);
        // bottom (partial)
        graphics.fillRect(mainStartX + smallSquareSize + 1, secondaryStartY + smallSquareSize - 1,
                2, 1);

        graphics.dispose();
    }

    public static void drawHexaMarker(Graphics2D g, int value, ContainerColorTokens colorTokens) {
        value %= 16;
        Color offColor = RadianceColorUtilities.getAlphaColor(
            colorTokens.getOnContainerVariant(), 160);
        Color onColor = colorTokens.getOnContainer();

        boolean bit1 = ((value & 0x1) != 0);
        boolean bit2 = ((value & 0x2) != 0);
        boolean bit3 = ((value & 0x4) != 0);
        boolean bit4 = ((value & 0x8) != 0);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);

        graphics.setColor(bit1 ? onColor : offColor);
        graphics.fillOval(5, 5, 4, 4);
        graphics.setColor(bit2 ? onColor : offColor);
        graphics.fillOval(5, 0, 4, 4);
        graphics.setColor(bit3 ? onColor : offColor);
        graphics.fillOval(0, 5, 4, 4);
        graphics.setColor(bit4 ? onColor : offColor);
        graphics.fillOval(0, 0, 4, 4);

        graphics.dispose();
    }

    private static AlphaComposite getAlphaComposite(float alpha) {
        // Fix for "alpha value out of range"
        float finalAlpha = alpha;
        if (finalAlpha < 0.0f)
            finalAlpha = 0.0f;
        else if (finalAlpha > 1.0f)
            finalAlpha = 1.0f;
        return AlphaComposite.getInstance(AlphaComposite.SRC_OVER, finalAlpha);
    }

    public static void drawSplitDividerBumpImage(Graphics g, RadianceSplitPaneDivider divider,
        int x, int y, int width, int height, boolean isHorizontal,
        ContainerColorTokens colorTokens, ComponentState state) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);

        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
            (graphics1X, offsetX, offsetY, scaledWidth, scaledHeight, scaleFactor) -> {
                int componentFontSize = RadianceSizeUtils.getComponentFontSize(divider);
                int bumpDotDiameter = (int) (scaleFactor *
                    RadianceSizeUtils.getBigDragBumpDiameter(componentFontSize));
                int bumpCellSize = (int) (1.5 * bumpDotDiameter + 1);
                int bumpRows = isHorizontal ? 1 : Math.max(1, scaledHeight / bumpCellSize - 1);
                int bumpColumns = isHorizontal ? Math.max(1, (scaledWidth - 2) / bumpCellSize) : 1;

                int bumpRowOffset = (scaledHeight - bumpCellSize * bumpRows) / 2;
                int bumpColOffset = 1 + (scaledWidth - bumpCellSize * bumpColumns) / 2;

                for (int col = 0; col < bumpColumns; col++) {
                    int cx = bumpColOffset + col * bumpCellSize;
                    for (int row = 0; row < bumpRows; row++) {
                        int cy = bumpRowOffset + row * bumpCellSize + (bumpCellSize - bumpDotDiameter) / 2;

                        graphics1X.translate(cx, cy);

                        float containerSurfaceAlpha =
                            (state.isDisabled() ? colorTokens.getContainerSurfaceDisabledAlpha() : 1.0f);
                        graphics1X.setComposite(getAlphaComposite(containerSurfaceAlpha * 0.8f));
                        graphics1X.setColor(colorTokens.getOnContainer());
                        graphics1X.fillOval(0, 0, bumpDotDiameter, bumpDotDiameter);

                        float containerOutlineAlpha =
                            (state.isDisabled() ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f);
                        graphics1X.setComposite(getAlphaComposite(containerOutlineAlpha * 0.32f));
                        RadianceOutlinePainter outlinePainter = RadianceCoreUtilities.getOutlinePainter(divider);
                        outlinePainter.paintOutline(graphics1X, divider, bumpDotDiameter, bumpDotDiameter,
                            new Ellipse2D.Float(0, 0, bumpDotDiameter, bumpDotDiameter), null, colorTokens);

                        graphics1X.translate(-cx, -cy);
                    }
                }
            });
        graphics.dispose();
    }
}
