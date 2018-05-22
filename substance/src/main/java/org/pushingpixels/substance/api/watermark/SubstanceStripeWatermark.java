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
package org.pushingpixels.substance.api.watermark;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Simple implementation of
 * {@link org.pushingpixels.substance.api.watermark.SubstanceWatermark}, drawing darker
 * even lines as watermark. This is the default watermark implementation. This
 * class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceStripeWatermark implements SubstanceWatermark {
	/**
	 * Watermark image (screen-sized).
	 */
	private static Image watermarkImage = null;

    @Override
	public void drawWatermarkImage(Graphics graphics, Component c, int x,
			int y, int width, int height) {
		if (!c.isShowing())
			return;
		// System.err.println(System.currentTimeMillis() + ":"
		// + c.getClass().getName() + ":" + x + ":" + y + ":" + width
		// + ":" + height);
		int dx = c.getLocationOnScreen().x;
		int dy = c.getLocationOnScreen().y;
		graphics.drawImage(SubstanceStripeWatermark.watermarkImage, x, y, x
				+ width, y + height, x + dx, y + dy, x + dx + width, y + dy
				+ height, null);
	}

    @Override
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
		SubstanceStripeWatermark.watermarkImage = SubstanceCoreUtilities
				.getBlankImage(screenWidth, screenHeight);

		Graphics2D graphics = (Graphics2D) SubstanceStripeWatermark.watermarkImage
				.getGraphics().create();

		boolean status = this.drawWatermarkImage(skin, graphics, 0, 0,
				screenWidth, screenHeight, false);
		graphics.dispose();
		return status;
	}

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
			stampColor = scheme.isDark() ? Color.lightGray : Color.darkGray;
		else {
			stampColor = scheme.getWatermarkStampColor();
		}

		graphics.setColor(stampColor);
		for (int row = y; row < (y + height); row += 2) {
			graphics.drawLine(x, row, x + width, row);
		}
		if (isPreview) {
			graphics.setColor(Color.gray);
			for (int row = y + 1; row < (y + height); row += 2) {
				graphics.drawLine(x, row, x + width, row);
			}
		}
		return true;
	}

    @Override
	public String getDisplayName() {
		return "Stripes";
	}

    @Override
	public void dispose() {
		watermarkImage = null;
	}
}
