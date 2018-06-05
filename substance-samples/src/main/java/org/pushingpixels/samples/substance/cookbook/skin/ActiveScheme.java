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
package org.pushingpixels.samples.substance.cookbook.skin;

import java.awt.Color;

import org.pushingpixels.substance.api.colorscheme.BaseLightColorScheme;

/**
 * Color scheme for active visual state.
 * 
 * @author Kirill Grouchnikov
 */
class ActiveScheme extends BaseLightColorScheme {
	/**
	 * The main ultra-light color.
	 */
	private static final Color mainUltraLightColor = new Color(244, 229,
			192);

	/**
	 * The main extra-light color.
	 */
	private static final Color mainExtraLightColor = new Color(240, 222,
			179);

	/**
	 * The main light color.
	 */
	private static final Color mainLightColor = new Color(235, 215, 166);

	/**
	 * The main medium color.
	 */
	private static final Color mainMidColor = new Color(200, 162, 110);

	/**
	 * The main dark color.
	 */
	private static final Color mainDarkColor = new Color(170, 131, 99);

	/**
	 * The main ultra-dark color.
	 */
	private static final Color mainUltraDarkColor = new Color(141, 97, 44);

	/**
	 * The foreground color.
	 */
	private static final Color foregroundColor = new Color(50, 34, 15);

	/**
	 * Creates a new active scheme for Cookbook skin.
	 */
	public ActiveScheme() {
		super("Cookbook Active");
	}

	@Override
	public Color getForegroundColor() {
		return ActiveScheme.foregroundColor;
	}

	@Override
	public Color getUltraLightColor() {
		return ActiveScheme.mainUltraLightColor;
	}

	@Override
	public Color getExtraLightColor() {
		return ActiveScheme.mainExtraLightColor;
	}

	@Override
	public Color getLightColor() {
		return ActiveScheme.mainLightColor;
	}

	@Override
	public Color getMidColor() {
		return ActiveScheme.mainMidColor;
	}

	@Override
	public Color getDarkColor() {
		return ActiveScheme.mainDarkColor;
	}

	@Override
	public Color getUltraDarkColor() {
		return ActiveScheme.mainUltraDarkColor;
	}
}