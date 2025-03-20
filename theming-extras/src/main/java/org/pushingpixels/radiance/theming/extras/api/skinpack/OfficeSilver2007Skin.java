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
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.FractionBasedDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.CompositeOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
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
        RadianceColorSchemeBundle officeSilverDefaultBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFC6CACF),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFE6EAEE),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF2F5F5),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* isSystemDark */ false);

        ContainerColorTokens rolloverContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFD111),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ PaletteResolverUtils.getPaletteColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .containerOutline(DynamicPalette::getContainerOutlineVariant)
                        .containerOutlineVariant(DynamicPalette::getContainerOutlineVariant)
                        .build()
                ));
        ContainerColorTokens selectedContainerTokens =
            ColorSchemeUtils.getBimodalContainerTokens(
                /* seedOne */ Hct.fromInt(0xFFFFA300),
                /* seedTwo */ Hct.fromInt(0xFFFFD007),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* fidelityTone */ 83.0,
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.2,
                    /* surfaceRangeAmplitudeFactor */ 1.0),
                /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteColorResolver());;
        ContainerColorTokens rolloverSelectedContainerTokens =
            ColorSchemeUtils.getBimodalContainerTokens(
                /* seedOne */ Hct.fromInt(0xFFFFA300),
                /* seedTwo */ Hct.fromInt(0xFFFFD007),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* fidelityTone */ 79.0,
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.2,
                    /* surfaceRangeAmplitudeFactor */ 1.0),
                /* colorResolver */ BimodalPaletteResolverUtils.getBimodalPaletteColorResolver());;
        ContainerColorTokens pressedContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF8C18),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens pressedSelectedContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF991C),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());

        // register state-specific color tokens on rollovers, presses and selections
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

        // register state-specific highlight color tokens on rollover and selections
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
            PaletteResolverUtils.getPaletteColorResolver().overlayWith(
                PaletteContainerColorsResolverOverlay.builder()
                    .onContainer(DynamicPalette::getContainerOutline)
                    .build());

        ContainerColorTokens rolloverMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFD111),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens selectedMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFBD51),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens rolloverSelectedMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFA400),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens pressedMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF8C18),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens pressedSelectedMarkContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF991C),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);

        // register state-specific color tokens on mark rollovers, presses and selections
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
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFCFD0),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE,
            DecorationAreaType.CONTROL_PANE);

        this.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline, ColorTransform.alpha(72))),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        this.buttonShaper = new ClassicButtonShaper();

        this.surfacePainter = new FractionBasedSurfacePainter("Office Silver 2007",
            new float[] {0.0f, 0.49999f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokensSingleColorQuery.blend(
                    ContainerColorTokens::getContainerSurfaceLow,
                    ContainerColorTokens::getContainerSurfaceLowest,
                    0.7f),
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow});

        FractionBasedOutlinePainter outerOutlinePainter = new FractionBasedOutlinePainter(
            "Office Silver 2007 Outer", new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerOutline,
                ContainerColorTokens::getContainerOutline
            });
        RadianceOutlinePainter innerOutlinePainter =
            new FractionBasedOutlinePainter("Office Silver 2007 Inner",
                new float[] {0.0f, 1.0f},
                new int[] {240, 240},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                });
        this.outlinePainter = new CompositeOutlinePainter("Office Silver 2007",
            outerOutlinePainter, innerOutlinePainter);

        this.decorationPainter = new FractionBasedDecorationPainter(
            "Office Silver 2007",
            new float[] {0.0f, 0.2499999f, 0.25f, 0.3f, 0.7f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurfaceLowest,
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokens::getContainerSurfaceHigh,
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokens::getContainerSurfaceLowest});

        this.highlightSurfacePainter = new ClassicSurfacePainter();
    }
}
