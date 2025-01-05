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
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
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

		this.configureOverlayPainters();

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new ClassicFillPainter(), 1.0f);
		this.borderPainter = new ClassicBorderPainter();
		this.decorationPainter = new MatteDecorationPainter();
		this.highlightFillPainter = new ClassicFillPainter();
	}

	void configureOverlayPainters() {
		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
			ColorSchemeSingleColorQuery.MID);
		this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
	}

	public static class SaharaTonalSkin extends SaharaSkin implements TonalSkin {
		public static final String NAME = "Sahara Tonal";

		public SaharaTonalSkin() {
			RadianceColorScheme2 desertSandColorScheme =
				ColorSchemeUtils.getLightTonalFidelityColorScheme(Hct.fromInt(0xFFA5BB59),
					Hct.fromInt(0xFFD5D9DE), Hct.fromInt(0xFFEFF5FB));
			RadianceColorScheme2 desertHighlightColorScheme =
				ColorSchemeUtils.getLightTonalFidelityColorScheme(Hct.fromInt(0xFFCAD0BE),
					Hct.fromInt(0xFFD5D9DE), Hct.fromInt(0xFFEFF5FB));

			RadianceColorScheme2 desertHeaderColorScheme =
				ColorSchemeUtils.getLightTonalFidelityColorScheme(Hct.fromInt(0xFF99A764),
					Hct.fromInt(0xFFD5D9DE), Hct.fromInt(0xFFEFF5FB));
			RadianceColorScheme2 desertHeaderHighlightColorScheme =
				ColorSchemeUtils.getLightTonalBalancedColorScheme(Hct.fromInt(0xFFB2BC91), 4.0, 2.0);

			RadianceColorSchemeBundle2 desertSandDefaultBundle =
				new RadianceColorSchemeBundle2(desertSandColorScheme);
			desertSandDefaultBundle.registerColorScheme(desertHighlightColorScheme,
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());
			this.registerDecorationAreaSchemeBundle(desertSandDefaultBundle,
				RadianceThemingSlices.DecorationAreaType.NONE);

			RadianceColorSchemeBundle2 desertHeaderDefaultBundle =
				new RadianceColorSchemeBundle2(desertHeaderColorScheme);
			desertHeaderDefaultBundle.registerColorScheme(desertHeaderHighlightColorScheme,
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());
			this.registerDecorationAreaSchemeBundle(desertHeaderDefaultBundle,
				desertHeaderDefaultBundle.getMainColorScheme().getExtendedTonalContainerTokens(),
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
		void configureOverlayPainters() {
			// add an overlay painter to paint a drop shadow along the top
			// edge of toolbars
			this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
				RadianceThemingSlices.DecorationAreaType.TOOLBAR);

			// add an overlay painter to paint separator lines along the bottom
			// edges of title panes and menu bars
			BottomLineTonalOverlayPainter bottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
				ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE);
			this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
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
