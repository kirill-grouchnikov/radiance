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
package org.pushingpixels.radiance.theming.api.colorscheme;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.api.trait.RadianceTrait;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.filters.ColorSchemeFilter;

import java.awt.*;

/**
 * General interface for color schemes.
 *
 * @author Kirill Grouchnikov
 */
public interface RadianceColorScheme extends RadianceTrait, SchemeBaseColors, SchemeDerivedColors {
    /**
     * Returns indication whether this color scheme uses dark colors. Note that
     * this method may be removed in the future. It is highly recommended to use
     * one of the colors from the parent {@link SchemeBaseColors} and {@link SchemeDerivedColors}
     * interfaces instead.
     *
     * @return <code>true</code> if this color scheme uses dark colors,
     * <code>false</code> otherwise.
     */
    boolean isDark();

    /**
     * Creates a shift version of <code>this</code> scheme.
     *
     * @param backgroundShiftColor  Shift color for background colors. Should have full opacity.
     * @param backgroundShiftFactor Value in 0.0...1.0 range. Larger values shift more towards the
     *                              specified color.
     * @param foregroundShiftColor  Shift color for foreground colors. Should have full opacity.
     * @param foregroundShiftFactor Value in 0.0...1.0 range. Larger values shift more towards the
     *                              specified color.
     * @return Shift version of <code>this</code> scheme.
     */
    RadianceColorScheme shift(Color backgroundShiftColor,
            double backgroundShiftFactor, Color foregroundShiftColor,
            double foregroundShiftFactor);

    /**
     * Creates a shift version of <code>this</code> scheme.
     *
     * @param backgroundShiftColor  Shift color for background colors. Should have full opacity.
     * @param backgroundShiftFactor Value in 0.0...1.0 range. Larger values shift more towards the
     *                              specified color.
     * @return Shift version of <code>this</code> scheme that does not change
     * the foreground color.
     */
    RadianceColorScheme shiftBackground(Color backgroundShiftColor,
            double backgroundShiftFactor);

    /**
     * Creates a tinted (shifted towards white) version of <code>this</code>
     * color scheme.
     *
     * @param tintFactor Value in 0.0...1.0 range. Larger values shift more towards
     *                   white color.
     * @return Tinted version of <code>this</code> scheme.
     */
    RadianceColorScheme tint(double tintFactor);

    /**
     * Creates a toned (shifted towards gray) version of <code>this</code> color
     * scheme.
     *
     * @param toneFactor Value in 0.0...1.0 range. Larger values shift more towards
     *                   gray color.
     * @return Toned version of <code>this</code> scheme.
     */
    RadianceColorScheme tone(double toneFactor);

    /**
     * Creates a shaded (shifted towards black) version of <code>this</code>
     * color scheme.
     *
     * @param shadeFactor Value in 0.0...1.0 range. Larger values shift more towards
     *                    black color.
     * @return Shaded version of <code>this</code> scheme.
     */
    RadianceColorScheme shade(double shadeFactor);

    /**
     * Creates a saturated or desaturated version of <code>this</code> scheme.
     * The value and brightness stay the same.
     *
     * @param saturateFactor Value in -1.0...1.0 range. Positive values create more
     *                       saturated colors. Negative values create more desaturated
     *                       colors.
     * @return Saturated version of <code>this</code> scheme.
     */
    RadianceColorScheme saturate(double saturateFactor);

    /**
     * Creates an inverted version of <code>this</code> scheme.
     *
     * @return Inverted version of <code>this</code> scheme.
     */
    RadianceColorScheme invert();

    /**
     * Creates a negated version of <code>this</code> scheme.
     *
     * @return Negated version of <code>this</code> scheme.
     */
    RadianceColorScheme negate();

    /**
     * Creates a hue-shifted (in HSB space) version of <code>this</code> color
     * scheme.
     *
     * @param hueShiftFactor Value in -1.0...1.0 range.
     * @return Hue-shifted version of <code>this</code> scheme.
     */
    RadianceColorScheme hueShift(double hueShiftFactor);

    /**
     * Creates a blended version of <code>this</code> color scheme based on another
     * color scheme.
     *
     * @param otherScheme          The other color scheme for blending colors.
     * @param likenessToThisScheme Defines how close the colors of the resulting
     *                             color scheme are to this scheme. Value of 1.0 returns a color
     *                             scheme with the exact colors of this color scheme. Value of 0.0
     *                             returns a color scheme with the exact colors of the other color
     *                             scheme.
     * @return Blended color scheme.
     */
    RadianceColorScheme blendWith(RadianceColorScheme otherScheme, double likenessToThisScheme);

    /**
     * This method is a fluent-interface builder utility for setting the display
     * name for this color scheme. The implementation must return the same
     * <code>this</code> instance.
     *
     * @param colorSchemeDisplayName New display name for this color scheme.
     * @return This color scheme.
     */
    RadianceColorScheme named(String colorSchemeDisplayName);

    default RadianceIcon.ColorFilter getColorFilter(float brightnessFactor, float alpha) {
        RadianceColorScheme origin = this;
        return color -> {
            int[] interpolated = ColorSchemeFilter.getInterpolatedColors(origin);
            int steps = interpolated.length;

            int brightness = RadianceColorUtilities.getColorBrightness(color.getRGB());

            int a = color.getAlpha();
            int r = color.getRed();
            int g = color.getGreen();
            int b = color.getBlue();

            float[] hsb = Color.RGBtoHSB(r, g, b, null);
            int pixelColor = interpolated[brightness * steps / 256];

            int ri = (pixelColor >>> 16) & 0xFF;
            int gi = (pixelColor >>> 8) & 0xFF;
            int bi = (pixelColor >>> 0) & 0xFF;
            float[] hsbi = Color.RGBtoHSB(ri, gi, bi, null);

            hsb[0] = hsbi[0];
            hsb[1] = hsbi[1];
            if (brightnessFactor >= 0.0f) {
                hsb[2] = brightnessFactor * hsb[2]
                        + (1.0f - brightnessFactor) * hsbi[2];
            } else {
                hsb[2] = hsb[2] * hsbi[2] * (1.0f + brightnessFactor);
            }

            Color converted = new Color(Color.HSBtoRGB(hsb[0], hsb[1], hsb[2]));
            int finalAlpha = (int) (a * alpha);

            return new Color(converted.getRed(), converted.getGreen(), converted.getBlue(),
                    finalAlpha);
        };
    }
}
