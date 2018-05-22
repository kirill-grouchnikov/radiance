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
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.MatteFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Autumn</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 4.0
 */
public class AutumnSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Autumn";

	/**
	 * Creates a new <code>Autumn</code> skin.
	 */
	public AutumnSkin() {
		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/autumn.colorschemes");

		SubstanceColorScheme activeScheme = schemes.get("Autumn Active");
		SubstanceColorScheme enabledScheme = schemes.get("Autumn Enabled");
		SubstanceColorScheme disabledScheme = enabledScheme;

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);
		defaultSchemeBundle.registerColorScheme(disabledScheme, 0.6f,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme, 0.6f,
				ComponentState.DISABLED_SELECTED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				DecorationAreaType.NONE);

		SubstanceColorSchemeBundle titlePaneSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);
		titlePaneSchemeBundle.registerColorScheme(disabledScheme, 0.6f,
				ComponentState.DISABLED_UNSELECTED);
		titlePaneSchemeBundle.registerColorScheme(activeScheme, 0.6f,
				ComponentState.DISABLED_SELECTED);

		SubstanceColorScheme borderScheme = enabledScheme.saturate(0.2f);
		titlePaneSchemeBundle.registerColorScheme(borderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

		this.registerDecorationAreaSchemeBundle(titlePaneSchemeBundle,
				activeScheme, DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE);

		SubstanceColorScheme watermarkScheme = schemes.get("Autumn Watermark");

		this.registerAsDecorationArea(activeScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		this.registerAsDecorationArea(watermarkScheme,
				DecorationAreaType.GENERAL, DecorationAreaType.FOOTER,
				DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(),
				DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.DARK);
		this.addOverlayPainter(bottomLineOverlayPainter,
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new MatteFillPainter();
		this.borderPainter = new CompositeBorderPainter("Autumn",
				new DelegateBorderPainter(
						"Autumn Outer", new ClassicBorderPainter(),
						(SubstanceColorScheme scheme) -> scheme.shade(0.1f)),
				new DelegateBorderPainter(
						"Autumn Inner", new ClassicBorderPainter(),
						(SubstanceColorScheme scheme) -> scheme.tint(0.8f)));

		this.highlightPainter = new ClassicHighlightPainter();

		MarbleNoiseDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
		decorationPainter.setTextureAlpha(0.7f);
		this.decorationPainter = decorationPainter;
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
