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
package org.pushingpixels.substance.internal.utils.filters;

import java.awt.image.BufferedImage;

/**
 * @author Kirill Grouchnikov
 */
public class TranslucentFilter extends AbstractFilter {
	private double alpha;

	public TranslucentFilter(double alpha) {
		this.alpha = alpha;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BufferedImage filter(BufferedImage src, BufferedImage dst) {
		if (dst == null) {
			dst = createCompatibleDestImage(src, null);
		}

		int width = src.getWidth();
		int height = src.getHeight();

		int[] pixels = new int[width * height];
		getPixels(src, 0, 0, width, height, pixels);
		translucentColor(pixels);
		setPixels(dst, 0, 0, width, height, pixels);

		return dst;
	}

	private void translucentColor(int[] pixels) {
		for (int i = 0; i < pixels.length; i++) {
			int argb = pixels[i];
			int transp = (int) (alpha * ((argb >>> 24) & 0xFF));
			int r = (argb >>> 16) & 0xFF;
			int g = (argb >>> 8) & 0xFF;
			int b = (argb >>> 0) & 0xFF;

			pixels[i] = (transp << 24) | (r << 16) | (g << 8) | b;
		}
	}
}
