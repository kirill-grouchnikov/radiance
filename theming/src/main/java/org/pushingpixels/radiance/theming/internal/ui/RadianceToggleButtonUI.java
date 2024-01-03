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
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.shaper.RadianceButtonShaper;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
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
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.plaf.basic.BasicToggleButtonUI;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;

/**
 * UI for toggle buttons in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceToggleButtonUI extends BasicToggleButtonUI implements
        TransitionAwareUI {
    /**
     * Painting delegate.
     */
    private ButtonBackgroundDelegate delegate;

    /**
     * The matching glowing icon. Is used only when
     * {@link AnimationConfigurationManager#isAnimationAllowed(RadianceThemingSlices.AnimationFacet, Component)}
     * returns true on {@link RadianceThemingSlices.AnimationFacet#ICON_GLOW}.
     */
    private GlowingIcon glowingIcon;

    /**
     * Property change listener. Listens on changes to the
     * {@link RadianceSynapse#BUTTON_SHAPER} property and
     * {@link AbstractButton#MODEL_CHANGED_PROPERTY} property.
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

    private JToggleButton toggleButton;

    private Color textColor;

    private Rectangle viewRect = new Rectangle();

    private Rectangle iconRect = new Rectangle();

    private Rectangle textRect = new Rectangle();

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceToggleButtonUI((JToggleButton) comp);
    }

    /**
     * Simple constructor.
     */
    protected RadianceToggleButtonUI(JToggleButton toggleButton) {
        this.toggleButton = toggleButton;
        this.delegate = new ButtonBackgroundDelegate();
    }

    @Override
    public void installDefaults(AbstractButton b) {
        super.installDefaults(b);
        if (b.getClientProperty(RadianceButtonUI.BORDER_ORIGINAL) == null)
            b.putClientProperty(RadianceButtonUI.BORDER_ORIGINAL, b
                    .getBorder());

        if (b.getClientProperty(RadianceButtonUI.BORDER_ORIGINAL) == null)
            b.putClientProperty(RadianceButtonUI.BORDER_ORIGINAL, b
                    .getBorder());

        RadianceButtonShaper shaper = RadianceCoreUtilities
                .getButtonShaper(b);

        if (b.getClientProperty(RadianceButtonUI.BORDER_COMPUTED) == null) {
            b.setBorder(shaper.getButtonBorder(b));
        } else {
            Border currBorder = b.getBorder();
            if (!(currBorder instanceof RadianceButtonBorder)) {
                b.setBorder(shaper.getButtonBorder(b));
            } else {
                RadianceButtonBorder sbCurrBorder = (RadianceButtonBorder) currBorder;
                if (shaper.getClass() != sbCurrBorder.getButtonShaperClass())
                    b.setBorder(shaper.getButtonBorder(b));
            }
        }
        b.putClientProperty(RadianceButtonUI.OPACITY_ORIGINAL, b.isOpaque());
        // fix for defect 140
        b.setOpaque(false);

        b.setRolloverEnabled(true);

        LookAndFeel.installProperty(b, "iconTextGap", RadianceSizeUtils
                .getTextIconGap(RadianceSizeUtils.getComponentFontSize(b)));
    }

    @Override
    public void uninstallDefaults(AbstractButton b) {
        super.uninstallDefaults(b);

        b.setBorder((Border) b
                .getClientProperty(RadianceButtonUI.BORDER_ORIGINAL));
        b.setOpaque((Boolean) b
                .getClientProperty(RadianceButtonUI.OPACITY_ORIGINAL));
        b.putClientProperty(RadianceButtonUI.OPACITY_ORIGINAL, null);
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

            if (AbstractButton.MODEL_CHANGED_PROPERTY.equals(propertyChangeEvent.getPropertyName())) {
                if (ghostModelChangeListener != null) {
                    ghostModelChangeListener.unregisterListeners();
                }
                ghostModelChangeListener = new GhostingListener(b, b.getModel());
                ghostModelChangeListener.registerListeners();
            }
        };
        b.addPropertyChangeListener(this.radiancePropertyListener);

        this.ghostModelChangeListener = new GhostingListener(b, b.getModel());
        this.ghostModelChangeListener.registerListeners();
    }

    @Override
    protected void uninstallListeners(AbstractButton b) {
        this.radianceVisualStateTracker.uninstallListeners(b);
        this.radianceVisualStateTracker = null;

        b.removePropertyChangeListener(this.radiancePropertyListener);
        this.radiancePropertyListener = null;

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
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        AbstractButton button = (AbstractButton) c;
        RadianceButtonShaper shaper = RadianceCoreUtilities
                .getButtonShaper(button);

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
        return ButtonBackgroundDelegate.contains((JToggleButton) c, x, y);
    }

    @Override
    protected void paintIcon(Graphics g, AbstractButton b, Rectangle iconRect) {
        b.putClientProperty("icon.bounds", new Rectangle(iconRect));

        Graphics2D graphics = (Graphics2D) g.create();
        GhostPaintingUtils.paintGhostIcon(graphics, b, iconRect);

        Icon originalIcon = RadianceCoreUtilities.getOriginalIcon(b, b.getIcon());

        graphics.setComposite(WidgetUtilities.getAlphaComposite(b, g));
        graphics.translate(iconRect.x, iconRect.y);
        StateTransitionTracker stateTracker = this.radianceVisualStateTracker
                .getStateTransitionTracker();
        if (AnimationConfigurationManager.getInstance().isAnimationAllowed(
                RadianceThemingSlices.AnimationFacet.ICON_GLOW, b)
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
        return RadianceTextUtilities.paintText(g, button, textRect, text, (button)
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
        return this.contains(this.toggleButton, me.getX(), me.getY());
    }

    @Override
    public StateTransitionTracker getTransitionTracker() {
        return this.radianceVisualStateTracker.getStateTransitionTracker();
    }
}
