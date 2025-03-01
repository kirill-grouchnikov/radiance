/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.palette;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.filters.TonalContainerFilter;

import java.awt.*;

public interface ContainerColorTokens {
    boolean isDark();

    Color getContainerSurfaceLowest();
    Color getContainerSurfaceLow();
    Color getContainerSurface();
    Color getContainerSurfaceHigh();
    Color getContainerSurfaceHighest();

    Color getContainerSurfaceDim();
    Color getContainerSurfaceBright();

    Color getOnContainer();
    Color getOnContainerVariant();

    Color getContainerOutline();
    Color getContainerOutlineVariant();

    float getContainerSurfaceDisabledAlpha();
    float getOnContainerDisabledAlpha();
    float getContainerOutlineDisabledAlpha();

    Color getInverseContainerSurface();
    Color getInverseOnContainer();
    Color getInverseContainerOutline();

    Color getComplementaryOnContainer();
    Color getComplementaryContainerOutline();

    default RadianceIcon.ColorFilter getColorFilter(float brightnessFactor, float alpha) {
        ContainerColorTokens origin = this;
        return color -> {
            int[] interpolated = TonalContainerFilter.getInterpolatedColors(origin);
            int steps = interpolated.length;

            int brightness = RadianceColorUtilities.getColorBrightness(color.getRGB());

            int a = color.getAlpha();
            int r = color.getRed();
            int g = color.getGreen();
            int b = color.getBlue();

            float[] hsb = Color.RGBtoHSB(r, g, b, null);
            int pixelColor = interpolated[brightness * steps / 256];

            int ri = (pixelColor >>> 16) & 0xFF;
            int gi = (pixelColor >>> 8) & 0xFF;
            int bi = (pixelColor >>> 0) & 0xFF;
            float[] hsbi = Color.RGBtoHSB(ri, gi, bi, null);

            hsb[0] = hsbi[0];
            hsb[1] = hsbi[1];
            if (brightnessFactor >= 0.0f) {
                hsb[2] = brightnessFactor * hsb[2]
                    + (1.0f - brightnessFactor) * hsbi[2];
            } else {
                hsb[2] = hsb[2] * hsbi[2] * (1.0f + brightnessFactor);
            }

            Color converted = new Color(Color.HSBtoRGB(hsb[0], hsb[1], hsb[2]));
            int finalAlpha = (int) (a * alpha);

            return new Color(converted.getRed(), converted.getGreen(), converted.getBlue(),
                finalAlpha);
        };
    }
}
