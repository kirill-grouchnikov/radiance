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

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.ComponentScope#setComboBoxPopupFlyoutOrientation(JComboBox, Integer)} API.
 * 
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.ComponentScope#setComboBoxPopupFlyoutOrientation(JComboBox, Integer)
 */
public class ComboBoxPopupFlyoutOrientation extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public ComboBoxPopupFlyoutOrientation() {
        super("Combobox popup flyout orientation");

        this.setLayout(new BorderLayout());

        final JComboBox cb = new JComboBox(
                new Object[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });

        JPanel main = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.add(main, BorderLayout.CENTER);
        main.add(cb);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        final JComboBox flyoutCombo = new JComboBox(
                new Object[] { "default", "center", "north", "east", "west", "south" });
        flyoutCombo.addActionListener((ActionEvent e) -> {
            Object selected = flyoutCombo.getSelectedItem();
            // set popup flyout orientation based on the selected
            // item
            if ("default".equals(selected))
                SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(cb, null);
            if ("center".equals(selected))
                SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(cb,
                        SwingConstants.CENTER);
            if ("north".equals(selected))
                SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(cb,
                        SwingConstants.NORTH);
            if ("east".equals(selected))
                SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(cb,
                        SwingConstants.EAST);
            if ("west".equals(selected))
                SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(cb,
                        SwingConstants.WEST);
            if ("south".equals(selected))
                SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(cb,
                        SwingConstants.SOUTH);
        });

        controls.add(new JLabel("Combo popup flyout orientation"));
        controls.add(flyoutCombo);
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
            new ComboBoxPopupFlyoutOrientation().setVisible(true);
        });
    }
}
