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
import org.pushingpixels.ephemeral.chroma.palettes.TokenPalette;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.outline.FlatOutlinePainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverOverlay;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverUtils;

/**
 * <code>Graphite Chalk</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class GraphiteChalkSkin extends GraphiteSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Graphite Chalk";

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public GraphiteChalkSkin() {
		super(TokenPaletteColorResolverUtils.getPaletteColorResolver().overlayWith(
			TokenPaletteColorResolverOverlay.builder()
				.containerOutline((p) -> p.getComplementaryContainerOutline() & 0xA0FFFFFF)
				.containerOutlineVariant((p) -> p.getComplementaryContainerOutline() & 0x80FFFFFF)
				.complementaryContainerOutline(TokenPalette::getContainerOutline)
				.build()));

		ContainerColorTokens separatorTokens  = ContainerColorTokensUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFF424242),
			/* containerConfiguration */ new ContainerConfiguration(
				/* isDark */ true,
				/* contrastLevel */ 0.1,
				/* surfaceRangeAmplitudeFactor */ 1.0),
			/* colorResolver */ TokenPaletteColorResolverUtils.getPaletteColorResolver());

		this.graphiteDefaultBundle.registerNeutralContainerTokens(separatorTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.SEPARATOR);

		this.outlinePainter = new FlatOutlinePainter();
	}
}
