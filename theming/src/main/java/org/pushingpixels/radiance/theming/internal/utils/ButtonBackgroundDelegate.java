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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.RadianceSurfacePainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.animation.ModificationAwareUI;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
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
    private BladeContainerColorTokens mutableContainerTokens = new BladeContainerColorTokens();

    private void drawBackground(
        Graphics2D graphics, AbstractButton button,
        RadianceButtonShaper shaper, RadianceSurfacePainter surfacePainter,
        RadianceOutlinePainter outlinePainter, int width, int height) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker.ModelStateInfo modelStateInfo = transitionAwareUI
            .getTransitionTracker().getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();

        Set<RadianceThemingSlices.Side> openSides = RadianceCoreUtilities.getSides(button,
            RadianceSynapse.BUTTON_OPEN_SIDE);
        boolean isContentAreaFilled = button.isContentAreaFilled();
        boolean isBorderPainted = button.isBorderPainted();
        Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
            modelStateInfo.getStateContributionMap();

        // Special case for flat buttons, compute the overall alpha for the combined animation
        // states
        float overallAlpha = 1.0f;
        if (RadianceCoreUtilities.hasFlatAppearance(button)) {
            // Special handling of flat buttons
            overallAlpha = 0.0f;
            for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                activeStates.entrySet()) {
                ComponentState activeState = activeEntry.getKey();
                if (activeState.isDisabled())
                    continue;
                if (activeState == ComponentState.ENABLED)
                    continue;
                overallAlpha += activeEntry.getValue().getContribution();
            }
        }

        if (overallAlpha == 0.0f) {
            return;
        }

        // Do we need to use attention-drawing animation?
        if (button.getUI() instanceof ModificationAwareUI) {
            ModificationAwareUI modificationAwareUI = (ModificationAwareUI) button.getUI();
            Timeline modificationTimeline = modificationAwareUI.getModificationTimeline();
            if (modificationTimeline != null) {
                if (modificationTimeline.getState() != TimelineState.IDLE) {
                    BladeUtils.populateModificationAwareColorTokens(mutableContainerTokens,
                        button, modificationTimeline.getTimelinePosition());

                    drawBackground(graphics, button, shaper, surfacePainter, outlinePainter, width, height,
                        mutableContainerTokens, openSides, isContentAreaFilled, isBorderPainted,
                        currState, overallAlpha);
                    return;
                }
            }
        }

        BladeUtils.populateColorTokens(mutableContainerTokens, button, modelStateInfo,
            currState, RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT,
            false, false, CoreColorTokenUtils.ContainerType.MUTED);

        drawBackground(graphics, button, shaper, surfacePainter, outlinePainter, width, height,
            mutableContainerTokens, openSides, isContentAreaFilled, isBorderPainted, currState,
            overallAlpha);
    }

    private void drawBackground(Graphics2D g, AbstractButton button, RadianceButtonShaper shaper,
        RadianceSurfacePainter surfacePainter, RadianceOutlinePainter outlinePainter, int width,
        int height, ContainerColorTokens colorTokens,
        Set<RadianceThemingSlices.Side> openSides, boolean isContentAreaFilled,
        boolean isBorderPainted, ComponentState currState, float overallAlpha) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height, (graphics1X, x, y,
                scaledWidth, scaledHeight, scaleFactor) -> {
            ComponentOrientation orientation = button.getComponentOrientation();
            RadianceThemingSlices.Side leftSide = orientation.isLeftToRight() ?
                    RadianceThemingSlices.Side.LEADING : RadianceThemingSlices.Side.TRAILING;
            RadianceThemingSlices.Side rightSide = orientation.isLeftToRight() ?
                    RadianceThemingSlices.Side.TRAILING : RadianceThemingSlices.Side.LEADING;

            int openDelta = (int) (3 * scaleFactor);
            int deltaLeft = ((openSides != null) && openSides.contains(leftSide)) ? openDelta : 0;
            int deltaRight = ((openSides != null) && openSides.contains(rightSide)) ? openDelta : 0;
            int deltaTop =
                    ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.TOP)) ?
                            openDelta : 0;
            int deltaBottom =
                    ((openSides != null) && openSides.contains(RadianceThemingSlices.Side.BOTTOM)) ? openDelta : 0;

            Shape outlineOuter = shaper.getButtonOutline(button, 0.0f,
                    scaledWidth + deltaLeft + deltaRight, scaledHeight + deltaTop + deltaBottom,
                    scaleFactor, false);

            graphics1X.translate(-deltaLeft, -deltaTop);
            if (isContentAreaFilled) {
                // If the border is painted, compute a separate outline for the fill.
                // Otherwise pixels on the edge can "spill" outside
                // the outline. Those pixels will be drawn by the outline painter.
                Shape outlineFill = isBorderPainted ? shaper.getButtonOutline(button, 0.5f,
                        scaledWidth + deltaLeft + deltaRight + 1.0f,
                        scaledHeight + deltaTop + deltaBottom + 1.0f, scaleFactor, false) :
                        outlineOuter;
                float containerSurfaceAlpha = overallAlpha *
                    (currState.isDisabled() ? colorTokens.getContainerSurfaceDisabledAlpha() : 1.0f);
                graphics1X.setComposite(WidgetUtilities.getAlphaComposite(button,
                    overallAlpha * containerSurfaceAlpha, g));
                surfacePainter.paintSurface(graphics1X, button,
                        scaledWidth + deltaLeft + deltaRight,
                        scaledHeight + deltaTop + deltaBottom, outlineFill, colorTokens);
            }

            if (isBorderPainted) {
                Shape outlineInner = outlinePainter.isPaintingInnerOutline() ?
                        shaper.getButtonOutline(button, 1.0f,
                                scaledWidth + deltaLeft + deltaRight,
                                scaledHeight + deltaTop + deltaBottom, scaleFactor, true) : null;
                float containerOutlineAlpha = overallAlpha *
                    (currState.isDisabled() ? colorTokens.getContainerOutlineDisabledAlpha() : 1.0f);
                graphics1X.setComposite(WidgetUtilities.getAlphaComposite(button,
                    overallAlpha * containerOutlineAlpha, g));
                outlinePainter.paintOutline(graphics1X, button,
                        scaledWidth + deltaLeft + deltaRight,
                        scaledHeight + deltaTop + deltaBottom, outlineOuter, outlineInner,
                        colorTokens);
            }
            graphics1X.translate(deltaLeft, deltaTop);
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

        if (RadianceCoreUtilities.isComponentNeverPainted(button)) {
            return;
        }

        int width = button.getWidth();
        int height = button.getHeight();

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        RadianceSurfacePainter surfacePainter = RadianceCoreUtilities.getSurfacePainter(button);
        RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(button);
        RadianceOutlinePainter outlinePainter = RadianceCoreUtilities.getOutlinePainter(button);

        drawBackground(graphics, button, shaper, surfacePainter, outlinePainter, width, height);

        graphics.dispose();
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
        Shape outline = shaper.getButtonOutline(button, 0.0f, button.getWidth(), button.getHeight(),
                RadianceCommonCortex.getScaleFactor(button), false);
        return outline.contains(x, y);
    }
}
