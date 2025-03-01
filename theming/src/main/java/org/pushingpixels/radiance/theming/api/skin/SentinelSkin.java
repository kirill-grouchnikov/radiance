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

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
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
        RadianceColorScheme sentinelColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFFEB79E), Hct.fromInt(0xFFE8C3A6), Hct.fromInt(0xFFFFD8B6)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isDark */ false);

        ContainerColorTokens sentinelSelectedContainerTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFF9E7B),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isFidelity */ true,
            /* isDark */ false);
        ContainerColorTokens sentinelSelectedHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFC0A5),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);

        RadianceColorSchemeBundle sentinelDefaultBundle =
            new RadianceColorSchemeBundle(sentinelColorScheme);
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
        RadianceColorSchemeBundle sentinelHeaderBundle =
            new RadianceColorSchemeBundle(ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFFEB79E), Hct.fromInt(0xFF4A2C25), Hct.fromInt(0xFF7A5C55)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isPrimaryDark */ false,
                /* isTonalDark */ false,
                /* isMutedDark */ true,
                /* isNeutralDark */ true,
                /* isSystemDark */ true,
                /* primaryContrastLevel */ 0.0f,
                /* tonalContrastLevel */ 0.8f,
                /* mutedContrastLevel */ 0.8f,
                /* neutralContrastLevel */ 0.8f,
                /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver()));
        sentinelHeaderBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFDE9D87),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
            ComponentState.getActiveStates());
        // Lighter outlines for checkboxes and radio button menu items
        sentinelHeaderBundle.registerEnabledContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF4A2C25),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrast */ 0.0f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .containerOutline((p) -> p.getOnTonalContainer() & 0xC0FFFFFF)
                        .containerOutlineVariant((p) -> p.getOnTonalContainerVariant() & 0xC0FFFFFF)
                        .build()
                )),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK);
        sentinelHeaderBundle.registerActiveContainerTokens(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF2A0C05),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrast */ 0.2f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .containerOutline((p) -> p.getOnTonalContainer() & 0xC0FFFFFF)
                        .containerOutlineVariant((p) -> p.getOnTonalContainerVariant() & 0xC0FFFFFF)
                        .build()
                )),
            RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(sentinelHeaderBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF2A0C05),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrast */ 0.6f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // Control panes
        RadianceColorSchemeBundle sentinelControlPaneBundle =
            new RadianceColorSchemeBundle(ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFFEB79E), Hct.fromInt(0xFF8F543B), Hct.fromInt(0xFF754133)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isPrimaryDark */ false,
                /* isTonalDark */ false,
                /* isMutedDark */ true,
                /* isNeutralDark */ true,
                /* isSystemDark */ false,
                /* primaryContrastLevel */ 0.0f,
                /* tonalContrastLevel */ -0.6f,
                /* mutedContrastLevel */ -0.7f,
                /* neutralContrastLevel */ -0.7f,
                /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver()));
        this.registerDecorationAreaSchemeBundle(sentinelControlPaneBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF754133),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrast */ -0.7f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        // Toolbars and footers
        RadianceColorSchemeBundle sentinelBarsBundle =
            new RadianceColorSchemeBundle(ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFFEB79E), Hct.fromInt(0xFF703723), Hct.fromInt(0xFF53281A)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isPrimaryDark */ false,
                /* isTonalDark */ false,
                /* isMutedDark */ true,
                /* isNeutralDark */ true,
                /* isSystemDark */ false,
                /* primaryContrastLevel */ 0.0f,
                /* tonalContrastLevel */ 0.1f,
                /* mutedContrastLevel */ 0.1f,
                /* neutralContrastLevel */ 0.1f,
                /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver()));
        this.registerDecorationAreaSchemeBundle(sentinelBarsBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF53281A),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrast */ 0.1f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);
        this.addOverlayPainter(
            new BottomLineTonalOverlayPainter(ContainerColorTokens::getContainerOutline),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Add overlay painters to paint drop shadow and a dark line along the top
        // edges of footers
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(15),
            RadianceThemingSlices.DecorationAreaType.FOOTER);
        this.addOverlayPainter(
            new TopLineTonalOverlayPainter(ContainerColorTokens::getContainerOutline),
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new MatteTonalFillPainter();
        this.decorationPainter = new FlatDecorationPainter();
        this.highlightFillPainter = new MatteTonalFillPainter();
        this.borderPainter = new FlatTonalBorderPainter();
        this.highlightBorderPainter = new FlatTonalBorderPainter();
    }
}
