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
package org.pushingpixels.radiance.laf.api.skin;

import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.laf.api.RadianceSkin;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.api.painter.border.GlassBorderPainter;
import org.pushingpixels.radiance.laf.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.laf.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.laf.api.painter.highlight.GlassHighlightPainter;
import org.pushingpixels.radiance.laf.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.laf.api.shaper.ClassicButtonShaper;

/**
 * <code>Cerulean</code> skin. This class is part of officially supported API.
 * 
 * @author Danno Ferrin
 */
public class CeruleanSkin extends RadianceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Cerulean";

	/**
	 * Creates a new <code>Cerulean</code> skin.
	 */
	public CeruleanSkin() {
		super();

		ColorSchemes ceruleanSchemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/laf/api/skin/cerulean.colorschemes"));

		RadianceColorScheme activeScheme = ceruleanSchemes.get("Cerulean Active");
		RadianceColorScheme enabledScheme = ceruleanSchemes.get("Cerulean Enabled");
		RadianceColorScheme rolloverSelectedScheme = ceruleanSchemes
				.get("Cerulean Rollover Selected");
		RadianceColorScheme disabledScheme = ceruleanSchemes.get("Cerulean Disabled");

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);

		defaultSchemeBundle.registerColorScheme(ceruleanSchemes.get("Cerulean Pressed"),
				ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(ceruleanSchemes.get("Cerulean Disabled Selected"),
				ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(ceruleanSchemes.get("Cerulean Selected"),
				ComponentState.SELECTED);
		defaultSchemeBundle.registerColorScheme(ceruleanSchemes.get("Cerulean Rollover Selected"),
				ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(ceruleanSchemes.get("Cerulean Rollover Unselected"),
				ComponentState.ROLLOVER_UNSELECTED);

		defaultSchemeBundle.registerColorScheme(ceruleanSchemes.get("Cerulean Mark"),
				RadianceLafSlices.ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(ceruleanSchemes.get("Cerulean Border"),
				RadianceLafSlices.ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());

		// for progress bars
		ComponentState determinateState = new ComponentState("determinate enabled",
				new RadianceLafSlices.ComponentStateFacet[] { RadianceLafSlices.ComponentStateFacet.ENABLE,
						RadianceLafSlices.ComponentStateFacet.DETERMINATE, RadianceLafSlices.ComponentStateFacet.SELECTION },
				null);
		ComponentState determinateDisabledState = new ComponentState("determinate disabled",
				new RadianceLafSlices.ComponentStateFacet[] { RadianceLafSlices.ComponentStateFacet.DETERMINATE,
						RadianceLafSlices.ComponentStateFacet.SELECTION },
				new RadianceLafSlices.ComponentStateFacet[] { RadianceLafSlices.ComponentStateFacet.ENABLE });
		ComponentState indeterminateState = new ComponentState("indeterminate enabled",
				new RadianceLafSlices.ComponentStateFacet[] { RadianceLafSlices.ComponentStateFacet.ENABLE,
						RadianceLafSlices.ComponentStateFacet.SELECTION },
				new RadianceLafSlices.ComponentStateFacet[] { RadianceLafSlices.ComponentStateFacet.DETERMINATE });
		ComponentState indeterminateDisabledState = new ComponentState("indeterminate disabled",
				null, new RadianceLafSlices.ComponentStateFacet[] { RadianceLafSlices.ComponentStateFacet.DETERMINATE,
						RadianceLafSlices.ComponentStateFacet.ENABLE, RadianceLafSlices.ComponentStateFacet.SELECTION });
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme, determinateState,
				indeterminateState);
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
				RadianceLafSlices.ColorSchemeAssociationKind.BORDER, determinateState, indeterminateState);
		defaultSchemeBundle.registerColorScheme(disabledScheme, determinateDisabledState,
				indeterminateDisabledState);
		defaultSchemeBundle.registerColorScheme(disabledScheme, RadianceLafSlices.ColorSchemeAssociationKind.BORDER,
				determinateDisabledState, indeterminateDisabledState);

		// for text highlight
		ColorSchemes kitchenSinkSchemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/laf/api/skin/kitchen-sink.colorschemes"));
		RadianceColorScheme highlightColorScheme = kitchenSinkSchemes.get("Moderate Highlight");
		defaultSchemeBundle.registerHighlightColorScheme(highlightColorScheme);

		registerDecorationAreaSchemeBundle(defaultSchemeBundle, RadianceLafSlices.DecorationAreaType.NONE);

		RadianceColorScheme activeHeaderScheme = ceruleanSchemes.get("Cerulean Active Header");
		RadianceColorScheme headerScheme = ceruleanSchemes.get("Cerulean Header");
		RadianceColorScheme disabledHeaderScheme = ceruleanSchemes.get("Cerulean Header Disabled");
		RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
				activeHeaderScheme, headerScheme, disabledHeaderScheme);
		headerSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED,
				ComponentState.DISABLED_SELECTED);
		headerSchemeBundle.registerColorScheme(activeHeaderScheme,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
		headerSchemeBundle.registerColorScheme(activeHeaderScheme,
				RadianceLafSlices.ColorSchemeAssociationKind.MARK, ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);
		registerDecorationAreaSchemeBundle(headerSchemeBundle, headerScheme,
				RadianceLafSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceLafSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceLafSlices.DecorationAreaType.HEADER);

		registerAsDecorationArea(ceruleanSchemes.get("Cerulean Footer"),
				bundle -> bundle.registerColorScheme(ceruleanSchemes.get("Cerulean Footer Separator"),
						RadianceLafSlices.ColorSchemeAssociationKind.SEPARATOR),
				RadianceLafSlices.DecorationAreaType.FOOTER, RadianceLafSlices.DecorationAreaType.CONTROL_PANE);

		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100), RadianceLafSlices.DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new ClassicFillPainter();

		this.decorationPainter = new ArcDecorationPainter();

		this.highlightPainter = new GlassHighlightPainter();
		this.borderPainter = new GlassBorderPainter();
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
