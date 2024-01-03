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
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.RadianceSynapse;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicHTML;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.text.View;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.util.Map;

/**
 * UI for labels in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceLabelUI extends BasicLabelUI {
    /**
     * Property change listener.
     */
    private PropertyChangeListener radiancePropertyChangeListener;
    private Rectangle paintIconR = new Rectangle();
    private Rectangle paintTextR = new Rectangle();
    private Rectangle paintViewR = new Rectangle();
    private Insets paintViewInsets = new Insets(0, 0, 0, 0);

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceLabelUI();
    }

    protected RadianceLabelUI() {
    }

    @Override
    protected void installListeners(final JLabel c) {
        super.installListeners(c);

        this.radiancePropertyChangeListener = propertyChangeEvent -> {
            if ("opaque".equals(propertyChangeEvent.getPropertyName())) {
                if (!Boolean.TRUE.equals(c.getClientProperty(RadianceButtonUI.LOCK_OPACITY))) {
                    c.putClientProperty(RadianceButtonUI.OPACITY_ORIGINAL, propertyChangeEvent.getNewValue());
                }
            }
        };
        c.addPropertyChangeListener(this.radiancePropertyChangeListener);
    }

    @Override
    protected void uninstallListeners(JLabel c) {
        c.removePropertyChangeListener(this.radiancePropertyChangeListener);
        this.radiancePropertyChangeListener = null;

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

        RadianceThemingSlices.IconFilterStrategy iconFilterStrategy = label.isEnabled()
                ? RadianceCoreUtilities.getEnabledIconFilterStrategy(label)
                : RadianceCoreUtilities.getDisabledIconFilterStrategy(label);

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
        float labelAlpha = RadianceColorSchemeUtilities.getAlpha(label, labelState);

        Color textColor;
        final View v = (View) c.getClientProperty(BasicHTML.propertyKey);
        if (v != null) {
            v.paint(g2d, paintTextR);
            // This text color may not correspond to the text of the HTML-based rendering, but we
            // still need "something" for filtered icons
            textColor = RadianceTextUtilities.getForegroundColor(label, labelState, labelAlpha);
        } else {
            if (label.getClientProperty(RadianceSynapse.IS_TITLE_PANE_LABEL) == Boolean.TRUE) {
                RadianceSkin skin = RadianceCoreUtilities.getSkin(label.getRootPane());
                RadianceColorScheme scheme = skin.getEnabledColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE);
                FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                        RadianceCommonCortex.getScaleFactor(label), label.getFont());
                int yOffset = paintTextR.y + (int) ((paintTextR.getHeight() - fm.getHeight()) / 2)
                        + fm.getAscent();
                g2d.translate(paintTextR.x + 3, 0);
                textColor = scheme.getForegroundColor();
                RadianceTextUtilities.paintTextWithDropShadow(label, g2d,
                        textColor, scheme.getEchoColor(), clippedText,
                        paintTextR.width + 6, paintTextR.height, 0, yOffset);
                g2d.translate(-paintTextR.x - 3, 0);
            } else {
                // fix for issue 406 - use the same FG computation
                // color as for other controls
                textColor = RadianceTextUtilities.paintText(g2d, label, paintTextR, clippedText,
                        label.getDisplayedMnemonicIndex(), labelState, labelAlpha);
            }
        }

        // Get active contributions from filter-aware renderers
        Map<ComponentState, Float> activeContributions = null;
        if (label.isEnabled()) {
            if ((icon != null) && (iconFilterStrategy != null)) {
                if (label instanceof FilteredIconAwareRenderer) {
                    FilteredIconAwareRenderer filteredIconAwareRenderer =
                            (FilteredIconAwareRenderer) label;
                    activeContributions = filteredIconAwareRenderer.getActiveContributions();
                }
            }
        }

        // Paint the icon
        if (icon != null) {
            g2d.translate(paintIconR.x, paintIconR.y);

            if (!label.isEnabled()) {
                // No support yet for transitions between disabled and enabled / active
                // states
                Icon disabledIcon = RadianceCoreUtilities.getFilteredIcon(label,
                        icon, labelState, textColor);
                disabledIcon.paintIcon(c, g2d, 0, 0);
            } else {
                // Active states are painted on top of the icon that corresponds to the
                // enabled state
                Icon enabledIcon = RadianceCoreUtilities.getFilteredIcon(label,
                        icon, labelState, textColor);
                enabledIcon.paintIcon(c, g2d, 0, 0);
                if (activeContributions != null) {
                    for (Map.Entry<ComponentState, Float> entry : activeContributions.entrySet()) {
                        if (entry.getKey() == ComponentState.ENABLED) {
                            continue;
                        }
                        float contribution = entry.getValue();
                        if (contribution > 0.0f) {
                            Icon activeIcon = RadianceCoreUtilities.getFilteredIcon(label,
                                    icon, entry.getKey(), textColor);
                            if (activeIcon != enabledIcon) {
                                g2d.setComposite(WidgetUtilities.getAlphaComposite(label, contribution, g));
                                activeIcon.paintIcon(c, g2d, 0, 0);
                            }
                        }
                    }
                }
            }

            g2d.translate(-paintIconR.x, -paintIconR.y);
        }
        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        Dimension result = RadianceMetricsUtilities.getPreferredLabelSize((JLabel) c);
        if (c.getClientProperty(RadianceSynapse.IS_TITLE_PANE_LABEL) == Boolean.TRUE) {
            result.width += 6;
            result.height += 6;
        }
        return result;
    }

    @Override
    public void update(Graphics g, JComponent c) {
        // failsafe for LAF change
        if (!RadianceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, c.getFont());
        this.paint(g2d, c);
        g2d.dispose();
    }
}
