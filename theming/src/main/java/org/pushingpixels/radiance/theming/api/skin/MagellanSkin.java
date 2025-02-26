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
package org.pushingpixels.radiance.theming.api.skin;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle2;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.*;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Magellan</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class MagellanSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Magellan";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public MagellanSkin() {
        SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();
        // Set up token resolution overlays to use softer (slightly translucent) text / icon
        // colors
        SchemeColorResolver magellanColorResolver = defaultSchemeColorResolver.overlayWith(
            SchemeColorResolverOverlay.builder()
                // For neutral containers, use softer text / icon colors
                .neutralContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer((s) -> s.getOnNeutralContainer() & 0xD0FFFFFF)
                        .onContainerVariant((s) -> s.getOnNeutralContainerVariant() & 0xD0FFFFFF)
                        .build())
                // For muted containers (enabled controls), use softer text / icon colors.
                .mutedContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer((s) -> s.getOnMutedContainer() & 0xE0FFFFFF)
                        .onContainerVariant((s) -> s.getOnMutedContainerVariant() & 0xE0FFFFFF)
                        .build())
                // For tonal containers (active controls), use softer text / icon colors.
                .tonalContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer((s) -> s.getOnTonalContainer() & 0xE0FFFFFF)
                        .onContainerVariant((s) -> s.getOnTonalContainerVariant() & 0xE0FFFFFF)
                        .build())
                .build());

        RadianceColorScheme2 magellanColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFF0070DF), Hct.fromInt(0xFF004C92), Hct.fromInt(0xFF005CB7)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ true,
            /* isTonalDark */ true,
            /* isMutedDark */ true,
            /* isNeutralDark */ true,
            /* isSystemDark */ true,
            /* primaryContrastLevel */ 0.0f,
            /* tonalContrastLevel */ -0.1f,
            /* mutedContrastLevel */ -0.1f,
            /* neutralContrastLevel */ -0.2f,
            /* schemeColorResolver */ magellanColorResolver);

        ContainerColorTokens magellanSelectedContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF006FDB),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 0.0,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .onContainer((p) -> p.getOnTonalContainer() & 0xE0FFFFFF)
                        .onContainerVariant((p) -> p.getOnTonalContainerVariant() & 0xE0FFFFFF)
                        .build()));

        ContainerColorTokens magellanPressedContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00AEB8),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);

        ContainerColorTokens magellanGreenContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF1EBF00),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);
        ContainerColorTokens magellanGreenRolloverContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00B933),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);
        ContainerColorTokens magellanGreenHighlightSelectedContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00B000),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);
        ContainerColorTokens magellanGreenHighlightRolloverContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00A422),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);

        RadianceColorSchemeBundle2 magellanDefaultBundle =
            new RadianceColorSchemeBundle2(magellanColorScheme);
        // More saturated seed for controls in selected state
        magellanDefaultBundle.registerActiveContainerTokens(magellanSelectedContainerTokens,
            ComponentState.SELECTED);
        // Less saturated seed for controls in pressed states
        magellanDefaultBundle.registerActiveContainerTokens(magellanPressedContainerTokens,
            ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED);
        // Greens for rollovers
        magellanDefaultBundle.registerActiveContainerTokens(magellanGreenContainerTokens,
            ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_UNSELECTED,
            ComponentState.ROLLOVER_ARMED, ComponentState.ARMED);

        // Marks
        magellanDefaultBundle.registerActiveContainerTokens(magellanGreenContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.SELECTED);
        magellanDefaultBundle.registerActiveContainerTokens(magellanGreenRolloverContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.ROLLOVER_SELECTED,
            ComponentState.ROLLOVER_UNSELECTED,
            ComponentState.ARMED,
            ComponentState.ROLLOVER_ARMED);
        magellanDefaultBundle.registerActiveContainerTokens(magellanPressedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.PRESSED_UNSELECTED,
            ComponentState.PRESSED_SELECTED);

        // Blues for active tabs
        magellanDefaultBundle.registerActiveContainerTokens(magellanSelectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB,
            ComponentState.getActiveStates());
        // Greens for highlights
        magellanDefaultBundle.registerActiveContainerTokens(
            magellanGreenHighlightSelectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED);
        magellanDefaultBundle.registerActiveContainerTokens(
            magellanGreenHighlightRolloverContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_UNSELECTED);
        this.registerDecorationAreaSchemeBundle(magellanDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Toolbars, control panes
        this.registerAsDecorationArea(
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFF004D99),
                /* isFidelity */ true,
                /* isDark */ true),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        RadianceColorScheme2 magellanFooterColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFF006FDB), Hct.fromInt(0xFFA0D8F7), Hct.fromInt(0xFF9DD2FF)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ true,
            /* isTonalDark */ true,
            /* isMutedDark */ false,
            /* isNeutralDark */ false,
            /* isSystemDark */ false,
            /* primaryContrastLevel */ 0.0f,
            /* tonalContrastLevel */ 0.0f,
            /* mutedContrastLevel */ 0.0f,
            /* neutralContrastLevel */ 0.0f,
            /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver().overlayWith(
                SchemeColorResolverOverlay.builder()
                    .mutedContainerResolverOverlay(
                        SchemeContainerColorsResolverOverlay.builder()
                            .containerSurfaceLowest(DynamicScheme::getNeutralContainerSurfaceLow)
                            .build())
                    .build()
            ));
        RadianceColorSchemeBundle2 magellanFooterBundle =
            new RadianceColorSchemeBundle2(magellanFooterColorScheme);
        this.registerDecorationAreaSchemeBundle(magellanFooterBundle,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Headers
        this.registerAsDecorationArea(
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFF003367),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 0.4f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // Add overlay painters to paint drop shadows along the bottom edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a dark line along the bottom
        // edge of toolbars
        RadianceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
            ContainerColorTokens::getContainerOutlineVariant);
        this.addOverlayPainter(toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a light line along the top
        // edge of toolbars
        RadianceOverlayPainter toolbarTopLineOverlayPainter = new TopLineTonalOverlayPainter(
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getInverseContainerOutline,
                ColorTransform.alpha(96)));
        this.addOverlayPainter(toolbarTopLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        RadianceOverlayPainter footerTopShadowOverlayPainter = TopShadowOverlayPainter.getInstance(100);
        this.addOverlayPainter(footerTopShadowOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new FractionBasedTonalFillPainter("Magellan",
            new float[] {0.0f, 0.3f, 0.6f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokensSingleColorQuery.blend(
                    ContainerColorTokens::getContainerSurfaceHighest,
                    ContainerColorTokens::getContainerSurfaceHigh,
                    0.6f),
                ContainerColorTokens::getContainerSurfaceHigh,
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLowest});

        this.decorationPainter = new FlatDecorationPainter();
        this.highlightFillPainter = new ClassicTonalFillPainter();

        this.borderPainter = new CompositeBorderPainter("Magellan",
            new FlatTonalBorderPainter(),
            new FractionBasedTonalBorderPainter("Magellan Inner",
                new float[] {0.0f, 0.5f, 1.0f},
                new int[] {112, 80, 64},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                }));
    }
}
