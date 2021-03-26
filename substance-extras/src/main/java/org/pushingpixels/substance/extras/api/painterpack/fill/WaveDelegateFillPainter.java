/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of the copyright holder nor the names of
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

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.colorscheme.*;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;

/**
 * Base class for fill painters that overlay wave gradient on top of some other
 * fill painter.This class is part of officially supported API. The
 * implementation borrows heavily from <a href=
 * "https://community.oracle.com/blogs/campbell/2006/07/19/java-2d-trickery-soft-clipping"
 * >this</a>.
 * 
 * @author Kirill Grouchnikov.
 * @author Chris Campbell.
 */
public abstract class WaveDelegateFillPainter implements SubstanceFillPainter {
	/**
	 * Display name of <code>this</code> painter.
	 */
	private String painterName;

	/**
	 * Optional scheme transformation - may be <code>null</code>.
	 */
	private ColorSchemeTransform transformation;

	/**
	 * Mandatory delegate painter.
	 */
	private SubstanceFillPainter delegate;

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
		double scale = NeonCortex.getScaleFactor(comp);

		GeneralPath clipBottom = new GeneralPath();
		clipBottom.moveTo(0, height);
		clipBottom.lineTo(width, height);
		clipBottom.lineTo(width, 0);
		clipBottom.curveTo(5 * width / 6, height / 3, 3 * width / 4,
				height / 2, width / 2, height / 2);
		clipBottom.curveTo(width / 3, height / 2, width / 4, height, 0, 7 * height / 8);
		clipBottom.lineTo(0, height);

        int iWidth = (int) Math.ceil(width);
        int iHeight = (int) Math.ceil(height);
		BufferedImage clipShapeBottom = SubstanceCoreUtilities.softClip(
				NeonCortex.getScaleFactor(comp),
				iWidth, iHeight, null, clipBottom);

		BufferedImage bottomImage = SubstanceCoreUtilities.getBlankImage(scale, iWidth, iHeight);
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

		BufferedImage image = SubstanceCoreUtilities.getBlankImage(scale, iWidth, iHeight);
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
}
