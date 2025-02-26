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
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle2;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.GlassTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
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

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public RavenSkin() {
		SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();
		// Set up token resolution overlays
		SchemeColorResolver ravenColorResolver = defaultSchemeColorResolver.overlayWith(
			SchemeColorResolverOverlay.builder()
				// For muted containers (enabled controls), use higher alpha values for
				// disabled controls for better contrast.
				.mutedContainerResolverOverlay(
					SchemeContainerColorsResolverOverlay.builder()
						.containerSurfaceDisabledAlpha((s) -> 0.5f)
						.onContainerDisabledAlpha((s) -> 0.3f)
						.containerOutlineDisabledAlpha((s) -> 0.55f)
						.build())
				// For tonal containers (active controls), use higher alpha values for
				// disabled controls for better contrast.
				.tonalContainerResolverOverlay(
					SchemeContainerColorsResolverOverlay.builder()
						.containerSurfaceDisabledAlpha((s) -> 0.4f)
						.onContainerDisabledAlpha((s) -> 0.3f)
						.containerOutlineDisabledAlpha((s) -> 0.55f)
						.build())
				.build());

		RadianceColorScheme2 ravenColorScheme = ColorSchemeUtils.getColorScheme(
			/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
				Hct.fromInt(0xFF424242), Hct.fromInt(0xFF504842), Hct.fromInt(0xFF333333)),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isPrimaryDark */ true,
			/* isTonalDark */ true,
			/* isMutedDark */ true,
			/* isNeutralDark */ true,
			/* isSystemDark */ true,
			/* primaryContrastLevel */ 0.0f,
			/* tonalContrastLevel */ 0.4f,
			/* mutedContrastLevel */ 0.4f,
			/* neutralContrastLevel */ 0.4f,
			/* schemeColorResolver */ ravenColorResolver);

		ContainerColorTokens ravenHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFC4C3C5),
				/* activeContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false);

		ContainerColorTokens ravenSelectedContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFCDD0D5),
				/* isFidelity */ false,
				/* isDark */ false,
				/* contrast */ 0.3f,
				/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
					PaletteContainerColorsResolverOverlay.builder()
						.containerSurfaceDisabledAlpha((s) -> 0.4f)
						.onContainerDisabledAlpha((s) -> 1.0f)
						.containerOutlineDisabledAlpha((s) -> 0.55f)
						.build()
				));

		RadianceColorSchemeBundle2 ravenDefaultBundle =
			new RadianceColorSchemeBundle2(ravenColorScheme);
		// Highlight tokens for controls in selected states
		ravenDefaultBundle.registerActiveContainerTokens(ravenSelectedContainerTokens,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
		// Highlight rollover for controls in rollover state
		ravenDefaultBundle.registerActiveContainerTokens(ravenHighlightContainerTokens,
			ComponentState.ROLLOVER_UNSELECTED);
		// Highlights
		ravenDefaultBundle.registerActiveContainerTokens(
			ravenHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());

		this.registerDecorationAreaSchemeBundle(ravenDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		// Decoration areas
		this.registerAsDecorationArea(
			ColorSchemeUtils.getExtendedContainerTokens(
				/* seed */ Hct.fromInt(0xFF4E463E),
				/* isFidelity */ true,
				/* isDark */ true,
				/* contrastLevel */ 0.6f,
				/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(
			new GlassTonalFillPainter(), 0.5f);
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightFillPainter = new ClassicTonalFillPainter();
		this.borderPainter = new FlatTonalBorderPainter();
	}
}
