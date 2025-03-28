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
import org.pushingpixels.ephemeral.chroma.palettes.TokenPalette;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.CompositeOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Mariner</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class MarinerSkin extends RadianceSkin {
    public static final String NAME = "Mariner";

    public MarinerSkin() {
        ContainerColorTokensBundle marinerDefaultBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF6DD9D),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFD9D8D5),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFECF0F3),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* isSystemDark */ false);

        ContainerColorTokens marinerSelectedContainerTokens = ContainerColorTokensUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFF5D47A),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens marinerSelectedHighlightContainerTokens =
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF7D997),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());

        // More saturated seed for controls in selected state
        marinerDefaultBundle.registerActiveContainerTokens(marinerSelectedContainerTokens,
            ComponentState.SELECTED);
        // And less saturated seed for selected highlights
        marinerDefaultBundle.registerActiveContainerTokens(
            marinerSelectedHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED);
        this.registerDecorationAreaTokensBundle(marinerDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        ContainerColorTokensBundle marinerHeaderBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF5D47A),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.8)),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF281D1E),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.8)),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF2C2021),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.6)),
            /* isSystemDark */ true);

        // More saturated seed for controls in selected state
        marinerHeaderBundle.registerActiveContainerTokens(marinerSelectedContainerTokens,
            ComponentState.getActiveStates());
        // More saturated highlights
        marinerHeaderBundle.registerActiveContainerTokens(
            marinerSelectedContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        // More muted separators
        marinerHeaderBundle.registerNeutralContainerTokens(
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF261D1E),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.7)),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.SEPARATOR);
        this.registerDecorationAreaTokensBundle(marinerHeaderBundle,
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF261D1E),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0),
                /* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
                    TokenPaletteColorResolverOverlay.builder()
                        .containerOutline(TokenPalette::getContainerOutlineVariant)
                        .build())),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        ContainerColorTokensBundle marinerFooterBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF6DD9D),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFC5C4C2),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB9B7B9),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* isSystemDark */ false);

        this.registerDecorationAreaTokensBundle(marinerFooterBundle,
            ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB9B7B9),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            RadianceThemingSlices.DecorationAreaType.FOOTER,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getContainerOutline,
                ColorTransform.alpha(80)),
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getInverseContainerOutline,
                ColorTransform.alpha(48)));
        this.addOverlayPainter(footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // add an overlay painter to create a line between
        // menu bar and toolbars
        RadianceOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
            ContainerColorTokens::getContainerSurfaceHighest);
        this.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

        // add overlay painter to paint drop shadows along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(50),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add overlay painter to paint a dark line along the bottom
        // edge of toolbars
        RadianceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getContainerOutline,
                ColorTransform.alpha(128)));
        this.addOverlayPainter(toolbarBottomLineOverlayPainter,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        this.buttonShaper = new ClassicButtonShaper();
        this.surfacePainter = new FractionBasedSurfacePainter("Mariner", new float[] {0.0f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLowest(),
                ContainerColorTokens::getContainerSurface,
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceLow()
                    : colorTokens.getContainerSurfaceHigh(),
        });

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightSurfacePainter = new FractionBasedSurfacePainter("Mariner",
            new float[] {0.0f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceLow()
                    : colorTokens.getContainerSurfaceHigh(),
                ContainerColorTokens::getContainerSurface,
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
            });

        this.outlinePainter = new CompositeOutlinePainter("Mariner",
            new FlatOutlinePainter(),
            new FractionBasedOutlinePainter("Mariner Inner",
                new float[] {0.0f, 1.0f},
                new int[] {64, 64},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                }));

        this.highlightOutlinePainter = new FlatOutlinePainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
