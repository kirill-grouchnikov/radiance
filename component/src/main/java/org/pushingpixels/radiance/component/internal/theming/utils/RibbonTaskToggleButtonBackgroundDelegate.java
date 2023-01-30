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
import org.pushingpixels.radiance.component.api.ribbon.RibbonContextualTaskGroup;
import org.pushingpixels.radiance.component.internal.ui.ribbon.JRibbonTaskToggleButton;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.Side;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import java.awt.*;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/**
 * Delegate class for painting backgrounds of {@link JRibbonTaskToggleButton}s.
 *
 * @author Kirill Grouchnikov
 */
public class RibbonTaskToggleButtonBackgroundDelegate {
    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();

    public void updateTaskToggleButtonBackground(Graphics2D g, JRibbonTaskToggleButton button) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        ComponentState currState = ComponentState.getState(button.getActionModel(), button, true);
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();

        // Populate fill and border color schemes based on the current transition state of the button.
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
        BladeUtils.populateColorScheme(mutableFillColorScheme,
                modelStateInfo, currState,
                new BladeUtils.ColorSchemeDelegate() {
                    @Override
                    public RadianceColorScheme getColorSchemeForCurrentState(ComponentState state) {
                        if (state == ComponentState.ENABLED) {
                            RadianceSkin skin = RadianceCoreUtilities.getSkin(button);
                            RadianceThemingSlices.DecorationAreaType buttonDecorationAreaType =
                                    RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(button);
                            return skin.getBackgroundColorScheme(buttonDecorationAreaType);
                        }
                        return RadianceColorSchemeUtilities.getColorScheme(button,
                                RadianceThemingSlices.ColorSchemeAssociationKind.FILL, state);
                    }

                    @Override
                    public RadianceColorScheme getColorSchemeForActiveState(ComponentState state) {
                        return RadianceColorSchemeUtilities.getColorScheme(button,
                                RadianceThemingSlices.ColorSchemeAssociationKind.FILL, state);
                    }
                },
                true);
        BladeUtils.populateColorScheme(mutableBorderColorScheme,
                modelStateInfo, currState,
                BladeUtils.getDefaultColorSchemeDelegate(button,
                        state -> RadianceThemingSlices.ColorSchemeAssociationKind.BORDER),
                true);

        // Account for contextual hue color associated with the button's group
        Color contextualGroupHueColor = button.getContextualGroupHueColor();
        RadianceColorScheme finalFillColorScheme = (contextualGroupHueColor != null) ?
                RadianceColorSchemeUtilities.getShiftedScheme(mutableFillColorScheme,
                        contextualGroupHueColor, RibbonContextualTaskGroup.HUE_ALPHA, null, 0.0f) :
                mutableFillColorScheme;


        float alpha = 0.0f;
        for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry
                : stateTransitionTracker.getModelStateInfo().getStateContributionMap().entrySet()) {
            ComponentState activeState = activeEntry.getKey();
            if (activeState.isDisabled()) {
                continue;
            }
            if (activeState == ComponentState.ENABLED) {
                continue;
            }
            alpha += activeEntry.getValue().getContribution();
        }

        if (alpha > 0.0f) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setComposite(WidgetUtilities.getAlphaComposite(button, alpha, g));
            graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

            RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(button);

            drawFullAlphaBackgroundImage(graphics, button,
                    finalFillColorScheme, mutableBorderColorScheme, borderPainter);

            graphics.dispose();
        }
    }

    public static float getTaskToggleButtonCornerRadius(JRibbonTaskToggleButton button) {
        return RadianceSizeUtils.getAdjustedSize(
                RadianceSizeUtils.getComponentFontSize(button), 3.0f, 6, 1.0f);
    }

    private static void drawFullAlphaBackgroundImage(Graphics2D g,
            JRibbonTaskToggleButton button,
            RadianceColorScheme fillScheme,
            RadianceColorScheme borderScheme,
            RadianceBorderPainter borderPainter) {
        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics,
                0, 0, button.getWidth(), button.getHeight(),
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {

                    Set<Side> bottom = EnumSet.of(Side.BOTTOM);

                    float radius = (float) scaleFactor * getTaskToggleButtonCornerRadius(button);
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(
                            button.getComponentOrientation(),
                            scaledWidth, scaledHeight + 3.0f, radius, bottom, 1.0f);

                    RadianceSkin skin = RadianceCoreUtilities.getSkin(button);
                    RadianceThemingSlices.DecorationAreaType buttonDecorationAreaType =
                            RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(button);
                    if (skin.isRegisteredAsDecorationArea(buttonDecorationAreaType)) {
                        DecorationPainterUtils.paintDecorationArea(graphics1X, button, contour,
                                buttonDecorationAreaType, fillScheme, false);
                    } else {
                        graphics1X.setColor(fillScheme.getBackgroundFillColor());
                        graphics1X.fill(contour);
                    }

                    Shape contourInner = RadianceOutlineUtilities.getBaseOutline(
                            button.getComponentOrientation(),
                            scaledWidth, scaledHeight + 4.0f, radius, bottom, 2.0f);

                    borderPainter.paintBorder(graphics1X, button, scaledWidth, scaledHeight + 2.0f,
                            contour, contourInner, borderScheme);
                });
        graphics.dispose();
    }
}
