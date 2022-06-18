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
package org.pushingpixels.radiance.theming.extras.api.skinpack;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.DelegateFractionBasedBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FractionBasedDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Office Silver 2007</code> skin. This class is part of officially
 * supported API.
 *
 * @author Kirill Grouchnikov
 */
public class OfficeSilver2007Skin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Office Silver 2007";

    /**
     * Creates a new <code>Office Silver 2007</code> skin.
     */
    public OfficeSilver2007Skin() {
        ColorSchemes colorSchemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/extras/api/skinpack/office2007.colorschemes"));

        RadianceColorScheme activeScheme =
                colorSchemes.get("Office Silver Active");
        RadianceColorScheme enabledScheme =
                colorSchemes.get("Office Silver Enabled");

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, enabledScheme);
        defaultSchemeBundle.registerAlpha(0.5f,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(enabledScheme, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(activeScheme, ComponentState.DISABLED_SELECTED);

        RadianceColorScheme rolloverScheme =
                colorSchemes.get("Office Silver Rollover");
        RadianceColorScheme rolloverSelectedScheme =
                colorSchemes.get("Office Silver Rollover Selected");
        RadianceColorScheme selectedScheme =
                colorSchemes.get("Office Silver Selected");
        RadianceColorScheme pressedScheme =
                colorSchemes.get("Office Silver Pressed");
        RadianceColorScheme pressedSelectedScheme =
                colorSchemes.get("Office Silver Pressed Selected");

        // register state-specific color schemes on rollovers and selections
        defaultSchemeBundle.registerColorScheme(rolloverScheme,
                ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
                ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerColorScheme(selectedScheme,
                ComponentState.SELECTED);
        defaultSchemeBundle.registerColorScheme(pressedScheme,
                ComponentState.PRESSED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(pressedSelectedScheme,
                ComponentState.PRESSED_SELECTED);
        defaultSchemeBundle.registerColorScheme(selectedScheme.tone(0.2f),
                ComponentState.DISABLED_SELECTED);

        // register state-specific highlight color schemes on rollover and
        // selections
        defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED, ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
        defaultSchemeBundle.registerHighlightColorScheme(rolloverScheme,
                ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerHighlightColorScheme(selectedScheme, ComponentState.SELECTED,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        defaultSchemeBundle.registerHighlightColorScheme(rolloverSelectedScheme,
                ComponentState.ROLLOVER_SELECTED);

        // borders and marks
        RadianceColorScheme borderEnabledScheme =
                colorSchemes.get("Office Silver Border Enabled");
        RadianceColorScheme borderActiveScheme =
                colorSchemes.get("Office Silver Border Active");
        RadianceColorScheme borderRolloverScheme =
                colorSchemes.get("Office Border Rollover");
        RadianceColorScheme borderRolloverSelectedScheme =
                colorSchemes.get("Office Border Rollover Selected");
        RadianceColorScheme borderSelectedScheme =
                colorSchemes.get("Office Border Selected");
        RadianceColorScheme borderPressedScheme =
                colorSchemes.get("Office Border Pressed");

        defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
                ColorSchemeAssociationKind.BORDER,
                ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(borderActiveScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.DEFAULT);
        defaultSchemeBundle.registerColorScheme(borderRolloverScheme,
                ColorSchemeAssociationKind.BORDER,
                ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(borderRolloverSelectedScheme,
                ColorSchemeAssociationKind.BORDER,
                ComponentState.ROLLOVER_SELECTED, ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
        defaultSchemeBundle.registerColorScheme(borderSelectedScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);
        defaultSchemeBundle.registerColorScheme(borderPressedScheme,
                ColorSchemeAssociationKind.BORDER,
                ComponentState.PRESSED_SELECTED,
                ComponentState.PRESSED_UNSELECTED);

        RadianceColorScheme markEnabledScheme =
                colorSchemes.get("Office Silver Mark Enabled");
        defaultSchemeBundle.registerColorScheme(markEnabledScheme,
                ColorSchemeAssociationKind.MARK, ComponentState.ENABLED);
        defaultSchemeBundle.registerColorScheme(markEnabledScheme,
                ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);

        registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE);

        // tabs and tab borders
        RadianceColorScheme tabSelectedScheme =
                colorSchemes.get("Office Silver Tab Selected");
        RadianceColorScheme tabRolloverScheme =
                colorSchemes.get("Office Silver Tab Rollover");
        defaultSchemeBundle.registerColorScheme(tabSelectedScheme,
                ColorSchemeAssociationKind.TAB, ComponentState.SELECTED,
                ComponentState.ROLLOVER_SELECTED,
                ComponentState.PRESSED_SELECTED,
                ComponentState.PRESSED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(tabRolloverScheme,
                ColorSchemeAssociationKind.TAB,
                ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
                ColorSchemeAssociationKind.TAB_BORDER, ComponentState.SELECTED,
                ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
                ColorSchemeAssociationKind.TAB_BORDER,
                ComponentState.ROLLOVER_SELECTED);

        // separator
        RadianceColorScheme separatorScheme =
                colorSchemes.get("Office Silver Separator");
        defaultSchemeBundle.registerColorScheme(separatorScheme,
                ColorSchemeAssociationKind.SEPARATOR);

        defaultSchemeBundle.registerColorScheme(selectedScheme,
                ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED, ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(pressedScheme,
                ColorSchemeAssociationKind.MARK, ComponentState.PRESSED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(pressedSelectedScheme,
                ColorSchemeAssociationKind.MARK, ComponentState.PRESSED_SELECTED);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE);

        RadianceColorScheme headerBackgroundScheme =
                colorSchemes.get("Office Silver Header Background");

        this.registerAsDecorationArea(headerBackgroundScheme,
                DecorationAreaType.FOOTER, DecorationAreaType.HEADER,
                DecorationAreaType.TOOLBAR);

        RadianceColorScheme titleBackgroundScheme =
                colorSchemes.get("Office Silver Title Background");

        this.registerAsDecorationArea(titleBackgroundScheme,
                DecorationAreaType.CONTROL_PANE,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE);

        this.addOverlayPainter(new BottomLineOverlayPainter(
                        ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
                                ColorTransform.alpha(72))),
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE);

        this.buttonShaper = new ClassicButtonShaper();

        this.fillPainter = new FractionBasedFillPainter("Office Silver 2007",
                new float[] {0.0f, 0.49999f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {
                        ColorSchemeSingleColorQuery.ULTRALIGHT,
                        ColorSchemeSingleColorQuery.LIGHT,
                        ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorSchemeSingleColorQuery.EXTRALIGHT});

        FractionBasedBorderPainter outerBorderPainter = new FractionBasedBorderPainter(
                "Office Silver 2007 Outer", new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {
                        ColorSchemeSingleColorQuery.LIGHT,
                        ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorSchemeSingleColorQuery.MID});
        RadianceBorderPainter innerBorderPainter = new DelegateFractionBasedBorderPainter(
                "Office Silver 2007 Inner", outerBorderPainter,
                new int[] {0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF},
                scheme -> scheme.tint(0.8f));
        this.borderPainter = new CompositeBorderPainter("Office Silver 2007",
                outerBorderPainter, innerBorderPainter);

        this.decorationPainter = new FractionBasedDecorationPainter(
                "Office Silver 2007",
                new float[] {0.0f, 0.2499999f, 0.25f, 0.3f, 0.7f, 1.0f},
                new ColorSchemeSingleColorQuery[] {
                        ColorSchemeSingleColorQuery.ULTRALIGHT,
                        ColorSchemeSingleColorQuery.EXTRALIGHT,
                        ColorSchemeSingleColorQuery.DARK,
                        ColorSchemeSingleColorQuery.MID,
                        ColorSchemeSingleColorQuery.LIGHT,
                        ColorSchemeSingleColorQuery.ULTRALIGHT});

        this.highlightPainter = new ClassicHighlightPainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
