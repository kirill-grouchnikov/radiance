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
import java.util.function.Function;

public class SchemeResolverUtils {
   public static SchemeColorResolver getSchemeColorResolver() {
        SchemeContainerColorsResolver neutralContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getNeutralContainerSurfaceHighest());
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

        SchemeContainerColorsResolver mutedContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getMutedContainerSurfaceHighest());
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

        SchemeContainerColorsResolver tonalContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getTonalContainerSurfaceHighest());
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

        SchemeContainerColorsResolver primaryContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getPrimaryContainerSurfaceHighest());
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

        SchemeContainerColorsResolver systemInfoContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemInfoContainerSurfaceHighest());
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

        SchemeContainerColorsResolver systemWarningContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemWarningContainerSurfaceHighest());
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

        SchemeContainerColorsResolver systemErrorContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemErrorContainerSurfaceHighest());
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

        SchemeContainerColorsResolver systemSuccessContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemSuccessContainerSurfaceHighest());
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

        SchemeContainerColorsResolver systemEmergencyContainerResolver =
            new SchemeContainerColorsResolver() {
                @Override
                public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerSurfaceLowest());
                }

                @Override
                public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerSurfaceLow());
                }

                @Override
                public Color getContainerSurface(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerSurface());
                }

                @Override
                public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerSurfaceHigh());
                }

                @Override
                public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
                    return new Color(dynamicScheme.getSystemEmergencyContainerSurfaceHighest());
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

        return new SchemeColorResolver() {
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
            public SchemeContainerColorsResolver getNeutralContainerResolver() {
                return neutralContainerResolver;
            }

            @Override
            public SchemeContainerColorsResolver getMutedContainerResolver() {
                return mutedContainerResolver;
            }

            @Override
            public SchemeContainerColorsResolver getTonalContainerResolver() {
                return tonalContainerResolver;
            }

            @Override
            public SchemeContainerColorsResolver getPrimaryContainerResolver() {
                return primaryContainerResolver;
            }

            @Override
            public SchemeContainerColorsResolver getSystemInfoContainerResolver() {
                return systemInfoContainerResolver;
            }

            @Override
            public SchemeContainerColorsResolver getSystemWarningContainerResolver() {
                return systemWarningContainerResolver;
            }

            @Override
            public SchemeContainerColorsResolver getSystemErrorContainerResolver() {
                return systemErrorContainerResolver;
            }

            @Override
            public SchemeContainerColorsResolver getSystemSuccessContainerResolver() {
                return systemSuccessContainerResolver;
            }

            @Override
            public SchemeContainerColorsResolver getSystemEmergencyContainerResolver() {
                return systemEmergencyContainerResolver;
            }
        };
    }

    public static SchemeContainerColorsResolver overlayWith(SchemeContainerColorsResolver original,
        SchemeContainerColorsResolverOverlay overlay) {
       return new SchemeContainerColorsResolver() {
           @Override
           public Color getContainerSurfaceLowest(DynamicScheme dynamicScheme) {
               return original.getContainerSurfaceLowest(dynamicScheme);
           }

           @Override
           public Color getContainerSurfaceLow(DynamicScheme dynamicScheme) {
               return original.getContainerSurfaceLow(dynamicScheme);
           }

           @Override
           public Color getContainerSurface(DynamicScheme dynamicScheme) {
               return original.getContainerSurface(dynamicScheme);
           }

           @Override
           public Color getContainerSurfaceHigh(DynamicScheme dynamicScheme) {
               return original.getContainerSurfaceHigh(dynamicScheme);
           }

           @Override
           public Color getContainerSurfaceHighest(DynamicScheme dynamicScheme) {
               return original.getContainerSurfaceHighest(dynamicScheme);
           }

           @Override
           public Color getOnContainer(DynamicScheme dynamicScheme) {
               return original.getOnContainer(dynamicScheme);
           }

           @Override
           public Color getOnContainerVariant(DynamicScheme dynamicScheme) {
               return original.getOnContainerVariant(dynamicScheme);
           }

           @Override
           public Color getContainerOutline(DynamicScheme dynamicScheme) {
               Function<DynamicScheme, Integer> spec = overlay.getContainerOutline();
               if (spec == null) {
                   return original.getContainerOutline(dynamicScheme);
               } else {
                   return new Color(spec.apply(dynamicScheme));
               }
           }

           @Override
           public Color getContainerOutlineVariant(DynamicScheme dynamicScheme) {
               Function<DynamicScheme, Integer> spec = overlay.getContainerOutlineVariant();
               if (spec == null) {
                   return original.getContainerOutlineVariant(dynamicScheme);
               } else {
                   return new Color(spec.apply(dynamicScheme));
               }
           }
       };
    }

    public static SchemeColorResolver overlayWith(SchemeColorResolver original,
        SchemeColorResolverOverlay overlay) {
       return new SchemeColorResolver() {
           @Override
           public Color getSurface(DynamicScheme dynamicScheme) {
               return original.getSurface(dynamicScheme);
           }

           @Override
           public Color getSurfaceDim(DynamicScheme dynamicScheme) {
               return original.getSurfaceDim(dynamicScheme);
           }

           @Override
           public Color getSurfaceBright(DynamicScheme dynamicScheme) {
               return original.getSurfaceBright(dynamicScheme);
           }

           @Override
           public SchemeContainerColorsResolver getNeutralContainerResolver() {
               return original.getNeutralContainerResolver();
           }

           @Override
           public SchemeContainerColorsResolver getMutedContainerResolver() {
               SchemeContainerColorsResolverOverlay spec =
                   overlay.getMutedContainerResolverOverlay();
               if (spec == null) {
                   return original.getMutedContainerResolver();
               } else {
                   return SchemeResolverUtils.overlayWith(
                       original.getMutedContainerResolver(), spec);
               }
           }

           @Override
           public SchemeContainerColorsResolver getTonalContainerResolver() {
               return original.getTonalContainerResolver();
           }

           @Override
           public SchemeContainerColorsResolver getPrimaryContainerResolver() {
               return original.getPrimaryContainerResolver();
           }

           @Override
           public SchemeContainerColorsResolver getSystemInfoContainerResolver() {
               return original.getSystemInfoContainerResolver();
           }

           @Override
           public SchemeContainerColorsResolver getSystemWarningContainerResolver() {
               return original.getSystemWarningContainerResolver();
           }

           @Override
           public SchemeContainerColorsResolver getSystemErrorContainerResolver() {
               return original.getSystemErrorContainerResolver();
           }

           @Override
           public SchemeContainerColorsResolver getSystemSuccessContainerResolver() {
               return original.getSystemSuccessContainerResolver();
           }

           @Override
           public SchemeContainerColorsResolver getSystemEmergencyContainerResolver() {
               return original.getSystemEmergencyContainerResolver();
           }
       };
    }
}
