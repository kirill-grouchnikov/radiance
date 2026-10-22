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
package org.pushingpixels.radiance.theming.api;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.filters.ContainerTokensFilter;

import java.awt.*;

/**
 * Interface for container color tokens that define the color palette for a container.
 * This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public interface ContainerColorTokens {
    /**
     * Returns whether the tokens tracked by this object are in dark configuration (roughly corresponding
     * to darker surface colors and light content colors).
     *
     * @return {@code true} if the tokens configuration is dark.
     */
    boolean isDark();

    /**
     * Returns the lowest contrast container surface color.
     *
     * @return The lowest contrast container surface color.
     */
    Color getContainerSurfaceLowest();

    /**
     * Returns the low contrast container surface color.
     *
     * @return The low contrast container surface color.
     */
    Color getContainerSurfaceLow();

    /**
     * Returns the container surface color.
     *
     * @return The container surface color.
     */
    Color getContainerSurface();

    /**
     * Returns the high contrast container surface color.
     *
     * @return The high contrast container surface color.
     */
    Color getContainerSurfaceHigh();

    /**
     * Returns the highest contrast container surface color.
     *
     * @return The highest contrast container surface color.
     */
    Color getContainerSurfaceHighest();

    /**
     * Returns the dim container surface color.
     *
     * @return The dim container surface color.
     */
    Color getContainerSurfaceDim();

    /**
     * Returns the bright container surface color.
     *
     * @return The bright container surface color.
     */
    Color getContainerSurfaceBright();

    /**
     * Returns the container shadow color.
     *
     * @return The container shadow color.
     */
    Color getContainerShadow();

    /**
     * Returns the low contrast on-container color.
     *
     * @return The low contrast on-container color.
     */
    Color getOnContainerLow();

    /**
     * Returns the on-container color.
     *
     * @return The on-container color.
     */
    Color getOnContainer();

    /**
     * Returns the high contrast on-container color.
     *
     * @return The high contrast on-container color.
     */
    Color getOnContainerHigh();

    /**
     * Returns the low contrast container outline color.
     *
     * @return The low contrast container outline color.
     */
    Color getContainerOutlineLow();

    /**
     * Returns the container outline color.
     *
     * @return The container outline color.
     */
    Color getContainerOutline();

    /**
     * Returns the high contrast container outline color.
     *
     * @return The high contrast container outline color.
     */
    Color getContainerOutlineHigh();

    /**
     * Returns the alpha for container enabled surfaces.
     *
     * @return The alpha for container enabled surfaces.
     */
    float getContainerSurfaceEnabledAlpha();

    /**
     * Returns the alpha for enabled on-container colors.
     *
     * @return The alpha for enabled on-container colors.
     */
    float getOnContainerEnabledAlpha();

    /**
     * Returns the alpha for enabled container outline colors.
     *
     * @return The alpha for enabled container outline colors.
     */
    float getContainerOutlineEnabledAlpha();

    /**
     * Returns the alpha for container disabled surfaces.
     *
     * @return The alpha for container disabled surfaces.
     */
    float getContainerSurfaceDisabledAlpha();

    /**
     * Returns the alpha for disabled on-container colors.
     *
     * @return The alpha for disabled on-container colors.
     */
    float getOnContainerDisabledAlpha();

    /**
     * Returns the alpha for disabled container outline colors.
     *
     * @return The alpha for disabled container outline colors.
     */
    float getContainerOutlineDisabledAlpha();

    /**
     * Returns the inverse container surface color.
     *
     * @return The inverse container surface color.
     */
    Color getInverseContainerSurface();

    /**
     * Returns the inverse on-container color.
     *
     * @return The inverse on-container color.
     */
    Color getInverseOnContainer();

    /**
     * Returns the inverse container outline color.
     *
     * @return The inverse container outline color.
     */
    Color getInverseContainerOutline();

    /**
     * Returns the complementary on-container color.
     *
     * @return The complementary on-container color.
     */
    Color getComplementaryOnContainer();

    /**
     * Returns the complementary container outline color.
     *
     * @return The complementary container outline color.
     */
    Color getComplementaryContainerOutline();

    /**
     * Returns the accent on-container color.
     *
     * @return The accent on-container color.
     */
    Color getAccentOnContainer();

    /**
     * Returns the marker on-container color.
     *
     * @return The marker on-container color.
     */
    Color getMarkerOnContainer();

    /**
     * Returns the complementary marker on-container color.
     *
     * @return The complementary marker on-container color.
     */
    Color getComplementaryMarkerOnContainer();

    /**
     * Returns a color filter based on the container color tokens.
     *
     * @param brightnessFactor The brightness factor.
     * @param alpha            The alpha value.
     * @return A color filter.
     */
    default RadianceIcon.ColorFilter getColorFilter(float brightnessFactor, float alpha) {
        ContainerColorTokens origin = this;
        return color -> {
            int[] interpolated = ContainerTokensFilter.getInterpolatedColors(origin,
                ContainerTokensFilter.FilterRange.FULL_SPAN);
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
