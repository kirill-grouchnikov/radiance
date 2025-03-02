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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;

import java.util.function.Function;

public class SchemeContainerColorsResolverOverlay {
    private Function<DynamicScheme, Integer> containerSurfaceLowest;
    private Function<DynamicScheme, Integer> containerSurfaceLow;
    private Function<DynamicScheme, Integer> containerSurface;
    private Function<DynamicScheme, Integer> containerSurfaceHigh;
    private Function<DynamicScheme, Integer> containerSurfaceHighest;
    private Function<DynamicScheme, Integer> containerSurfaceDim;
    private Function<DynamicScheme, Integer> containerSurfaceBright;
    private Function<DynamicScheme, Integer> onContainer;
    private Function<DynamicScheme, Integer> onContainerVariant;
    private Function<DynamicScheme, Integer> containerOutline;
    private Function<DynamicScheme, Integer> containerOutlineVariant;
    private Function<DynamicScheme, Float> containerSurfaceDisabledAlpha;
    private Function<DynamicScheme, Float> onContainerDisabledAlpha;
    private Function<DynamicScheme, Float> containerOutlineDisabledAlpha;
    private Function<DynamicScheme, Integer> inverseContainerSurface;
    private Function<DynamicScheme, Integer> inverseOnContainer;
    private Function<DynamicScheme, Integer> inverseContainerOutline;
    private Function<DynamicScheme, Integer> complementaryOnContainer;
    private Function<DynamicScheme, Integer> complementaryContainerOutline;

    public static Builder builder() {
        return new Builder();
    }

    private SchemeContainerColorsResolverOverlay() {}

    public Function<DynamicScheme, Integer> getContainerSurfaceLowest() {
        return this.containerSurfaceLowest;
    }

    public Function<DynamicScheme, Integer> getContainerSurfaceLow() {
        return this.containerSurfaceLow;
    }

    public Function<DynamicScheme, Integer> getContainerSurface() {
        return this.containerSurface;
    }

    public Function<DynamicScheme, Integer> getContainerSurfaceHigh() {
        return this.containerSurfaceHigh;
    }

    public Function<DynamicScheme, Integer> getContainerSurfaceHighest() {
        return this.containerSurfaceHighest;
    }

    public Function<DynamicScheme, Integer> getContainerSurfaceDim() {
        return this.containerSurfaceDim;
    }

    public Function<DynamicScheme, Integer> getContainerSurfaceBright() {
        return this.containerSurfaceBright;
    }

    public Function<DynamicScheme, Integer> getOnContainer() {
        return this.onContainer;
    }

    public Function<DynamicScheme, Integer> getOnContainerVariant() {
        return this.onContainerVariant;
    }

    public Function<DynamicScheme, Integer> getContainerOutline() {
        return this.containerOutline;
    }

    public Function<DynamicScheme, Integer> getContainerOutlineVariant() {
        return this.containerOutlineVariant;
    }

    public Function<DynamicScheme, Float> getContainerSurfaceDisabledAlpha() {
        return this.containerSurfaceDisabledAlpha;
    }

    public Function<DynamicScheme, Float> getOnContainerDisabledAlpha() {
        return this.onContainerDisabledAlpha;
    }

    public Function<DynamicScheme, Float> getContainerOutlineDisabledAlpha() {
        return this.containerOutlineDisabledAlpha;
    }

    public Function<DynamicScheme, Integer> getInverseContainerSurface() {
        return this.inverseContainerSurface;
    }

    public Function<DynamicScheme, Integer> getInverseOnContainer() {
        return this.inverseOnContainer;
    }

    public Function<DynamicScheme, Integer> getInverseContainerOutline() {
        return this.inverseContainerOutline;
    }

    public Function<DynamicScheme, Integer> getComplementaryOnContainer() {
        return this.complementaryOnContainer;
    }

    public Function<DynamicScheme, Integer> getComplementaryContainerOutline() {
        return this.complementaryContainerOutline;
    }

    public final static class Builder {
        private Function<DynamicScheme, Integer> containerSurfaceLowest;
        private Function<DynamicScheme, Integer> containerSurfaceLow;
        private Function<DynamicScheme, Integer> containerSurface;
        private Function<DynamicScheme, Integer> containerSurfaceHigh;
        private Function<DynamicScheme, Integer> containerSurfaceHighest;
        private Function<DynamicScheme, Integer> containerSurfaceDim;
        private Function<DynamicScheme, Integer> containerSurfaceBright;
        private Function<DynamicScheme, Integer> onContainer;
        private Function<DynamicScheme, Integer> onContainerVariant;
        private Function<DynamicScheme, Integer> containerOutline;
        private Function<DynamicScheme, Integer> containerOutlineVariant;
        private Function<DynamicScheme, Float> containerSurfaceDisabledAlpha;
        private Function<DynamicScheme, Float> onContainerDisabledAlpha;
        private Function<DynamicScheme, Float> containerOutlineDisabledAlpha;
        private Function<DynamicScheme, Integer> inverseContainerSurface;
        private Function<DynamicScheme, Integer> inverseOnContainer;
        private Function<DynamicScheme, Integer> inverseContainerOutline;
        private Function<DynamicScheme, Integer> complementaryOnContainer;
        private Function<DynamicScheme, Integer> complementaryContainerOutline;

        private Builder() {}

        public Builder containerSurfaceLowest(Function<DynamicScheme, Integer> containerSurfaceLowest) {
            this.containerSurfaceLowest = containerSurfaceLowest;
            return this;
        }

        public Builder containerSurfaceLow(Function<DynamicScheme, Integer> containerSurfaceLow) {
            this.containerSurfaceLow = containerSurfaceLow;
            return this;
        }

        public Builder containerSurface(Function<DynamicScheme, Integer> containerSurface) {
            this.containerSurface = containerSurface;
            return this;
        }

        public Builder containerSurfaceHigh(Function<DynamicScheme, Integer> containerSurfaceHigh) {
            this.containerSurfaceHigh = containerSurfaceHigh;
            return this;
        }

        public Builder containerSurfaceHighest(Function<DynamicScheme, Integer> containerSurfaceHighest) {
            this.containerSurfaceHighest = containerSurfaceHighest;
            return this;
        }

        public Builder containerSurfaceDim(Function<DynamicScheme, Integer> containerSurfaceDim) {
            this.containerSurfaceDim = containerSurfaceDim;
            return this;
        }

        public Builder containerSurfaceBright(Function<DynamicScheme, Integer> containerSurfaceBright) {
            this.containerSurfaceBright = containerSurfaceBright;
            return this;
        }

        public Builder onContainer(Function<DynamicScheme, Integer> onContainer) {
            this.onContainer = onContainer;
            return this;
        }

        public Builder onContainerVariant(Function<DynamicScheme, Integer> onContainerVariant) {
            this.onContainerVariant = onContainerVariant;
            return this;
        }

        public Builder containerOutline(Function<DynamicScheme, Integer> containerOutline) {
            this.containerOutline = containerOutline;
            return this;
        }

        public Builder containerOutlineVariant(Function<DynamicScheme, Integer> containerOutlineVariant) {
            this.containerOutlineVariant = containerOutlineVariant;
            return this;
        }

        public Builder containerSurfaceDisabledAlpha(
            Function<DynamicScheme, Float> containerSurfaceDisabledAlpha) {
            this.containerSurfaceDisabledAlpha = containerSurfaceDisabledAlpha;
            return this;
        }

        public Builder onContainerDisabledAlpha(
            Function<DynamicScheme, Float> onContainerDisabledAlpha) {
            this.onContainerDisabledAlpha = onContainerDisabledAlpha;
            return this;
        }

        public Builder containerOutlineDisabledAlpha(
            Function<DynamicScheme, Float> containerOutlineDisabledAlpha) {
            this.containerOutlineDisabledAlpha = containerOutlineDisabledAlpha;
            return this;
        }

        public Builder inverseContainerSurface(Function<DynamicScheme, Integer> inverseContainerSurface) {
            this.inverseContainerSurface = inverseContainerSurface;
            return this;
        }

        public Builder inverseOnContainer(Function<DynamicScheme, Integer> inverseOnContainer) {
            this.inverseOnContainer = inverseOnContainer;
            return this;
        }

        public Builder inverseContainerOutline(Function<DynamicScheme, Integer> inverseContainerOutline) {
            this.inverseContainerOutline = inverseContainerOutline;
            return this;
        }

        public Builder complementaryOnContainer(Function<DynamicScheme, Integer> complementaryOnContainer) {
            this.complementaryOnContainer = complementaryOnContainer;
            return this;
        }

        public Builder complementaryContainerOutline(Function<DynamicScheme, Integer> complementaryContainerOutline) {
            this.complementaryContainerOutline = complementaryContainerOutline;
            return this;
        }

        public SchemeContainerColorsResolverOverlay build() {
            SchemeContainerColorsResolverOverlay result = new SchemeContainerColorsResolverOverlay();
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
