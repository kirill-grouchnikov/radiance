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
package org.pushingpixels.radiance.tools.screenshot.theming.schemes

import org.pushingpixels.ephemeral.chroma.hct.Hct
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle2
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper
import java.awt.Color

/**
 * The default light skin for the skin screenshot scripts.
 *
 * @author Kirill Grouchnikov
 */
class RobotDefaultSkin(accentColor: Color, val name: String) :
        RadianceSkin.TonalAccented(AccentBuilder()
            .withDefaultAreaColorScheme(ColorSchemeUtils.getColorScheme(
                /* palettesSource */ ColorSchemeUtils.BalancedPaletteSource(
                    Hct.fromInt(accentColor.rgb), 3.0, 1.0),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isDark */ false))
            .withHeaderAreaColorScheme(ColorSchemeUtils.getColorScheme(
                /* palettesSource */ ColorSchemeUtils.BalancedPaletteSource(
                    Hct.fromInt(accentColor.rgb), 3.0, 1.0),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isDark */ false))) {

    init {
        val bottomLineOverlayPainter =
            BottomLineTonalOverlayPainter(ContainerColorTokens::getContainerOutline)
        this.addOverlayPainter(bottomLineOverlayPainter,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)

        this.buttonShaper = ClassicButtonShaper()
        this.fillPainter = SpecularRectangularFillPainter(ClassicTonalFillPainter(), 1.0f)
        this.borderPainter = FlatTonalBorderPainter()

        val decorationPainter = MarbleNoiseDecorationPainter()
        decorationPainter.setBaseDecorationPainter(ArcDecorationPainter())
        decorationPainter.setTextureAlpha(0.3f)
        this.decorationPainter = decorationPainter

        this.highlightFillPainter = ClassicTonalFillPainter()

        val defaultSchemeBundle = RadianceColorSchemeBundle2(this.defaultAreaColorScheme)
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                RadianceThemingSlices.DecorationAreaType.NONE)

        this.registerAsDecorationArea(this.headerAreaColorScheme.extendedTonalContainerTokens,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)
    }

    override fun getDisplayName(): String {
        return name
    }
}
