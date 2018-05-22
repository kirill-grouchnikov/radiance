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
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.MatteFillPainter;

/**
 * <code>Dust Coffee</code> skin. This class is part of officially supported
 * API.
 * 
 * @author Kirill Grouchnikov
 * @since version 5.2
 */
public class DustCoffeeSkin extends DustSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Dust Coffee";

	/**
	 * Creates a new <code>Dust Coffee</code> skin.
	 */
	public DustCoffeeSkin() {
		SubstanceSkin.ColorSchemes kitchenSinkSchemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/kitchen-sink.colorschemes");
		SubstanceColorScheme activeScheme = kitchenSinkSchemes
				.get("Coffee Active");

		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/dust.colorschemes");
		SubstanceColorScheme enabledScheme = schemes.get("Dust Coffee Enabled");

		SubstanceColorScheme watermarkScheme = schemes
				.get("Dust Coffee Watermark");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, enabledScheme);
		defaultSchemeBundle.registerColorScheme(enabledScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);

		// borders and marks
		SubstanceColorScheme borderEnabledScheme = schemes
				.get("Dust Border Enabled");
		defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED,
				ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState
						.getActiveStates());
		defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
				ColorSchemeAssociationKind.MARK);

		// text highlight
		SubstanceColorScheme textHighlightScheme = schemes
				.get("Dust Coffee Text Highlight");
		defaultSchemeBundle.registerColorScheme(textHighlightScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		// custom highlight alphas
		defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.6f,
				ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED);
		defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f,
				ComponentState.SELECTED);
		defaultSchemeBundle
				.registerHighlightColorScheme(activeScheme, 1.0f,
						ComponentState.ROLLOVER_SELECTED,
						ComponentState.ROLLOVER_ARMED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				watermarkScheme, DecorationAreaType.NONE);

		this.fillPainter = new MatteFillPainter();
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
