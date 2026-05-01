/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TokenPalette;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.decorator.rootpane.DefaultRootPaneDecorator;
import org.pushingpixels.radiance.theming.api.painter.decoration.FractionBasedDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FlatSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper;

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
        // Set up token resolution overlays for all containers:
        // 1. Outlines with additional alpha to make them softer.
        // 2. Custom alpha for outlines of disabled controls to have higher contrast and make
        //    them more visible.
        TokenPaletteColorResolver officeBlackPaletteResolver = TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
            TokenPaletteColorResolverOverlay.builder()
                .containerOutline((p) -> p.getContainerOutline() & 0xA0FFFFFF)
                .containerOutlineVariant((p) -> p.getContainerOutlineVariant() & 0xA0FFFFFF)
                .containerOutlineDisabledAlpha((s) -> 0.75f)
                .build());

        ContainerColorTokensBundle officeBlackDefaultBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFC6CACF),
                /* containerConfiguration */ ContainerConfiguration.defaultLight(),
                /* colorResolver */ officeBlackPaletteResolver),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB8C0C9),
                /* containerConfiguration */ ContainerConfiguration.defaultLight(),
                /* colorResolver */ officeBlackPaletteResolver),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFD5DA),
                /* containerConfiguration */ ContainerConfiguration.defaultLight(),
                /* colorResolver */ officeBlackPaletteResolver),
            /* isSystemDark */ false);

        ContainerColorTokens rolloverContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFD111),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ officeBlackPaletteResolver);
        ContainerColorTokens selectedContainerTokens =
            ContainerColorTokensUtils.getBimodalContainerTokens(
                /* seedOne */ Hct.fromInt(0xFFFFA300),
                /* seedTwo */ Hct.fromInt(0xFFFFD007),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* fidelityTone */ 83.0,
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.2,
                    /* surfaceRangeAmplitudeFactor */ 1.0),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver());
        ContainerColorTokens rolloverSelectedContainerTokens =
            ContainerColorTokensUtils.getBimodalContainerTokens(
                /* seedOne */ Hct.fromInt(0xFFFFA300),
                /* seedTwo */ Hct.fromInt(0xFFFFD007),
                /* transitionRange */ DynamicBimodalPalette.TransitionRange.TONAL_CONTAINER_SURFACES,
                /* fidelityTone */ 79.0,
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.2,
                    /* surfaceRangeAmplitudeFactor */ 1.0),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver());
        ContainerColorTokens pressedContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF8C18),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens pressedSelectedContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF991C),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());

        // register state-specific color tokens on rollovers, presses and selections
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

        // register state-specific highlight color tokens on rollover and selections
        officeBlackDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_UNSELECTED);
        officeBlackDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        officeBlackDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_SELECTED);

        TokenPaletteColorResolver activeMarksColorResolver =
            TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .onContainer(TokenPalette::getContainerOutline)
                    .build());

        ContainerColorTokens rolloverMarkContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFD111),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens selectedMarkContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFBD51),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens rolloverSelectedMarkContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFA400),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens pressedMarkContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF8C18),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);
        ContainerColorTokens pressedSelectedMarkContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF991C),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ activeMarksColorResolver);

        // register state-specific color tokens on mark rollovers, presses and selections
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

        this.registerDecorationAreaTokensBundle(officeBlackDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF3D3D3D),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0)),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        ContainerColorTokensBundle officeBlackSecondaryBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB9BCC1),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF454545),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0)),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF2D2D2D),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0)),
            /* isSystemDark */ true);

        officeBlackSecondaryBundle.registerActiveContainerTokens(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFD5DA),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            ComponentState.getActiveStates());
        officeBlackSecondaryBundle.registerActiveContainerTokens(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFD5DA),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());

        this.registerDecorationAreaTokensBundle(
            officeBlackSecondaryBundle,
            DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB3BEC8),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 1.0)),
            DecorationAreaType.CONTROL_PANE);

        this.registerComponentShaper(new ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);

        this.surfacePainter = new FractionBasedSurfacePainter("Office Black 2007",
            new float[] {0.0f, 0.49999f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                ContainerColorTokens::getContainerSurface,
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow()});

        this.outlinePainter = new FlatOutlinePainter();

        this.decorationPainter = new FractionBasedDecorationPainter(
            "Office Black 2007",
            new float[] {0.0f, 0.29999f, 0.3f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow,
                ContainerColorTokens::getContainerSurfaceLowest,
                ContainerColorTokens::getContainerSurfaceLowest});
        this.decorationPainter.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline, ColorTransform.alpha(128))),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        this.highlightSurfacePainter = new FlatSurfacePainter("Office Black 2007",
            ContainerColorTokens::getContainerSurface);

        this.rootPaneDecorator = new DefaultRootPaneDecorator();
    }
}
