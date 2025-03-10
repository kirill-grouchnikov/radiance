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
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatVariantBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Autumn</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class AutumnSkin extends RadianceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Autumn";

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public AutumnSkin() {
		// For active containers, use softer text / icon colors.
		// Also use higher alpha values for disabled controls for better contrast.
		PaletteContainerColorsResolver resolver =
			PaletteResolverUtils.getPaletteColorResolver().overlayWith(
				PaletteContainerColorsResolverOverlay.builder()
					.onContainer(DynamicPalette::getContainerOutline)
					.onContainerVariant((p) -> p.getContainerOutline() & 0xC0FFFFFF)
					.containerSurfaceDisabledAlpha((s) -> 0.4f)
					.onContainerDisabledAlpha((s) -> 0.6f)
					.containerOutlineDisabledAlpha((s) -> 0.55f)
					.build());
		ContainerColorTokens autumnDefaultActiveTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFFFCB90),
			/* containerConfiguration */ ContainerConfiguration.defaultLight(),
			/* colorResolver */ resolver);

		// For muted containers (enabled controls), use tonal on container and container outline
		// values for consistency with active controls. Also use higher alpha values for disabled
		// controls for better contrast.
		PaletteContainerColorsResolver mutedResolver =
			PaletteResolverUtils.getPaletteColorResolver().overlayWith(
				PaletteContainerColorsResolverOverlay.builder()
					.containerOutline((p) -> autumnDefaultActiveTokens.getContainerOutline().getRGB())
					.containerOutlineVariant((p) -> autumnDefaultActiveTokens.getContainerOutlineVariant().getRGB())
					.complementaryContainerOutline((p) -> autumnDefaultActiveTokens.getComplementaryContainerOutline().getRGB())
					.onContainer((p) -> autumnDefaultActiveTokens.getOnContainer().getRGB())
					.onContainerVariant((p) -> autumnDefaultActiveTokens.getOnContainerVariant().getRGB())
					.containerSurfaceDisabledAlpha((s) -> 0.5f)
					.onContainerDisabledAlpha((s) -> 0.6f)
					.containerOutlineDisabledAlpha((s) -> 0.55f)
					.build());
		ContainerColorTokens autumnDefaultMutedTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFFEDCB6),
			/* containerConfiguration */ ContainerConfiguration.defaultLight(),
			/* colorResolver */ mutedResolver);

		// For neutral containers, use tonal on container and container outline
		// values for consistency with active controls.
		PaletteContainerColorsResolver neutralResolver =
			PaletteResolverUtils.getPaletteColorResolver().overlayWith(
				PaletteContainerColorsResolverOverlay.builder()
					.containerOutline((p) -> autumnDefaultActiveTokens.getContainerOutline().getRGB())
					.containerOutlineVariant((p) -> autumnDefaultActiveTokens.getContainerOutlineVariant().getRGB())
					.complementaryContainerOutline((p) -> autumnDefaultActiveTokens.getComplementaryContainerOutline().getRGB())
					.onContainer((p) -> autumnDefaultActiveTokens.getOnContainer().getRGB())
					.onContainerVariant((p) -> autumnDefaultActiveTokens.getOnContainerVariant().getRGB())
					.build());
		ContainerColorTokens autumnDefaultNeutralTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFFFE2C1),
			/* containerConfiguration */ ContainerConfiguration.defaultLight(),
			/* colorResolver */ neutralResolver);

		RadianceColorSchemeBundle autumnDefaultBundle =
			new RadianceColorSchemeBundle(autumnDefaultActiveTokens, autumnDefaultMutedTokens,
				autumnDefaultNeutralTokens, false);

		// Custom visuals for controls in selected state:
		// 1. Deeper container surfaces (more saturated seed in fidelity mode)
		// 2. Softer on container, mapped to container outline (used for texts and icons)
		// 3. Higher alpha values for disabled controls for better contrast
		autumnDefaultBundle.registerActiveContainerTokens(ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFDBD72),
				/* containerConfiguration */ ContainerConfiguration.defaultLight(),
				/* colorResolver */ resolver),
			ComponentState.SELECTED);
		autumnDefaultBundle.registerActiveContainerTokens(
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFCEF9F),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.2),
				/* colorResolver */ resolver),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(autumnDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		// Deeper container surfaces in title / header decoration areas, along with slightly
		// softer texts / icons (on container overlaid to be on container variant).
		this.registerDecorationAreaSchemeBundle(autumnDefaultBundle,
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFEC983),
				/* containerConfiguration */ ContainerConfiguration.defaultLight(),
				/* colorResolver */ PaletteResolverUtils.getPaletteColorResolver().overlayWith(
					PaletteContainerColorsResolverOverlay.builder()
						.onContainer(DynamicPalette::getOnContainerVariant)
						.build())),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		ContainerColorTokens autumnControlPaneActiveTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFFDBD72),
			/* containerConfiguration */ ContainerConfiguration.defaultLight(),
			/* colorResolver */ resolver);
		ContainerColorTokens autumnControlPaneMutedTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFFEDCB6),
			/* containerConfiguration */ ContainerConfiguration.defaultLight(),
			/* colorResolver */ mutedResolver);
		ContainerColorTokens autumnControlPaneNeutralTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFFFDDB9),
			/* containerConfiguration */ ContainerConfiguration.defaultLight(),
			/* colorResolver */ neutralResolver);

		RadianceColorSchemeBundle autumnControlPaneBundle =
			new RadianceColorSchemeBundle(autumnControlPaneActiveTokens, autumnControlPaneMutedTokens,
				autumnControlPaneNeutralTokens, false);
		autumnControlPaneBundle.registerActiveContainerTokens(
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFCEF9F),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.2)),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(autumnControlPaneBundle,
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFED8B2),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(50),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
			ContainerColorTokens::getContainerOutlineVariant);
				this.addOverlayPainter(bottomLineOverlayPainter,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(
			new MatteFillPainter(),
			ContainerColorTokens::getContainerSurfaceLow,
			ContainerColorTokens::getContainerSurfaceLow,
			1.0f);
		this.borderPainter = new CompositeBorderPainter("Autumn",
			new FlatVariantBorderPainter(),
			new FractionBasedTonalBorderPainter("Autumn Inner",
				new float[] {0.0f, 1.0f},
				new int[] {240, 240},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline
				}));

		this.highlightFillPainter = new FractionBasedFillPainter("Autumn",
			new float[] {0.0f, 0.5f, 1.0f},
			new ContainerColorTokensSingleColorQuery[] {
				ContainerColorTokens::getContainerSurfaceHigh,
				ContainerColorTokens::getContainerSurface,
				ContainerColorTokens::getContainerSurfaceLow
			});

		MarbleNoiseDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
		decorationPainter.setTextureAlpha(0.7f);
		this.decorationPainter = decorationPainter;
	}
}
