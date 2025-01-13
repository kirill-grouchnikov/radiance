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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.*;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.*;
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

	/**
	 * Creates a new <code>Autumn</code> skin.
	 */
	public AutumnSkin() {
		ColorSchemes schemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/autumn.colorschemes"));

		RadianceColorScheme activeScheme = schemes.get("Autumn Active");
		RadianceColorScheme enabledScheme = schemes.get("Autumn Enabled");
		RadianceColorScheme disabledScheme = enabledScheme;

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);
		defaultSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme, ComponentState.DISABLED_SELECTED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				RadianceThemingSlices.DecorationAreaType.NONE);

		RadianceColorSchemeBundle titlePaneSchemeBundle = new RadianceColorSchemeBundle(
				activeScheme, enabledScheme, disabledScheme);
		titlePaneSchemeBundle.registerAlpha(0.6f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		titlePaneSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
		titlePaneSchemeBundle.registerColorScheme(activeScheme, ComponentState.DISABLED_SELECTED);

		RadianceColorScheme borderScheme = enabledScheme.saturate(0.2f);
		titlePaneSchemeBundle.registerColorScheme(borderScheme,
				RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

		this.registerDecorationAreaSchemeBundle(titlePaneSchemeBundle,
				activeScheme, RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE);

		RadianceColorScheme backgroundScheme = schemes.get("Autumn Background");

		this.registerAsDecorationArea(activeScheme,
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER);

		if (!(this instanceof TonalSkin)) {
			this.registerAsDecorationArea(backgroundScheme,
				RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
				RadianceThemingSlices.DecorationAreaType.FOOTER,
				RadianceThemingSlices.DecorationAreaType.TOOLBAR);
		}

		this.configureOverlayPainters();

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new MatteFillPainter(), 1.0f);
		this.borderPainter = new CompositeBorderPainter("Autumn",
				new DelegateFractionBasedBorderPainter(
						"Autumn Outer", new ClassicBorderPainter(),
						new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF},
						scheme -> scheme.shade(0.1f)),
				new DelegateFractionBasedBorderPainter(
						"Autumn Inner", new ClassicBorderPainter(),
						new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF},
						scheme -> scheme.tint(0.8f)));

		this.highlightFillPainter = new ClassicFillPainter();

		MarbleNoiseDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
		decorationPainter.setTextureAlpha(0.7f);
		this.decorationPainter = decorationPainter;
	}

	void configureOverlayPainters() {
		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(50),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
			ColorSchemeSingleColorQuery.DARK);
		this.addOverlayPainter(bottomLineOverlayPainter,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public static class AutumnTonalSkin extends AutumnSkin implements TonalSkin {
		public static final String NAME = "Autumn Tonal";

		public AutumnTonalSkin() {
			SchemeColorResolver defaultSchemeColorResolver = SchemeResolverUtils.getSchemeColorResolver();
			// Set up token resolution overlays:
			// 1. Use tonal outlines for muted containers (consistent borders for enabled and active
			//    controls)
			// 2. Use tonal outlines for on container content (softer text and icon colors)
			SchemeColorResolver autumnColorResolver = defaultSchemeColorResolver.overlayWith(
				SchemeColorResolverOverlay.builder()
					// For neutral containers, use softer outlines and softer text / icon colors
					.neutralContainerResolverOverlay(
						SchemeContainerColorsResolverOverlay.builder()
							.containerOutline((s) -> s.getTonalContainerOutline() & 0x99FFFFFF)
							.containerOutlineVariant((s) -> s.getTonalContainerOutlineVariant() & 0x99FFFFFF)
							.onContainer(DynamicScheme::getTonalContainerOutline)
							.onContainerVariant(DynamicScheme::getTonalContainerOutlineVariant)
							.build())
					// For muted containers (enabled controls), use tonal outlines for border
					// consistency with active controls, and softer text / icon colors
					.mutedContainerResolverOverlay(
						SchemeContainerColorsResolverOverlay.builder()
							.containerOutline(DynamicScheme::getTonalContainerOutline)
							.containerOutlineVariant(DynamicScheme::getTonalContainerOutlineVariant)
							.onContainer(DynamicScheme::getTonalContainerOutline)
							.onContainerVariant(DynamicScheme::getTonalContainerOutlineVariant)
							.build())
					// For tonal containers (active controls), use softer text / icon colors
					.tonalContainerResolverOverlay(
						SchemeContainerColorsResolverOverlay.builder()
							.onContainer(DynamicScheme::getTonalContainerOutline)
							.onContainerVariant(DynamicScheme::getTonalContainerOutlineVariant)
							.build())
					.build());

			RadianceColorScheme2 autumnColorScheme = ColorSchemeUtils.getColorScheme(
				/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
					Hct.fromInt(0xFFFFCB90), Hct.fromInt(0xFFFEDCB6), Hct.fromInt(0xFFFFE2C1)),
				/* activeStatesContainerType */ ColorSchemeUtils.ActiveStatesContainerType.TONAL,
				/* isDark */ false,
				/* schemeColorResolver */ autumnColorResolver);

			RadianceColorSchemeBundle2 autumnDefaultBundle =
				new RadianceColorSchemeBundle2(autumnColorScheme);
			// Custom visuals for controls in selected state:
			// 1. Deeper container surfaces (more saturated seed in fidelity mode)
			// 2. Softer on container, mapped to container outline (used for texts and icons)
			autumnDefaultBundle.registerContainerTokens(ColorSchemeUtils.getContainerTokens(
					/* seed */ Hct.fromInt(0xFFFDBD72),
					/* isFidelity */ true,
					/* isDark */ false,
					/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
					PaletteContainerColorsResolverOverlay.builder()
						.onContainer(DynamicPalette::getTonalContainerOutline)
						.build())),
				ComponentState.SELECTED);
			this.registerDecorationAreaSchemeBundle(autumnDefaultBundle,
				RadianceThemingSlices.DecorationAreaType.NONE);

			this.registerDecorationAreaSchemeBundle(autumnDefaultBundle,
				ColorSchemeUtils.getExtendedContainerTokens(
					/* seed */ Hct.fromInt(0xFFFFCA8B),
					/* isFidelity */ true,
					/* isDark */ false,
					/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER);

			RadianceColorScheme2 autumnControlPaneColorScheme = ColorSchemeUtils.getColorScheme(
				/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
					Hct.fromInt(0xFFFDBD72), Hct.fromInt(0xFFFEDCB6), Hct.fromInt(0xFFFFDDB9)),
				/* activeStatesContainerType */ ColorSchemeUtils.ActiveStatesContainerType.TONAL,
				/* isDark */ false,
				/* schemeColorResolver */ autumnColorResolver);
			RadianceColorSchemeBundle2 autumnControlPaneBundle =
				new RadianceColorSchemeBundle2(autumnControlPaneColorScheme);
			this.registerDecorationAreaSchemeBundle(autumnControlPaneBundle,
				ColorSchemeUtils.getExtendedContainerTokens(
					/* seed */ Hct.fromInt(0xFFFED8B2),
					/* isFidelity */ true,
					/* isDark */ false,
					/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
				RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

			this.buttonShaper = new ClassicButtonShaper();
			this.fillPainter = new SpecularRectangularFillPainter(
				new MatteTonalFillPainter(),
				ContainerColorTokensSingleColorQuery.CONTAINER_LOW,
				ContainerColorTokensSingleColorQuery.CONTAINER_LOW,
				1.0f);
			this.borderPainter = new CompositeBorderPainter("Autumn",
				new SubduedTonalBorderPainter(),
				new DelegateFractionBasedTonalBorderPainter(
					"Autumn Inner", new SubduedTonalBorderPainter(),
					new int[]{0xFFFFFFFF, 0xFFFFFFFF},
					scheme -> ColorSchemeUtils.tint(scheme, 0.8f)));

			this.highlightFillPainter = new FractionBasedTonalFillPainter("Autumn",
				new float[] {0.0f, 0.5f, 1.0f},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokensSingleColorQuery.CONTAINER_HIGH,
					ContainerColorTokensSingleColorQuery.CONTAINER,
					ContainerColorTokensSingleColorQuery.CONTAINER_LOW
				});

			MarbleNoiseDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
			decorationPainter.setTextureAlpha(0.7f);
			this.decorationPainter = decorationPainter;
		}

		@Override
		void configureOverlayPainters() {
			// add an overlay painter to paint a drop shadow along the top
			// edge of toolbars
			this.addOverlayPainter(TopShadowOverlayPainter.getInstance(50),
				RadianceThemingSlices.DecorationAreaType.TOOLBAR);

			// add an overlay painter to paint separator lines along the bottom
			// edges of title panes and menu bars
			BottomLineTonalOverlayPainter bottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
				ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE_VARIANT);
			this.addOverlayPainter(bottomLineOverlayPainter,
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER);
		}

		@Override
		public String getDisplayName() {
			return AutumnTonalSkin.NAME;
		}
	}
}
