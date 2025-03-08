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
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Graphite</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class GraphiteAccentedSkin extends RadianceSkin.Accented {
	protected RadianceColorSchemeBundle graphiteDefaultBundle;

	/**
	 * Creates a new accented <code>Graphite</code> skin.
	 */
	protected GraphiteAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		this.graphiteDefaultBundle = new RadianceColorSchemeBundle(
			/* tonalContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF636363),
				/* containerConfiguration */ ContainerConfiguration.defaultDark(),
				/* colorResolver */ this.getDefaultAreaPaletteColorResolver()),
			/* mutedContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF424242),
				/* containerConfiguration */ ContainerConfiguration.defaultDark(),
				/* colorResolver */ this.getDefaultAreaPaletteColorResolver()),
			/* neutralContainerTokens */ ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF424242),
				/* containerConfiguration */ ContainerConfiguration.defaultDark(),
				/* colorResolver */ this.getDefaultAreaPaletteColorResolver()),
			/* isSystemDark */ true);

		this.graphiteDefaultBundle.registerActiveContainerTokens(this.getDefaultAreaSelectedTokens(),
			ComponentState.ROLLOVER_UNSELECTED,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
		// Highlights
		this.graphiteDefaultBundle.registerActiveContainerTokens(
			this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		// Tabs
		this.graphiteDefaultBundle.registerActiveContainerTokens(
			this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		// Text highlights
		this.graphiteDefaultBundle.registerActiveContainerTokens(
			this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		this.registerDecorationAreaSchemeBundle(this.graphiteDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.buttonShaper = new ClassicButtonShaper();
		this.borderPainter = new CompositeBorderPainter("Graphite",
			new FlatBorderPainter(),
			new FractionBasedTonalBorderPainter("Graphite Inner",
				new float[] {0.0f, 0.5f, 1.0f},
				new int[] {92, 64, 92},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline
				}));
		this.highlightBorderPainter = new FlatBorderPainter();
		this.fillPainter = new FractionBasedFillPainter("Graphite",
			new float[] {0.0f, 0.5f, 1.0f},
			new ContainerColorTokensSingleColorQuery[] {
				ContainerColorTokens::getContainerSurfaceHigh,
				ContainerColorTokens::getContainerSurface,
				ContainerColorTokens::getContainerSurface
			});
		this.decorationPainter = new FlatDecorationPainter();
		this.highlightFillPainter = new MatteFillPainter();
	}
}
