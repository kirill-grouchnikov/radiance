/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.ephemeral.chroma.palettes.TonalPalette;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ContainerColorTokensOverlay {
    private final ContainerColorTokens activeContainerTokens;
    private final ContainerColorTokens mutedContainerTokens;
    private final ContainerColorTokens neutralContainerTokens;
    private final Map<ComponentState, ContainerColorTokens> activeTokenOverrides;

    public interface Provider {
        ContainerColorTokensOverlay getOverlay(
            RadianceSkin skin, RadianceThemingSlices.DecorationAreaType decorationAreaType);
    }

    public ContainerColorTokensOverlay(ContainerColorTokens activeContainerTokens,
        ContainerColorTokens mutedContainerTokens, ContainerColorTokens neutralContainerTokens) {
        this.activeContainerTokens = activeContainerTokens;
        this.mutedContainerTokens = mutedContainerTokens;
        this.neutralContainerTokens = neutralContainerTokens;
        this.activeTokenOverrides = new HashMap<>();
    }

    public static abstract class DefaultOverlayProvider implements Provider {
        private LazyResettableHashMap<ContainerColorTokensOverlay> overlays =
            new LazyResettableHashMap<>("ContainerColorTokensOverlay.DefaultOverlayProvider");

        protected abstract ContainerColorTokens getContainerTokens(RadianceSkin skin,
            RadianceThemingSlices.DecorationAreaType decorationAreaType);
        protected abstract ContainerColorTokens getInverseContainerTokens(RadianceSkin skin,
            RadianceThemingSlices.DecorationAreaType decorationAreaType);

        @Override
        public ContainerColorTokensOverlay getOverlay(RadianceSkin skin,
            RadianceThemingSlices.DecorationAreaType decorationAreaType) {
            ContainerColorTokens containerTokens = this.getContainerTokens(skin,
                decorationAreaType);
            ContainerColorTokens inverseContainerTokens =
                this.getInverseContainerTokens(skin, decorationAreaType);
            HashMapKey key = RadianceCoreUtilities.getHashKey(containerTokens,
                inverseContainerTokens);

            ContainerColorTokensOverlay result = this.overlays.get(key);
            if (result == null) {
                ContainerColorTokens neutralContainerTokens = new ContainerColorTokens() {
                    @Override
                    public boolean isDark() {
                        return containerTokens.isDark();
                    }

                    @Override
                    public Color getContainerSurfaceLowest() {
                        return containerTokens.getContainerSurfaceLowest();
                    }

                    @Override
                    public Color getContainerSurfaceLow() {
                        return containerTokens.getContainerSurfaceLow();
                    }

                    @Override
                    public Color getContainerSurface() {
                        return containerTokens.getContainerSurface();
                    }

                    @Override
                    public Color getContainerSurfaceHigh() {
                        return containerTokens.getContainerSurfaceHigh();
                    }

                    @Override
                    public Color getContainerSurfaceHighest() {
                        return containerTokens.getContainerSurfaceHighest();
                    }

                    @Override
                    public Color getContainerSurfaceDim() {
                        return containerTokens.getContainerSurfaceDim();
                    }

                    @Override
                    public Color getContainerSurfaceBright() {
                        return containerTokens.getContainerSurfaceBright();
                    }

                    @Override
                    public Color getContainerShadow() {
                        return containerTokens.getContainerShadow();
                    }

                    @Override
                    public Color getOnContainer() {
                        return containerTokens.getAccentOnContainer();
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return RadianceColorUtilities.getAlphaColor(
                            containerTokens.getAccentOnContainer(), 240);
                    }

                    @Override
                    public Color getContainerOutline() {
                        return containerTokens.getContainerOutline();
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return containerTokens.getContainerOutlineVariant();
                    }

                    @Override
                    public float getContainerSurfaceEnabledAlpha() {
                        return containerTokens.getContainerSurfaceEnabledAlpha();
                    }

                    @Override
                    public float getContainerOutlineEnabledAlpha() {
                        return containerTokens.getContainerOutlineEnabledAlpha();
                    }

                    @Override
                    public float getOnContainerEnabledAlpha() {
                        return containerTokens.getOnContainerEnabledAlpha();
                    }

                    @Override
                    public float getContainerSurfaceDisabledAlpha() {
                        return containerTokens.getContainerSurfaceDisabledAlpha();
                    }

                    @Override
                    public float getOnContainerDisabledAlpha() {
                        return containerTokens.getOnContainerDisabledAlpha();
                    }

                    @Override
                    public float getContainerOutlineDisabledAlpha() {
                        return containerTokens.getContainerOutlineDisabledAlpha();
                    }

                    @Override
                    public Color getInverseContainerSurface() {
                        return containerTokens.getInverseContainerSurface();
                    }

                    @Override
                    public Color getInverseOnContainer() {
                        return containerTokens.getInverseOnContainer();
                    }

                    @Override
                    public Color getInverseContainerOutline() {
                        return containerTokens.getInverseContainerOutline();
                    }

                    @Override
                    public Color getComplementaryOnContainer() {
                        return containerTokens.getComplementaryOnContainer();
                    }

                    @Override
                    public Color getComplementaryContainerOutline() {
                        return containerTokens.getComplementaryContainerOutline();
                    }

                    @Override
                    public Color getAccentOnContainer() {
                        return containerTokens.getAccentOnContainer();
                    }
                };

                result = new ContainerColorTokensOverlay(
                    inverseContainerTokens,
                    containerTokens,
                    neutralContainerTokens);
                this.overlays.put(key, result);
            }

            return result;
        }
    }

    public static ContainerColorTokensOverlay.Provider defaultSystemOverlayProvider(
        RadianceThemingSlices.SystemContainerType systemContainerType) {

        return new DefaultOverlayProvider() {
            @Override
            protected ContainerColorTokens getContainerTokens(RadianceSkin skin,
                RadianceThemingSlices.DecorationAreaType decorationAreaType) {
                return skin.getSystemContainerTokens(decorationAreaType, systemContainerType);
            }

            @Override
            protected ContainerColorTokens getInverseContainerTokens(RadianceSkin skin,
                RadianceThemingSlices.DecorationAreaType decorationAreaType) {
                return skin.getInverseSystemContainerTokens(decorationAreaType, systemContainerType);
            }
        };
    }

    public static ContainerColorTokensOverlay.Provider defaultOverlayProvider(Color seed) {
        return new DefaultOverlayProvider() {
            private ContainerColorTokens lightTokens = ContainerColorTokensUtils.getContainerTokens(
                /* seed */ TonalPalette.fromHct(Hct.fromInt(seed.getRGB())).getHct(85),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());
            private ContainerColorTokens darkTokens = ContainerColorTokensUtils.getContainerTokens(
                /* seed */ TonalPalette.fromHct(Hct.fromInt(seed.getRGB())).getHct(40),
                /* containerConfiguration */ ContainerConfiguration.defaultDark());

            @Override
            protected ContainerColorTokens getContainerTokens(RadianceSkin skin,
                RadianceThemingSlices.DecorationAreaType decorationAreaType) {

                ContainerColorTokens neutrals = skin.getNeutralContainerTokens(decorationAreaType);
                return neutrals.isDark() ? darkTokens : lightTokens;
            }

            @Override
            protected ContainerColorTokens getInverseContainerTokens(RadianceSkin skin,
                RadianceThemingSlices.DecorationAreaType decorationAreaType) {

                ContainerColorTokens neutrals = skin.getNeutralContainerTokens(decorationAreaType);
                return neutrals.isDark() ? lightTokens : darkTokens;
            }
        };
    }

    protected static abstract class DefaultMenuOverlayProvider implements Provider {
        private LazyResettableHashMap<ContainerColorTokensOverlay> overlays =
            new LazyResettableHashMap<>("ContainerColorTokensOverlay.DefaultMenuOverlayProvider");

        protected abstract ContainerColorTokens getContainerTokens(RadianceSkin skin,
            RadianceThemingSlices.DecorationAreaType decorationAreaType);

        @Override
        public ContainerColorTokensOverlay getOverlay(RadianceSkin skin,
            RadianceThemingSlices.DecorationAreaType decorationAreaType) {
            ContainerColorTokens systemContainerTokens = this.getContainerTokens(skin,
                decorationAreaType);
            HashMapKey key = RadianceCoreUtilities.getHashKey(systemContainerTokens);

            ContainerColorTokensOverlay result = this.overlays.get(key);
            if (result == null) {
                ContainerColorTokens neutralContainerTokens = new ContainerColorTokens() {
                    @Override
                    public boolean isDark() {
                        return systemContainerTokens.isDark();
                    }

                    @Override
                    public Color getContainerSurfaceLowest() {
                        return systemContainerTokens.getContainerSurfaceLowest();
                    }

                    @Override
                    public Color getContainerSurfaceLow() {
                        return systemContainerTokens.getContainerSurfaceLow();
                    }

                    @Override
                    public Color getContainerSurface() {
                        return systemContainerTokens.getContainerSurface();
                    }

                    @Override
                    public Color getContainerSurfaceHigh() {
                        return systemContainerTokens.getContainerSurfaceHigh();
                    }

                    @Override
                    public Color getContainerSurfaceHighest() {
                        return systemContainerTokens.getContainerSurfaceHighest();
                    }

                    @Override
                    public Color getContainerSurfaceDim() {
                        return systemContainerTokens.getContainerSurfaceDim();
                    }

                    @Override
                    public Color getContainerSurfaceBright() {
                        return systemContainerTokens.getContainerSurfaceBright();
                    }

                    @Override
                    public Color getContainerShadow() {
                        return systemContainerTokens.getContainerShadow();
                    }

                    @Override
                    public Color getOnContainer() {
                        return systemContainerTokens.getAccentOnContainer();
                    }

                    @Override
                    public Color getOnContainerVariant() {
                        return RadianceColorUtilities.getAlphaColor(
                            systemContainerTokens.getAccentOnContainer(), 240);
                    }

                    @Override
                    public Color getContainerOutline() {
                        return systemContainerTokens.getContainerOutline();
                    }

                    @Override
                    public Color getContainerOutlineVariant() {
                        return systemContainerTokens.getContainerOutlineVariant();
                    }

                    @Override
                    public float getContainerSurfaceEnabledAlpha() {
                        return systemContainerTokens.getContainerSurfaceEnabledAlpha();
                    }

                    @Override
                    public float getContainerOutlineEnabledAlpha() {
                        return systemContainerTokens.getContainerOutlineEnabledAlpha();
                    }

                    @Override
                    public float getOnContainerEnabledAlpha() {
                        return systemContainerTokens.getOnContainerEnabledAlpha();
                    }

                    @Override
                    public float getContainerSurfaceDisabledAlpha() {
                        return systemContainerTokens.getContainerSurfaceDisabledAlpha();
                    }

                    @Override
                    public float getOnContainerDisabledAlpha() {
                        return systemContainerTokens.getOnContainerDisabledAlpha();
                    }

                    @Override
                    public float getContainerOutlineDisabledAlpha() {
                        return systemContainerTokens.getContainerOutlineDisabledAlpha();
                    }

                    @Override
                    public Color getInverseContainerSurface() {
                        return systemContainerTokens.getInverseContainerSurface();
                    }

                    @Override
                    public Color getInverseOnContainer() {
                        return systemContainerTokens.getInverseOnContainer();
                    }

                    @Override
                    public Color getInverseContainerOutline() {
                        return systemContainerTokens.getInverseContainerOutline();
                    }

                    @Override
                    public Color getComplementaryOnContainer() {
                        return systemContainerTokens.getComplementaryOnContainer();
                    }

                    @Override
                    public Color getComplementaryContainerOutline() {
                        return systemContainerTokens.getComplementaryContainerOutline();
                    }

                    @Override
                    public Color getAccentOnContainer() {
                        return systemContainerTokens.getAccentOnContainer();
                    }
                };

                result = new ContainerColorTokensOverlay(
                    systemContainerTokens,
                    systemContainerTokens,
                    neutralContainerTokens);
                this.overlays.put(key, result);
            }

            return result;
        }
    }

    public static ContainerColorTokensOverlay.Provider defaultMenuSystemOverlayProvider(
        RadianceThemingSlices.SystemContainerType systemContainerType) {

        return new DefaultMenuOverlayProvider() {
            @Override
            protected ContainerColorTokens getContainerTokens(RadianceSkin skin,
                RadianceThemingSlices.DecorationAreaType decorationAreaType) {
                return skin.getSystemContainerTokens(decorationAreaType, systemContainerType);
            }
        };
    }

    public static ContainerColorTokensOverlay.Provider defaultMenuOverlayProvider(Color seed) {
        return new DefaultMenuOverlayProvider() {
            private ContainerColorTokens lightTokens = ContainerColorTokensUtils.getContainerTokens(
                /* seed */ TonalPalette.fromHct(Hct.fromInt(seed.getRGB())).getHct(85),
                /* containerConfiguration */ ContainerConfiguration.defaultLight());
            private ContainerColorTokens darkTokens = ContainerColorTokensUtils.getContainerTokens(
                /* seed */ TonalPalette.fromHct(Hct.fromInt(seed.getRGB())).getHct(40),
                /* containerConfiguration */ ContainerConfiguration.defaultDark());

            @Override
            protected ContainerColorTokens getContainerTokens(RadianceSkin skin,
                RadianceThemingSlices.DecorationAreaType decorationAreaType) {

                ContainerColorTokens neutrals = skin.getNeutralContainerTokens(decorationAreaType);
                return neutrals.isDark() ? darkTokens : lightTokens;
            }
        };
    }

    public ContainerColorTokens getNeutralContainerTokens() {
        return this.neutralContainerTokens;
    }

    public ContainerColorTokens getMutedContainerTokens() {
        return this.mutedContainerTokens;
    }

    public ContainerColorTokens getActiveContainerTokens(ComponentState componentState) {
        if (componentState.isDisabled()) {
            return getActiveContainerTokens(componentState.getEnabledMatch());
        }

        if (!componentState.isActive()) {
            throw new IllegalArgumentException("Only active states supported");
        }

        ContainerColorTokens registered = this.activeTokenOverrides.get(componentState);
        if (registered != null) {
            return registered;
        } else {
            return this.getActiveContainerTokensForState(componentState);
        }
    }

    private ContainerColorTokens getActiveContainerTokensForState(ComponentState componentState) {
        if (componentState.isDisabled()) {
            return getActiveContainerTokensForState(componentState.getEnabledMatch());
        }

        ContainerColorTokens activeTokens = this.activeContainerTokens;

        if ((componentState == ComponentState.PRESSED_UNSELECTED) || (componentState == ComponentState.ARMED)) {
            if (!this.activeTokenOverrides.containsKey(componentState)) {
                this.activeTokenOverrides.put(componentState,
                    CoreColorTokenUtils.getPressedUnselectedTokens(activeTokens));
            }
            return this.activeTokenOverrides.get(componentState);
        }
        if (componentState == ComponentState.PRESSED_SELECTED) {
            if (!this.activeTokenOverrides.containsKey(componentState)) {
                this.activeTokenOverrides.put(componentState,
                    CoreColorTokenUtils.getPressedSelectedTokens(activeTokens));
            }
            return this.activeTokenOverrides.get(componentState);
        }
        if (componentState == ComponentState.SELECTED) {
            if (!this.activeTokenOverrides.containsKey(componentState)) {
                this.activeTokenOverrides.put(componentState, activeTokens);
            }
            return this.activeTokenOverrides.get(componentState);
        }
        if (componentState == ComponentState.ROLLOVER_UNSELECTED) {
            if (!this.activeTokenOverrides.containsKey(componentState)) {
                this.activeTokenOverrides.put(componentState,
                    CoreColorTokenUtils.getRolloverUnselectedTokens(activeTokens));
            }
            return this.activeTokenOverrides.get(componentState);
        }
        if (componentState == ComponentState.ROLLOVER_SELECTED) {
            if (!this.activeTokenOverrides.containsKey(componentState)) {
                this.activeTokenOverrides.put(componentState,
                    CoreColorTokenUtils.getRolloverSelectedTokens(activeTokens));
            }
            return this.activeTokenOverrides.get(componentState);
        }
        if (componentState == ComponentState.ROLLOVER_ARMED) {
            if (!this.activeTokenOverrides.containsKey(componentState)) {
                this.activeTokenOverrides.put(componentState,
                    CoreColorTokenUtils.getRolloverArmedTokens(activeTokens));
            }
            return this.activeTokenOverrides.get(componentState);
        }

        ComponentState hardFallback = componentState.getHardFallback();
        if (hardFallback != null) {
            return this.getActiveContainerTokensForState(hardFallback);
        }

        if (componentState == ComponentState.ENABLED) {
            return getMutedContainerTokens();
        }
        return activeTokens;
    }
}

