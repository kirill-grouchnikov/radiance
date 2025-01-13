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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;

import java.awt.*;
import java.util.function.Function;

public class PaletteResolverUtils {
   public static PaletteContainerColorsResolver getPaletteTonalColorResolver() {
       PaletteContainerColorsResolver result =
            new PaletteContainerColorsResolver() {
                @Override
                public Color getSurface(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getSurface());
                }

                @Override
                public Color getSurfaceBright(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getSurfaceBright());
                }

                @Override
                public Color getSurfaceDim(DynamicPalette dynamicPalette) {
                    return new Color(dynamicPalette.getSurfaceDim());
                }

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
            };
        return result;
    }

    public static PaletteContainerColorsResolver overlayWith(PaletteContainerColorsResolver original,
        PaletteContainerColorsResolverOverlay overlay) {
        return new PaletteContainerColorsResolver() {
            @Override
            public Color getSurface(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getSurface();
                if (spec == null) {
                    return original.getSurface(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getSurfaceDim(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getSurfaceDim();
                if (spec == null) {
                    return original.getSurfaceDim(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

            @Override
            public Color getSurfaceBright(DynamicPalette dynamicPalette) {
                Function<DynamicPalette, Integer> spec = overlay.getSurfaceBright();
                if (spec == null) {
                    return original.getSurfaceBright(dynamicPalette);
                } else {
                    return new Color(spec.apply(dynamicPalette), true);
                }
            }

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
        };
    }
}
