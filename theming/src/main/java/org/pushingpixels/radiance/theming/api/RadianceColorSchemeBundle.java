/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeTransform;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

import java.util.*;

/**
 * Color scheme bundle. Defines the visual appearance of a single decoration area of a skin.
 *
 * @author Kirill Grouchnikov
 * @see RadianceThemingSlices.DecorationAreaType
 * @see RadianceThemingSlices.ColorSchemeAssociationKind
 * @see RadianceSkin
 */
public class RadianceColorSchemeBundle {
    /**
     * The active color scheme of this bundle.
     */
    private RadianceColorScheme activeColorScheme;

    /**
     * The enabled color scheme of this bundle.
     */
    private RadianceColorScheme enabledColorScheme;

    /**
     * The disabled color scheme of this bundle.
     */
    private RadianceColorScheme disabledColorScheme;

    /**
     * Maps from component state to the alpha channel applied on color scheme.
     * This map doesn't have to contain entries for all {@link ComponentState}
     * instances.
     */
    private Map<ComponentState, Float> stateAlphaMap;

    /**
     * Maps from component state to the alpha channel applied on highlight color
     * scheme. This map doesn't have to contain entries for all
     * {@link ComponentState} instances.
     */
    private Map<ComponentState, Float> stateHighlightAlphaMap;

    /**
     * If there is no explicitly registered color scheme for pressed component
     * state, this field will contain a synthesized color scheme for the pressed
     * state.
     *
     * @see ComponentState#PRESSED_SELECTED
     * @see ComponentState#PRESSED_UNSELECTED
     */
    private RadianceColorScheme pressedScheme;

    /**
     * If there is no explicitly registered color scheme for the disabled
     * selected component state, this field will contain a synthesized color
     * scheme for the disabled selected state.
     *
     * @see ComponentState#DISABLED_SELECTED
     */
    private RadianceColorScheme disabledSelectedScheme;

    /**
     * If there is no explicitly registered color scheme for the selected
     * component state, this field will contain a synthesized color scheme for
     * the selected state.
     *
     * @see ComponentState#SELECTED
     */
    private RadianceColorScheme selectedScheme;

    /**
     * If there is no explicitly registered color scheme for the rollover
     * selected component state, this field will contain a synthesized color
     * scheme for the rollover selected state.
     *
     * @see ComponentState#ROLLOVER_SELECTED
     */
    private RadianceColorScheme rolloverSelectedScheme;

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
    private Map<RadianceThemingSlices.ColorSchemeAssociationKind, Map<ComponentState, RadianceColorScheme>> colorSchemeMap;

    private Map<RadianceThemingSlices.ColorSchemeAssociationKind, Map<ComponentState, ComponentState>> bestFillMap;

    public interface Overlay {
        void overlay(RadianceColorSchemeBundle bundle);
    }

    /**
     * Creates a new color scheme bundle.
     *
     * @param activeColorScheme   The active color scheme of this bundle.
     * @param enabledColorScheme  The enabled color scheme of this bundle.
     * @param disabledColorScheme The disabled color scheme of this bundle.
     */
    public RadianceColorSchemeBundle(RadianceColorScheme activeColorScheme,
            RadianceColorScheme enabledColorScheme,
            RadianceColorScheme disabledColorScheme) {
        if ((activeColorScheme == null) || (enabledColorScheme == null)
                || (disabledColorScheme == null)) {
            throw new IllegalArgumentException("Cannot pass null schemes");
        }

        this.activeColorScheme = activeColorScheme;
        this.enabledColorScheme = enabledColorScheme;
        this.disabledColorScheme = disabledColorScheme;
        this.stateAlphaMap = new HashMap<>();
        this.stateHighlightAlphaMap = new HashMap<>();

        this.colorSchemeMap = new HashMap<>();
        for (RadianceThemingSlices.ColorSchemeAssociationKind associationKind : RadianceThemingSlices.ColorSchemeAssociationKind.values()) {
            this.colorSchemeMap.put(associationKind, new HashMap<>());
        }

        this.bestFillMap = new HashMap<>();
        for (RadianceThemingSlices.ColorSchemeAssociationKind associationKind : RadianceThemingSlices.ColorSchemeAssociationKind.values()) {
            this.bestFillMap.put(associationKind, new HashMap<>());
        }
    }

    /**
     * Registers an alpha channel value for the specific component states.
     *
     * @param alpha  Alpha channel value.
     * @param states Component states.
     */
    public void registerAlpha(float alpha, ComponentState... states) {
        if ((states == null) || (states.length == 0)) {
            for (ComponentState state : ComponentState.getAllStates()) {
                this.stateAlphaMap.put(state, alpha);
            }
        } else {
            for (ComponentState state : states) {
                this.stateAlphaMap.put(state, alpha);
            }
        }
    }

    /**
     * Registers a color scheme for the specific component state.
     *
     * @param stateColorScheme Color scheme for the specified component state.
     * @param states           Component states.
     */
    public void registerColorScheme(RadianceColorScheme stateColorScheme, ComponentState... states) {
        this.registerColorScheme(stateColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind.FILL, states);
    }

    /**
     * Registers a highlight color scheme for the specific component state if
     * the component state is not <code>null</code>, or a global highlight color
     * scheme otherwise.
     *
     * @param stateHighlightScheme Highlight color scheme for the specified component state.
     * @param states               Component states. If <code>null</code>, the specified color
     *                             scheme will be applied for all states left unspecified.
     */
    public void registerHighlightColorScheme(RadianceColorScheme stateHighlightScheme, ComponentState... states) {
        if (stateHighlightScheme == null) {
            throw new IllegalArgumentException("Cannot pass null color scheme");
        }
        if ((states == null) || (states.length == 0)) {
            for (ComponentState state : ComponentState.getAllStates()) {
                if (this.colorSchemeMap.get(RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT).containsKey(state)) {
                    continue;
                }
                if (state.isDisabled()) {
                    continue;
                }
                if (state == ComponentState.ENABLED) {
                    continue;
                }
                this.colorSchemeMap.get(RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT).put(state, stateHighlightScheme);
            }
        } else {
            for (ComponentState state : states) {
                this.colorSchemeMap.get(RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT).put(state, stateHighlightScheme);
            }
        }
    }

    /**
     * Registers a highlight alpha channel value for the specific component states.
     *
     * @param alpha  Highlight alpha channel value.
     * @param states Component states.
     */
    public void registerHighlightAlpha(float alpha, ComponentState... states) {
        if ((states == null) || (states.length == 0)) {
            for (ComponentState state : ComponentState.getAllStates()) {
                this.stateHighlightAlphaMap.put(state, alpha);
            }
        } else {
            for (ComponentState state : states) {
                this.stateHighlightAlphaMap.put(state, alpha);
            }
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
    public RadianceColorScheme getColorScheme(ComponentState componentState) {
        RadianceColorScheme registered = this.colorSchemeMap.get(
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL).get(componentState);
        if (registered != null) {
            return registered;
        }

        // for now look for the best fit only on active states
        Map<ComponentState, ComponentState> bestFitForFill = this.bestFillMap
                .get(RadianceThemingSlices.ColorSchemeAssociationKind.FILL);
        if (!bestFitForFill.containsKey(componentState)) {
            Collection<ComponentState> registeredStates = this.colorSchemeMap
                    .get(RadianceThemingSlices.ColorSchemeAssociationKind.FILL).keySet();
            bestFitForFill.put(componentState, componentState
                    .bestFit(registeredStates));
        }
        ComponentState bestFit = bestFitForFill.get(componentState);
        if (bestFit != null) {
            registered = this.colorSchemeMap.get(RadianceThemingSlices.ColorSchemeAssociationKind.FILL).get(bestFit);
            if (registered != null) {
                return registered;
            }
        }

        if (componentState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.PRESS)) {
            if (this.pressedScheme == null) {
                this.pressedScheme = this.activeColorScheme.shade(0.2).saturate(0.1);
            }
            return this.pressedScheme;
        }
        if (componentState == ComponentState.DISABLED_SELECTED) {
            if (this.disabledSelectedScheme == null) {
                this.disabledSelectedScheme =
                        this.activeColorScheme.blendWith(this.disabledColorScheme, 0.25);
            }
            return this.disabledSelectedScheme;
        }
        if (componentState == ComponentState.SELECTED) {
            if (this.selectedScheme == null) {
                this.selectedScheme = this.activeColorScheme.saturate(0.2);
            }
            return this.selectedScheme;
        }
        if (componentState == ComponentState.ROLLOVER_SELECTED) {
            if (this.rolloverSelectedScheme == null) {
                this.rolloverSelectedScheme = this.activeColorScheme.tint(0.1).saturate(0.1);
            }
            return this.rolloverSelectedScheme;
        }

        ComponentState hardFallback = componentState.getHardFallback();
        if (hardFallback != null) {
            return this.getColorScheme(hardFallback);
        }

        if (componentState == ComponentState.ENABLED) {
            return this.enabledColorScheme;
        }
        if (componentState.isDisabled()) {
            return this.disabledColorScheme;
        }
        return this.activeColorScheme;
    }

    public boolean hasHighlightAlphaFor(ComponentState componentState) {
        return this.stateHighlightAlphaMap.containsKey(componentState);
    }

    /**
     * Returns the alpha channel of the highlight color schemes for the specified component state.
     * Before calling this API, call {@link #hasHighlightAlphaFor(ComponentState)}. This API returns
     * 1.0f for states that do not have an explicitly registered alpha channel value.
     *
     * @param componentState Component state.
     * @return Highlight color scheme alpha channel.
     */
    public float getHighlightAlpha(ComponentState componentState) {
        Float registered = this.stateHighlightAlphaMap.get(componentState);
        if (registered != null) {
            return registered.floatValue();
        }

        return 1.0f;
    }

    public boolean hasAlphaFor(ComponentState componentState) {
        return this.stateAlphaMap.containsKey(componentState);
    }

    /**
     * Returns the alpha channel of color schemes for the specified component state.
     * Before calling this API, call {@link #hasAlphaFor(ComponentState)}. This API returns
     * 1.0f for states that do not have an explicitly registered alpha channel value.
     *
     * @param componentState Component state.
     * @return Color scheme alpha channel.
     */
    public float getAlpha(ComponentState componentState) {
        Float registered = this.stateAlphaMap.get(componentState);
        if (registered != null) {
            return registered.floatValue();
        }

        return 1.0f;
    }

    /**
     * Returns the active color scheme of this bundle.
     *
     * @return The active color scheme of this bundle.
     */
    public RadianceColorScheme getActiveColorScheme() {
        return this.activeColorScheme;
    }

    /**
     * Returns the enabled color scheme of this bundle.
     *
     * @return The enabled color scheme of this bundle.
     */
    public RadianceColorScheme getEnabledColorScheme() {
        return this.enabledColorScheme;
    }

    /**
     * Returns the disabled color scheme of this bundle.
     *
     * @return The disabled color scheme of this bundle.
     */
    public RadianceColorScheme getDisabledColorScheme() {
        return this.disabledColorScheme;
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
    public void registerColorScheme(RadianceColorScheme scheme,
            RadianceThemingSlices.ColorSchemeAssociationKind associationKind,
            ComponentState... states) {
        if (scheme == null) {
            throw new IllegalArgumentException("Cannot pass null color scheme");
        }

        if ((states == null) || (states.length == 0)) {
            for (ComponentState state : ComponentState.getAllStates()) {
                if (this.colorSchemeMap.get(associationKind).containsKey(state)) {
                    continue;
                }
                if (state.getHardFallback() != null) {
                    // Skip states with hard fallback - that link will be traversed in
                    // getColorScheme() logic
                    continue;
                }
                this.colorSchemeMap.get(associationKind).put(state, scheme);
            }
        } else {
            for (ComponentState state : states) {
                this.colorSchemeMap.get(associationKind).put(state, scheme);
            }
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
     * @see #registerColorScheme(RadianceColorScheme, ComponentState...)
     */
    public RadianceColorScheme getColorScheme(
            RadianceThemingSlices.ColorSchemeAssociationKind associationKind,
            ComponentState componentState, boolean allowFallback) {
        if (associationKind == RadianceThemingSlices.ColorSchemeAssociationKind.FILL) {
            return this.getColorScheme(componentState);
        }

        RadianceColorScheme registered = this.colorSchemeMap.get(
                associationKind).get(componentState);
        if (registered != null) {
            return registered;
        }

        // if (componentState.isActive()) {
        // for now look for the best fit only on active states
        Map<ComponentState, ComponentState> bestFitForState = this.bestFillMap
                .get(associationKind);
        if (!bestFitForState.containsKey(componentState)) {
            Collection<ComponentState> registeredStates = this.colorSchemeMap
                    .get(associationKind).keySet();
            bestFitForState.put(componentState, componentState
                    .bestFit(registeredStates));
        }
        ComponentState bestFit = bestFitForState.get(componentState);
        if (bestFit != null) {
            registered = this.colorSchemeMap.get(associationKind).get(bestFit);
            if (registered != null)
                return registered;
        }

        if (!allowFallback) {
            return null;
        }

        RadianceThemingSlices.ColorSchemeAssociationKind fallback = associationKind.getFallback();
        if (fallback == null) {
            return null;
        }

        return getColorScheme(fallback, componentState, allowFallback);
    }

    /**
     * Creates a new color scheme bundle that has the same settings as this
     * color scheme bundle with the addition of applying the specified color
     * scheme transformation on all the relevant color schemes
     *
     * @param transform Color scheme transformation.
     * @return The new color scheme bundle.
     */
    RadianceColorSchemeBundle transform(ColorSchemeTransform transform) {
        // transform the basic schemes
        RadianceColorSchemeBundle result = new RadianceColorSchemeBundle(
                transform.transform(this.activeColorScheme),
                transform.transform(this.enabledColorScheme),
                transform.transform(this.disabledColorScheme));

        for (Map.Entry<RadianceThemingSlices.ColorSchemeAssociationKind, Map<ComponentState, RadianceColorScheme>> entry :
                this.colorSchemeMap.entrySet()) {
            for (Map.Entry<ComponentState, RadianceColorScheme> subEntry : entry
                    .getValue().entrySet()) {
                result.colorSchemeMap.get(entry.getKey()).put(
                        subEntry.getKey(),
                        transform.transform(subEntry.getValue()));
            }
        }

        // alphas are the same
        if (this.stateAlphaMap != null) {
            result.stateAlphaMap = new HashMap<>(this.stateAlphaMap);
        }

        // highlight alphas are the same
        if (this.stateHighlightAlphaMap != null) {
            result.stateHighlightAlphaMap = new HashMap<>(this.stateHighlightAlphaMap);
        }
        return result;
    }

    /**
     * Returns the set of all component states that have non-trivial alpha
     * associated with them. Non-trivial alpha is a value that is strictly less
     * than 1.0.
     *
     * @return All component states that have associated non-trivial alpha values.
     */
    Set<ComponentState> getStatesWithAlpha() {
        Set<ComponentState> result = new HashSet<>();
        for (Map.Entry<ComponentState, Float> alphaEntry : this.stateAlphaMap.entrySet()) {
            if (alphaEntry.getValue() < 1.0f) {
                result.add(alphaEntry.getKey());
            }
        }
        return result;
    }
}
