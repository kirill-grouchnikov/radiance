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
package org.pushingpixels.radiance.component.internal.theming.common;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAware;

import javax.swing.*;
import java.awt.*;

/**
 * Icon with transition-aware capabilities. Has a delegate that does the actual
 * painting based on the transition themes.
 *
 * @author Kirill Grouchnikov
 */
@TransitionAware
public class BladeTransitionAwareRadianceIcon implements RadianceIcon {
    /**
     * The width of the rendered image.
     */
    protected int width;

    /**
     * The height of the rendered image.
     */
    protected int height;

    /**
     * The delegate needs to implement the method in this interface based on the
     * provided theme. The theme is computed based on the transitions that are
     * happening on the associated control.
     *
     * @author Kirill Grouchnikov
     */
    @FunctionalInterface
    public interface Delegate {
        /**
         * Draws the icon that matches the specified color scheme.
         *
         * @param scheme Color scheme.
         * @param width  Icon width.
         * @param height Icon height.
         * @return Icon that matches the specified theme.
         */
        void drawColorSchemeIcon(Graphics2D g, RadianceColorScheme scheme, int width, int height);
    }

    /**
     * The associated component.
     */
    private JComponent comp;

    private StateTransitionTrackerDelegate stateTransitionTrackerDelegate;

    /**
     * Delegate to compute the actual icons.
     */
    private Delegate delegate;

    private BladeColorScheme mutableColorScheme = new BladeColorScheme();

    public interface StateTransitionTrackerDelegate {
        StateTransitionTracker getStateTransitionTracker();
    }

    /**
     * Creates a new transition-aware icon.
     *
     * @param button                         Associated command button.
     * @param stateTransitionTrackerDelegate State transition tracker delegate
     * @param delegate                       Delegate to compute the actual icons.
     * @param initialDim                     Initial icon dimension.
     */
    public BladeTransitionAwareRadianceIcon(JCommandButton button,
            StateTransitionTrackerDelegate stateTransitionTrackerDelegate,
            Delegate delegate, Dimension initialDim) {
        this.comp = button;
        this.stateTransitionTrackerDelegate = stateTransitionTrackerDelegate;
        this.delegate = delegate;
        this.width = initialDim.width;
        this.height = initialDim.height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        StateTransitionTracker stateTransitionTracker = this.stateTransitionTrackerDelegate
                .getStateTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();

        BladeUtils.populateColorScheme(mutableColorScheme, comp, modelStateInfo, currState,
                ColorSchemeAssociationKind.MARK, false);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        this.delegate.drawColorSchemeIcon(graphics, mutableColorScheme, this.width, this.height);
        graphics.dispose();
    }

    @Override
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
    }

    @Override
    public boolean supportsColorFilter() {
        return false;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }
}
