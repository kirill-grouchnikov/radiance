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
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Nebula</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class NebulaAccentedSkin extends RadianceSkin.Accented {
	/**
	 * Overlay painter to paint separator lines on some decoration areas.
	 */
	protected RadianceOverlayPainter bottomLineOverlayPainter;

	/**
	 * Creates a new accented <code>Nebula</code> skin.
	 */
	protected NebulaAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		ContainerColorTokensBundle nebulaDefaultBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFBAD2E3),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFD7DBE1),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFF3F7FD),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* isSystemDark */ false);

		ContainerColorTokens nebulaRolloverHighlightContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFF6B92AF),
			/* containerConfiguration */ ContainerConfiguration.defaultDark());
		ContainerColorTokens nebulaPressedContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFF276792),
			/* containerConfiguration */ ContainerConfiguration.defaultDark());
		ContainerColorTokens nebulaSelectedHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF5B85A6),
				/* containerConfiguration */ ContainerConfiguration.defaultDark());
		ContainerColorTokens nebulaDeterminateContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFD2852F),
			/* containerConfiguration */ ContainerConfiguration.defaultDark());

		nebulaDefaultBundle.registerActiveContainerTokens(nebulaPressedContainerTokens,
			ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// Highlights
		nebulaDefaultBundle.registerActiveContainerTokens(nebulaRolloverHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_UNSELECTED);
		nebulaDefaultBundle.registerActiveContainerTokens(nebulaSelectedHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.SELECTED);

		// Progress bars
		nebulaDefaultBundle.registerActiveContainerTokens(nebulaDeterminateContainerTokens,
			ComponentState.DETERMINATE, ComponentState.INDETERMINATE);

		this.registerDecorationAreaSchemeBundle(nebulaDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		ContainerColorTokens nebulaDecorationsColorTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFC2D1DA),
			/* containerConfiguration */ ContainerConfiguration.defaultLight());
		this.registerAsDecorationArea(nebulaDecorationsColorTokens,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		ContainerColorTokensBundle nebulaHeaderBundle = new ContainerColorTokensBundle(
			this.getHeaderAreaActiveTokens(), this.getHeaderAreaMutedTokens(),
			this.getHeaderAreaNeutralTokens(), false);
		nebulaHeaderBundle.registerActiveContainerTokens(
			nebulaRolloverHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(nebulaHeaderBundle,
			nebulaHeaderBundle.getMutedContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		// add an overlay painter to paint a drop shadow along the top edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(60),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		this.bottomLineOverlayPainter = new BottomLineOverlayPainter(
			ContainerColorTokens::getContainerOutline);
		this.addOverlayPainter(bottomLineOverlayPainter,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.surfacePainter = new SpecularRectangularSurfacePainter(new ClassicSurfacePainter(), 1.0f);
		this.outlinePainter = new FlatOutlinePainter();

		MarbleNoiseDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.5f);
		this.decorationPainter = decorationPainter;

		this.highlightSurfacePainter = new MatteSurfacePainter();
	}
}
