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
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.FocusKind;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultComboBoxRenderer;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.ComponentOrParentChainScope#setFocusKind(javax.swing.JComponent, FocusKind)}
 * API.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.ComponentOrParentChainScope#setFocusKind(javax.swing.JComponent, FocusKind)
 */
public class SetFocusKind extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public SetFocusKind() {
        super("Focus kind");

        setLayout(new BorderLayout());

        final JButton button1 = new JButton("button");

        JPanel main = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.add(main, BorderLayout.CENTER);
        main.add(button1);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        final JComboBox focusKindCombo = new JComboBox(
                new Object[] { FocusKind.NONE, FocusKind.ALL, FocusKind.ALL_INNER, FocusKind.TEXT,
                                FocusKind.UNDERLINE, FocusKind.STRONG_UNDERLINE });
        focusKindCombo.setRenderer(new SubstanceDefaultComboBoxRenderer(focusKindCombo) {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                FocusKind mgfk = (FocusKind) value;
                return super.getListCellRendererComponent(list, mgfk.name().toLowerCase(), index,
                        isSelected, cellHasFocus);
            }
        });
        focusKindCombo.setSelectedItem(FocusKind.ALL_INNER);
        focusKindCombo.addActionListener((ActionEvent e) -> {
            // based on the selected value, set focus kind on the
            // button and request focus
            SubstanceCortex.ComponentOrParentChainScope.setFocusKind(button1,
                    (FocusKind) focusKindCombo.getSelectedItem());
            button1.requestFocus();
        });
        controls.add(new JLabel("Focus kind"));
        controls.add(focusKindCombo);
        this.add(controls, BorderLayout.SOUTH);

        this.setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            new SetFocusKind().setVisible(true);
        });
    }
}
