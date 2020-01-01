/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.api.painterpack.noise;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.PerlinNoiseGenerator;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.DataBufferInt;
import java.awt.image.Kernel;

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
     * @param skin         The skin to use for rendering the image.
     * @param width        Image width.
     * @param height       Image height.
     * @param xFactor      X stretch factor.
     * @param yFactor      Y stretch factor.
     * @param hasConstantZ Indication whether the Z is constant.
     * @param noiseFilter  Noise filter to apply.
     * @param toBlur       Indication whether the resulting image should be blurred.
     * @param isPreview    Indication whether the image is in preview mode.
     * @return Noise image.
     */
    public static BufferedImage getNoiseImage(SubstanceSkin skin, int width,
            int height, double xFactor, double yFactor, boolean hasConstantZ,
            NoiseFilter noiseFilter, boolean toBlur, boolean isPreview) {
        SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
        Color c1 = scheme.getWatermarkDarkColor();
        // c1 = new Color(255, 0, 0, 0);
        // System.out.println(c1.getAlpha());
        // Color c2 = scheme.getWatermarkStampColor();
        Color c3 = scheme.getWatermarkLightColor();

        BufferedImage dst = NeonCortex.getBlankImage(width, height);
        //
        // new BufferedImage(width, height,
        // BufferedImage.TYPE_INT_ARGB);

        // Borrow from Sebastien Petrucci fast blur code - direct access
        // to the raster data
        int[] dstBuffer = ((DataBufferInt) dst.getRaster().getDataBuffer())
                .getData();
        // System.out.println((dstBuffer[0] >>> 24) & 0xFF);

        int imageWidth = dst.getWidth();
        int imageHeight = dst.getHeight();
        double m2 = xFactor * imageWidth * xFactor * imageWidth + yFactor * imageHeight
                * yFactor * imageHeight;
        int pos = 0;
        for (int j = 0; j < imageHeight; j++) {
            double jj = yFactor * j;
            for (int i = 0; i < imageWidth; i++) {
                double ii = xFactor * i;
                double z = hasConstantZ ? 1.0 : Math.sqrt(m2 - ii * ii - jj
                        * jj);
                double noise = 0.5 + 0.5 * PerlinNoiseGenerator
                        .noise(ii, jj, z);
                if (noiseFilter != null)
                    noise = noiseFilter.apply(i, j, z, noise);

                double likeness = Math.max(0.0, Math.min(1.0, 2.0 * noise));
                // likeness = 0.0;
                dstBuffer[pos++] = SubstanceColorUtilities.getInterpolatedRGB(
                        c3, c1, likeness);
            }
        }
        // System.out.println((dstBuffer[0] >>> 24) & 0xFF);
        if (toBlur) {
            float edgeBlur = 0.08f / (float) NeonCortex.getScaleFactor();
            ConvolveOp convolve = new ConvolveOp(new Kernel(3, 3, new float[] {
                    edgeBlur, edgeBlur, edgeBlur, edgeBlur, 1.06f - 8 * edgeBlur, edgeBlur,
                    edgeBlur, edgeBlur, edgeBlur }),
                    ConvolveOp.EDGE_NO_OP, null);
            dst = convolve.filter(dst, NeonCortex.getBlankImage(width, height));
        }
        return dst;
    }
}
