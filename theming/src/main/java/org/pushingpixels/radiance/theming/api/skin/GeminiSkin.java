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
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.InlayOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.*;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Gemini</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class GeminiSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Gemini";

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public GeminiSkin() {
        // Same seed for primary and muted
        ContainerColorTokens geminiDefaultActiveTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFB0BBB8),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens geminiDefaultMutedTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFB0BBB8),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ false,
                /* contrastLevel */ 0.2));
        ContainerColorTokens geminiDefaultNeutralTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFD1E1E0),
            /* containerConfiguration */ new ContainerConfiguration(
                /* isDark */ false,
                /* contrastLevel */ 0.6));

        ContainerColorTokens geminiHighlightContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFDC02),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());

        ContainerColorTokens geminiHighlightOutlineContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFDC02),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.3));

        // Use muted visuals for the container surface roles, and highlight (yellow) tokens
        // for outline roles
        ContainerColorTokens geminiHighlightRolloverContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB0BBB8),
                /* containerConfiguration */ ContainerConfiguration.defaultLight(),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                    TokenPaletteColorResolverOverlay.builder()
                        .containerOutline((p) -> geminiHighlightOutlineContainerTokens.getContainerOutlineVariant().getRGB())
                        .containerOutlineVariant((p) -> geminiHighlightOutlineContainerTokens.getContainerOutlineVariant().getRGB())
                        .build()
                ));

        ContainerColorTokensBundle geminiDefaultBundle =
            new ContainerColorTokensBundle(geminiDefaultActiveTokens, geminiDefaultMutedTokens,
                geminiDefaultNeutralTokens, false);
        // Highlight tokens for controls in selected states
        geminiDefaultBundle.registerActiveContainerTokens(geminiHighlightContainerTokens,
            ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
            ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        // Highlight rollover for controls in rollover state
        geminiDefaultBundle.registerActiveContainerTokens(geminiHighlightRolloverContainerTokens,
            ComponentState.ROLLOVER_UNSELECTED);
        // Highlights
        geminiDefaultBundle.registerActiveContainerTokens(
            geminiHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());

        this.registerDecorationAreaTokensBundle(geminiDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Control panes, footers
        this.registerAsDecorationArea(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFA9B4B1),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Toolbars
        ContainerColorTokensBundle geminiToolbarBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFDC02),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF142429),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0)),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF203042),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.4)),
            /* isSystemDark */ true);
        this.registerDecorationAreaTokensBundle(geminiToolbarBundle,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Headers
        ContainerColorTokensBundle geminiHeaderBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFDC02),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.8)),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF1C282D),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0)),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF142429),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.9)),
            /* isSystemDark */ true);
        this.registerDecorationAreaTokensBundle(geminiHeaderBundle,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
            ContainerColorTokens::getContainerOutlineVariant,
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getInverseContainerOutline,
                ColorTransform.alpha(72)));
        this.addOverlayPainter(footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // add two overlay painters to create a bezel line between
        // menu bar and toolbars
        RadianceOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
            ContainerColorTokens::getContainerOutline);
        RadianceOverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getComplementaryContainerOutline,
                ColorTransform.alpha(48)));
        this.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
        this.addOverlayPainter(toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add overlay painter to paint drop shadows along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add overlay painter to paint a dark line along the bottom
        // edge of toolbars
        RadianceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
            ContainerColorTokens::getContainerOutline);
        this.addOverlayPainter(toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        this.buttonShaper = new ClassicButtonShaper();
        this.surfacePainter = new FractionBasedSurfacePainter("Gemini",
            new float[] {0.0f, 0.6f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                ContainerColorTokens::getContainerSurface,
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceLow()
                    : colorTokens.getContainerSurfaceHigh()});

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightSurfacePainter = new FractionBasedSurfacePainter("Gemini Highlight",
            new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                ContainerColorTokens::getContainerSurface});

        this.outlinePainter = InlayOutlinePainter.builder()
            .displayName("Gemini")
            .outer(ContainerColorTokens::getContainerOutline)
            .inner(
                new float[] {0.0f, 0.5f, 1.0f},
                new int[] {96, 64, 32},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                })
            .strokeWidth(2.0f)
            .build();

        this.highlightOutlinePainter = new FlatOutlinePainter();
    }
}
