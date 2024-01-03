/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.extras.api.colorschemepack;

import org.pushingpixels.radiance.theming.api.colorscheme.BaseLightColorScheme;

import java.awt.*;

/**
 * <b>Earth Fresco</b> color scheme. Based on colors from <a
 * href="http://ColorBrewer.org">ColorBrewer</a>.
 * 
 * @author Kirill Grouchnikov
 */
public class EarthFrescoColorScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(255, 255, 212);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(254, 227, 145);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(254, 196, 79);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(254, 153, 1);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(217, 95, 14);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(153, 52, 4);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = Color.black;

	/**
	 * Creates a new <code>Earth Fresco</code> color scheme.
	 */
	public EarthFrescoColorScheme() {
		super("Earth Fresco");
	}

	@Override
	public Color getForegroundColor() {
		return EarthFrescoColorScheme.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return EarthFrescoColorScheme.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return EarthFrescoColorScheme.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return EarthFrescoColorScheme.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return EarthFrescoColorScheme.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return EarthFrescoColorScheme.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return EarthFrescoColorScheme.mainUltraDarkColor;
	}
}
