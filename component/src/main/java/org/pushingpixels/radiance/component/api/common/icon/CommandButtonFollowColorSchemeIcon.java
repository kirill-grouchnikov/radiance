/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.common.icon;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.internal.theming.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAware;

import java.awt.*;

/**
 * Implementation of {@link RadianceIcon} for command buttons that wish to have their icon
 * be dynamically rendered at runtime based on the color scheme that matches the current
 * transition-aware state.
 *
 * @author Kirill Grouchnikov
 */
@TransitionAware
public class CommandButtonFollowColorSchemeIcon implements RadianceIcon {
    /**
     * The width of the rendered image.
     */
    private int width;

    /**
     * The height of the rendered image.
     */
    private int height;

    /**
     * The delegate needs to implement the method in this interface based on the
     * provided color scheme. The color scheme is computed based on the transitions that are
     * happening on the associated command button.
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

    // Color scheme association kind. {@link ColorSchemeAssociationKind#MARK} by default
    private ColorSchemeAssociationKind colorSchemeAssociationKind;

    // Delegate to compute the actual icons.
    private Delegate delegate;

    private BladeColorScheme mutableColorScheme = new BladeColorScheme();

    public CommandButtonFollowColorSchemeIcon(Delegate delegate, Dimension initialDim) {
        this(ColorSchemeAssociationKind.MARK, delegate, initialDim);
    }

    /**
     * Creates a new icon.
     *
     * @param colorSchemeAssociationKind Color scheme association kind to use for determining
     *                                   the color scheme for this icon.
     * @param delegate                   Delegate to compute the actual icons.
     * @param initialDim                 Initial icon dimension.
     */
    public CommandButtonFollowColorSchemeIcon(ColorSchemeAssociationKind colorSchemeAssociationKind,
            Delegate delegate, Dimension initialDim) {
        this.colorSchemeAssociationKind = colorSchemeAssociationKind;
        this.delegate = delegate;
        this.width = initialDim.width;
        this.height = initialDim.height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        float alpha = 1.0f;
        // If the passed component is null or not a JCommandButton, our best effort is to
        // display either "enabled" or "disabled" version of the delegate icon
        if (!(c instanceof JCommandButton)) {
            BladeUtils.populateColorScheme(mutableColorScheme, null, null,
                    ((c == null) || !c.isEnabled()) ? ComponentState.DISABLED_UNSELECTED
                            : ComponentState.ENABLED,
                    this.colorSchemeAssociationKind, false);
            if ((c == null) || !c.isEnabled()) {
                alpha = RadianceColorSchemeUtilities.getAlpha(c, ComponentState.DISABLED_UNSELECTED);
            }
        } else {
            JCommandButton commandButton = (JCommandButton) c;

            StateTransitionTracker stateTransitionTracker =
                    ((ActionPopupTransitionAwareUI) commandButton.getUI()).getActionTransitionTracker();
            StateTransitionTracker.ModelStateInfo modelStateInfo =
                    stateTransitionTracker.getModelStateInfo();

            ComponentState currState = modelStateInfo.getCurrModelState();

            BladeUtils.populateColorScheme(mutableColorScheme, commandButton, modelStateInfo, currState,
                    this.colorSchemeAssociationKind, false);
            alpha = RadianceColorSchemeUtilities.getAlpha(c, currState);
        }

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        if (alpha < 1.0f) {
            graphics.setComposite(WidgetUtilities.getAlphaComposite(c, alpha, g));
        }
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
