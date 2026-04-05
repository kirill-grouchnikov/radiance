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

import java.util.function.Function;

public class TokenPaletteColorResolverOverlay {
    private Function<TokenPalette, Integer> containerSurfaceLowest;
    private Function<TokenPalette, Integer> containerSurfaceLow;
    private Function<TokenPalette, Integer> containerSurface;
    private Function<TokenPalette, Integer> containerSurfaceHigh;
    private Function<TokenPalette, Integer> containerSurfaceHighest;
    private Function<TokenPalette, Integer> containerSurfaceDim;
    private Function<TokenPalette, Integer> containerSurfaceBright;
    private Function<TokenPalette, Integer> containerShadow;
    private Function<TokenPalette, Integer> onContainer;
    private Function<TokenPalette, Integer> onContainerVariant;
    private Function<TokenPalette, Integer> containerOutline;
    private Function<TokenPalette, Integer> containerOutlineVariant;
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

    public static Builder builder() {
        return new Builder();
    }

    private TokenPaletteColorResolverOverlay() {}

    public Function<TokenPalette, Integer> getContainerSurfaceLowest() {
        return this.containerSurfaceLowest;
    }

    public Function<TokenPalette, Integer> getContainerSurfaceLow() {
        return this.containerSurfaceLow;
    }

    public Function<TokenPalette, Integer> getContainerSurface() {
        return this.containerSurface;
    }

    public Function<TokenPalette, Integer> getContainerSurfaceHigh() {
        return this.containerSurfaceHigh;
    }

    public Function<TokenPalette, Integer> getContainerSurfaceHighest() {
        return this.containerSurfaceHighest;
    }

    public Function<TokenPalette, Integer> getContainerSurfaceDim() {
        return this.containerSurfaceDim;
    }

    public Function<TokenPalette, Integer> getContainerSurfaceBright() {
        return this.containerSurfaceBright;
    }

    public Function<TokenPalette, Integer> getContainerShadow() {
        return this.containerShadow;
    }

    public Function<TokenPalette, Integer> getOnContainer() {
        return this.onContainer;
    }

    public Function<TokenPalette, Integer> getOnContainerVariant() {
        return this.onContainerVariant;
    }

    public Function<TokenPalette, Integer> getContainerOutline() {
        return this.containerOutline;
    }

    public Function<TokenPalette, Integer> getContainerOutlineVariant() {
        return this.containerOutlineVariant;
    }

    public Function<TokenPalette, Float> getContainerSurfaceEnabledAlpha() {
        return this.containerSurfaceEnabledAlpha;
    }

    public Function<TokenPalette, Float> getOnContainerEnabledAlpha() {
        return this.onContainerEnabledAlpha;
    }

    public Function<TokenPalette, Float> getContainerOutlineEnabledAlpha() {
        return this.containerOutlineEnabledAlpha;
    }

    public Function<TokenPalette, Float> getContainerSurfaceDisabledAlpha() {
        return this.containerSurfaceDisabledAlpha;
    }

    public Function<TokenPalette, Float> getOnContainerDisabledAlpha() {
        return this.onContainerDisabledAlpha;
    }

    public Function<TokenPalette, Float> getContainerOutlineDisabledAlpha() {
        return this.containerOutlineDisabledAlpha;
    }

    public Function<TokenPalette, Integer> getInverseContainerSurface() {
        return this.inverseContainerSurface;
    }

    public Function<TokenPalette, Integer> getInverseOnContainer() {
        return this.inverseOnContainer;
    }

    public Function<TokenPalette, Integer> getInverseContainerOutline() {
        return this.inverseContainerOutline;
    }

    public Function<TokenPalette, Integer> getComplementaryOnContainer() {
        return this.complementaryOnContainer;
    }

    public Function<TokenPalette, Integer> getComplementaryContainerOutline() {
        return this.complementaryContainerOutline;
    }

    public Function<TokenPalette, Integer> getAccentOnContainer() {
        return this.accentOnContainer;
    }

    public final static class Builder {
        private Function<TokenPalette, Integer> containerSurfaceLowest;
        private Function<TokenPalette, Integer> containerSurfaceLow;
        private Function<TokenPalette, Integer> containerSurface;
        private Function<TokenPalette, Integer> containerSurfaceHigh;
        private Function<TokenPalette, Integer> containerSurfaceHighest;
        private Function<TokenPalette, Integer> containerSurfaceDim;
        private Function<TokenPalette, Integer> containerSurfaceBright;
        private Function<TokenPalette, Integer> containerShadow;
        private Function<TokenPalette, Integer> onContainer;
        private Function<TokenPalette, Integer> onContainerVariant;
        private Function<TokenPalette, Integer> containerOutline;
        private Function<TokenPalette, Integer> containerOutlineVariant;
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

        private Builder() {}

        public Builder containerSurfaceLowest(Function<TokenPalette, Integer> containerSurfaceLowest) {
            this.containerSurfaceLowest = containerSurfaceLowest;
            return this;
        }

        public Builder containerSurfaceLow(Function<TokenPalette, Integer> containerSurfaceLow) {
            this.containerSurfaceLow = containerSurfaceLow;
            return this;
        }

        public Builder containerSurface(Function<TokenPalette, Integer> containerSurface) {
            this.containerSurface = containerSurface;
            return this;
        }

        public Builder containerSurfaceHigh(Function<TokenPalette, Integer> containerSurfaceHigh) {
            this.containerSurfaceHigh = containerSurfaceHigh;
            return this;
        }

        public Builder containerSurfaceHighest(Function<TokenPalette, Integer> containerSurfaceHighest) {
            this.containerSurfaceHighest = containerSurfaceHighest;
            return this;
        }

        public Builder containerSurfaceDim(Function<TokenPalette, Integer> containerSurfaceDim) {
            this.containerSurfaceDim = containerSurfaceDim;
            return this;
        }

        public Builder containerSurfaceBright(Function<TokenPalette, Integer> containerSurfaceBright) {
            this.containerSurfaceBright = containerSurfaceBright;
            return this;
        }

        public Builder containerShadow(Function<TokenPalette, Integer> containerShadow) {
            this.containerShadow = containerShadow;
            return this;
        }

        public Builder onContainer(Function<TokenPalette, Integer> onContainer) {
            this.onContainer = onContainer;
            return this;
        }

        public Builder onContainerVariant(Function<TokenPalette, Integer> onContainerVariant) {
            this.onContainerVariant = onContainerVariant;
            return this;
        }

        public Builder containerOutline(Function<TokenPalette, Integer> containerOutline) {
            this.containerOutline = containerOutline;
            return this;
        }

        public Builder containerOutlineVariant(Function<TokenPalette, Integer> containerOutlineVariant) {
            this.containerOutlineVariant = containerOutlineVariant;
            return this;
        }

        public Builder containerSurfaceEnabledAlpha(
            Function<TokenPalette, Float> containerSurfaceEnabledAlpha) {
            this.containerSurfaceEnabledAlpha = containerSurfaceEnabledAlpha;
            return this;
        }

        public Builder onContainerEnabledAlpha(
            Function<TokenPalette, Float> onContainerEnabledAlpha) {
            this.onContainerEnabledAlpha = onContainerEnabledAlpha;
            return this;
        }

        public Builder containerOutlineEnabledAlpha(
            Function<TokenPalette, Float> containerOutlineEnabledAlpha) {
            this.containerOutlineEnabledAlpha = containerOutlineEnabledAlpha;
            return this;
        }

        public Builder containerSurfaceDisabledAlpha(
            Function<TokenPalette, Float> containerSurfaceDisabledAlpha) {
            this.containerSurfaceDisabledAlpha = containerSurfaceDisabledAlpha;
            return this;
        }

        public Builder onContainerDisabledAlpha(
            Function<TokenPalette, Float> onContainerDisabledAlpha) {
            this.onContainerDisabledAlpha = onContainerDisabledAlpha;
            return this;
        }

        public Builder containerOutlineDisabledAlpha(
            Function<TokenPalette, Float> containerOutlineDisabledAlpha) {
            this.containerOutlineDisabledAlpha = containerOutlineDisabledAlpha;
            return this;
        }

        public Builder inverseContainerSurface(
            Function<TokenPalette, Integer> inverseContainerSurface) {
            this.inverseContainerSurface = inverseContainerSurface;
            return this;
        }

        public Builder inverseOnContainer(Function<TokenPalette, Integer> inverseOnContainer) {
            this.inverseOnContainer = inverseOnContainer;
            return this;
        }

        public Builder inverseContainerOutline(
            Function<TokenPalette, Integer> inverseContainerOutline) {
            this.inverseContainerOutline = inverseContainerOutline;
            return this;
        }

        public Builder complementaryOnContainer(
            Function<TokenPalette, Integer> complementaryOnContainer) {
            this.complementaryOnContainer = complementaryOnContainer;
            return this;
        }

        public Builder complementaryContainerOutline(
            Function<TokenPalette, Integer> complementaryContainerOutline) {
            this.complementaryContainerOutline = complementaryContainerOutline;
            return this;
        }

        public Builder accentOnContainer(
            Function<TokenPalette, Integer> accentOnContainer) {
            this.accentOnContainer = accentOnContainer;
            return this;
        }

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
            result.onContainer = this.onContainer;
            result.onContainerVariant = this.onContainerVariant;
            result.containerOutline = this.containerOutline;
            result.containerOutlineVariant = this.containerOutlineVariant;
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
            return result;
        }
    }
}
