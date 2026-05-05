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
package org.pushingpixels.radiance.component.internal.theming.utils;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.ribbon.JRibbon;
import org.pushingpixels.radiance.component.internal.ui.ribbon.JRibbonTaskToggleButton;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceComponentShaper;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceTabUtils;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Delegate class for painting backgrounds of {@link JRibbonTaskToggleButton}s.
 *
 * @author Kirill Grouchnikov
 */
public class RibbonTaskToggleButtonBackgroundDelegate {
    private BladeContainerColorTokens mutableTokens = new BladeContainerColorTokens();

    public void updateTaskToggleButtonBackground(Graphics2D g, JRibbonTaskToggleButton button) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) button.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        ComponentState currState = ComponentState.getState(button.getActionModel(), button, false);
        StateTransitionTracker.ModelStateInfo modelStateInfo = stateTransitionTracker
                .getModelStateInfo();

        BladeUtils.populateColorTokens(mutableTokens, button, modelStateInfo, currState,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.TAB,
            true, false, CoreColorTokenUtils.ContainerType.NEUTRAL);

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
            ContainerColorTokens neutralSurfaceTokens = CoreColorTokenUtils.getContainerTokens(
                button,
                ComponentState.ENABLED,
                CoreColorTokenUtils.ContainerType.NEUTRAL);
            JRibbon ribbon = (JRibbon) SwingUtilities.getAncestorOfClass(JRibbon.class, button);
            ContainerColorTokens outlineColorTokens = RadianceTabUtils.getTabOutlineColorTokens(ribbon);

            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setComposite(WidgetUtilities.getAlphaComposite(button, alpha, g));
            graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

            drawFullAlphaBackground(graphics, button, neutralSurfaceTokens, mutableTokens, outlineColorTokens);

            graphics.dispose();
        }
    }

    private static void drawFullAlphaBackground(Graphics2D g,
        JRibbonTaskToggleButton button,
        ContainerColorTokens neutralSurfaceColorTokens,
        ContainerColorTokens surfaceHighlightColorTokens,
        ContainerColorTokens outlineColorTokens) {

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics,
                0, 0, button.getWidth(), button.getHeight(),
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {

                    RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(button);
                    RadianceComponentShaper.ShapeSupplier tabShapeSupplier = componentShaper.getTabShapeSupplier();

                    Shape scaledOutline = tabShapeSupplier.getShape(button,
                        scaledWidth, scaledHeight + 3.0f, 0.0f, 0.0f, scaleFactor);
                    Graphics2D clipped = (Graphics2D) graphics1X.create();
                    clipped.clip(scaledOutline);
                    RadianceTabUtils.paintTabSurfaceAt1X(clipped, button, scaleFactor,
                        0, 0, scaledWidth - 1, scaledHeight, neutralSurfaceColorTokens);
                    clipped.dispose();

                    RadianceTabUtils.paintTabSurfaceHighlightAt1X(graphics1X, button, scaleFactor,
                        scaledWidth - 1, scaledHeight, surfaceHighlightColorTokens);

                    RadianceTabUtils.paintTabOutlineAt1X(graphics1X, button, scaleFactor,
                        scaledWidth - 1, scaledHeight, outlineColorTokens);
                });
        graphics.dispose();
    }
}
