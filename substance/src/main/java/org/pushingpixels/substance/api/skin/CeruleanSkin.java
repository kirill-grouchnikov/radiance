/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov and contributing authors. All Rights Reserved.
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
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.GlassBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.substance.api.painter.highlight.GlassHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.substance.api.shaper.ClassicButtonShaper;

/**
 * <code>Cerulean</code> skin. This class is part of officially supported API.
 * 
 * @author Danno Ferrin
 * @since version 6.2
 */
public class CeruleanSkin extends SubstanceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Cerulean";

	/**
	 * Creates a new <code>Nebulous</code> skin.
	 */
	public CeruleanSkin() {
		super();

		SubstanceSkin.ColorSchemes ceruleanSchemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/cerulean.colorschemes");

		SubstanceColorScheme activeScheme = ceruleanSchemes.get("Cerulean Active");
		SubstanceColorScheme enabledScheme = ceruleanSchemes.get("Cerulean Enabled");
		SubstanceColorScheme rolloverSelectedScheme = ceruleanSchemes
				.get("Cerulean Rollover Selected");
		SubstanceColorScheme disabledScheme = ceruleanSchemes.get("Cerulean Disabled");

		SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(
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
				ColorSchemeAssociationKind.MARK, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(ceruleanSchemes.get("Cerulean Border"),
				ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());

		// for progress bars
		ComponentState determinateState = new ComponentState("determinate enabled",
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE,
						ComponentStateFacet.DETERMINATE, ComponentStateFacet.SELECTION },
				null);
		ComponentState determinateDisabledState = new ComponentState("determinate disabled",
				new ComponentStateFacet[] { ComponentStateFacet.DETERMINATE,
						ComponentStateFacet.SELECTION },
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE });
		ComponentState indeterminateState = new ComponentState("indeterminate enabled",
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE,
						ComponentStateFacet.SELECTION },
				new ComponentStateFacet[] { ComponentStateFacet.DETERMINATE });
		ComponentState indeterminateDisabledState = new ComponentState("indeterminate disabled",
				null, new ComponentStateFacet[] { ComponentStateFacet.DETERMINATE,
						ComponentStateFacet.ENABLE, ComponentStateFacet.SELECTION });
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme, determinateState,
				indeterminateState);
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
				ColorSchemeAssociationKind.BORDER, determinateState, indeterminateState);
		defaultSchemeBundle.registerColorScheme(disabledScheme, determinateDisabledState,
				indeterminateDisabledState);
		defaultSchemeBundle.registerColorScheme(disabledScheme, ColorSchemeAssociationKind.BORDER,
				determinateDisabledState, indeterminateDisabledState);

		// for uneditable fields
		ComponentState editable = new ComponentState("editable", new ComponentStateFacet[] {
				ComponentStateFacet.ENABLE, ComponentStateFacet.EDITABLE }, null);
		ComponentState uneditable = new ComponentState("uneditable", editable,
				new ComponentStateFacet[] { ComponentStateFacet.ENABLE },
				new ComponentStateFacet[] { ComponentStateFacet.EDITABLE });
		defaultSchemeBundle.registerColorScheme(defaultSchemeBundle.getColorScheme(editable),
				ColorSchemeAssociationKind.FILL, uneditable);

		// for text highlight
		ColorSchemes kitchenSinkSchemes = SubstanceSkin
				.getColorSchemes("org/pushingpixels/substance/api/skin/kitchen-sink.colorschemes");
		SubstanceColorScheme highlightColorScheme = kitchenSinkSchemes.get("Moderate Highlight");
		defaultSchemeBundle.registerHighlightColorScheme(highlightColorScheme);

		registerDecorationAreaSchemeBundle(defaultSchemeBundle, DecorationAreaType.NONE);

		SubstanceColorScheme activeHeaderScheme = ceruleanSchemes.get("Cerulean Active Header");
		SubstanceColorScheme headerScheme = ceruleanSchemes.get("Cerulean Header");
		SubstanceColorScheme disabledHeaderScheme = ceruleanSchemes.get("Cerulean Header Disabled");
		SubstanceColorSchemeBundle headerSchemeBundle = new SubstanceColorSchemeBundle(
				activeHeaderScheme, headerScheme, disabledHeaderScheme);
		headerSchemeBundle.registerColorScheme(activeHeaderScheme, 0.6f,
				ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
		headerSchemeBundle.registerColorScheme(activeHeaderScheme, 0.6f,
				ColorSchemeAssociationKind.MARK, ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);
		registerDecorationAreaSchemeBundle(headerSchemeBundle, headerScheme,
				DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE,
				DecorationAreaType.HEADER);

		registerAsDecorationArea(ceruleanSchemes.get("Cerulean Footer"), DecorationAreaType.FOOTER,
				DecorationAreaType.GENERAL);

		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(), DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new ClassicFillPainter();

		this.decorationPainter = new ArcDecorationPainter();

		this.highlightPainter = new GlassHighlightPainter();
		this.borderPainter = new GlassBorderPainter();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.pushingpixels.substance.skin.SubstanceSkin#getDisplayName()
	 */
	@Override
	public String getDisplayName() {
		return NAME;
	}
}
