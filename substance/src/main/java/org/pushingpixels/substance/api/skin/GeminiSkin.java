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
import org.pushingpixels.substance.api.painter.border.DelegateFractionBasedBorderPainter;
import org.pushingpixels.substance.api.painter.border.FractionBasedBorderPainter;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopBezelOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * <code>Gemini</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 5.3
 */
public class GeminiSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Gemini";

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
	 * Overlay painter to paint a dark line along the bottom edge of the
	 * toolbars.
	 */
	private BottomLineOverlayPainter toolbarBottomLineOverlayPainter;

	/**
	 * Overlay painter to paint a bezel line along the top edge of the footer.
	 */
	private TopBezelOverlayPainter footerTopBezelOverlayPainter;

	/**
	 * Creates a new <code>Gemini</code> skin.
	 */
	public GeminiSkin() {
		SubstanceSkin.ColorSchemes schemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/gemini.colorschemes");

		SubstanceColorScheme grayScheme = schemes.get("Gemini Gray");
		SubstanceColorScheme lightGrayScheme = schemes.get("Gemini Light Gray");

		// use the same color scheme for active and enabled controls
		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(grayScheme,
				grayScheme, lightGrayScheme);

		// highlight fill scheme + custom alpha for rollover unselected state
		SubstanceColorScheme highlightScheme = schemes.get("Gemini Highlight");
		SubstanceColorScheme highlightBorderScheme = schemes.get("Gemini Highlight Border");
		applyHighlightColorScheme(defaultSchemeBundle, highlightScheme, highlightBorderScheme);
		applyHighlightAsFill(defaultSchemeBundle, highlightScheme, highlightBorderScheme);

		// borders, separators, marks
		SubstanceColorScheme grayBorderScheme = schemes.get("Gemini Gray Border");
		SubstanceColorScheme lightGrayBorderScheme = schemes.get("Gemini Light Gray Border");
		SubstanceColorScheme darkGraySeparatorScheme = schemes.get("Gemini Dark Gray Separator");
		defaultSchemeBundle.registerColorScheme(grayBorderScheme,
				ColorSchemeAssociationKind.BORDER);
		defaultSchemeBundle.registerColorScheme(lightGrayBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.DISABLED_DEFAULT,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(grayScheme, ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(darkGraySeparatorScheme,
				ColorSchemeAssociationKind.SEPARATOR);
		defaultSchemeBundle.registerColorScheme(grayScheme, ColorSchemeAssociationKind.MARK);

		defaultSchemeBundle.registerColorScheme(lightGrayScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(highlightScheme.tone(0.2f), 0.5f,
				ComponentState.DISABLED_SELECTED);

		SubstanceColorScheme whiteBackgroundScheme = schemes.get("Gemini White Background");

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, whiteBackgroundScheme,
				DecorationAreaType.NONE);

		// general color scheme bundle
		SubstanceColorSchemeBundle generalSchemeBundle = new SubstanceColorSchemeBundle(grayScheme,
				grayScheme, lightGrayScheme);
		generalSchemeBundle.registerColorScheme(grayScheme, ComponentState.ROLLOVER_UNSELECTED);
		generalSchemeBundle.registerColorScheme(grayScheme, ColorSchemeAssociationKind.MARK);
		generalSchemeBundle.registerColorScheme(grayBorderScheme,
				ColorSchemeAssociationKind.BORDER);
		applyHighlightColorScheme(generalSchemeBundle, highlightScheme, highlightBorderScheme);
		applyHighlightAsFill(generalSchemeBundle, highlightScheme, highlightBorderScheme);
		this.registerDecorationAreaSchemeBundle(generalSchemeBundle, grayScheme,
				DecorationAreaType.GENERAL, DecorationAreaType.FOOTER);

		// header color scheme bundle
		SubstanceColorScheme blackColorScheme = schemes.get("Gemini Black");
		SubstanceColorScheme activeHeaderScheme = schemes.get("Gemini Black Active Header");
		SubstanceColorScheme disabledHeaderScheme = schemes.get("Gemini Black Disabled Header");
		SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
				activeHeaderScheme, blackColorScheme, blackColorScheme);
		headerSchemeBundle.registerColorScheme(disabledHeaderScheme, 0.5f,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
		headerSchemeBundle.registerColorScheme(blackColorScheme,
				ComponentState.ROLLOVER_UNSELECTED);
		headerSchemeBundle.registerColorScheme(blackColorScheme, ColorSchemeAssociationKind.MARK);
		headerSchemeBundle.registerColorScheme(blackColorScheme.shade(0.9f),
				ColorSchemeAssociationKind.BORDER);
		applyHighlightColorScheme(headerSchemeBundle, highlightScheme, highlightBorderScheme);
		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, blackColorScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		// toolbar color scheme bundle
		SubstanceColorScheme darkBlueColorScheme = schemes.get("Gemini Dark Blue");
		SubstanceColorScheme darkBlueBackgroundColorScheme = schemes
				.get("Gemini Dark Blue Background");
		SubstanceColorSchemeBundle toolbarSchemeBundle = new SubstanceColorSchemeBundle(
				blackColorScheme, darkBlueColorScheme, darkBlueColorScheme);
		toolbarSchemeBundle.registerColorScheme(blackColorScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);
		toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		toolbarSchemeBundle.registerColorScheme(blackColorScheme,
				ComponentState.ROLLOVER_UNSELECTED);
		toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme,
				ColorSchemeAssociationKind.MARK);
		toolbarSchemeBundle.registerColorScheme(darkBlueColorScheme,
				ColorSchemeAssociationKind.BORDER);
		toolbarSchemeBundle.registerColorScheme(highlightScheme, ColorSchemeAssociationKind.MARK,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
				ComponentState.PRESSED_SELECTED);
		applyHighlightColorScheme(toolbarSchemeBundle, highlightScheme, darkBlueColorScheme);
		applyHighlightAsFill(toolbarSchemeBundle, highlightScheme, darkBlueColorScheme);
		this.registerDecorationAreaSchemeBundle(toolbarSchemeBundle, darkBlueBackgroundColorScheme,
				DecorationAreaType.TOOLBAR);

		this.setTabFadeStart(0.15);
		this.setTabFadeEnd(0.25);

		// add an overlay painter to paint a bezel line along the top
		// edge of footer
		this.footerTopBezelOverlayPainter = new TopBezelOverlayPainter(
				ColorSchemeSingleColorQuery.DARK, ColorSchemeSingleColorQuery.ULTRALIGHT);
		this.addOverlayPainter(this.footerTopBezelOverlayPainter, DecorationAreaType.FOOTER);

		// add two overlay painters to create a bezel line between
		// menu bar and toolbars
		this.menuOverlayPainter = new BottomLineOverlayPainter(
				(SubstanceColorScheme scheme) -> scheme.getUltraDarkColor().darker());
		this.toolbarOverlayPainter = new TopLineOverlayPainter(
				(SubstanceColorScheme scheme) -> SubstanceColorUtilities.getAlphaColor(
						scheme.getForegroundColor(), 32));
		this.addOverlayPainter(this.menuOverlayPainter, DecorationAreaType.HEADER);
		this.addOverlayPainter(this.toolbarOverlayPainter, DecorationAreaType.TOOLBAR);

		// add overlay painter to paint drop shadows along the bottom
		// edges of toolbars
		this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(),
				DecorationAreaType.TOOLBAR);

		// add overlay painter to paint a dark line along the bottom
		// edge of toolbars
		this.toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.ULTRADARK);
		this.addOverlayPainter(this.toolbarBottomLineOverlayPainter, DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.watermark = null;
		this.fillPainter = new FractionBasedFillPainter("Gemini", new float[] { 0.0f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.EXTRALIGHT,
						ColorSchemeSingleColorQuery.LIGHT, ColorSchemeSingleColorQuery.MID });

		this.decorationPainter = new MatteDecorationPainter();
		this.highlightPainter = new ClassicHighlightPainter();

		FractionBasedBorderPainter outerBorderPainter = new FractionBasedBorderPainter(
				"Gemini Outer", new float[] { 0.0f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.ULTRADARK,
						ColorSchemeSingleColorQuery.ULTRADARK,
						ColorSchemeSingleColorQuery.ULTRADARK });
		SubstanceBorderPainter innerBorderPainter = new DelegateFractionBasedBorderPainter(
				"Gemini Inner", outerBorderPainter,
				new int[] { 0x60FFFFFF, 0x40FFFFFF, 0x20FFFFFF }, 
				(SubstanceColorScheme scheme) -> scheme.tint(0.7f));

		this.borderPainter = new CompositeBorderPainter("Gemini", outerBorderPainter,
				innerBorderPainter);
		this.highlightBorderPainter = new ClassicBorderPainter();
	}

	/**
	 * Applies the specified highlight schemes on the relevant parts of the
	 * specified scheme bundle.
	 * 
	 * @param schemeBundle
	 *            Scheme bundle.
	 * @param highlightScheme
	 *            Highlight scheme.
	 * @param highlightBorderScheme
	 *            Highlight border scheme.
	 */
	private static void applyHighlightColorScheme(SubstanceColorSchemeBundle schemeBundle,
			SubstanceColorScheme highlightScheme, SubstanceColorScheme highlightBorderScheme) {

		// specify custom alpha values for the highlights
		schemeBundle.registerHighlightColorScheme(highlightScheme, 0.85f,
				ComponentState.ROLLOVER_UNSELECTED);
		schemeBundle.registerHighlightColorScheme(highlightScheme, 0.9f, ComponentState.SELECTED);
		schemeBundle.registerHighlightColorScheme(highlightScheme, 1.0f,
				ComponentState.ROLLOVER_SELECTED);
		schemeBundle.registerHighlightColorScheme(highlightScheme, 1.0f, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);
	}

	private static void applyHighlightAsFill(SubstanceColorSchemeBundle schemeBundle,
			SubstanceColorScheme highlightScheme, SubstanceColorScheme highlightBorderScheme) {
		// use for borders on rollover controls
		schemeBundle.registerColorScheme(highlightBorderScheme, ColorSchemeAssociationKind.BORDER,
				ComponentState.ROLLOVER_ARMED, ComponentState.ROLLOVER_SELECTED,
				ComponentState.ROLLOVER_UNSELECTED);

		// use for fill of selected controls
		schemeBundle.registerColorScheme(highlightScheme, ColorSchemeAssociationKind.FILL,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		// use for borders of highlights
		schemeBundle.registerColorScheme(highlightScheme,
				ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState.getActiveStates());

		// use for text highlight
		schemeBundle.registerColorScheme(highlightScheme, ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		// use for armed controls
		schemeBundle.registerColorScheme(highlightScheme, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);
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
