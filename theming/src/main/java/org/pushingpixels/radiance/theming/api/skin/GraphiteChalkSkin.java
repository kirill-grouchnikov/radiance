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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.palette.*;

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
		super(
			SchemeResolverUtils.getSchemeColorResolver().overlayWith(
				SchemeColorResolverOverlay.builder()
					// For tonal containers (active controls), use complementary outline.
					.tonalContainerResolverOverlay(
						SchemeContainerColorsResolverOverlay.builder()
							.containerOutline((s) -> s.getComplementaryTonalContainerOutline() & 0xA0FFFFFF)
							.containerOutlineVariant((s) -> s.getComplementaryTonalContainerOutline() & 0x80FFFFFF)
							.complementaryContainerOutline(DynamicScheme::getTonalContainerOutline)
							.build())
					// For muted containers (enabled controls), use complementary outline.
					.mutedContainerResolverOverlay(
						SchemeContainerColorsResolverOverlay.builder()
							.containerOutline((s) -> s.getComplementaryMutedContainerOutline() & 0xA0FFFFFF)
							.containerOutlineVariant((s) -> s.getComplementaryMutedContainerOutline() & 0x80FFFFFF)
							.complementaryContainerOutline(DynamicScheme::getMutedContainerOutline)
							.build())
					// For neutral containers (surfaces), use complementary outline.
					.neutralContainerResolverOverlay(
						SchemeContainerColorsResolverOverlay.builder()
							.containerOutline((s) -> s.getComplementaryNeutralContainerOutline() & 0xA0FFFFFF)
							.containerOutlineVariant((s) -> s.getComplementaryNeutralContainerOutline() & 0x80FFFFFF)
							.complementaryContainerOutline(DynamicScheme::getNeutralContainerOutline)
							.build())
					.build()),
			PaletteResolverUtils.getPaletteTonalColorResolver().overlayWith(
				PaletteContainerColorsResolverOverlay.builder()
					.containerOutline((p) -> p.getComplementaryTonalContainerOutline() & 0xA0FFFFFF)
					.containerOutlineVariant((p) -> p.getComplementaryTonalContainerOutline() & 0x80FFFFFF)
					.complementaryContainerOutline(DynamicPalette::getTonalContainerOutline)
					.build()
			));

		this.borderPainter = new FlatTonalBorderPainter();
	}
}
