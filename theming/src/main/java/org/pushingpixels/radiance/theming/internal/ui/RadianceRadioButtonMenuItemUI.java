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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.RolloverMenuItemListener;
import org.pushingpixels.radiance.theming.internal.utils.icon.RadioButtonMenuItemIcon;
import org.pushingpixels.radiance.theming.internal.utils.menu.MenuUtilities;
import org.pushingpixels.radiance.theming.internal.utils.menu.RadianceMenu;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.UIResource;
import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;

/**
 * UI for radio button menu items in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceRadioButtonMenuItemUI extends BasicRadioButtonMenuItemUI
        implements RadianceMenu, TransitionAwareUI {
    /**
     * Rollover listener.
     */
    private RolloverMenuItemListener radianceRolloverListener;

    private StateTransitionTracker stateTransitionTracker;

    /**
     * Property change listener. Listens on changes to
     * {@link AbstractButton#MODEL_CHANGED_PROPERTY} property.
     */
    private PropertyChangeListener radiancePropertyListener;

    /**
     * Listens on all changes to the underlying menu item.
     */
    private MenuUtilities.MenuPropertyListener radianceMenuPropertyListener;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        JRadioButtonMenuItem item = (JRadioButtonMenuItem) comp;
        item.setRolloverEnabled(true);

        return new RadianceRadioButtonMenuItemUI((JRadioButtonMenuItem) comp);
    }

    protected RadianceRadioButtonMenuItemUI(JRadioButtonMenuItem menuItem) {
        this.stateTransitionTracker = new StateTransitionTracker(menuItem, menuItem.getModel());
    }

    @Override
    protected void installListeners() {
        super.installListeners();

        // Improving performance on big menus.
        this.radianceMenuPropertyListener = new MenuUtilities.MenuPropertyListener(this.menuItem);
        this.radianceMenuPropertyListener.install();

        // fix for defect 109 - storing reference to rollover listener
        this.radianceRolloverListener = new RolloverMenuItemListener(
                this.menuItem, this.stateTransitionTracker);
        this.menuItem.addMouseListener(this.radianceRolloverListener);

        this.stateTransitionTracker.registerModelListeners();

        this.radiancePropertyListener = propertyChangeEvent -> {
            if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                stateTransitionTracker.setModel((ButtonModel) propertyChangeEvent.getNewValue());
            }
            if ("font".equals(propertyChangeEvent.getPropertyName())) {
                SwingUtilities.invokeLater(() -> {
                    if (menuItem != null) {
                        menuItem.updateUI();
                    }
                });
            }
        };
        this.menuItem.addPropertyChangeListener(this.radiancePropertyListener);
    }

    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();

        // Improving performance on big menus.
        this.radianceMenuPropertyListener.uninstall();
        this.radianceMenuPropertyListener = null;

        // fix for defect 109 - unregistering rollover listener
        this.menuItem.removeMouseListener(this.radianceRolloverListener);
        this.radianceRolloverListener = null;

        this.menuItem.removePropertyChangeListener(this.radiancePropertyListener);
        this.radiancePropertyListener = null;

        this.stateTransitionTracker.unregisterModelListeners();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        this.updateCheckIconIfNeeded();
        this.defaultTextIconGap = RadianceSizeUtils.getTextIconGap(
                RadianceSizeUtils.getComponentFontSize(this.menuItem));
    }

    @Override
    public void updateCheckIconIfNeeded() {
        if (this.checkIcon == null || this.checkIcon instanceof UIResource) {
            this.checkIcon = new RadioButtonMenuItemIcon(this.menuItem,
                    RadianceSizeUtils.getMenuCheckMarkSize(RadianceSizeUtils
                            .getComponentFontSize(this.menuItem)));
        }
    }

    @Override
    public JMenuItem getAssociatedMenuItem() {
        return this.menuItem;
    }

    @Override
    public Font getAcceleratorFont() {
        return this.acceleratorFont;
    }

    @Override
    public Icon getArrowIcon() {
        return this.arrowIcon;
    }

    @Override
    public Icon getCheckIcon() {
        return this.checkIcon;
    }

    @Override
    public int getDefaultTextIconGap() {
        return this.defaultTextIconGap;
    }

    @Override
    protected Dimension getPreferredMenuItemSize(JComponent c, Icon checkIcon,
            Icon arrowIcon, int defaultTextIconGap) {
        Dimension superDim = super.getPreferredMenuItemSize(c, checkIcon,
                arrowIcon, defaultTextIconGap);

        return new Dimension(MenuUtilities.getPreferredWidth(menuItem), superDim.height);
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return this.menuItem.getBounds().contains(me.getX(), me.getY());
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.stateTransitionTracker;
    }

    @Override
    protected void paintMenuItem(Graphics g, JComponent c, Icon checkIcon,
            Icon arrowIcon, Color background, Color foreground,
            int defaultTextIconGap) {
        MenuUtilities.paintMenuItem(g, menuItem, checkIcon, arrowIcon);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        super.update(g2d, c);
        g2d.dispose();
    }
}
