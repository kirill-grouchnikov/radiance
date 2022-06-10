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
package org.pushingpixels.radiance.theming.internal.ui;

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintCallback;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.AnimationFacet;
import org.pushingpixels.radiance.theming.api.RadianceThemingWidget;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.RadianceThemingWidgetRepository;
import org.pushingpixels.radiance.theming.internal.animation.ModificationAwareUI;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.TransitionAwareUI;
import org.pushingpixels.radiance.theming.internal.utils.*;
import org.pushingpixels.radiance.theming.internal.utils.border.RadianceButtonBorder;
import org.pushingpixels.radiance.theming.internal.utils.icon.GlowingIcon;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostPaintingUtils;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostingListener;

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
import java.util.Map;
import java.util.Set;

/**
 * UI for buttons in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceButtonUI extends BasicButtonUI implements
        TransitionAwareUI, ModificationAwareUI {
    /**
     * Property used during the button shaper switch.
     */
    public static final String BORDER_COMPUTED = "radiance.theming.internal.buttonbordercomputed";

    /**
     * Property used during the button shaper switch.
     */
    public static final String BORDER_COMPUTING = "radiance.theming.internal.buttonbordercomputing";

    /**
     * Property used to store the original (pre-<b>Radiance</b>) button border.
     */
    static final String BORDER_ORIGINAL = "radiance.theming.internal.buttonborderoriginal";

    /**
     * Property used to store the original button icon.
     */
    private static final String ICON_ORIGINAL = "radiance.theming.internal.buttoniconoriginal";

    /**
     * Property used to store the original (pre-<b>Radiance</b>) control opacity.
     */
    static final String OPACITY_ORIGINAL = "radiance.theming.internal.controlopacityoriginal";

    /**
     * Property used to lock the original (pre-<b>Radiance</b>) button opacity.
     */
    static final String LOCK_OPACITY = "radiance.theming.internal.lockopacity";

    /**
     * Internal property used to mark close buttons on title panes.
     */
    public static final String IS_TITLE_CLOSE_BUTTON = "radiance.theming.internal.isTitleCloseButton";

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
    private PropertyChangeListener radiancePropertyListener;

    /**
     * Tracker for visual state transitions.
     */
    private ButtonVisualStateTracker radianceVisualStateTracker;

    /**
     * Model change listener for ghost image effects.
     */
    private GhostingListener ghostModelChangeListener;

    private Set<RadianceThemingWidget<JComponent>> themingWidgets;

    protected AbstractButton button;

    private Color textColor;

    private Timeline modifiedTimeline;

    private Rectangle viewRect = new Rectangle();

    private Rectangle iconRect = new Rectangle();

    private Rectangle textRect = new Rectangle();

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceButtonUI((AbstractButton) comp);
    }

    /**
     * Simple constructor.
     */
    private RadianceButtonUI(AbstractButton button) {
        this.button = button;
        this.delegate = new ButtonBackgroundDelegate();
    }

    @Override
    public void installUI(JComponent c) {
        this.themingWidgets = RadianceThemingWidgetRepository.getRepository().getMatchingWidgets(c);

        super.installUI(c);

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installUI();
        }
    }

    @Override
    public void uninstallUI(JComponent c) {
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallUI();
        }
        super.uninstallUI(c);
    }

    @Override
    protected void installDefaults(AbstractButton b) {
        super.installDefaults(b);

        if (b.getClientProperty(RadianceButtonUI.BORDER_ORIGINAL) == null) {
            b.putClientProperty(RadianceButtonUI.BORDER_ORIGINAL, b.getBorder());
        }

        RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(b);

        if (b.getClientProperty(RadianceButtonUI.BORDER_COMPUTED) == null) {
            b.setBorder(shaper.getButtonBorder(b));
        } else {
            Border currBorder = b.getBorder();
            if (!(currBorder instanceof RadianceButtonBorder)) {
                b.setBorder(shaper.getButtonBorder(b));
            } else {
                RadianceButtonBorder sbCurrBorder = (RadianceButtonBorder) currBorder;
                if (shaper.getClass() != sbCurrBorder.getButtonShaperClass()) {
                    b.setBorder(shaper.getButtonBorder(b));
                }
            }
        }
        b.putClientProperty(RadianceButtonUI.OPACITY_ORIGINAL, b.isOpaque());
        b.setOpaque(false);

        b.setRolloverEnabled(true);

        LookAndFeel.installProperty(b, "iconTextGap", RadianceSizeUtils
                .getTextIconGap(RadianceSizeUtils.getComponentFontSize(b)));

        if (Boolean.TRUE.equals(b.getClientProperty(RadianceSynapse.CONTENTS_MODIFIED))) {
            trackModificationFlag();
        }
        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installDefaults();
        }
    }

    @Override
    protected void uninstallDefaults(AbstractButton b) {
        super.uninstallDefaults(b);

        b.setBorder((Border) b.getClientProperty(RadianceButtonUI.BORDER_ORIGINAL));
        b.setOpaque((Boolean) b.getClientProperty(RadianceButtonUI.OPACITY_ORIGINAL));
        Icon origIcon = (Icon) b.getClientProperty(RadianceButtonUI.ICON_ORIGINAL);
        if (origIcon != null) {
            b.setIcon(origIcon);
        }
        b.putClientProperty(RadianceButtonUI.OPACITY_ORIGINAL, null);

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallDefaults();
        }
    }

    @Override
    protected BasicButtonListener createButtonListener(AbstractButton b) {
        return null;
    }

    @Override
    protected void installListeners(final AbstractButton b) {
        super.installListeners(b);

        this.radianceVisualStateTracker = new ButtonVisualStateTracker();
        this.radianceVisualStateTracker.installListeners(b, true);

        this.trackGlowingIcon();

        this.radiancePropertyListener = propertyChangeEvent -> {
            if (AbstractButton.ICON_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                trackGlowingIcon();
            }

            if (RadianceSynapse.CONTENTS_MODIFIED.equals(propertyChangeEvent.getPropertyName())) {
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
        b.addPropertyChangeListener(this.radiancePropertyListener);

        this.ghostModelChangeListener = new GhostingListener(b, b.getModel());
        this.ghostModelChangeListener.registerListeners();

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.installListeners();
        }
    }

    @Override
    protected void uninstallListeners(AbstractButton b) {
        this.radianceVisualStateTracker.uninstallListeners(b);
        this.radianceVisualStateTracker = null;

        b.removePropertyChangeListener(this.radiancePropertyListener);
        this.radiancePropertyListener = null;

        this.ghostModelChangeListener.unregisterListeners();
        this.ghostModelChangeListener = null;

        for (RadianceThemingWidget themingWidget : this.themingWidgets) {
            themingWidget.uninstallListeners();
        }

        super.uninstallListeners(b);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        if (!RadianceCoreUtilities.isCurrentLookAndFeel())
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
            Graphics2D graphicsFocus = (Graphics2D) g2d.create();
            // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
            // to not normalize coordinates to paint at full pixels, and will result in blurry
            // outlines.
            graphicsFocus.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            RadianceCommonCortex.paintAtScale1x(graphicsFocus, 0, 0, b.getWidth(), b.getHeight(),
                    (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                        RadianceCoreUtilities.paintFocus(graphics1X, b, b, this, scaleFactor,
                                null, textRect, 1.0f,
                                (float) scaleFactor * RadianceSizeUtils.getFocusRingPadding(
                                        b, RadianceSizeUtils.getComponentFontSize(b)));
                    }
            );
            graphicsFocus.dispose();
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
        RadianceButtonShaper shaper = RadianceCoreUtilities.getButtonShaper(button);

        // fix for defect 263
        Dimension superPref = RadianceMetricsUtilities.getPreferredButtonSize(button);
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

        AbstractButton b = (AbstractButton) c;
        Icon originalIcon = RadianceCoreUtilities.getOriginalIcon(b, b.getIcon());

        graphics.setComposite(WidgetUtilities.getAlphaComposite(b, g));
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        StateTransitionTracker stateTracker = this.radianceVisualStateTracker
                .getStateTransitionTracker();
        graphics.translate(iconRect.x, iconRect.y);
        if (AnimationConfigurationManager.getInstance().isAnimationAllowed(
                AnimationFacet.ICON_GLOW, b)
                && stateTracker.getIconGlowTracker().isPlaying()) {
            this.glowingIcon.paintIcon(b, graphics, 0, 0);
        } else {
            StateTransitionTracker.ModelStateInfo stateInfo = stateTracker.getModelStateInfo();
            ComponentState currentState = stateInfo.getCurrModelState();
            if (currentState.isDisabled()) {
                // No support yet for transitions between disabled and enabled / active
                // states
                Icon disabledIcon = RadianceCoreUtilities.getFilteredIcon(b,
                        originalIcon, currentState, this.textColor);
                disabledIcon.paintIcon(b, graphics, 0, 0);
            } else {
                // Active states are painted on top of the icon that corresponds to the
                // enabled state
                Icon enabledIcon = RadianceCoreUtilities.getFilteredIcon(b,
                        originalIcon, ComponentState.ENABLED, this.textColor);
                enabledIcon.paintIcon(b, graphics, 0, 0);
                if (stateTracker.getActiveStrength() > 0.0f) {
                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> entry :
                            stateInfo.getStateContributionMap().entrySet()) {
                        if (entry.getKey() == ComponentState.ENABLED) {
                            continue;
                        }
                        float contribution = entry.getValue().getContribution();
                        if (contribution > 0.0f) {
                            Icon activeIcon = RadianceCoreUtilities.getFilteredIcon(b,
                                    originalIcon, entry.getKey(), this.textColor);
                            if (activeIcon != enabledIcon) {
                                graphics.setComposite(WidgetUtilities.getAlphaComposite(b, contribution, g));
                                activeIcon.paintIcon(b, graphics, 0, 0);
                            }
                        }
                    }
                }
            }
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
        return RadianceTextUtilities.paintText(g, button, textRect, text,
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
                this.radianceVisualStateTracker.getStateTransitionTracker()
                        .getIconGlowTracker());
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        this.paint(g2d, c);
        g2d.dispose();
    }

    @Override
    public boolean isInside(MouseEvent me) {
        return this.contains(this.button, me.getX(), me.getY());
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.radianceVisualStateTracker.getStateTransitionTracker();
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
