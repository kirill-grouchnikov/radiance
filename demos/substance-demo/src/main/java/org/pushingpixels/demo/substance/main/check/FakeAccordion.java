/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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

import org.pushingpixels.substance.api.SubstanceCortex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class FakeAccordion extends JPanel {
    public static class FakeAccordionPanel extends JPanel {
        private JPanel content;

        private FakeAccordionPanel(String title, Icon icon, JPanel content) {
            super(new BorderLayout());

            JButton titleLabel = new JButton(title);
            titleLabel.setIcon(icon);
            titleLabel.setFont(SubstanceCortex.GlobalScope.getFontPolicy().
                    getFontSet(null).getControlFont().deriveFont(Font.BOLD));
            titleLabel.addActionListener(
                    (ActionEvent ae) -> setCollapsed(this.content.isVisible()));

            this.content = content;
            this.add(titleLabel, BorderLayout.NORTH);
            this.add(content, BorderLayout.CENTER);
        }

        public void setCollapsed(boolean isCollapsed) {
            this.content.setVisible(!isCollapsed);
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
