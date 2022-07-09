/*
 * Copyright 2019 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pushingpixels.radiance.common.internal.contrib.flatlaf;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

// Taken from https://github.com/JFormDesigner/FlatLaf/blob/main/flatlaf-core/src/main/java/com/formdev/flatlaf/util/HiDPIUtils.java
public class HiDPIUtils {
	public static void paintAtScale1x( Graphics2D g, JComponent c, RadianceCommonCortex.PainterScale1X painterScale1X ) {
		paintAtScale1x( g, 0, 0, c.getWidth(), c.getHeight(), painterScale1X );
	}

	/**
	 * Paint at system scale factor 1x to avoid rounding issues at 125%, 150% and 175% scaling.
	 * <p>
	 * Scales the given Graphics2D down to 100% and invokes the
	 * given painter passing scaled x, y, width and height.
	 * <p>
	 * Uses the same scaling calculation as the JRE uses.
	 */
	public static void paintAtScale1x( Graphics2D g, int x, int y, int width, int height, RadianceCommonCortex.PainterScale1X painterScale1X ) {
		// save original transform
		AffineTransform t = g.getTransform();

		// get scale X/Y and shear X/Y
		double scaleX = t.getScaleX();
		double scaleY = t.getScaleY();
		double shearX = t.getShearX();
		double shearY = t.getShearY();

		// check whether rotated
		// (also check for negative scale X/Y because shear X/Y are zero for 180 degrees rotation)
		boolean rotated = (shearX != 0 || shearY != 0 || scaleX <= 0 || scaleY <= 0);
		if( rotated ) {
			// resulting scale X/Y values are always positive
			scaleX = Math.hypot( scaleX, shearX );
			scaleY = Math.hypot( scaleY, shearY );
		} else {
			// make scale X/Y positive
			scaleX = Math.abs( scaleX );
			scaleY = Math.abs( scaleY );
		}

		// check whether scaled
		if( scaleX == 1 && scaleY == 1 ) {
			painterScale1X.paint( g, x, y, width, height, 1 );
			return;
		}

		// scale rectangle
		Rectangle2D.Double scaledRect = scale( scaleX, scaleY, t, x, y, width, height );

		try {
			// unscale to factor 1.0, keep rotation and move origin (to whole numbers)
			AffineTransform t1x;
			if( rotated ) {
				t1x = new AffineTransform( t.getScaleX(), t.getShearY(), t.getShearX(), t.getScaleY(),
						Math.floor( scaledRect.x ), Math.floor( scaledRect.y ) );
				t1x.scale( 1. / scaleX, 1. / scaleY );
			} else
				t1x = new AffineTransform( 1, 0, 0, 1, Math.floor( scaledRect.x ), Math.floor( scaledRect.y ) );
			g.setTransform( t1x );

			int swidth = (int) scaledRect.width;
			int sheight = (int) scaledRect.height;

			// paint
			painterScale1X.paint( g, 0, 0, swidth, sheight, scaleX );
		} finally {
			// restore original transform
			g.setTransform( t );
		}
	}

	/**
	 * Scales a rectangle in the same way as the JRE does in
	 * sun.java2d.pipe.PixelToParallelogramConverter.fillRectangle(),
	 * which is used by Graphics.fillRect().
	 */
	private static Rectangle2D.Double scale( double scaleX, double scaleY, AffineTransform t, int x, int y, int width, int height ) {
		double px = (x * scaleX) + t.getTranslateX();
		double py = (y * scaleY) + t.getTranslateY();

		double newX = normalize( px );
		double newY = normalize( py );
		double newWidth  = normalize( px + (width  * scaleX) ) - newX;
		double newHeight = normalize( py + (height * scaleY) ) - newY;

		return new Rectangle2D.Double( newX, newY, newWidth, newHeight );
	}

	private static double normalize( double value ) {
		return Math.floor( value + 0.25 ) + 0.25;
	}
}