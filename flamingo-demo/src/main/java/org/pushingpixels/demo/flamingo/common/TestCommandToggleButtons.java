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
import org.pushingpixels.demo.flamingo.svg.tango.transcoded.Edit_paste;
import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.icon.FilteredResizableIcon;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.skin.BusinessSkin;

import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.image.ColorConvertOp;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestCommandToggleButtons extends JFrame {
    ResourceBundle resourceBundle;

    private Locale currLocale;

    private JPanel buttonPanel;

    interface Command {
        void apply(JCommandToggleButton button);
    }

    static void apply(Container cont, Command cmd) {
        for (int i = 0; i < cont.getComponentCount(); i++) {
            Component comp = cont.getComponent(i);
            if (comp instanceof JCommandToggleButton) {
                JCommandToggleButton cb = (JCommandToggleButton) comp;
                cmd.apply(cb);
            }
            if (comp instanceof Container) {
                apply((Container) comp, cmd);
            }
        }
    }

    TestCommandToggleButtons() {
        super("Command button test");
        this.setIconImage(RadianceLogo.getLogoImage(
                SubstanceCortex.GlobalScope.getCurrentSkin().getColorScheme(
                        SubstanceSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
                        SubstanceSlices.ColorSchemeAssociationKind.FILL,
                        ComponentState.ENABLED)));

        this.setLayout(new BorderLayout());

        currLocale = Locale.getDefault();
        resourceBundle = ResourceBundle.getBundle(
                "org.pushingpixels.demo.flamingo.resource.Resources", currLocale);

        buttonPanel = getButtonPanel();
        this.add(buttonPanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        this.configureControlPanel(controlPanel);

        this.add(controlPanel, BorderLayout.SOUTH);
    }

    private JPanel getButtonPanel() {
        FormBuilder builder = FormBuilder.create().
                columns("right:pref, 10dlu, center:pref, 4dlu, center:pref").
                rows("p, $lg, p, $lg, p, $lg, p, $lg, p").
                padding(Paddings.DIALOG);

        builder.add("Short text").xy(3, 1);
        builder.add("Long text").xy(5, 1);

        addButtons(builder, CommandButtonDisplayState.BIG, 3);
        addButtons(builder, CommandButtonDisplayState.TILE, 5);
        addButtons(builder, CommandButtonDisplayState.MEDIUM, 7);
        addButtons(builder, CommandButtonDisplayState.SMALL, 9);

        return builder.getPanel();
    }

    static String stamp() {
        return new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
    }

    private void addButtons(FormBuilder builder, CommandButtonDisplayState state, int row) {
        builder.add(state.getDisplayName() + " state").xy(1, row);

        JCommandToggleButton buttonWithShortText = createToggleButton(state,
                resourceBundle.getString("Short.text"));
        builder.add(buttonWithShortText).xy(3, row);
        JCommandToggleButton buttonWithLongText = createToggleButton(state,
                resourceBundle.getString("LongerLines.text"));
        builder.add(buttonWithLongText).xy(5, row);
    }

    protected JCommandToggleButton createToggleButton(CommandButtonDisplayState state,
            String title) {
        final JCommandToggleButton mainButton = new JCommandToggleButton(title, new Edit_paste());
        mainButton.setDisabledIcon(new FilteredResizableIcon(new Edit_paste(),
                new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null)));
        mainButton.setExtraText(resourceBundle.getString("SelectAll.textExtra"));
        mainButton.addActionListener((ActionEvent e) -> System.out
                .println(stamp() + ": button activated, selection state is "
                        + mainButton.getActionModel().isSelected()));
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
                scan(TestCommandToggleButtons.this);
                repaint();
            }

            private void scan(Container c) {
                for (int i = 0; i < c.getComponentCount(); i++) {
                    Component child = c.getComponent(i);
                    if (child instanceof JCommandToggleButton)
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
                        scan(TestCommandToggleButtons.this);
                        repaint();
                    }

                    private void scan(Container c) {
                        for (int i = 0; i < c.getComponentCount(); i++) {
                            Component child = c.getComponent(i);
                            if (child instanceof JCommandToggleButton)
                                ((JCommandToggleButton) child).getActionModel()
                                        .setEnabled(actionEnabled.isSelected());
                            if (child instanceof Container)
                                scan((Container) child);
                        }
                    }
                }));
        controlPanel.add(actionEnabled);

        final JCheckBox actionOnPress = new JCheckBox("action on press");
        actionOnPress.setSelected(false);
        actionOnPress
                .addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        scan(TestCommandToggleButtons.this);
                        repaint();
                    }

                    private void scan(Container c) {
                        for (int i = 0; i < c.getComponentCount(); i++) {
                            Component child = c.getComponent(i);
                            if (child instanceof JCommandToggleButton)
                                ((JCommandToggleButton) child).getActionModel()
                                        .setFireActionOnPress(actionOnPress.isSelected());
                            if (child instanceof Container)
                                scan((Container) child);
                        }
                    }
                }));
        controlPanel.add(actionOnPress);

        final JCheckBox flat = new JCheckBox("flat");
        flat.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                scan(TestCommandToggleButtons.this);
                repaint();
            }

            private void scan(Container c) {
                for (int i = 0; i < c.getComponentCount(); i++) {
                    Component child = c.getComponent(i);
                    if (child instanceof JCommandToggleButton)
                        ((JCommandToggleButton) child).setFlat(flat.isSelected());
                    if (child instanceof Container)
                        scan((Container) child);
                }
            }
        }));
        controlPanel.add(flat);

        JComboBox localeSwitcher = LocaleSwitcher.getLocaleSwitcher((Locale selected) -> {
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

    protected void wireCommandTo(JCheckBox checkbox, Command command) {
        checkbox.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(
                () -> apply(TestCommandToggleButtons.this, command)));
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
