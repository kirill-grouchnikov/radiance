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
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.colorscheme.PaletteContainerColorsResolverOverlay;
import org.pushingpixels.radiance.theming.api.colorscheme.PaletteResolverUtils;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Sentinel</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class SentinelSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Sentinel";

    public String getDisplayName() {
        return NAME;
    }

    public SentinelSkin() {
        RadianceColorSchemeBundle sentinelDefaultBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFEB79E),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFE8C3A6),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFD8B6),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            /* isSystemDark */ false);

        ContainerColorTokens sentinelSelectedContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF9E7B),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens sentinelSelectedHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFC0A5),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());

        // More saturated seed for controls in selected state
        sentinelDefaultBundle.registerActiveContainerTokens(sentinelSelectedContainerTokens,
            ComponentState.SELECTED);
        // Less saturated seed for selected highlights
        sentinelDefaultBundle.registerActiveContainerTokens(
            sentinelSelectedHighlightContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.SELECTED, ComponentState.ARMED);
        this.registerDecorationAreaSchemeBundle(sentinelDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Headers
        RadianceColorSchemeBundle sentinelHeaderBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFEB79E),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.8)),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF4A2C25),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.8)),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF7A5C55),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.8)),
            /* isSystemDark */ true);

        sentinelHeaderBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFDE9D87),
                /* containerConfiguration */ ContainerConfiguration.defaultLight()),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        // Lighter outlines for checkboxes and radio button menu items
        sentinelHeaderBundle.registerEnabledContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF4A2C25),
                /* containerConfiguration */ ContainerConfiguration.defaultDark(),
                /* colorResolver */ PaletteResolverUtils.getPaletteColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .containerOutline((p) -> p.getOnContainer() & 0xC0FFFFFF)
                        .containerOutlineVariant((p) -> p.getOnContainerVariant() & 0xC0FFFFFF)
                        .build()
                )),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK);
        sentinelHeaderBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF2A0C05),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.2),
                /* colorResolver */ PaletteResolverUtils.getPaletteColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .containerOutline((p) -> p.getOnContainer() & 0xC0FFFFFF)
                        .containerOutlineVariant((p) -> p.getOnContainerVariant() & 0xC0FFFFFF)
                        .build()
                )),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(sentinelHeaderBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF2A0C05),
                /* true */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.6)),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // Control panes
        RadianceColorSchemeBundle sentinelControlPaneBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFEB79E),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ -0.6)),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF8F543B),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ -0.7)),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF754133),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ -0.7)),
            /* isSystemDark */ true);

        this.registerDecorationAreaSchemeBundle(sentinelControlPaneBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF754133),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ -0.7)),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        // Toolbars and footers
        RadianceColorSchemeBundle sentinelBarsBundle = new RadianceColorSchemeBundle(
            /* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFEB79E),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ false,
                    /* contrastLevel */ 0.1)),
            /* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF703723),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.1)),
            /* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF53281A),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.1)),
            /* isSystemDark */ true);
        this.registerDecorationAreaSchemeBundle(sentinelBarsBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF53281A),
                /* containerConfiguration */ new ContainerConfiguration(
                    /* isDark */ true,
                    /* contrastLevel */ 0.1)),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);
        this.addOverlayPainter(
            new BottomLineOverlayPainter(ContainerColorTokens::getContainerOutline),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Add overlay painters to paint drop shadow and a dark line along the top
        // edges of footers
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(15),
            RadianceThemingSlices.DecorationAreaType.FOOTER);
        this.addOverlayPainter(
            new TopLineOverlayPainter(ContainerColorTokens::getContainerOutline),
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new MatteFillPainter();
        this.decorationPainter = new FlatDecorationPainter();
        this.highlightFillPainter = new MatteFillPainter();
        this.outlinePainter = new FlatOutlinePainter();
        this.highlightOutlinePainter = new FlatOutlinePainter();
    }
}
