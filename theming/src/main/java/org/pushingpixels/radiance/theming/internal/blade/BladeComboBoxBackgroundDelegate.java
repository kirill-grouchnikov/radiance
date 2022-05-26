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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.internal.contrib.flatlaf.HiDPIUtils;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Delegate class for painting backgrounds of buttons in <b>Radiance</b> look and feel. This class
 * is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public class BladeComboBoxBackgroundDelegate {
    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();

    public void drawFullAlphaBackground(
            Graphics2D graphics, JComboBox combo,
            RadianceFillPainter fillPainter, RadianceBorderPainter borderPainter, int width,
            int height) {
        double scale = RadianceCommonCortex.getScaleFactor(combo);

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) combo.getUI();
        StateTransitionTracker.ModelStateInfo modelStateInfo = transitionAwareUI
                .getTransitionTracker().getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelState();

        int comboFontSize = RadianceSizeUtils.getComponentFontSize(combo);
        float radius = RadianceSizeUtils.getClassicButtonCornerRadius(comboFontSize);

        // Populate fill and border color schemes based on the current transition state of the button.
        // Important - don't do it on pulsating buttons (such as close button of modified frames).
        BladeUtils.populateColorScheme(mutableFillColorScheme, combo,
                modelStateInfo, currState,
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(combo),
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                false);
        BladeUtils.populateColorScheme(mutableBorderColorScheme, combo,
                modelStateInfo, currState,
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(combo),
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                false);

        drawBackgroundImage(graphics, combo, fillPainter, borderPainter, width,
                height, mutableFillColorScheme, mutableBorderColorScheme, radius);
    }

    private void drawBackgroundImage(Graphics2D g, JComboBox combo,
            RadianceFillPainter fillPainter,
            RadianceBorderPainter borderPainter, int width, int height,
            RadianceColorScheme fillScheme, RadianceColorScheme borderScheme, float radius) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(
                            scaledWidth - 1, scaledHeight - 1, radius, null, 0);
                    // Clip by contour so the anti-aliased pixels don't "spill" outside
                    // the contour. Those pixels will be drawn by the border painter.
                    Graphics2D clipped = (Graphics2D) graphics1X.create();
                    clipped.clip(contour);
                    fillPainter.paintContourBackground(graphics1X, combo, scaledWidth, scaledHeight,
                            contour, false, fillScheme, true);
                    clipped.dispose();

                    Shape contourInner = borderPainter.isPaintingInnerContour() ?
                            RadianceOutlineUtilities.getBaseOutline(
                                    scaledWidth - 1, scaledHeight - 1, radius - 1, null, 1)
                            : null;
                    borderPainter.paintBorder(graphics1X, combo, scaledWidth, scaledHeight,
                            contour, contourInner, borderScheme);
                });
    }

    public void updateBackground(Graphics g, JComboBox combo) {
        // failsafe for LAF change
        if (!RadianceCoreUtilities.isCurrentLookAndFeel())
            return;

        int width = combo.getWidth();
        int height = combo.getHeight();

        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) combo.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                .getStateContributionMap();

        // Two special cases here:
        // 1. Combobox has flat appearance.
        // 2. Combobox is disabled.
        // For both cases, we need to set custom translucency.
        boolean isFlat = RadianceCoreUtilities.hasFlatAppearance(combo, false);
        boolean isSpecial = isFlat || !combo.isEnabled();
        float extraAlpha = 1.0f;
        if (isSpecial) {
            if (isFlat) {
                // Special handling of flat combos
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
                if (!combo.isEnabled()) {
                    extraAlpha = RadianceColorSchemeUtilities.getAlpha(combo,
                            modelStateInfo.getCurrModelState());
                }
            }
        }
        if (extraAlpha > 0.0f) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setComposite(WidgetUtilities.getAlphaComposite(combo, extraAlpha, g));
            graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

            RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(combo);
            RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(combo);

            drawFullAlphaBackground(graphics, combo,
                    fillPainter, borderPainter, width, height);

            graphics.dispose();
        }
    }
}
