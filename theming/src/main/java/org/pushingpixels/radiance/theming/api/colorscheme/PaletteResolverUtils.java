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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;

import java.awt.*;
import java.util.function.Function;

public class PaletteResolverUtils {
    public static PaletteContainerColorsResolver getPaletteTonalColorResolver() {
        PaletteContainerColorsResolver result =
            new PaletteContainerColorsResolver() {

                @Override
                public Color getContainerSurfaceLowest(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerSurfaceHighest());
                }

                @Override
                public Color getContainerSurfaceDim(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerSurfaceDim());
                }

                @Override
                public Color getContainerSurfaceBright(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerSurfaceBright());
                }

                @Override
                public Color getOnContainer(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getOnTonalContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getOnTonalContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getTonalContainerOutlineVariant());
                }

                @Override
                public float getContainerSurfaceDisabledAlpha(DynamicPalette dynamicPalette) {
                    return 0.3f;
                }

                @Override
                public float getOnContainerDisabledAlpha(DynamicPalette dynamicPalette) {
                    return 0.45f;
                }

                @Override
                public float getContainerOutlineDisabledAlpha(DynamicPalette dynamicPalette) {
                    return 0.35f;
                }

                @Override
                public Color getInverseContainerSurface(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getInverseTonalContainerSurface());
                }

                @Override
                public Color getInverseOnContainer(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getInverseOnTonalContainer());
                }

                @Override
                public Color getInverseContainerOutline(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getInverseTonalContainerOutline());
                }

                @Override
                public Color getComplementaryOnContainer(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getComplementaryOnTonalContainer());
                }

                @Override
                public Color getComplementaryContainerOutline(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getComplementaryTonalContainerOutline());
                }
            };
        return result;
    }
    
    public static PaletteContainerColorsResolver getPalettePrimaryColorResolver() {
        PaletteContainerColorsResolver result =
            new PaletteContainerColorsResolver() {

                @Override
                public Color getContainerSurfaceLowest(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerSurfaceHighest());
                }

                @Override
                public Color getContainerSurfaceDim(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerSurfaceDim());
                }

                @Override
                public Color getContainerSurfaceBright(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerSurfaceBright());
                }

                @Override
                public Color getOnContainer(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getOnPrimaryContainer());
                }

                @Override
                public Color getOnContainerVariant(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getOnPrimaryContainerVariant());
                }

                @Override
                public Color getContainerOutline(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerOutline());
                }

                @Override
                public Color getContainerOutlineVariant(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getPrimaryContainerOutlineVariant());
                }

                @Override
                public float getContainerSurfaceDisabledAlpha(DynamicPalette dynamicPalette) {
                    return 0.3f;
                }

                @Override
                public float getOnContainerDisabledAlpha(DynamicPalette dynamicPalette) {
                    return 0.45f;
                }

                @Override
                public float getContainerOutlineDisabledAlpha(DynamicPalette dynamicPalette) {
                    return 0.35f;
                }

                @Override
                public Color getInverseContainerSurface(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getInversePrimaryContainerSurface());
                }

                @Override
                public Color getInverseOnContainer(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getInverseOnPrimaryContainer());
                }

                @Override
                public Color getInverseContainerOutline(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getInversePrimaryContainerOutline());
                }

                @Override
                public Color getComplementaryOnContainer(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getComplementaryOnPrimaryContainer());
                }

                @Override
                public Color getComplementaryContainerOutline(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getComplementaryPrimaryContainerOutline());
                }
            };
        return result;
    }

    public static PaletteContainerColorsResolver overlayWith(PaletteContainerColorsResolver original,
        PaletteContainerColorsResolverOverlay overlay) {
        return new PaletteContainerColorsResolver() {

            @Override
            public Color getContainerSurfaceLowest(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerSurfaceLowest();
                if (spec == null) {
                    return original.getContainerSurfaceLowest(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceLow(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerSurfaceLow();
                if (spec == null) {
                    return original.getContainerSurfaceLow(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getContainerSurface(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerSurface();
                if (spec == null) {
                    return original.getContainerSurface(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceHigh(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerSurfaceHigh();
                if (spec == null) {
                    return original.getContainerSurfaceHigh(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceHighest(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerSurfaceHighest();
                if (spec == null) {
                    return original.getContainerSurfaceHighest(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceDim(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerSurfaceDim();
                if (spec == null) {
                    return original.getContainerSurfaceDim(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceBright(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerSurfaceBright();
                if (spec == null) {
                    return original.getContainerSurfaceBright(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getOnContainer(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getOnContainer();
                if (spec == null) {
                    return original.getOnContainer(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getOnContainerVariant(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getOnContainerVariant();
                if (spec == null) {
                    return original.getOnContainerVariant(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getContainerOutline(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerOutline();
                if (spec == null) {
                    return original.getContainerOutline(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getContainerOutlineVariant(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getContainerOutlineVariant();
                if (spec == null) {
                    return original.getContainerOutlineVariant(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public float getContainerSurfaceDisabledAlpha(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Float> spec = overlay.getContainerSurfaceDisabledAlpha();
                if (spec == null) {
                    return original.getContainerSurfaceDisabledAlpha(dynamicPalette);
                } else {
                    return spec.apply(dynamicPalette);
                }
            }

            @Override
            public float getOnContainerDisabledAlpha(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Float> spec = overlay.getOnContainerDisabledAlpha();
                if (spec == null) {
                    return original.getOnContainerDisabledAlpha(dynamicPalette);
                } else {
                    return spec.apply(dynamicPalette);
                }
            }

            @Override
            public float getContainerOutlineDisabledAlpha(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Float> spec = overlay.getContainerOutlineDisabledAlpha();
                if (spec == null) {
                    return original.getContainerOutlineDisabledAlpha(dynamicPalette);
                } else {
                    return spec.apply(dynamicPalette);
                }
            }

            @Override
            public Color getInverseContainerSurface(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getInverseContainerSurface();
                if (spec == null) {
                    return original.getInverseContainerSurface(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getInverseOnContainer(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getInverseOnContainer();
                if (spec == null) {
                    return original.getInverseOnContainer(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getInverseContainerOutline(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getInverseContainerOutline();
                if (spec == null) {
                    return original.getInverseContainerOutline(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getComplementaryOnContainer(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getComplementaryOnContainer();
                if (spec == null) {
                    return original.getComplementaryOnContainer(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getComplementaryContainerOutline(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getComplementaryContainerOutline();
                if (spec == null) {
                    return original.getComplementaryContainerOutline(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }
        };
    }
}
