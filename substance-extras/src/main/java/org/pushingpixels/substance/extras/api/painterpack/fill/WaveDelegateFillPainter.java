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
package org.pushingpixels.substance.extras.api.painterpack.fill;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Transparency;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;

import org.pushingpixels.substance.api.colorscheme.ColorSchemeTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Base class for fill painters that overlay wave gradient on top of some other
 * fill painter.This class is part of officially supported API. The
 * implementation borrows heavily from <a href=
 * "http://weblogs.java.net/blog/campbell/archive/2006/07/java_2d_tricker.html"
 * >this</a>.
 * 
 * @author Kirill Grouchnikov.
 * @author Chris Campbell.
 */
public abstract class WaveDelegateFillPainter implements SubstanceFillPainter {
	/**
	 * Display name of <code>this</code> painter.
	 */
	protected String painterName;

	/**
	 * Optional scheme transformation - may be <code>null</code>.
	 */
	protected ColorSchemeTransform transformation;

	/**
	 * Mandatory delegate painter.
	 */
	protected SubstanceFillPainter delegate;

	/**
	 * Creates a new wave-overlaying painter.
	 * 
	 * @param painterName
	 *            Painter display name.
	 * @param transformation
	 *            Optional scheme transformation. If <code>null</code>, the
	 *            result will be identical to using the delegate painter.
	 * @param delegate
	 *            Delegate painter.
	 */
	public WaveDelegateFillPainter(String painterName,
			ColorSchemeTransform transformation, SubstanceFillPainter delegate) {
		this.painterName = painterName;
		this.transformation = transformation;
		this.delegate = delegate;
	}

	@Override
	public String getDisplayName() {
		return this.painterName;
	}

	@Override
	public void paintContourBackground(Graphics g, Component comp, float width, float height,
	        Shape contour, boolean isFocused, SubstanceColorScheme fillScheme, boolean hasShine) {
		GeneralPath clipBottom = new GeneralPath();
		clipBottom.moveTo(0, height);
		clipBottom.lineTo(width, height);
		clipBottom.lineTo(width, 0);
		clipBottom.curveTo(5 * width / 6, height / 3, 3 * width / 4,
				height / 2, width / 2, height / 2);
		clipBottom.curveTo(width / 3, height / 2, width / 4, height, 0,
				7 * height / 8);
		clipBottom.lineTo(0, height);

        int iWidth = (int) Math.ceil(width);
        int iHeight = (int) Math.ceil(height);
		BufferedImage clipShapeBottom = createClipImage(clipBottom, iWidth,
		        iHeight);

		BufferedImage bottomImage = SubstanceCoreUtilities.getBlankImage(iWidth,
		        iHeight);
		Graphics2D bottomGraphics = (Graphics2D) bottomImage.getGraphics();
		bottomGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		SubstanceColorScheme bottomColorScheme = (this.transformation == null) ? fillScheme
				: this.transformation.transform(fillScheme);

		// Render our clip shape into the image. Note that we enable
		// antialiasing to achieve the soft clipping effect. Try
		// commenting out the line that enables antialiasing, and
		// you will see that you end up with the usual hard clipping.
		bottomGraphics.setComposite(AlphaComposite.Src);
		bottomGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		bottomGraphics.drawImage(clipShapeBottom, 0, 0, null);

		// Here's the trick... We use SrcAtop, which effectively uses the
		// alpha value as a coverage value for each pixel stored in the
		// destination. For the areas outside our clip shape, the destination
		// alpha will be zero, so nothing is rendered in those areas. For
		// the areas inside our clip shape, the destination alpha will be fully
		// opaque, so the full color is rendered. At the edges, the original
		// antialiasing is carried over to give us the desired soft clipping
		// effect.
		bottomGraphics.setComposite(AlphaComposite.SrcAtop);
		this.delegate.paintContourBackground(bottomGraphics, comp, width,
				height, contour, isFocused, bottomColorScheme, hasShine);
		// bottomGraphics.drawImage(bottomFullImage, 0, 0, null);

		BufferedImage image = SubstanceCoreUtilities.getBlankImage(iWidth,
				iHeight);
		Graphics2D graphics = (Graphics2D) image.getGraphics();
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		graphics.setClip(contour);

		this.delegate.paintContourBackground(graphics, comp, width, height,
				contour, isFocused, fillScheme, hasShine);

		// graphics.drawImage(topFullImage, 0, 0, null);
		graphics.drawImage(bottomImage, 0, 0, null);

		graphics.setClip(null);
	}

	/**
	 * Creates a clip image for soft-clipping. Code taken from <a href=
	 * "http://weblogs.java.net/blog/campbell/archive/2006/07/java_2d_tricker_2.html"
	 * >here</a>.
	 * 
	 * @param s
	 *            Clip shape.
	 * @param width
	 *            Image width.
	 * @param height
	 *            Image height.
	 * @return Clip image.
	 * @author Chris Campbell.
	 */
	BufferedImage createClipImage(Shape s, int width, int height) {
		// Create a translucent intermediate image in which we can perform
		// the soft clipping
		GraphicsEnvironment e = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice d = e.getDefaultScreenDevice();
		GraphicsConfiguration c = d.getDefaultConfiguration();

		BufferedImage img = c.createCompatibleImage(width, height,
				Transparency.TRANSLUCENT);
		Graphics2D g2 = img.createGraphics();

		// Clear the image so all pixels have zero alpha
		g2.setComposite(AlphaComposite.Clear);
		g2.fillRect(0, 0, width, height);

		// Render our clip shape into the image. Note that we enable
		// antialiasing to achieve the soft clipping effect. Try
		// commenting out the line that enables antialiasing, and
		// you will see that you end up with the usual hard clipping.
		g2.setComposite(AlphaComposite.Src);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.WHITE);
		g2.fill(s);
		g2.dispose();

		return img;
	}
}
