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
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.*;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineOverlayPainter;
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

		RadianceColorSchemeBundle dustDefaultBundle =
			new RadianceColorSchemeBundle(this.getDefaultAreaColorScheme());
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

		RadianceColorSchemeBundle dustHeaderBundle =
			new RadianceColorSchemeBundle(ColorSchemeUtils.getColorScheme(
				/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
					Hct.fromInt(0xFF5E3D2B), Hct.fromInt(0xFF3C3B37), Hct.fromInt(0xFF2B2A28)),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isPrimaryDark */ false,
				/* isTonalDark */ true,
				/* isMutedDark */ true,
				/* isNeutralDark */ true,
				/* isSystemDark */ true,
				/* primaryContrastLevel */ 0.4f,
				/* tonalContrastLevel */ 0.4f,
				/* mutedContrastLevel */ 0.4f,
				/* neutralContrastLevel */ 0.4f,
				/* schemeColorResolver */ SchemeResolverUtils.getSchemeColorResolver()));
		dustHeaderBundle.registerActiveContainerTokens(
			this.getHeaderAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		this.registerDecorationAreaSchemeBundle(dustHeaderBundle,
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF2B2A28),
				/* isFidelity */ true,
				/* isDark */ true,
				/* contrast */ 0.2f,
				/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		this.registerDecorationAreaSchemeBundle(dustHeaderBundle,
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF3A3935),
				/* isFidelity */ true,
				/* isDark */ true,
				/* contrast */ 0.0f,
				/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
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
		this.fillPainter = new SpecularRectangularFillPainter(new MatteFillPainter(), 0.3f);
		this.decorationPainter = new FlatDecorationPainter();
		this.highlightFillPainter = new MatteFillPainter();
		this.borderPainter = new CompositeBorderPainter("Dust",
			new FlatBorderPainter(),
			new FractionBasedTonalBorderPainter("Dust Inner",
				new float[] {0.0f, 1.0f},
				new int[] {64, 64},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline
				}));
	}
}
