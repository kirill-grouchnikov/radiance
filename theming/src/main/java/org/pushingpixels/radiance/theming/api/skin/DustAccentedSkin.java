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
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.CompositeOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FractionBasedOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.MatteSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Dust</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class DustAccentedSkin extends RadianceSkin.Accented {
	/**
	 * Creates a new accented <code>Dust</code> skin.
	 */
	protected DustAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		ContainerColorTokensBundle dustDefaultBundle = new ContainerColorTokensBundle(
			this.getDefaultAreaActiveTokens(), this.getDefaultAreaMutedTokens(),
			this.getDefaultAreaNeutralTokens(), false);
		dustDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaSelectedTokens(),
			ComponentState.SELECTED);
		dustDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		dustDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		this.registerDecorationAreaSchemeBundle(dustDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		ContainerColorTokensBundle dustHeaderBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF5E3D2B),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.4)),
			/* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF3C3B37),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.4)),
			/* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF2B2A28),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.4)),
			/* isSystemDark */ true);
		dustHeaderBundle.registerActiveContainerTokens(
			this.getHeaderAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		this.registerDecorationAreaSchemeBundle(dustHeaderBundle,
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF2B2A28),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ true,
					/* contrastLevel */ 0.2)),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		this.registerDecorationAreaSchemeBundle(dustHeaderBundle,
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF3A3935),
				/* containerConfiguration */ ContainerConfiguration.defaultDark()),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add two overlay painters to create a bezel line between menu bar and toolbars
		BottomLineOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
			ContainerColorTokens::getContainerOutline);
		RadianceOverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
			ContainerColorTokensSingleColorQuery.composite(
				ContainerColorTokens::getInverseContainerOutline,
				ColorTransform.alpha(96)));
		this.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
		this.addOverlayPainter(toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.surfacePainter = new SpecularRectangularSurfacePainter(new MatteSurfacePainter(), 0.3f);
		this.decorationPainter = new FlatDecorationPainter();
		this.highlightSurfacePainter = new MatteSurfacePainter();
		this.outlinePainter = new CompositeOutlinePainter("Dust",
			new FlatOutlinePainter(),
			new FractionBasedOutlinePainter("Dust Inner",
				new float[] {0.0f, 1.0f},
				new int[] {64, 64},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline
				}));
	}
}
