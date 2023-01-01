/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.colorscheme.*;

import java.awt.*;

public class BladeColorScheme implements RadianceColorScheme {
    public String displayName = "";
    public boolean isDark = false;
    public Color ultraLight = Color.white;
    public Color extraLight = Color.white;
    public Color light = Color.white;
    public Color mid = Color.white;
    public Color dark = Color.white;
    public Color ultraDark = Color.white;
    public Color foreground = Color.black;
    public Color backgroundFill = Color.white;
    public Color accentedBackgroundFill = Color.white;
    public Color focusRing = Color.white;
    public Color line = Color.white;
    public Color selectionForeground = Color.white;
    public Color selectionBackground = Color.white;
    public Color textBackgroundFill = Color.white;
    public Color separatorPrimary = Color.white;
    public Color separatorSecondary = Color.white;
    public Color mark = Color.white;
    public Color echo = Color.white;

    @Override
    public String getDisplayName() {
        return this.displayName;
    }

    @Override
    public boolean isDark() {
        return this.isDark;
    }

    @Override
    public Color getForegroundColor() {
        return this.foreground;
    }

    @Override
    public Color getUltraLightColor() {
        return this.ultraLight;
    }

    @Override
    public Color getExtraLightColor() {
        return this.extraLight;
    }

    @Override
    public Color getLightColor() {
        return this.light;
    }

    @Override
    public Color getMidColor() {
        return this.mid;
    }

    @Override
    public Color getDarkColor() {
        return this.dark;
    }

    @Override
    public Color getUltraDarkColor() {
        return this.ultraDark;
    }

    @Override
    public Color getLineColor() {
        return this.line;
    }

    @Override
    public Color getSelectionBackgroundColor() {
        return this.selectionBackground;
    }

    @Override
    public Color getSelectionForegroundColor() {
        return this.selectionForeground;
    }

    @Override
    public Color getBackgroundFillColor() {
        return this.backgroundFill;
    }

    @Override
    public Color getAccentedBackgroundFillColor() {
        return this.accentedBackgroundFill;
    }

    @Override
    public Color getTextBackgroundFillColor() {
        return this.textBackgroundFill;
    }

    @Override
    public Color getFocusRingColor() {
        return this.focusRing;
    }

    @Override
    public Color getSeparatorPrimaryColor() {
        return this.separatorPrimary;
    }

    @Override
    public Color getSeparatorSecondaryColor() {
        return this.separatorSecondary;
    }

    @Override
    public Color getMarkColor() {
        return this.mark;
    }

    @Override
    public Color getEchoColor() {
        return this.echo;
    }

    @Override
    public RadianceColorScheme shift(Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor, double foregroundShiftFactor) {
        return new ShiftColorScheme(this, backgroundShiftColor, backgroundShiftFactor, foregroundShiftColor, foregroundShiftFactor, true);
    }

    @Override
    public RadianceColorScheme shiftBackground(Color backgroundShiftColor, double backgroundShiftFactor) {
        return this.shift(backgroundShiftColor, backgroundShiftFactor, null, 0.0);
    }

    @Override
    public RadianceColorScheme tint(double tintFactor) {
        return new TintColorScheme(this, tintFactor);
    }

    @Override
    public RadianceColorScheme tone(double toneFactor) {
        return new ToneColorScheme(this, toneFactor);
    }

    @Override
    public RadianceColorScheme shade(double shadeFactor) {
        return new ShadeColorScheme(this, shadeFactor);
    }

    @Override
    public RadianceColorScheme saturate(double saturateFactor) {
        return new SaturatedColorScheme(this, saturateFactor);
    }

    @Override
    public RadianceColorScheme invert() {
        return new InvertedColorScheme(this);
    }

    @Override
    public RadianceColorScheme negate() {
        return new NegatedColorScheme(this);
    }

    @Override
    public RadianceColorScheme hueShift(double hueShiftFactor) {
        return new HueShiftColorScheme(this, hueShiftFactor);
    }

    @Override
    public RadianceColorScheme blendWith(RadianceColorScheme otherScheme, double likenessToThisScheme) {
        return new BlendBiColorScheme(this, otherScheme, likenessToThisScheme);
    }

    @Override
    public RadianceColorScheme named(String colorSchemeDisplayName) {
        this.displayName = colorSchemeDisplayName;
        return this;
    }
}
