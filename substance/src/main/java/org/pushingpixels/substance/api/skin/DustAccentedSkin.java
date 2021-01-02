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

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.ColorTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.MatteFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Dust</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class DustAccentedSkin extends SubstanceSkin.Accented {
	/**
	 * Creates a new accented <code>Dust</code> skin.
	 */
	public DustAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		ColorSchemes schemes = SubstanceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
						"org/pushingpixels/substance/api/skin/dust.colorschemes"));

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				this.getActiveControlsAccent(), this.getEnabledControlsAccent(), this.getEnabledControlsAccent());
		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(this.getEnabledControlsAccent(), ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(), ComponentState.DISABLED_SELECTED);

		// borders and marks
		SubstanceColorScheme borderEnabledScheme = schemes.get("Dust Border Enabled");
		SubstanceColorScheme borderActiveScheme = schemes.get("Dust Border Active");
		SubstanceColorScheme markEnabledScheme = schemes.get("Dust Mark Enabled");

		defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(borderActiveScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(markEnabledScheme,
				ColorSchemeAssociationKind.MARK);

		// text highlight
		defaultSchemeBundle.registerColorScheme(this.getHighlightsAccent(),
				ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		// custom highlight alphas
		defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED);
		defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightAlpha(1.0f,
				ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerHighlightColorScheme(this.getHighlightsAccent(),
				ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, this.getBackgroundAccent(),
				DecorationAreaType.NONE);

		// header color scheme bundle
		SubstanceColorScheme headerActiveScheme = schemes.get("Dust Header Active");
		SubstanceColorScheme headerEnabledScheme = schemes.get("Dust Header Enabled");
		SubstanceColorScheme headerDisabledScheme = schemes.get("Dust Header Disabled");

		SubstanceColorScheme headerBackgroundScheme = schemes.get("Dust Header Background");

		SubstanceColorScheme headerSeparatorScheme = schemes.get("Dust Header Separator");

		SubstanceColorScheme headerBorderScheme = schemes.get("Dust Header Border");

		SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
				headerActiveScheme, headerEnabledScheme, headerDisabledScheme);
		headerSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		headerSchemeBundle.registerColorScheme(headerDisabledScheme,
				ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);

		headerSchemeBundle.registerColorScheme(headerBorderScheme,
				ColorSchemeAssociationKind.BORDER);
		headerSchemeBundle.registerColorScheme(headerSeparatorScheme,
				ColorSchemeAssociationKind.SEPARATOR);

		headerSchemeBundle.registerHighlightAlpha(1.0f);
		headerSchemeBundle.registerHighlightColorScheme(headerActiveScheme);
		// the next line is to have consistent coloring during the rollover menu animations
		headerSchemeBundle.registerHighlightAlpha(0.0f, ComponentState.ENABLED);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, DecorationAreaType.TOOLBAR);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerBackgroundScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER, DecorationAreaType.FOOTER);

		setTabFadeStart(0.1);
		setTabFadeEnd(0.3);

		// add two overlay painters to create a bezel line between menu bar and toolbars
		BottomLineOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
						ColorTransform.brightness(-0.5f)));
		TopLineOverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
				ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
						ColorTransform.alpha(32)));
		this.addOverlayPainter(menuOverlayPainter, DecorationAreaType.HEADER);
		this.addOverlayPainter(toolbarOverlayPainter, DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new MatteFillPainter();
		this.decorationPainter = new MatteDecorationPainter();
		this.highlightPainter = new ClassicHighlightPainter();
		this.borderPainter = new CompositeBorderPainter("Dust", new ClassicBorderPainter(),
				new DelegateBorderPainter("Dust Inner", new ClassicBorderPainter(),
						0x60FFFFFF, 0x30FFFFFF, 0x18FFFFFF,
						scheme -> scheme.shiftBackground(scheme.getUltraLightColor(), 0.8).tint(0.6).saturate(0.2)));
	}
}
