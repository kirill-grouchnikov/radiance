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
import org.pushingpixels.substance.api.colorscheme.LightGrayColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.FractionBasedDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * <code>Office Black 2007</code> skin. This class is part of officially
 * supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class OfficeBlack2007Skin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Office Black 2007";

	/**
	 * Creates a new <code>Office Black 2007</code> skin.
	 */
	public OfficeBlack2007Skin() {
		SubstanceSkin.ColorSchemes colorSchemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/office2007.colorschemes");

		SubstanceColorScheme activeScheme = colorSchemes
				.get("Office Silver Active");
		SubstanceColorScheme enabledScheme = colorSchemes
				.get("Office Black Enabled");
		SubstanceColorScheme disabledScheme = new LightGrayColorScheme().tint(
				0.05).named("Office Black Disabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, enabledScheme);
		defaultSchemeBundle.registerColorScheme(enabledScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);

		SubstanceColorScheme rolloverScheme = colorSchemes
				.get("Office Silver Rollover");
		SubstanceColorScheme rolloverSelectedScheme = colorSchemes
				.get("Office Silver Rollover Selected");
		SubstanceColorScheme selectedScheme = colorSchemes
				.get("Office Silver Selected");
		SubstanceColorScheme pressedScheme = colorSchemes
				.get("Office Silver Pressed");
		SubstanceColorScheme pressedSelectedScheme = colorSchemes
				.get("Office Silver Pressed Selected");

		// register state-specific color schemes on rollovers and selections
		defaultSchemeBundle.registerColorScheme(rolloverScheme,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
				ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(selectedScheme,
				ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(pressedScheme,
				ComponentState.PRESSED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(pressedSelectedScheme,
				ComponentState.PRESSED_SELECTED);
		defaultSchemeBundle.registerColorScheme(selectedScheme.tone(0.2f), 0.5f,
				ComponentState.DISABLED_SELECTED);

		// register state-specific highlight color schemes on rollover and
		// selections
		defaultSchemeBundle.registerHighlightColorScheme(rolloverScheme, 0.8f,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(selectedScheme, 0.8f,
				ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(
				rolloverSelectedScheme, 0.8f, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(selectedScheme, 0.8f,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// borders and marks
		SubstanceColorScheme borderEnabledScheme = colorSchemes
				.get("Office Silver Border Enabled");
		SubstanceColorScheme borderActiveScheme = colorSchemes
				.get("Office Silver Border Active");
		SubstanceColorScheme borderRolloverScheme = colorSchemes
				.get("Office Border Rollover");
		SubstanceColorScheme borderRolloverSelectedScheme = colorSchemes
				.get("Office Border Rollover Selected");
		SubstanceColorScheme borderSelectedScheme = colorSchemes
				.get("Office Border Selected");
		SubstanceColorScheme borderPressedScheme = colorSchemes
				.get("Office Border Pressed");

		defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
		defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(borderActiveScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.DEFAULT);
		defaultSchemeBundle.registerColorScheme(borderRolloverScheme,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(borderRolloverSelectedScheme,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.ROLLOVER_SELECTED, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerColorScheme(borderSelectedScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(borderPressedScheme,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.PRESSED_SELECTED,
				ComponentState.PRESSED_UNSELECTED);

		SubstanceColorScheme markEnabledScheme = colorSchemes
				.get("Office Black Mark Enabled");
		defaultSchemeBundle.registerColorScheme(markEnabledScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.ENABLED);
		defaultSchemeBundle.registerColorScheme(markEnabledScheme,
				ColorSchemeAssociationKind.MARK,
				ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);
		
		defaultSchemeBundle.registerColorScheme(selectedScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(pressedScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.PRESSED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(pressedSelectedScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.PRESSED_SELECTED);

		registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				DecorationAreaType.NONE);

		// tabs and tab borders
		SubstanceColorScheme tabSelectedScheme = colorSchemes
				.get("Office Silver Tab Selected");
		SubstanceColorScheme tabRolloverScheme = colorSchemes
				.get("Office Silver Tab Rollover");
		defaultSchemeBundle.registerColorScheme(tabSelectedScheme,
				ColorSchemeAssociationKind.TAB, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.PRESSED_SELECTED,
				ComponentState.PRESSED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(tabRolloverScheme,
				ColorSchemeAssociationKind.TAB,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
				ColorSchemeAssociationKind.TAB_BORDER, ComponentState.SELECTED,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
				ColorSchemeAssociationKind.TAB_BORDER,
				ComponentState.ROLLOVER_SELECTED);

		// separator
		SubstanceColorScheme separatorScheme = colorSchemes
				.get("Office Silver Separator");
		defaultSchemeBundle.registerColorScheme(separatorScheme,
				ColorSchemeAssociationKind.SEPARATOR);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				DecorationAreaType.NONE);

		// color scheme bundle for title panes
		SubstanceColorScheme activeHeaderScheme = colorSchemes
				.get("Office Black Header Active");
		SubstanceColorScheme enabledHeaderScheme = colorSchemes
				.get("Office Black Header Enabled");
		SubstanceColorScheme disabledHeaderScheme = colorSchemes
				.get("Office Black Header Disabled");
		SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
				activeHeaderScheme, enabledHeaderScheme, disabledHeaderScheme);

		SubstanceColorScheme headerMarkEnabledScheme = colorSchemes
				.get("Office Black Header Mark Enabled");
		headerSchemeBundle.registerColorScheme(headerMarkEnabledScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.ENABLED);
		headerSchemeBundle.registerColorScheme(markEnabledScheme,
				ColorSchemeAssociationKind.MARK,
				ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);

		headerSchemeBundle.registerColorScheme(disabledHeaderScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED,
				ComponentState.DISABLED_SELECTED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, 0.6f,
				ComponentState.ROLLOVER_UNSELECTED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f,
				ComponentState.SELECTED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, 0.95f,
				ComponentState.ROLLOVER_SELECTED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, 0.8f,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle,
				activeHeaderScheme, DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.HEADER, DecorationAreaType.TOOLBAR);

		// color scheme bundle for footer
		SubstanceColorScheme enabledFooterScheme = colorSchemes
				.get("Office Black Footer Enabled");
		SubstanceColorSchemeBundle footerSchemeBundle = new SubstanceColorSchemeBundle(
				activeHeaderScheme, enabledFooterScheme, disabledScheme);
		SubstanceColorScheme borderFooterEnabledScheme = colorSchemes
				.get("Office Black Footer Border Enabled");
		footerSchemeBundle.registerColorScheme(borderFooterEnabledScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED,
				ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);
		footerSchemeBundle.registerColorScheme(borderFooterEnabledScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState
						.getActiveStates());

		// register state-specific color schemes on rollovers and selections
		footerSchemeBundle.registerColorScheme(rolloverScheme,
				ComponentState.ROLLOVER_UNSELECTED);
		footerSchemeBundle.registerColorScheme(rolloverSelectedScheme,
				ComponentState.ROLLOVER_SELECTED);
		footerSchemeBundle.registerColorScheme(selectedScheme,
				ComponentState.SELECTED);
		footerSchemeBundle.registerColorScheme(pressedScheme,
				ComponentState.PRESSED_UNSELECTED);
		footerSchemeBundle.registerColorScheme(pressedSelectedScheme,
				ComponentState.PRESSED_SELECTED);

		SubstanceColorScheme footerSeparatorScheme = colorSchemes
				.get("Office Black Footer Separator");
		footerSchemeBundle.registerColorScheme(footerSeparatorScheme,
				ColorSchemeAssociationKind.SEPARATOR);

		this.registerDecorationAreaSchemeBundle(footerSchemeBundle,
				activeHeaderScheme, DecorationAreaType.FOOTER);

		this.watermarkScheme = colorSchemes.get("Office Black Watermark");
		this.registerAsDecorationArea(this.watermarkScheme,
				DecorationAreaType.GENERAL);

		setTabFadeStart(0.6);
		setTabFadeEnd(0.9);

		this.addOverlayPainter(new BottomLineOverlayPainter(
				(SubstanceColorScheme scheme) -> SubstanceColorUtilities.getAlphaColor(
						scheme.getUltraDarkColor(), 192)), DecorationAreaType.PRIMARY_TITLE_PANE);

		this.buttonShaper = new ClassicButtonShaper();
		this.watermark = null;

		this.fillPainter = new FractionBasedFillPainter("Office Black 2007",
				new float[] { 0.0f, 0.49999f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.MID,
						ColorSchemeSingleColorQuery.LIGHT });

		this.borderPainter = new ClassicBorderPainter();

		this.decorationPainter = new FractionBasedDecorationPainter(
				"Office Black 2007", new float[] { 0.0f, 0.2499999f, 0.25f,
						0.6f, 1.0f }, new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.MID,
						ColorSchemeSingleColorQuery.DARK,
						ColorSchemeSingleColorQuery.DARK,
						ColorSchemeSingleColorQuery.MID },
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.FOOTER);
		this.highlightPainter = new ClassicHighlightPainter();
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
