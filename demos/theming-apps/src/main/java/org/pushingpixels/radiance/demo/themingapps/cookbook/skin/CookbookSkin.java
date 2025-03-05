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
import org.pushingpixels.ephemeral.chroma.palettes.BimodalTonalPalette;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

public class CookbookSkin extends RadianceSkin {

    @Override
    public String getDisplayName() {
        return "Cookbook";
    }

    public CookbookSkin() {
        RadianceColorScheme cookbookDefaultColorScheme = ColorSchemeUtils.getColorScheme(
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
        RadianceColorSchemeBundle cookbookDefaultDefaultBundle =
            new RadianceColorSchemeBundle(cookbookDefaultColorScheme);
        this.registerDecorationAreaSchemeBundle(cookbookDefaultDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.NONE);

        RadianceColorScheme cookbookControlPaneColorScheme = ColorSchemeUtils.getColorScheme(
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
        RadianceColorSchemeBundle cookbookControlPaneDefaultBundle =
            new RadianceColorSchemeBundle(cookbookControlPaneColorScheme);
        this.registerDecorationAreaSchemeBundle(cookbookControlPaneDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        Hct cookbookHeaderPrimarySeed = Hct.fromInt(0xFF581000);

        Hct cookbookHeaderMutedSeed1 = Hct.fromInt(0xFF813106);
        Hct cookbookHeaderMutedSeed2 = Hct.fromInt(0xFFD08A2F);
        double cookbookHeaderMutedSeedTone = (cookbookHeaderMutedSeed1.getTone() +
            cookbookHeaderMutedSeed2.getTone()) / 2.0;
        BimodalTonalPalette cookbookHeaderMutedPalette = BimodalTonalPalette.from(
            /* hct1 */ cookbookHeaderMutedSeed1,
            /* hct2 */ cookbookHeaderMutedSeed2,
            /* transitionRange */ new BimodalTonalPalette.TransitionRangeFidelityDark(
                cookbookHeaderMutedSeedTone));

        Hct cookbookHeaderNeutralSeed1 = Hct.fromInt(0xFFA44D01);
        Hct cookbookHeaderNeutralSeed2 = Hct.fromInt(0xFFC28A2B);
        BimodalTonalPalette cookbookHeaderNeutralPalette = BimodalTonalPalette.from(
            /* hct1 */ cookbookHeaderNeutralSeed1,
            /* hct2 */ cookbookHeaderNeutralSeed2,
            /* transitionRange */ new BimodalTonalPalette.TransitionRangeFidelityDark(
                cookbookHeaderNeutralSeed2.getTone()));

        RadianceColorScheme cookbookHeaderColorScheme = ColorSchemeUtils.getColorScheme(
            /* palettesSource */ new ColorSchemeUtils.FidelityDirectPaletteSource(
                /* primaryPalette */ TonalPalette.fromHct(cookbookHeaderPrimarySeed),
                /* mutedPalette */ cookbookHeaderMutedPalette,
                /* neutralPalette */ cookbookHeaderNeutralPalette,
                /* primarySourceTone */ cookbookHeaderPrimarySeed.getTone(),
                /* mutedSourceTone */ cookbookHeaderMutedSeedTone,
                /* neutralSourceTone */ cookbookHeaderNeutralSeed2.getTone()),
            /* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
            /* isPrimaryDark */ true,
            /* isTonalDark */ true,
            /* isMutedDark */ true,
            /* isNeutralDark */ true,
            /* isSystemDark */ true,
            /* primaryContrastLevel */ 0.0f,
            /* tonalContrastLevel */ 1.0f,
            /* mutedContrastLevel */ 1.0f,
            /* neutralContrastLevel */ 1.0f,
            /* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver());
        RadianceColorSchemeBundle cookbookHeaderDefaultBundle =
            new RadianceColorSchemeBundle(cookbookHeaderColorScheme);
        this.registerDecorationAreaSchemeBundle(cookbookHeaderDefaultBundle,
            RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
            RadianceThemingSlices.DecorationAreaType.HEADER,
            RadianceThemingSlices.DecorationAreaType.TOOLBAR,
            RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new CookbookFillPainter();

        this.borderPainter = new CompositeBorderPainter("Cookbook",
            new FractionBasedTonalBorderPainter("Cookbook Outer",
                new float[] {0.0f, 0.5f, 1.0f},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokensSingleColorQuery.blend(
                        ContainerColorTokens::getContainerOutlineVariant,
                        ContainerColorTokens::getContainerOutline,
                        0.8f),
                    ContainerColorTokens::getContainerOutline,
                    ContainerColorTokens::getContainerOutline,
                }),
            new FractionBasedTonalBorderPainter("Cookbook Inner",
                new float[] {0.0f, 0.5f, 1.0f},
                new int[] {112, 80, 64},
                new ContainerColorTokensSingleColorQuery[] {
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline,
                    ContainerColorTokens::getComplementaryContainerOutline
                }));

        this.decorationPainter = new CookbookDecorationPainter();
        this.highlightFillPainter = new MatteFillPainter();

        // Add an overlay painter to paint a bezel line along the top edge of the footer area
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
            ContainerColorTokens::getContainerOutlineVariant,
            ContainerColorTokensSingleColorQuery.composite(
                ContainerColorTokens::getInverseContainerOutline,
                ColorTransform.alpha(72)));
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
