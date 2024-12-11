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

import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;
import java.util.HashMap;

public class ColorSchemeUtils {
    public enum ActiveStatesContainerType {
        TONAL, PRIMARY
    }

   private static ContainerRenderColorTokens getContainerRenderColorTokens(
        DynamicScheme dynamicScheme, PaletteContainerColorsResolver tonalContainerColorResolver) {

        return new ContainerRenderColorTokens() {
            @Override
            public ContainerColorTokens getContainerColorTokens() {
                return new ContainerColorTokens() {
                    @Override
                    public Color getContainerLowest() {
                        return tonalContainerColorResolver.getContainerLowest(dynamicScheme);
                    }

                    @Override
                    public Color getContainerLow() {
                        return tonalContainerColorResolver.getContainerLow(dynamicScheme);
                    }

                    @Override
                    public Color getContainer() {
                        return tonalContainerColorResolver.getContainer(dynamicScheme);
                    }

                    @Override
                    public Color getContainerHigh() {
                        return tonalContainerColorResolver.getContainerHigh(dynamicScheme);
                    }

                    @Override
                    public Color getContainerHighest() {
                        return tonalContainerColorResolver.getContainerHighest(dynamicScheme);
                    }
                };
            }

            @Override
            public OnContainerColorTokens getOnContainerColorTokens() {
                return new OnContainerColorTokens() {
                    @Override
                    public Color getOnContainer() {
                        return tonalContainerColorResolver.getOnContainer(dynamicScheme);
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return tonalContainerColorResolver.getOnContainerVariant(dynamicScheme);
                    }
                };
            }

            @Override
            public ContainerOutlineColorTokens getContainerOutlineColorTokens() {
                return new ContainerOutlineColorTokens() {
                    @Override
                    public Color getContainerOutline() {
                        return tonalContainerColorResolver.getContainerOutline(dynamicScheme);
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return tonalContainerColorResolver.getContainerOutlineVariant(dynamicScheme);
                    }
                };
            }

            @Override
            public float getContainerDisabledAlpha() {
                return 0.3f;
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return 0.45f;
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return 0.35f;
            }
        };
    }

    public static RadianceColorScheme2 getLightColorScheme(
        Palettes palettes, ActiveStatesContainerType activeStatesContainerType) {

        DynamicScheme lightScheme = new DynamicScheme(
            /* sourceColorHct */ palettes.getPrimarySourceHct(),
            /* isDark */ false,
            /* contrastLevel */ 0.0,
            /* primaryPalette */ palettes.getPrimaryPalette(),
            /* neutralPalette */ palettes.getNeutralPalette(),
            /* neutralVariantPalette */ palettes.getNeutralVariantPalette(),
            /* systemInfoPalette */ palettes.getSystemInfoPalette(),
            /* systemWarningPalette */ palettes.getSystemWarningPalette(),
            /* systemErrorPalette */ palettes.getSystemErrorPalette(),
            /* systemSuccessPalette */ palettes.getSystemSuccessPalette(),
            /* systemEmergencyPalette */ palettes.getSystemEmergencyPalette());

        PaletteColorResolver paletteColorResolver =
                PaletteResolverUtils.getPaletteColorResolver2();

        ContainerRenderColorTokens surfaceContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSurfaceContainerResolver());
        ContainerRenderColorTokens mutedContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getMutedContainerResolver());
        ContainerRenderColorTokens tonalContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getTonalContainerResolver());
        ContainerRenderColorTokens primaryContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getPrimaryContainerResolver());

        ContainerRenderColorTokens systemInfoContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemInfoContainerResolver());
        ContainerRenderColorTokens systemWarningContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemWarningContainerResolver());
        ContainerRenderColorTokens systemErrorContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemErrorContainerResolver());
        ContainerRenderColorTokens systemSuccessContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemSuccessContainerResolver());
        ContainerRenderColorTokens systemEmergencyContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemEmergencyContainerResolver());

        return new RadianceColorScheme2() {
            private HashMap<ComponentState, ContainerRenderColorTokens> stateTokens = new HashMap<>();

            @Override
            public Color getSurface() {
                return paletteColorResolver.getSurface(lightScheme);
            }

            @Override
            public Color getSurfaceDim() {
                return paletteColorResolver.getSurfaceDim(lightScheme);
            }

            @Override
            public Color getSurfaceBright() {
                return paletteColorResolver.getSurfaceBright(lightScheme);
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
                ContainerRenderColorTokens defaultActive =
                    (activeStatesContainerType == ActiveStatesContainerType.PRIMARY)
                    ? this.getPrimaryContainerTokens()
                    : this.getTonalContainerTokens();
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
                            defaultActive));
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

    public static RadianceColorScheme2 getDarkColorScheme(
        Palettes palettes, ActiveStatesContainerType activeStatesContainerType) {

        DynamicScheme lightScheme = new DynamicScheme(
            /* sourceColorHct */ palettes.getPrimarySourceHct(),
            /* isDark */ false,
            /* contrastLevel */ 0.0,
            /* primaryPalette */ palettes.getPrimaryPalette(),
            /* neutralPalette */ palettes.getNeutralPalette(),
            /* neutralVariantPalette */ palettes.getNeutralVariantPalette(),
            /* systemInfoPalette */ palettes.getSystemInfoPalette(),
            /* systemWarningPalette */ palettes.getSystemWarningPalette(),
            /* systemErrorPalette */ palettes.getSystemErrorPalette(),
            /* systemSuccessPalette */ palettes.getSystemSuccessPalette(),
            /* systemEmergencyPalette */ palettes.getSystemEmergencyPalette());

        PaletteColorResolver paletteColorResolver =
            PaletteResolverUtils.getPaletteColorResolver2();

        ContainerRenderColorTokens surfaceContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSurfaceContainerResolver());
        ContainerRenderColorTokens mutedContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getMutedContainerResolver());
        ContainerRenderColorTokens tonalContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getTonalContainerResolver());
        ContainerRenderColorTokens primaryContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getPrimaryContainerResolver());

        ContainerRenderColorTokens systemInfoContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemInfoContainerResolver());
        ContainerRenderColorTokens systemWarningContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemWarningContainerResolver());
        ContainerRenderColorTokens systemErrorContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemErrorContainerResolver());
        ContainerRenderColorTokens systemSuccessContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemSuccessContainerResolver());
        ContainerRenderColorTokens systemEmergencyContainerTokens = getContainerRenderColorTokens(
            lightScheme, paletteColorResolver.getSystemEmergencyContainerResolver());

        return new RadianceColorScheme2() {
            private HashMap<ComponentState, ContainerRenderColorTokens> stateTokens = new HashMap<>();

            @Override
            public Color getSurface() {
                return paletteColorResolver.getSurface(lightScheme);
            }

            @Override
            public Color getSurfaceDim() {
                return paletteColorResolver.getSurfaceDim(lightScheme);
            }

            @Override
            public Color getSurfaceBright() {
                return paletteColorResolver.getSurfaceBright(lightScheme);
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
                ContainerRenderColorTokens defaultActive =
                    (activeStatesContainerType == ActiveStatesContainerType.PRIMARY)
                        ? this.getPrimaryContainerTokens()
                        : this.getTonalContainerTokens();
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
                            defaultActive));
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
        // Mixing in 20% of surface bright on top of base
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceBright(),
            0.2f);
    }

    private static ContainerRenderColorTokens getRolloverSelectedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 30% of surface bright on top of base
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceBright(),
            0.3f);
    }

    private static ContainerRenderColorTokens getRolloverArmedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 30% of surface bright on top of base
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceBright(),
            0.3f);
    }

    private static ContainerRenderColorTokens getPressedUnselectedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 50% of surface dim on top
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceDim(),
            0.5f);
    }

    private static ContainerRenderColorTokens getPressedSelectedTokens(
        RadianceColorScheme2 colorScheme, ContainerRenderColorTokens baseTokens) {
        // Mixing in 50% of surface dim on top
        return ColorSchemeUtils.overlay(
            baseTokens,
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

            @Override
            public float getContainerDisabledAlpha() {
                return 0.4f;
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return 0.7f;
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return 0.4f;
            }
        };
    }

    public static RadianceColorScheme2 getLightTonalColorScheme(
        Hct seed, double neutralChroma, double neutralVariantChroma) {

        return getLightTonalColorScheme(seed, seed.getChroma(), neutralChroma, neutralVariantChroma);
    }

    public static RadianceColorScheme2 getLightTonalColorScheme(
        Hct seed, double primaryChroma, double neutralChroma, double neutralVariantChroma) {

        double seedHue = seed.getHue();

        TonalPalette primaryPalette = TonalPalette.fromHueAndChroma(seedHue, primaryChroma);
        TonalPalette neutralPalette = TonalPalette.fromHueAndChroma(seedHue, neutralChroma);
        TonalPalette neutralVariantPalette =
            TonalPalette.fromHueAndChroma(seedHue, neutralVariantChroma);

        Palettes palettes = Palettes.builder()
            .setPrimarySourceHct(seed)
            .setPrimaryPalette(primaryPalette)
            .setNeutralPalette(neutralPalette)
            .setNeutralVariantPalette(neutralVariantPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getLightColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.TONAL);

        return result;
    }

    public static RadianceColorScheme2 getLightPrimaryColorScheme(
        Hct seed, double primaryChroma, double neutralChroma, double neutralVariantChroma) {

        double seedHue = seed.getHue();

        TonalPalette primaryPalette = TonalPalette.fromHueAndChroma(seedHue, primaryChroma);
        TonalPalette neutralPalette = TonalPalette.fromHueAndChroma(seedHue, neutralChroma);
        TonalPalette neutralVariantPalette =
            TonalPalette.fromHueAndChroma(seedHue, neutralVariantChroma);

        Palettes palettes = Palettes.builder()
            .setPrimarySourceHct(seed)
            .setPrimaryPalette(primaryPalette)
            .setNeutralPalette(neutralPalette)
            .setNeutralVariantPalette(neutralVariantPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getLightColorScheme(
            palettes, ActiveStatesContainerType.PRIMARY);

        return result;
    }
}
