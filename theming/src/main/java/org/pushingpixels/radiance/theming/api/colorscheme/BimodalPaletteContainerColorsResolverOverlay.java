/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;

import java.util.function.Function;

public class BimodalPaletteContainerColorsResolverOverlay {
    private Function<DynamicBimodalPalette, Integer> containerSurfaceLowest;
    private Function<DynamicBimodalPalette, Integer> containerSurfaceLow;
    private Function<DynamicBimodalPalette, Integer> containerSurface;
    private Function<DynamicBimodalPalette, Integer> containerSurfaceHigh;
    private Function<DynamicBimodalPalette, Integer> containerSurfaceHighest;
    private Function<DynamicBimodalPalette, Integer> containerSurfaceDim;
    private Function<DynamicBimodalPalette, Integer> containerSurfaceBright;
    private Function<DynamicBimodalPalette, Integer> onContainer;
    private Function<DynamicBimodalPalette, Integer> onContainerVariant;
    private Function<DynamicBimodalPalette, Integer> containerOutline;
    private Function<DynamicBimodalPalette, Integer> containerOutlineVariant;
    private Function<DynamicBimodalPalette, Float> containerSurfaceDisabledAlpha;
    private Function<DynamicBimodalPalette, Float> onContainerDisabledAlpha;
    private Function<DynamicBimodalPalette, Float> containerOutlineDisabledAlpha;
    private Function<DynamicBimodalPalette, Integer> inverseContainerSurface;
    private Function<DynamicBimodalPalette, Integer> inverseOnContainer;
    private Function<DynamicBimodalPalette, Integer> inverseContainerOutline;
    private Function<DynamicBimodalPalette, Integer> complementaryOnContainer;
    private Function<DynamicBimodalPalette, Integer> complementaryContainerOutline;

    public static Builder builder() {
        return new Builder();
    }

    private BimodalPaletteContainerColorsResolverOverlay() {}

    public Function<DynamicBimodalPalette, Integer> getContainerSurfaceLowest() {
        return this.containerSurfaceLowest;
    }

    public Function<DynamicBimodalPalette, Integer> getContainerSurfaceLow() {
        return this.containerSurfaceLow;
    }

    public Function<DynamicBimodalPalette, Integer> getContainerSurface() {
        return this.containerSurface;
    }

    public Function<DynamicBimodalPalette, Integer> getContainerSurfaceHigh() {
        return this.containerSurfaceHigh;
    }

    public Function<DynamicBimodalPalette, Integer> getContainerSurfaceHighest() {
        return this.containerSurfaceHighest;
    }

    public Function<DynamicBimodalPalette, Integer> getContainerSurfaceDim() {
        return this.containerSurfaceDim;
    }

    public Function<DynamicBimodalPalette, Integer> getContainerSurfaceBright() {
        return this.containerSurfaceBright;
    }

    public Function<DynamicBimodalPalette, Integer> getOnContainer() {
        return this.onContainer;
    }

    public Function<DynamicBimodalPalette, Integer> getOnContainerVariant() {
        return this.onContainerVariant;
    }

    public Function<DynamicBimodalPalette, Integer> getContainerOutline() {
        return this.containerOutline;
    }

    public Function<DynamicBimodalPalette, Integer> getContainerOutlineVariant() {
        return this.containerOutlineVariant;
    }

    public Function<DynamicBimodalPalette, Float> getContainerSurfaceDisabledAlpha() {
        return this.containerSurfaceDisabledAlpha;
    }

    public Function<DynamicBimodalPalette, Float> getOnContainerDisabledAlpha() {
        return this.onContainerDisabledAlpha;
    }

    public Function<DynamicBimodalPalette, Float> getContainerOutlineDisabledAlpha() {
        return this.containerOutlineDisabledAlpha;
    }

    public Function<DynamicBimodalPalette, Integer> getInverseContainerSurface() {
        return this.inverseContainerSurface;
    }

    public Function<DynamicBimodalPalette, Integer> getInverseOnContainer() {
        return this.inverseOnContainer;
    }

    public Function<DynamicBimodalPalette, Integer> getInverseContainerOutline() {
        return this.inverseContainerOutline;
    }

    public Function<DynamicBimodalPalette, Integer> getComplementaryOnContainer() {
        return this.complementaryOnContainer;
    }

    public Function<DynamicBimodalPalette, Integer> getComplementaryContainerOutline() {
        return this.complementaryContainerOutline;
    }

    public final static class Builder {
        private Function<DynamicBimodalPalette, Integer> containerSurfaceLowest;
        private Function<DynamicBimodalPalette, Integer> containerSurfaceLow;
        private Function<DynamicBimodalPalette, Integer> containerSurface;
        private Function<DynamicBimodalPalette, Integer> containerSurfaceHigh;
        private Function<DynamicBimodalPalette, Integer> containerSurfaceHighest;
        private Function<DynamicBimodalPalette, Integer> containerSurfaceDim;
        private Function<DynamicBimodalPalette, Integer> containerSurfaceBright;
        private Function<DynamicBimodalPalette, Integer> onContainer;
        private Function<DynamicBimodalPalette, Integer> onContainerVariant;
        private Function<DynamicBimodalPalette, Integer> containerOutline;
        private Function<DynamicBimodalPalette, Integer> containerOutlineVariant;
        private Function<DynamicBimodalPalette, Float> containerSurfaceDisabledAlpha;
        private Function<DynamicBimodalPalette, Float> onContainerDisabledAlpha;
        private Function<DynamicBimodalPalette, Float> containerOutlineDisabledAlpha;
        private Function<DynamicBimodalPalette, Integer> inverseContainerSurface;
        private Function<DynamicBimodalPalette, Integer> inverseOnContainer;
        private Function<DynamicBimodalPalette, Integer> inverseContainerOutline;
        private Function<DynamicBimodalPalette, Integer> complementaryOnContainer;
        private Function<DynamicBimodalPalette, Integer> complementaryContainerOutline;

        private Builder() {}

        public Builder containerSurfaceLowest(Function<DynamicBimodalPalette, Integer> containerSurfaceLowest) {
            this.containerSurfaceLowest = containerSurfaceLowest;
            return this;
        }

        public Builder containerSurfaceLow(Function<DynamicBimodalPalette, Integer> containerSurfaceLow) {
            this.containerSurfaceLow = containerSurfaceLow;
            return this;
        }

        public Builder containerSurface(Function<DynamicBimodalPalette, Integer> containerSurface) {
            this.containerSurface = containerSurface;
            return this;
        }

        public Builder containerSurfaceHigh(Function<DynamicBimodalPalette, Integer> containerSurfaceHigh) {
            this.containerSurfaceHigh = containerSurfaceHigh;
            return this;
        }

        public Builder containerSurfaceHighest(Function<DynamicBimodalPalette, Integer> containerSurfaceHighest) {
            this.containerSurfaceHighest = containerSurfaceHighest;
            return this;
        }

        public Builder containerSurfaceDim(Function<DynamicBimodalPalette, Integer> containerSurfaceDim) {
            this.containerSurfaceDim = containerSurfaceDim;
            return this;
        }

        public Builder containerSurfaceBright(Function<DynamicBimodalPalette, Integer> containerSurfaceBright) {
            this.containerSurfaceBright = containerSurfaceBright;
            return this;
        }

        public Builder onContainer(Function<DynamicBimodalPalette, Integer> onContainer) {
            this.onContainer = onContainer;
            return this;
        }

        public Builder onContainerVariant(Function<DynamicBimodalPalette, Integer> onContainerVariant) {
            this.onContainerVariant = onContainerVariant;
            return this;
        }

        public Builder containerOutline(Function<DynamicBimodalPalette, Integer> containerOutline) {
            this.containerOutline = containerOutline;
            return this;
        }

        public Builder containerOutlineVariant(Function<DynamicBimodalPalette, Integer> containerOutlineVariant) {
            this.containerOutlineVariant = containerOutlineVariant;
            return this;
        }

        public Builder containerSurfaceDisabledAlpha(
            Function<DynamicBimodalPalette, Float> containerSurfaceDisabledAlpha) {
            this.containerSurfaceDisabledAlpha = containerSurfaceDisabledAlpha;
            return this;
        }

        public Builder onContainerDisabledAlpha(
            Function<DynamicBimodalPalette, Float> onContainerDisabledAlpha) {
            this.onContainerDisabledAlpha = onContainerDisabledAlpha;
            return this;
        }

        public Builder containerOutlineDisabledAlpha(
            Function<DynamicBimodalPalette, Float> containerOutlineDisabledAlpha) {
            this.containerOutlineDisabledAlpha = containerOutlineDisabledAlpha;
            return this;
        }

        public Builder inverseContainerSurface(
            Function<DynamicBimodalPalette, Integer> inverseContainerSurface) {
            this.inverseContainerSurface = inverseContainerSurface;
            return this;
        }

        public Builder inverseOnContainer(Function<DynamicBimodalPalette, Integer> inverseOnContainer) {
            this.inverseOnContainer = inverseOnContainer;
            return this;
        }

        public Builder inverseContainerOutline(
            Function<DynamicBimodalPalette, Integer> inverseContainerOutline) {
            this.inverseContainerOutline = inverseContainerOutline;
            return this;
        }

        public Builder complementaryOnContainer(
            Function<DynamicBimodalPalette, Integer> complementaryOnContainer) {
            this.complementaryOnContainer = complementaryOnContainer;
            return this;
        }

        public Builder complementaryContainerOutline(
            Function<DynamicBimodalPalette, Integer> complementaryContainerOutline) {
            this.complementaryContainerOutline = complementaryContainerOutline;
            return this;
        }

        public BimodalPaletteContainerColorsResolverOverlay build() {
            BimodalPaletteContainerColorsResolverOverlay result = new BimodalPaletteContainerColorsResolverOverlay();
            result.containerSurfaceLowest = this.containerSurfaceLowest;
            result.containerSurfaceLow = this.containerSurfaceLow;
            result.containerSurface = this.containerSurface;
            result.containerSurfaceHigh = this.containerSurfaceHigh;
            result.containerSurfaceHighest = this.containerSurfaceHighest;
            result.containerSurfaceDim = this.containerSurfaceDim;
            result.containerSurfaceBright = this.containerSurfaceBright;
            result.onContainer = this.onContainer;
            result.onContainerVariant = this.onContainerVariant;
            result.containerOutline = this.containerOutline;
            result.containerOutlineVariant = this.containerOutlineVariant;
            result.containerSurfaceDisabledAlpha = this.containerSurfaceDisabledAlpha;
            result.onContainerDisabledAlpha = this.onContainerDisabledAlpha;
            result.containerOutlineDisabledAlpha = this.containerOutlineDisabledAlpha;
            result.inverseContainerSurface = this.inverseContainerSurface;
            result.inverseOnContainer = this.inverseOnContainer;
            result.inverseContainerOutline = this.inverseContainerOutline;
            result.complementaryOnContainer = this.complementaryOnContainer;
            result.complementaryContainerOutline = this.complementaryContainerOutline;
            return result;
        }
    }
}
