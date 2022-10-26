/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.theming.main.check;

import com.jgoodies.forms.factories.Paddings;
import org.pushingpixels.radiance.demo.theming.main.check.command.ConfigurationCommand;
import org.pushingpixels.radiance.demo.theming.main.check.command.DisableCommand;
import org.pushingpixels.radiance.demo.theming.main.check.command.EnableCommand;
import org.pushingpixels.radiance.demo.theming.main.check.svg.flags.il;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.combo.WidestComboPopupPrototype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * Test application panel for testing {@link JComboBox} component.
 * 
 * @author Kirill Grouchnikov
 */
public class CombosPanel extends ControllablePanel implements Deferrable {
    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    /**
     * A configure command that allows editing the specified combobox.
     * 
     * @author Kirill Grouchnikov
     */
    public static class EditAllowCommand implements ConfigurationCommand<JComboBox> {
        @Override
        public void configure(JComboBox combo) {
            combo.setEditable(true);
        }
    }

    /**
     * A configure command that disallows editing the specified combobox.
     * 
     * @author Kirill Grouchnikov
     */
    public static class EditDisallowCommand implements ConfigurationCommand<JComboBox> {
        @Override
        public void configure(JComboBox combo) {
            combo.setEditable(false);
        }
    }

    /**
     * Applies the specified configuration command on all combobox children of the specified
     * component.
     * 
     * @param comp
     *            Component.
     * @param command
     *            Configuration command to apply.
     */
    public static void run(Component comp, ConfigurationCommand<? super JComboBox> command) {
        if (comp instanceof JComboBox) {
            command.configure((JComboBox) comp);
            return;
        }
        if (comp instanceof Container) {
            Container cont = (Container) comp;
            for (int i = 0; i < cont.getComponentCount(); i++) {
                run(cont.getComponent(i), command);
            }
        }
    }

    /**
     * Text editor for a combobox that checks fix for defect 151.
     * 
     * @author Kirill Grouchnikov
     */
    private class ComboBoxTextEditor151 extends JTextField implements ComboBoxEditor {
        /**
         * Document.
         */
        javax.swing.text.Document doc;

        /**
         * Creates the text editor.
         */
        public ComboBoxTextEditor151() {
            super();
            doc = super.getDocument();
        }

        @Override
        public java.awt.Component getEditorComponent() {
            return this;
        }

        @Override
        public void setItem(Object anObject) {
            if (anObject instanceof EditableDocument151) {
                super.setCaretPosition(0);
                super.setDocument((javax.swing.text.Document) anObject);
            } else {
                super.setCaretPosition(0);
                super.setDocument(doc);
                super.setText(anObject.toString());

            }

        }

        @Override
        public Object getItem() {
            return super.getText();
        }

        @Override
        public String toString() {
            return super.getText();
        }
    }

    /**
     * The document for checking fix for defect 151.
     * 
     * @author Kirill Grouchnikov
     */
    private static class EditableDocument151 extends javax.swing.text.PlainDocument {
        /**
         * Creates the document.
         */
        public EditableDocument151() {
            this.setText("Long text to show the bug");
        }

        @Override
        public String toString() {
            try {
                return super.getText(0, super.getLength());
            } catch (javax.swing.text.BadLocationException ex) {
                return "bad location";
            }
        }

        /**
         * @param newText
         */
        public void setText(String newText) {
            try {
                super.remove(0, super.getLength());
                super.insertString(0, newText, new javax.swing.text.SimpleAttributeSet());

            } catch (javax.swing.text.BadLocationException ex) {
                ex.printStackTrace();
            }

        }
    }

    /**
     * Returns the left panel with comboboxes.
     * 
     * @return The left panel with comboboxes.
     */
    private JPanel getLeftComboPanel() {
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder("right:pref, 4dlu, fill:pref:grow", 2, 14)
                .padding(Paddings.DIALOG);

        builder.appendSeparator("Simple combos");

        JComboBox<String> comboRegular = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboRegular.setToolTipText("This is my combo 1");
        comboRegular.setMaximumRowCount(4);
        builder.append("Regular", comboRegular);

        JComboBox<String> comboDisabled = new JComboBox<>(new String[] { "entry1", "entry2", "entry3" });
        comboDisabled.setEnabled(false);
        builder.append(new JLabel("Disabled"), comboDisabled);

        JComboBox<String> comboColored = new JComboBox<>(new String[] { "entry31", "entry32", "entry33",
                        "entry34", "entry35", "entry36", "aaa", "abb", "abc" });
        comboColored.setName("Colored combo");
        comboColored.setBackground(new Color(255, 128, 128));
        comboColored.setForeground(new Color(0, 0, 128));
        builder.append("Pink background", comboColored);

        JComboBox<String> comboEditable = new JComboBox<>(
                new String[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
        comboEditable.setEditable(true);
        builder.append("Editable", comboEditable);

        JComboBox<Color> comboColors = new FlexiComboBox<>(new Color(255, 128, 128),
                new Color(128, 255, 128), new Color(128, 128, 255), new Color(255, 255, 128),
                new Color(255, 128, 255), new Color(128, 255, 255)) {
            @Override
            public String getCaption(Color item) {
                return item.getRed() + ":" + item.getGreen() + ":" + item.getBlue();
            }

            @Override
            public Color getItemColor(Color item) {
                return item;
            }
        };
        comboColors.setName("Colors combo");
        builder.append("Colors", comboColors);

        JComboBox<String> comboFlat = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        RadianceThemingCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(comboFlat,
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT);
        builder.append("Flat", comboFlat);

        JComboBox<String> comboDefaultCoreRenderer = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboDefaultCoreRenderer.setRenderer(new DefaultListCellRenderer());
        builder.append("Default core renderer", comboDefaultCoreRenderer);

        builder.appendSeparator("Miscellaneous");

        ColorComboBox colorCombo = new ColorComboBox();
        builder.append("Color chooser", colorCombo);

        JComboBox<String> comboHebrew = new JComboBox<>(new String[] { "\u05e8\u05d0\u05e9\u05d9 1",
                        "\u05e8\u05d0\u05e9\u05d9 2", "\u05e8\u05d0\u05e9\u05d9 3",
                        "\u05e8\u05d0\u05e9\u05d9 4", "\u05e8\u05d0\u05e9\u05d9 5",
                        "\u05e8\u05d0\u05e9\u05d9 6", "\u05e8\u05d0\u05e9\u05d9 7",
                        "\u05e8\u05d0\u05e9\u05d9 8", "\u05e8\u05d0\u05e9\u05d9 9" });
        comboHebrew.setToolTipText("RTL combo");
        comboHebrew.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        comboHebrew.setMaximumRowCount(6);
        builder.append("RTL (Hebrew)", comboHebrew);

        final Icon israelFlag = il.of(16, 16);
        JComboBox<String> comboHebrewCustomRenderer = new FlexiComboBox<>(
                "\u05e8\u05d0\u05e9\u05d9 1", "\u05e8\u05d0\u05e9\u05d9 2",
                "\u05e8\u05d0\u05e9\u05d9 3", "\u05e8\u05d0\u05e9\u05d9 4",
                "\u05e8\u05d0\u05e9\u05d9 5", "\u05e8\u05d0\u05e9\u05d9 6",
                "\u05e8\u05d0\u05e9\u05d9 7", "\u05e8\u05d0\u05e9\u05d9 8",
                "\u05e8\u05d0\u05e9\u05d9 9") {
            @Override
            public String getCaption(String item) {
                return item;
            }

            @Override
            public Icon getItemIcon(String item) {
                return israelFlag;
            }
        };
        comboHebrewCustomRenderer.setToolTipText("RTL combo");
        comboHebrewCustomRenderer.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        comboHebrewCustomRenderer.setMaximumRowCount(6);
        builder.append("RTL (Hebrew) with icon", comboHebrewCustomRenderer);

        JComboBox<String> comboHebrewEditable = new JComboBox<>(new String[] { "\u05e8\u05d0\u05e9\u05d9 1",
                        "\u05e8\u05d0\u05e9\u05d9 2", "\u05e8\u05d0\u05e9\u05d9 3",
                        "\u05e8\u05d0\u05e9\u05d9 4", "\u05e8\u05d0\u05e9\u05d9 5",
                        "\u05e8\u05d0\u05e9\u05d9 6", "\u05e8\u05d0\u05e9\u05d9 7",
                        "\u05e8\u05d0\u05e9\u05d9 8", "\u05e8\u05d0\u05e9\u05d9 9" });
        comboHebrewEditable.setToolTipText("RTL combo");
        comboHebrewEditable.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        comboHebrewEditable.setMaximumRowCount(6);
        comboHebrewEditable.setEditable(true);
        builder.append("RTL (Hebrew) editable", comboHebrewEditable);

        final JComboBox<Object> combo151 = new JComboBox<>();
        final ComboBoxTextEditor151 editor = new ComboBoxTextEditor151();
        combo151.setEditor(editor);
        combo151.addItem(new EditableDocument151());
        combo151.addItem("Default");
        combo151.addItem("No Sound");

        combo151.addActionListener(e -> {
            editor.setCaretPosition(0);
            if (combo151.getSelectedItem() instanceof String) {
                combo151.setEditable(false);

            } else {
                combo151.setEditable(true);

            }
            editor.setCaretPosition(0);
        });
        builder.append("Defect 151", combo151);

        return builder.build();
    }

    /**
     * Returns the right panel with comboboxes.
     * 
     * @return The right panel with comboboxes.
     */
    private JPanel getRightComboPanel() {
        TestFormLayoutBuilder builder = new TestFormLayoutBuilder("right:pref, 4dlu, left:pref:grow", 2, 23)
                .padding(Paddings.DIALOG);

        builder.appendSeparator("Popup placement");

        JComboBox<String> comboPopupPlacementDefault = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementDefault.setMaximumRowCount(4);
        builder.append("Default", comboPopupPlacementDefault);

        JComboBox<String> comboPopupPlacementUpwardStart = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementUpwardStart.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementUpwardStart,
                RadianceThemingSlices.PopupPlacementStrategy.Upward.HALIGN_START);
        builder.append("Upward start", comboPopupPlacementUpwardStart);

        JComboBox<String> comboPopupPlacementUpwardEnd = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementUpwardEnd.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementUpwardEnd,
                RadianceThemingSlices.PopupPlacementStrategy.Upward.HALIGN_END);
        builder.append("Upward end", comboPopupPlacementUpwardEnd);

        JComboBox<String> comboPopupPlacementDownwardStart = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementDownwardStart.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementDownwardStart,
                RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_START);
        builder.append("Downward start", comboPopupPlacementDownwardStart);

        JComboBox<String> comboPopupPlacementDownwardEnd = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementDownwardEnd.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementDownwardEnd,
                RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_END);
        builder.append("Downward end", comboPopupPlacementDownwardEnd);

        JComboBox<String> comboPopupPlacementCenterStart = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementCenterStart.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementCenterStart,
                RadianceThemingSlices.PopupPlacementStrategy.CenteredVertically.HALIGN_START);
        builder.append("Center start", comboPopupPlacementCenterStart);

        JComboBox<String> comboPopupPlacementCenterEnd = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementCenterEnd.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementCenterEnd,
                RadianceThemingSlices.PopupPlacementStrategy.CenteredVertically.HALIGN_END);
        builder.append("Center end", comboPopupPlacementCenterEnd);

        JComboBox<String> comboPopupPlacementEndwardTop = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementEndwardTop.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementEndwardTop,
                RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP);
        builder.append("Endward top", comboPopupPlacementEndwardTop);

        JComboBox<String> comboPopupPlacementEndwardBottom = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementEndwardBottom.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementEndwardBottom,
                RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_BOTTOM);
        builder.append("Endward bottom", comboPopupPlacementEndwardBottom);

        JComboBox<String> comboPopupPlacementStartwardTop = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementStartwardTop.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementStartwardTop,
                RadianceThemingSlices.PopupPlacementStrategy.Startward.VALIGN_TOP);
        builder.append("Startward top", comboPopupPlacementStartwardTop);

        JComboBox<String> comboPopupPlacementStartwardBottom = new JComboBox<>(
                new String[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboPopupPlacementStartwardBottom.setMaximumRowCount(4);
        RadianceThemingCortex.ComponentScope.setComboBoxPopupPlacementStrategy(comboPopupPlacementStartwardBottom,
                RadianceThemingSlices.PopupPlacementStrategy.Startward.VALIGN_BOTTOM);
        builder.append("Startward bottom", comboPopupPlacementStartwardBottom);

        builder.appendSeparator("Popup prototype");
        JComboBox<String> comboProto1 = new JComboBox<>(new String[] { "aa", "aaaaa", "aaaaaaaaaa",
                        "this one is the one", "abcdefghijklmnopqrstuvwxyz" });
        comboProto1.setPrototypeDisplayValue("aaaaa");
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeDisplayValue(comboProto1,
                "this one is the one");
        builder.append("Hard-coded value", comboProto1);

        JComboBox<String> comboProto2 = new JComboBox<>(new String[] { "aa", "aaaaa", "aaaaaaaaaa",
                        "another one (not it)", "abcdefghijklmnopqrstuvwxyz" });
        comboProto2.setPrototypeDisplayValue("aaaaa");
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(comboProto2,
                new WidestComboPopupPrototype<>());
        builder.append("Widest core callback", comboProto2);

        JComboBox<String> comboProto3 = new JComboBox<>(new String[] { "aa", "aaaaa", "this is not",
                        "this one is not it", "this one is it that is for the popup" });
        comboProto3.setPrototypeDisplayValue("aaaaa");
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(comboProto3,
                jc -> jc.getModel().getElementAt(jc.getModel().getSize() - 1));
        builder.append("Custom callback", comboProto3);

        builder.appendSeparator("Empty combos");
        JComboBox<String> emptyModelCombo = new JComboBox<>(new String[] {});
        builder.append("Empty model", emptyModelCombo);

        JComboBox<String> emptyStringCombo = new JComboBox<>(new String[] { "" });
        builder.append("Empty string", emptyStringCombo);

        JComboBox<String> spaceCombo = new JComboBox<>(new String[] { " " });
        builder.append("Space string", spaceCombo);

        JComboBox<String> emptyEditableCombo = new JComboBox<>(new String[] {});
        emptyEditableCombo.setEditable(true);
        builder.append("Empty model + editable", emptyEditableCombo);

        JComboBox<String> emptyStringEditableCombo = new JComboBox<>(new String[] { "" });
        emptyStringEditableCombo.setEditable(true);
        builder.append("Empty string + editable", emptyStringEditableCombo);

        JComboBox<String> spaceEditableCombo = new JComboBox<>(new String[] { " " });
        spaceEditableCombo.setEditable(true);
        builder.append("Space string + editable", spaceEditableCombo);

        return builder.build();
    }

    /**
     * Creates the combobox panel.
     */
    public CombosPanel() {
        this.setLayout(new BorderLayout());
    }

    @Override
    public synchronized void initialize() {
        JPanel gridPanel = new ScrollablePanel();
        gridPanel.setLayout(new GridLayout(1, 2));
        gridPanel.add(getLeftComboPanel());
        gridPanel.add(getRightComboPanel());
        this.add(new JScrollPane(gridPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);

        TestFormLayoutBuilder builder = new TestFormLayoutBuilder("fill:pref:grow", 1, 5);

        JButton checkEscape = new JButton("Check ESC key");
        checkEscape.addActionListener(actionEvent -> {
            final JDialog dialog = new JDialog();
            dialog.setTitle("Press ESC key when combo is focused");
            dialog.setLayout(new FlowLayout());
            JComboBox<String> sampleCombo = new JComboBox<>(
                    new String[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
            sampleCombo.setEditable(true);
            dialog.add(sampleCombo);
            dialog.add(new JCheckBox("Sample checkbox"));
            dialog.add(new JButton("Sample button"));
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            JRootPane rootPane = dialog.getRootPane();
            InputMap iMap = rootPane.getInputMap(WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
            iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape");

            ActionMap aMap = rootPane.getActionMap();
            aMap.put("escape", new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            dialog.pack();
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            // center the dialog in the physical screen
            dialog.setLocation((d.width - dialog.getWidth()) / 2,
                    (d.height - dialog.getHeight()) / 2);
            dialog.setVisible(true);
        });

        JButton disableCombosButton = new JButton("Disable all");
        disableCombosButton.addActionListener(actionEvent -> SwingUtilities
                .invokeLater(() -> CombosPanel.run(CombosPanel.this, new DisableCommand())));
        JButton enableCombosButton = new JButton("Enable all");
        enableCombosButton.addActionListener(actionEvent -> SwingUtilities
                .invokeLater(() -> CombosPanel.run(CombosPanel.this, new EnableCommand())));
        JButton makeAllEditableButton = new JButton("Make all editable");
        makeAllEditableButton.addActionListener(actionEvent -> SwingUtilities
                .invokeLater(() -> CombosPanel.run(CombosPanel.this, new EditAllowCommand())));
        JButton makeAllNonEditableButton = new JButton("Make all non-editable");
        makeAllNonEditableButton.addActionListener(actionEvent -> SwingUtilities
                .invokeLater(() -> CombosPanel.run(CombosPanel.this, new EditDisallowCommand())));

        builder.append(disableCombosButton);
        builder.append(enableCombosButton);
        builder.append(makeAllNonEditableButton);
        builder.append(makeAllEditableButton);
        builder.append(checkEscape);

        this.controlPanel = builder.build();

        this.isInitialized = true;
    }
}
