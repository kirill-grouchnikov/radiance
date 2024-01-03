/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
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

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme, DecorationAreaType.NONE);

        // CONTROL_PANE area
        RadianceColorScheme controlPaneBackgroundScheme = schemes.get("Harvest Control Pane Background");
        this.registerAsDecorationArea(controlPaneBackgroundScheme, DecorationAreaType.CONTROL_PANE);

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
                DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100), DecorationAreaType.TOOLBAR);
        this.addOverlayPainter(new BottomLineOverlayPainter(
                        ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                                ColorTransform.brightness(-0.1f))),
                DecorationAreaType.TOOLBAR);

        // Add overlay painters to paint drop shadow and a dark line along the top
        // edges of footers
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(15), DecorationAreaType.FOOTER);
        this.addOverlayPainter(new TopLineOverlayPainter(
                        ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                                ColorTransform.brightness(-0.1f))),
                DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new SpecularRectangularFillPainter(new ClassicFillPainter(), 1.0f);

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightFillPainter = new ClassicFillPainter();
        this.borderPainter = new ClassicBorderPainter();
    }

    public String getDisplayName() {
        return NAME;
    }
}
