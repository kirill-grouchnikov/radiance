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
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonPopupOrientationKind;
import org.pushingpixels.flamingo.api.common.icon.EmptyResizableIcon;
import org.pushingpixels.flamingo.api.common.popup.*;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.*;
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

    private JPanel buttonPanel;

    private JComboBox popupCombo;

    interface Command {
        void apply(JCommandButton button);
    }

    static void apply(Container cont, Command cmd) {
        for (int i = 0; i < cont.getComponentCount(); i++) {
            Component comp = cont.getComponent(i);
            if (comp instanceof JCommandButton) {
                JCommandButton cb = (JCommandButton) comp;
                cmd.apply(cb);
            }
            if (comp instanceof Container) {
                apply((Container) comp, cmd);
            }
        }
    }

    TestCommandButtons() {
        super("Command button test");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new BorderLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle
                .getBundle("org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        buttonPanel = getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.configureControlPanel(controlPanel);

        this.add(controlPanel, BorderLayout.SOUTH);
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

    protected class TestPopupCallback implements PopupPanelCallback {
        @Override
        public JPopupPanel getPopupPanel(JCommandButton commandButton) {
            MessageFormat mf = new MessageFormat(resourceBundle.getString("TestMenuItem.text"));
            mf.setLocale(currLocale);

            PopupKind popupKind = (PopupKind) popupCombo.getSelectedItem();
            switch (popupKind) {
                case SIMPLE:
                    JCommandPopupMenu simpleMenu = new JCommandPopupMenu();

                    simpleMenu.addMenuButton(new JCommandMenuButton(mf.format(new Object[]{"1"}),
                            new Address_book_new()));
                    simpleMenu.addMenuButton(new JCommandMenuButton(mf.format(new Object[]{"2"}),
                            new EmptyResizableIcon(16)));
                    simpleMenu.addMenuButton(new JCommandMenuButton(mf.format(new Object[]{"3"}),
                            new EmptyResizableIcon(16)));
                    simpleMenu.addMenuSeparator();
                    simpleMenu.addMenuButton(new JCommandMenuButton(mf.format(new Object[]{"4"}),
                            new EmptyResizableIcon(16)));
                    simpleMenu.addMenuButton(new JCommandMenuButton(mf.format(new Object[]{"5"}),
                            new Text_x_generic()));
                    return simpleMenu;
                case SCROLLABLE:
                    JCommandPopupMenu scrollableMenu = new JCommandPopupMenu();

                    for (int i = 0; i < 20; i++) {
                        final JCommandMenuButton smb = new JCommandMenuButton(
                                mf.format(new Object[]{i}), new Text_x_generic());
                        smb.addActionListener((ActionEvent e) -> System.out
                                .println("Invoked action on '" + smb.getText() + "'"));
                        scrollableMenu.addMenuButton(smb);
                    }
                    scrollableMenu.setMaxVisibleMenuButtons(8);
                    return scrollableMenu;

                case COMPLEX:
                    JCommandPopupMenu complexMenu = new JCommandPopupMenu(
                            new QuickStylesPanel(resourceBundle, currLocale), 5, 3);
                    complexMenu.addMenuButton(new JCommandMenuButton(
                            resourceBundle.getString("SaveSelection.text"),
                            new X_office_document()));
                    complexMenu.addMenuButton(
                            new JCommandMenuButton(resourceBundle.getString("ClearSelection.text"),
                                    new EmptyResizableIcon(16)));
                    complexMenu.addMenuSeparator();
                    complexMenu.addMenuButton(new JCommandMenuButton(
                            resourceBundle.getString("ApplyStyles.text"),
                            new EmptyResizableIcon(16)));
                    return complexMenu;
            }
            return null;
        }
    }

    protected void wireCommandTo(JCheckBox checkbox, Command command) {
        checkbox.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(
                () -> apply(TestCommandButtons.this, command)));
    }

    private void addButtons(FormBuilder builder, CommandButtonDisplayState state, int row) {
        builder.add(state.getDisplayName() + " state").xy(1, row);

        JCommandButton actionButton = createActionButton(state);
        builder.add(actionButton).xy(3, row);

        JCommandButton actionAndPopupMainActionButton = createActionAndPopupMainActionButton(state);
        builder.add(actionAndPopupMainActionButton).xy(5, row);

        JCommandButton actionAndPopupMainPopupButton = createActionAndPopupMainPopupButton(state);
        builder.add(actionAndPopupMainPopupButton).xy(7, row);

        JCommandButton popupButton = createPopupButton(state);
        builder.add(popupButton).xy(9, row);
    }

    protected JCommandButton createPopupButton(CommandButtonDisplayState state) {
        JCommandButton popupButton = new JCommandButton(resourceBundle.getString("SelectAll.text"),
                new Edit_paste());
        popupButton.setExtraText(resourceBundle.getString("SelectAll.textExtra"));
        popupButton.setPopupCallback(new TestPopupCallback());
        popupButton.setCommandButtonKind(JCommandButton.CommandButtonKind.POPUP_ONLY);
        popupButton.setDisplayState(state);
        popupButton.setFlat(false);
        return popupButton;
    }

    protected JCommandButton createActionAndPopupMainPopupButton(CommandButtonDisplayState state) {
        JCommandButton copyButton = new JCommandButton(resourceBundle.getString("Copy.text"),
                new Edit_copy());
        copyButton.setExtraText(resourceBundle.getString("Copy.textExtra"));
        copyButton.setPopupCallback(new TestPopupCallback());
        copyButton
                .setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP);
        copyButton.setDisplayState(state);
        copyButton.setFlat(false);
        copyButton.addActionListener((ActionEvent e) -> System.out.println(stamp() + ": Copy"));
        return copyButton;
    }

    protected JCommandButton createActionAndPopupMainActionButton(CommandButtonDisplayState state) {
        JCommandButton cutButton = new JCommandButton(resourceBundle.getString("Cut.text"),
                new Edit_cut());
        cutButton.setExtraText(resourceBundle.getString("Cut.textExtra"));
        cutButton.setPopupCallback(new TestPopupCallback());
        cutButton.setCommandButtonKind(
                JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION);
        cutButton.setDisplayState(state);
        cutButton.setFlat(false);
        cutButton.addActionListener((ActionEvent e) -> System.out.println(stamp() + ": Cut"));
        return cutButton;
    }

    protected JCommandButton createActionButton(CommandButtonDisplayState state) {
        JCommandButton mainButton = new JCommandButton(resourceBundle.getString("Paste.text"),
                new Edit_paste());
        mainButton.setDisabledIcon(
                SubstanceCortex.GlobalScope.colorize(Edit_paste.of(16, 16),
                        SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(mainButton,
                                ComponentState.DISABLED_UNSELECTED)));
        mainButton.setExtraText(resourceBundle.getString("Paste.textExtra"));
        mainButton
                .addActionListener((ActionEvent e) -> System.out.println(stamp() + ": Main paste"));
        mainButton.setCommandButtonKind(JCommandButton.CommandButtonKind.ACTION_ONLY);
        mainButton.setDisplayState(state);
        mainButton.setFlat(false);
        return mainButton;
    }

    protected void configureControlPanel(JPanel controlPanel) {
        controlPanel.add(SkinSwitcher.getSkinSwitcher(this));

        final JCheckBox enabled = new JCheckBox("enabled");
        enabled.setSelected(true);
        enabled.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                scan(TestCommandButtons.this);
                repaint();
            }

            private void scan(Container c) {
                for (int i = 0; i < c.getComponentCount(); i++) {
                    Component child = c.getComponent(i);
                    if (child instanceof AbstractCommandButton)
                        child.setEnabled(enabled.isSelected());
                    if (child instanceof Container)
                        scan((Container) child);
                }
            }
        }));
        controlPanel.add(enabled);

        final JCheckBox actionEnabled = new JCheckBox("action enabled");
        actionEnabled.setSelected(true);
        actionEnabled
                .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        scan(TestCommandButtons.this);
                        repaint();
                    }

                    private void scan(Container c) {
                        for (int i = 0; i < c.getComponentCount(); i++) {
                            Component child = c.getComponent(i);
                            if (child instanceof AbstractCommandButton)
                                ((AbstractCommandButton) child).getActionModel()
                                        .setEnabled(actionEnabled.isSelected());
                            if (child instanceof Container)
                                scan((Container) child);
                        }
                    }
                }));
        controlPanel.add(actionEnabled);

        final JCheckBox popupEnabled = new JCheckBox("popup enabled");
        popupEnabled.setSelected(true);
        popupEnabled
                .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        scan(TestCommandButtons.this);
                        repaint();
                    }

                    private void scan(Container c) {
                        for (int i = 0; i < c.getComponentCount(); i++) {
                            Component child = c.getComponent(i);
                            if (child instanceof JCommandButton)
                                ((JCommandButton) child).getPopupModel()
                                        .setEnabled(popupEnabled.isSelected());
                            if (child instanceof Container)
                                scan((Container) child);
                        }
                    }
                }));
        controlPanel.add(popupEnabled);

        final JCheckBox flat = new JCheckBox("flat");
        flat.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                scan(TestCommandButtons.this);
                repaint();
            }

            private void scan(Container c) {
                for (int i = 0; i < c.getComponentCount(); i++) {
                    Component child = c.getComponent(i);
                    if (child instanceof AbstractCommandButton)
                        ((AbstractCommandButton) child).setFlat(flat.isSelected());
                    if (child instanceof Container)
                        scan((Container) child);
                }
            }
        }));
        controlPanel.add(flat);

        final JCheckBox downward = new JCheckBox("downward");
        downward.setSelected(true);
        downward.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                scan(TestCommandButtons.this);
                repaint();
            }

            private void scan(Container c) {
                for (int i = 0; i < c.getComponentCount(); i++) {
                    Component child = c.getComponent(i);
                    if (child instanceof JCommandButton)
                        ((JCommandButton) child).setPopupOrientationKind(
                                downward.isSelected() ? CommandButtonPopupOrientationKind.DOWNWARD
                                                      : CommandButtonPopupOrientationKind.SIDEWARD);
                    if (child instanceof Container)
                        scan((Container) child);
                }
            }
        }));
        controlPanel.add(downward);

        popupCombo = new JComboBox(PopupKind.values());
        popupCombo.setSelectedItem(PopupKind.SIMPLE);
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
