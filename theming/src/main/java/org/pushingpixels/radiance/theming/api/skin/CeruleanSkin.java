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
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.ClassicSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FlatSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicComponentShaper;

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
			/* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFD2E0ED),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFECECED),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFBFCFC),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* isSystemDark */ false);

		ContainerColorTokens ceruleanSelectedContainerTokens = ContainerColorTokensUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFC0DBEE),
			/* containerConfiguration */ ContainerConfiguration.defaultLight());
		ContainerColorTokens ceruleanSelectedHighlightContainerTokens =
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFBDCA1),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());
		ContainerColorTokens ceruleanRolloverHighlightContainerTokens =
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFF7E5C4),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());
		ContainerColorTokens ceruleanTextHighlightContainerTokens =
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFFEDB7C),
				/* containerConfiguration */ ContainerConfiguration.defaultLight());
		ContainerColorTokens ceruleanDeterminateContainerTokens = ContainerColorTokensUtils.getContainerTokens(
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
			ComponentState.getActiveStates());
		// Progress bars
		ceruleanDefaultBundle.registerActiveContainerTokens(ceruleanDeterminateContainerTokens,
			ComponentState.DETERMINATE, ComponentState.INDETERMINATE);
		this.registerDecorationAreaTokensBundle(ceruleanDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		ContainerColorTokensBundle ceruleanHeaderBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFC0DBEE),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* mutedContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF3B7BA8),
				/* containerConfiguration */ ContainerConfiguration.defaultDark()),
			/* neutralContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF3B7BA8),
				/* containerConfiguration */ ContainerConfiguration.defaultDark()),
			/* isSystemDark */ true);
		ceruleanHeaderBundle.registerActiveContainerTokens(
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFAEDCFF),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());
		// Text highlights
		ceruleanHeaderBundle.registerActiveContainerTokens(
			ceruleanTextHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaTokensBundle(ceruleanHeaderBundle,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		this.registerAsDecorationArea(
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFCBD1D7),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			RadianceThemingSlices.DecorationAreaType.FOOTER,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);

        this.registerComponentShaper(new ClassicComponentShaper(),
            RadianceThemingSlices.DecorationAreaType.NONE);
		this.surfacePainter = new SpecularRectangularSurfacePainter(new ClassicSurfacePainter(), 1.0f);

		this.decorationPainter = new ArcDecorationPainter();
		// add an overlay painter to paint a drop shadow along the top
		// edge of toolbars
		this.decorationPainter.addOverlayPainter(TopShadowOverlayPainter.getInstance(100),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.highlightSurfacePainter = new FlatSurfacePainter("Cerulean",
			(colorTokens) -> colorTokens.isDark() ? colorTokens.getContainerSurfaceLowest()
				: colorTokens.getContainerSurfaceHigh());
		this.outlinePainter = new FlatOutlinePainter();
		this.highlightOutlinePainter = new FlatOutlinePainter();
	}
}
