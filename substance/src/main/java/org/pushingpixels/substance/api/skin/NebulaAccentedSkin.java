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
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.ColorTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.FlatBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.SubduedFillPainter;
import org.pushingpixels.substance.api.painter.highlight.ClassicHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.substance.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Nebula</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class NebulaAccentedSkin extends SubstanceSkin.Accented {
	/**
	 * Overlay painter to paint separator lines on some decoration areas.
	 */
	protected BottomLineOverlayPainter bottomLineOverlayPainter;

	/**
	 * Creates a new base accented <code>Nebula</code> skin.
	 */
	protected NebulaAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		ColorSchemes schemes = SubstanceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
						"org/pushingpixels/substance/api/skin/nebula.colorschemes"));

		SubstanceColorScheme activeScheme = schemes.get("Nebula Active");
		SubstanceColorScheme enabledScheme = schemes.get("Nebula Enabled");
		SubstanceColorScheme rolloverUnselectedScheme = schemes.get("Nebula Rollover Unselected");
		SubstanceColorScheme pressedScheme = schemes.get("Nebula Pressed");
		SubstanceColorScheme rolloverSelectedScheme = schemes.get("Nebula Rollover Selected");
		SubstanceColorScheme disabledScheme = schemes.get("Nebula Disabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);
		defaultSchemeBundle.registerColorScheme(rolloverUnselectedScheme,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
				ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(pressedScheme,
				ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		defaultSchemeBundle.registerColorScheme(rolloverUnselectedScheme,
				ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);

		defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerHighlightAlpha(0.95f, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(pressedScheme, ComponentState.ROLLOVER_UNSELECTED,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// for progress bars
		ComponentState determinateState = new ComponentState("determinate",
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE,
						ComponentStateFacet.DETERMINATE }, null);
		ComponentState indeterminateState = new ComponentState("indeterminate",
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE },
				new ComponentStateFacet[] { ComponentStateFacet.DETERMINATE });
		SubstanceColorScheme determinateScheme = schemes.get("Nebula Determinate");
		SubstanceColorScheme determinateBorderScheme = schemes.get("Nebula Determinate Border");
		defaultSchemeBundle.registerColorScheme(determinateScheme,
				determinateState, indeterminateState);
		defaultSchemeBundle.registerColorScheme(determinateBorderScheme,
				ColorSchemeAssociationKind.BORDER, determinateState,
				indeterminateState);

		ComponentState determinateDisabledState = new ComponentState(
				"determinate disabled",
				new ComponentStateFacet[] { ComponentStateFacet.DETERMINATE },
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE });
		ComponentState indeterminateDisabledState = new ComponentState(
				"indeterminate disabled", null, new ComponentStateFacet[] {
						ComponentStateFacet.ENABLE,
						ComponentStateFacet.DETERMINATE });
		SubstanceColorScheme determinateDisabledScheme = schemes
				.get("Nebula Determinate Disabled");
		SubstanceColorScheme determinateDisabledBorderScheme = schemes
				.get("Nebula Determinate Disabled Border");
		defaultSchemeBundle.registerColorScheme(determinateDisabledScheme,
				determinateDisabledState, indeterminateDisabledState);
		defaultSchemeBundle.registerColorScheme(
				determinateDisabledBorderScheme,
				ColorSchemeAssociationKind.BORDER, determinateDisabledState,
				indeterminateDisabledState);

		registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				DecorationAreaType.NONE);

		registerAsDecorationArea(schemes.get("Nebula Decorations"),
				bundle -> bundle.registerColorScheme(schemes.get("Nebula Decorations Separator"),
						ColorSchemeAssociationKind.SEPARATOR),
				DecorationAreaType.FOOTER, DecorationAreaType.CONTROL_PANE);

		// add an overlay painter to paint a drop shadow along the top edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(60),
				DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		this.bottomLineOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.DARK,
						ColorTransform.alpha(160)));
		this.addOverlayPainter(this.bottomLineOverlayPainter,
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		this.registerAsDecorationArea(this.getWindowChromeAccent(),
				DecorationAreaType.PRIMARY_TITLE_PANE,
				DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SubduedFillPainter();

		MarbleNoiseDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.3f);
		this.decorationPainter = decorationPainter;

		this.highlightPainter = new ClassicHighlightPainter();
		this.borderPainter = new FlatBorderPainter();

	}
}
