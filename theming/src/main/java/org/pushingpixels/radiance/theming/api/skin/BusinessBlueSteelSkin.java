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

import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;

/**
 * <code>Business Blue Steel</code> skin. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class BusinessBlueSteelSkin extends BusinessAccentedSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Business Blue Steel";

	@Override
	public String getDisplayName() {
		return NAME;
	}

	public BusinessBlueSteelSkin() {
		super(new AccentBuilder()
			.withHeaderAreaColorScheme(ColorSchemeUtils.getColorScheme(
				/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
					Hct.fromInt(0xFF91B6CB), Hct.fromInt(0xFFC4C8CC), Hct.fromInt(0xFFA1BCD0)),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isDark */ false))
			.withHeaderAreaHighlightTokens(ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF83AFCE),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false))
			.withDefaultAreaColorScheme(ColorSchemeUtils.getColorScheme(
				/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
					Hct.fromInt(0xFF98B7CC), Hct.fromInt(0xFFC4C8CC), Hct.fromInt(0xFFE4EAF0)),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isDark */ false))
			.withDefaultAreaHighlightTokens(ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFFEBD296),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ false)));

		RadianceColorScheme controlPaneColorScheme = ColorSchemeUtils.getColorScheme(
			/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
				Hct.fromInt(0xFF94B9D3), Hct.fromInt(0xFFBFCFDB), Hct.fromInt(0xFFBFCFDB)),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isDark */ false);

		RadianceColorSchemeBundle businessBlueSteelControlBundle =
			new RadianceColorSchemeBundle(controlPaneColorScheme);
		businessBlueSteelControlBundle.registerActiveContainerTokens(
			getDefaultAreaColorScheme().getActiveContainerTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.getActiveStates());
		this.registerDecorationAreaSchemeBundle(businessBlueSteelControlBundle,
			controlPaneColorScheme.getExtendedMutedContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
			RadianceThemingSlices.DecorationAreaType.FOOTER);
	}
}
