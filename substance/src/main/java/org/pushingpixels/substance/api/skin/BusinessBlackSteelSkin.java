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

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.decoration.BrushedMetalDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Business Black Steel</code> skin. This class is part of officially
 * supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 3.3
 */
public class BusinessBlackSteelSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Business Black Steel";

	/**
	 * Creates a new <code>Business</code> skin.
	 */
	public BusinessBlackSteelSkin() {
		SubstanceSkin.ColorSchemes businessSchemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/business.colorschemes");

		SubstanceColorScheme activeScheme = businessSchemes.get("Business Black Steel Active");
		SubstanceColorScheme enabledScheme = businessSchemes.get("Business Black Steel Enabled");
		SubstanceColorScheme disabledScheme = businessSchemes.get("Business Black Steel Disabled");

		// the default color scheme bundle
		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);
		defaultSchemeBundle.registerColorScheme(activeScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.6f,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f,
				ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.95f,
				ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);
		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

		// color scheme bundle for title panes
		SubstanceColorScheme activeHeaderScheme = businessSchemes
				.get("Business Black Steel Active Header");
		SubstanceColorScheme enabledHeaderScheme = businessSchemes
				.get("Business Black Steel Enabled Header");
		SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
				activeHeaderScheme, enabledHeaderScheme, disabledScheme);
		headerSchemeBundle.registerColorScheme(enabledHeaderScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, 0.6f,
				ComponentState.ROLLOVER_UNSELECTED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f,
				ComponentState.SELECTED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, 0.95f,
				ComponentState.ROLLOVER_SELECTED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, activeHeaderScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		// color scheme bundle for general areas
		SubstanceColorScheme activeGeneralScheme = businessSchemes
				.get("Business Black Steel Active General");
		SubstanceColorScheme enabledGeneralScheme = businessSchemes
				.get("Business Black Steel Enabled General");
		SubstanceColorSchemeBundle generalSchemeBundle = new SubstanceColorSchemeBundle(
				activeGeneralScheme, enabledGeneralScheme, disabledScheme);
		generalSchemeBundle.registerColorScheme(disabledScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		this.registerDecorationAreaSchemeBundle(generalSchemeBundle, DecorationAreaType.FOOTER,
				DecorationAreaType.GENERAL);

		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(), DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new ClassicFillPainter();
		this.borderPainter = new ClassicBorderPainter();

		BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.02f);
		this.decorationPainter = decorationPainter;

		this.highlightPainter = new ClassicHighlightPainter();

		this.borderPainter = new ClassicBorderPainter();
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
