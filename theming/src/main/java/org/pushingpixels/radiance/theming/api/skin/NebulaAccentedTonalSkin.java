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
import org.pushingpixels.radiance.theming.api.painter.border.FlatTonalBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.ArcDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MarbleNoiseDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicTonalFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineTonalOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.TopShadowOverlayPainter;
import org.pushingpixels.radiance.theming.api.palette.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.ExtendedContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;
import org.pushingpixels.radiance.theming.api.shaper.ClassicButtonShaper;

/**
 * Base class for accented <code>Nebula</code> skins. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public abstract class NebulaAccentedTonalSkin extends RadianceSkin.TonalAccented {
	/**
	 * Overlay painter to paint separator lines on some decoration areas.
	 */
	protected RadianceOverlayPainter bottomLineOverlayPainter;

	/**
	 * Creates a new accented <code>Nebula</code> skin.
	 */
	protected NebulaAccentedTonalSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		RadianceColorScheme2 nebulaColorScheme = ColorSchemeUtils.getColorScheme(
			/* palettesSource */ new ColorSchemeUtils.FidelityPaletteSource(
				Hct.fromInt(0xFFBAD2E3), Hct.fromInt(0xFFD7DBE1), Hct.fromInt(0xFFF3F7FD)),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isDark */ false);

		ContainerColorTokens nebulaRolloverContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFF6B92AF),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isFidelity */ true,
			/* isDark */ true);
		ContainerColorTokens nebulaPressedContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFF276792),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isFidelity */ true,
			/* isDark */ true);
		ContainerColorTokens nebulaSelectedHighlightContainerTokens =
			ColorSchemeUtils.getContainerTokens(
				/* seed */ Hct.fromInt(0xFF5B85A6),
				/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
				/* isFidelity */ true,
				/* isDark */ true);
		ContainerColorTokens nebulaDeterminateContainerTokens = ColorSchemeUtils.getContainerTokens(
			/* seed */ Hct.fromInt(0xFFD2852F),
			/* activeStatesContainerType */ RadianceThemingSlices.ActiveContainerType.TONAL,
			/* isFidelity */ true,
			/* isDark */ true);

		RadianceColorSchemeBundle2 nebulaDefaultBundle =
			new RadianceColorSchemeBundle2(nebulaColorScheme);
		nebulaDefaultBundle.registerActiveContainerTokens(nebulaPressedContainerTokens,
			ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// Highlights
		nebulaDefaultBundle.registerActiveContainerTokens(nebulaRolloverContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_UNSELECTED);
		nebulaDefaultBundle.registerActiveContainerTokens(nebulaSelectedHighlightContainerTokens,
			RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
			ComponentState.SELECTED);

		// Progress bars
		nebulaDefaultBundle.registerActiveContainerTokens(nebulaDeterminateContainerTokens,
			ComponentState.DETERMINATE, ComponentState.INDETERMINATE);

		this.registerDecorationAreaSchemeBundle(nebulaDefaultBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		ExtendedContainerColorTokens nebulaDecorationsColorTokens = ColorSchemeUtils.getExtendedContainerTokens(
			/* seed */ Hct.fromInt(0xFFC2D1DA),
			/* isFidelity */ true,
			/* isDark */ false);
		this.registerAsDecorationArea(nebulaDecorationsColorTokens,
			RadianceThemingSlices.DecorationAreaType.CONTROL_PANE,
			RadianceThemingSlices.DecorationAreaType.FOOTER);

		RadianceColorSchemeBundle2 nebulaDefaultHeaderBundle =
			new RadianceColorSchemeBundle2(this.getWindowChromeAccent());
		if (this.getWindowChromeHighlightsAccent() != null) {
			nebulaDefaultHeaderBundle.registerActiveContainerTokens(
				this.getWindowChromeHighlightsAccent(),
				RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
				ComponentState.getActiveStates());
		}
		this.registerDecorationAreaSchemeBundle(nebulaDefaultHeaderBundle,
			nebulaDefaultHeaderBundle.getMainColorScheme().getExtendedNeutralContainerTokens(),
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		// add an overlay painter to paint a drop shadow along the top edge of toolbars
		this.addOverlayPainter(TopShadowOverlayPainter.getInstance(60),
			RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		// add an overlay painter to paint separator lines along the bottom
		// edges of title panes and menu bars
		this.bottomLineOverlayPainter = new BottomLineTonalOverlayPainter(
			ContainerColorTokensSingleColorQuery.CONTAINER_OUTLINE);
		this.addOverlayPainter(bottomLineOverlayPainter,
			RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
			RadianceThemingSlices.DecorationAreaType.HEADER);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new ClassicTonalFillPainter(), 1.0f);
		this.borderPainter = new FlatTonalBorderPainter();

		MarbleNoiseDecorationPainter decorationPainter = new MarbleNoiseDecorationPainter();
		decorationPainter.setBaseDecorationPainter(new ArcDecorationPainter());
		decorationPainter.setTextureAlpha(0.5f);
		this.decorationPainter = decorationPainter;

		this.highlightFillPainter = new ClassicTonalFillPainter();

		// TODO - TONAL : remove this altogether
		ColorSchemes schemes = RadianceSkin.getColorSchemes(
			this.getClass().getClassLoader().getResourceAsStream(
				"org/pushingpixels/radiance/theming/api/skin/nebula.colorschemes"));

		RadianceColorScheme activeScheme = schemes.get("Nebula Active");
		RadianceColorScheme enabledScheme = schemes.get("Nebula Enabled");
		RadianceColorScheme rolloverUnselectedScheme = schemes.get("Nebula Rollover Unselected");
		RadianceColorScheme pressedScheme = schemes.get("Nebula Pressed");
		RadianceColorScheme rolloverSelectedScheme = schemes.get("Nebula Rollover Selected");
		RadianceColorScheme disabledScheme = schemes.get("Nebula Disabled");

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
			activeScheme, enabledScheme, disabledScheme);
		defaultSchemeBundle.registerColorScheme(rolloverUnselectedScheme,
			ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(rolloverSelectedScheme,
			ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerColorScheme(pressedScheme,
			ComponentState.PRESSED_SELECTED, ComponentState.PRESSED_UNSELECTED,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		defaultSchemeBundle.registerColorScheme(rolloverUnselectedScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, ComponentState.SELECTED);

		defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED);
		defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED, ComponentState.ARMED,
			ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerHighlightAlpha(0.95f, ComponentState.ROLLOVER_SELECTED);
		defaultSchemeBundle.registerHighlightColorScheme(pressedScheme, ComponentState.ROLLOVER_UNSELECTED,
			ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
			ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		// for progress bars
		RadianceColorScheme determinateScheme = schemes.get("Nebula Determinate");
		RadianceColorScheme determinateBorderScheme = schemes.get("Nebula Determinate Border");
		defaultSchemeBundle.registerColorScheme(determinateScheme,
			ComponentState.DETERMINATE, ComponentState.INDETERMINATE);
		defaultSchemeBundle.registerColorScheme(determinateBorderScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
			ComponentState.DETERMINATE, ComponentState.INDETERMINATE);

		RadianceColorScheme determinateDisabledScheme = schemes
			.get("Nebula Determinate Disabled");
		RadianceColorScheme determinateDisabledBorderScheme = schemes
			.get("Nebula Determinate Disabled Border");
		defaultSchemeBundle.registerColorScheme(determinateDisabledScheme,
			ComponentState.DISABLED_DETERMINATE, ComponentState.DISABLED_INDETERMINATE);
		defaultSchemeBundle.registerColorScheme(
			determinateDisabledBorderScheme,
			RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
			ComponentState.DISABLED_DETERMINATE, ComponentState.DISABLED_INDETERMINATE);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle,
			RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, RadianceThemingSlices.DecorationAreaType.NONE);

		this.registerAsDecorationArea(schemes.get("Nebula Decorations"),
			bundle -> bundle.registerColorScheme(schemes.get("Nebula Decorations Separator"),
				RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR),
			RadianceThemingSlices.DecorationAreaType.FOOTER, RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);
	}
}
