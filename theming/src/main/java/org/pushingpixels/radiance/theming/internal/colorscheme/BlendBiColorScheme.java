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
package org.pushingpixels.radiance.theming.internal.colorscheme;

import org.pushingpixels.radiance.theming.api.colorscheme.BaseColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;

/**
 * Blended color scheme.
 * 
 * @author Kirill Grouchnikov
 */
public class BlendBiColorScheme extends BaseColorScheme {
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
	 * The main original color scheme.
	 */
	private RadianceColorScheme firstScheme;

	/**
	 * The secondary original color scheme.
	 */
	private RadianceColorScheme secondScheme;

	/**
	 * Likeness to the first scheme. Values close to 0.0 will create scheme that
	 * closely matches the second original scheme. Values close to 1.0 will
	 * create scheme that closely matches the second original scheme.
	 */
	private double firstSchemeLikeness;

	/**
	 * Creates a new blended color scheme.
	 * 
	 * @param firstScheme
	 *            The first original color scheme.
	 * @param secondScheme
	 *            The second original color scheme.
	 * @param firstSchemeLikeness
	 *            Likeness to the first scheme. Values close to 0.0 will create
	 *            scheme that closely matches the second original scheme. Values
	 *            close to 1.0 will create scheme that closely matches the
	 *            second original scheme.
	 */
	public BlendBiColorScheme(RadianceColorScheme firstScheme,
			RadianceColorScheme secondScheme, double firstSchemeLikeness) {
		super("Blended " + firstScheme.getDisplayName() + " & "
				+ secondScheme.getDisplayName() + " " + firstSchemeLikeness,
				firstScheme.isDark());
		this.firstScheme = firstScheme;
		this.secondScheme = secondScheme;
		this.firstSchemeLikeness = firstSchemeLikeness;
		this.foregroundColor = new Color(RadianceColorUtilities
				.getInterpolatedRGB(firstScheme.getForegroundColor(),
						secondScheme.getForegroundColor(), firstSchemeLikeness));
		this.mainUltraDarkColor = new Color(RadianceColorUtilities
				.getInterpolatedRGB(firstScheme.getUltraDarkColor(),
						secondScheme.getUltraDarkColor(), firstSchemeLikeness));
		this.mainDarkColor = new Color(RadianceColorUtilities
				.getInterpolatedRGB(firstScheme.getDarkColor(), secondScheme
						.getDarkColor(), firstSchemeLikeness));
		this.mainMidColor = new Color(RadianceColorUtilities
				.getInterpolatedRGB(firstScheme.getMidColor(), secondScheme
						.getMidColor(), firstSchemeLikeness));
		this.mainLightColor = new Color(RadianceColorUtilities
				.getInterpolatedRGB(firstScheme.getLightColor(), secondScheme
						.getLightColor(), firstSchemeLikeness));
		this.mainExtraLightColor = new Color(RadianceColorUtilities
				.getInterpolatedRGB(firstScheme.getExtraLightColor(),
						secondScheme.getExtraLightColor(), firstSchemeLikeness));
		this.mainUltraLightColor = new Color(RadianceColorUtilities
				.getInterpolatedRGB(firstScheme.getUltraLightColor(),
						secondScheme.getUltraLightColor(), firstSchemeLikeness));
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
	 * Returns the likeness to the first scheme.
	 * 
	 * @return Likeness to the first scheme
	 */
	public double getFirstSchemeLikeness() {
		return this.firstSchemeLikeness;
	}

	/**
	 * Returns the main original color scheme.
	 * 
	 * @return The main original color scheme.
	 */
	public RadianceColorScheme getFirstScheme() {
		return this.firstScheme;
	}

	/**
	 * Returns the secondary original color scheme.
	 * 
	 * @return The secondary original color scheme.
	 */
	public RadianceColorScheme getSecondScheme() {
		return this.secondScheme;
	}
}
