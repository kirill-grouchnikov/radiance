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
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.StandardFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * <code>Dust</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 5.2
 */
public class DustSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Dust";

	/**
	 * Overlay painter to paint a dark line along the bottom edge of the
	 * menubar.
	 */
	private BottomLineOverlayPainter menuOverlayPainter;

	/**
	 * Overlay painter to paint a light line along the top edge of the toolbars.
	 */
	private TopLineOverlayPainter toolbarOverlayPainter;

	/**
	 * Creates a new <code>Dust</code> skin.
	 */
	public DustSkin() {
		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/dust.colorschemes");
		SubstanceColorScheme activeScheme = schemes.get("Dust Active");
		SubstanceColorScheme enabledScheme = schemes.get("Dust Enabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, enabledScheme);
		defaultSchemeBundle.registerColorScheme(enabledScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);

		// borders
		SubstanceColorScheme borderEnabledScheme = schemes.get("Dust Border Enabled");
		SubstanceColorScheme borderActiveScheme = schemes.get("Dust Border Active");

		defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(borderActiveScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(borderEnabledScheme.shade(0.3),
				ColorSchemeAssociationKind.MARK);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

		// header color scheme bundle
		SubstanceColorScheme headerActiveScheme = schemes.get("Dust Header Active");
		SubstanceColorScheme headerEnabledScheme = schemes.get("Dust Header Enabled");
		SubstanceColorScheme headerDisabledScheme = schemes.get("Dust Header Disabled");

		SubstanceColorScheme headerWatermarkScheme = schemes.get("Dust Header Watermark");

		SubstanceColorScheme headerSeparatorScheme = schemes.get("Dust Header Separator");

		SubstanceColorScheme headerBorderScheme = schemes.get("Dust Header Border");

		SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
				headerActiveScheme, headerEnabledScheme, headerDisabledScheme);
		headerSchemeBundle.registerColorScheme(headerDisabledScheme, 0.7f,
				ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);

		headerSchemeBundle.registerColorScheme(headerBorderScheme,
				ColorSchemeAssociationKind.BORDER);
		headerSchemeBundle.registerColorScheme(headerSeparatorScheme,
				ColorSchemeAssociationKind.SEPARATOR);

		headerSchemeBundle.registerHighlightColorScheme(headerActiveScheme, 1.0f);
		// the next line is to have consistent coloring during the rollover
		// menu animations
		headerSchemeBundle.registerHighlightColorScheme(headerActiveScheme, 0.0f,
				ComponentState.ENABLED);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, DecorationAreaType.TOOLBAR);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerWatermarkScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER, DecorationAreaType.FOOTER);

		setTabFadeStart(0.1);
		setTabFadeEnd(0.3);

		// add two overlay painters to create a bezel line between
		// menu bar and toolbars
		this.menuOverlayPainter = new BottomLineOverlayPainter(
				(SubstanceColorScheme scheme) -> scheme.getUltraDarkColor().darker());
		this.toolbarOverlayPainter = new TopLineOverlayPainter(
				(SubstanceColorScheme scheme) -> SubstanceColorUtilities.getAlphaColor(
						scheme.getForegroundColor(), 32));
		this.addOverlayPainter(this.menuOverlayPainter, DecorationAreaType.HEADER);
		this.addOverlayPainter(this.toolbarOverlayPainter, DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.watermark = null;
		this.fillPainter = new StandardFillPainter();
		this.decorationPainter = new MatteDecorationPainter();
		this.highlightPainter = new ClassicHighlightPainter();
		this.borderPainter = new CompositeBorderPainter("Dust", new ClassicBorderPainter(),
				new DelegateBorderPainter("Dust Inner", new ClassicBorderPainter(),
						0x60FFFFFF, 0x30FFFFFF, 0x18FFFFFF, 
						(SubstanceColorScheme scheme) -> scheme.shiftBackground(
								scheme.getUltraLightColor(), 0.8).tint(0.6).saturate(0.2)));
	}

	public String getDisplayName() {
		return NAME;
	}
}
