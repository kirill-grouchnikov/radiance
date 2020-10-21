/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.check;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.ColorTransform;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class FakeAccordion extends JPanel {
    public static class FakeAccordionPanel extends JPanel {
        private JPanel content;
        private JPanel contentWrapper;

        private FakeAccordionPanel(String title, Icon icon, JPanel content) {
            super(new BorderLayout());

            // Make an expand / collapse button with straight edges
            JButton titleButton = new JButton(title);
            titleButton.setIcon(icon);
            SubstanceCortex.ComponentScope.setIconThemingType(titleButton,
                    SubstanceSlices.IconThemingType.FOLLOW_FOREGROUND);
            titleButton.setIconTextGap(8);
            SubstanceCortex.ComponentScope.setButtonStraightSides(titleButton,
                    EnumSet.allOf(SubstanceSlices.Side.class));
            titleButton.addActionListener(
                    actionEvent -> setCollapsed(this.contentWrapper.isVisible()));
            this.add(titleButton, BorderLayout.NORTH);

            // Wrap the passed content panel to have a bit of padding and
            // slightly differentiated background
            this.content = content;
            this.content.setOpaque(false);
            deepNonOpaque(this.content);

            this.contentWrapper = new JPanel(new BorderLayout()) {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    SubstanceSkin skin = SubstanceCortex.ComponentScope.getCurrentSkin(this);
                    SubstanceColorScheme colorScheme = skin.getColorScheme(this,
                            ComponentState.ENABLED);
                    Color originalFill = colorScheme.getBackgroundFillColor();
                    Color tweakedBrightness =
                            ColorTransform.brightness(colorScheme.isDark() ? 0.15f : -0.15f)
                                    .transform(originalFill);
                    Color tweakedAlpha = ColorTransform.alpha(80).transform(tweakedBrightness);

                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setColor(tweakedAlpha);
                    g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
                    g2d.dispose();
                }
            };
            this.contentWrapper.setBorder(new EmptyBorder(8, 4, 0, 4));
            this.contentWrapper.add(this.content, BorderLayout.CENTER);
            this.add(this.contentWrapper, BorderLayout.CENTER);
        }

        private static void deepNonOpaque(Component comp) {
            if ((comp instanceof JCheckBox) || (comp instanceof JRadioButton)) {
                ((JToggleButton) comp).setOpaque(false);
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
