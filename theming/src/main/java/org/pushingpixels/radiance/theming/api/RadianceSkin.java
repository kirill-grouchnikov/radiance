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

import org.pushingpixels.radiance.theming.api.colorscheme.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.colorscheme.PaletteContainerColorsResolver;
import org.pushingpixels.radiance.theming.api.colorscheme.PaletteResolverUtils;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.api.trait.RadianceTrait;
import org.pushingpixels.radiance.theming.internal.utils.SkinTonalUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Base abstract class for Radiance skins.
 *
 * @author Kirill Grouchnikov
 */
public abstract class RadianceSkin implements RadianceTrait {
    /**
     * Base class for skins that can be configured with accent color tokens. Accented skins can
     * be extended to apply those color tokens in a way that highlights certain parts of
     * the UI while still retaining the "core" feel of the specific skin family. Note that
     * it is up to the specific implementation of the base accented skin to decide which
     * parts of the UI are painted with specific accent color tokens, and that decision may vary
     * between different base accented skins.
     * <p>
     * This class exposes APIs to get the accent tokens for consistent accent usage
     * in custom-painted parts of your UI.
     */
    public static abstract class Accented extends RadianceSkin {
        public final static class AccentBuilder {
            private PaletteContainerColorsResolver defaultAreaPaletteColorResolver;
            private ContainerColorTokens defaultAreaActiveTokens;
            private ContainerColorTokens defaultAreaMutedTokens;
            private ContainerColorTokens defaultAreaNeutralTokens;
            private ContainerColorTokens defaultAreaHighlightTokens;
            private ContainerColorTokens defaultAreaSelectedTokens;
            private ContainerColorTokens headerAreaActiveTokens;
            private ContainerColorTokens headerAreaMutedTokens;
            private ContainerColorTokens headerAreaNeutralTokens;
            private ContainerColorTokens headerAreaHighlightTokens;

            public AccentBuilder() {
                this.defaultAreaPaletteColorResolver = PaletteResolverUtils.getPaletteColorResolver();
            }

            public AccentBuilder withDefaultAreaPaletteColorResolver(PaletteContainerColorsResolver defaultAreaPaletteColorResolver) {
                this.defaultAreaPaletteColorResolver = defaultAreaPaletteColorResolver;
                return this;
            }

            public AccentBuilder withDefaultAreaActiveTokens(ContainerColorTokens defaultAreaActiveTokens) {
                this.defaultAreaActiveTokens = defaultAreaActiveTokens;
                return this;
            }

            public AccentBuilder withDefaultAreaMutedTokens(ContainerColorTokens defaultAreaMutedTokens) {
                this.defaultAreaMutedTokens = defaultAreaMutedTokens;
                return this;
            }

            public AccentBuilder withDefaultAreaNeutralTokens(ContainerColorTokens defaultAreaNeutralTokens) {
                this.defaultAreaNeutralTokens = defaultAreaNeutralTokens;
                return this;
            }

            public AccentBuilder withDefaultAreaHighlightTokens(ContainerColorTokens defaultAreaHighlightTokens) {
                this.defaultAreaHighlightTokens = defaultAreaHighlightTokens;
                return this;
            }

            public AccentBuilder withDefaultAreaSelectedTokens(ContainerColorTokens defaultAreaSelectedTokens) {
                this.defaultAreaSelectedTokens = defaultAreaSelectedTokens;
                return this;
            }

            public AccentBuilder withHeaderAreaActiveTokens(ContainerColorTokens headerAreaActiveTokens) {
                this.headerAreaActiveTokens = headerAreaActiveTokens;
                return this;
            }

            public AccentBuilder withHeaderAreaMutedTokens(ContainerColorTokens headerAreaMutedTokens) {
                this.headerAreaMutedTokens = headerAreaMutedTokens;
                return this;
            }

            public AccentBuilder withHeaderAreaNeutralTokens(ContainerColorTokens headerAreaNeutralTokens) {
                this.headerAreaNeutralTokens = headerAreaNeutralTokens;
                return this;
            }

            public AccentBuilder withHeaderAreaHighlightTokens(ContainerColorTokens headerAreaHighlightTokens) {
                this.headerAreaHighlightTokens = headerAreaHighlightTokens;
                return this;
            }
        }

        private final PaletteContainerColorsResolver defaultAreaPaletteColorResolver;
        private final ContainerColorTokens defaultAreaActiveTokens;
        private final ContainerColorTokens defaultAreaMutedTokens;
        private final ContainerColorTokens defaultAreaNeutralTokens;
        private final ContainerColorTokens defaultAreaHighlightTokens;
        private final ContainerColorTokens defaultAreaSelectedTokens;
        private final ContainerColorTokens headerAreaActiveTokens;
        private final ContainerColorTokens headerAreaMutedTokens;
        private final ContainerColorTokens headerAreaNeutralTokens;
        private final ContainerColorTokens headerAreaHighlightTokens;

        protected Accented(AccentBuilder accentBuilder) {
            this.defaultAreaPaletteColorResolver = accentBuilder.defaultAreaPaletteColorResolver;
            this.defaultAreaActiveTokens = accentBuilder.defaultAreaActiveTokens;
            this.defaultAreaMutedTokens = accentBuilder.defaultAreaMutedTokens;
            this.defaultAreaNeutralTokens = accentBuilder.defaultAreaNeutralTokens;
            this.defaultAreaHighlightTokens = accentBuilder.defaultAreaHighlightTokens;
            this.defaultAreaSelectedTokens = accentBuilder.defaultAreaSelectedTokens;
            this.headerAreaActiveTokens = accentBuilder.headerAreaActiveTokens;
            this.headerAreaMutedTokens = accentBuilder.headerAreaMutedTokens;
            this.headerAreaNeutralTokens = accentBuilder.headerAreaNeutralTokens;
            this.headerAreaHighlightTokens = accentBuilder.headerAreaHighlightTokens;
        }

        public PaletteContainerColorsResolver getDefaultAreaPaletteColorResolver() {
            return this.defaultAreaPaletteColorResolver;
        }

        public ContainerColorTokens getDefaultAreaActiveTokens() {
            return this.defaultAreaActiveTokens;
        }

        public ContainerColorTokens getDefaultAreaMutedTokens() {
            return this.defaultAreaMutedTokens;
        }

        public ContainerColorTokens getDefaultAreaNeutralTokens() {
            return this.defaultAreaNeutralTokens;
        }

        public ContainerColorTokens getDefaultAreaHighlightTokens() {
            return this.defaultAreaHighlightTokens;
        }

        public ContainerColorTokens getDefaultAreaSelectedTokens() {
            return this.defaultAreaSelectedTokens;
        }

        public ContainerColorTokens getHeaderAreaActiveTokens() {
            return this.headerAreaActiveTokens;
        }

        public ContainerColorTokens getHeaderAreaMutedTokens() {
            return this.headerAreaMutedTokens;
        }

        public ContainerColorTokens getHeaderAreaNeutralTokens() {
            return this.headerAreaNeutralTokens;
        }

        public ContainerColorTokens getHeaderAreaHighlightTokens() {
            return this.headerAreaHighlightTokens;
        }
    }

    /**
     * Maps decoration area type to the color scheme bundles. Must contain an
     * entry for {@link RadianceThemingSlices.DecorationAreaType#NONE}.
     */
    private Map<RadianceThemingSlices.DecorationAreaType, RadianceColorSchemeBundle> tonalColorSchemeMap;

    /**
     * Maps decoration area type to the background color tokens.
     */
    private Map<RadianceThemingSlices.DecorationAreaType, ContainerColorTokens> tonalBackgroundTokensMap;

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
     * The outline painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceOutlinePainter outlinePainter;

    /**
     * The highlight outline painter of <code>this</code> skin. Can be <code>null</code>.
     */
    protected RadianceOutlinePainter highlightOutlinePainter;

    /**
     * The decoration painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceDecorationPainter decorationPainter;

    /**
     * Set of all decoration area types that are not explicitly registered in
     * {@link #tonalColorSchemeMap} but still are considered as decoration
     * areas in this skin. Controls in such areas will have their background painted by
     * <p>
     * {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     * instead of a simple background fill.
     */
    private Set<RadianceThemingSlices.DecorationAreaType> decoratedAreaSet;

    private Map<Integer, ContainerColorTokens> optionPaneIconColorTokenMap;

    /**
     * Constructs the basic data structures for a skin.
     */
    protected RadianceSkin() {
        this.tonalColorSchemeMap = new HashMap<>();
        this.tonalBackgroundTokensMap = new HashMap<>();
        this.overlayPaintersMap = new HashMap<>();

        this.decoratedAreaSet = new HashSet<>();
        this.decoratedAreaSet.add(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
        this.decoratedAreaSet.add(RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE);

        this.optionPaneIconColorTokenMap = new HashMap<>();
    }

    /**
     * Returns the outline painter of this skin.
     *
     * @return The outline painter of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final RadianceOutlinePainter getOutlinePainter() {
        return this.outlinePainter;
    }

    /**
     * Returns the highlight outline painter of this skin.
     *
     * @return The highlight outline painter of this skin. The return value of
     * this method may be <code>null</code>. In this case, call
     * {@link #getOutlinePainter()}.
     */
    public final RadianceOutlinePainter getHighlightOutlinePainter() {
        return this.highlightOutlinePainter;
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

        SkinTonalUtilities.addCustomEntriesToTable(table, this);
    }

    /**
     * Returns the color tokens of the specified component in the specified
     * component state.
     *
     * @param comp           Component.
     * @param componentState Component state.
     * @return The color tokens of the component in the specified component state.
     */
    public final ContainerColorTokens getContainerTokens(Component comp,
        ComponentState componentState, RadianceThemingSlices.ContainerType inactiveContainerType) {
        if (componentState.isDisabled()) {
            return getContainerTokens(comp, componentState.getEnabledMatch(), inactiveContainerType);
        }

        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.tonalColorSchemeMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
                RadianceThemingSlices.DecorationAreaType.NONE :
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.tonalColorSchemeMap.containsKey(decorationAreaType)) {
                ContainerColorTokens registered = this.tonalColorSchemeMap
                    .get(decorationAreaType).getContainerTokens(componentState, inactiveContainerType);
                if (registered == null) {
                    throw new IllegalStateException("Color tokens shouldn't be null here. Please "
                        + "report this issue");
                }

                return registered;
            }
        }

        ContainerColorTokens registered = this.tonalColorSchemeMap
            .get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getContainerTokens(componentState, inactiveContainerType);
        if (registered == null) {
            throw new IllegalStateException("Color tokens scheme shouldn't be null here. Please report " + "this issue");
        }

        return registered;
    }

    public final ContainerColorTokens getSystemContainerTokens(Component comp,
        RadianceThemingSlices.SystemContainerType systemContainerType) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.tonalColorSchemeMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
                RadianceThemingSlices.DecorationAreaType.NONE :
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.tonalColorSchemeMap.containsKey(decorationAreaType)) {
                return this.tonalColorSchemeMap.get(decorationAreaType)
                    .getSystemContainerTokens(systemContainerType);
            }
        }

        return this.tonalColorSchemeMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getSystemContainerTokens(systemContainerType);
    }

    public final ContainerColorTokens getInverseSystemContainerTokens(Component comp,
        RadianceThemingSlices.SystemContainerType systemContainerType) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.tonalColorSchemeMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
                RadianceThemingSlices.DecorationAreaType.NONE :
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.tonalColorSchemeMap.containsKey(decorationAreaType)) {
                return this.tonalColorSchemeMap.get(decorationAreaType)
                    .getInverseSystemContainerTokens(systemContainerType);
            }
        }

        return this.tonalColorSchemeMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getInverseSystemContainerTokens(systemContainerType);
    }

    /**
     * Registers the specified color scheme bundle and background color tokens
     * to be used on controls in decoration areas.
     *
     * @param bundle                The color scheme bundle to use on controls in decoration
     *                              areas.
     * @param backgroundTokens The color tokens to use for background of controls in
     *                              decoration areas.
     * @param areaTypes             Enumerates the area types that are affected by the parameters.
     */
    public void registerDecorationAreaSchemeBundle(
        RadianceColorSchemeBundle bundle,
        ContainerColorTokens backgroundTokens,
        RadianceThemingSlices.DecorationAreaType... areaTypes) {
        if (bundle == null) {
            return;
        }

        if (backgroundTokens == null) {
            throw new IllegalArgumentException("Cannot pass null background tokens");
        }

        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
            this.decoratedAreaSet.add(areaType);
            this.tonalColorSchemeMap.put(areaType, bundle);
            this.tonalBackgroundTokensMap.put(areaType, backgroundTokens);
        }
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
        this.registerDecorationAreaSchemeBundle(bundle,
            bundle.getMainColorScheme().getNeutralContainerTokens(),
            areaTypes);
    }

    /**
     * Registers the specified background color tokens to be used on controls in
     * decoration areas.
     *
     * @param backgroundContainerTokens The color tokens to use for background of controls in
     *                              decoration areas.
     * @param areaTypes             Enumerates the area types that are affected by the parameters.
     *                              Each decoration area type will be painted by
     *                              {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     */
    public void registerAsDecorationArea(ContainerColorTokens backgroundContainerTokens,
            RadianceThemingSlices.DecorationAreaType... areaTypes) {
        if (backgroundContainerTokens == null) {
            throw new IllegalArgumentException(
                    "Cannot pass null background color tokens");
        }
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
            this.decoratedAreaSet.add(areaType);
            this.tonalBackgroundTokensMap.put(areaType, backgroundContainerTokens);
        }
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

    public final ContainerColorTokens getNeutralContainerTokens(
        RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (this.tonalColorSchemeMap.containsKey(decorationAreaType)) {
            return this.tonalColorSchemeMap.get(decorationAreaType).getMainColorScheme().getNeutralContainerTokens();
        }
        return this.tonalColorSchemeMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getMainColorScheme().getNeutralContainerTokens();
    }

    public final ContainerColorTokens getMutedContainerTokens(
        RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (this.tonalColorSchemeMap.containsKey(decorationAreaType)) {
            return this.tonalColorSchemeMap.get(decorationAreaType).getMainColorScheme().getMutedContainerTokens();
        }
        return this.tonalColorSchemeMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getMainColorScheme().getMutedContainerTokens();
    }

    public final ContainerColorTokens getActiveContainerTokens(
        RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (this.tonalColorSchemeMap.containsKey(decorationAreaType)) {
            return this.tonalColorSchemeMap.get(decorationAreaType).getMainColorScheme().getActiveContainerTokens();
        }
        return this.tonalColorSchemeMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getMainColorScheme().getActiveContainerTokens();
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
     * Returns the color tokens to be used for painting the specified visual
     * area of the component under the specified component state.
     *
     * @param comp            Component.
     * @param associationKind Color scheme association kind.
     * @param componentState  Component state.
     * @return Color scheme to be used for painting the specified visual area of
     * the component under the specified component state.
     */
    public final ContainerColorTokens getContainerTokens(Component comp,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState, RadianceThemingSlices.ContainerType inactiveContainerType) {

        if (componentState.isDisabled()) {
            return getContainerTokens(comp, associationKind, componentState.getEnabledMatch(),
                inactiveContainerType);
        }

        // small optimization - lookup the decoration area only if there
        // are decoration-specific scheme bundles.
        if (this.tonalColorSchemeMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ? RadianceThemingSlices.DecorationAreaType.NONE
                : RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.tonalColorSchemeMap.containsKey(decorationAreaType)) {
                return this.tonalColorSchemeMap.get(decorationAreaType).getContainerTokens(
                    associationKind, componentState, inactiveContainerType);
            }
        }
        return this.tonalColorSchemeMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getContainerTokens(associationKind, componentState, inactiveContainerType);
    }

    /**
     * Returns the background color tokens for the specified decoration area
     * type. This method is mainly for the internal use of
     * {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     * but can be used in applications that wish to provide custom overlay
     * background painting.
     *
     * @param decorationAreaType Decoration area type.
     * @return The background color tokens for the specified decoration area type.
     */
    public final ContainerColorTokens getBackgroundContainerTokens(
            RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        // 1 - check the registered background scheme for this specific area type.
        if (this.tonalBackgroundTokensMap.containsKey(decorationAreaType)) {
            return this.tonalBackgroundTokensMap.get(decorationAreaType);
        }
        // 2 - check the registered scheme bundle for this specific area type.
        if (this.tonalColorSchemeMap.containsKey(decorationAreaType)) {
            ContainerColorTokens registered = this.tonalBackgroundTokensMap.
                get(decorationAreaType);
            if (registered != null) {
                return registered;
            }
        }
        // 3 - return the background scheme for the default area type
        return this.tonalBackgroundTokensMap.get(RadianceThemingSlices.DecorationAreaType.NONE);
    }

    public ContainerColorTokens getOptionPaneIconContainerTokens(int optionPaneMessageType) {
        // late initialization of tokens. This isn't done at construction time, since
        // in the constructor of this base skin we don't yet have access to the color tokens
        // associated with the full skin
        if (!this.optionPaneIconColorTokenMap.containsKey(JOptionPane.INFORMATION_MESSAGE)) {
            this.optionPaneIconColorTokenMap.put(JOptionPane.INFORMATION_MESSAGE,
                this.getInverseSystemContainerTokens(null, RadianceThemingSlices.SystemContainerType.INFO));
        }
        if (!this.optionPaneIconColorTokenMap.containsKey(JOptionPane.QUESTION_MESSAGE)) {
            this.optionPaneIconColorTokenMap.put(JOptionPane.QUESTION_MESSAGE,
                this.getInverseSystemContainerTokens(null, RadianceThemingSlices.SystemContainerType.INFO));
        }
        if (!this.optionPaneIconColorTokenMap.containsKey(JOptionPane.WARNING_MESSAGE)) {
            this.optionPaneIconColorTokenMap.put(JOptionPane.WARNING_MESSAGE,
                this.getInverseSystemContainerTokens(null, RadianceThemingSlices.SystemContainerType.WARNING));
        }
        if (!this.optionPaneIconColorTokenMap.containsKey(JOptionPane.ERROR_MESSAGE)) {
            this.optionPaneIconColorTokenMap.put(JOptionPane.ERROR_MESSAGE,
                this.getInverseSystemContainerTokens(null, RadianceThemingSlices.SystemContainerType.ERROR));
        }
        return this.optionPaneIconColorTokenMap.get(optionPaneMessageType);
    }


    /**
     * Checks whether this skin is valid. A valid skin must have a color scheme
     * bundle for {@link RadianceThemingSlices.DecorationAreaType#NONE} and non-<code>null</code>
     * button shaper, gradient painter, outline painter, highlight painter and
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
        if (!this.tonalColorSchemeMap.containsKey(RadianceThemingSlices.DecorationAreaType.NONE)) {
            return false;
        }
        if (this.getButtonShaper() == null) {
            return false;
        }
        if (this.getFillPainter() == null) {
            return false;
        }
        if (this.getOutlinePainter() == null) {
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
}
