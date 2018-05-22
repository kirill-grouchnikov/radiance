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
package org.pushingpixels.substance.api.painter.border;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.RenderingHints;
import java.awt.Shape;

import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceInternalArrowButton;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

/**
 * Delegate border painter that allows tweaking the visual appearance of
 * borders.
 * 
 * @author Kirill Grouchnikov
 */
public class DelegateFractionBasedBorderPainter implements SubstanceBorderPainter {
	/**
	 * Display name of this border painter.
	 */
	protected String displayName;

	/**
	 * The delegate border painter.
	 */
	protected FractionBasedBorderPainter delegate;

	/**
	 * 8-digit hexadecimal masks applied on the colors painted by
	 * {@link #delegate}. Can be used to apply custom translucency. For example,
	 * value 0x80FFFFFF will result in 50% translucency of the original border
	 * color.
	 */
	protected int[] masks;

	/**
	 * Transformation to be applied on the color schemes prior to compute the
	 * colors to be used for border painting.
	 */
	protected ColorSchemeTransform transform;

	/**
	 * Creates a new delegate border painter
	 * 
	 * @param displayName
	 *            Display name of this border painter.
	 * @param delegate
	 *            The delegate border painter.
	 * @param masks
	 *            Array of 8-digit hexadecimal masks applied on the relevant
	 *            colors painted by the <code>delegate</code>.
	 * @param transform
	 *            Transformation to be applied on the color schemes prior to
	 *            compute the colors to be used for border painting.
	 */
	public DelegateFractionBasedBorderPainter(String displayName,
			FractionBasedBorderPainter delegate, int[] masks, ColorSchemeTransform transform) {
		this.displayName = displayName;
		this.delegate = delegate;
		this.masks = new int[masks.length];
		System.arraycopy(masks, 0, this.masks, 0, masks.length);
		this.transform = transform;
	}

	/**
	 * Map of transformed color schemes (to speed up the subsequent lookups).
	 */
	protected final static LazyResettableHashMap<SubstanceColorScheme> transformMap = new LazyResettableHashMap<SubstanceColorScheme>(
			"DelegateBorderPainter");

	@Override
	public boolean isPaintingInnerContour() {
		return false;
	}

	@Override
	public void paintBorder(Graphics g, Component c, float width, float height, Shape contour,
			Shape innerContour, SubstanceColorScheme borderScheme) {
		Graphics2D graphics = (Graphics2D) g.create();
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
				RenderingHints.VALUE_STROKE_PURE);

		// shift schemes
		SubstanceColorScheme scheme = getShiftScheme(borderScheme);

		float[] fractions = delegate.getFractions();
		ColorSchemeSingleColorQuery[] colorQueries = delegate.getColorQueries();
		Color[] fillColors = new Color[fractions.length];
		for (int i = 0; i < fractions.length; i++) {
			ColorSchemeSingleColorQuery colorQuery = colorQueries[i];
			Color color = colorQuery.query(scheme);
			// apply masks
			color = new Color(this.masks[i] & color.getRGB(), true);
			fillColors[i] = color;
		}

		float strokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		// issue 433 - the "c" can be null when painting
		// the border of a tree icon used outside the
		// JTree context.
		boolean isSpecialButton = (c != null) && c.getClass()
				.isAnnotationPresent(SubstanceInternalArrowButton.class);
		int joinKind = isSpecialButton ? BasicStroke.JOIN_MITER : BasicStroke.JOIN_ROUND;
		int capKind = isSpecialButton ? BasicStroke.CAP_SQUARE : BasicStroke.CAP_BUTT;
		graphics.setStroke(new BasicStroke(strokeWidth, capKind, joinKind));

		MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0, height, fractions,
				fillColors, CycleMethod.REPEAT);
		graphics.setPaint(gradient);
		graphics.draw(contour);
		graphics.dispose();
	}

	@Override
	public String getDisplayName() {
		return this.displayName;
	}

	/**
	 * Retrieves a transformed color scheme.
	 * 
	 * @param orig
	 *            Original color scheme.
	 * @return Transformed color scheme.
	 */
	private SubstanceColorScheme getShiftScheme(SubstanceColorScheme orig) {
		HashMapKey key = SubstanceCoreUtilities.getHashKey(orig.getDisplayName(),
				this.getDisplayName(), this.transform);
		SubstanceColorScheme result = transformMap.get(key);
		if (result == null) {
			result = this.transform.transform(orig);
			transformMap.put(key, result);
		}
		return result;
	}

	@Override
	public Color getRepresentativeColor(SubstanceColorScheme borderScheme) {
		float[] fractions = delegate.getFractions();
		ColorSchemeSingleColorQuery[] colorQueries = delegate.getColorQueries();

		for (int i = 0; i < fractions.length - 1; i++) {
			float fractionLow = fractions[i];
			float fractionHigh = fractions[i + 1];
			if (fractionLow == 0.5f) {
				return new Color(this.masks[i] & colorQueries[i].query(borderScheme).getRGB(),
						true);
			}
			if (fractionHigh == 0.5f) {
				return new Color(
						this.masks[i + 1] & colorQueries[i + 1].query(borderScheme).getRGB(), true);
			}
			if ((fractionLow < 0.5f) || (fractionHigh > 0.5f)) {
				continue;
			}
			// current range contains 0.5f
			Color colorLow = new Color(this.masks[i] & colorQueries[i].query(borderScheme).getRGB(),
					true);
			Color colorHigh = new Color(
					this.masks[i + 1] & colorQueries[i + 1].query(borderScheme).getRGB(), true);
			float colorLowLikeness = (0.5f - fractionLow) / (fractionHigh - fractionLow);
			return SubstanceColorUtilities.getInterpolatedColor(colorLow, colorHigh,
					colorLowLikeness);
		}
		throw new IllegalStateException("Could not find representative color");
	}
}
