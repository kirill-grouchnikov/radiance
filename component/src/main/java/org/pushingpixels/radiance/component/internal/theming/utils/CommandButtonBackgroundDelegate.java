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
package org.pushingpixels.radiance.component.internal.theming.utils;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.internal.theming.common.GlowingRadianceIcon;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.AnimationFacet;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAware;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.Set;

/**
 * Delegate class for painting command buttons in <b>Radiance</b> look and feel. This class
 * is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public class CommandButtonBackgroundDelegate {
    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();

    public void paintCommandButtonIcon(Graphics2D g, Rectangle iconRect,
            JCommandButton commandButton, Icon regular, GlowingRadianceIcon glowingIcon,
            ButtonModel model, StateTransitionTracker stateTransitionTracker, Color textColor) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(iconRect.x, iconRect.y);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        float alpha = stateTransitionTracker.getActiveStrength();
        if (alpha > 0 && glowingIcon != null && model.isEnabled()
                && AnimationConfigurationManager.getInstance()
                .isAnimationAllowed(AnimationFacet.ICON_GLOW, commandButton)
                && stateTransitionTracker.getIconGlowTracker().isPlaying()) {
            glowingIcon.paintIcon(commandButton, g2d, 0, 0);
            return;
        }

        if (regular.getClass().isAnnotationPresent(TransitionAware.class)) {
            regular.paintIcon(commandButton, g2d, 0, 0);
            return;
        }

        StateTransitionTracker.ModelStateInfo stateInfo = stateTransitionTracker.getModelStateInfo();
        ComponentState currentState = stateInfo.getCurrModelState();
        if (currentState.isDisabled()) {
            // No support yet for transitions between disabled and enabled / active
            // states
            Icon disabledIcon = RadianceCoreUtilities.getFilteredIcon(commandButton,
                    regular, currentState, textColor);
            disabledIcon.paintIcon(commandButton, g2d, 0, 0);
        } else {
            // Active states are painted on top of the icon that corresponds to the
            // enabled state
            Icon enabledIcon = RadianceCoreUtilities.getFilteredIcon(commandButton,
                    regular, ComponentState.ENABLED, textColor);
            enabledIcon.paintIcon(commandButton, g2d, 0, 0);
            if (stateTransitionTracker.getActiveStrength() > 0.0f) {
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> entry :
                        stateInfo.getStateContributionMap().entrySet()) {
                    if (entry.getKey() == ComponentState.ENABLED) {
                        continue;
                    }
                    float contribution = entry.getValue().getContribution();
                    if (contribution > 0.0f) {
                        Icon activeIcon = RadianceCoreUtilities.getFilteredIcon(commandButton,
                                regular, entry.getKey(), textColor);
                        if (activeIcon != enabledIcon) {
                            g2d.setComposite(WidgetUtilities.getAlphaComposite(
                                    commandButton, contribution, g));
                            activeIcon.paintIcon(commandButton, g2d, 0, 0);
                        }
                    }
                }
            }
        }

        g2d.dispose();
    }

    public void updateBackground(Graphics2D g, JCommandButton commandButton,
            StateTransitionTracker actionTransitionTracker, Rectangle actionArea,
            StateTransitionTracker popupTransitionTracker, Rectangle popupArea) {
        // Draw action area first
        boolean ignoreSelectedState = commandButton.getContentModel().isToggle()
                && (commandButton.getPresentationModel().getSelectedStateHighlight() ==
                CommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY);

        ComponentState currActionState = ignoreSelectedState
                ? actionTransitionTracker.getModelStateInfo().getCurrModelStateNoSelection()
                : actionTransitionTracker.getModelStateInfo().getCurrModelState();

        BladeUtils.populateColorScheme(mutableFillColorScheme,
                actionTransitionTracker.getModelStateInfo(),
                currActionState,
                BladeUtils.getDefaultColorSchemeDelegate(commandButton,
                        state -> ColorSchemeAssociationKind.FILL),
                ignoreSelectedState);
        BladeUtils.populateColorScheme(mutableBorderColorScheme,
                actionTransitionTracker.getModelStateInfo(),
                currActionState,
                BladeUtils.getDefaultColorSchemeDelegate(commandButton,
                        state -> ColorSchemeAssociationKind.BORDER),
                ignoreSelectedState);

        float actionAlpha;
        if (commandButton.getPresentationModel().getBackgroundAppearanceStrategy() == RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT) {
            if (currActionState == ComponentState.DISABLED_SELECTED) {
                // Respect the alpha in disabled+selected state
                actionAlpha = RadianceColorSchemeUtilities.getAlpha(commandButton, currActionState);
            } else {
                // For flat buttons, compute the combined contribution of all
                // non-disabled states - ignoring ComponentState.ENABLED
                actionAlpha = 0.0f;
                Map<ComponentState, StateTransitionTracker.StateContributionInfo> actionStates = ignoreSelectedState
                        ? actionTransitionTracker.getModelStateInfo().getStateNoSelectionContributionMap()
                        : actionTransitionTracker.getModelStateInfo().getStateContributionMap();
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                        actionStates.entrySet()) {
                    ComponentState activeState = activeEntry.getKey();
                    if (activeState.isDisabled()) {
                        continue;
                    }
                    if (activeState == ComponentState.ENABLED) {
                        continue;
                    }
                    actionAlpha += activeEntry.getValue().getContribution();
                }
                // For better visuals, when the mouse is over the popup area of a flat button,
                // display the action area in enabled state so that we "light up" the whole
                // button and not just the popup part.
                actionAlpha = Math.max(actionAlpha, popupTransitionTracker.getFacetStrength(
                        RadianceThemingSlices.ComponentStateFacet.ROLLOVER));
            }
        } else {
            if (currActionState.isDisabled()) {
                actionAlpha = RadianceColorSchemeUtilities.getAlpha(commandButton,
                        currActionState);
            } else {
                actionAlpha = 1.0f;
            }
        }

        drawArea(g, commandButton, actionAlpha, actionArea);

        // Draw popup area second
        ComponentState currPopupState = popupTransitionTracker.getModelStateInfo().getCurrModelState();

        BladeUtils.populateColorScheme(mutableFillColorScheme,
                popupTransitionTracker.getModelStateInfo(),
                currPopupState,
                BladeUtils.getDefaultColorSchemeDelegate(commandButton,
                        state -> ColorSchemeAssociationKind.FILL),
                false);
        BladeUtils.populateColorScheme(mutableBorderColorScheme,
                popupTransitionTracker.getModelStateInfo(),
                currPopupState,
                BladeUtils.getDefaultColorSchemeDelegate(commandButton,
                        state -> ColorSchemeAssociationKind.BORDER),
                false);

        float popupAlpha;
        if (commandButton.getPresentationModel().getBackgroundAppearanceStrategy() == RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT) {
            if (currPopupState == ComponentState.DISABLED_SELECTED) {
                // Respect the alpha in disabled+selected state
                popupAlpha = RadianceColorSchemeUtilities.getAlpha(commandButton, currPopupState);
            } else {
                // For flat buttons, compute the combined contribution of all
                // non-disabled states - ignoring ComponentState.ENABLED
                popupAlpha = 0.0f;
                Map<ComponentState, StateTransitionTracker.StateContributionInfo> popupStates =
                        popupTransitionTracker.getModelStateInfo().getStateContributionMap();
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                        popupStates.entrySet()) {
                    ComponentState activeState = activeEntry.getKey();
                    if (activeState.isDisabled()) {
                        continue;
                    }
                    if (activeState == ComponentState.ENABLED) {
                        continue;
                    }
                    popupAlpha += activeEntry.getValue().getContribution();
                }
                // For better visuals, when the mouse is over the action area of a flat button,
                // display the popup area in enabled state so that we "light up" the whole
                // button and not just the action part.
                popupAlpha = Math.max(popupAlpha, actionTransitionTracker.getFacetStrength(
                        RadianceThemingSlices.ComponentStateFacet.ROLLOVER));
            }
        } else {
            if (currPopupState.isDisabled()) {
                popupAlpha = RadianceColorSchemeUtilities.getAlpha(commandButton,
                        currPopupState);
            } else {
                popupAlpha = 1.0f;
            }
        }

        drawArea(g, commandButton, popupAlpha, popupArea);
    }

    private void drawArea(Graphics2D g, JCommandButton commandButton, float alpha,
            Rectangle clipArea) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setComposite(
                WidgetUtilities.getAlphaComposite(commandButton, alpha, g));
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        // Clip to the specified area
        graphics.clip(clipArea);

        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0,
                commandButton.getWidth(), commandButton.getHeight(),
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(commandButton);
                    RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(commandButton);

                    RadianceThemingSlices.Sides sides = commandButton.getPresentationModel().getSides();
                    Set<RadianceThemingSlices.Side> openSides = (sides != null) ? sides.getOpenSides() : null;
                    Set<RadianceThemingSlices.Side> straightSides = (sides != null) ? sides.getStraightSides() : null;

                    ComponentOrientation orientation = commandButton.getComponentOrientation();
                    RadianceThemingSlices.Side leftSide =
                            orientation.isLeftToRight()
                                    ? RadianceThemingSlices.Side.LEADING
                                    : RadianceThemingSlices.Side.TRAILING;
                    RadianceThemingSlices.Side rightSide =
                            orientation.isLeftToRight()
                                    ? RadianceThemingSlices.Side.TRAILING
                                    : RadianceThemingSlices.Side.LEADING;

                    int openDelta = (int) (3 * scaleFactor);
                    int deltaLeft = ((openSides != null) && openSides.contains(leftSide)) ? openDelta : 0;
                    int deltaRight = ((openSides != null) && openSides.contains(rightSide)) ? openDelta : 0;
                    int deltaTop = ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.TOP)) ? openDelta : 0;
                    int deltaBottom = ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.BOTTOM)) ? openDelta : 0;

                    int dx = -deltaLeft;
                    int dw = deltaLeft + deltaRight;
                    int dy = -deltaTop;
                    int dh = deltaTop + deltaBottom;

                    float radius = (commandButton.getPresentationModel().getSelectedStateHighlight()
                            == CommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY) ? 0 :
                            (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(
                                    RadianceSizeUtils.getComponentFontSize(commandButton));

                    graphics1X.translate(dx, dy);
                    // Compute a separate contour for the fill.
                    // Otherwise pixels on the edge can "spill" outside
                    // the contour. Those pixels will be drawn by the border painter.
                    Shape contourFill = RadianceOutlineUtilities.getBaseOutline(
                            commandButton.getComponentOrientation(),
                            scaledWidth + dw, scaledHeight + dh,
                            radius, straightSides, 0.5f);
                    fillPainter.paintContourBackground(graphics1X, commandButton,
                            scaledWidth + dw,
                            scaledHeight + dh,
                            contourFill,
                            mutableFillColorScheme);

                    // Border
                    Shape contourOuter = RadianceOutlineUtilities.getBaseOutline(
                            commandButton.getComponentOrientation(),
                            scaledWidth + dw - 1, scaledHeight + dh - 1, radius,
                            straightSides, 0.0f);
                    Shape contourInner = borderPainter.isPaintingInnerContour() ?
                            RadianceOutlineUtilities.getBaseOutline(
                                    commandButton.getComponentOrientation(),
                                    scaledWidth + dw - 1, scaledHeight + dh - 1, radius,
                                    straightSides, 1.0f)
                            : null;
                    borderPainter.paintBorder(graphics1X, commandButton,
                            scaledWidth + dw,
                            scaledHeight + dh,
                            contourOuter, contourInner, mutableBorderColorScheme);

                    graphics1X.translate(-dx, -dy);
                });

        graphics.dispose();

    }
}
