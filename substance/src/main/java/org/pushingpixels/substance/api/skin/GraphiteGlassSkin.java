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

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.GlassFillPainter;
import org.pushingpixels.substance.api.painter.highlight.GlassHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * <code>Graphite Glass</code> skin. This class is part of officially supported
 * API.
 * 
 * @author Kirill Grouchnikov
 * @since version 3.3
 */
public class GraphiteGlassSkin extends GraphiteBaseSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Graphite Glass";

	/**
	 * Creates a new <code>Graphite</code> skin.
	 */
	public GraphiteGlassSkin() {
		super();

		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/graphite.colorschemes");

		SubstanceColorScheme backgroundScheme = schemes.get("Graphite Background");
		this.registerAsDecorationArea(backgroundScheme, DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE, DecorationAreaType.HEADER);

		// add two overlay painters to create a bezel line between
		// menu bar and toolbars
		BottomLineOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.MID);
		TopLineOverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
				(SubstanceColorScheme scheme) -> SubstanceColorUtilities.getAlphaColor(
						scheme.getForegroundColor(), 32));
		this.addOverlayPainter(menuOverlayPainter, DecorationAreaType.HEADER);
		this.addOverlayPainter(toolbarOverlayPainter, DecorationAreaType.TOOLBAR);

		this.fillPainter = new GlassFillPainter();
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightPainter = new GlassHighlightPainter();
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
