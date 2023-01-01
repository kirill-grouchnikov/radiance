/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceColorSchemeBundle;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.ClassicBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.CompositeBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.DelegateBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.MatteDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.MatteFillPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.SpecularRectangularFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomLineOverlayPainter;
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
	public DustAccentedSkin(AccentBuilder accentBuilder) {
		super(accentBuilder);

		ColorSchemes schemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/dust.colorschemes"));

		RadianceColorSchemeBundle defaultSchemeBundle = new RadianceColorSchemeBundle(
				this.getActiveControlsAccent(), this.getEnabledControlsAccent(), this.getEnabledControlsAccent());
		defaultSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		defaultSchemeBundle.registerColorScheme(this.getEnabledControlsAccent(), ComponentState.DISABLED_UNSELECTED);
		defaultSchemeBundle.registerColorScheme(this.getActiveControlsAccent(), ComponentState.DISABLED_SELECTED);

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
		defaultSchemeBundle.registerColorScheme(this.getHighlightsAccent(),
				RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED);

		// custom highlight alphas
		defaultSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED);
		defaultSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
		defaultSchemeBundle.registerHighlightAlpha(1.0f,
				ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);
		defaultSchemeBundle.registerHighlightColorScheme(this.getHighlightsAccent(),
				ComponentState.ROLLOVER_UNSELECTED, ComponentState.ARMED, ComponentState.SELECTED,
				ComponentState.ROLLOVER_SELECTED, ComponentState.ROLLOVER_ARMED);

		this.registerDecorationAreaSchemeBundle(defaultSchemeBundle, this.getBackgroundAccent(),
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

		// add two overlay painters to create a bezel line between menu bar and toolbars
		BottomLineOverlayPainter menuOverlayPainter = new BottomLineOverlayPainter(
				ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.ULTRADARK,
						ColorTransform.brightness(-0.5f)));
		TopLineOverlayPainter toolbarOverlayPainter = new TopLineOverlayPainter(
				ColorSchemeSingleColorQuery.composite(ColorSchemeSingleColorQuery.FOREGROUND,
						ColorTransform.alpha(32)));
		this.addOverlayPainter(menuOverlayPainter, RadianceThemingSlices.DecorationAreaType.HEADER);
		this.addOverlayPainter(toolbarOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		this.buttonShaper = new ClassicButtonShaper();
		this.fillPainter = new SpecularRectangularFillPainter(new MatteFillPainter(), 1.0f);
		this.decorationPainter = new MatteDecorationPainter();
		this.highlightFillPainter = new ClassicFillPainter();
		this.borderPainter = new CompositeBorderPainter("Dust", new ClassicBorderPainter(),
				new DelegateBorderPainter("Dust Inner", new ClassicBorderPainter(),
						0x60FFFFFF, 0x30FFFFFF, 0x18FFFFFF,
						scheme -> scheme.shiftBackground(scheme.getUltraLightColor(), 0.8).tint(0.6).saturate(0.2)));
	}
}
