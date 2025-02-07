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
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.PaletteResolverUtils;
import org.pushingpixels.radiance.theming.api.palette.SchemeResolverUtils;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Dust</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class DustAccentedTonalSkin extends RadianceSkin.TonalAccented {
	/**
	 * Creates a new accented <code>Dust</code> skin.
	 */
	protected DustAccentedTonalSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		RadianceColorSchemeBundle2 dustDefaultBundle =
			new RadianceColorSchemeBundle2(this.getDefaultAreaColorScheme());
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
			dustDefaultBundle.getMainColorScheme().getExtendedTonalContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.NONE);

		RadianceColorSchemeBundle2 dustHeaderBundle =
			new RadianceColorSchemeBundle2(ColorSchemeUtils.getColorScheme(
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
			this.getDefaultAreaHighlightTokens(),
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		this.registerDecorationAreaSchemeBundle(dustHeaderBundle,
			ColorSchemeUtils.getExtendedContainerTokens(
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
			ColorSchemeUtils.getExtendedContainerTokens(
				/* seed */ Hct.fromInt(0xFF3A3935),
				/* isFidelity */ true,
				/* isDark */ true,
				/* contrast */ 0.0f,
				/* colorResolver */ PaletteResolverUtils.getPaletteTonalColorResolver()),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add two overlay painters to create a bezel line between menu bar and toolbars
		BottomLineTonalOverlayPainter menuOverlayPainter = new BottomLineTonalOverlayPainter(
			ContainerColorTokens::getContainerOutline);
		RadianceOverlayPainter toolbarOverlayPainter = new TopLineTonalOverlayPainter(
			ContainerColorTokensSingleColorQuery.composite(
				ContainerColorTokens::getInverseContainerOutline,
				ColorTransform.alpha(96)));
		this.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
		this.addOverlayPainter(toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new MatteTonalFillPainter(), 0.3f);
		this.decorationPainter = new FlatDecorationPainter();
		this.highlightFillPainter = new MatteTonalFillPainter();
		this.borderPainter = new CompositeBorderPainter("Dust",
			new ClassicTonalBorderPainter(),
			new FractionBasedTonalBorderPainter("Dust Inner",
				new float[] {0.0f, 1.0f},
				new int[] {64, 64},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline
				}));

		// TODO - TONAL : remove this altogether
		ColorSchemes schemes = RadianceSkin.getColorSchemes(
			this.getClass().getClassLoader().getResourceAsStream(
				"org/pushingpixels/radiance/theming/api/skin/dust.colorschemes"));

		RadianceColorScheme activeScheme = schemes.get("Dust Active");
		RadianceColorScheme enabledScheme = schemes.get("Dust Enabled");
		RadianceColorScheme highlightScheme = schemes.get("Dust Highlight");

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
			activeScheme, enabledScheme, enabledScheme);
		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(enabledScheme, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeScheme, ComponentState.DISABLED_SELECTED);

		// borders and marks
		RadianceColorScheme borderEnabledScheme = schemes.get("Dust Border Enabled");
		RadianceColorScheme borderActiveScheme = schemes.get("Dust Border Active");
		RadianceColorScheme markEnabledScheme = schemes.get("Dust Mark Enabled");

		defaultSchemeBundle.registerColorScheme(borderEnabledScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED,
			ComponentState.DISABLED_SELECTED, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(borderActiveScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(markEnabledScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.MARK);

		// text highlight
		defaultSchemeBundle.registerColorScheme(highlightScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		// custom highlight alphas
		defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED);
		defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightAlpha(1.0f,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme,
			ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, enabledScheme,
			RadianceThemingSlices.DecorationAreaType.NONE);

		// header color scheme bundle
		RadianceColorScheme headerActiveScheme = schemes.get("Dust Header Active");
		RadianceColorScheme headerEnabledScheme = schemes.get("Dust Header Enabled");
		RadianceColorScheme headerDisabledScheme = schemes.get("Dust Header Disabled");

		RadianceColorScheme headerBackgroundScheme = schemes.get("Dust Header Background");

		RadianceColorScheme headerSeparatorScheme = schemes.get("Dust Header Separator");

		RadianceColorScheme headerBorderScheme = schemes.get("Dust Header Border");

		RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
			headerActiveScheme, headerEnabledScheme, headerDisabledScheme);
		headerSchemeBundle.registerAlpha(0.7f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		headerSchemeBundle.registerColorScheme(headerDisabledScheme,
			ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);

		headerSchemeBundle.registerColorScheme(headerBorderScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
		headerSchemeBundle.registerColorScheme(headerSeparatorScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

		headerSchemeBundle.registerHighlightAlpha(1.0f);
		headerSchemeBundle.registerHighlightColorScheme(headerActiveScheme);
		// the next line is to have consistent coloring during the rollover menu animations
		headerSchemeBundle.registerHighlightAlpha(0.0f, ComponentState.ENABLED);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, headerBackgroundScheme,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER, RadianceThemingSlices.DecorationAreaType.FOOTER);
	}
}
