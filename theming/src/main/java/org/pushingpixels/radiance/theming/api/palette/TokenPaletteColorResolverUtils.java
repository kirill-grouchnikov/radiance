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

import org.pushingpixels.ephemeral.chroma.palettes.TokenPalette;

import java.awt.*;
import java.util.function.Function;

public class TokenPaletteColorResolverUtils {
    public static TokenPaletteColorResolver getPaletteColorResolver() {
        return new TokenPaletteColorResolver() {
            @Override
            public Color getContainerSurfaceLowest(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerSurfaceLowest());
            }

            @Override
            public Color getContainerSurfaceLow(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerSurfaceLow());
            }

            @Override
            public Color getContainerSurface(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerSurface());
            }

            @Override
            public Color getContainerSurfaceHigh(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerSurfaceHigh());
            }

            @Override
            public Color getContainerSurfaceHighest(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerSurfaceHighest());
            }

            @Override
            public Color getContainerSurfaceDim(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerSurfaceDim());
            }

            @Override
            public Color getContainerSurfaceBright(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerSurfaceBright());
            }

            @Override
            public Color getOnContainer(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getOnContainer());
            }

            @Override
            public Color getOnContainerVariant(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getOnContainerVariant());
            }

            @Override
            public Color getContainerOutline(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerOutline());
            }

            @Override
            public Color getContainerOutlineVariant(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getContainerOutlineVariant());
            }

            @Override
            public float getContainerSurfaceDisabledAlpha(TokenPalette tokenPalette) {
                return 0.3f;
            }

            @Override
            public float getOnContainerDisabledAlpha(TokenPalette tokenPalette) {
                return 0.45f;
            }

            @Override
            public float getContainerOutlineDisabledAlpha(TokenPalette tokenPalette) {
                return 0.35f;
            }

            @Override
            public Color getInverseContainerSurface(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getInverseContainerSurface());
            }

            @Override
            public Color getInverseOnContainer(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getInverseOnContainer());
            }

            @Override
            public Color getInverseContainerOutline(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getInverseContainerOutline());
            }

            @Override
            public Color getComplementaryOnContainer(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getComplementaryOnContainer());
            }

            @Override
            public Color getComplementaryContainerOutline(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getComplementaryContainerOutline());
            }

            @Override
            public Color getAccentOnContainer(TokenPalette tokenPalette) {
                return new Color(tokenPalette.getAccentOnContainer());
            }
        };
    }
    
    public static TokenPaletteColorResolver overlayWith(TokenPaletteColorResolver original,
        TokenPaletteColorResolverOverlay overlay) {
        return new TokenPaletteColorResolver() {
            @Override
            public Color getContainerSurfaceLowest(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerSurfaceLowest();
                if (spec == null) {
                    return original.getContainerSurfaceLowest(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceLow(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerSurfaceLow();
                if (spec == null) {
                    return original.getContainerSurfaceLow(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getContainerSurface(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerSurface();
                if (spec == null) {
                    return original.getContainerSurface(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceHigh(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerSurfaceHigh();
                if (spec == null) {
                    return original.getContainerSurfaceHigh(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceHighest(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerSurfaceHighest();
                if (spec == null) {
                    return original.getContainerSurfaceHighest(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceDim(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerSurfaceDim();
                if (spec == null) {
                    return original.getContainerSurfaceDim(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getContainerSurfaceBright(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerSurfaceBright();
                if (spec == null) {
                    return original.getContainerSurfaceBright(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getOnContainer(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getOnContainer();
                if (spec == null) {
                    return original.getOnContainer(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getOnContainerVariant(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getOnContainerVariant();
                if (spec == null) {
                    return original.getOnContainerVariant(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getContainerOutline(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerOutline();
                if (spec == null) {
                    return original.getContainerOutline(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getContainerOutlineVariant(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getContainerOutlineVariant();
                if (spec == null) {
                    return original.getContainerOutlineVariant(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public float getContainerSurfaceDisabledAlpha(TokenPalette tokenPalette) {
                Function<TokenPalette, Float> spec = overlay.getContainerSurfaceDisabledAlpha();
                if (spec == null) {
                    return original.getContainerSurfaceDisabledAlpha(tokenPalette);
                } else {
                    return spec.apply(tokenPalette);
                }
            }

            @Override
            public float getOnContainerDisabledAlpha(TokenPalette tokenPalette) {
                Function<TokenPalette, Float> spec = overlay.getOnContainerDisabledAlpha();
                if (spec == null) {
                    return original.getOnContainerDisabledAlpha(tokenPalette);
                } else {
                    return spec.apply(tokenPalette);
                }
            }

            @Override
            public float getContainerOutlineDisabledAlpha(TokenPalette tokenPalette) {
                Function<TokenPalette, Float> spec = overlay.getContainerOutlineDisabledAlpha();
                if (spec == null) {
                    return original.getContainerOutlineDisabledAlpha(tokenPalette);
                } else {
                    return spec.apply(tokenPalette);
                }
            }

            @Override
            public Color getInverseContainerSurface(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getInverseContainerSurface();
                if (spec == null) {
                    return original.getInverseContainerSurface(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getInverseOnContainer(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getInverseOnContainer();
                if (spec == null) {
                    return original.getInverseOnContainer(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getInverseContainerOutline(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getInverseContainerOutline();
                if (spec == null) {
                    return original.getInverseContainerOutline(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getComplementaryOnContainer(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getComplementaryOnContainer();
                if (spec == null) {
                    return original.getComplementaryOnContainer(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getComplementaryContainerOutline(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getComplementaryContainerOutline();
                if (spec == null) {
                    return original.getComplementaryContainerOutline(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }

            @Override
            public Color getAccentOnContainer(TokenPalette tokenPalette) {
                Function<TokenPalette, Integer> spec = overlay.getAccentOnContainer();
                if (spec == null) {
                    return original.getAccentOnContainer(tokenPalette);
                } else {
                    return new Color(spec.apply(tokenPalette), true);
                }
            }
        };
    }
}
