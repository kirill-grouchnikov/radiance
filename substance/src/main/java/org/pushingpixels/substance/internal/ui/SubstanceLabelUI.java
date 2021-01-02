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
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.SubstanceSynapse;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.text.View;
import java.awt.*;
import java.beans.PropertyChangeListener;

/**
 * UI for labels in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceLabelUI extends BasicLabelUI {
    /**
     * Property change listener.
     */
    private PropertyChangeListener substancePropertyChangeListener;
    private Rectangle paintIconR = new Rectangle();
    private Rectangle paintTextR = new Rectangle();
    private Rectangle paintViewR = new Rectangle();
    private Insets paintViewInsets = new Insets(0, 0, 0, 0);

    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceLabelUI();
    }

    private SubstanceLabelUI() {
    }

    @Override
    protected void installListeners(final JLabel c) {
        super.installListeners(c);

        this.substancePropertyChangeListener = propertyChangeEvent -> {
            if ("opaque".equals(propertyChangeEvent.getPropertyName())) {
                if (!Boolean.TRUE.equals(c.getClientProperty(SubstanceButtonUI.LOCK_OPACITY))) {
                    c.putClientProperty(SubstanceButtonUI.OPACITY_ORIGINAL, propertyChangeEvent.getNewValue());
                }
            }
        };
        c.addPropertyChangeListener(this.substancePropertyChangeListener);
    }

    @Override
    protected void uninstallListeners(JLabel c) {
        c.removePropertyChangeListener(this.substancePropertyChangeListener);
        this.substancePropertyChangeListener = null;

        super.uninstallListeners(c);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        JLabel label = (JLabel) c;
        String text = label.getText();
        Icon icon = label.isEnabled() ? label.getIcon() : label.getDisabledIcon();

        if ((icon == null) && (text == null)) {
            return;
        }

        float rolloverAmount = 0.0f;
        SubstanceSlices.IconThemingStrategy iconThemingStrategy =
                SubstanceCoreUtilities.getIconThemingType(label);

        Insets insets = label.getInsets(paintViewInsets);
        paintViewR.x = insets.left;
        paintViewR.y = insets.top;
        paintViewR.width = c.getWidth() - (insets.left + insets.right);
        paintViewR.height = c.getHeight() - (insets.top + insets.bottom);
        paintIconR.x = paintIconR.y = paintIconR.width = paintIconR.height = 0;
        paintTextR.x = paintTextR.y = paintTextR.width = paintTextR.height = 0;

        g.setFont(label.getFont());
        String clippedText = SwingUtilities.layoutCompoundLabel(label, g.getFontMetrics(), text,
                icon, label.getVerticalAlignment(), label.getHorizontalAlignment(),
                label.getVerticalTextPosition(), label.getHorizontalTextPosition(), paintViewR,
                paintIconR, paintTextR, label.getIconTextGap());

        Graphics2D g2d = (Graphics2D) g.create();
        BackgroundPaintingUtils.updateIfOpaque(g2d, c);

        // Paint the text
        ComponentState labelState = label.isEnabled() ? ComponentState.ENABLED
                : ComponentState.DISABLED_UNSELECTED;
        float labelAlpha = SubstanceColorSchemeUtilities.getAlpha(label, labelState);
        Color textColor = null;
        if (text != null) {
            final View v = (View) c.getClientProperty(BasicHTML.propertyKey);
            if (v != null) {
                v.paint(g2d, paintTextR);
            } else {
                if (label.getClientProperty(SubstanceSynapse.IS_TITLE_PANE_LABEL) == Boolean.TRUE) {
                    SubstanceSkin skin = SubstanceCoreUtilities.getSkin(label.getRootPane());
                    SubstanceColorScheme scheme = skin
                            .getEnabledColorScheme(SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
                    FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(label.getFont());
                    int yOffset = paintTextR.y + (int) ((paintTextR.getHeight() - fm.getHeight()) / 2)
                            + fm.getAscent();
                    g2d.translate(paintTextR.x + 3, 0);
                    textColor = scheme.getForegroundColor();
                    SubstanceTextUtilities.paintTextWithDropShadow(label, g2d,
                            textColor, scheme.getEchoColor(), clippedText,
                            paintTextR.width + 6, paintTextR.height, 0, yOffset);
                    g2d.translate(-paintTextR.x - 3, 0);
                } else {
                    // fix for issue 406 - use the same FG computation
                    // color as for other controls
                    textColor = SubstanceTextUtilities.paintText(g2d, label, paintTextR, clippedText,
                            label.getDisplayedMnemonicIndex(), labelState, labelAlpha);
                }
            }
        }

        // Get themed icon if relevant
        Icon themedIcon = null;
        if (label.isEnabled()) {
            if ((icon != null) && (iconThemingStrategy != null)) {
                if (label instanceof ThemedIconAwareRenderer) {
                    ThemedIconAwareRenderer themedIconAwareRenderer =
                            (ThemedIconAwareRenderer) label;
                    rolloverAmount = themedIconAwareRenderer.getRolloverArmAmount();
                }
                themedIcon = SubstanceCoreUtilities.getThemedIcon(c, icon, textColor);
            }
        }

        // Paint the icon
        if (icon != null) {
            g2d.translate(paintIconR.x, paintIconR.y);

            if (themedIcon != null) {
                themedIcon.paintIcon(c, g2d, 0, 0);
                if ((rolloverAmount > 0.0f) && (iconThemingStrategy != null)
                        && iconThemingStrategy.isForInactiveState()
                        && (icon != themedIcon)) {
                    g2d.setComposite(WidgetUtilities.getAlphaComposite(c, rolloverAmount, g));
                    icon.paintIcon(c, g2d, 0, 0);
                    g2d.setComposite(WidgetUtilities.getAlphaComposite(c, g));
                }
            } else {
                icon.paintIcon(c, g2d, 0, 0);
            }
            g2d.translate(-paintIconR.x, -paintIconR.y);
        }
        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        Dimension result = SubstanceMetricsUtilities.getPreferredLabelSize((JLabel) c);
        if (c.getClientProperty(SubstanceSynapse.IS_TITLE_PANE_LABEL) == Boolean.TRUE) {
            result.width += 6;
            result.height += 6;
        }
        return result;
    }

    @Override
    public void update(Graphics g, JComponent c) {
        // failsafe for LAF change
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, c.getFont());
        this.paint(g2d, c);
        g2d.dispose();
    }
}
