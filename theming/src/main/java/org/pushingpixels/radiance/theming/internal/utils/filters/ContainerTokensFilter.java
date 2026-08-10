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

package org.pushingpixels.radiance.theming.internal.utils.filters;

import org.pushingpixels.radiance.common.api.filter.RadianceAbstractFilter;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.utils.HashMapKey;
import org.pushingpixels.radiance.theming.internal.utils.LazyResettableHashMap;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.List;

/**
 * @author Romain Guy <romain.guy@mac.com>
 * @author Kirill Grouchnikov
 */

public class ContainerTokensFilter extends RadianceAbstractFilter {
    public enum FilterRange {
        FULL_SPAN, TONAL_CONTAINER_SURFACES
    }

    public enum BrightnessFidelity {
        ORIGINAL, HALF_AND_HALF, TONAL
    }

    private int[] interpolated;
    private FilterRange filterRange;
    private BrightnessFidelity brightnessFidelity;

    private static final int MAPSTEPS = 512;

    private final static LazyResettableHashMap<ContainerTokensFilter> filters =
            new LazyResettableHashMap<>("ContainerTokensFilter");

    public static ContainerTokensFilter getContainerTokensFilter(
        ContainerColorTokens colorTokens, FilterRange filterRange, BrightnessFidelity brightnessFidelity) {
        HashMapKey key = RadianceCoreUtilities.getHashKey(colorTokens.hashCode(), filterRange);
        ContainerTokensFilter filter = filters.get(key);
        if (filter == null) {
            filter = new ContainerTokensFilter(colorTokens, filterRange, brightnessFidelity);
            filters.put(key, filter);
        }
        return filter;
    }

    private static Color getColor(Color content, float contentAlpha, Color surface) {
        contentAlpha = (int) (content.getAlpha() * contentAlpha);
        if (contentAlpha == 255) {
            return content;
        }

        int contentR = content.getRed();
        int contentG = content.getGreen();
        int contentB = content.getBlue();

        int surfaceR = surface.getRed();
        int surfaceG = surface.getGreen();
        int surfaceB = surface.getBlue();

        int resultR = surfaceR + (int) (contentAlpha * (contentR - surfaceR) / 255.0f);
        int resultG = surfaceG + (int) (contentAlpha * (contentG - surfaceG) / 255.0f);
        int resultB = surfaceB + (int) (contentAlpha * (contentB - surfaceB) / 255.0f);

        return new Color(resultR, resultG, resultB, 255);
    }

    public static int[] getInterpolatedColors(ContainerColorTokens colorTokens, FilterRange filterRange) {
        // collect the brightness factors of various color tokens
        Map<Integer, Color> tokenColorMapping = new TreeMap<>();

        Color containerLowest = colorTokens.getContainerSurfaceLowest();
        Color containerLow = colorTokens.getContainerSurfaceLow();
        Color container = colorTokens.getContainerSurface();
        Color containerHigh = colorTokens.getContainerSurfaceHigh();
        Color containerHighest = colorTokens.getContainerSurfaceHighest();
        Color containerDim = colorTokens.getContainerSurfaceDim();
        Color containerBright = colorTokens.getContainerSurfaceBright();

        tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerLowest.getRGB()), containerLowest);
        tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerLow.getRGB()), containerLow);
        tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(container.getRGB()), container);
        tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerHigh.getRGB()), containerHigh);
        tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerHighest.getRGB()), containerHighest);
        tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerDim.getRGB()), containerDim);
        tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerBright.getRGB()), containerBright);

        if (filterRange == FilterRange.FULL_SPAN) {
            Color containerOutlineLow = getColor(colorTokens.getContainerOutlineLow(),
                colorTokens.getContainerOutlineEnabledAlpha(), container);
            Color containerOutline = getColor(colorTokens.getContainerOutline(),
                colorTokens.getContainerOutlineEnabledAlpha(), container);
            Color containerOutlineHigh = getColor(colorTokens.getContainerOutlineHigh(),
                colorTokens.getContainerOutlineEnabledAlpha(), container);
            Color onContainerLow = getColor(colorTokens.getOnContainerLow(),
                colorTokens.getOnContainerEnabledAlpha(), container);
            Color onContainer = getColor(colorTokens.getOnContainer(),
                colorTokens.getOnContainerEnabledAlpha(), container);
            Color onContainerHigh = getColor(colorTokens.getOnContainerHigh(),
                colorTokens.getOnContainerEnabledAlpha(), container);
            Color inverseContainerSurface = colorTokens.getInverseContainerSurface();
            Color inverseOnContainer = getColor(colorTokens.getInverseOnContainer(),
                colorTokens.getOnContainerEnabledAlpha(), inverseContainerSurface);
            Color inverseContainerOutline = getColor(colorTokens.getInverseContainerOutline(),
                colorTokens.getContainerOutlineEnabledAlpha(), inverseContainerSurface);
            Color complementaryOnContainer = getColor(colorTokens.getComplementaryOnContainer(),
                colorTokens.getOnContainerEnabledAlpha(), container);
            Color complementaryContainerOutline = getColor(colorTokens.getComplementaryContainerOutline(),
                colorTokens.getContainerOutlineEnabledAlpha(), container);

            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerOutlineLow.getRGB()), containerOutlineLow);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerOutline.getRGB()), containerOutline);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(containerOutlineHigh.getRGB()), containerOutlineHigh);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(onContainerLow.getRGB()), onContainerLow);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(onContainer.getRGB()), onContainer);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(onContainerHigh.getRGB()), onContainerHigh);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(inverseContainerSurface.getRGB()), inverseContainerSurface);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(inverseOnContainer.getRGB()), inverseOnContainer);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(inverseContainerOutline.getRGB()), inverseContainerOutline);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(complementaryOnContainer.getRGB()), complementaryOnContainer);
            tokenColorMapping.put(RadianceColorUtilities.getColorBrightness(complementaryContainerOutline.getRGB()), complementaryContainerOutline);
        }

        List<Integer> tokensBrightness = new ArrayList<>(tokenColorMapping.keySet());
        Collections.sort(tokensBrightness);

        int lowestTokensBrightness = tokensBrightness.get(0);
        int highestTokensBrightness = tokensBrightness.get(tokensBrightness.size() - 1);
        boolean hasSameBrightness = (highestTokensBrightness == lowestTokensBrightness);

        if (filterRange == FilterRange.FULL_SPAN) {
            // Put full black and full white as bookends if needed
            if (lowestTokensBrightness > 0) {
                tokensBrightness.add(0, 0);
                tokenColorMapping.put(0, Color.BLACK);
            }

            if (highestTokensBrightness < 255) {
                tokensBrightness.add(255);
                tokenColorMapping.put(255, Color.WHITE);
            }
        } else {
            Map<Integer, Color> stretchedColorMapping = new TreeMap<>();
            for (Map.Entry<Integer, Color> entry : tokenColorMapping.entrySet()) {
                int brightness = entry.getKey();
                int stretched = hasSameBrightness ? brightness
                    : 255 - 255 * (highestTokensBrightness - brightness)
                            / (highestTokensBrightness - lowestTokensBrightness);
                stretchedColorMapping.put(stretched, entry.getValue());
            }
            tokensBrightness = new ArrayList<>(stretchedColorMapping.keySet());
            Collections.sort(tokensBrightness);

            tokenColorMapping = stretchedColorMapping;
        }

        int[] interpolated = new int[MAPSTEPS];
        for (int i = 0; i < MAPSTEPS; i++) {
            int brightness = (int) (256.0 * i / MAPSTEPS);
            if (tokensBrightness.contains(brightness)) {
                interpolated[i] = tokenColorMapping.get(brightness).getRGB();
            } else {
                int currIndex = 0;
                while (true) {
                    int currStopValue = tokensBrightness.get(currIndex);
                    int nextStopValue = tokensBrightness.get(currIndex + 1);
                    if ((brightness > currStopValue) && (brightness < nextStopValue)) {
                        // interpolate
                        Color currStopColor = tokenColorMapping.get(currStopValue);
                        Color nextStopColor = tokenColorMapping.get(nextStopValue);
                        interpolated[i] = RadianceColorUtilities.getInterpolatedRGB(
                                currStopColor, nextStopColor,
                                1.0 - (double) (brightness - currStopValue)
                                        / (double) (nextStopValue - currStopValue));
                        break;
                    }
                    currIndex++;
                }
            }
        }
        return interpolated;
    }

    /**
     * @throws IllegalArgumentException if <code>containerColorTokens</code> is null
     */
    private ContainerTokensFilter(ContainerColorTokens containerColorTokens, FilterRange filterRange,
        BrightnessFidelity brightnessFidelity) {
        if (containerColorTokens == null) {
            throw new IllegalArgumentException("Color tokens cannot be null");
        }

        this.interpolated = getInterpolatedColors(containerColorTokens, filterRange);
        this.filterRange = filterRange;
        this.brightnessFidelity = brightnessFidelity;
    }

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

            int brightness = RadianceColorUtilities.getColorBrightness(argb);

            int a = (argb >>> 24) & 0xFF;
            int r = (argb >>> 16) & 0xFF;
            int g = (argb >>> 8) & 0xFF;
            int b = (argb >>> 0) & 0xFF;

            float[] hsb = Color.RGBtoHSB(r, g, b, null);
            int pixelColor = interpolated[brightness * MAPSTEPS / 256];

            int ri = (pixelColor >>> 16) & 0xFF;
            int gi = (pixelColor >>> 8) & 0xFF;
            int bi = (pixelColor >>> 0) & 0xFF;
            float[] hsbi = Color.RGBtoHSB(ri, gi, bi, null);

            // Copy hue and saturation, but leave the original brightness
            hsb[0] = hsbi[0];
            hsb[1] = hsbi[1];
            switch (this.brightnessFidelity) {
                case ORIGINAL: break;
                case HALF_AND_HALF: hsb[2] = 0.5f * hsb[2] + 0.5f * hsbi[2]; break;
                case TONAL: default: hsb[2] = hsbi[2];
            }

            int result = Color.HSBtoRGB(hsb[0], hsb[1], hsb[2]);

            pixels[i] = (a << 24) | ((result >> 16) & 0xFF) << 16
                    | ((result >> 8) & 0xFF) << 8 | (result & 0xFF);
        }
    }
}
