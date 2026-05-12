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
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.decorator.rootpane.DefaultRootPaneDecorator;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.TopLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FlatSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ColorTransform;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper;

/**
 * <code>Harvest</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class HarvestSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Harvest";

    public String getDisplayName() {
        return NAME;
    }

    public HarvestSkin() {
        ContainerColorTokensBundle harvestDefaultBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFAEEAD),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFFCE9),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFCFAD6),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* isSystemDark */ false);

        ContainerColorTokens harvestActiveContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFCCC8),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ false,
                /* contrastLevel */ 0.8));
        ContainerColorTokens harvestHighlightContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFD6CA),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.8));

        harvestDefaultBundle.registerActiveContainerTokens(harvestActiveContainerTokens,
            ComponentState.getActiveStates());
        harvestDefaultBundle.registerActiveContainerTokens(
            harvestHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaTokensBundle(harvestDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        ContainerColorTokensBundle harvestHeaderBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF12B37),
                /* containerConfiguration */ ContainerConfiguration.defaultDark()),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getDuotoneContainerTokens(
                /* seedContainer */ Hct.fromInt(0xFF5B5B54),
                /* seedOnContainer */ Hct.fromInt(0xFFFCFAD6),
                /* containerConfiguration */ ContainerConfiguration.defaultDark(),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver()),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getDuotoneContainerTokens(
                /* seedContainer */ Hct.fromInt(0xFF3A3A39),
                /* seedOnContainer */ Hct.fromInt(0xFFFCFAD6),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.6),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver()),
            /* isSystemDark */ false);

        harvestHeaderBundle.registerActiveContainerTokens(
            harvestHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaTokensBundle(harvestHeaderBundle,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFCF7C0),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        this.registerComponentShaper(new ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);
        this.surfacePainter = new MatteSurfacePainter();

        this.decorationPainter = new FlatDecorationPainter();
        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.decorationPainter.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);
        this.decorationPainter.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokens::getContainerOutline, ColorTransform.alpha(128))),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Add overlay painters to paint drop shadow and a dark line along the top
        // edges of footers
        this.decorationPainter.addOverlayPainter(TopShadowOverlayPainter.getInstance(15),
            RadianceThemingSlices.DecorationAreaType.FOOTER);
        this.decorationPainter.addOverlayPainter(new TopLineOverlayPainter(
                ContainerColorTokens::getContainerOutline),
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.highlightSurfacePainter = new FlatSurfacePainter("Harvest",
            ContainerColorTokens::getContainerSurface);
        this.outlinePainter = new FractionBasedOutlinePainter("Harvest",
            new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerOutlineVariant,
                ContainerColorTokens::getContainerOutlineVariant});

        this.highlightOutlinePainter = new FlatOutlinePainter();

        this.rootPaneDecorator = new DefaultRootPaneDecorator();
    }
}
