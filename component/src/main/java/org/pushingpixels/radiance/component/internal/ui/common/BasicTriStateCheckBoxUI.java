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
package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.model.TriStateButtonModel;
import org.pushingpixels.radiance.common.api.model.TriStateSelectionChangeEvent;
import org.pushingpixels.radiance.common.api.model.TriStateSelectionChangeListener;
import org.pushingpixels.radiance.common.api.model.TriStateSelectionCycler;
import org.pushingpixels.radiance.component.api.common.JTriStateCheckBox;
import org.pushingpixels.radiance.component.internal.theming.common.tristate.RolloverTriStateListener;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.blade.BladeColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceMetricsUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;

public abstract class BasicTriStateCheckBoxUI extends TriStateCheckBoxUI implements TransitionAwareUI {
    protected JTriStateCheckBox triStateCheckBox;

    private PropertyChangeListener componentPropertyChangeListener;
    private PropertyChangeListener projectionPropertyChangeListener;

    private TriStateSelectionChangeListener selectionChangeListener;

    private RolloverTriStateListener basicButtonListener;

    protected StateTransitionTracker stateTransitionTracker;

    protected Rectangle viewRect = new Rectangle();
    protected Rectangle iconRect = new Rectangle();
    protected Rectangle textRect = new Rectangle();

    protected int iconTextGap = 0;

    protected Icon radianceIcon;
    protected BladeColorScheme mutableFillColorScheme = new BladeColorScheme();
    protected BladeColorScheme mutableBorderColorScheme = new BladeColorScheme();
    protected BladeColorScheme mutableMarkColorScheme = new BladeColorScheme();

    public BasicTriStateCheckBoxUI(JTriStateCheckBox triStateCheckBox) {
        this.triStateCheckBox = triStateCheckBox;
        this.stateTransitionTracker = new StateTransitionTracker(this.triStateCheckBox,
                this.triStateCheckBox.getTriStateButtonModel());
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        installDefaults();
        installComponents();
        installListeners();
        installKeyboardActions();
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallKeyboardActions();
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();
        super.uninstallUI(c);
        this.triStateCheckBox = null;
    }

    /**
     * Installs default settings for the associated tri-state checkbox.
     */
    protected void installDefaults() {
        Border border = this.triStateCheckBox.getBorder();
        if (border == null || border instanceof UIResource) {
            this.triStateCheckBox.setBorder(RadianceSizeUtils.getCheckBoxBorder(
                    RadianceSizeUtils.getComponentFontSize(this.triStateCheckBox),
                    this.triStateCheckBox.getComponentOrientation().isLeftToRight()));
        }
        this.iconTextGap = RadianceSizeUtils.getTextIconGap(
                RadianceSizeUtils.getComponentFontSize(this.triStateCheckBox));
        this.updateIcon();
    }

    /**
     * Installs listeners on the associated tri-state checkbox.
     */
    protected void installListeners() {
        this.stateTransitionTracker.registerModelListeners();
        this.stateTransitionTracker.registerFocusListeners();

        this.basicButtonListener = new RolloverTriStateListener(
                this.triStateCheckBox, this.stateTransitionTracker);
        this.triStateCheckBox.addMouseListener(this.basicButtonListener);
        this.triStateCheckBox.addMouseMotionListener(this.basicButtonListener);
        this.triStateCheckBox.addFocusListener(this.basicButtonListener);
        this.triStateCheckBox.addChangeListener(this.basicButtonListener);

        this.componentPropertyChangeListener = propertyChangeEvent -> {
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(triStateCheckBox::updateUI);
            }
        };
        this.triStateCheckBox.addPropertyChangeListener(componentPropertyChangeListener);

        this.projectionPropertyChangeListener = propertyChangeEvent -> {
            if ("enabled".equals(propertyChangeEvent.getPropertyName())) {
                triStateCheckBox.getTriStateButtonModel().setEnabled(
                        (Boolean) propertyChangeEvent.getNewValue());
            }
            if ("selectionState".equals(propertyChangeEvent.getPropertyName())) {
                triStateCheckBox.getTriStateButtonModel().setSelectionState(
                        (TriStateButtonModel.SelectionState) propertyChangeEvent.getNewValue());
            }
            if ("selectionCycler".equals(propertyChangeEvent.getPropertyName())) {
                triStateCheckBox.getTriStateButtonModel().setSelectionCycler(
                        (TriStateSelectionCycler) propertyChangeEvent.getNewValue());
            }
            this.triStateCheckBox.invalidate();
            this.triStateCheckBox.revalidate();
            this.triStateCheckBox.repaint();
        };
        this.triStateCheckBox.getProjection().getContentModel().addPropertyChangeListener(
                this.projectionPropertyChangeListener);

        this.selectionChangeListener = new TriStateSelectionChangeListener() {
            @Override
            public void itemTriStateSelectionChanged(TriStateSelectionChangeEvent e) {
                TriStateSelectionChangeListener selectionChangeListener =
                        triStateCheckBox.getProjection().getContentModel().getSelectionChangeListener();
                if (selectionChangeListener != null) {
                    selectionChangeListener.itemTriStateSelectionChanged(
                            new TriStateSelectionChangeEvent(triStateCheckBox,
                                    ItemEvent.ITEM_STATE_CHANGED,
                                    this,
                                    e.getSelectionStateChange()));
                }
            }
        };

        this.triStateCheckBox.getTriStateButtonModel().addSelectionChangeListener(this.selectionChangeListener);
    }

    protected void installKeyboardActions() {
        this.basicButtonListener.installKeyboardActions();
    }

    /**
     * Installs components on the associated tri-state checkbox.
     */
    protected void installComponents() {
    }

    /**
     * Uninstalls default settings from the associated tri-state checkbox.
     */
    protected void uninstallDefaults() {
        LookAndFeel.uninstallBorder(this.triStateCheckBox);
    }

    protected void uninstallKeyboardActions() {
        this.basicButtonListener.uninstallKeyboardActions();
    }

    /**
     * Uninstalls listeners from the associated tri-state checkbox.
     */
    protected void uninstallListeners() {
        this.triStateCheckBox.getTriStateButtonModel().removeSelectionChangeListener(this.selectionChangeListener);
        this.selectionChangeListener = null;

        this.triStateCheckBox.removePropertyChangeListener(componentPropertyChangeListener);
        this.componentPropertyChangeListener = null;

        this.triStateCheckBox.getProjection().getContentModel().removePropertyChangeListener(
                this.projectionPropertyChangeListener);
        this.projectionPropertyChangeListener = null;

        this.stateTransitionTracker.unregisterModelListeners();
        this.stateTransitionTracker.unregisterFocusListeners();

        this.triStateCheckBox.removeMouseListener(this.basicButtonListener);
        this.triStateCheckBox.removeMouseMotionListener(this.basicButtonListener);
        this.triStateCheckBox.removeFocusListener(this.basicButtonListener);
        this.triStateCheckBox.removeChangeListener(this.basicButtonListener);
        this.basicButtonListener = null;
    }

    /**
     * Uninstalls subcomponents from the associated tri-state checkbox.
     */
    protected void uninstallComponents() {
    }

    protected abstract void updateIcon();

    @Override
    public Dimension getPreferredSize(JComponent c) {
        String text = triStateCheckBox.getProjection().getContentModel().getText();
        Icon buttonIcon = this.radianceIcon;

        FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(RadianceCommonCortex.getScaleFactor(triStateCheckBox),
                triStateCheckBox.getFont());

        iconRect.setRect(0, 0, 0, 0);
        textRect.setRect(0, 0, 0, 0);
        viewRect.setRect(0, 0, Short.MAX_VALUE, Short.MAX_VALUE);

        SwingUtilities.layoutCompoundLabel(
                triStateCheckBox, fm, text, buttonIcon,
                SwingConstants.CENTER, SwingConstants.CENTER, SwingConstants.CENTER,
                SwingConstants.TRAILING,
                viewRect, iconRect, textRect,
                (text == null) ? 0 : this.iconTextGap);

        int minLeft = Math.min(iconRect.x, textRect.x);
        int maxRight = Math.max(iconRect.x + iconRect.width, textRect.x + textRect.width);
        int minTop = Math.min(iconRect.y, textRect.y);
        int maxBottom = Math.max(iconRect.y + iconRect.height, textRect.y + textRect.height);

        int width = maxRight - minLeft;
        int height = maxBottom - minTop;

        Insets insets = triStateCheckBox.getInsets();
        width += (insets.left + insets.right);
        height += (insets.top + insets.bottom);

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
