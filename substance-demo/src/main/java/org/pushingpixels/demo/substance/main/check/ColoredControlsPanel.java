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
package org.pushingpixels.demo.substance.main.check;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Test application panel for testing components with custom background.
 * 
 * @author Kirill Grouchnikov
 */
public class ColoredControlsPanel extends JPanel {
    public ColoredControlsPanel() {
        this.setLayout(new BorderLayout());

        FormLayout lm = new FormLayout("right:pref, 4dlu, left:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel())
                .border(Borders.DIALOG);

        JLabel labelOpaque = new JLabel("Sample label");
        labelOpaque.setOpaque(true);
        labelOpaque.setForeground(Color.green);
        labelOpaque.setBackground(Color.red);
        builder.append("Opaque label", labelOpaque);

        JLabel labelNonOpaque = new JLabel("Sample label");
        labelNonOpaque.setOpaque(false);
        labelNonOpaque.setForeground(Color.green);
        labelNonOpaque.setBackground(Color.red);
        builder.append("Non-opaque label", labelNonOpaque);

        JLabel labelDefault = new JLabel("Sample label");
        labelDefault.setOpaque(true);
        labelDefault.setForeground(Color.green);
        labelDefault.setBackground(Color.red);
        builder.append("Default label", labelDefault);

        JCheckBox checkboxOpaque = new JCheckBox("Sample checkbox");
        checkboxOpaque.setOpaque(true);
        checkboxOpaque.setForeground(Color.blue);
        checkboxOpaque.setBackground(Color.yellow);
        builder.append("Opaque checkbox", checkboxOpaque);

        JCheckBox checkboxNonOpaque = new JCheckBox("Sample checkbox");
        checkboxNonOpaque.setOpaque(false);
        checkboxNonOpaque.setForeground(Color.blue);
        checkboxNonOpaque.setBackground(Color.yellow);
        builder.append("Non-opaque checkbox", checkboxNonOpaque);

        JCheckBox checkboxDefault = new JCheckBox("Sample checkbox");
        checkboxDefault.setForeground(Color.blue);
        checkboxDefault.setBackground(Color.yellow);
        builder.append("Default checkbox", checkboxDefault);

        JRadioButton radioOpaque = new JRadioButton("Sample radiobutton");
        radioOpaque.setOpaque(true);
        radioOpaque.setForeground(new Color(0, 128, 0));
        radioOpaque.setBackground(new Color(255, 180, 180));
        builder.append("Opaque radio", radioOpaque);

        JRadioButton radioNonOpaque = new JRadioButton("Sample radiobutton");
        radioNonOpaque.setOpaque(false);
        radioNonOpaque.setForeground(new Color(0, 128, 0));
        radioNonOpaque.setBackground(new Color(255, 180, 180));
        builder.append("Non-opaque radio", radioNonOpaque);

        JRadioButton radioDefault = new JRadioButton("Sample radiobutton");
        radioDefault.setForeground(new Color(0, 128, 0));
        radioDefault.setBackground(new Color(255, 180, 180));
        builder.append("Default radio", radioDefault);

        JSlider colored3 = new JSlider(100, 1000, 400);
        colored3.setPaintTicks(true);
        colored3.setMajorTickSpacing(100);
        colored3.setForeground(new Color(128, 0, 0));
        colored3.setBackground(new Color(180, 255, 180));
        builder.append("Slider", colored3);

        JPanel colored4 = new JPanel();
        colored4.setSize(100, 100);
        colored4.setPreferredSize(colored4.getSize());
        colored4.setBackground(Color.cyan);
        builder.append("panel", colored4);

        JPanel resultPanel = builder.getPanel();
        resultPanel.setBackground(new Color(200, 200, 255));
        this.add(new JScrollPane(resultPanel), BorderLayout.CENTER);
    }
}
