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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;

import java.util.function.Function;

public class SchemeContainerColorsResolverOverlay {
    private Function<DynamicScheme, Integer> containerOutline;
    private Function<DynamicScheme, Integer> containerOutlineVariant;

    public static Builder builder() {
        return new Builder();
    }

    private SchemeContainerColorsResolverOverlay() {}

    public Function<DynamicScheme, Integer> getContainerOutline() {
        return this.containerOutline;
    }

    public Function<DynamicScheme, Integer> getContainerOutlineVariant() {
        return this.containerOutlineVariant;
    }

    public final static class Builder {
        private Function<DynamicScheme, Integer> containerOutline;
        private Function<DynamicScheme, Integer> containerOutlineVariant;

        private Builder() {}

        public Builder containerOutlineOverlay(
            Function<DynamicScheme, Integer> containerOutline) {
            this.containerOutline = containerOutline;
            return this;
        }

        public Builder containerOutlineVariantOverlay(
            Function<DynamicScheme, Integer> containerOutlineVariant) {
            this.containerOutlineVariant = containerOutlineVariant;
            return this;
        }

        public SchemeContainerColorsResolverOverlay build() {
            SchemeContainerColorsResolverOverlay result = new SchemeContainerColorsResolverOverlay();
            result.containerOutline = containerOutline;
            result.containerOutlineVariant = containerOutlineVariant;
            return result;
        }
    }
}
