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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette
import org.pushingpixels.ephemeral.chroma.hct.Hct
import org.pushingpixels.ephemeral.chroma.utils.MathUtils
import org.pushingpixels.radiance.theming.api.ComponentState
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.colorscheme.BimodalPaletteResolverUtils
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper
import java.awt.Color

/**
 * The bimodal light skin for the skin screenshot scripts.
 *
 * @author Kirill Grouchnikov
 */
class RobotBimodalLightSkin(val config: RobotConfig) :
        RadianceSkin.Accented(AccentBuilder()
            .withDefaultAreaTonalTokens(getActiveContainerTokens(config))
            .withDefaultAreaMutedTokens(getMutedContainerTokens(config))
            .withDefaultAreaNeutralTokens(getNeutralContainerTokens(config))) {

    init {
        val bottomLineOverlayPainter =
            BottomLineOverlayPainter(ContainerColorTokens::getContainerOutline)
        this.addOverlayPainter(bottomLineOverlayPainter,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)

        this.buttonShaper = ClassicButtonShaper()
        this.fillPainter = SpecularRectangularFillPainter(ClassicFillPainter(), 1.0f)
        this.borderPainter = FlatBorderPainter()

        val decorationPainter = MarbleNoiseDecorationPainter()
        decorationPainter.setBaseDecorationPainter(ArcDecorationPainter())
        decorationPainter.setTextureAlpha(config.headerTextureAlpha)
        this.decorationPainter = decorationPainter

        this.highlightFillPainter = ClassicFillPainter()

        val defaultSchemeBundle = RadianceColorSchemeBundle(this.defaultAreaTonalTokens,
            this.defaultAreaMutedTokens, this.defaultAreaNeutralTokens, false)
        defaultSchemeBundle.registerActiveContainerTokens(getSelectedTokens(config),
            ComponentState.SELECTED)
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                RadianceThemingSlices.DecorationAreaType.NONE)

        this.registerAsDecorationArea(this.defaultAreaTonalTokens,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)
    }

    override fun getDisplayName(): String {
        return config.name
    }
}

private fun getActiveContainerTokens(config: RobotConfig): ContainerColorTokens {
    val primarySeed = Hct.fromInt(config.seed.rgb)
    val primaryHue = primarySeed.hue
    val hue1 = MathUtils.sanitizeDegreesDouble(primaryHue + config.hueDeltaHigh)
    val hue2 = MathUtils.sanitizeDegreesDouble(primaryHue + config.hueDeltaLow)
    val primaryTone = primarySeed.tone

    return ColorSchemeUtils.getBimodalContainerTokens(
        /* seedOne */ Hct.from(hue1, primarySeed.chroma, primaryTone),
        /* seedTwo */ Hct.from(hue2, primarySeed.chroma, primaryTone),
        /* tonalTransitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
        /* fidelityTone */ primaryTone,
        /* tonalContainerConfiguration */ ContainerConfiguration.defaultLight(),
        /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteTonalColorResolver())
}

private fun getMutedContainerTokens(config: RobotConfig): ContainerColorTokens {
    val mutedSeed = Hct.fromInt(Color(204, 210, 215).rgb)
    return ColorSchemeUtils.getContainerTokens(mutedSeed, ContainerConfiguration.defaultLight())
}

private fun getNeutralContainerTokens(config: RobotConfig): ContainerColorTokens {
    val neutralSeed = Hct.fromInt(Color(240, 245, 249).rgb)
    return ColorSchemeUtils.getContainerTokens(neutralSeed, ContainerConfiguration.defaultLight())
}

private fun getSelectedTokens(config: RobotConfig): ContainerColorTokens {
    val primarySeed = Hct.fromInt(config.seed.rgb)
    val primaryHue = primarySeed.hue
    val hue1 = MathUtils.sanitizeDegreesDouble(primaryHue + config.hueDeltaHigh)
    val hue2 = MathUtils.sanitizeDegreesDouble(primaryHue + config.hueDeltaLow)
    val primaryTone = primarySeed.tone

    return ColorSchemeUtils.getBimodalContainerTokens(
        /* seedOne */ Hct.from(hue1, 1.5 * primarySeed.chroma, primaryTone),
        /* seedTwo */ Hct.from(hue2, 1.5 * primarySeed.chroma, primaryTone),
        /* tonalTransitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
        /* fidelityTone */ primaryTone + 5.0,  // lighter tone for selected and rollover states,
        /* tonalContainerConfiguration */ ContainerConfiguration.defaultLight(),
        /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteTonalColorResolver())
}
