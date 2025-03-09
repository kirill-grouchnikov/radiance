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
package org.pushingpixels.radiance.theming.api.colorscheme;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;

import java.awt.*;
import java.util.function.Function;

public class BimodalPaletteResolverUtils {
    public static BimodalPaletteContainerColorsResolver getBimodalPaletteTonalColorResolver() {
        BimodalPaletteContainerColorsResolver result =
            new BimodalPaletteContainerColorsResolver() {

                @Override
                public Color getContainerSurfaceLowest(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerSurfaceHighest());
                }

                @Override
                public Color getContainerSurfaceDim(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerSurfaceDim());
                }

                @Override
                public Color getContainerSurfaceBright(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerSurfaceBright());
                }

                @Override
                public Color getOnContainer(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getOnContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getOnContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getContainerOutlineVariant());
                }

                @Override
                public float getContainerSurfaceDisabledAlpha(DynamicBimodalPalette dynamicBimodalPalette) {
                    return 0.3f;
                }

                @Override
                public float getOnContainerDisabledAlpha(DynamicBimodalPalette dynamicBimodalPalette) {
                    return 0.45f;
                }

                @Override
                public float getContainerOutlineDisabledAlpha(DynamicBimodalPalette dynamicBimodalPalette) {
                    return 0.35f;
                }

                @Override
                public Color getInverseContainerSurface(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getInverseContainerSurface());
                }

                @Override
                public Color getInverseOnContainer(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getInverseOnContainer());
                }

                @Override
                public Color getInverseContainerOutline(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getInverseContainerOutline());
                }

                @Override
                public Color getComplementaryOnContainer(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getComplementaryOnContainer());
                }

                @Override
                public Color getComplementaryContainerOutline(DynamicBimodalPalette dynamicBimodalPalette) {
                    return new Color(dynamicBimodalPalette.getComplementaryContainerOutline());
                }
            };
        return result;
    }

    public static BimodalPaletteContainerColorsResolver overlayWith(
        BimodalPaletteContainerColorsResolver original,
        BimodalPaletteContainerColorsResolverOverlay overlay) {
        return new BimodalPaletteContainerColorsResolver() {

            @Override
            public Color getContainerSurfaceLowest(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerSurfaceLowest();
                if (spec == null) {
                    return original.getContainerSurfaceLowest(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceLow(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerSurfaceLow();
                if (spec == null) {
                    return original.getContainerSurfaceLow(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getContainerSurface(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerSurface();
                if (spec == null) {
                    return original.getContainerSurface(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceHigh(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerSurfaceHigh();
                if (spec == null) {
                    return original.getContainerSurfaceHigh(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceHighest(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerSurfaceHighest();
                if (spec == null) {
                    return original.getContainerSurfaceHighest(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceDim(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerSurfaceDim();
                if (spec == null) {
                    return original.getContainerSurfaceDim(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceBright(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerSurfaceBright();
                if (spec == null) {
                    return original.getContainerSurfaceBright(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getOnContainer(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getOnContainer();
                if (spec == null) {
                    return original.getOnContainer(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getOnContainerVariant(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getOnContainerVariant();
                if (spec == null) {
                    return original.getOnContainerVariant(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getContainerOutline(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerOutline();
                if (spec == null) {
                    return original.getContainerOutline(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getContainerOutlineVariant(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getContainerOutlineVariant();
                if (spec == null) {
                    return original.getContainerOutlineVariant(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public float getContainerSurfaceDisabledAlpha(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Float> spec = overlay.getContainerSurfaceDisabledAlpha();
                if (spec == null) {
                    return original.getContainerSurfaceDisabledAlpha(dynamicBimodalPalette);
                } else {
                    return spec.apply(dynamicBimodalPalette);
                }
            }

            @Override
            public float getOnContainerDisabledAlpha(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Float> spec = overlay.getOnContainerDisabledAlpha();
                if (spec == null) {
                    return original.getOnContainerDisabledAlpha(dynamicBimodalPalette);
                } else {
                    return spec.apply(dynamicBimodalPalette);
                }
            }

            @Override
            public float getContainerOutlineDisabledAlpha(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Float> spec = overlay.getContainerOutlineDisabledAlpha();
                if (spec == null) {
                    return original.getContainerOutlineDisabledAlpha(dynamicBimodalPalette);
                } else {
                    return spec.apply(dynamicBimodalPalette);
                }
            }

            @Override
            public Color getInverseContainerSurface(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getInverseContainerSurface();
                if (spec == null) {
                    return original.getInverseContainerSurface(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getInverseOnContainer(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getInverseOnContainer();
                if (spec == null) {
                    return original.getInverseOnContainer(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getInverseContainerOutline(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getInverseContainerOutline();
                if (spec == null) {
                    return original.getInverseContainerOutline(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getComplementaryOnContainer(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getComplementaryOnContainer();
                if (spec == null) {
                    return original.getComplementaryOnContainer(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }

            @Override
            public Color getComplementaryContainerOutline(DynamicBimodalPalette dynamicBimodalPalette) {
                Function<DynamicBimodalPalette,Integer> spec = overlay.getComplementaryContainerOutline();
                if (spec == null) {
                    return original.getComplementaryContainerOutline(dynamicBimodalPalette);
                } else {
                    return new Color(spec.apply(dynamicBimodalPalette), true);
                }
            }
        };
    }
}
