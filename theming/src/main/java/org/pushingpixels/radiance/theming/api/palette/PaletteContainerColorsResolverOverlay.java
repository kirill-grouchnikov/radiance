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
package org.pushingpixels.radiance.theming.api.palette;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;

import java.util.function.Function;

public class PaletteContainerColorsResolverOverlay {
    private Function<DynamicPalette, Integer> surface;
    private Function<DynamicPalette, Integer> surfaceDim;
    private Function<DynamicPalette, Integer> surfaceBright;
    private Function<DynamicPalette, Integer> containerSurfaceLowest;
    private Function<DynamicPalette, Integer> containerSurfaceLow;
    private Function<DynamicPalette, Integer> containerSurface;
    private Function<DynamicPalette, Integer> containerSurfaceHigh;
    private Function<DynamicPalette, Integer> containerSurfaceHighest;
    private Function<DynamicPalette, Integer> onContainer;
    private Function<DynamicPalette, Integer> onContainerVariant;
    private Function<DynamicPalette, Integer> containerOutline;
    private Function<DynamicPalette, Integer> containerOutlineVariant;
    private Function<DynamicPalette, Float> containerSurfaceDisabledAlpha;
    private Function<DynamicPalette, Float> onContainerDisabledAlpha;
    private Function<DynamicPalette, Float> containerOutlineDisabledAlpha;

    public static Builder builder() {
        return new Builder();
    }

    private PaletteContainerColorsResolverOverlay() {}

    public Function<DynamicPalette, Integer> getSurface() {
        return this.surface;
    }

    public Function<DynamicPalette, Integer> getSurfaceDim() {
        return this.surfaceDim;
    }

    public Function<DynamicPalette, Integer> getSurfaceBright() {
        return this.surfaceBright;
    }

    public Function<DynamicPalette, Integer> getContainerSurfaceLowest() {
        return this.containerSurfaceLowest;
    }

    public Function<DynamicPalette, Integer> getContainerSurfaceLow() {
        return this.containerSurfaceLow;
    }

    public Function<DynamicPalette, Integer> getContainerSurface() {
        return this.containerSurface;
    }

    public Function<DynamicPalette, Integer> getContainerSurfaceHigh() {
        return this.containerSurfaceHigh;
    }

    public Function<DynamicPalette, Integer> getContainerSurfaceHighest() {
        return this.containerSurfaceHighest;
    }

    public Function<DynamicPalette, Integer> getOnContainer() {
        return this.onContainer;
    }

    public Function<DynamicPalette, Integer> getOnContainerVariant() {
        return this.onContainerVariant;
    }

    public Function<DynamicPalette, Integer> getContainerOutline() {
        return this.containerOutline;
    }

    public Function<DynamicPalette, Integer> getContainerOutlineVariant() {
        return this.containerOutlineVariant;
    }

    public Function<DynamicPalette, Float> getContainerSurfaceDisabledAlpha() {
        return this.containerSurfaceDisabledAlpha;
    }

    public Function<DynamicPalette, Float> getOnContainerDisabledAlpha() {
        return this.onContainerDisabledAlpha;
    }

    public Function<DynamicPalette, Float> getContainerOutlineDisabledAlpha() {
        return this.containerOutlineDisabledAlpha;
    }

    public final static class Builder {
        private Function<DynamicPalette, Integer> surface;
        private Function<DynamicPalette, Integer> surfaceDim;
        private Function<DynamicPalette, Integer> surfaceBright;
        private Function<DynamicPalette, Integer> containerSurfaceLowest;
        private Function<DynamicPalette, Integer> containerSurfaceLow;
        private Function<DynamicPalette, Integer> containerSurface;
        private Function<DynamicPalette, Integer> containerSurfaceHigh;
        private Function<DynamicPalette, Integer> containerSurfaceHighest;
        private Function<DynamicPalette, Integer> onContainer;
        private Function<DynamicPalette, Integer> onContainerVariant;
        private Function<DynamicPalette, Integer> containerOutline;
        private Function<DynamicPalette, Integer> containerOutlineVariant;
        private Function<DynamicPalette, Float> containerSurfaceDisabledAlpha;
        private Function<DynamicPalette, Float> onContainerDisabledAlpha;
        private Function<DynamicPalette, Float> containerOutlineDisabledAlpha;

        private Builder() {}

        public Builder surface(Function<DynamicPalette, Integer> surface) {
            this.surface = surface;
            return this;
        }

        public Builder surfaceDim(Function<DynamicPalette, Integer> surfaceDim) {
            this.surfaceDim = surfaceDim;
            return this;
        }

        public Builder surfaceBright(Function<DynamicPalette, Integer> surfaceBright) {
            this.surfaceBright = surfaceBright;
            return this;
        }

        public Builder containerSurfaceLowest(Function<DynamicPalette, Integer> containerSurfaceLowest) {
            this.containerSurfaceLowest = containerSurfaceLowest;
            return this;
        }

        public Builder containerSurfaceLow(Function<DynamicPalette, Integer> containerSurfaceLow) {
            this.containerSurfaceLow = containerSurfaceLow;
            return this;
        }

        public Builder containerSurface(Function<DynamicPalette, Integer> containerSurface) {
            this.containerSurface = containerSurface;
            return this;
        }

        public Builder containerSurfaceHigh(Function<DynamicPalette, Integer> containerSurfaceHigh) {
            this.containerSurfaceHigh = containerSurfaceHigh;
            return this;
        }

        public Builder containerSurfaceHighest(Function<DynamicPalette, Integer> containerSurfaceHighest) {
            this.containerSurfaceHighest = containerSurfaceHighest;
            return this;
        }

        public Builder onContainer(Function<DynamicPalette, Integer> onContainer) {
            this.onContainer = onContainer;
            return this;
        }

        public Builder onContainerVariant(Function<DynamicPalette, Integer> onContainerVariant) {
            this.onContainerVariant = onContainerVariant;
            return this;
        }

        public Builder containerOutline(Function<DynamicPalette, Integer> containerOutline) {
            this.containerOutline = containerOutline;
            return this;
        }

        public Builder containerOutlineVariant(Function<DynamicPalette, Integer> containerOutlineVariant) {
            this.containerOutlineVariant = containerOutlineVariant;
            return this;
        }

        public Builder containerSurfaceDisabledAlpha(
            Function<DynamicPalette, Float> containerSurfaceDisabledAlpha) {
            this.containerSurfaceDisabledAlpha = containerSurfaceDisabledAlpha;
            return this;
        }

        public Builder onContainerDisabledAlpha(
            Function<DynamicPalette, Float> onContainerDisabledAlpha) {
            this.onContainerDisabledAlpha = onContainerDisabledAlpha;
            return this;
        }

        public Builder containerOutlineDisabledAlpha(
            Function<DynamicPalette, Float> containerOutlineDisabledAlpha) {
            this.containerOutlineDisabledAlpha = containerOutlineDisabledAlpha;
            return this;
        }

        public PaletteContainerColorsResolverOverlay build() {
            PaletteContainerColorsResolverOverlay result = new PaletteContainerColorsResolverOverlay();
            result.surface = this.surface;
            result.surfaceDim = this.surfaceDim;
            result.surfaceBright = this.surfaceBright;
            result.containerSurfaceLowest = this.containerSurfaceLowest;
            result.containerSurfaceLow = this.containerSurfaceLow;
            result.containerSurface = this.containerSurface;
            result.containerSurfaceHigh = this.containerSurfaceHigh;
            result.containerSurfaceHighest = this.containerSurfaceHighest;
            result.onContainer = this.onContainer;
            result.onContainerVariant = this.onContainerVariant;
            result.containerOutline = this.containerOutline;
            result.containerOutlineVariant = this.containerOutlineVariant;
            result.containerSurfaceDisabledAlpha = this.containerSurfaceDisabledAlpha;
            result.onContainerDisabledAlpha = this.onContainerDisabledAlpha;
            result.containerOutlineDisabledAlpha = this.containerOutlineDisabledAlpha;
            return result;
        }
    }
}
