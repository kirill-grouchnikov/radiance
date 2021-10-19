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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.*;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * A container that displays a vertical stack of collapsible panels. It uses
 * a number of Radiance APIs for delineating content in a way that is visually
 * consistent with the current Radiance skin.
 */
public class FakeAccordion extends JPanel {
    public static class FakeAccordionPanel extends JPanel {
        private JPanel contentWrapper;

        private FakeAccordionPanel(String title, Icon icon, JPanel content) {
            super(new BorderLayout());

            // Make an expand / collapse button with straight edges
            JButton titleButton = new JButton(title);
            titleButton.setIcon(icon);
            RadianceThemingCortex.ComponentScope.setIconFilterStrategies(titleButton,
                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT);
            titleButton.setIconTextGap(8);
            RadianceThemingCortex.ComponentScope.setButtonStraightSides(titleButton,
                    EnumSet.allOf(RadianceThemingSlices.Side.class));
            titleButton.addActionListener(
                    actionEvent -> setCollapsed(this.contentWrapper.isVisible()));
            this.add(titleButton, BorderLayout.NORTH);

            // Mark controls in the content panel as non-opaque so that we show our
            // accented background fill
            deepNonOpaque(content);

            // Wrap the passed content panel to have a bit of padding and accented background fill
            // (using the RadianceColorScheme.getAccentedBackgroundFillColor API)
            this.contentWrapper = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    if (UIManager.getLookAndFeel() instanceof RadianceLookAndFeel) {
                        // Get the accented background fill to delineate the content
                        RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(this);
                        RadianceThemingSlices.DecorationAreaType decorationAreaType =
                                RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(this);
                        RadianceColorScheme scheme = skin.getBackgroundColorScheme(decorationAreaType);
                        Color accentedFill = scheme.getAccentedBackgroundFillColor();

                        Graphics2D g2d = (Graphics2D) g.create();
                        g2d.setColor(accentedFill);
                        int radiusOuter = 7;
                        g2d.fillRoundRect(0, -radiusOuter, this.getWidth(),
                                this.getHeight() + radiusOuter - 1,
                                2 * radiusOuter, 2 * radiusOuter);
                        g2d.dispose();
                    }
                }
            };

            // And a custom border to delineate the panels
            this.contentWrapper.setBorder(new Border() {
                // Creates a "U-shaped" outline for delineating the panel content
                private GeneralPath getOutline(int x, int y, int width, int height,
                        float thickness, float offset, float radius) {
                    float xStart = x + thickness / 2.0f + offset;
                    float yStart = y + thickness / 2.0f + offset;
                    GeneralPath result = new GeneralPath();
                    // Start in top left
                    result.moveTo(xStart, y);
                    // Line down
                    float yStartCurve = yStart + height - 2 * radius - 2 * offset - 1;
                    result.lineTo(xStart, yStartCurve);
                    // Curve for the bottom left corner
                    result.append(new Arc2D.Double(xStart, yStartCurve,
                            2 * radius, 2 * radius, 180, 90, Arc2D.OPEN), true);
                    // Line right
                    float xStartRightCurve = xStart + width - 2 * radius - 2 * offset - thickness;
                    result.lineTo(xStartRightCurve, yStart + height - 2 * offset - 1);
                    // Curve for the bottom right corner
                    result.append(new Arc2D.Double(xStartRightCurve, yStartCurve,
                            2 * radius, 2 * radius, 270, 90, Arc2D.OPEN), true);
                    // Line up
                    result.lineTo(xStart + width - thickness - 2 * offset, y);
                    return result;
                }

                @Override
                public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                    if (!(UIManager.getLookAndFeel() instanceof RadianceLookAndFeel)) {
                        return;
                    }
                    // Use the border visuals from the current skin.
                    // Note the usage of ColorSchemeAssociationKind.BORDER to retrieve
                    // the matching color scheme, and subsequent usage of
                    // RadianceBorderPainter.paintBorder with our custom curving paths

                    RadianceSkin skin = RadianceThemingCortex.ComponentScope.getCurrentSkin(contentWrapper);
                    RadianceBorderPainter borderPainter = skin.getBorderPainter();
                    RadianceColorScheme borderScheme = skin.getColorScheme(contentWrapper,
                            RadianceThemingSlices.ColorSchemeAssociationKind.BORDER,
                            ComponentState.ENABLED);

                    float borderThicknessOuter = 1.0f / (float) RadianceCommonCortex.getScaleFactor(c);
                    float radiusOuter = 5.0f;

                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
                    g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                            RenderingHints.VALUE_STROKE_PURE);

                    GeneralPath inner = getOutline(x, y, width, height, borderThicknessOuter,
                            borderThicknessOuter, radiusOuter - borderThicknessOuter);
                    GeneralPath outer = getOutline(x, y, width, height, borderThicknessOuter,
                            0, radiusOuter);

                    g2d.translate(x, y);
                    borderPainter.paintBorder(g2d, contentWrapper, width, height,
                            outer, inner, borderScheme);

                    g2d.dispose();
                }

                @Override
                public Insets getBorderInsets(Component c) {
                    return new Insets(8, 10, 6, 10);
                }

                @Override
                public boolean isBorderOpaque() {
                    return false;
                }
            });
            this.contentWrapper.add(content, BorderLayout.CENTER);
            this.add(this.contentWrapper, BorderLayout.CENTER);
        }

        private static void deepNonOpaque(Component comp) {
            if ((comp instanceof JCheckBox) || (comp instanceof JRadioButton)
                    || (comp instanceof JSlider)) {
                ((JComponent) comp).setOpaque(false);
            }
            if (comp instanceof Container) {
                Container container = (Container) comp;
                for (int i = 0; i < container.getComponentCount(); i++) {
                    deepNonOpaque(container.getComponent(i));
                }
            }
        }

        public void setCollapsed(boolean isCollapsed) {
            this.contentWrapper.setVisible(!isCollapsed);
        }
    }

    private List<FakeAccordionPanel> panels = new ArrayList<>();

    private class FakeAccordionLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return this.preferredLayoutSize(parent);
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            int combinedHeight = 0;
            for (FakeAccordionPanel panel : panels) {
                combinedHeight += panel.getPreferredSize().height;
            }
            combinedHeight += (panels.size() + 1) * 4;
            return new Dimension(parent.getWidth(), combinedHeight);
        }

        @Override
        public void layoutContainer(Container parent) {
            int y = 4;
            for (FakeAccordionPanel panel : panels) {
                int prefPanelHeight = panel.getPreferredSize().height;
                panel.setBounds(4, y, parent.getWidth() - 8, prefPanelHeight);
                y += prefPanelHeight;
                y += 4;
            }
        }
    }

    public FakeAccordion() {
        this.setLayout(new FakeAccordionLayout());
    }

    public FakeAccordionPanel addPanel(String title, Icon icon, JPanel content) {
        FakeAccordionPanel result = new FakeAccordionPanel(title, icon, content);
        panels.add(result);
        this.add(result);
        invalidate();
        doLayout();
        repaint();
        return result;
    }

    public void removeLastPanel() {
        FakeAccordionPanel panelToRemove = this.panels.get(this.panels.size() - 1);
        panels.remove(panelToRemove);
        this.remove(panelToRemove);
        invalidate();
        doLayout();
        repaint();
    }
}
