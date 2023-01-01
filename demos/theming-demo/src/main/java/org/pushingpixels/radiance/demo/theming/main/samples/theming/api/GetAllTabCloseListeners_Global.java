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
package org.pushingpixels.radiance.demo.theming.main.samples.theming.api;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.radiance.theming.api.tabbed.TabCloseListener;
import org.pushingpixels.radiance.theming.api.tabbed.VetoableMultipleTabCloseListener;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.GlobalScope#getAllTabCloseListeners()} API.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.GlobalScope#getAllTabCloseListeners()
 */
public class GetAllTabCloseListeners_Global extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public GetAllTabCloseListeners_Global() {
        super("Get all tab close listeners");

        this.setLayout(new BorderLayout());

        final JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("tab1", new JPanel());
        jtp.addTab("tab2", new JPanel());
        jtp.addTab("tab3", new JPanel());

        RadianceThemingCortex.ComponentScope.setTabCloseButtonsVisible(jtp, true);

        RadianceThemingCortex.GlobalScope.registerTabCloseChangeListener(new TabCloseListener() {
            public void tabClosing(JTabbedPane tabbedPane, Component tabComponent) {
                System.out.println("Tab closing");
            }

            public void tabClosed(JTabbedPane tabbedPane, Component tabComponent) {
                System.out.println("Tab closed");
            }
        });

        RadianceThemingCortex.ComponentScope.registerTabCloseChangeListener(jtp,
                new VetoableMultipleTabCloseListener() {
                    public void tabsClosed(JTabbedPane tabbedPane, Set<Component> tabComponents) {
                        System.out.println("Tabs closed");
                    }

                    public void tabsClosing(JTabbedPane tabbedPane, Set<Component> tabComponents) {
                        System.out.println("Tabs closing");
                    }

                    public boolean vetoTabsClosing(JTabbedPane tabbedPane,
                            Set<Component> tabComponents) {
                        System.out.println("Vetoing tabs closing");
                        return true;
                    }
                });

        this.add(jtp, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton getTabCloseListeners = new JButton("Get tab close listeners");
        getTabCloseListeners.addActionListener(actionEvent ->
                JOptionPane.showMessageDialog(GetAllTabCloseListeners_Global.this,
                        RadianceThemingCortex.GlobalScope.getAllTabCloseListeners().size()
                                + " global tab close listeners registered"));

        controls.add(getTabCloseListeners);
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
        JDialog.setDefaultLookAndFeelDecorated(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new GetAllTabCloseListeners_Global().setVisible(true);
        });
    }
}
