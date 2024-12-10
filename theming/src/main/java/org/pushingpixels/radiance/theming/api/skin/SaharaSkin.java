/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.DesertSandColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.MetallicColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.Palettes;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;
import org.pushingpixels.radiance.theming.api.palette.TonalSkin;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Sahara</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class SaharaSkin extends RadianceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Sahara";

	/**
	 * Creates a new <code>Sahara</code> skin.
	 */
	public SaharaSkin() {
		RadianceColorScheme activeScheme = new DesertSandColorScheme();
		RadianceColorScheme enabledScheme = new MetallicColorScheme();

		ColorSchemes kitchenSinkSchemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/kitchen-sink.colorschemes"));
		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
				activeScheme, enabledScheme, kitchenSinkSchemes.get("Gray Disabled"));
		defaultSchemeBundle.registerHighlightColorScheme(
				kitchenSinkSchemes.get("Sahara Highlight"));
		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
				RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(activeScheme,
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER);

		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
				RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.MID);
		this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new ClassicFillPainter(), 1.0f);
		this.borderPainter = new ClassicBorderPainter();
		this.decorationPainter = new MatteDecorationPainter();
		this.highlightFillPainter = new ClassicFillPainter();
	}

	public static class SaharaTonalSkin extends SaharaSkin implements TonalSkin {
		public static final String NAME = "Sahara Tonal";

		public SaharaTonalSkin() {
			Hct desertSandHct = Hct.fromInt(0xFFB6C877);
			double desertSandHue = desertSandHct.getHue();
			double desertSandChroma = desertSandHct.getChroma();

			TonalPalette desertSandPrimary =
				TonalPalette.fromHueAndChroma(desertSandHue, desertSandChroma);
			TonalPalette desertSandNeutral = TonalPalette.fromHueAndChroma(desertSandHue, 0.0);
			TonalPalette desertSandNeutralVariant = TonalPalette.fromHueAndChroma(desertSandHue, 3.0);

			Palettes desertSandPalettes = Palettes.builder()
				.setNeutralPalette(desertSandNeutral)
				.setNeutralVariantPalette(desertSandNeutralVariant)
				.setPrimaryPalette(desertSandPrimary)
				.build();

			RadianceColorScheme2 desertSandColorScheme = ColorSchemeUtils.getLightColorScheme(
				desertSandPalettes, ColorSchemeUtils.ActiveStatesContainerType.TONAL);

			RadianceColorSchemeBundle2 desertSandDefaultBundle =
				new RadianceColorSchemeBundle2(desertSandColorScheme);

			Hct desertHighlightHct = Hct.fromInt(0xFFB9BFA1);
			double desertHighlightHue = desertHighlightHct.getHue();
			double desertHighlightChroma = desertHighlightHct.getChroma();

			TonalPalette desertHighlightPrimary =
				TonalPalette.fromHueAndChroma(desertHighlightHue, desertHighlightChroma);
			TonalPalette desertHighlightNeutral =
				TonalPalette.fromHueAndChroma(desertHighlightHue, 2.0);
			TonalPalette desertHighlightNeutralVariant =
				TonalPalette.fromHueAndChroma(desertHighlightHue, 4.0);

			Palettes desertHighlightPalettes = Palettes.builder()
				.setNeutralPalette(desertHighlightNeutral)
				.setNeutralVariantPalette(desertHighlightNeutralVariant)
				.setPrimaryPalette(desertHighlightPrimary)
				.build();

			RadianceColorScheme2 desertHighlightColorScheme = ColorSchemeUtils.getLightColorScheme(
				desertHighlightPalettes, ColorSchemeUtils.ActiveStatesContainerType.TONAL);

			desertSandDefaultBundle.registerColorScheme(desertHighlightColorScheme,
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());

			this.registerDecorationAreaSchemeBundle(desertSandDefaultBundle,
				RadianceThemingSlices.DecorationAreaType.NONE);

			this.registerAsDecorationArea(
				desertSandColorScheme.getTonalSurfaceRenderColorTokens(),
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER);

			this.buttonShaper = new ClassicButtonShaper();
			this.fillPainter = new SpecularRectangularFillPainter(new ClassicTonalFillPainter(), 1.0f);
			this.borderPainter = new ClassicTonalBorderPainter();
			this.decorationPainter = new MatteDecorationPainter();
			this.highlightFillPainter = new ClassicTonalFillPainter();
		}

		@Override
		public String getDisplayName() {
			return SaharaTonalSkin.NAME;
		}
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
