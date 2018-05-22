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
package org.pushingpixels.substance.internal.utils;

import java.awt.Component;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.util.Set;

import org.pushingpixels.substance.api.SubstanceSlices.Side;

/**
 * Provides common functionality that can be used by button shapers. This class
 * is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceOutlineUtilities {
	/**
	 * Returns basic outline for the specified component. The basic outline is a
	 * rectangle with rounded corners. Some corners may not be rounded based on
	 * the contents of <code>straightSide</code> parameter.
	 * 
	 * @param comp
	 *            Component.
	 * @param radius
	 *            Corner radius.
	 * @param straightSides
	 *            Contains all sides which are straight.
	 * @return The basic outline for the specified parameters.
	 */
	public static GeneralPath getBaseOutline(Component comp, float radius,
			Set<Side> straightSides) {
		int width = comp.getWidth();
		int height = comp.getHeight();

		return getBaseOutline(width, height, radius, straightSides);
	}

	/**
	 * Returns basic outline for the specified parameters. The basic outline is
	 * a rectangle with rounded corners. Some corners may not be rounded based
	 * on the contents of <code>straightSide</code> parameter.
	 * 
	 * @param width
	 *            Width of some UI component.
	 * @param height
	 *            Height of some UI component.
	 * @param radius
	 *            Corner radius.
	 * @param straightSides
	 *            Contains all sides which are straight.
	 * @return The basic outline for the specified parameters.
	 */
	public static GeneralPath getBaseOutline(float width, float height,
			float radius, Set<Side> straightSides) {
		return getBaseOutline(width, height, radius, straightSides, 0.0f);
	}

	/**
	 * Returns basic outline for the specified parameters. The basic outline is
	 * a rectangle with rounded corners. Some corners may not be rounded based
	 * on the contents of <code>straightSides</code> parameter.
	 * 
	 * @param width
	 *            Width of some UI component.
	 * @param height
	 *            Height of some UI component.
	 * @param radius
	 *            Corner radius.
	 * @param straightSides
	 *            Contains all sides which are straight.
	 * @param insets
	 *            Shape insets.
	 * @return The basic outline for the specified parameters.
	 */
	public static GeneralPath getBaseOutline(float width, float height,
			float radius, Set<Side> straightSides, float insets) {
		boolean isTopLeftCorner = (straightSides != null)
				&& (straightSides.contains(Side.LEFT) || straightSides
						.contains(Side.TOP));
		boolean isTopRightCorner = (straightSides != null)
				&& (straightSides.contains(Side.RIGHT) || straightSides
						.contains(Side.TOP));
		boolean isBottomRightCorner = (straightSides != null)
				&& (straightSides.contains(Side.RIGHT) || straightSides
						.contains(Side.BOTTOM));
		boolean isBottomLeftCorner = (straightSides != null)
				&& (straightSides.contains(Side.LEFT) || straightSides
						.contains(Side.BOTTOM));

		float xs = insets;
		float ys = insets;
		width -= 2 * insets;
		height -= 2 * insets;

		GeneralPath result = new GeneralPath();

		if (isTopLeftCorner || (radius <= 0.0f)) {
			result.moveTo(xs, ys);
		} else {
			result.moveTo(xs + radius, ys);
		}

		if (isTopRightCorner || (radius <= 0.0f)) {
			result.lineTo(xs + width, ys);
		} else {
			if (isTopLeftCorner || ((xs + width - radius) >= radius)) {
				result.lineTo(xs + width - radius, ys);
			}
			result.append(new Arc2D.Double(xs + width - 2 * radius, ys,
					2 * radius, 2 * radius, 90, -90, Arc2D.OPEN), true);
		}

		if (isBottomRightCorner || (radius <= 0.0f)) {
			result.lineTo(xs + width, ys + height);
		} else {
			if (isTopRightCorner || ((ys + height - radius) >= radius)) {
				result.lineTo(xs + width, ys + height - radius);
			}

			result.append(new Arc2D.Double(xs + width - 2 * radius, 
					ys + height - 2 * radius, 2 * radius, 2 * radius, 0, -90,
					Arc2D.OPEN), true);
		}

		if (isBottomLeftCorner || (radius <= 0.0f)) {
			result.lineTo(xs, ys + height);
		} else {
			if (isBottomRightCorner || ((xs + width - radius) >= radius)) {
				result.lineTo(xs + radius, ys + height);
			}
			result.append(new Arc2D.Double(xs, ys + height - 2 * radius,
					2 * radius, 2 * radius, 270, -90, Arc2D.OPEN), true);
		}

		if (isTopLeftCorner || (radius == 0.0f)) {
			result.lineTo(xs, ys);
		} else {
			if (isBottomLeftCorner || ((ys + height - radius) >= radius)) {
				result.lineTo(xs, ys + radius);
			}
			result.append(new Arc2D.Double(xs, ys, 2 * radius, 2 * radius, 180,
					-90, Arc2D.OPEN), true);
		}

		return result;
	}

	/**
	 * Returns outline that has a triangle pointing downwards. The top two
	 * corners in the outline are rounded. This function can be used to draw
	 * slider thumbs.
	 * 
	 * @param width
	 *            Width of some UI component.
	 * @param height
	 *            Height of some UI component.
	 * @param radius
	 *            Corner radius for the top two corners.
	 * @param insets
	 *            Insets to compute the outline.
	 * @return Outline that has a triangle poiting downwards.
	 */
	public static GeneralPath getTriangleButtonOutline(float width, float height,
			float radius, float insets) {

		float xs = insets;
		float ys = insets + 1;
		float xe = width - insets;
		float ye = height - insets;
		width -= 2 * insets;
		height -= 2 * insets;

		GeneralPath result = new GeneralPath();
		float radius3 = (float) (radius / (1.5 * Math.pow(height, 0.5)));
		if (Math.max(width, height) < 15)
			radius3 /= 2;

		result.moveTo(radius + xs, ys);

		if ((xe - radius) >= radius) {
			result.lineTo(xe - radius, ys);
		}
		result.quadTo(xe - radius3, ys + radius3, xe, ys + radius);

		float h2 = (ye - 1.0f) / 2.0f;
		if (h2 >= radius) {
			result.lineTo(xe, h2);
		}

		result.lineTo((xs + xe) / 2.0f, ye - 1);
		result.lineTo(xs, h2);

		if (h2 >= radius) {
			result.lineTo(xs, h2);
		}

		if ((height - radius - 1) >= radius) {
			result.lineTo(xs, radius + ys);
		}
		result.quadTo(xs + radius3, ys + radius3, xs + radius, ys);

		return result;
	}
}
