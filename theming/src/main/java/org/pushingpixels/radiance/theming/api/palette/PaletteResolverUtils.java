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

import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;

import java.awt.*;

public class PaletteResolverUtils {
    private interface PaletteSource {
        TonalPalette get(Palettes palettes);
    }

    private static PaletteContainerColorsResolver getLightTonalContainerResolver(PaletteSource source) {
        return new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(source.get(palettes).tone(89));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(source.get(palettes).tone(87));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(source.get(palettes).tone(85));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(source.get(palettes).tone(83));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(source.get(palettes).tone(81));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(source.get(palettes).tone(25));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(source.get(palettes).tone(35));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(source.get(palettes).tone(45));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(source.get(palettes).tone(65));
            }
        };
    }

    private static PaletteContainerColorsResolver getDarkTonalContainerResolver(PaletteSource source) {
        return new PaletteContainerColorsResolver() {
            @Override
            public Color getContainerLowest(Palettes palettes) {
                return new Color(source.get(palettes).tone(22));
            }

            @Override
            public Color getContainerLow(Palettes palettes) {
                return new Color(source.get(palettes).tone(28));
            }

            @Override
            public Color getContainer(Palettes palettes) {
                return new Color(source.get(palettes).tone(30));
            }

            @Override
            public Color getContainerHigh(Palettes palettes) {
                return new Color(source.get(palettes).tone(35));
            }

            @Override
            public Color getContainerHighest(Palettes palettes) {
                return new Color(source.get(palettes).tone(40));
            }

            @Override
            public Color getOnContainer(Palettes palettes) {
                return new Color(source.get(palettes).tone(90));
            }

            @Override
            public Color getOnContainerVariant(Palettes palettes) {
                return new Color(source.get(palettes).tone(80));
            }

            @Override
            public Color getContainerOutline(Palettes palettes) {
                return new Color(source.get(palettes).tone(60));
            }

            @Override
            public Color getContainerOutlineVariant(Palettes palettes) {
                return new Color(source.get(palettes).tone(40));
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
            getLightTonalContainerResolver(Palettes::getPrimaryPalette);

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
            getLightTonalContainerResolver(Palettes::getSystemInfoPalette);
        PaletteContainerColorsResolver systemWarningContainerResolver =
            getLightTonalContainerResolver(Palettes::getSystemWarningPalette);
        PaletteContainerColorsResolver systemErrorContainerResolver =
            getLightTonalContainerResolver(Palettes::getSystemErrorPalette);
        PaletteContainerColorsResolver systemSuccessContainerResolver =
            getLightTonalContainerResolver(Palettes::getSystemSuccessPalette);
        PaletteContainerColorsResolver systemEmergencyContainerResolver =
            getLightTonalContainerResolver(Palettes::getSystemEmergencyPalette);

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
            getDarkTonalContainerResolver(Palettes::getPrimaryPalette);

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
            getDarkTonalContainerResolver(Palettes::getSystemInfoPalette);
        PaletteContainerColorsResolver systemWarningContainerResolver =
            getDarkTonalContainerResolver(Palettes::getSystemWarningPalette);
        PaletteContainerColorsResolver systemErrorContainerResolver =
            getDarkTonalContainerResolver(Palettes::getSystemErrorPalette);
        PaletteContainerColorsResolver systemSuccessContainerResolver =
            getDarkTonalContainerResolver(Palettes::getSystemSuccessPalette);
        PaletteContainerColorsResolver systemEmergencyContainerResolver =
            getDarkTonalContainerResolver(Palettes::getSystemEmergencyPalette);
        
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
