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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAware;

import javax.swing.*;
import java.awt.*;

/**
 * Transition aware implementation of arrow button icons. Used for implementing
 * icons of combobox buttons, menus and more.
 *
 * @author Kirill Grouchnikov
 */
@TransitionAware
public class BladeArrowButtonTransitionAwareIcon implements Icon {
    /**
     * Icon width.
     */
    private int iconWidth;

    /**
     * Icon height.
     */
    private int iconHeight;

    /**
     * Delegate to draw the actual icons.
     */
    private BladeTransitionAwareIcon.Delegate delegate;

    private JComponent component;

    private BladeTransitionAwareIcon.TransitionAwareUIDelegate transitionAwareUIDelegate;

    private BladeTransitionAwareIcon.ColorSchemeAssociationKindDelegate colorSchemeAssociationKindDelegate;

    private BladeColorScheme mutableColorScheme = new BladeColorScheme();

    public BladeArrowButtonTransitionAwareIcon(final AbstractButton button,
            final Dimension iconDimension,
            final int orientation) {
        this(button, () -> (TransitionAwareUI) button.getUI(), iconDimension, orientation);
    }

    /**
     * Creates an arrow icon.
     *
     * @param component   Arrow button.
     * @param orientation Arrow icon orientation.
     */
    public BladeArrowButtonTransitionAwareIcon(
            final JComponent component,
            BladeTransitionAwareIcon.TransitionAwareUIDelegate transitionAwareUIDelegate,
            final Dimension iconDimension,
            final int orientation) {
        this.component = component;
        this.transitionAwareUIDelegate = transitionAwareUIDelegate;
        this.delegate = new BladeTransitionAwareIcon.Delegate() {
            @Override
            public void drawColorSchemeIcon(Graphics2D g, RadianceColorScheme scheme) {
                int fontSize = RadianceSizeUtils.getComponentFontSize(component);
                BladeArrowIconUtils.drawArrow(g, fontSize, getIconDimension(), orientation, scheme);
            }

            @Override
            public Dimension getIconDimension() {
                return iconDimension;
            }
        };

        this.iconWidth = iconDimension.width;
        this.iconHeight = iconDimension.height;

        this.colorSchemeAssociationKindDelegate = state -> {
            // Use HIGHLIGHT for rollover menus (arrow icons) and MARK for the rest
            return (component instanceof JMenu) &&
                    state.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER)
                    ? RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT
                    : RadianceThemingSlices.ColorSchemeAssociationKind.MARK;
        };
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        StateTransitionTracker stateTransitionTracker = this.transitionAwareUIDelegate
                .getTransitionAwareUI().getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();

        BladeUtils.populateColorScheme(mutableColorScheme, modelStateInfo,
                currState,
                BladeUtils.getDefaultColorSchemeDelegate(this.component,
                        this.colorSchemeAssociationKindDelegate),
                false);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        this.delegate.drawColorSchemeIcon(graphics, mutableColorScheme);
        graphics.dispose();
    }

    @Override
    public int getIconHeight() {
        return this.iconHeight;
    }

    @Override
    public int getIconWidth() {
        return this.iconWidth;
    }
}
