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
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.ColorTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.SubstanceOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Night Shade</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class NightShadeSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Night Shade";

    /**
     * Creates a new <code>Night Shade</code> skin.
     */
    public NightShadeSkin() {
        ColorSchemes schemes = SubstanceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/substance/api/skin/nightshade.colorschemes"));
        SubstanceColorScheme activeScheme = schemes.get("Night Shade Active");
        SubstanceColorScheme enabledScheme = schemes.get("Night Shade Enabled");
        SubstanceColorScheme disabledScheme = schemes.get("Night Shade Disabled");
        SubstanceColorScheme disabledSelectedScheme = schemes.get("Night Shade Disabled Selected");

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);

        // borders
        SubstanceColorScheme borderScheme = schemes.get("Night Shade Border");
        defaultSchemeBundle.registerColorScheme(borderScheme, ColorSchemeAssociationKind.BORDER);

        // marks
        SubstanceColorScheme markActiveScheme = schemes.get("Night Shade Mark Active");
        defaultSchemeBundle.registerColorScheme(markActiveScheme, ColorSchemeAssociationKind.MARK,
                ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(markActiveScheme,
                ColorSchemeAssociationKind.MARK, ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);

        // separators
        SubstanceColorScheme separatorScheme = schemes.get("Night Shade Separator");
        defaultSchemeBundle.registerColorScheme(separatorScheme, ColorSchemeAssociationKind.SEPARATOR);

        // tab borders
        defaultSchemeBundle.registerColorScheme(schemes.get("Night Shade Tab Border"),
                ColorSchemeAssociationKind.TAB_BORDER, ComponentState.getActiveStates());

        SubstanceColorScheme backgroundScheme = schemes.get("Night Shade Background");

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme, DecorationAreaType.NONE);

        SubstanceColorSchemeBundle decorationsSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        decorationsSchemeBundle.registerAlpha(0.4f, ComponentState.DISABLED_UNSELECTED);
        decorationsSchemeBundle.registerColorScheme(enabledScheme, ComponentState.DISABLED_UNSELECTED);

        // borders
        decorationsSchemeBundle.registerColorScheme(borderScheme, ColorSchemeAssociationKind.BORDER);

        // marks
        decorationsSchemeBundle.registerColorScheme(markActiveScheme,
                ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());

        // separators
        SubstanceColorScheme separatorDecorationsScheme =
                schemes.get("Night Shade Decorations Separator");
        decorationsSchemeBundle.registerColorScheme(separatorDecorationsScheme,
                ColorSchemeAssociationKind.SEPARATOR);

        SubstanceColorScheme decorationsBackgroundScheme =
                schemes.get("Night Shade Decorations Background");
        this.registerDecorationAreaSchemeBundle(decorationsSchemeBundle, decorationsBackgroundScheme,
                DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        SubstanceColorScheme controlPaneBackgroundScheme =
                schemes.get("Night Shade Control Pane Background");
        this.registerDecorationAreaSchemeBundle(decorationsSchemeBundle, controlPaneBackgroundScheme,
                DecorationAreaType.CONTROL_PANE);

        SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(activeScheme,
                enabledScheme, disabledScheme);
        headerSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        headerSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(disabledSelectedScheme, ComponentState.DISABLED_SELECTED);

        // borders
        SubstanceColorScheme headerBorderScheme = schemes.get("Night Shade Header Border");
        headerSchemeBundle.registerColorScheme(headerBorderScheme, ColorSchemeAssociationKind.BORDER);
        // marks
        headerSchemeBundle.registerColorScheme(markActiveScheme, ColorSchemeAssociationKind.MARK,
                ComponentState.getActiveStates());
        headerSchemeBundle.registerColorScheme(markActiveScheme,
                ColorSchemeAssociationKind.MARK, ComponentState.DISABLED_SELECTED,
                ComponentState.DISABLED_UNSELECTED);
        headerSchemeBundle.registerColorScheme(separatorDecorationsScheme,
                ColorSchemeAssociationKind.SEPARATOR);

        headerSchemeBundle.registerHighlightAlpha(0.7f, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ROLLOVER_ARMED, ComponentState.ARMED);
        headerSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
        headerSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
        headerSchemeBundle.registerHighlightColorScheme(activeScheme,
                ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_ARMED,
                ComponentState.ARMED, ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        SubstanceColorScheme headerBackgroundScheme = schemes.get("Night Shade Header Background");

        this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerBackgroundScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER);

        setTabFadeStart(0.2);
        setTabFadeEnd(0.9);

        // Add overlay painters to paint drop shadows along the bottom
        // edges of toolbars and footers
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
                DecorationAreaType.TOOLBAR, DecorationAreaType.FOOTER);

        // add an overlay painter to paint a dark line along the bottom
        // edge of toolbars
        SubstanceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorTransform.brightness(-0.5f)));
        this.addOverlayPainter(toolbarBottomLineOverlayPainter, DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint a bezel line along the top
        // edge of footer
        SubstanceOverlayPainter footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
                        ColorTransform.brightness(-0.5f)),
                ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
                        ColorTransform.alpha(32)));
        this.addOverlayPainter(footerTopBezelOverlayPainter, DecorationAreaType.FOOTER);

        this.setTabFadeStart(0.18);
        this.setTabFadeEnd(0.18);

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
