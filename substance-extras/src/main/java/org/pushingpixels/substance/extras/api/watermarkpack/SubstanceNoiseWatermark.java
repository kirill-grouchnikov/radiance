package org.pushingpixels.substance.extras.api.watermarkpack;

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
import org.pushingpixels.substance.extras.api.painterpack.noise.NoiseFactory;
import org.pushingpixels.substance.extras.api.painterpack.noise.NoiseFilter;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Base class for noise-based watermarks. This class is part of officially
 * supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceNoiseWatermark implements SubstanceWatermark {
	/**
	 * Watermark image (screen-sized).
	 */
	private Image watermarkImage = null;

	/**
	 * Display name of <code>this</code> watermark.
	 */
	protected String displayName;

	/**
	 * Factor along X axis.
	 */
	protected double xFactor;

	/**
	 * Factor along Y axis.
	 */
	protected double yFactor;

	/**
	 * Indicates whether <code>this</code> watermark is based on constant Z
	 * values.
	 */
	protected boolean hasConstantZ;

	/**
	 * Noise filter of <code>this</code> watermark.
	 */
	protected NoiseFilter noiseFilter;

	/**
	 * Indicates whether the resulting image (after applying the
	 * {@link #noiseFilter}) should be blurred.
	 */
	protected boolean toBlur;

	/**
	 * Creates a new noise-based watermark.
	 * 
	 * @param displayName
	 *            Display name of <code>this</code> watermark.
	 * @param xFactor
	 *            Factor along X axis.
	 * @param yFactor
	 *            Factor along Y axis.
	 * @param hasConstantZ
	 *            Indicates whether <code>this</code> watermark is based on
	 *            constant Z values.
	 * @param noiseFilter
	 *            Noise filter of <code>this</code> watermark.
	 * @param toBlur
	 *            Indicates whether the resulting image should be blurred.
	 */
	public SubstanceNoiseWatermark(String displayName, double xFactor,
			double yFactor, boolean hasConstantZ, NoiseFilter noiseFilter,
			boolean toBlur) {
		this.displayName = displayName;
		this.xFactor = xFactor;
		this.yFactor = yFactor;
		this.hasConstantZ = hasConstantZ;
		this.noiseFilter = noiseFilter;
		this.toBlur = toBlur;
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
		if (!c.isShowing())
			return;
		int dx = c.getLocationOnScreen().x;
		int dy = c.getLocationOnScreen().y;
		graphics.drawImage(this.watermarkImage, x, y, x + width, y + height, x
				+ dx, y + dy, x + dx + width, y + dy + height, null);
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
		SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
		if (isPreview) {
			graphics.drawImage(NoiseFactory.getNoiseImage(skin, width, height,
					this.xFactor, this.yFactor, this.hasConstantZ,
					this.noiseFilter, this.toBlur, true), x, y, null);
		} else {
			int alpha = scheme.isDark() ? 200 : 140;
			graphics.setComposite(AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, alpha / 255.0f));
			graphics.drawImage(NoiseFactory.getNoiseImage(skin, width, height,
					this.xFactor, this.yFactor, this.hasConstantZ,
					this.noiseFilter, this.toBlur, false), x, y, null);
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
