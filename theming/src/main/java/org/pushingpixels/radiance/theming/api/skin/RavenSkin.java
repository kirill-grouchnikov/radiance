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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.GlassSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverOverlay;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverUtils;
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
		ContainerColorTokensBundle ravenDefaultBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF424242),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.4),
				/* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
					// For active containers, use higher alpha values for
					// disabled controls for better contrast.
					TokenPaletteColorResolverOverlay.builder()
						.containerSurfaceDisabledAlpha((s) -> 0.4f)
						.onContainerDisabledAlpha((s) -> 0.3f)
						.containerOutlineDisabledAlpha((s) -> 0.55f)
						.build())),
			/* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF504842),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.4),
			/* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
				// For muted containers (enabled controls), use higher alpha values for
				// disabled controls for better contrast.
				TokenPaletteColorResolverOverlay.builder()
					.containerSurfaceDisabledAlpha((s) -> 0.5f)
					.onContainerDisabledAlpha((s) -> 0.3f)
					.containerOutlineDisabledAlpha((s) -> 0.55f)
					.build())),
			/* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF333333),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.4)),
			/* isSystemDark */ true);

		ContainerColorTokens ravenHighlightContainerTokens =
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFC4C3C5),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());

		ContainerColorTokens ravenSelectedContainerTokens =
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFCDD0D5),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ false,
					/* contrastLevel */ 0.3),
				/* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
					TokenPaletteColorResolverOverlay.builder()
						.containerSurfaceDisabledAlpha((s) -> 0.4f)
						.onContainerDisabledAlpha((s) -> 1.0f)
						.containerOutlineDisabledAlpha((s) -> 0.55f)
						.build()
				));

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

		this.registerDecorationAreaTokensBundle(ravenDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		// Decoration areas
		this.registerAsDecorationArea(
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF4E463E),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.6)),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.registerButtonShaper(new ClassicButtonShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);
		this.surfacePainter = new SpecularRectangularSurfacePainter(
			new GlassSurfacePainter(), 0.5f);
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightSurfacePainter = new ClassicSurfacePainter();
		this.outlinePainter = new FlatOutlinePainter();
	}
}
