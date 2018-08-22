/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.samples.substance.cookbook.skin;

import java.awt.Color;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.CremeColorScheme;
import org.pushingpixels.substance.api.colorscheme.LightGrayColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.border.FractionBasedBorderPainter;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

public class CookbookSkin extends SubstanceSkin {

    @Override
    public String getDisplayName() {
        return "Cookbook";
    }

    public CookbookSkin() {
        SubstanceColorScheme activeScheme = new ActiveScheme();
        SubstanceColorScheme enabledScheme = new CremeColorScheme();
        SubstanceColorScheme disabledScheme = new LightGrayColorScheme().tint(0.35)
                .named("Cookbook Disabled");
        SubstanceColorScheme darkBrownColorScheme = new DarkBrownColorScheme();
        SubstanceColorScheme goldenBrownScheme = new GoldenBrownColorScheme();

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        // use darker borders on enabled components
        defaultSchemeBundle.registerColorScheme(goldenBrownScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        defaultSchemeBundle.registerColorScheme(goldenBrownScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

        SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
                darkBrownColorScheme, goldenBrownScheme, goldenBrownScheme);
        headerSchemeBundle.registerColorScheme(goldenBrownScheme, 0.7f,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
                DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        // scheme bundle for the GENERAL area type
        SubstanceColorSchemeBundle generalSchemeBundle = new SubstanceColorSchemeBundle(
                goldenBrownScheme.shiftBackground(new Color(127, 58, 11), 0.7f),
                darkBrownColorScheme, darkBrownColorScheme);
        // use translucency on disabled controls
        generalSchemeBundle.registerColorScheme(darkBrownColorScheme, 0.7f,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        // use dark color scheme for borders of active controls
        generalSchemeBundle.registerColorScheme(darkBrownColorScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
        // and default controls
        generalSchemeBundle.registerColorScheme(darkBrownColorScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        this.registerDecorationAreaSchemeBundle(generalSchemeBundle, DecorationAreaType.GENERAL);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new CookbookGradientPainter();

        SubstanceBorderPainter outerBorderPainter = new FractionBasedBorderPainter("Cookbook Outer",
                new float[] { 0.0f, 0.5f, 1.0f },
                new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.DARK,
                                ColorSchemeSingleColorQuery.ULTRADARK,
                                ColorSchemeSingleColorQuery.ULTRADARK });
        SubstanceBorderPainter innerBorderPainter = new DelegateBorderPainter("Cookbook Inner",
                new ClassicBorderPainter(), 0x88FFFFFF, 0x44FFFFFF, 0x00FFFFFF,
                (SubstanceColorScheme scheme) -> scheme
                        .shiftBackground(scheme.getUltraLightColor(), 0.8).tint(0.7));
        this.borderPainter = new CompositeBorderPainter("Cookbook", outerBorderPainter,
                innerBorderPainter);

        this.decorationPainter = new CookbookDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();

        // Add an overlay painter to paint a bezel line along the top edge of the footer area
        TopBezelOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
                ColorSchemeSingleColorQuery.DARK, ColorSchemeSingleColorQuery.EXTRALIGHT);
        this.addOverlayPainter(footerTopBezelOverlayPainter, DecorationAreaType.FOOTER);

        // Add overlay painter to paint drop shadows along the bottom
        // edges of the title pane
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(),
                DecorationAreaType.PRIMARY_TITLE_PANE);

        // Add an overlay painter to paint a dark line along the bottom
        // edge of the title pane
        BottomLineOverlayPainter titlePaneBottomLineOverlayPainter = new BottomLineOverlayPainter(
                (SubstanceColorScheme scheme) -> scheme.getUltraDarkColor());
        this.addOverlayPainter(titlePaneBottomLineOverlayPainter,
                DecorationAreaType.PRIMARY_TITLE_PANE);
    }
}
