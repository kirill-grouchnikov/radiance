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
package org.pushingpixels.radiance.demo.theming.main.samples.theming.api;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.ComponentScope#setTabCloseButtonVisible(JComponent, Boolean)} and
 * {@link RadianceThemingCortex.ComponentScope#setTabCloseButtonsVisible(JTabbedPane, Boolean)} APIs.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.ComponentScope#setTabCloseButtonVisible(JComponent, Boolean)
 * @see RadianceThemingCortex.ComponentScope#setTabCloseButtonsVisible(JTabbedPane, Boolean)
 */
public class TabbedPaneCloseButtonsVisibility extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public TabbedPaneCloseButtonsVisibility() {
        super("Tabbed pane close buttons");

        this.setLayout(new BorderLayout());

        // create a tabbed pane with few tabs
        final JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("First", new JPanel());
        jtp.addTab("Second", new JPanel());
        jtp.addTab("Third", new JPanel());

        this.add(jtp, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        final JCheckBox allHaveCloseButton = new JCheckBox("All tabs");
        allHaveCloseButton.addActionListener(actionEvent -> {
            // based on the checkbox selection, mark the tabbed pane to have
            // close buttons on all tabs
            RadianceThemingCortex.ComponentScope.setTabCloseButtonsVisible(jtp,
                    allHaveCloseButton.isSelected() ? Boolean.TRUE : null);
            jtp.revalidate();
            jtp.repaint();
        });

        final JCheckBox firstHasCloseButton = new JCheckBox("First tab");
        firstHasCloseButton.addActionListener(actionEvent -> {
            // based on the checkbox selection, mark the first tab component
            // to have close button
            RadianceThemingCortex.ComponentScope.setTabCloseButtonVisible(
                    ((JComponent) jtp.getComponentAt(0)),
                    firstHasCloseButton.isSelected() ? Boolean.TRUE : null);
            jtp.revalidate();
            jtp.repaint();
        });

        controls.add(allHaveCloseButton);
        controls.add(firstHasCloseButton);
        this.add(controls, BorderLayout.SOUTH);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     * 
     * @param args
     *            Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new TabbedPaneCloseButtonsVisibility().setVisible(true);
        });
    }
}
