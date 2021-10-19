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
package org.pushingpixels.radiance.demo.components.common;

import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;

public class TestCommandToggleButtonsNoText extends TestCommandToggleButtons {
    public TestCommandToggleButtonsNoText() {
        super();

        // reconfigure the commands to show no texts
        this.toggleCommandShort.setText(null);
        this.toggleCommandShort.setExtraText(null);
        this.toggleCommandLong.setText(null);
        this.toggleCommandLong.setExtraText(null);
    }

    @Override
    protected void configureControlPanel(JPanel controlPanel) {
        super.configureControlPanel(controlPanel);
        final JCheckBox noText = new JCheckBox("no text");
        noText.setSelected(true);
        noText.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            boolean isSelected = noText.isSelected();
            toggleCommandShort.setText(isSelected ? null : "New caption");
            toggleCommandShort.setExtraText(isSelected ? null : "New extra text");
            toggleCommandLong.setText(isSelected ? null : "New caption");
            toggleCommandLong.setExtraText(isSelected ? null : "New extra text");
        }));
        controlPanel.add(noText);
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());

            TestCommandToggleButtonsNoText frame = new TestCommandToggleButtonsNoText();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        });
    }
}
