/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.colorscheme.DarkMetallicColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.EbonyColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.GlassBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Raven</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class RavenSkin extends RadianceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Raven";

	/**
	 * Creates a new <code>Raven</code> skin.
	 */
	public RavenSkin() {
		ColorSchemes schemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/graphite.colorschemes"));

		RadianceColorScheme activeScheme = new EbonyColorScheme();
		RadianceColorScheme enabledScheme = new DarkMetallicColorScheme();
		RadianceColorScheme disabledScheme = schemes.get("Raven Disabled");

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);

		// highlight fill scheme + custom alpha for rollover unselected state
		RadianceColorScheme highlightScheme = schemes.get("Graphite Highlight");
		defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightAlpha(0.75f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme, ComponentState.ROLLOVER_UNSELECTED,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// highlight border scheme
		defaultSchemeBundle.registerColorScheme(new EbonyColorScheme(),
				RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState
						.getActiveStates());

		// text highlight scheme
		RadianceColorScheme textHighlightScheme = schemes.get("Graphite Text Highlight");
		defaultSchemeBundle.registerColorScheme(textHighlightScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		RadianceColorScheme highlightMarkScheme = schemes
				.get("Raven Highlight Mark");
		defaultSchemeBundle.registerColorScheme(highlightMarkScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_MARK, ComponentState
						.getActiveStates());

		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(highlightScheme, ComponentState.DISABLED_SELECTED);

		RadianceColorScheme tabHighlightScheme = schemes
				.get("Graphite Tab Highlight");
		defaultSchemeBundle.registerColorScheme(highlightScheme,
				ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(tabHighlightScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.TAB, ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.ROLLOVER_UNSELECTED);

		RadianceColorScheme selectedMarkScheme = schemes
				.get("Raven Selected Mark");
		defaultSchemeBundle.registerColorScheme(selectedMarkScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.MARK, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED,
				ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(selectedMarkScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
				ComponentState.ROLLOVER_UNSELECTED);

		defaultSchemeBundle.registerColorScheme(activeScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
				ComponentState.DISABLED_SELECTED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				schemes.get("Graphite Background").shade(0.4), RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(enabledScheme,
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER, RadianceThemingSlices.DecorationAreaType.FOOTER,
				RadianceThemingSlices.DecorationAreaType.CONTROL_PANE, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new GlassFillPainter(), 1.0f);
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightFillPainter = new ClassicFillPainter();
		this.borderPainter = new GlassBorderPainter();
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
