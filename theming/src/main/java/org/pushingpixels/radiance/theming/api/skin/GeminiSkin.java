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
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.*;
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
        RadianceColorScheme geminiColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFB0BBB8), Hct.fromInt(0xFFB0BBB8), Hct.fromInt(0xFFD1E1E0)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ false,
            /* isTonalDark */ false,
            /* isMutedDark */ false,
            /* isNeutralDark */ false,
            /* isSystemDark */ false,
            /* primaryContrastLevel */ 0.0f,
            /* tonalContrastLevel */ 0.0f,
            /* mutedContrastLevel */ 0.2f,
            /* neutralContrastLevel */ 0.6f,
            /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());

        ContainerColorTokens geminiHighlightContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFDC02),
                /* activeContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false);

        ContainerColorTokens geminiHighlightOutlineContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFDC02),
                /* isFidelity */ false,
                /* isDark */ false,
                /* contrast */ 0.3f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver());

        // Use muted visuals for the container surface roles, and highlight (yellow) tokens
        // for outline roles
        ContainerColorTokens geminiHighlightRolloverContainerTokens =
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFB0BBB8),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrast */ 0.0f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                    PaletteContainerColorsResolverOverlay.builder()
                        .containerOutline((p) -> geminiHighlightOutlineContainerTokens.getContainerOutlineVariant().getRGB())
                        .containerOutlineVariant((p) -> geminiHighlightOutlineContainerTokens.getContainerOutlineVariant().getRGB())
                        .build()
                ));

        RadianceColorSchemeBundle geminiDefaultBundle =
            new RadianceColorSchemeBundle(geminiColorScheme);
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

        this.registerDecorationAreaSchemeBundle(geminiDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // Control panes, footers
        this.registerAsDecorationArea(
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFA9B4B1),
                /* activeContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isFidelity */ true,
                /* isDark */ false),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Toolbars
        RadianceColorSchemeBundle geminiToolbarBundle =
            new RadianceColorSchemeBundle(ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFFFDC02), Hct.fromInt(0xFF142429), Hct.fromInt(0xFF203042)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isPrimaryDark */ false,
                /* isTonalDark */ false,
                /* isMutedDark */ true,
                /* isNeutralDark */ true,
                /* isSystemDark */ true,
                /* primaryContrastLevel */ 0.0f,
                /* tonalContrastLevel */ 0.0f,
                /* mutedContrastLevel */ 1.0f,
                /* neutralContrastLevel */ 0.4f,
                /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver()));
        this.registerDecorationAreaSchemeBundle(geminiToolbarBundle,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Headers
        RadianceColorSchemeBundle geminiHeaderBundle =
            new RadianceColorSchemeBundle(ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFFFDC02), Hct.fromInt(0xFF1C282D), Hct.fromInt(0xFF142429)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isPrimaryDark */ false,
                /* isTonalDark */ false,
                /* isMutedDark */ true,
                /* isNeutralDark */ true,
                /* isSystemDark */ true,
                /* primaryContrastLevel */ 0.0f,
                /* tonalContrastLevel */ 0.8f,
                /* mutedContrastLevel */ 1.0f,
                /* neutralContrastLevel */ 0.9f,
                /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver()));
        this.registerDecorationAreaSchemeBundle(geminiHeaderBundle,
            ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFF142429),
                /* isFidelity */ true,
                /* isDark */ true,
                /* contrastLevel */ 0.9f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelTonalOverlayPainter(
            ContainerColorTokens::getContainerOutlineVariant,
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getInverseContainerOutline,
                ColorTransform.alpha(72)));
        this.addOverlayPainter(footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // add two overlay painters to create a bezel line between
        // menu bar and toolbars
        RadianceOverlayPainter menuOverlayPainter = new BottomLineTonalOverlayPainter(
            ContainerColorTokens::getContainerOutline);
        RadianceOverlayPainter toolbarOverlayPainter = new TopLineTonalOverlayPainter(
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
        RadianceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
            ContainerColorTokens::getContainerOutline);
        this.addOverlayPainter(toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new FractionBasedTonalFillPainter("Gemini",
            new float[] {0.0f, 0.6f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                ContainerColorTokens::getContainerSurface,
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceLow()
                    : colorTokens.getContainerSurfaceHigh()});

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightFillPainter = new FractionBasedTonalFillPainter("Gemini Highlight",
            new float[] {0.0f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                (colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHigh()
                    : colorTokens.getContainerSurfaceLow(),
                ContainerColorTokens::getContainerSurface});

        this.borderPainter = new CompositeBorderPainter("Gemini",
            new FlatTonalBorderPainter(),
            new FractionBasedTonalBorderPainter("Gemini Inner",
                new float[] {0.0f, 0.5f, 1.0f},
                new int[] {96, 64, 32},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                }));
        this.highlightBorderPainter = new FlatTonalBorderPainter();
    }
}
