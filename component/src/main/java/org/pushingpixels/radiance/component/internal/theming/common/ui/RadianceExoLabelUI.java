/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.theming.common.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.JExoLabel;
import org.pushingpixels.radiance.component.api.common.model.LabelContentModel;
import org.pushingpixels.radiance.component.api.common.model.LabelPresentationModel;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.beans.PropertyChangeListener;

/**
 * UI for {@link JExoLabel} components in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceExoLabelUI extends ComponentUI {
    private RadianceIcon icon;
    private JLabel singleLineLabel;
    private PropertyChangeListener propertyChangeListener;

    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceExoLabelUI();
    }

    protected RadianceExoLabelUI() {
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);

        JExoLabel label = (JExoLabel) c;
        LabelContentModel contentModel = label.getProjection().getContentModel();
        LabelPresentationModel presentationModel = label.getProjection().getPresentationModel();

        RadianceIcon.Factory factory = contentModel.getIconFactory();
        if (factory != null) {
            this.icon = factory.createNewIcon();
            this.icon.setDimension(presentationModel.getIconDimension());
        }
        RadianceThemingCortex.ComponentScope.setIconFilterStrategies(label,
                presentationModel.getEnabledIconFilterStrategy(),
                presentationModel.getEnabledIconFilterStrategy(),
                presentationModel.getDisabledIconFilterStrategy());

        this.singleLineLabel = new JLabel(contentModel.getText());
        this.singleLineLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.singleLineLabel.setFocusable(false);
        if (presentationModel.getFont() != null) {
            this.singleLineLabel.setFont(presentationModel.getFont());
        }
        label.add(this.singleLineLabel);

        this.propertyChangeListener = evt -> {
            if ("text".equals(evt.getPropertyName())) {
                String newText = (String) evt.getNewValue();
                singleLineLabel.setText(newText);
            }
        };
        contentModel.addPropertyChangeListener(this.propertyChangeListener);

        label.setLayout(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                JExoLabel label = (JExoLabel) c;
                return getSingleLinePreferredDimension(label);
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return preferredLayoutSize(parent);
            }

            @Override
            public void layoutContainer(Container parent) {
                JExoLabel label = (JExoLabel) c;

                LabelContentModel contentModel = label.getProjection().getContentModel();
                LabelPresentationModel presentationModel = label.getProjection().getPresentationModel();

                int width = label.getWidth();

                int shiftX = 0;
                int preferredWidth = getSingleLineNoPrototypePreferredDimension(label).width;
                if (preferredWidth < label.getWidth()) {
                    // We have more horizontal space than needed to display the content.
                    // Consult the horizontal alignment attribute of the command button to see
                    // how we should shift the content horizontally.
                    switch (presentationModel.getHorizontalAlignment()) {
                        case LEADING:
                        case FILL:
                            break;
                        case CENTER:
                            // shift everything to be centered horizontally
                            shiftX = (width - preferredWidth) / 2;
                            break;
                        case TRAILING:
                            // shift everything to the end of the button bounds
                            shiftX = width - preferredWidth;
                    }
                }

                int textLeft = 0;
                int textTop = presentationModel.getContentPadding().top;
                int textRight = 0;
                int textBottom = label.getHeight() - presentationModel.getContentPadding().bottom;

                if (label.getComponentOrientation().isLeftToRight()) {
                    if (contentModel.getIconFactory() == null) {
                        textLeft = presentationModel.getContentPadding().left;
                    } else {
                        textLeft = presentationModel.getContentPadding().left +
                                presentationModel.getIconDimension().width +
                                (int) (presentationModel.getIconTextGap() *
                                        presentationModel.getHorizontalGapScaleFactor());
                    }
                    textRight = width - presentationModel.getContentPadding().right;
                } else {
                    textLeft = presentationModel.getContentPadding().left;
                    if (contentModel.getIconFactory() == null) {
                        textRight = width - presentationModel.getContentPadding().right;
                    } else {
                        textRight = width - presentationModel.getContentPadding().right -
                                presentationModel.getIconDimension().width -
                                (int) (presentationModel.getIconTextGap() *
                                        presentationModel.getHorizontalGapScaleFactor());
                    }
                }

                label.getComponent(0).setBounds(shiftX + textLeft, textTop,
                        shiftX + textRight - textLeft, textBottom - textTop);
            }
        });
    }

    @Override
    public void uninstallUI(JComponent c) {
        JExoLabel label = (JExoLabel) c;
        LabelContentModel contentModel = label.getProjection().getContentModel();
        contentModel.removePropertyChangeListener(this.propertyChangeListener);
        this.propertyChangeListener = null;

        super.uninstallUI(c);
    }

    private static Dimension getSingleLinePreferredDimension(JExoLabel label) {
        LabelContentModel contentModel = label.getProjection().getContentModel();
        LabelPresentationModel presentationModel = label.getProjection().getPresentationModel();

        int width = presentationModel.getContentPadding().left +
                presentationModel.getContentPadding().right;
        int height = presentationModel.getContentPadding().top +
                presentationModel.getContentPadding().bottom;

        int iconHeight = (contentModel.getIconFactory() != null)
                ? presentationModel.getIconDimension().height
                : 0;
        int iconWidth = (contentModel.getIconFactory() != null)
                ? presentationModel.getIconDimension().width
                : 0;

        if (iconWidth > 0) {
            width = width + iconWidth +
                    (int) (presentationModel.getIconTextGap() *
                            presentationModel.getHorizontalGapScaleFactor());
        }

        Font font = (presentationModel.getFont() != null)
                ? presentationModel.getFont()
                : label.getFont();
        Dimension textDimension =
                RadianceMetricsUtilities.getLabelPreferredSingleLineDimension(
                        label, contentModel.getText(), font);
        int textWidth = textDimension.width;
        int textHeight = textDimension.height;
        if (presentationModel.getSingleLineDisplayPrototype() != null) {
            Dimension prototypeTextDimension =
                    RadianceMetricsUtilities.getLabelPreferredSingleLineDimension(
                            label, presentationModel.getSingleLineDisplayPrototype(),
                            font);
            textWidth = Math.max(textWidth, prototypeTextDimension.width);
            textHeight = Math.max(textHeight, prototypeTextDimension.height);
        }

        width = width + textWidth;

        height += Math.max(iconHeight, textHeight);

        return new Dimension(width, height);
    }

    private static Dimension getSingleLineNoPrototypePreferredDimension(JExoLabel label) {
        LabelContentModel contentModel = label.getProjection().getContentModel();
        LabelPresentationModel presentationModel = label.getProjection().getPresentationModel();

        int width = presentationModel.getContentPadding().left +
                presentationModel.getContentPadding().right;
        int height = presentationModel.getContentPadding().top +
                presentationModel.getContentPadding().bottom;

        int iconHeight = (contentModel.getIconFactory() != null)
                ? presentationModel.getIconDimension().height
                : 0;
        int iconWidth = (contentModel.getIconFactory() != null)
                ? presentationModel.getIconDimension().width
                : 0;

        if (iconWidth > 0) {
            width = width + iconWidth +
                    (int) (presentationModel.getIconTextGap() *
                            presentationModel.getHorizontalGapScaleFactor());
        }

        Font font = (presentationModel.getFont() != null)
                ? presentationModel.getFont()
                : label.getFont();
        Dimension textDimension =
                RadianceMetricsUtilities.getLabelPreferredSingleLineDimension(
                        label, contentModel.getText(), font);
        int textWidth = textDimension.width;
        int textHeight = textDimension.height;

        width = width + textWidth;
        height += Math.max(iconHeight, textHeight);

        return new Dimension(width, height);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        JExoLabel label = (JExoLabel) c;

        LabelContentModel contentModel = label.getProjection().getContentModel();
        LabelPresentationModel presentationModel = label.getProjection().getPresentationModel();

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(WidgetUtilities.getAlphaComposite(label, g));

        int width = label.getWidth();
        int shiftX = 0;
        int preferredWidth = getSingleLinePreferredDimension(label).width;
        if (preferredWidth < label.getWidth()) {
            // We have more horizontal space than needed to display the content.
            // Consult the horizontal alignment attribute of the command button to see
            // how we should shift the content horizontally.
            switch (presentationModel.getHorizontalAlignment()) {
                case LEADING:
                case FILL:
                    break;
                case CENTER:
                    // shift everything to be centered horizontally
                    shiftX = (width - preferredWidth) / 2;
                    break;
                case TRAILING:
                    // shift everything to the end of the button bounds
                    shiftX = width - preferredWidth;
            }
        }

        if (this.icon != null) {
            int iconX = label.getComponentOrientation().isLeftToRight()
                    ? presentationModel.getContentPadding().left
                    : label.getWidth() - presentationModel.getContentPadding().right - icon.getIconWidth();
            int iconY = presentationModel.getContentPadding().top;
            g2d.translate(shiftX + iconX, iconY);

            ComponentState state = contentModel.isEnabled() ?
                    ComponentState.ENABLED : ComponentState.DISABLED_UNSELECTED;
            float alpha = RadianceColorSchemeUtilities.getAlpha(label, state);
            Color textColor = RadianceColorSchemeUtilities.getColorScheme(label, state)
                    .getForegroundColor();
            if (alpha < 1.0f) {
                Color backgroundFill = RadianceColorUtilities.getBackgroundFillColor(label);
                textColor = RadianceColorUtilities.getInterpolatedColor(textColor, backgroundFill, alpha);
            }

            Icon filteredIcon = RadianceCoreUtilities.getFilteredIcon(label,
                    this.icon, state, textColor);
            filteredIcon.paintIcon(label, g2d, 0, 0);
        }

        g2d.dispose();
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
