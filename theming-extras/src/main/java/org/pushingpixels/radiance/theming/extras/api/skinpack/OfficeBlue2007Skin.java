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
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FractionBasedTonalDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Office Blue 2007</code> skin. This class is part of officially
 * supported API.
 *
 * @author Kirill Grouchnikov
 */
public class OfficeBlue2007Skin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Office Blue 2007";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public OfficeBlue2007Skin() {
        SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();
        // Set up token resolution overlays. For tonal, muted and neutral containers:
        // 1. Take primary container surface to be used as the text color, bringing the blue hue
        //    instead of darker greys.
        // 2. Take the same mappings for the outlines with additional alpha to make them softer.
        // 3. Custom alpha for outlines of disabled controls to have higher contrast and make
        //    them more visible.
        SchemeColorResolver officeBlueSchemeColorResolver = defaultSchemeColorResolver.overlayWith(
            SchemeColorResolverOverlay.builder()
                .neutralContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer(DynamicScheme::getPrimaryContainerSurfaceLowest)
                        .onContainerVariant(DynamicScheme::getPrimaryContainerSurfaceLow)
                        .containerOutline((s) -> s.getPrimaryContainerSurfaceLowest() & 0x70FFFFFF)
                        .containerOutlineVariant((s) -> s.getPrimaryContainerSurfaceLow() & 0x70FFFFFF)
                        .containerOutlineDisabledAlpha((s) -> 0.65f)
                        .build())
                .mutedContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer(DynamicScheme::getPrimaryContainerSurfaceLowest)
                        .onContainerVariant(DynamicScheme::getPrimaryContainerSurfaceLow)
                        .containerOutline((s) -> s.getPrimaryContainerSurfaceLowest() & 0x70FFFFFF)
                        .containerOutlineVariant((s) -> s.getPrimaryContainerSurfaceLow() & 0x70FFFFFF)
                        .containerOutlineDisabledAlpha((s) -> 0.65f)
                        .build())
                .tonalContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer(DynamicScheme::getPrimaryContainerSurfaceLowest)
                        .onContainerVariant(DynamicScheme::getPrimaryContainerSurfaceLow)
                        .containerOutline((s) -> s.getPrimaryContainerSurfaceLowest() & 0x70FFFFFF)
                        .containerOutlineVariant((s) -> s.getPrimaryContainerSurfaceLow() & 0x70FFFFFF)
                        .containerOutlineDisabledAlpha((s) -> 0.65f)
                        .build())
                .build());

        RadianceColorScheme2 officeBlueColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFF80BBF8), Hct.fromInt(0xFFB8D2EB), Hct.fromInt(0xFFC3DCF0)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ false,
            /* isTonalDark */ false,
            /* isMutedDark */ false,
            /* isNeutralDark */ false,
            /* isSystemDark */ false,
            /* primaryContrastLevel */ 0.8f,
            /* tonalContrastLevel */ 0.0f,
            /* mutedContrastLevel */ 0.0f,
            /* neutralContrastLevel */ 0.0f,
            /* schemeColorResolver */ officeBlueSchemeColorResolver);
        RadianceColorSchemeBundle officeBlueDefaultBundle =
            new RadianceColorSchemeBundle(officeBlueColorScheme);

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
        officeBlueDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
            ComponentState.ROLLOVER_UNSELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
            ComponentState.ROLLOVER_SELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
            ComponentState.SELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(pressedContainerTokens,
            ComponentState.PRESSED_UNSELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(pressedSelectedContainerTokens,
            ComponentState.PRESSED_SELECTED);

        // register state-specific highlight color schemes on rollover and selections
        officeBlueDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_UNSELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        officeBlueDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
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
        officeBlueDefaultBundle.registerActiveContainerTokens(rolloverMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.ROLLOVER_UNSELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(rolloverSelectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.ROLLOVER_SELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(selectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.SELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(pressedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.PRESSED_UNSELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(pressedSelectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.PRESSED_SELECTED);

        this.registerDecorationAreaSchemeBundle(officeBlueDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        PaletteContainerColorsResolver defaultPaletteColorResolver =
            PaletteResolverUtils.getPaletteTonalColorResolver();
        // Set up token resolution overlays for decoration areas to use on container and
        // container outline colors from the matching neutral container tokens of the
        // default area
        PaletteContainerColorsResolver officeBluePaletteColorResolver =
            defaultPaletteColorResolver.overlayWith(
                PaletteContainerColorsResolverOverlay.builder()
                    .onContainer((p) -> officeBlueColorScheme.getNeutralContainerTokens().getOnContainer().getRGB())
                    .onContainerVariant((p) -> officeBlueColorScheme.getNeutralContainerTokens().getOnContainerVariant().getRGB())
                    .containerOutline((p) -> officeBlueColorScheme.getNeutralContainerTokens().getContainerOutline().getRGB())
                    .containerOutlineVariant((p) -> officeBlueColorScheme.getNeutralContainerTokens().getContainerOutlineVariant().getRGB())
                    .build());

        this.registerAsDecorationArea(
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFFB6D9FF),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.4,
                /* colorResolver */ officeBluePaletteColorResolver),
            DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFFD3E7FC),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.4,
                /* colorResolver */ officeBluePaletteColorResolver),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFE5FB),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.4,
                /* colorResolver */ officeBluePaletteColorResolver),
            DecorationAreaType.CONTROL_PANE);

        this.addOverlayPainter(new BottomLineTonalOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline, ColorTransform.alpha(72))),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        this.buttonShaper = new ClassicButtonShaper();

        this.fillPainter = new FractionBasedTonalFillPainter("Office Blue 2007",
            new float[] {0.0f, 0.49999f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokensSingleColorQuery.blend(
                    ContainerColorTokens::getContainerSurfaceLow,
                    ContainerColorTokens::getContainerSurfaceLowest,
                    0.7f),
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow});

        FractionBasedTonalBorderPainter outerBorderPainter = new FractionBasedTonalBorderPainter(
            "Office Blue 2007 Outer", new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerOutline,
                ContainerColorTokens::getContainerOutline
            });
        RadianceBorderPainter innerBorderPainter =
            new FractionBasedTonalBorderPainter("Office Blue 2007 Inner",
                new float[] {0.0f, 1.0f},
                new int[] {240, 240},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                });
        this.borderPainter = new CompositeBorderPainter("Office Blue 2007",
            outerBorderPainter, innerBorderPainter);

        this.decorationPainter = new FractionBasedTonalDecorationPainter(
            "Office Blue 2007",
            new float[] {0.0f, 0.1199999f, 0.12f, 0.5f, 0.9f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceHigh,
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokensSingleColorQuery.blend(
                    ContainerColorTokens::getContainerSurfaceLow,
                    ContainerColorTokens::getContainerSurfaceLowest,
                    0.8f)});

        this.highlightFillPainter = new ClassicTonalFillPainter();
    }
}
