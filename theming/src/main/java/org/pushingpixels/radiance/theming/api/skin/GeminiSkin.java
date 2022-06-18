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
import org.pushingpixels.radiance.theming.api.painter.border.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Gemini</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class GeminiSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Gemini";

    /**
     * Overlay painter to paint a dark line along the bottom edge of the
     * menubar.
     */
    private BottomLineOverlayPainter menuOverlayPainter;

    /**
     * Overlay painter to paint a light line along the top edge of the toolbars.
     */
    private TopLineOverlayPainter toolbarOverlayPainter;

    /**
     * Overlay painter to paint a dark line along the bottom edge of the
     * toolbars.
     */
    private BottomLineOverlayPainter toolbarBottomLineOverlayPainter;

    /**
     * Overlay painter to paint a bezel line along the top edge of the footer.
     */
    private TopBezelOverlayPainter footerTopBezelOverlayPainter;

    /**
     * Creates a new <code>Gemini</code> skin.
     */
    public GeminiSkin() {
        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/gemini.colorschemes"));

        RadianceColorScheme grayScheme = schemes.get("Gemini Gray");
        RadianceColorScheme disabledScheme = schemes.get("Gemini Disabled");

        // use the same color scheme for active and enabled controls
        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(grayScheme,
                grayScheme, disabledScheme);

        // highlight fill scheme + custom alpha for rollover unselected state
        RadianceColorScheme highlightScheme = schemes.get("Gemini Highlight");
        RadianceColorScheme highlightBorderScheme = schemes.get("Gemini Highlight Border");
        applyHighlightColorScheme(defaultSchemeBundle, highlightScheme);
        applyHighlightAsFill(defaultSchemeBundle, highlightScheme, highlightBorderScheme);

        // borders, separators, marks
        RadianceColorScheme grayBorderScheme = schemes.get("Gemini Gray Border");
        RadianceColorScheme lightGrayBorderScheme = schemes.get("Gemini Light Gray Border");
        RadianceColorScheme darkGraySeparatorScheme = schemes.get("Gemini Dark Gray Separator");
        defaultSchemeBundle.registerColorScheme(grayBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        defaultSchemeBundle.registerColorScheme(lightGrayBorderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_DEFAULT,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(grayScheme, ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(darkGraySeparatorScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);
        defaultSchemeBundle.registerColorScheme(grayScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);

        defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(highlightScheme.tone(0.2f), ComponentState.DISABLED_SELECTED);

        RadianceColorScheme whiteBackgroundScheme = schemes.get("Gemini White Background");

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, whiteBackgroundScheme,
                RadianceThemingSlices.DecorationAreaType.NONE);

        // control pane color scheme bundle
        RadianceColorSchemeBundle controlPaneSchemeBundle = new RadianceColorSchemeBundle(grayScheme,
                grayScheme, disabledScheme);
        controlPaneSchemeBundle.registerColorScheme(grayScheme, ComponentState.ROLLOVER_UNSELECTED);
        controlPaneSchemeBundle.registerColorScheme(grayScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);
        controlPaneSchemeBundle.registerColorScheme(grayBorderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        controlPaneSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        applyHighlightColorScheme(controlPaneSchemeBundle, highlightScheme);
        applyHighlightAsFill(controlPaneSchemeBundle, highlightScheme, highlightBorderScheme);
        this.registerDecorationAreaSchemeBundle(controlPaneSchemeBundle, grayScheme,
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // header color scheme bundle
        RadianceColorScheme blackColorScheme = schemes.get("Gemini Black");
        RadianceColorScheme activeHeaderScheme = schemes.get("Gemini Black Active Header");
        RadianceColorScheme disabledHeaderScheme = schemes.get("Gemini Black Disabled Header");
        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
                activeHeaderScheme, blackColorScheme, blackColorScheme);
        headerSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        headerSchemeBundle.registerColorScheme(disabledHeaderScheme,
                ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(blackColorScheme,
                ComponentState.ROLLOVER_UNSELECTED);
        headerSchemeBundle.registerColorScheme(blackColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);
        headerSchemeBundle.registerColorScheme(
                grayScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerColorScheme(blackColorScheme.shade(0.9f),
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        applyHighlightColorScheme(headerSchemeBundle, highlightScheme);
        applyHighlightAsFill(headerSchemeBundle, highlightScheme, highlightBorderScheme);
        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, blackColorScheme,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

        // toolbar color scheme bundle
        RadianceColorScheme darkBlueColorScheme = schemes.get("Gemini Dark Blue");
        RadianceColorScheme darkBlueBackgroundColorScheme = schemes.get("Gemini Dark Blue Background");
        RadianceColorScheme darkBlueSeparatorColorScheme = schemes.get("Gemini Dark Blue Separator");
        RadianceColorSchemeBundle toolbarSchemeBundle = new RadianceColorSchemeBundle(
                blackColorScheme, darkBlueColorScheme, darkBlueColorScheme);
        toolbarSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        toolbarSchemeBundle.registerColorScheme(blackColorScheme, ComponentState.DISABLED_SELECTED);
        toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme, ComponentState.DISABLED_UNSELECTED);
        toolbarSchemeBundle.registerColorScheme(blackColorScheme, ComponentState.ROLLOVER_UNSELECTED);
        toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK);
        toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        toolbarSchemeBundle.registerColorScheme(darkBlueSeparatorColorScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);
        toolbarSchemeBundle.registerColorScheme(highlightScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.PRESSED_SELECTED);
        applyHighlightColorScheme(toolbarSchemeBundle, highlightScheme);
        applyHighlightAsFill(toolbarSchemeBundle, highlightScheme, darkBlueColorScheme);
        this.registerDecorationAreaSchemeBundle(toolbarSchemeBundle, darkBlueBackgroundColorScheme,
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        this.footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
                ColorSchemeSingleColorQuery.DARK, ColorSchemeSingleColorQuery.ULTRALIGHT);
        this.addOverlayPainter(this.footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // add two overlay painters to create a bezel line between
        // menu bar and toolbars
        this.menuOverlayPainter = new BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorTransform.brightness(-0.5f)));
        this.toolbarOverlayPainter = new TopLineOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
                        ColorTransform.alpha(32)));
        this.addOverlayPainter(this.menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
        this.addOverlayPainter(this.toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add overlay painter to paint drop shadows along the bottom
        // edges of toolbars
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
                RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add overlay painter to paint a dark line along the bottom
        // edge of toolbars
        this.toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.ULTRADARK);
        this.addOverlayPainter(this.toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new FractionBasedFillPainter("Gemini", new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {ColorSchemeSingleColorQuery.EXTRALIGHT,
                        ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.MID});

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();

        FractionBasedBorderPainter outerBorderPainter = new FractionBasedBorderPainter(
                "Gemini Outer", new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorSchemeSingleColorQuery.ULTRADARK});
        RadianceBorderPainter innerBorderPainter = new DelegateFractionBasedBorderPainter(
                "Gemini Inner", outerBorderPainter,
                new int[] {0x60FFFFFF, 0x40FFFFFF, 0x20FFFFFF},
                scheme -> scheme.tint(0.7f));

        this.borderPainter = new CompositeBorderPainter("Gemini", outerBorderPainter,
                innerBorderPainter);
        this.highlightBorderPainter = new ClassicBorderPainter();
    }

    /**
     * Applies the specified highlight schemes on the relevant parts of the
     * specified scheme bundle.
     *
     * @param schemeBundle    Scheme bundle.
     * @param highlightScheme Highlight scheme.
     */
    private static void applyHighlightColorScheme(RadianceColorSchemeBundle schemeBundle,
            RadianceColorScheme highlightScheme) {
        // specify custom alpha values for the highlights
        schemeBundle.registerHighlightAlpha(0.85f, ComponentState.ROLLOVER_UNSELECTED);
        schemeBundle.registerHighlightAlpha(0.9f, ComponentState.SELECTED);
        schemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        schemeBundle.registerHighlightColorScheme(highlightScheme, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
    }

    private static void applyHighlightAsFill(RadianceColorSchemeBundle schemeBundle,
            RadianceColorScheme highlightScheme, RadianceColorScheme highlightBorderScheme) {
        // use for borders on rollover controls
        schemeBundle.registerColorScheme(highlightBorderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                ComponentState.ROLLOVER_ARMED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ROLLOVER_UNSELECTED);

        // use for fill of selected controls
        schemeBundle.registerColorScheme(highlightScheme, RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        // use for borders of highlights
        schemeBundle.registerColorScheme(highlightScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState.getActiveStates());

        // use for text highlight
        schemeBundle.registerColorScheme(highlightScheme, RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        // use for armed controls
        schemeBundle.registerColorScheme(highlightScheme, ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
