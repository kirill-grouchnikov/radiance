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
package org.pushingpixels.radiance.components.internal.ui.common.popup;

import javax.swing.*;
import java.awt.*;

/**
 * Basic UI for color selector panel {@link JColorSelectorPanel}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicColorSelectorPanelUI extends ColorSelectorPanelUI {
    protected JColorSelectorPanel colorSelectorPanel;

    private JLabel captionLabel;

    private JPanel colorSelectorContainer;

    @Override
    public void installUI(JComponent c) {
        this.colorSelectorPanel = (JColorSelectorPanel) c;

        installDefaults();
        installComponents();
        installListeners();
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();

        c.setLayout(null);

        this.colorSelectorPanel = null;
    }

    /**
     * Installs listeners on the associated color selector panel.
     */
    protected void installListeners() {
    }

    /**
     * Uninstalls listeners from the associated color selector panel.
     */
    protected void uninstallListeners() {
    }

    /**
     * Installs defaults on the associated color selector panel.
     */
    protected void installDefaults() {
    }

    /**
     * Uninstalls defaults from the associated color selector panel.
     */
    protected void uninstallDefaults() {
    }

    /**
     * Installs subcomponents on the associated color selector panel.
     */
    protected void installComponents() {
        this.captionLabel = new JLabel(this.colorSelectorPanel.getCaption());
        this.captionLabel.setFont(this.captionLabel.getFont().deriveFont(Font.BOLD));
        this.colorSelectorContainer = this.colorSelectorPanel.getColorSelectionContainer();

        this.colorSelectorPanel.add(this.captionLabel);
        if (this.colorSelectorContainer != null) {
            this.colorSelectorPanel.add(this.colorSelectorContainer);
        }

        this.colorSelectorPanel.setLayout(new PanelLayout());
    }

    /**
     * Uninstalls subcomponents from the associated color selector panel.
     */
    protected void uninstallComponents() {
        this.colorSelectorPanel.remove(this.captionLabel);
        if (this.colorSelectorContainer != null) {
            this.colorSelectorPanel.remove(this.colorSelectorContainer);
        }
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Color bg = this.colorSelectorPanel.getBackground();
        g.setColor(bg);
        int w = c.getWidth();
        int h = c.getHeight();
        g.fillRect(0, 0, w, h);

        Rectangle captionBackground = this.captionLabel.getBounds();
        this.paintCaptionBackground(g, 0, 0, w, captionBackground.height + 2 * getLayoutGap());

        if (this.colorSelectorPanel.isLastPanel()) {
            paintBottomDivider(g, 0, 0, w, h);
        }
    }

    protected abstract void paintBottomDivider(Graphics g, int x, int y, int width,
            int height);

    protected abstract void paintCaptionBackground(Graphics g, int x, int y, int width,
            int height);

    /**
     * Returns the layout gap for button panel components.
     *
     * @return The layout gap for button panel components.
     */
    protected abstract int getLayoutGap();

    protected class PanelLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return new Dimension(20, 20);
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            int layoutGap = getLayoutGap();

            Dimension labelPrefSize = captionLabel.getPreferredSize();
            Dimension contPrefSize = colorSelectorContainer.getPreferredSize();

            return new Dimension(
                    Math.max(labelPrefSize.width, contPrefSize.width),
                    2 * layoutGap + labelPrefSize.height + contPrefSize.height
                            + (colorSelectorPanel.isLastPanel() ? 1 : 0));
        }

        @Override
        public void layoutContainer(Container parent) {
            int layoutGap = getLayoutGap();

            Dimension labelPrefSize = captionLabel.getPreferredSize();
            int labelWidth = labelPrefSize.width;
            int labelHeight = labelPrefSize.height;
            int y = layoutGap;
            if (captionLabel.getComponentOrientation().isLeftToRight()) {
                captionLabel.setBounds(layoutGap, y, labelWidth, labelHeight);
            } else {
                captionLabel.setBounds(parent.getWidth() - layoutGap - labelWidth, y,
                        labelWidth, labelHeight);
            }
            y += labelHeight + layoutGap;

            colorSelectorContainer.setBounds(0, y, parent.getWidth(),
                    parent.getHeight() - y - (colorSelectorPanel.isLastPanel() ? 1 : 0));

        }
    }
}
