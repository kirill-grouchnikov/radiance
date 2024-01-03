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
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.skin.BusinessBlackSteelSkin;

import javax.swing.*;
import java.awt.*;

/**
 * Test application that shows the use of the
 * {@link ComponentOrParentChainScope#setDecorationType(JComponent, DecorationAreaType)} API.
 * 
 * @author Kirill Grouchnikov
 * @see ComponentOrParentChainScope#setDecorationType(JComponent, DecorationAreaType)
 */
public class SetDecorationType extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public SetDecorationType() {
        super("Set decoration type");

        this.setLayout(new BorderLayout());

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        ComponentOrParentChainScope.setDecorationType(controls, DecorationAreaType.CONTROL_PANE);
        JToggleButton controlButton = new JToggleButton("control");
        controlButton.setSelected(true);
        JCheckBox controlCheckBox = new JCheckBox("control");
        controlCheckBox.setSelected(true);
        controls.add(new JLabel("CONTROL_PANE decoration:"));
        controls.add(controlButton);
        controls.add(controlCheckBox);
        this.add(controls, BorderLayout.SOUTH);

        JPanel content = new JPanel(new FlowLayout());
        JToggleButton sampleButton = new JToggleButton("control");
        sampleButton.setSelected(true);
        JCheckBox sampleCheckBox = new JCheckBox("control");
        sampleCheckBox.setSelected(true);
        content.add(new JLabel("Default decoration:"));
        content.add(sampleButton);
        content.add(sampleCheckBox);
        this.add(content, BorderLayout.CENTER);

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
        JDialog.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessBlackSteelSkin());
            new SetDecorationType().setVisible(true);
        });
    }
}
