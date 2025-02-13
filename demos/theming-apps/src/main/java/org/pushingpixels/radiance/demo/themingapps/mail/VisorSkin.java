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
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.BrushedMetalDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteTonalFillPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

public class VisorSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Visor";

    /**
     * Creates a new <code>Visor</code> skin.
     */
    public VisorSkin() {
        ColorSchemes visorSchemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/demo/themingapps/mail/skin/visor.colorschemes"));

        RadianceColorScheme activeScheme = visorSchemes.get("Visor Active");
        RadianceColorScheme enabledScheme = visorSchemes.get("Visor Enabled");
        RadianceColorScheme disabledScheme = visorSchemes.get("Visor Disabled");

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);

        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(activeScheme, ComponentState.DISABLED_SELECTED);
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

        RadianceColorScheme activeDestinationsScheme =
                visorSchemes.get("Visor Active Destinations");
        RadianceColorScheme enabledDestinationsScheme =
                visorSchemes.get("Visor Enabled Destinations");
        RadianceColorSchemeBundle destinationsSchemeBundle = new RadianceColorSchemeBundle(
                activeDestinationsScheme, enabledDestinationsScheme, disabledScheme);
        destinationsSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_UNSELECTED);
        destinationsSchemeBundle.registerColorScheme(enabledDestinationsScheme, ComponentState.DISABLED_UNSELECTED);

        // use SunGlare for destinations highlights
        RadianceColorScheme destinationsHighlight = new SunGlareColorScheme();
        destinationsSchemeBundle.registerAlpha(0.75f, ComponentState.ROLLOVER_UNSELECTED);
        destinationsSchemeBundle.registerHighlightColorScheme(destinationsHighlight,
                ComponentState.ROLLOVER_UNSELECTED);
        destinationsSchemeBundle.registerAlpha(0.9f, ComponentState.SELECTED);
        destinationsSchemeBundle.registerHighlightColorScheme(destinationsHighlight,
                ComponentState.SELECTED);
        destinationsSchemeBundle.registerAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
        destinationsSchemeBundle.registerHighlightColorScheme(destinationsHighlight,
                ComponentState.ROLLOVER_SELECTED);
        destinationsSchemeBundle.registerAlpha(0.8f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        destinationsSchemeBundle.registerHighlightColorScheme(destinationsHighlight,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        // use Terracotta for borders of destinations highlights
        destinationsSchemeBundle.registerColorScheme(new TerracottaColorScheme(),
                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                ComponentState.getActiveStates());

        this.registerDecorationAreaSchemeBundle(destinationsSchemeBundle,
                VisorMail.DESTINATIONS);

        RadianceColorSchemeBundle threadsSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);

        threadsSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        threadsSchemeBundle.registerColorScheme(activeScheme, ComponentState.DISABLED_SELECTED);
        // Configure white-on-dark-blue highlights for the threads view
        RadianceColorScheme threadsHighlight = visorSchemes.get("Visor Threads Highlight");
        RadianceColorScheme threadsHighlightLight = visorSchemes.get("Visor Threads Highlight Light");
        threadsSchemeBundle.registerAlpha(1.0f, ComponentState.ROLLOVER_UNSELECTED);
        threadsSchemeBundle.registerHighlightColorScheme(threadsHighlightLight,
                ComponentState.ROLLOVER_UNSELECTED);
        threadsSchemeBundle.registerAlpha(0.9f, ComponentState.SELECTED);
        threadsSchemeBundle.registerHighlightColorScheme(threadsHighlight,
                ComponentState.SELECTED);
        threadsSchemeBundle.registerAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
        threadsSchemeBundle.registerHighlightColorScheme(threadsHighlight,
                ComponentState.ROLLOVER_SELECTED);
        threadsSchemeBundle.registerAlpha(0.8f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        threadsSchemeBundle.registerHighlightColorScheme(threadsHighlight,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

        this.registerDecorationAreaSchemeBundle(threadsSchemeBundle, VisorMail.THREADS);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new ClassicFillPainter();
        this.borderPainter = new ClassicBorderPainter();

        BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
        decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
        decorationPainter.setTextureAlpha(0.3f);
        this.decorationPainter = decorationPainter;

        this.highlightFillPainter = new FractionBasedFillPainter(
                "Visor Highlight", new float[] { 0.0f, 1.0f },
                new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.EXTRALIGHT,
                        ColorSchemeSingleColorQuery.EXTRALIGHT });
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public static class VisorTonalSkin extends VisorSkin implements TonalSkin {
        public static final String NAME = "Visor Tonal";

        public VisorTonalSkin() {
            RadianceColorScheme2 visorDefaultColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFF99B6CB), Hct.fromInt(0xFFDEDDDF), Hct.fromInt(0xFFC4CFD7)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isDark */ false);
            RadianceColorSchemeBundle2 visorDefaultBundle =
                new RadianceColorSchemeBundle2(visorDefaultColorScheme);
            this.registerDecorationAreaSchemeBundle(visorDefaultBundle,
                RadianceThemingSlices.DecorationAreaType.NONE);

            RadianceColorScheme2 visorThreadColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFF99B6CB), Hct.fromInt(0xFFDEDDDF), Hct.fromInt(0xFFEFF8FF)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isDark */ false);
            RadianceColorSchemeBundle2 visorThreadBundle =
                new RadianceColorSchemeBundle2(visorThreadColorScheme);
            this.registerDecorationAreaSchemeBundle(visorThreadBundle, VisorMail.THREAD);

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
            RadianceColorScheme2 visorThreadsColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFF9CBDD3), Hct.fromInt(0xFFC9D5DE), Hct.fromInt(0xFFD8E2EA)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isDark */ false);
            RadianceColorSchemeBundle2 visorThreadsBundle =
                new RadianceColorSchemeBundle2(visorThreadsColorScheme);
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
            RadianceColorScheme2 visorDestinationsColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFF9CBDD3), Hct.fromInt(0xFFC9D5DE), Hct.fromInt(0xFFD3E2EF)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isDark */ false);
            RadianceColorSchemeBundle2 visorDestinationsBundle =
                new RadianceColorSchemeBundle2(visorDestinationsColorScheme);
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

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new MatteTonalFillPainter();
            this.borderPainter = new FlatTonalBorderPainter();

            BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
            decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
            decorationPainter.setTextureAlpha(0.3f);
            this.decorationPainter = decorationPainter;

            this.highlightFillPainter = new FractionBasedTonalFillPainter("Visor Highlight",
                new float[] {0.0f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getContainerSurface,
                    ContainerColorTokens::getContainerSurface,
                });
        }

        @Override
        public String getDisplayName() {
            return VisorTonalSkin.NAME;
        }
    }
}
