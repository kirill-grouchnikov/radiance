/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.api;

import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeTransform;
import org.pushingpixels.substance.api.colorscheme.SteelBlueColorScheme;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.colorscheme.SunsetColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.SubstanceDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.api.painter.highlight.SubstanceHighlightPainter;
import org.pushingpixels.substance.api.painter.overlay.SubstanceOverlayPainter;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.api.trait.SubstanceTrait;
import org.pushingpixels.substance.internal.utils.SkinUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.util.List;
import java.util.*;

/**
 * Base abstract class for Substance skins.
 *
 * @author Kirill Grouchnikov
 */
public abstract class SubstanceSkin implements SubstanceTrait {
    public static final double DEFAULT_TAB_FADE_START = 0.1;
    public static final double DEFAULT_TAB_FADE_END = 0.3;

    /**
     * Base class for skins that can be configured with accent color schemes. Accented skins can
     * be extended to apply those color schemes in a way that highlights certain parts of
     * the UI while still retaining the "core" feel of the specific skin family. Note that
     * it is up to the specific implementation of the base accented skin to decide which
     * parts of the UI are painted with specific accent color schemes, and that decision may vary
     * between different base accented skins.
     * <p>
     * Use {@link #getWindowChromeAccent()}, {@link #getActiveControlsAccent()},
     * {@link #getEnabledControlsAccent()}, {@link #getHighlightsAccent()} and
     * {@link #getBackgroundAccent()} to get the accent color schemes for consistent accent usage
     * in custom-painted parts of your UI.
     */
    public static abstract class Accented extends SubstanceSkin {
        public final static class AccentBuilder {
            private SubstanceColorScheme windowChromeAccent;
            private SubstanceColorScheme enabledControlsAccent;
            private SubstanceColorScheme activeControlsAccent;
            private SubstanceColorScheme highlightsAccent;
            private SubstanceColorScheme backgroundAccent;
            private ColorSchemes accentColorSchemes;

            public AccentBuilder() {
            }

            public AccentBuilder withAccentResource(String colorSchemeResourceName) {
                this.accentColorSchemes = SubstanceSkin.getColorSchemes(
                        AccentBuilder.class.getClassLoader().getResourceAsStream(colorSchemeResourceName));
                return this;
            }

            public AccentBuilder withWindowChromeAccent(String windowChromeAccentName) {
                if (this.accentColorSchemes == null) {
                    throw new IllegalStateException("Builder not configured with accent resource file");
                }
                this.windowChromeAccent = this.accentColorSchemes.get(windowChromeAccentName);
                return this;
            }

            public AccentBuilder withWindowChromeAccent(SubstanceColorScheme windowChromeAccent) {
                this.windowChromeAccent = windowChromeAccent;
                return this;
            }

            public AccentBuilder withActiveControlsAccent(String activeControlsAccentName) {
                if (this.accentColorSchemes == null) {
                    throw new IllegalStateException("Builder not configured with accent resource file");
                }
                this.activeControlsAccent = this.accentColorSchemes.get(activeControlsAccentName);
                return this;
            }

            public AccentBuilder withActiveControlsAccent(SubstanceColorScheme activeControlsAccent) {
                this.activeControlsAccent = activeControlsAccent;
                return this;
            }

            public AccentBuilder withEnabledControlsAccent(String enabledControlsAccentName) {
                if (this.accentColorSchemes == null) {
                    throw new IllegalStateException("Builder not configured with accent resource file");
                }
                this.enabledControlsAccent = this.accentColorSchemes.get(enabledControlsAccentName);
                return this;
            }

            public AccentBuilder withEnabledControlsAccent(SubstanceColorScheme enabledControlsAccent) {
                this.enabledControlsAccent = enabledControlsAccent;
                return this;
            }

            public AccentBuilder withHighlightsAccent(String highlightsAccentName) {
                if (this.accentColorSchemes == null) {
                    throw new IllegalStateException("Builder not configured with accent resource file");
                }
                this.highlightsAccent = this.accentColorSchemes.get(highlightsAccentName);
                return this;
            }

            public AccentBuilder withHighlightsAccent(SubstanceColorScheme highlightsAccent) {
                this.highlightsAccent = highlightsAccent;
                return this;
            }

            public AccentBuilder withBackgroundAccent(String backgroundAccentName) {
                if (this.accentColorSchemes == null) {
                    throw new IllegalStateException("Builder not configured with accent resource file");
                }
                this.backgroundAccent = this.accentColorSchemes.get(backgroundAccentName);
                return this;
            }

            public AccentBuilder withBackgroundAccent(SubstanceColorScheme backgroundAccent) {
                this.backgroundAccent = backgroundAccent;
                return this;
            }
        }

        private final SubstanceColorScheme windowChromeAccent;
        private final SubstanceColorScheme activeControlsAccent;
        private final SubstanceColorScheme enabledControlsAccent;
        private final SubstanceColorScheme highlightsAccent;
        private final SubstanceColorScheme backgroundAccent;

        protected Accented(AccentBuilder accentBuilder) {
            this.windowChromeAccent = accentBuilder.windowChromeAccent;
            this.activeControlsAccent = accentBuilder.activeControlsAccent;
            this.enabledControlsAccent = accentBuilder.enabledControlsAccent;
            this.highlightsAccent = accentBuilder.highlightsAccent;
            this.backgroundAccent = accentBuilder.backgroundAccent;
        }

        public SubstanceColorScheme getBackgroundAccent() {
            return this.backgroundAccent;
        }

        public SubstanceColorScheme getActiveControlsAccent() {
            return this.activeControlsAccent;
        }

        public SubstanceColorScheme getEnabledControlsAccent() {
            return this.enabledControlsAccent;
        }

        public SubstanceColorScheme getHighlightsAccent() {
            return this.highlightsAccent;
        }

        public SubstanceColorScheme getWindowChromeAccent() {
            return this.windowChromeAccent;
        }
    }

    /**
     * Maps decoration area type to the color scheme bundles. Must contain an
     * entry for {@link DecorationAreaType#NONE}.
     */
    private Map<DecorationAreaType, SubstanceColorSchemeBundle> colorSchemeBundleMap;

    /**
     * Maps decoration area type to the background color schemes.
     */
    private Map<DecorationAreaType, SubstanceColorScheme> backgroundColorSchemeMap;

    /**
     * Maps decoration area type to the registered overlay painters. Each
     * decoration area type can have more than one overlay painter.
     */
    private Map<DecorationAreaType, List<SubstanceOverlayPainter>> overlayPaintersMap;

    /**
     * The button shaper of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected SubstanceButtonShaper buttonShaper;

    /**
     * The fill painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected SubstanceFillPainter fillPainter;

    /**
     * The border painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected SubstanceBorderPainter borderPainter;

    /**
     * The highlight border painter of <code>this</code> skin. Can be <code>null</code>.
     */
    protected SubstanceBorderPainter highlightBorderPainter;

    /**
     * The highlight painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected SubstanceHighlightPainter highlightPainter;

    /**
     * The decoration painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected SubstanceDecorationPainter decorationPainter;

    /**
     * Set of all decoration area types that are not explicitly registered in
     * {@link #colorSchemeBundleMap} but still are considered as decoration
     * areas in this skin. Controls in such areas will have their background painted by
     * <p>
     * {@link SubstanceDecorationPainter#paintDecorationArea(Graphics2D, Component, DecorationAreaType, int, int, SubstanceSkin)}
     * instead of a simple background fill.
     */
    private Set<DecorationAreaType> decoratedAreaSet;

    /**
     * The start of fade effect on tabs in {@link JTabbedPane}s.
     *
     * @see #tabFadeEnd
     * @see #DEFAULT_TAB_FADE_START
     */
    protected double tabFadeStart;

    /**
     * The end of fade effect on tabs in {@link JTabbedPane}s.
     *
     * @see #tabFadeStart
     * @see #DEFAULT_TAB_FADE_END
     */
    protected double tabFadeEnd;

    /**
     * All component states that have associated non-trivial alpha values.
     */
    private Set<ComponentState> statesWithAlpha;

    private Map<SubstanceSlices.ColorOverlayType, Map<DecorationAreaType, Map<ComponentState, Color>>> colorOverlayMap;

    private Map<Integer, SubstanceColorScheme> optionPaneIconColorSchemeMap;

    /**
     * Constructs the basic data structures for a skin.
     */
    protected SubstanceSkin() {
        this.colorSchemeBundleMap = new HashMap<>();
        this.backgroundColorSchemeMap = new HashMap<>();
        this.overlayPaintersMap = new HashMap<>();
        this.colorOverlayMap = new HashMap<>();

        this.decoratedAreaSet = new HashSet<>();
        this.decoratedAreaSet.add(DecorationAreaType.PRIMARY_TITLE_PANE);
        this.decoratedAreaSet.add(DecorationAreaType.SECONDARY_TITLE_PANE);

        this.tabFadeStart = DEFAULT_TAB_FADE_START;
        this.tabFadeEnd = DEFAULT_TAB_FADE_END;

        this.optionPaneIconColorSchemeMap = new HashMap<>();
        SubstanceColorScheme sunset = new SunsetColorScheme();
        SubstanceColorScheme steelBlue = new SteelBlueColorScheme();
        this.optionPaneIconColorSchemeMap.put(JOptionPane.ERROR_MESSAGE, sunset);
        this.optionPaneIconColorSchemeMap.put(JOptionPane.WARNING_MESSAGE, sunset);
        this.optionPaneIconColorSchemeMap.put(JOptionPane.INFORMATION_MESSAGE, steelBlue);
        this.optionPaneIconColorSchemeMap.put(JOptionPane.QUESTION_MESSAGE, steelBlue);

        this.statesWithAlpha = new HashSet<>();
    }

    /**
     * Returns the border painter of this skin.
     *
     * @return The border painter of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final SubstanceBorderPainter getBorderPainter() {
        return this.borderPainter;
    }

    /**
     * Returns the highlight border painter of this skin.
     *
     * @return The highlight border painter of this skin. The return value of
     * this method may be <code>null</code>. In this case, call
     * {@link #getBorderPainter()}.
     */
    public final SubstanceBorderPainter getHighlightBorderPainter() {
        return this.highlightBorderPainter;
    }

    /**
     * Returns the button shaper of this skin.
     *
     * @return The button shaper of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final SubstanceButtonShaper getButtonShaper() {
        return this.buttonShaper;
    }

    /**
     * Returns the fill painter of this skin.
     *
     * @return The fill painter of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final SubstanceFillPainter getFillPainter() {
        return this.fillPainter;
    }

    /**
     * Returns the highlight painter of this skin.
     *
     * @return The highlight painter of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final SubstanceHighlightPainter getHighlightPainter() {
        return this.highlightPainter;
    }

    /**
     * Returns the decoration painter of this skin.
     *
     * @return The decoration painter of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final SubstanceDecorationPainter getDecorationPainter() {
        return this.decorationPainter;
    }

    /**
     * Adds skin-specific entries to the UI defaults table.
     *
     * @param table UI defaults table.
     */
    void addCustomEntriesToTable(UIDefaults table) {
        // Apparently this function is called with null table
        // when the application is run with -Dswing.defaultlaf
        // setting. In this case, this function will be called
        // second time with correct table.
        if (table == null) {
            return;
        }

        SkinUtilities.addCustomEntriesToTable(table, this);
    }

    /**
     * Returns the color scheme of the specified component in the specified
     * component state.
     *
     * @param comp           Component.
     * @param componentState Component state.
     * @return The color scheme of the component in the specified component state.
     */
    public final SubstanceColorScheme getColorScheme(Component comp,
            ComponentState componentState) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.colorSchemeBundleMap.size() > 1) {
            DecorationAreaType decorationAreaType = (comp == null) ? DecorationAreaType.NONE
                    : ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                SubstanceColorScheme registered = this.colorSchemeBundleMap
                        .get(decorationAreaType).getColorScheme(componentState);
                if (registered == null) {
                    throw new IllegalStateException(
                            "Color scheme shouldn't be null here. Please report this issue");
                }
                return registered;
            }
        }

        SubstanceColorScheme registered = this.colorSchemeBundleMap.get(
                DecorationAreaType.NONE).getColorScheme(componentState);
        if (registered == null) {
            throw new IllegalStateException(
                    "Color scheme shouldn't be null here. Please report this issue");
        }
        return registered;
    }

    /**
     * Returns the alpha channel of the highlight color scheme of the component.
     *
     * @param comp           Component.
     * @param componentState Component state.
     * @return Highlight color scheme alpha channel.
     */
    public final float getHighlightAlpha(Component comp, ComponentState componentState) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.colorSchemeBundleMap.size() > 1) {
            DecorationAreaType decorationAreaType =
                    ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                float registered = this.colorSchemeBundleMap.get(decorationAreaType)
                        .getHighlightAlpha(componentState);
                if (registered >= 0.0) {
                    return registered;
                }
            }
        }

        float registered = this.colorSchemeBundleMap.get(DecorationAreaType.NONE)
                .getHighlightAlpha(componentState);
        if (registered >= 0.0) {
            return registered;
        }

        boolean isRollover = componentState.isFacetActive(ComponentStateFacet.ROLLOVER);
        boolean isSelected = componentState.isFacetActive(ComponentStateFacet.SELECTION);
        boolean isArmed = componentState.isFacetActive(ComponentStateFacet.ARM);

        if (isRollover && isSelected) {
            return 0.9f;
        }
        if (isRollover && isArmed) {
            return 0.8f;
        }
        if (isSelected) {
            return 0.7f;
        }
        if (isArmed) {
            return 0.6f;
        }
        if (isRollover) {
            return 0.4f;
        }
        return 0.0f;
    }

    /**
     * Returns the alpha channel of the color scheme of the component.
     *
     * @param comp           Component.
     * @param componentState Component state.
     * @return Color scheme alpha channel.
     */
    public final float getAlpha(Component comp, ComponentState componentState) {
        // optimization - if the state does not have hard fallback, and it is not registered in any
        // scheme bundle with custom alpha, return 1.0
        ComponentState fallback = componentState.getHardFallback();
        if ((fallback == null) && !this.statesWithAlpha.contains(componentState)) {
            return 1.0f;
        }

        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.colorSchemeBundleMap.size() > 1) {
            DecorationAreaType decorationAreaType = (comp == null) ? DecorationAreaType.NONE :
                    ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                float registered = this.colorSchemeBundleMap.get(decorationAreaType).getAlpha(componentState);
                if (registered >= 0.0) {
                    return registered;
                }
            }
        }

        float registered = this.colorSchemeBundleMap.get(DecorationAreaType.NONE).getAlpha(componentState);
        if (registered >= 0.0) {
            return registered;
        }

        if (fallback == null) {
            return 1.0f;
        }

        return getAlpha(comp, fallback);
    }

    /**
     * Registers the specified color scheme bundle and background color scheme
     * to be used on controls in decoration areas.
     *
     * @param bundle                The color scheme bundle to use on controls in decoration
     *                              areas.
     * @param backgroundColorScheme The color scheme to use for background of controls in
     *                              decoration areas.
     * @param areaTypes             Enumerates the area types that are affected by the parameters.
     */
    public void registerDecorationAreaSchemeBundle(
            SubstanceColorSchemeBundle bundle,
            SubstanceColorScheme backgroundColorScheme,
            DecorationAreaType... areaTypes) {
        if (bundle == null) {
            return;
        }

        if (backgroundColorScheme == null) {
            throw new IllegalArgumentException(
                    "Cannot pass null background color scheme");
        }

        for (DecorationAreaType areaType : areaTypes) {
            this.decoratedAreaSet.add(areaType);
            this.colorSchemeBundleMap.put(areaType, bundle);
            this.backgroundColorSchemeMap.put(areaType, backgroundColorScheme);
        }
        this.statesWithAlpha.addAll(bundle.getStatesWithAlpha());
    }

    /**
     * Registers the specified color scheme bundle to be used on controls in
     * decoration areas.
     *
     * @param bundle    The color scheme bundle to use on controls in decoration
     *                  areas.
     * @param areaTypes Enumerates the area types that are affected by the parameters.
     */
    public void registerDecorationAreaSchemeBundle(
            SubstanceColorSchemeBundle bundle, DecorationAreaType... areaTypes) {
        this.registerDecorationAreaSchemeBundle(bundle, bundle.getEnabledColorScheme(),
                areaTypes);
    }

    /**
     * Registers the specified background color scheme to be used on controls in
     * decoration areas.
     *
     * @param backgroundColorScheme The color scheme to use for background of controls in
     *                              decoration areas.
     * @param areaTypes             Enumerates the area types that are affected by the parameters.
     *                              Each decoration area type will be painted by
     *                              {@link SubstanceDecorationPainter#paintDecorationArea(Graphics2D, Component, SubstanceSlices.DecorationAreaType, int, int, SubstanceSkin)}
     */
    public void registerAsDecorationArea(SubstanceColorScheme backgroundColorScheme,
            DecorationAreaType... areaTypes) {
        if (backgroundColorScheme == null) {
            throw new IllegalArgumentException(
                    "Cannot pass null background color scheme");
        }
        for (DecorationAreaType areaType : areaTypes) {
            this.decoratedAreaSet.add(areaType);
            this.backgroundColorSchemeMap.put(areaType, backgroundColorScheme);
        }
    }

    /**
     * Registers the specified background color scheme and a color scheme bundle overlay to be used
     * on controls in decoration areas.
     *
     * @param backgroundColorScheme     The color scheme to use for background of controls in
     *                                  decoration areas.
     * @param noneTransformationOverlay Overlay to be applied to the {@link SubstanceColorSchemeBundle}
     *                                  registered on the {@link DecorationAreaType#NONE}, with the
     *                                  resulting color scheme bundle to be used on #areaTypes.
     * @param areaTypes                 Enumerates the area types that are affected by the
     *                                  parameters. Each decoration area type will be painted by
     *                                  {@link SubstanceDecorationPainter#paintDecorationArea(Graphics2D, Component, SubstanceSlices.DecorationAreaType, int, int, SubstanceSkin)}
     */
    public void registerAsDecorationArea(SubstanceColorScheme backgroundColorScheme,
            SubstanceColorSchemeBundle.Overlay noneTransformationOverlay,
            DecorationAreaType... areaTypes) {
        SubstanceColorSchemeBundle defaultBundle =
                this.colorSchemeBundleMap.get(DecorationAreaType.NONE);
        if (defaultBundle == null) {
            throw new IllegalStateException("Cannot apply overlay without a registered NONE bundle");
        }

        // Apply a dummy "transformation" - effectively makes a deep copy of the default bundle
        SubstanceColorSchemeBundle noneCopy = defaultBundle.transform(scheme -> scheme);
        // Apply the overlay
        noneTransformationOverlay.overlay(noneCopy);
        // And register the overlay transform on the requested decoration areas
        this.registerDecorationAreaSchemeBundle(noneCopy, backgroundColorScheme, areaTypes);
    }

    /**
     * Returns indication whether the specified decoration area type should have
     * their background painted by
     * {@link SubstanceDecorationPainter#paintDecorationArea(Graphics2D, Component, SubstanceSlices.DecorationAreaType, int, int, SubstanceSkin)}
     * instead of a simple background fill.
     *
     * @param decorationType Decoration area type.
     * @return <code>true</code> if specified decoration area type should have
     * their background painted by
     * {@link SubstanceDecorationPainter#paintDecorationArea(Graphics2D, Component, SubstanceSlices.DecorationAreaType, int, int, SubstanceSkin)}
     * , <code>false</code> otherwise.
     */
    public boolean isRegisteredAsDecorationArea(DecorationAreaType decorationType) {
        return this.decoratedAreaSet.contains(decorationType);
    }

    /**
     * Returns the main active color scheme for the specific decoration area
     * type. Custom painting code that needs to consult the colors of the
     * specific component should use
     * {@link #getColorScheme(Component, ComponentState)} method and various
     * {@link SubstanceColorScheme} methods.
     *
     * @param decorationAreaType Decoration area type.
     * @return The main active color scheme for this skin.
     * @see #getColorScheme(Component, ComponentState)
     */
    public final SubstanceColorScheme getActiveColorScheme(
            DecorationAreaType decorationAreaType) {
        if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
            return this.colorSchemeBundleMap.get(decorationAreaType).getActiveColorScheme();
        }
        return this.colorSchemeBundleMap.get(DecorationAreaType.NONE).getActiveColorScheme();
    }

    /**
     * Returns the main enabled color scheme for the specific decoration area
     * type. Custom painting code that needs to consult the colors of the
     * specific component should use
     * {@link #getColorScheme(Component, ComponentState)} method and various
     * {@link SubstanceColorScheme} methods.
     *
     * @param decorationAreaType Decoration area type.
     * @return The main enabled color scheme for this skin.
     * @see #getColorScheme(Component, ComponentState)
     */
    public final SubstanceColorScheme getEnabledColorScheme(
            DecorationAreaType decorationAreaType) {
        if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
            return this.colorSchemeBundleMap.get(decorationAreaType).getEnabledColorScheme();
        }
        return this.colorSchemeBundleMap.get(DecorationAreaType.NONE).getEnabledColorScheme();
    }

    /**
     * Returns the main disabled color scheme for the specific decoration area
     * type. Custom painting code that needs to consult the colors of the
     * specific component should use
     * {@link #getColorScheme(Component, ComponentState)} method and various
     * {@link SubstanceColorScheme} methods.
     *
     * @param decorationAreaType Decoration area type.
     * @return The main disabled color scheme for this skin.
     * @see #getColorScheme(Component, ComponentState)
     */
    public final SubstanceColorScheme getDisabledColorScheme(
            DecorationAreaType decorationAreaType) {
        if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
            return this.colorSchemeBundleMap.get(decorationAreaType).getDisabledColorScheme();
        }
        return this.colorSchemeBundleMap.get(DecorationAreaType.NONE).getDisabledColorScheme();
    }

    /**
     * Returns the start of fade effect on tabs in
     * {@link JTabbedPane}s. This value can be used to create XP-like "headers"
     * on the selected tabs.
     *
     * @return The start of fade effect on the selected tabs in {@link JTabbedPane}s.
     * @see #getTabFadeEnd()
     * @see #DEFAULT_TAB_FADE_START
     */
    public final double getTabFadeStart() {
        return this.tabFadeStart;
    }

    /**
     * Returns the end of fade effect on tabs in
     * {@link JTabbedPane}s. This value can be used to create XP-like "headers"
     * on the selected tabs.
     *
     * @return The end of fade effect on the selected tabs in {@link JTabbedPane}s.
     * @see #getTabFadeStart()
     * @see #DEFAULT_TAB_FADE_END
     */
    public final double getTabFadeEnd() {
        return this.tabFadeEnd;
    }

    /**
     * Sets the end of fade effect on tabs in {@link JTabbedPane}s. The value should be in 0.0-1.0 range.
     *
     * @param tabFadeEnd The end of fade effect on tabs in {@link JTabbedPane}s. Should be in 0.0-1.0 range.
     * @see #DEFAULT_TAB_FADE_END
     */
    public void setTabFadeEnd(double tabFadeEnd) {
        if ((tabFadeEnd < 0.0) || (tabFadeEnd > 1.0)) {
            throw new IllegalArgumentException(
                    "Value for tab fade end should be in 0.0-1.0 range");
        }
        this.tabFadeEnd = tabFadeEnd;
    }

    /**
     * Sets the start of fade effect on selected tabs in {@link JTabbedPane}s. The value should be in 0.0-1.0 range.
     *
     * @param tabFadeStart The start of fade effect on tabs in {@link JTabbedPane} s. Should be in 0.0-1.0 range.
     * @see #DEFAULT_TAB_FADE_START
     */
    public void setTabFadeStart(double tabFadeStart) {
        if ((tabFadeStart < 0.0) || (tabFadeStart > 1.0)) {
            throw new IllegalArgumentException(
                    "Value for tab fade start should be in 0.0-1.0 range");
        }
        this.tabFadeStart = tabFadeStart;
    }

    /**
     * Adds the specified overlay painter to the end of the list of overlay
     * painters associated with the specified decoration area types.
     *
     * @param overlayPainter Overlay painter to add to the end of the list of overlay
     *                       painters associated with the specified decoration area types.
     * @param areaTypes      Decoration area types.
     */
    public void addOverlayPainter(SubstanceOverlayPainter overlayPainter,
            DecorationAreaType... areaTypes) {
        for (DecorationAreaType areaType : areaTypes) {
            if (!this.overlayPaintersMap.containsKey(areaType)) {
                this.overlayPaintersMap.put(areaType, new ArrayList<>());
            }
            this.overlayPaintersMap.get(areaType).add(overlayPainter);
        }
    }

    /**
     * Removes the specified overlay painter from the list of overlay painters
     * associated with the specified decoration area types.
     *
     * @param overlayPainter Overlay painter to remove from the list of overlay painters
     *                       associated with the specified decoration area types.
     * @param areaTypes      Decoration area types.
     */
    public void removeOverlayPainter(SubstanceOverlayPainter overlayPainter,
            DecorationAreaType... areaTypes) {
        for (DecorationAreaType areaType : areaTypes) {
            if (!this.overlayPaintersMap.containsKey(areaType)) {
                return;
            }
            this.overlayPaintersMap.get(areaType).remove(overlayPainter);
            if (this.overlayPaintersMap.get(areaType).size() == 0) {
                this.overlayPaintersMap.remove(areaType);
            }
        }
    }

    /**
     * Removes all overlay painters associated with the specified decoration area types.
     *
     * @param areaTypes Decoration area types.
     */
    public void clearOverlayPainters(DecorationAreaType... areaTypes) {
        for (DecorationAreaType areaType : areaTypes) {
            if (!this.overlayPaintersMap.containsKey(areaType)) {
                return;
            }
            this.overlayPaintersMap.get(areaType).clear();
            this.overlayPaintersMap.remove(areaType);
        }
    }

    /**
     * Returns a non-null, non-modifiable list of overlay painters associated
     * with the specified decoration area type.
     *
     * @param decorationAreaType Decoration area type.
     * @return A non-null, non-modifiable list of overlay painters associated
     * with the specified decoration area type.
     */
    public List<SubstanceOverlayPainter> getOverlayPainters(DecorationAreaType decorationAreaType) {
        if (!this.overlayPaintersMap.containsKey(decorationAreaType)) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.overlayPaintersMap.get(decorationAreaType));
    }

    /**
     * Returns the color scheme to be used for painting the specified visual
     * area of components in the specified decoration area.
     *
     * @param decorationAreaType Decoration area type.
     * @param associationKind    Color scheme association kind.
     * @param componentState     Component state.
     * @return Color scheme to be used for painting the specified visual area of
     * components in the specified decoration area.
     */
    public final SubstanceColorScheme getColorScheme(
            DecorationAreaType decorationAreaType,
            ColorSchemeAssociationKind associationKind,
            ComponentState componentState) {
        if (this.colorSchemeBundleMap.size() > 1) {
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                return this.colorSchemeBundleMap.get(decorationAreaType)
                        .getColorScheme(associationKind, componentState, true);
            }
        }
        return this.colorSchemeBundleMap.get(DecorationAreaType.NONE)
                .getColorScheme(associationKind, componentState, true);
    }

    /**
     * Returns the color scheme to be used for painting the specified visual
     * area of the component under the specified component state.
     *
     * @param comp            Component.
     * @param associationKind Color scheme association kind.
     * @param componentState  Component state.
     * @return Color scheme to be used for painting the specified visual area of
     * the component under the specified component state.
     */
    public final SubstanceColorScheme getColorScheme(Component comp,
            ColorSchemeAssociationKind associationKind,
            ComponentState componentState) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.colorSchemeBundleMap.size() > 1) {
            DecorationAreaType decorationAreaType = (comp == null) ? DecorationAreaType.NONE
                    : ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                return this.colorSchemeBundleMap.get(decorationAreaType)
                        .getColorScheme(associationKind, componentState, true);
            }
        }
        return this.colorSchemeBundleMap.get(DecorationAreaType.NONE)
                .getColorScheme(associationKind, componentState, true);
    }

    /**
     * Returns the color scheme to be used for painting the specified visual
     * area of the component under the specified component state.
     *
     * @param comp            Component.
     * @param associationKind Color scheme association kind.
     * @param componentState  Component state.
     * @return Color scheme to be used for painting the specified visual area of
     * the component under the specified component state.
     */
    public final SubstanceColorScheme getDirectColorScheme(Component comp,
            ColorSchemeAssociationKind associationKind,
            ComponentState componentState) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.colorSchemeBundleMap.size() > 1) {
            DecorationAreaType decorationAreaType = ComponentOrParentChainScope
                    .getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                return this.colorSchemeBundleMap.get(decorationAreaType)
                        .getColorScheme(associationKind, componentState, false);
            }
        }
        return this.colorSchemeBundleMap.get(DecorationAreaType.NONE)
                .getColorScheme(associationKind, componentState, false);
    }

    /**
     * Creates a new skin that has the same settings as this skin with the
     * addition of applying the specified color scheme transformation on all the
     * relevant color schemes.
     *
     * @param transform Color scheme transformation.
     * @param name      The name of the new skin.
     * @return The new skin.
     */
    public SubstanceSkin transform(ColorSchemeTransform transform, final String name) {
        SubstanceSkin result = new SubstanceSkin() {
            @Override
            public String getDisplayName() {
                return name;
            }
        };
        // same painters
        result.borderPainter = this.borderPainter;
        result.buttonShaper = this.buttonShaper;
        result.decorationPainter = this.decorationPainter;
        result.fillPainter = this.fillPainter;
        result.highlightPainter = this.highlightPainter;
        result.highlightBorderPainter = this.highlightBorderPainter;

        // same misc settings
        result.tabFadeEnd = this.tabFadeEnd;
        result.tabFadeStart = this.tabFadeStart;

        // transform the scheme bundles
        if (this.colorSchemeBundleMap != null) {
            result.colorSchemeBundleMap = new HashMap<>();
            for (Map.Entry<DecorationAreaType, SubstanceColorSchemeBundle> bundleEntry :
                    this.colorSchemeBundleMap.entrySet()) {
                result.colorSchemeBundleMap.put(bundleEntry.getKey(),
                        bundleEntry.getValue().transform(transform));
            }
        }

        // same set of decoration areas
        if (this.decoratedAreaSet != null) {
            result.decoratedAreaSet = new HashSet<>(this.decoratedAreaSet);
        }
        // transform the background schemes
        if (this.backgroundColorSchemeMap != null) {
            result.backgroundColorSchemeMap = new HashMap<>();
            for (Map.Entry<DecorationAreaType, SubstanceColorScheme> entry :
                    this.backgroundColorSchemeMap.entrySet()) {
                result.backgroundColorSchemeMap.put(entry.getKey(),
                        transform.transform(entry.getValue()));
            }
        }
        // same map of overlay painters
        result.overlayPaintersMap = new HashMap<>(this.overlayPaintersMap);
        return result;
    }

    /**
     * Returns the background color scheme for the specified decoration area
     * type. This method is mainly for the internal use of
     * {@link SubstanceDecorationPainter#paintDecorationArea(Graphics2D, Component, SubstanceSlices.DecorationAreaType, int, int, SubstanceSkin)}
     * but can be used in applications that wish to provide custom overlay
     * background painting.
     *
     * @param decorationAreaType Decoration area type.
     * @return The background color scheme for the specified decoration area type.
     */
    public final SubstanceColorScheme getBackgroundColorScheme(DecorationAreaType decorationAreaType) {
        // 1 - check the registered background scheme for this specific area type.
        if (this.backgroundColorSchemeMap.containsKey(decorationAreaType)) {
            return this.backgroundColorSchemeMap.get(decorationAreaType);
        }
        // 2 - check the registered scheme bundle for this specific area type.
        if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
            SubstanceColorScheme registered = this.colorSchemeBundleMap.get(
                    decorationAreaType).getEnabledColorScheme();
            if (registered != null) {
                return registered;
            }
        }
        // 3 - return the background scheme for the default area type
        return this.backgroundColorSchemeMap.get(DecorationAreaType.NONE);
    }

    public void setOverlayColor(Color color, SubstanceSlices.ColorOverlayType colorOverlayType,
            DecorationAreaType decorationAreaType, ComponentState... componentStates) {
        if (!this.colorOverlayMap.containsKey(colorOverlayType)) {
            this.colorOverlayMap.put(colorOverlayType, new HashMap<>());
        }
        Map<DecorationAreaType, Map<ComponentState, Color>> forOverlay = this.colorOverlayMap.get(colorOverlayType);
        if (!forOverlay.containsKey(decorationAreaType)) {
            forOverlay.put(decorationAreaType, new HashMap<>());
        }
        Map<ComponentState, Color> forDecorationArea = forOverlay.get(decorationAreaType);
        for (ComponentState componentState : componentStates) {
            forDecorationArea.put(componentState, color);
        }
    }

    public Color getOverlayColor(SubstanceSlices.ColorOverlayType colorOverlayType,
            DecorationAreaType decorationAreaType, ComponentState componentState) {
        if (!this.colorOverlayMap.containsKey(colorOverlayType)) {
            return null;
        }
        Map<DecorationAreaType, Map<ComponentState, Color>> forOverlay = this.colorOverlayMap.get(colorOverlayType);
        if (!forOverlay.containsKey(decorationAreaType)) {
            return null;
        }
        return forOverlay.get(decorationAreaType).get(componentState);
    }

    public void setOptionPaneIconColorScheme(SubstanceColorScheme colorScheme,
            int... optionPaneMessageTypes) {
        if (colorScheme == null) {
            throw new IllegalArgumentException("Cannot pass null color scheme");
        }
        for (int optionPaneMessageType : optionPaneMessageTypes) {
            if ((optionPaneMessageType != JOptionPane.ERROR_MESSAGE) &&
                    (optionPaneMessageType != JOptionPane.WARNING_MESSAGE) &&
                    (optionPaneMessageType != JOptionPane.INFORMATION_MESSAGE) &&
                    (optionPaneMessageType != JOptionPane.QUESTION_MESSAGE)) {
                throw new IllegalArgumentException("Unsupported message type " +
                        optionPaneMessageType);
            }
        }
        for (int optionPaneMessageType : optionPaneMessageTypes) {
            this.optionPaneIconColorSchemeMap.put(optionPaneMessageType, colorScheme);
        }
    }

    public SubstanceColorScheme getOptionPaneIconColorScheme(int optionPaneMessageType) {
        return this.optionPaneIconColorSchemeMap.get(optionPaneMessageType);
    }

    /**
     * Checks whether this skin is valid. A valid skin must have a color scheme
     * bundle for {@link DecorationAreaType#NONE} and non-<code>null</code>
     * button shaper, gradient painter, border painter, highlight painter and
     * decoration painter. If call to
     * {@link SubstanceCortex.GlobalScope#setSkin(String)} or
     * {@link SubstanceCortex.GlobalScope#setSkin(SubstanceSkin)} does not seem to have
     * any visible effect (returning <code>false</code>), call this method to
     * verify that your skin is valid.
     *
     * @return <code>true</code> if this skin is valid, <code>false</code>
     * otherwise.
     */
    public boolean isValid() {
        if (!this.colorSchemeBundleMap.containsKey(DecorationAreaType.NONE)) {
            return false;
        }
        if (this.getButtonShaper() == null) {
            return false;
        }
        if (this.getFillPainter() == null) {
            return false;
        }
        if (this.getBorderPainter() == null) {
            return false;
        }
        if (this.getHighlightPainter() == null) {
            return false;
        }
        if (this.getDecorationPainter() == null) {
            return false;
        }
        return true;
    }

    public interface ColorSchemes {
        /**
         * Returns all the color schemes handled by this object.
         *
         * @return All the color schemes handled by this object.
         */
        Collection<SubstanceColorScheme> getAll();

        /**
         * Returns the color scheme based on its display name.
         *
         * @param displayName Display name of a color scheme.
         * @return The color scheme with the matching display name.
         */
        SubstanceColorScheme get(String displayName);
    }

    /**
     * Returns the collection of color schemes in the specified input stream.
     *
     * @param inputStream Input stream for the resource containing the description of
     *                    Substance color schemes.
     * @return The collection of color schemes in the specified input stream.
     */
    public static ColorSchemes getColorSchemes(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Can't read color schemes from a null stream");
        }
        return SubstanceColorSchemeUtilities.getColorSchemes(inputStream);
    }
}
