/*
 * $Id: ColorSchemeFilter.java 2353 2009-12-11 04:57:29Z kirillcool $
 *
 * Dual-licensed under LGPL (Sun and Romain Guy) and BSD (Romain Guy).
 *
 * Copyright 2005 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * Copyright (c) 2006 Romain Guy <romain.guy@mac.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.pushingpixels.substance.internal.utils.filters;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * @author Romain Guy <romain.guy@mac.com>
 * @author Kirill Grouchnikov
 */

public class ColorSchemeFilter extends AbstractFilter {
	private int[] interpolated;

	public static final int MAPSTEPS = 512;

	protected final static LazyResettableHashMap<ColorSchemeFilter> filters = new LazyResettableHashMap<ColorSchemeFilter>(
			"ColorSchemeFilter");

	protected float originalBrightnessFactor;

	public static ColorSchemeFilter getColorSchemeFilter(SubstanceColorScheme scheme,
			float originalBrightnessFactor) {
		HashMapKey key = SubstanceCoreUtilities.getHashKey(scheme.getDisplayName(),
				originalBrightnessFactor);
		ColorSchemeFilter filter = filters.get(key);
		if (filter == null) {
			filter = new ColorSchemeFilter(scheme, originalBrightnessFactor);
			filters.put(key, filter);
		}
		return filter;
	}

	/**
	 * @throws IllegalArgumentException
	 *             if <code>scheme</code> is null
	 */
	private ColorSchemeFilter(SubstanceColorScheme scheme, float originalBrightnessFactor) {
		if (scheme == null) {
			throw new IllegalArgumentException("mixColor cannot be null");
		}

		this.originalBrightnessFactor = originalBrightnessFactor;

		// collect the brightness factors of the color scheme
		Map<Integer, Color> schemeColorMapping = new TreeMap<Integer, Color>();
		schemeColorMapping.put(
				SubstanceColorUtilities.getColorBrightness(scheme.getUltraLightColor().getRGB()),
				scheme.getUltraLightColor());
		schemeColorMapping.put(
				SubstanceColorUtilities.getColorBrightness(scheme.getExtraLightColor().getRGB()),
				scheme.getExtraLightColor());
		schemeColorMapping.put(
				SubstanceColorUtilities.getColorBrightness(scheme.getLightColor().getRGB()),
				scheme.getLightColor());
		schemeColorMapping.put(
				SubstanceColorUtilities.getColorBrightness(scheme.getMidColor().getRGB()),
				scheme.getMidColor());
		schemeColorMapping.put(
				SubstanceColorUtilities.getColorBrightness(scheme.getDarkColor().getRGB()),
				scheme.getDarkColor());
		schemeColorMapping.put(
				SubstanceColorUtilities.getColorBrightness(scheme.getUltraDarkColor().getRGB()),
				scheme.getUltraDarkColor());

		List<Integer> schemeBrightness = new ArrayList<Integer>();
		schemeBrightness.addAll(schemeColorMapping.keySet());
		Collections.sort(schemeBrightness);

		int lowestSchemeBrightness = schemeBrightness.get(0);
		int highestSchemeBrightness = schemeBrightness.get(schemeBrightness.size() - 1);
		boolean hasSameBrightness = (highestSchemeBrightness == lowestSchemeBrightness);

		Map<Integer, Color> stretchedColorMapping = new TreeMap<Integer, Color>();
		for (Map.Entry<Integer, Color> entry : schemeColorMapping.entrySet()) {
			int brightness = entry.getKey();
			int stretched = hasSameBrightness ? brightness
					: 255 - 255 * (highestSchemeBrightness - brightness)
							/ (highestSchemeBrightness - lowestSchemeBrightness);
			stretchedColorMapping.put(stretched, entry.getValue());
		}
		schemeBrightness = new ArrayList<Integer>();
		schemeBrightness.addAll(stretchedColorMapping.keySet());
		Collections.sort(schemeBrightness);

		this.interpolated = new int[MAPSTEPS];
		for (int i = 0; i < MAPSTEPS; i++) {
			int brightness = (int) (256.0 * i / MAPSTEPS);
			if (schemeBrightness.contains(brightness)) {
				this.interpolated[i] = stretchedColorMapping.get(brightness).getRGB();
			} else {
				if (hasSameBrightness) {
					this.interpolated[i] = stretchedColorMapping.get(lowestSchemeBrightness)
							.getRGB();
				} else {
					int currIndex = 0;
					while (true) {
						int currStopValue = schemeBrightness.get(currIndex);
						int nextStopValue = schemeBrightness.get(currIndex + 1);
						if ((brightness > currStopValue) && (brightness < nextStopValue)) {
							// interpolate
							Color currStopColor = stretchedColorMapping.get(currStopValue);
							Color nextStopColor = stretchedColorMapping.get(nextStopValue);
							this.interpolated[i] = SubstanceColorUtilities.getInterpolatedRGB(
									currStopColor, nextStopColor,
									1.0 - (double) (brightness - currStopValue)
											/ (double) (nextStopValue - currStopValue));
							break;
						}
						currIndex++;
					}
				}
			}
		}
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
		mixColor(pixels);
		setPixels(dst, 0, 0, width, height, pixels);

		return dst;
	}

	private void mixColor(int[] pixels) {
		for (int i = 0; i < pixels.length; i++) {
			int argb = pixels[i];

			int brightness = SubstanceColorUtilities.getColorBrightness(argb);

			int r = (argb >>> 16) & 0xFF;
			int g = (argb >>> 8) & 0xFF;
			int b = (argb >>> 0) & 0xFF;

			float[] hsb = Color.RGBtoHSB(r, g, b, null);
			int pixelColor = interpolated[brightness * MAPSTEPS / 256];

			int ri = (pixelColor >>> 16) & 0xFF;
			int gi = (pixelColor >>> 8) & 0xFF;
			int bi = (pixelColor >>> 0) & 0xFF;
			float[] hsbi = Color.RGBtoHSB(ri, gi, bi, null);

			hsb[0] = hsbi[0];
			hsb[1] = hsbi[1];
			if (this.originalBrightnessFactor >= 0.0f) {
				hsb[2] = this.originalBrightnessFactor * hsb[2]
						+ (1.0f - this.originalBrightnessFactor) * hsbi[2];
			} else {
				hsb[2] = hsb[2] * hsbi[2] * (1.0f + this.originalBrightnessFactor);
			}

			int result = Color.HSBtoRGB(hsb[0], hsb[1], hsb[2]);

			pixels[i] = (argb & 0xFF000000) | ((result >> 16) & 0xFF) << 16
					| ((result >> 8) & 0xFF) << 8 | (result & 0xFF);
		}
	}
}
