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
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.MatteFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.shaper.PillButtonShaper;

/**
 * Base class for accented <code>Mist</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class MistAccentedSkin extends SubstanceSkin.Accented {
    /**
     * Creates a new base accented <code>Mist</code> skin.
     */
    protected MistAccentedSkin(AccentBuilder accentBuilder) {
        super(accentBuilder);

        ColorSchemes colorSchemes = SubstanceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/substance/api/skin/mist.colorschemes"));

        SubstanceColorScheme enabledScheme = colorSchemes.get("Mist Enabled");
        SubstanceColorScheme disabledScheme = colorSchemes.get("Mist Disabled");

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                this.getActiveControlsAccent(), enabledScheme, disabledScheme);
        defaultSchemeBundle.registerColorScheme(this.getHighlightsAccent(),
                ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerColorScheme(this.getHighlightsAccent(),
                ComponentState.SELECTED);
        defaultSchemeBundle.registerColorScheme(enabledScheme,
                ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);

        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                ColorSchemeAssociationKind.TAB,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE);

        SubstanceColorScheme controlPaneBackgroundScheme =
                colorSchemes.get("Mist Control Pane Background");
        this.registerDecorationAreaSchemeBundle(
                new SubstanceColorSchemeBundle(this.getActiveControlsAccent(), enabledScheme, disabledScheme),
                controlPaneBackgroundScheme,
                DecorationAreaType.CONTROL_PANE);

        this.registerAsDecorationArea(enabledScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER, DecorationAreaType.FOOTER,
                DecorationAreaType.TOOLBAR);

        this.buttonShaper = new PillButtonShaper();
        this.fillPainter = new MatteFillPainter();
        this.borderPainter = new ClassicBorderPainter();

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();
    }
}
