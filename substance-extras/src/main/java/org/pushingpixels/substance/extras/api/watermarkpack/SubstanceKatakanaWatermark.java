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
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.InputStream;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Implementation of
 * {@link org.pushingpixels.substance.api.watermark.SubstanceWatermark}, drawing random
 * Katakana glyphs as watermark. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceKatakanaWatermark implements SubstanceWatermark {
	/**
	 * Watermark image (screen-sized).
	 */
	private static Image watermarkImage = null;

	/**
	 * Font size.
	 */
	private static int fontSize = 14;

	/**
	 * Font instance.
	 */
	private static Font font = getFont();

	/**
	 * Returns the font instance from the bundled resource.
	 * 
	 * @return Font instance from the bundled resource.
	 */
	private static Font getFont() {
		// the following is fix by Dag Joar and Christian Schlichtherle
		// for application running with -Xbootclasspath VM flag. In this case,
		// the using MyClass.class.getClassLoader() would return null,
		// but the context class loader will function properly
		// that classes will be properly loaded regardless of whether the lib is
		// added to the system class path, the extension class path and
		// regardless of the class loader architecture set up by some
		// frameworks.
		ClassLoader cl = SubstanceCoreUtilities.getClassLoaderForResources();
		// InputStream is = cl.getResourceAsStream("resource/matrix code
		// nfi.ttf");
		InputStream is = cl.getResourceAsStream("resource/katakana.ttf");
		if (is != null) {
			try {
				Font kf = Font.createFont(Font.TRUETYPE_FONT, is);
				int fontSize = 14;
				return kf.deriveFont(Font.BOLD, fontSize);
			} catch (Exception exc) {
			}
		}
		return null;
	}

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
		graphics.drawImage(SubstanceKatakanaWatermark.watermarkImage, x, y, x
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
		if (font == null)
			return false;
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
		SubstanceKatakanaWatermark.watermarkImage = SubstanceCoreUtilities
				.getBlankImage(screenWidth, screenHeight);

		Graphics2D graphics = (Graphics2D) SubstanceKatakanaWatermark.watermarkImage
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
		if (isPreview) {
			stampColor = scheme.isDark() ? Color.white : Color.black;
		} else {
			stampColor = scheme.getWatermarkStampColor();
		}

		graphics.setColor(stampColor);

		graphics.setFont(font);
		int fontWidth = fontSize;
		int fontHeight = fontSize - 2;
		int rows = height / fontHeight;
		int columns = width / fontWidth;
		for (int col = 0; col <= columns; col++) {
			for (int row = 0; row <= rows; row++) {
				// choose random katakana letter
				// int letterIndex = (int) (0x30A0 + Math.random()
				// * (0x30FF - 0x30A0));
				int letterIndex = isPreview ? (33 + (col + columns * row) % 95)
						: (int) (33 + Math.random() * 95);
				char c = (char) letterIndex;
				graphics.drawString("" + c, x + col * fontWidth, y + fontHeight
						* (row + 1));
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
		return "Katakana";
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
