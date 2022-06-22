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
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAware;

import javax.swing.*;
import java.awt.*;

/**
 * Icon with transition-aware capabilities. Has a delegate that does the actual painting based on
 * the transition color schemes. This class is used heavily on Radiance-provided icons, such as
 * title pane button icons, arrow icons on scroll bars and combos etc.
 *
 * @author Kirill Grouchnikov
 */
@TransitionAware
public class BladeTransitionAwareIcon implements Icon {
    /**
     * The delegate needs to implement the method in this interface based on the provided color
     * scheme. The color scheme is computed based on the transitions that are happening on the
     * associated component.
     *
     * @author Kirill Grouchnikov
     */
    public interface Delegate {
        void drawColorSchemeIcon(Graphics2D g, RadianceColorScheme scheme);

        Dimension getIconDimension();
    }

    @FunctionalInterface
    public interface ColorSchemeAssociationKindDelegate {
        ColorSchemeAssociationKind getColorSchemeAssociationKind(ComponentState state);
    }

    private static ColorSchemeAssociationKindDelegate MARK_DELEGATE =
            state -> ColorSchemeAssociationKind.MARK;

    private JComponent comp;

    private TransitionAwareUIDelegate transitionAwareUIDelegate;

    // Delegate to draw the icons visuals that match the current model state.
    private Delegate delegate;

    private ColorSchemeAssociationKindDelegate colorSchemeAssociationKindDelegate;

    private int iconWidth;

    private int iconHeight;

    private BladeColorScheme mutableColorScheme = new BladeColorScheme();

    public BladeTransitionAwareIcon(final AbstractButton button, Delegate delegate) {
        this(button, (button == null) ? null : () -> (TransitionAwareUI) button.getUI(), delegate,
                null);
    }

    /**
     * Creates a new transition-aware icon.
     */
    public BladeTransitionAwareIcon(JComponent comp,
            TransitionAwareUIDelegate transitionAwareUIDelegate,
            Delegate delegate,
            ColorSchemeAssociationKindDelegate colorSchemeAssociationKindDelegate) {
        this.comp = comp;
        this.transitionAwareUIDelegate = transitionAwareUIDelegate;
        this.delegate = delegate;
        this.colorSchemeAssociationKindDelegate =
                (colorSchemeAssociationKindDelegate != null) ?
                        colorSchemeAssociationKindDelegate : MARK_DELEGATE;

        Dimension iconDimension = this.delegate.getIconDimension();
        this.iconWidth = iconDimension.width;
        this.iconHeight = iconDimension.height;
    }

    @Override
    public int getIconHeight() {
        return this.iconHeight;
    }

    @Override
    public int getIconWidth() {
        return this.iconWidth;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        StateTransitionTracker stateTransitionTracker = this.transitionAwareUIDelegate
                .getTransitionAwareUI().getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();
        boolean isComponentNeverPainted = RadianceCoreUtilities.isComponentNeverPainted(this.comp);
        if (isComponentNeverPainted) {
            if (currState.isFacetActive(ComponentStateFacet.ENABLE))
                currState = ComponentState.ENABLED;
        }

        BladeUtils.populateColorScheme(mutableColorScheme, comp, modelStateInfo, currState,
                this.colorSchemeAssociationKindDelegate, false);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        this.delegate.drawColorSchemeIcon(graphics, mutableColorScheme);
        graphics.dispose();
    }

    @FunctionalInterface
    public interface TransitionAwareUIDelegate {
        TransitionAwareUI getTransitionAwareUI();
    }
}
