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
package org.pushingpixels.radiance.theming.internal.utils.icon;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeIconUtils;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Thumb icon for the {@link JSlider}s that do not paint ticks and labels.
 * 
 * @author Kirill Grouchnikov
 */
public class SliderRoundIcon implements Icon, UIResource {
    /** The size of <code>this</code> icon. */
    private int size;

    /** The associated slider. */
    private JSlider slider;

    private BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    private BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();

    public SliderRoundIcon(JSlider slider, int size) {
        this.slider = slider;
        this.size = size;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        TransitionAwareUI transitionAwareUI = (TransitionAwareUI) this.slider.getUI();
        StateTransitionTracker stateTransitionTracker = transitionAwareUI.getTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(this.slider);
        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(this.slider);
        ComponentState currState = modelStateInfo.getCurrModelState();

        float alpha = RadianceColorSchemeUtilities.getAlpha(this.slider, currState);

        // Populate color schemes based on the current transition state of the slider.
        BladeUtils.populateColorScheme(mutableFillColorScheme, this.slider,
                modelStateInfo, currState,
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(this.slider),
                RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                false);
        BladeUtils.populateColorScheme(mutableBorderColorScheme, this.slider,
                modelStateInfo, currState,
                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(this.slider),
                RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                false);

        float activeStrength = stateTransitionTracker.getActiveStrength();
        int diameter = (int) (this.size * (2.0f + activeStrength) / 3.0f);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x + (this.size - diameter) / 2.0,
                y + (this.size - diameter) / 2.0);
        BladeIconUtils.drawSliderThumbRound(
                graphics, this.slider, fillPainter, borderPainter,
                diameter,
                mutableFillColorScheme, mutableBorderColorScheme,
                alpha);
        graphics.dispose();
    }

    @Override
    public int getIconWidth() {
        return this.size;
    }

    @Override
    public int getIconHeight() {
        return this.size;
    }
}
