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
package org.pushingpixels.radiance.demo.themingapps.cookbook.skin;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.ContainerColorTokensBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.outline.CompositeOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ColorTransform;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

public class CookbookSkin extends RadianceSkin {

    @Override
    public String getDisplayName() {
        return "Cookbook";
    }

    public CookbookSkin() {
        ContainerColorTokensBundle cookbookDefaultBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFC8A26E),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFE3E4DC),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFEDF3E4),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.6)),
            /* isSystemDark */ false);
        this.registerDecorationAreaSchemeBundle(cookbookDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        ContainerColorTokensBundle cookbookControlPaneBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF974F11),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.6)),
            /* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB25406),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.6)),
            /* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF6D2103),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.6)),
            /* isSystemDark */ false);
        this.registerDecorationAreaSchemeBundle(cookbookControlPaneBundle,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        ContainerColorTokensBundle cookbookChromeBundle = new ContainerColorTokensBundle(
            /* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF581000),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 1.0)),
            /* mutedContainerTokens */ CookbookTokens.GOLDEN_BROWN_TOKENS,
            /* neutralContainerTokens */ CookbookTokens.GOLDEN_BROWN_TOKENS,
            /* isSystemDark */ true);

        this.registerDecorationAreaSchemeBundle(cookbookChromeBundle,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.surfacePainter = new CookbookSurfacePainter();

        this.outlinePainter = new CompositeOutlinePainter("Cookbook",
            new FractionBasedOutlinePainter("Cookbook Outer",
                new float[] {0.0f, 0.5f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokensSingleColorQuery.blend(
                        ContainerColorTokens::getContainerOutlineVariant,
                        ContainerColorTokens::getContainerOutline,
                        0.8f),
                    ContainerColorTokens::getContainerOutline,
                    ContainerColorTokens::getContainerOutline,
                }),
            new FractionBasedOutlinePainter("Cookbook Inner",
                new float[] {0.0f, 0.5f, 1.0f},
                new int[] {112, 80, 64},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                }));

        this.decorationPainter = new CookbookDecorationPainter();
        this.highlightSurfacePainter = new MatteSurfacePainter();

        // Add an overlay painter to paint a bezel line along the top edge of the footer area
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getContainerOutlineVariant,
                ColorTransform.alpha(192)),
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getComplementaryContainerOutline,
                ColorTransform.alpha(96)));
        this.addOverlayPainter(footerTopBezelOverlayPainter,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Add overlay painter to paint drop shadows along the bottom
        // edges of the title pane
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(64),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);

        // Add an overlay painter to paint a dark line along the bottom
        // edge of the title pane
        RadianceOverlayPainter titlePaneBottomLineOverlayPainter = new BottomLineOverlayPainter(
            ContainerColorTokens::getContainerOutline);
        this.addOverlayPainter(titlePaneBottomLineOverlayPainter,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
    }
}
