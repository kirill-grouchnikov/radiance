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
package org.pushingpixels.radiance.demo.theming.main.samples.theming.api;

import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.edit_copy;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.edit_cut;
import org.pushingpixels.radiance.demo.theming.main.check.svg.tango.edit_paste;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.GraphiteSkin;

import javax.swing.*;
import java.awt.*;

/**
 * Test application that shows the use of the
 * {@link RadianceThemingCortex.GlobalScope#setIconFilterStrategies(RadianceThemingSlices.IconFilterStrategy, RadianceThemingSlices.IconFilterStrategy, RadianceThemingSlices.IconFilterStrategy)} API.
 *
 * @author Kirill Grouchnikov
 * @see RadianceThemingCortex.GlobalScope#setIconFilterStrategies(RadianceThemingSlices.IconFilterStrategy, RadianceThemingSlices.IconFilterStrategy, RadianceThemingSlices.IconFilterStrategy)
 */
public class SetIconFilterStrategies extends JFrame {
    /**
     * Creates the main frame for <code>this</code> sample.
     */
    public SetIconFilterStrategies() {
        super("Use filtered inactive icons");

        this.setLayout(new BorderLayout());

        final JPanel panel = new JPanel(new FlowLayout());
        panel.add(new JButton("cut", edit_cut.of(22, 22)));
        panel.add(new JButton("copy", edit_copy.of(22, 22)));
        panel.add(new JButton("paste", edit_paste.of(22, 22)));
        this.add(panel, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        final JCheckBox useThemedIcons = new JCheckBox("use filtered inactive icons");
        useThemedIcons.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            // based on the checkbox selection status, call the API
            RadianceThemingCortex.GlobalScope.setIconFilterStrategies(
                    RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                    useThemedIcons.isSelected() ? RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME : RadianceThemingSlices.IconFilterStrategy.ORIGINAL,
                    RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME
            );
            SetIconFilterStrategies.this.repaint();
        }));
        controls.add(useThemedIcons);
        this.add(controls, BorderLayout.SOUTH);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * The main method for <code>this</code> sample. The arguments are ignored.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(() -> {
            RadianceThemingCortex.GlobalScope.setSkin(new GraphiteSkin());
            new SetIconFilterStrategies().setVisible(true);
        });
    }
}
