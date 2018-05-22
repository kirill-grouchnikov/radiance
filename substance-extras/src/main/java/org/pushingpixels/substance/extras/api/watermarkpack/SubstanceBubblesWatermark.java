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
package org.pushingpixels.substance.extras.api.watermarkpack;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Implementation of
 * {@link org.pushingpixels.substance.api.watermark.SubstanceWatermark}, drawing random
 * bubbles as watermark. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceBubblesWatermark implements SubstanceWatermark {
	/**
	 * Watermark image (screen-sized).
	 */
	private static Image watermarkImage = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.watermark.SubstanceWatermark#drawWatermarkImage(java
	 * .awt.Graphics, int, int, int, int)
	 */
	public void drawWatermarkImage(Graphics graphics, Component c, int x,
			int y, int width, int height) {
		if (!c.isShowing())
			return;
		int dx = c.getLocationOnScreen().x;
		int dy = c.getLocationOnScreen().y;
		graphics.drawImage(SubstanceBubblesWatermark.watermarkImage, x, y, x
				+ width, y + height, x + dx, y + dy, x + dx + width, y + dy
				+ height, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.watermark.SubstanceWatermark#updateWatermarkImage
	 * (org.pushingpixels.substance.skin.SubstanceSkin)
	 */
	public boolean updateWatermarkImage(SubstanceSkin skin) {
		// fix by Chris for bug 67 - support for multiple screens
		Rectangle virtualBounds = new Rectangle();
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice[] gds = ge.getScreenDevices();
		for (GraphicsDevice gd : gds) {
			GraphicsConfiguration gc = gd.getDefaultConfiguration();
			virtualBounds = virtualBounds.union(gc.getBounds());
		}

		int screenWidth = virtualBounds.width;
		int screenHeight = virtualBounds.height;
		SubstanceBubblesWatermark.watermarkImage = SubstanceCoreUtilities
				.getBlankImage(screenWidth, screenHeight);

		Graphics2D graphics = (Graphics2D) SubstanceBubblesWatermark.watermarkImage
				.getGraphics().create();

		boolean status = this.drawWatermarkImage(skin, graphics, 0, 0,
				screenWidth, screenHeight, false);
		graphics.dispose();
		return status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.api.watermark.SubstanceWatermark#previewWatermark
	 * (java.awt.Graphics, org.pushingpixels.substance.api.SubstanceSkin, int, int, int,
	 * int)
	 */
	@Override
	public void previewWatermark(Graphics g, SubstanceSkin skin, int x, int y,
			int width, int height) {
		this
				.drawWatermarkImage(skin, (Graphics2D) g, x, y, width, height,
						true);
	}

	/**
	 * Draws the specified portion of the watermark image.
	 * 
	 * @param skin
	 *            Skin to use for painting the watermark.
	 * @param graphics
	 *            Graphic context.
	 * @param x
	 *            the <i>x</i> coordinate of the watermark to be drawn.
	 * @param y
	 *            The <i>y</i> coordinate of the watermark to be drawn.
	 * @param width
	 *            The width of the watermark to be drawn.
	 * @param height
	 *            The height of the watermark to be drawn.
	 * @param isPreview
	 *            Indication whether the result is a preview image.
	 * @return Indication whether the draw succeeded.
	 */
	private boolean drawWatermarkImage(SubstanceSkin skin, Graphics2D graphics,
			int x, int y, int width, int height, boolean isPreview) {
		Color stampColor = null;
		SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
		if (isPreview)
			stampColor = scheme.isDark() ? Color.white : Color.black;
		else {
			stampColor = scheme.getWatermarkStampColor();
		}
		int minBubbleRadius = 10;
		int maxBubbleRadius = 20;

		int cellSize = (minBubbleRadius + maxBubbleRadius);
		int rowCount = height / cellSize;
		int columnCount = width / cellSize;

		graphics.setColor(stampColor);
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		for (int col = 0; col <= columnCount; col++) {
			for (int row = 0; row <= rowCount; row++) {
				// location
				double xval = isPreview ? Math.abs(Math
						.sin((2.8 + col + columnCount * row))) : Math.random();
				int xc = x + (int) (col * cellSize + cellSize * xval);
				double yval = isPreview ? Math.abs(Math
						.sin((3.5 + col + columnCount * row))) : Math.random();
				int yc = y + (int) (row * cellSize + cellSize * yval);
				double val = isPreview ? 0.1 * Math.abs(Math
						.sin((1 + col + columnCount * row))) : Math.random();
				int r = minBubbleRadius
						+ (int) (val * (maxBubbleRadius - minBubbleRadius));
				graphics.drawOval(xc - r, yc - r, 2 * r, 2 * r);

				GeneralPath shine = new GeneralPath();
				shine.moveTo(xc - 0.2f * r, yc - 0.8f * r);
				shine.quadTo(xc - 0.7f * r, yc - 0.6f * r, xc - 0.8f * r, yc
						- 0.1f * r);
				shine.lineTo(xc - 0.3f * r, yc + 0.2f * r);
				shine.quadTo(xc - 0.3f * r, yc - 0.4f * r, xc, yc - 0.6f * r);
				shine.lineTo(xc - 0.2f * r, yc - 0.8f * r);
				graphics.draw(shine);
				// graphics.fill(shine);
			}
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.api.trait.SubstanceTrait#getDisplayName()
	 */
	public String getDisplayName() {
		return "Bubbles";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.watermark.SubstanceWatermark#dispose()
	 */
	public void dispose() {
		watermarkImage = null;
	}
}
