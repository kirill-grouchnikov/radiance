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
import org.pushingpixels.ephemeral.chroma.hct.Hct
import org.pushingpixels.radiance.theming.api.ContainerColorTokens
import org.pushingpixels.radiance.theming.api.ContainerColorTokensBundle
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomLineOverlayPainter
import org.pushingpixels.radiance.theming.api.painter.outline.InlayOutlinePainter
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter
import org.pushingpixels.radiance.theming.api.painter.surface.FlatSurfacePainter
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter
import org.pushingpixels.radiance.theming.api.palette.ColorTransform
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper
import java.awt.Color


/**
 * The default dark skin for the skin screenshot scripts.
 *
 * @author Kirill Grouchnikov
 */
class RobotDefaultDarkSkin(accentColor: Color, val name: String) :
    RadianceSkin.Accented(AccentBuilder()
        .withDefaultAreaActiveTokens(
            ContainerColorTokensUtils.getContainerTokens(
            Hct.fromInt(accentColor.rgb), ContainerConfiguration(true, 0.3)))
        .withDefaultAreaMutedTokens(
            ContainerColorTokensUtils.getContainerTokens(
            Hct.fromInt(accentColor.rgb).also { it.tone = it.tone * 1.2},
            ContainerConfiguration(true, 0.25)))
        .withDefaultAreaNeutralTokens(
            ContainerColorTokensUtils.getContainerTokens(
            Hct.fromInt(accentColor.rgb).also { it.tone = it.tone / 3.5},
            ContainerConfiguration(true, 0.8)))) {

    init {
        this.registerComponentShaper(
            ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE)
        this.surfacePainter = SpecularRectangularSurfacePainter(ClassicSurfacePainter(), 1.0f)
        this.outlinePainter = InlayOutlinePainter.builder()
            .displayName("Robot")
            .outer { it.containerOutline }
            .inner(
                floatArrayOf(0.0f, 1.0f),
                intArrayOf(96, 96),
                arrayOf<ContainerColorTokensSingleColorQuery>(
                    ContainerColorTokensSingleColorQuery { it.getComplementaryContainerOutline() },
                    ContainerColorTokensSingleColorQuery { it.getComplementaryContainerOutline() }
                ))
            .build()

        val decorationPainter = MarbleNoiseDecorationPainter()
        decorationPainter.setBaseDecorationPainter(ArcDecorationPainter())
        decorationPainter.setTextureAlpha(0.3f)
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

        this.highlightSurfacePainter = FlatSurfacePainter(
            "Robot Dark", { if (it.isDark()) it.getContainerSurfaceHighest() else it.getContainerSurfaceLowest() })

        val defaultBundle = ContainerColorTokensBundle(
            this.defaultAreaActiveTokens,
            this.defaultAreaMutedTokens, this.defaultAreaNeutralTokens, true
        )
        this.registerDecorationAreaTokensBundle(defaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE)

        this.registerAsDecorationArea(this.defaultAreaActiveTokens,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER)
    }

    override fun getDisplayName(): String {
        return name
    }
}
