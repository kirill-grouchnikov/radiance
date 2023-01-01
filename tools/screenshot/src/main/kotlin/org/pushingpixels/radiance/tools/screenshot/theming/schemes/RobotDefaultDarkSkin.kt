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
package org.pushingpixels.radiance.tools.screenshot.theming.schemes

import org.pushingpixels.radiance.theming.api.ComponentState
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery
import org.pushingpixels.radiance.theming.api.colorscheme.DarkMetallicColorScheme
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper

/**
 * The default dark skin for the skin screenshot scripts.
 *
 * @author Kirill Grouchnikov
 */
class RobotDefaultDarkSkin(accentColorScheme: RadianceColorScheme) :
        RadianceSkin.Accented(AccentBuilder()
                .withActiveControlsAccent(accentColorScheme)
                .withWindowChromeAccent(accentColorScheme)) {

    init {
        val bottomLineOverlayPainter =
            BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.MID
            )
        this.addOverlayPainter(bottomLineOverlayPainter,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)

        this.buttonShaper = ClassicButtonShaper()
        this.fillPainter = SpecularRectangularFillPainter(ClassicFillPainter(), 1.0f)
        this.borderPainter = ClassicBorderPainter()

        val decorationPainter = MarbleNoiseDecorationPainter()
        decorationPainter.setBaseDecorationPainter(ArcDecorationPainter())
        decorationPainter.setTextureAlpha(0.3f)
        this.decorationPainter = decorationPainter

        this.highlightFillPainter = ClassicFillPainter()
        this.borderPainter = ClassicBorderPainter()

        val inactiveScheme = this.activeControlsAccent.blendWith(DarkMetallicColorScheme(), 0.6)
        val defaultSchemeBundle =
            RadianceColorSchemeBundle(
                this.activeControlsAccent, inactiveScheme, inactiveScheme
            )
        defaultSchemeBundle.registerAlpha(0.5f,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED)
        defaultSchemeBundle.registerColorScheme(inactiveScheme,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED)

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, RadianceThemingSlices.DecorationAreaType.NONE)

        this.registerAsDecorationArea(this.windowChromeAccent,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)
    }

    override fun getDisplayName(): String {
        return this.activeControlsAccent.displayName
    }
}
