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

import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * Resolver of derived colors for light color schemes. This class is not
 * accessible outside the package and is for internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class DerivedColorsResolverLight implements SchemeDerivedColors {
	/**
	 * The original color scheme.
	 */
	SubstanceColorScheme scheme;

	/**
	 * Creates the resolver of derived colors for the specified light color
	 * scheme.
	 * 
	 * @param scheme
	 *            The original color scheme.
	 */
	public DerivedColorsResolverLight(SubstanceColorScheme scheme) {
		if (scheme.isDark()) {
			throw new IllegalArgumentException(
					"The scheme must be light: " + scheme.getDisplayName());
		}
		this.scheme = scheme;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getWatermarkStampColor()
	 */
	@Override
	public Color getWatermarkStampColor() {
		return SubstanceColorUtilities.getAlphaColor(this.scheme.getMidColor(), 50);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getWatermarkLightColor()
	 */
	public Color getWatermarkLightColor() {
		return this.scheme.getLightColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SchemeDerivedColors#getWatermarkDarkColor
	 * ()
	 */
	public Color getWatermarkDarkColor() {
		return SubstanceColorUtilities.getAlphaColor(this.scheme.getDarkColor(), 15);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#getLineColor()
	 */
	public Color getLineColor() {
		return SubstanceColorUtilities.getInterpolatedColor(this.scheme.getMidColor(),
				this.scheme.getDarkColor(), 0.7f);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getSelectionForegroundColor()
	 */
	@Override
	public Color getSelectionForegroundColor() {
		return this.scheme.getUltraDarkColor().darker().darker();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getSelectionBackgroundColor()
	 */
	@Override
	public Color getSelectionBackgroundColor() {
		return this.scheme.getExtraLightColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.scheme.getDisplayName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getBackgroundFillColor()
	 */
	@Override
	public Color getBackgroundFillColor() {
		return this.scheme.getExtraLightColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SchemeDerivedColors#getFocusRingColor()
	 */
	@Override
	public Color getFocusRingColor() {
		return SubstanceColorUtilities.getAlphaColor(this.scheme.getForegroundColor(), 192);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getTextBackgroundFillColor()
	 */
	@Override
	public Color getTextBackgroundFillColor() {
		return SubstanceColorUtilities.getInterpolatedColor(this.scheme.getUltraLightColor(),
				this.scheme.getExtraLightColor(), 0.8f);
	}
}
