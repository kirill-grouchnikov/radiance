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

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle2;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopBezelTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

public class CookbookSkin extends RadianceSkin {

    @Override
    public String getDisplayName() {
        return "Cookbook";
    }

    public CookbookSkin() {
        RadianceColorScheme2 cookbookDefaultColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFC8A26E), Hct.fromInt(0xFFE3E4DC), Hct.fromInt(0xFFEDF3E4)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ false,
            /* isTonalDark */ false,
            /* isMutedDark */ false,
            /* isNeutralDark */ false,
            /* isSystemDark */ false,
            /* primaryContrastLevel */ 0.0f,
            /* tonalContrastLevel */ 0.6f,
            /* mutedContrastLevel */ 0.6f,
            /* neutralContrastLevel */ 0.6f,
            /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());
        RadianceColorSchemeBundle2 cookbookDefaultDefaultBundle =
            new RadianceColorSchemeBundle2(cookbookDefaultColorScheme);
        this.registerDecorationAreaSchemeBundle(cookbookDefaultDefaultBundle,
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFFC8A26E),
                /* isFidelity */ true,
                /* isDark */ false),
            RadianceThemingSlices.DecorationAreaType.NONE);

        RadianceColorScheme2 cookbookControlPaneColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFA23F00), Hct.fromInt(0xFFB25406), Hct.fromInt(0xFF5F1000)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ true,
            /* isTonalDark */ true,
            /* isMutedDark */ true,
            /* isNeutralDark */ true,
            /* isSystemDark */ true,
            /* primaryContrastLevel */ 0.0f,
            /* tonalContrastLevel */ 0.6f,
            /* mutedContrastLevel */ 0.6f,
            /* neutralContrastLevel */ 0.6f,
            /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());
        RadianceColorSchemeBundle2 cookbookControlPaneDefaultBundle =
            new RadianceColorSchemeBundle2(cookbookControlPaneColorScheme);
        this.registerDecorationAreaSchemeBundle(cookbookControlPaneDefaultBundle,
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFF5F1000),
                /* isFidelity */ true,
                /* isDark */ false),
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        RadianceColorScheme2 cookbookHeaderColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
                Hct.fromInt(0xFFA23F00), Hct.fromInt(0xFFB25406), Hct.fromInt(0xFFC6741D)),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ true,
            /* isTonalDark */ true,
            /* isMutedDark */ true,
            /* isNeutralDark */ true,
            /* isSystemDark */ true,
            /* primaryContrastLevel */ 0.0f,
            /* tonalContrastLevel */ 0.6f,
            /* mutedContrastLevel */ 0.6f,
            /* neutralContrastLevel */ 0.6f,
            /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());
        RadianceColorSchemeBundle2 cookbookHeaderDefaultBundle =
            new RadianceColorSchemeBundle2(cookbookHeaderColorScheme);
        this.registerDecorationAreaSchemeBundle(cookbookHeaderDefaultBundle,
            ColorSchemeUtils.getExtendedContainerTokens(
                /* seed */ Hct.fromInt(0xFFC6741D),
                /* isFidelity */ true,
                /* isDark */ false),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

//        RadianceColorScheme activeScheme = new ActiveScheme();
//        RadianceColorScheme enabledScheme = new CremeColorScheme();
//        RadianceColorScheme disabledScheme = new LightGrayColorScheme().tint(0.35)
//                .named("Cookbook Disabled");
//        RadianceColorScheme darkBrownColorScheme = new DarkBrownColorScheme();
//        RadianceColorScheme goldenBrownScheme = new GoldenBrownColorScheme();
//
//        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
//                activeScheme, enabledScheme, disabledScheme);
//        // use darker borders on enabled components
//        defaultSchemeBundle.registerColorScheme(goldenBrownScheme,
//                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
//        defaultSchemeBundle.registerColorScheme(goldenBrownScheme,
//                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
//        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
//            RadianceThemingSlices.DecorationAreaType.NONE);
//
//        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
//                darkBrownColorScheme, goldenBrownScheme, goldenBrownScheme);
//        headerSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
//        headerSchemeBundle.registerColorScheme(goldenBrownScheme,
//                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
//        this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
//            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
//            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
//            RadianceThemingSlices.DecorationAreaType.HEADER,
//            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
//            RadianceThemingSlices.DecorationAreaType.FOOTER);
//
//        // scheme bundle for the CONTROL_PANE area type
//        RadianceColorSchemeBundle controlPaneSchemeBundle = new RadianceColorSchemeBundle(
//                goldenBrownScheme.shiftBackground(new Color(127, 58, 11), 0.7f),
//                darkBrownColorScheme, darkBrownColorScheme);
//        // use translucency on disabled controls
//        controlPaneSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_SELECTED,
//                ComponentState.DISABLED_UNSELECTED);
//        controlPaneSchemeBundle.registerColorScheme(darkBrownColorScheme,
//                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
//        // use dark color scheme for borders of active controls
//        controlPaneSchemeBundle.registerColorScheme(darkBrownColorScheme,
//                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
//        // and default controls
//        controlPaneSchemeBundle.registerColorScheme(darkBrownColorScheme,
//                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
//        this.registerDecorationAreaSchemeBundle(controlPaneSchemeBundle,
//            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new CookbookFillPainter();

        this.borderPainter = new CompositeBorderPainter("Cookbook",
            new FractionBasedTonalBorderPainter("Cookbook Outer",
                new float[] {0.0f, 0.5f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokensSingleColorQuery.blend(
                        ContainerColorTokens::getContainerOutlineVariant,
                        ContainerColorTokens::getContainerOutline,
                        0.3f),
                    ContainerColorTokens::getContainerOutline,
                    ContainerColorTokens::getContainerOutline,
                }),
            new FractionBasedTonalBorderPainter("Cookbook Inner",
                new float[] {0.0f, 0.5f, 1.0f},
                new int[] {140, 96, 64},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                }));

        this.decorationPainter = new CookbookDecorationPainter();
        this.highlightFillPainter = new MatteTonalFillPainter();

        // Add an overlay painter to paint a bezel line along the top edge of the footer area
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelTonalOverlayPainter(
            ContainerColorTokens::getContainerOutlineVariant,
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getInverseContainerOutline,
                ColorTransform.alpha(72)));
        this.addOverlayPainter(footerTopBezelOverlayPainter,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        // Add overlay painter to paint drop shadows along the bottom
        // edges of the title pane
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(),
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);

        // Add an overlay painter to paint a dark line along the bottom
        // edge of the title pane
        RadianceOverlayPainter titlePaneBottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
            ContainerColorTokens::getContainerOutline);
        this.addOverlayPainter(titlePaneBottomLineOverlayPainter,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
    }
}
