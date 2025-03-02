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
package org.pushingpixels.radiance.demo.themingapps.mail;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.BrushedMetalDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

public class VisorSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Visor";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public VisorSkin() {
        RadianceColorScheme visorDefaultColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFF99B6CB), Hct.fromInt(0xFFDEDDDF), Hct.fromInt(0xFFEFF8FF)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isDark */ false);
        RadianceColorSchemeBundle visorDefaultBundle =
            new RadianceColorSchemeBundle(visorDefaultColorScheme);
        this.registerDecorationAreaSchemeBundle(visorDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Custom palette resolver for the highlights in the threads decoration area
        // to set outline colors to be identical to surface colors (effectively removing the
        // visuals of the outlines)
        PaletteContainerColorsResolver threadsHighlightsPaletteResolver =
            PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                PaletteContainerColorsResolverOverlay.builder()
                    .containerOutline(DynamicPalette::getTonalContainerSurface)
                    .containerOutlineVariant(DynamicPalette::getTonalContainerSurfaceHigh)
                    .build()
            );
        RadianceColorScheme visorThreadsColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFF9CBDD3), Hct.fromInt(0xFFC9D5DE), Hct.fromInt(0xFFD8E2EA)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isDark */ false);
        RadianceColorSchemeBundle visorThreadsBundle =
            new RadianceColorSchemeBundle(visorThreadsColorScheme);
        visorThreadsBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF5B91F8),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 0.0f,
                /* colorResolver */ threadsHighlightsPaletteResolver),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        visorThreadsBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF80B6CB),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 0.0f,
                /* colorResolver */ threadsHighlightsPaletteResolver),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_UNSELECTED);
        this.registerDecorationAreaSchemeBundle(visorThreadsBundle, VisorMail.THREADS);

        // Custom palette resolver for the highlights in the threads decoration area
        // to set outline colors to be identical to surface colors (effectively removing the
        // visuals of the outlines)
        PaletteContainerColorsResolver destinationsHighlightsPaletteResolver =
            PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                PaletteContainerColorsResolverOverlay.builder()
                    .containerOutline(DynamicPalette::getTonalContainerOutlineVariant)
                    .containerOutlineVariant(DynamicPalette::getTonalContainerOutlineVariant)
                    .build()
            );
        RadianceColorScheme visorDestinationsColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFF9CBDD3), Hct.fromInt(0xFFC9D5DE), Hct.fromInt(0xFFD3E2EF)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isDark */ false);
        RadianceColorSchemeBundle visorDestinationsBundle =
            new RadianceColorSchemeBundle(visorDestinationsColorScheme);
        visorDestinationsBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFE8EDAF),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.6f,
                /* colorResolver */ destinationsHighlightsPaletteResolver),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        visorDestinationsBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFD7E1C2),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.6f,
                /* colorResolver */ destinationsHighlightsPaletteResolver),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_UNSELECTED);
        this.registerDecorationAreaSchemeBundle(visorDestinationsBundle, VisorMail.DESTINATIONS);

        // For the overall frame decoration border
        this.registerAsDecorationArea(ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFC9D6DF),
                /* activeContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new MatteFillPainter();
        this.borderPainter = new FlatBorderPainter();

        BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
        decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
        decorationPainter.setTextureAlpha(0.3f);
        this.decorationPainter = decorationPainter;

        this.highlightFillPainter = new FractionBasedFillPainter("Visor Highlight",
            new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurface,
            });
    }
}
