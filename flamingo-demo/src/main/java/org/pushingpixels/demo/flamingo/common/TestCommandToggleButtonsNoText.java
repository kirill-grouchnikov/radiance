/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Edit_paste;
import org.pushingpixels.flamingo.api.common.CommandButtonDisplayState;
import org.pushingpixels.flamingo.api.common.JCommandToggleButton;
import org.pushingpixels.flamingo.api.common.icon.FilteredResizableIcon;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.image.ColorConvertOp;

public class TestCommandToggleButtonsNoText extends TestCommandToggleButtons {
    @Override
    protected JCommandToggleButton createToggleButton(CommandButtonDisplayState state,
            String title) {
        JCommandToggleButton mainButton = new JCommandToggleButton(new Edit_paste());
        mainButton.setDisabledIcon(new FilteredResizableIcon(new Edit_paste(),
                new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null)));
        mainButton.addActionListener(
                (ActionEvent e) -> System.out.println(stamp() + ": Main selection"));
        mainButton.setDisplayState(state);
        mainButton.setFlat(false);
        return mainButton;
    }

    @Override
    protected void configureControlPanel(JPanel controlPanel) {
        super.configureControlPanel(controlPanel);
        final JCheckBox noText = new JCheckBox("no text");
        noText.setSelected(true);
        wireCommandTo(noText, (JCommandToggleButton button) -> {
            button.setText(noText.isSelected() ? null : "New caption");
            button.setExtraText(noText.isSelected() ? null : "New extra text");
        });
        controlPanel.add(noText);
    }

    /**
     * Main method for testing.
     *
     * @param args Ignored.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            TestCommandToggleButtonsNoText frame = new TestCommandToggleButtonsNoText();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
