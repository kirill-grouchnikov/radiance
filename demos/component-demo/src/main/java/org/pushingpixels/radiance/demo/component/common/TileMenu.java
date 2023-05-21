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

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandMenuContentModel;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Edit_copy;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Edit_cut;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.Edit_paste;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.GeminiSkin;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TileMenu extends JFrame {

    public TileMenu() {
        super("Multi level menu");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        List<Command> menuCommands = new ArrayList<>();

        menuCommands.add(Command.builder()
                .setText("Copy")
                .setExtraText("Extra for copy")
                .setIconFactory(Edit_copy.factory())
                .build());
        menuCommands.add(Command.builder()
                .setText("Cut")
                .setExtraText("Extra for cut")
                .setIconFactory(Edit_cut.factory())
                .build());
        menuCommands.add(Command.builder()
                .setText("Paste")
                .setExtraText("Extra for paste")
                .setIconFactory(Edit_paste.factory())
                .build());

        CommandMenuContentModel menuContentModel = new CommandMenuContentModel(
                new CommandGroup(menuCommands));

        Command mainCommand = Command.builder()
                .setText("click me")
                .setSecondaryContentModel(menuContentModel)
                .build();

        CommandButtonProjection mainCommandProjection = mainCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS)
                        .setPopupMenuPresentationModel(CommandPopupMenuPresentationModel.builder()
                                .setItemPresentationState(CommandButtonPresentationState.TILE)
                                .setItemPopupFireTrigger(CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER)
                                .setPopupPlacementStrategy(
                                        RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP)
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
            RadianceThemingCortex.GlobalScope.setSkin(new GeminiSkin());

            new TileMenu().setVisible(true);
        });
    }

}
