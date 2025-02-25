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
import org.pushingpixels.ephemeral.chroma.palettes.BaseTonalPalette;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;

public class Palettes {
    private boolean isFidelity;
    private BaseTonalPalette primaryPalette;
    private BaseTonalPalette mutedPalette;
    private BaseTonalPalette neutralPalette;
    private double primarySourceTone;
    private double mutedSourceTone;
    private double neutralSourceTone;
    private Hct systemInfoSourceHct;
    private Hct systemWarningSourceHct;
    private Hct systemErrorSourceHct;
    private Hct systemSuccessSourceHct;
    private Hct systemEmergencySourceHct;

    private Palettes(boolean isFidelity,
        BaseTonalPalette primaryPalette, BaseTonalPalette mutedPalette, BaseTonalPalette neutralPalette,
        double primarySourceTone, double mutedSourceTone, double neutralSourceTone,
        Hct systemInfoSourceHct, Hct systemWarningSourceHct, Hct systemErrorSourceHct,
        Hct systemSuccessSourceHct, Hct systemEmergencySourceHct) {

        this.isFidelity = isFidelity;
        this.primaryPalette = primaryPalette;
        this.neutralPalette = neutralPalette;
        this.mutedPalette = mutedPalette;
        this.primarySourceTone = primarySourceTone;
        this.mutedSourceTone = mutedSourceTone;
        this.neutralSourceTone = neutralSourceTone;
        this.systemInfoSourceHct = systemInfoSourceHct;
        this.systemWarningSourceHct = systemWarningSourceHct;
        this.systemErrorSourceHct = systemErrorSourceHct;
        this.systemSuccessSourceHct = systemSuccessSourceHct;
        this.systemEmergencySourceHct = systemEmergencySourceHct;
    }

    public boolean isFidelity() {
        return this.isFidelity;
    }

    public double getPrimarySourceTone() {
        return primarySourceTone;
    }

    public double getMutedSourceTone() {
        return this.mutedSourceTone;
    }

    public double getNeutralSourceTone() {
        return this.neutralSourceTone;
    }

    public BaseTonalPalette getPrimaryPalette() {
        return this.primaryPalette;
    }

    public BaseTonalPalette getNeutralPalette() {
        return this.neutralPalette;
    }

    public BaseTonalPalette getMutedPalette() {
        return this.mutedPalette;
    }

    public Hct getSystemInfoSourceHct() {
        return this.systemInfoSourceHct;
    }

    public Hct getSystemWarningSourceHct() {
        return this.systemWarningSourceHct;
    }

    public Hct getSystemErrorSourceHct() {
        return this.systemErrorSourceHct;
    }

    public Hct getSystemSuccessSourceHct() {
        return this.systemSuccessSourceHct;
    }

    public Hct getSystemEmergencySourceHct() {
        return this.systemEmergencySourceHct;
    }

    public static Palettes.Builder builder() {
        return new Palettes.Builder();
    }

    public static class Builder {
        private boolean isFidelity;
        private TonalPalette primaryPalette;
        private TonalPalette mutedPalette;
        private TonalPalette neutralPalette;
        private double primarySourceTone;
        private double mutedSourceTone;
        private double neutralSourceTone;

        // TODO - TONAL: Does this need to be configured by the app side?
        private Hct systemInfoSourceHct = Hct.fromInt(0xFF95C1DB);
        private Hct systemWarningSourceHct = Hct.fromInt(0xFFE237);
        private Hct systemErrorSourceHct = Hct.fromInt(0xFFFF7829);
        private Hct systemSuccessSourceHct = Hct.fromInt(0xFF068B3A);
        private Hct systemEmergencySourceHct = Hct.fromInt(0xFFD72A17);

        public Builder setFidelity(boolean fidelity) {
            this.isFidelity = fidelity;
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

        public Builder setPrimarySourceTone(double primarySourceTone) {
            this.primarySourceTone = primarySourceTone;
            return this;
        }

        public Builder setMutedSourceTone(double mutedSourceTone) {
            this.mutedSourceTone = mutedSourceTone;
            return this;
        }

        public Builder setNeutralSourceTone(double neutralSourceTone) {
            this.neutralSourceTone = neutralSourceTone;
            return this;
        }

        public Palettes build() {
            return new Palettes(
                this.isFidelity,
                this.primaryPalette, this.mutedPalette, this.neutralPalette,
                this.primarySourceTone, this.mutedSourceTone, this.neutralSourceTone,
                this.systemInfoSourceHct, this.systemWarningSourceHct, this.systemErrorSourceHct,
                this.systemSuccessSourceHct, this.systemEmergencySourceHct);
        }
    }
}