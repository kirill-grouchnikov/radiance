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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.common.internal.contrib.flatlaf.HiDPIUtils;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.utils.RadianceImageCreator;
import org.pushingpixels.radiance.theming.internal.utils.RadianceOutlineUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

public class BladeIconUtils {
    public static void drawCheckBox(Graphics2D g, AbstractButton button, RadianceFillPainter fillPainter,
            RadianceBorderPainter borderPainter, int dimension, ComponentState componentState,
            RadianceColorScheme fillColorScheme, RadianceColorScheme markColorScheme,
            RadianceColorScheme borderColorScheme, float checkMarkVisibility,
            boolean isCheckMarkFadingOut, float alpha) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, dimension, dimension,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    float cornerRadius = (float) scaleFactor *
                            RadianceSizeUtils.getClassicButtonCornerRadius(RadianceSizeUtils.getComponentFontSize(button));

                    int contourDim = scaledWidth - 1;
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(
                            contourDim, contourDim,
                            cornerRadius, null, 0.0f);

                    RadianceFillPainter finalFillPainter = componentState.isActive() ? fillPainter
                            : RadianceImageCreator.SimplisticSoftBorderReverseFillPainter.INSTANCE;
                    graphics1X.setComposite(getAlphaComposite(alpha));
                    Graphics2D clipped = (Graphics2D) graphics1X.create();
                    clipped.clip(contour);
                    finalFillPainter.paintContourBackground(clipped, button,
                            contourDim, contourDim,
                            contour, false,
                            fillColorScheme, true);
                    clipped.dispose();

                    Shape contourInner = borderPainter.isPaintingInnerContour() ?
                            RadianceOutlineUtilities.getBaseOutline(
                                    contourDim, contourDim, cornerRadius, null, 1.0f)
                            : null;
                    borderPainter.paintBorder(graphics1X, button, contourDim, contourDim,
                            contour, contourInner, borderColorScheme);

                    float finalCheckMarkVisibility = isCheckMarkFadingOut && (checkMarkVisibility > 0.0f) ?
                            1.0f : checkMarkVisibility;
                    if (finalCheckMarkVisibility > 0.0) {
                        Graphics2D graphicsForCheckMark = (Graphics2D) graphics1X.create();
                        if (isCheckMarkFadingOut) {
                            graphicsForCheckMark.setComposite(getAlphaComposite(alpha * checkMarkVisibility));
                        }

                        drawCheckMarkAtScale1X(graphicsForCheckMark, scaledWidth, markColorScheme,
                                checkMarkVisibility);

                        graphicsForCheckMark.dispose();
                    }
                });
    }

    private static void drawCheckMarkAtScale1X(Graphics2D graphics1X, int dimension,
            RadianceColorScheme scheme, float checkMarkVisibility) {
        // create straight checkbox path
        GeneralPath path = new GeneralPath();
        path.moveTo(0.25f * dimension, 0.47f * dimension);
        path.lineTo(0.48f * dimension, 0.72f * dimension);
        path.lineTo(0.76f * dimension, 0.27f * dimension);

        // compute the x-based clip for the visibility
        float xClipStart = 0.15f * dimension;
        float xClipEnd = 0.95f * dimension;
        float xClipRealEnd = xClipStart + (xClipEnd - xClipStart) * checkMarkVisibility;

        Graphics2D clipped = (Graphics2D) graphics1X.create();
        clipped.setClip(0, 0, (int) Math.ceil(xClipRealEnd), dimension);

        clipped.setColor(scheme.getMarkColor());
        Stroke stroke = new BasicStroke((float) 0.15 * dimension, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND);
        clipped.setStroke(stroke);
        clipped.draw(path);
        clipped.dispose();
    }

    public static void drawRadioButton(Graphics2D g, AbstractButton button, RadianceFillPainter fillPainter,
            RadianceBorderPainter borderPainter, int dimension, ComponentState componentState,
            RadianceColorScheme fillColorScheme, RadianceColorScheme markColorScheme,
            RadianceColorScheme borderColorScheme, float checkMarkVisibility,
            float alpha) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, dimension, dimension,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    int contourDim = scaledWidth;
                    Shape contour = new Ellipse2D.Float(0.0f, 0.0f, contourDim, contourDim);

                    RadianceFillPainter finalFillPainter = componentState.isActive() ? fillPainter
                            : RadianceImageCreator.SimplisticSoftBorderReverseFillPainter.INSTANCE;
                    graphics1X.setComposite(getAlphaComposite(alpha));
                    Graphics2D clipped = (Graphics2D) graphics1X.create();
                    clipped.clip(contour);
                    finalFillPainter.paintContourBackground(clipped, button,
                            contourDim, contourDim,
                            contour, false,
                            fillColorScheme, true);
                    clipped.dispose();

                    Shape contourInner = borderPainter.isPaintingInnerContour() ?
                            new Ellipse2D.Float(1.0f, 1.0f, contourDim - 2.0f, contourDim - 2.0f)
                            : null;
                    borderPainter.paintBorder(graphics1X, button, contourDim, contourDim,
                            contour, contourInner, borderColorScheme);

                    float rc = contourDim / 2.0f + 0.5f;
                    float radius = contourDim / 4.5f;
                    Shape markOval = new Ellipse2D.Double(rc - radius, rc - radius, 2 * radius, 2 * radius);
                    Graphics2D graphicsForCheckMark = (Graphics2D) graphics1X.create();

                    if (checkMarkVisibility > 0.0) {
                        // mark
                        graphicsForCheckMark.setComposite(getAlphaComposite(alpha * checkMarkVisibility));
                        graphicsForCheckMark.setColor(markColorScheme.getMarkColor());
                    } else {
                        // draw ghost mark holder
                        graphicsForCheckMark.setComposite(getAlphaComposite(alpha * 0.3f));
                        graphicsForCheckMark.setPaint(
                                new GradientPaint(rc + radius, rc - radius, fillColorScheme.getDarkColor(),
                                        rc - radius, rc + radius, fillColorScheme.getLightColor()));
                    }
                    graphicsForCheckMark.fill(markOval);
                    graphicsForCheckMark.dispose();
                });
    }

    public static void drawSliderThumbHorizontal(Graphics2D g, JSlider slider,
            RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter,
            int width, int height, boolean isMirrored,
            RadianceColorScheme fillColorScheme,
            RadianceColorScheme borderColorScheme, float alpha) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    if (isMirrored) {
                        AffineTransform mirror = AffineTransform.getTranslateInstance(scaledWidth, scaledHeight);
                        mirror.rotate(Math.PI);
                        graphics1X.transform(mirror);
                    }

                    Shape contour = RadianceOutlineUtilities.getTriangleButtonOutline(
                            scaledWidth, scaledHeight, 2 * (float) scaleFactor, 1.0f);

                    graphics1X.setComposite(getAlphaComposite(alpha));
                    Graphics2D clipped = (Graphics2D) graphics1X.create();
                    clipped.clip(contour);
                    fillPainter.paintContourBackground(clipped, slider,
                            scaledWidth, scaledHeight,
                            contour, false,
                            fillColorScheme, true);
                    clipped.dispose();

                    Shape contourInner = RadianceOutlineUtilities.getTriangleButtonOutline(
                            scaledWidth, scaledHeight, 2 * (float) scaleFactor, 2.0f);
                    borderPainter.paintBorder(graphics1X, slider,
                            scaledWidth, scaledHeight,
                            contour, contourInner, borderColorScheme);
                });
    }


    public static void drawSliderThumbVertical(Graphics2D g, JSlider slider,
            RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter,
            int width, int height, boolean isMirrored,
            RadianceColorScheme fillColorScheme,
            RadianceColorScheme borderColorScheme, float alpha) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, height, width,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    AffineTransform at;
                    if (isMirrored) {
                        at = AffineTransform.getTranslateInstance(scaledWidth, 0);
                        at.rotate(Math.PI / 2);
                    } else {
                        at = AffineTransform.getTranslateInstance(0, scaledHeight);
                        at.rotate(-Math.PI / 2);
                    }
                    graphics1X.transform(at);
                    if (!slider.getComponentOrientation().isLeftToRight()) {
                        AffineTransform mirror = AffineTransform.getTranslateInstance(scaledWidth, scaledHeight);
                        mirror.rotate(Math.PI);
                        graphics1X.transform(mirror);
                    }

                    Shape contour = RadianceOutlineUtilities.getTriangleButtonOutline(
                            scaledWidth, scaledHeight, 2 * (float) scaleFactor, 1.0f);

                    graphics1X.setComposite(getAlphaComposite(alpha));
                    Graphics2D clipped = (Graphics2D) graphics1X.create();
                    clipped.clip(contour);
                    fillPainter.paintContourBackground(clipped, slider,
                            scaledWidth, scaledHeight,
                            contour, false,
                            fillColorScheme, true);
                    clipped.dispose();

                    Shape contourInner = RadianceOutlineUtilities.getTriangleButtonOutline(
                            scaledWidth, scaledHeight, 2 * (float) scaleFactor, 2.0f);
                    borderPainter.paintBorder(graphics1X, slider,
                            scaledWidth, scaledHeight,
                            contour, contourInner, borderColorScheme);
                });
    }

    public static void drawSliderThumbRound(Graphics2D g, JSlider slider,
            RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter,
            int dimension,
            RadianceColorScheme fillColorScheme,
            RadianceColorScheme borderColorScheme, float alpha) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, dimension, dimension,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    Shape contour = new Ellipse2D.Float(0.0f, 0.0f,
                            scaledWidth - 1.0f, scaledHeight - 1.0f);

                    graphics1X.setComposite(getAlphaComposite(alpha));
                    Graphics2D clipped = (Graphics2D) graphics1X.create();
                    clipped.clip(contour);
                    fillPainter.paintContourBackground(clipped, slider,
                            scaledWidth, scaledHeight,
                            contour, false,
                            fillColorScheme, true);
                    clipped.dispose();

                    Shape contourInner = new Ellipse2D.Float(1.0f, 1.0f,
                            scaledWidth - 3.0f, scaledHeight - 3.0f);
                    borderPainter.paintBorder(graphics1X, slider,
                            scaledWidth, scaledHeight,
                            contour, contourInner, borderColorScheme);
                });
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

}
