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
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokensBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.shaper.PillButtonShaper;

/**
 * Base class for accented <code>Mist</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class MistAccentedSkin extends RadianceSkin.Accented {
	/**
	 * Creates a new accented <code>Mist</code> skin.
	 */
	protected MistAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		ContainerColorTokensBundle mistDefaultBundle = new ContainerColorTokensBundle(
			this.getDefaultAreaActiveTokens(), this.getDefaultAreaMutedTokens(),
			this.getDefaultAreaNeutralTokens(), false);
		mistDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		mistDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		this.registerDecorationAreaSchemeBundle(mistDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFB9C0C8),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ false,
					/* contrastLevel */ 0.4)),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		this.registerAsDecorationArea(
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFCDD8E0),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

		this.buttonShaper = new PillButtonShaper();
		this.surfacePainter = new SpecularRectangularSurfacePainter(new MatteSurfacePainter(), 1.0f);
		this.outlinePainter = new FlatOutlinePainter();

		this.decorationPainter = new MatteDecorationPainter();
		this.highlightSurfacePainter = new ClassicSurfacePainter();
	}
}
