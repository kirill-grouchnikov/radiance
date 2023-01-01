/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.component.common;

import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Edit_copy;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Edit_cut;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Edit_paste;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;

public class TestCommandButtonsNoIcon extends TestCommandButtons {
    public TestCommandButtonsNoIcon() {
        super();

        // reconfigure the commands to show no icons
        copyCommand.setIconFactory(null);
        cutCommand.setIconFactory(null);
        pasteActionCommand.setIconFactory(null);
        pastePopupCommand.setIconFactory(null);
    }

    @Override
    protected void configureControlPanel(JPanel controlPanel) {
        super.configureControlPanel(controlPanel);

        final JCheckBox noIcon = new JCheckBox("no icon");
        noIcon.setSelected(true);
        noIcon.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            boolean isSelected = noIcon.isSelected();
            copyCommand.setIconFactory(isSelected ? null : Edit_copy.factory());
            cutCommand.setIconFactory(isSelected ? null : Edit_cut.factory());
            pasteActionCommand.setIconFactory(isSelected ? null : Edit_paste.factory());
            pastePopupCommand.setIconFactory(isSelected ? null : Edit_paste.factory());
        }));

        controlPanel.add(noIcon);
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new BusinessSkin());

            TestCommandButtonsNoIcon frame = new TestCommandButtonsNoIcon();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
