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
package org.pushingpixels.radiance.component.api.common.icon;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.internal.theming.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeArrowIconUtils;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.icon.TransitionAware;

import javax.swing.*;
import java.awt.*;

@TransitionAware
public class CommandButtonDefaultPopupIcon implements RadianceIcon {
    // Current width
    private int width;
    // Current height
    private int height;

    private BladeColorScheme mutableColorScheme = new BladeColorScheme();

    public CommandButtonDefaultPopupIcon() {
        int fontSize = RadianceSizeUtils.getComponentFontSize(null);
        this.width = (int) RadianceSizeUtils.getArrowIconWidth(fontSize);
        this.height = (int) RadianceSizeUtils.getArrowIconHeight(fontSize);
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

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        JCommandButton commandButton = (JCommandButton) c;

        StateTransitionTracker stateTransitionTracker =
                ((ActionPopupTransitionAwareUI) commandButton.getUI()).getPopupTransitionTracker();
        StateTransitionTracker.ModelStateInfo modelStateInfo =
                stateTransitionTracker.getModelStateInfo();

        ComponentState currState = modelStateInfo.getCurrModelState();

        BladeUtils.populateColorScheme(mutableColorScheme, c, modelStateInfo, currState,
                RadianceThemingSlices.ColorSchemeAssociationKind.MARK, false);
        RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                commandButton.getPopupPlacementStrategy();
        int direction =
                (popupPlacementStrategy instanceof RadianceThemingSlices.PopupPlacementStrategy.Downward)
                        ? SwingConstants.SOUTH
                        : (commandButton.getComponentOrientation().isLeftToRight()
                        ? SwingConstants.EAST : SwingConstants.WEST);
        int fontSize = RadianceSizeUtils.getComponentFontSize(c);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        BladeArrowIconUtils.drawArrow(graphics, this.width, this.height,
                RadianceSizeUtils.getArrowStrokeWidth(fontSize) - 0.5f,
                direction, this.mutableColorScheme);
        graphics.dispose();
    }
}
