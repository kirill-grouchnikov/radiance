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

import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;

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
public class RadianceColorSchemeBundle2 {
    // The main color scheme of this bundle
    private RadianceColorScheme2 mainColorScheme;

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

    public interface Overlay {
        void overlay(RadianceColorSchemeBundle2 bundle);
    }

    /**
     * Creates a new color scheme bundle.
     *
     * @param mainColorScheme   The main color scheme of this bundle.
     */
    public RadianceColorSchemeBundle2(RadianceColorScheme2 mainColorScheme) {
        if (mainColorScheme == null) {
            throw new IllegalArgumentException("Cannot pass a null scheme");
        }

        this.mainColorScheme = mainColorScheme;

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
    public void registerContainerTokens(ContainerColorTokens stateContainerTokens,
        ComponentState... activeStates) {
        this.registerContainerTokens(stateContainerTokens,
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
    public void registerContainerTokens(ContainerColorTokens stateContainerTokens,
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

    /**
     * Returns the color scheme of the specified component in the specified
     * component state.
     *
     * @param componentState Component state.
     * @return The color scheme of the component in the specified component
     * state.
     */
    public ContainerColorTokens getContainerTokens(ComponentState componentState,
        RadianceThemingSlices.ContainerType inactiveContainerType) {
        if (componentState.isDisabled()) {
            return getContainerTokens(componentState.getEnabledMatch(), inactiveContainerType);
        }

        ContainerColorTokens registered = this.colorTokensForActiveStates.get(
            RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT).get(componentState);
        if (registered != null) {
            // If we're here, the component state is guaranteed to be active due to restrictions
            // in registerColorScheme
            return registered;
        }

        return componentState.isActive()
            ? this.mainColorScheme.getContainerTokensForState(componentState)
            : this.mainColorScheme.getContainerTokens(inactiveContainerType);
    }

    public ContainerColorTokens getSystemContainerTokens(
        RadianceThemingSlices.SystemContainerType systemContainerType) {

        switch (systemContainerType) {
            case INFO: return this.mainColorScheme.getSystemInfoContainerTokens();
            case WARNING: return this.mainColorScheme.getSystemWarningContainerTokens();
            case ERROR: return this.mainColorScheme.getSystemErrorContainerTokens();
            case SUCCESS: return this.mainColorScheme.getSystemSuccessContainerTokens();
            case EMERGENCY:
            default:
                return this.mainColorScheme.getSystemEmergencyContainerTokens();
        }
    }

    /**
     * Returns the main color scheme of this bundle.
     *
     * @return The main color scheme of this bundle.
     */
    public RadianceColorScheme2 getMainColorScheme() {
        return this.mainColorScheme;
    }

    /**
     * Returns the color tokens to be used for painting components under the specified component
     * state.
     *
     * @param associationKind Color scheme association kind.
     * @param componentState  Component state.
     * @param allowFallback   If true, this method will return color tokens for the fallback
     *                        association kind.
     * @return Color tokens to be used for painting the specified visual area of
     * the component under the specified component state.
     * @see #registerContainerTokens(ContainerColorTokens, ComponentState...)
     * @see #registerContainerTokens(ContainerColorTokens, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState...)
     */
    public ContainerColorTokens getContainerTokens(
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState, boolean allowFallback,
        RadianceThemingSlices.ContainerType inactiveContainerType) {

        if (associationKind == RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT) {
            return this.getContainerTokens(componentState, inactiveContainerType);
        }

        if (componentState.isDisabled()) {
            // TODO: TONAL - finalize this
            // Use the enabled match, and alpha will be applied during rendering
            return getContainerTokens(associationKind, componentState.getEnabledMatch(),
                allowFallback, inactiveContainerType);
        }

        ContainerColorTokens registered =
            this.colorTokensForActiveStates.get(associationKind).get(componentState);
        if (registered != null) {
            // If we're here, the component state is guaranteed to be active due to restrictions
            // in registerColorScheme
            return registered;
        }

        if (!allowFallback) {
            return null;
        }

        return getContainerTokens(componentState, inactiveContainerType);
    }
}
