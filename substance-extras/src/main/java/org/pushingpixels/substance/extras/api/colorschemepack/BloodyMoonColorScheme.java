/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
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
 * <b>Bloody Moon</b> color scheme. Based on colors from <a
 * href="http://ColorBrewer.org">ColorBrewer</a>.
 * 
 * @author Kirill Grouchnikov
 */
public class BloodyMoonColorScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(254, 229, 217);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(252, 187, 161);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(252, 146, 114);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(251, 106, 74);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(222, 45, 38);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(165, 15, 21);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = Color.black;

	/**
	 * Creates a new <code>Bloody Moon</code> color scheme.
	 */
	public BloodyMoonColorScheme() {
		super("Bloody Moon");
	}

	@Override
	public Color getForegroundColor() {
		return BloodyMoonColorScheme.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return BloodyMoonColorScheme.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return BloodyMoonColorScheme.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return BloodyMoonColorScheme.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return BloodyMoonColorScheme.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return BloodyMoonColorScheme.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return BloodyMoonColorScheme.mainUltraDarkColor;
	}
}
