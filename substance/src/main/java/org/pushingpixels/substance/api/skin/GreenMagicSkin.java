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

import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.ColorTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Green Magic</code> skin. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 */
public class GreenMagicSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Green Magic";

    /**
     * Creates a new <code>Green Magic</code> skin.
     */
    public GreenMagicSkin() {
        ColorSchemes schemes = SubstanceSkin.getColorSchemes(
                this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/substance/api/skin/greenmagic.colorschemes"));
        SubstanceColorScheme activeScheme = schemes.get("Green Magic Active");
        SubstanceColorScheme enabledScheme = schemes.get("Green Magic Enabled");
        SubstanceColorScheme disabledScheme = schemes.get("Green Magic Disabled");

        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, disabledScheme);
        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
                DecorationAreaType.NONE);

        // mark title panes and headers as decoration areas
        this.registerAsDecorationArea(enabledScheme,
                DecorationAreaType.PRIMARY_TITLE_PANE,
                DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER);

        SubstanceColorScheme footerFillScheme = schemes.get("Green Magic Footer Fill");
        this.registerAsDecorationArea(footerFillScheme, DecorationAreaType.FOOTER);

        // Add overlay painters to paint drop shadow and a dark line along the bottom
        // edges of headers
        this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100), DecorationAreaType.HEADER);
        this.addOverlayPainter(new BottomLineOverlayPainter(
                        ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.DARK,
                                ColorTransform.alpha(128))),
                DecorationAreaType.HEADER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new FractionBasedFillPainter("Green Magic", new float[] {0.0f, 0.5f, 1.0f},
                new ColorSchemeSingleColorQuery[] {ColorSchemeSingleColorQuery.ULTRALIGHT,
                        ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.LIGHT});
        this.decorationPainter = new ArcDecorationPainter();
        this.borderPainter = new ClassicBorderPainter();
        this.highlightPainter = new ClassicHighlightPainter();
    }

    @Override
    public String getDisplayName() {
        return NAME;
    }
}
