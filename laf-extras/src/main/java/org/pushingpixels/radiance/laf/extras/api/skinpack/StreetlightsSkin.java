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
package org.pushingpixels.radiance.laf.extras.api.skinpack;

import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices.DecorationAreaType;
import org.pushingpixels.radiance.laf.api.RadianceSkin;
import org.pushingpixels.radiance.laf.api.colorscheme.CharcoalColorScheme;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.api.painter.border.GlassBorderPainter;
import org.pushingpixels.radiance.laf.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.laf.api.painter.fill.GlassFillPainter;
import org.pushingpixels.radiance.laf.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.radiance.laf.api.shaper.ClassicButtonShaper;

/**
 * <code>Streelights</code> skin. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 */
public class StreetlightsSkin extends RadianceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Streetlights";

    /**
     * Creates a new <code>Streetlights</code> skin.
     */
    public StreetlightsSkin() {
        ColorSchemes schemes = RadianceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/laf/extras/api/skinpack/streetlights.colorschemes"));
        RadianceColorScheme activeScheme = schemes.get("Streetlights Active");
        RadianceColorScheme enabledScheme = schemes.get("Streetlights Enabled");
        RadianceColorScheme disabledScheme = schemes.get("Streetlights Disabled");

        // default scheme bundle
        RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        // use charcoal for borders on active states
        defaultSchemeBundle.registerColorScheme(new CharcoalColorScheme(),
                ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
        // and 60% alpha on disabled controls
        defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
        defaultSchemeBundle.registerColorScheme(disabledScheme,
                ComponentState.DISABLED_UNSELECTED,
                ComponentState.DISABLED_SELECTED);
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE);

        // mark title panes and headers as decoration areas
        this.registerAsDecorationArea(enabledScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER);

        this.setTabFadeStart(1.0);
        this.setTabFadeEnd(1.0);

        // additional skin settings
        this.buttonShaper = new ClassicButtonShaper();
        this.borderPainter = new GlassBorderPainter();
        this.highlightPainter = new ClassicHighlightPainter();
        this.fillPainter = new GlassFillPainter();
        this.decorationPainter = new ArcDecorationPainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
