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
package org.pushingpixels.radiance.theming.api.painter.border;

import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

import java.awt.*;

/**
 * Composite border painter that delegates the painting of outer and inner
 * contours.
 * 
 * @author Kirill Grouchnikov
 */
public class CompositeBorderPainter implements RadianceBorderPainter {
	/**
	 * Display name of this border painter.
	 */
	private String displayName;

	/**
	 * Delegate painter for painting the inner contours.
	 */
	private RadianceBorderPainter inner;

	/**
	 * Delegate painter for painting the outer contours.
	 */
	private RadianceBorderPainter outer;

	/**
	 * Creates a new composite border painter.
	 * 
	 * @param displayName
	 *            Display name.
	 * @param outer
	 *            Delegate painter for painting the outer contours.
	 * @param inner
	 *            Delegate painter for painting the inner contours.
	 */
	public CompositeBorderPainter(String displayName,
			RadianceBorderPainter outer, RadianceBorderPainter inner) {
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
			Shape contour, Shape innerContour, RadianceColorScheme borderScheme) {
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
	public Color getRepresentativeColor(RadianceColorScheme borderScheme) {
		return this.outer.getRepresentativeColor(borderScheme);
	}
}
