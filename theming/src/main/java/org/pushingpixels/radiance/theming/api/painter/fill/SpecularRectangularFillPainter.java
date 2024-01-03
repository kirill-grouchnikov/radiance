/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.*;

/**
 * Fill painter that draws visuals with subtle 3D gradient appearance. This class is part of
 * officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class SpecularRectangularFillPainter implements RadianceFillPainter {
    // Scale factor for the emulated shine. We compute a smaller, "shrunk down" version of the
    // shine and then draw it back by stretching it along both axes. The visuals don't have to
    // be pixel perfect, and this helps with the runtime performance.
    private static int SCALE = 2;

    private RadianceFillPainter baseFillPainter;
    private float alpha;

    public SpecularRectangularFillPainter(RadianceFillPainter baseFillPainter, float alpha) {
        this.baseFillPainter = baseFillPainter;
        this.alpha = alpha;
    }

    @Override
    public String getDisplayName() {
        return "Specular Rectangular " + this.baseFillPainter.getDisplayName();
    }

    @Override
    public Color getRepresentativeColor(RadianceColorScheme fillScheme) {
        return this.baseFillPainter.getRepresentativeColor(fillScheme);
    }

    private double spline(double startY, double control1Y, double control2Y, double endY, double t) {
        // https://en.wikipedia.org/wiki/B%C3%A9zier_curve
        double invT = 1.0 - t;
        return startY * invT * invT * invT + control1Y * 3.0 * t * invT * invT +
                control2Y * 3.0 * t * t * invT + endY * t * t * t;
    }

    @Override
    public void paintContourBackground(Graphics g, Component comp, float width, float height,
            Shape contour, RadianceColorScheme fillScheme) {
        this.baseFillPainter.paintContourBackground(g, comp, width, height, contour,
                fillScheme);

        int iw = (int) width;
        int ih = (int) height;

        int shineWidth = iw / SCALE;
        int shineHeight = ih / (2 * SCALE);

        if ((shineWidth > 0) && (shineHeight > 0)) {
            BufferedImage shineImage = getShineImage(comp, contour,
                    RadianceColorUtilities.getTopShineColor(fillScheme),
                    RadianceColorUtilities.getBottomShineColor(fillScheme),
                    this.alpha, shineWidth, shineHeight);

            Graphics2D graphics = (Graphics2D) g.create();

            // Set rendering hints to favor speed over quality, since the visuals of the emulated
            // shine spot are subtle and don't have to be pixel perfect
            graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
            graphics.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION,
                    RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED);
            graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
            graphics.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING,
                    RenderingHints.VALUE_COLOR_RENDER_SPEED);

            graphics.clip(contour);
            graphics.drawImage(shineImage, 0, 0, iw, ih / 2, 0, 0,
                    shineImage.getWidth(), shineImage.getHeight(), null);

            graphics.dispose();
        }
    }

    /**
     * This class is based on Romain Guy's work from
     * http://www.jroller.com/gfx/entry/new_blendings_modes_for_java2d available
     * under BSD license.
     */
    private final class ShineContext implements CompositeContext {
        private Shine shine;
        private float alpha;

        public ShineContext(Shine shine, float alpha) {
            this.shine = shine;
            this.alpha = alpha;
        }

        @Override
        public void dispose() {
        }

        public void compose(Raster src, Raster dstIn, WritableRaster dstOut) {
            if (src.getSampleModel().getDataType() != DataBuffer.TYPE_INT
                    || dstIn.getSampleModel().getDataType() != DataBuffer.TYPE_INT
                    || dstOut.getSampleModel().getDataType() != DataBuffer.TYPE_INT) {
                throw new IllegalStateException("Source and destination must store pixels as INT.");
            }

            int shineWidth = Math.min(src.getWidth(), dstIn.getWidth());
            int shineHeight = Math.min(src.getHeight(), dstIn.getHeight());

            double gap = 0.5 * RadianceCommonCortex.getScaleFactor(this.shine.comp) / SCALE;
            double ramp = 2 * RadianceCommonCortex.getScaleFactor(this.shine.comp) / SCALE;

            double topLeftCornerRadius = 0;
            double topRightCornerRadius = 0;
            if (this.shine.contour instanceof RoundRectangle2D) {
                // This matches the logic in RadianceOutlineUtilities.getBaseOutline
                RoundRectangle2D rrContour = (RoundRectangle2D) this.shine.contour;
                topLeftCornerRadius = rrContour.getArcWidth() / (2.0 * SCALE);
                topRightCornerRadius = rrContour.getArcWidth() / (2.0 * SCALE);
            } else if (this.shine.contour instanceof Ellipse2D) {
                // This matches the logic in BladeIconUtils.drawRadioButton
                Ellipse2D ellContour = (Ellipse2D) this.shine.contour;
                topLeftCornerRadius = ellContour.getWidth() / (2.0 * SCALE);
                topRightCornerRadius = ellContour.getWidth() / (2.0 * SCALE);
            }

            int[] dstPixels = new int[shineWidth];
            for (int row = 0; row < shineHeight; row++) {
                if (row <= gap) {
                    // Leading vertical gap
                    for (int col = 0; col < shineWidth; col++) {
                        dstPixels[col] = 0x00000000;
                    }
                } else {
                    // Get the interpolated shine color for this row
                    int rowColor = RadianceColorUtilities.getInterpolatedRGB(
                            this.shine.topShineColor, this.shine.bottomShineColor,
                            1.0 - (double) row / (double) shineHeight);
                    int rowAlpha = (rowColor >>> 24) & 0xFF;
                    int rowRed = (rowColor >>> 16) & 0xFF;
                    int rowGreen = (rowColor >>> 8) & 0xFF;
                    int rowBlue = (rowColor >>> 0) & 0xFF;

                    // Compute the y-based alpha for all the pixels in this row
                    double yalpha;
                    if (row <= (gap + ramp)) {
                        // Quick ramp-up
                        double cfraction = (row - gap) / ramp;
                        yalpha = spline(0.0, 0.1, 0.9, 1.0, cfraction);
                    } else {
                        // slower ramp-down
                        double cfraction = (row - gap - ramp) / (shineHeight - gap - ramp);
                        yalpha = spline(0.0, 0.1, 0.9, 1.0, 1.0 - cfraction);
                    }

                    // For each column in this row, compute its x-based alpha
                    for (int col = 0; col < shineWidth; col++) {
                        // x-alpha is based on the distance from left / right edges
                        double xalpha = 1.0;
                        if (col <= shineWidth / 2) {
                            // closer to the left edge
                            double overlayXStart = gap;
                            if ((topLeftCornerRadius > 0.0) && (row <= (gap + topLeftCornerRadius))) {
                                // We are within the vertical span of the top-left corner
                                double dy = gap + topLeftCornerRadius - row;
                                double dx = Math.sqrt(topLeftCornerRadius * topLeftCornerRadius - dy * dy);
                                overlayXStart = gap + topLeftCornerRadius - dx;
                            }
                            if (col <= overlayXStart) {
                                // leading horizontal gap
                                xalpha = 0.0;
                            } else if (col <= (overlayXStart + ramp)) {
                                // ramp-up to full alpha horizontally
                                double cfraction = (overlayXStart + ramp - col) / ramp;
                                xalpha = spline(0.0, 0.1, 0.9, 1.0, 1.0 - cfraction);
                            }
                        } else {
                            // closer to the right edge
                            double overlayXEnd = shineWidth - gap - 1;
                            if ((topRightCornerRadius > 0.0) && (row <= (gap + topRightCornerRadius))) {
                                // We are within the vertical span of the top-right corner
                                double dy = gap + topRightCornerRadius - row;
                                double dx = Math.sqrt(topRightCornerRadius * topRightCornerRadius - dy * dy);
                                overlayXEnd = shineWidth - gap - 1 - topRightCornerRadius + dx;
                            }
                            if (col > overlayXEnd) {
                                // trailing horizontal gap
                                xalpha = 0.0;
                            } else if (col > (overlayXEnd - ramp)) {
                                // ramp-down to zero alpha horizontally
                                double cfraction = (col - (overlayXEnd - ramp)) / ramp;
                                xalpha = spline(0.0, 0.1, 0.9, 1.0, 1.0 - cfraction);
                            }
                        }

                        int falpha = (int) (0.9 * this.alpha * rowAlpha * xalpha * yalpha);
                        if (falpha < 0) {
                            falpha = 0;
                        }
                        if (falpha > 255) {
                            falpha = 255;
                        }
                        dstPixels[col] = (falpha << 24) | rowRed << 16 | rowGreen << 8 | rowBlue;
                    }
                }

                dstOut.setDataElements(0, row, shineWidth, 1, dstPixels);
            }
        }
    }

    private class Shine implements Composite {
        private Component comp;
        private Shape contour;
        private Color topShineColor;
        private Color bottomShineColor;
        private float alpha;

        public Shine(Component comp, Shape contour, Color topShineColor, Color bottomShineColor,
                float alpha) {
            this.comp = comp;
            this.contour = contour;
            this.topShineColor = topShineColor;
            this.bottomShineColor = bottomShineColor;
            this.alpha = alpha;
        }

        @Override
        public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel,
                RenderingHints hints) {
            return new ShineContext(this, alpha);
        }
    }

    private BufferedImage getShineImage(Component comp, Shape contour,
            Color topShineColor, Color bottomShineColor, float alpha,
            int shineWidth, int shineHeight) {
        // Important - do not use GraphicsConfiguration.createCompatibleImage(.., .., Transparency.TRANSLUCENT)
        // as that results in color artifacts during explicit manipulation of underlying raster
        // data
        BufferedImage shineImage = new BufferedImage(shineWidth, shineHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = shineImage.createGraphics();

        g2d.setComposite(new Shine(comp, contour, topShineColor, bottomShineColor, alpha));

        g2d.fillRect(0, 0, shineWidth, shineHeight);
        g2d.dispose();

        return shineImage;
    }
}
