/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.api.skinpack;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.CharcoalColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunsetColorScheme;
import org.pushingpixels.substance.api.painter.border.GlassBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.GlassFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.extras.api.watermarkpack.SubstancePlanktonWatermark;
import org.pushingpixels.substance.internal.colorscheme.ShadeColorScheme;
import org.pushingpixels.substance.internal.colorscheme.ShiftColorScheme;

import java.awt.*;

/**
 * <code>Magma</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class MagmaSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Magma";

    /**
     * Creates a new <code>Magma</code> skin.
     */
    public MagmaSkin() {
        SubstanceColorScheme shiftRed = new ShiftColorScheme(
                new SunsetColorScheme(), Color.red, 0.3);
        SubstanceColorScheme defaultScheme = new CharcoalColorScheme();
        SubstanceColorScheme activeScheme = shiftRed.saturate(0.4).named(
                "Magma Active");

        SubstanceColorScheme disabledScheme = new ShadeColorScheme(
                new CharcoalColorScheme(), 0.5) {
            Color foreColor = new Color(104, 93, 90);

            @Override
            public Color getForegroundColor() {
                return this.foreColor;
            }
        }.named("Magma Disabled");

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, defaultScheme, disabledScheme);
        defaultSchemeBundle.registerColorScheme(new CharcoalColorScheme(),
                ColorSchemeAssociationKind.BORDER, ComponentState
                        .getActiveStates());
        defaultSchemeBundle.registerColorScheme(activeScheme,
                ColorSchemeAssociationKind.MARK, ComponentState
                        .getActiveStates());
        defaultSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme,
                ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);

        defaultSchemeBundle.registerHighlightAlpha(0.7f, ComponentState.ROLLOVER_UNSELECTED);
        defaultSchemeBundle.registerHighlightAlpha(0.7f, ComponentState.SELECTED);
        defaultSchemeBundle.registerHighlightAlpha(0.9f, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerHighlightAlpha(0.7f, ComponentState.ARMED,
                ComponentState.ROLLOVER_ARMED);
        defaultSchemeBundle.registerHighlightColorScheme(activeScheme,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerHighlightColorScheme(activeScheme.saturate(-0.2),
                ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE);

        this.registerAsDecorationArea(defaultScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER, DecorationAreaType.FOOTER,
                DecorationAreaType.GENERAL, DecorationAreaType.TOOLBAR);

        this.setTabFadeStart(1.0);
        this.setTabFadeEnd(1.0);

        this.watermarkScheme = defaultScheme.shade(0.5);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new GlassFillPainter();
        this.decorationPainter = new ArcDecorationPainter();
        this.watermark = new SubstancePlanktonWatermark();

        this.borderPainter = new GlassBorderPainter();
        this.highlightPainter = new ClassicHighlightPainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
