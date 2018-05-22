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

import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * Factory for creating noise images.
 * 
 * @author Kirill Grouchnikov.
 */
public class FractalFlameFactory {
	/**
	 * Returns a noise image.
	 * 
	 * @param colorScheme1
	 *            The first color scheme to use for rendering the image.
	 * @param colorScheme2
	 *            The second color scheme to use for rendering the image.
	 * @param interpolationFactor
	 *            Interpolation factor.
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
	 * @return Noise image.
	 */
	public static BufferedImage getFractalFlameImage(
			SubstanceColorScheme colorScheme1,
			SubstanceColorScheme colorScheme2, int width, int height,
			int iterations, IteratedFunctionSystem ifs) {
		Color c1_1 = SubstanceColorUtilities.getInterpolatedColor(colorScheme1
				.getMidColor(), colorScheme1.getLightColor(), 0.6);
		Color c2_1 = colorScheme1.getLightColor();
		Color c3_1 = colorScheme1.getUltraLightColor();
		Color c1_2 = SubstanceColorUtilities.getInterpolatedColor(colorScheme2
				.getMidColor(), colorScheme2.getLightColor(), 0.6);
		Color c2_2 = colorScheme2.getLightColor();
		Color c3_2 = colorScheme2.getUltraLightColor();

		Color c1 = SubstanceColorUtilities
				.getInterpolatedColor(c1_1, c1_2, 0.1);
		Color c2 = SubstanceColorUtilities
				.getInterpolatedColor(c2_1, c2_2, 0.5);
		Color c3 = SubstanceColorUtilities
				.getInterpolatedColor(c3_1, c3_2, 0.9);

		BufferedImage dst = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);

		// Borrow from Sebastien Petrucci fast blur code - direct access
		// to the raster data
		int[] dstBuffer = ((DataBufferInt) dst.getRaster().getDataBuffer())
				.getData();

		long[] vals = new long[width * height];

		long valMax = 0;

		int count = 0;
		Point2D bc = new Point2D.Double(Math.random(), Math.random());
		while (true) {
			ifs.apply(bc);
			count++;
			if (count > 20) {
				int x = (int) (width * (1.0 + bc.getX()) / 2);
				int y = (int) (height * (1.0 + bc.getY()) / 2);
				if ((x >= 0) && (x < width) && (y >= 0) && (y < height)) {
					int pos = y * width + x;
					vals[pos]++;
					valMax = Math.max(valMax, vals[pos]);
				}
			}
			if (count == iterations) {
				break;
			}
		}

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int pos = y * width + x;
				double a = vals[pos] / (0.9 * valMax);
				double ai = Math.sqrt(Math.sqrt(a));
				if (ai > 1.0)
					ai = 1.0;

				dstBuffer[pos++] = (ai < 0.5) ? SubstanceColorUtilities
						.getInterpolatedRGB(c2, c1, 2.0 * ai)
						: SubstanceColorUtilities.getInterpolatedRGB(c3, c2,
								2.0 * (ai - .5));
			}
		}
		return dst;
	}

	/**
	 * Returns a noise image.
	 * 
	 * @param colorScheme1
	 *            The first color scheme to use for rendering the image.
	 * @param colorScheme2
	 *            The second color scheme to use for rendering the image.
	 * @param interpolationFactor
	 *            Interpolation factor.
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
	 * @return Noise image.
	 */
	public static BufferedImage getFractalFlameImage(
			SubstanceColorScheme colorScheme, int width, int height,
			int iterations, IteratedFunctionSystem ifs) {
		Color c2 = colorScheme.getLightColor();
		Color c3 = colorScheme.getMidColor();

		BufferedImage dst = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);
		dst.getGraphics().setColor(Color.black);
		dst.getGraphics().fillRect(0, 0, width, height);

		// Borrow from Sebastien Petrucci fast blur code - direct access
		// to the raster data
		int[] dstBuffer = ((DataBufferInt) dst.getRaster().getDataBuffer())
				.getData();

		double[] vals = new double[width * height];

		double valMax = 0;

		int count = 0;
		Point2D bc = new Point2D.Double(Math.random(), Math.random());
		while (true) {
			ifs.apply(bc);
			count++;
			if (count > 20) {
				// if ((x >= 0) && (x < width) && (y >= 0) && (y < height)) {
				// int pos = y * width + x;
				// vals[pos]++;
				// valMax = Math.max(valMax, vals[pos]);
				// }
				double xc = width * (1.0 + bc.getX()) / 2;
				double yc = height * (1.0 + bc.getY()) / 2;
				double xOver = xc - Math.floor(xc);
				double yOver = yc - Math.floor(yc);

				int xr = (int) Math.ceil(xc);
				int xl = (int) Math.floor(xc);
				int yt = (int) Math.ceil(yc);
				int yb = (int) Math.floor(yc);

				if ((xr >= 0) && (xr < width) && (yt >= 0) && (yt < height)) {
					int pos = yt * width + xr;
					vals[pos] += xOver * yOver;
					valMax = Math.max(valMax, vals[pos]);
				}
				if ((xl >= 0) && (xl < width) && (yt >= 0) && (yt < height)) {
					int pos = yt * width + xl;
					vals[pos] += (1.0 - xOver) * yOver;
					valMax = Math.max(valMax, vals[pos]);
				}
				if ((xr >= 0) && (xr < width) && (yb >= 0) && (yb < height)) {
					int pos = yb * width + xr;
					vals[pos] += xOver * (1.0 - yOver);
					valMax = Math.max(valMax, vals[pos]);
				}
				if ((xl >= 0) && (xl < width) && (yb >= 0) && (yb < height)) {
					int pos = yb * width + xl;
					vals[pos] += (1.0 - xOver) * (1.0 - yOver);
					valMax = Math.max(valMax, vals[pos]);
				}
			}
			if (count == iterations) {
				break;
			}
			// if (count % 100000 == 0)
			// System.err.println(count);
		}

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int pos = y * width + x;
				double a = vals[pos] / (0.9 * valMax);
				double ai = Math.sqrt(Math.sqrt(a));
				if (ai > 1.0)
					ai = 1.0;

				dstBuffer[pos++] = (ai < 0.5) ? SubstanceColorUtilities
						.getInterpolatedRGB(c2, Color.black, 2.0 * ai)
						: SubstanceColorUtilities.getInterpolatedRGB(c3, c2,
								2.0 * (ai - .5));
			}
		}
		return dst;
	}

	/**
	 * Returns a noise image.
	 * 
	 * @param colorScheme1
	 *            The first color scheme to use for rendering the image.
	 * @param colorScheme2
	 *            The second color scheme to use for rendering the image.
	 * @param interpolationFactor
	 *            Interpolation factor.
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
	 * @return Noise image.
	 */
	public static BufferedImage getFractalFlameImage(int width, int height,
			int iterations, IteratedFunctionSystem ifs) {
		Color[] colors = new Color[] { Color.black,
				Color.blue.darker().darker(), Color.blue.darker(), Color.blue,
				Color.green, Color.orange, Color.orange, Color.yellow,
				Color.red };

		BufferedImage dst = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_ARGB);
		dst.getGraphics().setColor(Color.black);
		dst.getGraphics().fillRect(0, 0, width, height);

		// Borrow from Sebastien Petrucci fast blur code - direct access
		// to the raster data
		int[] dstBuffer = ((DataBufferInt) dst.getRaster().getDataBuffer())
				.getData();

		double[] vals = new double[width * height];

		double valMax = 0;

		int count = 0;
		Point2D bc = new Point2D.Double(Math.random(), Math.random());
		while (true) {
			ifs.apply(bc);
			count++;
			if (count > 20) {

				double xc = width * (1.0 + bc.getX()) / 2;
				double yc = height * (1.0 + bc.getY()) / 2;
				double xOver = xc - Math.floor(xc);
				double yOver = yc - Math.floor(yc);

				int xr = (int) Math.ceil(xc);
				int xl = (int) Math.floor(xc);
				int yt = (int) Math.ceil(yc);
				int yb = (int) Math.floor(yc);

				if ((xr >= 0) && (xr < width) && (yt >= 0) && (yt < height)) {
					int pos = yt * width + xr;
					vals[pos] += xOver * yOver;
					valMax = Math.max(valMax, vals[pos]);
				}
				if ((xl >= 0) && (xl < width) && (yt >= 0) && (yt < height)) {
					int pos = yt * width + xl;
					vals[pos] += (1.0 - xOver) * yOver;
					valMax = Math.max(valMax, vals[pos]);
				}
				if ((xr >= 0) && (xr < width) && (yb >= 0) && (yb < height)) {
					int pos = yb * width + xr;
					vals[pos] += xOver * (1.0 - yOver);
					valMax = Math.max(valMax, vals[pos]);
				}
				if ((xl >= 0) && (xl < width) && (yb >= 0) && (yb < height)) {
					int pos = yb * width + xl;
					vals[pos] += (1.0 - xOver) * (1.0 - yOver);
					valMax = Math.max(valMax, vals[pos]);
				}
			}
			if (count == iterations) {
				break;
			}
			// if (count % 100000 == 0)
			// System.err.println(count);
		}

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int pos = y * width + x;
				double a = vals[pos] / valMax;
				double ai = (a > 0.0) ? Math.log(a) / Math.log(20) : 1.0;
				ai = -ai;// / 10.0;

				// double ai = vals[pos] / valMax;
				if (ai >= 1.0)
					ai = 0.9999999999;
				if (ai < 0.0)
					ai = 0.0;

				int range = (int) (ai * (colors.length - 1));
				double coef = ai * (colors.length - 1) - range;

				int colorRange = (int) (ai * (colors.length - 1));
				dstBuffer[pos++] = SubstanceColorUtilities.getInterpolatedRGB(
						colors[colorRange], colors[colorRange + 1], 1.0 - coef);

				// dstBuffer[pos++] = (ai < 0.5) ? SubstanceColorUtilities
				// .getInterpolatedRGB(c2, Color.black, 2.0 * ai)
				// : SubstanceColorUtilities.getInterpolatedRGB(c3, c2,
				// 2.0 * (ai - .5));
				// dstBuffer[pos++] = c;
			}
		}
		return dst;
	}
}
