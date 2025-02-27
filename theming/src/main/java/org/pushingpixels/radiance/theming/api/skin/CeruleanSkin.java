/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

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

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public CeruleanSkin() {
		RadianceColorScheme2 ceruleanColorScheme = ColorSchemeUtils.getColorScheme(
			/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
				Hct.fromInt(0xFFD2E0ED), Hct.fromInt(0xFFECECED), Hct.fromInt(0xFFFBFCFC)),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isDark */ false);

		ContainerColorTokens ceruleanSelectedContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFC0DBEE),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isFidelity */ true,
			/* isDark */ false);
		ContainerColorTokens ceruleanSelectedHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFBDCA1),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false);
		ContainerColorTokens ceruleanRolloverHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFF7E5C4),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false);
		ContainerColorTokens ceruleanTextHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFEDB7C),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false);
		ContainerColorTokens ceruleanDeterminateContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFCFEAFE),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isFidelity */ true,
			/* isDark */ false);

		RadianceColorSchemeBundle ceruleanDefaultBundle =
			new RadianceColorSchemeBundle(ceruleanColorScheme);
		// More saturated blue seed for controls in selected state
		ceruleanDefaultBundle.registerActiveContainerTokens(ceruleanSelectedContainerTokens,
			ComponentState.SELECTED);
		// Yellow saturated seed for selected highlights
		ceruleanDefaultBundle.registerActiveContainerTokens(
			ceruleanSelectedHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.SELECTED, ComponentState.ARMED);
		// Lighter yellow seed for rollover highlights
		ceruleanDefaultBundle.registerActiveContainerTokens(
			ceruleanRolloverHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_SELECTED,
			ComponentState.ROLLOVER_MIXED);
		// Text highlights
		ceruleanDefaultBundle.registerActiveContainerTokens(
			ceruleanTextHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		// Progress bars
		ceruleanDefaultBundle.registerActiveContainerTokens(ceruleanDeterminateContainerTokens,
			ComponentState.DETERMINATE, ComponentState.INDETERMINATE);
		this.registerDecorationAreaSchemeBundle(ceruleanDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		RadianceColorSchemeBundle ceruleanDefaultHeaderBundle =
			new RadianceColorSchemeBundle(ColorSchemeUtils.getColorScheme(
				/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
					Hct.fromInt(0xFF3B7BA8), Hct.fromInt(0xFF5B9BC8), Hct.fromInt(0xFF8BCBF8)),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isDark */ true));
		ceruleanDefaultHeaderBundle.registerActiveContainerTokens(
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF638EA8),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ true),
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(ceruleanDefaultHeaderBundle,
			ceruleanDefaultHeaderBundle.getMainColorScheme().getExtendedTonalContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.registerAsDecorationArea(
			ColorSchemeUtils.getExtendedContainerTokens(
				/* seed */ Hct.fromInt(0xFFCBD1D7),
				/* isFidelity */ true,
				/* isDark */ false),
			RadianceThemingSlices.DecorationAreaType.FOOTER,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new ClassicTonalFillPainter(), 1.0f);
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightFillPainter = new GlassTonalFillPainter();
		this.borderPainter = new FlatTonalBorderPainter();
		this.highlightBorderPainter = new FlatTonalBorderPainter();
	}
}
