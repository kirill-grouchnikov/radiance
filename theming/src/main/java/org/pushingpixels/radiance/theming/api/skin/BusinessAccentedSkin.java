/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.decorator.rootpane.DefaultRootPaneDecorator;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.BrushedMetalDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FlatSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ColorTransform;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper;

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

		ContainerColorTokensBundle businessDefaultBundle =
			new ContainerColorTokensBundle(this.getDefaultAreaActiveTokens(),
				this.getDefaultAreaMutedTokens(), this.getDefaultAreaNeutralTokens(), false);
		businessDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		businessDefaultBundle.registerActiveContainerTokens(
			this.getDefaultAreaActiveTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		this.registerDecorationAreaTokensBundle(businessDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		ContainerColorTokensBundle businessDefaultHeaderBundle =
			new ContainerColorTokensBundle(this.getHeaderAreaActiveTokens(),
				this.getHeaderAreaMutedTokens(), this.getHeaderAreaNeutralTokens(),
				this.isHeaderDark());
		if (this.getHeaderAreaHighlightTokens() != null) {
			businessDefaultHeaderBundle.registerActiveContainerTokens(
				this.getHeaderAreaHighlightTokens(),
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());
		}
		this.registerDecorationAreaTokensBundle(businessDefaultHeaderBundle,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

        this.registerComponentShaper(new ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);
		this.surfacePainter = new SpecularRectangularSurfacePainter(new ClassicSurfacePainter(), 1.0f);
		this.outlinePainter = new FlatOutlinePainter();

		BrushedMetalDecorationPainter decorationPainter = new BrushedMetalDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.2f);

		// add an overlay painter to paint a drop shadow along the top edge of toolbars
		decorationPainter.addOverlayPainter(TopShadowOverlayPainter.getInstance(80),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		BottomLineOverlayPainter bottomLineOverlayPainter = new BottomLineOverlayPainter(
			ContainerColorTokensSingleColorQuery.composite(
				ContainerColorTokens::getContainerOutline,
				ColorTransform.alpha(128)));
		decorationPainter.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

		this.decorationPainter = decorationPainter;

		this.highlightSurfacePainter = new FlatSurfacePainter("Business",
			(colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceHighest()
				: colorTokens.getContainerSurfaceLowest());

		this.rootPaneDecorator = new DefaultRootPaneDecorator();
	}

	protected abstract boolean isHeaderDark();
}
