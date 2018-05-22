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
package org.pushingpixels.substance.api.painter;

import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.trait.SubstanceTrait;

/**
 * Base painter with fraction-based stops and a color query associated with each
 * stop. This class allows creating multi-stop gradients with exact control over
 * which color is used at every gradient control point.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class FractionBasedPainter implements SubstanceTrait {
	/**
	 * The display name of this painter.
	 */
	private String displayName;

	/**
	 * The fractions of this painter. If the constructor has not thrown an
	 * {@link IllegalArgumentException}, the entries in this array are strictly
	 * increasing, starting from 0.0 and ending at 1.0.
	 */
	protected float[] fractions;

	/**
	 * The color queries of this painter. Each entry in this array corresponds
	 * to the matching index in the {@link #fractions}, specifying which color
	 * will be used at the relevant gradient control point. If the constructor
	 * has not thrown an {@link IllegalArgumentException}, the size of this
	 * array is identical to the size of {@link #fractions}, and there are no
	 * <code>null</code> entries in this array. Note that the application code
	 * can still cause an exception at runtime by throwing it in the
	 * implementation of the
	 * {@link ColorSchemeSingleColorQuery#query(SubstanceColorScheme)} method.
	 */
	protected ColorSchemeSingleColorQuery[] colorQueries;

	/**
	 * Creates a new fraction-based border painter.
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
	public FractionBasedPainter(String displayName, float[] fractions,
			ColorSchemeSingleColorQuery[] colorQueries) {
		this.displayName = displayName;
		if ((fractions == null) || (colorQueries == null)) {
			throw new IllegalArgumentException("Cannot pass null arguments");
		}
		if (fractions.length != colorQueries.length) {
			throw new IllegalArgumentException("Argument length does not match");
		}
		int length = fractions.length;
		if ((fractions[0] != 0.0f) || (fractions[length - 1] != 1.0f)) {
			throw new IllegalArgumentException(
					"End fractions must be 0.0 and 1.0");
		}
		for (int i = 0; i < length - 1; i++) {
			if (fractions[i + 1] <= fractions[i]) {
				throw new IllegalArgumentException(
						"Fractions must be strictly increasing");
			}
		}
		for (int i = 0; i < length; i++) {
			if (colorQueries[i] == null) {
				throw new IllegalArgumentException("Cannot pass null query");
			}
		}
		this.colorQueries = new ColorSchemeSingleColorQuery[length];
		System.arraycopy(colorQueries, 0, this.colorQueries, 0, length);
		this.fractions = new float[length];
		System.arraycopy(fractions, 0, this.fractions, 0, length);
	}

	@Override
	public String getDisplayName() {
		return this.displayName;
	}

	/**
	 * Returns the fractions of this painter.
	 * 
	 * @return Fractions of this painter.
	 */
	public float[] getFractions() {
		float[] result = new float[this.fractions.length];
		System.arraycopy(this.fractions, 0, result, 0, this.fractions.length);
		return result;
	}

	/**
	 * Returns the color queries of this painter.
	 * 
	 * @return Color queries of this painter.
	 */
	public ColorSchemeSingleColorQuery[] getColorQueries() {
		ColorSchemeSingleColorQuery[] result = new ColorSchemeSingleColorQuery[this.colorQueries.length];
		System.arraycopy(this.colorQueries, 0, result, 0,
				this.colorQueries.length);
		return result;
	}
}
