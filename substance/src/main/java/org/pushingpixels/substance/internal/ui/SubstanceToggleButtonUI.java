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
package org.pushingpixels.substance.internal.ui;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.substance.internal.utils.border.SubstanceButtonBorder;
import org.pushingpixels.substance.internal.utils.icon.GlowingIcon;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostingListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.plaf.basic.BasicToggleButtonUI;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;

/**
 * UI for toggle buttons in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceToggleButtonUI extends BasicToggleButtonUI implements
        TransitionAwareUI {
    /**
     * Painting delegate.
     */
    private ButtonBackgroundDelegate delegate;

    /**
     * The matching glowing icon. Is used only when
     * {@link AnimationConfigurationManager#isAnimationAllowed(AnimationFacet, Component)}
     * returns true on {@link AnimationFacet#ICON_GLOW}.
     */
    private GlowingIcon glowingIcon;

    /**
     * Property change listener. Listens on changes to the
     * {@link SubstanceSynapse#BUTTON_SHAPER} property and
     * {@link AbstractButton#MODEL_CHANGED_PROPERTY} property.
     */
    private PropertyChangeListener substancePropertyListener;

    /**
     * Tracker for visual state transitions.
     */
    private ButtonVisualStateTracker substanceVisualStateTracker;

    /**
     * Model change listener for ghost image effects.
     */
    private GhostingListener ghostModelChangeListener;

    private JToggleButton toggleButton;

    private Color textColor;

    private Rectangle viewRect = new Rectangle();

    private Rectangle iconRect = new Rectangle();

    private Rectangle textRect = new Rectangle();

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceToggleButtonUI((JToggleButton) comp);
    }

    /**
     * Simple constructor.
     */
    private SubstanceToggleButtonUI(JToggleButton toggleButton) {
        this.toggleButton = toggleButton;
        this.delegate = new ButtonBackgroundDelegate();
    }

    @Override
    public void installDefaults(AbstractButton b) {
        super.installDefaults(b);
        if (b.getClientProperty(SubstanceButtonUI.BORDER_ORIGINAL) == null)
            b.putClientProperty(SubstanceButtonUI.BORDER_ORIGINAL, b
                    .getBorder());

        if (b.getClientProperty(SubstanceButtonUI.BORDER_ORIGINAL) == null)
            b.putClientProperty(SubstanceButtonUI.BORDER_ORIGINAL, b
                    .getBorder());

        SubstanceButtonShaper shaper = SubstanceCoreUtilities
                .getButtonShaper(b);

        if (b.getClientProperty(SubstanceButtonUI.BORDER_COMPUTED) == null) {
            b.setBorder(shaper.getButtonBorder(b));
        } else {
            Border currBorder = b.getBorder();
            if (!(currBorder instanceof SubstanceButtonBorder)) {
                b.setBorder(shaper.getButtonBorder(b));
            } else {
                SubstanceButtonBorder sbCurrBorder = (SubstanceButtonBorder) currBorder;
                if (shaper.getClass() != sbCurrBorder.getButtonShaperClass())
                    b.setBorder(shaper.getButtonBorder(b));
            }
        }
        b.putClientProperty(SubstanceButtonUI.OPACITY_ORIGINAL, b.isOpaque());
        // fix for defect 140
        b.setOpaque(false);

        b.setRolloverEnabled(true);

        LookAndFeel.installProperty(b, "iconTextGap", SubstanceSizeUtils
                .getTextIconGap(SubstanceSizeUtils.getComponentFontSize(b)));
    }

    @Override
    public void uninstallDefaults(AbstractButton b) {
        super.uninstallDefaults(b);

        b.setBorder((Border) b
                .getClientProperty(SubstanceButtonUI.BORDER_ORIGINAL));
        b.setOpaque((Boolean) b
                .getClientProperty(SubstanceButtonUI.OPACITY_ORIGINAL));
        b.putClientProperty(SubstanceButtonUI.OPACITY_ORIGINAL, null);
    }

    @Override
    protected BasicButtonListener createButtonListener(AbstractButton b) {
        return null;
    }

    @Override
    protected void installListeners(final AbstractButton b) {
        super.installListeners(b);

        this.substanceVisualStateTracker = new ButtonVisualStateTracker();
        this.substanceVisualStateTracker.installListeners(b, true);

        this.trackGlowingIcon();

        this.substancePropertyListener = propertyChangeEvent -> {
            if (AbstractButton.ICON_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                trackGlowingIcon();
            }

            if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                if (ghostModelChangeListener != null) {
                    ghostModelChangeListener.unregisterListeners();
                }
                ghostModelChangeListener = new GhostingListener(b, b.getModel());
                ghostModelChangeListener.registerListeners();
            }
        };
        b.addPropertyChangeListener(this.substancePropertyListener);

        this.ghostModelChangeListener = new GhostingListener(b, b.getModel());
        this.ghostModelChangeListener.registerListeners();
    }

    @Override
    protected void uninstallListeners(AbstractButton b) {
        this.substanceVisualStateTracker.uninstallListeners(b);
        this.substanceVisualStateTracker = null;

        b.removePropertyChangeListener(this.substancePropertyListener);
        this.substancePropertyListener = null;

        this.ghostModelChangeListener.unregisterListeners();
        this.ghostModelChangeListener = null;

        super.uninstallListeners(b);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        final AbstractButton b = (AbstractButton) c;

        FontMetrics fm = g.getFontMetrics();

        Insets i = c.getInsets();

        viewRect.x = i.left;
        viewRect.y = i.top;
        viewRect.width = b.getWidth() - (i.right + viewRect.x);
        viewRect.height = b.getHeight() - (i.bottom + viewRect.y);

        textRect.x = textRect.y = textRect.width = textRect.height = 0;
        iconRect.x = iconRect.y = iconRect.width = iconRect.height = 0;

        Font f = c.getFont();

        // layout the text and icon
        String text = SwingUtilities.layoutCompoundLabel(c, fm, b.getText(), b
                .getIcon(), b.getVerticalAlignment(), b
                .getHorizontalAlignment(), b.getVerticalTextPosition(), b
                .getHorizontalTextPosition(), viewRect, iconRect, textRect, b
                .getText() == null ? 0 : b.getIconTextGap());

        Graphics2D g2d = (Graphics2D) g.create();

        View v = (View) c.getClientProperty(BasicHTML.propertyKey);
        g2d.setFont(f);

        this.delegate.updateBackground(g2d, b);
        if (v != null) {
            v.paint(g2d, textRect);
        } else {
            this.textColor = this.paintButtonText(g2d, b, textRect, text);
        }

        // Paint the Icon
        if (b.getIcon() != null) {
            paintIcon(g2d, b, iconRect);
        }

        if (b.isFocusPainted()) {
            SubstanceCoreUtilities.paintFocus(g, b, b, this, null, textRect,
                    1.0f, SubstanceSizeUtils
                            .getFocusRingPadding(SubstanceSizeUtils
                                    .getComponentFontSize(b)));
        }
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        AbstractButton button = (AbstractButton) c;
        SubstanceButtonShaper shaper = SubstanceCoreUtilities
                .getButtonShaper(button);

        // fix for defect 263
        Dimension superPref = SubstanceMetricsUtilities.getPreferredButtonSize(button);
        if (superPref == null) {
            return null;
        }

        if (shaper == null) {
            return superPref;
        }

        return shaper.getPreferredSize(button, superPref);
    }

    @Override
    public boolean contains(JComponent c, int x, int y) {
        return ButtonBackgroundDelegate.contains((JToggleButton) c, x, y);
    }

    @Override
    protected void paintIcon(Graphics g, AbstractButton b, Rectangle iconRect) {
        b.putClientProperty("icon.bounds", new Rectangle(iconRect));

        Graphics2D graphics = (Graphics2D) g.create();
        GhostPaintingUtils.paintGhostIcon(graphics, b, iconRect);

        // We have three types of icons:
        // 1. The original button icon
        // 2. The themed version of 1.
        // 3. The glowing version of 1.
        Icon originalIcon = SubstanceCoreUtilities.getOriginalIcon(b, b.getIcon());

        graphics.setComposite(WidgetUtilities.getAlphaComposite(b, g));
        float activeAmount = this.substanceVisualStateTracker
                .getStateTransitionTracker().getActiveStrength();
        graphics.translate(iconRect.x, iconRect.y);
        if (activeAmount >= 0.0f) {
            if (AnimationConfigurationManager.getInstance().isAnimationAllowed(
                    AnimationFacet.ICON_GLOW, b)
                    && this.substanceVisualStateTracker.getStateTransitionTracker().
                    getIconGlowTracker().isPlaying()) {
                this.glowingIcon.paintIcon(b, graphics, 0, 0);
            } else {
                SubstanceSlices.IconThemingStrategy iconThemingStrategy =
                        SubstanceCoreUtilities.getIconThemingType(b);
                Icon themedIcon = (!(b instanceof JRadioButton)
                        && !(b instanceof JCheckBox)
                        && (iconThemingStrategy != null))
                        ? SubstanceCoreUtilities.getThemedIcon(b, originalIcon, this.textColor)
                        : originalIcon;
                themedIcon.paintIcon(b, graphics, 0, 0);
                if ((activeAmount > 0.0f) && (iconThemingStrategy != null)
                        && iconThemingStrategy.isForInactiveState()
                        && (originalIcon != themedIcon)) {
                    graphics.setComposite(WidgetUtilities.getAlphaComposite(b, activeAmount, g));
                    originalIcon.paintIcon(b, graphics, 0, 0);
                }
            }
        } else {
            originalIcon.paintIcon(b, graphics, 0, 0);
        }

        graphics.dispose();
    }

    /**
     * Paints the text.
     *
     * @param g        Graphic context
     * @param button   Button
     * @param textRect Text rectangle
     * @param text     Text to paint
     */
    private Color paintButtonText(Graphics g, AbstractButton button,
            Rectangle textRect, String text) {
        return SubstanceTextUtilities.paintText(g, button, textRect, text, (button)
                .getDisplayedMnemonicIndex());
    }

    /**
     * Tracks possible usage of glowing icon.
     */
    private void trackGlowingIcon() {
        Icon currIcon = this.toggleButton.getIcon();
        if (currIcon instanceof GlowingIcon)
            return;
        if (currIcon == null)
            return;
        this.glowingIcon = new GlowingIcon(currIcon,
                this.substanceVisualStateTracker.getStateTransitionTracker()
                        .getIconGlowTracker());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, c.getFont());
        this.paint(g2d, c);
        g2d.dispose();
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return this.contains(this.toggleButton, me.getX(), me.getY());
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.substanceVisualStateTracker.getStateTransitionTracker();
    }
}
