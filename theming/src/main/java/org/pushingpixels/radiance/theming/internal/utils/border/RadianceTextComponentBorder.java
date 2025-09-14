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
package org.pushingpixels.radiance.theming.internal.utils.border;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.outline.RadianceOutlinePainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.painter.OutlinePainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Text component border for the <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class RadianceTextComponentBorder implements Border, UIResource {
    /**
     * Insets of <code>this</code> border.
     */
    protected Insets myInsets;
    private BladeContainerColorTokens mutableContainerTokens =
        new BladeContainerColorTokens();

    RadianceOutlinePainter.ShapeSuppler shapeSupplier =
        (shapeComponent, shapeWidth, shapeHeight, shapeInsets, shapeRadiusAdjustment, shapeScaleFactor) ->
            new Rectangle2D.Float(shapeInsets, shapeInsets, shapeWidth - 1 - 2.0f * shapeInsets,
                shapeHeight - 1 - 2.0f * shapeInsets);

    /**
     * Creates a new border with the specified insets.
     * 
     * @param insets
     *            Insets.
     */
    public RadianceTextComponentBorder(Insets insets) {
        this.myInsets = new Insets(insets.top, insets.left, insets.bottom, insets.right);
    }

    /**
     * Paints border instance for the specified component.
     * 
     * @param c
     *            The component.
     * @param g
     *            Graphics context.
     * @param xOffset
     *            Component left X (in graphics context).
     * @param yOffset
     *            Component top Y (in graphics context).
     * @param width
     *            Component width.
     * @param height
     *            Component height.
     * @param isEnabled
     *            Component enabled status.
     */
    private void paintBorderImpl(JComponent c, Graphics g, int xOffset, int yOffset,
        int width, int height, boolean isEnabled) {
        // failsafe for LAF change
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }

        if ((width <= 0) || (height <= 0))
            return;

        RadianceOutlinePainter outlinePainter = RadianceCoreUtilities.getOutlinePainter(c);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(xOffset, yOffset);
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height, (graphics1X, x, y,
            scaledWidth, scaledHeight, scaleFactor) -> {
            JTextComponent componentForTransitions = RadianceCoreUtilities
                .getTextComponentForTransitions(c);
            if (componentForTransitions != null) {
                ComponentUI ui = componentForTransitions.getUI();
                if (ui instanceof TransitionAwareUI) {
                    TransitionAwareUI trackable = (TransitionAwareUI) ui;
                    StateTransitionTracker stateTransitionTracker = trackable.getTransitionTracker();
                    StateTransitionTracker.ModelStateInfo modelStateInfo =
                        stateTransitionTracker.getModelStateInfo();
                    ComponentState currState = modelStateInfo.getCurrModelState();
                    if (currState.isDisabled()) {
                        currState = ComponentState.DISABLED_UNSELECTED;
                    }

                    BladeUtils.populateColorTokens(mutableContainerTokens, c, modelStateInfo,
                        currState, RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT,
                        false, false, CoreColorTokenUtils.ContainerType.MUTED);
                    OutlinePainterUtils.paintOutline(graphics1X, c, currState,
                        scaledWidth, scaledHeight, scaleFactor, 1.0f,
                        shapeSupplier, mutableContainerTokens);

                    return;
                }
            }

            ComponentState currState = isEnabled ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;

            ContainerColorTokens colorTokens =
                CoreColorTokenUtils.getContainerTokens(c,
                    RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT,
                    currState, CoreColorTokenUtils.ContainerType.MUTED);

            OutlinePainterUtils.paintOutline(graphics1X, c, currState,
                scaledWidth, scaledHeight, scaleFactor, 1.0f,
                shapeSupplier, colorTokens);
        });

        graphics.dispose();
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        paintBorderImpl((JComponent) c, g, x, y, width, height, c.isEnabled());
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return this.myInsets;
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
