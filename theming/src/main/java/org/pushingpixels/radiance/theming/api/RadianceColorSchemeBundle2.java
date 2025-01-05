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
import org.pushingpixels.radiance.theming.api.palette.ExtendedContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.RadianceColorScheme2;

import java.util.HashMap;
import java.util.Map;

/**
 * Color scheme bundle. Defines the visual appearance of a single decoration area of a skin.
 *
 * @author Kirill Grouchnikov
 * @see RadianceThemingSlices.DecorationAreaType
 * @see RadianceThemingSlices.ColorSchemeAssociationKind
 * @see RadianceSkin
 */
public class RadianceColorSchemeBundle2 {
    // The main color scheme of this bundle
    private RadianceColorScheme2 mainColorScheme;

    /**
     * Maps from color scheme association kinds to the map of color schemes.
     * Different visual parts of controls in the specific decoration are can be
     * painted with different color schemes. For example, a rollover button can
     * use a light orange scheme for the gradient fill and a dark gray scheme
     * for the border. In this case, this map will have:
     *
     * <ul>
     * <li>An entry with key {@link RadianceThemingSlices.ColorSchemeAssociationKind#FILL}. This entry
     * has a map entry with key {@link ComponentState#SELECTED} and value that
     * points to the light orange scheme.</li>
     * <li>An entry with key {@link RadianceThemingSlices.ColorSchemeAssociationKind#BORDER}. This
     * entry has a map entry with key {@link ComponentState#SELECTED} and value
     * that points to the dark gray scheme.</li>
     * </ul>
     */
    private Map<RadianceThemingSlices.ContainerColorTokensAssociationKind,
        Map<ComponentState, RadianceColorScheme2>> colorSchemeMap;

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

        this.colorSchemeMap = new HashMap<>();
        for (RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind :
            RadianceThemingSlices.ContainerColorTokensAssociationKind.values()) {
            this.colorSchemeMap.put(associationKind, new HashMap<>());
        }
    }

    /**
     * Registers a color scheme for the specific component state.
     *
     * @param stateColorScheme Color scheme for the specified component state.
     * @param states           Component states.
     */
    public void registerColorScheme(RadianceColorScheme2 stateColorScheme, ComponentState... states) {
        this.registerColorScheme(stateColorScheme,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT,
            states);
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

        RadianceColorScheme2 registered = this.colorSchemeMap.get(
            RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT).get(componentState);
        if (registered != null) {
            // If we're here, the component state is guaranteed to be active due to restrictions
            // in registerColorScheme
            return registered.getActiveContainerTokens();
        }

        return componentState.isActive()
            ? this.mainColorScheme.getContainerTokensForState(componentState)
            : this.mainColorScheme.getContainerTokens(inactiveContainerType);
    }

    public ExtendedContainerColorTokens getExtendedContainerTokens(ComponentState componentState,
        RadianceThemingSlices.ContainerType inactiveContainerType) {
        if (componentState.isDisabled()) {
            return getExtendedContainerTokens(componentState.getEnabledMatch(), inactiveContainerType);
        }

        RadianceColorScheme2 registered = this.colorSchemeMap.get(
            RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT).get(componentState);
        if (registered != null) {
            // If we're here, the component state is guaranteed to be active due to restrictions
            // in registerColorScheme
            return registered.getExtendedContainerTokens(componentState);
        }

        return componentState.isActive()
            ? this.mainColorScheme.getExtendedContainerTokens(componentState)
            : this.mainColorScheme.getExtendedContainerTokens(inactiveContainerType);
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
     * Registers the color scheme to be used for the specified visual area of
     * controls under the specified states. For example, if the light orange
     * scheme has to be used for gradient fill for rollover selected and rollover
     * controls, the parameters would be:
     *
     * <ul>
     * <li><code>scheme</code>=light orange scheme</li>
     * <li>
     * <code>associationKind</code>={@link RadianceThemingSlices.ColorSchemeAssociationKind#FILL}</li>
     * <li>
     * <code>states</code>={@link ComponentState#ROLLOVER_SELECTED},
     * {@link ComponentState#ROLLOVER_UNSELECTED}</li>
     * </ul>
     *
     * @param scheme          Color scheme.
     * @param associationKind Color scheme association kind that specifies the visual areas
     *                        of controls to be painted with this color scheme.
     * @param states          Component states that further restrict the usage of the
     *                        specified color scheme.
     */
    public void registerColorScheme(RadianceColorScheme2 scheme,
            RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
            ComponentState... states) {
        if (scheme == null) {
            throw new IllegalArgumentException("Cannot pass null color scheme");
        }

        if ((states == null) || (states.length == 0)) {
            throw new IllegalArgumentException("Must pass at least one state");
        }

        for (ComponentState state : states) {
            if (state.isDisabled() || !state.isActive()) {
                throw new IllegalArgumentException("Only active states can have custom color schemes");
            }
            this.colorSchemeMap.get(associationKind).put(state, scheme);
        }
    }

    /**
     * Returns the color scheme to be used for painting the specified visual
     * area of the component under the specified component state.
     *
     * @param associationKind Color scheme association kind.
     * @param componentState  Component state.
     * @param allowFallback   If true, this method will return a color scheme for the fallback
     *                        association kind.
     * @return Color scheme to be used for painting the specified visual area of
     * the component under the specified component state.
     * @see #registerColorScheme(RadianceColorScheme2, ComponentState...)
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

        RadianceColorScheme2 registered =
            this.colorSchemeMap.get(associationKind).get(componentState);
        if (registered != null) {
            // If we're here, the component state is guaranteed to be active due to restrictions
            // in registerColorScheme
            return registered.getActiveContainerTokens();
        }

        RadianceColorScheme2 enabledForAssociationKind =
            this.colorSchemeMap.get(associationKind).get(ComponentState.ENABLED);
        if (enabledForAssociationKind != null) {
            return componentState.isActive()
                ? enabledForAssociationKind.getContainerTokensForState(componentState)
                : enabledForAssociationKind.getContainerTokens(inactiveContainerType);
        }

        if (!allowFallback) {
            return null;
        }

        return getContainerTokens(
            RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT, componentState,
            true, inactiveContainerType);
    }
}
