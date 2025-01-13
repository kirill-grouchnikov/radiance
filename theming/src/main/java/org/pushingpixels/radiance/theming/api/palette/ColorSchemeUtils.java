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
import org.pushingpixels.ephemeral.chroma.dynamiccolor.DynamicPalette;
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
        DynamicScheme dynamicScheme, SchemeContainerColorsResolver tonalContainerColorResolver) {

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return dynamicScheme.isDark;
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
            original.getContainerSurfaceLowest(), overlayWithAlpha);
        Color containerLow = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceLow(), overlayWithAlpha);
        Color container = RadianceColorUtilities.overlayColor(
            original.getContainerSurface(), overlayWithAlpha);
        Color containerHigh = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceHigh(), overlayWithAlpha);
        Color containerHighest = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceHighest(), overlayWithAlpha);

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
            public Color getContainerSurfaceLowest() {
                return containerLowest;
            }

            @Override
            public Color getContainerSurfaceLow() {
                return containerLow;
            }

            @Override
            public Color getContainerSurface() {
                return container;
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return containerHigh;
            }

            @Override
            public Color getContainerSurfaceHighest() {
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

            return  Palettes.builder()
                .setFidelity(false)
                .setPrimarySourceHct(this.seed)
                .setMutedSourceHct(this.seed)
                .setNeutralSourceHct(this.seed)
                .setPrimaryPalette(primaryPalette)
                .setMutedPalette(mutedPalette)
                .setNeutralPalette(neutralPalette)
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
                .setPrimarySourceHct(this.primarySeed)
                .setMutedSourceHct(this.mutedSeed)
                .setNeutralSourceHct(this.neutralSeed)
                .setPrimaryPalette(primaryPalette)
                .setMutedPalette(mutedPalette)
                .setNeutralPalette(neutralPalette)
                .build();
        }
    }

    public static RadianceColorScheme2 getColorScheme(
        PalettesSource palettesSource,
        ActiveStatesContainerType activeStatesContainerType,
        boolean isDark,
        SchemeColorResolver schemeColorResolver) {

        Palettes palettes = palettesSource.getPalettes();

        DynamicScheme scheme = new DynamicScheme(
            /* primarySourceColorHct */ palettes.getPrimarySourceHct(),
            /* mutedSourceColorHct */ palettes.getMutedSourceHct(),
            /* neutralSourceColorHct */ palettes.getNeutralSourceHct(),
            /* isFidelity */ palettes.isFidelity(),
            /* isDark */ isDark,
            /* contrastLevel */ 0.0,
            /* primaryPalette */ palettes.getPrimaryPalette(),
            /* mutedPalette */ palettes.getMutedPalette(),
            /* neutralPalette */ palettes.getNeutralPalette(),
            /* systemInfoPalette */ palettes.getSystemInfoPalette(),
            /* systemWarningPalette */ palettes.getSystemWarningPalette(),
            /* systemErrorPalette */ palettes.getSystemErrorPalette(),
            /* systemSuccessPalette */ palettes.getSystemSuccessPalette(),
            /* systemEmergencyPalette */ palettes.getSystemEmergencyPalette());

        ContainerColorTokens neutralContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getNeutralContainerResolver());
        ContainerColorTokens mutedContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getMutedContainerResolver());
        ContainerColorTokens tonalContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getTonalContainerResolver());
        ContainerColorTokens primaryContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getPrimaryContainerResolver());

        ContainerColorTokens systemInfoContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getSystemInfoContainerResolver());
        ContainerColorTokens systemWarningContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getSystemWarningContainerResolver());
        ContainerColorTokens systemErrorContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getSystemErrorContainerResolver());
        ContainerColorTokens systemSuccessContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getSystemSuccessContainerResolver());
        ContainerColorTokens systemEmergencyContainerTokens = getContainerTokens(
            scheme, schemeColorResolver.getSystemEmergencyContainerResolver());

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
                return (activeStatesContainerType == ActiveStatesContainerType.PRIMARY)
                    ? this.getPrimaryContainerTokens()
                    : this.getTonalContainerTokens();
            }

            @Override
            public ContainerColorTokens getContainerTokensForState(ComponentState componentState) {
                if (componentState.isDisabled()) {
                    // TODO: TONAL - finalize this
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

    public static ContainerColorTokens getContainerTokens(
        Hct seed,
        boolean isFidelity,
        boolean isDark,
        PaletteContainerColorsResolver colorResolver) {

        DynamicPalette dynamicPalette = new DynamicPalette(
            /* sourceColorHct */ seed,
            /* isFidelity */ isFidelity,
            /* isDark */ isDark,
            /* contrastLevel */ 0.0,
            /* palette */ TonalPalette.fromHct(seed));

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
        };
    }

    public static ExtendedContainerColorTokens getExtendedContainerTokens(
        Hct seed,
        boolean isFidelity,
        boolean isDark,
        PaletteContainerColorsResolver colorResolver) {

        DynamicPalette dynamicPalette = new DynamicPalette(
            /* sourceColorHct */ seed,
            /* isFidelity */ isFidelity,
            /* isDark */ isDark,
            /* contrastLevel */ 0.0,
            /* palette */ TonalPalette.fromHct(seed));

        ContainerColorTokens baseTokens = getContainerTokens(seed, isFidelity, isDark, colorResolver);

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
            public ContainerColorTokens getBaseContainerTokens() {
                return baseTokens;
            }
        };
    }

    public static ContainerColorTokens tint(ContainerColorTokens original, float tintFactor) {
        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return new Color(Blend.cam16Ucs(original.getContainerSurfaceLowest().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
            }

            @Override
            public Color getContainerSurfaceLow() {
                return new Color(Blend.cam16Ucs(original.getContainerSurfaceLow().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
            }

            @Override
            public Color getContainerSurface() {
                return new Color(Blend.cam16Ucs(original.getContainerSurface().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return new Color(Blend.cam16Ucs(original.getContainerSurfaceHigh().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return new Color(Blend.cam16Ucs(original.getContainerSurfaceHighest().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
            }

            @Override
            public Color getOnContainer() {
                return new Color(Blend.cam16Ucs(original.getOnContainer().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
            }

            @Override
            public Color getOnContainerVariant() {
                return new Color(Blend.cam16Ucs(original.getOnContainerVariant().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
            }

            @Override
            public Color getContainerOutline() {
                return new Color(Blend.cam16Ucs(original.getContainerOutline().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
            }

            @Override
            public Color getContainerOutlineVariant() {
                return new Color(Blend.cam16Ucs(original.getContainerOutlineVariant().getRGB(),
                    Color.WHITE.getRGB(), tintFactor));
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
        };
    }

    public static ContainerColorTokens shade(ContainerColorTokens original, float shadeFactor) {
        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return new Color(Blend.cam16Ucs(original.getContainerSurfaceLowest().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
            }

            @Override
            public Color getContainerSurfaceLow() {
                return new Color(Blend.cam16Ucs(original.getContainerSurfaceLow().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
            }

            @Override
            public Color getContainerSurface() {
                return new Color(Blend.cam16Ucs(original.getContainerSurface().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return new Color(Blend.cam16Ucs(original.getContainerSurfaceHigh().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return new Color(Blend.cam16Ucs(original.getContainerSurfaceHighest().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
            }

            @Override
            public Color getOnContainer() {
                return new Color(Blend.cam16Ucs(original.getOnContainer().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
            }

            @Override
            public Color getOnContainerVariant() {
                return new Color(Blend.cam16Ucs(original.getOnContainerVariant().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
            }

            @Override
            public Color getContainerOutline() {
                return new Color(Blend.cam16Ucs(original.getContainerOutline().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
            }

            @Override
            public Color getContainerOutlineVariant() {
                return new Color(Blend.cam16Ucs(original.getContainerOutlineVariant().getRGB(),
                    Color.BLACK.getRGB(), shadeFactor));
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
        };
    }
}
