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
package org.pushingpixels.demo.substance.main.check;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;

/**
 * Implementation of
 * {@link org.pushingpixels.substance.api.watermark.SubstanceWatermark}, drawing random
 * coffee beans as watermark.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceCoffeeBeansWatermark implements SubstanceWatermark {
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
		int dx = c.getLocationOnScreen().x;
		int dy = c.getLocationOnScreen().y;
		graphics.drawImage(SubstanceCoffeeBeansWatermark.watermarkImage, x, y,
				x + width, y + height, x + dx, y + dy, x + dx + width, y + dy
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
		Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenDim.width;
		int screenHeight = screenDim.height;

		SubstanceCoffeeBeansWatermark.watermarkImage = GraphicsEnvironment
				.getLocalGraphicsEnvironment().getDefaultScreenDevice()
				.getDefaultConfiguration().createCompatibleImage(screenWidth,
						screenHeight, Transparency.TRANSLUCENT);

		Graphics2D graphics = (Graphics2D) SubstanceCoffeeBeansWatermark.watermarkImage
				.getGraphics().create();

		boolean status = this.drawWatermarkImage(skin, graphics, 0, 0,
				screenWidth, screenHeight);
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
		this.drawWatermarkImage(skin, (Graphics2D) g, x, y, width, height);
	}

	/**
	 * Draws the watermark image.
	 * 
	 * @param graphics
	 *            Graphics context.
	 * @param x
	 *            Starting X position.
	 * @param y
	 *            Starting Y position.
	 * @param width
	 *            Width.
	 * @param height
	 *            Height.
	 * @return <code>true</code> if the drawing succeeded, <code>false</code>
	 *         otherwise.
	 */
	private boolean drawWatermarkImage(SubstanceSkin skin, Graphics2D graphics,
			int x, int y, int width, int height) {
		Color stampColor = skin.getWatermarkColorScheme().isDark() ? new Color(
				255, 255, 255, 25) : new Color(0, 0, 0, 15);

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
				int xc = x + (int) (col * cellSize + cellSize * Math.random());
				int yc = y + (int) (row * cellSize + cellSize * Math.random());
				int r = minBubbleRadius
						+ (int) (Math.random() * (maxBubbleRadius - minBubbleRadius));

				AffineTransform oldTransform = graphics.getTransform();
				graphics.setTransform(AffineTransform.getRotateInstance(2.0
						* Math.PI * Math.random(), xc, yc));

				GeneralPath bean = new GeneralPath();
				bean.moveTo(xc - r, yc - 0.1f * r);
				bean.quadTo(xc - r, yc - 0.6f * r, xc, yc - 0.6f * r);
				bean.quadTo(xc + r, yc - 0.6f * r, xc + r, yc - 0.1f * r);
				bean.lineTo(xc + r, yc + 0.1f * r);
				bean.quadTo(xc + r, yc + 0.6f * r, xc, yc + 0.6f * r);
				bean.quadTo(xc - r, yc + 0.6f * r, xc - r, yc + 0.1f * r);
				bean.lineTo(xc - r, yc - 0.1f * r);
				bean.lineTo(xc + r, yc - 0.1f * r);
				bean.lineTo(xc + r, yc + 0.1f * r);
				bean.lineTo(xc - r, yc + 0.1f * r);
				graphics.draw(bean);

				graphics.setTransform(oldTransform);
			}
		}

		graphics.dispose();
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.watermark.SubstanceWatermark#getDisplayName()
	 */
	public String getDisplayName() {
		return "Coffee Beans";
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
