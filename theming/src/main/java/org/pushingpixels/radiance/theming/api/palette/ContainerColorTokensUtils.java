/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;

import java.awt.*;

public class ContainerColorTokensUtils {
    public static ContainerColorTokens getContainerTokens(
        Hct seed, ContainerConfiguration containerConfiguration) {
        return getContainerTokens(seed, containerConfiguration,
            TokenPaletteColorResolverUtils.getPaletteColorResolver());
    }

    public static ContainerColorTokens getContainerTokens(
        Hct seed, ContainerConfiguration containerConfiguration,
        TokenPaletteColorResolver colorResolver) {

        DynamicPalette dynamicPalette = new DynamicPalette(
            /* sourceColorHct */ seed,
            /* containerConfiguration */ containerConfiguration);

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return dynamicPalette.containerConfiguration.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return colorResolver.getContainerSurfaceLowest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceLow() {
                return colorResolver.getContainerSurfaceLow(dynamicPalette);
            }

            @Override
            public Color getContainerSurface() {
                return colorResolver.getContainerSurface(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return colorResolver.getContainerSurfaceHigh(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return colorResolver.getContainerSurfaceHighest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceDim() {
                return colorResolver.getContainerSurfaceDim(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceBright() {
                return colorResolver.getContainerSurfaceBright(dynamicPalette);
            }

            @Override
            public Color getOnContainer() {
                return colorResolver.getOnContainer(dynamicPalette);
            }

            @Override
            public Color getOnContainerVariant() {
                return colorResolver.getOnContainerVariant(dynamicPalette);
            }

            @Override
            public Color getContainerOutline() {
                return colorResolver.getContainerOutline(dynamicPalette);
            }

            @Override
            public Color getContainerOutlineVariant() {
                return colorResolver.getContainerOutlineVariant(dynamicPalette);
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return colorResolver.getContainerSurfaceDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return colorResolver.getOnContainerDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return colorResolver.getContainerOutlineDisabledAlpha(dynamicPalette);
            }

            @Override
            public Color getInverseContainerSurface() {
                return colorResolver.getInverseContainerSurface(dynamicPalette);
            }

            @Override
            public Color getInverseOnContainer() {
                return colorResolver.getInverseOnContainer(dynamicPalette);
            }

            @Override
            public Color getInverseContainerOutline() {
                return colorResolver.getInverseContainerOutline(dynamicPalette);
            }

            @Override
            public Color getComplementaryOnContainer() {
                return colorResolver.getComplementaryOnContainer(dynamicPalette);
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return colorResolver.getComplementaryContainerOutline(dynamicPalette);
            }

            @Override
            public Color getAccentOnContainer() {
                return colorResolver.getAccentOnContainer(dynamicPalette);
            }
        };
    }

    public static ContainerColorTokens getBimodalContainerTokens(
        Hct seedOne,
        Hct seedTwo,
        DynamicBimodalPalette.TransitionRange transitionRange,
        double fidelityTone,
        ContainerConfiguration containerConfiguration,
        TokenPaletteColorResolver colorResolver) {

        DynamicBimodalPalette dynamicPalette = new DynamicBimodalPalette(
            /* seedOne */ seedOne,
            /* seedTwo */ seedTwo,
            /* transitionRange */ transitionRange,
            /* fidelityTone */ fidelityTone,
            /* containerConfiguration */ containerConfiguration);

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return dynamicPalette.containerConfiguration.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return colorResolver.getContainerSurfaceLowest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceLow() {
                return colorResolver.getContainerSurfaceLow(dynamicPalette);
            }

            @Override
            public Color getContainerSurface() {
                return colorResolver.getContainerSurface(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return colorResolver.getContainerSurfaceHigh(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return colorResolver.getContainerSurfaceHighest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceDim() {
                return colorResolver.getContainerSurfaceDim(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceBright() {
                return colorResolver.getContainerSurfaceBright(dynamicPalette);
            }

            @Override
            public Color getOnContainer() {
                return colorResolver.getOnContainer(dynamicPalette);
            }

            @Override
            public Color getOnContainerVariant() {
                return colorResolver.getOnContainerVariant(dynamicPalette);
            }

            @Override
            public Color getContainerOutline() {
                return colorResolver.getContainerOutline(dynamicPalette);
            }

            @Override
            public Color getContainerOutlineVariant() {
                return colorResolver.getContainerOutlineVariant(dynamicPalette);
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return colorResolver.getContainerSurfaceDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return colorResolver.getOnContainerDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return colorResolver.getContainerOutlineDisabledAlpha(dynamicPalette);
            }

            @Override
            public Color getInverseContainerSurface() {
                return colorResolver.getInverseContainerSurface(dynamicPalette);
            }

            @Override
            public Color getInverseOnContainer() {
                return colorResolver.getInverseOnContainer(dynamicPalette);
            }

            @Override
            public Color getInverseContainerOutline() {
                return colorResolver.getInverseContainerOutline(dynamicPalette);
            }

            @Override
            public Color getComplementaryOnContainer() {
                return colorResolver.getComplementaryOnContainer(dynamicPalette);
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return colorResolver.getComplementaryContainerOutline(dynamicPalette);
            }

            @Override
            public Color getAccentOnContainer() {
                return colorResolver.getAccentOnContainer(dynamicPalette);
            }
        };
    }
}
