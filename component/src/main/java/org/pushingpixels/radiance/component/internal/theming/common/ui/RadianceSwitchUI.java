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
package org.pushingpixels.radiance.component.internal.theming.common.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.common.JSwitch;
import org.pushingpixels.radiance.component.api.common.model.SwitchPresentationModel;
import org.pushingpixels.radiance.component.internal.ui.common.BasicSwitchUI;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.OutlinePainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.SurfacePainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * UI for {@link JSwitch} components in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceSwitchUI extends BasicSwitchUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceSwitchUI((JSwitch) comp);
    }

    private BladeContainerColorTokens mutableContainerTokens = new BladeContainerColorTokens();

    private RadianceOutlinePainter.ShapeSuppler switchShapeSupplier =
        (c, width, height, insets, radiusAdjustment, scaleFactor) ->
            RadianceOutlineUtilities.getBaseOutline(c.getComponentOrientation(),
                width, height, height * 0.5f, null, insets);

    private RadianceSwitchUI(JSwitch switchComp) {
        super(switchComp);
    }

    @Override
    protected String getPropertyPrefix() {
        return "Switch.";
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        JSwitch switchComp = (JSwitch) c;

        if (RadianceCoreUtilities.isOpaque(c)) {
            BackgroundPaintingUtils.update(g, switchComp, false);
        }

        Insets i = switchComp.getInsets();
        boolean ltr = switchComp.getComponentOrientation().isLeftToRight();

        Graphics2D g2d = (Graphics2D) g.create();

        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();

        // Populate color tokens based on the current transition state of the switch.
        BladeUtils.populateColorTokens(mutableContainerTokens, switchComp, modelStateInfo,
            currState, RadianceThemingSlices.ContainerColorTokensAssociationKind.MARK,
            false, true, CoreColorTokenUtils.ContainerType.MUTED);

        SwitchPresentationModel presentationModel = switchComp.getProjection().getPresentationModel();

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, switchComp.getWidth(), switchComp.getHeight(),
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    graphics1X.translate(scaleFactor * i.left, scaleFactor * i.top);

                    float trackWidth = presentationModel.getTrackSize().width * (float) scaleFactor;
                    float trackHeight = presentationModel.getTrackSize().height * (float) scaleFactor;

                    Shape outlineFill = switchShapeSupplier.getShape(switchComp,
                        trackWidth, trackHeight, 0.0f, 0.0f, scaleFactor);

                    SurfacePainterUtils.paintSurface(graphics1X, switchComp, currState,
                        trackWidth, trackHeight, scaleFactor, 1.0f, outlineFill, mutableContainerTokens);
                    OutlinePainterUtils.paintOutline(graphics1X, switchComp, currState,
                        trackWidth, trackHeight, scaleFactor, 1.0f, switchShapeSupplier, mutableContainerTokens);

                    float thumbSelectionFactor = stateTransitionTracker.getFacetStrength(
                            RadianceThemingSlices.ComponentStateFacet.SELECTION);

                    float thumbSizeOff = presentationModel.getThumbSizeOff() * (float) scaleFactor;
                    float thumbSizeOn = presentationModel.getThumbSizeOn() * (float) scaleFactor;

                    float thumbSize = thumbSizeOff + (thumbSizeOn - thumbSizeOff) * thumbSelectionFactor;
                    float thumbXStart;
                    if (ltr) {
                        float unselectedStartX = (trackHeight - thumbSizeOff) / 2.0f;
                        float selectedStartX = trackWidth - (trackHeight - thumbSizeOn) / 2.0f - thumbSizeOn;
                        thumbXStart = unselectedStartX + (selectedStartX - unselectedStartX) * thumbSelectionFactor;
                    } else {
                        float unselectedStartX = trackWidth - (trackHeight - thumbSizeOff) / 2.0f - thumbSizeOff;
                        float selectedStartX = (trackHeight - thumbSizeOn) / 2.0f;
                        thumbXStart = selectedStartX + (unselectedStartX - selectedStartX) * (1.0f - thumbSelectionFactor);
                    }

                    float thumbRadiusPx = thumbSize / 2.0f;
                    float thumbVerticalCenterPx = trackHeight / 2.0f;
                    Shape thumbOutline = new Ellipse2D.Double(thumbXStart, thumbVerticalCenterPx - thumbRadiusPx,
                            2 * thumbRadiusPx, 2 * thumbRadiusPx);

                    float alpha = currState.isDisabled()
                        ? mutableContainerTokens.getContainerSurfaceDisabledAlpha() : 1.0f;
                    graphics1X.setComposite(WidgetUtilities.getAlphaComposite(
                        switchComp, alpha, graphics1X));
                    graphics1X.setColor(mutableContainerTokens.getOnContainer());
                    graphics1X.fill(thumbOutline);

                    graphics1X.translate(-scaleFactor * i.left, -scaleFactor * i.top);

                    if (switchComp.isFocusPainted()) {
                        // make sure that the focus ring is not clipped
                        float focusRingPadding = RadianceSizeUtils.getFocusRingPadding(
                                switchComp, RadianceSizeUtils.getComponentFontSize(switchComp)) / 2;

                        RadianceCoreUtilities.paintFocus1X(graphics1X, switchComp, switchComp, this,
                                scaleFactor, null, null, (float) scaleFactor * focusRingPadding);
                    }
                });

        graphics.dispose();

        g2d.dispose();
    }
}
