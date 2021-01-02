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
import org.pushingpixels.substance.api.SubstanceWidget;
import org.pushingpixels.substance.api.shaper.SubstanceButtonShaper;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.SubstanceWidgetRepository;
import org.pushingpixels.substance.internal.animation.ModificationAwareUI;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.TransitionAwareUI;
import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.substance.internal.utils.border.SubstanceButtonBorder;
import org.pushingpixels.substance.internal.utils.icon.GlowingIcon;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostingListener;
import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.Timeline.RepeatBehavior;
import org.pushingpixels.trident.api.swing.SwingRepaintCallback;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonListener;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.Set;

/**
 * UI for buttons in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceButtonUI extends BasicButtonUI implements
        TransitionAwareUI, ModificationAwareUI {
    /**
     * Property used during the button shaper switch.
     */
    public static final String BORDER_COMPUTED = "substancelaf.internal.buttonbordercomputed";

    /**
     * Property used during the button shaper switch.
     */
    public static final String BORDER_COMPUTING = "substancelaf.internal.buttonbordercomputing";

    /**
     * Property used to store the original (pre-<b>Substance</b>) button border.
     */
    static final String BORDER_ORIGINAL = "substancelaf.internal.buttonborderoriginal";

    /**
     * Property used to store the original button icon.
     */
    private static final String ICON_ORIGINAL = "substancelaf.internal.buttoniconoriginal";

    /**
     * Property used to store the original (pre-<b>Substance</b>) control opacity.
     */
    static final String OPACITY_ORIGINAL = "substancelaf.internal.controlopacityoriginal";

    /**
     * Property used to lock the original (pre-<b>Substance</b>) button opacity.
     */
    static final String LOCK_OPACITY = "substancelaf.internal.lockopacity";

    /**
     * Internal property used to mark close buttons on title panes.
     */
    public static final String IS_TITLE_CLOSE_BUTTON = "substancelaf.internal.isTitleCloseButton";

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
     * Property change listener.
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

    private Set<SubstanceWidget<JComponent>> lafWidgets;

    protected AbstractButton button;

    private Color textColor;

    private Timeline modifiedTimeline;

    private Rectangle viewRect = new Rectangle();

    private Rectangle iconRect = new Rectangle();

    private Rectangle textRect = new Rectangle();

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceButtonUI((AbstractButton) comp);
    }

    /**
     * Simple constructor.
     */
    private SubstanceButtonUI(AbstractButton button) {
        this.button = button;
        this.delegate = new ButtonBackgroundDelegate();
    }

    @Override
    public void installUI(JComponent c) {
        this.lafWidgets = SubstanceWidgetRepository.getRepository().getMatchingWidgets(c);

        super.installUI(c);

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.installUI();
        }
    }

    @Override
    public void uninstallUI(JComponent c) {
        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.uninstallUI();
        }
        super.uninstallUI(c);
    }

    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);

        if (b.getClientProperty(SubstanceButtonUI.BORDER_ORIGINAL) == null) {
            b.putClientProperty(SubstanceButtonUI.BORDER_ORIGINAL, b.getBorder());
        }

        SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(b);

        if (b.getClientProperty(SubstanceButtonUI.BORDER_COMPUTED) == null) {
            b.setBorder(shaper.getButtonBorder(b));
        } else {
            Border currBorder = b.getBorder();
            if (!(currBorder instanceof SubstanceButtonBorder)) {
                b.setBorder(shaper.getButtonBorder(b));
            } else {
                SubstanceButtonBorder sbCurrBorder = (SubstanceButtonBorder) currBorder;
                if (shaper.getClass() != sbCurrBorder.getButtonShaperClass()) {
                    b.setBorder(shaper.getButtonBorder(b));
                }
            }
        }
        b.putClientProperty(SubstanceButtonUI.OPACITY_ORIGINAL, b.isOpaque());
        b.setOpaque(false);

        b.setRolloverEnabled(true);

        LookAndFeel.installProperty(b, "iconTextGap", SubstanceSizeUtils
                .getTextIconGap(SubstanceSizeUtils.getComponentFontSize(b)));

        if (Boolean.TRUE.equals(b.getClientProperty(SubstanceSynapse.CONTENTS_MODIFIED))) {
            trackModificationFlag();
        }
        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.installDefaults();
        }
    }

    @Override
    protected void uninstallDefaults(AbstractButton b) {
        super.uninstallDefaults(b);

        b.setBorder((Border) b.getClientProperty(SubstanceButtonUI.BORDER_ORIGINAL));
        b.setOpaque((Boolean) b.getClientProperty(SubstanceButtonUI.OPACITY_ORIGINAL));
        Icon origIcon = (Icon) b.getClientProperty(SubstanceButtonUI.ICON_ORIGINAL);
        if (origIcon != null) {
            b.setIcon(origIcon);
        }
        b.putClientProperty(SubstanceButtonUI.OPACITY_ORIGINAL, null);

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.uninstallDefaults();
        }
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

            if (SubstanceSynapse.CONTENTS_MODIFIED.equals(propertyChangeEvent.getPropertyName())) {
                boolean newValue = (Boolean) propertyChangeEvent.getNewValue();
                if (newValue) {
                    trackModificationFlag();
                } else {
                    if (modifiedTimeline != null) {
                        modifiedTimeline.cancel();
                    }
                }
            }

            if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                if (ghostModelChangeListener != null)
                    ghostModelChangeListener.unregisterListeners();
                ghostModelChangeListener = new GhostingListener(b, b
                        .getModel());
                ghostModelChangeListener.registerListeners();
            }
        };
        b.addPropertyChangeListener(this.substancePropertyListener);

        this.ghostModelChangeListener = new GhostingListener(b, b.getModel());
        this.ghostModelChangeListener.registerListeners();

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.installListeners();
        }
    }

    @Override
    protected void uninstallListeners(AbstractButton b) {
        this.substanceVisualStateTracker.uninstallListeners(b);
        this.substanceVisualStateTracker = null;

        b.removePropertyChangeListener(this.substancePropertyListener);
        this.substancePropertyListener = null;

        this.ghostModelChangeListener.unregisterListeners();
        this.ghostModelChangeListener = null;

        for (SubstanceWidget lafWidget : this.lafWidgets) {
            lafWidget.uninstallListeners();
        }

        super.uninstallListeners(b);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel())
            return;

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
        String text = SwingUtilities.layoutCompoundLabel(c, fm, b.getText(),
                b.getIcon(), b.getVerticalAlignment(), b.getHorizontalAlignment(),
                b.getVerticalTextPosition(), b.getHorizontalTextPosition(), viewRect,
                iconRect, textRect, b.getText() == null ? 0 : b.getIconTextGap());

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
            paintIcon(g2d, c, iconRect);
        }

        if (b.isFocusPainted()) {
            SubstanceCoreUtilities.paintFocus(g2d, b, b, this, null, textRect,
                    1.0f, SubstanceSizeUtils
                            .getFocusRingPadding(SubstanceSizeUtils
                                    .getComponentFontSize(b)));
        }
        g2d.dispose();

        // g2d.setColor(Color.red);
        // g2d.draw(iconRect);
        // g2d.draw(viewRect);
        // g2d.draw(textRect);

        // if (isPartOfCompositeControl) {
        // g.drawImage(offscreen, 0, 0, null);
        // }

    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        AbstractButton button = (AbstractButton) c;
        SubstanceButtonShaper shaper = SubstanceCoreUtilities.getButtonShaper(button);

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
        return ButtonBackgroundDelegate.contains((JButton) c, x, y);
    }

    @Override
    protected void paintIcon(Graphics g, JComponent c, Rectangle iconRect) {
        c.putClientProperty("icon.bounds", new Rectangle(iconRect));

        Graphics2D graphics = (Graphics2D) g.create();
        GhostPaintingUtils.paintGhostIcon(graphics, (AbstractButton) c, iconRect);

//		 graphics.setColor(Color.blue);
//		 graphics.fill(iconRect);

        // We have three types of icons:
        // 1. The original button icon
        // 2. The themed version of 1.
        // 3. The glowing version of 1.
        AbstractButton b = (AbstractButton) c;
        Icon originalIcon = SubstanceCoreUtilities.getOriginalIcon(b, b.getIcon());

        graphics.setComposite(WidgetUtilities.getAlphaComposite(b, g));
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        float activeAmount = this.substanceVisualStateTracker
                .getStateTransitionTracker().getActiveStrength();
        graphics.translate(iconRect.x, iconRect.y);
        if (activeAmount >= 0.0f) {
            if (AnimationConfigurationManager.getInstance().isAnimationAllowed(
                    AnimationFacet.ICON_GLOW, b)
                    && this.substanceVisualStateTracker
                    .getStateTransitionTracker().getIconGlowTracker().isPlaying()) {
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
        return SubstanceTextUtilities.paintText(g, button, textRect, text,
                button.getDisplayedMnemonicIndex());
    }

    /**
     * Tracks possible usage of glowing icon.
     */
    private void trackGlowingIcon() {
        Icon currIcon = this.button.getIcon();
        if (currIcon instanceof GlowingIcon) {
            return;
        }
        if (currIcon == null) {
            return;
        }
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
        return this.contains(this.button, me.getX(), me.getY());
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.substanceVisualStateTracker.getStateTransitionTracker();
    }

    private void trackModificationFlag() {
        this.modifiedTimeline =
                AnimationConfigurationManager.getInstance().modifiedTimelineBuilder(this.button)
                        .addCallback(new SwingRepaintCallback(this.button))
                        .build();

        this.modifiedTimeline.playLoop(RepeatBehavior.REVERSE);
    }

    @Override
    public Timeline getModificationTimeline() {
        return this.modifiedTimeline;
    }
}
