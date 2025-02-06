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
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.CremeColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.PaletteResolverUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Creme</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class CremeAccentedTonalSkin extends RadianceSkin.TonalAccented {
	/**
	 * Creates a new accented <code>Creme</code> skin.
	 */
	protected CremeAccentedTonalSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		RadianceColorSchemeBundle2 cremeDefaultBundle =
			new RadianceColorSchemeBundle2(this.getDefaultAreaColorScheme());
		cremeDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaSelectedTokens(),
			ComponentState.SELECTED);
		cremeDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		cremeDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		this.registerDecorationAreaSchemeBundle(cremeDefaultBundle,
			cremeDefaultBundle.getMainColorScheme().getExtendedTonalContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(
			ColorSchemeUtils.getExtendedContainerTokens(
				/* seed */ Hct.fromInt(0xFFEBECE5),
				/* isFidelity */ true,
				/* isDark */ false,
				/* contrast */ 0.8f,
				/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		// Add overlay painters to paint drop shadows along the bottom edges of toolbars
		this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(40),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint a dark line along the bottom edge of toolbars
		RadianceOverlayPainter toolbarBottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
			ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE);
		this.addOverlayPainter(toolbarBottomLineOverlayPainter,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new MatteTonalFillPainter(), 0.5f);
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightFillPainter = new MatteTonalFillPainter();
		this.borderPainter = new CompositeBorderPainter("Creme",
			new ClassicTonalBorderPainter(),
			new FractionBasedTonalBorderPainter("Creme Inner",
				new float[] {0.0f, 1.0f},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokensSingleColorQuery.COMPLEMENTARY_CONTAINER_OUTLINE,
					ContainerColorTokensSingleColorQuery.COMPLEMENTARY_CONTAINER_OUTLINE
				}));

		// TODO - TONAL : remove this altogether
		ColorSchemes kitchenSinkSchemes = RadianceSkin.getColorSchemes(
			this.getClass().getClassLoader().getResourceAsStream(
				"org/pushingpixels/radiance/theming/api/skin/kitchen-sink.colorschemes"));
		RadianceColorScheme activeScheme = kitchenSinkSchemes.get("Creme Active");
		RadianceColorScheme enabledScheme = new CremeColorScheme();
		RadianceColorScheme disabledScheme = kitchenSinkSchemes.get("Creme Disabled");
		RadianceColorScheme highlightsScheme = kitchenSinkSchemes.get("Creme Highlights");

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
			activeScheme, enabledScheme, disabledScheme);
		defaultSchemeBundle.registerHighlightColorScheme(highlightsScheme);
		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(enabledScheme,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER, RadianceThemingSlices.DecorationAreaType.FOOTER,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE, RadianceThemingSlices.DecorationAreaType.TOOLBAR);
	}
}
