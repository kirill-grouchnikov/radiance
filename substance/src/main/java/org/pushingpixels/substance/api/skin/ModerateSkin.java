/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
import org.pushingpixels.substance.api.colorscheme.MetallicColorScheme;
import org.pushingpixels.substance.api.colorscheme.SteelBlueColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.GlassFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Moderate</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 3.1
 */
public class ModerateSkin extends SubstanceSkin {
    /**
     * Display name for <code>this</code> skin.
     */
    public static final String NAME = "Moderate";

    /**
     * Creates a new <code>Moderate</code> skin.
     */
    public ModerateSkin() {
        SubstanceColorScheme activeScheme = new SteelBlueColorScheme();
        SubstanceColorScheme enabledScheme = new MetallicColorScheme();

        SubstanceSkin.ColorSchemes kitchenSinkSchemes = SubstanceSkin
                .getColorSchemes("org/pushingpixels/substance/api/skin/kitchen-sink.colorschemes");
        SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme, enabledScheme, kitchenSinkSchemes.get("Gray Disabled"));
        SubstanceColorScheme highlightColorScheme = kitchenSinkSchemes.get("Moderate Highlight");
        defaultSchemeBundle.registerHighlightColorScheme(highlightColorScheme);

        this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

        SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
                activeScheme.saturate(0.2), activeScheme, kitchenSinkSchemes.get("Gray Disabled"));
        this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
                DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
                DecorationAreaType.HEADER);

        this.registerAsDecorationArea(kitchenSinkSchemes.get("LightGray General Watermark"),
                DecorationAreaType.GENERAL);

        // add an overlay painter to paint a drop shadow along the top
        // edge of toolbars
        this.addOverlayPainter(TopShadowOverlayPainter.getInstance(), DecorationAreaType.TOOLBAR);

        // add an overlay painter to paint separator lines along the bottom
        // edges of title panes and menu bars
        BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
                ColorSchemeSingleColorQuery.MID);
        this.addOverlayPainter(bottomLineOverlayPainter, DecorationAreaType.HEADER);

        this.buttonShaper = new ClassicButtonShaper();
        this.fillPainter = new GlassFillPainter();
        this.decorationPainter = new MatteDecorationPainter();
        this.borderPainter = new ClassicBorderPainter();
        this.highlightPainter = new ClassicHighlightPainter();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.substance.skin.SubstanceSkin#getDisplayName()
     */
    public String getDisplayName() {
        return NAME;
    }
}
