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
import org.pushingpixels.substance.api.colorscheme.DarkMetallicColorScheme;
import org.pushingpixels.substance.api.colorscheme.EbonyColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.GlassBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.GlassFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Raven</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 3.1
 */
public class RavenSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Raven";

	/**
	 * Creates a new <code>Raven</code> skin.
	 */
	public RavenSkin() {
		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/graphite.colorschemes");

		SubstanceColorScheme activeScheme = new EbonyColorScheme();
		SubstanceColorScheme enabledScheme = new DarkMetallicColorScheme();
		SubstanceColorScheme disabledScheme = schemes.get("Raven Disabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);

		// highlight fill scheme + custom alpha for rollover unselected state
		SubstanceColorScheme highlightScheme = schemes
				.get("Graphite Highlight");
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 0.6f,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 0.8f,
				ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 1.0f,
				ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme,
				0.75f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// highlight border scheme
		defaultSchemeBundle.registerColorScheme(new EbonyColorScheme(),
				ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState
						.getActiveStates());

		// text highlight scheme
		SubstanceColorScheme textHighlightScheme = schemes
				.get("Graphite Text Highlight");
		defaultSchemeBundle.registerColorScheme(textHighlightScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		SubstanceColorScheme highlightMarkScheme = schemes
				.get("Raven Highlight Mark");
		defaultSchemeBundle.registerColorScheme(highlightMarkScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_MARK, ComponentState
						.getActiveStates());

		defaultSchemeBundle.registerColorScheme(disabledScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(highlightScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);

		SubstanceColorScheme tabHighlightScheme = schemes
				.get("Graphite Tab Highlight");
		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(tabHighlightScheme,
				ColorSchemeAssociationKind.TAB, ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.ROLLOVER_UNSELECTED);

		SubstanceColorScheme selectedMarkScheme = schemes
				.get("Raven Selected Mark");
		defaultSchemeBundle.registerColorScheme(selectedMarkScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(selectedMarkScheme,
				ColorSchemeAssociationKind.MARK,
				ComponentState.ROLLOVER_UNSELECTED);

		defaultSchemeBundle.registerColorScheme(activeScheme,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.DISABLED_SELECTED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				schemes.get("Graphite Background").shade(0.4), DecorationAreaType.NONE);

		this.registerAsDecorationArea(enabledScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER, DecorationAreaType.FOOTER,
				DecorationAreaType.GENERAL, DecorationAreaType.TOOLBAR);

		this.watermarkScheme = activeScheme.shade(0.4);

		this.setTabFadeStart(0.18);
		this.setTabFadeEnd(0.18);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new GlassFillPainter();
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightPainter = new ClassicHighlightPainter();
		this.borderPainter = new GlassBorderPainter();
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
