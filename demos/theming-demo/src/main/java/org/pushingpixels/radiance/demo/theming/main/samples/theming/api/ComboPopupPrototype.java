/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.combo.ComboPopupPrototypeCallback;
import org.pushingpixels.radiance.theming.api.combo.WidestComboPopupPrototype;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.ComponentScope#setComboBoxPrototypeCallback(JComboBox, ComboPopupPrototypeCallback)}
 * and {@link RadianceThemingCortex.ComponentScope#setComboBoxPrototypeDisplayValue(JComboBox, Object)}
 * APIs.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.ComponentScope#setComboBoxPrototypeCallback(JComboBox,
 *      ComboPopupPrototypeCallback)
 * @see RadianceThemingCortex.ComponentScope#setComboBoxPrototypeDisplayValue(JComboBox, Object)
 */
public class ComboPopupPrototype extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public ComboPopupPrototype() {
        super("Combo popup prototype");

        this.setLayout(new GridLayout(1, 3));

        JPanel panel1 = new JPanel(new FlowLayout());
        JComboBox<String> comboProto1 = new JComboBox<>(new String[] { "aa", "aaaaa", "aaaaaaaaaa",
                        "this one is the one", "abcdefghijklmnopqrstuvwxyz" });
        comboProto1.setPrototypeDisplayValue("aaaaa");
        // set popup prototype as hard-code value in the model
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeDisplayValue(comboProto1,
                "this one is the one");
        panel1.add(new JLabel("Hard-coded value"));
        panel1.add(comboProto1);
        this.add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout());
        JComboBox<String> comboProto2 = new JComboBox<>(new String[] { "aa", "aaaaa", "aaaaaaaaaa",
                        "another one (not it)", "abcdefghijklmnopqrstuvwxyz" });
        comboProto2.setPrototypeDisplayValue("aaaaa");
        // set popup prototype as widest value (core implementation of
        // ComboPopupPrototypeCallback interface)
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(comboProto2,
                new WidestComboPopupPrototype<String>());
        panel2.add(new JLabel("Widest core callback"));
        panel2.add(comboProto2);
        this.add(panel2);

        JPanel panel3 = new JPanel(new FlowLayout());
        JComboBox<String> comboProto3 = new JComboBox<>(new String[] { "aa", "aaaaa", "this is not",
                        "this one is not it", "this one is it that is for the popup" });
        comboProto3.setPrototypeDisplayValue("aaaaa");
        // set popup prototype as custom implementation of
        // ComboPopupPrototypeCallback interface
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeDisplayValue(comboProto3,
                (ComboPopupPrototypeCallback<String>) jc -> jc.getModel().getElementAt(jc.getModel().getSize() - 1));
        panel3.add(new JLabel("Custom callback"));
        panel3.add(comboProto3);
        this.add(panel3);

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
            new ComboPopupPrototype().setVisible(true);
        });
    }
}
