/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 * <b>Sky High</b> color scheme. Based on colors from <a
 * href="http://ColorBrewer.org">ColorBrewer</a>.
 * 
 * @author Kirill Grouchnikov
 */
public class SkyHighColorScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(239, 243, 255);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(198, 219, 239);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(158, 202, 225);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(107, 174, 214);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(49, 130, 189);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(8, 81, 156);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = Color.black;

	/**
	 * Creates a new <code>Sky High</code> color scheme.
	 */
	public SkyHighColorScheme() {
		super("Sky High");
	}

	@Override
	public Color getForegroundColor() {
		return SkyHighColorScheme.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return SkyHighColorScheme.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return SkyHighColorScheme.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return SkyHighColorScheme.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return SkyHighColorScheme.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return SkyHighColorScheme.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return SkyHighColorScheme.mainUltraDarkColor;
	}
}
