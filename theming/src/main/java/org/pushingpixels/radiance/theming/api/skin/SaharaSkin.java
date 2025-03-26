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
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
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

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public SaharaSkin() {
		ContainerColorTokensBundle desertSandDefaultBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFA5BB59),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFD5D9DE),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFEFF5FB),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* isSystemDark */ false);

		ContainerColorTokens desertHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFCAD0BE),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());
		desertSandDefaultBundle.registerActiveContainerTokens(desertHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(desertSandDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);


		ContainerColorTokensBundle desertSandHeaderBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFA2B851),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF99A764),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFEFF5FB),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* isSystemDark */ false);
		ContainerColorTokens desertHeaderHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFB2BC91),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());
		desertSandHeaderBundle.registerActiveContainerTokens(desertHeaderHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(desertSandHeaderBundle,
			desertSandHeaderBundle.getMutedContainerTokens(),
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
			ContainerColorTokens::getContainerOutline);
		this.addOverlayPainter(bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.surfacePainter = new SpecularRectangularSurfacePainter(new ClassicSurfacePainter(), 1.0f);
		this.outlinePainter = new FlatOutlinePainter();
		this.decorationPainter = new MatteDecorationPainter();
		this.highlightSurfacePainter = new ClassicSurfacePainter();
	}
}
