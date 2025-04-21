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
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;
import org.pushingpixels.radiance.theming.internal.utils.SystemColorTokenUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Color tokens bundle. Defines the visual appearance of a single decoration area of a skin.
 *
 * @author Kirill Grouchnikov
 * @see RadianceThemingSlices.DecorationAreaType
 * @see RadianceThemingSlices.ContainerColorTokensAssociationKind
 * @see RadianceSkin
 */
public class ContainerColorTokensBundle {
    private final ContainerColorTokens activeContainerTokens;
    private final ContainerColorTokens mutedContainerTokens;
    private final ContainerColorTokens neutralContainerTokens;

    private final ContainerColorTokens systemInfoContainerTokens;
    private final ContainerColorTokens inverseSystemInfoContainerTokens;
    private final ContainerColorTokens systemWarningContainerTokens;
    private final ContainerColorTokens inverseSystemWarningContainerTokens;
    private final ContainerColorTokens systemErrorContainerTokens;
    private final ContainerColorTokens inverseSystemErrorContainerTokens;
    private final ContainerColorTokens systemSuccessContainerTokens;
    private final ContainerColorTokens inverseSystemSuccessContainerTokens;

    /**
     * Maps from color tokens association kinds to the map of color tokens. Controls in the specific
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
    private final Map<RadianceThemingSlices.ContainerColorTokensAssociationKind,
        Map<ComponentState, ContainerColorTokens>> activeTokenOverrides;

    private final Map<RadianceThemingSlices.ContainerColorTokensAssociationKind, ContainerColorTokens> mutedTokenOverrides;

    private final Map<RadianceThemingSlices.ContainerColorTokensAssociationKind, ContainerColorTokens> neutralTokenOverrides;

    /**
     * Creates a new color tokens bundle.
     *
     * @param activeContainerTokens
     *            Active color tokens of this bundle.
     * @param mutedContainerTokens
     *            Muted color tokens of this bundle.
     * @param neutralContainerTokens
     *            Neutral color tokens of this bundle.
     * @param isSystemDark
     *            <code>true</code> if the system tokens should be created in dark mode.
     */
    public ContainerColorTokensBundle(ContainerColorTokens activeContainerTokens,
        ContainerColorTokens mutedContainerTokens, ContainerColorTokens neutralContainerTokens,
        boolean isSystemDark) {
        if ((activeContainerTokens == null) || (mutedContainerTokens == null)
            || (neutralContainerTokens == null)) {
            throw new IllegalArgumentException("Cannot pass null tokens");
        }

        Hct systemInfoSeed = Hct.fromInt(0xFF1060D0);
        Hct systemWarningSeed = Hct.fromInt(0xFFFCC00);
        Hct systemErrorSeed = Hct.fromInt(0xFFC01707);
        Hct systemSuccessSeed = Hct.fromInt(0xFF008817);

        ContainerColorTokens systemInfoLightTokens = SystemColorTokenUtils.getSystemTokens(
            /* seed */ systemInfoSeed,
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemWarningLightTokens = SystemColorTokenUtils.getSystemTokens(
            /* seed */ systemWarningSeed,
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemErrorLightTokens = SystemColorTokenUtils.getSystemTokens(
            /* seed */ systemErrorSeed,
            /* containerConfiguration */ ContainerConfiguration.defaultLight());
        ContainerColorTokens systemSuccessLightTokens = SystemColorTokenUtils.getSystemTokens(
            /* seed */ systemSuccessSeed,
            /* containerConfiguration */ ContainerConfiguration.defaultLight());

        ContainerColorTokens systemInfoDarkTokens = SystemColorTokenUtils.getSystemTokens(
            /* seed */ systemInfoSeed,
            /* containerConfiguration */ ContainerConfiguration.defaultDark());
        ContainerColorTokens systemWarningDarkTokens = SystemColorTokenUtils.getSystemTokens(
            /* seed */ systemWarningSeed,
            /* containerConfiguration */ ContainerConfiguration.defaultDark());
        ContainerColorTokens systemErrorDarkTokens = SystemColorTokenUtils.getSystemTokens(
            /* seed */ systemErrorSeed,
            /* containerConfiguration */ ContainerConfiguration.defaultDark());
        ContainerColorTokens systemSuccessDarkTokens = SystemColorTokenUtils.getSystemTokens(
            /* seed */ systemSuccessSeed,
            /* containerConfiguration */ ContainerConfiguration.defaultDark());

        this.activeContainerTokens = activeContainerTokens;
        this.mutedContainerTokens = mutedContainerTokens;
        this.neutralContainerTokens = neutralContainerTokens;

        this.systemInfoContainerTokens = isSystemDark ? systemInfoDarkTokens : systemInfoLightTokens;
        this.systemWarningContainerTokens = isSystemDark ? systemWarningDarkTokens : systemWarningLightTokens;
        this.systemErrorContainerTokens = isSystemDark ? systemErrorDarkTokens : systemErrorLightTokens;
        this.systemSuccessContainerTokens = isSystemDark ? systemSuccessDarkTokens : systemSuccessLightTokens;

        this.inverseSystemInfoContainerTokens = isSystemDark ? systemInfoLightTokens : systemInfoDarkTokens;
        this.inverseSystemWarningContainerTokens = isSystemDark ? systemWarningLightTokens : systemWarningDarkTokens;
        this.inverseSystemErrorContainerTokens = isSystemDark ? systemErrorLightTokens : systemErrorDarkTokens;
        this.inverseSystemSuccessContainerTokens = isSystemDark ? systemSuccessLightTokens : systemSuccessDarkTokens;

        this.activeTokenOverrides = new HashMap<>();
        for (RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind :
            RadianceThemingSlices.ContainerColorTokensAssociationKind.values()) {
            this.activeTokenOverrides.put(associationKind, new HashMap<>());
        }

        this.mutedTokenOverrides = new HashMap<>();
        this.neutralTokenOverrides = new HashMap<>();
    }

    /**
     * Registers container color tokens for the specific active component states.
     *
     * @param stateContainerTokens
     *     Container color tokens for the specified active component states.
     * @param activeStates
     *     Component states.
     * @see #registerNeutralContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerMutedContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerActiveContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState...)
     * @see #getActiveContainerTokens()
     * @see #getActiveContainerTokens(ComponentState)
     * @see #getActiveContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
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
     * <li><code>states</code>={@link ComponentState#ROLLOVER_SELECTED},
     * {@link ComponentState#ROLLOVER_UNSELECTED}</li>
     * </ul>
     *
     * @param colorTokens
     *     Container color tokens for the specified active component states.
     * @param associationKind
     *     Color tokens association kind that specifies the visual areas
     *     of controls to be painted with this color tokens.
     * @param activeStates
     *     Component states that further restrict the usage of the
     *     specified color tokens.
     * @see #registerNeutralContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerMutedContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerActiveContainerTokens(ContainerColorTokens, ComponentState...)
     * @see #getActiveContainerTokens()
     * @see #getActiveContainerTokens(ComponentState)
     * @see #getActiveContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
     */
    public void registerActiveContainerTokens(ContainerColorTokens colorTokens,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState... activeStates) {
        if (colorTokens == null) {
            throw new IllegalArgumentException("Cannot pass null color tokens");
        }

        if ((activeStates == null) || (activeStates.length == 0)) {
            throw new IllegalArgumentException("Must pass at least one state");
        }

        for (ComponentState state : activeStates) {
            if (state.isDisabled() || !state.isActive()) {
                throw new IllegalArgumentException("Only active states can have custom color tokens");
            }
            this.activeTokenOverrides.get(associationKind).put(state, colorTokens);
        }
    }

    /**
     * Registers muted container color tokens for the specified visual area of a component.
     *
     * @param colorTokens
     *     Muted container color tokens for the specified visual area.
     * @param associationKind
     *     Color tokens association kind.
     * @see #registerNeutralContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerActiveContainerTokens(ContainerColorTokens, ComponentState...)
     * @see #registerActiveContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState...)
     * @see #getMutedContainerTokens()
     * @see #getMutedContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind)
     */
    public void registerMutedContainerTokens(ContainerColorTokens colorTokens,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind) {
        if (colorTokens == null) {
            throw new IllegalArgumentException("Cannot pass null color tokens");
        }

        this.mutedTokenOverrides.put(associationKind, colorTokens);
    }

    /**
     * Registers neutral container color tokens for the specified visual area of a component.
     *
     * @param colorTokens
     *     Neutral container color tokens for the specified visual area.
     * @param associationKind
     *     Color tokens association kind.
     * @see #registerMutedContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerActiveContainerTokens(ContainerColorTokens, ComponentState...)
     * @see #registerActiveContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState...)
     * @see #getNeutralContainerTokens()
     * @see #getNeutralContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind)
     */
    public void registerNeutralContainerTokens(ContainerColorTokens colorTokens,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind) {
        if (colorTokens == null) {
            throw new IllegalArgumentException("Cannot pass null color tokens");
        }

        this.neutralTokenOverrides.put(associationKind, colorTokens);
    }

    /**
     * Returns active container tokens for the specified component state.
     *
     * @param componentState Component state.
     * @return Active container tokens for the component state.
     *
     * @see #getActiveContainerTokens()
     * @see #getActiveContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
     * @see #getNeutralContainerTokens()
     * @see #getMutedContainerTokens()
     */
    public ContainerColorTokens getActiveContainerTokens(ComponentState componentState) {
        if (componentState.isDisabled()) {
            return getActiveContainerTokens(componentState.getEnabledMatch());
        }

        if (!componentState.isActive()) {
            throw new IllegalArgumentException("Only active states supported");
        }

        ContainerColorTokens registered = this.activeTokenOverrides.get(
            RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT).get(componentState);
        if (registered != null) {
            // If we're here, the component state is guaranteed to be active due to restrictions
            // in registerActiveContainerTokens
            return registered;
        } else {
            return this.getActiveContainerTokensForState(componentState);
        }
    }

    /**
     * Returns system container tokens.
     *
     * @param systemContainerType System container type.
     * @return System container tokens.
     *
     * @see #getInverseSystemContainerTokens(RadianceThemingSlices.SystemContainerType)
     */
    public ContainerColorTokens getSystemContainerTokens(
        RadianceThemingSlices.SystemContainerType systemContainerType) {
        switch (systemContainerType) {
            case INFO: return this.systemInfoContainerTokens;
            case WARNING: return this.systemWarningContainerTokens;
            case ERROR: return this.systemErrorContainerTokens;
            case SUCCESS:
            default:
                return this.systemSuccessContainerTokens;
        }
    }

    /**
     * Returns inverse system container tokens.
     *
     * @param systemContainerType System container type.
     * @return Inverse system container tokens.
     *
     * @see #getSystemContainerTokens(RadianceThemingSlices.SystemContainerType)
     */
    public ContainerColorTokens getInverseSystemContainerTokens(
        RadianceThemingSlices.SystemContainerType systemContainerType) {
        switch (systemContainerType) {
            case INFO: return this.inverseSystemInfoContainerTokens;
            case WARNING: return this.inverseSystemWarningContainerTokens;
            case ERROR: return this.inverseSystemErrorContainerTokens;
            case SUCCESS:
            default:
                return this.inverseSystemSuccessContainerTokens;
        }
    }

    /**
     * Returns active container tokens.
     *
     * @return Active container tokens.
     *
     * @see #getActiveContainerTokens(ComponentState)
     * @see #getActiveContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
     * @see #getNeutralContainerTokens()
     * @see #getMutedContainerTokens()
     * @see #registerActiveContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState...)
     * @see #registerActiveContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState...)
     */
    public ContainerColorTokens getActiveContainerTokens() {
        return this.activeContainerTokens;
    }

    /**
     * Returns neutral container tokens.
     *
     * @return Neutral container tokens.
     *
     * @see #getNeutralContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #getActiveContainerTokens()
     * @see #getMutedContainerTokens()
     * @see #registerNeutralContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     */
    public ContainerColorTokens getNeutralContainerTokens() {
        return this.neutralContainerTokens;
    }

    /**
     * Returns muted container tokens.
     *
     * @return Muted container tokens.
     *
     * @see #getMutedContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #getActiveContainerTokens()
     * @see #getNeutralContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerMutedContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     */
    public ContainerColorTokens getMutedContainerTokens() {
        return this.mutedContainerTokens;
    }

    private ContainerColorTokens getActiveContainerTokensForState(ComponentState componentState) {
        if (componentState.isDisabled()) {
            return getActiveContainerTokensForState(componentState.getEnabledMatch());
        }

        ContainerColorTokens activeTokens = getActiveContainerTokens();
        Map<ComponentState, ContainerColorTokens> activeTokenStateOverrides =
            this.activeTokenOverrides.get(RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT);

        if ((componentState == ComponentState.PRESSED_UNSELECTED) ||
            (componentState == ComponentState.ARMED)) {
            if (!activeTokenStateOverrides.containsKey(componentState)) {
                activeTokenStateOverrides.put(componentState,
                    CoreColorTokenUtils.getPressedUnselectedTokens(activeTokens));
            }
            return activeTokenStateOverrides.get(componentState);
        }
        if (componentState == ComponentState.PRESSED_SELECTED) {
            if (!activeTokenStateOverrides.containsKey(componentState)) {
                activeTokenStateOverrides.put(componentState,
                    CoreColorTokenUtils.getPressedSelectedTokens(activeTokens));
            }
            return activeTokenStateOverrides.get(componentState);
        }
        if (componentState == ComponentState.SELECTED) {
            if (!activeTokenStateOverrides.containsKey(componentState)) {
                activeTokenStateOverrides.put(componentState, activeTokens);
            }
            return activeTokenStateOverrides.get(componentState);
        }
        if (componentState == ComponentState.ROLLOVER_UNSELECTED) {
            if (!activeTokenStateOverrides.containsKey(componentState)) {
                activeTokenStateOverrides.put(componentState,
                    CoreColorTokenUtils.getRolloverUnselectedTokens(activeTokens));
            }
            return activeTokenStateOverrides.get(componentState);
        }
        if (componentState == ComponentState.ROLLOVER_SELECTED) {
            if (!activeTokenStateOverrides.containsKey(componentState)) {
                activeTokenStateOverrides.put(componentState,
                    CoreColorTokenUtils.getRolloverSelectedTokens(activeTokens));
            }
            return activeTokenStateOverrides.get(componentState);
        }
        if (componentState == ComponentState.ROLLOVER_ARMED) {
            if (!activeTokenStateOverrides.containsKey(componentState)) {
                activeTokenStateOverrides.put(componentState,
                    CoreColorTokenUtils.getRolloverArmedTokens(activeTokens));
            }
            return activeTokenStateOverrides.get(componentState);
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

    /**
     * Returns active container tokens for the specified visual area of a component in a specified
     * component state.
     *
     * @param associationKind Color tokens association kind.
     * @param componentState Component state.
     * @return Active container tokens.
     *
     * @see #getActiveContainerTokens()
     * @see #getActiveContainerTokens(ComponentState)
     * @see #getNeutralContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #getMutedContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerActiveContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState...)
     * @see #registerActiveContainerTokens(ContainerColorTokens, ComponentState...)
     */
    public ContainerColorTokens getActiveContainerTokens(
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState) {

        if (associationKind == RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT) {
            return this.getActiveContainerTokens(componentState);
        }

        if (componentState.isDisabled()) {
            // Use the enabled match, and alpha will be applied during rendering
            return getActiveContainerTokens(associationKind, componentState.getEnabledMatch());
        }

        ContainerColorTokens registered =
            this.activeTokenOverrides.get(associationKind).get(componentState);
        if (registered != null) {
            return registered;
        }

        RadianceThemingSlices.ContainerColorTokensAssociationKind fallback = associationKind.getFallback();
        if (fallback != null) {
            return getActiveContainerTokens(fallback, componentState);
        }

        return this.getActiveContainerTokens(componentState);
    }

    /**
     * Returns muted container tokens for the specified visual area of a component.
     *
     * @param associationKind Color tokens association kind.
     * @return Muted container tokens.
     *
     * @see #getMutedContainerTokens()
     * @see #getActiveContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
     * @see #getNeutralContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #registerMutedContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     */
    public ContainerColorTokens getMutedContainerTokens(
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind) {

        if (associationKind == RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT) {
            return this.getMutedContainerTokens();
        }

        ContainerColorTokens registered = this.mutedTokenOverrides.get(associationKind);
        if (registered != null) {
            return registered;
        }

        RadianceThemingSlices.ContainerColorTokensAssociationKind fallback = associationKind.getFallback();
        if (fallback != null) {
            return getMutedContainerTokens(fallback);
        }

        return this.getMutedContainerTokens();
    }

    /**
     * Returns neutral container tokens for the specified visual area of a component.
     *
     * @param associationKind Color tokens association kind.
     * @return Neutral container tokens.
     *
     * @see #getNeutralContainerTokens() 
     * @see #getActiveContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
     * @see #getMutedContainerTokens(RadianceThemingSlices.ContainerColorTokensAssociationKind) 
     * @see #registerNeutralContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     */
    public ContainerColorTokens getNeutralContainerTokens(
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind) {

        if (associationKind == RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT) {
            return this.getNeutralContainerTokens();
        }

        ContainerColorTokens registered = this.neutralTokenOverrides.get(associationKind);
        if (registered != null) {
            return registered;
        }

        RadianceThemingSlices.ContainerColorTokensAssociationKind fallback = associationKind.getFallback();
        if (fallback != null) {
            return getNeutralContainerTokens(fallback);
        }

        return this.getNeutralContainerTokens();
    }
}
