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
package org.pushingpixels.substance.api.colorscheme;

import java.awt.*;

/**
 * <b>Steel Blue</b> color scheme.
 * 
 * @author Kirill Grouchnikov
 */
public class SteelBlueColorScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(149, 193, 219);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(130, 181, 212);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(118, 165, 195);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(108, 149, 178);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(38, 79, 111);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(47, 75, 99);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = Color.black;

	/**
	 * Creates a new <code>Steel Blue</code> color scheme.
	 */
	public SteelBlueColorScheme() {
		super("Steel Blue");
	}

	@Override
	public Color getForegroundColor() {
		return SteelBlueColorScheme.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return SteelBlueColorScheme.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return SteelBlueColorScheme.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return SteelBlueColorScheme.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return SteelBlueColorScheme.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return SteelBlueColorScheme.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return SteelBlueColorScheme.mainUltraDarkColor;
	}
}
