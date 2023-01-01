/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.skin;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SubduedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Nebula</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class NebulaAccentedSkin extends RadianceSkin.Accented {
	/**
	 * Overlay painter to paint separator lines on some decoration areas.
	 */
	protected BottomLineOverlayPainter bottomLineOverlayPainter;

	/**
	 * Creates a new base accented <code>Nebula</code> skin.
	 */
	protected NebulaAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		ColorSchemes schemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/nebula.colorschemes"));

		RadianceColorScheme activeScheme = schemes.get("Nebula Active");
		RadianceColorScheme enabledScheme = schemes.get("Nebula Enabled");
		RadianceColorScheme rolloverUnselectedScheme = schemes.get("Nebula Rollover Unselected");
		RadianceColorScheme pressedScheme = schemes.get("Nebula Pressed");
		RadianceColorScheme rolloverSelectedScheme = schemes.get("Nebula Rollover Selected");
		RadianceColorScheme disabledScheme = schemes.get("Nebula Disabled");

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);
		defaultSchemeBundle.registerColorScheme(rolloverUnselectedScheme,
				ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
				ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(pressedScheme,
				ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		defaultSchemeBundle.registerColorScheme(rolloverUnselectedScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);

		defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED, ComponentState.ARMED,
				ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerHighlightAlpha(0.95f, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(pressedScheme, ComponentState.ROLLOVER_UNSELECTED,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// for progress bars
		RadianceColorScheme determinateScheme = schemes.get("Nebula Determinate");
		RadianceColorScheme determinateBorderScheme = schemes.get("Nebula Determinate Border");
		defaultSchemeBundle.registerColorScheme(determinateScheme,
				ComponentState.DETERMINATE, ComponentState.INDETERMINATE);
		defaultSchemeBundle.registerColorScheme(determinateBorderScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
				ComponentState.DETERMINATE, ComponentState.INDETERMINATE);

		RadianceColorScheme determinateDisabledScheme = schemes
				.get("Nebula Determinate Disabled");
		RadianceColorScheme determinateDisabledBorderScheme = schemes
				.get("Nebula Determinate Disabled Border");
		defaultSchemeBundle.registerColorScheme(determinateDisabledScheme,
				ComponentState.DISABLED_DETERMINATE, ComponentState.DISABLED_INDETERMINATE);
		defaultSchemeBundle.registerColorScheme(
				determinateDisabledBorderScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
				ComponentState.DISABLED_DETERMINATE, ComponentState.DISABLED_INDETERMINATE);

		registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				RadianceThemingSlices.DecorationAreaType.NONE);

		registerAsDecorationArea(schemes.get("Nebula Decorations"),
				bundle -> bundle.registerColorScheme(schemes.get("Nebula Decorations Separator"),
						RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR),
				RadianceThemingSlices.DecorationAreaType.FOOTER, RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

		// add an overlay painter to paint a drop shadow along the top edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(60),
				RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		this.bottomLineOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.DARK,
						ColorTransform.alpha(160)));
		this.addOverlayPainter(this.bottomLineOverlayPainter,
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER);

		this.registerAsDecorationArea(this.getWindowChromeAccent(),
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new SubduedFillPainter(), 1.0f);

		MarbleNoiseDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.3f);
		this.decorationPainter = decorationPainter;

		this.highlightFillPainter = new ClassicFillPainter();
		this.borderPainter = new FlatBorderPainter();

	}
}
