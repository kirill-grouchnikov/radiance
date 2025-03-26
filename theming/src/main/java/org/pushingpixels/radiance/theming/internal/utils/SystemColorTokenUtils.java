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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContrastCurve;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;

import java.awt.*;

public class SystemColorTokenUtils {
    public static ContainerColorTokens getSystemTokens(Hct seed,
        ContainerConfiguration containerConfiguration) {

        TonalPalette palette = TonalPalette.fromHct(seed);

        return new ContainerColorTokens() {
            private Color getColor(double baseTone, double toneDelta) {
                double tone = baseTone + toneDelta * containerConfiguration.getSurfaceRangeAmplitudeFactor();
                tone = Math.min(100.0, tone);
                tone = Math.max(0.0, tone);
                return new Color(palette.getHct(tone).toInt());
            }

            private Color getColor(ContrastCurve contrastCurve) {
                double tone = contrastCurve.get(containerConfiguration.getContrastLevel());
                return new Color(palette.getHct(tone).toInt());
            }

            @Override
            public boolean isDark() {
                return containerConfiguration.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return containerConfiguration.isDark() ? getColor(30.0, -8.0) : getColor(90.0, 8.0);
            }

            @Override
            public Color getContainerSurfaceLow() {
                return containerConfiguration.isDark() ? getColor(30.0, -2.0) : getColor(90.0, 4.0);
            }

            @Override
            public Color getContainerSurface() {
                return containerConfiguration.isDark() ? getColor(30.0, 0.0) : getColor(90.0, 0.0);
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return containerConfiguration.isDark() ? getColor(30.0, 5.0) : getColor(90.0, -2.0);
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return containerConfiguration.isDark() ? getColor(30.0, 10.0) : getColor(90.0, -4.0);
            }

            @Override
            public Color getContainerSurfaceDim() {
                return containerConfiguration.isDark() ? getColor(30.0, -10.0) : getColor(90.0, -6.0);
            }

            @Override
            public Color getContainerSurfaceBright() {
                return containerConfiguration.isDark() ? getColor(30.0, 12.0) : getColor(90.0, 10.0);
            }

            @Override
            public Color getOnContainer() {
                return containerConfiguration.isDark()
                    ? getColor(new ContrastCurve(80.0, 90.0, 95.0, 100.0))
                    : getColor(new ContrastCurve(40.0, 30.0, 20.0, 10.0));
            }

            @Override
            public Color getOnContainerVariant() {
                return containerConfiguration.isDark()
                    ? getColor(new ContrastCurve(70.0, 80.0, 85.0, 90.0))
                    : getColor(new ContrastCurve(45.0, 40.0, 30.0, 20.0));
            }

            @Override
            public Color getContainerOutline() {
                return containerConfiguration.isDark()
                    ? getColor(new ContrastCurve(15.0, 10.0, 5.0, 0.0))
                    : getColor(new ContrastCurve(55.0, 50.0, 40.0, 30.0));
            }

            @Override
            public Color getContainerOutlineVariant() {
                return containerConfiguration.isDark()
                    ? getColor(new ContrastCurve(35.0, 30.0, 20.0, 10.0))
                    : getColor(new ContrastCurve(85.0, 80.0, 70.0, 50.0));
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return 0.3f;
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return 0.45f;
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return 0.35f;
            }

            @Override
            public Color getInverseContainerSurface() {
                return containerConfiguration.isDark() ? getColor(90.0, 0.0) : getColor(30.0, 0.0);
            }

            @Override
            public Color getInverseOnContainer() {
                return containerConfiguration.isDark() ? getColor(30.0, 0.0) : getColor(90.0, 0.0);
            }

            @Override
            public Color getInverseContainerOutline() {
                return containerConfiguration.isDark()
                    ? getColor(new ContrastCurve(25.0, 20.0, 15.0, 5.0))
                    : getColor(new ContrastCurve(15.0, 10.0, 5.0, 0.0));
            }

            @Override
            public Color getComplementaryOnContainer() {
                return containerConfiguration.isDark() ? getColor(10.0, 0.0) : getColor(80.0, 0.0);
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return containerConfiguration.isDark()
                    ? getColor(new ContrastCurve(85.0, 90.0, 95.0, 100.0))
                    : getColor(new ContrastCurve(90.0, 95.0, 98.0, 100.0));
            }

            @Override
            public Color getAccentOnContainer() {
                return containerConfiguration.isDark() ? getColor(80.0, 0.0) : getColor(40.0, 0.0);
            }
        };
    }
}
