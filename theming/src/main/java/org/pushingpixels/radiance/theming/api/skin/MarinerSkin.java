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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.*;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Mariner</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class MarinerSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Mariner";

    /**
     * Overlay painter to paint a dark line along the bottom edge of the
     * menubar.
     */
    protected RadianceOverlayPainter menuOverlayPainter;

    /**
     * Overlay painter to paint a dark line along the bottom edge of the
     * toolbars.
     */
    protected RadianceOverlayPainter toolbarBottomLineOverlayPainter;

    /**
     * Overlay painter to paint a bezel line along the top edge of the footer.
     */
    protected RadianceOverlayPainter footerTopBezelOverlayPainter;

    /**
     * Creates a new <code>Mariner</code> skin.
     */
    public MarinerSkin() {
        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/mariner.colorschemes"));

        RadianceColorScheme activeScheme = schemes.get("Mariner Active");
        RadianceColorScheme enabledScheme = schemes.get("Mariner Enabled");
        RadianceColorScheme disabledScheme = schemes.get("Mariner Disabled");
        RadianceColorScheme disabledSelectedScheme = schemes.get("Mariner Disabled Selected");

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);

        defaultSchemeBundle.registerAlpha(0.8f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerAlpha(0.8f, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        RadianceColorScheme activeBorderScheme = schemes.get("Mariner Active Border");
        RadianceColorScheme enabledBorderScheme = schemes.get("Mariner Enabled Border");
        RadianceColorScheme disabledSelectedBorderScheme = schemes.get("Mariner Disabled Selected Border");
        defaultSchemeBundle.registerColorScheme(activeBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(disabledSelectedBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(enabledBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

        // marks
        RadianceColorScheme activeMarkScheme = schemes.get("Mariner Active Mark");
        RadianceColorScheme enabledMarkScheme = schemes.get("Mariner Enabled Mark");
        defaultSchemeBundle.registerColorScheme(activeMarkScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(enabledMarkScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.ENABLED);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, RadianceThemingSlices.DecorationAreaType.NONE);

        // header color scheme bundle
        RadianceColorScheme headerColorScheme = schemes.get("Mariner Header");
        RadianceColorScheme headerBorderColorScheme = schemes.get("Mariner Header Border");
        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
                headerColorScheme, headerColorScheme, headerColorScheme);
        headerSchemeBundle.registerAlpha(0.4f, ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(headerColorScheme,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(headerColorScheme,
                ComponentState.ROLLOVER_UNSELECTED);
        headerSchemeBundle.registerColorScheme(
                activeScheme, RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerColorScheme(headerColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);
        headerSchemeBundle.registerColorScheme(headerBorderColorScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        headerSchemeBundle.registerColorScheme(
                enabledMarkScheme.shade(0.8f), RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.PRESSED_SELECTED);
        headerSchemeBundle.registerColorScheme(
                enabledMarkScheme.shade(0.7f), RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.ROLLOVER_UNSELECTED);

        headerSchemeBundle.registerHighlightAlpha(1.0f);
        headerSchemeBundle.registerHighlightColorScheme(activeScheme);
        // the next line is to have consistent coloring during the rollover menu animations
        headerSchemeBundle.registerHighlightAlpha(0.0f, ComponentState.ENABLED);

        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerColorScheme,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

        // footer color scheme bundle
        RadianceColorScheme enabledFooterScheme = schemes.get("Mariner Footer Enabled");
        RadianceColorScheme disabledFooterScheme = schemes.get("Mariner Footer Disabled");

        RadianceColorSchemeBundle footerSchemeBundle = new RadianceColorSchemeBundle(activeScheme,
                enabledFooterScheme, disabledFooterScheme);

        footerSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        footerSchemeBundle.registerAlpha(0.8f, ComponentState.DISABLED_UNSELECTED);
        footerSchemeBundle.registerColorScheme(activeScheme, ComponentState.DISABLED_SELECTED);
        footerSchemeBundle.registerColorScheme(disabledFooterScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        RadianceColorScheme footerEnabledBorderScheme = schemes
                .get("Mariner Footer Enabled Border");
        footerSchemeBundle.registerColorScheme(activeBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
        footerSchemeBundle.registerColorScheme(activeBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_SELECTED);
        footerSchemeBundle.registerColorScheme(footerEnabledBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

        // marks
        RadianceColorScheme footerEnabledMarkScheme = schemes.get("Mariner Footer Enabled Mark");
        footerSchemeBundle.registerColorScheme(activeMarkScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.getActiveStates());
        footerSchemeBundle.registerColorScheme(footerEnabledMarkScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK, ComponentState.ENABLED);

        // separators
        RadianceColorScheme footerSeparatorScheme = schemes.get("Mariner Footer Separator");
        footerSchemeBundle.registerColorScheme(footerSeparatorScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

        RadianceColorScheme footerBackgroundColorScheme = schemes.get("Mariner Footer Background");
        this.registerDecorationAreaSchemeBundle(footerSchemeBundle, footerBackgroundColorScheme,
                RadianceThemingSlices.DecorationAreaType.FOOTER, RadianceThemingSlices.DecorationAreaType.TOOLBAR, RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        this.configureOverlayPainters();

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new FractionBasedFillPainter("Mariner", new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {ColorSchemeSingleColorQuery.EXTRALIGHT,
                        ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.MID});

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightFillPainter = new ClassicFillPainter();

        this.borderPainter = new FractionBasedBorderPainter("Mariner",
                new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorSchemeSingleColorQuery.DARK, ColorSchemeSingleColorQuery.MID});
        this.highlightBorderPainter = new ClassicBorderPainter();
    }

    void configureOverlayPainters() {
        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        this.footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
            ColorSchemeSingleColorQuery.ULTRADARK, ColorSchemeSingleColorQuery.LIGHT);
        this.addOverlayPainter(this.footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // add an overlay painter to create a line between
        // menu bar and toolbars
        this.menuOverlayPainter = new BottomLineOverlayPainter(
            ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                ColorTransform.brightness(-0.5f)));
        this.addOverlayPainter(this.menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

        // add overlay painter to paint drop shadows along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
            RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add overlay painter to paint a dark line along the bottom
        // edge of toolbars
        this.toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
            ColorSchemeSingleColorQuery.ULTRADARK);
        this.addOverlayPainter(this.toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }

    public static class MarinerTonalSkin extends MarinerSkin implements TonalSkin {
        public static final String NAME = "Mariner Tonal";

        public MarinerTonalSkin() {
            RadianceColorScheme2 marinerColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFF6DD9D), Hct.fromInt(0xFFD9D8D5), Hct.fromInt(0xFFECF0F3)),
                /* activeStatesContainerType */ ColorSchemeUtils.ActiveStatesContainerType.TONAL,
                /* isDark */ false,
                /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());

            ContainerColorTokens marinerSelectedContainerTokens = ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFF5D47A),
                /* isFidelity */ true,
                /* isDark */ false);

            RadianceColorSchemeBundle2 marinerDefaultBundle =
                new RadianceColorSchemeBundle2(marinerColorScheme);
            // More saturated seed for controls in selected state
            marinerDefaultBundle.registerActiveContainerTokens(marinerSelectedContainerTokens,
                ComponentState.SELECTED);
            this.registerDecorationAreaSchemeBundle(marinerDefaultBundle,
                RadianceThemingSlices.DecorationAreaType.NONE);

            RadianceColorScheme2 marinerHeaderColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFF5D47A), Hct.fromInt(0xFF281D1E), Hct.fromInt(0xFF2C2021)),
                /* activeStatesContainerType */ ColorSchemeUtils.ActiveStatesContainerType.TONAL,
                /* isDark */ true,
                /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());

            RadianceColorSchemeBundle2 marinerHeaderBundle =
                new RadianceColorSchemeBundle2(marinerHeaderColorScheme);
            // More saturated seed for controls in selected state
            marinerHeaderBundle.registerActiveContainerTokens(marinerSelectedContainerTokens,
                ComponentState.SELECTED);
            // More saturated highlights
            marinerHeaderBundle.registerActiveContainerTokens(
                marinerSelectedContainerTokens,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                ComponentState.getActiveStates());
            // More muted separators
            marinerHeaderBundle.registerEnabledContainerTokens(
                ColorSchemeUtils.getContainerTokens(
                    /* seed */ Hct.fromInt(0xFF261D1E),
                    /* isFidelity */ true,
                    /* isDark */ true,
                    /* contrastLevel */ -0.7,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                        PaletteContainerColorsResolverOverlay.builder()
                            //.containerOutline(DynamicPalette::getTonalContainerOutlineVariant)
                            .build())),
                RadianceThemingSlices.ContainerColorTokensAssociationKind.SEPARATOR);
            this.registerDecorationAreaSchemeBundle(marinerHeaderBundle,
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFF261D1E),
                    /* isFidelity */ true,
                    /* isDark */ true,
                    /* contrastLevel */ 1.0,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                        PaletteContainerColorsResolverOverlay.builder()
                            .containerOutline(DynamicPalette::getTonalContainerOutlineVariant)
                            .build())),
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

            RadianceColorScheme2 marinerFooterColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFF6DD9D), Hct.fromInt(0xFFC5C4C2), Hct.fromInt(0xFFB9B7B9)),
                /* activeStatesContainerType */ ColorSchemeUtils.ActiveStatesContainerType.TONAL,
                /* isDark */ false,
                /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());

            RadianceColorSchemeBundle2 marinerFooterBundle =
                new RadianceColorSchemeBundle2(marinerFooterColorScheme);
            this.registerDecorationAreaSchemeBundle(marinerFooterBundle,
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFFB9B7B9),
                    /* isFidelity */ true,
                    /* isDark */ false),
                RadianceThemingSlices.DecorationAreaType.FOOTER,
                RadianceThemingSlices.DecorationAreaType.TOOLBAR,
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new FractionBasedTonalFillPainter("Mariner", new float[] {0.0f, 0.5f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokensSingleColorQuery.CONTAINER_SURFACE_LOWEST,
                    ContainerColorTokensSingleColorQuery.CONTAINER_SURFACE,
                    ContainerColorTokensSingleColorQuery.CONTAINER_SURFACE_HIGH});

            this.decorationPainter = new MatteDecorationPainter();
            this.highlightFillPainter = new ClassicTonalFillPainter();

            this.borderPainter = new FractionBasedTonalBorderPainter("Mariner",
                new float[] {0.0f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE,
                    ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE});
            this.highlightBorderPainter = new ClassicTonalBorderPainter();
        }

        @Override
        void configureOverlayPainters() {
            // add an overlay painter to paint a bezel line along the top
            // edge of footer
            this.footerTopBezelOverlayPainter = new TopBezelTonalOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE,
                    ColorTransform.alpha(80)),
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokensSingleColorQuery.INVERSE_CONTAINER_OUTLINE,
                    ColorTransform.alpha(48)));
            this.addOverlayPainter(this.footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

            // add an overlay painter to create a line between
            // menu bar and toolbars
            this.menuOverlayPainter = new BottomLineTonalOverlayPainter(
                ContainerColorTokensSingleColorQuery.CONTAINER_SURFACE_HIGHEST);
            this.addOverlayPainter(this.menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

            // add overlay painter to paint drop shadows along the bottom
            // edges of toolbars
            this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(50),
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);

            // add overlay painter to paint a dark line along the bottom
            // edge of toolbars
            this.toolbarBottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
                ContainerColorTokensSingleColorQuery.composite(
                    ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE,
                    ColorTransform.alpha(128)));
            this.addOverlayPainter(this.toolbarBottomLineOverlayPainter,
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);
        }

        @Override
        public String getDisplayName() {
            return MarinerTonalSkin.NAME;
        }
    }
}
