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

public class SchemeColorResolverOverlay {
    private SchemeContainerColorsResolverOverlay neutralContainerResolverOverlay;
    private SchemeContainerColorsResolverOverlay mutedContainerResolverOverlay;
    private SchemeContainerColorsResolverOverlay tonalContainerResolverOverlay;
    private SchemeContainerColorsResolverOverlay primaryContainerResolverOverlay;

    public static Builder builder() {
        return new Builder();
    }

    private SchemeColorResolverOverlay() {}

    public SchemeContainerColorsResolverOverlay getNeutralContainerResolverOverlay() {
        return this.neutralContainerResolverOverlay;
    }

    public SchemeContainerColorsResolverOverlay getMutedContainerResolverOverlay() {
        return this.mutedContainerResolverOverlay;
    }

    public SchemeContainerColorsResolverOverlay getTonalContainerResolverOverlay() {
        return this.tonalContainerResolverOverlay;
    }

    public SchemeContainerColorsResolverOverlay getPrimaryContainerResolverOverlay() {
        return this.primaryContainerResolverOverlay;
    }

    public final static class Builder {
        private SchemeContainerColorsResolverOverlay neutralContainerResolverOverlay;
        private SchemeContainerColorsResolverOverlay mutedContainerResolverOverlay;
        private SchemeContainerColorsResolverOverlay tonalContainerResolverOverlay;
        private SchemeContainerColorsResolverOverlay primaryContainerResolverOverlay;

        private Builder() {}

        public Builder neutralContainerResolverOverlay(
            SchemeContainerColorsResolverOverlay neutralContainerResolverOverlay) {
            this.neutralContainerResolverOverlay = neutralContainerResolverOverlay;
            return this;
        }

        public Builder mutedContainerResolverOverlay(
            SchemeContainerColorsResolverOverlay mutedContainerResolverOverlay) {
            this.mutedContainerResolverOverlay = mutedContainerResolverOverlay;
            return this;
        }

        public Builder tonalContainerResolverOverlay(
            SchemeContainerColorsResolverOverlay tonalContainerResolverOverlay) {
            this.tonalContainerResolverOverlay = tonalContainerResolverOverlay;
            return this;
        }

        public Builder primaryContainerResolverOverlay(
            SchemeContainerColorsResolverOverlay primaryContainerResolverOverlay) {
            this.primaryContainerResolverOverlay = primaryContainerResolverOverlay;
            return this;
        }

        public SchemeColorResolverOverlay build() {
            SchemeColorResolverOverlay result = new SchemeColorResolverOverlay();
            result.neutralContainerResolverOverlay = this.neutralContainerResolverOverlay;
            result.mutedContainerResolverOverlay = this.mutedContainerResolverOverlay;
            result.tonalContainerResolverOverlay = this.tonalContainerResolverOverlay;
            result.primaryContainerResolverOverlay = this.primaryContainerResolverOverlay;
            return result;
        }
    }
}
