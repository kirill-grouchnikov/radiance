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
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.PurpleColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.overlay.BottomShadowOverlayPainter;

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

	/**
	 * Creates a new <code>Nebula Amethyst</code> skin.
	 */
	public NebulaAmethystSkin() {
		super(new AccentBuilder().withWindowChromeAccent(new PurpleColorScheme()));

		ColorSchemes schemes = RadianceSkin.getColorSchemes(
				this.getClass().getClassLoader().getResourceAsStream(
                        "org/pushingpixels/radiance/theming/api/skin/nebula.colorschemes"));

		// Also apply the window chrome accent color on the TOOLBAR area
		RadianceColorScheme windowChromeAccent = this.getWindowChromeAccent();
		this.registerAsDecorationArea(windowChromeAccent, RadianceThemingSlices.DecorationAreaType.TOOLBAR);
		this.clearOverlayPainters(RadianceThemingSlices.DecorationAreaType.TOOLBAR);
		this.addOverlayPainter(BottomShadowOverlayPainter.getInstance(100), RadianceThemingSlices.DecorationAreaType.TOOLBAR);
		this.addOverlayPainter(this.bottomLineOverlayPainter, RadianceThemingSlices.DecorationAreaType.TOOLBAR);

		RadianceColorSchemeBundle toolbarBundle = new RadianceColorSchemeBundle(
				windowChromeAccent.saturate(0.1f), windowChromeAccent,
				schemes.get("Nebula Amethyst Title Disabled"));
		toolbarBundle.registerAlpha(0.8f, ComponentState.DISABLED_SELECTED,
				ComponentState.DISABLED_UNSELECTED);
		toolbarBundle.registerColorScheme(windowChromeAccent.saturate(0.08f),
				RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR);
		this.registerDecorationAreaSchemeBundle(toolbarBundle, RadianceThemingSlices.DecorationAreaType.TOOLBAR);
	}

	@Override
	public String getDisplayName() {
		return NAME;
	}
}
