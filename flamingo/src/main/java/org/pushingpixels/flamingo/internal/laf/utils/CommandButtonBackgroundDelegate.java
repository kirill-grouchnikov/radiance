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
package org.pushingpixels.flamingo.internal.laf.utils;

import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonLocationOrderKind;
import org.pushingpixels.flamingo.api.common.JCommandButtonStrip;
import org.pushingpixels.flamingo.api.common.model.CommandStripPresentationModel;
import org.pushingpixels.flamingo.api.common.model.PopupButtonModel;
import org.pushingpixels.flamingo.internal.laf.common.GlowingRadianceIcon;
import org.pushingpixels.flamingo.internal.laf.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices.AnimationFacet;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.laf.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.laf.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.laf.internal.RadianceSynapse;
import org.pushingpixels.radiance.laf.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.laf.internal.utils.*;
import org.pushingpixels.radiance.laf.internal.utils.icon.TransitionAware;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.Set;

/**
 * Delegate class for painting backgrounds of buttons in <b>Radiance</b> look and feel. This class
 * is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public class CommandButtonBackgroundDelegate {
    /**
     * Cache for background images.
     */
    private static LazyResettableHashMap<BufferedImage> imageCache = new LazyResettableHashMap<>(
            "CommandButtonBackgroundDelegate");

    /**
     * Retrieves the background for the specified button.
     *
     * @param commandButton          Button.
     * @param buttonModel            Button model.
     * @param fillPainter            Button fill painter.
     * @param borderPainter          Button border painter.
     * @param width                  Button width.
     * @param height                 Button height.
     * @param stateTransitionTracker State transition tracker.
     * @param ignoreSelections       If true, selection state will be ignored.
     * @return Button background.
     */
    @SuppressWarnings("incomplete-switch")
    public static BufferedImage getFullAlphaBackground(JCommandButton commandButton,
            ButtonModel buttonModel, RadianceFillPainter fillPainter,
            RadianceBorderPainter borderPainter, int width, int height,
            StateTransitionTracker stateTransitionTracker, boolean ignoreSelections) {
        double scale = RadianceCommonCortex.getScaleFactor(commandButton);
        StateTransitionTracker.ModelStateInfo modelStateInfo = (stateTransitionTracker == null)
                ? null : stateTransitionTracker.getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                (modelStateInfo == null)
                        ? null
                        : (ignoreSelections ? modelStateInfo.getStateNoSelectionContributionMap()
                        : modelStateInfo.getStateContributionMap());
        ComponentState currState = (modelStateInfo == null)
                ? ComponentState.getState(buttonModel, commandButton)
                : (ignoreSelections ? modelStateInfo.getCurrModelStateNoSelection()
                : modelStateInfo.getCurrModelState());

        RadianceColorScheme baseFillScheme = RadianceColorSchemeUtilities
                .getColorScheme(commandButton, currState);
        RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities
                .getColorScheme(commandButton, ColorSchemeAssociationKind.BORDER, currState);

        float radius = commandButton.getProjection().getPresentationModel().isMenu() ? 0 :
                RadianceSizeUtils.getClassicButtonCornerRadius(
                        RadianceSizeUtils.getComponentFontSize(commandButton));

        Set<RadianceLafSlices.Side> straightSides = RadianceCoreUtilities.getSides(commandButton,
                RadianceSynapse.BUTTON_STRAIGHT_SIDE);

        // special handling for location order
        JCommandButton.CommandButtonLocationOrderKind locationOrderKind = commandButton
                .getLocationOrderKind();
        int dx = 0;
        int dy = 0;
        int dw = 0;
        int dh = 0;
        boolean isVertical = false;
        if ((locationOrderKind != null)
                && (locationOrderKind != JCommandButton.CommandButtonLocationOrderKind.ONLY)) {
            Component parent = commandButton.getParent();
            if ((parent instanceof JCommandButtonStrip) &&
                    (((JCommandButtonStrip) parent).getProjection().getPresentationModel().getOrientation() ==
                            CommandStripPresentationModel.StripOrientation.VERTICAL)) {
                isVertical = true;
                switch (locationOrderKind) {
                    case FIRST:
                        dh = commandButton.getHeight() / 2;
                        break;
                    case MIDDLE:
                        dy = -commandButton.getHeight() / 2;
                        dh = commandButton.getHeight();
                        break;
                    case LAST:
                        dy = -commandButton.getHeight() / 2;
                        dh = commandButton.getHeight() / 2;
                }
            } else {
                boolean ltr = commandButton.getComponentOrientation().isLeftToRight();
                if (locationOrderKind == JCommandButton.CommandButtonLocationOrderKind.MIDDLE) {
                    dx = -commandButton.getWidth() / 2;
                    dw = commandButton.getWidth();
                } else {
                    boolean curveOnLeft = (ltr
                            && (locationOrderKind == JCommandButton.CommandButtonLocationOrderKind.FIRST))
                            || (!ltr && (locationOrderKind == JCommandButton.CommandButtonLocationOrderKind.LAST));
                    if (curveOnLeft) {
                        dw = commandButton.getWidth() / 2;
                    } else {
                        dx = -commandButton.getWidth() / 2;
                        dw = commandButton.getWidth() / 2;
                    }
                }
            }
        }

        ImageHashMapKey baseKey = RadianceCoreUtilities.getScaleAwareHashKey(
                scale, currState, width, height,
                baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                commandButton.getClass().getName(), radius, straightSides,
                RadianceSizeUtils.getComponentFontSize(commandButton), locationOrderKind, dx, dy,
                dw, dh, isVertical);

        BufferedImage baseLayer = imageCache.get(baseKey);
        if (baseLayer == null) {
            baseLayer = getSingleLayer(commandButton, fillPainter, borderPainter, width, height,
                    baseFillScheme, baseBorderScheme, radius, straightSides, locationOrderKind, dx,
                    dy, dw, dh, isVertical);

            imageCache.put(baseKey, baseLayer);
        }

        if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
            return baseLayer;
        }

        BufferedImage result = RadianceCoreUtilities.getBlankImage(scale, width, height);
        Graphics2D g2d = result.createGraphics();

        RadianceCommonCortex.drawImageWithScale(g2d, scale, baseLayer, 0, 0);

        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState == currState) {
                continue;
            }

            float contribution = activeEntry.getValue().getContribution();
            if (contribution == 0.0f) {
                continue;
            }

            RadianceColorScheme fillScheme = RadianceColorSchemeUtilities
                    .getColorScheme(commandButton, activeState);
            RadianceColorScheme borderScheme = RadianceColorSchemeUtilities
                    .getColorScheme(commandButton, ColorSchemeAssociationKind.BORDER, activeState);

            ImageHashMapKey key = RadianceCoreUtilities.getScaleAwareHashKey(
                    scale, activeState, width, height,
                    fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                    fillPainter.getDisplayName(), borderPainter.getDisplayName(),
                    commandButton.getClass().getName(), radius, straightSides,
                    RadianceSizeUtils.getComponentFontSize(commandButton), locationOrderKind, dx,
                    dy, dw, dh, isVertical);

            BufferedImage layer = imageCache.get(key);
            if (layer == null) {
                layer = getSingleLayer(commandButton, fillPainter, borderPainter, width, height,
                        fillScheme, borderScheme, radius, straightSides, locationOrderKind, dx, dy,
                        dw, dh, isVertical);

                imageCache.put(key, layer);
            }

            g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
            RadianceCommonCortex.drawImageWithScale(g2d, scale, layer, 0, 0);
        }

        g2d.dispose();
        return result;
    }

    private static BufferedImage getSingleLayer(JCommandButton commandButton,
            RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter, int width,
            int height, RadianceColorScheme fillScheme, RadianceColorScheme borderScheme,
            float radius, Set<RadianceLafSlices.Side> straightSides,
            JCommandButton.CommandButtonLocationOrderKind locationOrderKind, int dx, int dy,
            int dw, int dh, boolean isVertical) {
        double scale = RadianceCommonCortex.getScaleFactor(commandButton);
        float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(commandButton) / 2.0f;

        Shape contour = RadianceOutlineUtilities.getBaseOutline(width + dw, height + dh, radius,
                straightSides, borderDelta);
        BufferedImage newBackground = RadianceCoreUtilities.getBlankImage(scale, width, height);
        Graphics2D finalGraphics = (Graphics2D) newBackground.getGraphics();
        finalGraphics.translate(dx, dy);
        fillPainter.paintContourBackground(finalGraphics, commandButton, width + dw, height + dh,
                contour, false, fillScheme, true);

        float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(commandButton);
        Shape contourInner = RadianceOutlineUtilities.getBaseOutline(width + dw, height + dh,
                radius, straightSides, borderDelta + borderThickness);
        borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh, contour,
                contourInner, borderScheme);

        if (isVertical) {
            if ((locationOrderKind == CommandButtonLocationOrderKind.FIRST)
                    || (locationOrderKind == CommandButtonLocationOrderKind.MIDDLE)) {
                // outer/inner line at the bottom
                float y = -dy + commandButton.getHeight() - borderDelta - borderThickness;
                float xs = borderDelta;
                float xe = commandButton.getWidth() - borderDelta;
                Shape upper = new Line2D.Double(xs + borderThickness, y, xe - borderThickness, y);
                y += borderThickness;
                Shape lower = new Line2D.Double(xs, y, xe, y);
                borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh,
                        lower, upper, borderScheme);
            }

            // special case for MIDDLE and LAST location order kinds
            if ((locationOrderKind == CommandButtonLocationOrderKind.MIDDLE)
                    || (locationOrderKind == JCommandButton.CommandButtonLocationOrderKind.LAST)) {
                // inner line at the top
                float y = -dy + borderDelta;
                float xs = borderDelta;
                float xe = commandButton.getWidth() - borderDelta;
                Shape upper = new Line2D.Double(xs + borderThickness, y, xe - borderThickness, y);
                borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh,
                        null, upper, borderScheme);
            }
        } else {
            // special case for leftmost (not FIRST!!!) and MIDDLE location
            // order kinds
            boolean ltr = commandButton.getComponentOrientation().isLeftToRight();
            boolean leftmost = (ltr
                    && (locationOrderKind == JCommandButton.CommandButtonLocationOrderKind.FIRST))
                    || (!ltr && (locationOrderKind == JCommandButton.CommandButtonLocationOrderKind.LAST));
            if (leftmost || (locationOrderKind == CommandButtonLocationOrderKind.MIDDLE)) {
                // outer / inner line at the right
                float x = -dx + commandButton.getWidth() - borderDelta - borderThickness;
                float ys = borderDelta;
                float ye = commandButton.getHeight() - borderDelta;
                Shape upper = new Line2D.Double(x, ys + borderThickness, x, ye - borderThickness);
                x += borderThickness;
                Shape lower = new Line2D.Double(x, ys, x, ye);
                borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh,
                        lower, upper, borderScheme);
            }

            // special case for MIDDLE and LAST location order kinds
            boolean rightmost = (ltr
                    && (locationOrderKind == JCommandButton.CommandButtonLocationOrderKind.LAST))
                    || (!ltr && (locationOrderKind == JCommandButton.CommandButtonLocationOrderKind.FIRST));
            if ((locationOrderKind == CommandButtonLocationOrderKind.MIDDLE) || rightmost) {
                // inner line at the left
                float x = -dx + borderDelta;
                float ys = borderDelta;
                float ye = commandButton.getHeight() - borderDelta;
                Shape upper = new Line2D.Double(x, ys + borderThickness, x, ye - borderThickness);
                borderPainter.paintBorder(finalGraphics, commandButton, width + dw, height + dh,
                        null, upper, borderScheme);
            }
        }
        return newBackground;
    }

    public static BufferedImage getCombinedCommandButtonBackground(
            JCommandButton commandButton, ButtonModel actionModel, Rectangle actionArea,
            PopupButtonModel popupModel, Rectangle popupArea) {
        double scale = RadianceCommonCortex.getScaleFactor(commandButton);
        ButtonModel backgroundModel = new DefaultButtonModel();
        backgroundModel.setEnabled(actionModel.isEnabled() && popupModel.isEnabled());

        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(commandButton);
        RadianceBorderPainter borderPainter = RadianceCoreUtilities
                .getBorderPainter(commandButton);

        // layer number one - background with the combined enabled
        // state of both models. Full opacity
        // System.out.println("Background layer");
        boolean ignoreSelections = commandButton.getProjection().getContentModel().isToggle()
                && commandButton.getProjection().getPresentationModel().isMenu();
        BufferedImage fullAlphaBackground = CommandButtonBackgroundDelegate.getFullAlphaBackground(
                commandButton, backgroundModel, fillPainter, borderPainter,
                commandButton.getWidth(), commandButton.getHeight(), null, ignoreSelections);

        BufferedImage layers = RadianceCoreUtilities.getBlankImage(scale,
                fullAlphaBackground.getWidth(), fullAlphaBackground.getHeight());
        Graphics2D combinedGraphics = layers.createGraphics();
        RadianceCommonCortex.drawImageWithScale(combinedGraphics, scale, fullAlphaBackground, 0, 0);

        ActionPopupTransitionAwareUI ui = (ActionPopupTransitionAwareUI) commandButton.getUI();

        if (actionModel.isEnabled() && popupModel.isEnabled()) {
            // layer number two - background with the combined rollover state
            // of both models. Opacity 60%.
            backgroundModel.setRollover(actionModel.isRollover() || popupModel.isRollover()
                    || popupModel.isPopupShowing());
            // System.out.println(actionModel.isRollover() + ":"
            // + popupModel.isRollover());
            combinedGraphics.setComposite(AlphaComposite.SrcOver.derive(0.6f));
            // System.out.println("Rollover layer");
            BufferedImage rolloverBackground = CommandButtonBackgroundDelegate
                    .getFullAlphaBackground(commandButton, backgroundModel, fillPainter,
                            borderPainter, commandButton.getWidth(), commandButton.getHeight(),
                            ui.getTransitionTracker(), ignoreSelections);
            RadianceCommonCortex.drawImageWithScale(combinedGraphics, scale, rolloverBackground, 0, 0);
        }

        if ((actionArea != null) && !actionArea.isEmpty()) {
            // layer number three - action area with its model. Opacity:
            // * 40% for enabled popup area of non-selected action
            // * 100% for enabled popup area of selected action
            // * 100% for disabled popup area
            Graphics2D graphicsAction = (Graphics2D) combinedGraphics.create();
            graphicsAction.clip(actionArea);
            float actionAlpha = actionModel.isSelected() ? 1.0f : 0.4f;
            if ((popupModel != null) && !popupModel.isEnabled())
                actionAlpha = 1.0f;
            if (!actionModel.isEnabled())
                actionAlpha = 0.0f;
            graphicsAction.setComposite(AlphaComposite.SrcOver.derive(actionAlpha));
            BufferedImage actionAreaBackground = CommandButtonBackgroundDelegate
                    .getFullAlphaBackground(commandButton, null, fillPainter, borderPainter,
                            commandButton.getWidth(), commandButton.getHeight(),
                            ui.getActionTransitionTracker(), ignoreSelections);
            RadianceCommonCortex.drawImageWithScale(graphicsAction, scale, actionAreaBackground, 0, 0);
            // graphicsAction.setColor(Color.red);
            // graphicsAction.fill(toFill);
            graphicsAction.dispose();
        }
        // combinedGraphics.setClip(currClip);
        if ((popupArea != null) && !popupArea.isEmpty()) {
            // layer number four - popup area with its model. Opacity 40%
            // for enabled action area, 100% for disabled action area
            Graphics2D graphicsPopup = (Graphics2D) combinedGraphics.create();
            // System.out.println(popupArea);
            graphicsPopup.clip(popupArea);
            // System.out.println(graphicsPopup.getClipBounds());
            float popupAlpha = 0.4f;
            if (!actionModel.isEnabled())
                popupAlpha = 1.0f;
            if ((popupModel != null) && !popupModel.isEnabled())
                popupAlpha = 0.0f;
            graphicsPopup.setComposite(AlphaComposite.SrcOver.derive(popupAlpha));
            // System.out.println(popupAlpha + ":"
            // + ComponentState.getState(popupModel, this.commandButton));
            BufferedImage popupAreaBackground = CommandButtonBackgroundDelegate
                    .getFullAlphaBackground(commandButton, null, fillPainter, borderPainter,
                            commandButton.getWidth(), commandButton.getHeight(),
                            ui.getPopupTransitionTracker(), ignoreSelections);
            RadianceCommonCortex.drawImageWithScale(graphicsPopup, scale, popupAreaBackground, 0, 0);
            // graphicsPopup.setColor(Color.blue);
            // graphicsPopup.fill(toFill);
            graphicsPopup.dispose();
        }
        combinedGraphics.dispose();
        // System.out.println(imageCache.size());
        return layers;
    }

    public static void paintCommandButtonIcon(Graphics2D g, Rectangle iconRect,
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
}
