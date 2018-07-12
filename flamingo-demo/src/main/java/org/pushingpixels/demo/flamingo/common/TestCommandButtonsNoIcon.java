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
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TestCommandButtonsNoIcon extends TestCommandButtons {
    @Override
    protected JCommandButton createActionButton(CommandButtonDisplayState state) {
        JCommandButton result = new JCommandButton(resourceBundle.getString("Paste.text"));
        result.setExtraText(resourceBundle.getString("Paste.textExtra"));
        result.addActionListener((ActionEvent e) -> System.out.println(stamp() + ": Main paste"));
        result.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_ONLY);
        result.setDisplayState(state);
        result.setFlat(false);
        return result;
    }

    @Override
    protected JCommandButton createActionAndPopupMainActionButton(CommandButtonDisplayState state) {
        JCommandButton result = new JCommandButton(resourceBundle.getString("Cut.text"));
        result.setExtraText(resourceBundle.getString("Cut.textExtra"));
        result.setPopupCallback(new TestPopupCallback());
        result.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        result.setDisplayState(state);
        result.setFlat(false);
        result.addActionListener((ActionEvent e) -> System.out.println(stamp() + ": Cut"));
        return result;
    }

    @Override
    protected JCommandButton createActionAndPopupMainPopupButton(CommandButtonDisplayState state) {
        JCommandButton result = new JCommandButton(resourceBundle.getString("Copy.text"));
        result.setExtraText(resourceBundle.getString("Copy.textExtra"));
        result.setPopupCallback(new TestPopupCallback());
        result.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
        result.setDisplayState(state);
        result.setFlat(false);
        result.addActionListener((ActionEvent e) -> System.out.println(stamp() + ": Copy"));
        return result;
    }

    @Override
    protected JCommandButton createPopupButton(CommandButtonDisplayState state) {
        JCommandButton result = new JCommandButton(resourceBundle.getString("SelectAll.text"));
        result.setExtraText(resourceBundle.getString("SelectAll.textExtra"));
        result.setPopupCallback(new TestPopupCallback());
        result.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        result.setDisplayState(state);
        result.setFlat(false);
        return result;
    }

    @Override
    protected void configureControlPanel(JPanel controlPanel) {
        super.configureControlPanel(controlPanel);
        final JCheckBox noIcon = new JCheckBox("no icon");
        noIcon.setSelected(true);
        wireCommandTo(noIcon, (JCommandButton button) ->
                button.setIcon(noIcon.isSelected() ? null : new Edit_paste()));
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
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            TestCommandButtonsNoIcon frame = new TestCommandButtonsNoIcon();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
