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
package org.pushingpixels.radiance.theming.extras.api.colorschemepack;

import org.pushingpixels.radiance.theming.api.colorscheme.BaseLightColorScheme;

import java.awt.*;

/**
 * <b>Orchid Alloy</b> color scheme. Based on colors from <a
 * href="http://ColorBrewer.org">ColorBrewer</a>.
 * 
 * @author Kirill Grouchnikov
 */
public class OrchidAlloyColorScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(242, 240, 247);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(218, 218, 235);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(188, 189, 220);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(158, 154, 200);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(117, 107, 177);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(84, 39, 143);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = Color.black;

	/**
	 * Creates a new <code>Orchid Alloy</code> color scheme.
	 */
	public OrchidAlloyColorScheme() {
		super("Orchid Alloy");
	}

	@Override
	public Color getForegroundColor() {
		return OrchidAlloyColorScheme.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return OrchidAlloyColorScheme.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return OrchidAlloyColorScheme.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return OrchidAlloyColorScheme.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return OrchidAlloyColorScheme.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return OrchidAlloyColorScheme.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return OrchidAlloyColorScheme.mainUltraDarkColor;
	}
}
