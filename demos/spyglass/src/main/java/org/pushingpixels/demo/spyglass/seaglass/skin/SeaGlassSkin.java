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
package org.pushingpixels.demo.spyglass.seaglass.skin;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceColorSchemeBundle;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.substance.api.painter.border.FractionBasedBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

import java.awt.*;

public class SeaGlassSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "SeaGlass";

	/**
	 * Creates a new <code>Gemini</code> skin.
	 */
	public SeaGlassSkin() {
		ColorSchemes schemes = SubstanceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
						"org/pushingpixels/demo/spyglass/seaglass/skin/seaglass.colorschemes"));

		SubstanceColorScheme activeScheme = schemes.get("Sea Glass Active");
		SubstanceColorScheme enabledScheme = schemes.get("Sea Glass Enabled");
		SubstanceColorScheme disabledScheme = schemes.get("Sea Glass Disabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);

		// borders
		SubstanceColorScheme activeBorderScheme = schemes
				.get("Sea Glass Active Border");
		SubstanceColorScheme enabledBorderScheme = schemes
				.get("Sea Glass Enabled Border");
		SubstanceColorScheme disabledBorderScheme = schemes
				.get("Sea Glass Enabled Border");
		defaultSchemeBundle.registerColorScheme(enabledBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
		defaultSchemeBundle.registerColorScheme(activeBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.DEFAULT);
		defaultSchemeBundle.registerColorScheme(disabledBorderScheme,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.DISABLED_DEFAULT,
				ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);

		// states
		SubstanceColorScheme defaultScheme = schemes.get("Sea Glass Default");
		SubstanceColorScheme defaultBorderScheme = schemes
				.get("Sea Glass Default Border");
		defaultSchemeBundle.registerColorScheme(defaultScheme,
				ComponentState.DEFAULT);
		defaultSchemeBundle.registerColorScheme(defaultBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.DEFAULT);

		SubstanceColorScheme pressedScheme = schemes.get("Sea Glass Pressed");
		SubstanceColorScheme pressedBorderScheme = schemes
				.get("Sea Glass Pressed Border");
		defaultSchemeBundle.registerColorScheme(pressedScheme,
				ComponentState.PRESSED_SELECTED,
				ComponentState.PRESSED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(pressedBorderScheme,
				ColorSchemeAssociationKind.BORDER,
				ComponentState.PRESSED_SELECTED,
				ComponentState.PRESSED_UNSELECTED);

		SubstanceColorScheme selectedScheme = schemes.get("Sea Glass Selected");
		SubstanceColorScheme selectedBorderScheme = schemes
				.get("Sea Glass Selected Border");
		defaultSchemeBundle.registerColorScheme(selectedScheme,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(selectedBorderScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED);

		SubstanceColorScheme backgroundScheme = schemes
				.get("Sea Glass Background");

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				backgroundScheme, DecorationAreaType.NONE);

		this.registerAsDecorationArea(activeScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE);

		this.addOverlayPainter(new BottomLineOverlayPainter(
				scheme -> scheme.getDarkColor().darker()), DecorationAreaType.PRIMARY_TITLE_PANE);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new FractionBasedFillPainter("Sea Glass",
				new float[] { 0.0f, 0.49999f, 0.5f, 0.65f, 1.0f },
				new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.EXTRALIGHT,
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.MID,
						ColorSchemeSingleColorQuery.LIGHT,
						ColorSchemeSingleColorQuery.ULTRALIGHT });

		this.decorationPainter = new MatteDecorationPainter();
		this.highlightPainter = new ClassicHighlightPainter();

		this.borderPainter = new FractionBasedBorderPainter("Sea Glass",
				new float[] { 0.0f, 0.5f, 1.0f },
				new ColorSchemeSingleColorQuery[] {
						ColorSchemeSingleColorQuery.MID,
						ColorSchemeSingleColorQuery.DARK,
						ColorSchemeSingleColorQuery.ULTRADARK });
		this.highlightBorderPainter = new ClassicBorderPainter();
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
