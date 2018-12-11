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
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.GeminiSkin;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;

public class TileMenu extends JFrame {

    public TileMenu() {
        super("Multi level menu");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        List<Command> menuCommands = new ArrayList<>();

        menuCommands.add(Command.builder()
                .setText("Copy")
                .setExtraText("Extra for copy")
                .setIcon(new Edit_copy())
                .build());
        menuCommands.add(Command.builder()
                .setText("Cut")
                .setExtraText("Extra for cut")
                .setIcon(new Edit_cut())
                .build());
        menuCommands.add(Command.builder()
                .setText("Paste")
                .setExtraText("Extra for paste")
                .setIcon(new Edit_paste())
                .build());

        CommandPopupMenuContentModel menuContentModel = new CommandPopupMenuContentModel(
                new CommandGroupModel(menuCommands));

        Command mainCommand = Command.builder()
                .setText("click me")
                .setPopupMenuProjection(new CommandPopupMenuProjection(menuContentModel,
                        CommandPopupMenuPresentationModel.builder()
                                .setMenuPresentationState(CommandButtonPresentationState.TILE)
                                .setPopupOrientationKind(
                                        CommandPresentation.CommandButtonPopupOrientationKind.SIDEWARD)
                                .build()))
                .build();

        CommandProjection mainCommandProjection = mainCommand.project(
                CommandPresentation.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setFlat(false)
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

            new TileMenu().setVisible(true);
        });
    }

}
