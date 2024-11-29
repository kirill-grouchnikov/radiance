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

import org.pushingpixels.radiance.theming.api.ComponentState;

import java.awt.*;

public class ColorSchemeUtils {
    public static RadianceColorScheme2 getLightColorScheme(Palettes palettes) {
        PaletteColorResolver paletteColorResolver =
                PaletteResolverUtils.getLightPaletteColorResolver();

        PaletteContainerColorsResolver surfaceContainerColorResolver =
                paletteColorResolver.getSurfaceContainerResolver(palettes);
        ContainerRenderColorTokens surfaceContainerTokens = new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return surfaceContainerColorResolver.getContainerLowest(palettes);
                    }

                    @Override
                    public Color getContainerLow() {
                        return surfaceContainerColorResolver.getContainerLow(palettes);
                    }

                    @Override
                    public Color getContainer() {
                        return surfaceContainerColorResolver.getContainer(palettes);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return surfaceContainerColorResolver.getContainerHigh(palettes);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return surfaceContainerColorResolver.getContainerHighest(palettes);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return surfaceContainerColorResolver.getOnContainer(palettes);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return surfaceContainerColorResolver.getOnContainerVariant(palettes);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return surfaceContainerColorResolver.getContainerOutline(palettes);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return surfaceContainerColorResolver.getContainerOutlineVariant(palettes);
                    }
                };
            }
        };

        PaletteContainerColorsResolver mutedContainerColorResolver =
                paletteColorResolver.getMutedContainerResolver(palettes);
        ContainerRenderColorTokens mutedContainerTokens = new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return mutedContainerColorResolver.getContainerLowest(palettes);
                    }

                    @Override
                    public Color getContainerLow() {
                        return mutedContainerColorResolver.getContainerLow(palettes);
                    }

                    @Override
                    public Color getContainer() {
                        return mutedContainerColorResolver.getContainer(palettes);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return mutedContainerColorResolver.getContainerHigh(palettes);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return mutedContainerColorResolver.getContainerHighest(palettes);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return mutedContainerColorResolver.getOnContainer(palettes);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return mutedContainerColorResolver.getOnContainerVariant(palettes);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return mutedContainerColorResolver.getContainerOutline(palettes);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return mutedContainerColorResolver.getContainerOutlineVariant(palettes);
                    }
                };
            }
        };

        PaletteContainerColorsResolver tonalContainerColorResolver =
                paletteColorResolver.getTonalContainerResolver(palettes);
        ContainerRenderColorTokens tonalContainerTokens = new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return tonalContainerColorResolver.getContainerLowest(palettes);
                    }

                    @Override
                    public Color getContainerLow() {
                        return tonalContainerColorResolver.getContainerLow(palettes);
                    }

                    @Override
                    public Color getContainer() {
                        return tonalContainerColorResolver.getContainer(palettes);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return tonalContainerColorResolver.getContainerHigh(palettes);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return tonalContainerColorResolver.getContainerHighest(palettes);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return tonalContainerColorResolver.getOnContainer(palettes);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return tonalContainerColorResolver.getOnContainerVariant(palettes);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return tonalContainerColorResolver.getContainerOutline(palettes);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return tonalContainerColorResolver.getContainerOutlineVariant(palettes);
                    }
                };
            }
        };

        PaletteContainerColorsResolver primaryContainerColorResolver =
                paletteColorResolver.getPrimaryContainerResolver(palettes);
        ContainerRenderColorTokens primaryContainerTokens = new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return primaryContainerColorResolver.getContainerLowest(palettes);
                    }

                    @Override
                    public Color getContainerLow() {
                        return primaryContainerColorResolver.getContainerLow(palettes);
                    }

                    @Override
                    public Color getContainer() {
                        return primaryContainerColorResolver.getContainer(palettes);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return primaryContainerColorResolver.getContainerHigh(palettes);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return primaryContainerColorResolver.getContainerHighest(palettes);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return primaryContainerColorResolver.getOnContainer(palettes);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return primaryContainerColorResolver.getOnContainerVariant(palettes);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return primaryContainerColorResolver.getContainerOutline(palettes);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return primaryContainerColorResolver.getContainerOutlineVariant(palettes);
                    }
                };
            }
        };

        return new RadianceColorScheme2() {
            @Override
            public Color getSurface() {
                return paletteColorResolver.getSurface(palettes);
            }

            @Override
            public Color getSurfaceDim() {
                return paletteColorResolver.getSurfaceDim(palettes);
            }

            @Override
            public Color getSurfaceBright() {
                return paletteColorResolver.getSurfaceBright(palettes);
            }

            @Override
            public ContainerRenderColorTokens getSurfaceContainerTokens() {
                return surfaceContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getMutedContainerTokens() {
                return mutedContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getTonalContainerTokens() {
                return tonalContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getPrimaryContainerTokens() {
                return primaryContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getStateRenderTokens(ComponentState componentState) {
                return null;
            }
        };
    }

    public static RadianceColorScheme2 getDarkColorScheme(Palettes palettes) {
        PaletteColorResolver paletteColorResolver =
                PaletteResolverUtils.getDarkPaletteColorResolver();

        PaletteContainerColorsResolver surfaceContainerColorResolver =
                paletteColorResolver.getSurfaceContainerResolver(palettes);
        ContainerRenderColorTokens surfaceContainerTokens = new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return surfaceContainerColorResolver.getContainerLowest(palettes);
                    }

                    @Override
                    public Color getContainerLow() {
                        return surfaceContainerColorResolver.getContainerLow(palettes);
                    }

                    @Override
                    public Color getContainer() {
                        return surfaceContainerColorResolver.getContainer(palettes);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return surfaceContainerColorResolver.getContainerHigh(palettes);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return surfaceContainerColorResolver.getContainerHighest(palettes);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return surfaceContainerColorResolver.getOnContainer(palettes);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return surfaceContainerColorResolver.getOnContainerVariant(palettes);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return surfaceContainerColorResolver.getContainerOutline(palettes);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return surfaceContainerColorResolver.getContainerOutlineVariant(palettes);
                    }
                };
            }
        };

        PaletteContainerColorsResolver mutedContainerColorResolver =
                paletteColorResolver.getMutedContainerResolver(palettes);
        ContainerRenderColorTokens mutedContainerTokens = new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return mutedContainerColorResolver.getContainerLowest(palettes);
                    }

                    @Override
                    public Color getContainerLow() {
                        return mutedContainerColorResolver.getContainerLow(palettes);
                    }

                    @Override
                    public Color getContainer() {
                        return mutedContainerColorResolver.getContainer(palettes);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return mutedContainerColorResolver.getContainerHigh(palettes);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return mutedContainerColorResolver.getContainerHighest(palettes);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return mutedContainerColorResolver.getOnContainer(palettes);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return mutedContainerColorResolver.getOnContainerVariant(palettes);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return mutedContainerColorResolver.getContainerOutline(palettes);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return mutedContainerColorResolver.getContainerOutlineVariant(palettes);
                    }
                };
            }
        };

        PaletteContainerColorsResolver tonalContainerColorResolver =
                paletteColorResolver.getTonalContainerResolver(palettes);
        ContainerRenderColorTokens tonalContainerTokens = new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return tonalContainerColorResolver.getContainerLowest(palettes);
                    }

                    @Override
                    public Color getContainerLow() {
                        return tonalContainerColorResolver.getContainerLow(palettes);
                    }

                    @Override
                    public Color getContainer() {
                        return tonalContainerColorResolver.getContainer(palettes);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return tonalContainerColorResolver.getContainerHigh(palettes);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return tonalContainerColorResolver.getContainerHighest(palettes);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return tonalContainerColorResolver.getOnContainer(palettes);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return tonalContainerColorResolver.getOnContainerVariant(palettes);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return tonalContainerColorResolver.getContainerOutline(palettes);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return tonalContainerColorResolver.getContainerOutlineVariant(palettes);
                    }
                };
            }
        };

        PaletteContainerColorsResolver primaryContainerColorResolver =
                paletteColorResolver.getPrimaryContainerResolver(palettes);
        ContainerRenderColorTokens primaryContainerTokens = new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return primaryContainerColorResolver.getContainerLowest(palettes);
                    }

                    @Override
                    public Color getContainerLow() {
                        return primaryContainerColorResolver.getContainerLow(palettes);
                    }

                    @Override
                    public Color getContainer() {
                        return primaryContainerColorResolver.getContainer(palettes);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return primaryContainerColorResolver.getContainerHigh(palettes);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return primaryContainerColorResolver.getContainerHighest(palettes);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return primaryContainerColorResolver.getOnContainer(palettes);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return primaryContainerColorResolver.getOnContainerVariant(palettes);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return primaryContainerColorResolver.getContainerOutline(palettes);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return primaryContainerColorResolver.getContainerOutlineVariant(palettes);
                    }
                };
            }
        };

        return new RadianceColorScheme2() {
            @Override
            public Color getSurface() {
                return paletteColorResolver.getSurface(palettes);
            }

            @Override
            public Color getSurfaceDim() {
                return paletteColorResolver.getSurfaceDim(palettes);
            }

            @Override
            public Color getSurfaceBright() {
                return paletteColorResolver.getSurfaceBright(palettes);
            }

            @Override
            public ContainerRenderColorTokens getSurfaceContainerTokens() {
                return surfaceContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getMutedContainerTokens() {
                return mutedContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getTonalContainerTokens() {
                return tonalContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getPrimaryContainerTokens() {
                return primaryContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getStateRenderTokens(ComponentState componentState) {
                return null;
            }
        };
    }
}
