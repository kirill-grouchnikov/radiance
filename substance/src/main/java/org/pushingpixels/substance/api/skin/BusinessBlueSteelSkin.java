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
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Business Blue Steel</code> skin. This class is part of officially
 * supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 3.3
 */
public class BusinessBlueSteelSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Business Blue Steel";

	/**
	 * Creates a new <code>Business</code> skin.
	 */
	public BusinessBlueSteelSkin() {
		SubstanceSkin.ColorSchemes businessSchemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/business.colorschemes");

		SubstanceColorScheme activeScheme = businessSchemes.get("Business Blue Steel Active");
		SubstanceColorScheme enabledScheme = businessSchemes.get("Business Blue Steel Enabled");
		SubstanceColorScheme disabledScheme = businessSchemes.get("Business Blue Steel Disabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);

		SubstanceColorScheme highlightColorScheme = businessSchemes
				.get("Business Blue Steel Highlight");
		defaultSchemeBundle.registerColorScheme(activeScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightColorScheme);
		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

		SubstanceColorScheme activeHeaderScheme = businessSchemes
				.get("Business Blue Steel Active Header");
		SubstanceColorScheme enabledHeaderScheme = businessSchemes
				.get("Business Blue Steel Enabled Header");
		SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
				activeHeaderScheme, enabledHeaderScheme, enabledHeaderScheme);
		headerSchemeBundle.registerColorScheme(enabledHeaderScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
				DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR);

		SubstanceColorScheme activeGeneralScheme = businessSchemes
				.get("Business Blue Steel Active General");
		SubstanceColorScheme enabledGeneralScheme = businessSchemes
				.get("Business Blue Steel Enabled General");
		SubstanceColorSchemeBundle generalSchemeBundle = new SubstanceColorSchemeBundle(
				activeGeneralScheme, enabledGeneralScheme, disabledScheme);
		generalSchemeBundle.registerColorScheme(enabledGeneralScheme, 0.7f,
				ComponentState.DISABLED_UNSELECTED);
		this.registerDecorationAreaSchemeBundle(generalSchemeBundle, DecorationAreaType.FOOTER,
				DecorationAreaType.GENERAL);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new ClassicFillPainter();
		this.borderPainter = new ClassicBorderPainter();

		BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.3f);
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
