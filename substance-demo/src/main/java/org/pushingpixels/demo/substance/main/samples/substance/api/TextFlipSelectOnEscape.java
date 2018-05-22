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
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.ComponentScope#setFlipTextSelectionOnEscape(javax.swing.text.JTextComponent, Boolean)}
 * API.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.ComponentScope#setFlipTextSelectionOnEscape(javax.swing.text.JTextComponent,
 *      Boolean)
 */
public class TextFlipSelectOnEscape extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public TextFlipSelectOnEscape() {
        super("Text flip select on ESC");

        this.setLayout(new BorderLayout());

        final JTextField jtf = new JTextField("sample text");
        jtf.setColumns(20);

        JPanel main = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.add(main, BorderLayout.CENTER);
        main.add(jtf);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        final JCheckBox hasSelectOnFocus = new JCheckBox("Has \"flip select on ESC\" behaviour");
        hasSelectOnFocus.addActionListener((ActionEvent e) -> SubstanceCortex.ComponentScope
                .setFlipTextSelectionOnEscape(jtf, hasSelectOnFocus.isSelected()));

        controls.add(hasSelectOnFocus);
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
     * @throws Exception
     *             If some exception occured. Note that there is no special treatment of exception
     *             conditions in <code>this</code> sample code.
     */
    public static void main(String[] args) throws Exception {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new TextFlipSelectOnEscape().setVisible(true);
        });
    }
}
