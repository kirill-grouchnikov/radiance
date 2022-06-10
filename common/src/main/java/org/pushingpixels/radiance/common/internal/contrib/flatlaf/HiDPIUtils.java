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
		AffineTransform transform = g.getTransform();

		// check whether scaled
		if( transform.getScaleX() == 1 && transform.getScaleY() == 1 ) {
			painterScale1X.paint( g, x, y, width, height, 1 );
			return;
		}

		// scale rectangle
		Rectangle2D.Double scaledRect = scale( transform, x, y, width, height );

		try {
			// unscale to factor 1.0 and move origin (to whole numbers)
			g.setTransform( new AffineTransform( 1, 0, 0, 1,
				Math.floor( scaledRect.x ), Math.floor( scaledRect.y ) ) );

			int swidth = (int) scaledRect.width;
			int sheight = (int) scaledRect.height;

			// paint
			painterScale1X.paint( g, 0, 0, swidth, sheight, transform.getScaleX() );
		} finally {
			// restore original transform
			g.setTransform( transform );
		}
	}

	/**
	 * Scales a rectangle in the same way as the JRE does in
	 * sun.java2d.pipe.PixelToParallelogramConverter.fillRectangle(),
	 * which is used by Graphics.fillRect().
	 */
	private static Rectangle2D.Double scale( AffineTransform transform, int x, int y, int width, int height ) {
		double scaleX = transform.getScaleX();
		double scaleY = transform.getScaleY();

		double px = (x * scaleX) + transform.getTranslateX();
		double py = (y * scaleY) + transform.getTranslateY();

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