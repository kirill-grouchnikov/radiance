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
 * Resolver of derived colors for dark color schemes. This class is not
 * accessible outside the package and is for internal use only.
 * 
 * @author Kirill Grouchnikov
 */
class DerivedColorsResolverDark implements SchemeDerivedColors {
	/**
	 * The original color scheme.
	 */
	SubstanceColorScheme scheme;

	/**
	 * Creates the resolver of derived colors for the specified dark color
	 * scheme.
	 * 
	 * @param scheme
	 *            The original color scheme.
	 */
	public DerivedColorsResolverDark(SubstanceColorScheme scheme) {
		if (!scheme.isDark()) {
			throw new IllegalArgumentException(
					"The scheme must be dark: " + scheme.getDisplayName());
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
		return SubstanceColorUtilities.getAlphaColor(this.scheme.getUltraLightColor(), 30);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.SchemeDerivedColors#getWatermarkDarkColor
	 * ()
	 */
	@Override
	public Color getWatermarkDarkColor() {
		return this.scheme.getLightColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getWatermarkLightColor()
	 */
	public Color getWatermarkLightColor() {
		return this.scheme.getUltraLightColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#getLineColor()
	 */
	@Override
	public Color getLineColor() {
		return this.scheme.getMidColor();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getSelectionForegroundColor()
	 */
	@Override
	public Color getSelectionForegroundColor() {
		return this.scheme.getUltraDarkColor().darker();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getSelectionBackgroundColor()
	 */
	@Override
	public Color getSelectionBackgroundColor() {
		return this.scheme.getUltraLightColor().brighter();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.SchemeDerivedColors#
	 * getBackgroundFillColor()
	 */
	@Override
	public Color getBackgroundFillColor() {
		return this.scheme.getDarkColor().brighter();
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
		return SubstanceColorUtilities.getInterpolatedColor(this.scheme.getMidColor(),
				this.scheme.getLightColor(), 0.4f);
	}
}
