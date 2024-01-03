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
 * Base class for shifted color schemes. A shifted color scheme is based on some
 * original color scheme, a shift color and a shift factor. All colors of the
 * original color scheme are shifted towards the shift color based on the shift
 * factor. The closer the shift factor value is to 1.0, the closer the colors of
 * the shifted color scheme will be to the shift color.
 * 
 * @author Kirill Grouchnikov
 */
public class ShiftColorScheme extends BaseColorScheme {
	/**
	 * Shift factor for background colors.
	 */
	private double backgroundShiftFactor;

	/**
	 * Shift factor for foreground colors.
	 */
	private double foregroundShiftFactor;

	/**
	 * Shift color for background colors.
	 */
	private Color backgroundShiftColor;

	/**
	 * Shift color for foreground color.
	 */
	private Color foregroundShiftColor;

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
	 * Creates a new shifted color scheme.
	 * 
	 * @param origScheme
	 *            The original color scheme.
	 * @param shiftColor
	 *            Shift color for the colors.
	 * @param shiftFactor
	 *            Shift factor for the colors. Should be in 0.0-1.0 range.
	 */
	public ShiftColorScheme(RadianceColorScheme origScheme, Color shiftColor, double shiftFactor) {
		this(origScheme, shiftColor, shiftFactor, shiftColor, shiftFactor / 2.0, false);
	}

	/**
	 * Creates a new shifted color scheme.
	 * 
	 * @param origScheme
	 *            The original color scheme.
	 * @param backgroundShiftColor
	 *            Shift color for the background colors.
	 * @param backgroundShiftFactor
	 *            Shift factor for the background colors. Should be in 0.0-1.0
	 *            range.
	 * @param foregroundShiftColor
	 *            Shift color for the foreground colors.
	 * @param foregroundShiftFactor
	 *            Shift factor for the foreground colors. Should be in 0.0-1.0
	 *            range.
	 * @param shiftByBrightness
	 *            If <code>true</code>, the shift will account for the
	 *            brightness of the original color scheme colors.
	 */
	public ShiftColorScheme(RadianceColorScheme origScheme, Color backgroundShiftColor,
			double backgroundShiftFactor, Color foregroundShiftColor, double foregroundShiftFactor,
			boolean shiftByBrightness) {
		super("Shift " + origScheme.getDisplayName() + " to backgr [" + backgroundShiftColor + "] "
				+ (int) (100 * backgroundShiftFactor) + "%, foregr [" + foregroundShiftColor + "]"
				+ (int) (100 * foregroundShiftFactor) + "%", origScheme.isDark());
		this.backgroundShiftColor = backgroundShiftColor;
		this.backgroundShiftFactor = backgroundShiftFactor;
		this.foregroundShiftColor = foregroundShiftColor;
		this.foregroundShiftFactor = foregroundShiftFactor;
		this.origScheme = origScheme;
		this.foregroundColor = (this.foregroundShiftColor != null)
				? RadianceColorUtilities.getInterpolatedColor(this.foregroundShiftColor,
						origScheme.getForegroundColor(), this.foregroundShiftFactor)
				: origScheme.getForegroundColor();
		shiftByBrightness = shiftByBrightness && (this.backgroundShiftColor != null);
		Color ultraDarkToShiftTo = shiftByBrightness
				? RadianceColorUtilities.deriveByBrightness(this.backgroundShiftColor,
						origScheme.getUltraDarkColor())
				: this.backgroundShiftColor;
		this.mainUltraDarkColor = (this.backgroundShiftColor != null)
				? RadianceColorUtilities.getInterpolatedColor(ultraDarkToShiftTo,
						origScheme.getUltraDarkColor(), this.backgroundShiftFactor)
				: origScheme.getUltraDarkColor();
		Color darkToShiftTo = shiftByBrightness
				? RadianceColorUtilities.deriveByBrightness(this.backgroundShiftColor,
						origScheme.getDarkColor())
				: this.backgroundShiftColor;
		this.mainDarkColor = (this.backgroundShiftColor != null)
				? RadianceColorUtilities.getInterpolatedColor(darkToShiftTo,
						origScheme.getDarkColor(), this.backgroundShiftFactor)
				: origScheme.getDarkColor();
		Color midToShiftTo = shiftByBrightness
				? RadianceColorUtilities.deriveByBrightness(this.backgroundShiftColor,
						origScheme.getMidColor())
				: this.backgroundShiftColor;
		this.mainMidColor = (this.backgroundShiftColor != null)
				? RadianceColorUtilities.getInterpolatedColor(midToShiftTo,
						origScheme.getMidColor(), this.backgroundShiftFactor)
				: origScheme.getMidColor();
		Color lightToShiftTo = shiftByBrightness
				? RadianceColorUtilities.deriveByBrightness(this.backgroundShiftColor,
						origScheme.getLightColor())
				: this.backgroundShiftColor;
		this.mainLightColor = (this.backgroundShiftColor != null)
				? RadianceColorUtilities.getInterpolatedColor(lightToShiftTo,
						origScheme.getLightColor(), this.backgroundShiftFactor)
				: origScheme.getLightColor();
		Color extraLightToShiftTo = shiftByBrightness
				? RadianceColorUtilities.deriveByBrightness(this.backgroundShiftColor,
						origScheme.getExtraLightColor())
				: this.backgroundShiftColor;
		this.mainExtraLightColor = (this.backgroundShiftColor != null)
				? RadianceColorUtilities.getInterpolatedColor(extraLightToShiftTo,
						origScheme.getExtraLightColor(), this.backgroundShiftFactor)
				: origScheme.getExtraLightColor();
		Color ultraLightToShiftTo = shiftByBrightness
				? RadianceColorUtilities.deriveByBrightness(this.backgroundShiftColor,
						origScheme.getUltraLightColor())
				: this.backgroundShiftColor;
		this.mainUltraLightColor = (this.backgroundShiftColor != null)
				? RadianceColorUtilities.getInterpolatedColor(ultraLightToShiftTo,
						origScheme.getUltraLightColor(), this.backgroundShiftFactor)
				: origScheme.getUltraLightColor();
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
	 * Returns the shift factor.
	 * 
	 * @return Shift factor.
	 */
	public double getShiftFactor() {
		return this.backgroundShiftFactor;
	}
}
