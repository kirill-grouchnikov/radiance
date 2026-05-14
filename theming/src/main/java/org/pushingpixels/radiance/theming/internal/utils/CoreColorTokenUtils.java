/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.ephemeral.chroma.blend.Blend;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Utilities related to color tokens. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class CoreColorTokenUtils {
    /**
     * Enumeration of available container types. Each entry corresponds to the matching container
     * color tokens passed to {@link ContainerColorTokensBundle}.
     */
    public enum ContainerType {
        NEUTRAL,
        MUTED,
        ACTIVE
    }

    /**
     * Returns the color tokens of the specified tabbed pane tab.
     *
     * @param jtp            Tabbed pane.
     * @param tabIndex       Tab index.
     * @param componentState Tab component state.
     * @return The color tokens of the specified tabbed pane tab.
     */
    public static ContainerColorTokens getContainerTokens(final JTabbedPane jtp, final int tabIndex,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(jtp);
        if (skin == null) {
            RadianceCoreUtilities.traceRadianceApiUsage(jtp,
                "Radiance delegate used when Radiance is not the current LAF");
        }

        if (componentState.isDisabled()) {
            componentState = componentState.getEnabledMatch();
        }
        ContainerColorTokens nonColorized = componentState.isActive()
            ? skin.getActiveContainerTokens(jtp, associationKind, componentState)
            : skin.getMutedContainerTokens(jtp, associationKind);
        if (tabIndex >= 0) {
            Component component = jtp.getComponentAt(tabIndex);
            return getBlendedTokens(component, nonColorized,
                jtp.getForegroundAt(tabIndex), jtp.getBackgroundAt(tabIndex),
                !componentState.isDisabled());
        } else {
            return getBlendedTokens(jtp, nonColorized, !componentState.isDisabled());
        }
    }

    public static ContainerColorTokens getContainerTokens(Component component,
        ComponentState componentState, ContainerType inactiveContainerType) {

        Component orig = component;
        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        ContainerColorTokensOverlay.Provider tokensOverlayProvider =
            RadianceCoreUtilities.getContainerColorTokensOverlayProvider(component);
        ContainerColorTokensOverlay tokensOverlay = (tokensOverlayProvider != null)
            ? tokensOverlayProvider.getOverlay(skin, DecorationPainterUtils.getDecorationType(component))
            : null;

        // special case - if the component is marked as flat and
        // it is in the default state, or it is a component
        // that is never painting its background - get the color tokens of the
        // parent
        boolean isButtonThatIsNeverPainted = ((component instanceof AbstractButton)
            && RadianceCoreUtilities.isComponentNeverPainted(component));
        if (isButtonThatIsNeverPainted
            || (!componentState.isActive()
                && (RadianceCoreUtilities.hasFlatAppearance(component, false)))) {
            ContainerColorTokens nonColorized = (tokensOverlay != null)
                ? tokensOverlay.getNeutralContainerTokens()
                : skin.getNeutralContainerTokens(component);
            return getBlendedTokens(orig, nonColorized, !componentState.isDisabled());
        }

        if (skin == null) {
            RadianceCoreUtilities.traceRadianceApiUsage(component,
                "Radiance delegate used when Radiance is not the current LAF");
        }

        if (componentState.isDisabled()) {
            componentState = componentState.getEnabledMatch();
        }
        ContainerColorTokens nonColorized;
        if (componentState.isActive()) {
            nonColorized = (tokensOverlay != null)
                ? tokensOverlay.getActiveContainerTokens(componentState)
                : skin.getActiveContainerTokens(component, componentState);
        } else {
            if (inactiveContainerType == ContainerType.MUTED) {
                nonColorized = (tokensOverlay != null)
                    ? tokensOverlay.getMutedContainerTokens()
                    : skin.getMutedContainerTokens(component);
            } else {
                nonColorized = (tokensOverlay != null)
                    ? tokensOverlay.getNeutralContainerTokens()
                    : skin.getNeutralContainerTokens(component);
            }
        }

        return getBlendedTokens(orig, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the color tokens of the component.
     *
     * @param component       Component.
     * @param associationKind Association kind.
     * @param componentState  Component state.
     * @return Component color tokens.
     */
    public static ContainerColorTokens getContainerTokens(Component component,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState, ContainerType inactiveContainerType) {
        return getContainerTokens(component, associationKind, componentState, inactiveContainerType,
            false);
    }

    /**
     * Returns the color tokens of the component.
     *
     * @param component       Component.
     * @param associationKind Association kind.
     * @param componentState  Component state.
     * @return Component color tokens.
     */
    public static ContainerColorTokens getContainerTokens(Component component,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        ComponentState componentState, ContainerType inactiveContainerType,
        boolean skipFlatCheck) {

        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        ContainerColorTokensOverlay.Provider tokensOverlayProvider =
            RadianceCoreUtilities.getContainerColorTokensOverlayProvider(component);
        ContainerColorTokensOverlay tokensOverlay = (tokensOverlayProvider != null)
            ? tokensOverlayProvider.getOverlay(skin, DecorationPainterUtils.getDecorationType(component))
            : null;

        // special case - if the component is marked as flat, get the color tokens of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!skipFlatCheck && !(component instanceof JToolBar)
            && !componentState.isActive()
            && RadianceCoreUtilities.hasFlatAppearance(component, false)) {
            ContainerColorTokens nonColorized = (tokensOverlay != null)
                ? tokensOverlay.getNeutralContainerTokens()
                : skin.getNeutralContainerTokens(component);
            return getBlendedTokens(component, nonColorized, !componentState.isDisabled());
        }

        if (skin == null) {
            RadianceCoreUtilities.traceRadianceApiUsage(component,
                "Radiance delegate used when Radiance is not the current LAF");
        }
        if (componentState.isDisabled()) {
            componentState = componentState.getEnabledMatch();
        }
        ContainerColorTokens nonColorized;
        if (componentState.isActive()) {
            nonColorized = (tokensOverlay != null)
                ? tokensOverlay.getActiveContainerTokens(componentState)
                : skin.getActiveContainerTokens(component, associationKind, componentState);
        } else {
            if (inactiveContainerType == ContainerType.NEUTRAL) {
                nonColorized = (tokensOverlay != null)
                    ? tokensOverlay.getNeutralContainerTokens()
                    : skin.getNeutralContainerTokens(component, associationKind);
            } else {
                nonColorized = (tokensOverlay != null)
                    ? tokensOverlay.getMutedContainerTokens()
                    : skin.getMutedContainerTokens(component, associationKind);
            }
        }
        return getBlendedTokens(component, nonColorized, !componentState.isDisabled());
    }

    /**
     * Returns the active color tokens of the component.
     *
     * @param component      Component.
     * @return Component color tokens.
     */
    public static ContainerColorTokens getActiveContainerTokens(Component component) {
        ContainerColorTokens nonColorized = RadianceCoreUtilities.getSkin(component)
            .getActiveContainerTokens(component);
        return getBlendedTokens(component, nonColorized, true);
    }

    public static ContainerColorTokens getActiveContainerTokens(Component component,
        ComponentState componentState) {
        // special case - if the component is marked as flat and
        // it is in the enabled state, get the color tokens of the parent.
        // However, flat toolbars should be ignored, since they are
        // the "top" level decoration area.
        if (!(component instanceof JToolBar)
            && RadianceCoreUtilities.hasFlatAppearance(component, false)
            && (componentState == ComponentState.ENABLED)) {
            component = component.getParent();
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        ContainerColorTokensOverlay.Provider tokensOverlayProvider =
            RadianceCoreUtilities.getContainerColorTokensOverlayProvider(component);
        ContainerColorTokensOverlay tokensOverlay = (tokensOverlayProvider != null)
            ? tokensOverlayProvider.getOverlay(skin, DecorationPainterUtils.getDecorationType(component))
            : null;

        ContainerColorTokens nonColorized = (tokensOverlay != null)
            ? tokensOverlay.getActiveContainerTokens(componentState)
            : skin.getActiveContainerTokens(component, componentState);
        return getBlendedTokens(component, nonColorized, !componentState.isDisabled());
    }

    public static ContainerColorTokens getRolloverUnselectedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 20% of surface bright on top of base
        return overlay(
            baseTokens,
            baseTokens.getContainerSurfaceBright(),
            0.2f);
    }

    public static ContainerColorTokens getRolloverSelectedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 30% of surface bright on top of base
        return overlay(
            baseTokens,
            baseTokens.getContainerSurfaceBright(),
            0.3f);
    }

    public static ContainerColorTokens getRolloverArmedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 30% of surface bright on top of base
        return overlay(
            baseTokens,
            baseTokens.getContainerSurfaceBright(),
            0.3f);
    }

    public static ContainerColorTokens getPressedUnselectedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 50% of surface dim on top
        return overlay(
            baseTokens,
            baseTokens.getContainerSurfaceDim(),
            0.5f);
    }

    public static ContainerColorTokens getPressedSelectedTokens(ContainerColorTokens baseTokens) {
        // Mixing in 50% of surface dim on top
        return overlay(
            baseTokens,
            baseTokens.getContainerSurfaceDim(),
            0.4f);
    }

    private static ContainerColorTokens overlay(ContainerColorTokens original,
        Color overlay, float overlayAmount) {

        Color overlayWithAlpha = RadianceColorUtilities.getAlphaColor(
            overlay, (int) (255 * overlayAmount));

        // Apply overlay on the container tokens
        Color containerSurfaceLowest = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceLowest(), overlayWithAlpha);
        Color containerSurfaceLow = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceLow(), overlayWithAlpha);
        Color containerSurface = RadianceColorUtilities.overlayColor(
            original.getContainerSurface(), overlayWithAlpha);
        Color containerSurfaceHigh = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceHigh(), overlayWithAlpha);
        Color containerSurfaceHighest = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceHighest(), overlayWithAlpha);
        Color inverseContainerSurface = RadianceColorUtilities.overlayColor(
            original.getInverseContainerSurface(), overlayWithAlpha);
        Color containerSurfaceDim = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceDim(), overlayWithAlpha);
        Color containerSurfaceBright = RadianceColorUtilities.overlayColor(
            original.getContainerSurfaceBright(), overlayWithAlpha);

        // Leave shadow, on container and container outline tokens as they are
        Color containerShadow = original.getContainerShadow();

        Color onContainer = original.getOnContainer();
        Color onContainerVariant = original.getOnContainerVariant();
        Color containerOutline = original.getContainerOutline();
        Color containerOutlineVariant = original.getContainerOutlineVariant();

        Color inverseOnContainer = original.getInverseOnContainer();
        Color inverseContainerOutline = original.getInverseContainerOutline();
        Color complementaryOnContainer = original.getComplementaryOnContainer();
        Color complementaryContainerOutline = original.getComplementaryContainerOutline();
        Color accentOnContainer = original.getAccentOnContainer();
        Color markerOnContainer = original.getMarkerOnContainer();
        Color complementaryMarkerOnContainer = original.getComplementaryMarkerOnContainer();

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return containerSurfaceLowest;
            }

            @Override
            public Color getContainerSurfaceLow() {
                return containerSurfaceLow;
            }

            @Override
            public Color getContainerSurface() {
                return containerSurface;
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return containerSurfaceHigh;
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return containerSurfaceHighest;
            }

            @Override
            public Color getContainerSurfaceDim() {
                return containerSurfaceDim;
            }

            @Override
            public Color getContainerSurfaceBright() {
                return containerSurfaceBright;
            }

            @Override
            public Color getContainerShadow() {
                return containerShadow;
            }

            @Override
            public Color getOnContainer() {
                return onContainer;
            }

            @Override
            public Color getOnContainerVariant() {
                return onContainerVariant;
            }

            @Override
            public Color getContainerOutline() {
                return containerOutline;
            }

            @Override
            public Color getContainerOutlineVariant() {
                return containerOutlineVariant;
            }

            @Override
            public float getContainerSurfaceEnabledAlpha() {
                return original.getContainerSurfaceEnabledAlpha();
            }

            @Override
            public float getOnContainerEnabledAlpha() {
                return original.getOnContainerEnabledAlpha();
            }

            @Override
            public float getContainerOutlineEnabledAlpha() {
                return original.getContainerOutlineEnabledAlpha();
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return original.getContainerSurfaceDisabledAlpha();
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return original.getOnContainerDisabledAlpha();
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return original.getContainerOutlineDisabledAlpha();
            }

            @Override
            public Color getInverseContainerSurface() {
                return inverseContainerSurface;
            }

            @Override
            public Color getInverseOnContainer() {
                return inverseOnContainer;
            }

            @Override
            public Color getInverseContainerOutline() {
                return inverseContainerOutline;
            }

            @Override
            public Color getComplementaryOnContainer() {
                return complementaryOnContainer;
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return complementaryContainerOutline;
            }

            @Override
            public Color getAccentOnContainer() {
                return accentOnContainer;
            }

            @Override
            public Color getMarkerOnContainer() {
                return markerOnContainer;
            }

            @Override
            public Color getComplementaryMarkerOnContainer() {
                return complementaryMarkerOnContainer;
            }
        };
    }


    /**
     * Cache of blended tokens.
     */
    private final static LazyResettableHashMap<ContainerColorTokens> blendedCache =
        new LazyResettableHashMap<>("ContainerColorTokensUtils.blendedTokens");

    private static ContainerColorTokens getBlendedTokens(Component component,
        ContainerColorTokens tokens, boolean isEnabled) {
        Component forQuerying = component;
        if ((component != null) && (component.getParent() != null)
            && ((component.getClass().isAnnotationPresent(RadianceInternalArrowButton.class)
            || (component instanceof RadianceTitleButton)))) {
            forQuerying = component.getParent();
        }
        return getBlendedTokens(component, tokens,
            (forQuerying == null) ? null : forQuerying.getForeground(),
            (forQuerying == null) ? null : forQuerying.getBackground(), isEnabled);
    }

    private static ContainerColorTokens getBlendedTokens(Component component,
        ContainerColorTokens tokens, Color fgColor, Color bgColor, boolean isEnabled) {
        if ((tokens != null) && (component != null)) {
            // Support for enhancement 256 - colorizing
            // controls.
            if (bgColor instanceof UIResource) {
                bgColor = null;
            }
            if (fgColor instanceof UIResource) {
                fgColor = null;
            }
            if ((bgColor != null) || (fgColor != null)) {
                double colorization = isEnabled ? 1.0f : 0.5f;
                return getBlendedTokens(tokens, bgColor, colorization, fgColor, colorization);
            }
        }
        return tokens;
    }

    public static ContainerColorTokens getBlendedTokens(ContainerColorTokens original,
        Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
        double foregroundShiftFactor) {
        HashMapKey key = RadianceCoreUtilities.getHashKey(original,
            backgroundShiftColor == null ? "" : backgroundShiftColor.getRGB(),
            backgroundShiftFactor,
            foregroundShiftColor == null ? "" : foregroundShiftColor.getRGB(),
            foregroundShiftFactor);
        ContainerColorTokens result = blendedCache.get(key);
        if (result == null) {
            result = blendTowards(original, backgroundShiftColor, backgroundShiftFactor,
                foregroundShiftColor, foregroundShiftFactor);
            blendedCache.put(key, result);
        }
        return result;
    }

    private static ContainerColorTokens blendTowards(ContainerColorTokens original,
        Color backgroundShiftColor, double backgroundShiftFactor, Color foregroundShiftColor,
        double foregroundShiftFactor) {

        Color containerSurfaceLowest = (backgroundShiftColor == null)
            ? original.getContainerSurfaceLowest()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceLowest().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceLow = (backgroundShiftColor == null)
            ? original.getContainerSurfaceLow()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceLow().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurface = (backgroundShiftColor == null)
            ? original.getContainerSurface()
            : new Color(Blend.harmonizeAll(original.getContainerSurface().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceHigh = (backgroundShiftColor == null)
            ? original.getContainerSurfaceHigh()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceHigh().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceHighest = (backgroundShiftColor == null)
            ? original.getContainerSurfaceHighest()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceHighest().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceDim = (backgroundShiftColor == null)
            ? original.getContainerSurfaceDim()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceDim().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerSurfaceBright = (backgroundShiftColor == null)
            ? original.getContainerSurfaceBright()
            : new Color(Blend.harmonizeAll(original.getContainerSurfaceBright().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerShadow = original.getContainerShadow();
        Color onContainer = (foregroundShiftColor == null)
            ? original.getOnContainer()
            : new Color(Blend.harmonizeAll(original.getOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color onContainerVariant = (foregroundShiftColor == null)
            ? original.getOnContainerVariant()
            : new Color(Blend.harmonizeAll(original.getOnContainerVariant().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color containerOutline = (backgroundShiftColor == null)
            ? original.getContainerOutline()
            : new Color(Blend.harmonizeAll(original.getContainerOutline().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color containerOutlineVariant = (backgroundShiftColor == null)
            ? original.getContainerOutlineVariant()
            : new Color(Blend.harmonizeAll(original.getContainerOutlineVariant().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color inverseContainerSurface = (backgroundShiftColor == null)
            ? original.getInverseContainerSurface()
            : new Color(Blend.harmonizeAll(original.getInverseContainerSurface().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color inverseOnContainer = (foregroundShiftColor == null)
            ? original.getInverseOnContainer()
            : new Color(Blend.harmonizeAll(original.getInverseOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color inverseContainerOutline = (backgroundShiftColor == null)
            ? original.getInverseContainerOutline()
            : new Color(Blend.harmonizeAll(original.getInverseContainerOutline().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color complementaryOnContainer = (foregroundShiftColor == null)
            ? original.getComplementaryOnContainer()
            : new Color(Blend.harmonizeAll(original.getComplementaryOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color complementaryContainerOutline = (backgroundShiftColor == null)
            ? original.getComplementaryContainerOutline()
            : new Color(Blend.harmonizeAll(original.getComplementaryContainerOutline().getRGB(),
            backgroundShiftColor.getRGB(), backgroundShiftFactor));
        Color accentOnContainer = (foregroundShiftColor == null)
            ? original.getAccentOnContainer()
            : new Color(Blend.harmonizeAll(original.getAccentOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color markerOnContainer = (foregroundShiftColor == null)
            ? original.getMarkerOnContainer()
            : new Color(Blend.harmonizeAll(original.getMarkerOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));
        Color complementaryMarkerOnContainer = (foregroundShiftColor == null)
            ? original.getComplementaryMarkerOnContainer()
            : new Color(Blend.harmonizeAll(original.getComplementaryMarkerOnContainer().getRGB(),
            foregroundShiftColor.getRGB(), foregroundShiftFactor));

        return new ContainerColorTokens() {
            @Override
            public boolean isDark() {
                return original.isDark();
            }

            @Override
            public Color getContainerSurfaceLowest() {
                return containerSurfaceLowest;
            }

            @Override
            public Color getContainerSurfaceLow() {
                return containerSurfaceLow;
            }

            @Override
            public Color getContainerSurface() {
                return containerSurface;
            }

            @Override
            public Color getContainerSurfaceHigh() {
                return containerSurfaceHigh;
            }

            @Override
            public Color getContainerSurfaceHighest() {
                return containerSurfaceHighest;
            }

            @Override
            public Color getContainerSurfaceDim() {
                return containerSurfaceDim;
            }

            @Override
            public Color getContainerSurfaceBright() {
                return containerSurfaceBright;
            }

            @Override
            public Color getContainerShadow() {
                return containerShadow;
            }

            @Override
            public Color getOnContainer() {
                return onContainer;
            }

            @Override
            public Color getOnContainerVariant() {
                return onContainerVariant;
            }

            @Override
            public Color getContainerOutline() {
                return containerOutline;
            }

            @Override
            public Color getContainerOutlineVariant() {
                return containerOutlineVariant;
            }

            @Override
            public float getContainerSurfaceEnabledAlpha() {
                return original.getContainerSurfaceEnabledAlpha();
            }

            @Override
            public float getOnContainerEnabledAlpha() {
                return original.getOnContainerEnabledAlpha();
            }

            @Override
            public float getContainerOutlineEnabledAlpha() {
                return original.getContainerOutlineEnabledAlpha();
            }

            @Override
            public float getContainerSurfaceDisabledAlpha() {
                return original.getContainerSurfaceDisabledAlpha();
            }

            @Override
            public float getOnContainerDisabledAlpha() {
                return original.getOnContainerDisabledAlpha();
            }

            @Override
            public float getContainerOutlineDisabledAlpha() {
                return original.getContainerOutlineDisabledAlpha();
            }

            @Override
            public Color getInverseContainerSurface() {
                return inverseContainerSurface;
            }

            @Override
            public Color getInverseOnContainer() {
                return inverseOnContainer;
            }

            @Override
            public Color getInverseContainerOutline() {
                return inverseContainerOutline;
            }

            @Override
            public Color getComplementaryOnContainer() {
                return complementaryOnContainer;
            }

            @Override
            public Color getComplementaryContainerOutline() {
                return complementaryContainerOutline;
            }

            @Override
            public Color getAccentOnContainer() {
                return accentOnContainer;
            }

            @Override
            public Color getMarkerOnContainer() {
                return markerOnContainer;
            }

            @Override
            public Color getComplementaryMarkerOnContainer() {
                return complementaryMarkerOnContainer;
            }
        };
    }
}
