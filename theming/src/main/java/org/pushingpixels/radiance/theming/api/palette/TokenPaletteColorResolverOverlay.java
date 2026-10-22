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
import java.util.function.Function;

/**
 * Overlay for {@link TokenPaletteColorResolver} that allows overriding specific color tokens.
 * This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class TokenPaletteColorResolverOverlay {
    private Function<TokenPalette, Integer> containerSurfaceLowest;
    private Function<TokenPalette, Integer> containerSurfaceLow;
    private Function<TokenPalette, Integer> containerSurface;
    private Function<TokenPalette, Integer> containerSurfaceHigh;
    private Function<TokenPalette, Integer> containerSurfaceHighest;
    private Function<TokenPalette, Integer> containerSurfaceDim;
    private Function<TokenPalette, Integer> containerSurfaceBright;
    private Function<TokenPalette, Integer> containerShadow;
    private Function<TokenPalette, Integer> onContainerLow;
    private Function<TokenPalette, Integer> onContainer;
    private Function<TokenPalette, Integer> onContainerHigh;
    private Function<TokenPalette, Integer> containerOutlineLow;
    private Function<TokenPalette, Integer> containerOutline;
    private Function<TokenPalette, Integer> containerOutlineHigh;
    private Function<TokenPalette, Float> containerSurfaceEnabledAlpha;
    private Function<TokenPalette, Float> onContainerEnabledAlpha;
    private Function<TokenPalette, Float> containerOutlineEnabledAlpha;
    private Function<TokenPalette, Float> containerSurfaceDisabledAlpha;
    private Function<TokenPalette, Float> onContainerDisabledAlpha;
    private Function<TokenPalette, Float> containerOutlineDisabledAlpha;
    private Function<TokenPalette, Integer> inverseContainerSurface;
    private Function<TokenPalette, Integer> inverseOnContainer;
    private Function<TokenPalette, Integer> inverseContainerOutline;
    private Function<TokenPalette, Integer> complementaryOnContainer;
    private Function<TokenPalette, Integer> complementaryContainerOutline;
    private Function<TokenPalette, Integer> accentOnContainer;
    private Function<TokenPalette, Integer> markerOnContainer;
    private Function<TokenPalette, Integer> complementaryMarkerOnContainer;

    /**
     * Creates a new {@link Builder} for constructing {@link TokenPaletteColorResolverOverlay} instances.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Constructs a {@code TokenPaletteColorResolverOverlay}.
     */
    private TokenPaletteColorResolverOverlay() {}

    /**
     * Returns the container surface lowest contrast color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerSurfaceLowest() {
        return this.containerSurfaceLowest;
    }

    /**
     * Returns the container surface low contrast color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerSurfaceLow() {
        return this.containerSurfaceLow;
    }

    /**
     * Returns the container surface color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerSurface() {
        return this.containerSurface;
    }

    /**
     * Returns the container surface high contrast color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerSurfaceHigh() {
        return this.containerSurfaceHigh;
    }

    /**
     * Returns the container surface highest contrast color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerSurfaceHighest() {
        return this.containerSurfaceHighest;
    }

    /**
     * Returns the container surface dim color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerSurfaceDim() {
        return this.containerSurfaceDim;
    }

    /**
     * Returns the container surface bright color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerSurfaceBright() {
        return this.containerSurfaceBright;
    }

    /**
     * Returns the container shadow color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerShadow() {
        return this.containerShadow;
    }

    /**
     * Returns the on-container low contrast color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getOnContainerLow() {
        return this.onContainerLow;
    }

    /**
     * Returns the on-container color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getOnContainer() {
        return this.onContainer;
    }

    /**
     * Returns the on-container high contrast color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getOnContainerHigh() {
        return this.onContainerHigh;
    }

    /**
     * Returns the container outline low contrast color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerOutlineLow() {
        return this.containerOutlineLow;
    }

    /**
     * Returns the container outline color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerOutline() {
        return this.containerOutline;
    }

    /**
     * Returns the container outline high contrast color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getContainerOutlineHigh() {
        return this.containerOutlineHigh;
    }

    /**
     * Returns the container surface enabled alpha override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Float> getContainerSurfaceEnabledAlpha() {
        return this.containerSurfaceEnabledAlpha;
    }

    /**
     * Returns the on-container enabled alpha override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Float> getOnContainerEnabledAlpha() {
        return this.onContainerEnabledAlpha;
    }

    /**
     * Returns the container outline enabled alpha override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Float> getContainerOutlineEnabledAlpha() {
        return this.containerOutlineEnabledAlpha;
    }

    /**
     * Returns the container surface disabled alpha override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Float> getContainerSurfaceDisabledAlpha() {
        return this.containerSurfaceDisabledAlpha;
    }

    /**
     * Returns the on-container disabled alpha override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Float> getOnContainerDisabledAlpha() {
        return this.onContainerDisabledAlpha;
    }

    /**
     * Returns the container outline disabled alpha override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Float> getContainerOutlineDisabledAlpha() {
        return this.containerOutlineDisabledAlpha;
    }

    /**
     * Returns the inverse container surface color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getInverseContainerSurface() {
        return this.inverseContainerSurface;
    }

    /**
     * Returns the inverse on-container color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getInverseOnContainer() {
        return this.inverseOnContainer;
    }

    /**
     * Returns the inverse container outline color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getInverseContainerOutline() {
        return this.inverseContainerOutline;
    }

    /**
     * Returns the complementary on-container color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getComplementaryOnContainer() {
        return this.complementaryOnContainer;
    }

    /**
     * Returns the complementary container outline color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getComplementaryContainerOutline() {
        return this.complementaryContainerOutline;
    }

    /**
     * Returns the accent on-container color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getAccentOnContainer() {
        return this.accentOnContainer;
    }

    /**
     * Returns the marker on-container color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getMarkerOnContainer() {
        return this.markerOnContainer;
    }

    /**
     * Returns the complementary marker on-container color override function.
     *
     * @return The override function, or {@code null} if not set.
     */
    public Function<TokenPalette, Integer> getComplementaryMarkerOnContainer() {
        return this.complementaryMarkerOnContainer;
    }

    /**
     * Builder for constructing {@link TokenPaletteColorResolverOverlay} instances.
     */
    public final static class Builder {
        private Function<TokenPalette, Integer> containerSurfaceLowest;
        private Function<TokenPalette, Integer> containerSurfaceLow;
        private Function<TokenPalette, Integer> containerSurface;
        private Function<TokenPalette, Integer> containerSurfaceHigh;
        private Function<TokenPalette, Integer> containerSurfaceHighest;
        private Function<TokenPalette, Integer> containerSurfaceDim;
        private Function<TokenPalette, Integer> containerSurfaceBright;
        private Function<TokenPalette, Integer> containerShadow;
        private Function<TokenPalette, Integer> onContainerLow;
        private Function<TokenPalette, Integer> onContainer;
        private Function<TokenPalette, Integer> onContainerHigh;
        private Function<TokenPalette, Integer> containerOutlineLow;
        private Function<TokenPalette, Integer> containerOutline;
        private Function<TokenPalette, Integer> containerOutlineHigh;
        private Function<TokenPalette, Float> containerSurfaceEnabledAlpha;
        private Function<TokenPalette, Float> onContainerEnabledAlpha;
        private Function<TokenPalette, Float> containerOutlineEnabledAlpha;
        private Function<TokenPalette, Float> containerSurfaceDisabledAlpha;
        private Function<TokenPalette, Float> onContainerDisabledAlpha;
        private Function<TokenPalette, Float> containerOutlineDisabledAlpha;
        private Function<TokenPalette, Integer> inverseContainerSurface;
        private Function<TokenPalette, Integer> inverseOnContainer;
        private Function<TokenPalette, Integer> inverseContainerOutline;
        private Function<TokenPalette, Integer> complementaryOnContainer;
        private Function<TokenPalette, Integer> complementaryContainerOutline;
        private Function<TokenPalette, Integer> accentOnContainer;
        private Function<TokenPalette, Integer> markerOnContainer;
        private Function<TokenPalette, Integer> complementaryMarkerOnContainer;

        /**
         * Constructs a {@code Builder}.
         */
        private Builder() {}

        /**
         * Sets the container surface lowest contrast color override.
         *
         * @param containerSurfaceLowest The override function.
         * @return This builder.
         */
        public Builder containerSurfaceLowest(Function<TokenPalette, Integer> containerSurfaceLowest) {
            this.containerSurfaceLowest = containerSurfaceLowest;
            return this;
        }

        /**
         * Sets the container surface low contrast color override.
         *
         * @param containerSurfaceLow The override function.
         * @return This builder.
         */
        public Builder containerSurfaceLow(Function<TokenPalette, Integer> containerSurfaceLow) {
            this.containerSurfaceLow = containerSurfaceLow;
            return this;
        }

        /**
         * Sets the container surface color override.
         *
         * @param containerSurface The override function.
         * @return This builder.
         */
        public Builder containerSurface(Function<TokenPalette, Integer> containerSurface) {
            this.containerSurface = containerSurface;
            return this;
        }

        /**
         * Sets the container surface high contrast color override.
         *
         * @param containerSurfaceHigh The override function.
         * @return This builder.
         */
        public Builder containerSurfaceHigh(Function<TokenPalette, Integer> containerSurfaceHigh) {
            this.containerSurfaceHigh = containerSurfaceHigh;
            return this;
        }

        /**
         * Sets the container surface highest contrast color override.
         *
         * @param containerSurfaceHighest The override function.
         * @return This builder.
         */
        public Builder containerSurfaceHighest(Function<TokenPalette, Integer> containerSurfaceHighest) {
            this.containerSurfaceHighest = containerSurfaceHighest;
            return this;
        }

        /**
         * Sets the container surface dim color override.
         *
         * @param containerSurfaceDim The override function.
         * @return This builder.
         */
        public Builder containerSurfaceDim(Function<TokenPalette, Integer> containerSurfaceDim) {
            this.containerSurfaceDim = containerSurfaceDim;
            return this;
        }

        /**
         * Sets the container surface bright color override.
         *
         * @param containerSurfaceBright The override function.
         * @return This builder.
         */
        public Builder containerSurfaceBright(Function<TokenPalette, Integer> containerSurfaceBright) {
            this.containerSurfaceBright = containerSurfaceBright;
            return this;
        }

        /**
         * Sets the container shadow color override.
         *
         * @param containerShadow The override function.
         * @return This builder.
         */
        public Builder containerShadow(Function<TokenPalette, Integer> containerShadow) {
            this.containerShadow = containerShadow;
            return this;
        }

        /**
         * Sets the on-container low contrast color override.
         *
         * @param onContainerLow The override function.
         * @return This builder.
         */
        public Builder onContainerLow(Function<TokenPalette, Integer> onContainerLow) {
            this.onContainerLow = onContainerLow;
            return this;
        }

        /**
         * Sets the on-container color override.
         *
         * @param onContainer The override function.
         * @return This builder.
         */
        public Builder onContainer(Function<TokenPalette, Integer> onContainer) {
            this.onContainer = onContainer;
            return this;
        }

        /**
         * Sets the on-container high contrast color override.
         *
         * @param onContainerHigh The override function.
         * @return This builder.
         */
        public Builder onContainerHigh(Function<TokenPalette, Integer> onContainerHigh) {
            this.onContainerHigh = onContainerHigh;
            return this;
        }

        /**
         * Sets the container outline low contrast color override.
         *
         * @param containerOutlineLow The override function.
         * @return This builder.
         */
        public Builder containerOutlineLow(Function<TokenPalette, Integer> containerOutlineLow) {
            this.containerOutlineLow = containerOutlineLow;
            return this;
        }

        /**
         * Sets the container outline color override.
         *
         * @param containerOutline The override function.
         * @return This builder.
         */
        public Builder containerOutline(Function<TokenPalette, Integer> containerOutline) {
            this.containerOutline = containerOutline;
            return this;
        }

        /**
         * Sets the container outline high contrast color override.
         *
         * @param containerOutlineHigh The override function.
         * @return This builder.
         */
        public Builder containerOutlineHigh(Function<TokenPalette, Integer> containerOutlineHigh) {
            this.containerOutlineHigh = containerOutlineHigh;
            return this;
        }

        /**
         * Sets the container surface enabled alpha override.
         *
         * @param containerSurfaceEnabledAlpha The override function.
         * @return This builder.
         */
        public Builder containerSurfaceEnabledAlpha(
            Function<TokenPalette, Float> containerSurfaceEnabledAlpha) {
            this.containerSurfaceEnabledAlpha = containerSurfaceEnabledAlpha;
            return this;
        }

        /**
         * Sets the on-container enabled alpha override.
         *
         * @param onContainerEnabledAlpha The override function.
         * @return This builder.
         */
        public Builder onContainerEnabledAlpha(
            Function<TokenPalette, Float> onContainerEnabledAlpha) {
            this.onContainerEnabledAlpha = onContainerEnabledAlpha;
            return this;
        }

        /**
         * Sets the container outline enabled alpha override.
         *
         * @param containerOutlineEnabledAlpha The override function.
         * @return This builder.
         */
        public Builder containerOutlineEnabledAlpha(
            Function<TokenPalette, Float> containerOutlineEnabledAlpha) {
            this.containerOutlineEnabledAlpha = containerOutlineEnabledAlpha;
            return this;
        }

        /**
         * Sets the container surface disabled alpha override.
         *
         * @param containerSurfaceDisabledAlpha The override function.
         * @return This builder.
         */
        public Builder containerSurfaceDisabledAlpha(
            Function<TokenPalette, Float> containerSurfaceDisabledAlpha) {
            this.containerSurfaceDisabledAlpha = containerSurfaceDisabledAlpha;
            return this;
        }

        /**
         * Sets the on-container disabled alpha override.
         *
         * @param onContainerDisabledAlpha The override function.
         * @return This builder.
         */
        public Builder onContainerDisabledAlpha(
            Function<TokenPalette, Float> onContainerDisabledAlpha) {
            this.onContainerDisabledAlpha = onContainerDisabledAlpha;
            return this;
        }

        /**
         * Sets the container outline disabled alpha override.
         *
         * @param containerOutlineDisabledAlpha The override function.
         * @return This builder.
         */
        public Builder containerOutlineDisabledAlpha(
            Function<TokenPalette, Float> containerOutlineDisabledAlpha) {
            this.containerOutlineDisabledAlpha = containerOutlineDisabledAlpha;
            return this;
        }

        /**
         * Sets the inverse container surface color override.
         *
         * @param inverseContainerSurface The override function.
         * @return This builder.
         */
        public Builder inverseContainerSurface(
            Function<TokenPalette, Integer> inverseContainerSurface) {
            this.inverseContainerSurface = inverseContainerSurface;
            return this;
        }

        /**
         * Sets the inverse on-container color override.
         *
         * @param inverseOnContainer The override function.
         * @return This builder.
         */
        public Builder inverseOnContainer(Function<TokenPalette, Integer> inverseOnContainer) {
            this.inverseOnContainer = inverseOnContainer;
            return this;
        }

        /**
         * Sets the inverse container outline color override.
         *
         * @param inverseContainerOutline The override function.
         * @return This builder.
         */
        public Builder inverseContainerOutline(
            Function<TokenPalette, Integer> inverseContainerOutline) {
            this.inverseContainerOutline = inverseContainerOutline;
            return this;
        }

        /**
         * Sets the complementary on-container color override.
         *
         * @param complementaryOnContainer The override function.
         * @return This builder.
         */
        public Builder complementaryOnContainer(
            Function<TokenPalette, Integer> complementaryOnContainer) {
            this.complementaryOnContainer = complementaryOnContainer;
            return this;
        }

        /**
         * Sets the complementary container outline color override.
         *
         * @param complementaryContainerOutline The override function.
         * @return This builder.
         */
        public Builder complementaryContainerOutline(
            Function<TokenPalette, Integer> complementaryContainerOutline) {
            this.complementaryContainerOutline = complementaryContainerOutline;
            return this;
        }

        /**
         * Sets the accent on-container color override.
         *
         * @param accentOnContainer The override function.
         * @return This builder.
         */
        public Builder accentOnContainer(
            Function<TokenPalette, Integer> accentOnContainer) {
            this.accentOnContainer = accentOnContainer;
            return this;
        }

        /**
         * Sets the marker on-container color override.
         *
         * @param markerOnContainer The override function.
         * @return This builder.
         */
        public Builder markerOnContainer(
            Function<TokenPalette, Integer> markerOnContainer) {
            this.markerOnContainer = markerOnContainer;
            return this;
        }

        /**
         * Sets the complementary marker on-container color override.
         *
         * @param complementaryMarkerOnContainer The override function.
         * @return This builder.
         */
        public Builder complementaryMarkerOnContainer(
            Function<TokenPalette, Integer> complementaryMarkerOnContainer) {
            this.complementaryMarkerOnContainer = complementaryMarkerOnContainer;
            return this;
        }

        /**
         * Builds and returns the {@link TokenPaletteColorResolverOverlay} instance.
         *
         * @return The built overlay.
         */
        public TokenPaletteColorResolverOverlay build() {
            TokenPaletteColorResolverOverlay result = new TokenPaletteColorResolverOverlay();
            result.containerSurfaceLowest = this.containerSurfaceLowest;
            result.containerSurfaceLow = this.containerSurfaceLow;
            result.containerSurface = this.containerSurface;
            result.containerSurfaceHigh = this.containerSurfaceHigh;
            result.containerSurfaceHighest = this.containerSurfaceHighest;
            result.containerSurfaceDim = this.containerSurfaceDim;
            result.containerSurfaceBright = this.containerSurfaceBright;
            result.containerShadow = this.containerShadow;
            result.onContainerLow = this.onContainerLow;
            result.onContainer = this.onContainer;
            result.onContainerHigh = this.onContainerHigh;
            result.containerOutlineLow = this.containerOutlineLow;
            result.containerOutline = this.containerOutline;
            result.containerOutlineHigh = this.containerOutlineHigh;
            result.containerSurfaceEnabledAlpha = this.containerSurfaceEnabledAlpha;
            result.onContainerEnabledAlpha = this.onContainerEnabledAlpha;
            result.containerOutlineEnabledAlpha = this.containerOutlineEnabledAlpha;
            result.containerSurfaceDisabledAlpha = this.containerSurfaceDisabledAlpha;
            result.onContainerDisabledAlpha = this.onContainerDisabledAlpha;
            result.containerOutlineDisabledAlpha = this.containerOutlineDisabledAlpha;
            result.inverseContainerSurface = this.inverseContainerSurface;
            result.inverseOnContainer = this.inverseOnContainer;
            result.inverseContainerOutline = this.inverseContainerOutline;
            result.complementaryOnContainer = this.complementaryOnContainer;
            result.complementaryContainerOutline = this.complementaryContainerOutline;
            result.accentOnContainer = this.accentOnContainer;
            result.markerOnContainer = this.markerOnContainer;
            result.complementaryMarkerOnContainer = this.complementaryMarkerOnContainer;
            return result;
        }
    }
}
