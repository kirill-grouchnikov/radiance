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
package org.pushingpixels.radiance.theming.internal.utils.combo;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.api.shaper.RadianceComponentShaper;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.OutlinePainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.SurfacePainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceOutlineUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Delegate class for painting backgrounds of buttons in <b>Radiance</b> look and feel. This class
 * is <b>for internal use only</b>.
 *
 * @author Kirill Grouchnikov
 */
public class ComboBoxBackgroundDelegate {
    private BladeContainerColorTokens mutableContainerTokens = new BladeContainerColorTokens();

    public void drawBackground(Graphics2D graphics, JComboBox combo, ComponentState comboState,
        RadianceOutlinePainter outlinePainter, RadianceComponentShaper componentShaper,
        int width, int height, float overallAlpha) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) combo.getUI();
        StateTransitionTracker.ModelStateInfo modelStateInfo = transitionAwareUI
                .getTransitionTracker().getModelStateInfo();
        ComponentState currState = modelStateInfo.getCurrModelState();

        BladeUtils.populateColorTokens(mutableContainerTokens, combo, modelStateInfo,
            currState, RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT,
            false, false, CoreColorTokenUtils.ContainerType.MUTED);

        drawBackground(graphics, combo, comboState, outlinePainter, componentShaper, width, height,
            mutableContainerTokens, overallAlpha);
    }

    private void drawBackground(Graphics2D g, JComboBox combo, ComponentState comboState,
        RadianceOutlinePainter outlinePainter, RadianceComponentShaper componentShaper,
        int width, int height, ContainerColorTokens colorTokens, float overallAlpha) {
        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
            (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {

                // Compute a separate outline for the surface based on the outline inset from the
                // outline painter. Otherwise pixels on the edge of the surface fill can "spill"
                // outside the button outline. Those pixels should only be drawn by the outline
                // painter.
                float outlineInset = outlinePainter.getOutlineInset(
                    RadianceOutlinePainter.InsetKind.SURFACE);
                Shape outlineFill = componentShaper.getComboBoxShapeSupplier().getShape(combo,
                    scaledWidth, scaledHeight, outlineInset, 0.0f, scaleFactor);

                SurfacePainterUtils.paintSurface(graphics1X, combo, comboState,
                    scaledWidth, scaledHeight, scaleFactor, overallAlpha, outlineFill,
                    colorTokens);

                OutlinePainterUtils.paintOutline(graphics1X, combo, comboState,
                    scaledWidth - 1, scaledHeight - 1, scaleFactor, overallAlpha,
                    componentShaper.getComboBoxShapeSupplier(), colorTokens);
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
        float extraAlpha = 1.0f;
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
        }

        if (extraAlpha > 0.0f) {
            Graphics2D graphics = (Graphics2D) g.create();
            graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

            RadianceOutlinePainter outlinePainter = RadianceCoreUtilities.getOutlinePainter(combo);
            RadianceComponentShaper componentShaper = RadianceCoreUtilities.getComponentShaper(combo);

            drawBackground(graphics, combo, modelStateInfo.getCurrModelState(),
                outlinePainter, componentShaper, width, height, extraAlpha);

            graphics.dispose();
        }
    }
}
