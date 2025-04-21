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

import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.RadianceSurfacePainter;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolver;
import org.pushingpixels.radiance.theming.api.palette.TokenPaletteColorResolverUtils;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.api.trait.RadianceTrait;
import org.pushingpixels.radiance.theming.internal.utils.SkinUtilities;

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
            private TokenPaletteColorResolver defaultAreaPaletteColorResolver;
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
                this.defaultAreaPaletteColorResolver = TokenPaletteColorResolverUtils.getPaletteColorResolver();
            }

            public AccentBuilder withDefaultAreaPaletteColorResolver(TokenPaletteColorResolver defaultAreaPaletteColorResolver) {
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

        private final TokenPaletteColorResolver defaultAreaPaletteColorResolver;
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

        public TokenPaletteColorResolver getDefaultAreaPaletteColorResolver() {
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
     * Maps decoration area type to the color token bundles. Must contain an
     * entry for {@link RadianceThemingSlices.DecorationAreaType#NONE}.
     */
    private final Map<RadianceThemingSlices.DecorationAreaType, ContainerColorTokensBundle> colorTokensBundleMap;

    /**
     * Maps decoration area type to the neutral color tokens overrides.
     */
    private final Map<RadianceThemingSlices.DecorationAreaType, ContainerColorTokens> neutralColorTokensOverrideMap;

    /**
     * Maps decoration area type to the registered overlay painters. Each
     * decoration area type can have more than one overlay painter.
     */
    private final Map<RadianceThemingSlices.DecorationAreaType, List<RadianceOverlayPainter>> overlayPaintersMap;

    /**
     * The button shaper of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceButtonShaper buttonShaper;

    /**
     * The surface painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceSurfacePainter surfacePainter;

    /**
     * The highlight surface painter of <code>this</code> skin. Must be non-<code>null</code>.
     */
    protected RadianceSurfacePainter highlightSurfacePainter;

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
     * {@link #colorTokensBundleMap} but still are considered as decoration
     * areas in this skin. Controls in such areas will have their background painted by
     * {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     * instead of a simple background fill.
     */
    private final Set<RadianceThemingSlices.DecorationAreaType> decoratedAreaSet;

    /**
     * Constructs the basic data structures for a skin.
     */
    protected RadianceSkin() {
        this.colorTokensBundleMap = new HashMap<>();
        this.neutralColorTokensOverrideMap = new HashMap<>();
        this.overlayPaintersMap = new HashMap<>();

        this.decoratedAreaSet = new HashSet<>();
        this.decoratedAreaSet.add(RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
        this.decoratedAreaSet.add(RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE);
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
     * Returns the surface painter of this skin.
     *
     * @return The surface painter of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final RadianceSurfacePainter getSurfacePainter() {
        return this.surfacePainter;
    }

    /**
     * Returns the highlight painter of this skin.
     *
     * @return The highlight painter of this skin. A valid skin cannot have a
     * <code>null</code> value returned from this method. Call
     * {@link #isValid()} to verify that the skin is valid.
     * @see #isValid()
     */
    public final RadianceSurfacePainter getHighlightSurfacePainter() {
        return this.highlightSurfacePainter;
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
     * Returns neutral container tokens for the specified component.
     *
     * @param comp Component.
     * @return Neutral container tokens for the component.
     * 
     * @see #getNeutralContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType)
     * @see #getMutedContainerTokens(Component)
     * @see #getActiveContainerTokens(Component)
     */
    public final ContainerColorTokens getNeutralContainerTokens(Component comp) {
        RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
            RadianceThemingSlices.DecorationAreaType.NONE :
            RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
        return getNeutralContainerTokens(decorationAreaType);
    }

    /**
     * Returns muted container tokens for the specified component.
     *
     * @param comp Component.
     * @return Muted container tokens for the component.
     *
     * @see #getMutedContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind) 
     * @see #getMutedContainerTokens(RadianceThemingSlices.DecorationAreaType) 
     * @see #getNeutralContainerTokens(Component) 
     * @see #getActiveContainerTokens(Component)
     */
    public final ContainerColorTokens getMutedContainerTokens(Component comp) {
        RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
            RadianceThemingSlices.DecorationAreaType.NONE :
            RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
        return getMutedContainerTokens(decorationAreaType);
    }

    /**
     * Returns active container tokens for the specified component.
     *
     * @param comp Component.
     * @return Active container tokens for the component.
     *
     * @see #getActiveContainerTokens(Component, ComponentState) 
     * @see #getActiveContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState) 
     * @see #getActiveContainerTokens(RadianceThemingSlices.DecorationAreaType) 
     * @see #getNeutralContainerTokens(Component)
     * @see #getMutedContainerTokens(Component) 
     */
    public final ContainerColorTokens getActiveContainerTokens(Component comp) {
        RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
            RadianceThemingSlices.DecorationAreaType.NONE :
            RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
        return getActiveContainerTokens(decorationAreaType);
    }

    /**
     * Returns active container tokens for the specified component in the specific state.
     *
     * @param comp Component.
     * @param componentState Component state.
     * @return Active container tokens for the component.
     *
     * @see #getActiveContainerTokens(Component)
     * @see #getActiveContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
     * @see #getActiveContainerTokens(RadianceThemingSlices.DecorationAreaType)
     */
    public final ContainerColorTokens getActiveContainerTokens(Component comp,
        ComponentState componentState) {
        if (componentState.isDisabled()) {
            return getActiveContainerTokens(comp, componentState.getEnabledMatch());
        }

        // small optimization - lookup the decoration area only if there
        // are decoration-specific tokens bundles.
        if (this.colorTokensBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
                RadianceThemingSlices.DecorationAreaType.NONE :
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
                ContainerColorTokens registered = this.colorTokensBundleMap
                    .get(decorationAreaType).getActiveContainerTokens(componentState);
                if (registered == null) {
                    throw new IllegalStateException("Color tokens shouldn't be null here. Please "
                        + "report this issue");
                }

                return registered;
            }
        }

        ContainerColorTokens registered = this.colorTokensBundleMap
            .get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getActiveContainerTokens(componentState);
        if (registered == null) {
            throw new IllegalStateException("Color tokens shouldn't be null here. Please report " + "this issue");
        }

        return registered;
    }

    /**
     * Returns system container tokens for the specified component.
     *
     * @param comp Component.
     * @param systemContainerType System container type.
     * @return System container tokens for the component.
     *
     * @see #getInverseSystemContainerTokens(Component, RadianceThemingSlices.SystemContainerType)
     */
    public final ContainerColorTokens getSystemContainerTokens(Component comp,
        RadianceThemingSlices.SystemContainerType systemContainerType) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific tokens bundles.
        if (this.colorTokensBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
                RadianceThemingSlices.DecorationAreaType.NONE :
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
                return this.colorTokensBundleMap.get(decorationAreaType)
                    .getSystemContainerTokens(systemContainerType);
            }
        }

        return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getSystemContainerTokens(systemContainerType);
    }

    /**
     * Returns inverse system container tokens for the specified component.
     *
     * @param comp Component.
     * @param systemContainerType System container type.
     * @return Inverse system container tokens for the component.
     *
     * @see #getSystemContainerTokens(Component, RadianceThemingSlices.SystemContainerType)
     */
    public final ContainerColorTokens getInverseSystemContainerTokens(Component comp,
        RadianceThemingSlices.SystemContainerType systemContainerType) {
        // small optimization - lookup the decoration area only if there
        // are decoration-specific tokens bundles.
        if (this.colorTokensBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ?
                RadianceThemingSlices.DecorationAreaType.NONE :
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
                return this.colorTokensBundleMap.get(decorationAreaType)
                    .getInverseSystemContainerTokens(systemContainerType);
            }
        }

        return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getInverseSystemContainerTokens(systemContainerType);
    }

    /**
     * Registers the specified color tokens bundle to be used on controls in
     * decoration areas.
     *
     * @param bundle    The color tokens bundle to use on controls in decoration
     *                  areas.
     * @param areaTypes Enumerates the area types that are affected by the parameters.
     */
    public void registerDecorationAreaTokensBundle(
        ContainerColorTokensBundle bundle, RadianceThemingSlices.DecorationAreaType... areaTypes) {
        if (bundle == null) {
            throw new IllegalArgumentException("Cannot pass null bundle");
        }

        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
            if (this.neutralColorTokensOverrideMap.containsKey(areaType)) {
                throw new IllegalArgumentException("Decorated area type " + areaType +
                    " already configured");
            }

            this.decoratedAreaSet.add(areaType);
            this.colorTokensBundleMap.put(areaType, bundle);
        }
    }

    /**
     * Registers the specified neutral color tokens to be used on controls in
     * decoration areas.
     *
     * @param neutralContainerTokens The neutral tokens to use in specified decoration areas.
     * @param areaTypes             Enumerates the area types that are affected by the parameters.
     *                              Each decoration area type will be painted by
     *                              {@link RadianceDecorationPainter#paintDecorationArea(Graphics2D, Component, RadianceThemingSlices.DecorationAreaType, int, int, RadianceSkin)}
     */
    public void registerAsDecorationArea(ContainerColorTokens neutralContainerTokens,
            RadianceThemingSlices.DecorationAreaType... areaTypes) {
        if (neutralContainerTokens == null) {
            throw new IllegalArgumentException(
                "Cannot pass null neutral color tokens");
        }
        for (RadianceThemingSlices.DecorationAreaType areaType : areaTypes) {
            if (areaType == RadianceThemingSlices.DecorationAreaType.NONE) {
                throw new IllegalArgumentException(
                    "Decoration area type NONE not supported by this API");
            }
            if (this.colorTokensBundleMap.containsKey(areaType)) {
                throw new IllegalArgumentException("Decoration area type " + areaType +
                    " already configured");
            }
            this.decoratedAreaSet.add(areaType);
            this.neutralColorTokensOverrideMap.put(areaType, neutralContainerTokens);
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

    /**
     * Returns neutral container tokens for the specified decoration area type.
     *
     * @param decorationAreaType Decoration area type.
     * @return Neutral container tokens for the decoration area type.
     *
     * @see #getNeutralContainerTokens(Component)
     * @see #getNeutralContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #getMutedContainerTokens(RadianceThemingSlices.DecorationAreaType)
     * @see #getActiveContainerTokens(RadianceThemingSlices.DecorationAreaType)
     */
    public final ContainerColorTokens getNeutralContainerTokens(
        RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        // 1 - If it's the default area type, take its neutral container tokens
        if (decorationAreaType == RadianceThemingSlices.DecorationAreaType.NONE) {
            return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
                .getNeutralContainerTokens();
        }
        // 2 - check the registered neutral tokens override for this specific area type.
        if (this.neutralColorTokensOverrideMap.containsKey(decorationAreaType)) {
            return this.neutralColorTokensOverrideMap.get(decorationAreaType);
        }
        // 3 - check the registered tokens bundle for this specific area type.
        if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
            return this.colorTokensBundleMap.get(decorationAreaType).getNeutralContainerTokens();
        }
        // 4 - return the neutral tokens for the default area type
        return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getNeutralContainerTokens();
    }

    /**
     * Returns muted container tokens for the specified decoration area type.
     *
     * @param decorationAreaType Decoration area type.
     * @return Muted container tokens for the decoration area type.
     *
     * @see #getMutedContainerTokens(Component) 
     * @see #getMutedContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind) 
     * @see #getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType)
     * @see #getActiveContainerTokens(RadianceThemingSlices.DecorationAreaType)
     */
    public final ContainerColorTokens getMutedContainerTokens(
        RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
            return this.colorTokensBundleMap.get(decorationAreaType).getMutedContainerTokens();
        }
        return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getMutedContainerTokens();
    }

    /**
     * Returns active container tokens for the specified decoration area type.
     *
     * @param decorationAreaType Decoration area type.
     * @return Active container tokens for the decoration area type.
     *
     * @see #getActiveContainerTokens(Component)
     * @see #getActiveContainerTokens(Component, ComponentState) 
     * @see #getActiveContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState) 
     * @see #getMutedContainerTokens(RadianceThemingSlices.DecorationAreaType)
     * @see #getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType)
     */
    public final ContainerColorTokens getActiveContainerTokens(
        RadianceThemingSlices.DecorationAreaType decorationAreaType) {
        if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
            return this.colorTokensBundleMap.get(decorationAreaType).getActiveContainerTokens();
        }
        return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getActiveContainerTokens();
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
     * Returns active container tokens for the specified visual area of a component in the specific 
     * state.
     *
     * @param comp Component.
     * @param associationKind Color tokens association kind.
     * @param componentState Component state.
     * @return Active container tokens for the component.
     *
     * @see #getActiveContainerTokens(Component)
     * @see #getActiveContainerTokens(Component, ComponentState) 
     * @see #getActiveContainerTokens(RadianceThemingSlices.DecorationAreaType)
     * @see #getNeutralContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #getMutedContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind) 
     */
    public final ContainerColorTokens getActiveContainerTokens(Component comp,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState) {

        if (componentState.isDisabled()) {
            return getActiveContainerTokens(comp, associationKind, componentState.getEnabledMatch());
        }

        // small optimization - lookup the decoration area only if there
        // are decoration-specific tokens bundles.
        if (this.colorTokensBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ? RadianceThemingSlices.DecorationAreaType.NONE
                : RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
                return this.colorTokensBundleMap.get(decorationAreaType).getActiveContainerTokens(
                    associationKind, componentState);
            }
        }
        return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getActiveContainerTokens(associationKind, componentState);
    }

    /**
     * Returns muted container tokens for the specified visual area of a component.
     *
     * @param comp Component.
     * @param associationKind Color tokens association kind.
     * @return Muted container tokens for the component.
     *
     * @see #getMutedContainerTokens(Component)
     * @see #getMutedContainerTokens(RadianceThemingSlices.DecorationAreaType)
     * @see #getNeutralContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #getActiveContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
     */
    public final ContainerColorTokens getMutedContainerTokens(Component comp,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind) {

        // small optimization - lookup the decoration area only if there
        // are decoration-specific tokens bundles.
        if (this.colorTokensBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ? RadianceThemingSlices.DecorationAreaType.NONE
                : RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
                return this.colorTokensBundleMap.get(decorationAreaType).getMutedContainerTokens(
                    associationKind);
            }
        }
        return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getMutedContainerTokens(associationKind);
    }

    /**
     * Returns neutral container tokens for the specified visual area of a component.
     *
     * @param comp Component.
     * @param associationKind Color tokens association kind.
     * @return Neutral container tokens for the component.
     *
     * @see #getNeutralContainerTokens(Component)
     * @see #getNeutralContainerTokens(RadianceThemingSlices.DecorationAreaType)
     * @see #getMutedContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind)
     * @see #getActiveContainerTokens(Component, RadianceThemingSlices.ContainerColorTokensAssociationKind, ComponentState)
     */
    public final ContainerColorTokens getNeutralContainerTokens(Component comp,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind) {

        // small optimization - lookup the decoration area only if there
        // are decoration-specific tokens bundles.
        if (this.colorTokensBundleMap.size() > 1) {
            RadianceThemingSlices.DecorationAreaType decorationAreaType = (comp == null) ? RadianceThemingSlices.DecorationAreaType.NONE
                : RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(comp);
            if (this.colorTokensBundleMap.containsKey(decorationAreaType)) {
                return this.colorTokensBundleMap.get(decorationAreaType).getNeutralContainerTokens(
                    associationKind);
            }
        }
        return this.colorTokensBundleMap.get(RadianceThemingSlices.DecorationAreaType.NONE)
            .getNeutralContainerTokens(associationKind);
    }

    /**
     * Checks whether this skin is valid. A skins is considered valid if it has a color tokens
     * bundle for {@link RadianceThemingSlices.DecorationAreaType#NONE}, as well as
     * non-<code>null</code> button shaper, surface painter, outline painter, highlight surface
     * painter and decoration painter. If call to
     * {@link RadianceThemingCortex.GlobalScope#setSkin(String)} or
     * {@link RadianceThemingCortex.GlobalScope#setSkin(RadianceSkin)} does not seem to have
     * any visible effect (returning <code>false</code>), call this method to
     * verify that your skin is valid.
     *
     * @return <code>true</code> if this skin is valid, <code>false</code>
     * otherwise.
     */
    public boolean isValid() {
        if (!this.colorTokensBundleMap.containsKey(RadianceThemingSlices.DecorationAreaType.NONE)) {
            return false;
        }
        if (this.getButtonShaper() == null) {
            return false;
        }
        if (this.getSurfacePainter() == null) {
            return false;
        }
        if (this.getOutlinePainter() == null) {
            return false;
        }
        if (this.getHighlightSurfacePainter() == null) {
            return false;
        }
        if (this.getDecorationPainter() == null) {
            return false;
        }
        return true;
    }
}
