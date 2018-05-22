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
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.substance.api.painter.border.FractionBasedBorderPainter;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * <code>Magellan</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 5.3
 */
public class MagellanSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Magellan";

	/**
	 * Overlay painter to paint a dark line along the bottom edge of the
	 * toolbars.
	 */
	private BottomLineOverlayPainter toolbarBottomLineOverlayPainter;

	/**
	 * Overlay painter to paint a light line along the top edge of the toolbars.
	 */
	private TopLineOverlayPainter toolbarTopLineOverlayPainter;

	/**
	 * Overlay painter to paint a shadowalong the top edge of the footer.
	 */
	private TopShadowOverlayPainter footerTopShadowOverlayPainter;

	@Override
	public String getDisplayName() {
		return NAME;
	}

	/**
	 * Creates a new instance of Magellan skin.
	 */
	public MagellanSkin() {
		SubstanceSkin.ColorSchemes colorSchemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/magellan.colorschemes");

		SubstanceColorScheme blueControlsActive = colorSchemes
				.get("Magellan Blue Controls Active");
		SubstanceColorScheme blueControlsEnabled = colorSchemes
				.get("Magellan Blue Controls Enabled");

		SubstanceColorSchemeBundle defaultColorSchemeBundle = new SubstanceColorSchemeBundle(
				blueControlsActive, blueControlsEnabled, blueControlsEnabled);
		defaultColorSchemeBundle.registerColorScheme(blueControlsEnabled, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		defaultColorSchemeBundle.registerColorScheme(blueControlsActive, 0.5f,
				ComponentState.DISABLED_SELECTED);

		// color schemes for the active states
		SubstanceColorScheme blueControlsActiveBorder = colorSchemes
				.get("Magellan Blue Controls Active Border");
		SubstanceColorScheme blueControlsEnabledBorder = colorSchemes
				.get("Magellan Blue Controls Enabled Border");
		defaultColorSchemeBundle.registerColorScheme(blueControlsActiveBorder,
				ColorSchemeAssociationKind.BORDER, ComponentState
						.getActiveStates());
		defaultColorSchemeBundle.registerColorScheme(blueControlsActiveBorder,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.DISABLED_SELECTED);
		defaultColorSchemeBundle.registerColorScheme(blueControlsEnabledBorder,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED,
				ComponentState.DISABLED_UNSELECTED);
		defaultColorSchemeBundle.registerColorScheme(blueControlsActiveBorder,
				ColorSchemeAssociationKind.MARK,
				ComponentState.SELECTED);
		defaultColorSchemeBundle.registerColorScheme(blueControlsActiveBorder,
				0.5f, ColorSchemeAssociationKind.MARK,
				ComponentState.DISABLED_SELECTED);

		// color schemes for the pressed states
		SubstanceColorScheme blueControlsPressed = colorSchemes
				.get("Magellan Blue Controls Pressed");
		SubstanceColorScheme blueControlsPressedBorder = colorSchemes
				.get("Magellan Blue Controls Pressed Border");
		defaultColorSchemeBundle.registerColorScheme(blueControlsPressed,
				ColorSchemeAssociationKind.FILL,
				ComponentState.PRESSED_SELECTED,
				ComponentState.PRESSED_UNSELECTED);
		defaultColorSchemeBundle.registerColorScheme(blueControlsPressedBorder,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.PRESSED_SELECTED,
				ComponentState.PRESSED_UNSELECTED);

		// color schemes for the rollover / armed states
		SubstanceColorScheme greenControls = colorSchemes
				.get("Magellan Green Controls");
		SubstanceColorScheme greenControlsMark = colorSchemes
				.get("Magellan Green Controls Mark");
		SubstanceColorScheme greenControlsBorder = colorSchemes
				.get("Magellan Green Controls Border");
		defaultColorSchemeBundle.registerColorScheme(greenControls,
				ColorSchemeAssociationKind.FILL,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);
		defaultColorSchemeBundle.registerColorScheme(greenControlsMark,
				ColorSchemeAssociationKind.MARK,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);
		defaultColorSchemeBundle.registerColorScheme(greenControlsBorder,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);

		// color scheme for the uneditable text components
		ComponentState uneditable = new ComponentState("uneditable",
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE },
				new ComponentStateFacet[] { ComponentStateFacet.EDITABLE });
		SubstanceColorScheme uneditableControls = colorSchemes
				.get("Magellan Uneditable Controls");
		defaultColorSchemeBundle.registerColorScheme(uneditableControls,
				ColorSchemeAssociationKind.FILL, uneditable);

		// color scheme for the selected state - preventing fallback to the
		// rollover selected state
		defaultColorSchemeBundle.registerColorScheme(blueControlsActive,
				ColorSchemeAssociationKind.FILL, ComponentState.SELECTED);

		// highlight alphas
		defaultColorSchemeBundle.registerHighlightColorScheme(greenControls,
				0.75f, ComponentState.ROLLOVER_UNSELECTED);
		defaultColorSchemeBundle.registerHighlightColorScheme(greenControls,
				0.85f, ComponentState.SELECTED);
		defaultColorSchemeBundle.registerHighlightColorScheme(greenControls,
				0.95f, ComponentState.ROLLOVER_SELECTED);
		defaultColorSchemeBundle.registerHighlightColorScheme(greenControls,
				1.0f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		defaultColorSchemeBundle.registerColorScheme(blueControlsActive.tint(0.2),
				ColorSchemeAssociationKind.TAB,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		
		SubstanceColorScheme lightBlueBackground = colorSchemes
				.get("Magellan Light Blue Background");

		this.registerDecorationAreaSchemeBundle(defaultColorSchemeBundle,
				lightBlueBackground, DecorationAreaType.NONE);

		SubstanceColorScheme mediumBlueBackground = colorSchemes
				.get("Magellan Medium Blue Background");
		SubstanceColorScheme darkBlueBackground = colorSchemes
				.get("Magellan Dark Blue Background");
		this.registerAsDecorationArea(mediumBlueBackground,
				DecorationAreaType.GENERAL, DecorationAreaType.TOOLBAR);
		this.registerAsDecorationArea(darkBlueBackground,
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		SubstanceColorScheme lightBlueControlsActive = colorSchemes
				.get("Magellan Light Blue Controls Active");
		SubstanceColorScheme lightBlueControlsEnabled = colorSchemes
				.get("Magellan Light Blue Controls Enabled");
		SubstanceColorScheme lightBlueBordersEnabled = colorSchemes
				.get("Magellan Light Blue Borders Enabled");
		SubstanceColorSchemeBundle footerColorSchemeBundle = new SubstanceColorSchemeBundle(
				lightBlueControlsActive, lightBlueControlsEnabled,
				lightBlueControlsEnabled);
		footerColorSchemeBundle.registerColorScheme(lightBlueControlsEnabled,
				0.5f, ComponentState.DISABLED_UNSELECTED);
		footerColorSchemeBundle.registerColorScheme(lightBlueControlsActive,
				0.5f, ComponentState.DISABLED_SELECTED);
		footerColorSchemeBundle.registerColorScheme(lightBlueBordersEnabled,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

		SubstanceColorScheme lightBlueSeparator = colorSchemes
				.get("Magellan Light Blue Separator");
		footerColorSchemeBundle.registerColorScheme(lightBlueSeparator,
				ColorSchemeAssociationKind.SEPARATOR);

		SubstanceColorScheme ultraLightBlueBackground = colorSchemes
				.get("Magellan Ultralight Blue Background");
		this.registerDecorationAreaSchemeBundle(footerColorSchemeBundle,
				ultraLightBlueBackground, DecorationAreaType.FOOTER);

		// Add overlay painter to paint drop shadows along the bottom
		// edges of toolbars
		this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(),
				DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint a dark line along the bottom
		// edge of toolbars
		this.toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
				(SubstanceColorScheme scheme) -> scheme.getUltraDarkColor());
		this.addOverlayPainter(this.toolbarBottomLineOverlayPainter,
				DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint a light line along the top
		// edge of toolbars
		this.toolbarTopLineOverlayPainter = new TopLineOverlayPainter(
				(SubstanceColorScheme scheme) -> SubstanceColorUtilities.getAlphaColor(
						scheme.getForegroundColor(), 40));
		this.addOverlayPainter(this.toolbarTopLineOverlayPainter, DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint a bezel line along the top
		// edge of footer
		this.footerTopShadowOverlayPainter = TopShadowOverlayPainter.getInstance();
		this.addOverlayPainter(this.footerTopShadowOverlayPainter, DecorationAreaType.FOOTER);

		this.setTabFadeStart(0.18);
		this.setTabFadeEnd(0.18);

		SubstanceBorderPainter outerBorderPainter = new FractionBasedBorderPainter(
				"Magellan Outer", new float[] { 0.0f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.ULTRADARK,
						ColorSchemeSingleColorQuery.DARK,
						ColorSchemeSingleColorQuery.DARK });
		SubstanceBorderPainter innerBorderPainter = new DelegateBorderPainter(
				"Magellan Inner", new ClassicBorderPainter(), 
				0xA0FFFFFF, 0x60FFFFFF, 0x40FFFFFF, 
				(SubstanceColorScheme scheme) -> scheme.tint(0.5f));
		this.borderPainter = new CompositeBorderPainter("Magellan",
				outerBorderPainter, innerBorderPainter);
		this.fillPainter = new FractionBasedFillPainter("Magellan",
				new float[] { 0.0f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.EXTRALIGHT,
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.MID });
		this.highlightPainter = new ClassicHighlightPainter();
		this.decorationPainter = new MatteDecorationPainter();
		this.buttonShaper = new ClassicButtonShaper();
	}
}
