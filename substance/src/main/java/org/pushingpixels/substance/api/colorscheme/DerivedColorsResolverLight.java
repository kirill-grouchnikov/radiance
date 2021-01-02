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

import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

import java.awt.*;

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
	private SubstanceColorScheme scheme;

	/**
	 * Creates the resolver of derived colors for the specified light color
	 * scheme.
	 * 
	 * @param scheme
	 *            The original color scheme.
	 */
	public DerivedColorsResolverLight(SubstanceColorScheme scheme) {
		if (scheme.isDark()) {
			throw new IllegalArgumentException("The scheme must be light: " + scheme.getDisplayName());
		}
		this.scheme = scheme;
	}

	@Override
	public String toString() {
		return "Resolver for " + this.scheme.getDisplayName();
	}

	@Override
	public Color getLineColor() {
		return SubstanceColorUtilities.getInterpolatedColor(this.scheme.getMidColor(),
				this.scheme.getDarkColor(), 0.7f);
	}

	@Override
	public Color getSelectionForegroundColor() {
		return this.scheme.getForegroundColor();
	}

	@Override
	public Color getSelectionBackgroundColor() {
		return this.scheme.getExtraLightColor();
	}

	@Override
	public Color getBackgroundFillColor() {
		return this.scheme.getExtraLightColor();
	}

	@Override
	public Color getAccentedBackgroundFillColor() {
		return SubstanceColorUtilities.getDarkerColor(this.scheme.getExtraLightColor(), 0.08f);
	}

	@Override
	public Color getFocusRingColor() {
		return SubstanceColorUtilities.getAlphaColor(this.scheme.getForegroundColor(), 192);
	}

	@Override
	public Color getTextBackgroundFillColor() {
		return SubstanceColorUtilities.getInterpolatedColor(this.scheme.getUltraLightColor(),
				this.scheme.getExtraLightColor(), 0.8f);
	}

	@Override
	public Color getSeparatorPrimaryColor() {
		return SubstanceColorUtilities.getInterpolatedColor(this.scheme.getMidColor(),
				this.scheme.getDarkColor(), 0.4f);
	}

	@Override
	public Color getSeparatorSecondaryColor() {
		return this.scheme.getUltraLightColor();
	}

	@Override
	public Color getMarkColor() {
		return SubstanceColorUtilities.getInterpolatedColor(this.scheme.getForegroundColor(),
				this.scheme.getUltraDarkColor(), 0.7);
	}

	@Override
	public Color getEchoColor() {
		return this.scheme.getUltraLightColor();
	}
}
