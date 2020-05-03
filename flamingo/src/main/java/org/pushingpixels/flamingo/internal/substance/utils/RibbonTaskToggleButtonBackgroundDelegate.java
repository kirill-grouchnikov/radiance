/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.internal.substance.utils;

import org.pushingpixels.flamingo.api.ribbon.AbstractRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.RibbonContextualTaskGroup;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonTaskToggleButton;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.Side;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.decoration.SubstanceDecorationPainter;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/**
 * Delegate class for painting backgrounds of {@link JRibbonTaskToggleButton}s.
 *
 * @author Kirill Grouchnikov
 */
public class RibbonTaskToggleButtonBackgroundDelegate {
    /**
     * Cache for background images of ribbon buttons. Each time
     * {@link #getTaskToggleButtonBackground(JRibbonTaskToggleButton, int, int)} is called, it
     * checks <code>this</code> map to see if it already contains such background. If so, the
     * background from the map is returned.
     */
    private static LazyResettableHashMap<BufferedImage> imageCache = new
            LazyResettableHashMap<>("Flamingo.RibbonTaskToggleButtonBackgroundDelegate");

    /**
     * Retrieves background image for the specified ribbon button.
     *
     * @param button Button.
     * @param width  Button width.
     * @param height Button height.
     * @return Button background image.
     */
    private static synchronized BufferedImage getTaskToggleButtonBackground(
            JRibbonTaskToggleButton button, int width, int height) {
        JRibbon ribbon = (JRibbon) SwingUtilities.getAncestorOfClass(JRibbon.class, button);
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        ComponentState currState = ComponentState.getState(button.getActionModel(), button, true);
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                modelStateInfo.getStateNoSelectionContributionMap();

        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(button);
        SubstanceSlices.DecorationAreaType buttonDecorationAreaType =
                SubstanceCortex.ComponentOrParentChainScope.getDecorationType(button);
        SubstanceDecorationPainter decorationPainter = skin.getDecorationPainter();

        // To create visual continuity between the background of the selected task
        // and its toggle button, we use the decoration painter and not fill painter.
        // We also ignore the selected state of the toggle button to compute the
        // color scheme to use.
        // If we have one active state which is *not* enabled, this means that we have
        // fully transitioned / animated to a state like rollover or pressed (no selection
        // as mentioned before). For such a state, we use the matching FILL color scheme.
        // Otherwise, we use the background color scheme as the base fill for the visual
        // continuity, and let the other active states (if any) paint the additional
        // transition visuals.
        SubstanceColorScheme baseFillScheme =
                ((activeStates.size() == 1) && (currState != ComponentState.ENABLED)) ?
                        SubstanceColorSchemeUtilities.getColorScheme(button,
                                ColorSchemeAssociationKind.FILL, currState) :
                        skin.getBackgroundColorScheme(buttonDecorationAreaType);
        SubstanceColorScheme baseBorderScheme = skin.getColorScheme(ribbon,
                ColorSchemeAssociationKind.BORDER, currState);

        SubstanceBorderPainter borderPainter = skin.getBorderPainter();

        JRibbon parent = (JRibbon) SwingUtilities.getAncestorOfClass(JRibbon.class, button);
        RibbonTask selectedTask = parent.getSelectedTask();
        AbstractRibbonBand band = (selectedTask.getBandCount() == 0) ? null
                : selectedTask.getBand(0);
        Color bgColor = (band != null) ? band.getBackground() : parent.getBackground();

        HashMapKey baseKey = SubstanceCoreUtilities.getHashKey(width, height,
                baseFillScheme.getDisplayName(), baseBorderScheme.getDisplayName(),
                borderPainter.getDisplayName(), decorationPainter.getDisplayName(),
                button.getParent().getBackground().getRGB(), button.getActionModel(),
                button.getContextualGroupHueColor(), button.getActionModel(),
                ribbon.isMinimized(), bgColor);
        BufferedImage baseLayer = imageCache.get(baseKey);
        if (baseLayer == null) {
            baseLayer = getSingleLayer(button, width, height, baseFillScheme,
                    baseBorderScheme, borderPainter);

            imageCache.put(baseKey, baseLayer);
        }

       // System.out.println("\tbase layer at " + baseFillScheme.getDisplayName());

        if (currState.isDisabled() || (activeStates.size() == 1)) {
            return baseLayer;
        }

        BufferedImage result = SubstanceCoreUtilities.getBlankImage(width, height);
        Graphics2D g2d = result.createGraphics();

        NeonCortex.drawImage(g2d, baseLayer, 0, 0);

        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry
                : activeStates.entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState == ComponentState.ENABLED) {
                // See comment above on why we're skipping the contribution of the default
                // enabled no-selection state.
                continue;
            }

            float contribution = activeEntry.getValue().getContribution();
            if (contribution == 0.0f) {
                continue;
            }

            SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities.getColorScheme(button,
                    ColorSchemeAssociationKind.FILL, activeState);
            SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities.getColorScheme(ribbon,
                    ColorSchemeAssociationKind.BORDER, activeState);

            HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height,
                    fillScheme.getDisplayName(), borderScheme.getDisplayName(),
                    borderPainter.getDisplayName(), decorationPainter.getDisplayName(),
                    button.getParent().getBackground().getRGB(),
                    button.getActionModel(), button.getContextualGroupHueColor(),
                    button.getActionModel(), ribbon.isMinimized(),
                    bgColor);

            BufferedImage layer = imageCache.get(key);
            if (layer == null) {
                layer = getSingleLayer(button, width, height, fillScheme, borderScheme,
                        borderPainter);

                imageCache.put(key, layer);
            }

            g2d.setComposite(AlphaComposite.SrcOver.derive(contribution));
            NeonCortex.drawImage(g2d, layer, 0, 0);
        }

        g2d.dispose();
        return result;
    }

    public static float getTaskToggleButtonCornerRadius(JRibbonTaskToggleButton button) {
        return SubstanceSizeUtils.getAdjustedSize(
                SubstanceSizeUtils.getComponentFontSize(button), 3.0f, 6, 1.0f);
    }

    private static BufferedImage getSingleLayer(JRibbonTaskToggleButton button, int width,
            int height, SubstanceColorScheme fillScheme,
            SubstanceColorScheme borderScheme,
            SubstanceBorderPainter borderPainter) {
        Set<Side> bottom = EnumSet.of(Side.BOTTOM);

        Color contextualGroupHueColor = button.getContextualGroupHueColor();
        if (contextualGroupHueColor != null) {
            fillScheme = SubstanceColorSchemeUtilities.getShiftedScheme(fillScheme,
                    contextualGroupHueColor, RibbonContextualTaskGroup.HUE_ALPHA, null, 0.0f);
        }

        float radius = getTaskToggleButtonCornerRadius(button);
        float borderDelta = 2.0f * SubstanceSizeUtils.getBorderStrokeWidth();
        float borderInsets = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;
        Shape contour = SubstanceOutlineUtilities.getBaseOutline(width,
                height + 2 + borderDelta, radius, bottom, borderInsets);

        BufferedImage result = SubstanceCoreUtilities.getBlankImage(width, height + 2);
        Graphics2D graphics = result.createGraphics();

        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(button);
        SubstanceSlices.DecorationAreaType buttonDecorationAreaType =
                SubstanceCortex.ComponentOrParentChainScope.getDecorationType(button);
        if (skin.isRegisteredAsDecorationArea(buttonDecorationAreaType)) {
            DecorationPainterUtils.paintDecorationArea(graphics, button, contour,
                    buttonDecorationAreaType, fillScheme, false);
        } else {
            graphics.setColor(fillScheme.getBackgroundFillColor());
            graphics.fill(contour);
        }

        float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
        Shape contourInner = SubstanceOutlineUtilities.getBaseOutline(width,
                height + 2 + borderDelta, radius, bottom, borderThickness + borderInsets);

        borderPainter.paintBorder(graphics, button, width, height + 2, contour, contourInner,
                borderScheme);
        graphics.dispose();

        return result;
    }

    /**
     * Updates background of the specified button.
     *
     * @param g      Graphic context.
     * @param button Button to update.
     */
    public void updateTaskToggleButtonBackground(Graphics g, JRibbonTaskToggleButton button) {
        Graphics2D g2d = (Graphics2D) g.create();

        int width = button.getWidth();
        int height = button.getHeight();

        BufferedImage ribbonBackground = getTaskToggleButtonBackground(button, width, height);

        TransitionAwareUI ui = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = ui.getTransitionTracker();

        float extraActionAlpha = 0.0f;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry
                : stateTransitionTracker.getModelStateInfo().getStateContributionMap().entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState.isDisabled()) {
                continue;
            }
            if (activeState == ComponentState.ENABLED) {
                continue;
            }
            extraActionAlpha += activeEntry.getValue().getContribution();
        }

        g2d.setComposite(WidgetUtilities.getAlphaComposite(button, extraActionAlpha, g));
        NeonCortex.drawImage(g2d, ribbonBackground, 0, 0);

        g2d.dispose();
    }
}
