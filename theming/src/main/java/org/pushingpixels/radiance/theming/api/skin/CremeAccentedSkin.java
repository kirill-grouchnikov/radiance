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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.InlayOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FlatSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper;

/**
 * Base class for accented <code>Creme</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class CremeAccentedSkin extends RadianceSkin.Accented {
	/**
	 * Creates a new accented <code>Creme</code> skin.
	 */
	protected CremeAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		ContainerColorTokensBundle cremeDefaultBundle = new ContainerColorTokensBundle(
			this.getDefaultAreaActiveTokens(), this.getDefaultAreaMutedTokens(),
			this.getDefaultAreaNeutralTokens(), false);
		cremeDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaSelectedTokens(),
			ComponentState.SELECTED);
		cremeDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		cremeDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		this.registerDecorationAreaTokensBundle(cremeDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFEBECE5),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ false,
					/* contrastLevel */ 0.8)),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

        this.registerComponentShaper(new ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);
		this.surfacePainter = new SpecularRectangularSurfacePainter(new MatteSurfacePainter(), 0.5f);

		this.decorationPainter = new ArcDecorationPainter();
		// Add overlay painters to paint drop shadows along the bottom edges of toolbars
		this.decorationPainter.addOverlayPainter(BottomShadowOverlayPainter.getInstance(40),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint a dark line along the bottom edge of toolbars
		RadianceDecorationPainter.OverlayPainter toolbarBottomLineOverlayPainter = new BottomLineOverlayPainter(
			ContainerColorTokens::getContainerOutline);
		this.decorationPainter.addOverlayPainter(toolbarBottomLineOverlayPainter,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.highlightSurfacePainter = new FlatSurfacePainter("Creme", ContainerColorTokens::getContainerSurface);
		this.outlinePainter = InlayOutlinePainter.builder()
            .displayName("Creme")
            .outer(ContainerColorTokens::getContainerOutline)
            .inner(
				new float[] {0.0f, 1.0f},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline
				})
            .build();
	}
}
