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
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.BrushedMetalDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Business</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BusinessAccentedSkin extends RadianceSkin.Accented {
	/**
	 * Creates a new accented <code>Business</code> skin.
	 */
	protected BusinessAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		RadianceColorSchemeBundle businessDefaultBundle =
			new RadianceColorSchemeBundle(this.getDefaultAreaColorScheme());
		businessDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		businessDefaultBundle.registerActiveContainerTokens(
			this.getDefaultAreaColorScheme().getActiveContainerTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		this.registerDecorationAreaSchemeBundle(businessDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		RadianceColorSchemeBundle businessDefaultHeaderBundle =
			new RadianceColorSchemeBundle(this.getHeaderAreaColorScheme());
		if (this.getHeaderAreaHighlightTokens() != null) {
			businessDefaultHeaderBundle.registerActiveContainerTokens(
				this.getHeaderAreaHighlightTokens(),
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());
		}
		this.registerDecorationAreaSchemeBundle(businessDefaultHeaderBundle,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		RadianceColorScheme controlPaneColorScheme = ColorSchemeUtils.getColorScheme(
			/* palettesSource */ new ColorSchemeUtils.BalancedPaletteSource(Hct.fromInt(0xFFDBDFE4), 3.0, 1.0),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isDark */ false);
		this.registerAsDecorationArea(controlPaneColorScheme.getTonalContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

		// add an overlay painter to paint a drop shadow along the top edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(80),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
			ContainerColorTokens::getContainerOutline);
		this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new ClassicFillPainter(), 1.0f);
		this.borderPainter = new ClassicBorderPainter();

		BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.2f);
		this.decorationPainter = decorationPainter;

		this.highlightFillPainter = new ClassicFillPainter();
	}
}
