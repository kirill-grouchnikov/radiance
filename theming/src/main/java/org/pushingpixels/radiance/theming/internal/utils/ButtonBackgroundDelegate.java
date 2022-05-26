/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;
import org.pushingpixels.radiance.common.internal.contrib.flatlaf.HiDPIUtils;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.animation.ModificationAwareUI;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.Set;

/**
 * Delegate class for painting backgrounds of buttons in <b>Radiance</b> look and feel. This class
 * is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public class ButtonBackgroundDelegate {
    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();

    /**
     * Draws the background for the specified button at full alpha.
     */
    private void drawFullAlphaBackground(
            Graphics2D graphics, AbstractButton button,
            RadianceButtonShaper shaper, RadianceFillPainter fillPainter,
            RadianceBorderPainter borderPainter, int width, int height) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker.ModelStateInfo modelStateInfo = transitionAwareUI
                .getTransitionTracker().getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();

        Set<RadianceThemingSlices.Side> openSides = RadianceCoreUtilities.getSides(button,
                RadianceSynapse.BUTTON_OPEN_SIDE);
        boolean isContentAreaFilled = button.isContentAreaFilled();
        boolean isBorderPainted = button.isBorderPainted();

        // Do we need to use attention-drawing animation?
        if (button.getUI() instanceof ModificationAwareUI) {
            ModificationAwareUI modificationAwareUI = (ModificationAwareUI) button.getUI();
            Timeline modificationTimeline = modificationAwareUI.getModificationTimeline();
            if (modificationTimeline != null) {
                if (modificationTimeline.getState() != TimelineState.IDLE) {
                    BladeUtils.populateModificationAwareColorScheme(mutableFillColorScheme,
                            modificationTimeline.getTimelinePosition());
                    RadianceColorScheme baseBorderScheme = RadianceColorSchemeUtilities.getColorScheme(button,
                            RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, currState);

                    drawBackgroundImage(graphics, button, shaper, fillPainter, borderPainter, width,
                            height, mutableFillColorScheme, baseBorderScheme, openSides, isContentAreaFilled,
                            isBorderPainted);
                    return;
                }
            }
        }

        // Populate fill and border color schemes based on the current transition state of the button.
        // Important - don't do it on pulsating buttons (such as close button of modified frames).
        BladeUtils.populateColorScheme(mutableFillColorScheme, button,
                modelStateInfo, currState,
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(button),
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                false);
        BladeUtils.populateColorScheme(mutableBorderColorScheme, button,
                modelStateInfo, currState,
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(button),
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                false);

        drawBackgroundImage(graphics, button, shaper, fillPainter, borderPainter, width,
                height, mutableFillColorScheme, mutableBorderColorScheme, openSides, isContentAreaFilled,
                isBorderPainted);

    }

    private void drawBackgroundImage(Graphics2D g, AbstractButton button,
            RadianceButtonShaper shaper, RadianceFillPainter fillPainter,
            RadianceBorderPainter borderPainter, int width, int height,
            RadianceColorScheme colorScheme, RadianceColorScheme borderScheme,
            Set<RadianceThemingSlices.Side> openSides, boolean isContentAreaFilled, boolean isBorderPainted) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    int openDelta = (int) (3 * scaleFactor);
                    int deltaLeft = ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.LEFT)) ? openDelta : 0;
                    int deltaRight = ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.RIGHT)) ? openDelta : 0;
                    int deltaTop = ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.TOP)) ? openDelta : 0;
                    int deltaBottom = ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.BOTTOM)) ? openDelta : 0;

                    Shape contour = shaper.getBladeButtonOutline(button, 0.0f,
                            scaledWidth + deltaLeft + deltaRight,
                            scaledHeight + deltaTop + deltaBottom,
                            scaleFactor, false);

                    graphics1X.translate(-deltaLeft, -deltaTop);
                    if (isContentAreaFilled) {
                        // Clip by contour so the anti-aliased pixels don't "spill" outside
                        // the contour. Those pixels will be drawn by the border painter.
                        Graphics2D clipped = (Graphics2D) graphics1X.create();
                        if (isBorderPainted) {
                            clipped.clip(contour);
                        }
                        fillPainter.paintContourBackground(clipped, button,
                                scaledWidth + deltaLeft + deltaRight,
                                scaledHeight + deltaTop + deltaBottom,
                                contour, false,
                                colorScheme, true);
                        clipped.dispose();
                    }
                    graphics1X.translate(deltaLeft, deltaTop);

                    if (isBorderPainted) {
                        Shape contourInner = borderPainter.isPaintingInnerContour() ?
                                shaper.getBladeButtonOutline(button, 1.0f,
                                        scaledWidth + deltaLeft + deltaRight,
                                        scaledHeight + deltaTop + deltaBottom,
                                        scaleFactor, true)
                                : null;
                        borderPainter.paintBorder(graphics1X, button, scaledWidth + deltaLeft + deltaRight,
                                scaledHeight + deltaTop + deltaBottom, contour, contourInner, borderScheme);
                    }
                });

        graphics.dispose();
    }

    /**
     * Updates background of the specified button.
     *
     * @param g      Graphic context.
     * @param button Button to update.
     */
    public void updateBackground(Graphics g, AbstractButton button) {
        // failsafe for LAF change
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }

        if (RadianceCoreUtilities.isButtonNeverPainted(button)) {
            return;
        }

        int width = button.getWidth();
        int height = button.getHeight();
        if (RadianceCoreUtilities.isScrollButton(button)
                || RadianceCoreUtilities.isSpinnerButton(button)) {
            PairwiseButtonBackgroundDelegate.updatePairwiseBackground(g, button, width, height,
                    false);
            return;
        }

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        // Two special cases here:
        // 1. Button has flat appearance.
        // 2. Button is disabled.
        // For both cases, we need to set custom translucency.
        boolean isFlat = RadianceCoreUtilities.hasFlatAppearance(button);
        boolean isSpecial = isFlat || !button.isEnabled();
        float extraAlpha = 1.0f;
        if (isSpecial) {
            if (isFlat) {
                // Special handling of flat buttons
                extraAlpha = 0.0f;
                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : activeStates
                        .entrySet()) {
                    ComponentState activeState = activeEntry.getKey();
                    if (activeState.isDisabled())
                        continue;
                    if (activeState == ComponentState.ENABLED)
                        continue;
                    extraAlpha += activeEntry.getValue().getContribution();
                }
            } else {
                if (!button.isEnabled()) {
                    extraAlpha = RadianceColorSchemeUtilities.getAlpha(button,
                            modelStateInfo.getCurrModelState());
                }
            }
        }
        if (extraAlpha > 0.0f) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setComposite(WidgetUtilities.getAlphaComposite(button, extraAlpha, g));
            graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

            RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(button);
            RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(button);
            RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(button);

            drawFullAlphaBackground(graphics, button, shaper,
                    fillPainter, borderPainter, width, height);

            graphics.dispose();
        }
    }

    /**
     * Returns <code>true</code> if the specified <i>x,y </i> location is contained within the look
     * and feel's defined shape of the specified component. <code>x</code> and <code>y</code> are
     * defined to be relative to the coordinate system of the specified component.
     *
     * @param button the component where the <i>x,y </i> location is being queried;
     * @param x      the <i>x </i> coordinate of the point
     * @param y      the <i>y </i> coordinate of the point
     * @return <code>true</code> if the specified <i>x,y </i> location is contained within the look
     * and feel's defined shape of the specified component, <code>false</code> otherwise.
     */
    public static boolean contains(AbstractButton button, int x, int y) {
        // failsafe for LAF change
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return false;
        }
        RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(button);
        if (shaper == null) {
            return false;
        }
        Shape contour = shaper.getButtonOutline(button, 0.0f, button.getWidth(), button.getHeight(),
                false);
        return contour.contains(x, y);
    }
}
