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

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.icon.EmptyRadianceIcon;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandGroup;
import org.pushingpixels.radiance.component.api.common.model.CommandMenuContentModel;
import org.pushingpixels.radiance.component.api.common.projection.BaseCommandButtonProjection;
import org.pushingpixels.radiance.demo.component.common.custom.CustomComplexCommand;
import org.pushingpixels.radiance.demo.component.common.custom.CustomComplexCommandButtonPresentationModel;
import org.pushingpixels.radiance.demo.component.common.custom.CustomComplexCommandButtonProjection;
import org.pushingpixels.radiance.demo.component.common.custom.CustomComplexPopupMenuContentModel;
import org.pushingpixels.radiance.demo.component.common.custom.CustomComplexPopupMenuContentModel.CustomComplexPopupMenuEdit;
import org.pushingpixels.radiance.demo.component.common.custom.CustomComplexPopupMenuContentModel.CustomComplexPopupMenuFooter;
import org.pushingpixels.radiance.demo.component.common.custom.CustomComplexPopupMenuContentModel.CustomComplexPopupMenuHeader;
import org.pushingpixels.radiance.demo.component.common.custom.CustomComplexPopupMenuContentModel.CustomComplexPopupMenuZoom;
import org.pushingpixels.radiance.demo.component.svg.logo.RadianceLogo;
import org.pushingpixels.radiance.demo.component.svg.material.transcoded.fullscreen_black_24dp;
import org.pushingpixels.radiance.demo.component.svg.material.transcoded.menu_black_24dp;
import org.pushingpixels.radiance.demo.component.svg.tango.transcoded.*;
import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceLocaleSelector;
import org.pushingpixels.radiance.demo.theming.main.check.selector.RadianceSkinSelector;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.skin.BusinessSkin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;

public class TestCommandButtons extends JFrame {
    ResourceBundle resourceBundle;

    Locale currLocale;

    protected Command pasteActionCommand;
    protected Command cutCommand;
    protected Command copyCommand;
    protected Command pastePopupCommand;

    private JPanel buttonPanel;
    private JPanel customPanel;

    TestCommandButtons() {
        super("Command button test");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                RadianceThemingCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        RadianceThemingSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.configureControlPanel(controlPanel);

        this.add(controlPanel, BorderLayout.SOUTH);

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.radiance.demo.component.resource.Resources", currLocale);

        this.rebuildCommands();
        buttonPanel = this.getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);

        this.customPanel = new JPanel();
        this.customPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        this.customPanel.setBorder(new EmptyBorder(8, 20, 8, 20));
        this.customPanel.add(getCustomButtonProjection().buildComponent());
        this.add(customPanel, BorderLayout.NORTH);
    }

    private void rebuildCommands() {
        this.pastePopupCommand = Command.builder()
                .setText(resourceBundle.getString("SelectAll.text"))
                .setIconFactory(Edit_paste.factory())
                .setExtraText(resourceBundle.getString("SelectAll.textExtra"))
                .setSecondaryContentModel(getPopupMenuContentModel())
                .build();

        this.copyCommand = Command.builder()
                .setText(resourceBundle.getString("Copy.text"))
                .setIconFactory(Edit_copy.factory())
                .setExtraText(resourceBundle.getString("Copy.textExtra"))
                .setAction(commandActionEvent -> System.out.println(stamp() + ": Copy"))
                .setSecondaryContentModel(getPopupMenuContentModel())
                .build();

        this.cutCommand = Command.builder()
                .setText(resourceBundle.getString("Cut.text"))
                .setIconFactory(Edit_cut.factory())
                .setExtraText(resourceBundle.getString("Cut.textExtra"))
                .setAction(commandActionEvent -> System.out.println(stamp() + ": Cut"))
                .setSecondaryContentModel(getPopupMenuContentModel())
                .build();

        this.pasteActionCommand = Command.builder()
                .setText(resourceBundle.getString("Paste.text"))
                .setIconFactory(Edit_paste.factory())
                .setExtraText(resourceBundle.getString("Paste.textExtra"))
                .setAction(commandActionEvent -> System.out.println(stamp() + ": Main paste"))
                .build();
    }

    private CommandMenuContentModel getPopupMenuContentModel() {
        MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
        MessageFormat mfExtra = new MessageFormat(resourceBundle.getString("TestMenuItem.textExtra"));
        mf.setLocale(currLocale);
        mfExtra.setLocale(currLocale);

        List<Command> simpleEntries1 = new ArrayList<>();
        List<Command> simpleEntries2 = new ArrayList<>();

        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[]{"1"}))
                .setIconFactory(Address_book_new.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 1"))
                .build());
        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[]{"2"}))
                .setIconFactory(EmptyRadianceIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 2"))
                .build());
        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[]{"3"}))
                .setIconFactory(EmptyRadianceIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 3"))
                .build());

        simpleEntries2.add(Command.builder()
                .setText(mf.format(new Object[]{"4"}))
                .setIconFactory(EmptyRadianceIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 4"))
                .setSecondaryContentModel(new CommandMenuContentModel(new CommandGroup(
                        Command.builder()
                                .setText(mf.format(new Object[]{"4", "1"}))
                                .setIconFactory(EmptyRadianceIcon.factory())
                                .setAction(commandActionEvent -> System.out.println("Popup action 4/2"))
                                .build(),
                        Command.builder()
                                .setText(mf.format(new Object[]{"4", "2"}))
                                .setIconFactory(EmptyRadianceIcon.factory())
                                .setAction(commandActionEvent -> System.out.println("Popup action 4/3"))
                                .build(),
                        Command.builder()
                                .setText(mf.format(new Object[]{"4", "3"}))
                                .setIconFactory(EmptyRadianceIcon.factory())
                                .setAction(commandActionEvent -> System.out.println("Popup action 4/4"))
                                .build()
                )))
                .build());
        simpleEntries2.add(Command.builder()
                .setText(mf.format(new Object[]{"5"}))
                .setIconFactory(Text_x_generic.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 5"))
                .build());

        return new CommandMenuContentModel(
                Arrays.asList(new CommandGroup(simpleEntries1),
                        new CommandGroup(simpleEntries2)));
    }

    private JPanel getButtonPanel() {
        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 10dlu, center:pref, 4dlu,"
                        + "center:pref, 4dlu, center:pref, 4dlu, center:pref").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add("Action only").xy(3, 1);
        builder.add("Action (main) + popup").xy(5, 1);
        builder.add("Action + popup (main)").xy(7, 1);
        builder.add("Popup only").xy(9, 1);

        addButtons(builder, CommandButtonPresentationState.BIG, 3);
        addButtons(builder, CommandButtonPresentationState.TILE, 5);
        addButtons(builder, CommandButtonPresentationState.MEDIUM, 7);
        addButtons(builder, CommandButtonPresentationState.SMALL, 9);

        return builder.build();
    }

    private static String stamp() {
        return new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
    }

    private void addButtons(FormBuilder builder, CommandButtonPresentationState state, int row) {
        builder.add(state.getDisplayName() + " state").xy(1, row);

        JCommandButton actionButton = createActionButton(state);
        builder.add(actionButton).xy(3, row);

        JCommandButton actionAndPopupMainActionButton =
                createActionAndPopupMainActionButton(state);
        builder.add(actionAndPopupMainActionButton).xy(5, row);

        JCommandButton actionAndPopupMainPopupButton =
                createActionAndPopupMainPopupButton(state);
        builder.add(actionAndPopupMainPopupButton).xy(7, row);

        JCommandButton popupButton = createPopupButton(state);
        builder.add(popupButton).xy(9, row);
    }

    protected void configurePresentationBuilder(CommandButtonPresentationModel.Builder builder) {
    }

    private JCommandButton createPopupButton(CommandButtonPresentationState state) {
        CommandButtonPresentationModel.Builder presentationBuilder =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(state)
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS);
        configurePresentationBuilder(presentationBuilder);

        return this.pastePopupCommand.project(presentationBuilder.build())
                .buildComponent();
    }

    private JCommandButton createActionAndPopupMainPopupButton(CommandButtonPresentationState state) {
        CommandButtonPresentationModel.Builder presentationBuilder =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(state)
                        .setTextClick(CommandButtonPresentationModel.TextClick.POPUP)
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS);
        configurePresentationBuilder(presentationBuilder);

        return this.copyCommand.project(presentationBuilder.build())
                .buildComponent();
    }

    private JCommandButton createActionAndPopupMainActionButton(CommandButtonPresentationState state) {
        CommandButtonPresentationModel.Builder presentationBuilder =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(state)
                        .setTextClick(CommandButtonPresentationModel.TextClick.ACTION)
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS);
        configurePresentationBuilder(presentationBuilder);

        return this.cutCommand.project(presentationBuilder.build())
                .buildComponent();
    }

    private JCommandButton createActionButton(CommandButtonPresentationState state) {
        CommandButtonPresentationModel.Builder presentationBuilder =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(state)
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS);
        configurePresentationBuilder(presentationBuilder);

        return this.pasteActionCommand.project(presentationBuilder.build())
                .buildComponent();
    }

    protected void configureControlPanel(JPanel controlPanel) {
        controlPanel.add(new RadianceSkinSelector());

        final JCheckBox actionEnabled = new JCheckBox("action enabled");
        actionEnabled.setSelected(true);
        actionEnabled.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            copyCommand.setActionEnabled(actionEnabled.isSelected());
            cutCommand.setActionEnabled(actionEnabled.isSelected());
            pasteActionCommand.setActionEnabled(actionEnabled.isSelected());
            pastePopupCommand.setActionEnabled(actionEnabled.isSelected());
        }));
        controlPanel.add(actionEnabled);

        final JCheckBox popupEnabled = new JCheckBox("popup enabled");
        popupEnabled.setSelected(true);
        popupEnabled.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            copyCommand.setSecondaryEnabled(popupEnabled.isSelected());
            cutCommand.setSecondaryEnabled(popupEnabled.isSelected());
            pasteActionCommand.setSecondaryEnabled(popupEnabled.isSelected());
            pastePopupCommand.setSecondaryEnabled(popupEnabled.isSelected());
        }));
        controlPanel.add(popupEnabled);

        controlPanel.add(new RadianceLocaleSelector(false, selected -> {
            currLocale = selected;
            resourceBundle = ResourceBundle.getBundle(
                    "org.pushingpixels.radiance.demo.component.resource.Resources", currLocale);

            rebuildCommands();

            remove(buttonPanel);
            buttonPanel = getButtonPanel();
            add(buttonPanel, BorderLayout.CENTER);

            customPanel.removeAll();
            customPanel.add(getCustomButtonProjection().buildComponent());

            Window window = SwingUtilities.getWindowAncestor(buttonPanel);
            window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
            SwingUtilities.updateComponentTreeUI(window);
        }));
    }

    private static int[] ZOOM_LEVELS = {30, 50, 67, 80, 90, 100, 110, 120, 133, 150, 170, 200, 240, 300, 400, 500};
    private static int CURR_ZOOM_LEVEL_INDEX = 5;
    private static Command ZOOM_OUT_COMMAND;
    private static Command ZOOM_IN_COMMAND;
    private static CustomComplexPopupMenuZoom MENU_ZOOM;

    private BaseCommandButtonProjection getCustomButtonProjection() {
        ZOOM_OUT_COMMAND = Command.builder()
                .setText("-")
                .setAction(commandActionEvent -> {
                    CURR_ZOOM_LEVEL_INDEX--;
                    MENU_ZOOM.setZoom(ZOOM_LEVELS[CURR_ZOOM_LEVEL_INDEX]);
                    ZOOM_OUT_COMMAND.setActionEnabled(CURR_ZOOM_LEVEL_INDEX > 0);
                    ZOOM_IN_COMMAND.setActionEnabled(CURR_ZOOM_LEVEL_INDEX < (ZOOM_LEVELS.length - 1));
                })
                .build();
        ZOOM_IN_COMMAND = Command.builder()
                .setText("+")
                .setAction(commandActionEvent -> {
                    CURR_ZOOM_LEVEL_INDEX++;
                    MENU_ZOOM.setZoom(ZOOM_LEVELS[CURR_ZOOM_LEVEL_INDEX]);
                    ZOOM_OUT_COMMAND.setActionEnabled(CURR_ZOOM_LEVEL_INDEX > 0);
                    ZOOM_IN_COMMAND.setActionEnabled(CURR_ZOOM_LEVEL_INDEX < (ZOOM_LEVELS.length - 1));
                })
                .build();
        MessageFormat managedByMf = new MessageFormat(resourceBundle.getString("Menu.managedBy"));
        managedByMf.setLocale(currLocale);

        CustomComplexPopupMenuContentModel menuContentModel =
                new CustomComplexPopupMenuContentModel();
        menuContentModel.addSection(
                CustomComplexPopupMenuContentModel.sectionBuilder()
                        .addHeader(new CustomComplexPopupMenuHeader(
                                resourceBundle.getString("Menu.syncAndSaveData"),
                                Command.builder()
                                        .setText(resourceBundle.getString("Menu.signIn"))
                                        .setAction(commandActionEvent -> System.out.println("Sign in"))
                                        .build(),
                                new Color[]{new Color(167, 130, 245),
                                        new Color(240, 128, 180),
                                        new Color(248, 206, 136)
                                })
                        )
                        .addCommand(Command.builder()
                                .setText(resourceBundle.getString("Menu.history"))
                                .setAction(commandActionEvent -> System.out.println("History"))
                                .build())
                        .addCommand(Command.builder()
                                .setText(resourceBundle.getString("Menu.downloads"))
                                .setAction(commandActionEvent -> System.out.println("Downloads"))
                                .build())
                        .addCommand(Command.builder()
                                .setText(resourceBundle.getString("Menu.bookmarks"))
                                .setAction(commandActionEvent -> System.out.println("Bookmarks"))
                                .build())
                        .build());
        MENU_ZOOM = new CustomComplexPopupMenuZoom(
                resourceBundle.getString("Menu.zoom"),
                ZOOM_LEVELS[CURR_ZOOM_LEVEL_INDEX],
                ZOOM_OUT_COMMAND,
                ZOOM_IN_COMMAND,
                Command.builder()
                        .setText("")
                        .setIconFactory(fullscreen_black_24dp.factory())
                        .setAction(commandActionEvent -> System.out.println("Full screen!"))
                        .build()
        );
        menuContentModel.addSection(
                CustomComplexPopupMenuContentModel.sectionBuilder()
                        .addZoom(MENU_ZOOM)
                        .build()
        );
        menuContentModel.addSection(
                CustomComplexPopupMenuContentModel.sectionBuilder()
                        .addCommand(Command.builder()
                                .setText(resourceBundle.getString("Menu.print"))
                                .setAction(commandActionEvent -> System.out.println("Print"))
                                .build())
                        .addCommand(Command.builder()
                                .setText(resourceBundle.getString("Menu.cast"))
                                .setAction(commandActionEvent -> System.out.println("Cast"))
                                .build())
                        .addCommand(Command.builder()
                                .setText(resourceBundle.getString("Menu.find"))
                                .setAction(commandActionEvent -> System.out.println("Find"))
                                .build())
                        .build());
        menuContentModel.addSection(
                CustomComplexPopupMenuContentModel.sectionBuilder()
                        .addEdit(new CustomComplexPopupMenuEdit(
                                resourceBundle.getString("Menu.edit"),
                                Command.builder()
                                        .setText(resourceBundle.getString("Cut.text"))
                                        .setAction(commandActionEvent -> System.out.println("Cut"))
                                        .build(),
                                Command.builder()
                                        .setText(resourceBundle.getString("Copy.text"))
                                        .setAction(commandActionEvent -> System.out.println("Copy"))
                                        .build(),
                                Command.builder()
                                        .setText(resourceBundle.getString("Paste.text"))
                                        .setAction(commandActionEvent -> System.out.println("Past"))
                                        .build()))
                        .build());
        menuContentModel.addSection(
                CustomComplexPopupMenuContentModel.sectionBuilder()
                        .addCommand(Command.builder()
                                .setText(resourceBundle.getString("Menu.settings"))
                                .setAction(commandActionEvent -> System.out.println("Settings"))
                                .build())
                        .addCommand(Command.builder()
                                .setText(resourceBundle.getString("Menu.help"))
                                .setSecondaryContentModel(new CommandMenuContentModel(
                                        new CommandGroup(
                                                Command.builder()
                                                        .setText(resourceBundle.getString("Menu.help.about"))
                                                        .setAction(commandActionEvent -> System.out.println("About"))
                                                        .build(),
                                                Command.builder()
                                                        .setText(resourceBundle.getString("Menu.help.whatsNew"))
                                                        .setAction(commandActionEvent -> System.out.println("What's New"))
                                                        .build(),
                                                Command.builder()
                                                        .setText(resourceBundle.getString("Menu.help.helpCenter"))
                                                        .setAction(commandActionEvent -> System.out.println("Help Center"))
                                                        .build()))
                                )
                                .build()
                        )
                        .build());
        menuContentModel.addSection(
                CustomComplexPopupMenuContentModel.sectionBuilder()
                        .addFooter(new CustomComplexPopupMenuFooter(
                                Command.builder()
                                        .setText(managedByMf.format(new Object[]{"acme.com"}))
                                        .setAction(commandActionEvent -> System.out.println("Manage"))
                                        .build()))
                        .build());

        return new CustomComplexCommandButtonProjection(
                CustomComplexCommand.builder()
                        .setIconFactory(menu_black_24dp.factory())
                        .setSecondaryContentModel(menuContentModel)
                        .build(),
                CustomComplexCommandButtonPresentationModel.builder()
                        .setPresentationState(CommandButtonPresentationState.SMALL)
                        .setContentPadding(CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING)
                        .setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy.ALWAYS)
                        .setPopupPlacementStrategy(RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_END)
                        .setShowPopupIcon(false)
                        .setHorizontalAlignment(HorizontalAlignment.CENTER)
                        .setIconFilterStrategies(
                                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_TEXT,
                                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME)
                        .build());
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
            TestCommandButtons frame = new TestCommandButtons();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });
    }
}
