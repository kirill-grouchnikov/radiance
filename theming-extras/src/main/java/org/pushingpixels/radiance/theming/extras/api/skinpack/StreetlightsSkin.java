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
package org.pushingpixels.radiance.theming.extras.api.skinpack;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedTonalOutlinePainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Streelights</code> skin. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 */
public class StreetlightsSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Streetlights";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public StreetlightsSkin() {
        ContainerColorTokens streetlightsDefaultMutedTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF052914),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ 1.0));

        ContainerColorTokens streetlightsDefaultNeutralTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF252A26),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ 1.0),
            /* colorResolver */ PaletteResolverUtils.getPaletteColorResolver().overlayWith(
                PaletteContainerColorsResolverOverlay.builder()
                    .onContainer((p) -> streetlightsDefaultMutedTokens.getOnContainer().getRGB())
                    .onContainerVariant((p) -> streetlightsDefaultMutedTokens.getOnContainerVariant().getRGB())
                    .build()));

        RadianceColorSchemeBundle streetlightsDefaultBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFF6000),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0)),
            /* mutedContainerTokens */ streetlightsDefaultMutedTokens,
            /* neutralContainerTokens */ streetlightsDefaultNeutralTokens,
            /* isSystemDark */ true);

        ContainerColorTokens streetlightsHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFF9000),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0));

        streetlightsDefaultBundle.registerActiveContainerTokens(
            streetlightsHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(streetlightsDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF2E332F),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0),
                /* colorResolver */ PaletteResolverUtils.getPaletteColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .onContainer((p) -> streetlightsDefaultMutedTokens.getOnContainer().getRGB())
                        .onContainerVariant((p) -> streetlightsDefaultMutedTokens.getOnContainerVariant().getRGB())
                        .build()
                )),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new SpecularRectangularFillPainter(new GlassFillPainter(), 0.5f);
        this.decorationPainter = new ArcDecorationPainter();

        this.outlinePainter = new FractionBasedTonalOutlinePainter("Streetlights",
            new float[] {0.0f, 1.0f},
            new int[] {80, 80},
            new ContainerColorTokensSingleColorQuery[]{
                ContainerColorTokens::getComplementaryContainerOutline,
                ContainerColorTokens::getComplementaryContainerOutline,
            });

        this.highlightFillPainter = new ClassicFillPainter();
        this.highlightOutlinePainter = new FlatOutlinePainter();
    }
}
