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
package org.pushingpixels.radiance.theming.api.painter.surface;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.*;

/**
 * Surface painter that draws visuals that emulate a 3D glass object lit from straight above. This
 * class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class LuminousSurfacePainter implements RadianceSurfacePainter {
    // Scale factor for the emulated diffusion and reflection. We compute a smaller, "shrunk down"
    // version of it and then draw it back by stretching it along both axes. The visuals don't have
    // to be pixel perfect, and this helps with the runtime performance.
    private static int SCALE = 2;

    private RadianceSurfacePainter baseSurfacePainter;
    private float alpha;
    private ContainerColorTokensSingleColorQuery lightSourceQuery;

    public LuminousSurfacePainter() {
        this(new MatteSurfacePainter(),
            (colorTokens) -> colorTokens.isDark()
                ? colorTokens.getContainerSurfaceHighest()
                : colorTokens.getContainerSurfaceLowest(),
            1.0f);
    }

    public LuminousSurfacePainter(RadianceSurfacePainter baseSurfacePainter,
        ContainerColorTokensSingleColorQuery lightSourceQuery, float alpha) {
        this.baseSurfacePainter = baseSurfacePainter;
        this.lightSourceQuery = lightSourceQuery;
        this.alpha = alpha;
    }

    @Override
    public String getDisplayName() {
        return "Luminous";
    }

    private double spline(double startY, double control1Y, double control2Y, double endY, double t) {
        // https://en.wikipedia.org/wiki/B%C3%A9zier_curve
        double invT = 1.0 - t;
        return startY * invT * invT * invT + control1Y * 3.0 * t * invT * invT +
                control2Y * 3.0 * t * t * invT + endY * t * t * t;
    }

    @Override
    public void paintSurface(Graphics g, Component comp, float width, float height,
        Shape outline, ContainerColorTokens colorTokens) {

        this.baseSurfacePainter.paintSurface(g, comp, width, height, outline, colorTokens);

        int iw = (int) width;
        int ih = (int) height;

        int shineWidth = iw / SCALE;
        int shineHeight = ih / (2 * SCALE);

        if ((shineWidth > 0) && (shineHeight > 0)) {
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

            graphics.clip(outline);

            // This part emulates the light hitting the top edge of the shape and diffusing
            // downwards into it
            BufferedImage topShineImage = getTopShineImage(outline,
                this.lightSourceQuery.query(colorTokens),
                this.alpha, shineWidth, shineHeight);
            graphics.drawImage(topShineImage, 0, 0, iw, ih / 2, 0, 0,
                topShineImage.getWidth(), topShineImage.getHeight(), null);

            // This part emulates the light bouncing off of the bottom edge of the shape
            // and upwards back into it
            BufferedImage bottomShineImage = getBottomShineImage(outline,
                this.lightSourceQuery.query(colorTokens),
                this.alpha, shineWidth, shineHeight);
            graphics.drawImage(bottomShineImage, 0, ih / 2, iw, ih, 0, 0,
                bottomShineImage.getWidth(), bottomShineImage.getHeight(), null);

            graphics.dispose();
        }
    }

    /**
     * This class is based on Romain Guy's work from
     * http://www.jroller.com/gfx/entry/new_blendings_modes_for_java2d available
     * under BSD license.
     */
    private final class BottomShineContext implements CompositeContext {
        private BottomShine bottomShine;
        private float alpha;

        public BottomShineContext(BottomShine bottomShine, float alpha) {
            this.bottomShine = bottomShine;
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

            double bottomLeftCornerRadius = 0;
            double bottomRightCornerRadius = 0;
            if (this.bottomShine.outline instanceof RoundRectangle2D) {
                // This matches the logic in RadianceOutlineUtilities.getBaseOutline
                RoundRectangle2D rrOutline = (RoundRectangle2D) this.bottomShine.outline;
                bottomLeftCornerRadius = rrOutline.getArcWidth() / (2.0 * SCALE);
                bottomRightCornerRadius = rrOutline.getArcWidth() / (2.0 * SCALE);
            } else if (this.bottomShine.outline instanceof Ellipse2D) {
                // This matches the logic in BladeIconUtils.drawRadioButton
                Ellipse2D ellOutline = (Ellipse2D) this.bottomShine.outline;
                bottomLeftCornerRadius = ellOutline.getWidth() / (2.0 * SCALE);
                bottomRightCornerRadius = ellOutline.getWidth() / (2.0 * SCALE);
            }

            int[] dstPixels = new int[shineWidth];
            for (int row = 0; row < shineHeight; row++) {
                // Get the interpolated shine color for this row
                int rowColor = this.bottomShine.lightColor.getRGB();
                int rowAlpha = (rowColor >>> 24) & 0xFF;
                int rowRed = (rowColor >>> 16) & 0xFF;
                int rowGreen = (rowColor >>> 8) & 0xFF;
                int rowBlue = (rowColor >>> 0) & 0xFF;

                // Compute the y-based alpha for all the pixels in this row
                // ramp-down from the bottom to the top
                double yfraction = (double) row / (double) shineHeight;
                double yalpha = spline(0.0, 0.1, 0.9, 1.0, yfraction);

                double rowFactor = (double) (shineHeight - row) / (double) shineHeight;

                // For each column in this row, compute its x-based alpha
                for (int col = 0; col < shineWidth; col++) {
                    // x-alpha is based on the distance from left / right edges
                    double xalpha = 1.0;
                    int invertedRow = shineHeight - row;
                    if (col <= shineWidth / 2) {
                        // We are closer to the left edge

                        // Compute max gap and ramp based on the corner radius of the bottom
                        // left corner
                        double maxGap = Math.floor(bottomLeftCornerRadius / (SCALE * 1.75f));
                        double maxRamp = Math.ceil(bottomLeftCornerRadius / (SCALE * 0.6f));
                        // Gap - max at the top row, zero at the bottom row
                        double gap = maxGap * rowFactor;
                        // Ramp - max at the top row, smaller at the bottom row
                        double ramp = maxRamp * 0.5f * (1.0 + rowFactor);

                        double overlayXStart = gap;
                        if ((bottomLeftCornerRadius > 0.0) && (invertedRow <= (gap + bottomLeftCornerRadius))) {
                            // We are within the vertical span of the top-left corner
                            double dy = gap + bottomLeftCornerRadius - invertedRow;
                            double dx = Math.sqrt(bottomLeftCornerRadius * bottomLeftCornerRadius - dy * dy);
                            overlayXStart = gap + bottomLeftCornerRadius - dx;
                        }
                        if (col < overlayXStart) {
                            // leading horizontal gap
                            xalpha = 0.0;
                        } else if (col < (overlayXStart + ramp)) {
                            // ramp-up to full alpha horizontally
                            double cfraction = (col - overlayXStart - gap) / ramp;
                            xalpha = spline(0.0, 0.1, 0.9, 1.0, cfraction);
                        }
                    } else {
                        // closer to the right edge

                        // Compute max gap and ramp based on the corner radius of the bottom
                        // right corner
                        double maxGap = Math.floor(bottomRightCornerRadius / (SCALE * 1.75f));
                        double maxRamp = Math.ceil(bottomRightCornerRadius / (SCALE * 0.6f));
                        // Gap - max at the top row, zero at the bottom row
                        double gap = maxGap * rowFactor;
                        // Ramp - max at the top row, smaller at the bottom row
                        double ramp = maxRamp * 0.5f * (1.0 + rowFactor);

                        double overlayXEnd = shineWidth - gap - 1;
                        if ((bottomRightCornerRadius > 0.0) && (invertedRow <= (gap + bottomRightCornerRadius))) {
                            // We are within the vertical span of the top-right corner
                            double dy = gap + bottomRightCornerRadius - invertedRow;
                            double dx = Math.sqrt(bottomRightCornerRadius * bottomRightCornerRadius - dy * dy);
                            overlayXEnd = shineWidth - gap - 1 - bottomRightCornerRadius + dx;
                        }
                        if (col >= overlayXEnd) {
                            // trailing horizontal gap
                            xalpha = 0.0;
                        } else if (col >= (overlayXEnd - ramp)) {
                            // ramp-down to zero alpha horizontally
                            double cfraction = (col - (overlayXEnd - gap - ramp)) / ramp;
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

                dstOut.setDataElements(0, row, shineWidth, 1, dstPixels);
            }
        }
    }

    /**
     * This class is based on Romain Guy's work from
     * http://www.jroller.com/gfx/entry/new_blendings_modes_for_java2d available
     * under BSD license.
     */
    private final class TopShineContext implements CompositeContext {
        private TopShine topShine;
        private float alpha;

        public TopShineContext(TopShine bottomShine, float alpha) {
            this.topShine = bottomShine;
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

            double ramp = shineHeight / 3.5;

            double topLeftCornerRadius = 0;
            double topRightCornerRadius = 0;
            if (this.topShine.outline instanceof RoundRectangle2D) {
                // This matches the logic in RadianceOutlineUtilities.getBaseOutline
                RoundRectangle2D rrOutline = (RoundRectangle2D) this.topShine.outline;
                topLeftCornerRadius = rrOutline.getArcWidth() / (2.0 * SCALE);
                topRightCornerRadius = rrOutline.getArcWidth() / (2.0 * SCALE);
            } else if (this.topShine.outline instanceof Ellipse2D) {
                // This matches the logic in BladeIconUtils.drawRadioButton
                Ellipse2D ellOutline = (Ellipse2D) this.topShine.outline;
                topLeftCornerRadius = ellOutline.getWidth() / (2.0 * SCALE);
                topRightCornerRadius = ellOutline.getWidth() / (2.0 * SCALE);
            }

            int[] dstPixels = new int[shineWidth];
            for (int row = 0; row < shineHeight; row++) {

                // For each column in this row, compute its x-based alpha
                for (int col = 0; col < shineWidth; col++) {
                    double verticalDistanceFromTop = row;
                    if (topLeftCornerRadius > 0.0f) {
                        if ((row <= topLeftCornerRadius) && (col <= topLeftCornerRadius)) {
                            // We are in the quarter-circle of the top left part of the shape.
                            // Compute the vertical distance from this point upwards towards
                            // the shape's top left curved corner. This will determine how much
                            // diffusion we get.
                            double rowOfOutline =
                                topLeftCornerRadius - Math.sqrt(topLeftCornerRadius * topLeftCornerRadius -
                                    (topLeftCornerRadius - col) * (topLeftCornerRadius - col));
                            verticalDistanceFromTop = Math.max(0.0, row - rowOfOutline);
                        }
                    }
                    if (topRightCornerRadius > 0.0f) {
                        if ((row <= topRightCornerRadius) && (col >= (shineWidth - topRightCornerRadius))) {
                            // We are in the quarter-circle of the top right part of the shape
                            // Compute the vertical distance from this point upwards towards
                            // the shape's top right curved corner. This will determine how much
                            // diffusion we get.
                            double rowOfOutline =
                                topRightCornerRadius - Math.sqrt(topRightCornerRadius * topRightCornerRadius -
                                    (col - (shineWidth - 1 - topRightCornerRadius)) *
                                        (col - (shineWidth - 1 - topRightCornerRadius)));
                            verticalDistanceFromTop = Math.max(0.0, row - rowOfOutline);
                        }
                    }

                    if (verticalDistanceFromTop >= ramp) {
                        // Too far from the top of the outline
                        dstPixels[col] = 0x00000000;
                    } else {
                        int rowColor = this.topShine.lightColor.getRGB();
                        int rowAlpha = (rowColor >>> 24) & 0xFF;
                        int rowRed = (rowColor >>> 16) & 0xFF;
                        int rowGreen = (rowColor >>> 8) & 0xFF;
                        int rowBlue = (rowColor >>> 0) & 0xFF;

                        double cfraction = 1.0 - verticalDistanceFromTop / ramp;
                        int falpha =
                            (int) (0.9 * this.alpha * rowAlpha * cfraction);
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

    private class BottomShine implements Composite {
        private Shape outline;
        private Color lightColor;
        private float alpha;

        public BottomShine(Shape outline, Color lightColor, float alpha) {
            this.outline = outline;
            this.lightColor = lightColor;
            this.alpha = alpha;
        }

        @Override
        public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel,
            RenderingHints hints) {
            return new BottomShineContext(this, alpha);
        }
    }

    private class TopShine implements Composite {
        private Shape outline;
        private Color lightColor;
        private float alpha;

        public TopShine(Shape outline, Color lightColor, float alpha) {
            this.outline = outline;
            this.lightColor = lightColor;
            this.alpha = alpha;
        }

        @Override
        public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel,
            RenderingHints hints) {
            return new TopShineContext(this, alpha);
        }
    }

    private BufferedImage getBottomShineImage(Shape outline, Color lightColor, float alpha,
        int shineWidth, int shineHeight) {
        // Important - do not use GraphicsConfiguration.createCompatibleImage(.., .., Transparency.TRANSLUCENT)
        // as that results in color artifacts during explicit manipulation of underlying raster
        // data
        BufferedImage shineImage = new BufferedImage(shineWidth, shineHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = shineImage.createGraphics();

        g2d.setComposite(new BottomShine(outline, lightColor, alpha));

        g2d.fillRect(0, 0, shineWidth, shineHeight);
        g2d.dispose();

        return shineImage;
    }

    private BufferedImage getTopShineImage(Shape outline, Color lightColor, float alpha,
        int shineWidth, int shineHeight) {
        // Important - do not use GraphicsConfiguration.createCompatibleImage(.., .., Transparency.TRANSLUCENT)
        // as that results in color artifacts during explicit manipulation of underlying raster
        // data
        BufferedImage shineImage = new BufferedImage(shineWidth, shineHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = shineImage.createGraphics();

        g2d.setComposite(new TopShine(outline, lightColor, alpha));

        g2d.fillRect(0, 0, shineWidth, shineHeight);
        g2d.dispose();

        return shineImage;
    }
}
