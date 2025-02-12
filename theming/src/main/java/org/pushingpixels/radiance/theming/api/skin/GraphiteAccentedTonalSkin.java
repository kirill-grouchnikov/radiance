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
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.FractionBasedTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.FlatDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.FractionBasedTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteTonalFillPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Graphite</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class GraphiteAccentedTonalSkin extends RadianceSkin.TonalAccented {
	protected RadianceColorSchemeBundle2 graphiteDefaultBundle;

	/**
	 * Creates a new accented <code>Graphite</code> skin.
	 */
	protected GraphiteAccentedTonalSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		RadianceColorScheme2 defaultAreaColorScheme = ColorSchemeUtils.getColorScheme(
			/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
				Hct.fromInt(0xFF636363), Hct.fromInt(0xFF424242), Hct.fromInt(0xFF424242)),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isDark */ true);
		this.graphiteDefaultBundle =
			new RadianceColorSchemeBundle2(defaultAreaColorScheme);

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
			this.graphiteDefaultBundle.getMainColorScheme().getExtendedTonalContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.buttonShaper = new ClassicButtonShaper();
		this.borderPainter = new CompositeBorderPainter("Graphite",
			new FlatTonalBorderPainter(),
			new FractionBasedTonalBorderPainter("Graphite Inner",
				new float[] {0.0f, 0.5f, 1.0f},
				new int[] {92, 64, 92},
				new ContainerColorTokensSingleColorQuery[] {
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline,
					ContainerColorTokens::getComplementaryContainerOutline
				}));
		this.highlightBorderPainter = new FlatTonalBorderPainter();
		this.fillPainter = new FractionBasedTonalFillPainter("Graphite",
			new float[] {0.0f, 0.5f, 1.0f},
			new ContainerColorTokensSingleColorQuery[] {
				ContainerColorTokens::getContainerSurfaceHigh,
				ContainerColorTokens::getContainerSurface,
				ContainerColorTokens::getContainerSurface
			});
		this.decorationPainter = new FlatDecorationPainter();
		this.highlightFillPainter = new MatteTonalFillPainter();

		// TODO - TONAL : remove this altogether
		ColorSchemes schemes = RadianceSkin.getColorSchemes(
			this.getClass().getClassLoader().getResourceAsStream(
				"org/pushingpixels/radiance/theming/api/skin/graphite.colorschemes"));

		RadianceColorScheme activeScheme = schemes.get("Graphite Active");
		RadianceColorScheme selectedDisabledScheme = schemes.get("Graphite Selected Disabled");
		RadianceColorScheme selectedScheme = schemes.get("Graphite Selected");
		RadianceColorScheme disabledScheme = schemes.get("Graphite Disabled");
		RadianceColorScheme activeControlsScheme = schemes.get("Graphite Aqua");
		RadianceColorScheme highlightScheme = schemes.get("Graphite Aqua");

		RadianceColorScheme enabledScheme = schemes.get("Graphite Enabled");
		RadianceColorScheme backgroundScheme = schemes.get("Graphite Background");

		RadianceColorSchemeBundle defaultSchemeBundle =
			new RadianceColorSchemeBundle(activeScheme, enabledScheme, disabledScheme);

		// border scheme
		RadianceColorScheme borderScheme = schemes.get("Graphite Border");
		RadianceColorScheme separatorScheme = schemes.get("Graphite Separator");
		defaultSchemeBundle.registerColorScheme(borderScheme, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER);
		defaultSchemeBundle.registerColorScheme(separatorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);

		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerAlpha(0.65f, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(selectedDisabledScheme, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(disabledScheme, RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
			ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);

		defaultSchemeBundle.registerColorScheme(selectedScheme, ComponentState.SELECTED);

		// highlight fill scheme + custom alpha for rollover unselected state
		defaultSchemeBundle.registerHighlightAlpha(0.9f, ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightAlpha(1.0f, ComponentState.ROLLOVER_SELECTED,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerHighlightColorScheme(highlightScheme,
			ComponentState.ROLLOVER_UNSELECTED,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(activeControlsScheme, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(activeControlsScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(activeControlsScheme.shade(0.2).saturate(0.2),
			RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
			ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(activeControlsScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.TAB,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		defaultSchemeBundle.registerColorScheme(borderScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, ComponentState.getActiveStates());
		defaultSchemeBundle.registerColorScheme(borderScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.getActiveStates());

		defaultSchemeBundle.registerColorScheme(activeControlsScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
			ComponentState.SELECTED, ComponentState.PRESSED_SELECTED,
			ComponentState.PRESSED_UNSELECTED, ComponentState.ROLLOVER_UNSELECTED,
			ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(activeControlsScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.MARK,
			ComponentState.DISABLED_SELECTED);

		// text highlight scheme
		defaultSchemeBundle.registerColorScheme(highlightScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		defaultSchemeBundle.registerColorScheme(activeControlsScheme,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		defaultSchemeBundle.registerColorScheme(activeControlsScheme,
			ComponentState.ROLLOVER_UNSELECTED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, backgroundScheme,
			RadianceThemingSlices.DecorationAreaType.NONE);
	}
}
