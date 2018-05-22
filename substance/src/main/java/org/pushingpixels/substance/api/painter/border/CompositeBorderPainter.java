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

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

/**
 * Composite border painter that delegates the painting of outer and inner
 * contours.
 * 
 * @author Kirill Grouchnikov
 * @since version 5.2
 */
public class CompositeBorderPainter implements SubstanceBorderPainter {
	/**
	 * Display name of this border painter.
	 */
	private String displayName;

	/**
	 * Delegate painter for painting the inner contrours.
	 */
	private SubstanceBorderPainter inner;

	/**
	 * Delegate painter for painting the outer contours.
	 */
	private SubstanceBorderPainter outer;

	/**
	 * Creates a new composite border painter.
	 * 
	 * @param displayName
	 *            Display name.
	 * @param outer
	 *            Delegate painter for painting the outer contours.
	 * @param inner
	 *            Delegate painter for painting the inner contrours.
	 */
	public CompositeBorderPainter(String displayName,
			SubstanceBorderPainter outer, SubstanceBorderPainter inner) {
		this.displayName = displayName;
		this.outer = outer;
		this.inner = inner;
	}

	@Override
	public boolean isPaintingInnerContour() {
		return true;
	}

	@Override
	public void paintBorder(Graphics g, Component c, float width, float height,
			Shape contour, Shape innerContour, SubstanceColorScheme borderScheme) {
		if (innerContour != null) {
			this.inner.paintBorder(g, c, width, height, innerContour, null,
					borderScheme);
		}
		if (contour != null) {
			this.outer.paintBorder(g, c, width, height, contour, null,
					borderScheme);
		}
	}

	@Override
	public String getDisplayName() {
		return this.displayName;
	}
	
	@Override
	public Color getRepresentativeColor(SubstanceColorScheme borderScheme) {
		return this.outer.getRepresentativeColor(borderScheme);
	}
}
