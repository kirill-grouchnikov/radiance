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
package org.pushingpixels.radiance.theming.api.painter.fill;

import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.FractionBasedPainter;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;

/**
 * Fill painter with fraction-based stops and a color query associated with each
 * stop. This class allows creating multi-gradient fills with exact control over
 * which color is used at every gradient control point.
 * 
 * @author Kirill Grouchnikov
 */
public class FractionBasedFillPainter extends FractionBasedPainter implements
		RadianceFillPainter {
	/**
	 * Creates a new fraction-based fill painter.
	 * 
	 * @param displayName
	 *            The display name of this painter.
	 * @param fractions
	 *            The fractions of this painter. Must be strictly increasing,
	 *            starting from 0.0 and ending at 1.0.
	 * @param colorQueries
	 *            The color queries of this painter. Must have the same size as
	 *            the fractions array, and all entries must be non-
	 *            <code>null</code>.
	 */
	public FractionBasedFillPainter(String displayName, float[] fractions,
			ColorSchemeSingleColorQuery[] colorQueries) {
		super(displayName, fractions, colorQueries);
	}

	@Override
	public void paintContourBackground(Graphics g, Component comp, float width,
			float height, Shape contour, RadianceColorScheme fillScheme) {
		Graphics2D graphics = (Graphics2D) g.create();

		Color[] fillColors = new Color[this.fractions.length];
		for (int i = 0; i < this.fractions.length; i++) {
			ColorSchemeSingleColorQuery colorQuery = this.colorQueries[i];
			fillColors[i] = colorQuery.query(fillScheme);
		}

		MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0,
				height, this.fractions, fillColors, CycleMethod.REPEAT);
		graphics.setPaint(gradient);
		graphics.fill(contour);
		graphics.dispose();
	}

	@Override
	public Color getRepresentativeColor(RadianceColorScheme fillScheme) {
		for (int i = 0; i < this.fractions.length - 1; i++) {
			float fractionLow = this.fractions[i];
			float fractionHigh = this.fractions[i + 1];
			if (fractionLow == 0.5f) {
				return this.colorQueries[i].query(fillScheme);
			}
			if (fractionHigh == 0.5f) {
				return this.colorQueries[i + 1].query(fillScheme);
			}
			if ((fractionLow > 0.5f) || (fractionHigh < 0.5f)) {
				continue;
			}
			// current range contains 0.5f
			Color colorLow = this.colorQueries[i].query(fillScheme);
			Color colorHigh = this.colorQueries[i + 1].query(fillScheme);
			float colorLowLikeness = (0.5f - fractionLow) / (fractionHigh - fractionLow);
			return RadianceColorUtilities.getInterpolatedColor(colorLow, colorHigh,
					colorLowLikeness);
		}
		throw new IllegalStateException("Could not find representative color");
	}
}
