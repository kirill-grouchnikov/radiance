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
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.RadianceSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.shaper.RadianceComponentShaper;
import org.pushingpixels.radiance.theming.internal.painter.OutlinePainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.StateAlpha;
import org.pushingpixels.radiance.theming.internal.painter.SurfacePainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSplitPaneDivider;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;

public class BladeIconUtils {
    public static void drawCheckBox(Graphics2D g, JComponent component,
        int dimension, ComponentState currentState,
        ContainerColorTokens colorTokens, float checkMarkVisibility,
        float checkMarkFlatness, boolean isCheckMarkFadingOut) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(component);

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, dimension, dimension,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                int outlineDim = scaledWidth - 1;

                Shape outlineFill = componentShaper.getCheckBoxShapeSupplier().getShape(component,
                    outlineDim + 1, outlineDim + 1, 0.5f, 0.0f, scaleFactor);

                SurfacePainterUtils.paintSurface(graphics1X, component, currentState,
                    outlineDim, outlineDim, scaleFactor, 1.0f, outlineFill, colorTokens);

                OutlinePainterUtils.paintOutline(graphics1X, component, currentState,
                    outlineDim, outlineDim, scaleFactor, 1.0f, componentShaper.getCheckBoxShapeSupplier(), colorTokens);

                float finalCheckMarkVisibility = isCheckMarkFadingOut && (checkMarkVisibility > 0.0f) ?
                    1.0f : checkMarkVisibility;
                float onContainerOutlineAlpha = currentState.isDisabled()
                    ? colorTokens.getOnContainerDisabledAlpha()
                    : colorTokens.getOnContainerEnabledAlpha();
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

    public static void drawRadioButton(Graphics2D g, AbstractButton button,
        int dimension, ComponentState currentState,
        ContainerColorTokens colorTokens, float checkMarkVisibility) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(button);
        RadianceComponentShaper.ShapeSupplier shapeSupplier = componentShaper.getRadioButtonShapeSupplier();

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, dimension, dimension,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                int outlineDim = scaledWidth;

                Shape outlineFill = shapeSupplier.getShape(button,
                    outlineDim + 1, outlineDim + 1, 0.5f, 0.0f, scaleFactor);
                SurfacePainterUtils.paintSurface(graphics1X, button, currentState,
                    outlineDim, outlineDim, scaleFactor, 1.0f, outlineFill, colorTokens);

                OutlinePainterUtils.paintOutline(graphics1X, button, currentState,
                    outlineDim, outlineDim, scaleFactor, 1.0f,
                    shapeSupplier, colorTokens);

                float rc = outlineDim / 2.0f + 0.5f;
                float radius = outlineDim / 4.5f;
                Shape markShape = shapeSupplier.getShape(button, 2 * radius, 2 * radius, 0.0f, 0.0f, scaleFactor);

                Graphics2D graphicsForMark = (Graphics2D) graphics1X.create();

                float onContainerOutlineAlpha = currentState.isDisabled()
                    ? colorTokens.getOnContainerDisabledAlpha()
                    : colorTokens.getOnContainerEnabledAlpha();
                if (checkMarkVisibility > 0.0) {
                    // mark
                    graphicsForMark.setComposite(getAlphaComposite(
                        onContainerOutlineAlpha * checkMarkVisibility));
                    graphicsForMark.setColor(colorTokens.getOnContainer());
                } else {
                    // draw ghost mark holder
                    graphicsForMark.setComposite(getAlphaComposite(onContainerOutlineAlpha * 0.3f));
                    graphicsForMark.setPaint(
                        new GradientPaint(
                            rc + radius, rc - radius,
                            colorTokens.getContainerSurfaceHigh(),
                            rc - radius, rc + radius,
                            colorTokens.getContainerSurfaceLow()));
                }
                graphicsForMark.translate(rc - radius, rc - radius);
                graphicsForMark.fill(markShape);
                graphicsForMark.dispose();
            });
        graphics.dispose();
    }

    private static StateAlpha sliderIconSurfaceStateAlpha = (componentState, colorTokens) ->
        componentState.isDisabled() ? colorTokens.getContainerSurfaceDisabledAlpha() : 1.0f;

    private static StateAlpha sliderIconOutlineStateAlpha = (componentState, colorTokens) ->
        componentState.isDisabled() ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f;

    public static void drawSliderThumbDirectionalHorizontal(Graphics2D g, JSlider slider,
        RadianceOutlinePainter outlinePainter,
        int width, int height, ContainerColorTokens colorTokens, ComponentState currState) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(slider);
        RadianceComponentShaper.ShapeSupplier shapeSupplier = componentShaper.getSliderThumbDirectionalShapeSupplier();

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                float outlineInset = outlinePainter.getOutlineInset(
                    RadianceOutlinePainter.InsetKind.SURFACE);
                SurfacePainterUtils.paintSurface(graphics1X, slider, currState,
                    RadianceCoreUtilities.getSurfacePainter(slider),
                    scaledWidth, scaledHeight, scaleFactor, 1.0f,
                    shapeSupplier.getShape(slider, scaledWidth + 1.0f, scaledHeight + 1.0f,
                        outlineInset, 0.0f, scaleFactor),
                    colorTokens, sliderIconSurfaceStateAlpha);

                OutlinePainterUtils.paintOutline(graphics1X, slider, currState,
                    RadianceCoreUtilities.getOutlinePainter(slider),
                    scaledWidth, scaledHeight, scaleFactor, 1.0f,
                    shapeSupplier, colorTokens, sliderIconOutlineStateAlpha);
            });
        graphics.dispose();
    }

    public static void drawSliderThumbDirectionalVertical(Graphics2D g, JSlider slider,
        RadianceOutlinePainter outlinePainter,
        int width, int height, ContainerColorTokens colorTokens, ComponentState currState) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(slider);
        RadianceComponentShaper.ShapeSupplier shapeSupplier = componentShaper.getSliderThumbDirectionalShapeSupplier();

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

                float outlineInset = outlinePainter.getOutlineInset(
                    RadianceOutlinePainter.InsetKind.SURFACE);
                SurfacePainterUtils.paintSurface(graphics1X, slider, currState,
                    RadianceCoreUtilities.getSurfacePainter(slider),
                    scaledWidth, scaledHeight, scaleFactor, 1.0f,
                    shapeSupplier.getShape(slider, scaledWidth + 1.0f, scaledHeight + 1.0f,
                        outlineInset, 0.0f, scaleFactor),
                    colorTokens, sliderIconSurfaceStateAlpha);

                OutlinePainterUtils.paintOutline(graphics1X, slider, currState,
                    RadianceCoreUtilities.getOutlinePainter(slider),
                    scaledWidth, scaledHeight, scaleFactor, 1.0f,
                    shapeSupplier, colorTokens, sliderIconOutlineStateAlpha);
            });
        graphics.dispose();
    }

    public static void drawSliderThumbUniform(Graphics2D g, JSlider slider,
        RadianceOutlinePainter outlinePainter,
        int dimension, ContainerColorTokens colorTokens, ComponentState currState) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(slider);
        RadianceComponentShaper.ShapeSupplier shapeSupplier = componentShaper.getSliderThumbUniformShapeSupplier();

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, dimension, dimension,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                float outlineInset = outlinePainter.getOutlineInset(
                    RadianceOutlinePainter.InsetKind.SURFACE);
                SurfacePainterUtils.paintSurface(graphics1X, slider, currState,
                    RadianceCoreUtilities.getSurfacePainter(slider),
                    scaledWidth, scaledHeight, scaleFactor, 1.0f,
                    shapeSupplier.getShape(slider, scaledWidth + 1.0f, scaledHeight + 1.0f,
                        outlineInset, 0.0f, scaleFactor),
                    colorTokens, sliderIconSurfaceStateAlpha);

                OutlinePainterUtils.paintOutline(graphics1X, slider, currState,
                    RadianceCoreUtilities.getOutlinePainter(slider),
                    scaledWidth, scaledHeight, scaleFactor, 1.0f,
                    shapeSupplier, colorTokens, sliderIconOutlineStateAlpha);
            });
        graphics.dispose();
    }

    private static RadianceOutlinePainter treeIconOutlinePainter = new FractionBasedOutlinePainter(
        "Tree icon",
        new float[] {0.0f, 1.0f},
        new ContainerColorTokensSingleColorQuery[]{
            ContainerColorTokens::getOnContainer,
            ContainerColorTokens::getOnContainer});
    private static RadianceSurfacePainter treeIconSurfacePainter = new FractionBasedSurfacePainter(
        "Tree icon",
        new float[] {0.0f, 0.5f, 1.0f},
        new ContainerColorTokensSingleColorQuery[] {
            (tokens) -> tokens.isDark() ? tokens.getContainerSurfaceHighest()
                : tokens.getContainerSurfaceLowest(),
            (tokens) -> tokens.isDark() ? tokens.getContainerSurfaceHigh()
                : tokens.getContainerSurfaceLow(),
            ContainerColorTokens::getContainerSurface});

    public static void drawTreeIcon(Graphics2D g, JTree tree, ComponentState state, int size,
        ContainerColorTokens colorTokens, boolean isCollapsed) {

        RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(tree);

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, size, size,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {

                Shape outline = componentShaper.getTreeIconShapeSupplier().getShape(tree,
                    scaledWidth - 1, scaledHeight - 1, 0.0f, 0.0f, scaleFactor);

                SurfacePainterUtils.paintSurface(graphics1X, tree, state,
                    treeIconSurfacePainter, scaledWidth - 1, scaledHeight - 1, scaleFactor,
                    1.0f, outline, colorTokens, null);

                OutlinePainterUtils.paintOutline(graphics1X, tree, state,
                    treeIconOutlinePainter, scaledWidth - 2, scaledHeight - 2, scaleFactor,
                    1.0f, componentShaper.getTreeIconShapeSupplier(), colorTokens, null);

                Color signColor = colorTokens.getOnContainer();
                graphics1X.setColor(signColor);
                float halfLength = scaledWidth * 0.3f;
                float mid = scaledWidth / 2.0f - 0.5f;

                // Horizontal stroke
                graphics1X.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                graphics1X.draw(new Line2D.Float(mid - halfLength, mid, mid + halfLength, mid));
                if (isCollapsed) {
                    // Vertical stroke
                    graphics1X.draw(new Line2D.Float(mid, mid - halfLength, mid, mid + halfLength));
                }
            });
        graphics.dispose();
    }

    public static void drawCloseIcon(Graphics2D g, int iconSize,
            float primaryStrokeWidth, ContainerColorTokens colorTokens, float alpha) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        int start = iconSize / 4;
        int end = iconSize - start;

        Color primaryColor = colorTokens.getOnContainer();
        Color secondaryColor = colorTokens.getComplementaryOnContainer();

        Stroke secondaryStroke = new BasicStroke(2.5f * primaryStrokeWidth,
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f * alpha));
        graphics.setStroke(secondaryStroke);
        graphics.setColor(secondaryColor);
        graphics.drawLine(start, start, end, end);
        graphics.drawLine(start, end, end, start);

        Stroke primaryStroke = new BasicStroke(primaryStrokeWidth,
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        graphics.setStroke(primaryStroke);
        graphics.setColor(primaryColor);
        graphics.drawLine(start, start, end, end);
        graphics.drawLine(start, end, end, start);

        graphics.dispose();
    }

    public static void drawIconifyIcon(Graphics2D g, int iconSize,
            ContainerColorTokens colorTokens, float alpha) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        int start = iconSize / 4 - 2;
        int end = 3 * iconSize / 4;
        int size = end - start - 2;

        Color primaryColor = colorTokens.getOnContainer();
        Color secondaryColor = colorTokens.getComplementaryOnContainer();

        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f * alpha));
        graphics.setColor(secondaryColor);
        graphics.fillRect(start + 1, end - 2, size + 2, 5);

        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        graphics.setColor(primaryColor);
        graphics.fillRect(start + 2, end - 1, size, 3);
        graphics.dispose();
    }

    public static void drawMaximizeIcon(Graphics2D g, int iconSize,
            ContainerColorTokens colorTokens, float alpha) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        int start = iconSize / 4 - 1;
        int end = iconSize - start;

        Color primaryColor = colorTokens.getOnContainer();
        Color secondaryColor = colorTokens.getComplementaryOnContainer();

        double offset = 1.0 / RadianceCommonCortex.getScaleFactor(null);
        Stroke secondaryStroke = new BasicStroke(3.0f,
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f * alpha));
        graphics.setStroke(secondaryStroke);
        graphics.setColor(secondaryColor);
        Path2D secondary = new Path2D.Double();
        secondary.moveTo(start, start);
        // top first
        secondary.lineTo(end - offset, start);
        secondary.lineTo(end - offset, start + 1);
        // top second (for a thicker overall top line)
        secondary.lineTo(start, start + 1);
        // left
        secondary.lineTo(start, end - offset);
        // bottom
        secondary.lineTo(end - offset, end - offset);
        // right
        secondary.lineTo(end - offset, start + 1);
        graphics.draw(secondary);

        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
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
            ContainerColorTokens colorTokens, float alpha) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        int start = iconSize / 4 - 1;
        int end = iconSize - start;
        int smallSquareSize = end - start - 3;

        // "Main" rectangle
        int mainStartX = start;
        int mainEndX = mainStartX + smallSquareSize;
        int mainStartY = end - smallSquareSize;
        int mainEndY = mainStartY + smallSquareSize;

        // "Secondary rectangle"
        int secondaryStartX = mainStartX + 3;
        int secondaryEndX = secondaryStartX + smallSquareSize;
        int secondaryStartY = mainStartY - 3;
        int secondaryEndY = secondaryStartY + smallSquareSize;

        Color primaryColor = colorTokens.getOnContainer();
        Color secondaryColor = colorTokens.getComplementaryOnContainer();

        double offset = 1.0 / RadianceCommonCortex.getScaleFactor(null);
        Stroke secondaryStroke = new BasicStroke(3.0f,
            BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f * alpha));
        graphics.setStroke(secondaryStroke);
        graphics.setColor(secondaryColor);
        Path2D secondary = new Path2D.Double();
        secondary.moveTo(mainStartX, mainStartY);
        // top first
        secondary.lineTo(mainEndX - offset, mainStartY);
        secondary.lineTo(mainEndX - offset, mainStartY + 1);
        // top second (for a thicker overall top line)
        secondary.lineTo(mainStartX, mainStartY + 1);
        // left
        secondary.lineTo(mainStartX, mainEndY - offset);
        // bottom
        secondary.lineTo(mainEndX - offset, mainEndY - offset);
        // right
        secondary.lineTo(mainEndX - offset, mainStartY + 1);

        // top (thicker)
        secondary.moveTo(secondaryEndX - offset, secondaryStartY);
        secondary.lineTo(secondaryStartX, secondaryStartY);
        secondary.lineTo(secondaryStartX, secondaryStartY + 1);
        secondary.lineTo(secondaryEndX - offset, secondaryStartY + 1);
        // right
        secondary.lineTo(secondaryEndX - offset, secondaryEndY);
        // bottom (partial)
        secondary.lineTo(secondaryEndX - offset - 2, secondaryEndY);

        graphics.draw(secondary);

        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        graphics.setColor(primaryColor);

        // top (thicker)
        graphics.fillRect(mainStartX, mainStartY, smallSquareSize, 2);
        // left
        graphics.fillRect(mainStartX, mainStartY, 1, smallSquareSize);
        // right
        graphics.fillRect(mainStartX + smallSquareSize - 1, mainStartY, 1, smallSquareSize);
        // bottom
        graphics.fillRect(mainStartX, mainStartY + smallSquareSize - 1, smallSquareSize, 1);

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
        RadianceComponentShaper.ShapeSupplier splitDividerBumpShapeSupplier,
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

                float onContainerSurfaceAlpha = state.isDisabled()
                    ? colorTokens.getOnContainerDisabledAlpha()
                    : colorTokens.getOnContainerEnabledAlpha();
                float containerOutlineAlpha = state.isDisabled()
                    ? colorTokens.getContainerOutlineDisabledAlpha()
                    : colorTokens.getContainerOutlineEnabledAlpha();

                AlphaComposite onContainerComposite = getAlphaComposite(onContainerSurfaceAlpha);
                AlphaComposite containerOutlineComposite = getAlphaComposite(containerOutlineAlpha);

                Shape inner = splitDividerBumpShapeSupplier.getShape(divider,
                    bumpDotDiameter, bumpDotDiameter, 1.0f, 0.0f, scaleFactor);
                Shape outer = splitDividerBumpShapeSupplier.getShape(divider,
                    bumpDotDiameter, bumpDotDiameter, 0.0f, 0.0f, scaleFactor);
                for (int col = 0; col < bumpColumns; col++) {
                    int cx = bumpColOffset + col * bumpCellSize;
                    for (int row = 0; row < bumpRows; row++) {
                        int cy = bumpRowOffset + row * bumpCellSize + (bumpCellSize - bumpDotDiameter) / 2;

                        graphics1X.translate(cx, cy);

                        graphics1X.setComposite(onContainerComposite);
                        graphics1X.setColor(colorTokens.getMarkerOnContainer());
                        graphics1X.fill(inner);

                        graphics1X.setComposite(containerOutlineComposite);
                        graphics1X.setColor(colorTokens.getComplementaryMarkerOnContainer());
                        graphics1X.draw(outer);

                        graphics1X.translate(-cx, -cy);
                    }
                }
            });
        graphics.dispose();
    }
}
