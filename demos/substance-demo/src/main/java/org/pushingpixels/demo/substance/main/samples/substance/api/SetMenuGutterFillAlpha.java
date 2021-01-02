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
package org.pushingpixels.demo.substance.main.samples.substance.api;

import org.pushingpixels.demo.substance.main.check.svg.flags.mx;
import org.pushingpixels.demo.substance.main.check.svg.flags.se;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;

/**
 * Test application that shows the use of the
 * {@link SubstanceCortex.GlobalScope#setMenuGutterFillAlpha(float)} API.
 *
 * @author Kirill Grouchnikov
 * @see SubstanceCortex.GlobalScope#setMenuGutterFillAlpha(float)
 */
public class SetMenuGutterFillAlpha extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public SetMenuGutterFillAlpha() {
        super("Menu gutter fill kind");

        setLayout(new BorderLayout());

        // create sample menu bar with one menu and a few menu items
        JMenuBar jmb = new JMenuBar();
        JMenu menu = new JMenu("menu");
        menu.add(new JMenuItem("test item 1", mx.of(16, 16)));
        menu.add(new JMenuItem("test item 2"));
        menu.add(new JMenuItem("test item 3"));
        menu.addSeparator();
        menu.add(new JMenuItem("test menu item 4"));
        menu.add(new JMenuItem("test menu item 5", se.of(16, 16)));
        menu.add(new JMenuItem("test menu item 6"));
        jmb.add(menu);

        setJMenuBar(jmb);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        final JSlider alphaSlider = new JSlider(0, 100,
                (int) (100 * SubstanceCortex.GlobalScope.getMenuGutterFillAlpha()));
        alphaSlider.addChangeListener(changeEvent -> {
            float val = alphaSlider.getValue() / 100.0f;
            SubstanceCortex.GlobalScope.setMenuGutterFillAlpha(val);
        });

        controls.add(new JLabel("Menu gutter alpha fill"));
        controls.add(alphaSlider);

        this.add(controls, BorderLayout.SOUTH);

        this.setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            SubstanceCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new SetMenuGutterFillAlpha().setVisible(true);
        });
    }
}
