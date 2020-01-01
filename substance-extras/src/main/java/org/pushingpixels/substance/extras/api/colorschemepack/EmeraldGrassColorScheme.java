/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.api.colorschemepack;

import java.awt.Color;

import org.pushingpixels.substance.api.colorscheme.BaseLightColorScheme;

/**
 * <b>Emerald Grass</b> color scheme.
 * 
 * @author Kirill Grouchnikov
 */
public class EmeraldGrassColorScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(95, 167, 72);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(91, 168, 69);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(68, 148, 62);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(58, 141, 51);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(23, 87, 15);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(2, 43, 0);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = Color.black;

	/**
	 * Creates a new <code>Emerald Grass</code> color scheme.
	 */
	public EmeraldGrassColorScheme() {
		super("Emerald Grass");
	}

	@Override
	public Color getForegroundColor() {
		return EmeraldGrassColorScheme.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return EmeraldGrassColorScheme.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return EmeraldGrassColorScheme.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return EmeraldGrassColorScheme.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return EmeraldGrassColorScheme.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return EmeraldGrassColorScheme.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return EmeraldGrassColorScheme.mainUltraDarkColor;
	}
}
