/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.common.api.model.TriStateButtonModel;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;

import javax.swing.*;
import java.util.*;

/**
 * <p>
 * Instances of this class correspond to states of Swing core and custom
 * controls. This class provides a number of predefined static instances to
 * cover most action-based controls such as buttons, check boxes and menu items.
 * In addition, application code can define custom component states that create
 * fine grained mapping between arbitrary states of controls and specific color
 * scheme bundles in custom skins.
 * </p>
 *
 * <p>
 * Each component state is defined by two arrays of component state facets
 * (available in {@link RadianceThemingSlices.ComponentStateFacet} class). The first array specifies
 * the facets that are <b>on</b>, and the second array specifies the facets that
 * are <b>off</b>. For example, when a selected toggle button is pressed, it
 * transitions to {@link #PRESSED_SELECTED} state. This state has
 * {@link RadianceThemingSlices.ComponentStateFacet#ENABLE}, {@link RadianceThemingSlices.ComponentStateFacet#SELECTION} and
 * {@link RadianceThemingSlices.ComponentStateFacet#PRESS} as its <b>on</b> facets. If a selected
 * toggle button is disabled, it has {@link RadianceThemingSlices.ComponentStateFacet#SELECTION} in
 * its <b>on</b> facets and {@link RadianceThemingSlices.ComponentStateFacet#ENABLE} in its <b>off</b>
 * facets.
 * </p>
 *
 * <p>
 * The {@link RadianceThemingSlices.ComponentStateFacet} class defines a number of core facets. The
 * {@link RadianceThemingSlices.ComponentStateFacet#ENABLE} facet is universal - it is relevant for
 * all Swing controls. Some facets apply to a wider range of controls. For
 * example, {@link RadianceThemingSlices.ComponentStateFacet#ROLLOVER} facet applies to all controls
 * that can show rollover effects - including buttons, menu items, comboboxes,
 * sliders, scrollbars and many more. Some facets apply to a very narrow range
 * of controls. For example, {@link RadianceThemingSlices.ComponentStateFacet#DETERMINATE} is only
 * relevant for progress bars.
 * </p>
 *
 * <p>
 * The static instances of {@link ComponentState} defined in this class do not
 * aim to cover all possible combinations of on and off facets. In addition to
 * making this class too unwieldy, it is not possible to do since application
 * code can define its own facets. Instead, Radiance provides three ways to
 * fine-tune the mapping between the component states and the color schemes used
 * to paint the components.
 * </p>
 *
 * <ol>
 * <li>When the skin is queried for the color scheme that matches the specific
 * component state - let's say {@link ComponentState#PRESSED_SELECTED} - the
 * skinning layer first looks for the exact state (as passed to
 * {@link RadianceColorSchemeBundle#registerColorScheme(RadianceColorScheme, RadianceThemingSlices.ColorSchemeAssociationKind, ComponentState...)}
 * or similar APIs). If the exact match is found, it is used. If there is no
 * exact match, the skinning layer will look at all color schemes registered for
 * the specific color scheme association kind in the matching color scheme
 * bundle. The decision is made based on how "close" the registered component
 * state is to the component state of the currently painted component. For
 * example, {@link ComponentState#PRESSED_SELECTED} is a better match for
 * {@link ComponentState#PRESSED_UNSELECTED} than
 * {@link ComponentState#ROLLOVER_SELECTED} - since the
 * {@link RadianceThemingSlices.ComponentStateFacet#PRESS} has more weight than the
 * {@link RadianceThemingSlices.ComponentStateFacet#ROLLOVER} in the decision process. The skinning
 * layer will choose the "closest" registered component state that is
 * sufficiently close. For example, {@link ComponentState#DISABLED_SELECTED}
 * will never be chosen for {@link ComponentState#SELECTED}, even if there are
 * no other registered component states. This way the application code can
 * register a few color schemes in the specific bundle, and have all other
 * states "fall back" to the smaller subset of states.</li>
 * <li>Custom application components may have facets that do not directly map to
 * the core facets defined in the {@link RadianceThemingSlices.ComponentStateFacet} class. In this
 * case, the application code can create its own facet instances, and its own
 * component states that use those facets in the on and off lists. Part of the
 * custom code will be in the UI delegates that compute the current state of the
 * custom component using the new facets. Other part of the custom code will be
 * in the skin definition that maps the component states defined with the new
 * facets to the specific color schemes.</li>
 * </ol>
 *
 * <p>
 * Note that you do not have to create explicit dependency between custom
 * component states used in the skin definition and custom component states used
 * in the painting routines (in the UI delegates). In fact, the custom component
 * states defined in the Radiance UI delegate for progress bar are not
 * accessible to the application code. The recommended way to separate the skin
 * definition from the model lookups in the painting is:
 * </p>
 *
 * <ul>
 * <li>The skin definition defines a sufficiently broad set of custom component
 * states that use the new facets. Note that you do not have to create a custom
 * state for every possible permutation of new facets (along with the relevant
 * core facets). A well defined set of component states will provide a good
 * fallback state for every relevant permutation of facets, keeping the skin
 * definition small and manageable.</li>
 * <li>The UI delegate that queries the component model will use accurate
 * component states that account for all the relevant on and off facets -
 * including the core facets defined in the {@link RadianceThemingSlices.ComponentStateFacet} class.
 * When this (perhaps elaborate) state is passed to
 * {@link RadianceColorSchemeBundle#getColorScheme(RadianceThemingSlices.ColorSchemeAssociationKind, ComponentState, boolean)}
 * API, the procedure described above will match the this state to one of
 * the "base" states defined in your skin, and use the matching color scheme.</li>
 * </ul>
 *
 * <p>
 * Note that the matching algorithm only looks at the facets in the <b>on</b>
 * and <b>off</b> lists, and ignores the component state name. This allows you
 * to create a broad component state in your skin, and a number of narrow
 * component states during the painting - and have the Radiance skinning layer
 * find the best match.
 * </p>
 *
 * <p>
 * When the matching algorithm cannot find a sufficiently close match, the
 * skinning layer will fall back on one of the three base color schemes passed
 * to the
 * {@link RadianceColorSchemeBundle#RadianceColorSchemeBundle(RadianceColorScheme, RadianceColorScheme, RadianceColorScheme)}
 * constructor. States with {@link RadianceThemingSlices.ComponentStateFacet#ENABLE} in their off list
 * will fall back to the disabled color scheme. The
 * {@link ComponentState#ENABLED} will fall back to the enabled color scheme.
 * The rest of the states will fall back to the active color scheme. To change
 * the fallback behavior pass a non-null fallback color scheme to the
 * {@link ComponentState#ComponentState(String, ComponentState, RadianceThemingSlices.ComponentStateFacet[], RadianceThemingSlices.ComponentStateFacet[])}
 * constructor as the second parameter.
 * </p>
 *
 * @author Kirill Grouchnikov
 */
public final class ComponentState {
    private static Set<ComponentState> allStates = new HashSet<>();

    /**
     * Disabled default. Used for disabled buttons that have been marked as
     * <code>default</code> with {@link JRootPane#setDefaultButton(JButton)}
     * API.
     */
    public static final ComponentState DISABLED_DEFAULT = new ComponentState(
            "disabled default",
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.DEFAULT},
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE});

    /**
     * Default. Used for enabled buttons that have been marked as
     * <code>default</code> with {@link JRootPane#setDefaultButton(JButton)}
     * API.
     */
    public static final ComponentState DEFAULT = new ComponentState("default",
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.DEFAULT,
                    RadianceThemingSlices.ComponentStateFacet.ENABLE}, null);

    /**
     * Disabled selected.
     */
    public static final ComponentState DISABLED_SELECTED = new ComponentState(
            "disabled selected",
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.SELECTION},
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE});

    /**
     * Disabled and not selected.
     */
    public static final ComponentState DISABLED_UNSELECTED = new ComponentState(
            "disabled unselected", null, new RadianceThemingSlices.ComponentStateFacet[]{
            RadianceThemingSlices.ComponentStateFacet.ENABLE, RadianceThemingSlices.ComponentStateFacet.SELECTION});

    /**
     * Disabled and indeterminate.
     */
    public static final ComponentState DISABLED_INDETERMINATE = new ComponentState(
            "disabled indeterminate",
            ComponentState.DISABLED_SELECTED,
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.INDETERMINATE},
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE});

    /**
     * Disabled and determinate.
     */
    public static final ComponentState DISABLED_DETERMINATE = new ComponentState(
            "disabled determinate",
            ComponentState.DISABLED_SELECTED,
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.DETERMINATE},
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE});

    /**
     * Disabled and mixed.
     */
    public static final ComponentState DISABLED_MIXED = new ComponentState(
            "disabled mixed",
            ComponentState.DISABLED_SELECTED,
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.MIX},
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE});

    /**
     * Pressed selected.
     */
    public static final ComponentState PRESSED_SELECTED = new ComponentState(
            "pressed selected", new RadianceThemingSlices.ComponentStateFacet[]{
            RadianceThemingSlices.ComponentStateFacet.SELECTION, RadianceThemingSlices.ComponentStateFacet.PRESS,
            RadianceThemingSlices.ComponentStateFacet.ENABLE}, null);

    /**
     * Pressed and not selected.
     */
    public static final ComponentState PRESSED_UNSELECTED = new ComponentState(
            "pressed unselected",
            new RadianceThemingSlices.ComponentStateFacet[]{
                    RadianceThemingSlices.ComponentStateFacet.PRESS, RadianceThemingSlices.ComponentStateFacet.ENABLE},
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.SELECTION});

    /**
     * Pressed and mix.
     */
    public static final ComponentState PRESSED_MIXED = new ComponentState(
            "pressed mixed",
            ComponentState.PRESSED_SELECTED,
            new RadianceThemingSlices.ComponentStateFacet[]{
                    RadianceThemingSlices.ComponentStateFacet.PRESS, RadianceThemingSlices.ComponentStateFacet.ENABLE,
                    RadianceThemingSlices.ComponentStateFacet.MIX},
            null);

    /**
     * Selected.
     */
    public static final ComponentState SELECTED = new ComponentState(
            "selected",
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.SELECTION,
                    RadianceThemingSlices.ComponentStateFacet.ENABLE}, null);

    /**
     * Selected and rolled over.
     */
    public static final ComponentState ROLLOVER_SELECTED = new ComponentState(
            "rollover selected",
            new RadianceThemingSlices.ComponentStateFacet[]{
                    RadianceThemingSlices.ComponentStateFacet.SELECTION,
                    RadianceThemingSlices.ComponentStateFacet.ROLLOVER, RadianceThemingSlices.ComponentStateFacet.ENABLE},
            null);

    /**
     * Not selected and rolled over.
     */
    public static final ComponentState ROLLOVER_UNSELECTED = new ComponentState(
            "rollover unselected",
            new RadianceThemingSlices.ComponentStateFacet[]{
                    RadianceThemingSlices.ComponentStateFacet.ROLLOVER, RadianceThemingSlices.ComponentStateFacet.ENABLE},
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.SELECTION});

    /**
     * Mix and rolled over.
     */
    public static final ComponentState ROLLOVER_MIXED = new ComponentState(
            "rollover mixed",
            ComponentState.ROLLOVER_SELECTED,
            new RadianceThemingSlices.ComponentStateFacet[]{
                    RadianceThemingSlices.ComponentStateFacet.MIX,
                    RadianceThemingSlices.ComponentStateFacet.ROLLOVER, RadianceThemingSlices.ComponentStateFacet.ENABLE},
            null);

    /**
     * Armed.
     */
    public static final ComponentState ARMED = new ComponentState(
            "armed",
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ARM,
                    RadianceThemingSlices.ComponentStateFacet.ENABLE},
            null);

    /**
     * Armed and rolled over.
     */
    public static final ComponentState ROLLOVER_ARMED = new ComponentState(
            "rollover armed",
            new RadianceThemingSlices.ComponentStateFacet[]{
                    RadianceThemingSlices.ComponentStateFacet.ROLLOVER, RadianceThemingSlices.ComponentStateFacet.ARM,
                    RadianceThemingSlices.ComponentStateFacet.ENABLE},
            null);

    /**
     * Determinate
     */
    public static final ComponentState DETERMINATE = new ComponentState(
            "Determinate",
            ComponentState.SELECTED,
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE,
                    RadianceThemingSlices.ComponentStateFacet.DETERMINATE},
            null);

    /**
     * Indeterminate
     */
    public static final ComponentState INDETERMINATE = new ComponentState(
            "Indeterminate",
            ComponentState.SELECTED,
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE,
                    RadianceThemingSlices.ComponentStateFacet.INDETERMINATE},
            null);

    /**
     * Mix
     */
    public static final ComponentState MIXED = new ComponentState(
            "Mixed",
            ComponentState.SELECTED,
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE,
                    RadianceThemingSlices.ComponentStateFacet.MIX},
            null);

    /**
     * Enabled state.
     */
    public static final ComponentState ENABLED = new ComponentState("enabled",
            new RadianceThemingSlices.ComponentStateFacet[]{RadianceThemingSlices.ComponentStateFacet.ENABLE},
            null);

    /**
     * Facets that are turned on for this state. For example,
     * {@link #ROLLOVER_SELECTED} contains {@link RadianceThemingSlices.ComponentStateFacet#ROLLOVER}
     * and {@link RadianceThemingSlices.ComponentStateFacet#SELECTION}.
     */
    private Set<RadianceThemingSlices.ComponentStateFacet> facetsTurnedOn;

    /**
     * Facets that are turned on for this state. For example,
     * {@link #DISABLED_UNSELECTED} contains {@link RadianceThemingSlices.ComponentStateFacet#ENABLE}
     * and {@link RadianceThemingSlices.ComponentStateFacet#SELECTION}.
     */
    private Set<RadianceThemingSlices.ComponentStateFacet> facetsTurnedOff;

    private Map<RadianceThemingSlices.ComponentStateFacet, Boolean> mappingOn;

    private String name;

    private ComponentState hardFallback;

    /**
     * Creates a new component state.
     *
     * @param name      Component state name. Does not have to be unique. The name is
     *                  only used in the {@link #toString()}.
     * @param facetsOn  Indicates that are turned on for this state. For example,
     *                  {@link #ROLLOVER_SELECTED} should pass both
     *                  {@link RadianceThemingSlices.ComponentStateFacet#ROLLOVER} and
     *                  {@link RadianceThemingSlices.ComponentStateFacet#SELECTION}.
     * @param facetsOff Indicates that are turned on for this state. For example,
     *                  {@link #DISABLED_UNSELECTED} should pass both
     *                  {@link RadianceThemingSlices.ComponentStateFacet#ENABLE} and
     *                  {@link RadianceThemingSlices.ComponentStateFacet#SELECTION}.
     */
    public ComponentState(String name, RadianceThemingSlices.ComponentStateFacet[] facetsOn,
            RadianceThemingSlices.ComponentStateFacet[] facetsOff) {
        this(name, null, facetsOn, facetsOff);
    }

    /**
     * Creates a new component state.
     *
     * @param name         Component state name. Does not have to be unique. The name is
     *                     only used in the {@link #toString()}.
     * @param hardFallback The fallback state that will be used in
     *                     {@link RadianceColorSchemeBundle#getColorScheme(RadianceThemingSlices.ColorSchemeAssociationKind, ComponentState, boolean)}
     *                     in case {@link #bestFit(Collection)} returns <code>null</code>
     * @param facetsOn     Indicates that are turned on for this state. For example,
     *                     {@link #ROLLOVER_SELECTED} should pass both
     *                     {@link RadianceThemingSlices.ComponentStateFacet#ROLLOVER} and
     *                     {@link RadianceThemingSlices.ComponentStateFacet#SELECTION}.
     * @param facetsOff    Indicates that are turned on for this state. For example,
     *                     {@link #DISABLED_UNSELECTED} should pass both
     *                     {@link RadianceThemingSlices.ComponentStateFacet#ENABLE} and
     *                     {@link RadianceThemingSlices.ComponentStateFacet#SELECTION}.
     */
    public ComponentState(String name, ComponentState hardFallback,
            RadianceThemingSlices.ComponentStateFacet[] facetsOn, RadianceThemingSlices.ComponentStateFacet[] facetsOff) {
        if (name == null) {
            throw new IllegalArgumentException(
                    "Component state name must be non-null");
        }
        this.name = name;
        this.hardFallback = hardFallback;
        this.facetsTurnedOn = new HashSet<>();
        if (facetsOn != null) {
            Collections.addAll(this.facetsTurnedOn, facetsOn);
        }
        this.facetsTurnedOff = new HashSet<>();
        if (facetsOff != null) {
            Collections.addAll(this.facetsTurnedOff, facetsOff);
        }
        this.mappingOn = new HashMap<>();
        allStates.add(this);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.name);
        sb.append(" : on {");
        if (this.facetsTurnedOn != null) {
            String sep = "";
            for (RadianceThemingSlices.ComponentStateFacet on : this.facetsTurnedOn) {
                sb.append(sep);
                sep = ", ";
                sb.append(on.toString());
            }
        }
        sb.append("} : off {");
        if (this.facetsTurnedOff != null) {
            String sep = "";
            for (RadianceThemingSlices.ComponentStateFacet off : this.facetsTurnedOff) {
                sb.append(sep);
                sep = ", ";
                sb.append(off.toString());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * Returns indication whether <code>this</code> component state is "active"
     * under the specified facet. For example, {@link #ROLLOVER_SELECTED} will
     * return <code>true</code> for both {@link RadianceThemingSlices.ComponentStateFacet#ROLLOVER}
     * and {@link RadianceThemingSlices.ComponentStateFacet#SELECTION}.
     *
     * @param stateFacet State facet.
     * @return <code>true</code> if <code>this</code> component state is
     * "active" under the specified facet (for example,
     * {@link #ROLLOVER_SELECTED} will return <code>true</code> for both
     * {@link RadianceThemingSlices.ComponentStateFacet#ROLLOVER} and
     * {@link RadianceThemingSlices.ComponentStateFacet#SELECTION}), <code>false</code>
     * otherwise.
     */
    public boolean isFacetActive(RadianceThemingSlices.ComponentStateFacet stateFacet) {
        Boolean result = this.mappingOn.get(stateFacet);
        if (result != null) {
            return result;
        }
        if ((facetsTurnedOn != null) && facetsTurnedOn.contains(stateFacet)) {
            this.mappingOn.put(stateFacet, Boolean.TRUE);
            return true;
        }
        this.mappingOn.put(stateFacet, Boolean.FALSE);
        return false;
    }

    /**
     * Checks whether this state is disabled. A disabled state has
     * {@link RadianceThemingSlices.ComponentStateFacet#ENABLE} facet in its <code>off</code> set.
     *
     * @return <code>true</code> if this state is disabled, <code>false</code>
     * otherwise.
     */
    public boolean isDisabled() {
        return !this.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ENABLE);
    }

    /**
     * Returns all active component states. Note that the result will <b>not</b> contain
     * {@link ComponentState#ENABLED}.
     *
     * @return All active component states.
     */
    public static ComponentState[] getActiveStates() {
        List<ComponentState> states = new LinkedList<>();
        for (ComponentState state : allStates) {
            if (state.isActive()) {
                states.add(state);
            }
        }
        return states.toArray(new ComponentState[0]);
    }

    /**
     * Returns all component states.
     *
     * @return All component states
     */
    public static ComponentState[] getAllStates() {
        return Collections.synchronizedSet(allStates).toArray(new ComponentState[0]);
    }

    public boolean isActive() {
        if (this == ComponentState.ENABLED) {
            return false;
        }
        if (!this.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ENABLE)) {
            return false;
        }
        return true;
    }

    /**
     * Retrieves component state based on the button model (required parameter)
     * and component itself (optional parameter).
     *
     * @param model     Button model (required).
     * @param component Component (optional).
     * @return The matching component state.
     */
    public static ComponentState getState(ButtonModel model, JComponent component) {
        return getState(model, component, false);
    }

    /**
     * Returns the state of the specified button.
     *
     * @param button Button.
     * @return The state of the specified button.
     */
    public static ComponentState getState(AbstractButton button) {
        return getState(button.getModel(), button, false);
    }

    /**
     * Retrieves component state based on the button model (required parameter)
     * and button itself (optional parameter).
     *
     * @param model             Button model (required).
     * @param component         Component (optional).
     * @param toIgnoreSelection If <code>true</code>, the {@link ButtonModel#isSelected()}
     *                          will not be checked. This can be used for tracking transitions
     *                          on menu items that use <code>armed</code> state instead, when
     *                          we don't want to use different rollover themes for selected
     *                          and unselected checkbox and radio button menu items (to
     *                          preserve consistent visual appearence of highlights).
     * @return The matching component state.
     */
    public static ComponentState getState(ButtonModel model,
            JComponent component, boolean toIgnoreSelection) {
        boolean isRollover = model.isRollover();

        // fix for defect 103 - no rollover effects on menu items
        // that are not in the selected menu path
        if (component instanceof MenuElement) {
            MenuElement[] selectedMenuPath = MenuSelectionManager
                    .defaultManager().getSelectedPath();
            for (MenuElement elem : selectedMenuPath) {
                if (elem == component) {
                    isRollover = true;
                    break;
                }
            }
        }

        if (component != null) {
            if (component instanceof JButton) {
                JButton jb = (JButton) component;
                if (jb.isDefaultButton()) {
                    if (model.isEnabled()) {
                        // check for rollover
                        if (jb.isRolloverEnabled() && jb.getModel().isRollover()) {
                            if (model.isSelected()) {
                                return ROLLOVER_SELECTED;
                            } else {
                                return ROLLOVER_UNSELECTED;
                            }
                        }
                        if ((!model.isPressed()) && (!model.isArmed())) {
                            return DEFAULT;
                        }
                    } else {
                        return DISABLED_DEFAULT;
                    }
                }
            }
        }

        boolean isRolloverEnabled = true;
        if (component instanceof AbstractButton) {
            isRolloverEnabled = ((AbstractButton) component).isRolloverEnabled();
        }
        if (!model.isEnabled()) {
            if (!toIgnoreSelection && model.isSelected()) {
                return DISABLED_SELECTED;
            }
            return DISABLED_UNSELECTED;
        } else if (model.isArmed() && model.isPressed()) {
            if (!toIgnoreSelection && model.isSelected()) {
                return PRESSED_SELECTED;
            }
            return PRESSED_UNSELECTED;
        } else if (!toIgnoreSelection && model.isSelected()) {
            if (((component == null) || isRolloverEnabled) && isRollover) {
                return ROLLOVER_SELECTED;
            }
            return SELECTED;
        } else if (model.isArmed()) {
            if (((component == null) || isRolloverEnabled) && isRollover) {
                return ROLLOVER_ARMED;
            }
            return ARMED;
        } else if (((component == null) || isRolloverEnabled) && isRollover) {
            return ROLLOVER_UNSELECTED;
        }

        return ENABLED;
    }

    public static ComponentState getState(TriStateButtonModel model, boolean toIgnoreSelection) {
        TriStateButtonModel.SelectionState selectionState = model.getSelectionState();

        boolean isRollover = model.isRollover();

        if (!model.isEnabled()) {
            if (!toIgnoreSelection && (selectionState == TriStateButtonModel.SelectionState.ON)) {
                return ComponentState.DISABLED_SELECTED;
            }
            if (!toIgnoreSelection && (selectionState == TriStateButtonModel.SelectionState.INDETERMINATE)) {
                return ComponentState.DISABLED_MIXED;
            }
            return ComponentState.DISABLED_UNSELECTED;
        } else if (model.isPressed()) {
            if (!toIgnoreSelection && (selectionState == TriStateButtonModel.SelectionState.ON)) {
                return ComponentState.PRESSED_SELECTED;
            }
            return ComponentState.PRESSED_UNSELECTED;
        } else if (!toIgnoreSelection && (selectionState == TriStateButtonModel.SelectionState.ON)) {
            if (isRollover) {
                return ComponentState.ROLLOVER_SELECTED;
            }
            return ComponentState.SELECTED;
        }  else if (!toIgnoreSelection && (selectionState == TriStateButtonModel.SelectionState.INDETERMINATE)) {
            if (isRollover) {
                return ComponentState.ROLLOVER_MIXED;
            }
            return ComponentState.MIXED;
        } else if (isRollover) {
            return ComponentState.ROLLOVER_UNSELECTED;
        }

        return ComponentState.ENABLED;
    }

    /**
     * Returns the component state that matches the specified parameters.
     *
     * @param isEnabled  Enabled flag.
     * @param isRollover Rollover flag.
     * @param isSelected Selected flag.
     * @return The component state that matches the specified parameters.
     */
    public static ComponentState getState(boolean isEnabled,
            boolean isRollover, boolean isSelected) {
        if (!isEnabled) {
            if (isSelected) {
                return DISABLED_SELECTED;
            }
            return DISABLED_UNSELECTED;
        }
        if (isSelected) {
            if (isRollover) {
                return ROLLOVER_SELECTED;
            }
            return SELECTED;
        }
        if (isRollover) {
            return ROLLOVER_UNSELECTED;
        }
        return ENABLED;
    }

    private int fitValue(ComponentState state) {
        int value = 0;
        if (this.facetsTurnedOn != null) {
            for (RadianceThemingSlices.ComponentStateFacet on : this.facetsTurnedOn) {
                if (state.facetsTurnedOn == null) {
                    value -= on.value / 2;
                } else {
                    if (state.facetsTurnedOn.contains(on)) {
                        value += on.value;
                    } else {
                        value -= on.value / 2;
                    }
                    if (state.facetsTurnedOff.contains(on)) {
                        value -= on.value;
                    }
                }
            }
        }
        if (this.facetsTurnedOff != null) {
            for (RadianceThemingSlices.ComponentStateFacet off : this.facetsTurnedOff) {
                if (state.facetsTurnedOff == null) {
                    value -= off.value / 2;
                } else {
                    if (state.facetsTurnedOff.contains(off)) {
                        value += off.value;
                    } else {
                        value -= off.value / 2;
                    }
                    if (state.facetsTurnedOn.contains(off)) {
                        value -= off.value;
                    }
                }
            }
        }
        // / System.out.println("Fit value is " + value + " for ");
        // / System.out.println("\t" + this);
        // System.out.println("\t" + state);
        return value;
    }

    public ComponentState bestFit(Collection<ComponentState> states) {
        ComponentState bestFit = null;
        int bestFitValue = 0;
        for (ComponentState state : states) {
            if (this.isActive() != state.isActive()) {
                continue;
            }
            int currFitValue = state.fitValue(this) + this.fitValue(state);
            if (bestFit == null) {
                bestFit = state;
                bestFitValue = currFitValue;
            } else {
                if (currFitValue > bestFitValue) {
                    bestFit = state;
                    bestFitValue = currFitValue;
                }
            }
        }
        // fit value must be positive
        if (bestFitValue > 0) {
            return bestFit;
        }
        return null;
    }

    public ComponentState getHardFallback() {
        return hardFallback;
    }

    @Override
    public int hashCode() {
        if (this.facetsTurnedOn.isEmpty() && this.facetsTurnedOff.isEmpty()) {
            return 0;
        }

        if (this.facetsTurnedOn.isEmpty()) {
            boolean isFirst = true;
            int result = 0;
            for (RadianceThemingSlices.ComponentStateFacet off : this.facetsTurnedOff) {
                if (isFirst) {
                    result = ~off.hashCode();
                    isFirst = false;
                } else {
                    result = result & ~off.hashCode();
                }
            }
            return result;
        } else {
            boolean isFirst = true;
            int result = 0;
            for (RadianceThemingSlices.ComponentStateFacet on : this.facetsTurnedOn) {
                if (isFirst) {
                    result = on.hashCode();
                    isFirst = false;
                } else {
                    result = result & on.hashCode();
                }
            }
            for (RadianceThemingSlices.ComponentStateFacet off : this.facetsTurnedOff) {
                result = result & ~off.hashCode();
            }
            return result;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ComponentState)) {
            return false;
        }

        ComponentState second = (ComponentState) obj;
        if (this.facetsTurnedOn.size() != second.facetsTurnedOn.size()) {
            return false;
        }
        if (this.facetsTurnedOff.size() != second.facetsTurnedOff.size()) {
            return false;
        }

        if (!this.facetsTurnedOn.containsAll(second.facetsTurnedOn)) {
            return false;
        }
        if (!this.facetsTurnedOff.containsAll(second.facetsTurnedOff)) {
            return false;
        }

        return true;
    }
}
