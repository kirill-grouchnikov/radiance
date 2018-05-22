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
package org.pushingpixels.substance.internal.utils;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.DataBufferInt;
import java.awt.image.Kernel;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;

/**
 * Factory for creating noise images. This class is part of officially supported
 * API.
 * 
 * @author Kirill Grouchnikov.
 */
public class NoiseFactory {
	/**
	 * Returns a noise image.
	 * 
	 * @param skin
	 *            The skin to use for rendering the image.
	 * @param width
	 *            Image width.
	 * @param height
	 *            Image height.
	 * @param xFactor
	 *            X stretch factor.
	 * @param yFactor
	 *            Y stretch factor.
	 * @param hasConstantZ
	 *            Indication whether the Z is constant.
	 * @param noiseFilter
	 *            Noise filter to apply.
	 * @param toBlur
	 *            Indication whether the resulting image should be blurred.
	 * @param isPreview
	 *            Indication whether the image is in preview mode.
	 * @return Noise image.
	 */
	public static BufferedImage getNoiseImage(SubstanceSkin skin, int width,
			int height, double xFactor, double yFactor, boolean hasConstantZ,
			boolean toBlur, boolean isPreview) {
		SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
		Color c1 = scheme.getWatermarkDarkColor();
		// c1 = new Color(255, 0, 0, 0);
		// System.out.println(c1.getAlpha());
		// Color c2 = scheme.getWatermarkStampColor();
		Color c3 = scheme.getWatermarkLightColor();

		// Note that we are starting with non-hi DPI aware image for creating the
		// source for the noise
		BufferedImage dst = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		// Borrow from Sebastien Petrucci fast blur code - direct access
		// to the raster data
		int[] dstBuffer = ((DataBufferInt) dst.getRaster().getDataBuffer())
				.getData();
		// System.out.println((dstBuffer[0] >>> 24) & 0xFF);

		double m2 = xFactor * width * xFactor * width + yFactor * height
				* yFactor * height;
		int pos = 0;
		for (int j = 0; j < height; j++) {
			double jj = yFactor * j;
			for (int i = 0; i < width; i++) {
				double ii = xFactor * i;
				double z = hasConstantZ ? 1.0 : Math.sqrt(m2 - ii * ii - jj * jj);
				double noise = 0.5 + 0.5 * PerlinNoiseGenerator
						.noise(ii, jj, z);

				double likeness = Math.max(0.0, Math.min(1.0, 2.0 * noise));
				// likeness = 0.0;
				dstBuffer[pos++] = SubstanceColorUtilities.getInterpolatedRGB(
						c3, c1, likeness);
			}
		}
		// System.out.println((dstBuffer[0] >>> 24) & 0xFF);
		if (toBlur) {
			// and staying here with non-hi DPI aware image for blurred noise
			ConvolveOp convolve = new ConvolveOp(new Kernel(3, 3, new float[] {
					.08f, .08f, .08f, .08f, .38f, .08f, .08f, .08f, .08f }),
					ConvolveOp.EDGE_NO_OP, null);
			dst = convolve.filter(dst, null);
		}
		
		// and now returning an image that is hi DPI aware if needed
		if (UIUtil.getScaleFactor() > 1.0) {
			BufferedImage result = SubstanceCoreUtilities.getBlankImage(width, height);
			Graphics2D g2d = result.createGraphics();
			g2d.drawImage(dst, 0, 0, null);
			g2d.dispose();
			return result;
		} else {
			return dst;
		}
	}
}
