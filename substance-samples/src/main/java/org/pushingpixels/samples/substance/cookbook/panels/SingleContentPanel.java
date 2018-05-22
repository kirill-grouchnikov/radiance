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
package org.pushingpixels.samples.substance.cookbook.panels;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.JPanel;

import org.pushingpixels.samples.substance.cookbook.CookbookFrame;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;

/**
 * This class makes sure that the three application panels have the continuously-looking footer bar
 * at the bottom. The custom layout manager handles the height consistency.
 * 
 * @author Kirill Grouchnikov
 */
public class SingleContentPanel extends JPanel {
    protected JPanel titlePanel;

    protected JPanel mainPanel;

    protected JPanel footerContentPanel;

    private JPanel footerPanel;

    private int mainPanelTopOffset;

    public SingleContentPanel(int mainPanelTopOffset) {
        this.titlePanel = new JPanel();
        this.mainPanel = new JPanel();
        this.footerContentPanel = new JPanel(new BorderLayout());

        this.footerPanel = new JPanel(new BorderLayout(1, 1));
        this.footerPanel.add(Box.createHorizontalStrut(5), BorderLayout.EAST);
        this.footerPanel.add(this.footerContentPanel, BorderLayout.CENTER);
        this.footerPanel.add(Box.createHorizontalStrut(5), BorderLayout.WEST);

        this.setLayout(new ContentPanelLayoutManager());
        this.add(this.titlePanel);
        this.add(this.mainPanel);
        this.add(this.footerPanel);

        ComponentOrParentChainScope.setDecorationType(this.titlePanel,
                DecorationAreaType.PRIMARY_TITLE_PANE);
        ComponentOrParentChainScope.setDecorationType(this.footerPanel,
                DecorationAreaType.FOOTER);

        this.mainPanelTopOffset = mainPanelTopOffset;
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public JPanel getFooterPanel() {
        return this.footerPanel;
    }

    public JPanel getTitlePanel() {
        return this.titlePanel;
    }

    public JPanel getFooterContentPanel() {
        return this.footerContentPanel;
    }

    protected class ContentPanelLayoutManager implements LayoutManager {
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
            int w = Math.max(mainPanel.getPreferredSize().width,
                    footerContentPanel.getPreferredSize().width);
            int h = titlePanel.getPreferredSize().height + mainPanel.getPreferredSize().height
                    + footerPanel.getPreferredSize().height;
            return new Dimension(w, h);
        }

        @Override
        public void layoutContainer(Container parent) {
            Insets ins = parent.getInsets();
            int contentWidth = parent.getWidth() - ins.left - ins.right;
            titlePanel.setBounds(ins.left, ins.top, parent.getWidth(),
                    CookbookFrame.TITLE_PANE_PREF_HEIGHT);
            mainPanel.setBounds(ins.left,
                    ins.top + CookbookFrame.TITLE_PANE_PREF_HEIGHT + mainPanelTopOffset,
                    contentWidth,
                    parent.getHeight() - ins.top - ins.bottom
                            - CookbookFrame.FOOTER_PANE_PREF_HEIGHT
                            - CookbookFrame.TITLE_PANE_PREF_HEIGHT - mainPanelTopOffset);
            footerPanel.setBounds(ins.left,
                    parent.getHeight() - ins.top - ins.bottom
                            - CookbookFrame.FOOTER_PANE_PREF_HEIGHT,
                    contentWidth, CookbookFrame.FOOTER_PANE_PREF_HEIGHT);
        }
    }
}
