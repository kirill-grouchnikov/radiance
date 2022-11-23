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

import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineOverlayPainter;

/**
 * <code>Graphite Glass</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class GraphiteGlassSkin extends GraphiteSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Graphite Glass";

	/**
	 * Creates a new <code>Graphite</code> skin.
	 */
	public GraphiteGlassSkin() {
		super();

		ColorSchemes schemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/graphite.colorschemes"));

		RadianceColorScheme backgroundScheme = schemes.get("Graphite Background");
		this.registerAsDecorationArea(backgroundScheme, RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.HEADER);

		// add two overlay painters to create a bezel line between
		// menu bar and toolbars
		BottomLineOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.MID);
		TopLineOverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
				ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
						ColorTransform.alpha(32)));
		this.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
		this.addOverlayPainter(toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.fillPainter = new SpecularRectangularFillPainter(new GlassFillPainter(), 1.0f);
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightFillPainter = new GlassFillPainter();
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
