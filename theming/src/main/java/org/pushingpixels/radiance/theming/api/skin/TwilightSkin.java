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
package org.pushingpixels.radiance.theming.api.skin;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TokenPalette;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.InlayOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.*;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Twilight</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class TwilightSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Twilight";

    public String getDisplayName() {
        return NAME;
    }

    public TwilightSkin() {
        // For muted containers (enabled controls), use higher alpha values for disabled
        // controls for better contrast.
        TokenPaletteColorResolver mutedResolver =
            TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .containerSurfaceDisabledAlpha((s) -> 0.5f)
                    .onContainerDisabledAlpha((s) -> 0.6f)
                    .containerOutlineDisabledAlpha((s) -> 0.55f)
                    .build());
        ContainerColorTokens twilightDefaultMutedTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF3B3A32),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ -0.1),
            /* colorResolver */ mutedResolver);

        // For active containers, use higher alpha values for disabled
        // controls for better contrast. Also use muted outlines for border consistency
        // with enabled controls.
        TokenPaletteColorResolver resolver =
            TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .containerOutline((p) -> twilightDefaultMutedTokens.getContainerOutline().getRGB())
                    .containerOutlineVariant((p) -> twilightDefaultMutedTokens.getContainerOutlineVariant().getRGB())
                    .containerSurfaceDisabledAlpha((p) -> 0.4f)
                    .onContainerDisabledAlpha((p) -> 0.6f)
                    .containerOutlineDisabledAlpha((p) -> 0.55f)
                    .build());
        ContainerColorTokens twilightDefaultActiveTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF8F8B7A),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ false,
                /* contrastLevel */ 0.2),
            /* colorResolver */ resolver);

        // For neutral containers, use the text / icon colors from the muted containers
        // for better visual consistency
        TokenPaletteColorResolver neutralResolver =
            TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .onContainer((p) -> twilightDefaultMutedTokens.getOnContainer().getRGB())
                    .onContainerVariant((p) -> twilightDefaultMutedTokens.getOnContainerVariant().getRGB())
                    .build());
        ContainerColorTokens twilightDefaultNeutralTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF48443B),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ true,
                /* contrastLevel */ -0.1),
            /* colorResolver */ neutralResolver);

        TokenPaletteColorResolver defaultPaletteContainerColorResolver =
            TokenPaletteColorResolverUtils.getPaletteColorResolver();
        TokenPaletteColorResolver twilightPaletteContainerColorResolver =
            defaultPaletteContainerColorResolver.overlayWith(
                TokenPaletteColorResolverOverlay.builder()
                    .containerOutline(TokenPalette::getOnContainer)
                    .containerOutlineVariant(TokenPalette::getOnContainerVariant)
                    .build());

        ContainerColorTokens twilightSelectedContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF91865D),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ -0.1),
                /* colorResolver */ twilightPaletteContainerColorResolver);
        ContainerColorTokens twilightSelectedHighlightContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF8F8B7A),
                /* containerConfiguration */ ContainerConfiguration.defaultLight(),
                /* colorResolver */ twilightPaletteContainerColorResolver);

        ContainerColorTokensBundle twilightDefaultBundle =
            new ContainerColorTokensBundle(twilightDefaultActiveTokens, twilightDefaultMutedTokens,
                twilightDefaultNeutralTokens, true);
        // More saturated seed for controls in selected state
        twilightDefaultBundle.registerActiveContainerTokens(twilightSelectedContainerTokens,
            ComponentState.SELECTED);
        // And less saturated seed for selected highlights
        twilightDefaultBundle.registerActiveContainerTokens(
            twilightSelectedHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED);
        // Selected tabs with active (not muted) outlines
        twilightDefaultBundle.registerActiveContainerTokens(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF91865D),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ -0.1)),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB,
            ComponentState.SELECTED);
        twilightDefaultBundle.registerActiveContainerTokens(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF8F8B7A),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ -0.1)),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB,
            ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_UNSELECTED);
        this.registerDecorationAreaTokensBundle(twilightDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Toolbars, footers
        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF45433A),
                /* containerConfiguration */ ContainerConfiguration.defaultDark()),
            RadianceThemingSlices.DecorationAreaType.FOOTER,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Control panes
        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF504E45),
                /* containerConfiguration */ ContainerConfiguration.defaultDark()),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        // Headers
        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF0E0E0E),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.4)),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // Add overlay painters to paint drop shadows along the bottom
        // edges of toolbars and footers
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR, RadianceThemingSlices.DecorationAreaType.FOOTER);

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
                ColorTransform.alpha(32)));
        this.addOverlayPainter(toolbarTopLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
            ContainerColorTokens::getContainerOutlineVariant,
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getInverseContainerOutline,
                ColorTransform.alpha(72)));
        this.addOverlayPainter(footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.registerButtonShaper(new ClassicButtonShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);
        this.surfacePainter = new FractionBasedSurfacePainter("Twilight",
            new float[] {0.0f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokensSingleColorQuery.blend(
                    ContainerColorTokens::getContainerSurfaceHigh,
                    ContainerColorTokens::getContainerSurface,
                    0.4f),
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurface});
        this.decorationPainter = new FlatDecorationPainter();
        this.highlightSurfacePainter = new ClassicSurfacePainter();
        this.outlinePainter = InlayOutlinePainter.builder()
            .displayName("Twilight")
            .outer(ContainerColorTokens::getContainerOutline)
            .inner(
                new float[] {0.0f, 0.5f, 1.0f},
                new int[] {32, 24, 24},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                })
            .build();
    }
}
