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

import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ImageWatermarkKind;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Implementation of {@link SubstanceWatermark}, drawing specified image as
 * watermark. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @author Chris Hall
 * @author Mark Haag
 */
public class SubstanceImageWatermark implements SubstanceWatermark {
	/**
	 * Watermark image (screen-sized).
	 */
	protected Image watermarkImage = null;

	/**
	 * Watermark image kind.
	 */
	private ImageWatermarkKind kind = ImageWatermarkKind.SCREEN_CENTER_SCALE;

	/**
	 * Watermark image opacity.
	 */
	private float opacity = 0.2f;

	/**
	 * The original image (as read from the disk / HTTP connection).
	 */
	protected BufferedImage origImage;

	/**
	 * The original image location.
	 */
	protected String origImageLocation;

	/**
	 * Creates an instance with specified image.
	 * 
	 * @param imageLocation
	 *            Image location. Can point to a local file or HTTP URL (needs
	 *            to start with <code>http</code> in the later case).
	 */
	public SubstanceImageWatermark(String imageLocation) {
		if (imageLocation != null) {
			try {
				if (imageLocation.startsWith("http")) {
					URL url = new URL(imageLocation);
					BufferedImage tempImage = ImageIO.read(url);
					this.origImage = SubstanceCoreUtilities
							.createCompatibleImage(tempImage);
				} else {
					try {
						this.origImage = SubstanceCoreUtilities
								.createCompatibleImage(ImageIO.read(new File(
										imageLocation)));
					} catch (IIOException iioe) {
						this.origImage = SubstanceCoreUtilities
								.createCompatibleImage(ImageIO
										.read(SubstanceImageWatermark.class
												.getClassLoader().getResource(
														imageLocation)));
					}
				}
			} catch (Exception exc) {
				// ignore - probably specified incorrect file
				// or file is not image
				exc.printStackTrace();
			}
		}
		this.origImageLocation = imageLocation;
	}

	/**
	 * Creates an instance from the specified input stream.
	 * 
	 * @param inputStream
	 *            Input stream.
	 */
	public SubstanceImageWatermark(InputStream inputStream) {
		if (inputStream != null) {
			try {
				BufferedImage tempImage = ImageIO.read(inputStream);
				this.origImage = SubstanceCoreUtilities
						.createCompatibleImage(tempImage);
			} catch (Exception exc) {
				// ignore - probably specified incorrect input stream
				// or stream doesn't contain an image
				exc.printStackTrace();
			}
		}
		this.origImageLocation = null;
	}

	@Override
	public void drawWatermarkImage(Graphics graphics, Component c, int x,
			int y, int width, int height) {
		if (!c.isShowing())
			return;
		int dx = 0;
		int dy = 0;

		Component topParent = null;
		switch (getKind()) {
		case SCREEN_CENTER_SCALE:
		case SCREEN_TILE:
			dx = c.getLocationOnScreen().x;
			dy = c.getLocationOnScreen().y;
			break;
		case APP_ANCHOR:
		case APP_TILE:
			if (c instanceof JComponent) {
				topParent = ((JComponent) c).getTopLevelAncestor();
			} else {
				Component comp = c;
				while (comp.getParent() != null) {
					comp = comp.getParent();
				}
				topParent = comp;
			}
			dx = c.getLocationOnScreen().x - topParent.getLocationOnScreen().x;
			dy = c.getLocationOnScreen().y - topParent.getLocationOnScreen().y;
			break;
		case APP_CENTER:
			if (c instanceof JComponent) {
				topParent = ((JComponent) c).getTopLevelAncestor();
			} else {
				Component comp = c;
				while (comp.getParent() != null) {
					comp = comp.getParent();
				}
				topParent = comp;
			}
			dx = c.getLocationOnScreen().x - topParent.getLocationOnScreen().x;
			dy = c.getLocationOnScreen().y - topParent.getLocationOnScreen().y;
			dx -= (topParent.getWidth() / 2 - this.origImage.getWidth() / 2);
			dy -= (topParent.getHeight() / 2 - this.origImage.getHeight() / 2);
		}

		graphics.drawImage(watermarkImage, x, y, x + width, y + height, x + dx,
				y + dy, x + dx + width, y + dy + height, null);
	}

	@Override
	public void previewWatermark(Graphics g, SubstanceSkin skin, int x, int y,
			int width, int height) {
	}

    @Override
	public boolean updateWatermarkImage(SubstanceSkin skin) {
		if (this.origImage == null) {
			return false;
		}

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

		int origImageWidth = this.origImage.getWidth();
		int origImageHeight = this.origImage.getHeight();

		if (getKind() == ImageWatermarkKind.SCREEN_CENTER_SCALE) {
			watermarkImage = SubstanceCoreUtilities.getBlankImage(screenWidth,
					screenHeight);

			Graphics2D graphics = (Graphics2D) watermarkImage.getGraphics()
					.create();

			Composite comp = AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, opacity);
			graphics.setComposite(comp);

			// decide if need to scale or center
			boolean isWidthFits = (origImageWidth <= screenWidth);
			boolean isHeightFits = (origImageHeight <= screenHeight);

			// see of need to scale or simply center
			if (isWidthFits && isHeightFits) {
				graphics.drawImage(this.origImage,
						(screenWidth - origImageWidth) / 2,
						(screenHeight - origImageHeight) / 2, null);
				graphics.dispose();
				return true;
			}
			if (isWidthFits) {
				// height doesn't fit
				double scaleFact = (double) screenHeight
						/ (double) origImageHeight;
				int dx = (int) (screenWidth - scaleFact * origImageWidth) / 2;
				// The following line is Mark Haag's to make the
				// scaling less jaggy
				graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
						RenderingHints.VALUE_INTERPOLATION_BICUBIC);
				graphics.drawImage(this.origImage, dx, 0, screenWidth - dx,
						screenHeight, 0, 0, origImageWidth, origImageHeight,
						null);
				graphics.dispose();
				return true;
			}
			if (isHeightFits) {
				// width doesn't fit
				double scaleFact = (double) screenWidth
						/ (double) origImageWidth;
				int dy = (int) (screenHeight - scaleFact * origImageHeight) / 2;
				// The following line is Mark Haag's to make the
				// scaling less jaggy
				graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
						RenderingHints.VALUE_INTERPOLATION_BICUBIC);
				graphics.drawImage(this.origImage, 0, dy, screenWidth,
						screenHeight - dy, 0, 0, origImageWidth,
						origImageHeight, null);
				graphics.dispose();
				return true;
			}
			// none fits
			double scaleFactY = (double) screenHeight
					/ (double) origImageHeight;
			double scaleFactX = (double) screenWidth / (double) origImageWidth;
			double scaleFact = Math.min(scaleFactX, scaleFactY);
			int dx = Math.max(0, (int) (screenWidth - scaleFact
					* origImageWidth) / 2);
			int dy = Math.max(0, (int) (screenHeight - scaleFact
					* origImageHeight) / 2);
			// The following line is Mark Haag's to make the
			// scaling less jaggy
			graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
					RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			graphics.drawImage(this.origImage, dx, dy, screenWidth - dx,
					screenHeight - dy, 0, 0, origImageWidth, origImageHeight,
					null);
			graphics.dispose();
			return true;
		}

		if ((getKind() == ImageWatermarkKind.SCREEN_TILE)
				|| (getKind() == ImageWatermarkKind.APP_TILE)) {
			watermarkImage = SubstanceCoreUtilities.getBlankImage(screenWidth,
					screenHeight);

			Graphics2D graphics = (Graphics2D) watermarkImage.getGraphics()
					.create();

			Composite comp = AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, opacity);
			graphics.setComposite(comp);

			int replicateX = 1 + screenWidth / origImageWidth;
			int replicateY = 1 + screenHeight / origImageHeight;

			for (int i = 0; i < replicateX; i++) {
				for (int j = 0; j < replicateY; j++) {
					graphics.drawImage(this.origImage, i * origImageWidth, j
							* origImageHeight, null);
				}
			}
			graphics.dispose();
			return true;
		}

		if ((getKind() == ImageWatermarkKind.APP_ANCHOR)
				|| (getKind() == ImageWatermarkKind.APP_CENTER)) {
			watermarkImage = SubstanceCoreUtilities.getBlankImage(
					origImageWidth, origImageHeight);

			Graphics2D graphics = (Graphics2D) watermarkImage.getGraphics()
					.create();

			Composite comp = AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, opacity);
			graphics.setComposite(comp);

			graphics.drawImage(this.origImage, 0, 0, null);
			graphics.dispose();
			return true;
		}

		return false;
	}

    @Override
	public String getDisplayName() {
		return "Image";
	}

    @Override
	public void dispose() {
		watermarkImage = null;
	}

	/**
	 * Returns the location of the original image.
	 * 
	 * @return The location of the original image.
	 */
	public String getOrigImageLocation() {
		return this.origImageLocation;
	}

	/**
	 * Sets image watermark kind.
	 * 
	 * @param kind
	 *            Image watermark kind.
	 */
	public void setKind(ImageWatermarkKind kind) {
		if (kind == null) {
			throw new IllegalArgumentException(
					"Can't pass null to SubstanceImageWatermark.setKind()");
		}
		this.kind = kind;
		this.updateWatermarkImage(SubstanceCortex.GlobalScope.getCurrentSkin());
	}

	/**
	 * Returns the image watermark kind.
	 * 
	 * @return Image watermark kind.
	 */
	public ImageWatermarkKind getKind() {
		return this.kind;
	}

	/**
	 * Returns the image watermark opacity.
	 * 
	 * @return Image watermark opacity.
	 */
	public float getOpacity() {
		return this.opacity;
	}

	/**
	 * Sets image watermark opacity.
	 * 
	 * @param opacity
	 *            Image watermark opacity.
	 * @throws IllegalArgumentException
	 *             if the argument is not in 0.0-1.0 range.
	 */
	public void setOpacity(float opacity) {
		if ((opacity < 0.0f) || (opacity > 1.0f)) {
			throw new IllegalArgumentException(
					"SubstanceImageWatermark.setOpacity() can get value in 0.0-1.0 range, was passed value "
							+ opacity);
		}
		this.opacity = opacity;
		this.updateWatermarkImage(SubstanceCortex.GlobalScope.getCurrentSkin());
	}
}