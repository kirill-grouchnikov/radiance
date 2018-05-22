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
package org.pushingpixels.substance.api.colorscheme;

import java.awt.Color;

/**
 * <b>Sun Glare</b> color scheme.
 * 
 * @author Kirill Grouchnikov
 */
public class SunGlareColorScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(255, 255, 209);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(248, 249, 160);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(255, 255, 80);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(252, 226, 55);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(106, 29, 0);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(67, 18, 0);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = Color.black;

	/**
	 * Creates a new <code>Sun Glare</code> color scheme.
	 */
	public SunGlareColorScheme() {
		super("Sun Glare");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getForegroundColor()
	 */
	public Color getForegroundColor() {
		return SunGlareColorScheme.foregroundColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getUltraLightColor()
	 */
	public Color getUltraLightColor() {
		return SunGlareColorScheme.mainUltraLightColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getExtraLightColor()
	 */
	public Color getExtraLightColor() {
		return SunGlareColorScheme.mainExtraLightColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getLightColor()
	 */
	public Color getLightColor() {
		return SunGlareColorScheme.mainLightColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getMidColor()
	 */
	public Color getMidColor() {
		return SunGlareColorScheme.mainMidColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getDarkColor()
	 */
	public Color getDarkColor() {
		return SunGlareColorScheme.mainDarkColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getUltraDarkColor()
	 */
	public Color getUltraDarkColor() {
		return SunGlareColorScheme.mainUltraDarkColor;
	}
}
