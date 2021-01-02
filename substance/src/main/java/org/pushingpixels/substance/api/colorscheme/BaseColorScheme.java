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

import org.pushingpixels.substance.internal.colorscheme.*;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

import java.awt.*;

/**
 * Base class for <b>Substance</b> color schemes.
 * 
 * @author Kirill Grouchnikov
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
	private SchemeDerivedColors derivedColorsResolver;

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
		this.derivedColorsResolver = this.isDark ? new DerivedColorsResolverDark(this)
				: new DerivedColorsResolverLight(this);
	}

	@Override
	public final String getDisplayName() {
		return this.displayName;
	}

	@Override
	public final boolean isDark() {
		return this.isDark;
	}

	@Override
	public final SubstanceColorScheme shift(Color backgroundShiftColor,
			double backgroundShiftFactor, Color foregroundShiftColor,
			double foregroundShiftFactor) {
		return new ShiftColorScheme(this, backgroundShiftColor,
				backgroundShiftFactor, foregroundShiftColor,
				foregroundShiftFactor, true);
	}

	@Override
	public final SubstanceColorScheme shiftBackground(
			Color backgroundShiftColor, double backgroundShiftFactor) {
		return this.shift(backgroundShiftColor, backgroundShiftFactor, null, 0.0);
	}

	@Override
	public SubstanceColorScheme tint(double tintFactor) {
		return new TintColorScheme(this, tintFactor);
	}

	@Override
	public SubstanceColorScheme tone(double toneFactor) {
		return new ToneColorScheme(this, toneFactor);
	}

	@Override
	public SubstanceColorScheme shade(double shadeFactor) {
		return new ShadeColorScheme(this, shadeFactor);
	}

	@Override
	public SubstanceColorScheme saturate(double saturateFactor) {
		return new SaturatedColorScheme(this, saturateFactor);
	}

	@Override
	public SubstanceColorScheme invert() {
		return new InvertedColorScheme(this);
	}

	@Override
	public SubstanceColorScheme negate() {
		return new NegatedColorScheme(this);
	}

	@Override
	public SubstanceColorScheme hueShift(double hueShiftFactor) {
		return new HueShiftColorScheme(this, hueShiftFactor);
	}

	@Override
	public SubstanceColorScheme blendWith(SubstanceColorScheme otherScheme,
			double likenessToThisScheme) {
		return new BlendBiColorScheme(this, otherScheme, likenessToThisScheme);
	}

	@Override
	public Color getBackgroundFillColor() {
		return derivedColorsResolver.getBackgroundFillColor();
	}

	@Override
	public Color getAccentedBackgroundFillColor() {
		return derivedColorsResolver.getAccentedBackgroundFillColor();
	}

	@Override
	public Color getFocusRingColor() {
		return derivedColorsResolver.getFocusRingColor();
	}

	@Override
	public Color getLineColor() {
		return derivedColorsResolver.getLineColor();
	}

	@Override
	public Color getSelectionForegroundColor() {
		return derivedColorsResolver.getSelectionForegroundColor();
	}

	@Override
	public Color getSelectionBackgroundColor() {
		return derivedColorsResolver.getSelectionBackgroundColor();
	}

	@Override
	public Color getTextBackgroundFillColor() {
		return derivedColorsResolver.getTextBackgroundFillColor();
	}

	@Override
	public Color getSeparatorPrimaryColor() {
		return derivedColorsResolver.getSeparatorPrimaryColor();
	}

	@Override
	public Color getSeparatorSecondaryColor() {
		return derivedColorsResolver.getSeparatorSecondaryColor();
	}

	@Override
	public Color getMarkColor() {
		return derivedColorsResolver.getMarkColor();
	}

	@Override
	public Color getEchoColor() {
		return derivedColorsResolver.getEchoColor();
	}

	@Override
	public final SubstanceColorScheme named(String colorSchemeDisplayName) {
		this.displayName = colorSchemeDisplayName;
		return this;
	}

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
