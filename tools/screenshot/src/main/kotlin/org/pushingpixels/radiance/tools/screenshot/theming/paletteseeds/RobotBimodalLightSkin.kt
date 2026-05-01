/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.tools.screenshot.theming.paletteseeds

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette
import org.pushingpixels.ephemeral.chroma.hct.Hct
import org.pushingpixels.ephemeral.chroma.utils.MathUtils
import org.pushingpixels.radiance.theming.api.*
import org.pushingpixels.radiance.theming.api.decorator.rootpane.DefaultRootPaneDecorator
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomLineOverlayPainter
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter
import org.pushingpixels.radiance.theming.api.palette.ColorTransform
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverUtils
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper
import java.awt.Color

/**
 * The bimodal light skin for the skin screenshot scripts.
 *
 * @author Kirill Grouchnikov
 */
class RobotBimodalLightSkin(val config: RobotConfig) :
        RadianceSkin.Accented(AccentBuilder()
            .withDefaultAreaActiveTokens(getActiveContainerTokens(config))
            .withDefaultAreaMutedTokens(getMutedContainerTokens(config))
            .withDefaultAreaNeutralTokens(getNeutralContainerTokens(config))) {

    init {
        this.registerComponentShaper(
            ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE)
        this.surfacePainter = SpecularRectangularSurfacePainter(ClassicSurfacePainter(), 1.0f)
        this.outlinePainter = FlatOutlinePainter()

        val decorationPainter = MarbleNoiseDecorationPainter()
        decorationPainter.setBaseDecorationPainter(ArcDecorationPainter())
        decorationPainter.setTextureAlpha(config.headerTextureAlpha)
        val bottomLineOverlayPainter =
            BottomLineOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline,
                    ColorTransform.alpha(128)
                ))
        decorationPainter.addOverlayPainter(bottomLineOverlayPainter,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER)
        this.decorationPainter = decorationPainter

        this.highlightSurfacePainter = ClassicSurfacePainter()

        val defaultBundle = ContainerColorTokensBundle(
            this.defaultAreaActiveTokens,
            this.defaultAreaMutedTokens, this.defaultAreaNeutralTokens, false
        )
        defaultBundle.registerActiveContainerTokens(getSelectedTokens(config),
            ComponentState.SELECTED)
        this.registerDecorationAreaTokensBundle(defaultBundle,
                RadianceThemingSlices.DecorationAreaType.NONE)

        this.registerAsDecorationArea(this.defaultAreaActiveTokens,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)

        this.rootPaneDecorator = DefaultRootPaneDecorator()
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

    return ContainerColorTokensUtils.getBimodalContainerTokens(
        /* seedOne */ Hct.from(hue1, primarySeed.chroma, primaryTone),
        /* seedTwo */ Hct.from(hue2, primarySeed.chroma, primaryTone),
        /* tonalTransitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
        /* fidelityTone */ primaryTone,
        /* containerConfiguration */ ContainerConfiguration.defaultLight(),
        /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver())
}

private fun getMutedContainerTokens(config: RobotConfig): ContainerColorTokens {
    val mutedSeed = Hct.fromInt(Color(204, 210, 215).rgb)
    return ContainerColorTokensUtils.getContainerTokens(mutedSeed, ContainerConfiguration.defaultLight())
}

private fun getNeutralContainerTokens(config: RobotConfig): ContainerColorTokens {
    val neutralSeed = Hct.fromInt(Color(240, 245, 249).rgb)
    return ContainerColorTokensUtils.getContainerTokens(neutralSeed, ContainerConfiguration.defaultLight())
}

private fun getSelectedTokens(config: RobotConfig): ContainerColorTokens {
    val primarySeed = Hct.fromInt(config.seed.rgb)
    val primaryHue = primarySeed.hue
    val hue1 = MathUtils.sanitizeDegreesDouble(primaryHue + config.hueDeltaHigh)
    val hue2 = MathUtils.sanitizeDegreesDouble(primaryHue + config.hueDeltaLow)
    val primaryTone = primarySeed.tone

    return ContainerColorTokensUtils.getBimodalContainerTokens(
        /* seedOne */ Hct.from(hue1, 1.5 * primarySeed.chroma, primaryTone),
        /* seedTwo */ Hct.from(hue2, 1.5 * primarySeed.chroma, primaryTone),
        /* tonalTransitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
        /* fidelityTone */ primaryTone + 5.0,  // lighter tone for selected and rollover states,
        /* containerConfiguration */ ContainerConfiguration.defaultLight(),
        /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver())
}
