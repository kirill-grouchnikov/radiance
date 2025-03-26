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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.CompositeOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.*;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

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
        ContainerColorTokensBundle magellanDefaultBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF0070DF),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ -0.1),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                    // For active containers, use softer text / icon colors.
                    TokenPaletteColorResolverOverlay.builder()
                        .onContainer((p) -> p.getOnContainer() & 0xE0FFFFFF)
                        .onContainerVariant((p) -> p.getOnContainerVariant() & 0xE0FFFFFF)
                        .build())),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF004C92),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.1)),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF005CB7),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ -0.2),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                    // For neutral containers, use softer text / icon colors
                    TokenPaletteColorResolverOverlay.builder()
                        .onContainer((p) -> p.getOnContainer() & 0xD0FFFFFF)
                        .onContainerVariant((p) -> p.getOnContainerVariant() & 0xD0FFFFFF)
                        .build())),
            /* isSystemDark */ true);

        ContainerColorTokens magellanSelectedContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF006FDB),
                /* containerConfiguration */ ContainerConfiguration.defaultDark(),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                    TokenPaletteColorResolverOverlay.builder()
                        .onContainer((p) -> p.getOnContainer() & 0xE0FFFFFF)
                        .onContainerVariant((p) -> p.getOnContainerVariant() & 0xE0FFFFFF)
                        .build()));

        ContainerColorTokens magellanPressedContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00AEB8),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());

        ContainerColorTokens magellanGreenContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF1EBF00),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens magellanGreenRolloverContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00B933),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens magellanGreenHighlightSelectedContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00B000),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens magellanGreenHighlightRolloverContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF00A422),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());

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
        this.registerDecorationAreaTokensBundle(magellanDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Toolbars, control panes
        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF004D99),
                /* containerConfiguration */ ContainerConfiguration.defaultDark()),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        ContainerColorTokensBundle magellanFooterBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF006FDB),
                /* containerConfiguration */ ContainerConfiguration.defaultDark()),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFA0D8F7),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF9DD2FF),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* isSystemDark */ false);

        this.registerDecorationAreaTokensBundle(magellanFooterBundle,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Headers
        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF003367),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.4)),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // Add overlay painters to paint drop shadows along the bottom edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a dark line along the bottom
        // edge of toolbars
        RadianceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
            ContainerColorTokens::getContainerOutlineVariant);
        this.addOverlayPainter(toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a light line along the top
        // edge of toolbars
        RadianceOverlayPainter toolbarTopLineOverlayPainter = new TopLineOverlayPainter(
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getInverseContainerOutline,
                ColorTransform.alpha(96)));
        this.addOverlayPainter(toolbarTopLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        RadianceOverlayPainter footerTopShadowOverlayPainter = TopShadowOverlayPainter.getInstance(100);
        this.addOverlayPainter(footerTopShadowOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.surfacePainter = new FractionBasedSurfacePainter("Magellan",
            new float[] {0.0f, 0.3f, 0.6f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark()
                    ? RadianceColorUtilities.getInterpolatedColor(
                        colorTokens.getContainerSurfaceHighest(),
                        colorTokens.getContainerSurfaceHigh(),
                        0.6f)
                    :  RadianceColorUtilities.getInterpolatedColor(
                        colorTokens.getContainerSurfaceLowest(),
                        colorTokens.getContainerSurfaceLow(),
                        0.6f),
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                ContainerColorTokens::getContainerSurface,
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceLowest()
                    : colorTokens.getContainerSurfaceHighest()});

        this.decorationPainter = new FlatDecorationPainter();
        this.highlightSurfacePainter = new ClassicSurfacePainter();

        this.outlinePainter = new CompositeOutlinePainter("Magellan",
            new FlatOutlinePainter(),
            new FractionBasedOutlinePainter("Magellan Inner",
                new float[] {0.0f, 0.5f, 1.0f},
                new int[] {112, 80, 64},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                }));
    }
}
