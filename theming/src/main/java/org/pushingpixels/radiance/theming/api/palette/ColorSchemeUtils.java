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

import org.pushingpixels.ephemeral.chroma.blend.Blend;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicBimodalPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicScheme;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.BaseTonalPalette;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.plaf.UIResource;
import java.awt.*;
import java.util.HashMap;
import java.util.function.Function;

public class ColorSchemeUtils {

    private static ContainerColorTokens getContainerTokens(
        DynamicScheme dynamicScheme,
        Function<DynamicScheme, Boolean> isDark,
        SchemeContainerColorsResolver tonalContainerColorResolver) {

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return isDark.apply(dynamicScheme);
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return tonalContainerColorResolver.getContainerSurfaceLowest(dynamicScheme);
            }

            @Override
            public Color getContainerSurfaceLow() {
                return tonalContainerColorResolver.getContainerSurfaceLow(dynamicScheme);
            }

            @Override
            public Color getContainerSurface() {
                return tonalContainerColorResolver.getContainerSurface(dynamicScheme);
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return tonalContainerColorResolver.getContainerSurfaceHigh(dynamicScheme);
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return tonalContainerColorResolver.getContainerSurfaceHighest(dynamicScheme);
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
            public float getContainerSurfaceDisabledAlpha() {
                return tonalContainerColorResolver.getContainerSurfaceDisabledAlpha(dynamicScheme);
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return tonalContainerColorResolver.getOnContainerDisabledAlpha(dynamicScheme);
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return tonalContainerColorResolver.getContainerOutlineDisabledAlpha(dynamicScheme);
            }

            @Override
            public Color getInverseContainerSurface() {
                return tonalContainerColorResolver.getInverseContainerSurface(dynamicScheme);
            }

            @Override
            public Color getInverseOnContainer() {
                return tonalContainerColorResolver.getInverseOnContainer(dynamicScheme);
            }

            @Override
            public Color getInverseContainerOutline() {
                return tonalContainerColorResolver.getInverseContainerOutline(dynamicScheme);
            }

            @Override
            public Color getComplementaryOnContainer() {
                return tonalContainerColorResolver.getComplementaryContainerOutline(dynamicScheme);
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return tonalContainerColorResolver.getComplementaryContainerOutline(dynamicScheme);
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
        Color containerSurfaceLowest = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceLowest(), overlayWithAlpha);
        Color containerSurfaceLow = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceLow(), overlayWithAlpha);
        Color containerSurface = RadianceColorUtilities.overlayColor(
            original.getContainerSurface(), overlayWithAlpha);
        Color containerSurfaceHigh = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceHigh(), overlayWithAlpha);
        Color containerSurfaceHighest = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceHighest(), overlayWithAlpha);
        Color inverseContainerSurface = RadianceColorUtilities.overlayColor(
            original.getInverseContainerSurface(), overlayWithAlpha);

        // Leave on container and container outline tokens as they are
        Color onContainer = original.getOnContainer();
        Color onContainerVariant = original.getOnContainerVariant();
        Color containerOutline = original.getContainerOutline();
        Color containerOutlineVariant = original.getContainerOutlineVariant();

        Color inverseOnContainer = original.getInverseOnContainer();
        Color inverseContainerOutline = original.getInverseContainerOutline();
        Color complementaryOnContainer = original.getComplementaryOnContainer();
        Color complementaryContainerOutline = original.getComplementaryContainerOutline();

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return containerSurfaceLowest;
            }

            @Override
            public Color getContainerSurfaceLow() {
                return containerSurfaceLow;
            }

            @Override
            public Color getContainerSurface() {
                return containerSurface;
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return containerSurfaceHigh;
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return containerSurfaceHighest;
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
            public float getContainerSurfaceDisabledAlpha() {
                return original.getContainerSurfaceDisabledAlpha();
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return original.getOnContainerDisabledAlpha();
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return original.getContainerOutlineDisabledAlpha();
            }

            @Override
            public Color getInverseContainerSurface() {
                return inverseContainerSurface;
            }

            @Override
            public Color getInverseOnContainer() {
                return inverseOnContainer;
            }

            @Override
            public Color getInverseContainerOutline() {
                return inverseContainerOutline;
            }

            @Override
            public Color getComplementaryOnContainer() {
                return complementaryOnContainer;
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return complementaryContainerOutline;
            }
        };
    }

    public interface PalettesSource {
        Palettes getPalettes();
    }

    public static class BalancedPaletteSource implements PalettesSource {
        private Hct seed;
        private double primaryChroma;
        private double mutedChroma;
        private double neutralChroma;

        public BalancedPaletteSource(Hct seed, double mutedChroma, double neutralChroma) {
            this(seed, seed.getChroma(), mutedChroma, neutralChroma);
        }

        public BalancedPaletteSource(Hct seed, double primaryChroma, double mutedChroma,
            double neutralChroma) {
            this.seed = seed;
            this.primaryChroma = primaryChroma;
            this.mutedChroma = mutedChroma;
            this.neutralChroma = neutralChroma;
        }

        @Override
        public Palettes getPalettes() {
            TonalPalette primaryPalette = TonalPalette.fromHueAndChroma(
                this.seed.getHue(), this.primaryChroma);
            TonalPalette mutedPalette = TonalPalette.fromHueAndChroma(
                this.seed.getHue(), this.mutedChroma);
            TonalPalette neutralPalette = TonalPalette.fromHueAndChroma(
                this.seed.getHue(), this.neutralChroma);

            return Palettes.builder()
                .setFidelity(false)
                .setPrimaryPalette(primaryPalette)
                .setMutedPalette(mutedPalette)
                .setNeutralPalette(neutralPalette)
                .setPrimarySourceTone(this.seed.getTone())
                .setMutedSourceTone(this.seed.getTone())
                .setNeutralSourceTone(this.seed.getTone())
                .build();
        }
    }

    public static class FidelityPaletteSource implements PalettesSource {
        private Hct primarySeed;
        private Hct mutedSeed;
        private Hct neutralSeed;

        public FidelityPaletteSource(Hct primarySeed, Hct mutedSeed, Hct neutralSeed) {
            this.primarySeed = primarySeed;
            this.mutedSeed = mutedSeed;
            this.neutralSeed = neutralSeed;
        }

        @Override
        public Palettes getPalettes() {
            TonalPalette primaryPalette = TonalPalette.fromHct(this.primarySeed);
            TonalPalette mutedPalette = TonalPalette.fromHct(this.mutedSeed);
            TonalPalette neutralPalette = TonalPalette.fromHct(this.neutralSeed);

            return Palettes.builder()
                .setFidelity(true)
                .setPrimaryPalette(primaryPalette)
                .setMutedPalette(mutedPalette)
                .setNeutralPalette(neutralPalette)
                .setPrimarySourceTone(this.primarySeed.getTone())
                .setMutedSourceTone(this.mutedSeed.getTone())
                .setNeutralSourceTone(this.neutralSeed.getTone())
                .build();
        }
    }

    public static class FidelityDirectPaletteSource implements PalettesSource {
        private BaseTonalPalette primaryPalette;
        private BaseTonalPalette mutedPalette;
        private BaseTonalPalette neutralPalette;
        private double primarySourceTone;
        private double mutedSourceTone;
        private double neutralSourceTone;

        public FidelityDirectPaletteSource(BaseTonalPalette primaryPalette,
            BaseTonalPalette mutedPalette, BaseTonalPalette neutralPalette,
            double primarySourceTone, double mutedSourceTone, double neutralSourceTone) {

            this.primaryPalette = primaryPalette;
            this.mutedPalette = mutedPalette;
            this.neutralPalette = neutralPalette;
            this.primarySourceTone = primarySourceTone;
            this.mutedSourceTone = mutedSourceTone;
            this.neutralSourceTone = neutralSourceTone;
        }

        @Override
        public Palettes getPalettes() {
            return Palettes.builder()
                .setFidelity(true)
                .setPrimaryPalette(this.primaryPalette)
                .setMutedPalette(this.mutedPalette)
                .setNeutralPalette(this.neutralPalette)
                .setPrimarySourceTone(this.primarySourceTone)
                .setMutedSourceTone(this.mutedSourceTone)
                .setNeutralSourceTone(this.neutralSourceTone)
                .build();
        }
    }

    public static RadianceColorScheme2 getColorScheme(
        PalettesSource palettesSource,
        RadianceThemingSlices.ActiveContainerType activeContainerType,
        boolean isDark) {
        return getColorScheme(palettesSource, activeContainerType,
            isDark, isDark, isDark, isDark, isDark, 0.0f, 0.0f, 0.0f, 0.0f,
            SchemeResolverUtils.getSchemeColorResolver());
    }

    public static RadianceColorScheme2 getColorScheme(
        PalettesSource palettesSource,
        RadianceThemingSlices.ActiveContainerType activeContainerType,
        boolean isPrimaryDark, boolean isTonalDark, boolean isMutedDark, boolean isNeutralDark,
        boolean isSystemDark,
        double primaryContrastLevel, double tonalContrastLevel,
        double mutedContrastLevel, double neutralContrastLevel,
        SchemeColorResolver schemeColorResolver) {

        Palettes palettes = palettesSource.getPalettes();

        DynamicScheme scheme = new DynamicScheme(
            /* primaryPalette */ palettes.getPrimaryPalette(),
            /* mutedPalette */ palettes.getMutedPalette(),
            /* neutralPalette */ palettes.getNeutralPalette(),
            /* primarySourceColorTone */ palettes.getPrimarySourceTone(),
            /* mutedSourceColorTone */ palettes.getMutedSourceTone(),
            /* neutralSourceColorTone */ palettes.getNeutralSourceTone(),
            /* isFidelity */ palettes.isFidelity(),
            /* isPrimaryDark */ isPrimaryDark,
            /* isTonalDark */ isTonalDark,
            /* isMutedDark */ isMutedDark,
            /* isNeutralDark */ isNeutralDark,
            /* primaryContrastLevel */ primaryContrastLevel,
            /* tonalContrastLevel */ tonalContrastLevel,
            /* mutedContrastLevel */ mutedContrastLevel,
            /* neutralContrastLevel */ neutralContrastLevel);

        ContainerColorTokens neutralContainerTokens = getContainerTokens(
            scheme, (s) -> s.isNeutralDark, schemeColorResolver.getNeutralContainerResolver());
        ContainerColorTokens mutedContainerTokens = getContainerTokens(
            scheme, (s) -> s.isMutedDark, schemeColorResolver.getMutedContainerResolver());
        ContainerColorTokens tonalContainerTokens = getContainerTokens(
            scheme, (s) -> s.isTonalDark, schemeColorResolver.getTonalContainerResolver());
        ContainerColorTokens primaryContainerTokens = getContainerTokens(
            scheme, (s) -> s.isPrimaryDark, schemeColorResolver.getPrimaryContainerResolver());

        ContainerColorTokens systemInfoTonalContainerTokens = getContainerTokens(
            palettes.getSystemInfoSourceHct(), RadianceThemingSlices.ActiveContainerType.TONAL,
            false, isSystemDark);
        ContainerColorTokens systemInfoPrimaryContainerTokens = getContainerTokens(
            palettes.getSystemInfoSourceHct(), RadianceThemingSlices.ActiveContainerType.PRIMARY,
            false, isSystemDark);
        ContainerColorTokens systemWarningTonalContainerTokens = getContainerTokens(
            palettes.getSystemWarningSourceHct(), RadianceThemingSlices.ActiveContainerType.TONAL,
            false, isSystemDark);
        ContainerColorTokens systemWarningPrimaryContainerTokens = getContainerTokens(
            palettes.getSystemWarningSourceHct(), RadianceThemingSlices.ActiveContainerType.PRIMARY,
            false, isSystemDark);
        ContainerColorTokens systemErrorTonalContainerTokens = getContainerTokens(
            palettes.getSystemErrorSourceHct(), RadianceThemingSlices.ActiveContainerType.TONAL,
            false, isSystemDark);
        ContainerColorTokens systemErrorPrimaryContainerTokens = getContainerTokens(
            palettes.getSystemErrorSourceHct(), RadianceThemingSlices.ActiveContainerType.PRIMARY,
            false, isSystemDark);
        ContainerColorTokens systemSuccessTonalContainerTokens = getContainerTokens(
            palettes.getSystemSuccessSourceHct(), RadianceThemingSlices.ActiveContainerType.TONAL,
            false, isSystemDark);
        ContainerColorTokens systemSuccessPrimaryContainerTokens = getContainerTokens(
            palettes.getSystemSuccessSourceHct(), RadianceThemingSlices.ActiveContainerType.PRIMARY,
            false, isSystemDark);
        ContainerColorTokens systemEmergencyTonalContainerTokens = getContainerTokens(
            palettes.getSystemEmergencySourceHct(), RadianceThemingSlices.ActiveContainerType.TONAL,
            false, isSystemDark);
        ContainerColorTokens systemEmergencyPrimaryContainerTokens = getContainerTokens(
            palettes.getSystemEmergencySourceHct(), RadianceThemingSlices.ActiveContainerType.PRIMARY,
            false, isSystemDark);

        return new RadianceColorScheme2() {
            private HashMap<ComponentState, ContainerColorTokens> stateTokens = new HashMap<>();

            @Override
            public Color getSurface() {
                return schemeColorResolver.getSurface(scheme);
            }

            @Override
            public Color getSurfaceDim() {
                return schemeColorResolver.getSurfaceDim(scheme);
            }

            @Override
            public Color getSurfaceBright() {
                return schemeColorResolver.getSurfaceBright(scheme);
            }

            @Override
            public Color getInverseSurface() {
                return schemeColorResolver.getInverseSurface(scheme);
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
            public ContainerColorTokens getActiveContainerTokens() {
                return (activeContainerType == RadianceThemingSlices.ActiveContainerType.PRIMARY)
                    ? this.getPrimaryContainerTokens()
                    : this.getTonalContainerTokens();
            }

            @Override
            public ContainerColorTokens getContainerTokensForState(ComponentState componentState) {
                if (componentState.isDisabled()) {
                    return getContainerTokensForState(componentState.getEnabledMatch());
                }

                ContainerColorTokens defaultActive = getActiveContainerTokens();
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
            public ContainerColorTokens getSystemInfoTonalContainerTokens() {
                return systemInfoTonalContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemInfoPrimaryContainerTokens() {
                return systemInfoPrimaryContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemWarningTonalContainerTokens() {
                return systemWarningTonalContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemWarningPrimaryContainerTokens() {
                return systemWarningPrimaryContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemErrorTonalContainerTokens() {
                return systemErrorTonalContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemErrorPrimaryContainerTokens() {
                return systemErrorPrimaryContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemSuccessTonalContainerTokens() {
                return systemSuccessTonalContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemSuccessPrimaryContainerTokens() {
                return systemSuccessPrimaryContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemEmergencyTonalContainerTokens() {
                return systemEmergencyTonalContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemEmergencyPrimaryContainerTokens() {
                return systemEmergencyPrimaryContainerTokens;
            }
        };
    }

    public static ContainerColorTokens getContainerTokens(
        Hct seed,
        RadianceThemingSlices.ActiveContainerType activeContainerType,
        boolean isFidelity,
        boolean isDark) {
        return getContainerTokens(seed, isFidelity, isDark, 0.0,
            (activeContainerType == RadianceThemingSlices.ActiveContainerType.TONAL)
                ? PaletteResolverUtils.getPaletteTonalColorResolver()
                : PaletteResolverUtils.getPalettePrimaryColorResolver());
    }

    public static ContainerColorTokens getContainerTokens(
        Hct seed,
        boolean isFidelity,
        boolean isDark,
        double contrastLevel,
        PaletteContainerColorsResolver colorResolver) {

        DynamicPalette dynamicPalette = new DynamicPalette(
            /* sourceColorHct */ seed,
            /* isFidelity */ isFidelity,
            /* isDark */ isDark,
            /* contrastLevel */ contrastLevel);

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return dynamicPalette.isDark;
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return colorResolver.getContainerSurfaceLowest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceLow() {
                return colorResolver.getContainerSurfaceLow(dynamicPalette);
            }

            @Override
            public Color getContainerSurface() {
                return colorResolver.getContainerSurface(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return colorResolver.getContainerSurfaceHigh(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return colorResolver.getContainerSurfaceHighest(dynamicPalette);
            }

            @Override
            public Color getOnContainer() {
                return colorResolver.getOnContainer(dynamicPalette);
            }

            @Override
            public Color getOnContainerVariant() {
                return colorResolver.getOnContainerVariant(dynamicPalette);
            }

            @Override
            public Color getContainerOutline() {
                return colorResolver.getContainerOutline(dynamicPalette);
            }

            @Override
            public Color getContainerOutlineVariant() {
                return colorResolver.getContainerOutlineVariant(dynamicPalette);
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return colorResolver.getContainerSurfaceDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return colorResolver.getOnContainerDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return colorResolver.getContainerOutlineDisabledAlpha(dynamicPalette);
            }

            @Override
            public Color getInverseContainerSurface() {
                return colorResolver.getInverseContainerSurface(dynamicPalette);
            }

            @Override
            public Color getInverseOnContainer() {
                return colorResolver.getInverseOnContainer(dynamicPalette);
            }

            @Override
            public Color getInverseContainerOutline() {
                return colorResolver.getInverseContainerOutline(dynamicPalette);
            }

            @Override
            public Color getComplementaryOnContainer() {
                return colorResolver.getComplementaryOnContainer(dynamicPalette);
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return colorResolver.getComplementaryContainerOutline(dynamicPalette);
            }
        };
    }

    public static ExtendedContainerColorTokens getExtendedContainerTokens(
        Hct seed,
        boolean isFidelity,
        boolean isDark) {
        return getExtendedContainerTokens(seed, isFidelity, isDark, 0.0,
            PaletteResolverUtils.getPaletteTonalColorResolver());
    }

    public static ExtendedContainerColorTokens getExtendedContainerTokens(
        Hct seed,
        boolean isFidelity,
        boolean isDark,
        double contrastLevel,
        PaletteContainerColorsResolver colorResolver) {

        DynamicPalette dynamicPalette = new DynamicPalette(
            /* sourceColorHct */ seed,
            /* isFidelity */ isFidelity,
            /* isDark */ isDark,
            /* contrastLevel */ contrastLevel);

        ContainerColorTokens baseTokens = getContainerTokens(seed, isFidelity, isDark,
            contrastLevel, colorResolver);

        return new ExtendedContainerColorTokens() {
            @Override
            public Color getSurface() {
                return colorResolver.getSurface(dynamicPalette);
            }

            @Override
            public Color getSurfaceDim() {
                return colorResolver.getSurfaceDim(dynamicPalette);
            }

            @Override
            public Color getSurfaceBright() {
                return colorResolver.getSurfaceBright(dynamicPalette);
            }

            @Override
            public Color getInverseSurface() {
                return colorResolver.getInverseSurface(dynamicPalette);
            }

            @Override
            public ContainerColorTokens getBaseContainerTokens() {
                return baseTokens;
            }
        };
    }

    public static ExtendedContainerColorTokens getExtendedContainerTokens(
        Hct seedOne,
        Hct seedTwo,
        DynamicBimodalPalette.TransitionRange transitionRange,
        boolean isDark,
        double fidelityTone) {
        return getExtendedContainerTokens(seedOne, seedTwo, transitionRange, isDark, fidelityTone,
            0.0, BimodalPaletteResolverUtils.getBimodalPaletteTonalColorResolver());
    }

    public static ExtendedContainerColorTokens getExtendedContainerTokens(
        Hct seedOne,
        Hct seedTwo,
        DynamicBimodalPalette.TransitionRange transitionRange,
        boolean isDark,
        double fidelityTone,
        double contrastLevel,
        BimodalPaletteContainerColorsResolver colorResolver) {

        DynamicBimodalPalette dynamicPalette =  DynamicBimodalPalette.fidelity(
            /* seedOne */ seedOne,
            /* seedTwo */ seedTwo,
            /* transitionRange */ transitionRange,
            /* isDark */ isDark,
            /* fidelityTone */ fidelityTone,
            /* isContrastLevel */ contrastLevel);

        ContainerColorTokens baseTokens = getContainerTokens(seedOne, seedTwo,
            transitionRange, isDark, fidelityTone, contrastLevel, colorResolver);

        return new ExtendedContainerColorTokens() {
            @Override
            public Color getSurface() {
                return colorResolver.getSurface(dynamicPalette);
            }

            @Override
            public Color getSurfaceDim() {
                return colorResolver.getSurfaceDim(dynamicPalette);
            }

            @Override
            public Color getSurfaceBright() {
                return colorResolver.getSurfaceBright(dynamicPalette);
            }

            @Override
            public Color getInverseSurface() {
                return colorResolver.getInverseSurface(dynamicPalette);
            }

            @Override
            public ContainerColorTokens getBaseContainerTokens() {
                return baseTokens;
            }
        };
    }

    public static ContainerColorTokens getContainerTokens(
        Hct seedOne,
        Hct seedTwo,
        DynamicBimodalPalette.TransitionRange transitionRange,
        boolean isDark,
        double fidelityTone,
        double contrastLevel,
        BimodalPaletteContainerColorsResolver colorResolver) {

        DynamicBimodalPalette dynamicPalette =  DynamicBimodalPalette.fidelity(
            /* seedOne */ seedOne,
            /* seedTwo */ seedTwo,
            /* transitionRange */ transitionRange,
            /* isDark */ isDark,
            /* fidelityTone */ fidelityTone,
            /* isContrastLevel */ contrastLevel);

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return dynamicPalette.isDark;
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return colorResolver.getContainerSurfaceLowest(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceLow() {
                return colorResolver.getContainerSurfaceLow(dynamicPalette);
            }

            @Override
            public Color getContainerSurface() {
                return colorResolver.getContainerSurface(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return colorResolver.getContainerSurfaceHigh(dynamicPalette);
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return colorResolver.getContainerSurfaceHighest(dynamicPalette);
            }

            @Override
            public Color getOnContainer() {
                return colorResolver.getOnContainer(dynamicPalette);
            }

            @Override
            public Color getOnContainerVariant() {
                return colorResolver.getOnContainerVariant(dynamicPalette);
            }

            @Override
            public Color getContainerOutline() {
                return colorResolver.getContainerOutline(dynamicPalette);
            }

            @Override
            public Color getContainerOutlineVariant() {
                return colorResolver.getContainerOutlineVariant(dynamicPalette);
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return colorResolver.getContainerSurfaceDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return colorResolver.getOnContainerDisabledAlpha(dynamicPalette);
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return colorResolver.getContainerOutlineDisabledAlpha(dynamicPalette);
            }

            @Override
            public Color getInverseContainerSurface() {
                return colorResolver.getInverseContainerSurface(dynamicPalette);
            }

            @Override
            public Color getInverseOnContainer() {
                return colorResolver.getInverseOnContainer(dynamicPalette);
            }

            @Override
            public Color getInverseContainerOutline() {
                return colorResolver.getInverseContainerOutline(dynamicPalette);
            }

            @Override
            public Color getComplementaryOnContainer() {
                return colorResolver.getComplementaryOnContainer(dynamicPalette);
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return colorResolver.getComplementaryContainerOutline(dynamicPalette);
            }
        };
    }

    /**
     * Cache of blended schemes.
     */
    private final static LazyResettableHashMap<ContainerColorTokens> blendedCache =
        new LazyResettableHashMap<>("ColorSchemeUtils.blendedTokens");
    private final static LazyResettableHashMap<ExtendedContainerColorTokens> blendedExtendedCache =
        new LazyResettableHashMap<>("ColorSchemeUtils.blendedExtendedTokens");

    public static ContainerColorTokens getColorizedTokens(Component component,
        ContainerColorTokens tokens, boolean isEnabled) {
        Component forQuerying = component;
        if ((component != null) && (component.getParent() != null)
            && ((component.getClass().isAnnotationPresent(RadianceInternalArrowButton.class)
            || (component instanceof RadianceTitleButton)))) {
            forQuerying = component.getParent();
        }
        return getColorizedTokens(component, tokens,
            (forQuerying == null) ? null : forQuerying.getForeground(),
            (forQuerying == null) ? null : forQuerying.getBackground(), isEnabled);
    }

    public static ContainerColorTokens getColorizedTokens(Component component,
        ContainerColorTokens tokens, Color fgColor, Color bgColor, boolean isEnabled) {
        if ((tokens != null) && (component != null)) {
            // Support for enhancement 256 - colorizing
            // controls.
            if (bgColor instanceof UIResource) {
                bgColor = null;
            }
            if (fgColor instanceof UIResource) {
                fgColor = null;
            }
            if ((bgColor != null) || (fgColor != null)) {
                double colorization = RadianceCoreUtilities.getColorizationFactor(component);
                if (!isEnabled) {
                    colorization /= 2.0;
                }
                if (colorization > 0.0) {
                    return getBlendedTokens(tokens, bgColor, colorization, fgColor, colorization);
                }
            }
        }
        return tokens;
    }

    public static ContainerColorTokens getBlendedTokens(ContainerColorTokens original,
        Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
        double foregroundShiftFactor) {
        HashMapKey key = RadianceCoreUtilities.getHashKey(original,
            backgroundShiftColor == null ? "" : backgroundShiftColor.getRGB(),
            backgroundShiftFactor,
            foregroundShiftColor == null ? "" : foregroundShiftColor.getRGB(),
            foregroundShiftFactor);
        ContainerColorTokens result = blendedCache.get(key);
        if (result == null) {
            result = blendTowards(original, backgroundShiftColor, backgroundShiftFactor,
                foregroundShiftColor, foregroundShiftFactor);
            blendedCache.put(key, result);
        }
        return result;
    }

    private static ContainerColorTokens blendTowards(ContainerColorTokens original,
        Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
        double foregroundShiftFactor) {

        Color containerSurfaceLowest = (backgroundShiftColor == null)
            ? original.getContainerSurfaceLowest()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceLowest().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceLow = (backgroundShiftColor == null)
            ? original.getContainerSurfaceLow()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceLow().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurface = (backgroundShiftColor == null)
            ? original.getContainerSurface()
            : new Color(Blend.harmonizeAll(original.getContainerSurface().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceHigh = (backgroundShiftColor == null)
            ? original.getContainerSurfaceHigh()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceHigh().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceHighest = (backgroundShiftColor == null)
            ? original.getContainerSurfaceHighest()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceHighest().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color onContainer = (foregroundShiftColor == null)
            ? original.getOnContainer()
            : new Color(Blend.harmonizeAll(original.getOnContainer().getRGB(),
                foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color onContainerVariant = (foregroundShiftColor == null)
            ? original.getOnContainerVariant()
            : new Color(Blend.harmonizeAll(original.getOnContainerVariant().getRGB(),
                foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color containerOutline = (backgroundShiftColor == null)
            ? original.getContainerOutline()
            : new Color(Blend.harmonizeAll(original.getContainerOutline().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerOutlineVariant = (backgroundShiftColor == null)
            ? original.getContainerOutlineVariant()
            : new Color(Blend.harmonizeAll(original.getContainerOutlineVariant().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color inverseContainerSurface = (backgroundShiftColor == null)
            ? original.getInverseContainerSurface()
            : new Color(Blend.harmonizeAll(original.getInverseContainerSurface().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color inverseOnContainer = (foregroundShiftColor == null)
            ? original.getInverseOnContainer()
            : new Color(Blend.harmonizeAll(original.getInverseOnContainer().getRGB(),
                foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color inverseContainerOutline = (backgroundShiftColor == null)
            ? original.getInverseContainerOutline()
            : new Color(Blend.harmonizeAll(original.getInverseContainerOutline().getRGB(),
                backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color complementaryOnContainer = (foregroundShiftColor == null)
            ? original.getComplementaryOnContainer()
            : new Color(Blend.harmonizeAll(original.getComplementaryOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color complementaryContainerOutline = (backgroundShiftColor == null)
            ? original.getComplementaryContainerOutline()
            : new Color(Blend.harmonizeAll(original.getComplementaryContainerOutline().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return containerSurfaceLowest;
            }

            @Override
            public Color getContainerSurfaceLow() {
                return containerSurfaceLow;
            }

            @Override
            public Color getContainerSurface() {
                return containerSurface;
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return containerSurfaceHigh;
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return containerSurfaceHighest;
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
            public float getContainerSurfaceDisabledAlpha() {
                return original.getContainerSurfaceDisabledAlpha();
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return original.getOnContainerDisabledAlpha();
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return original.getContainerOutlineDisabledAlpha();
            }

            @Override
            public Color getInverseContainerSurface() {
                return inverseContainerSurface;
            }

            @Override
            public Color getInverseOnContainer() {
                return inverseOnContainer;
            }

            @Override
            public Color getInverseContainerOutline() {
                return inverseContainerOutline;
            }

            @Override
            public Color getComplementaryOnContainer() {
                return complementaryOnContainer;
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return complementaryContainerOutline;
            }
        };
    }

    public static ExtendedContainerColorTokens getBlendedTokens(ExtendedContainerColorTokens original,
        Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
        double foregroundShiftFactor) {
        HashMapKey key = RadianceCoreUtilities.getHashKey(original,
            backgroundShiftColor == null ? "" : backgroundShiftColor.getRGB(),
            backgroundShiftFactor,
            foregroundShiftColor == null ? "" : foregroundShiftColor.getRGB(),
            foregroundShiftFactor);
        ExtendedContainerColorTokens result = blendedExtendedCache.get(key);
        if (result == null) {
            result = blendTowards(original, backgroundShiftColor, backgroundShiftFactor,
                foregroundShiftColor, foregroundShiftFactor);
            blendedExtendedCache.put(key, result);
        }
        return result;
    }

    private static ExtendedContainerColorTokens blendTowards(ExtendedContainerColorTokens original,
        Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
        double foregroundShiftFactor) {

        Color surface = (backgroundShiftColor == null)
            ? original.getSurface()
            : new Color(Blend.harmonizeAll(original.getSurface().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color surfaceDim = (backgroundShiftColor == null)
            ? original.getSurfaceDim()
            : new Color(Blend.harmonizeAll(original.getSurfaceDim().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color surfaceBright = (backgroundShiftColor == null)
            ? original.getSurfaceBright()
            : new Color(Blend.harmonizeAll(original.getSurfaceBright().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color inverseSurface = (backgroundShiftColor == null)
            ? original.getInverseSurface()
            : new Color(Blend.harmonizeAll(original.getInverseSurface().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        ContainerColorTokens rest = blendTowards(original.getBaseContainerTokens(),
            backgroundShiftColor, backgroundShiftFactor,
            foregroundShiftColor, foregroundShiftFactor);

        return new ExtendedContainerColorTokens() {
            @Override
            public Color getSurface() {
                return surface;
            }

            @Override
            public Color getSurfaceDim() {
                return surfaceDim;
            }

            @Override
            public Color getSurfaceBright() {
                return surfaceBright;
            }

            @Override
            public Color getInverseSurface() {
                return inverseSurface;
            }

            @Override
            public ContainerColorTokens getBaseContainerTokens() {
                return rest;
            }
        };
    }
}
