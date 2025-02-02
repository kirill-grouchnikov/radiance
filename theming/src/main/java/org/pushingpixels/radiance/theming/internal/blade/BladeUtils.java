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
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class BladeUtils {
    public static void populateModificationAwareColorScheme(
        BladeColorScheme bladeColorScheme, float modificationCyclePosition) {
        RadianceColorScheme colorScheme2 = RadianceColorSchemeUtilities.YELLOW;
        RadianceColorScheme colorScheme = RadianceColorSchemeUtilities.ORANGE;

        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                "Color scheme population must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }

        bladeColorScheme.ultraLight = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getUltraLightColor(),
            colorScheme.getUltraLightColor(), modificationCyclePosition);
        bladeColorScheme.extraLight = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getExtraLightColor(),
            colorScheme.getExtraLightColor(), modificationCyclePosition);
        bladeColorScheme.light = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getLightColor(),
            colorScheme.getLightColor(), modificationCyclePosition);
        bladeColorScheme.mid = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getMidColor(),
            colorScheme.getMidColor(), modificationCyclePosition);
        bladeColorScheme.dark = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getDarkColor(),
            colorScheme.getDarkColor(), modificationCyclePosition);
        bladeColorScheme.ultraDark = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getUltraDarkColor(),
            colorScheme.getUltraDarkColor(), modificationCyclePosition);
        bladeColorScheme.foreground = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getForegroundColor(),
            colorScheme.getForegroundColor(), modificationCyclePosition);
        bladeColorScheme.backgroundFill = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getBackgroundFillColor(),
            colorScheme.getBackgroundFillColor(), modificationCyclePosition);
        bladeColorScheme.accentedBackgroundFill = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getAccentedBackgroundFillColor(),
            colorScheme.getAccentedBackgroundFillColor(), modificationCyclePosition);
        bladeColorScheme.focusRing = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getFocusRingColor(),
            colorScheme.getFocusRingColor(), modificationCyclePosition);
        bladeColorScheme.line = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getLineColor(),
            colorScheme.getLineColor(), modificationCyclePosition);
        bladeColorScheme.selectionForeground = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getSelectionForegroundColor(),
            colorScheme.getSelectionForegroundColor(), modificationCyclePosition);
        bladeColorScheme.selectionBackground = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getSelectionBackgroundColor(),
            colorScheme.getSelectionBackgroundColor(), modificationCyclePosition);
        bladeColorScheme.textBackgroundFill = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getTextBackgroundFillColor(),
            colorScheme.getTextBackgroundFillColor(), modificationCyclePosition);
        bladeColorScheme.separatorPrimary = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getSeparatorPrimaryColor(),
            colorScheme.getSeparatorPrimaryColor(), modificationCyclePosition);
        bladeColorScheme.separatorSecondary = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getSeparatorSecondaryColor(),
            colorScheme.getSeparatorSecondaryColor(), modificationCyclePosition);
        bladeColorScheme.mark = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getMarkColor(),
            colorScheme.getMarkColor(), modificationCyclePosition);
        bladeColorScheme.echo = RadianceColorUtilities.getInterpolatedColor(colorScheme2.getEchoColor(),
            colorScheme.getEchoColor(), modificationCyclePosition);

        bladeColorScheme.displayName = "[" + colorScheme2.getDisplayName() + ":" + modificationCyclePosition
            + "], [" + colorScheme.getDisplayName() + ":" + (1.0f - modificationCyclePosition) + "]";
    }

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
            component, RadianceThemingSlices.SystemContainerType.WARNING,
            RadianceThemingSlices.ActiveContainerType.TONAL);
        ContainerColorTokens emergencyColorTokens = skin.getSystemContainerTokens(
            component, RadianceThemingSlices.SystemContainerType.EMERGENCY,
            RadianceThemingSlices.ActiveContainerType.TONAL);

        bladeContainerTokens.containerSurfaceLowest = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceLowest(),
            emergencyColorTokens.getContainerSurfaceLowest(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurfaceLow = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceLow(),
            emergencyColorTokens.getContainerSurfaceLow(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurface = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurface(),
            emergencyColorTokens.getContainerSurface(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurfaceHigh = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceHigh(),
            emergencyColorTokens.getContainerSurfaceHigh(),
            modificationCyclePosition);
        bladeContainerTokens.containerSurfaceHighest = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerSurfaceHighest(),
            emergencyColorTokens.getContainerSurfaceHighest(),
            modificationCyclePosition);

        bladeContainerTokens.onContainer = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getOnContainer(),
            emergencyColorTokens.getOnContainer(),
            modificationCyclePosition);
        bladeContainerTokens.onContainerVariant = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getOnContainerVariant(),
            emergencyColorTokens.getOnContainerVariant(),
            modificationCyclePosition);

        bladeContainerTokens.containerOutline = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getContainerOutline(),
            emergencyColorTokens.getContainerOutlineVariant(),
            modificationCyclePosition);

        bladeContainerTokens.containerDisabledAlpha =
            (1.0f - modificationCyclePosition) * warningColorTokens.getContainerSurfaceDisabledAlpha() +
                modificationCyclePosition * emergencyColorTokens.getContainerSurfaceDisabledAlpha();
        bladeContainerTokens.onContainerDisabledAlpha =
            (1.0f - modificationCyclePosition) * warningColorTokens.getOnContainerDisabledAlpha() +
                modificationCyclePosition * emergencyColorTokens.getOnContainerDisabledAlpha();
        bladeContainerTokens.containerOutlineDisabledAlpha =
            (1.0f - modificationCyclePosition) * warningColorTokens.getContainerOutlineDisabledAlpha() +
                modificationCyclePosition * emergencyColorTokens.getContainerOutlineDisabledAlpha();

        bladeContainerTokens.inverseContainerSurface = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getInverseContainerSurface(),
            emergencyColorTokens.getInverseContainerSurface(),
            modificationCyclePosition);
        bladeContainerTokens.inverseOnContainer = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getInverseOnContainer(),
            emergencyColorTokens.getInverseOnContainer(),
            modificationCyclePosition);
        bladeContainerTokens.inverseContainerOutline = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getInverseContainerOutline(),
            emergencyColorTokens.getInverseContainerOutline(),
            modificationCyclePosition);
        bladeContainerTokens.complementaryContainerOutline = RadianceColorUtilities.getInterpolatedColor(
            warningColorTokens.getComplementaryContainerOutline(),
            emergencyColorTokens.getComplementaryContainerOutline(),
            modificationCyclePosition);

        bladeContainerTokens.combinedName = "[" + warningColorTokens.hashCode() + ":" + modificationCyclePosition
            + "], [" + emergencyColorTokens.hashCode() + ":" + (1.0f - modificationCyclePosition) + "]";
        bladeContainerTokens.isDark = warningColorTokens.isDark() && emergencyColorTokens.isDark();
    }

    public static void populateColorScheme(
            BladeColorScheme bladeColorScheme,
            Component component,
            StateTransitionTracker.ModelStateInfo modelStateInfo,
            ComponentState currState,
            RadianceThemingSlices.ColorSchemeAssociationKind associationKind,
            boolean treatEnabledAsActive) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Color scheme population must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }

        StringBuilder nameBuilder = new StringBuilder();
        RadianceColorScheme currStateScheme = (treatEnabledAsActive && (currState == ComponentState.ENABLED))
                ? RadianceColorSchemeUtilities.getActiveColorScheme(component, currState)
                : RadianceColorSchemeUtilities.getColorScheme(component, associationKind, currState);

        Color ultraLight = currStateScheme.getUltraLightColor();
        Color extraLight = currStateScheme.getExtraLightColor();
        Color light = currStateScheme.getLightColor();
        Color mid = currStateScheme.getMidColor();
        Color dark = currStateScheme.getDarkColor();
        Color ultraDark = currStateScheme.getUltraDarkColor();
        Color foreground = currStateScheme.getForegroundColor();
        Color backgroundFill = currStateScheme.getBackgroundFillColor();
        Color accentedBackgroundFill = currStateScheme.getAccentedBackgroundFillColor();
        Color focusRing = currStateScheme.getFocusRingColor();
        Color line = currStateScheme.getLineColor();
        Color selectionForeground = currStateScheme.getSelectionForegroundColor();
        Color selectionBackground = currStateScheme.getSelectionBackgroundColor();
        Color textBackgroundFill = currStateScheme.getTextBackgroundFillColor();
        Color separatorPrimary = currStateScheme.getSeparatorPrimaryColor();
        Color separatorSecondary = currStateScheme.getSeparatorSecondaryColor();
        Color mark = currStateScheme.getMarkColor();
        Color echo = currStateScheme.getEchoColor();
        nameBuilder.append(currStateScheme.getDisplayName());

        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                (modelStateInfo == null) ? null : modelStateInfo.getStateContributionMap();

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
                // Get the color scheme that matches the contribution state
                RadianceColorScheme contributionScheme = (treatEnabledAsActive && (activeEntry.getKey() == ComponentState.ENABLED))
                        ? RadianceColorSchemeUtilities.getActiveColorScheme(component, activeEntry.getKey())
                        : RadianceColorSchemeUtilities.getColorScheme(component, associationKind, activeEntry.getKey());

                // And interpolate the colors
                ultraLight = RadianceColorUtilities.getInterpolatedColor(ultraLight,
                        contributionScheme.getUltraLightColor(), 1.0f - amount);
                extraLight = RadianceColorUtilities.getInterpolatedColor(extraLight,
                        contributionScheme.getExtraLightColor(), 1.0f - amount);
                light = RadianceColorUtilities.getInterpolatedColor(light,
                        contributionScheme.getLightColor(), 1.0f - amount);
                mid = RadianceColorUtilities.getInterpolatedColor(mid,
                        contributionScheme.getMidColor(), 1.0f - amount);
                dark = RadianceColorUtilities.getInterpolatedColor(dark,
                        contributionScheme.getDarkColor(), 1.0f - amount);
                ultraDark = RadianceColorUtilities.getInterpolatedColor(ultraDark,
                        contributionScheme.getUltraDarkColor(), 1.0f - amount);
                foreground = RadianceColorUtilities.getInterpolatedColor(foreground,
                        contributionScheme.getForegroundColor(), 1.0f - amount);
                backgroundFill = RadianceColorUtilities.getInterpolatedColor(backgroundFill,
                        contributionScheme.getBackgroundFillColor(), 1.0f - amount);
                accentedBackgroundFill = RadianceColorUtilities.getInterpolatedColor(accentedBackgroundFill,
                        contributionScheme.getAccentedBackgroundFillColor(), 1.0f - amount);
                focusRing = RadianceColorUtilities.getInterpolatedColor(focusRing,
                        contributionScheme.getFocusRingColor(), 1.0f - amount);
                line = RadianceColorUtilities.getInterpolatedColor(line,
                        contributionScheme.getLineColor(), 1.0f - amount);
                selectionForeground = RadianceColorUtilities.getInterpolatedColor(selectionForeground,
                        contributionScheme.getSelectionForegroundColor(), 1.0f - amount);
                selectionBackground = RadianceColorUtilities.getInterpolatedColor(selectionBackground,
                        contributionScheme.getSelectionBackgroundColor(), 1.0f - amount);
                textBackgroundFill = RadianceColorUtilities.getInterpolatedColor(textBackgroundFill,
                        contributionScheme.getTextBackgroundFillColor(), 1.0f - amount);
                separatorPrimary = RadianceColorUtilities.getInterpolatedColor(separatorPrimary,
                        contributionScheme.getSeparatorPrimaryColor(), 1.0f - amount);
                separatorSecondary = RadianceColorUtilities.getInterpolatedColor(separatorSecondary,
                        contributionScheme.getSeparatorSecondaryColor(), 1.0f - amount);
                mark = RadianceColorUtilities.getInterpolatedColor(mark,
                        contributionScheme.getMarkColor(), 1.0f - amount);
                echo = RadianceColorUtilities.getInterpolatedColor(echo,
                        contributionScheme.getEchoColor(), 1.0f - amount);

                nameBuilder.append(", [").append(contributionScheme.getDisplayName()).append(":")
                        .append(amount).append("]");
            }
        }

        // Update the mutable color scheme with the interpolated colors
        bladeColorScheme.ultraLight = ultraLight;
        bladeColorScheme.extraLight = extraLight;
        bladeColorScheme.light = light;
        bladeColorScheme.mid = mid;
        bladeColorScheme.dark = dark;
        bladeColorScheme.ultraDark = ultraDark;
        bladeColorScheme.foreground = foreground;
        bladeColorScheme.backgroundFill = backgroundFill;
        bladeColorScheme.accentedBackgroundFill = accentedBackgroundFill;
        bladeColorScheme.focusRing = focusRing;
        bladeColorScheme.line = line;
        bladeColorScheme.selectionForeground = selectionForeground;
        bladeColorScheme.selectionBackground = selectionBackground;
        bladeColorScheme.textBackgroundFill = textBackgroundFill;
        bladeColorScheme.separatorPrimary = separatorPrimary;
        bladeColorScheme.separatorSecondary = separatorSecondary;
        bladeColorScheme.mark = mark;
        bladeColorScheme.echo = echo;

        bladeColorScheme.displayName = nameBuilder.toString();
    }

    public static void populateColorTokens(
        BladeContainerColorTokens bladeContainerTokens, Component component,
        StateTransitionTracker.ModelStateInfo modelStateInfo, ComponentState currState,
        RadianceThemingSlices.ContainerColorTokensAssociationKind associationKind,
        boolean treatEnabledAsActive, RadianceThemingSlices.ContainerType inactiveContainerType) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Color scheme population must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }

        StringBuilder nameBuilder = new StringBuilder();
        ContainerColorTokens currColorTokens = (treatEnabledAsActive && (currState == ComponentState.ENABLED))
                ? RadianceColorSchemeUtilities.getActiveContainerTokens(component, currState)
                : RadianceColorSchemeUtilities.getContainerTokens(component, associationKind, currState, inactiveContainerType);
        Color containerSurfaceLowest = currColorTokens.getContainerSurfaceLowest();
        Color containerSurfaceLow = currColorTokens.getContainerSurfaceLow();
        Color containerSurface = currColorTokens.getContainerSurface();
        Color containerSurfaceHigh = currColorTokens.getContainerSurfaceHigh();
        Color containerSurfaceHighest = currColorTokens.getContainerSurfaceHighest();
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
        Color complementaryContainerOutline = currColorTokens.getComplementaryContainerOutline();

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
                // Get the color scheme that matches the contribution state
                ContainerColorTokens contributionColorTokens = (treatEnabledAsActive && (activeState == ComponentState.ENABLED))
                        ? RadianceColorSchemeUtilities.getActiveContainerTokens(component, activeState)
                        : RadianceColorSchemeUtilities.getContainerTokens(component, associationKind, activeState, inactiveContainerType);

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
                complementaryContainerOutline = RadianceColorUtilities.getInterpolatedColor(complementaryContainerOutline,
                    contributionColorTokens.getComplementaryContainerOutline(), 1.0f - amount);

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
        bladeContainerTokens.complementaryContainerOutline = complementaryContainerOutline;

        bladeContainerTokens.combinedName = nameBuilder.toString();
        bladeContainerTokens.isDark = isDark;
    }

    public interface ColorSchemeDelegate {
        RadianceColorScheme getColorSchemeForCurrentState(ComponentState state);
        RadianceColorScheme getColorSchemeForActiveState(ComponentState state);

        default ContainerColorTokens getContainerTokensForCurrentState(ComponentState state) {
            return null;
        }

        default ContainerColorTokens getContainerTokensForActiveState(ComponentState state) {
            return null;
        }
    }

    public static ColorSchemeDelegate getDefaultColorSchemeDelegate(Component component,
            BladeTransitionAwareIcon.ColorSchemeAssociationKindDelegate colorSchemeAssociationKindDelegate) {
        return new ColorSchemeDelegate() {
            @Override
            public RadianceColorScheme getColorSchemeForCurrentState(ComponentState state) {
                return RadianceColorSchemeUtilities.getColorScheme(component,
                        colorSchemeAssociationKindDelegate.getColorSchemeAssociationKind(state), state);
            }

            @Override
            public RadianceColorScheme getColorSchemeForActiveState(ComponentState state) {
                return RadianceColorSchemeUtilities.getColorScheme(component,
                        colorSchemeAssociationKindDelegate.getColorSchemeAssociationKind(state), state);
            }

            @Override
            public ContainerColorTokens getContainerTokensForCurrentState(ComponentState state) {
                return RadianceColorSchemeUtilities.getContainerTokens(component,
                    colorSchemeAssociationKindDelegate.getContainterColorTokensAssociationKind(state), state,
                    RadianceThemingSlices.ContainerType.MUTED);
            }

            @Override
            public ContainerColorTokens getContainerTokensForActiveState(ComponentState state) {
                return RadianceColorSchemeUtilities.getContainerTokens(component,
                    colorSchemeAssociationKindDelegate.getContainterColorTokensAssociationKind(state), state,
                    RadianceThemingSlices.ContainerType.MUTED);
            }
        };
    }

    public static void populateColorScheme(
            BladeColorScheme bladeColorScheme,
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
        RadianceColorScheme currStateScheme = colorSchemeDelegate.getColorSchemeForCurrentState(currState);

        Color ultraLight = currStateScheme.getUltraLightColor();
        Color extraLight = currStateScheme.getExtraLightColor();
        Color light = currStateScheme.getLightColor();
        Color mid = currStateScheme.getMidColor();
        Color dark = currStateScheme.getDarkColor();
        Color ultraDark = currStateScheme.getUltraDarkColor();
        Color foreground = currStateScheme.getForegroundColor();
        Color backgroundFill = currStateScheme.getBackgroundFillColor();
        Color accentedBackgroundFill = currStateScheme.getAccentedBackgroundFillColor();
        Color focusRing = currStateScheme.getFocusRingColor();
        Color line = currStateScheme.getLineColor();
        Color selectionForeground = currStateScheme.getSelectionForegroundColor();
        Color selectionBackground = currStateScheme.getSelectionBackgroundColor();
        Color textBackgroundFill = currStateScheme.getTextBackgroundFillColor();
        Color separatorPrimary = currStateScheme.getSeparatorPrimaryColor();
        Color separatorSecondary = currStateScheme.getSeparatorSecondaryColor();
        Color mark = currStateScheme.getMarkColor();
        Color echo = currStateScheme.getEchoColor();
        nameBuilder.append(currStateScheme.getDisplayName());

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
                // Get the color scheme that matches the contribution state
                RadianceColorScheme contributionScheme = colorSchemeDelegate.getColorSchemeForActiveState(activeEntry.getKey());

                // And interpolate the colors
                ultraLight = RadianceColorUtilities.getInterpolatedColor(ultraLight,
                        contributionScheme.getUltraLightColor(), 1.0f - amount);
                extraLight = RadianceColorUtilities.getInterpolatedColor(extraLight,
                        contributionScheme.getExtraLightColor(), 1.0f - amount);
                light = RadianceColorUtilities.getInterpolatedColor(light,
                        contributionScheme.getLightColor(), 1.0f - amount);
                mid = RadianceColorUtilities.getInterpolatedColor(mid,
                        contributionScheme.getMidColor(), 1.0f - amount);
                dark = RadianceColorUtilities.getInterpolatedColor(dark,
                        contributionScheme.getDarkColor(), 1.0f - amount);
                ultraDark = RadianceColorUtilities.getInterpolatedColor(ultraDark,
                        contributionScheme.getUltraDarkColor(), 1.0f - amount);
                foreground = RadianceColorUtilities.getInterpolatedColor(foreground,
                        contributionScheme.getForegroundColor(), 1.0f - amount);
                backgroundFill = RadianceColorUtilities.getInterpolatedColor(backgroundFill,
                        contributionScheme.getBackgroundFillColor(), 1.0f - amount);
                accentedBackgroundFill = RadianceColorUtilities.getInterpolatedColor(accentedBackgroundFill,
                        contributionScheme.getAccentedBackgroundFillColor(), 1.0f - amount);
                focusRing = RadianceColorUtilities.getInterpolatedColor(focusRing,
                        contributionScheme.getFocusRingColor(), 1.0f - amount);
                line = RadianceColorUtilities.getInterpolatedColor(line,
                        contributionScheme.getLineColor(), 1.0f - amount);
                selectionForeground = RadianceColorUtilities.getInterpolatedColor(selectionForeground,
                        contributionScheme.getSelectionForegroundColor(), 1.0f - amount);
                selectionBackground = RadianceColorUtilities.getInterpolatedColor(selectionBackground,
                        contributionScheme.getSelectionBackgroundColor(), 1.0f - amount);
                textBackgroundFill = RadianceColorUtilities.getInterpolatedColor(textBackgroundFill,
                        contributionScheme.getTextBackgroundFillColor(), 1.0f - amount);
                separatorPrimary = RadianceColorUtilities.getInterpolatedColor(separatorPrimary,
                        contributionScheme.getSeparatorPrimaryColor(), 1.0f - amount);
                separatorSecondary = RadianceColorUtilities.getInterpolatedColor(separatorSecondary,
                        contributionScheme.getSeparatorSecondaryColor(), 1.0f - amount);
                mark = RadianceColorUtilities.getInterpolatedColor(mark,
                        contributionScheme.getMarkColor(), 1.0f - amount);
                echo = RadianceColorUtilities.getInterpolatedColor(echo,
                        contributionScheme.getEchoColor(), 1.0f - amount);

                nameBuilder.append(", [").append(contributionScheme.getDisplayName()).append(":")
                        .append(amount).append("]");
            }
        }

        // Update the mutable color scheme with the interpolated colors
        bladeColorScheme.ultraLight = ultraLight;
        bladeColorScheme.extraLight = extraLight;
        bladeColorScheme.light = light;
        bladeColorScheme.mid = mid;
        bladeColorScheme.dark = dark;
        bladeColorScheme.ultraDark = ultraDark;
        bladeColorScheme.foreground = foreground;
        bladeColorScheme.backgroundFill = backgroundFill;
        bladeColorScheme.accentedBackgroundFill = accentedBackgroundFill;
        bladeColorScheme.focusRing = focusRing;
        bladeColorScheme.line = line;
        bladeColorScheme.selectionForeground = selectionForeground;
        bladeColorScheme.selectionBackground = selectionBackground;
        bladeColorScheme.textBackgroundFill = textBackgroundFill;
        bladeColorScheme.separatorPrimary = separatorPrimary;
        bladeColorScheme.separatorSecondary = separatorSecondary;
        bladeColorScheme.mark = mark;
        bladeColorScheme.echo = echo;

        bladeColorScheme.displayName = nameBuilder.toString();
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
        Color complementaryContainerOutline = currColorTokens.getComplementaryContainerOutline();

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
                complementaryContainerOutline = RadianceColorUtilities.getInterpolatedColor(complementaryContainerOutline,
                    contributionColorTokens.getComplementaryContainerOutline(), 1.0f - amount);

                nameBuilder.append(", [").append(contributionColorTokens.hashCode()).append(":")
                        .append(amount).append("]");
                isDark = isDark && contributionColorTokens.isDark();
            }
        }

        // Update the mutable color scheme with the interpolated colors
        bladeContainerTokens.containerSurfaceLowest = containerSurfaceLowest;
        bladeContainerTokens.containerSurfaceLow = containerSurfaceLow;
        bladeContainerTokens.containerSurface = containerSurface;
        bladeContainerTokens.containerSurfaceHigh = containerSurfaceHigh;
        bladeContainerTokens.containerSurfaceHighest = containerSurfaceHighest;
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
        bladeContainerTokens.complementaryContainerOutline = complementaryContainerOutline;

        bladeContainerTokens.combinedName = nameBuilder.toString();
        bladeContainerTokens.isDark = isDark;
    }

    public static void populateColorScheme(
            BladeColorScheme bladeColorScheme,
            JTabbedPane tabbedPane, int tabIndex,
            StateTransitionTracker.ModelStateInfo modelStateInfo,
            ComponentState currState,
            RadianceThemingSlices.ColorSchemeAssociationKind associationKind,
            boolean useNoSelectionStateContributionMap) {
        if (!SwingUtilities.isEventDispatchThread()) {
            UiThreadingViolationException uiThreadingViolationError = new UiThreadingViolationException(
                    "Color scheme population must be done on Event Dispatch Thread");
            uiThreadingViolationError.printStackTrace(System.err);
            throw uiThreadingViolationError;
        }

        StringBuilder nameBuilder = new StringBuilder();
        RadianceColorScheme currStateScheme = RadianceColorSchemeUtilities
                .getColorScheme(tabbedPane, tabIndex, associationKind, currState);

        Color ultraLight = currStateScheme.getUltraLightColor();
        Color extraLight = currStateScheme.getExtraLightColor();
        Color light = currStateScheme.getLightColor();
        Color mid = currStateScheme.getMidColor();
        Color dark = currStateScheme.getDarkColor();
        Color ultraDark = currStateScheme.getUltraDarkColor();
        Color foreground = currStateScheme.getForegroundColor();
        Color backgroundFill = currStateScheme.getBackgroundFillColor();
        Color accentedBackgroundFill = currStateScheme.getAccentedBackgroundFillColor();
        Color focusRing = currStateScheme.getFocusRingColor();
        Color line = currStateScheme.getLineColor();
        Color selectionForeground = currStateScheme.getSelectionForegroundColor();
        Color selectionBackground = currStateScheme.getSelectionBackgroundColor();
        Color textBackgroundFill = currStateScheme.getTextBackgroundFillColor();
        Color separatorPrimary = currStateScheme.getSeparatorPrimaryColor();
        Color separatorSecondary = currStateScheme.getSeparatorSecondaryColor();
        Color mark = currStateScheme.getMarkColor();
        Color echo = currStateScheme.getEchoColor();
        nameBuilder.append(currStateScheme.getDisplayName());

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
                // Get the color scheme that matches the contribution state
                RadianceColorScheme contributionScheme = RadianceColorSchemeUtilities
                        .getColorScheme(tabbedPane, tabIndex, associationKind, activeEntry.getKey());

                // And interpolate the colors
                ultraLight = RadianceColorUtilities.getInterpolatedColor(ultraLight,
                        contributionScheme.getUltraLightColor(), 1.0f - amount);
                extraLight = RadianceColorUtilities.getInterpolatedColor(extraLight,
                        contributionScheme.getExtraLightColor(), 1.0f - amount);
                light = RadianceColorUtilities.getInterpolatedColor(light,
                        contributionScheme.getLightColor(), 1.0f - amount);
                mid = RadianceColorUtilities.getInterpolatedColor(mid,
                        contributionScheme.getMidColor(), 1.0f - amount);
                dark = RadianceColorUtilities.getInterpolatedColor(dark,
                        contributionScheme.getDarkColor(), 1.0f - amount);
                ultraDark = RadianceColorUtilities.getInterpolatedColor(ultraDark,
                        contributionScheme.getUltraDarkColor(), 1.0f - amount);
                foreground = RadianceColorUtilities.getInterpolatedColor(foreground,
                        contributionScheme.getForegroundColor(), 1.0f - amount);
                backgroundFill = RadianceColorUtilities.getInterpolatedColor(backgroundFill,
                        contributionScheme.getBackgroundFillColor(), 1.0f - amount);
                accentedBackgroundFill = RadianceColorUtilities.getInterpolatedColor(accentedBackgroundFill,
                        contributionScheme.getAccentedBackgroundFillColor(), 1.0f - amount);
                focusRing = RadianceColorUtilities.getInterpolatedColor(focusRing,
                        contributionScheme.getFocusRingColor(), 1.0f - amount);
                line = RadianceColorUtilities.getInterpolatedColor(line,
                        contributionScheme.getLineColor(), 1.0f - amount);
                selectionForeground = RadianceColorUtilities.getInterpolatedColor(selectionForeground,
                        contributionScheme.getSelectionForegroundColor(), 1.0f - amount);
                selectionBackground = RadianceColorUtilities.getInterpolatedColor(selectionBackground,
                        contributionScheme.getSelectionBackgroundColor(), 1.0f - amount);
                textBackgroundFill = RadianceColorUtilities.getInterpolatedColor(textBackgroundFill,
                        contributionScheme.getTextBackgroundFillColor(), 1.0f - amount);
                separatorPrimary = RadianceColorUtilities.getInterpolatedColor(separatorPrimary,
                        contributionScheme.getSeparatorPrimaryColor(), 1.0f - amount);
                separatorSecondary = RadianceColorUtilities.getInterpolatedColor(separatorSecondary,
                        contributionScheme.getSeparatorSecondaryColor(), 1.0f - amount);
                mark = RadianceColorUtilities.getInterpolatedColor(mark,
                        contributionScheme.getMarkColor(), 1.0f - amount);
                echo = RadianceColorUtilities.getInterpolatedColor(echo,
                        contributionScheme.getEchoColor(), 1.0f - amount);

                nameBuilder.append(", [").append(contributionScheme.getDisplayName()).append(":")
                        .append(amount).append("]");
            }
        }

        // Update the mutable color scheme with the interpolated colors
        bladeColorScheme.ultraLight = ultraLight;
        bladeColorScheme.extraLight = extraLight;
        bladeColorScheme.light = light;
        bladeColorScheme.mid = mid;
        bladeColorScheme.dark = dark;
        bladeColorScheme.ultraDark = ultraDark;
        bladeColorScheme.foreground = foreground;
        bladeColorScheme.backgroundFill = backgroundFill;
        bladeColorScheme.accentedBackgroundFill = accentedBackgroundFill;
        bladeColorScheme.focusRing = focusRing;
        bladeColorScheme.line = line;
        bladeColorScheme.selectionForeground = selectionForeground;
        bladeColorScheme.selectionBackground = selectionBackground;
        bladeColorScheme.textBackgroundFill = textBackgroundFill;
        bladeColorScheme.separatorPrimary = separatorPrimary;
        bladeColorScheme.separatorSecondary = separatorSecondary;
        bladeColorScheme.mark = mark;
        bladeColorScheme.echo = echo;

        bladeColorScheme.displayName = nameBuilder.toString();
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
        ContainerColorTokens currColorTokens = RadianceColorSchemeUtilities.getContainerTokens(
            tabbedPane, tabIndex, associationKind, currState);
        Color containerSurfaceLowest = currColorTokens.getContainerSurfaceLowest();
        Color containerSurfaceLow = currColorTokens.getContainerSurfaceLow();
        Color containerSurface = currColorTokens.getContainerSurface();
        Color containerSurfaceHigh = currColorTokens.getContainerSurfaceHigh();
        Color containerSurfaceHighest = currColorTokens.getContainerSurfaceHighest();
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
        Color complementaryContainerOutline = currColorTokens.getComplementaryContainerOutline();

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
                // Get the color scheme that matches the contribution state
                ContainerColorTokens contributionColorTokens =
                    RadianceColorSchemeUtilities.getContainerTokens(
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
                complementaryContainerOutline = RadianceColorUtilities.getInterpolatedColor(complementaryContainerOutline,
                    contributionColorTokens.getComplementaryContainerOutline(), 1.0f - amount);

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
        bladeContainerTokens.complementaryContainerOutline = complementaryContainerOutline;

        bladeContainerTokens.combinedName = nameBuilder.toString();
        bladeContainerTokens.isDark = isDark;
    }
}
