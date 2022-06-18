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
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Night Shade</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class NightShadeSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Night Shade";

    /**
     * Creates a new <code>Night Shade</code> skin.
     */
    public NightShadeSkin() {
        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/nightshade.colorschemes"));
        RadianceColorScheme activeScheme = schemes.get("Night Shade Active");
        RadianceColorScheme enabledScheme = schemes.get("Night Shade Enabled");
        RadianceColorScheme disabledScheme = schemes.get("Night Shade Disabled");
        RadianceColorScheme disabledSelectedScheme = schemes.get("Night Shade Disabled Selected");

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);

        // borders
        RadianceColorScheme borderScheme = schemes.get("Night Shade Border");
        defaultSchemeBundle.registerColorScheme(borderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);

        // marks
        RadianceColorScheme markActiveScheme = schemes.get("Night Shade Mark Active");
        defaultSchemeBundle.registerColorScheme(markActiveScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(markActiveScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK, ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);

        // separators
        RadianceColorScheme separatorScheme = schemes.get("Night Shade Separator");
        defaultSchemeBundle.registerColorScheme(separatorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

        // tab borders
        defaultSchemeBundle.registerColorScheme(schemes.get("Night Shade Tab Border"),
                RadianceThemingSlices.ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());

        RadianceColorScheme backgroundScheme = schemes.get("Night Shade Background");

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme, RadianceThemingSlices.DecorationAreaType.NONE);

        RadianceColorSchemeBundle decorationsSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        decorationsSchemeBundle.registerAlpha(0.4f, ComponentState.DISABLED_UNSELECTED);
        decorationsSchemeBundle.registerColorScheme(enabledScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        decorationsSchemeBundle.registerColorScheme(borderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);

        // marks
        decorationsSchemeBundle.registerColorScheme(markActiveScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());

        // separators
        RadianceColorScheme separatorDecorationsScheme =
                schemes.get("Night Shade Decorations Separator");
        decorationsSchemeBundle.registerColorScheme(separatorDecorationsScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

        RadianceColorScheme decorationsBackgroundScheme =
                schemes.get("Night Shade Decorations Background");
        this.registerDecorationAreaSchemeBundle(decorationsSchemeBundle, decorationsBackgroundScheme,
                RadianceThemingSlices.DecorationAreaType.TOOLBAR, RadianceThemingSlices.DecorationAreaType.FOOTER);

        RadianceColorScheme controlPaneBackgroundScheme =
                schemes.get("Night Shade Control Pane Background");
        this.registerDecorationAreaSchemeBundle(decorationsSchemeBundle, controlPaneBackgroundScheme,
                RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(activeScheme,
                enabledScheme, disabledScheme);
        headerSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        headerSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);

        // borders
        RadianceColorScheme headerBorderScheme = schemes.get("Night Shade Header Border");
        headerSchemeBundle.registerColorScheme(headerBorderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        // marks
        headerSchemeBundle.registerColorScheme(markActiveScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.getActiveStates());
        headerSchemeBundle.registerColorScheme(markActiveScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK, ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(separatorDecorationsScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

        headerSchemeBundle.registerHighlightAlpha(0.7f, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ROLLOVER_ARMED, ComponentState.ARMED);
        headerSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
        headerSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerHighlightColorScheme(activeScheme,
                ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_ARMED,
                ComponentState.ARMED, ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        RadianceColorScheme headerBackgroundScheme = schemes.get("Night Shade Header Background");

        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerBackgroundScheme,
                RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceThemingSlices.DecorationAreaType.HEADER);

        // Add overlay painters to paint drop shadows along the bottom
        // edges of toolbars and footers
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
                RadianceThemingSlices.DecorationAreaType.TOOLBAR, RadianceThemingSlices.DecorationAreaType.FOOTER);

        // add an overlay painter to paint a dark line along the bottom
        // edge of toolbars
        RadianceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorTransform.brightness(-0.5f)));
        this.addOverlayPainter(toolbarBottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        RadianceOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorTransform.brightness(-0.5f)),
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
                        ColorTransform.alpha(32)));
        this.addOverlayPainter(footerTopBezelOverlayPainter, RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new FractionBasedFillPainter("Night Shade",
                new float[]{0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[]{ColorSchemeSingleColorQuery.ULTRALIGHT,
                        ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.LIGHT});
        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();
        this.borderPainter = new CompositeBorderPainter("Night Shade", new ClassicBorderPainter(),
                new DelegateBorderPainter("Night Shade Inner", new ClassicBorderPainter(), 0x40FFFFFF,
                        0x20FFFFFF, 0x00FFFFFF,
                        scheme -> scheme.tint(0.2f)));
    }

    public String getDisplayName() {
        return NAME;
    }
}
