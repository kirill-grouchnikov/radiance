/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.components.internal.theming.common.ui;

import org.pushingpixels.radiance.components.internal.ui.common.popup.BasicColorSelectorComponentUI;
import org.pushingpixels.radiance.components.internal.ui.common.popup.JColorSelectorComponent;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class RadianceColorSelectorComponentUI extends BasicColorSelectorComponentUI
        implements TransitionAwareUI {
    /**
     * Listener for transition animations.
     */
    private StateTransitionTracker stateTransitionTracker;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceColorSelectorComponentUI((JColorSelectorComponent) comp);
    }

    private RadianceColorSelectorComponentUI(JColorSelectorComponent colorSelectorComponent) {
        super();
        this.stateTransitionTracker = new StateTransitionTracker(colorSelectorComponent,
                this.buttonModel);
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();
    }

    @Override
    protected void uninstallListeners() {
        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        super.uninstallListeners();
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return true;
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.stateTransitionTracker;
    }

    @Override
    protected void paintRolloverIndication(Graphics g) {
        int w = this.colorSelectorComponent.getWidth();
        int h = this.colorSelectorComponent.getHeight();
        Graphics2D g2d = (Graphics2D) g.create();

        float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(
                this.colorSelectorComponent);

        g2d.setComposite(AlphaComposite.SrcOver.derive(this.rollover));
        RadianceColorScheme highlightBorderScheme = RadianceColorSchemeUtilities.getColorScheme(
                this.colorSelectorComponent, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                ComponentState.ROLLOVER_UNSELECTED);
        g2d.setColor(highlightBorderScheme.getMidColor());
        g2d.draw(new Rectangle2D.Double(0, 0, w - borderThickness, h - borderThickness));
        g2d.setColor(highlightBorderScheme.getUltraDarkColor());
        g2d.draw(new Rectangle2D.Double(borderThickness, borderThickness, w - 3 * borderThickness,
                h - 3 * borderThickness));

        g2d.dispose();
    }

    @Override
    protected void paintFocus(Graphics g) {
        float focusRingPadding = RadianceSizeUtils.getFocusRingPadding(
                this.colorSelectorComponent,
                RadianceSizeUtils.getComponentFontSize(this.colorSelectorComponent));
        Shape insetFocusArea = new Rectangle2D.Float(focusRingPadding, focusRingPadding,
                this.colorSelectorComponent.getWidth() - 2 * focusRingPadding,
                this.colorSelectorComponent.getHeight() - 2 * focusRingPadding);
        RadianceCoreUtilities.paintFocus(g, this.colorSelectorComponent,
                this.colorSelectorComponent, this, insetFocusArea, null, 1.0f, 0);
    }
}
