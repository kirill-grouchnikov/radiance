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
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.TopLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.GlassSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.SpecularRectangularSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.ColorTransform;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;

/**
 * <code>Graphite Glass</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class GraphiteGlassSkin extends GraphiteSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Graphite Glass";

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public GraphiteGlassSkin() {
		super();

		// Headers
		this.registerAsDecorationArea(
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF4F4F4F),
				/* containerConfiguration */ ContainerConfiguration.defaultDark()),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		this.surfacePainter = new SpecularRectangularSurfacePainter(new FractionBasedSurfacePainter(
			"Graphite Glass",
			new float[] {0.0f, 0.4999999f, 0.5f, 1.0f},
			new ContainerColorTokensSingleColorQuery[] {
				ContainerColorTokens::getContainerSurfaceHigh,
				ContainerColorTokensSingleColorQuery.blend(
					ContainerColorTokens::getContainerSurfaceHigh,
					ContainerColorTokens::getContainerSurfaceHighest,
					0.5f),
				ContainerColorTokens::getContainerSurface,
				ContainerColorTokens::getContainerSurface
			}), 1.0f);

		this.decorationPainter = new ArcDecorationPainter();
		// add two overlay painters to create a bezel line between
		// menu bar and toolbars
		RadianceOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
			ContainerColorTokens::getContainerOutline);
		RadianceOverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
			ContainerColorTokensSingleColorQuery.composite(
				ContainerColorTokens::getInverseContainerOutline,
				ColorTransform.alpha(96)));
		this.decorationPainter.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
		this.decorationPainter.addOverlayPainter(toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.highlightSurfacePainter = new GlassSurfacePainter();
	}
}
