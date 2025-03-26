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
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TokenPalette;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.painter.decoration.FractionBasedDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.CompositeOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
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
        // For active containers, use softer outline colors.
        // Also use higher alpha values for outlines of disabled controls.
        ContainerColorTokens officeBlueDefaultActiveTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF80BBF8),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ false,
                /* contrastLevel */ -1.0),
            /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .containerOutline((p) -> p.getOnContainer() & 0x70FFFFFF)
                    .containerOutlineVariant((p) -> p.getOnContainerVariant() & 0x70FFFFFF)
                    .containerOutlineDisabledAlpha((s) -> 0.65f)
                    .build()));

        // For muted containers (enabled controls), use the same on container colors, and the same
        // outline colors as active containers with extra alpha.
        ContainerColorTokens officeBlueDefaultMutedTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFB8D2EB),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .onContainer((p) -> officeBlueDefaultActiveTokens.getOnContainer().getRGB())
                    .onContainerVariant((p) -> officeBlueDefaultActiveTokens.getOnContainerVariant().getRGB())
                    .containerOutline((p) -> officeBlueDefaultActiveTokens.getOnContainer().getRGB() & 0x70FFFFFF)
                    .containerOutlineVariant((p) -> officeBlueDefaultActiveTokens.getOnContainerVariant().getRGB() & 0x70FFFFFF)
                    .containerOutlineDisabledAlpha((p) -> 0.65f)
                    .build()));

        // For neutral containers, use the same on container colors, and the same
        // outline colors as active containers with extra alpha.
        ContainerColorTokens officeBlueDefaultNeutralTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFC3DCF0),
            /* containerConfiguration */ ContainerConfiguration.defaultLight(),
            /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .onContainer((p) -> officeBlueDefaultActiveTokens.getOnContainer().getRGB())
                    .onContainerVariant((p) -> officeBlueDefaultActiveTokens.getOnContainerVariant().getRGB())
                    .containerOutline((p) -> officeBlueDefaultActiveTokens.getOnContainer().getRGB() & 0x70FFFFFF)
                    .containerOutlineVariant((p) -> officeBlueDefaultActiveTokens.getOnContainerVariant().getRGB() & 0x70FFFFFF)
                    .containerOutlineDisabledAlpha((p) -> 0.65f)
                    .build()));

        ContainerColorTokensBundle officeBlueDefaultBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ officeBlueDefaultActiveTokens,
            /* mutedContainerTokens */ officeBlueDefaultMutedTokens,
            /* neutralContainerTokens */ officeBlueDefaultNeutralTokens,
            /* isSystemDark */ false);

        ContainerColorTokens rolloverContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFD111),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                    TokenPaletteColorResolverOverlay.builder()
                        .containerOutline(TokenPalette::getContainerOutlineVariant)
                        .containerOutlineVariant(TokenPalette::getContainerOutlineVariant)
                        .build()
                ));
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

        // register state-specific highlight color tokens on rollover and selections
        officeBlueDefaultBundle.registerActiveContainerTokens(rolloverContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.ROLLOVER_UNSELECTED);
        officeBlueDefaultBundle.registerActiveContainerTokens(selectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        officeBlueDefaultBundle.registerActiveContainerTokens(rolloverSelectedContainerTokens,
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
        ContainerColorTokens rolloverSelectedMarkContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
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

        TokenPaletteColorResolver defaultPaletteColorResolver =
            TokenPaletteColorResolverUtils.getPaletteColorResolver();
        // Set up token resolution overlays for decoration areas to use on container and
        // container outline colors from the matching neutral container tokens of the
        // default area
        TokenPaletteColorResolver officeBluePaletteColorResolver =
            defaultPaletteColorResolver.overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .onContainer((p) -> officeBlueDefaultNeutralTokens.getOnContainer().getRGB())
                    .onContainerVariant((p) -> officeBlueDefaultNeutralTokens.getOnContainerVariant().getRGB())
                    .containerOutline((p) -> officeBlueDefaultNeutralTokens.getContainerOutline().getRGB())
                    .containerOutlineVariant((p) -> officeBlueDefaultNeutralTokens.getContainerOutlineVariant().getRGB())
                    .build());

        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB6D9FF),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.4),
                /* colorResolver */ officeBluePaletteColorResolver),
            DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFD3E7FC),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.4),
                /* colorResolver */ officeBluePaletteColorResolver),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFCFE5FB),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.4),
                /* colorResolver */ officeBluePaletteColorResolver),
            DecorationAreaType.CONTROL_PANE);

        this.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline, ColorTransform.alpha(72))),
            DecorationAreaType.PRIMARY_TITLE_PANE,
            DecorationAreaType.SECONDARY_TITLE_PANE);

        this.buttonShaper = new ClassicButtonShaper();

        this.surfacePainter = new FractionBasedSurfacePainter("Office Blue 2007",
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
            "Office Blue 2007 Outer", new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerOutline,
                ContainerColorTokens::getContainerOutline
            });
        RadianceOutlinePainter innerOutlinePainter =
            new FractionBasedOutlinePainter("Office Blue 2007 Inner",
                new float[] {0.0f, 1.0f},
                new int[] {240, 240},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                });
        this.outlinePainter = new CompositeOutlinePainter("Office Blue 2007",
            outerOutlinePainter, innerOutlinePainter);

        this.decorationPainter = new FractionBasedDecorationPainter(
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

        this.highlightSurfacePainter = new ClassicSurfacePainter();
    }
}
