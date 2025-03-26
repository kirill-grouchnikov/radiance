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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.common.api.UiThreadingViolationException;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class BladeUtils {
    public static void populateModificationAwareColorTokens(
        BladeContainerColorTokens bladeContainerTokens, Component component,
        float modificationCyclePosition) {

        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                "Color tokens population must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        ContainerColorTokens warningColorTokens = skin.getSystemContainerTokens(
            component, RadianceThemingSlices.SystemContainerType.WARNING);
        ContainerColorTokens errorColorTokens = skin.getSystemContainerTokens(
            component, RadianceThemingSlices.SystemContainerType.ERROR);

        bladeContainerTokens.containerSurfaceLowest = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceLowest(),
            errorColorTokens.getContainerSurfaceLowest(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurfaceLow = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceLow(),
            errorColorTokens.getContainerSurfaceLow(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurface = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurface(),
            errorColorTokens.getContainerSurface(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurfaceHigh = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceHigh(),
            errorColorTokens.getContainerSurfaceHigh(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurfaceHighest = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceHighest(),
            errorColorTokens.getContainerSurfaceHighest(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurfaceDim = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceDim(),
            errorColorTokens.getContainerSurfaceDim(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurfaceBright = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceBright(),
            errorColorTokens.getContainerSurfaceBright(),
            modificationCyclePosition);

        bladeContainerTokens.onContainer = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getOnContainer(),
            errorColorTokens.getOnContainer(),
            modificationCyclePosition);
        bladeContainerTokens.onContainerVariant = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getOnContainerVariant(),
            errorColorTokens.getOnContainerVariant(),
            modificationCyclePosition);

        bladeContainerTokens.containerOutline = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerOutline(),
            errorColorTokens.getContainerOutlineVariant(),
            modificationCyclePosition);

        bladeContainerTokens.containerDisabledAlpha =
            (1.0f - modificationCyclePosition) * warningColorTokens.getContainerSurfaceDisabledAlpha() +
                modificationCyclePosition * errorColorTokens.getContainerSurfaceDisabledAlpha();
        bladeContainerTokens.onContainerDisabledAlpha =
            (1.0f - modificationCyclePosition) * warningColorTokens.getOnContainerDisabledAlpha() +
                modificationCyclePosition * errorColorTokens.getOnContainerDisabledAlpha();
        bladeContainerTokens.containerOutlineDisabledAlpha =
            (1.0f - modificationCyclePosition) * warningColorTokens.getContainerOutlineDisabledAlpha() +
                modificationCyclePosition * errorColorTokens.getContainerOutlineDisabledAlpha();

        bladeContainerTokens.inverseContainerSurface = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getInverseContainerSurface(),
            errorColorTokens.getInverseContainerSurface(),
            modificationCyclePosition);
        bladeContainerTokens.inverseOnContainer = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getInverseOnContainer(),
            errorColorTokens.getInverseOnContainer(),
            modificationCyclePosition);
        bladeContainerTokens.inverseContainerOutline = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getInverseContainerOutline(),
            errorColorTokens.getInverseContainerOutline(),
            modificationCyclePosition);
        bladeContainerTokens.complementaryOnContainer = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getComplementaryOnContainer(),
            errorColorTokens.getComplementaryOnContainer(),
            modificationCyclePosition);
        bladeContainerTokens.complementaryContainerOutline = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getComplementaryContainerOutline(),
            errorColorTokens.getComplementaryContainerOutline(),
            modificationCyclePosition);
        bladeContainerTokens.accentOnContainer = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getAccentOnContainer(),
            errorColorTokens.getAccentOnContainer(),
            modificationCyclePosition);

        bladeContainerTokens.combinedName = "[" + warningColorTokens.hashCode() + ":" + modificationCyclePosition
            + "], [" + errorColorTokens.hashCode() + ":" + (1.0f - modificationCyclePosition) + "]";
        bladeContainerTokens.isDark = warningColorTokens.isDark() && errorColorTokens.isDark();
    }

    public static void populateColorTokens(
        BladeContainerColorTokens bladeContainerTokens, Component component,
        StateTransitionTracker.ModelStateInfo modelStateInfo, ComponentState currState,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        boolean treatEnabledAsActive, boolean skipFlatCheck,
        RadianceThemingSlices.ContainerType inactiveContainerType) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Color scheme population must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }

        StringBuilder nameBuilder = new StringBuilder();
        ContainerColorTokens currColorTokens = (treatEnabledAsActive && (currState == ComponentState.ENABLED))
            ? CoreColorTokenUtils.getActiveContainerTokens(component, currState)
            : CoreColorTokenUtils.getContainerTokens(component, associationKind, currState,
                inactiveContainerType, skipFlatCheck);
        Color containerSurfaceLowest = currColorTokens.getContainerSurfaceLowest();
        Color containerSurfaceLow = currColorTokens.getContainerSurfaceLow();
        Color containerSurface = currColorTokens.getContainerSurface();
        Color containerSurfaceHigh = currColorTokens.getContainerSurfaceHigh();
        Color containerSurfaceHighest = currColorTokens.getContainerSurfaceHighest();
        Color containerSurfaceDim = currColorTokens.getContainerSurfaceDim();
        Color containerSurfaceBright = currColorTokens.getContainerSurfaceBright();
        Color onContainer = currColorTokens.getOnContainer();
        Color onContainerVariant = currColorTokens.getOnContainerVariant();
        Color containerOutline = currColorTokens.getContainerOutline();
        Color containerOutlineVariant = currColorTokens.getContainerOutlineVariant();
        float containerDisabledAlpha = currColorTokens.getContainerSurfaceDisabledAlpha();
        float onContainerDisabledAlpha = currColorTokens.getOnContainerDisabledAlpha();
        float containerOutlineDisabledAlpha = currColorTokens.getContainerOutlineDisabledAlpha();
        Color inverseContainerSurface = currColorTokens.getInverseContainerSurface();
        Color inverseOnContainer = currColorTokens.getInverseOnContainer();
        Color inverseContainerOutline = currColorTokens.getInverseContainerOutline();
        Color complementaryOnContainer = currColorTokens.getComplementaryOnContainer();
        Color complementaryContainerOutline = currColorTokens.getComplementaryContainerOutline();
        Color accentOnContainer = currColorTokens.getAccentOnContainer();

        nameBuilder.append(currColorTokens.hashCode());

        boolean isDark = currColorTokens.isDark();

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                (modelStateInfo == null) ? null : modelStateInfo.getStateContributionMap();

        if (!currState.isDisabled() && (activeStates != null) && (activeStates.size() > 1)) {
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState) {
                    // Already accounted for the currently active state
                    continue;
                }
                float amount = activeEntry.getValue().getContribution();
                if (amount == 0.0f) {
                    // Skip a zero-amount contribution
                    continue;
                }
                // Get the color tokens that matches the contribution state
                ContainerColorTokens contributionColorTokens = (treatEnabledAsActive && (activeState == ComponentState.ENABLED))
                        ? CoreColorTokenUtils.getActiveContainerTokens(component, activeState)
                        : CoreColorTokenUtils.getContainerTokens(component, associationKind, activeState, inactiveContainerType);

                // And interpolate the colors
                containerSurfaceLowest = RadianceColorUtilities.getInterpolatedColor(containerSurfaceLowest,
                        contributionColorTokens.getContainerSurfaceLowest(), 1.0f - amount);
                containerSurfaceLow = RadianceColorUtilities.getInterpolatedColor(containerSurfaceLow,
                        contributionColorTokens.getContainerSurfaceLow(), 1.0f - amount);
                containerSurface = RadianceColorUtilities.getInterpolatedColor(containerSurface,
                        contributionColorTokens.getContainerSurface(), 1.0f - amount);
                containerSurfaceHigh = RadianceColorUtilities.getInterpolatedColor(containerSurfaceHigh,
                        contributionColorTokens.getContainerSurfaceHigh(), 1.0f - amount);
                containerSurfaceHighest = RadianceColorUtilities.getInterpolatedColor(containerSurfaceHighest,
                        contributionColorTokens.getContainerSurfaceHighest(), 1.0f - amount);
                containerSurfaceDim = RadianceColorUtilities.getInterpolatedColor(containerSurfaceDim,
                    contributionColorTokens.getContainerSurfaceDim(), 1.0f - amount);
                containerSurfaceBright = RadianceColorUtilities.getInterpolatedColor(containerSurfaceBright,
                    contributionColorTokens.getContainerSurfaceBright(), 1.0f - amount);
                onContainer = RadianceColorUtilities.getInterpolatedColor(onContainer,
                        contributionColorTokens.getOnContainer(), 1.0f - amount);
                onContainerVariant = RadianceColorUtilities.getInterpolatedColor(onContainerVariant,
                        contributionColorTokens.getOnContainerVariant(), 1.0f - amount);
                containerOutline = RadianceColorUtilities.getInterpolatedColor(containerOutline,
                        contributionColorTokens.getContainerOutline(), 1.0f - amount);
                containerOutlineVariant = RadianceColorUtilities.getInterpolatedColor(containerOutlineVariant,
                        contributionColorTokens.getContainerOutlineVariant(), 1.0f - amount);
                containerDisabledAlpha = (1.0f - amount) * containerDisabledAlpha +
                    amount * contributionColorTokens.getContainerSurfaceDisabledAlpha();
                onContainerDisabledAlpha = (1.0f - amount) * onContainerDisabledAlpha +
                    amount * contributionColorTokens.getOnContainerDisabledAlpha();
                containerOutlineDisabledAlpha = (1.0f - amount) * containerOutlineDisabledAlpha +
                    amount * contributionColorTokens.getContainerOutlineDisabledAlpha();
                inverseContainerSurface = RadianceColorUtilities.getInterpolatedColor(inverseContainerSurface,
                    contributionColorTokens.getInverseContainerSurface(), 1.0f - amount);
                inverseOnContainer = RadianceColorUtilities.getInterpolatedColor(inverseOnContainer,
                    contributionColorTokens.getInverseOnContainer(), 1.0f - amount);
                inverseContainerOutline = RadianceColorUtilities.getInterpolatedColor(inverseContainerOutline,
                    contributionColorTokens.getInverseContainerOutline(), 1.0f - amount);
                complementaryOnContainer = RadianceColorUtilities.getInterpolatedColor(complementaryOnContainer,
                    contributionColorTokens.getComplementaryOnContainer(), 1.0f - amount);
                complementaryContainerOutline = RadianceColorUtilities.getInterpolatedColor(complementaryContainerOutline,
                    contributionColorTokens.getComplementaryContainerOutline(), 1.0f - amount);
                accentOnContainer = RadianceColorUtilities.getInterpolatedColor(accentOnContainer,
                    contributionColorTokens.getAccentOnContainer(), 1.0f - amount);

                nameBuilder.append(", [").append(contributionColorTokens.hashCode()).append(":")
                        .append(amount).append("]");
                isDark = isDark && contributionColorTokens.isDark();
            }
        }

        // Update the mutable color tokens with the interpolated colors
        bladeContainerTokens.containerSurfaceLowest = containerSurfaceLowest;
        bladeContainerTokens.containerSurfaceLow = containerSurfaceLow;
        bladeContainerTokens.containerSurface = containerSurface;
        bladeContainerTokens.containerSurfaceHigh = containerSurfaceHigh;
        bladeContainerTokens.containerSurfaceHighest = containerSurfaceHighest;
        bladeContainerTokens.containerSurfaceDim = containerSurfaceDim;
        bladeContainerTokens.containerSurfaceBright = containerSurfaceBright;
        bladeContainerTokens.onContainer = onContainer;
        bladeContainerTokens.onContainerVariant = onContainerVariant;
        bladeContainerTokens.containerOutline = containerOutline;
        bladeContainerTokens.containerOutlineVariant = containerOutlineVariant;
        bladeContainerTokens.containerDisabledAlpha = containerDisabledAlpha;
        bladeContainerTokens.onContainerDisabledAlpha = onContainerDisabledAlpha;
        bladeContainerTokens.containerOutlineDisabledAlpha = containerOutlineDisabledAlpha;
        bladeContainerTokens.inverseContainerSurface = inverseContainerSurface;
        bladeContainerTokens.inverseOnContainer = inverseOnContainer;
        bladeContainerTokens.inverseContainerOutline = inverseContainerOutline;
        bladeContainerTokens.complementaryOnContainer = complementaryOnContainer;
        bladeContainerTokens.complementaryContainerOutline = complementaryContainerOutline;
        bladeContainerTokens.accentOnContainer = accentOnContainer;

        bladeContainerTokens.combinedName = nameBuilder.toString();
        bladeContainerTokens.isDark = isDark;
    }

    public interface ColorSchemeDelegate {
        ContainerColorTokens getContainerTokensForCurrentState(ComponentState state);

        ContainerColorTokens getContainerTokensForActiveState(ComponentState state);
    }

    // TODO: TONAL - revisit this
    public static ColorSchemeDelegate getDefaultColorSchemeDelegate(Component component,
            BladeTransitionAwareIcon.ColorSchemeAssociationKindDelegate colorSchemeAssociationKindDelegate) {
        return new ColorSchemeDelegate() {
            @Override
            public ContainerColorTokens getContainerTokensForCurrentState(ComponentState state) {
                return CoreColorTokenUtils.getContainerTokens(component,
                    colorSchemeAssociationKindDelegate.getContainterColorTokensAssociationKind(state), state,
                    RadianceThemingSlices.ContainerType.MUTED);
            }

            @Override
            public ContainerColorTokens getContainerTokensForActiveState(ComponentState state) {
                return CoreColorTokenUtils.getContainerTokens(component,
                    colorSchemeAssociationKindDelegate.getContainterColorTokensAssociationKind(state), state,
                    RadianceThemingSlices.ContainerType.MUTED);
            }
        };
    }

    public static void populateColorTokens(
            BladeContainerColorTokens bladeContainerTokens,
            StateTransitionTracker.ModelStateInfo modelStateInfo,
            ComponentState currState,
            ColorSchemeDelegate colorSchemeDelegate,
            boolean useNoSelectionStateContributionMap) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Color scheme population must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }

        StringBuilder nameBuilder = new StringBuilder();

        ContainerColorTokens currColorTokens =
                colorSchemeDelegate.getContainerTokensForCurrentState(currState);

        Color containerSurfaceLowest = currColorTokens.getContainerSurfaceLowest();
        Color containerSurfaceLow = currColorTokens.getContainerSurfaceLow();
        Color containerSurface = currColorTokens.getContainerSurface();
        Color containerSurfaceHigh = currColorTokens.getContainerSurfaceHigh();
        Color containerSurfaceHighest = currColorTokens.getContainerSurfaceHighest();
        Color containerSurfaceDim = currColorTokens.getContainerSurfaceDim();
        Color containerSurfaceBright = currColorTokens.getContainerSurfaceBright();
        Color onContainer = currColorTokens.getOnContainer();
        Color onContainerVariant = currColorTokens.getOnContainerVariant();
        Color containerOutline = currColorTokens.getContainerOutline();
        Color containerOutlineVariant = currColorTokens.getContainerOutlineVariant();
        float containerDisabledAlpha = currColorTokens.getContainerSurfaceDisabledAlpha();
        float onContainerDisabledAlpha = currColorTokens.getOnContainerDisabledAlpha();
        float containerOutlineDisabledAlpha = currColorTokens.getContainerOutlineDisabledAlpha();
        Color inverseContainerSurface = currColorTokens.getInverseContainerSurface();
        Color inverseOnContainer = currColorTokens.getInverseOnContainer();
        Color inverseContainerOutline = currColorTokens.getInverseContainerOutline();
        Color complementaryOnContainer = currColorTokens.getComplementaryOnContainer();
        Color complementaryContainerOutline = currColorTokens.getComplementaryContainerOutline();
        Color accentOnContainer = currColorTokens.getAccentOnContainer();

        nameBuilder.append(currColorTokens.hashCode());

        boolean isDark = currColorTokens.isDark();

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                (modelStateInfo == null) ? null :
                        (useNoSelectionStateContributionMap ? modelStateInfo.getStateNoSelectionContributionMap()
                                : modelStateInfo.getStateContributionMap());

        if (!currState.isDisabled() && (activeStates != null) && (activeStates.size() > 1)) {
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates.entrySet()) {
                if (activeEntry.getKey() == currState) {
                    // Already accounted for the currently active state
                    continue;
                }
                float amount = activeEntry.getValue().getContribution();
                if (amount == 0.0f) {
                    // Skip a zero-amount contribution
                    continue;
                }
                // Get the color tokens that match the contribution state
                ContainerColorTokens contributionColorTokens =
                        colorSchemeDelegate.getContainerTokensForActiveState(activeEntry.getKey());

                // And interpolate the colors
                containerSurfaceLowest = RadianceColorUtilities.getInterpolatedColor(containerSurfaceLowest,
                        contributionColorTokens.getContainerSurfaceLowest(), 1.0f - amount);
                containerSurfaceLow = RadianceColorUtilities.getInterpolatedColor(containerSurfaceLow,
                        contributionColorTokens.getContainerSurfaceLow(), 1.0f - amount);
                containerSurface = RadianceColorUtilities.getInterpolatedColor(containerSurface,
                        contributionColorTokens.getContainerSurface(), 1.0f - amount);
                containerSurfaceHigh = RadianceColorUtilities.getInterpolatedColor(containerSurfaceHigh,
                        contributionColorTokens.getContainerSurfaceHigh(), 1.0f - amount);
                containerSurfaceHighest = RadianceColorUtilities.getInterpolatedColor(containerSurfaceHighest,
                        contributionColorTokens.getContainerSurfaceHighest(), 1.0f - amount);
                containerSurfaceDim = RadianceColorUtilities.getInterpolatedColor(containerSurfaceDim,
                    contributionColorTokens.getContainerSurfaceDim(), 1.0f - amount);
                containerSurfaceBright = RadianceColorUtilities.getInterpolatedColor(containerSurfaceBright,
                    contributionColorTokens.getContainerSurfaceBright(), 1.0f - amount);
                onContainer = RadianceColorUtilities.getInterpolatedColor(onContainer,
                        contributionColorTokens.getOnContainer(), 1.0f - amount);
                onContainerVariant = RadianceColorUtilities.getInterpolatedColor(onContainerVariant,
                        contributionColorTokens.getOnContainerVariant(), 1.0f - amount);
                containerOutline = RadianceColorUtilities.getInterpolatedColor(containerOutline,
                        contributionColorTokens.getContainerOutline(), 1.0f - amount);
                containerOutlineVariant = RadianceColorUtilities.getInterpolatedColor(containerOutlineVariant,
                        contributionColorTokens.getContainerOutlineVariant(), 1.0f - amount);
                containerDisabledAlpha = (1.0f - amount) * containerDisabledAlpha +
                    amount * contributionColorTokens.getContainerSurfaceDisabledAlpha();
                onContainerDisabledAlpha = (1.0f - amount) * onContainerDisabledAlpha +
                    amount * contributionColorTokens.getOnContainerDisabledAlpha();
                containerOutlineDisabledAlpha = (1.0f - amount) * containerOutlineDisabledAlpha +
                    amount * contributionColorTokens.getContainerOutlineDisabledAlpha();
                inverseContainerSurface = RadianceColorUtilities.getInterpolatedColor(inverseContainerSurface,
                    contributionColorTokens.getInverseContainerSurface(), 1.0f - amount);
                inverseOnContainer = RadianceColorUtilities.getInterpolatedColor(inverseOnContainer,
                    contributionColorTokens.getInverseOnContainer(), 1.0f - amount);
                inverseContainerOutline = RadianceColorUtilities.getInterpolatedColor(inverseContainerOutline,
                    contributionColorTokens.getInverseContainerOutline(), 1.0f - amount);
                complementaryOnContainer = RadianceColorUtilities.getInterpolatedColor(complementaryOnContainer,
                    contributionColorTokens.getComplementaryOnContainer(), 1.0f - amount);
                complementaryContainerOutline = RadianceColorUtilities.getInterpolatedColor(complementaryContainerOutline,
                    contributionColorTokens.getComplementaryContainerOutline(), 1.0f - amount);
                accentOnContainer = RadianceColorUtilities.getInterpolatedColor(accentOnContainer,
                    contributionColorTokens.getAccentOnContainer(), 1.0f - amount);

                nameBuilder.append(", [").append(contributionColorTokens.hashCode()).append(":")
                        .append(amount).append("]");
                isDark = isDark && contributionColorTokens.isDark();
            }
        }

        // Update the mutable color tokens with the interpolated colors
        bladeContainerTokens.containerSurfaceLowest = containerSurfaceLowest;
        bladeContainerTokens.containerSurfaceLow = containerSurfaceLow;
        bladeContainerTokens.containerSurface = containerSurface;
        bladeContainerTokens.containerSurfaceHigh = containerSurfaceHigh;
        bladeContainerTokens.containerSurfaceHighest = containerSurfaceHighest;
        bladeContainerTokens.containerSurfaceDim = containerSurfaceDim;
        bladeContainerTokens.containerSurfaceBright = containerSurfaceBright;
        bladeContainerTokens.onContainer = onContainer;
        bladeContainerTokens.onContainerVariant = onContainerVariant;
        bladeContainerTokens.containerOutline = containerOutline;
        bladeContainerTokens.containerOutlineVariant = containerOutlineVariant;
        bladeContainerTokens.containerDisabledAlpha = containerDisabledAlpha;
        bladeContainerTokens.onContainerDisabledAlpha = onContainerDisabledAlpha;
        bladeContainerTokens.containerOutlineDisabledAlpha = containerOutlineDisabledAlpha;
        bladeContainerTokens.inverseContainerSurface = inverseContainerSurface;
        bladeContainerTokens.inverseOnContainer = inverseOnContainer;
        bladeContainerTokens.inverseContainerOutline = inverseContainerOutline;
        bladeContainerTokens.complementaryOnContainer = complementaryOnContainer;
        bladeContainerTokens.complementaryContainerOutline = complementaryContainerOutline;
        bladeContainerTokens.accentOnContainer = accentOnContainer;

        bladeContainerTokens.combinedName = nameBuilder.toString();
        bladeContainerTokens.isDark = isDark;
    }

    public static void populateColorTokens(
        BladeContainerColorTokens bladeContainerTokens, JTabbedPane tabbedPane, int tabIndex,
        StateTransitionTracker.ModelStateInfo modelStateInfo, ComponentState currState,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                "Color scheme population must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }

        StringBuilder nameBuilder = new StringBuilder();
        ContainerColorTokens currColorTokens = CoreColorTokenUtils.getContainerTokens(
            tabbedPane, tabIndex, associationKind, currState);
        Color containerSurfaceLowest = currColorTokens.getContainerSurfaceLowest();
        Color containerSurfaceLow = currColorTokens.getContainerSurfaceLow();
        Color containerSurface = currColorTokens.getContainerSurface();
        Color containerSurfaceHigh = currColorTokens.getContainerSurfaceHigh();
        Color containerSurfaceHighest = currColorTokens.getContainerSurfaceHighest();
        Color containerSurfaceDim = currColorTokens.getContainerSurfaceDim();
        Color containerSurfaceBright = currColorTokens.getContainerSurfaceBright();
        Color onContainer = currColorTokens.getOnContainer();
        Color onContainerVariant = currColorTokens.getOnContainerVariant();
        Color containerOutline = currColorTokens.getContainerOutline();
        Color containerOutlineVariant = currColorTokens.getContainerOutlineVariant();
        float containerDisabledAlpha = currColorTokens.getContainerSurfaceDisabledAlpha();
        float onContainerDisabledAlpha = currColorTokens.getOnContainerDisabledAlpha();
        float containerOutlineDisabledAlpha = currColorTokens.getContainerOutlineDisabledAlpha();
        Color inverseContainerSurface = currColorTokens.getInverseContainerSurface();
        Color inverseOnContainer = currColorTokens.getInverseOnContainer();
        Color inverseContainerOutline = currColorTokens.getInverseContainerOutline();
        Color complementaryOnContainer = currColorTokens.getComplementaryOnContainer();
        Color complementaryContainerOutline = currColorTokens.getComplementaryContainerOutline();
        Color accentOnContainer = currColorTokens.getAccentOnContainer();

        nameBuilder.append(currColorTokens.hashCode());

        boolean isDark = currColorTokens.isDark();

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
            (modelStateInfo == null) ? null : modelStateInfo.getStateContributionMap();

        if (!currState.isDisabled() && (activeStates != null) && (activeStates.size() > 1)) {
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState == currState) {
                    // Already accounted for the currently active state
                    continue;
                }
                float amount = activeEntry.getValue().getContribution();
                if (amount == 0.0f) {
                    // Skip a zero-amount contribution
                    continue;
                }
                // Get the color tokens that matches the contribution state
                ContainerColorTokens contributionColorTokens =
                    CoreColorTokenUtils.getContainerTokens(
                        tabbedPane, tabIndex, associationKind, activeState);

                // And interpolate the colors
                containerSurfaceLowest = RadianceColorUtilities.getInterpolatedColor(containerSurfaceLowest,
                    contributionColorTokens.getContainerSurfaceLowest(), 1.0f - amount);
                containerSurfaceLow = RadianceColorUtilities.getInterpolatedColor(containerSurfaceLow,
                    contributionColorTokens.getContainerSurfaceLow(), 1.0f - amount);
                containerSurface = RadianceColorUtilities.getInterpolatedColor(containerSurface,
                    contributionColorTokens.getContainerSurface(), 1.0f - amount);
                containerSurfaceHigh = RadianceColorUtilities.getInterpolatedColor(containerSurfaceHigh,
                    contributionColorTokens.getContainerSurfaceHigh(), 1.0f - amount);
                containerSurfaceHighest = RadianceColorUtilities.getInterpolatedColor(containerSurfaceHighest,
                    contributionColorTokens.getContainerSurfaceHighest(), 1.0f - amount);
                containerSurfaceDim = RadianceColorUtilities.getInterpolatedColor(containerSurfaceDim,
                    contributionColorTokens.getContainerSurfaceDim(), 1.0f - amount);
                containerSurfaceBright = RadianceColorUtilities.getInterpolatedColor(containerSurfaceBright,
                    contributionColorTokens.getContainerSurfaceBright(), 1.0f - amount);
                onContainer = RadianceColorUtilities.getInterpolatedColor(onContainer,
                    contributionColorTokens.getOnContainer(), 1.0f - amount);
                onContainerVariant = RadianceColorUtilities.getInterpolatedColor(onContainerVariant,
                    contributionColorTokens.getOnContainerVariant(), 1.0f - amount);
                containerOutline = RadianceColorUtilities.getInterpolatedColor(containerOutline,
                    contributionColorTokens.getContainerOutline(), 1.0f - amount);
                containerOutlineVariant = RadianceColorUtilities.getInterpolatedColor(containerOutlineVariant,
                    contributionColorTokens.getContainerOutlineVariant(), 1.0f - amount);
                containerDisabledAlpha = (1.0f - amount) * containerDisabledAlpha +
                    amount * contributionColorTokens.getContainerSurfaceDisabledAlpha();
                onContainerDisabledAlpha = (1.0f - amount) * onContainerDisabledAlpha +
                    amount * contributionColorTokens.getOnContainerDisabledAlpha();
                containerOutlineDisabledAlpha = (1.0f - amount) * containerOutlineDisabledAlpha +
                    amount * contributionColorTokens.getContainerOutlineDisabledAlpha();
                inverseContainerSurface = RadianceColorUtilities.getInterpolatedColor(inverseContainerSurface,
                    contributionColorTokens.getInverseContainerSurface(), 1.0f - amount);
                inverseOnContainer = RadianceColorUtilities.getInterpolatedColor(inverseOnContainer,
                    contributionColorTokens.getInverseOnContainer(), 1.0f - amount);
                inverseContainerOutline = RadianceColorUtilities.getInterpolatedColor(inverseContainerOutline,
                    contributionColorTokens.getInverseContainerOutline(), 1.0f - amount);
                complementaryOnContainer = RadianceColorUtilities.getInterpolatedColor(complementaryOnContainer,
                    contributionColorTokens.getComplementaryOnContainer(), 1.0f - amount);
                complementaryContainerOutline = RadianceColorUtilities.getInterpolatedColor(complementaryContainerOutline,
                    contributionColorTokens.getComplementaryContainerOutline(), 1.0f - amount);
                accentOnContainer = RadianceColorUtilities.getInterpolatedColor(accentOnContainer,
                    contributionColorTokens.getAccentOnContainer(), 1.0f - amount);

                nameBuilder.append(", [").append(contributionColorTokens.hashCode()).append(":")
                    .append(amount).append("]");
                isDark = isDark && contributionColorTokens.isDark();
            }
        }

        // Update the mutable color tokens with the interpolated colors
        bladeContainerTokens.containerSurfaceLowest = containerSurfaceLowest;
        bladeContainerTokens.containerSurfaceLow = containerSurfaceLow;
        bladeContainerTokens.containerSurface = containerSurface;
        bladeContainerTokens.containerSurfaceHigh = containerSurfaceHigh;
        bladeContainerTokens.containerSurfaceHighest = containerSurfaceHighest;
        bladeContainerTokens.containerSurfaceDim = containerSurfaceDim;
        bladeContainerTokens.containerSurfaceBright = containerSurfaceBright;
        bladeContainerTokens.onContainer = onContainer;
        bladeContainerTokens.onContainerVariant = onContainerVariant;
        bladeContainerTokens.containerOutline = containerOutline;
        bladeContainerTokens.containerOutlineVariant = containerOutlineVariant;
        bladeContainerTokens.containerDisabledAlpha = containerDisabledAlpha;
        bladeContainerTokens.onContainerDisabledAlpha = onContainerDisabledAlpha;
        bladeContainerTokens.containerOutlineDisabledAlpha = containerOutlineDisabledAlpha;
        bladeContainerTokens.inverseContainerSurface = inverseContainerSurface;
        bladeContainerTokens.inverseOnContainer = inverseOnContainer;
        bladeContainerTokens.inverseContainerOutline = inverseContainerOutline;
        bladeContainerTokens.complementaryOnContainer = complementaryOnContainer;
        bladeContainerTokens.complementaryContainerOutline = complementaryContainerOutline;
        bladeContainerTokens.accentOnContainer = accentOnContainer;

        bladeContainerTokens.combinedName = nameBuilder.toString();
        bladeContainerTokens.isDark = isDark;
    }
}
