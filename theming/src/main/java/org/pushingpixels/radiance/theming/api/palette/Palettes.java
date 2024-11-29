/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.theming.api.ComponentState;

import java.util.HashMap;
import java.util.Map;

public class Palettes {
    private TonalPalette neutralPalette;
    private TonalPalette neutralVariantPalette;
    private TonalPalette primaryPalette;
    private Map<ComponentState, TonalPalette> statePalettes;

    private Palettes(TonalPalette neutralPalette, TonalPalette neutralVariantPalette, TonalPalette primaryPalette, Map<ComponentState, TonalPalette> statePalettes) {
        this.neutralPalette = neutralPalette;
        this.neutralVariantPalette = neutralVariantPalette;
        this.primaryPalette = primaryPalette;
        this.statePalettes = statePalettes;
    }

    public TonalPalette getNeutralPalette() {
        return neutralPalette;
    }

    public TonalPalette getNeutralVariantPalette() {
        return neutralVariantPalette;
    }

    public TonalPalette getPrimaryPalette() {
        return primaryPalette;
    }

    public Map<ComponentState, TonalPalette> getStatePalettes() {
        return statePalettes;
    }

    public static Palettes.Builder builder() {
        return new Palettes.Builder();
    }

    public static class Builder {
        private TonalPalette neutralPalette;
        private TonalPalette neutralVariantPalette;
        private TonalPalette primaryPalette;
        private Map<ComponentState, TonalPalette> statePalettes = new HashMap<>();

        public Builder setNeutralPalette(TonalPalette neutralPalette) {
            this.neutralPalette = neutralPalette;
            return this;
        }

        public Builder setNeutralVariantPalette(TonalPalette neutralVariantPalette) {
            this.neutralVariantPalette = neutralVariantPalette;
            return this;
        }

        public Builder setPrimaryPalette(TonalPalette primaryPalette) {
            this.primaryPalette = primaryPalette;
            return this;
        }

        public Builder setStatePalettes(Map<ComponentState, TonalPalette> statePalettes) {
            this.statePalettes.clear();
            this.statePalettes.putAll(statePalettes);
            return this;
        }

        public Palettes build() {
            return new Palettes(this.neutralPalette, this.neutralVariantPalette,
                    this.primaryPalette, this.statePalettes);
        }
    }
}