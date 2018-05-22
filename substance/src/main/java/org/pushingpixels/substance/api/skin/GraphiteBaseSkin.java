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
import org.pushingpixels.substance.api.colorscheme.EbonyColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * Base class for Graphite skins. This class is not part of officially supported
 * API.
 * 
 * @author Kirill Grouchnikov
 */
abstract class GraphiteBaseSkin extends SubstanceSkin {
	SubstanceColorSchemeBundle defaultSchemeBundle;

	public GraphiteBaseSkin() {
		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/graphite.colorschemes");

		SubstanceColorScheme activeScheme = schemes.get("Graphite Active");
		SubstanceColorScheme selectedDisabledScheme = schemes.get("Graphite Selected Disabled");
		SubstanceColorScheme selectedScheme = schemes.get("Graphite Selected");
		SubstanceColorScheme disabledScheme = schemes.get("Graphite Disabled");

		SubstanceColorScheme enabledScheme = schemes.get("Graphite Enabled");
		SubstanceColorScheme backgroundScheme = schemes.get("Graphite Background");

		defaultSchemeBundle = new SubstanceColorSchemeBundle(activeScheme, enabledScheme,
				disabledScheme);

		// highlight fill scheme + custom alpha for rollover unselected state
		SubstanceColorScheme highlightScheme = schemes.get("Graphite Highlight");
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 0.6f,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 0.8f,
				ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 1.0f,
				ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, 0.75f,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// highlight border scheme
		SubstanceColorScheme borderScheme = schemes.get("Graphite Border");
		SubstanceColorScheme separatorScheme = schemes.get("Graphite Separator");
		defaultSchemeBundle.registerColorScheme(new EbonyColorScheme(),
				ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(borderScheme, ColorSchemeAssociationKind.BORDER);
		defaultSchemeBundle.registerColorScheme(separatorScheme,
				ColorSchemeAssociationKind.SEPARATOR);

		// text highlight scheme
		SubstanceColorScheme textHighlightScheme = schemes.get("Graphite Text Highlight");
		defaultSchemeBundle.registerColorScheme(textHighlightScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_TEXT, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED);

		defaultSchemeBundle.registerColorScheme(highlightScheme, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);

		SubstanceColorScheme highlightMarkScheme = schemes.get("Graphite Highlight Mark");
		defaultSchemeBundle.registerColorScheme(highlightMarkScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_MARK, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(highlightMarkScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.ROLLOVER_SELECTED,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(borderScheme, ColorSchemeAssociationKind.MARK,
				ComponentState.SELECTED);

		defaultSchemeBundle.registerColorScheme(disabledScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(selectedDisabledScheme, 0.65f,
				ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(disabledScheme, ColorSchemeAssociationKind.MARK,
				ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);

		defaultSchemeBundle.registerColorScheme(highlightScheme, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(selectedScheme, ComponentState.SELECTED);

		SubstanceColorScheme tabHighlightScheme = schemes.get("Graphite Tab Highlight");
		defaultSchemeBundle.registerColorScheme(tabHighlightScheme, ColorSchemeAssociationKind.TAB,
				ComponentState.ROLLOVER_SELECTED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme,
				DecorationAreaType.NONE);

		this.setTabFadeStart(0.18);
		this.setTabFadeEnd(0.18);

		this.buttonShaper = new ClassicButtonShaper();
		this.watermark = null;
		this.borderPainter = new CompositeBorderPainter("Graphite",
				new DelegateBorderPainter("Graphite Outer", new ClassicBorderPainter(), 0xFFFFFFFF,
						0xFFFFFFFF, 0xFFFFFFFF,
						(SubstanceColorScheme scheme) -> scheme.shade(0.4f)),
				new DelegateBorderPainter("Graphite Inner", new ClassicBorderPainter(), 0xA0FFFFFF,
						0x90FFFFFF, 0xA0FFFFFF,
						(SubstanceColorScheme scheme) -> scheme.tint(0.25f)));
		this.highlightBorderPainter = new ClassicBorderPainter();
	}
}
