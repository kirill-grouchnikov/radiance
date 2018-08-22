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
package org.pushingpixels.demo.substance.main.samples.substance.api;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;
import org.pushingpixels.substance.api.tabbed.TabCloseListener;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.GlobalScope#registerTabCloseChangeListener(org.pushingpixels.substance.api.tabbed.BaseTabCloseListener)}
 * API with registering a tab close listener that listens on single tab closing on a specific tabbed
 * pane.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.GlobalScope#registerTabCloseChangeListener(org.pushingpixels.substance.api.tabbed.BaseTabCloseListener)
 */
public class RegisterTabCloseChangeListener_GeneralSingle extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public RegisterTabCloseChangeListener_GeneralSingle() {
        super("Register tab close listener");

        this.setLayout(new BorderLayout());

        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("tab1", new JPanel());
        jtp.addTab("tab2", new JPanel());
        jtp.addTab("tab3", new JPanel());

        SubstanceCortex.ComponentScope.setTabCloseButtonsVisible(jtp, true);

        // register tab close listener on all tabbed panes.
        SubstanceCortex.GlobalScope.registerTabCloseChangeListener(new TabCloseListener() {
            public void tabClosing(JTabbedPane tabbedPane, Component tabComponent) {
                System.out.println(
                        "Tab " + tabbedPane.getTitleAt(tabbedPane.indexOfComponent(tabComponent))
                                + " closing");
            }

            public void tabClosed(JTabbedPane tabbedPane, Component tabComponent) {
                System.out.println("Tab closed");
            }
        });

        this.add(jtp, BorderLayout.CENTER);

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
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new RegisterTabCloseChangeListener_GeneralSingle().setVisible(true);
        });
    }
}
