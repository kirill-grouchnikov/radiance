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
package org.pushingpixels.demo.spyglass.cookbook;

import com.jhlabs.image.BlurFilter;
import com.jhlabs.image.CompoundFilter;
import com.jhlabs.image.Gradient;
import com.jhlabs.image.PointFilter;
import org.pushingpixels.demo.spyglass.cookbook.skin.GoldenBrownColorScheme;
import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

import java.awt.*;
import java.awt.image.BufferedImageOp;
import java.awt.image.Kernel;

public class EchoNeonIcon implements NeonIcon {
    private NeonIcon echo;

    private NeonIcon original;

    static BufferedImageOp iconShadowFilter;

    {
        BlurFilter blurFilter = new BlurFilter();
        blurFilter.setUseAlpha(true);
        int kernelSide = 3;
        float[] kernelData = new float[kernelSide * kernelSide];
        for (int i = 0; i < kernelData.length; i++) {
            kernelData[i] = 1.0f;
        }
        blurFilter.setKernel(new Kernel(kernelSide, kernelSide, kernelData));

        SubstanceColorScheme colorScheme = new GoldenBrownColorScheme();
        Gradient inverseGradient = new Gradient(
                new int[] { 0, 128, 255 },
                new int[] { colorScheme.getUltraLightColor().getRGB(),
                        colorScheme.getMidColor().getRGB(),
                        colorScheme.getUltraDarkColor().getRGB() });
        // Can't use LookupFilter since it disregards the original alpha
        PointFilter inverseFilter = new PointFilter() {
            @Override
            public int filterRGB(int x, int y, int rgb) {
                int a = rgb & 0xff000000;
                int r = (rgb >> 16) & 0xff;
                int g = (rgb >> 8) & 0xff;
                int b = rgb & 0xff;
                // Compute perceived color brightness based on the individual RGB components
                // See https://en.wikipedia.org/wiki/Relative_luminance
                int brightness = (2126 * r + 7152 * g + 722 * b) / 10000;
                return a | (inverseGradient.getColor(brightness / 255.0f) & 0x00ffffff);
            }
        };

        iconShadowFilter = new CompoundFilter(blurFilter, inverseFilter);
    }

    public EchoNeonIcon(Factory originalFactory) {
        this.original = originalFactory.createNewIcon();
        this.echo = FilteredNeonIcon.factory(originalFactory, iconShadowFilter)
                .createNewIcon();
    }

    @Override
    public void setDimension(Dimension newDimension) {
        this.original.setDimension(newDimension);
        this.echo.setDimension(newDimension);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.original.setColorFilter(colorFilter);
        this.echo.setColorFilter(colorFilter);
    }

    @Override
    public int getIconHeight() {
        return this.original.getIconHeight();
    }

    @Override
    public int getIconWidth() {
        return this.original.getIconWidth();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        this.echo.paintIcon(c, g, x, y);
        this.original.paintIcon(c, g, x, y);
    }

    public static Factory factory(Factory delegate) {
        return () -> new EchoNeonIcon(delegate);
    }
}
