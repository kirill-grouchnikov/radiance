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

import com.jgoodies.forms.builder.FormBuilder;
import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.demo.flamingo.*;
import org.pushingpixels.demo.flamingo.svg.logo.RadianceLogo;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.*;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.model.*;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.List;
import java.util.*;

public class TestCommandButtons extends JFrame {
    private enum PopupKind {
        SIMPLE, SCROLLABLE, COMPLEX;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    ResourceBundle resourceBundle;

    Locale currLocale;

    protected Command pasteActionCommand;
    protected Command cutCommand;
    protected Command copyCommand;
    protected Command pastePopupCommand;

    private JPanel buttonPanel;

    private JComboBox popupCombo;

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
                .setTitle(resourceBundle.getString("SelectAll.text"))
                .setIconFactory(Edit_paste.factory())
                .setExtraText(resourceBundle.getString("SelectAll.textExtra"))
                .setPopupMenuProjection(getCurrentPopupMenuProjection())
                .build();

        this.copyCommand = Command.builder()
                .setTitle(resourceBundle.getString("Copy.text"))
                .setIconFactory(Edit_copy.factory())
                .setExtraText(resourceBundle.getString("Copy.textExtra"))
                .setAction((CommandActionEvent e) -> System.out.println(stamp() + ": Copy"))
                .setPopupMenuProjection(getCurrentPopupMenuProjection())
                .setTitleClickPopup()
                .build();

        this.cutCommand = Command.builder()
                .setTitle(resourceBundle.getString("Cut.text"))
                .setIconFactory(Edit_cut.factory())
                .setExtraText(resourceBundle.getString("Cut.textExtra"))
                .setAction((CommandActionEvent e) -> System.out.println(stamp() + ": Cut"))
                .setPopupMenuProjection(getCurrentPopupMenuProjection())
                .setTitleClickAction()
                .build();

        this.pasteActionCommand = Command.builder()
                .setTitle(resourceBundle.getString("Paste.text"))
                .setIconFactory(Edit_paste.factory())
                .setDisabledIconFactory(
                        () -> SubstanceCortex.GlobalScope.colorize(Edit_paste.of(16, 16),
                                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(null,
                                        ComponentState.DISABLED_UNSELECTED)))
                .setExtraText(resourceBundle.getString("Paste.textExtra"))
                .setAction((CommandActionEvent e) -> System.out.println(stamp() + ": Main paste"))
                .build();

        buttonPanel = getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);

    }

    private CommandPopupMenuProjection getCurrentPopupMenuProjection() {
        MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
        mf.setLocale(currLocale);

        CommandPresentation menuDisplay = CommandPresentation.builder().setMenu(true).build();

        PopupKind popupKind = (PopupKind) popupCombo.getSelectedItem();
        switch (popupKind) {
            case SIMPLE:
                List<CommandProjection> simpleEntries1 = new ArrayList<>();
                List<CommandProjection> simpleEntries2 = new ArrayList<>();

                simpleEntries1.add(org.pushingpixels.flamingo.api.common.model.Command.builder()
                        .setTitle(mf.format(new Object[] { "1" }))
                        .setIcon(new Address_book_new()).build().project(menuDisplay));
                simpleEntries1.add(org.pushingpixels.flamingo.api.common.model.Command.builder()
                        .setTitle(mf.format(new Object[] { "2" }))
                        .setIcon(new EmptyResizableIcon(16)).build().project(menuDisplay));
                simpleEntries1.add(org.pushingpixels.flamingo.api.common.model.Command.builder()
                        .setTitle(mf.format(new Object[] { "3" }))
                        .setIcon(new EmptyResizableIcon(16)).build().project(menuDisplay));

                simpleEntries2.add(org.pushingpixels.flamingo.api.common.model.Command.builder()
                        .setTitle(mf.format(new Object[] { "4" }))
                        .setIcon(new EmptyResizableIcon(16)).build().project(menuDisplay));
                simpleEntries2.add(org.pushingpixels.flamingo.api.common.model.Command.builder()
                        .setTitle(mf.format(new Object[] { "5" }))
                        .setIcon(new Text_x_generic()).build().project(menuDisplay));

                return new CommandPopupMenuProjection(
                        new CommandPopupMenuContentModel(
                                Arrays.asList(new CommandProjectionGroupModel(simpleEntries1),
                                        new CommandProjectionGroupModel(simpleEntries2))),
                        CommandPopupMenuPresentationModel.builder().build());

            case SCROLLABLE:
                List<CommandProjection> scrollableEntries = new ArrayList<>();

                for (int i = 0; i < 20; i++) {
                    final int index = i;
                    scrollableEntries.add(
                            org.pushingpixels.flamingo.api.common.model.Command.builder()
                                    .setTitle(mf.format(new Object[] { i }))
                                    .setIcon(new Text_x_generic())
                                    .setAction((CommandActionEvent e) -> System.out
                                            .println("Invoked action on '" + index + "'"))
                                    .build().project(menuDisplay));
                }

                return new CommandPopupMenuProjection(
                        new CommandPopupMenuContentModel(
                                new CommandProjectionGroupModel(scrollableEntries)),
                        CommandPopupMenuPresentationModel.builder()
                                .setMaxVisibleMenuCommands(8).build());

            default:
                List<CommandProjectionGroupModel> extraEntries = new ArrayList<>();
                extraEntries.add(new CommandProjectionGroupModel(
                        org.pushingpixels.flamingo.api.common.model.Command.builder()
                                .setTitle(resourceBundle.getString("SaveSelection.text"))
                                .setIcon(new X_office_document())
                                .build().project(menuDisplay),
                        org.pushingpixels.flamingo.api.common.model.Command.builder()
                                .setTitle(resourceBundle.getString("ClearSelection.text"))
                                .setIcon(new EmptyResizableIcon(16))
                                .build().project(menuDisplay)
                ));
                extraEntries.add(new CommandProjectionGroupModel(
                        org.pushingpixels.flamingo.api.common.model.Command.builder()
                                .setTitle(resourceBundle.getString("ApplyStyles.text"))
                                .setIcon(new EmptyResizableIcon(16))
                                .build().project(menuDisplay)
                ));

                return new CommandPopupMenuProjection(
                        new CommandPopupMenuContentModel(
                                QuickStylesPanel.getQuickStylesContentModel(resourceBundle,
                                        currLocale), extraEntries),
                        CommandPopupMenuPresentationModel.builder()
                                .setPanelPresentationModel(
                                        CommandPanelPresentationModel.builder()
                                                .setToShowGroupLabels(false)
                                                .setCommandDisplayState(
                                                        CommandButtonDisplayState.FIT_TO_ICON)
                                                .setCommandIconDimension(48)
                                                .setMaxColumns(5)
                                                .setMaxRows(3).build())
                                .build());
        }
    }

    protected JPanel getButtonPanel() {
        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 10dlu, center:pref, 4dlu,"
                        + "center:pref, 4dlu, center:pref, 4dlu, center:pref").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add("Action only").xy(3, 1);
        builder.add("Action (main) + popup").xy(5, 1);
        builder.add("Action + popup (main)").xy(7, 1);
        builder.add("Popup only").xy(9, 1);

        addButtons(builder, CommandButtonDisplayState.BIG, 3);
        addButtons(builder, CommandButtonDisplayState.TILE, 5);
        addButtons(builder, CommandButtonDisplayState.MEDIUM, 7);
        addButtons(builder, CommandButtonDisplayState.SMALL, 9);

        return builder.build();
    }

    static String stamp() {
        return new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
    }

    private void addButtons(FormBuilder builder, CommandButtonDisplayState state, int row) {
        builder.add(state.getDisplayName() + " state").xy(1, row);

        AbstractCommandButton actionButton = createActionButton(state);
        builder.add(actionButton).xy(3, row);

        AbstractCommandButton actionAndPopupMainActionButton =
                createActionAndPopupMainActionButton(state);
        builder.add(actionAndPopupMainActionButton).xy(5, row);

        AbstractCommandButton actionAndPopupMainPopupButton =
                createActionAndPopupMainPopupButton(state);
        builder.add(actionAndPopupMainPopupButton).xy(7, row);

        AbstractCommandButton popupButton = createPopupButton(state);
        builder.add(popupButton).xy(9, row);
    }

    protected AbstractCommandButton createPopupButton(CommandButtonDisplayState state) {
        return this.pastePopupCommand.project(
                CommandPresentation.builder()
                        .setCommandDisplayState(state)
                        .setFlat(false)
                        .build()).project();
    }

    protected AbstractCommandButton createActionAndPopupMainPopupButton(CommandButtonDisplayState state) {
        return this.copyCommand.project(
                CommandPresentation.builder()
                        .setCommandDisplayState(state)
                        .setFlat(false)
                        .build()).project();
    }

    protected AbstractCommandButton createActionAndPopupMainActionButton(CommandButtonDisplayState state) {
        return this.cutCommand.project(
                CommandPresentation.builder()
                        .setCommandDisplayState(state)
                        .setFlat(false)
                        .build()).project();
    }

    protected AbstractCommandButton createActionButton(CommandButtonDisplayState state) {
        return this.pasteActionCommand.project(
                CommandPresentation.builder()
                        .setCommandDisplayState(state)
                        .setFlat(false)
                        .build()).project();
    }

    protected void configureControlPanel(JPanel controlPanel) {
        controlPanel.add(SkinSwitcher.getSkinSwitcher(this));

        final JCheckBox enabled = new JCheckBox("enabled");
        enabled.setSelected(true);
        enabled.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            copyCommand.setEnabled(enabled.isSelected());
            cutCommand.setEnabled(enabled.isSelected());
            pasteActionCommand.setEnabled(enabled.isSelected());
            pastePopupCommand.setEnabled(enabled.isSelected());
        }));
        controlPanel.add(enabled);

        final JCheckBox actionEnabled = new JCheckBox("action enabled");
        actionEnabled.setSelected(true);
        actionEnabled.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            copyCommand.setActionEnabled(actionEnabled.isSelected());
            cutCommand.setActionEnabled(actionEnabled.isSelected());
            pasteActionCommand.setActionEnabled(actionEnabled.isSelected());
            pastePopupCommand.setActionEnabled(actionEnabled.isSelected());
        }));
        controlPanel.add(actionEnabled);

        final JCheckBox popupEnabled = new JCheckBox("popup enabled");
        popupEnabled.setSelected(true);
        popupEnabled.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            copyCommand.setPopupEnabled(popupEnabled.isSelected());
            cutCommand.setPopupEnabled(popupEnabled.isSelected());
            pasteActionCommand.setPopupEnabled(popupEnabled.isSelected());
            pastePopupCommand.setPopupEnabled(popupEnabled.isSelected());
        }));
        controlPanel.add(popupEnabled);

        popupCombo = new JComboBox(PopupKind.values());
        popupCombo.setSelectedItem(PopupKind.SIMPLE);
        popupCombo.addItemListener((ItemEvent e) -> SwingUtilities.invokeLater(() -> {
            pastePopupCommand.setPopupMenuProjection(getCurrentPopupMenuProjection());
            cutCommand.setPopupMenuProjection(getCurrentPopupMenuProjection());
            copyCommand.setPopupMenuProjection(getCurrentPopupMenuProjection());
        }));
        controlPanel.add(popupCombo);

        JComboBox localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
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
