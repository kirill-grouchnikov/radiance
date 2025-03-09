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
package org.pushingpixels.radiance.theming.api;

import org.pushingpixels.ephemeral.chroma.dynamiccolor.ContainerConfiguration;
import org.pushingpixels.ephemeral.chroma.hct.Hct;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

import java.util.HashMap;
import java.util.Map;

/**
 * Color scheme bundle. Defines the visual appearance of a single decoration area of a skin.
 *
 * @author Kirill Grouchnikov
 * @see RadianceThemingSlices.DecorationAreaType
 * @see RadianceThemingSlices.ContainerColorTokensAssociationKind
 * @see RadianceSkin
 */
public class RadianceColorSchemeBundle {
    // The main color scheme of this bundle
    private RadianceColorScheme mainColorScheme;

    /**
     * Maps from color scheme association kinds to the map of color tokens. Controls in the specific
     * decoration area can use different colors for different active states, for example yellow
     * for rollover and deep orange for pressed. In this case, this map will have an entry with
     * {@link RadianceThemingSlices.ContainerColorTokensAssociationKind#DEFAULT} key and a value
     * map with two entries:
     *
     * <ul>
     * <li>A map entry with key {@link ComponentState#ROLLOVER_UNSELECTED} and value that
     * points to the yellow color tokens.</li>
     * <li>A map entry with key {@link ComponentState#PRESSED_UNSELECTED} and value that
     * points to the deep orange color tokens.</li>
     * </ul>
     */
    private Map<RadianceThemingSlices.ContainerColorTokensAssociationKind,
        Map<ComponentState, ContainerColorTokens>> colorTokensForActiveStates;

    private Map<RadianceThemingSlices.ContainerColorTokensAssociationKind, ContainerColorTokens> colorTokensForEnabledState;

    public interface Overlay {
        void overlay(RadianceColorSchemeBundle bundle);
    }

    public RadianceColorSchemeBundle(ContainerColorTokens activeContainerTokens,
        ContainerColorTokens mutedContainerTokens, ContainerColorTokens neutralContainerTokens,
        boolean isSystemDark) {
        if ((activeContainerTokens == null) || (mutedContainerTokens == null)
            || (neutralContainerTokens == null)) {
            throw new IllegalArgumentException("Cannot pass null tokens");
        }

        ContainerColorTokens systemInfoLightTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFBFE6FE),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemWarningLightTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFCE352),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemErrorLightTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFFFDACA),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemSuccessLightTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF8EFA9D),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());

        ContainerColorTokens systemInfoDarkTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF1060D0),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemWarningDarkTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFBC6213),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemErrorDarkTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFFC01707),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemSuccessDarkTokens = ColorSchemeUtils.getContainerTokens(
            /* seed */ Hct.fromInt(0xFF008817),
            /* containerConfiguration */ ContainerConfiguration.defaultLight());

        this.mainColorScheme = new RadianceColorScheme() {
            private HashMap<ComponentState, ContainerColorTokens> stateTokens = new HashMap<>();

            @Override
            public ContainerColorTokens getNeutralContainerTokens() {
                return neutralContainerTokens;
            }

            @Override
            public ContainerColorTokens getMutedContainerTokens() {
                return mutedContainerTokens;
            }

            @Override
            public ContainerColorTokens getActiveContainerTokens() {
                return activeContainerTokens;
            }

            @Override
            public ContainerColorTokens getSystemInfoContainerTokens() {
                return isSystemDark ? systemInfoDarkTokens : systemInfoLightTokens;
            }

            @Override
            public ContainerColorTokens getInverseSystemInfoContainerTokens() {
                return isSystemDark ? systemInfoLightTokens : systemInfoDarkTokens;
            }

            @Override
            public ContainerColorTokens getSystemWarningContainerTokens() {
                return isSystemDark ? systemWarningDarkTokens : systemWarningLightTokens;
            }

            @Override
            public ContainerColorTokens getInverseSystemWarningContainerTokens() {
                return isSystemDark ? systemWarningLightTokens : systemWarningDarkTokens;
            }

            @Override
            public ContainerColorTokens getSystemErrorContainerTokens() {
                return isSystemDark ? systemErrorDarkTokens : systemErrorLightTokens;
            }

            @Override
            public ContainerColorTokens getInverseSystemErrorContainerTokens() {
                return isSystemDark ? systemErrorLightTokens : systemErrorDarkTokens;
            }

            @Override
            public ContainerColorTokens getSystemSuccessContainerTokens() {
                return isSystemDark ? systemSuccessDarkTokens : systemSuccessLightTokens;
            }

            @Override
            public ContainerColorTokens getInverseSystemSuccessContainerTokens() {
                return isSystemDark ? systemSuccessLightTokens : systemSuccessDarkTokens;
            }

            @Override
            public ContainerColorTokens getContainerTokensForState(ComponentState componentState) {
                if (componentState.isDisabled()) {
                    return getContainerTokensForState(componentState.getEnabledMatch());
                }

                ContainerColorTokens tonals = getActiveContainerTokens();
                if ((componentState == ComponentState.PRESSED_UNSELECTED) ||
                    (componentState == ComponentState.ARMED)) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState,
                            ColorSchemeUtils.getPressedUnselectedTokens(tonals));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.PRESSED_SELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState,
                            ColorSchemeUtils.getPressedSelectedTokens(tonals));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.SELECTED) {
                    return tonals;
                }
                if (componentState == ComponentState.ROLLOVER_UNSELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState,
                            ColorSchemeUtils.getRolloverUnselectedTokens(tonals));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.ROLLOVER_SELECTED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState,
                            ColorSchemeUtils.getRolloverSelectedTokens(tonals));
                    }
                    return stateTokens.get(componentState);
                }
                if (componentState == ComponentState.ROLLOVER_ARMED) {
                    if (!stateTokens.containsKey(componentState)) {
                        stateTokens.put(componentState,
                            ColorSchemeUtils.getRolloverArmedTokens(tonals));
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
                return tonals;
            }
        };

        this.colorTokensForEnabledState = new HashMap<>();
        this.colorTokensForActiveStates = new HashMap<>();
        for (RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind :
            RadianceThemingSlices.ContainerColorTokensAssociationKind.values()) {
            this.colorTokensForActiveStates.put(associationKind, new HashMap<>());
        }

    }

    /**
     * Registers container color tokens for the specific active component states.
     *
     * @param stateContainerTokens Container color tokens for the specified active component states.
     * @param activeStates         Component states.
     */
    public void registerActiveContainerTokens(ContainerColorTokens stateContainerTokens,
        ComponentState... activeStates) {
        this.registerActiveContainerTokens(stateContainerTokens,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT,
            activeStates);
    }

    /**
     * Registers the container color tokens to be used for controls in specified active states.
     * For example, if light orange color tokens are to be used for rollover selected and rollover
     * controls in highlights, the parameters would be:
     *
     * <ul>
     * <li><code>stateContainerTokens</code>=light orange color tokens</li>
     * <li><code>associationKind</code>={@link RadianceThemingSlices.ContainerColorTokensAssociationKind#HIGHLIGHT}</li>
     * <li><code>states</code>={@link ComponentState#ROLLOVER_SELECTED}, {@link ComponentState#ROLLOVER_UNSELECTED}</li>
     * </ul>
     *
     * @param stateContainerTokens Container color tokens for the specified active component states.
     * @param associationKind Color scheme association kind that specifies the visual areas
     *                        of controls to be painted with this color scheme.
     * @param activeStates          Component states that further restrict the usage of the
     *                        specified color scheme.
     */
    public void registerActiveContainerTokens(ContainerColorTokens stateContainerTokens,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState... activeStates) {
        if (stateContainerTokens == null) {
            throw new IllegalArgumentException("Cannot pass null color tokens");
        }

        if ((activeStates == null) || (activeStates.length == 0)) {
            throw new IllegalArgumentException("Must pass at least one state");
        }

        for (ComponentState state : activeStates) {
            if (state.isDisabled() || !state.isActive()) {
                throw new IllegalArgumentException("Only active states can have custom color schemes");
            }
            this.colorTokensForActiveStates.get(associationKind).put(state, stateContainerTokens);
        }
    }

    public void registerEnabledContainerTokens(ContainerColorTokens stateContainerTokens,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind) {
        if (stateContainerTokens == null) {
            throw new IllegalArgumentException("Cannot pass null color tokens");
        }

        this.colorTokensForEnabledState.put(associationKind, stateContainerTokens);
    }

    /**
     * Returns the color tokens of the specified component in the specified
     * component state.
     *
     * @param componentState Component state.
     * @return The color tokens of the component in the specified component state.
     */
    public ContainerColorTokens getContainerTokens(ComponentState componentState,
        RadianceThemingSlices.ContainerType inactiveContainerType) {
        if (componentState.isDisabled()) {
            return getContainerTokens(componentState.getEnabledMatch(), inactiveContainerType);
        }

        if (componentState.isActive()) {
            ContainerColorTokens registered = this.colorTokensForActiveStates.get(
                RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT).get(componentState);
            if (registered != null) {
                // If we're here, the component state is guaranteed to be active due to restrictions
                // in registerActiveContainerTokens
                return registered;
            } else {
                return this.mainColorScheme.getContainerTokensForState(componentState);
            }
        }

        ContainerColorTokens registered = this.colorTokensForEnabledState.get(
            RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT);
        if (registered != null) {
            return registered;
        } else {
            return this.mainColorScheme.getContainerTokens(inactiveContainerType);
        }
    }

    public ContainerColorTokens getSystemContainerTokens(
        RadianceThemingSlices.SystemContainerType systemContainerType) {
        switch (systemContainerType) {
            case INFO: return this.mainColorScheme.getSystemInfoContainerTokens();
            case WARNING: return this.mainColorScheme.getSystemWarningContainerTokens();
            case ERROR: return this.mainColorScheme.getSystemErrorContainerTokens();
            case SUCCESS:
            default:
                return this.mainColorScheme.getSystemSuccessContainerTokens();
        }
    }

    public ContainerColorTokens getInverseSystemContainerTokens(
        RadianceThemingSlices.SystemContainerType systemContainerType) {
        switch (systemContainerType) {
            case INFO: return this.mainColorScheme.getInverseSystemInfoContainerTokens();
            case WARNING: return this.mainColorScheme.getInverseSystemWarningContainerTokens();
            case ERROR: return this.mainColorScheme.getInverseSystemErrorContainerTokens();
            case SUCCESS:
            default:
                return this.mainColorScheme.getInverseSystemSuccessContainerTokens();
        }
    }

    /**
     * Returns the main color scheme of this bundle.
     *
     * @return The main color scheme of this bundle.
     */
    public RadianceColorScheme getMainColorScheme() {
        return this.mainColorScheme;
    }

    /**
     * Returns the color tokens to be used for painting components under the specified component
     * state.
     *
     * @param associationKind Color scheme association kind.
     * @param componentState  Component state.
     * @return Color tokens to be used for painting the specified visual area of
     * the component under the specified component state.
     * @see #registerActiveContainerTokens(ContainerColorTokens, ComponentState...)
     * @see #registerActiveContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState...)
     */
    public ContainerColorTokens getContainerTokens(
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState,
        RadianceThemingSlices.ContainerType inactiveContainerType) {

        if (associationKind == RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT) {
            return this.getContainerTokens(componentState, inactiveContainerType);
        }

        if (componentState.isDisabled()) {
            // Use the enabled match, and alpha will be applied during rendering
            return getContainerTokens(associationKind, componentState.getEnabledMatch(),
                inactiveContainerType);
        }

        if (componentState.isActive()) {
            ContainerColorTokens registered =
                this.colorTokensForActiveStates.get(associationKind).get(componentState);
            if (registered != null) {
                // If we're here, the component state is guaranteed to be active due to restrictions
                // in registerActiveContainerTokens
                return registered;
            }
        }

        if (componentState == ComponentState.ENABLED) {
            ContainerColorTokens registered = this.colorTokensForEnabledState.get(associationKind);
            if (registered != null) {
                return registered;
            }
        }

        RadianceThemingSlices.ContainerColorTokensAssociationKind fallback = associationKind.getFallback();
        if (fallback != null) {
            return getContainerTokens(fallback, componentState, inactiveContainerType);
        }

        return getContainerTokens(componentState, inactiveContainerType);
    }
}
