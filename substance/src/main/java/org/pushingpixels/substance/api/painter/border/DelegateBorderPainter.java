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

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;

import org.pushingpixels.substance.api.colorscheme.ColorSchemeTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Delegate border painter that allows tweaking the visual appearance of
 * borders.
 * 
 * @author Kirill Grouchnikov
 */
public class DelegateBorderPainter extends StandardBorderPainter {
	/**
	 * Display name of this border painter.
	 */
	protected String displayName;

	/**
	 * The delegate border painter.
	 */
	protected StandardBorderPainter delegate;

	/**
	 * 8-digit hexadecimal mask applied on the top color painted by
	 * {@link #delegate}. Can be used to apply custom translucency. For example,
	 * value 0x80FFFFFF will result in 50% translucency of the original top
	 * border color.
	 */
	protected int topMask;

	/**
	 * 8-digit hexadecimal mask applied on the middle color painted by
	 * {@link #delegate}. Can be used to apply custom translucency. For example,
	 * value 0x80FFFFFF will result in 50% translucency of the original middle
	 * border color.
	 */
	protected int midMask;

	/**
	 * 8-digit hexadecimal mask applied on the bottom color painted by
	 * {@link #delegate}. Can be used to apply custom translucency. For example,
	 * value 0x80FFFFFF will result in 50% translucency of the original bottom
	 * border color.
	 */
	protected int bottomMask;

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
	 * @param transform
	 *            Transformation to be applied on the color schemes prior to
	 *            compute the colors to be used for border painting.
	 */
	public DelegateBorderPainter(String displayName,
			StandardBorderPainter delegate, ColorSchemeTransform transform) {
		this(displayName, delegate, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF,
				transform);
	}

	/**
	 * Creates a new delegate border painter
	 * 
	 * @param displayName
	 *            Display name of this border painter.
	 * @param delegate
	 *            The delegate border painter.
	 * @param topMask
	 *            8-digit hexadecimal mask applied on the top color painted by
	 *            the <code>delegate</code>.
	 * @param midMask
	 *            8-digit hexadecimal mask applied on the middle color painted
	 *            by the <code>delegate</code>.
	 * @param bottomMask
	 *            8-digit hexadecimal mask applied on the bottom color painted
	 *            by the <code>delegate</code>.
	 * @param transform
	 *            Transformation to be applied on the color schemes prior to
	 *            compute the colors to be used for border painting.
	 */
	public DelegateBorderPainter(String displayName,
			StandardBorderPainter delegate, int topMask, int midMask,
			int bottomMask, ColorSchemeTransform transform) {
		this.displayName = displayName;
		this.delegate = delegate;
		this.topMask = topMask;
		this.midMask = midMask;
		this.bottomMask = bottomMask;
		this.transform = transform;
	}

	/**
	 * Map of transformed color schemes (to speed up the subsequent lookups).
	 */
	protected final static LazyResettableHashMap<SubstanceColorScheme> transformMap =
			new LazyResettableHashMap<SubstanceColorScheme>("DelegateBorderPainter");

	@Override
	public Color getTopBorderColor(SubstanceColorScheme borderScheme) {
		return new Color(this.topMask
				& this.delegate.getTopBorderColor(borderScheme).getRGB(), true);
	}

	@Override
	public Color getMidBorderColor(SubstanceColorScheme borderScheme) {
		return new Color(this.midMask
				& this.delegate.getMidBorderColor(borderScheme).getRGB(), true);
	}

	@Override
	public Color getBottomBorderColor(SubstanceColorScheme borderScheme) {
		return new Color(this.bottomMask
				& this.delegate.getBottomBorderColor(borderScheme).getRGB(),
				true);
	}

	@Override
	public void paintBorder(Graphics g, Component c, float width, float height,
			Shape contour, Shape innerContour, SubstanceColorScheme borderScheme) {
		super.paintBorder(g, c, width, height, contour, innerContour,
				getShiftScheme(borderScheme));
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
		HashMapKey key = SubstanceCoreUtilities.getHashKey(orig
				.getDisplayName(), this.getDisplayName(), this.transform);
		SubstanceColorScheme result = transformMap.get(key);
		if (result == null) {
			result = this.transform.transform(orig);
			transformMap.put(key, result);
		}
		return result;
	}

	@Override
	public Color getRepresentativeColor(SubstanceColorScheme borderScheme) {
		return super.getRepresentativeColor(getShiftScheme(borderScheme));
	}
}
