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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.password.PasswordStrengthChecker;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.ComponentScope#setPasswordStrengthChecker(JPasswordField, PasswordStrengthChecker)}
 * API.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.ComponentScope#setPasswordStrengthChecker(JPasswordField,
 *      PasswordStrengthChecker)
 */
public class PasswordStrengthCheckerProperty extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public PasswordStrengthCheckerProperty() {
        super("Password strength checker");

        this.setLayout(new BorderLayout());
        final JPanel panel = new JPanel(new FlowLayout());
        this.add(panel, BorderLayout.CENTER);

        final JPasswordField jpf = new JPasswordField();
        jpf.setColumns(20);
        panel.add(new JLabel("Start typing password"));
        panel.add(jpf);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        final JCheckBox hasPasswordStrengthChecker = new JCheckBox("Has password strength checker");
        hasPasswordStrengthChecker.addActionListener((ActionEvent e) -> {
            if (hasPasswordStrengthChecker.isSelected()) {
                SubstanceCortex.ComponentScope.setPasswordStrengthChecker(jpf,
                        new PasswordStrengthChecker() {
                            public SubstanceSlices.PasswordStrength getStrength(char[] password) {
                                if (password == null)
                                    return SubstanceSlices.PasswordStrength.WEAK;
                                int length = password.length;
                                if (length < 3)
                                    return SubstanceSlices.PasswordStrength.WEAK;
                                if (length < 6)
                                    return SubstanceSlices.PasswordStrength.MEDIUM;
                                return SubstanceSlices.PasswordStrength.STRONG;
                            }

                            public String getDescription(
                                    SubstanceSlices.PasswordStrength strength) {
                                if (strength == SubstanceSlices.PasswordStrength.WEAK)
                                    return "<html>This password is <b>way</b> too weak</html>";
                                if (strength == SubstanceSlices.PasswordStrength.MEDIUM)
                                    return "<html>Come on, you can do<br> a little better than that</html>";
                                if (strength == SubstanceSlices.PasswordStrength.STRONG)
                                    return "OK";
                                return null;
                            }
                        });
            } else {
                SubstanceCortex.ComponentScope.setPasswordStrengthChecker(jpf, null);
            }
        });

        controls.add(hasPasswordStrengthChecker);
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
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new PasswordStrengthCheckerProperty().setVisible(true);
        });
    }
}
