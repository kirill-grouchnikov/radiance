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
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

import java.awt.*;

/**
 * Saturated color scheme. A saturated color scheme is a color scheme that is
 * saturated / desaturated (using HSV).
 * 
 * @author Kirill Grouchnikov
 * @see ShiftColorScheme
 */
public class SaturatedColorScheme extends BaseColorScheme {
	/**
	 * Saturation factor.
	 */
	private double saturationFactor;

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
	 * The original color scheme.
	 */
	private RadianceColorScheme origScheme;

	/**
	 * Creates a new saturated color scheme.
	 * 
	 * @param origScheme
	 *            The original color scheme.
	 * @param saturationFactor
	 *            Saturation factor. Should be in -1.0..1.0 range.
	 */
	public SaturatedColorScheme(RadianceColorScheme origScheme,
			double saturationFactor) {
		super("Saturated (" + (int) (100 * saturationFactor) + "%) "
				+ origScheme.getDisplayName(), origScheme.isDark());
		this.saturationFactor = saturationFactor;
		this.origScheme = origScheme;
		this.foregroundColor = origScheme.getForegroundColor();
		this.mainUltraDarkColor = RadianceColorUtilities.getSaturatedColor(
				origScheme.getUltraDarkColor(), saturationFactor);
		this.mainDarkColor = RadianceColorUtilities.getSaturatedColor(
				origScheme.getDarkColor(), saturationFactor);
		this.mainMidColor = RadianceColorUtilities.getSaturatedColor(
				origScheme.getMidColor(), saturationFactor);
		this.mainLightColor = RadianceColorUtilities.getSaturatedColor(
				origScheme.getLightColor(), saturationFactor);
		this.mainExtraLightColor = RadianceColorUtilities.getSaturatedColor(
				origScheme.getExtraLightColor(), saturationFactor);
		this.mainUltraLightColor = RadianceColorUtilities.getSaturatedColor(
				origScheme.getUltraLightColor(), saturationFactor);
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
	 * Returns the original color scheme.
	 * 
	 * @return The original color scheme.
	 */
	public RadianceColorScheme getOrigScheme() {
		return this.origScheme;
	}

	/**
	 * Returns the saturation factor.
	 * 
	 * @return Saturation factor.
	 */
	public double getSaturationFactor() {
		return this.saturationFactor;
	}
}
