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
import java.awt.image.BufferedImage;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Simple implementation of {@link SubstanceWatermark}, drawing cross hatches as
 * watermark.
 * 
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceExceedWatermark implements SubstanceWatermark {
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
		graphics.drawImage(SubstanceExceedWatermark.watermarkImage, x, y, x
				+ width, y + height, x + dx, y + dy, x + dx + width, y + dy
				+ height, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.watermark.SubstanceWatermark#updateWatermarkImage
	 * (org.pushingpixels.substance.api.SubstanceSkin)
	 */
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
		SubstanceExceedWatermark.watermarkImage = SubstanceCoreUtilities
				.getBlankImage(screenWidth, screenHeight);

		Graphics2D graphics = (Graphics2D) SubstanceExceedWatermark.watermarkImage
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
	 * Draws watermark image.
	 * 
	 * @param skin
	 *            Skin to use for painting the watermark.
	 * @param graphics
	 *            Graphics context.
	 * @param x
	 *            X coordinate for painting the watermark.
	 * @param y
	 *            Y coordinate for painting the watermark.
	 * @param width
	 *            Width of the watermark region.
	 * @param height
	 *            Height of the watermark region.
	 * @param isPreview
	 *            Indicates whether the drawing should paint the watermark
	 *            preview.
	 * @return If <code>true</code>, the watermark painting has succeeded.
	 */
	private boolean drawWatermarkImage(SubstanceSkin skin, Graphics2D graphics,
			int x, int y, int width, int height, boolean isPreview) {
		Color stampColorDark = null;
		Color stampColorLight = null;
		SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
		if (isPreview) {
			stampColorDark = scheme.isDark() ? Color.white : Color.black;
			stampColorLight = scheme.isDark() ? Color.black : Color.white;
		} else {
			stampColorDark = scheme.getWatermarkDarkColor();
			stampColorLight = scheme.getWatermarkLightColor();
		}

		graphics.setColor(stampColorDark);
		graphics.fillRect(0, 0, width, height);

		BufferedImage tile = SubstanceCoreUtilities.getBlankImage(4, 4);
		tile.setRGB(3, 0, stampColorLight.getRGB());
		tile.setRGB(2, 1, stampColorLight.getRGB());
		tile.setRGB(0, 2, stampColorLight.getRGB());
		tile.setRGB(1, 3, stampColorLight.getRGB());

		for (int row = y; row < (y + height); row += 4) {
			for (int col = x; col < (x + width); col += 4) {
				graphics.drawImage(tile, col, row, null);
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
		return "Exceed";
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
