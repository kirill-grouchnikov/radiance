/*
 * Copyright (c) 2005-2010 Substance Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.flamingo.ribbon.ui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;

import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.BasicRibbonApplicationMenuButtonUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.appmenu.JRibbonApplicationMenuButton;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.flamingo.common.GlowingResizableIcon;
import org.pushingpixels.substance.flamingo.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.substance.flamingo.utils.CommandButtonBackgroundDelegate;
import org.pushingpixels.substance.flamingo.utils.CommandButtonVisualStateTracker;
import org.pushingpixels.substance.flamingo.utils.RibbonApplicationMenuButtonBackgroundDelegate;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostingListener;

/**
 * UI for {@link JRibbonApplicationMenuButton} components in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceRibbonApplicationMenuButtonUI extends BasicRibbonApplicationMenuButtonUI
        implements ActionPopupTransitionAwareUI {
    /**
     * Model change listener for ghost image effects.
     */
    private GhostingListener substanceModelChangeListener;

    /**
     * Property change listener.
     */
    protected PropertyChangeListener substancePropertyListener;

    /**
     * Tracker for visual state transitions.
     */
    protected CommandButtonVisualStateTracker substanceVisualStateTracker;

    /**
     * The matching glowing icon. Is used only when
     * {@link AnimationConfigurationManager#isAnimationAllowed(AnimationFacet, Component)} returns
     * true on {@link AnimationFacet#ICON_GLOW}.
     */
    protected GlowingResizableIcon glowingIcon;

    public static ComponentUI createUI(JComponent c) {
        return new SubstanceRibbonApplicationMenuButtonUI();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jvnet.flamingo.common.ui.BasicCommandButtonUI#installListeners()
     */
    @Override
    protected void installListeners() {
        super.installListeners();

        this.substanceVisualStateTracker = new CommandButtonVisualStateTracker();
        this.substanceVisualStateTracker.installListeners(this.commandButton);

        this.substancePropertyListener = (PropertyChangeEvent evt) -> {
            if ("icon".equals(evt.getPropertyName())) {
                trackGlowingIcon();
            }
        };
        this.commandButton.addPropertyChangeListener(this.substancePropertyListener);

        this.substanceModelChangeListener = new GhostingListener(this.commandButton,
                this.commandButton.getActionModel());
        this.substanceModelChangeListener.registerListeners();

        this.trackGlowingIcon();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jvnet.flamingo.common.ui.BasicCommandButtonUI#uninstallListeners()
     */
    @Override
    protected void uninstallListeners() {
        this.substanceVisualStateTracker.uninstallListeners(this.commandButton);
        this.substanceVisualStateTracker = null;

        this.commandButton.removePropertyChangeListener(this.substancePropertyListener);
        this.substancePropertyListener = null;

        this.substanceModelChangeListener.unregisterListeners();
        this.substanceModelChangeListener = null;

        super.uninstallListeners();
    }

    /**
     * Tracks possible usage of glowing icon.
     * 
     * @param b
     *            Button.
     */
    protected void trackGlowingIcon() {
        ResizableIcon currIcon = this.commandButton.getIcon();
        if (currIcon instanceof GlowingResizableIcon)
            return;
        if (currIcon == null)
            return;
        this.glowingIcon = new GlowingResizableIcon(currIcon, this.substanceVisualStateTracker
                .getPopupStateTransitionTracker().getIconGlowTracker());
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.plaf.basic.BasicButtonUI#paint(java.awt.Graphics, javax.swing.JComponent)
     */
    @Override
    public void paint(Graphics g, JComponent c) {
        JRibbonApplicationMenuButton b = (JRibbonApplicationMenuButton) c;

        this.layoutInfo = this.layoutManager.getLayoutInfo(this.commandButton, g);
        commandButton.putClientProperty("icon.bounds", layoutInfo.iconRect);

        Graphics2D g2d = (Graphics2D) g.create();
        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(commandButton);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities
                .getBorderPainter(commandButton);
        BufferedImage fullAlphaBackground = RibbonApplicationMenuButtonBackgroundDelegate
                .getFullAlphaBackground(b, fillPainter, borderPainter, commandButton.getWidth() - 2,
                        commandButton.getHeight() - 2);
        double scaleFactor = UIUtil.getScaleFactor();
        g2d.drawImage(fullAlphaBackground, 0, 0, (int) (fullAlphaBackground.getWidth() / scaleFactor),
                (int) (fullAlphaBackground.getHeight() / scaleFactor), null);

        // Paint the icon
        ResizableIcon icon = b.getIcon();
        if (icon != null) {
            int iconWidth = icon.getIconWidth();
            int iconHeight = icon.getIconHeight();
            Rectangle iconRect = new Rectangle((commandButton.getWidth() - iconWidth) / 2 - 1,
                    (commandButton.getHeight() - iconHeight) / 2 - 1, iconWidth, iconHeight);
            paintButtonIcon(g2d, iconRect);
        }

        g2d.dispose();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jvnet.flamingo.common.ui.BasicCommandButtonUI#paintButtonIcon(java .awt.Graphics,
     * java.awt.Rectangle)
     */
    @Override
    protected void paintButtonIcon(Graphics g, Rectangle iconRect) {
        Icon regular = this.applicationMenuButton.isEnabled() ? this.applicationMenuButton.getIcon()
                : this.applicationMenuButton.getDisabledIcon();
        if (regular == null)
            return;

        if (regular != null) {
            Graphics2D g2d = (Graphics2D) g.create();

            GhostPaintingUtils.paintGhostIcon(g2d, this.applicationMenuButton, regular, iconRect);
            g2d.setComposite(WidgetUtilities.getAlphaComposite(this.applicationMenuButton, g));

            CommandButtonBackgroundDelegate.paintCommandButtonIcon(g2d, iconRect,
                    this.applicationMenuButton, regular, glowingIcon,
                    this.applicationMenuButton.getPopupModel(),
                    this.substanceVisualStateTracker.getPopupStateTransitionTracker());
            g2d.dispose();
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jvnet.flamingo.ribbon.ui.appmenu.BasicRibbonApplicationMenuButtonUI
     * #update(java.awt.Graphics, javax.swing.JComponent)
     */
    @Override
    public void update(Graphics g, JComponent c) {
        this.paint(g, c);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.jvnet.substance.SubstanceButtonUI#contains(javax.swing.JComponent, int, int)
     */
    @Override
    public boolean contains(JComponent c, int x, int y) {
        // allow clicking anywhere in the area (around the button
        // round outline as well) to activate the button.
        return (x >= 0) && (x < c.getWidth()) && (y >= 0) && (y < c.getHeight());
    }

    @Override
    public StateTransitionTracker getActionTransitionTracker() {
        return this.substanceVisualStateTracker.getActionStateTransitionTracker();
    }

    @Override
    public StateTransitionTracker getPopupTransitionTracker() {
        return this.substanceVisualStateTracker.getPopupStateTransitionTracker();
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.substanceVisualStateTracker.getPopupStateTransitionTracker();
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return true;
    }
}
