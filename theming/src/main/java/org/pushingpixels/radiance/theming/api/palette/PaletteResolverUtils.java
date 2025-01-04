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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;

import java.awt.*;

public class PaletteResolverUtils {
   public static PaletteColorResolver getPaletteColorResolver2() {
        PaletteContainerColorsResolver neutralContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnNeutralContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnNeutralContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerOutlineVariant());
                }
            };

        PaletteContainerColorsResolver mutedContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnMutedContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnMutedContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerOutlineVariant());
                }
            };

        PaletteContainerColorsResolver tonalContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnTonalContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnTonalContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerOutlineVariant());
                }
            };

        PaletteContainerColorsResolver primaryContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnPrimaryContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnPrimaryContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerOutlineVariant());
                }
            };

        PaletteContainerColorsResolver systemInfoContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemInfoContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemInfoContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerOutlineVariant());
                }
            };

        PaletteContainerColorsResolver systemWarningContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemWarningContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemWarningContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerOutlineVariant());
                }
            };

        PaletteContainerColorsResolver systemErrorContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemErrorContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemErrorContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerOutlineVariant());
                }
            };

        PaletteContainerColorsResolver systemSuccessContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemSuccessContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemSuccessContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerOutlineVariant());
                }
            };

        PaletteContainerColorsResolver systemEmergencyContainerResolver =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getContainerLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerLowest());
                }

                @Override
                public Color getContainerLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerLow());
                }

                @Override
                public Color getContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainer());
                }

                @Override
                public Color getContainerHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerHigh());
                }

                @Override
                public Color getContainerHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerHighest());
                }

                @Override
                public Color getOnContainer(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemEmergencyContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getOnSystemEmergencyContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerOutlineVariant());
                }
            };

        return new PaletteColorResolver() {
            @Override
            public Color getSurface(DynamicScheme dynamicScheme) {
                return new Color(dynamicScheme.getSurface());
            }

            @Override
            public Color getSurfaceDim(DynamicScheme dynamicScheme) {
                return new Color(dynamicScheme.getSurfaceDim());
            }

            @Override
            public Color getSurfaceBright(DynamicScheme dynamicScheme) {
                return new Color(dynamicScheme.getSurfaceBright());
            }

            @Override
            public PaletteContainerColorsResolver getNeutralContainerResolver() {
                return neutralContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getMutedContainerResolver() {
                return mutedContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getTonalContainerResolver() {
                return tonalContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getPrimaryContainerResolver() {
                return primaryContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemInfoContainerResolver() {
                return systemInfoContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemWarningContainerResolver() {
                return systemWarningContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemErrorContainerResolver() {
                return systemErrorContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemSuccessContainerResolver() {
                return systemSuccessContainerResolver;
            }

            @Override
            public PaletteContainerColorsResolver getSystemEmergencyContainerResolver() {
                return systemEmergencyContainerResolver;
            }
        };
    }
}
