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
package org.pushingpixels.substance.extras.api.watermarkpack.flamefractal;

import java.awt.AlphaComposite;
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
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Base class for noise-based watermarks.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceFlameFractalWatermark implements SubstanceWatermark {
	/**
	 * Watermark image (screen-sized).
	 */
	private Image watermarkImage = null;

	/**
	 * Display name of <code>this</code> watermark.
	 */
	protected String displayName;

	/**
	 * Function system of <code>this</code> watermark.
	 */
	protected IteratedFunctionSystem functionSystem;

	/**
	 * Creates a new flame fractal watermark.
	 * 
	 * @param displayName
	 *            Display name of <code>this</code> watermark.
	 * @param functionSystem
	 *            Function system of <code>this</code> watermark.
	 */
	public SubstanceFlameFractalWatermark(String displayName,
			IteratedFunctionSystem functionSystem) {
		this.displayName = displayName;
		this.functionSystem = functionSystem;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.watermark.SubstanceWatermark#drawWatermarkImage(java
	 * .awt.Graphics, java.awt.Component, int, int, int, int)
	 */
	public void drawWatermarkImage(Graphics graphics, Component c, int x,
			int y, int width, int height) {
		int dx = c.getLocationOnScreen().x;
		int dy = c.getLocationOnScreen().y;
		graphics.drawImage(this.watermarkImage, x, y, x + width, y + height, x
				+ dx, y + dy, x + dx + width, y + dy + height, null);
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
		this.watermarkImage = SubstanceCoreUtilities.getBlankImage(screenWidth,
				screenHeight);

		Graphics2D graphics = (Graphics2D) this.watermarkImage.getGraphics()
				.create();

		boolean status = this.drawWatermarkImage(skin, graphics, 0, 0,
				screenWidth, screenHeight, false);
		graphics.dispose();
		return status;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.watermark.SubstanceWatermark#getDisplayName()
	 */
	public String getDisplayName() {
		return this.displayName;
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
	}

	/**
	 * Draws the specified portion of the watermark image.
	 * 
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
		if (isPreview) {
			// graphics.drawImage(NoiseFactory.getNoiseImage(
			// SubstanceCoreUtilities.getDefaultTheme(null)
			// .getFirstTheme().getColorScheme(),
			// SubstanceCoreUtilities.getDefaultTheme(null)
			// .getSecondTheme().getColorScheme(), width, height,
			// this.xFactor, this.yFactor, this.hasConstantZ,
			// this.noiseFilter, this.toBlur), x, y, null);
		} else {
			SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
			int alpha = scheme.isDark() ? 200 : 250;
			graphics.setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, alpha / 255.0f));
			graphics.drawImage(FractalFlameFactory.getFractalFlameImage(scheme,
					scheme, width, height, 25000000, this.functionSystem), x,
					y, null);
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pushingpixels.substance.watermark.SubstanceWatermark#dispose()
	 */
	public void dispose() {
		this.watermarkImage = null;
	}
}
