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

   private static ContainerColorTokens getContainerTokens(
        DynamicScheme dynamicScheme, PaletteContainerColorsResolver tonalContainerColorResolver) {

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return dynamicScheme.isDark;
            }

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

            @Override
            public Color getOnContainer() {
                return tonalContainerColorResolver.getOnContainer(dynamicScheme);
            }

            @Override
            public Color getOnContainerVariant() {
                return tonalContainerColorResolver.getOnContainerVariant(dynamicScheme);
            }

            @Override
            public Color getContainerOutline() {
                return tonalContainerColorResolver.getContainerOutline(dynamicScheme);
            }

            @Override
            public Color getContainerOutlineVariant() {
                return tonalContainerColorResolver.getContainerOutlineVariant(dynamicScheme);
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
            /* primarySourceColorHct */ palettes.getPrimarySourceHct(),
            /* mutedSourceColorHct */ palettes.getMutedSourceHct(),
            /* neutralSourceColorHct */ palettes.getNeutralSourceHct(),
            /* isFidelity */ palettes.isFidelity(),
            /* isDark */ false,
            /* contrastLevel */ 0.0,
            /* primaryPalette */ palettes.getPrimaryPalette(),
            /* mutedPalette */ palettes.getMutedPalette(),
            /* neutralPalette */ palettes.getNeutralPalette(),
            /* systemInfoPalette */ palettes.getSystemInfoPalette(),
            /* systemWarningPalette */ palettes.getSystemWarningPalette(),
            /* systemErrorPalette */ palettes.getSystemErrorPalette(),
            /* systemSuccessPalette */ palettes.getSystemSuccessPalette(),
            /* systemEmergencyPalette */ palettes.getSystemEmergencyPalette());

        PaletteColorResolver paletteColorResolver =
                PaletteResolverUtils.getPaletteColorResolver2();

        ContainerColorTokens neutralContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getNeutralContainerResolver());
        ContainerColorTokens mutedContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getMutedContainerResolver());
        ContainerColorTokens tonalContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getTonalContainerResolver());
        ContainerColorTokens primaryContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getPrimaryContainerResolver());

        ContainerColorTokens systemInfoContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getSystemInfoContainerResolver());
        ContainerColorTokens systemWarningContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getSystemWarningContainerResolver());
        ContainerColorTokens systemErrorContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getSystemErrorContainerResolver());
        ContainerColorTokens systemSuccessContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getSystemSuccessContainerResolver());
        ContainerColorTokens systemEmergencyContainerTokens = getContainerTokens(
            lightScheme, paletteColorResolver.getSystemEmergencyContainerResolver());

        return new RadianceColorScheme2() {
            private HashMap<ComponentState, ContainerColorTokens> stateTokens = new HashMap<>();

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
            public ContainerColorTokens getNeutralContainerTokens() {
                return neutralContainerTokens;
            }

            @Override
            public ContainerColorTokens getMutedContainerTokens() {
                return mutedContainerTokens;
            }

            @Override
            public ContainerColorTokens getTonalContainerTokens() {
                return tonalContainerTokens;
            }

            @Override
            public ContainerColorTokens getPrimaryContainerTokens() {
                return primaryContainerTokens;
            }

            @Override
            public ContainerColorTokens getContainerTokensForState(ComponentState componentState) {
                if (componentState.isDisabled()) {
                    // TODO: TONAL - finalize this
                    return getContainerTokensForState(componentState.getEnabledMatch());
                }

                // TODO: TONAL - configurable at the skin definition level
                ContainerColorTokens defaultActive =
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
                    return this.getContainerTokensForState(hardFallback);
                }

                if (componentState == ComponentState.ENABLED) {
                    return getMutedContainerTokens();
                }
                return defaultActive;
            }

            @Override
            public ContainerColorTokens getSystemInfoContainerTokens() {
                return systemInfoContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemWarningContainerTokens() {
                return systemWarningContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemErrorContainerTokens() {
                return systemErrorContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemSuccessContainerTokens() {
                return systemSuccessContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemEmergencyContainerTokens() {
                return systemEmergencyContainerTokens;
            }
        };
    }

    public static RadianceColorScheme2 getDarkColorScheme(
        Palettes palettes, ActiveStatesContainerType activeStatesContainerType) {

        DynamicScheme darkScheme = new DynamicScheme(
            /* primarySourceColorHct */ palettes.getPrimarySourceHct(),
            /* mutedSourceColorHct */ palettes.getMutedSourceHct(),
            /* neutralSourceColorHct */ palettes.getNeutralSourceHct(),
            /* isFidelity */ palettes.isFidelity(),
            /* isDark */ true,
            /* contrastLevel */ 0.0,
            /* primaryPalette */ palettes.getPrimaryPalette(),
            /* mutedPalette */ palettes.getMutedPalette(),
            /* neutralPalette */ palettes.getNeutralPalette(),
            /* systemInfoPalette */ palettes.getSystemInfoPalette(),
            /* systemWarningPalette */ palettes.getSystemWarningPalette(),
            /* systemErrorPalette */ palettes.getSystemErrorPalette(),
            /* systemSuccessPalette */ palettes.getSystemSuccessPalette(),
            /* systemEmergencyPalette */ palettes.getSystemEmergencyPalette());

        PaletteColorResolver paletteColorResolver =
            PaletteResolverUtils.getPaletteColorResolver2();

        ContainerColorTokens neutralContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getNeutralContainerResolver());
        ContainerColorTokens mutedContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getMutedContainerResolver());
        ContainerColorTokens tonalContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getTonalContainerResolver());
        ContainerColorTokens primaryContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getPrimaryContainerResolver());

        ContainerColorTokens systemInfoContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getSystemInfoContainerResolver());
        ContainerColorTokens systemWarningContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getSystemWarningContainerResolver());
        ContainerColorTokens systemErrorContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getSystemErrorContainerResolver());
        ContainerColorTokens systemSuccessContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getSystemSuccessContainerResolver());
        ContainerColorTokens systemEmergencyContainerTokens = getContainerTokens(
            darkScheme, paletteColorResolver.getSystemEmergencyContainerResolver());

        return new RadianceColorScheme2() {
            private HashMap<ComponentState, ContainerColorTokens> stateTokens = new HashMap<>();

            @Override
            public Color getSurface() {
                return paletteColorResolver.getSurface(darkScheme);
            }

            @Override
            public Color getSurfaceDim() {
                return paletteColorResolver.getSurfaceDim(darkScheme);
            }

            @Override
            public Color getSurfaceBright() {
                return paletteColorResolver.getSurfaceBright(darkScheme);
            }

            @Override
            public ContainerColorTokens getNeutralContainerTokens() {
                return neutralContainerTokens;
            }

            @Override
            public ContainerColorTokens getMutedContainerTokens() {
                return mutedContainerTokens;
            }

            @Override
            public ContainerColorTokens getTonalContainerTokens() {
                return tonalContainerTokens;
            }

            @Override
            public ContainerColorTokens getPrimaryContainerTokens() {
                return primaryContainerTokens;
            }

            @Override
            public ContainerColorTokens getContainerTokensForState(ComponentState componentState) {
                if (componentState.isDisabled()) {
                    // TODO: TONAL - finalize this
                    return getContainerTokensForState(componentState.getEnabledMatch());
                }

                // TODO: TONAL - configurable at the skin definition level
                ContainerColorTokens defaultActive =
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
                    return this.getContainerTokensForState(hardFallback);
                }

                if (componentState == ComponentState.ENABLED) {
                    return getMutedContainerTokens();
                }
                return defaultActive;
            }

            @Override
            public ContainerColorTokens getSystemInfoContainerTokens() {
                return systemInfoContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemWarningContainerTokens() {
                return systemWarningContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemErrorContainerTokens() {
                return systemErrorContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemSuccessContainerTokens() {
                return systemSuccessContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemEmergencyContainerTokens() {
                return systemEmergencyContainerTokens;
            }
        };
    }

    private static ContainerColorTokens getRolloverUnselectedTokens(
        RadianceColorScheme2 colorScheme, ContainerColorTokens baseTokens) {
        // Mixing in 20% of surface bright on top of base
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceBright(),
            0.2f);
    }

    private static ContainerColorTokens getRolloverSelectedTokens(
        RadianceColorScheme2 colorScheme, ContainerColorTokens baseTokens) {
        // Mixing in 30% of surface bright on top of base
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceBright(),
            0.3f);
    }

    private static ContainerColorTokens getRolloverArmedTokens(
        RadianceColorScheme2 colorScheme, ContainerColorTokens baseTokens) {
        // Mixing in 30% of surface bright on top of base
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceBright(),
            0.3f);
    }

    private static ContainerColorTokens getPressedUnselectedTokens(
        RadianceColorScheme2 colorScheme, ContainerColorTokens baseTokens) {
        // Mixing in 50% of surface dim on top
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceDim(),
            0.5f);
    }

    private static ContainerColorTokens getPressedSelectedTokens(
        RadianceColorScheme2 colorScheme, ContainerColorTokens baseTokens) {
        // Mixing in 50% of surface dim on top
        return ColorSchemeUtils.overlay(
            baseTokens,
            colorScheme.getSurfaceDim(),
            0.4f);
    }

    private static ContainerColorTokens overlay(ContainerColorTokens original,
        Color overlay, float overlayAmount) {

        Color overlayWithAlpha = RadianceColorUtilities.getAlphaColor(
            overlay, (int) (255 * overlayAmount));

        // Apply overlay on the container tokens
        Color containerLowest = RadianceColorUtilities.overlayColor(
            original.getContainerLowest(), overlayWithAlpha);
        Color containerLow = RadianceColorUtilities.overlayColor(
            original.getContainerLow(), overlayWithAlpha);
        Color container = RadianceColorUtilities.overlayColor(
            original.getContainer(), overlayWithAlpha);
        Color containerHigh = RadianceColorUtilities.overlayColor(
            original.getContainerHigh(), overlayWithAlpha);
        Color containerHighest = RadianceColorUtilities.overlayColor(
            original.getContainerHighest(), overlayWithAlpha);

        // Leave on container and container outline tokens as they are
        Color onContainer = original.getOnContainer();
        Color onContainerVariant = original.getOnContainerVariant();
        Color containerOutline = original.getContainerOutline();
        Color containerOutlineVariant = original.getContainerOutlineVariant();

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
            }

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

            @Override
            public Color getOnContainer() {
                return onContainer;
            }

            @Override
            public Color getOnContainerVariant() {
                return onContainerVariant;
            }

            @Override
            public Color getContainerOutline() {
                return containerOutline;
            }

            @Override
            public Color getContainerOutlineVariant() {
                return containerOutlineVariant;
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

    public static RadianceColorScheme2 getLightTonalBalancedColorScheme(
        Hct seed, double mutedChroma, double neutralChroma) {

        Hct mutedSeed = Hct.fromInt(seed.toInt());
        mutedSeed.setChroma(mutedChroma);

        Hct neutralSeed = Hct.fromInt(seed.toInt());
        neutralSeed.setChroma(neutralChroma);

        return getLightTonalBalancedColorScheme(seed, seed.getChroma(), mutedChroma, neutralChroma);
    }

    public static RadianceColorScheme2 getLightTonalBalancedColorScheme(
        Hct seed, double primaryChroma, double mutedChroma, double neutralChroma) {

        TonalPalette primaryPalette = TonalPalette.fromHueAndChroma(seed.getHue(), primaryChroma);
        TonalPalette mutedPalette = TonalPalette.fromHueAndChroma(seed.getHue(), mutedChroma);
        TonalPalette neutralPalette = TonalPalette.fromHueAndChroma(seed.getHue(), neutralChroma);

        Palettes palettes = Palettes.builder()
            .setFidelity(false)
            .setPrimarySourceHct(seed)
            .setMutedSourceHct(seed)
            .setNeutralSourceHct(seed)
            .setPrimaryPalette(primaryPalette)
            .setMutedPalette(mutedPalette)
            .setNeutralPalette(neutralPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getLightColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.TONAL);

        return result;
    }

    public static RadianceColorScheme2 getLightTonalFidelityColorScheme(
        Hct primarySeed, Hct mutedSeed, Hct neutralSeed) {

        TonalPalette primaryPalette = TonalPalette.fromHct(primarySeed);
        TonalPalette mutedPalette = TonalPalette.fromHct(mutedSeed);
        TonalPalette neutralPalette = TonalPalette.fromHct(neutralSeed);

        Palettes palettes = Palettes.builder()
            .setFidelity(true)
            .setPrimarySourceHct(primarySeed)
            .setMutedSourceHct(mutedSeed)
            .setNeutralSourceHct(neutralSeed)
            .setPrimaryPalette(primaryPalette)
            .setMutedPalette(mutedPalette)
            .setNeutralPalette(neutralPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getLightColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.TONAL);

        return result;
    }

    public static RadianceColorScheme2 getLightPrimaryBalancedColorScheme(
        Hct seed, double mutedChroma, double neutralChroma) {

        Hct mutedSeed = Hct.fromInt(seed.toInt());
        mutedSeed.setChroma(mutedChroma);

        Hct neutralSeed = Hct.fromInt(seed.toInt());
        neutralSeed.setChroma(neutralChroma);

        return getLightPrimaryBalancedColorScheme(seed, seed.getChroma(), mutedChroma, neutralChroma);
    }

    public static RadianceColorScheme2 getLightPrimaryBalancedColorScheme(
        Hct seed, double primaryChroma, double mutedChroma, double neutralChroma) {

        TonalPalette primaryPalette = TonalPalette.fromHueAndChroma(seed.getHue(), primaryChroma);
        TonalPalette mutedPalette = TonalPalette.fromHueAndChroma(seed.getHue(), mutedChroma);
        TonalPalette neutralPalette = TonalPalette.fromHueAndChroma(seed.getHue(), neutralChroma);

        Palettes palettes = Palettes.builder()
            .setFidelity(false)
            .setPrimarySourceHct(seed)
            .setMutedSourceHct(seed)
            .setNeutralSourceHct(seed)
            .setPrimaryPalette(primaryPalette)
            .setMutedPalette(mutedPalette)
            .setNeutralPalette(neutralPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getLightColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.PRIMARY);

        return result;
    }

    public static RadianceColorScheme2 getLightPrimaryFidelityColorScheme(
        Hct primarySeed, Hct mutedSeed, Hct neutralSeed) {

        TonalPalette primaryPalette = TonalPalette.fromHct(primarySeed);
        TonalPalette mutedPalette = TonalPalette.fromHct(mutedSeed);
        TonalPalette neutralPalette = TonalPalette.fromHct(neutralSeed);

        Palettes palettes = Palettes.builder()
            .setFidelity(true)
            .setPrimarySourceHct(primarySeed)
            .setMutedSourceHct(mutedSeed)
            .setNeutralSourceHct(neutralSeed)
            .setPrimaryPalette(primaryPalette)
            .setMutedPalette(mutedPalette)
            .setNeutralPalette(neutralPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getLightColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.PRIMARY);

        return result;
    }

    public static RadianceColorScheme2 getDarkTonalBalancedColorScheme(
        Hct seed, double mutedChroma, double neutralChroma) {

        Hct mutedSeed = Hct.fromInt(seed.toInt());
        mutedSeed.setChroma(mutedChroma);

        Hct neutralSeed = Hct.fromInt(seed.toInt());
        neutralSeed.setChroma(neutralChroma);

        return getDarkTonalBalancedColorScheme(seed, seed.getChroma(), mutedChroma, neutralChroma);
    }

    public static RadianceColorScheme2 getDarkTonalBalancedColorScheme(
        Hct seed, double primaryChroma, double mutedChroma, double neutralChroma) {

        TonalPalette primaryPalette = TonalPalette.fromHueAndChroma(seed.getHue(), primaryChroma);
        TonalPalette mutedPalette = TonalPalette.fromHueAndChroma(seed.getHue(), mutedChroma);
        TonalPalette neutralPalette = TonalPalette.fromHueAndChroma(seed.getHue(), neutralChroma);

        Palettes palettes = Palettes.builder()
            .setFidelity(false)
            .setPrimarySourceHct(seed)
            .setMutedSourceHct(seed)
            .setNeutralSourceHct(seed)
            .setPrimaryPalette(primaryPalette)
            .setMutedPalette(mutedPalette)
            .setNeutralPalette(neutralPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getDarkColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.TONAL);

        return result;
    }

    public static RadianceColorScheme2 getDarkTonalFidelityColorScheme(
        Hct primarySeed, Hct mutedSeed, Hct neutralSeed) {

        TonalPalette primaryPalette = TonalPalette.fromHct(primarySeed);
        TonalPalette mutedPalette = TonalPalette.fromHct(mutedSeed);
        TonalPalette neutralPalette = TonalPalette.fromHct(neutralSeed);

        Palettes palettes = Palettes.builder()
            .setFidelity(true)
            .setPrimarySourceHct(primarySeed)
            .setMutedSourceHct(mutedSeed)
            .setNeutralSourceHct(neutralSeed)
            .setPrimaryPalette(primaryPalette)
            .setMutedPalette(mutedPalette)
            .setNeutralPalette(neutralPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getDarkColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.TONAL);

        return result;
    }

    public static RadianceColorScheme2 getDarkPrimaryBalancedColorScheme(
        Hct seed, double mutedChroma, double neutralChroma) {

        Hct mutedSeed = Hct.fromInt(seed.toInt());
        mutedSeed.setChroma(mutedChroma);

        Hct neutralSeed = Hct.fromInt(seed.toInt());
        neutralSeed.setChroma(neutralChroma);

        return getDarkPrimaryBalancedColorScheme(seed, seed.getChroma(), mutedChroma, neutralChroma);
    }

    public static RadianceColorScheme2 getDarkPrimaryBalancedColorScheme(
        Hct seed, double primaryChroma, double mutedChroma, double neutralChroma) {

        TonalPalette primaryPalette = TonalPalette.fromHueAndChroma(seed.getHue(), primaryChroma);
        TonalPalette mutedPalette = TonalPalette.fromHueAndChroma(seed.getHue(), mutedChroma);
        TonalPalette neutralPalette = TonalPalette.fromHueAndChroma(seed.getHue(), neutralChroma);

        Palettes palettes = Palettes.builder()
            .setFidelity(false)
            .setPrimarySourceHct(seed)
            .setMutedSourceHct(seed)
            .setNeutralSourceHct(seed)
            .setPrimaryPalette(primaryPalette)
            .setMutedPalette(mutedPalette)
            .setNeutralPalette(neutralPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getDarkColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.PRIMARY);

        return result;
    }

    public static RadianceColorScheme2 getDarkPrimaryFidelityColorScheme(
        Hct primarySeed, Hct mutedSeed, Hct neutralSeed) {

        TonalPalette primaryPalette = TonalPalette.fromHct(primarySeed);
        TonalPalette mutedPalette = TonalPalette.fromHct(mutedSeed);
        TonalPalette neutralPalette = TonalPalette.fromHct(neutralSeed);

        Palettes palettes = Palettes.builder()
            .setFidelity(true)
            .setPrimarySourceHct(primarySeed)
            .setMutedSourceHct(mutedSeed)
            .setNeutralSourceHct(neutralSeed)
            .setPrimaryPalette(primaryPalette)
            .setMutedPalette(mutedPalette)
            .setNeutralPalette(neutralPalette)
            .build();

        RadianceColorScheme2 result = ColorSchemeUtils.getDarkColorScheme(
            palettes, ColorSchemeUtils.ActiveStatesContainerType.PRIMARY);

        return result;
    }
}
