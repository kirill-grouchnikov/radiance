/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.CremeColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.LightGrayColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.*;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

import java.awt.*;

public class CookbookSkin extends RadianceSkin {

    @Override
    public String getDisplayName() {
        return "Cookbook";
    }

    public CookbookSkin() {
        RadianceColorScheme activeScheme = new ActiveScheme();
        RadianceColorScheme enabledScheme = new CremeColorScheme();
        RadianceColorScheme disabledScheme = new LightGrayColorScheme().tint(0.35)
                .named("Cookbook Disabled");
        RadianceColorScheme darkBrownColorScheme = new DarkBrownColorScheme();
        RadianceColorScheme goldenBrownScheme = new GoldenBrownColorScheme();

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        // use darker borders on enabled components
        defaultSchemeBundle.registerColorScheme(goldenBrownScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        defaultSchemeBundle.registerColorScheme(goldenBrownScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
                darkBrownColorScheme, goldenBrownScheme, goldenBrownScheme);
        headerSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(goldenBrownScheme,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
                DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        // scheme bundle for the CONTROL_PANE area type
        RadianceColorSchemeBundle controlPaneSchemeBundle = new RadianceColorSchemeBundle(
                goldenBrownScheme.shiftBackground(new Color(127, 58, 11), 0.7f),
                darkBrownColorScheme, darkBrownColorScheme);
        // use translucency on disabled controls
        controlPaneSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);
        controlPaneSchemeBundle.registerColorScheme(darkBrownColorScheme,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        // use dark color scheme for borders of active controls
        controlPaneSchemeBundle.registerColorScheme(darkBrownColorScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
        // and default controls
        controlPaneSchemeBundle.registerColorScheme(darkBrownColorScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        this.registerDecorationAreaSchemeBundle(controlPaneSchemeBundle, DecorationAreaType.CONTROL_PANE);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new CookbookFillPainter();

        RadianceBorderPainter outerBorderPainter = new FractionBasedBorderPainter("Cookbook Outer",
                new float[] { 0.0f, 0.5f, 1.0f },
                new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.DARK,
                                ColorSchemeSingleColorQuery.ULTRADARK,
                                ColorSchemeSingleColorQuery.ULTRADARK });
        RadianceBorderPainter innerBorderPainter = new DelegateBorderPainter("Cookbook Inner",
                new ClassicBorderPainter(), 0x88FFFFFF, 0x44FFFFFF, 0x00FFFFFF,
                scheme -> scheme.shiftBackground(scheme.getUltraLightColor(), 0.8).tint(0.7));
        this.borderPainter = new CompositeBorderPainter("Cookbook", outerBorderPainter,
                innerBorderPainter);

        this.decorationPainter = new CookbookDecorationPainter();
        this.highlightFillPainter = new ClassicFillPainter();

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
                ColorSchemeSingleColorQuery.ULTRADARK);
        this.addOverlayPainter(titlePaneBottomLineOverlayPainter,
                DecorationAreaType.PRIMARY_TITLE_PANE);
    }
}
