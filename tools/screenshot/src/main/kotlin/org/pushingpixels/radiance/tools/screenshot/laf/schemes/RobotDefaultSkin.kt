/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.screenshot.laf.schemes

import org.pushingpixels.radiance.laf.api.RadianceColorSchemeBundle
import org.pushingpixels.radiance.laf.api.RadianceSkin
import org.pushingpixels.radiance.laf.api.RadianceLafSlices
import org.pushingpixels.radiance.laf.api.colorscheme.ColorSchemeSingleColorQuery
import org.pushingpixels.radiance.laf.api.colorscheme.LightGrayColorScheme
import org.pushingpixels.radiance.laf.api.colorscheme.MetallicColorScheme
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme
import org.pushingpixels.radiance.laf.api.painter.border.ClassicBorderPainter
import org.pushingpixels.radiance.laf.api.painter.decoration.ArcDecorationPainter
import org.pushingpixels.radiance.laf.api.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.radiance.laf.api.painter.fill.ClassicFillPainter
import org.pushingpixels.radiance.laf.api.painter.highlight.ClassicHighlightPainter
import org.pushingpixels.radiance.laf.api.painter.overlay.BottomLineOverlayPainter
import org.pushingpixels.radiance.laf.api.shaper.ClassicButtonShaper

/**
 * The default light skin for the Zodiac skin scripts.
 *
 * @author Kirill Grouchnikov
 */
class RobotDefaultSkin(accentColorScheme: RadianceColorScheme) :
        RadianceSkin.Accented(AccentBuilder()
                .withActiveControlsAccent(accentColorScheme)
                .withWindowChromeAccent(accentColorScheme)) {

    init {
        val bottomLineOverlayPainter =
            BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.MID
            )
        this.addOverlayPainter(bottomLineOverlayPainter,
                RadianceLafSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceLafSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceLafSlices.DecorationAreaType.HEADER)

        this.buttonShaper =
            ClassicButtonShaper()
        this.fillPainter =
            ClassicFillPainter()
        this.borderPainter =
            ClassicBorderPainter()

        val decorationPainter =
            MarbleNoiseDecorationPainter()
        decorationPainter.setBaseDecorationPainter(ArcDecorationPainter())
        decorationPainter.setTextureAlpha(0.3f)
        this.decorationPainter = decorationPainter

        this.highlightPainter =
            ClassicHighlightPainter()
        this.borderPainter =
            ClassicBorderPainter()

        val defaultSchemeBundle =
            RadianceColorSchemeBundle(
                this.activeControlsAccent,
                MetallicColorScheme(),
                LightGrayColorScheme()
            )
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                RadianceLafSlices.DecorationAreaType.NONE)

        this.registerAsDecorationArea(this.activeControlsAccent,
                RadianceLafSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceLafSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceLafSlices.DecorationAreaType.HEADER)
    }

    override fun getDisplayName(): String {
        return NAME + " accent " + this.activeControlsAccent.displayName
    }

    companion object {
        /**
         * Display name for `this` skin.
         */
        var NAME = "Robot Default"
    }
}
