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
package org.pushingpixels.radiance.laf.api.skin;

import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.laf.api.RadianceSkin;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.laf.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.laf.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.laf.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.radiance.laf.api.shaper.PillButtonShaper;

/**
 * Base class for accented <code>Mist</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class MistAccentedSkin extends RadianceSkin.Accented {
    /**
     * Creates a new base accented <code>Mist</code> skin.
     */
    protected MistAccentedSkin(AccentBuilder accentBuilder) {
        super(accentBuilder);

        ColorSchemes colorSchemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/laf/api/skin/mist.colorschemes"));

        RadianceColorScheme enabledScheme = colorSchemes.get("Mist Enabled");
        RadianceColorScheme disabledScheme = colorSchemes.get("Mist Disabled");

        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                this.getActiveControlsAccent(), enabledScheme, disabledScheme);
        defaultSchemeBundle.registerColorScheme(this.getHighlightsAccent(),
                RadianceLafSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
        defaultSchemeBundle.registerColorScheme(this.getHighlightsAccent(),
                ComponentState.SELECTED);
        defaultSchemeBundle.registerColorScheme(enabledScheme,
                RadianceLafSlices.ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);

        defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
                RadianceLafSlices.ColorSchemeAssociationKind.TAB,
                ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                RadianceLafSlices.DecorationAreaType.NONE);

        RadianceColorScheme controlPaneBackgroundScheme =
                colorSchemes.get("Mist Control Pane Background");
        this.registerDecorationAreaSchemeBundle(
                new RadianceColorSchemeBundle(this.getActiveControlsAccent(), enabledScheme, disabledScheme),
                controlPaneBackgroundScheme,
                RadianceLafSlices.DecorationAreaType.CONTROL_PANE);

        this.registerAsDecorationArea(enabledScheme,
                RadianceLafSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                RadianceLafSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
                RadianceLafSlices.DecorationAreaType.HEADER, RadianceLafSlices.DecorationAreaType.FOOTER,
                RadianceLafSlices.DecorationAreaType.TOOLBAR);

        this.buttonShaper = new PillButtonShaper();
        this.fillPainter = new MatteFillPainter();
        this.borderPainter = new ClassicBorderPainter();

        this.decorationPainter = new MatteDecorationPainter();
        this.highlightPainter = new ClassicHighlightPainter();
    }
}
