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
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.api.common.model.CommandGroup;
import org.pushingpixels.flamingo.api.common.model.CommandMenuContentModel;
import org.pushingpixels.flamingo.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.GeminiSkin;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiLevelMenu extends JFrame {

    public MultiLevelMenu() {
        super("Multi level menu");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        List<Command> menuCommands1 = new ArrayList<>();
        List<Command> menuCommands2 = new ArrayList<>();

        menuCommands1.add(Command.builder()
                .setText("Copy")
                .setIconFactory(Edit_copy.factory())
                .setAction(commandActionEvent -> System.out.println("Copy"))
                .build());
        menuCommands1.add(Command.builder()
                .setText("Cut")
                .setIconFactory(Edit_cut.factory())
                .setAction(commandActionEvent -> System.out.println("Cut"))
                .build());
        menuCommands1.add(Command.builder()
                .setText("Paste")
                .setIconFactory(Edit_paste.factory())
                .setAction(commandActionEvent -> System.out.println("Paste"))
                .build());

        List<Command> menuCommandsSecondary = new ArrayList<>();

        menuCommandsSecondary.add(Command.builder()
                .setText("Find")
                .setIconFactory(Edit_find.factory())
                .setAction(commandActionEvent -> System.out.println("Find"))
                .build());
        menuCommandsSecondary.add(Command.builder()
                .setText("Find replace")
                .setIconFactory(Edit_find_replace.factory())
                .setAction(commandActionEvent -> System.out.println("Find replace"))
                .build());

        menuCommands2.add(Command.builder()
                .setText("Find")
                .setSecondaryContentModel(new CommandMenuContentModel(
                        new CommandGroup(menuCommandsSecondary)))
                .build());

        CommandMenuContentModel menuContentModel = new CommandMenuContentModel(
                Arrays.asList(new CommandGroup(menuCommands1),
                        new CommandGroup(menuCommands2)));

        Command mainCommand = Command.builder()
                .setText("click me")
                .setSecondaryContentModel(menuContentModel)
                .build();

        CommandButtonProjection mainCommandProjection = mainCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setFlat(false)
                        .setPopupMenuPresentationModel(CommandPopupMenuPresentationModel.builder()
                                .setPopupOrientationKind(
                                        CommandButtonPresentationModel.PopupOrientationKind.SIDEWARD)
                                .build())
                        .build());

        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.add(mainCommandProjection.buildComponent());

        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceCortex.GlobalScope.setSkin(new GeminiSkin());

            new MultiLevelMenu().setVisible(true);
        });
    }

}
