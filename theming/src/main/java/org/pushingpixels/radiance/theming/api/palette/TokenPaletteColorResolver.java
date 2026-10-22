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
package org.pushingpixels.radiance.theming.api.palette;

import org.pushingpixels.ephemeral.chroma.palettes.TokenPalette;

import java.awt.*;

/**
 * Interface for resolving colors from a {@link TokenPalette}.
 * This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public interface TokenPaletteColorResolver {
    /**
     * Returns the lowest contrast container surface color.
     *
     * @param tokenPalette The token palette.
     * @return The lowest contrast container surface color.
     */
    Color getContainerSurfaceLowest(TokenPalette tokenPalette);

    /**
     * Returns the low contrast container surface color.
     *
     * @param tokenPalette The token palette.
     * @return The low contrast container surface color.
     */
    Color getContainerSurfaceLow(TokenPalette tokenPalette);

    /**
     * Returns the container surface color.
     *
     * @param tokenPalette The token palette.
     * @return The container surface color.
     */
    Color getContainerSurface(TokenPalette tokenPalette);

    /**
     * Returns the high contrast container surface color.
     *
     * @param tokenPalette The token palette.
     * @return The high contrast container surface color.
     */
    Color getContainerSurfaceHigh(TokenPalette tokenPalette);

    /**
     * Returns the highest contrast container surface color.
     *
     * @param tokenPalette The token palette.
     * @return The highest contrast container surface color.
     */
    Color getContainerSurfaceHighest(TokenPalette tokenPalette);

    /**
     * Returns the dim container surface color.
     *
     * @param tokenPalette The token palette.
     * @return The dim container surface color.
     */
    Color getContainerSurfaceDim(TokenPalette tokenPalette);

    /**
     * Returns the bright container surface color.
     *
     * @param tokenPalette The token palette.
     * @return The bright container surface color.
     */
    Color getContainerSurfaceBright(TokenPalette tokenPalette);

    /**
     * Returns the container shadow color.
     *
     * @param tokenPalette The token palette.
     * @return The container shadow color.
     */
    Color getContainerShadow(TokenPalette tokenPalette);

    /**
     * Returns the low contrast on-container color.
     *
     * @param tokenPalette The token palette.
     * @return The low contrast on-container color.
     */
    Color getOnContainerLow(TokenPalette tokenPalette);

    /**
     * Returns the on-container color.
     *
     * @param tokenPalette The token palette.
     * @return The on-container color.
     */
    Color getOnContainer(TokenPalette tokenPalette);

    /**
     * Returns the high contrast on-container color.
     *
     * @param tokenPalette The token palette.
     * @return The high contrast on-container color.
     */
    Color getOnContainerHigh(TokenPalette tokenPalette);

    /**
     * Returns the low contrast container outline color.
     *
     * @param tokenPalette The token palette.
     * @return The low contrast container outline color.
     */
    Color getContainerOutlineLow(TokenPalette tokenPalette);

    /**
     * Returns the container outline color.
     *
     * @param tokenPalette The token palette.
     * @return The container outline color.
     */
    Color getContainerOutline(TokenPalette tokenPalette);

    /**
     * Returns the high contrast container outline color.
     *
     * @param tokenPalette The token palette.
     * @return The high contrast container outline color.
     */
    Color getContainerOutlineHigh(TokenPalette tokenPalette);

    /**
     * Returns the alpha for container enabled surfaces.
     *
     * @param tokenPalette The token palette.
     * @return The alpha for container enabled surfaces.
     */
    float getContainerSurfaceEnabledAlpha(TokenPalette tokenPalette);

    /**
     * Returns the alpha for enabled on-container colors.
     *
     * @param tokenPalette The token palette.
     * @return The alpha for enabled on-container colors.
     */
    float getOnContainerEnabledAlpha(TokenPalette tokenPalette);

    /**
     * Returns the enabled container outline colors.
     *
     * @param tokenPalette The token palette.
     * @return The enabled container outline colors.
     */
    float getContainerOutlineEnabledAlpha(TokenPalette tokenPalette);

    /**
     * Returns the alpha for container disabled surfaces.
     *
     * @param tokenPalette The token palette.
     * @return The alpha for container disabled surfaces.
     */
    float getContainerSurfaceDisabledAlpha(TokenPalette tokenPalette);

    /**
     * Returns the alpha for disabled on-container colors.
     *
     * @param tokenPalette The token palette.
     * @return The alpha for disabled on-container colors.
     */
    float getOnContainerDisabledAlpha(TokenPalette tokenPalette);

    /**
     * Returns the alpha for disabled container outline colors.
     *
     * @param tokenPalette The token palette.
     * @return The alpha for disabled container outline colors.
     */
    float getContainerOutlineDisabledAlpha(TokenPalette tokenPalette);

    /**
     * Returns the inverse container surface color.
     *
     * @param tokenPalette The token palette.
     * @return The inverse container surface color.
     */
    Color getInverseContainerSurface(TokenPalette tokenPalette);

    /**
     * Returns the inverse on-container color.
     *
     * @param tokenPalette The token palette.
     * @return The inverse on-container color.
     */
    Color getInverseOnContainer(TokenPalette tokenPalette);

    /**
     * Returns the inverse container outline color.
     *
     * @param tokenPalette The token palette.
     * @return The inverse container outline color.
     */
    Color getInverseContainerOutline(TokenPalette tokenPalette);

    /**
     * Returns the complementary on-container color.
     *
     * @param tokenPalette The token palette.
     * @return The complementary on-container color.
     */
    Color getComplementaryOnContainer(TokenPalette tokenPalette);

    /**
     * Returns the complementary container outline color.
     *
     * @param tokenPalette The token palette.
     * @return The complementary container outline color.
     */
    Color getComplementaryContainerOutline(TokenPalette tokenPalette);

    /**
     * Returns the accent on-container color.
     *
     * @param tokenPalette The token palette.
     * @return The accent on-container color.
     */
    Color getAccentOnContainer(TokenPalette tokenPalette);

    /**
     * Returns the marker on-container color.
     *
     * @param tokenPalette The token palette.
     * @return The marker on-container color.
     */
    Color getMarkerOnContainer(TokenPalette tokenPalette);

    /**
     * Returns the complementary marker on-container color.
     *
     * @param tokenPalette The token palette.
     * @return The complementary marker on-container color.
     */
    Color getComplementaryMarkerOnContainer(TokenPalette tokenPalette);

    /**
     * Creates an overlay that applies the specified color overrides to this resolver.
     *
     * @param overlay The overlay with color overrides.
     * @return The overlaid color resolver.
     */
    default TokenPaletteColorResolver overlayWith(TokenPaletteColorResolverOverlay overlay) {
        return TokenPaletteColorResolverUtils.overlayWith(this, overlay);
    }
}
