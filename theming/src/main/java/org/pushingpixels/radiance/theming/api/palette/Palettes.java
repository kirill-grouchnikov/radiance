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

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.theming.api.ComponentState;

import java.util.HashMap;
import java.util.Map;

public class Palettes {
    private boolean isFidelity;
    private Hct primarySourceHct;
    private Hct mutedSourceHct;
    private Hct neutralSourceHct;
    private TonalPalette primaryPalette;
    private TonalPalette mutedPalette;
    private TonalPalette neutralPalette;
    private Map<ComponentState, TonalPalette> statePalettes;
    private TonalPalette systemInfoPalette;
    private TonalPalette systemWarningPalette;
    private TonalPalette systemErrorPalette;
    private TonalPalette systemSuccessPalette;
    private TonalPalette systemEmergencyPalette;

    private Palettes(boolean isFidelity,
        Hct primarySourceHct, Hct mutedSourceHct, Hct neutralSourceHct,
        TonalPalette primaryPalette, TonalPalette mutedPalette, TonalPalette neutralPalette,
        Map<ComponentState, TonalPalette> statePalettes,
        TonalPalette systemInfoPalette, TonalPalette systemWarningPalette, TonalPalette systemErrorPalette,
        TonalPalette systemSuccessPalette, TonalPalette systemEmergencyPalette) {

        this.isFidelity = isFidelity;
        this.primarySourceHct = primarySourceHct;
        this.mutedSourceHct = mutedSourceHct;
        this.neutralSourceHct = neutralSourceHct;
        this.primaryPalette = primaryPalette;
        this.neutralPalette = neutralPalette;
        this.mutedPalette = mutedPalette;
        this.statePalettes = statePalettes;
        this.systemInfoPalette = systemInfoPalette;
        this.systemWarningPalette = systemWarningPalette;
        this.systemErrorPalette = systemErrorPalette;
        this.systemSuccessPalette = systemSuccessPalette;
        this.systemEmergencyPalette = systemEmergencyPalette;
    }

    public boolean isFidelity() {
        return this.isFidelity;
    }

    public Hct getPrimarySourceHct() {
        return this.primarySourceHct;
    }

    public Hct getMutedSourceHct() {
        return this.mutedSourceHct;
    }

    public Hct getNeutralSourceHct() {
        return this.neutralSourceHct;
    }

    public TonalPalette getPrimaryPalette() {
        return this.primaryPalette;
    }

    public TonalPalette getNeutralPalette() {
        return this.neutralPalette;
    }

    public TonalPalette getMutedPalette() {
        return this.mutedPalette;
    }

    public Map<ComponentState, TonalPalette> getStatePalettes() {
        return this.statePalettes;
    }

    public TonalPalette getSystemInfoPalette() {
        return this.systemInfoPalette;
    }

    public TonalPalette getSystemWarningPalette() {
        return this.systemWarningPalette;
    }

    public TonalPalette getSystemErrorPalette() {
        return this.systemErrorPalette;
    }

    public TonalPalette getSystemSuccessPalette() {
        return this.systemSuccessPalette;
    }

    public TonalPalette getSystemEmergencyPalette() {
        return this.systemEmergencyPalette;
    }

    public static Palettes.Builder builder() {
        return new Palettes.Builder();
    }

    public static class Builder {
        private boolean isFidelity;
        private Hct primarySourceHct;
        private Hct mutedSourceHct;
        private Hct neutralSourceHct;
        private TonalPalette primaryPalette;
        private TonalPalette mutedPalette;
        private TonalPalette neutralPalette;
        private Map<ComponentState, TonalPalette> statePalettes = new HashMap<>();

        // TODO - TONAL: Does this need to be configured by the app side?
        private TonalPalette systemInfoPalette = TonalPalette.fromInt(0xFF95C1DB);
        private TonalPalette systemWarningPalette = TonalPalette.fromInt(0xFFE237);
        private TonalPalette systemErrorPalette = TonalPalette.fromInt(0xFFFF7829);
        private TonalPalette systemSuccessPalette = TonalPalette.fromInt(0xFF068B3A);
        private TonalPalette systemEmergencyPalette = TonalPalette.fromInt(0xFFD72A17);

        public Builder setFidelity(boolean fidelity) {
            this.isFidelity = fidelity;
            return this;
        }

        public Builder setPrimarySourceHct(Hct primarySourceHct) {
            this.primarySourceHct = primarySourceHct;
            return this;
        }

        public Builder setMutedSourceHct(Hct mutedSourceHct) {
            this.mutedSourceHct = mutedSourceHct;
            return this;
        }

        public Builder setNeutralSourceHct(Hct neutralSourceHct) {
            this.neutralSourceHct = neutralSourceHct;
            return this;
        }

        public Builder setPrimaryPalette(TonalPalette primaryPalette) {
            this.primaryPalette = primaryPalette;
            return this;
        }

        public Builder setMutedPalette(TonalPalette mutedPalette) {
            this.mutedPalette = mutedPalette;
            return this;
        }

        public Builder setNeutralPalette(TonalPalette neutralPalette) {
            this.neutralPalette = neutralPalette;
            return this;
        }

        public Builder setStatePalettes(Map<ComponentState, TonalPalette> statePalettes) {
            this.statePalettes.clear();
            this.statePalettes.putAll(statePalettes);
            return this;
        }

        public Palettes build() {
            return new Palettes(
                this.isFidelity, this.primarySourceHct, this.mutedSourceHct, this.neutralSourceHct,
                this.primaryPalette, this.mutedPalette, this.neutralPalette, this.statePalettes,
                this.systemInfoPalette, this.systemWarningPalette, this.systemErrorPalette,
                this.systemSuccessPalette, this.systemEmergencyPalette);
        }
    }
}