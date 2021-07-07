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
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Address_book_new;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Edit_paste;
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Text_x_generic;
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
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;

public class TestCommandToggleButtons extends JFrame {
    ResourceBundle resourceBundle;

    private Locale currLocale;

    private JPanel buttonPanel;

    protected Command toggleCommandShort;
    protected Command toggleCommandLong;
    protected Command toggleCommandLongWithSecondary;

    TestCommandToggleButtons() {
        super("Command button test");
        this.setIconImage(RadianceLogo.getLogoImage(this,
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new BorderLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle.getBundle(
                "org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.configureControlPanel(controlPanel);

        this.toggleCommandShort = Command.builder()
                .setText(resourceBundle.getString("Short.text"))
                .setExtraText(resourceBundle.getString("SelectAll.textExtra"))
                .setIconFactory(Edit_paste.factory())
                .setToggle()
                .setAction(commandActionEvent -> System.out
                        .println(stamp() + ": command activated, selection state is "
                                + commandActionEvent.getCommand().isToggleSelected()))
                .build();

        this.toggleCommandLong = Command.builder()
                .setText(resourceBundle.getString("LongerLines.text"))
                .setExtraText(resourceBundle.getString("SelectAll.textExtra"))
                .setIconFactory(Edit_paste.factory())
                .setToggle()
                .setAction(commandActionEvent -> System.out
                        .println(stamp() + ": command activated, selection state is "
                                + commandActionEvent.getCommand().isToggleSelected()))
                .build();

        this.toggleCommandLongWithSecondary = Command.builder()
                .setText(resourceBundle.getString("LongerLines.text"))
                .setExtraText(resourceBundle.getString("SelectAll.textExtra"))
                .setIconFactory(Edit_paste.factory())
                .setToggle()
                .setAction(commandActionEvent -> System.out
                        .println(stamp() + ": command activated, selection state is "
                                + commandActionEvent.getCommand().isToggleSelected()))
                .setSecondaryContentModel(getPopupMenuContentModel())
                .build();

        buttonPanel = getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);

        this.add(controlPanel, BorderLayout.SOUTH);
    }

    private CommandMenuContentModel getPopupMenuContentModel() {
        MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
        mf.setLocale(currLocale);

        java.util.List<Command> simpleEntries1 = new ArrayList<>();
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
                columns("right:pref, 10dlu, center:pref, 4dlu, center:pref, 4dlu, center:pref").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add("Short text").xy(3, 1);
        builder.add("Long text").xy(5, 1);

        addButtons(builder, CommandButtonPresentationState.BIG, 3);
        addButtons(builder, CommandButtonPresentationState.TILE, 5);
        addButtons(builder, CommandButtonPresentationState.MEDIUM, 7);
        addButtons(builder, CommandButtonPresentationState.SMALL, 9);

        return builder.getPanel();
    }

    static String stamp() {
        return new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
    }

    private void addButtons(FormBuilder builder, CommandButtonPresentationState state, int row) {
        builder.add(state.getDisplayName() + " state").xy(1, row);

        JCommandButton buttonWithShortText =
                this.toggleCommandShort.project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(state)
                                .setFlat(false)
                                .build())
                        .buildComponent();
        builder.add(buttonWithShortText).xy(3, row);

        JCommandButton buttonWithLongText =
                this.toggleCommandLong.project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(state)
                                .setFlat(false)
                                .build())
                        .buildComponent();
        builder.add(buttonWithLongText).xy(5, row);

        JCommandButton buttonWithLongTextAndSecondary =
                this.toggleCommandLongWithSecondary.project(
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(state)
                                .setFlat(false)
                                .build())
                        .buildComponent();
        builder.add(buttonWithLongTextAndSecondary).xy(7, row);
    }

    protected void configureControlPanel(JPanel controlPanel) {
        controlPanel.add(SkinSwitcher.getSkinSwitcher(this));

        final JCheckBox actionEnabled = new JCheckBox("action enabled");
        actionEnabled.setSelected(true);
        actionEnabled.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            toggleCommandShort.setActionEnabled(actionEnabled.isSelected());
            toggleCommandLong.setActionEnabled(actionEnabled.isSelected());
        }));
        controlPanel.add(actionEnabled);

        JComboBox<LocaleSwitcher.LocaleInfo> localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
            currLocale = selected;
            resourceBundle = ResourceBundle.getBundle(
                    "org.pushingpixels.demo.flamingo.resource.Resources", currLocale);
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

            TestCommandToggleButtons frame = new TestCommandToggleButtons();
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        });
    }
}
