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
package org.pushingpixels.radiance.theming.internal.colorscheme;

import org.pushingpixels.radiance.theming.api.colorscheme.BaseColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;

/**
 * Implementation of inverted color scheme. Inverted color scheme is based on
 * some original color scheme, switching the dark colors by light colors and
 * inverting the foreground color.
 * 
 * @author Kirill Grouchnikov
 */
public class InvertedColorScheme extends BaseColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private Color mainUltraLightColor;

	/**
	 * The main extra-light color.
	 */
	private Color mainExtraLightColor;

	/**
	 * The main light color.
	 */
	private Color mainLightColor;

	/**
	 * The main medium color.
	 */
	private Color mainMidColor;

	/**
	 * The main dark color.
	 */
	private Color mainDarkColor;

	/**
	 * The main ultra-dark color.
	 */
	private Color mainUltraDarkColor;

	/**
	 * The foreground color.
	 */
	private Color foregroundColor;

	/**
	 * The original color scheme.
	 */
	private RadianceColorScheme origScheme;

	/**
	 * Creates a new inverted scheme.
	 * 
	 * @param origScheme
	 *            The original color scheme.
	 */
	public InvertedColorScheme(RadianceColorScheme origScheme) {
		super("Inverted " + origScheme.getDisplayName(), !origScheme.isDark());
		this.origScheme = origScheme;
		this.foregroundColor = RadianceColorUtilities.invertColor(origScheme.getForegroundColor());
		this.mainUltraDarkColor = RadianceColorUtilities
				.invertColor(origScheme.getUltraLightColor());
		this.mainDarkColor = RadianceColorUtilities.invertColor(origScheme.getExtraLightColor());
		this.mainMidColor = RadianceColorUtilities.invertColor(origScheme.getLightColor());
		this.mainLightColor = RadianceColorUtilities.invertColor(origScheme.getMidColor());
		this.mainExtraLightColor = RadianceColorUtilities.invertColor(origScheme.getDarkColor());
		this.mainUltraLightColor = RadianceColorUtilities
				.invertColor(origScheme.getUltraDarkColor());
		this.isDark = !origScheme.isDark();
	}

	@Override
	public Color getForegroundColor() {
		return this.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return this.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return this.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return this.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return this.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return this.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return this.mainUltraDarkColor;
	}

	/**
	 * Returns the original color scheme.
	 * 
	 * @return The original color scheme.
	 */
	public RadianceColorScheme getOrigScheme() {
		return this.origScheme;
	}
}
