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
import org.pushingpixels.substance.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.substance.api.painter.border.DelegateFractionBasedBorderPainter;
import org.pushingpixels.substance.api.painter.border.FractionBasedBorderPainter;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.FractionBasedDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * <code>Office Silver 2007</code> skin. This class is part of officially
 * supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class OfficeSilver2007Skin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Office Silver 2007";

	/**
	 * Creates a new <code>Office Silver 2007</code> skin.
	 */
	public OfficeSilver2007Skin() {
		SubstanceSkin.ColorSchemes colorSchemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/office2007.colorschemes");

		SubstanceColorScheme activeScheme = colorSchemes
				.get("Office Silver Active");
		SubstanceColorScheme enabledScheme = colorSchemes
				.get("Office Silver Enabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, enabledScheme);
		defaultSchemeBundle.registerColorScheme(enabledScheme, 0.5f,
				ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme, 0.5f,
				ComponentState.DISABLED_SELECTED);

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
				.get("Office Silver Mark Enabled");
		defaultSchemeBundle.registerColorScheme(markEnabledScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.ENABLED);
		defaultSchemeBundle.registerColorScheme(markEnabledScheme,
				ColorSchemeAssociationKind.MARK,
				ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);

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

		defaultSchemeBundle.registerColorScheme(selectedScheme,
				ColorSchemeAssociationKind.MARK, 
				ComponentState.SELECTED, ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(pressedScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.PRESSED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(pressedSelectedScheme,
				ColorSchemeAssociationKind.MARK, ComponentState.PRESSED_SELECTED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				DecorationAreaType.NONE);

		this.watermarkScheme = colorSchemes.get("Office Silver Watermark");

		SubstanceColorScheme generalWatermarkScheme = colorSchemes
				.get("Office Silver Header Watermark");

		this.registerAsDecorationArea(generalWatermarkScheme,
				DecorationAreaType.FOOTER, DecorationAreaType.HEADER,
				DecorationAreaType.TOOLBAR);

		SubstanceColorScheme titleWatermarkScheme = colorSchemes
				.get("Office Silver Title Watermark");

		this.registerAsDecorationArea(titleWatermarkScheme,
				DecorationAreaType.GENERAL,
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE);

		setTabFadeStart(0.6);
		setTabFadeEnd(0.9);

		this.addOverlayPainter(new BottomLineOverlayPainter(
				(SubstanceColorScheme scheme) -> SubstanceColorUtilities.getAlphaColor(
						scheme.getForegroundColor(), 72)), 
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE);

		this.buttonShaper = new ClassicButtonShaper();
		this.watermark = null;

		this.fillPainter = new FractionBasedFillPainter("Office Silver 2007",
				new float[] { 0.0f, 0.49999f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.ULTRALIGHT,
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.ULTRADARK,
						ColorSchemeSingleColorQuery.EXTRALIGHT });

		FractionBasedBorderPainter outerBorderPainter = new FractionBasedBorderPainter(
				"Office Silver 2007 Outer", new float[] { 0.0f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.ULTRADARK,
						ColorSchemeSingleColorQuery.MID });
		SubstanceBorderPainter innerBorderPainter = new DelegateFractionBasedBorderPainter(
				"Office Silver 2007 Inner", outerBorderPainter, 
				new int[] { 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF },
				(SubstanceColorScheme scheme) -> scheme.tint(0.8f));
		this.borderPainter = new CompositeBorderPainter("Office Silver 2007",
				outerBorderPainter, innerBorderPainter);

		this.decorationPainter = new FractionBasedDecorationPainter(
				"Office Silver 2007", new float[] { 0.0f, 0.2499999f, 0.25f,
						0.3f, 0.7f, 1.0f }, new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.ULTRALIGHT,
						ColorSchemeSingleColorQuery.EXTRALIGHT,
						ColorSchemeSingleColorQuery.DARK,
						ColorSchemeSingleColorQuery.MID,
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.ULTRALIGHT });

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
