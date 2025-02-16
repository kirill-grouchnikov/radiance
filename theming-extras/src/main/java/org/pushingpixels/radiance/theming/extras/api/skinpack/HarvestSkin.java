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
package org.pushingpixels.radiance.theming.extras.api.skinpack;

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.*;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Harvest</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class HarvestSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Harvest";

    /**
     * Creates a new <code>Harvest</code> skin.
     */
    public HarvestSkin() {
        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/extras/api/skinpack/harvest.colorschemes"));
        RadianceColorScheme activeScheme = schemes.get("Harvest Active");
        RadianceColorScheme enabledScheme = schemes.get("Harvest Enabled");
        RadianceColorScheme disabledScheme = schemes.get("Harvest Disabled");
        RadianceColorScheme disabledSelectedScheme = schemes.get("Harvest Disabled Selected");

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);

        RadianceColorScheme selectedScheme = schemes.get("Harvest Selected");
        RadianceColorScheme rolloverSelectedScheme = schemes.get("Harvest Rollover Selected");
        defaultSchemeBundle.registerColorScheme(selectedScheme, ComponentState.SELECTED);
        defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);

        // borders
        RadianceColorScheme borderActiveScheme = schemes.get("Harvest Border Active");
        defaultSchemeBundle.registerColorScheme(borderActiveScheme, ColorSchemeAssociationKind.BORDER,
                ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(borderActiveScheme, ColorSchemeAssociationKind.BORDER,
                ComponentState.DISABLED_SELECTED);
        RadianceColorScheme borderScheme = schemes.get("Harvest Border");
        defaultSchemeBundle.registerColorScheme(borderScheme, ColorSchemeAssociationKind.BORDER);

        // marks
        RadianceColorScheme markScheme = schemes.get("Harvest Mark");
        defaultSchemeBundle.registerColorScheme(markScheme, ColorSchemeAssociationKind.MARK);

        // separators
        RadianceColorScheme separatorScheme = schemes.get("Harvest Separator");
        defaultSchemeBundle.registerColorScheme(separatorScheme, ColorSchemeAssociationKind.SEPARATOR);

        // tab borders
        defaultSchemeBundle.registerColorScheme(schemes.get("Harvest Tab Border"),
                ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());

        // highlights
        RadianceColorScheme highlightScheme = schemes.get("Harvest Highlight");
        defaultSchemeBundle.registerHighlightColorScheme(highlightScheme);

        RadianceColorScheme backgroundScheme = schemes.get("Harvest Background");

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme,
            RadianceThemingSlices.DecorationAreaType.NONE);

        // CONTROL_PANE area
        RadianceColorScheme controlPaneBackgroundScheme = schemes.get("Harvest Control Pane Background");
        this.registerAsDecorationArea(controlPaneBackgroundScheme,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        // HEADER area
        RadianceColorScheme activeHeaderScheme = schemes.get("Harvest Header Active");
        RadianceColorScheme enabledHeaderScheme = schemes.get("Harvest Header Enabled");
        RadianceColorScheme disabledHeaderScheme = schemes.get("Harvest Header Disabled");
        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(activeHeaderScheme,
                enabledHeaderScheme, disabledHeaderScheme);
        headerSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        RadianceColorScheme headerBorderScheme = schemes.get("Harvest Header Border");
        headerSchemeBundle.registerColorScheme(headerBorderScheme, ColorSchemeAssociationKind.BORDER);
        // marks
        RadianceColorScheme headerMarkScheme = schemes.get("Harvest Header Mark");
        headerSchemeBundle.registerColorScheme(headerMarkScheme, ColorSchemeAssociationKind.MARK);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme, ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        // separators
        RadianceColorScheme separatorHeaderScheme = schemes.get("Harvest Header Separator");
        headerSchemeBundle.registerColorScheme(separatorHeaderScheme,
                ColorSchemeAssociationKind.SEPARATOR);

        headerSchemeBundle.registerHighlightAlpha(0.85f, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ROLLOVER_ARMED, ComponentState.ARMED);
        headerSchemeBundle.registerHighlightAlpha(0.9f, ComponentState.SELECTED);
        headerSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerHighlightColorScheme(highlightScheme);

        RadianceColorScheme headerBackgroundScheme = schemes.get("Harvest Header Background");

        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerBackgroundScheme,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.configureOverlayPainters();

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new SpecularRectangularFillPainter(new ClassicFillPainter(), 1.0f);

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
    public static class HarvestTonalSkin extends HarvestSkin implements TonalSkin {
        public static final String NAME = "Harvest Tonal";

        public HarvestTonalSkin() {
            SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();

            RadianceColorScheme2 harvestColorScheme = ColorSchemeUtils.getColorScheme(
                /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                    Hct.fromInt(0xFFFAEEAD), Hct.fromInt(0xFFFFFCE9), Hct.fromInt(0xFFFCFAD6)),
                /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                /* isPrimaryDark */ false,
                /* isTonalDark */ false,
                /* isMutedDark */ false,
                /* isNeutralDark */ false,
                /* isSystemDark */ false,
                /* primaryContrastLevel */ 0.6f,
                /* tonalContrastLevel */ 0.6f,
                /* mutedContrastLevel */ 0.6f,
                /* neutralContrastLevel */ 0.6f,
                /* schemeColorResolver */ defaultSchemeColorResolver);

            ContainerColorTokens harvestActiveContainerTokens = ColorSchemeUtils.getContainerTokens(
                /* seed */ Hct.fromInt(0xFFFFCCC8),
                /* isFidelity */ true,
                /* isDark */ false,
                /* contrastLevel */ 0.8f,
                /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver());
            ContainerColorTokens harvestHighlightContainerTokens =
                ColorSchemeUtils.getContainerTokens(
                    /* seed */ Hct.fromInt(0xFFFFD6CA),
                    /* isFidelity */ true,
                    /* isDark */ false,
                    /* contrastLevel */ 0.8f,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver());

            RadianceColorSchemeBundle2 harvestDefaultBundle =
                new RadianceColorSchemeBundle2(harvestColorScheme);
            harvestDefaultBundle.registerActiveContainerTokens(harvestActiveContainerTokens,
                ComponentState.getActiveStates());
            harvestDefaultBundle.registerActiveContainerTokens(
                harvestHighlightContainerTokens,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                ComponentState.getActiveStates());
            this.registerDecorationAreaSchemeBundle(harvestDefaultBundle,
                RadianceThemingSlices.DecorationAreaType.NONE);

            // Set up token resolution overlays. For muted and neutral containers, take the
            // neutral container surface fill to be the on container roles.
            SchemeColorResolver harvestHeaderSchemeColorResolver = defaultSchemeColorResolver.overlayWith(
                SchemeColorResolverOverlay.builder()
                    .neutralContainerResolverOverlay(
                        SchemeContainerColorsResolverOverlay.builder()
                            .onContainer((s) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurface().getRGB())
                            .onContainerVariant((s) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurfaceHigh().getRGB())
                            .build())
                    .mutedContainerResolverOverlay(
                        SchemeContainerColorsResolverOverlay.builder()
                            .onContainer((s) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurface().getRGB())
                            .onContainerVariant((s) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurfaceHigh().getRGB())
                            .build())
                    .build());

            RadianceColorSchemeBundle2 harvestHeaderBundle =
                new RadianceColorSchemeBundle2(ColorSchemeUtils.getColorScheme(
                    /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                        Hct.fromInt(0xFFF12B37), Hct.fromInt(0xFF5B5B54), Hct.fromInt(0xFF3A3A39)),
                    /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
                    /* isPrimaryDark */ true,
                    /* isTonalDark */ true,
                    /* isMutedDark */ true,
                    /* isNeutralDark */ true,
                    /* isSystemDark */ true,
                    /* primaryContrastLevel */ 0.0f,
                    /* tonalContrastLevel */ 0.0f,
                    /* mutedContrastLevel */ 0.0f,
                    /* neutralContrastLevel */ 0.0f,
                    /* schemeColorResolver */ harvestHeaderSchemeColorResolver));
            harvestHeaderBundle.registerActiveContainerTokens(
                harvestHighlightContainerTokens,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                ComponentState.getActiveStates());
            this.registerDecorationAreaSchemeBundle(harvestHeaderBundle,
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFF3A3A39),
                    /* isFidelity */ true,
                    /* isDark */ true,
                    /* contrastLevel */ 0.6f,
                    /* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
                        PaletteContainerColorsResolverOverlay.builder()
                            .onContainer((p) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurface().getRGB())
                            .onContainerVariant((p) -> harvestDefaultBundle.getMainColorScheme().getNeutralContainerTokens().getContainerSurfaceHigh().getRGB())
                            .build()
                    )),
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER,
                RadianceThemingSlices.DecorationAreaType.TOOLBAR,
                RadianceThemingSlices.DecorationAreaType.FOOTER);

            this.registerAsDecorationArea(
                ColorSchemeUtils.getExtendedContainerTokens(
                    /* seed */ Hct.fromInt(0xFFFCF7C0),
                    /* isFidelity */ true,
                    /* isDark */ false),
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

            this.buttonShaper = new ClassicButtonShaper();
            this.fillPainter = new MatteTonalFillPainter();
            this.decorationPainter = new FlatDecorationPainter();
            this.highlightFillPainter = new MatteTonalFillPainter();
            this.borderPainter = new FractionBasedTonalBorderPainter("Harvest",
                new float[] {0.0f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getContainerOutlineVariant,
                    ContainerColorTokens::getContainerOutlineVariant});

            this.highlightBorderPainter = new FlatTonalBorderPainter();
        }

        @Override
        void configureOverlayPainters() {
            // Add overlay painters to paint drop shadow and a dark line along the bottom
            // edges of toolbars
            this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);
            this.addOverlayPainter(new BottomLineTonalOverlayPainter(
                    ContainerColorTokens::getContainerOutline),
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);

            // Add overlay painters to paint drop shadow and a dark line along the top
            // edges of footers
            this.addOverlayPainter(TopShadowOverlayPainter.getInstance(15),
                RadianceThemingSlices.DecorationAreaType.FOOTER);
            this.addOverlayPainter(new TopLineTonalOverlayPainter(
                ContainerColorTokens::getContainerOutline),
                RadianceThemingSlices.DecorationAreaType.FOOTER);
        }

        @Override
        public String getDisplayName() {
            return HarvestTonalSkin.NAME;
        }
    }
}
