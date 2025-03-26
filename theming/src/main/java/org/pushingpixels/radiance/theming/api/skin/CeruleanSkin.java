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
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.GlassSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * <code>Cerulean</code> skin. This class is part of officially supported API.
 * 
 * @author Danno Ferrin
 */
public class CeruleanSkin extends RadianceSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Cerulean";

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public CeruleanSkin() {
		ContainerColorTokensBundle ceruleanDefaultBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFD2E0ED),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFECECED),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFBFCFC),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* isSystemDark */ false);

		ContainerColorTokens ceruleanSelectedContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFC0DBEE),
			/* containerConfiguration */ ContainerConfiguration.defaultLight());
		ContainerColorTokens ceruleanSelectedHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFBDCA1),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());
		ContainerColorTokens ceruleanRolloverHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFF7E5C4),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());
		ContainerColorTokens ceruleanTextHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFEDB7C),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());
		ContainerColorTokens ceruleanDeterminateContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFCFEAFE),
			/* containerConfiguration */ ContainerConfiguration.defaultLight());

		// More saturated blue seed for controls in selected state
		ceruleanDefaultBundle.registerActiveContainerTokens(ceruleanSelectedContainerTokens,
			ComponentState.SELECTED);
		// Yellow saturated seed for selected highlights
		ceruleanDefaultBundle.registerActiveContainerTokens(
			ceruleanSelectedHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.SELECTED, ComponentState.ARMED);
		// Lighter yellow seed for rollover highlights
		ceruleanDefaultBundle.registerActiveContainerTokens(
			ceruleanRolloverHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ROLLOVER_SELECTED,
			ComponentState.ROLLOVER_MIXED);
		// Text highlights
		ceruleanDefaultBundle.registerActiveContainerTokens(
			ceruleanTextHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		// Progress bars
		ceruleanDefaultBundle.registerActiveContainerTokens(ceruleanDeterminateContainerTokens,
			ComponentState.DETERMINATE, ComponentState.INDETERMINATE);
		this.registerDecorationAreaSchemeBundle(ceruleanDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		ContainerColorTokensBundle ceruleanHeaderBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFC0DBEE),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF3B7BA8),
				/* containerConfiguration */ ContainerConfiguration.defaultDark()),
			/* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF8BCBF8),
				/* containerConfiguration */ ContainerConfiguration.defaultDark()),
			/* isSystemDark */ true);
		ceruleanHeaderBundle.registerActiveContainerTokens(
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF638EA8),
				/* containerConfiguration */ ContainerConfiguration.defaultDark()),
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(ceruleanHeaderBundle,
			ceruleanHeaderBundle.getMutedContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.registerAsDecorationArea(
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFCBD1D7),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			RadianceThemingSlices.DecorationAreaType.FOOTER,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

		this.buttonShaper = new ClassicButtonShaper();
		this.surfacePainter = new SpecularRectangularSurfacePainter(new ClassicSurfacePainter(), 1.0f);
		this.decorationPainter = new ArcDecorationPainter();
		this.highlightSurfacePainter = new GlassSurfacePainter();
		this.outlinePainter = new FlatOutlinePainter();
		this.highlightOutlinePainter = new FlatOutlinePainter();
	}
}
