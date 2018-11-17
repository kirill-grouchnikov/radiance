/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.JCommandButton.*;
import org.pushingpixels.flamingo.api.common.model.CommandGroupModel;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.GeminiSkin;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class MultiLevelMenu extends JFrame {

    public MultiLevelMenu() {
        super("Multi level menu");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        JCommandButton main = new JCommandButton("click me");
        main.setCommandButtonKind(CommandButtonKind.POPUP_ONLY);
        main.setDisplayState(CommandButtonDisplayState.MEDIUM);
        main.setFlat(false);

        // first level menu
        main.setPopupCallback((JCommandButton commandButton) -> {
            List<FlamingoCommand> menuCommands1 = new ArrayList<>();
            List<FlamingoCommand> menuCommands2 = new ArrayList<>();

            menuCommands1.add(FlamingoCommand.builder()
                    .setTitle("Copy").setIcon(new Edit_copy()).build());
            menuCommands1.add(FlamingoCommand.builder()
                    .setTitle("Cut").setIcon(new Edit_cut()).build());
            menuCommands1.add(FlamingoCommand.builder()
                    .setTitle("Paste").setIcon(new Edit_paste()).build());

            menuCommands2.add(FlamingoCommand.builder()
                    .setTitle("Find")
                    .setPopupCallback((JCommandButton commandButton2) -> {
                        List<FlamingoCommand> menuCommandsSecondary = new ArrayList<>();

                        menuCommandsSecondary.add(FlamingoCommand.builder()
                                .setTitle("Find").setIcon(new Edit_find()).build());
                        menuCommandsSecondary.add(FlamingoCommand.builder()
                                .setTitle("Find replace").setIcon(new Edit_find_replace()).build());

                        return new JCommandPopupMenu(new CommandPopupMenuContentModel(
                                new CommandGroupModel(menuCommandsSecondary)),
                                CommandPopupMenuPresentationModel.builder().build());
                    }).build());

            CommandPopupMenuContentModel menuContentModel = new CommandPopupMenuContentModel(
                    Arrays.asList(new CommandGroupModel(menuCommands1),
                            new CommandGroupModel(menuCommands2)));

            return new JCommandPopupMenu(menuContentModel,
                    CommandPopupMenuPresentationModel.builder()
                            .setPopupOrientationKind(CommandButtonPopupOrientationKind.SIDEWARD)
                            .build());
        });

        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.add(main);

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
