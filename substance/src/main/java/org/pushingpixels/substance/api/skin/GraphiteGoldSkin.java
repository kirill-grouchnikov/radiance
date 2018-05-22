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
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

/**
 * <code>Graphite Gold</code> skin. This class is part of officially supported
 * API.
 * 
 * @author Kirill Grouchnikov
 * @since version 7.0
 */
public class GraphiteGoldSkin extends GraphiteSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Graphite Gold";

	/**
	 * Creates a new <code>Graphite Gold</code> skin.
	 */
	public GraphiteGoldSkin() {
		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/graphite.colorschemes");

		// highlight fill scheme + custom alphas for states
		SubstanceColorScheme highlightScheme = schemes.get("Graphite Gold");
		SubstanceColorScheme schemeSelectedTab = schemes.get("Graphite Gold Light Text");
		
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme,
				0.8f, ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 0.9f,
				ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 1.0f,
				ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 1.0f,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		defaultSchemeBundle.registerColorScheme(highlightScheme, 0.5f, 
				ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.ROLLOVER_ARMED,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ColorSchemeAssociationKind.FILL, 
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(highlightScheme.shade(0.2).saturate(0.2),
				ColorSchemeAssociationKind.FILL, 
				ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ColorSchemeAssociationKind.TAB,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState
						.getActiveStates());
		
		defaultSchemeBundle.registerColorScheme(highlightScheme, 
				ColorSchemeAssociationKind.MARK, 
				ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(highlightScheme, 0.5f,
				ColorSchemeAssociationKind.MARK, 
				ComponentState.DISABLED_SELECTED);

		// text highlight scheme
		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ComponentState.ROLLOVER_UNSELECTED);

		// scheme for rolling over selected tabs
		defaultSchemeBundle.registerColorScheme(schemeSelectedTab, 
				ColorSchemeAssociationKind.TAB, 
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
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
