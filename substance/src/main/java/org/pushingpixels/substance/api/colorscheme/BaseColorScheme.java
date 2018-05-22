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

import org.pushingpixels.substance.internal.colorscheme.HueShiftColorScheme;
import org.pushingpixels.substance.internal.colorscheme.InvertedColorScheme;
import org.pushingpixels.substance.internal.colorscheme.NegatedColorScheme;
import org.pushingpixels.substance.internal.colorscheme.SaturatedColorScheme;
import org.pushingpixels.substance.internal.colorscheme.ShadeColorScheme;
import org.pushingpixels.substance.internal.colorscheme.ShiftColorScheme;
import org.pushingpixels.substance.internal.colorscheme.TintColorScheme;
import org.pushingpixels.substance.internal.colorscheme.ToneColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * Base class for <b>Substance</b> color schemes.
 * 
 * @author kirillg
 */
public abstract class BaseColorScheme implements SubstanceColorScheme {
	/**
	 * Indicates whether this color scheme is dark.
	 */
	protected boolean isDark;

	/**
	 * Display name of this color scheme.
	 */
	protected String displayName;

	/**
	 * Resolver for the derived colors.
	 */
	protected SchemeDerivedColors derivedColorsResolver;

	/**
	 * Constructs the basic functionality of a color scheme.
	 * 
	 * @param displayName
	 *            Display name.
	 * @param isDark
	 *            Indication whether the color scheme is dark.
	 */
	protected BaseColorScheme(String displayName, boolean isDark) {
		this.displayName = displayName;
		this.isDark = isDark;
		this.derivedColorsResolver = this.isDark ? new DerivedColorsResolverDark(
				this)
				: new DerivedColorsResolverLight(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.trait.SubstanceTrait#getDisplayName()
	 */
	@Override
	public final String getDisplayName() {
		return this.displayName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SubstanceColorScheme#isDark()
	 */
	@Override
	public final boolean isDark() {
		return this.isDark;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SubstanceColorScheme#shift(java.awt.Color
	 * , double, java.awt.Color, double)
	 */
	public final SubstanceColorScheme shift(Color backgroundShiftColor,
			double backgroundShiftFactor, Color foregroundShiftColor,
			double foregroundShiftFactor) {
		return new ShiftColorScheme(this, backgroundShiftColor,
				backgroundShiftFactor, foregroundShiftColor,
				foregroundShiftFactor, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SubstanceColorScheme#shiftBackground(
	 * java.awt .Color, double)
	 */
	@Override
	public final SubstanceColorScheme shiftBackground(
			Color backgroundShiftColor, double backgroundShiftFactor) {
		return this.shift(backgroundShiftColor, backgroundShiftFactor, null,
				0.0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SubstanceColorScheme#tint(double)
	 */
	public SubstanceColorScheme tint(double tintFactor) {
		return new TintColorScheme(this, tintFactor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SubstanceColorScheme#tone(double)
	 */
	public SubstanceColorScheme tone(double toneFactor) {
		return new ToneColorScheme(this, toneFactor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SubstanceColorScheme#shade(double)
	 */
	public SubstanceColorScheme shade(double shadeFactor) {
		return new ShadeColorScheme(this, shadeFactor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SubstanceColorScheme#saturate(double)
	 */
	public SubstanceColorScheme saturate(double saturateFactor) {
		return new SaturatedColorScheme(this, saturateFactor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SubstanceColorScheme#invert()
	 */
	public SubstanceColorScheme invert() {
		return new InvertedColorScheme(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SubstanceColorScheme#negate()
	 */
	public SubstanceColorScheme negate() {
		return new NegatedColorScheme(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SubstanceColorScheme#hueShift(double)
	 */
	public SubstanceColorScheme hueShift(double hueShiftFactor) {
		return new HueShiftColorScheme(this, hueShiftFactor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SchemeDerivedColors#getBackgroundFillColor
	 * ()
	 */
	public final Color getBackgroundFillColor() {
		return derivedColorsResolver.getBackgroundFillColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SchemeDerivedColors#getFocusRingColor()
	 */
	@Override
	public final Color getFocusRingColor() {
		return derivedColorsResolver.getFocusRingColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#getLineColor()
	 */
	public final Color getLineColor() {
		return derivedColorsResolver.getLineColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.pushingpixels.substance.api.SchemeDerivedColors#
	 * getSelectionForegroundColor()
	 */
	public final Color getSelectionForegroundColor() {
		return derivedColorsResolver.getSelectionForegroundColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.pushingpixels.substance.api.SchemeDerivedColors#
	 * getSelectionBackgroundColor()
	 */
	@Override
	public final Color getSelectionBackgroundColor() {
		return derivedColorsResolver.getSelectionBackgroundColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SchemeDerivedColors#getWatermarkDarkColor
	 * ()
	 */
	public final Color getWatermarkDarkColor() {
		return derivedColorsResolver.getWatermarkDarkColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SchemeDerivedColors#getWatermarkLightColor
	 * ()
	 */
	public final Color getWatermarkLightColor() {
		return derivedColorsResolver.getWatermarkLightColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SchemeDerivedColors#getWatermarkStampColor
	 * ()
	 */
	@Override
	public final Color getWatermarkStampColor() {
		return derivedColorsResolver.getWatermarkStampColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.pushingpixels.substance.api.SchemeDerivedColors#
	 * getTextBackgroundFillColor()
	 */
	@Override
	public final Color getTextBackgroundFillColor() {
		return derivedColorsResolver.getTextBackgroundFillColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SubstanceColorScheme#named(java.lang.
	 * String)
	 */
	@Override
	public final SubstanceColorScheme named(String colorSchemeDisplayName) {
		this.displayName = colorSchemeDisplayName;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getDisplayName() + " {\n    kind="
				+ (this.isDark() ? "Dark" : "Light") + "\n    colorUltraLight="
				+ SubstanceColorUtilities.encode(this.getUltraLightColor())
				+ "\n    colorExtraLight="
				+ SubstanceColorUtilities.encode(this.getExtraLightColor())
				+ "\n    colorLight="
				+ SubstanceColorUtilities.encode(this.getLightColor())
				+ "\n    colorMid="
				+ SubstanceColorUtilities.encode(this.getMidColor())
				+ "\n    colorDark="
				+ SubstanceColorUtilities.encode(this.getDarkColor())
				+ "\n    colorUltraDark="
				+ SubstanceColorUtilities.encode(this.getUltraDarkColor())
				+ "\n    colorForeground="
				+ SubstanceColorUtilities.encode(this.getForegroundColor())
				+ "\n}";
	}
}
