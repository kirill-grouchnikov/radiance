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
package org.pushingpixels.demo.flamingo.common;

import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.*;
import org.pushingpixels.demo.substance.main.check.selector.SubstanceSkinSelector;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;

public class TestToggleMenuButtons extends JFrame {
    private TestToggleMenuButtons() {
        this.setIconImage(RadianceLogo.getLogoImage(this,
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        CommandToggleGroupModel justifyGroup = new CommandToggleGroupModel();

        Command justifyLeft = Command.builder()
                .setText("left")
                .setIconFactory(Format_justify_left.factory())
                .inToggleGroup(justifyGroup)
                .build();
        Command justifyCenter = Command.builder()
                .setText("center")
                .setIconFactory(Format_justify_center.factory())
                .inToggleGroup(justifyGroup)
                .build();
        Command justifyRight = Command.builder()
                .setText("right")
                .setIconFactory(Format_justify_right.factory())
                .inToggleGroup(justifyGroup)
                .build();
        Command justifyFill = Command.builder()
                .setText("fill")
                .setIconFactory(Format_justify_fill.factory())
                .inToggleGroup(justifyGroup)
                .build();

        CommandMenuContentModel justifyMenuContentModel = new CommandMenuContentModel(
                new CommandGroup(justifyLeft, justifyCenter, justifyRight, justifyFill));

        JCommandButton singleChoice =
                Command.builder()
                        .setText("single")
                        .setSecondaryContentModel(justifyMenuContentModel)
                        .build()
                        .project(CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.MEDIUM)
                                .setFlat(false)
                                .build())
                        .buildComponent();

        Command formatBold = Command.builder()
                .setText("bold")
                .setIconFactory(Format_text_bold.factory())
                .setToggle()
                .build();
        Command formatItalic = Command.builder()
                .setText("italic")
                .setIconFactory(Format_text_italic.factory())
                .setToggle()
                .build();
        Command formatUnderline = Command.builder()
                .setText("underline")
                .setIconFactory(Format_text_underline.factory())
                .setToggle()
                .build();
        Command formatStrikethrough = Command.builder()
                .setText("strikethrough")
                .setIconFactory(Format_text_strikethrough.factory())
                .setToggle()
                .build();

        CommandMenuContentModel formatMenuContentModel = new CommandMenuContentModel(
                new CommandGroup(formatBold, formatItalic, formatUnderline,
                        formatStrikethrough));

        JCommandButton multiChoice =
                Command.builder()
                        .setText("multi")
                        .setSecondaryContentModel(formatMenuContentModel)
                        .build()
                        .project(CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.MEDIUM)
                                .setFlat(false)
                                .setPopupMenuPresentationModel(
                                        CommandPopupMenuPresentationModel.builder()
                                                .setToDismissOnCommandActivation(false).build())
                                .build())
                        .buildComponent();

        JPanel main = new JPanel(new FlowLayout());
        main.add(singleChoice);
        main.add(multiChoice);
        this.add(main, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        controlPanel.add(new SubstanceSkinSelector());
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
