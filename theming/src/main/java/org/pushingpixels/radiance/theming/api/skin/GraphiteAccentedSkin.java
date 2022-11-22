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
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

import javax.swing.*;

/**
 * Base class for accented <code>Graphite</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class GraphiteAccentedSkin extends RadianceSkin.Accented {
    protected RadianceColorSchemeBundle defaultSchemeBundle;

    protected GraphiteAccentedSkin(AccentBuilder accentBuilder) {
        super(accentBuilder);

        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/graphite.colorschemes"));

        RadianceColorScheme activeScheme = schemes.get("Graphite Active");
        RadianceColorScheme selectedDisabledScheme = schemes.get("Graphite Selected Disabled");
        RadianceColorScheme selectedScheme = schemes.get("Graphite Selected");
        RadianceColorScheme disabledScheme = schemes.get("Graphite Disabled");

        RadianceColorScheme enabledScheme = schemes.get("Graphite Enabled");
        RadianceColorScheme backgroundScheme = schemes.get("Graphite Background");

        defaultSchemeBundle = new RadianceColorSchemeBundle(activeScheme, enabledScheme,
                disabledScheme);

        // border scheme
        RadianceColorScheme borderScheme = schemes.get("Graphite Border");
        RadianceColorScheme separatorScheme = schemes.get("Graphite Separator");
        defaultSchemeBundle.registerColorScheme(borderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
        defaultSchemeBundle.registerColorScheme(separatorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerAlpha(0.65f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(selectedDisabledScheme, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);

        defaultSchemeBundle.registerColorScheme(selectedScheme, ComponentState.SELECTED);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme,
                RadianceThemingSlices.DecorationAreaType.NONE);

        this.buttonShaper = new ClassicButtonShaper();
        this.borderPainter = new CompositeBorderPainter("Graphite",
                new DelegateBorderPainter("Graphite Outer", new ClassicBorderPainter(), 0xFFFFFFFF,
                        0xFFFFFFFF, 0xFFFFFFFF,
                        scheme -> scheme.shade(0.4f)),
                new DelegateBorderPainter("Graphite Inner", new ClassicBorderPainter(), 0xA0FFFFFF,
                        0x90FFFFFF, 0xA0FFFFFF,
                        scheme -> scheme.tint(0.25f)));
        this.highlightBorderPainter = new ClassicBorderPainter();

        this.fillPainter = new FractionBasedFillPainter("Graphite", new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {ColorSchemeSingleColorQuery.ULTRALIGHT,
                        ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.LIGHT});
        this.decorationPainter = new FlatDecorationPainter();
        this.highlightFillPainter = new ClassicFillPainter();

        // highlight fill scheme + custom alpha for rollover unselected state
        defaultSchemeBundle.registerHighlightAlpha(0.9f, ComponentState.SELECTED);
        defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
        defaultSchemeBundle.registerHighlightColorScheme(this.getHighlightsAccent(),
                ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(), ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent().shade(0.2).saturate(0.2),
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                RadianceThemingSlices.ColorSchemeAssociationKind.TAB,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        defaultSchemeBundle.registerColorScheme(borderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(borderScheme,
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());

        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED, ComponentState.PRESSED_SELECTED,
                ComponentState.PRESSED_UNSELECTED, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_SELECTED);

        // text highlight scheme
        defaultSchemeBundle.registerColorScheme(this.getHighlightsAccent(),
                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                ComponentState.ROLLOVER_UNSELECTED);

        // option pane icons
        RadianceColorScheme optionPaneRed = schemes.get("Graphite Option Red");
        RadianceColorScheme optionPaneBlue = schemes.get("Graphite Option Blue");
        this.setOptionPaneIconColorScheme(optionPaneRed,
                JOptionPane.ERROR_MESSAGE, JOptionPane.WARNING_MESSAGE);
        this.setOptionPaneIconColorScheme(optionPaneBlue,
                JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE);
    }
}
