/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.api.skin;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.ColorTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.*;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Magellan</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class MagellanSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Magellan";

    /**
     * Overlay painter to paint a dark line along the bottom edge of the
     * toolbars.
     */
    private BottomLineOverlayPainter toolbarBottomLineOverlayPainter;

    /**
     * Overlay painter to paint a light line along the top edge of the toolbars.
     */
    private TopLineOverlayPainter toolbarTopLineOverlayPainter;

    /**
     * Overlay painter to paint a shadow along the top edge of the footer.
     */
    private TopShadowOverlayPainter footerTopShadowOverlayPainter;

    @Override
    public String getDisplayName() {
        return NAME;
    }

    /**
     * Creates a new instance of Magellan skin.
     */
    public MagellanSkin() {
        ColorSchemes colorSchemes = SubstanceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/substance/api/skin/magellan.colorschemes"));

        SubstanceColorScheme blueControlsActive = colorSchemes
                .get("Magellan Blue Controls Active");
        SubstanceColorScheme blueControlsEnabled = colorSchemes
                .get("Magellan Blue Controls Enabled");

        SubstanceColorSchemeBundle defaultColorSchemeBundle = new SubstanceColorSchemeBundle(
                blueControlsActive, blueControlsEnabled, blueControlsEnabled);
        defaultColorSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);
        defaultColorSchemeBundle.registerColorScheme(blueControlsEnabled, ComponentState.DISABLED_UNSELECTED);
        defaultColorSchemeBundle.registerColorScheme(blueControlsActive, ComponentState.DISABLED_SELECTED);

        // color schemes for the active states
        SubstanceColorScheme blueControlsActiveBorder = colorSchemes
                .get("Magellan Blue Controls Active Border");
        SubstanceColorScheme blueControlsEnabledBorder = colorSchemes
                .get("Magellan Blue Controls Enabled Border");
        defaultColorSchemeBundle.registerColorScheme(blueControlsActiveBorder,
                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
        defaultColorSchemeBundle.registerColorScheme(blueControlsActiveBorder,
                ColorSchemeAssociationKind.BORDER,
                ComponentState.DISABLED_SELECTED);
        defaultColorSchemeBundle.registerColorScheme(blueControlsEnabledBorder,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED,
                ComponentState.DISABLED_UNSELECTED);
        defaultColorSchemeBundle.registerColorScheme(blueControlsActiveBorder,
                ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED);
        defaultColorSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        defaultColorSchemeBundle.registerColorScheme(blueControlsActiveBorder,
                ColorSchemeAssociationKind.MARK, ComponentState.DISABLED_SELECTED);

        // color schemes for the pressed states
        SubstanceColorScheme blueControlsPressed = colorSchemes
                .get("Magellan Blue Controls Pressed");
        SubstanceColorScheme blueControlsPressedBorder = colorSchemes
                .get("Magellan Blue Controls Pressed Border");
        defaultColorSchemeBundle.registerColorScheme(blueControlsPressed,
                ColorSchemeAssociationKind.FILL,
                ComponentState.PRESSED_SELECTED,
                ComponentState.PRESSED_UNSELECTED);
        defaultColorSchemeBundle.registerColorScheme(blueControlsPressedBorder,
                ColorSchemeAssociationKind.BORDER,
                ComponentState.PRESSED_SELECTED,
                ComponentState.PRESSED_UNSELECTED);

        // color schemes for the rollover / armed states
        SubstanceColorScheme greenControls = colorSchemes.get("Magellan Green Controls");
        SubstanceColorScheme greenControlsRollover = colorSchemes.get("Magellan Green Controls Rollover");
        SubstanceColorScheme blueActiveControlsPressed = colorSchemes.get("Magellan Blue Active Controls Pressed");
        SubstanceColorScheme greenControlsMark = colorSchemes.get("Magellan Green Controls Mark");
        SubstanceColorScheme activeControlsBorder = colorSchemes.get("Magellan Green Controls Border");
        defaultColorSchemeBundle.registerColorScheme(greenControlsRollover,
                ColorSchemeAssociationKind.FILL,
                ComponentState.ROLLOVER_SELECTED,
                ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
        defaultColorSchemeBundle.registerColorScheme(blueActiveControlsPressed,
                ColorSchemeAssociationKind.FILL,
                ComponentState.PRESSED_SELECTED,
                ComponentState.PRESSED_UNSELECTED);
        defaultColorSchemeBundle.registerColorScheme(greenControlsMark,
                ColorSchemeAssociationKind.MARK,
                ComponentState.ROLLOVER_SELECTED,
                ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.PRESSED_UNSELECTED,
                ComponentState.PRESSED_SELECTED,
                ComponentState.SELECTED,
                ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
        defaultColorSchemeBundle.registerColorScheme(activeControlsBorder,
                ColorSchemeAssociationKind.BORDER,
                ComponentState.ROLLOVER_SELECTED,
                ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);

        // Also use active colors for selected checkboxes and radio buttons
        defaultColorSchemeBundle.registerColorScheme(greenControls,
                ColorSchemeAssociationKind.MARK_BOX,
                ComponentState.SELECTED);
        defaultColorSchemeBundle.registerColorScheme(greenControlsRollover,
                ColorSchemeAssociationKind.MARK_BOX,
                ComponentState.ROLLOVER_SELECTED,
                ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
        defaultColorSchemeBundle.registerColorScheme(blueActiveControlsPressed,
                ColorSchemeAssociationKind.MARK_BOX,
                ComponentState.PRESSED_UNSELECTED,
                ComponentState.PRESSED_SELECTED);

        // color scheme for the uneditable text components
        ComponentState uneditable = new ComponentState("uneditable",
                new ComponentStateFacet[] {ComponentStateFacet.ENABLE},
                new ComponentStateFacet[] {ComponentStateFacet.EDITABLE});
        SubstanceColorScheme uneditableControls = colorSchemes
                .get("Magellan Uneditable Controls");
        defaultColorSchemeBundle.registerColorScheme(uneditableControls,
                ColorSchemeAssociationKind.FILL, uneditable);

        // color scheme for the selected state - preventing fallback to the
        // rollover selected state
        defaultColorSchemeBundle.registerColorScheme(blueControlsActive,
                ColorSchemeAssociationKind.FILL, ComponentState.SELECTED);
        // But continue using green for selected highlight text
        defaultColorSchemeBundle.registerColorScheme(greenControls,
                ColorSchemeAssociationKind.HIGHLIGHT_TEXT);

        // highlight alphas
        defaultColorSchemeBundle.registerHighlightAlpha(0.75f, ComponentState.ROLLOVER_UNSELECTED);
        defaultColorSchemeBundle.registerHighlightAlpha(0.85f, ComponentState.SELECTED);
        defaultColorSchemeBundle.registerHighlightAlpha(0.95f, ComponentState.ROLLOVER_SELECTED);
        defaultColorSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        defaultColorSchemeBundle.registerHighlightColorScheme(greenControls, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

        defaultColorSchemeBundle.registerColorScheme(blueControlsActive.tint(0.2),
                ColorSchemeAssociationKind.TAB,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        SubstanceColorScheme lightBlueBackground = colorSchemes.get("Magellan Light Blue Background");

        this.registerDecorationAreaSchemeBundle(defaultColorSchemeBundle,
                lightBlueBackground, DecorationAreaType.NONE);

        SubstanceColorScheme mediumBlueBackground = colorSchemes.get("Magellan Medium Blue Background");
        SubstanceColorScheme darkBlueBackground = colorSchemes.get("Magellan Dark Blue Background");
        this.registerAsDecorationArea(mediumBlueBackground,
                DecorationAreaType.CONTROL_PANE, DecorationAreaType.TOOLBAR);
        this.registerAsDecorationArea(darkBlueBackground,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER);

        SubstanceColorScheme lightBlueControlsActive = colorSchemes
                .get("Magellan Light Blue Controls Active");
        SubstanceColorScheme lightBlueControlsEnabled = colorSchemes
                .get("Magellan Light Blue Controls Enabled");
        SubstanceColorScheme lightBlueBordersEnabled = colorSchemes
                .get("Magellan Light Blue Borders Enabled");
        SubstanceColorSchemeBundle footerColorSchemeBundle = new SubstanceColorSchemeBundle(
                lightBlueControlsActive, lightBlueControlsEnabled,
                lightBlueControlsEnabled);
        footerColorSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);
        footerColorSchemeBundle.registerColorScheme(lightBlueControlsEnabled,
                ComponentState.DISABLED_UNSELECTED);
        footerColorSchemeBundle.registerColorScheme(lightBlueControlsActive,
                ComponentState.DISABLED_SELECTED);
        footerColorSchemeBundle.registerColorScheme(lightBlueBordersEnabled,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

        SubstanceColorScheme lightBlueSeparator = colorSchemes
                .get("Magellan Light Blue Separator");
        footerColorSchemeBundle.registerColorScheme(lightBlueSeparator,
                ColorSchemeAssociationKind.SEPARATOR);

        // And use light-on-blue for text highlights in the footer area
        footerColorSchemeBundle.registerColorScheme(blueControlsEnabled,
                ColorSchemeAssociationKind.HIGHLIGHT_TEXT);

        SubstanceColorScheme ultraLightBlueBackground = colorSchemes
                .get("Magellan Ultralight Blue Background");
        this.registerDecorationAreaSchemeBundle(footerColorSchemeBundle,
                ultraLightBlueBackground, DecorationAreaType.FOOTER);

        // Add overlay painter to paint drop shadows along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
                DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a dark line along the bottom
        // edge of toolbars
        this.toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.ULTRADARK);
        this.addOverlayPainter(this.toolbarBottomLineOverlayPainter,
                DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a light line along the top
        // edge of toolbars
        this.toolbarTopLineOverlayPainter = new TopLineOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
                        ColorTransform.alpha(40)));
        this.addOverlayPainter(this.toolbarTopLineOverlayPainter, DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        this.footerTopShadowOverlayPainter = TopShadowOverlayPainter.getInstance(100);
        this.addOverlayPainter(this.footerTopShadowOverlayPainter, DecorationAreaType.FOOTER);

        this.setTabFadeStart(0.18);
        this.setTabFadeEnd(0.18);

        SubstanceBorderPainter outerBorderPainter = new FractionBasedBorderPainter(
                "Magellan Outer", new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {
                        ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorSchemeSingleColorQuery.DARK,
                        ColorSchemeSingleColorQuery.DARK});
        SubstanceBorderPainter innerBorderPainter = new DelegateBorderPainter(
                "Magellan Inner", new ClassicBorderPainter(),
                0xA0FFFFFF, 0x60FFFFFF, 0x40FFFFFF,
                scheme -> scheme.tint(0.5f));
        this.borderPainter = new CompositeBorderPainter("Magellan",
                outerBorderPainter, innerBorderPainter);
        this.fillPainter = new FractionBasedFillPainter("Magellan",
                new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {
                        ColorSchemeSingleColorQuery.EXTRALIGHT,
                        ColorSchemeSingleColorQuery.LIGHT,
                        ColorSchemeSingleColorQuery.MID});
        this.highlightPainter = new ClassicHighlightPainter();
        this.decorationPainter = new MatteDecorationPainter();
        this.buttonShaper = new ClassicButtonShaper();
    }
}
