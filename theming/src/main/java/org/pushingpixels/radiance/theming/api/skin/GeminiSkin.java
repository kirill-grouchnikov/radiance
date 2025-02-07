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
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
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

    /**
     * Creates a new <code>Gemini</code> skin.
     */
    public GeminiSkin() {
        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/gemini.colorschemes"));

        RadianceColorScheme grayScheme = schemes.get("Gemini Gray");
        RadianceColorScheme disabledScheme = schemes.get("Gemini Disabled");

        // use the same color scheme for active and enabled controls
        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(grayScheme,
                grayScheme, disabledScheme);

        // highlight fill scheme + custom alpha for rollover unselected state
        RadianceColorScheme highlightScheme = schemes.get("Gemini Highlight");
        RadianceColorScheme highlightBorderScheme = schemes.get("Gemini Highlight Border");
        applyHighlightColorScheme(defaultSchemeBundle, highlightScheme);
        applyHighlightAsFill(defaultSchemeBundle, highlightScheme, highlightBorderScheme);

        // borders, separators, marks
        RadianceColorScheme grayBorderScheme = schemes.get("Gemini Gray Border");
        RadianceColorScheme lightGrayBorderScheme = schemes.get("Gemini Light Gray Border");
        RadianceColorScheme darkGraySeparatorScheme = schemes.get("Gemini Dark Gray Separator");
        defaultSchemeBundle.registerColorScheme(grayBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        defaultSchemeBundle.registerColorScheme(lightGrayBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_DEFAULT,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(grayScheme, ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(darkGraySeparatorScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);
        defaultSchemeBundle.registerColorScheme(grayScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);

        defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(highlightScheme.tone(0.2f), ComponentState.DISABLED_SELECTED);

        RadianceColorScheme whiteBackgroundScheme = schemes.get("Gemini White Background");

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, whiteBackgroundScheme,
                RadianceThemingSlices.DecorationAreaType.NONE);

        // control pane color scheme bundle
        RadianceColorSchemeBundle controlPaneSchemeBundle = new RadianceColorSchemeBundle(grayScheme,
                grayScheme, disabledScheme);
        controlPaneSchemeBundle.registerColorScheme(grayScheme, ComponentState.ROLLOVER_UNSELECTED);
        controlPaneSchemeBundle.registerColorScheme(grayScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);
        controlPaneSchemeBundle.registerColorScheme(grayBorderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        controlPaneSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        applyHighlightColorScheme(controlPaneSchemeBundle, highlightScheme);
        applyHighlightAsFill(controlPaneSchemeBundle, highlightScheme, highlightBorderScheme);
        this.registerDecorationAreaSchemeBundle(controlPaneSchemeBundle, grayScheme,
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // header color scheme bundle
        RadianceColorScheme blackColorScheme = schemes.get("Gemini Black");
        RadianceColorScheme activeHeaderScheme = schemes.get("Gemini Black Active Header");
        RadianceColorScheme disabledHeaderScheme = schemes.get("Gemini Black Disabled Header");
        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
                activeHeaderScheme, blackColorScheme, blackColorScheme);
        headerSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(blackColorScheme,
                ComponentState.ROLLOVER_UNSELECTED);
        headerSchemeBundle.registerColorScheme(blackColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);
        headerSchemeBundle.registerColorScheme(
                grayScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerColorScheme(blackColorScheme.shade(0.9f),
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        applyHighlightColorScheme(headerSchemeBundle, highlightScheme);
        applyHighlightAsFill(headerSchemeBundle, highlightScheme, highlightBorderScheme);
        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, blackColorScheme,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

        // toolbar color scheme bundle
        RadianceColorScheme darkBlueColorScheme = schemes.get("Gemini Dark Blue");
        RadianceColorScheme darkBlueBackgroundColorScheme = schemes.get("Gemini Dark Blue Background");
        RadianceColorScheme darkBlueSeparatorColorScheme = schemes.get("Gemini Dark Blue Separator");
        RadianceColorSchemeBundle toolbarSchemeBundle = new RadianceColorSchemeBundle(
                blackColorScheme, darkBlueColorScheme, darkBlueColorScheme);
        toolbarSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        toolbarSchemeBundle.registerColorScheme(blackColorScheme, ComponentState.DISABLED_SELECTED);
        toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme, ComponentState.DISABLED_UNSELECTED);
        toolbarSchemeBundle.registerColorScheme(blackColorScheme, ComponentState.ROLLOVER_UNSELECTED);
        toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);
        toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        toolbarSchemeBundle.registerColorScheme(darkBlueSeparatorColorScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);
        toolbarSchemeBundle.registerColorScheme(highlightScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.PRESSED_SELECTED);
        applyHighlightColorScheme(toolbarSchemeBundle, highlightScheme);
        applyHighlightAsFill(toolbarSchemeBundle, highlightScheme, darkBlueColorScheme);
        this.registerDecorationAreaSchemeBundle(toolbarSchemeBundle, darkBlueBackgroundColorScheme,
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        this.configureOverlayPainters();

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new FractionBasedFillPainter("Gemini", new float[] {0.0f, 0.5f, 1.0f},
            new ColorSchemeSingleColorQuery[] {
                ColorSchemeSingleColorQuery.EXTRALIGHT,
                ColorSchemeSingleColorQuery.LIGHT,
                ColorSchemeSingleColorQuery.MID});

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightFillPainter = new ClassicFillPainter();

        FractionBasedBorderPainter outerBorderPainter = new FractionBasedBorderPainter(
            "Gemini Outer", new float[] {0.0f, 0.5f, 1.0f},
            new ColorSchemeSingleColorQuery[] {
                ColorSchemeSingleColorQuery.ULTRADARK,
                ColorSchemeSingleColorQuery.ULTRADARK,
                ColorSchemeSingleColorQuery.ULTRADARK});
        RadianceBorderPainter innerBorderPainter = new DelegateFractionBasedBorderPainter(
            "Gemini Inner", outerBorderPainter,
            new int[] {0x60FFFFFF, 0x40FFFFFF, 0x20FFFFFF},
            scheme -> scheme.tint(0.7f));

        this.borderPainter = new CompositeBorderPainter("Gemini", outerBorderPainter,
            innerBorderPainter);
        this.highlightBorderPainter = new ClassicBorderPainter();
    }

    void configureOverlayPainters() {
        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
            ColorSchemeSingleColorQuery.DARK, ColorSchemeSingleColorQuery.ULTRALIGHT);
        this.addOverlayPainter(footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // add two overlay painters to create a bezel line between
        // menu bar and toolbars
        RadianceOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
            ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                ColorTransform.brightness(-0.5f)));
        RadianceOverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
            ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
                ColorTransform.alpha(32)));
        this.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
        this.addOverlayPainter(toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add overlay painter to paint drop shadows along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add overlay painter to paint a dark line along the bottom
        // edge of toolbars
        RadianceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
            ColorSchemeSingleColorQuery.ULTRADARK);
        this.addOverlayPainter(toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);
    }

    /**
     * Applies the specified highlight schemes on the relevant parts of the
     * specified scheme bundle.
     *
     * @param schemeBundle    Scheme bundle.
     * @param highlightScheme Highlight scheme.
     */
    private static void applyHighlightColorScheme(RadianceColorSchemeBundle schemeBundle,
            RadianceColorScheme highlightScheme) {
        // specify custom alpha values for the highlights
        schemeBundle.registerHighlightAlpha(0.85f, ComponentState.ROLLOVER_UNSELECTED);
        schemeBundle.registerHighlightAlpha(0.9f, ComponentState.SELECTED);
        schemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        schemeBundle.registerHighlightColorScheme(highlightScheme, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
    }

    private static void applyHighlightAsFill(RadianceColorSchemeBundle schemeBundle,
            RadianceColorScheme highlightScheme, RadianceColorScheme highlightBorderScheme) {
        // use for borders on rollover controls
        schemeBundle.registerColorScheme(highlightBorderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                ComponentState.ROLLOVER_ARMED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ROLLOVER_UNSELECTED);

        // use for fill of selected controls
        schemeBundle.registerColorScheme(highlightScheme, RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        // use for borders of highlights
        schemeBundle.registerColorScheme(highlightScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState.getActiveStates());

        // use for text highlight
        schemeBundle.registerColorScheme(highlightScheme, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        // use for armed controls
        schemeBundle.registerColorScheme(highlightScheme, ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public static class GeminiTonalSkin extends GeminiSkin implements TonalSkin {
        public static final String NAME = "Gemini Tonal";

        public GeminiTonalSkin() {
            // Same seed for primary and muted
            RadianceColorScheme2 geminiColorScheme = ColorSchemeUtils.getColorScheme(
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

            RadianceColorSchemeBundle2 geminiDefaultBundle =
                new RadianceColorSchemeBundle2(geminiColorScheme);
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
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFFA9B4B1),
                    /* isFidelity */ true,
                    /* isDark */ false),
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
                RadianceThemingSlices.DecorationAreaType.FOOTER);

            // Toolbars
            RadianceColorSchemeBundle2 geminiToolbarBundle =
                new RadianceColorSchemeBundle2(ColorSchemeUtils.getColorScheme(
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
            this.registerAsDecorationArea(
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFF142429),
                    /* isFidelity */ true,
                    /* isDark */ true,
                    /* contrastLevel */ 0.9f,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new FractionBasedTonalFillPainter("Gemini",
                new float[] {0.0f, 0.6f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getContainerSurfaceLow,
                    ContainerColorTokens::getContainerSurface,
                    ContainerColorTokens::getContainerSurfaceHigh});

            this.decorationPainter = new MatteDecorationPainter();
            this.highlightFillPainter = new FractionBasedTonalFillPainter("Gemini Highlight",
                new float[] {0.0f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getContainerSurfaceLow,
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

        @Override
        void configureOverlayPainters() {
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
        }

        @Override
        public String getDisplayName() {
            return GeminiTonalSkin.NAME;
        }
    }
}
