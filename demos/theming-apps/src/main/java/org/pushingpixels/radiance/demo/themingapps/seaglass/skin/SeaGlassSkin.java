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
package org.pushingpixels.radiance.demo.themingapps.seaglass.skin;

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

public class SeaGlassSkin extends RadianceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "SeaGlass";

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public SeaGlassSkin() {
		RadianceColorScheme seaGlassDefaultColorScheme = ColorSchemeUtils.getColorScheme(
			/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
				Hct.fromInt(0xFF6FA5E0), Hct.fromInt(0xFFC8E7FA), Hct.fromInt(0xFFFFFFFF)),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isDark */ false);
		ContainerColorTokens seaGlassHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF7DBFF1),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false);

		RadianceColorSchemeBundle seaGlassDefaultBundle =
			new RadianceColorSchemeBundle(seaGlassDefaultColorScheme);
		seaGlassDefaultBundle.registerActiveContainerTokens(
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF28A8EF),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false),
			ComponentState.DEFAULT);
		seaGlassDefaultBundle.registerActiveContainerTokens(seaGlassHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(seaGlassDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF75B4D8),
				/* activeContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE);

		this.addOverlayPainter(new BottomLineOverlayPainter(
				ContainerColorTokens::getContainerOutline),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new FractionBasedFillPainter(
			"Sea Glass",
			new float[] {0.0f, 0.49999f, 0.5f, 0.8f, 1.0f},
			new ContainerColorTokensSingleColorQuery[] {
				ContainerColorTokensSingleColorQuery.blend(
					ContainerColorTokens::getContainerSurfaceLowest,
					ContainerColorTokens::getContainerSurfaceLow,
					0.3f),
				ContainerColorTokens::getContainerSurfaceLow,
				ContainerColorTokens::getContainerSurface,
				ContainerColorTokens::getContainerSurfaceLow,
				ContainerColorTokensSingleColorQuery.blend(
					ContainerColorTokens::getContainerSurfaceLowest,
					ContainerColorTokens::getContainerSurfaceLow,
					0.6f),
			});

		this.decorationPainter = new FlatDecorationPainter();
		this.highlightFillPainter = new MatteFillPainter();

		this.borderPainter = new FractionBasedTonalBorderPainter("Sea Glass",
			new float[] {0.0f, 1.0f},
			new ContainerColorTokensSingleColorQuery[] {
				ContainerColorTokensSingleColorQuery.blend(
					ContainerColorTokens::getContainerOutlineVariant,
					ContainerColorTokens::getContainerOutline,
					0.5f),
				ContainerColorTokens::getContainerOutline
			});

		this.highlightBorderPainter = new FlatBorderPainter();
	}
}
