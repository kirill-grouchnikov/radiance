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
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;
import java.util.HashMap;

public class ColorSchemeUtils {
    private static ContainerRenderColorTokens getContainerRenderColorTokens(
        Palettes palettes, PaletteContainerColorsResolver tonalContainerColorResolver) {

        return new ContainerRenderColorTokens() {
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
    }

    public static RadianceColorScheme2 getLightColorScheme(Palettes palettes) {
        PaletteColorResolver paletteColorResolver =
                PaletteResolverUtils.getLightPaletteColorResolver();

        PaletteContainerColorsResolver surfaceContainerColorResolver =
                paletteColorResolver.getSurfaceContainerResolver(palettes);
        ContainerRenderColorTokens surfaceContainerTokens = getContainerRenderColorTokens(
            palettes, surfaceContainerColorResolver);

        PaletteContainerColorsResolver mutedContainerColorResolver =
                paletteColorResolver.getMutedContainerResolver(palettes);
        ContainerRenderColorTokens mutedContainerTokens = getContainerRenderColorTokens(
            palettes, mutedContainerColorResolver);

        PaletteContainerColorsResolver tonalContainerColorResolver =
                paletteColorResolver.getTonalContainerResolver(palettes);
        ContainerRenderColorTokens tonalContainerTokens = getContainerRenderColorTokens(
            palettes, tonalContainerColorResolver);

        PaletteContainerColorsResolver primaryContainerColorResolver =
                paletteColorResolver.getPrimaryContainerResolver(palettes);
        ContainerRenderColorTokens primaryContainerTokens = getContainerRenderColorTokens(
            palettes, primaryContainerColorResolver);

        PaletteContainerColorsResolver systemInfoContainerColorResolver =
            paletteColorResolver.getSystemInfoContainerResolver(palettes);
        ContainerRenderColorTokens systemInfoContainerTokens = getContainerRenderColorTokens(
            palettes, systemInfoContainerColorResolver);

        PaletteContainerColorsResolver systemWarningContainerColorResolver =
            paletteColorResolver.getSystemWarningContainerResolver(palettes);
        ContainerRenderColorTokens systemWarningContainerTokens = getContainerRenderColorTokens(
            palettes, systemWarningContainerColorResolver);

        PaletteContainerColorsResolver systemErrorContainerColorResolver =
            paletteColorResolver.getSystemErrorContainerResolver(palettes);
        ContainerRenderColorTokens systemErrorContainerTokens = getContainerRenderColorTokens(
            palettes, systemErrorContainerColorResolver);

        PaletteContainerColorsResolver systemSuccessContainerColorResolver =
            paletteColorResolver.getSystemSuccessContainerResolver(palettes);
        ContainerRenderColorTokens systemSuccessContainerTokens = getContainerRenderColorTokens(
            palettes, systemSuccessContainerColorResolver);

        PaletteContainerColorsResolver systemEmergencyContainerColorResolver =
            paletteColorResolver.getSystemEmergencyContainerResolver(palettes);
        ContainerRenderColorTokens systemEmergencyContainerTokens = getContainerRenderColorTokens(
            palettes, systemEmergencyContainerColorResolver);

        return new RadianceColorScheme2() {
            private HashMap<ComponentState, ContainerRenderColorTokens> stateTokens = new HashMap<>();

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
                if (componentState.isDisabled()) {
                    // TODO: TONAL - finalize this
                    return getStateRenderTokens(componentState.getEnabledMatch());
                }

                // TODO: TONAL - configurable at the skin definition level
                ContainerRenderColorTokens defaultActive = this.getTonalContainerTokens();
                if ((componentState == ComponentState.PRESSED_UNSELECTED) ||
                    (componentState == ComponentState.ARMED)) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getPressedUnselectedTokens(this,
                            defaultActive));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.PRESSED_SELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getPressedSelectedTokens(this,
                            defaultActive));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.SELECTED) {
                    return defaultActive;
                }
                if (componentState == ComponentState.ROLLOVER_UNSELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getRolloverUnselectedTokens(this,
                            getMutedContainerTokens()));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.ROLLOVER_SELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getRolloverSelectedTokens(this,
                            defaultActive));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.ROLLOVER_ARMED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getRolloverArmedTokens(this,
                            defaultActive));
                    }
                    return stateTokens.get(componentState);
                }

                ComponentState hardFallback = componentState.getHardFallback();
                if (hardFallback != null) {
                    return this.getStateRenderTokens(hardFallback);
                }

                if (componentState == ComponentState.ENABLED) {
                    return getMutedContainerTokens();
                }
                return defaultActive;
            }

            @Override
            public ContainerRenderColorTokens getSystemInfoContainerTokens() {
                return systemInfoContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getSystemWarningContainerTokens() {
                return systemWarningContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getSystemErrorContainerTokens() {
                return systemErrorContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getSystemSuccessContainerTokens() {
                return systemSuccessContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getSystemEmergencyContainerTokens() {
                return systemEmergencyContainerTokens;
            }
        };
    }

    public static RadianceColorScheme2 getDarkColorScheme(Palettes palettes) {
        PaletteColorResolver paletteColorResolver =
                PaletteResolverUtils.getDarkPaletteColorResolver();

        PaletteContainerColorsResolver surfaceContainerColorResolver =
            paletteColorResolver.getSurfaceContainerResolver(palettes);
        ContainerRenderColorTokens surfaceContainerTokens = getContainerRenderColorTokens(
            palettes, surfaceContainerColorResolver);

        PaletteContainerColorsResolver mutedContainerColorResolver =
            paletteColorResolver.getMutedContainerResolver(palettes);
        ContainerRenderColorTokens mutedContainerTokens = getContainerRenderColorTokens(
            palettes, mutedContainerColorResolver);

        PaletteContainerColorsResolver tonalContainerColorResolver =
            paletteColorResolver.getTonalContainerResolver(palettes);
        ContainerRenderColorTokens tonalContainerTokens = getContainerRenderColorTokens(
            palettes, tonalContainerColorResolver);

        PaletteContainerColorsResolver primaryContainerColorResolver =
            paletteColorResolver.getPrimaryContainerResolver(palettes);
        ContainerRenderColorTokens primaryContainerTokens = getContainerRenderColorTokens(
            palettes, primaryContainerColorResolver);

        PaletteContainerColorsResolver systemInfoContainerColorResolver =
            paletteColorResolver.getSystemInfoContainerResolver(palettes);
        ContainerRenderColorTokens systemInfoContainerTokens = getContainerRenderColorTokens(
            palettes, systemInfoContainerColorResolver);

        PaletteContainerColorsResolver systemWarningContainerColorResolver =
            paletteColorResolver.getSystemWarningContainerResolver(palettes);
        ContainerRenderColorTokens systemWarningContainerTokens = getContainerRenderColorTokens(
            palettes, systemWarningContainerColorResolver);

        PaletteContainerColorsResolver systemErrorContainerColorResolver =
            paletteColorResolver.getSystemErrorContainerResolver(palettes);
        ContainerRenderColorTokens systemErrorContainerTokens = getContainerRenderColorTokens(
            palettes, systemErrorContainerColorResolver);

        PaletteContainerColorsResolver systemSuccessContainerColorResolver =
            paletteColorResolver.getSystemSuccessContainerResolver(palettes);
        ContainerRenderColorTokens systemSuccessContainerTokens = getContainerRenderColorTokens(
            palettes, systemSuccessContainerColorResolver);

        PaletteContainerColorsResolver systemEmergencyContainerColorResolver =
            paletteColorResolver.getSystemEmergencyContainerResolver(palettes);
        ContainerRenderColorTokens systemEmergencyContainerTokens = getContainerRenderColorTokens(
            palettes, systemEmergencyContainerColorResolver);

        return new RadianceColorScheme2() {
            private HashMap<ComponentState, ContainerRenderColorTokens> stateTokens = new HashMap<>();

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
                if (componentState.isDisabled()) {
                    // TODO: TONAL - finalize this
                    return getStateRenderTokens(componentState.getEnabledMatch());
                }

                // TODO: TONAL - configurable at the skin definition level
                ContainerRenderColorTokens defaultActive = this.getTonalContainerTokens();
                if ((componentState == ComponentState.PRESSED_UNSELECTED) ||
                    (componentState == ComponentState.ARMED)) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getPressedUnselectedTokens(this,
                            defaultActive));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.PRESSED_SELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getPressedSelectedTokens(this,
                            defaultActive));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.SELECTED) {
                    return defaultActive;
                }
                if (componentState == ComponentState.ROLLOVER_UNSELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getRolloverUnselectedTokens(this,
                            getMutedContainerTokens()));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.ROLLOVER_SELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getRolloverSelectedTokens(this,
                            defaultActive));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.ROLLOVER_ARMED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState, getRolloverArmedTokens(this,
                            defaultActive));
                    }
                    return stateTokens.get(componentState);
                }

                ComponentState hardFallback = componentState.getHardFallback();
                if (hardFallback != null) {
                    return this.getStateRenderTokens(hardFallback);
                }

                if (componentState == ComponentState.ENABLED) {
                    return getMutedContainerTokens();
                }
                return defaultActive;
            }

            @Override
            public ContainerRenderColorTokens getSystemInfoContainerTokens() {
                return systemInfoContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getSystemWarningContainerTokens() {
                return systemWarningContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getSystemErrorContainerTokens() {
                return systemErrorContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getSystemSuccessContainerTokens() {
                return systemSuccessContainerTokens;
            }

            @Override
            public ContainerRenderColorTokens getSystemEmergencyContainerTokens() {
                return systemEmergencyContainerTokens;
            }
        };
    }

    private static ContainerRenderColorTokens getRolloverUnselectedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 75% of tonal container on top of base
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getTonalContainerTokens().getContainerColorTokens().getContainer(),
            0.75f);
    }

    private static ContainerRenderColorTokens getRolloverSelectedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 40% of surface bright on top of base
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceBright(),
            0.4f);
    }

    private static ContainerRenderColorTokens getRolloverArmedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 40% of tonal container on top of base
        ContainerRenderColorTokens intermediate = ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getTonalContainerTokens().getContainerColorTokens().getContainer(),
            0.4f);
        // And then another 40% of surface bright on top
        return ColorSchemeUtils.overlay(
            intermediate,
            colorScheme.getSurfaceBright(),
            0.4f);
    }

    private static ContainerRenderColorTokens getPressedUnselectedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 75% of tonal container on top of base
        ContainerRenderColorTokens intermediate = ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getTonalContainerTokens().getContainerColorTokens().getContainer(),
            0.75f);
        // And then another 50% of surface dim on top
        return ColorSchemeUtils.overlay(
            intermediate,
            colorScheme.getSurfaceDim(),
            0.5f);
    }

    private static ContainerRenderColorTokens getPressedSelectedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 40% of tonal container on top of base
        ContainerRenderColorTokens intermediate = ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getTonalContainerTokens().getContainerColorTokens().getContainer(),
            0.4f);
        // And then another 40% of surface dim on top
        return ColorSchemeUtils.overlay(
            intermediate,
            colorScheme.getSurfaceDim(),
            0.4f);
    }

    private static ContainerRenderColorTokens overlay(ContainerRenderColorTokens original,
        Color overlay, float overlayAmount) {

        Color overlayWithAlpha = RadianceColorUtilities.getAlphaColor(
            overlay, (int) (255 * overlayAmount));

        // Apply overlay on the container tokens
        Color containerLowest = RadianceColorUtilities.overlayColor(
            original.getContainerColorTokens().getContainerLowest(), overlayWithAlpha);
        Color containerLow = RadianceColorUtilities.overlayColor(
            original.getContainerColorTokens().getContainerLow(), overlayWithAlpha);
        Color container = RadianceColorUtilities.overlayColor(
            original.getContainerColorTokens().getContainer(), overlayWithAlpha);
        Color containerHigh = RadianceColorUtilities.overlayColor(
            original.getContainerColorTokens().getContainerHigh(), overlayWithAlpha);
        Color containerHighest = RadianceColorUtilities.overlayColor(
            original.getContainerColorTokens().getContainerHighest(), overlayWithAlpha);

        // Leave on container and container outline tokens as they are
        Color onContainer = original.getOnContainerColorTokens().getOnContainer();
        Color onContainerVariant = original.getOnContainerColorTokens().getOnContainerVariant();
        Color containerOutline = original.getContainerOutlineColorTokens().getContainerOutline();
        Color containerOutlineVariant = original.getContainerOutlineColorTokens().getContainerOutlineVariant();

        return new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return containerLowest;
                    }

                    @Override
                    public Color getContainerLow() {
                        return containerLow;
                    }

                    @Override
                    public Color getContainer() {
                        return container;
                    }

                    @Override
                    public Color getContainerHigh() {
                        return containerHigh;
                    }

                    @Override
                    public Color getContainerHighest() {
                        return containerHighest;
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return onContainer;
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return onContainerVariant;
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return containerOutline;
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return containerOutlineVariant;
                    }
                };
            }
        };
    }
}
