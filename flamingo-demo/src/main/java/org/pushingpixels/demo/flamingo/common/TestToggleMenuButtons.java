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

import org.pushingpixels.demo.flamingo.SkinSwitcher;
import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.*;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;

public class TestToggleMenuButtons extends JFrame {
    private TestToggleMenuButtons() {
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        JCommandButton singleChoice = new JCommandButton("single");
        singleChoice.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        singleChoice.setDisplayState(CommandButtonDisplayState.MEDIUM);
        singleChoice.setFlat(false);

        final JCommandToggleMenuButton b11 = new JCommandToggleMenuButton("left",
                new Format_justify_left());
        final JCommandToggleMenuButton b12 = new JCommandToggleMenuButton("center",
                new Format_justify_center());
        final JCommandToggleMenuButton b13 = new JCommandToggleMenuButton("right",
                new Format_justify_right());
        final JCommandToggleMenuButton b14 = new JCommandToggleMenuButton("fill",
                new Format_justify_fill());

        CommandToggleButtonGroup group = new CommandToggleButtonGroup();
        group.add(b11);
        group.add(b12);
        group.add(b13);
        group.add(b14);

        singleChoice.setPopupCallback((JCommandButton commandButton) -> {
            JCommandPopupMenu result = new JCommandPopupMenu();

            result.addMenuButton(b11);
            result.addMenuButton(b12);
            result.addMenuButton(b13);
            result.addMenuButton(b14);

            return result;
        });

        JCommandButton multiChoice = new JCommandButton("multi");
        multiChoice.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        multiChoice.setDisplayState(CommandButtonDisplayState.MEDIUM);
        multiChoice.setFlat(false);

        final JCommandToggleMenuButton b21 = new JCommandToggleMenuButton("bold",
                new Format_text_bold());
        final JCommandToggleMenuButton b22 = new JCommandToggleMenuButton("italic",
                new Format_text_italic());
        final JCommandToggleMenuButton b23 = new JCommandToggleMenuButton("underline",
                new Format_text_underline());
        final JCommandToggleMenuButton b24 = new JCommandToggleMenuButton("strike",
                new Format_text_strikethrough());

        multiChoice.setPopupCallback((JCommandButton commandButton) -> {
            JCommandPopupMenu result = new JCommandPopupMenu();

            result.addMenuButton(b21);
            result.addMenuButton(b22);
            result.addMenuButton(b23);
            result.addMenuButton(b24);

            result.setToDismissOnChildClick(false);

            return result;
        });

        JPanel main = new JPanel(new FlowLayout());
        main.add(singleChoice);
        main.add(multiChoice);
        this.add(main, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        controlPanel.add(SkinSwitcher.getSkinSwitcher(this));
        this.add(controlPanel, BorderLayout.SOUTH);

        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new BusinessSkin());

            new TestToggleMenuButtons().setVisible(true);
        });
    }
}
