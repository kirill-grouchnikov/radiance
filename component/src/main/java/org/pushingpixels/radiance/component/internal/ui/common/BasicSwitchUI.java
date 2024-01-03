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
package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.common.JSwitch;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.RolloverButtonListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicToggleButtonUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;

public abstract class BasicSwitchUI extends BasicToggleButtonUI implements TransitionAwareUI {
    protected JSwitch switchComp;

    private PropertyChangeListener componentPropertyChangeListener;
    private PropertyChangeListener projectionPropertyChangeListener;

    protected StateTransitionTracker stateTransitionTracker;

    public BasicSwitchUI(JSwitch switchComp) {
        this.switchComp = switchComp;
        this.stateTransitionTracker = new StateTransitionTracker(this.switchComp,
                this.switchComp.getModel());
    }

    @Override
    public void uninstallUI(JComponent c) {
        super.uninstallUI(c);
        this.switchComp = null;
    }

    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);

        if (this.switchComp.getProjection() == null) {
            return;
        }

        Border border = this.switchComp.getBorder();
        if (border == null || border instanceof UIResource) {
            this.switchComp.setBorder(new BorderUIResource.EmptyBorderUIResource(
                    this.switchComp.getProjection().getPresentationModel().getContentPadding()));
        }
    }

    @Override
    protected void installListeners(AbstractButton b) {
        super.installListeners(b);

        if (this.switchComp.getProjection() == null) {
            return;
        }

        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();

        this.componentPropertyChangeListener = propertyChangeEvent -> {
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(switchComp::updateUI);
            }
        };
        this.switchComp.addPropertyChangeListener(componentPropertyChangeListener);

        this.projectionPropertyChangeListener = propertyChangeEvent -> {
            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                switchComp.getModel().setEnabled(
                        (Boolean) propertyChangeEvent.getNewValue());
            }
            if ("selected".equals(propertyChangeEvent.getPropertyName())) {
                switchComp.getModel().setSelected(
                        (Boolean) propertyChangeEvent.getNewValue());
            }
            this.switchComp.invalidate();
            this.switchComp.revalidate();
            this.switchComp.repaint();
        };
        this.switchComp.getProjection().getContentModel().addPropertyChangeListener(
                this.projectionPropertyChangeListener);
    }

    @Override
    protected void uninstallDefaults(AbstractButton b) {
        LookAndFeel.uninstallBorder(this.switchComp);

        super.uninstallDefaults(b);
    }

    @Override
    protected void uninstallListeners(AbstractButton b) {
        this.switchComp.removePropertyChangeListener(componentPropertyChangeListener);
        this.componentPropertyChangeListener = null;

        this.switchComp.getProjection().getContentModel().removePropertyChangeListener(
                this.projectionPropertyChangeListener);
        this.projectionPropertyChangeListener = null;

        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        super.uninstallListeners(b);
    }

    @Override
    protected BasicButtonListener createButtonListener(AbstractButton b) {
        return new RolloverButtonListener(b, this.stateTransitionTracker);
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        Insets insets = this.switchComp.getInsets();
        Dimension trackSize = this.switchComp.getProjection().getPresentationModel().getTrackSize();

        int width = insets.left + trackSize.width + insets.right;
        int height = insets.top + trackSize.height + insets.bottom;
        return new Dimension(width, height);
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
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        this.paint(g, c);
        g2d.dispose();
    }
}
