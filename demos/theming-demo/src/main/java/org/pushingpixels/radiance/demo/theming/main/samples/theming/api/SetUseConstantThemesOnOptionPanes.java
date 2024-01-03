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

import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.dialog_error;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.dialog_information;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.dialog_warning;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.help_browser;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.NebulaSkin;

import javax.swing.*;
import java.awt.*;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.GlobalScope#setUseConstantThemesOnOptionPanes(boolean)} API.
 * 
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.GlobalScope#setUseConstantThemesOnOptionPanes(boolean)
 */
public class SetUseConstantThemesOnOptionPanes extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public SetUseConstantThemesOnOptionPanes() {
        super("Use constant themes on dialogs");

        this.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton bopi = new JButton("Info", dialog_information.of(16, 16));
        bopi.addActionListener(actionEvent -> JOptionPane.showMessageDialog(
                SetUseConstantThemesOnOptionPanes.this, "Sample info message", "Sample title",
                JOptionPane.INFORMATION_MESSAGE));
        buttonPanel.add(bopi);

        JButton bope = new JButton("Show", dialog_error.of(16, 16));
        bope.addActionListener(actionEvent -> JOptionPane.showMessageDialog(
                SetUseConstantThemesOnOptionPanes.this, "Sample error message", "Sample title",
                JOptionPane.ERROR_MESSAGE));
        buttonPanel.add(bope);

        JButton bopw = new JButton("Show", dialog_warning.of(16, 16));
        bopw.addActionListener(actionEvent -> JOptionPane.showMessageDialog(
                SetUseConstantThemesOnOptionPanes.this, "Sample warning message", "Sample title",
                JOptionPane.WARNING_MESSAGE));
        buttonPanel.add(bopw);

        JButton bopq = new JButton("Show", help_browser.of(16, 16));
        bopq.addActionListener(actionEvent -> JOptionPane.showMessageDialog(
                SetUseConstantThemesOnOptionPanes.this, "Sample question message", "Sample title",
                JOptionPane.QUESTION_MESSAGE));
        buttonPanel.add(bopq);

        this.add(buttonPanel, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        final JCheckBox useConstantThemesOnOptionPanes = new JCheckBox(
                "Use constant themes on option panes");
        useConstantThemesOnOptionPanes.addActionListener(actionEvent -> SwingUtilities
                .invokeLater(() -> RadianceThemingCortex.GlobalScope.setUseConstantThemesOnOptionPanes(
                        useConstantThemesOnOptionPanes.isSelected())));
        controls.add(useConstantThemesOnOptionPanes);
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
            RadianceThemingCortex.GlobalScope.setSkin(new NebulaSkin());
            new SetUseConstantThemesOnOptionPanes().setVisible(true);
        });
    }
}
