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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle2;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
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
        SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();
        // Set up token resolution overlays. For tonal, muted and neutral containers:
        // 1. Take primary container surface to be used as the text color, bringing the blue hue
        //    instead of darker greys.
        // 2. Take the same mappings for the outlines with additional alpha to make them softer.
        // 3. Custom alpha for outlines of disabled controls to have higher contrast and make
        //    them more visible.
        SchemeColorResolver streetlightsSchemeColorResolver = defaultSchemeColorResolver.overlayWith(
            SchemeColorResolverOverlay.builder()
                .neutralContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer(DynamicScheme::getOnMutedContainer)
                        .onContainerVariant(DynamicScheme::getOnMutedContainerVariant)
                        .build())
                .build());

        RadianceColorScheme2 streetlightsColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFFF6000), Hct.fromInt(0xFF052914), Hct.fromInt(0xFF252A26)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ false,
            /* isTonalDark */ false,
            /* isMutedDark */ true,
            /* isNeutralDark */ true,
            /* isSystemDark */ true,
            /* primaryContrastLevel */ 1.0f,
            /* tonalContrastLevel */ 1.0f,
            /* mutedContrastLevel */ 1.0f,
            /* neutralContrastLevel */ 1.0f,
            /* schemeColorResolver */ streetlightsSchemeColorResolver);

        ContainerColorTokens streetlightsHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFF9000),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 1.0f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver());

        RadianceColorSchemeBundle2 streetlightsDefaultBundle =
            new RadianceColorSchemeBundle2(streetlightsColorScheme);
        streetlightsDefaultBundle.registerActiveContainerTokens(
            streetlightsHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(streetlightsDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFF2E332F),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 1.0,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .onContainer((p) -> streetlightsColorScheme.getMutedContainerTokens().getOnContainer().getRGB())
                        .onContainerVariant((p) -> streetlightsColorScheme.getMutedContainerTokens().getOnContainerVariant().getRGB())
                        .build()
                )),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new SpecularRectangularFillPainter(new GlassTonalFillPainter(), 0.5f);
        this.decorationPainter = new ArcDecorationPainter();

        this.borderPainter = new FractionBasedTonalBorderPainter("Streetlights",
            new float[] {0.0f, 1.0f},
            new int[] {80, 80},
            new ContainerColorTokensSingleColorQuery[]{
                ContainerColorTokens::getComplementaryContainerOutline,
                ContainerColorTokens::getComplementaryContainerOutline,
            });

        this.highlightFillPainter = new ClassicTonalFillPainter();
        this.highlightBorderPainter = new FlatTonalBorderPainter();
    }
}
