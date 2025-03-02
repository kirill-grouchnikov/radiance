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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FractionBasedTonalDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Office Black 2007</code> skin. This class is part of officially
 * supported API.
 *
 * @author Kirill Grouchnikov
 */
public class OfficeBlack2007Skin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Office Black 2007";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public OfficeBlack2007Skin() {
        SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();
        // Set up token resolution overlays. For tonal, muted and neutral containers:
        // 1. Outlines with additional alpha to make them softer.
        // 2. Custom alpha for outlines of disabled controls to have higher contrast and make
        //    them more visible.
        SchemeColorResolver officeBlackSchemeColorResolver =
            defaultSchemeColorResolver.overlayWith(
            SchemeColorResolverOverlay.builder()
                .neutralContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer(DynamicScheme::getPrimaryContainerSurfaceLowest)
                        .onContainerVariant(DynamicScheme::getPrimaryContainerSurfaceLow)
                        .containerOutline((s) -> s.getNeutralContainerOutline() & 0x60FFFFFF)
                        .containerOutlineVariant((s) -> s.getNeutralContainerOutlineVariant() & 0x60FFFFFF)
                        .containerOutlineDisabledAlpha((s) -> 0.75f)
                        .build())
                .mutedContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .containerOutline((s) -> s.getMutedContainerOutline() & 0x60FFFFFF)
                        .containerOutlineVariant((s) -> s.getMutedContainerOutlineVariant() & 0x60FFFFFF)
                        .containerOutlineDisabledAlpha((s) -> 0.75f)
                        .build())
                .tonalContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .containerOutline((s) -> s.getTonalContainerOutline() & 0x60FFFFFF)
                        .containerOutlineVariant((s) -> s.getTonalContainerOutlineVariant() & 0x60FFFFFF)
                        .containerOutlineDisabledAlpha((s) -> 0.75f)
                        .build())
                .build());

        RadianceColorScheme officeBlackColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFC6CACF), Hct.fromInt(0xFFB8C0C9), Hct.fromInt(0xFFCFD5DA)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isDark */ false);
        RadianceColorSchemeBundle officeBlackDefaultBundle =
            new RadianceColorSchemeBundle(officeBlackColorScheme);

        ContainerColorTokens rolloverContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFD111),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.6f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .containerOutline(DynamicPalette::getTonalContainerOutlineVariant)
                        .containerOutlineVariant(DynamicPalette::getTonalContainerOutlineVariant)
                        .build()
                ));
        ContainerColorTokens selectedContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seedOne */ Hct.fromInt(0xFFFFA300),
                /* seedTwo */ Hct.fromInt(0xFFFFD007),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* isDark */ false,
                /* fidelityTone */ 83,
                /* contrastLevel */ 0.2f,
                /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteTonalColorResolver());;
        ContainerColorTokens rolloverSelectedContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seedOne */ Hct.fromInt(0xFFFFA300),
                /* seedTwo */ Hct.fromInt(0xFFFFD007),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* isDark */ false,
                /* fidelityTone */ 79,
                /* contrastLevel */ 0.2f,
                /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteTonalColorResolver());;
        ContainerColorTokens pressedContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF8C18),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isFidelity */ true,
            /* isDark */ false);
        ContainerColorTokens pressedSelectedContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF991C),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isFidelity */ true,
            /* isDark */ false);

        // register state-specific color schemes on rollovers, presses and selections
        officeBlackDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
            ComponentState.ROLLOVER_UNSELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
            ComponentState.ROLLOVER_SELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
            ComponentState.SELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(pressedContainerTokens,
            ComponentState.PRESSED_UNSELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(pressedSelectedContainerTokens,
            ComponentState.PRESSED_SELECTED);

        // register state-specific highlight color schemes on rollover and selections
        officeBlackDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_UNSELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        officeBlackDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_SELECTED);

        PaletteContainerColorsResolver activeMarksColorResolver =
            PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                PaletteContainerColorsResolverOverlay.builder()
                    .onContainer(DynamicPalette::getTonalContainerOutline)
                    .build());

        ContainerColorTokens rolloverMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFD111),
            /* isFidelity */ true,
            /* isDark */ false,
            /* contrastLevel */ 0.0,
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens selectedMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFBD51),
            /* isFidelity */ true,
            /* isDark */ false,
            /* contrastLevel */ 0.0,
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens rolloverSelectedMarkContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFA400),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.0,
                /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens pressedMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF8C18),
            /* isFidelity */ true,
            /* isDark */ false,
            /* contrastLevel */ 0.0,
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens pressedSelectedMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF991C),
            /* isFidelity */ true,
            /* isDark */ false,
            /* contrastLevel */ 0.0,
            /* colorResolver */ activeMarksColorResolver);

        // register state-specific color schemes on mark rollovers, presses and selections
        officeBlackDefaultBundle.registerActiveContainerTokens(rolloverMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.ROLLOVER_UNSELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(rolloverSelectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.ROLLOVER_SELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(selectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.SELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(pressedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.PRESSED_UNSELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(pressedSelectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.PRESSED_SELECTED);

        this.registerDecorationAreaSchemeBundle(officeBlackDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF3D3D3D),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 1.0,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        RadianceColorScheme officeBlackSecondaryColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFB9BCC1), Hct.fromInt(0xFF454545), Hct.fromInt(0xFF2D2D2D)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ false,
            /* isTonalDark */ false,
            /* isMutedDark */ true,
            /* isNeutralDark */ true,
            /* isSystemDark */ false,
            /* primaryContrastLevel */ 0.0f,
            /* tonalContrastLevel */ 0.6f,
            /* mutedContrastLevel */ 1.0f,
            /* neutralContrastLevel */ 1.0f,
            /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());
        RadianceColorSchemeBundle officeSecondaryBundle =
            new RadianceColorSchemeBundle(officeBlackSecondaryColorScheme);
        officeSecondaryBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFD5DA),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.6f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            ComponentState.getActiveStates());
        officeSecondaryBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFD5DA),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.6f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());

        this.registerDecorationAreaSchemeBundle(
            officeSecondaryBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF2D2D2D),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 1.0,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB3BEC8),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 1.0,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            DecorationAreaType.CONTROL_PANE);

        this.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline, ColorTransform.alpha(72))),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        this.buttonShaper = new ClassicButtonShaper();

        this.fillPainter = new FractionBasedFillPainter("Office Black 2007",
            new float[] {0.0f, 0.49999f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                ContainerColorTokens::getContainerSurface,
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow()});

        this.borderPainter = new FlatBorderPainter();

        this.decorationPainter = new FractionBasedTonalDecorationPainter(
            "Office Black 2007",
            new float[] {0.0f, 0.29999f, 0.3f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokens::getContainerSurfaceLowest,
                ContainerColorTokens::getContainerSurfaceLowest});

        this.highlightFillPainter = new MatteFillPainter();
    }
}
