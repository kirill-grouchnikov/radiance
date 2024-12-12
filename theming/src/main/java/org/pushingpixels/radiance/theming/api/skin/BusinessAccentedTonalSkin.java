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
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.BrushedMetalDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Business</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BusinessAccentedTonalSkin extends RadianceSkin.TonalAccented {
	/**
	 * Creates a new accented <code>Business</code> skin.
	 */
	protected BusinessAccentedTonalSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		RadianceColorSchemeBundle2 businessDefaultBundle =
			new RadianceColorSchemeBundle2(this.getActiveControlsAccent());
		businessDefaultBundle.registerColorScheme(this.getHighlightsAccent(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		// TODO: TONAL tabs
//		defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(),
//				RadianceThemingSlices.ColorSchemeAssociationKind.TAB, ComponentState.SELECTED,
//				ComponentState.ROLLOVER_SELECTED);
		this.registerDecorationAreaSchemeBundle(businessDefaultBundle,
			businessDefaultBundle.getMainColorScheme().getTonalSurfaceRenderColorTokens(),
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(this.getWindowChromeAccent().getTonalSurfaceRenderColorTokens(),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		RadianceColorScheme2 controlPaneColorScheme =
			ColorSchemeUtils.getLightTonalBalancedColorScheme(Hct.fromInt(0xFFDBDFE4), 3.0, 1.0);
		this.registerAsDecorationArea(controlPaneColorScheme.getTonalSurfaceRenderColorTokens(),
				RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

		// add an overlay painter to paint a drop shadow along the top edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(80),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.MID);
		this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new ClassicTonalFillPainter(), 1.0f);
		this.borderPainter = new ClassicTonalBorderPainter();

		BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.2f);
		this.decorationPainter = decorationPainter;

		this.highlightFillPainter = new ClassicTonalFillPainter();

		// TODO - TONAL : remove this altogether
		ColorSchemes businessSchemes = RadianceSkin.getColorSchemes(
			this.getClass().getClassLoader().getResourceAsStream(
				"org/pushingpixels/radiance/theming/api/skin/business.colorschemes"));

		RadianceColorScheme activeScheme = businessSchemes.get("Business Active");
		RadianceColorScheme enabledScheme = businessSchemes.get("Business Enabled");

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
			activeScheme, enabledScheme, enabledScheme);
		defaultSchemeBundle.registerHighlightColorScheme(businessSchemes.get("Business Highlight"));
		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(enabledScheme, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme,
			ComponentState.DISABLED_SELECTED, ComponentState.SELECTED);

		defaultSchemeBundle.registerColorScheme(activeScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.TAB, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(enabledScheme,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.FOOTER);
	}
}
