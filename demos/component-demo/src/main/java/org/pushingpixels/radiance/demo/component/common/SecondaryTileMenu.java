/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.component.api.common.icon.EmptyRadianceIcon;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.popup.model.CommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.*;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.GeminiSkin;

import javax.swing.*;
import java.awt.*;
import java.text.MessageFormat;
import java.util.*;
import java.util.List;

public class SecondaryTileMenu extends JFrame {
    Locale currLocale;
    ResourceBundle resourceBundle;

    public SecondaryTileMenu() {
        super("Multi level menu");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.radiance.demo.component.resource.Resources", currLocale);
        MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
        mf.setLocale(currLocale);

        List<Command> menuCommands = new ArrayList<>();
        Command command1 = Command.builder()
                .setText(mf.format(new Object[]{"1"}))
                .build();
        Command command2 = Command.builder()
                .setText(mf.format(new Object[]{"2"}))
                .setSecondaryContentModel(getPopupMenuContentModel())
                .build();
        Command command3 = Command.builder()
                .setText(mf.format(new Object[]{"3"}))
                .setSecondaryContentModel(getPopupMenuContentModel())
                .build();

        menuCommands.add(command1);
        menuCommands.add(command2);
        menuCommands.add(command3);

        CommandMenuContentModel menuContentModel = new CommandMenuContentModel(
                new CommandGroup(menuCommands));

        Command mainCommand = Command.builder()
                .setText("click me")
                .setSecondaryContentModel(menuContentModel)
                .build();

        CommandButtonProjection<Command> mainCommandProjection = mainCommand.project(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.MEDIUM)
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS)
                        .setPopupMenuPresentationModel(CommandPopupMenuPresentationModel.builder()
                                .setItemPopupFireTrigger(CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER)
                                .setPopupPlacementStrategy(
                                        RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP)
                                .build())
                        .build());
        Map<Command, CommandButtonPresentationModel.Overlay> overlays = new HashMap<>();
        for (CommandGroup group: command3.getSecondaryContentModel().getCommandGroups()) {
            for (Command command: group.getCommands()) {
                overlays.put(command,
                        CommandButtonPresentationModel.overlay().setPresentationState(CommandButtonPresentationState.TILE));
            }
        }
        mainCommandProjection.setCommandOverlays(overlays);

        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        this.add(mainCommandProjection.buildComponent());

        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private CommandMenuContentModel getPopupMenuContentModel() {
        MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
        MessageFormat mfExtra = new MessageFormat(resourceBundle.getString("TestMenuItem.textExtra"));
        MessageFormat mfLevel2 = new MessageFormat(resourceBundle.getString("TestMenuItem.textLevel2"));
        MessageFormat mfLevel2Extra = new MessageFormat(resourceBundle.getString("TestMenuItem.textLevel2Extra"));
        mf.setLocale(currLocale);
        mfExtra.setLocale(currLocale);
        mfLevel2.setLocale(currLocale);
        mfLevel2Extra.setLocale(currLocale);

        List<Command> simpleEntries1 = new ArrayList<>();
        List<Command> simpleEntries2 = new ArrayList<>();

        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[]{"1"}))
                .setExtraText(mfExtra.format(new Object[]{"1"}))
                .setIconFactory(Address_book_new.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 1"))
                .build());
        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[]{"2"}))
                .setExtraText(mfExtra.format(new Object[]{"2"}))
                .setIconFactory(EmptyRadianceIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 2"))
                .build());
        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[]{"3"}))
                .setExtraText(mfExtra.format(new Object[]{"3"}))
                .setIconFactory(EmptyRadianceIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 3"))
                .build());

        simpleEntries2.add(Command.builder()
                .setText(mf.format(new Object[]{"4"}))
                .setExtraText(mfExtra.format(new Object[]{"4"}))
                .setIconFactory(EmptyRadianceIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 4"))
                .setSecondaryContentModel(new CommandMenuContentModel(new CommandGroup(
                        Command.builder()
                                .setText(mfLevel2.format(new Object[]{"4", "1"}))
                                .setExtraText(mfLevel2Extra.format((new Object[]{"4", "1"})))
                                .setIconFactory(EmptyRadianceIcon.factory())
                                .setAction(commandActionEvent -> System.out.println("Popup action 4/2"))
                                .build(),
                        Command.builder()
                                .setText(mfLevel2.format(new Object[]{"4", "2"}))
                                .setExtraText(mfLevel2Extra.format((new Object[]{"4", "2"})))
                                .setIconFactory(EmptyRadianceIcon.factory())
                                .setAction(commandActionEvent -> System.out.println("Popup action 4/3"))
                                .build(),
                        Command.builder()
                                .setText(mfLevel2.format(new Object[]{"4", "3"}))
                                .setExtraText(mfLevel2Extra.format((new Object[]{"4", "3"})))
                                .setIconFactory(EmptyRadianceIcon.factory())
                                .setAction(commandActionEvent -> System.out.println("Popup action 4/4"))
                                .build()
                )))
                .build());
        simpleEntries2.add(Command.builder()
                .setText(mf.format(new Object[]{"5"}))
                .setExtraText(mfExtra.format(new Object[]{"5"}))
                .setIconFactory(Text_x_generic.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 5"))
                .build());

        return new CommandMenuContentModel(
                Arrays.asList(new CommandGroup(simpleEntries1),
                        new CommandGroup(simpleEntries2)));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame.setDefaultLookAndFeelDecorated(true);
            RadianceThemingCortex.GlobalScope.setSkin(new GeminiSkin());

            new SecondaryTileMenu().setVisible(true);
        });
    }

}
