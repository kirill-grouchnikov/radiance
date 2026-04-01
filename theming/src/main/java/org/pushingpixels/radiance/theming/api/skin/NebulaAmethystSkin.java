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
import org.pushingpixels.radiance.theming.api.ContainerColorTokensBundle;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.decoration.overlay.BottomShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;

/**
 * <code>Nebula Amethyst</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class NebulaAmethystSkin extends NebulaAccentedSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Nebula Amethyst";

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public NebulaAmethystSkin() {
		super(new AccentBuilder()
			.withHeaderAreaActiveTokens(ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFC2A9EF),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()))
			.withHeaderAreaMutedTokens(ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFD1A9F1),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()))
			.withHeaderAreaNeutralTokens(ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFD1A9F1),
				/* containerConfiguration */ ContainerConfiguration.defaultLight())));

		// Also extend the window chrome accent color to the TOOLBAR area
		ContainerColorTokensBundle nebulaAmethystToolbarBundle = new ContainerColorTokensBundle(
			/* activeContainerTokens */ ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFD264EB),
				/* containerConfiguration */ ContainerConfiguration.defaultLight()),
			/* mutedContainerTokens */ this.getHeaderAreaMutedTokens(),
			/* neutralContainerTokens */ this.getHeaderAreaNeutralTokens(),
			/* isSystemDark */ false);
		nebulaAmethystToolbarBundle.registerNeutralContainerTokens(
			ContainerColorTokensUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFD1A9F1),
				/* containerConfiguration */ new ContainerConfiguration(
					/* isDark */ false,
					/* contrastLevel */ -1.0)),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.SEPARATOR);
		this.registerDecorationAreaTokensBundle(nebulaAmethystToolbarBundle,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// And configure toolbar overlay painters
		this.decorationPainter.clearOverlayPainters(RadianceThemingSlices.DecorationAreaType.TOOLBAR);
		this.decorationPainter.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);
		this.decorationPainter.addOverlayPainter(this.bottomLineOverlayPainter,
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);
	}
}
