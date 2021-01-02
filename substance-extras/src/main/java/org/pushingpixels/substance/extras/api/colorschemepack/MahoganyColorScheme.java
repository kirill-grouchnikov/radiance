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
package org.pushingpixels.substance.extras.api.colorschemepack;

import java.awt.Color;

import org.pushingpixels.substance.api.colorscheme.BaseLightColorScheme;

/**
 * <b>Mahogany</b> color scheme.
 * 
 * @author Kirill Grouchnikov
 */
public class MahoganyColorScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(230, 148, 178);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(223, 141, 171);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(206, 127, 154);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(164, 78, 87);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(79, 22, 25);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(57, 8, 15);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = Color.black;

	/**
	 * Creates a new <code>Mahogany</code> color scheme.
	 */
	public MahoganyColorScheme() {
		super("Mahogany");
	}

	@Override
	public Color getForegroundColor() {
		return MahoganyColorScheme.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return MahoganyColorScheme.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return MahoganyColorScheme.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return MahoganyColorScheme.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return MahoganyColorScheme.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return MahoganyColorScheme.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return MahoganyColorScheme.mainUltraDarkColor;
	}
}
