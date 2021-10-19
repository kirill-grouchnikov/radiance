/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

/**
 * <code>Business Black Steel</code> skin. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class BusinessBlackSteelSkin extends BusinessAccentedSkin {
	/**
	 * Display name for <code>this</code> skin.
	 */
	public static final String NAME = "Business Black Steel";

	/**
	 * Creates a new <code>Business Black Steel</code> skin.
	 */
	public BusinessBlackSteelSkin() {
		super(new AccentBuilder()
				.withAccentResource("org/pushingpixels/radiance/theming/api/skin/business.colorschemes")
				.withWindowChromeAccent("Business Black Steel Active Header")
				.withActiveControlsAccent("Business Black Steel Active")
				.withHighlightsAccent("Business Black Steel Active"));

		ColorSchemes businessSchemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/business.colorschemes"));

		RadianceColorScheme activeScheme = businessSchemes.get("Business Black Steel Active");
		RadianceColorScheme disabledScheme = businessSchemes.get("Business Black Steel Disabled");

		// color scheme bundle for title panes
		RadianceColorScheme activeHeaderScheme = businessSchemes
				.get("Business Black Steel Active Header");
		RadianceColorScheme enabledHeaderScheme = businessSchemes
				.get("Business Black Steel Enabled Header");
		RadianceColorSchemeBundle headerSchemeBundle = new RadianceColorSchemeBundle(
				activeHeaderScheme, enabledHeaderScheme, disabledScheme);
		headerSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		headerSchemeBundle.registerColorScheme(enabledHeaderScheme,
				ComponentState.DISABLED_UNSELECTED, ComponentState.DISABLED_SELECTED);
		headerSchemeBundle.registerHighlightAlpha(0.6f, ComponentState.ROLLOVER_UNSELECTED);
		headerSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.SELECTED);
		headerSchemeBundle.registerHighlightAlpha(0.95f, ComponentState.ROLLOVER_SELECTED);
		headerSchemeBundle.registerHighlightAlpha(0.8f, ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);
		headerSchemeBundle.registerHighlightColorScheme(activeScheme, ComponentState.ROLLOVER_UNSELECTED,
				ComponentState.SELECTED, ComponentState.ROLLOVER_SELECTED,
				ComponentState.ARMED, ComponentState.ROLLOVER_ARMED);

		this.registerDecorationAreaSchemeBundle(headerSchemeBundle, activeHeaderScheme,
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE, RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.HEADER);

		// color scheme bundle for control pane areas
		RadianceColorScheme activeControlPaneScheme = businessSchemes
				.get("Business Black Steel Active Control Pane");
		RadianceColorScheme enabledControlPaneScheme = businessSchemes
				.get("Business Black Steel Enabled Control Pane");
		RadianceColorSchemeBundle controlPaneSchemeBundle = new RadianceColorSchemeBundle(
				activeControlPaneScheme, enabledControlPaneScheme, disabledScheme);
		controlPaneSchemeBundle.registerAlpha(0.5f, ComponentState.DISABLED_UNSELECTED);
		controlPaneSchemeBundle.registerColorScheme(disabledScheme, ComponentState.DISABLED_UNSELECTED);
		this.registerDecorationAreaSchemeBundle(controlPaneSchemeBundle, RadianceThemingSlices.DecorationAreaType.FOOTER,
				RadianceThemingSlices.DecorationAreaType.CONTROL_PANE);
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
