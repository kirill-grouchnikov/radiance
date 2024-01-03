/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.colorscheme.SteelBlueColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.SunsetColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.api.trait.RadianceTrait;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.SkinUtilities;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.util.List;
import java.util.*;

/**
 * Base abstract class for Radiance skins.
 *
 * @author Kirill Grouchnikov
 */
public abstract class RadianceSkin implements RadianceTrait {
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
    public static abstract class Accented extends RadianceSkin {
        public final static class AccentBuilder {
            private RadianceColorScheme windowChromeAccent;
            private RadianceColorScheme enabledControlsAccent;
            private RadianceColorScheme activeControlsAccent;
            private RadianceColorScheme highlightsAccent;
            private RadianceColorScheme backgroundAccent;
            private ColorSchemes accentColorSchemes;

            public AccentBuilder() {
            }

            public AccentBuilder withAccentResource(String colorSchemeResourceName) {
                this.accentColorSchemes = RadianceSkin.getColorSchemes(
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

            public AccentBuilder withWindowChromeAccent(RadianceColorScheme windowChromeAccent) {
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

            public AccentBuilder withActiveControlsAccent(RadianceColorScheme activeControlsAccent) {
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

            public AccentBuilder withEnabledControlsAccent(RadianceColorScheme enabledControlsAccent) {
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

            public AccentBuilder withHighlightsAccent(RadianceColorScheme highlightsAccent) {
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

            public AccentBuilder withBackgroundAccent(RadianceColorScheme backgroundAccent) {
                this.backgroundAccent = backgroundAccent;
                return this;
            }
        }

        private final RadianceColorScheme windowChromeAccent;
        private final RadianceColorScheme activeControlsAccent;
        private final RadianceColorScheme enabledControlsAccent;
        private final RadianceColorScheme highlightsAccent;
        private final RadianceColorScheme backgroundAccent;

        protected Accented(AccentBuilder accentBuilder) {
            this.windowChromeAccent = accentBuilder.windowChromeAccent;
            this.activeControlsAccent = accentBuilder.activeControlsAccent;
            this.enabledControlsAccent = accentBuilder.enabledControlsAccent;
            this.highlightsAccent = accentBuilder.highlightsAccent;
            this.backgroundAccent = accentBuilder.backgroundAccent;
        }

        public RadianceColorScheme getBackgroundAccent() {
            return this.backgroundAccent;
        }

        public RadianceColorScheme getActiveControlsAccent() {
            return this.activeControlsAccent;
        }

        public RadianceColorScheme getEnabledControlsAccent() {
            return this.enabledControlsAccent;
        }

        public RadianceColorScheme getHighlightsAccent() {
            return this.highlightsAccent;
        }

        public RadianceColorScheme getWindowChromeAccent() {
            return this.windowChromeAccent;
        }
    }

    /**
     * Maps decoration area type to the color scheme bundles. Must contain an
     * entry for {@link RadianceThemingSlices.DecorationAreaType#NONE}.
     */
    private Map<RadianceThemingSlices.DecorationAreaType, RadianceColorSchemeBundle> colorSchemeBundleMap;

    /**
     * Maps decoration area type to the background color schemes.
     */
    private Map<RadianceThemingSlices.DecorationAreaType, RadianceColorScheme> backgroundColorSchemeMap;

    /**
     * Maps decoration area type to the registered overlay painters. Each
     * decoration area type can have more than one overlay painter.
     */
    private Map<RadianceThemingSlices.DecorationAreaType, List<RadianceOverlayPainter>> overlayPaintersMap;

    /**
     * The button shaper of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceButtonShaper buttonShaper;

    /**
     * The fill painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceFillPainter fillPainter;

    /**
     * The highlight fill painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceFillPainter highlightFillPainter;

    /**
     * The border painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceBorderPainter borderPainter;

    /**
     * The highlight border painter of <code>this</code> skin. Can be <code>null</code>.
     */
    protected RadianceBorderPainter highlightBorderPainter;

    /**
     * The decoration painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceDecorationPainter decorationPainter;

    /**
     * Set of all decoration area types that are not explicitly registered in
     * {@link #colorSchemeBundleMap} but still are considered as decoration
     * areas in this skin. Controls in such areas will have their background painted by
     * <p>
     * {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     * instead of a simple background fill.
     */
    private Set<RadianceThemingSlices.DecorationAreaType> decoratedAreaSet;

    /**
     * All component states that have associated non-trivial alpha values.
     */
    private Set<ComponentState> statesWithAlpha;

    private Map<RadianceThemingSlices.ColorOverlayType, Map<RadianceThemingSlices.DecorationAreaType, Map<ComponentState, Color>>> colorOverlayMap;

    private Map<Integer, RadianceColorScheme> optionPaneIconColorSchemeMap;

    /**
     * Constructs the basic data structures for a skin.
     */
    protected RadianceSkin() {
        this.colorSchemeBundleMap = new HashMap<>();
        this.backgroundColorSchemeMap = new HashMap<>();
        this.overlayPaintersMap = new HashMap<>();
        this.colorOverlayMap = new HashMap<>();

        this.decoratedAreaSet = new HashSet<>();
        this.decoratedAreaSet.add(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
        this.decoratedAreaSet.add(RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE);

        this.optionPaneIconColorSchemeMap = new HashMap<>();
        RadianceColorScheme sunset = new SunsetColorScheme();
        RadianceColorScheme steelBlue = new SteelBlueColorScheme();
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
    public final RadianceBorderPainter getBorderPainter() {
        return this.borderPainter;
    }

    /**
     * Returns the highlight border painter of this skin.
     *
     * @return The highlight border painter of this skin. The return value of
     * this method may be <code>null</code>. In this case, call
     * {@link #getBorderPainter()}.
     */
    public final RadianceBorderPainter getHighlightBorderPainter() {
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
    public final RadianceButtonShaper getButtonShaper() {
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
    public final RadianceFillPainter getFillPainter() {
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
    public final RadianceFillPainter getHighlightFillPainter() {
        return this.highlightFillPainter;
    }

    /**
     * Returns the decoration painter of this skin.
     *
     * @return The decoration painter of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final RadianceDecorationPainter getDecorationPainter() {
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
    public final RadianceColorScheme getColorScheme(Component comp,
            ComponentState componentState) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.colorSchemeBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ? RadianceThemingSlices.DecorationAreaType.NONE
                    : RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                RadianceColorScheme registered = this.colorSchemeBundleMap
                        .get(decorationAreaType).getColorScheme(componentState);
                if (registered == null) {
                    throw new IllegalStateException(
                            "Color scheme shouldn't be null here. Please report this issue");
                }
                return registered;
            }
        }

        RadianceColorScheme registered = this.colorSchemeBundleMap.get(
                RadianceThemingSlices.DecorationAreaType.NONE).getColorScheme(componentState);
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
            RadianceThemingSlices.DecorationAreaType decorationAreaType =
                    RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                if (this.colorSchemeBundleMap.get(decorationAreaType).hasHighlightAlphaFor(componentState)) {
                    return this.colorSchemeBundleMap.get(decorationAreaType)
                            .getHighlightAlpha(componentState);
                }
            }
        }

        if (this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE).
                hasHighlightAlphaFor(componentState)) {
            return this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
                    .getHighlightAlpha(componentState);
        }

        boolean isRollover = componentState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER);
        boolean isSelected = componentState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION);
        boolean isArmed = componentState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ARM);

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
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ? RadianceThemingSlices.DecorationAreaType.NONE :
                    RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                if (this.colorSchemeBundleMap.get(decorationAreaType).hasAlphaFor(componentState)) {
                    return this.colorSchemeBundleMap.get(decorationAreaType).getAlpha(componentState);
                }
            }
        }

        if (this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE).
                hasAlphaFor(componentState)) {
            return this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE).
                    getAlpha(componentState);
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
            RadianceColorSchemeBundle bundle,
            RadianceColorScheme backgroundColorScheme,
            RadianceThemingSlices.DecorationAreaType... areaTypes) {
        if (bundle == null) {
            return;
        }

        if (backgroundColorScheme == null) {
            throw new IllegalArgumentException(
                    "Cannot pass null background color scheme");
        }

        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
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
            RadianceColorSchemeBundle bundle, RadianceThemingSlices.DecorationAreaType... areaTypes) {
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
     *                              {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     */
    public void registerAsDecorationArea(RadianceColorScheme backgroundColorScheme,
            RadianceThemingSlices.DecorationAreaType... areaTypes) {
        if (backgroundColorScheme == null) {
            throw new IllegalArgumentException(
                    "Cannot pass null background color scheme");
        }
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
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
     * @param noneTransformationOverlay Overlay to be applied to the {@link RadianceColorSchemeBundle}
     *                                  registered on the {@link RadianceThemingSlices.DecorationAreaType#NONE}, with the
     *                                  resulting color scheme bundle to be used on #areaTypes.
     * @param areaTypes                 Enumerates the area types that are affected by the
     *                                  parameters. Each decoration area type will be painted by
     *                                  {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     */
    public void registerAsDecorationArea(RadianceColorScheme backgroundColorScheme,
            RadianceColorSchemeBundle.Overlay noneTransformationOverlay,
            RadianceThemingSlices.DecorationAreaType... areaTypes) {
        RadianceColorSchemeBundle defaultBundle =
                this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE);
        if (defaultBundle == null) {
            throw new IllegalStateException("Cannot apply overlay without a registered NONE bundle");
        }

        // Apply a dummy "transformation" - effectively makes a deep copy of the default bundle
        RadianceColorSchemeBundle noneCopy = defaultBundle.transform(scheme -> scheme);
        // Apply the overlay
        noneTransformationOverlay.overlay(noneCopy);
        // And register the overlay transform on the requested decoration areas
        this.registerDecorationAreaSchemeBundle(noneCopy, backgroundColorScheme, areaTypes);
    }

    /**
     * Returns indication whether the specified decoration area type should have
     * their background painted by
     * {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     * instead of a simple background fill.
     *
     * @param decorationType Decoration area type.
     * @return <code>true</code> if specified decoration area type should have
     * their background painted by
     * {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     * , <code>false</code> otherwise.
     */
    public boolean isRegisteredAsDecorationArea(RadianceThemingSlices.DecorationAreaType decorationType) {
        return this.decoratedAreaSet.contains(decorationType);
    }

    /**
     * Returns the main active color scheme for the specific decoration area
     * type. Custom painting code that needs to consult the colors of the
     * specific component should use
     * {@link #getColorScheme(Component, ComponentState)} method and various
     * {@link RadianceColorScheme} methods.
     *
     * @param decorationAreaType Decoration area type.
     * @return The main active color scheme for this skin.
     * @see #getColorScheme(Component, ComponentState)
     */
    public final RadianceColorScheme getActiveColorScheme(
            RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
            return this.colorSchemeBundleMap.get(decorationAreaType).getActiveColorScheme();
        }
        return this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE).getActiveColorScheme();
    }

    /**
     * Returns the main enabled color scheme for the specific decoration area
     * type. Custom painting code that needs to consult the colors of the
     * specific component should use
     * {@link #getColorScheme(Component, ComponentState)} method and various
     * {@link RadianceColorScheme} methods.
     *
     * @param decorationAreaType Decoration area type.
     * @return The main enabled color scheme for this skin.
     * @see #getColorScheme(Component, ComponentState)
     */
    public final RadianceColorScheme getEnabledColorScheme(
            RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
            return this.colorSchemeBundleMap.get(decorationAreaType).getEnabledColorScheme();
        }
        return this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE).getEnabledColorScheme();
    }

    /**
     * Returns the main disabled color scheme for the specific decoration area
     * type. Custom painting code that needs to consult the colors of the
     * specific component should use
     * {@link #getColorScheme(Component, ComponentState)} method and various
     * {@link RadianceColorScheme} methods.
     *
     * @param decorationAreaType Decoration area type.
     * @return The main disabled color scheme for this skin.
     * @see #getColorScheme(Component, ComponentState)
     */
    public final RadianceColorScheme getDisabledColorScheme(
            RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
            return this.colorSchemeBundleMap.get(decorationAreaType).getDisabledColorScheme();
        }
        return this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE).getDisabledColorScheme();
    }

    /**
     * Adds the specified overlay painter to the end of the list of overlay
     * painters associated with the specified decoration area types.
     *
     * @param overlayPainter Overlay painter to add to the end of the list of overlay
     *                       painters associated with the specified decoration area types.
     * @param areaTypes      Decoration area types.
     */
    public void addOverlayPainter(RadianceOverlayPainter overlayPainter,
            RadianceThemingSlices.DecorationAreaType... areaTypes) {
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
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
    public void removeOverlayPainter(RadianceOverlayPainter overlayPainter,
            RadianceThemingSlices.DecorationAreaType... areaTypes) {
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
            if (!this.overlayPaintersMap.containsKey(areaType)) {
                return;
            }
            this.overlayPaintersMap.get(areaType).remove(overlayPainter);
            if (this.overlayPaintersMap.get(areaType).isEmpty()) {
                this.overlayPaintersMap.remove(areaType);
            }
        }
    }

    /**
     * Removes all overlay painters associated with the specified decoration area types.
     *
     * @param areaTypes Decoration area types.
     */
    public void clearOverlayPainters(RadianceThemingSlices.DecorationAreaType... areaTypes) {
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
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
    public List<RadianceOverlayPainter> getOverlayPainters(RadianceThemingSlices.DecorationAreaType decorationAreaType) {
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
    public final RadianceColorScheme getColorScheme(
            RadianceThemingSlices.DecorationAreaType decorationAreaType,
            RadianceThemingSlices.ColorSchemeAssociationKind associationKind,
            ComponentState componentState) {
        if (this.colorSchemeBundleMap.size() > 1) {
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                return this.colorSchemeBundleMap.get(decorationAreaType)
                        .getColorScheme(associationKind, componentState, true);
            }
        }
        return this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
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
    public final RadianceColorScheme getColorScheme(Component comp,
            RadianceThemingSlices.ColorSchemeAssociationKind associationKind,
            ComponentState componentState) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.colorSchemeBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ? RadianceThemingSlices.DecorationAreaType.NONE
                    : RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                return this.colorSchemeBundleMap.get(decorationAreaType)
                        .getColorScheme(associationKind, componentState, true);
            }
        }
        return this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
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
    public final RadianceColorScheme getDirectColorScheme(Component comp,
            RadianceThemingSlices.ColorSchemeAssociationKind associationKind,
            ComponentState componentState) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.colorSchemeBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = RadianceThemingCortex.ComponentOrParentChainScope
                    .getDecorationType(comp);
            if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
                return this.colorSchemeBundleMap.get(decorationAreaType)
                        .getColorScheme(associationKind, componentState, false);
            }
        }
        return this.colorSchemeBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
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
    public RadianceSkin transform(ColorSchemeTransform transform, final String name) {
        RadianceSkin result = new RadianceSkin() {
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
        result.highlightFillPainter = this.highlightFillPainter;
        result.highlightBorderPainter = this.highlightBorderPainter;

        // transform the scheme bundles
        if (this.colorSchemeBundleMap != null) {
            result.colorSchemeBundleMap = new HashMap<>();
            for (Map.Entry<RadianceThemingSlices.DecorationAreaType, RadianceColorSchemeBundle> bundleEntry :
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
            for (Map.Entry<RadianceThemingSlices.DecorationAreaType, RadianceColorScheme> entry :
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
     * {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     * but can be used in applications that wish to provide custom overlay
     * background painting.
     *
     * @param decorationAreaType Decoration area type.
     * @return The background color scheme for the specified decoration area type.
     */
    public final RadianceColorScheme getBackgroundColorScheme(RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        // 1 - check the registered background scheme for this specific area type.
        if (this.backgroundColorSchemeMap.containsKey(decorationAreaType)) {
            return this.backgroundColorSchemeMap.get(decorationAreaType);
        }
        // 2 - check the registered scheme bundle for this specific area type.
        if (this.colorSchemeBundleMap.containsKey(decorationAreaType)) {
            RadianceColorScheme registered = this.colorSchemeBundleMap.get(
                    decorationAreaType).getEnabledColorScheme();
            if (registered != null) {
                return registered;
            }
        }
        // 3 - return the background scheme for the default area type
        return this.backgroundColorSchemeMap.get(RadianceThemingSlices.DecorationAreaType.NONE);
    }

    public void setOverlayColor(Color color, RadianceThemingSlices.ColorOverlayType colorOverlayType,
            RadianceThemingSlices.DecorationAreaType decorationAreaType, ComponentState... componentStates) {
        if (!this.colorOverlayMap.containsKey(colorOverlayType)) {
            this.colorOverlayMap.put(colorOverlayType, new HashMap<>());
        }
        Map<RadianceThemingSlices.DecorationAreaType, Map<ComponentState, Color>> forOverlay = this.colorOverlayMap.get(colorOverlayType);
        if (!forOverlay.containsKey(decorationAreaType)) {
            forOverlay.put(decorationAreaType, new HashMap<>());
        }
        Map<ComponentState, Color> forDecorationArea = forOverlay.get(decorationAreaType);
        for (ComponentState componentState : componentStates) {
            forDecorationArea.put(componentState, color);
        }
    }

    public Color getOverlayColor(RadianceThemingSlices.ColorOverlayType colorOverlayType,
            RadianceThemingSlices.DecorationAreaType decorationAreaType, ComponentState componentState) {
        if (!this.colorOverlayMap.containsKey(colorOverlayType)) {
            return null;
        }
        Map<RadianceThemingSlices.DecorationAreaType, Map<ComponentState, Color>> forOverlay = this.colorOverlayMap.get(colorOverlayType);
        if (!forOverlay.containsKey(decorationAreaType)) {
            return null;
        }
        return forOverlay.get(decorationAreaType).get(componentState);
    }

    public void setOptionPaneIconColorScheme(RadianceColorScheme colorScheme,
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

    public RadianceColorScheme getOptionPaneIconColorScheme(int optionPaneMessageType) {
        return this.optionPaneIconColorSchemeMap.get(optionPaneMessageType);
    }

    /**
     * Checks whether this skin is valid. A valid skin must have a color scheme
     * bundle for {@link RadianceThemingSlices.DecorationAreaType#NONE} and non-<code>null</code>
     * button shaper, gradient painter, border painter, highlight painter and
     * decoration painter. If call to
     * {@link RadianceThemingCortex.GlobalScope#setSkin(String)} or
     * {@link RadianceThemingCortex.GlobalScope#setSkin(RadianceSkin)} does not seem to have
     * any visible effect (returning <code>false</code>), call this method to
     * verify that your skin is valid.
     *
     * @return <code>true</code> if this skin is valid, <code>false</code>
     * otherwise.
     */
    public boolean isValid() {
        if (!this.colorSchemeBundleMap.containsKey(RadianceThemingSlices.DecorationAreaType.NONE)) {
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
        if (this.getHighlightFillPainter() == null) {
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
        Collection<RadianceColorScheme> getAll();

        /**
         * Returns the color scheme based on its display name.
         *
         * @param displayName Display name of a color scheme.
         * @return The color scheme with the matching display name.
         */
        RadianceColorScheme get(String displayName);
    }

    /**
     * Returns the collection of color schemes in the specified input stream.
     *
     * @param inputStream Input stream for the resource containing the description of
     *                    Radiance color schemes.
     * @return The collection of color schemes in the specified input stream.
     */
    public static ColorSchemes getColorSchemes(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Can't read color schemes from a null stream");
        }
        return RadianceColorSchemeUtilities.getColorSchemes(inputStream);
    }
}
