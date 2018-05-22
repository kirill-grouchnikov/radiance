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
package org.pushingpixels.substance.internal.colorscheme;

import java.awt.Color;

import org.pushingpixels.substance.api.colorscheme.BaseColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

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
	private SubstanceColorScheme firstScheme;

	/**
	 * The secondary original color scheme.
	 */
	private SubstanceColorScheme secondScheme;

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
	public BlendBiColorScheme(SubstanceColorScheme firstScheme,
			SubstanceColorScheme secondScheme, double firstSchemeLikeness) {
		super("Blended " + firstScheme.getDisplayName() + " & "
				+ secondScheme.getDisplayName() + " " + firstSchemeLikeness,
				firstScheme.isDark());
		this.firstScheme = firstScheme;
		this.secondScheme = secondScheme;
		this.firstSchemeLikeness = firstSchemeLikeness;
		this.foregroundColor = new Color(SubstanceColorUtilities
				.getInterpolatedRGB(firstScheme.getForegroundColor(),
						secondScheme.getForegroundColor(), firstSchemeLikeness));
		this.mainUltraDarkColor = new Color(SubstanceColorUtilities
				.getInterpolatedRGB(firstScheme.getUltraDarkColor(),
						secondScheme.getUltraDarkColor(), firstSchemeLikeness));
		this.mainDarkColor = new Color(SubstanceColorUtilities
				.getInterpolatedRGB(firstScheme.getDarkColor(), secondScheme
						.getDarkColor(), firstSchemeLikeness));
		this.mainMidColor = new Color(SubstanceColorUtilities
				.getInterpolatedRGB(firstScheme.getMidColor(), secondScheme
						.getMidColor(), firstSchemeLikeness));
		this.mainLightColor = new Color(SubstanceColorUtilities
				.getInterpolatedRGB(firstScheme.getLightColor(), secondScheme
						.getLightColor(), firstSchemeLikeness));
		this.mainExtraLightColor = new Color(SubstanceColorUtilities
				.getInterpolatedRGB(firstScheme.getExtraLightColor(),
						secondScheme.getExtraLightColor(), firstSchemeLikeness));
		this.mainUltraLightColor = new Color(SubstanceColorUtilities
				.getInterpolatedRGB(firstScheme.getUltraLightColor(),
						secondScheme.getUltraLightColor(), firstSchemeLikeness));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getForegroundColor()
	 */
	public Color getForegroundColor() {
		return this.foregroundColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getUltraLightColor()
	 */
	public Color getUltraLightColor() {
		return this.mainUltraLightColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getExtraLightColor()
	 */
	public Color getExtraLightColor() {
		return this.mainExtraLightColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getLightColor()
	 */
	public Color getLightColor() {
		return this.mainLightColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getMidColor()
	 */
	public Color getMidColor() {
		return this.mainMidColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getDarkColor()
	 */
	public Color getDarkColor() {
		return this.mainDarkColor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.color.ColorScheme#getUltraDarkColor()
	 */
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
	public SubstanceColorScheme getFirstScheme() {
		return this.firstScheme;
	}

	/**
	 * Returns the secondary original color scheme.
	 * 
	 * @return The secondary original color scheme.
	 */
	public SubstanceColorScheme getSecondScheme() {
		return this.secondScheme;
	}
}
