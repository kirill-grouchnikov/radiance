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
package org.pushingpixels.radiance.theming.api.skin;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
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

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100), RadianceThemingSlices.DecorationAreaType.TOOLBAR);
        this.addOverlayPainter(new BottomLineOverlayPainter(
                        ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                                ColorTransform.brightness(-0.1f))),
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // Add overlay painters to paint drop shadow and a dark line along the top
        // edges of footers
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(15), RadianceThemingSlices.DecorationAreaType.FOOTER);
        this.addOverlayPainter(new TopLineOverlayPainter(
                        ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                                ColorTransform.brightness(-0.1f))),
                RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.setTabFadeStart(0.18);
        this.setTabFadeEnd(0.18);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new ClassicFillPainter();
        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();
        this.borderPainter = new ClassicBorderPainter();
    }

    public String getDisplayName() {
        return NAME;
    }
}
