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
package org.pushingpixels.radiance.animation.internal.swing;

import org.pushingpixels.radiance.animation.api.interpolator.PropertyInterpolator;
import org.pushingpixels.radiance.animation.api.interpolator.PropertyInterpolatorSource;

import java.awt.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Built-in interpolators for Swing / AWT / Java2D classes.
 *
 * @author Kirill Grouchnikov
 */
public class AWTPropertyInterpolators implements PropertyInterpolatorSource {
    private Set<PropertyInterpolator<?>> interpolators;

    public AWTPropertyInterpolators() {
        this.interpolators = new HashSet<>();
        this.interpolators.add(new ColorInterpolator());
        this.interpolators.add(new PointInterpolator());
        this.interpolators.add(new RectangleInterpolator());
        this.interpolators.add(new DimensionInterpolator());
    }

    @Override
    public Set<PropertyInterpolator<?>> getPropertyInterpolators() {
        return Collections.unmodifiableSet(this.interpolators);
    }

    static class ColorInterpolator implements PropertyInterpolator<Color> {
        @Override
        public Class<Color> getBasePropertyClass() {
            return Color.class;
        }

        @Override
        public Color interpolate(Color from, Color to, float timelinePosition) {
            return getInterpolatedColor(from, to, 1.0f - timelinePosition);
        }

        int getInterpolatedRGB(Color color1, Color color2, float color1Likeness) {
            if ((color1Likeness < 0.0) || (color1Likeness > 1.0))
                throw new IllegalArgumentException(
                        "Color likeness should be in 0.0-1.0 range [is " + color1Likeness + "]");
            int alpha1 = color1.getAlpha();
            int alpha2 = color2.getAlpha();

            int r = getInterpolatedChannelValue(color1.getRed(), color2.getRed(), color1Likeness);
            int g = getInterpolatedChannelValue(color1.getGreen(), color2.getGreen(),
                    color1Likeness);
            int b = getInterpolatedChannelValue(color1.getBlue(), color2.getBlue(), color1Likeness);
            int a = (alpha1 == alpha2) ? alpha1
                    : (int) Math.round(color1Likeness * alpha1 + (1.0 - color1Likeness) * alpha2);

            return (a << 24) | (r << 16) | (g << 8) | b;
        }

        private static int getInterpolatedChannelValue(int value1, int value2,
                double value1Likeness) {
            if (value1 == value2) {
                return value1;
            }
            if (value1Likeness == 1.0f) {
                return value1;
            }
            if (value1Likeness == 0.0f) {
                return value2;
            }

            // Step 1 - convert channel from electro to optical
            double optical1 = EOCF_sRGB(value1 / 255.0f);
            double optical2 = EOCF_sRGB(value2 / 255.0f);

            // Step 2 - interpolate
            double interpolatedOptical = value1Likeness * optical1
                    + (1.0f - value1Likeness) * optical2;

            // Step 3 - convert interpolated from optical to electro
            double interpolatedElectro = OECF_sRGB(interpolatedOptical);

            // Step 4 - convert to 0..255 range
            // using some interpolation values (such as 0.29 from issue 401)
            // results in an incorrect final value without Math.round.
            int result = (int) Math.round(interpolatedElectro * 255.0f);
            if (result < 0) {
                result = 0;
            }
            if (result > 255) {
                result = 255;
            }
            return result;
        }

        // Opto-electronic conversion function for the sRGB color space
        // Takes a gamma-encoded sRGB value and converts it to a linear sRGB
        // value
        private static double OECF_sRGB(double linear) {
            // IEC 61966-2-1:1999
            return linear <= 0.0031308f ? linear * 12.92f
                    : (Math.pow(linear, 1.0f / 2.4f) * 1.055f) - 0.055f;
        }

        // Electro-optical conversion function for the sRGB color space
        // Takes a linear sRGB value and converts it to a gamma-encoded sRGB
        // value
        private static double EOCF_sRGB(double srgb) {
            // IEC 61966-2-1:1999
            return srgb <= 0.04045f ? srgb / 12.92f : Math.pow((srgb + 0.055f) / 1.055f, 2.4f);
        }

        Color getInterpolatedColor(Color color1, Color color2, float color1Likeness) {
            if (color1.equals(color2))
                return color1;
            if (color1Likeness == 1.0)
                return color1;
            if (color1Likeness == 0.0)
                return color2;
            return new Color(getInterpolatedRGB(color1, color2, color1Likeness), true);
        }
    }

    static class PointInterpolator implements PropertyInterpolator<Point> {
        public Point interpolate(Point from, Point to, float timelinePosition) {
            int x = from.x + (int) (timelinePosition * (to.x - from.x));
            int y = from.y + (int) (timelinePosition * (to.y - from.y));
            return new Point(x, y);
        }

        @Override
        public Class<Point> getBasePropertyClass() {
            return Point.class;
        }
    }

    static class RectangleInterpolator implements PropertyInterpolator<Rectangle> {
        public Rectangle interpolate(Rectangle from, Rectangle to, float timelinePosition) {
            int x = from.x + (int) (timelinePosition * (to.x - from.x));
            int y = from.y + (int) (timelinePosition * (to.y - from.y));
            int w = from.width + (int) (timelinePosition * (to.width - from.width));
            int h = from.height + (int) (timelinePosition * (to.height - from.height));
            return new Rectangle(x, y, w, h);
        }

        @Override
        public Class<Rectangle> getBasePropertyClass() {
            return Rectangle.class;
        }
    }

    static class DimensionInterpolator implements PropertyInterpolator<Dimension> {
        public Dimension interpolate(Dimension from, Dimension to, float timelinePosition) {
            int w = from.width + (int) (timelinePosition * (to.width - from.width));
            int h = from.height + (int) (timelinePosition * (to.height - from.height));
            return new Dimension(w, h);
        }

        public Class<Dimension> getBasePropertyClass() {
            return Dimension.class;
        }
    }
}
