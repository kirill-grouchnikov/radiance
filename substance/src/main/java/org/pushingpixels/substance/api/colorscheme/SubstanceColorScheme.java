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

import org.pushingpixels.substance.api.trait.SubstanceTrait;

/**
 * General interface for color schemes.
 * 
 * @author Kirill Grouchnikov
 */
public interface SubstanceColorScheme extends SubstanceTrait, SchemeBaseColors,
		SchemeDerivedColors {
	/**
	 * Returns indication whether this color scheme uses dark colors. Note that
	 * this method may be removed in the future.
	 * 
	 * @return <code>true</code> if this color scheme uses dark colors,
	 *         <code>false</code> otherwise.
	 */
	public boolean isDark();

	/**
	 * Creates a shift version of <code>this</code> scheme.
	 * 
	 * @param backgroundShiftColor
	 *            Shift color for background colors. Should have full opacity.
	 * @param backgroundShiftFactor
	 *            Value in 0.0...1.0 range. Larger values shift more towards the
	 *            specified color.
	 * @param foregroundShiftColor
	 *            Shift color for foreground colors. Should have full opacity.
	 * @param foregroundShiftFactor
	 *            Value in 0.0...1.0 range. Larger values shift more towards the
	 *            specified color.
	 * @return Shift version of <code>this</code> scheme.
	 */
	public SubstanceColorScheme shift(Color backgroundShiftColor,
			double backgroundShiftFactor, Color foregroundShiftColor,
			double foregroundShiftFactor);

	/**
	 * Creates a shift version of <code>this</code> scheme.
	 * 
	 * @param backgroundShiftColor
	 *            Shift color for background colors. Should have full opacity.
	 * @param backgroundShiftFactor
	 *            Value in 0.0...1.0 range. Larger values shift more towards the
	 *            specified color.
	 * @return Shift version of <code>this</code> scheme that does not change
	 *         the foreground color.
	 */
	public SubstanceColorScheme shiftBackground(Color backgroundShiftColor,
			double backgroundShiftFactor);

	/**
	 * Creates a tinted (shifted towards white) version of <code>this</code>
	 * color scheme.
	 * 
	 * @param tintFactor
	 *            Value in 0.0...1.0 range. Larger values shift more towards
	 *            white color.
	 * @return Tinted version of <code>this</code> scheme.
	 */
	public SubstanceColorScheme tint(double tintFactor);

	/**
	 * Creates a toned (shifted towards gray) version of <code>this</code> color
	 * scheme.
	 * 
	 * @param toneFactor
	 *            Value in 0.0...1.0 range. Larger values shift more towards
	 *            gray color.
	 * @return Toned version of <code>this</code> scheme.
	 */
	public SubstanceColorScheme tone(double toneFactor);

	/**
	 * Creates a shaded (shifted towards black) version of <code>this</code>
	 * color scheme.
	 * 
	 * @param shadeFactor
	 *            Value in 0.0...1.0 range. Larger values shift more towards
	 *            black color.
	 * @return Shaded version of <code>this</code> scheme.
	 */
	public SubstanceColorScheme shade(double shadeFactor);

	/**
	 * Creates a saturated or desaturated version of <code>this</code> scheme.
	 * The value and brightness stay the same.
	 * 
	 * @param saturateFactor
	 *            Value in -1.0...1.0 range. Positive values create more
	 *            saturated colors. Negative values create more desaturated
	 *            colors.
	 * @return Saturated version of <code>this</code> scheme.
	 */
	public SubstanceColorScheme saturate(double saturateFactor);

	/**
	 * Creates an inverted version of <code>this</code> scheme.
	 * 
	 * @return Inverted version of <code>this</code> scheme.
	 */
	public SubstanceColorScheme invert();

	/**
	 * Creates a negated version of <code>this</code> scheme.
	 * 
	 * @return Negated version of <code>this</code> scheme.
	 */
	public SubstanceColorScheme negate();

	/**
	 * Creates a hue-shifted (in HSB space) version of <code>this</code> color
	 * scheme.
	 * 
	 * @param hueShiftFactor
	 *            Value in -1.0...1.0 range.
	 * @return Hue-shifted version of <code>this</code> scheme.
	 */
	public SubstanceColorScheme hueShift(double hueShiftFactor);

	/**
	 * This method is a fluent-interface builder utility for setting the display
	 * name for this color scheme. The implementation must return the same
	 * <code>this</code> instance.
	 * 
	 * @param colorSchemeDisplayName
	 *            New display name for this color scheme.
	 * @return This color scheme.
	 */
	public SubstanceColorScheme named(String colorSchemeDisplayName);
}
