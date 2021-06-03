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
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

import javax.swing.*;

/**
 * Base class for accented <code>Graphite</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class GraphiteAccentedSkin extends SubstanceSkin.Accented {
    protected SubstanceColorSchemeBundle defaultSchemeBundle;

    protected GraphiteAccentedSkin(AccentBuilder accentBuilder) {
        super(accentBuilder);

        ColorSchemes schemes = SubstanceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/substance/api/skin/graphite.colorschemes"));

        SubstanceColorScheme activeScheme = schemes.get("Graphite Active");
        SubstanceColorScheme selectedDisabledScheme = schemes.get("Graphite Selected Disabled");
        SubstanceColorScheme selectedScheme = schemes.get("Graphite Selected");
        SubstanceColorScheme disabledScheme = schemes.get("Graphite Disabled");

        SubstanceColorScheme enabledScheme = schemes.get("Graphite Enabled");
        SubstanceColorScheme backgroundScheme = schemes.get("Graphite Background");

        defaultSchemeBundle = new SubstanceColorSchemeBundle(activeScheme, enabledScheme,
                disabledScheme);

        // border scheme
        SubstanceColorScheme borderScheme = schemes.get("Graphite Border");
        SubstanceColorScheme separatorScheme = schemes.get("Graphite Separator");
        defaultSchemeBundle.registerColorScheme(borderScheme, ColorSchemeAssociationKind.BORDER);
        defaultSchemeBundle.registerColorScheme(separatorScheme, ColorSchemeAssociationKind.SEPARATOR);

        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerAlpha(0.65f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(selectedDisabledScheme, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme, ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);

        defaultSchemeBundle.registerColorScheme(selectedScheme, ComponentState.SELECTED);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme,
                DecorationAreaType.NONE);

        this.setTabFadeStart(0.18);
        this.setTabFadeEnd(0.18);

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
        this.highlightPainter = new ClassicHighlightPainter();

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
                ColorSchemeAssociationKind.FILL,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent().shade(0.2).saturate(0.2),
                ColorSchemeAssociationKind.FILL,
                ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED);
        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                ColorSchemeAssociationKind.TAB,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        defaultSchemeBundle.registerColorScheme(borderScheme,
                ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState.getActiveStates());
        defaultSchemeBundle.registerColorScheme(borderScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());

        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                ColorSchemeAssociationKind.MARK,
                ComponentState.SELECTED, ComponentState.PRESSED_SELECTED,
                ComponentState.PRESSED_UNSELECTED, ComponentState.ROLLOVER_UNSELECTED,
                ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                ColorSchemeAssociationKind.MARK,
                ComponentState.DISABLED_SELECTED);

        // text highlight scheme
        defaultSchemeBundle.registerColorScheme(this.getHighlightsAccent(),
                ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                ComponentState.ROLLOVER_UNSELECTED);

        // option pane icons
        SubstanceColorScheme optionPaneRed = schemes.get("Graphite Option Red");
        SubstanceColorScheme optionPaneBlue = schemes.get("Graphite Option Blue");
        this.setOptionPaneIconColorScheme(optionPaneRed,
                JOptionPane.ERROR_MESSAGE, JOptionPane.WARNING_MESSAGE);
        this.setOptionPaneIconColorScheme(optionPaneBlue,
                JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE);
    }
}
