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

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.demo.flamingo.LocaleSwitcher;
import org.pushingpixels.demo.flamingo.SkinSwitcher;
import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.*;
import org.pushingpixels.flamingo.api.common.CommandActionEvent;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.api.common.model.CommandGroup;
import org.pushingpixels.flamingo.api.common.model.CommandMenuContentModel;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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

    TestCommandButtons() {
        super("Command button test");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.configureControlPanel(controlPanel);

        this.add(controlPanel, BorderLayout.SOUTH);

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

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
                .setDisabledIconFactory(
                        () -> SubstanceCortex.GlobalScope.colorizeIconAsUiResource(
                                Edit_paste.factory(),
                                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(null,
                                        ComponentState.DISABLED_UNSELECTED)))
                .setExtraText(resourceBundle.getString("Paste.textExtra"))
                .setAction(commandActionEvent -> System.out.println(stamp() + ": Main paste"))
                .build();

        buttonPanel = getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);
    }

    private CommandMenuContentModel getPopupMenuContentModel() {
        MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
        mf.setLocale(currLocale);

        List<Command> simpleEntries1 = new ArrayList<>();
        List<Command> simpleEntries2 = new ArrayList<>();

        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[] { "1" }))
                .setIconFactory(Address_book_new.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 1"))
                .build());
        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[] { "2" }))
                .setIconFactory(EmptyResizableIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 2"))
                .build());
        simpleEntries1.add(Command.builder()
                .setText(mf.format(new Object[] { "3" }))
                .setIconFactory(EmptyResizableIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 3"))
                .build());

        simpleEntries2.add(Command.builder()
                .setText(mf.format(new Object[] { "4" }))
                .setIconFactory(EmptyResizableIcon.factory())
                .setAction(commandActionEvent -> System.out.println("Popup action 4"))
                .build());
        simpleEntries2.add(Command.builder()
                .setText(mf.format(new Object[] { "5" }))
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
                        .setFlat(false);
        configurePresentationBuilder(presentationBuilder);

        return this.pastePopupCommand.project(presentationBuilder.build())
                .buildComponent();
    }

    private JCommandButton createActionAndPopupMainPopupButton(CommandButtonPresentationState state) {
        CommandButtonPresentationModel.Builder presentationBuilder =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(state)
                        .setTextClickPopup()
                        .setFlat(false);
        configurePresentationBuilder(presentationBuilder);

        return this.copyCommand.project(presentationBuilder.build())
                .buildComponent();
    }

    private JCommandButton createActionAndPopupMainActionButton(CommandButtonPresentationState state) {
        CommandButtonPresentationModel.Builder presentationBuilder =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(state)
                        .setTextClickAction()
                        .setFlat(false);
        configurePresentationBuilder(presentationBuilder);

        return this.cutCommand.project(presentationBuilder.build())
                .buildComponent();
    }

    private JCommandButton createActionButton(CommandButtonPresentationState state) {
        CommandButtonPresentationModel.Builder presentationBuilder =
                CommandButtonPresentationModel.builder()
                        .setPresentationState(state)
                        .setFlat(false);
        configurePresentationBuilder(presentationBuilder);

        return this.pasteActionCommand.project(presentationBuilder.build())
                .buildComponent();
    }

    protected void configureControlPanel(JPanel controlPanel) {
        controlPanel.add(SkinSwitcher.getSkinSwitcher(this));

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

        JComboBox<LocaleSwitcher.LocaleInfo> localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
            currLocale = selected;
            resourceBundle = ResourceBundle.getBundle("test.resource.Resources", currLocale);
            remove(buttonPanel);
            buttonPanel = getButtonPanel();
            add(buttonPanel, BorderLayout.CENTER);
            Window window = SwingUtilities.getWindowAncestor(buttonPanel);
            window.applyComponentOrientation(ComponentOrientation.getOrientation(currLocale));
            SwingUtilities.updateComponentTreeUI(window);
        });
        controlPanel.add(localeSwitcher);
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
            TestCommandButtons frame = new TestCommandButtons();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        });
    }
}
