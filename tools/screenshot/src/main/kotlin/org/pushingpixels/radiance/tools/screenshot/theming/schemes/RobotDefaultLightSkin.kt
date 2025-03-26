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
import org.pushingpixels.ephemeral.chroma.hct.Hct
import org.pushingpixels.radiance.theming.api.ContainerColorTokensBundle
import org.pushingpixels.radiance.theming.api.RadianceSkin
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils
import org.pushingpixels.radiance.theming.api.ContainerColorTokens
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper
import java.awt.Color

/**
 * The default light skin for the skin screenshot scripts.
 *
 * @author Kirill Grouchnikov
 */
class RobotDefaultLightSkin(accentColor: Color, val name: String) :
        RadianceSkin.Accented(AccentBuilder()
            .withDefaultAreaActiveTokens(ColorSchemeUtils.getContainerTokens(
                Hct.fromInt(accentColor.rgb), ContainerConfiguration.defaultLight()))
            .withDefaultAreaMutedTokens(
                ColorSchemeUtils.getContainerTokens(
                MutedSeed, ContainerConfiguration.defaultLight()))
            .withDefaultAreaNeutralTokens(ColorSchemeUtils.getContainerTokens(
                NeutralSeed, ContainerConfiguration.defaultLight()))) {

    init {
        val bottomLineOverlayPainter =
            BottomLineOverlayPainter(ContainerColorTokens::getContainerOutline)
        this.addOverlayPainter(bottomLineOverlayPainter,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)

        this.buttonShaper = ClassicButtonShaper()
        this.surfacePainter = SpecularRectangularSurfacePainter(ClassicSurfacePainter(), 1.0f)
        this.outlinePainter = FlatOutlinePainter()

        val decorationPainter = MarbleNoiseDecorationPainter()
        decorationPainter.setBaseDecorationPainter(ArcDecorationPainter())
        decorationPainter.setTextureAlpha(0.3f)
        this.decorationPainter = decorationPainter

        this.highlightSurfacePainter = ClassicSurfacePainter()

        val defaultSchemeBundle = ContainerColorTokensBundle(
            this.defaultAreaActiveTokens,
            this.defaultAreaMutedTokens, this.defaultAreaNeutralTokens, false
        )
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                RadianceThemingSlices.DecorationAreaType.NONE)

        this.registerAsDecorationArea(this.defaultAreaActiveTokens,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER)
    }

    override fun getDisplayName(): String {
        return name
    }

    companion object {
        val MutedSeed: Hct = Hct.fromInt(Color(208, 212, 216).rgb)
        val NeutralSeed: Hct = Hct.fromInt(Color(252, 249, 248).rgb)
    }
}
