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
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.*;
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

    /**
     * Creates a new <code>Sentinel</code> skin.
     */
    public SentinelSkin() {
        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/sentinel.colorschemes"));
        RadianceColorScheme activeScheme = schemes.get("Sentinel Active");
        RadianceColorScheme enabledScheme = schemes.get("Sentinel Enabled");
        RadianceColorScheme disabledScheme = schemes.get("Sentinel Disabled");
        RadianceColorScheme disabledSelectedScheme = schemes.get("Sentinel Disabled Selected");

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);

        // borders
        RadianceColorScheme borderScheme = schemes.get("Sentinel Border");
        defaultSchemeBundle.registerColorScheme(borderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);

        // marks
        RadianceColorScheme markScheme = schemes.get("Sentinel Mark");
        defaultSchemeBundle.registerColorScheme(markScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);

        // separators
        RadianceColorScheme separatorScheme = schemes.get("Sentinel Separator");
        defaultSchemeBundle.registerColorScheme(separatorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

        // tab borders
        defaultSchemeBundle.registerColorScheme(schemes.get("Sentinel Tab Border"),
                RadianceThemingSlices.ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());

        // highlights
        RadianceColorScheme highlightScheme = schemes.get("Sentinel Highlight");
        defaultSchemeBundle.registerHighlightColorScheme(highlightScheme);

        RadianceColorScheme backgroundScheme = schemes.get("Sentinel Background");

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme, RadianceThemingSlices.DecorationAreaType.NONE);

        RadianceColorScheme activeDecorationsScheme = schemes.get("Sentinel Decorations Active");
        RadianceColorScheme enabledDecorationsScheme = schemes.get("Sentinel Decorations Enabled");
        RadianceColorSchemeBundle decorationsSchemeBundle = new RadianceColorSchemeBundle(
                activeDecorationsScheme, enabledDecorationsScheme, enabledDecorationsScheme);
        decorationsSchemeBundle.registerAlpha(0.4f, ComponentState.DISABLED_UNSELECTED);
        decorationsSchemeBundle.registerColorScheme(enabledDecorationsScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        RadianceColorScheme borderDecorationsScheme = schemes.get("Sentinel Decorations Border");
        decorationsSchemeBundle.registerColorScheme(borderDecorationsScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);

        // marks
        RadianceColorScheme markDecorationsScheme = schemes.get("Sentinel Decorations Mark");
        decorationsSchemeBundle.registerColorScheme(markDecorationsScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);

        // separators
        RadianceColorScheme separatorDecorationsScheme = schemes.get("Sentinel Decorations Separator");
        decorationsSchemeBundle.registerColorScheme(separatorDecorationsScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

        RadianceColorScheme decorationsBackgroundScheme = schemes.get("Sentinel Decorations Background");
        this.registerDecorationAreaSchemeBundle(decorationsSchemeBundle, decorationsBackgroundScheme,
                RadianceThemingSlices.DecorationAreaType.TOOLBAR, RadianceThemingSlices.DecorationAreaType.FOOTER);

        RadianceColorScheme activeControlPaneScheme = schemes.get("Sentinel Control Pane Active");
        RadianceColorScheme enabledControlPaneScheme = schemes.get("Sentinel Control Pane Enabled");
        RadianceColorSchemeBundle controlPaneSchemeBundle = new RadianceColorSchemeBundle(
                activeControlPaneScheme, enabledControlPaneScheme, enabledControlPaneScheme);
        controlPaneSchemeBundle.registerAlpha(0.4f, ComponentState.DISABLED_UNSELECTED);
        controlPaneSchemeBundle.registerColorScheme(enabledControlPaneScheme,
                ComponentState.DISABLED_UNSELECTED);

        // borders
        RadianceColorScheme borderControlPaneScheme = schemes.get("Sentinel Control Pane Border");
        controlPaneSchemeBundle.registerColorScheme(borderControlPaneScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);

        // marks
        RadianceColorScheme markControlPaneScheme = schemes.get("Sentinel Control Pane Mark");
        controlPaneSchemeBundle.registerColorScheme(markControlPaneScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());

        // separators
        RadianceColorScheme separatorControlPaneScheme = schemes.get("Sentinel Control Pane Separator");
        controlPaneSchemeBundle.registerColorScheme(separatorControlPaneScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);
        RadianceColorScheme backgroundControlPaneScheme = schemes.get("Sentinel Control Pane Background");
        this.registerDecorationAreaSchemeBundle(controlPaneSchemeBundle, backgroundControlPaneScheme,
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        RadianceColorScheme activeHeaderScheme = schemes.get("Sentinel Header Active");
        RadianceColorScheme enabledHeaderScheme = schemes.get("Sentinel Header Enabled");
        RadianceColorScheme disabledHeaderScheme = schemes.get("Sentinel Header Disabled");
        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(activeHeaderScheme,
                enabledHeaderScheme, disabledHeaderScheme);
        headerSchemeBundle.registerAlpha(0.95f, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        RadianceColorScheme headerBorderScheme = schemes.get("Sentinel Header Border");
        headerSchemeBundle.registerColorScheme(headerBorderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        // marks
        RadianceColorScheme headerMarkScheme = schemes.get("Sentinel Header Mark");
        headerSchemeBundle.registerColorScheme(headerMarkScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        // separators
        RadianceColorScheme separatorHeaderScheme = schemes.get("Sentinel Header Separator");
        headerSchemeBundle.registerColorScheme(separatorHeaderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

        headerSchemeBundle.registerHighlightAlpha(0.85f, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ROLLOVER_ARMED, ComponentState.ARMED);
        headerSchemeBundle.registerHighlightAlpha(0.9f, ComponentState.SELECTED);
        headerSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerHighlightColorScheme(highlightScheme);

        RadianceColorScheme headerBackgroundScheme = schemes.get("Sentinel Header Background");

        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerBackgroundScheme,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

        this.configureOverlayPainters();

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new ClassicFillPainter();
        this.decorationPainter = new MatteDecorationPainter();
        this.highlightFillPainter = new ClassicFillPainter();
        this.borderPainter = new ClassicBorderPainter();
    }

    void configureOverlayPainters() {
        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);
        this.addOverlayPainter(new BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                    ColorTransform.brightness(-0.1f))),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Add overlay painters to paint drop shadow and a dark line along the top
        // edges of footers
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(15),
            RadianceThemingSlices.DecorationAreaType.FOOTER);
        this.addOverlayPainter(new TopLineOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                    ColorTransform.brightness(-0.1f))),
            RadianceThemingSlices.DecorationAreaType.FOOTER);
    }

    public String getDisplayName() {
        return NAME;
    }

    public static class SentinelTonalSkin extends SentinelSkin implements TonalSkin {
        public static final String NAME = "Sentinel Tonal";

        public SentinelTonalSkin() {
            RadianceColorScheme2 sentinelColorScheme = ColorSchemeUtils.getColorScheme(
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

            RadianceColorSchemeBundle2 sentinelDefaultBundle =
                new RadianceColorSchemeBundle2(sentinelColorScheme);
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
            RadianceColorSchemeBundle2 sentinelHeaderBundle =
                new RadianceColorSchemeBundle2(ColorSchemeUtils.getColorScheme(
                    /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                        Hct.fromInt(0xFF2A0C05), Hct.fromInt(0xFF4A2C25), Hct.fromInt(0xFF7A5C55)),
                    /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                    /* isPrimaryDark */ true,
                    /* isTonalDark */ true,
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
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFF2A0C05),
                    /* isFidelity */ true,
                    /* isDark */ true,
                    /* contrast */ 0.6f,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

            // Control panes
            RadianceColorSchemeBundle2 sentinelControlPaneBundle =
                new RadianceColorSchemeBundle2(ColorSchemeUtils.getColorScheme(
                    /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                        Hct.fromInt(0xFFFEB79E), Hct.fromInt(0xFF8F543B), Hct.fromInt(0xFF754133)),
                    /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                    /* isPrimaryDark */ false,
                    /* isTonalDark */ false,
                    /* isMutedDark */ true,
                    /* isNeutralDark */ true,
                    /* isSystemDark */ false,
                    /* primaryContrastLevel */ 0.0f,
                    /* tonalContrastLevel */ -0.2f,
                    /* mutedContrastLevel */ -0.4f,
                    /* neutralContrastLevel */ -0.4f,
                    /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver()));
            this.registerDecorationAreaSchemeBundle(sentinelControlPaneBundle,
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFF754133),
                    /* isFidelity */ true,
                    /* isDark */ true,
                    /* contrast */ -0.4f,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

            // Toolbars and footers
            RadianceColorSchemeBundle2 sentinelBarsBundle =
                new RadianceColorSchemeBundle2(ColorSchemeUtils.getColorScheme(
                    /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                        Hct.fromInt(0xFFFEB79E), Hct.fromInt(0xFF703723), Hct.fromInt(0xFF53281A)),
                    /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                    /* isPrimaryDark */ false,
                    /* isTonalDark */ false,
                    /* isMutedDark */ true,
                    /* isNeutralDark */ true,
                    /* isSystemDark */ false,
                    /* primaryContrastLevel */ 0.0f,
                    /* tonalContrastLevel */ 0.2f,
                    /* mutedContrastLevel */ 0.3f,
                    /* neutralContrastLevel */ 0.3f,
                    /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver()));
            this.registerDecorationAreaSchemeBundle(sentinelBarsBundle,
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFF53281A),
                    /* isFidelity */ true,
                    /* isDark */ true,
                    /* contrast */ 0.3f,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
                RadianceThemingSlices.DecorationAreaType.TOOLBAR,
                RadianceThemingSlices.DecorationAreaType.FOOTER);

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new MatteTonalFillPainter();
            this.decorationPainter = new FlatDecorationPainter();
            this.highlightFillPainter = new MatteTonalFillPainter();
            this.borderPainter = new FlatTonalBorderPainter();
            this.highlightBorderPainter = new FlatTonalBorderPainter();
        }

        @Override
        void configureOverlayPainters() {
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
        }

        @Override
        public String getDisplayName() {
            return SentinelTonalSkin.NAME;
        }
    }
}
