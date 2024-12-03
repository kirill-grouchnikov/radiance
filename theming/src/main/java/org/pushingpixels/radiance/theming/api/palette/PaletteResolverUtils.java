/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import java.awt.*;

public class PaletteResolverUtils {
    private static PaletteContainerColorsResolver getLightTonalPaletteColorResolver() {
        return new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(94));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(92));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(90));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(88));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(86));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(30));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(40));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(70));
            }
        };
    }

    public static PaletteColorResolver getLightPaletteColorResolver() {
        PaletteContainerColorsResolver surfaceContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(100));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(96));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(94));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(92));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(90));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(10));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(30));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(70));
            }
        };
        PaletteContainerColorsResolver mutedContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(94));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(90));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(88));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(86));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(84));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(10));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(30));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(70));
            }
        };
        PaletteContainerColorsResolver tonalContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(94));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(92));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(90));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(88));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(86));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(30));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(40));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(70));
            }
        };
        PaletteContainerColorsResolver primaryContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(34));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(38));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(40));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(45));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(50));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(100));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(95));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(100));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(95));
            }
        };

        PaletteContainerColorsResolver systemInfoContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(94));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(92));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(90));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(88));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(86));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(30));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(40));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(70));
            }
        };
        PaletteContainerColorsResolver systemWarningContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(94));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(92));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(90));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(88));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(86));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(30));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(40));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(70));
            }
        };
        PaletteContainerColorsResolver systemErrorContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(94));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(92));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(90));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(88));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(86));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(30));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(40));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(70));
            }
        };
        PaletteContainerColorsResolver systemSuccessContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(94));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(92));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(90));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(88));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(86));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(30));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(40));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(70));
            }
        };
        PaletteContainerColorsResolver systemEmergencyContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(94));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(92));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(90));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(88));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(86));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(30));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(40));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(50));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(70));
            }
        };

        return new PaletteColorResolver() {
            @Override
            public Color getSurface(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(99));
            }

            @Override
            public Color getSurfaceDim(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(87));
            }

            @Override
            public Color getSurfaceBright(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(98));
            }

            @Override
            public PaletteContainerColorsResolver getSurfaceContainerResolver(Palettes palettes) {
                return surfaceContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getMutedContainerResolver(Palettes palettes) {
                return mutedContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getTonalContainerResolver(Palettes palettes) {
                return tonalContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getPrimaryContainerResolver(Palettes palettes) {
                return primaryContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemInfoContainerResolver(Palettes palettes) {
                return systemInfoContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemWarningContainerResolver(Palettes palettes) {
                return systemWarningContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemErrorContainerResolver(Palettes palettes) {
                return systemErrorContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemSuccessContainerResolver(Palettes palettes) {
                return systemSuccessContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemEmergencyContainerResolver(Palettes palettes) {
                return systemEmergencyContainerResolver;
            }
        };
    }

    public static PaletteColorResolver getDarkPaletteColorResolver() {
        PaletteContainerColorsResolver surfaceContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(4));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(10));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(12));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(17));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(22));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(40));
            }
        };
        PaletteContainerColorsResolver mutedContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(12));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(16));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(18));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(23));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(28));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getNeutralVariantPalette().tone(40));
            }
        };
        PaletteContainerColorsResolver tonalContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(22));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(28));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(30));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(35));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(40));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(40));
            }
        };
        PaletteContainerColorsResolver primaryContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(88));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(82));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(80));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(76));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(74));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(20));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(30));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(30));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getPrimaryPalette().tone(50));
            }
        };

        PaletteContainerColorsResolver systemInfoContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(22));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(28));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(30));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(35));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(40));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemInfoPalette().tone(40));
            }
        };
        PaletteContainerColorsResolver systemWarningContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(22));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(28));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(30));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(35));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(40));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemWarningPalette().tone(40));
            }
        };
        PaletteContainerColorsResolver systemErrorContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(22));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(28));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(30));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(35));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(40));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemErrorPalette().tone(40));
            }
        };
        PaletteContainerColorsResolver systemSuccessContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(22));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(28));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(30));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(35));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(40));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemSuccessPalette().tone(40));
            }
        };
        PaletteContainerColorsResolver systemEmergencyContainerResolver =
            new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(22));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(28));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(30));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(35));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(40));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(palettes.getSystemEmergencyPalette().tone(40));
            }
        };

        return new PaletteColorResolver() {
            @Override
            public Color getSurface(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(6));
            }

            @Override
            public Color getSurfaceDim(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(6));
            }

            @Override
            public Color getSurfaceBright(Palettes palettes) {
                return new Color(palettes.getNeutralPalette().tone(24));
            }

            @Override
            public PaletteContainerColorsResolver getSurfaceContainerResolver(Palettes palettes) {
                return surfaceContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getMutedContainerResolver(Palettes palettes) {
                return mutedContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getTonalContainerResolver(Palettes palettes) {
                return tonalContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getPrimaryContainerResolver(Palettes palettes) {
                return primaryContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemInfoContainerResolver(Palettes palettes) {
                return systemInfoContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemWarningContainerResolver(Palettes palettes) {
                return systemWarningContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemErrorContainerResolver(Palettes palettes) {
                return systemErrorContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemSuccessContainerResolver(Palettes palettes) {
                return systemSuccessContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemEmergencyContainerResolver(Palettes palettes) {
                return systemEmergencyContainerResolver;
            }
        };
    }
}
