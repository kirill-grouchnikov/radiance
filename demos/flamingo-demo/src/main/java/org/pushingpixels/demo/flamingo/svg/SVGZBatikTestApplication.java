/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. 
 * All Rights Reserved.
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
 *  o Neither the name of Flamingo, Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.flamingo.svg;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.photon.icon.SvgBatikResizableIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.InputStream;

public class SVGZBatikTestApplication extends JFrame {

    /**
     * Main method for testing.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        SVGZBatikTestApplication app = new SVGZBatikTestApplication();
        app.setSize(400, 400);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    SvgIconPanel panel;

    public SVGZBatikTestApplication() {
        this.setLayout(new BorderLayout());
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton size16 = new JButton("size16");
        size16.addActionListener((ActionEvent e) -> {
            panel.iconButton.setIconDimension(16);
            panel.doLayout();
            panel.iconButton.doLayout();
            panel.repaint();
        });
        JButton size32 = new JButton("size32");
        size32.addActionListener((ActionEvent e) -> {
            panel.iconButton.setIconDimension(32);
            panel.doLayout();
            panel.iconButton.doLayout();
            panel.repaint();
        });
        JButton size256 = new JButton("size256");
        size256.addActionListener((ActionEvent e) -> {
            panel.iconButton.setIconDimension(256);
            panel.doLayout();
            panel.iconButton.doLayout();
            panel.repaint();
        });
        buttons.add(size16);
        buttons.add(size32);
        buttons.add(size256);

        this.add(buttons, BorderLayout.SOUTH);
        this.add(panel = new SvgIconPanel(), BorderLayout.CENTER);
    }

    private static class SvgIconPanel extends JPanel {
        AbstractCommandButton iconButton;

        public SvgIconPanel() {
            this.setLayout(new SvgIconPanelLayout());
            InputStream is = SVGZBatikTestApplication.class.getResourceAsStream(
                    "/org/pushingpixels/demo/flamingo/svg/oxygen/office-address-book.svgz");
            SvgBatikResizableIcon icon = SvgBatikResizableIcon.getSvgzIcon(is,
                    new Dimension(32, 32));
            iconButton = Command.builder().setTitle("just icon").setIcon(icon).build()
                    .project(CommandPresentation.builder().setPresentationState(
                            CommandButtonPresentationState.BIG).build()).buildComponent();
            add(iconButton);
        }

        private class SvgIconPanelLayout implements LayoutManager {
            public void addLayoutComponent(String name, Component comp) {
            }

            public void removeLayoutComponent(Component comp) {
            }

            public void layoutContainer(Container parent) {
                if (iconButton != null)
                    iconButton.setBounds(0, 0, iconButton.getPreferredSize().width,
                            iconButton.getPreferredSize().height);
            }

            public Dimension minimumLayoutSize(Container parent) {
                return this.preferredLayoutSize(parent);
            }

            public Dimension preferredLayoutSize(Container parent) {
                if (iconButton != null)
                    return iconButton.getPreferredSize();
                else
                    return new Dimension(0, 0);
            }
        }
    }
}