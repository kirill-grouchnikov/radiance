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

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ComponentStateFacet;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAware;

import javax.swing.*;
import java.awt.*;

/**
 * Transition aware implementation of highlightable icons.
 *
 * @author Kirill Grouchnikov
 */
@TransitionAware
public class BladeHighlightableTransitionAwareIcon implements Icon {
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

    private ComponentStateFacet facetForHighlights;

    private BladeTransitionAwareIcon.TransitionAwareUIDelegate transitionAwareUIDelegate;

    private BladeColorScheme mutableColorScheme = new BladeColorScheme();

    private BladeTransitionAwareIcon.ColorSchemeAssociationKindDelegate colorSchemeAssociationKindDelegate;

    public BladeHighlightableTransitionAwareIcon(final JComponent component,
            BladeTransitionAwareIcon.TransitionAwareUIDelegate transitionAwareUIDelegate,
            BladeTransitionAwareIcon.Delegate delegate, ComponentStateFacet facetForHighlights) {
        this.component = component;
        this.facetForHighlights = facetForHighlights;
        this.transitionAwareUIDelegate = transitionAwareUIDelegate;
        this.delegate = delegate;
        this.colorSchemeAssociationKindDelegate = state -> state.isFacetActive(facetForHighlights)
                ? ColorSchemeAssociationKind.HIGHLIGHT
                : ColorSchemeAssociationKind.MARK;

        Dimension dimension = this.delegate.getIconDimension();
        this.iconWidth = dimension.width;
        this.iconHeight = dimension.height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        StateTransitionTracker stateTransitionTracker = this.transitionAwareUIDelegate
                .getTransitionAwareUI().getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();

        // Use HIGHLIGHT when necessary and MARK for the rest
        BladeUtils.populateColorScheme(mutableColorScheme, this.component, modelStateInfo,
                currState, this.colorSchemeAssociationKindDelegate, false);

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
