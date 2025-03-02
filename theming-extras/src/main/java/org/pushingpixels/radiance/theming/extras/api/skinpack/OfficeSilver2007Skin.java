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
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FractionBasedTonalDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Office Silver 2007</code> skin. This class is part of officially
 * supported API.
 *
 * @author Kirill Grouchnikov
 */
public class OfficeSilver2007Skin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Office Silver 2007";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public OfficeSilver2007Skin() {
        RadianceColorScheme officeSilverColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFC6CACF), Hct.fromInt(0xFFE6EAEE), Hct.fromInt(0xFFF2F5F5)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isDark */ false);
        RadianceColorSchemeBundle officeSilverDefaultBundle =
            new RadianceColorSchemeBundle(officeSilverColorScheme);

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
        officeSilverDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
            ComponentState.ROLLOVER_UNSELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
            ComponentState.ROLLOVER_SELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
            ComponentState.SELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(pressedContainerTokens,
            ComponentState.PRESSED_UNSELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(pressedSelectedContainerTokens,
            ComponentState.PRESSED_SELECTED);

        // register state-specific highlight color schemes on rollover and selections
        officeSilverDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_UNSELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        officeSilverDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
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
        officeSilverDefaultBundle.registerActiveContainerTokens(rolloverMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.ROLLOVER_UNSELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(rolloverSelectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.ROLLOVER_SELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(selectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.SELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(pressedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.PRESSED_UNSELECTED);
        officeSilverDefaultBundle.registerActiveContainerTokens(pressedSelectedMarkContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.PRESSED_SELECTED);

        this.registerDecorationAreaSchemeBundle(officeSilverDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFD4DE),
                /* activeContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false),
            DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFCFD0),
                /* activeContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE,
            DecorationAreaType.CONTROL_PANE);

        this.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline, ColorTransform.alpha(72))),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        this.buttonShaper = new ClassicButtonShaper();

        this.fillPainter = new FractionBasedFillPainter("Office Silver 2007",
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
            "Office Silver 2007 Outer", new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerOutline,
                ContainerColorTokens::getContainerOutline
            });
        RadianceBorderPainter innerBorderPainter =
            new FractionBasedTonalBorderPainter("Office Silver 2007 Inner",
                new float[] {0.0f, 1.0f},
                new int[] {240, 240},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                });
        this.borderPainter = new CompositeBorderPainter("Office Silver 2007",
            outerBorderPainter, innerBorderPainter);

        this.decorationPainter = new FractionBasedTonalDecorationPainter(
            "Office Silver 2007",
            new float[] {0.0f, 0.2499999f, 0.25f, 0.3f, 0.7f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurfaceLowest,
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokens::getContainerSurfaceHigh,
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokens::getContainerSurfaceLowest});

        this.highlightFillPainter = new ClassicFillPainter();
    }
}
