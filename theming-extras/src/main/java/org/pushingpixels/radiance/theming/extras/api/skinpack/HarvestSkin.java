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

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

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
        SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();

        RadianceColorScheme harvestColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFFAEEAD), Hct.fromInt(0xFFFFFCE9), Hct.fromInt(0xFFFCFAD6)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ false,
            /* isTonalDark */ false,
            /* isMutedDark */ false,
            /* isNeutralDark */ false,
            /* isSystemDark */ false,
            /* primaryContrastLevel */ 0.6f,
            /* tonalContrastLevel */ 0.6f,
            /* mutedContrastLevel */ 0.6f,
            /* neutralContrastLevel */ 0.6f,
            /* schemeColorResolver */ defaultSchemeColorResolver);

        ContainerColorTokens harvestActiveContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFCCC8),
            /* isFidelity */ true,
            /* isDark */ false,
            /* contrastLevel */ 0.8f,
            /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver());
        ContainerColorTokens harvestHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFD6CA),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.8f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver());

        RadianceColorSchemeBundle harvestDefaultBundle =
            new RadianceColorSchemeBundle(harvestColorScheme);
        harvestDefaultBundle.registerActiveContainerTokens(harvestActiveContainerTokens,
            ComponentState.getActiveStates());
        harvestDefaultBundle.registerActiveContainerTokens(
            harvestHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(harvestDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Set up token resolution overlays. For muted and neutral containers, take the
        // neutral container surface fill to be the on container roles.
        SchemeColorResolver harvestHeaderSchemeColorResolver = defaultSchemeColorResolver.overlayWith(
            SchemeColorResolverOverlay.builder()
                .neutralContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer((s) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurface().getRGB())
                        .onContainerVariant((s) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurfaceHigh().getRGB())
                        .build())
                .mutedContainerResolverOverlay(
                    SchemeContainerColorsResolverOverlay.builder()
                        .onContainer((s) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurface().getRGB())
                        .onContainerVariant((s) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurfaceHigh().getRGB())
                        .build())
                .build());

        RadianceColorSchemeBundle harvestHeaderBundle =
            new RadianceColorSchemeBundle(ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFF12B37), Hct.fromInt(0xFF5B5B54), Hct.fromInt(0xFF3A3A39)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isPrimaryDark */ true,
                /* isTonalDark */ true,
                /* isMutedDark */ true,
                /* isNeutralDark */ true,
                /* isSystemDark */ true,
                /* primaryContrastLevel */ 0.0f,
                /* tonalContrastLevel */ 0.0f,
                /* mutedContrastLevel */ 0.0f,
                /* neutralContrastLevel */ 0.0f,
                /* schemeColorResolver */ harvestHeaderSchemeColorResolver));
        harvestHeaderBundle.registerActiveContainerTokens(
            harvestHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(harvestHeaderBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF3A3A39),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 0.6f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .onContainer((p) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurface().getRGB())
                        .onContainerVariant((p) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurfaceHigh().getRGB())
                        .build()
                )),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFCF7C0),
                /* activeContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);
        this.addOverlayPainter(new BottomLineOverlayPainter(
                ContainerColorTokens::getContainerOutline),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Add overlay painters to paint drop shadow and a dark line along the top
        // edges of footers
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(15),
            RadianceThemingSlices.DecorationAreaType.FOOTER);
        this.addOverlayPainter(new TopLineOverlayPainter(
                ContainerColorTokens::getContainerOutline),
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new MatteFillPainter();
        this.decorationPainter = new FlatDecorationPainter();
        this.highlightFillPainter = new MatteFillPainter();
        this.borderPainter = new FractionBasedTonalBorderPainter("Harvest",
            new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerOutlineVariant,
                ContainerColorTokens::getContainerOutlineVariant});

        this.highlightBorderPainter = new FlatBorderPainter();
    }
}
