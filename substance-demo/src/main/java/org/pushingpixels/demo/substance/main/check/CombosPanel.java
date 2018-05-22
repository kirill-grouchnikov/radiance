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
package org.pushingpixels.demo.substance.main.check;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import org.pushingpixels.demo.substance.main.check.command.ConfigurationCommand;
import org.pushingpixels.demo.substance.main.check.command.DisableCommand;
import org.pushingpixels.demo.substance.main.check.command.EnableCommand;
import org.pushingpixels.demo.substance.main.check.svg.flags.il;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.combo.ComboPopupPrototypeCallback;
import org.pushingpixels.substance.api.combo.WidestComboPopupPrototype;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

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
        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
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
        /*
         * (non-Javadoc)
         * 
         * @see test.check.ConfigurationCommand#invoke(java.lang.Object)
         */
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

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.ComboBoxEditor#getEditorComponent()
         */
        public java.awt.Component getEditorComponent() {
            return this;
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.ComboBoxEditor#setItem(java.lang.Object)
         */
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

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.ComboBoxEditor#getItem()
         */
        public Object getItem() {
            return super.getText();
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.awt.Component#toString()
         */
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
    private class EditableDocument151 extends javax.swing.text.PlainDocument {
        /**
         * Creates the document.
         */
        public EditableDocument151() {
            this.setText("Long text to show the bug");
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Object#toString()
         */
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
        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel())
                .border(Borders.DIALOG);

        builder.appendSeparator("Simple combos");

        JComboBox comboRegular = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboRegular.setToolTipText("This is my combo 1");
        comboRegular.setMaximumRowCount(4);
        builder.append("Regular", comboRegular);

        JComboBox comboDisabled = new JComboBox(new Object[] { "entry1", "entry2", "entry3" });
        comboDisabled.setEnabled(false);
        builder.append(new JLabel("Disabled"), comboDisabled);

        JComboBox comboColored = new JComboBox(new Object[] { "entry31", "entry32", "entry33",
                        "entry34", "entry35", "entry36", "aaa", "abb", "abc" });
        comboColored.setName("Colored combo");
        comboColored.setBackground(new Color(255, 128, 128));
        comboColored.setForeground(new Color(0, 0, 128));
        builder.append("Pink background", comboColored);

        JComboBox comboEditable = new JComboBox(
                new Object[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
        comboEditable.setEditable(true);
        builder.append("Editable", comboEditable);

        JComboBox comboColors = new FlexiComboBox<Color>(new Color(255, 128, 128),
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

        JComboBox comboFlat = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(comboFlat, true);
        builder.append("Flat", comboFlat);

        JComboBox comboDefaultCoreRenderer = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboDefaultCoreRenderer.setRenderer(new DefaultListCellRenderer());
        builder.append("Default core renderer", comboDefaultCoreRenderer);

        builder.appendSeparator("Miscellaneous");

        JComboBox colorCombo = new ColorComboBox();
        builder.append("Color chooser", colorCombo);

        JComboBox comboHebrew = new JComboBox(new Object[] { "\u05e8\u05d0\u05e9\u05d9 1",
                        "\u05e8\u05d0\u05e9\u05d9 2", "\u05e8\u05d0\u05e9\u05d9 3",
                        "\u05e8\u05d0\u05e9\u05d9 4", "\u05e8\u05d0\u05e9\u05d9 5",
                        "\u05e8\u05d0\u05e9\u05d9 6", "\u05e8\u05d0\u05e9\u05d9 7",
                        "\u05e8\u05d0\u05e9\u05d9 8", "\u05e8\u05d0\u05e9\u05d9 9" });
        comboHebrew.setToolTipText("RTL combo");
        comboHebrew.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        comboHebrew.setMaximumRowCount(6);
        builder.append("RTL (Hebrew)", comboHebrew);

        final Icon israelFlag = il.of(16, 16);
        JComboBox comboHebrewCustomRenderer = new FlexiComboBox<String>(
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

        JComboBox comboHebrewEditable = new JComboBox(new Object[] { "\u05e8\u05d0\u05e9\u05d9 1",
                        "\u05e8\u05d0\u05e9\u05d9 2", "\u05e8\u05d0\u05e9\u05d9 3",
                        "\u05e8\u05d0\u05e9\u05d9 4", "\u05e8\u05d0\u05e9\u05d9 5",
                        "\u05e8\u05d0\u05e9\u05d9 6", "\u05e8\u05d0\u05e9\u05d9 7",
                        "\u05e8\u05d0\u05e9\u05d9 8", "\u05e8\u05d0\u05e9\u05d9 9" });
        comboHebrewEditable.setToolTipText("RTL combo");
        comboHebrewEditable.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        comboHebrewEditable.setMaximumRowCount(6);
        comboHebrewEditable.setEditable(true);
        builder.append("RTL (Hebrew) editable", comboHebrewEditable);

        final JComboBox combo151 = new JComboBox();
        final ComboBoxTextEditor151 editor = new ComboBoxTextEditor151();
        combo151.setEditor(editor);
        combo151.addItem(new EditableDocument151());
        combo151.addItem("Default");
        combo151.addItem("No Sound");

        combo151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                editor.setCaretPosition(0);
                if (combo151.getSelectedItem() instanceof String) {
                    combo151.setEditable(false);

                } else {
                    combo151.setEditable(true);

                }
                editor.setCaretPosition(0);
            }
        });
        builder.append("Defect 151", combo151);

        return builder.getPanel();
    }

    /**
     * Returns the right panel with comboboxes.
     * 
     * @return The right panel with comboboxes.
     */
    private JPanel getRightComboPanel() {
        FormLayout lm = new FormLayout("right:pref, 4dlu, left:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel())
                .border(Borders.DIALOG);

        builder.appendSeparator("Popup flyout");

        JComboBox comboFlyoutDefault = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboFlyoutDefault.setMaximumRowCount(4);
        builder.append("Default", comboFlyoutDefault);

        JComboBox comboFlyoutNorth = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboFlyoutNorth.setMaximumRowCount(4);
        SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(comboFlyoutNorth,
                SwingConstants.NORTH);
        builder.append("North", comboFlyoutNorth);

        JComboBox comboFlyoutEast = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboFlyoutEast.setMaximumRowCount(4);
        SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(comboFlyoutEast,
                SwingConstants.EAST);
        builder.append("East", comboFlyoutEast);

        JComboBox comboFlyoutSouth = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboFlyoutSouth.setMaximumRowCount(4);
        SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(comboFlyoutSouth,
                SwingConstants.SOUTH);
        builder.append("South", comboFlyoutSouth);

        JComboBox comboFlyoutWest = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboFlyoutWest.setMaximumRowCount(4);
        SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(comboFlyoutWest,
                SwingConstants.WEST);
        builder.append("West", comboFlyoutWest);

        JComboBox comboFlyoutCenter = new JComboBox(
                new Object[] { "entry1", "entry2", "entry3", "entry4", "entry5", "entry6" });
        comboFlyoutCenter.setMaximumRowCount(4);
        SubstanceCortex.ComponentScope.setComboBoxPopupFlyoutOrientation(comboFlyoutCenter,
                SwingConstants.CENTER);
        builder.append("Center", comboFlyoutCenter);

        builder.appendSeparator("Popup prototype");
        JComboBox comboProto1 = new JComboBox(new Object[] { "aa", "aaaaa", "aaaaaaaaaa",
                        "this one is the one", "abcdefghijklmnopqrstuvwxyz" });
        comboProto1.setPrototypeDisplayValue("aaaaa");
        SubstanceCortex.ComponentScope.setComboBoxPrototypeDisplayValue(comboProto1,
                "this one is the one");
        builder.append("Hard-coded value", comboProto1);

        JComboBox comboProto2 = new JComboBox(new Object[] { "aa", "aaaaa", "aaaaaaaaaa",
                        "another one (not it)", "abcdefghijklmnopqrstuvwxyz" });
        comboProto2.setPrototypeDisplayValue("aaaaa");
        SubstanceCortex.ComponentScope.setComboBoxPrototypeCallback(comboProto2,
                new WidestComboPopupPrototype());
        builder.append("Widest core callback", comboProto2);

        JComboBox comboProto3 = new JComboBox(new Object[] { "aa", "aaaaa", "this is not",
                        "this one is not it", "this one is it that is for the popup" });
        comboProto3.setPrototypeDisplayValue("aaaaa");
        SubstanceCortex.ComponentScope.setComboBoxPrototypeCallback(comboProto3,
                new ComboPopupPrototypeCallback() {
                    public Object getPopupPrototypeDisplayValue(JComboBox jc) {
                        return jc.getModel().getElementAt(jc.getModel().getSize() - 1);
                    }
                });
        builder.append("Custom callback", comboProto3);

        builder.appendSeparator("Empty combos");
        JComboBox emptyModelCombo = new JComboBox(new String[] {});
        builder.append("Empty model", emptyModelCombo);

        JComboBox emptyStringCombo = new JComboBox(new String[] { "" });
        builder.append("Empty string", emptyStringCombo);

        JComboBox spaceCombo = new JComboBox(new String[] { " " });
        builder.append("Space string", spaceCombo);

        JComboBox emptyEditableCombo = new JComboBox(new String[] {});
        emptyEditableCombo.setEditable(true);
        builder.append("Empty model + editable", emptyEditableCombo);

        JComboBox emptyStringEditableCombo = new JComboBox(new String[] { "" });
        emptyStringEditableCombo.setEditable(true);
        builder.append("Empty string + editable", emptyStringEditableCombo);

        JComboBox spaceEditableCombo = new JComboBox(new String[] { " " });
        spaceEditableCombo.setEditable(true);
        builder.append("Space string + editable", spaceEditableCombo);

        return builder.getPanel();
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

        FormLayout lm = new FormLayout("fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel());

        JButton checkEscape = new JButton("Check ESC key");
        checkEscape.addActionListener((ActionEvent e) -> {
            final JDialog dialog = new JDialog();
            dialog.setTitle("Press ESC key when combo is focused");
            dialog.setLayout(new FlowLayout());
            JComboBox sampleCombo = new JComboBox(
                    new Object[] { "Ester", "Jordi", "Jordina", "Jorge", "Sergi" });
            sampleCombo.setEditable(true);
            dialog.add(sampleCombo);
            dialog.add(new JCheckBox("Sample checkbox"));
            dialog.add(new JButton("Sample button"));
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            JRootPane rootPane = dialog.getRootPane();
            InputMap iMap = rootPane.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
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
        disableCombosButton.addActionListener((ActionEvent e) -> SwingUtilities
                .invokeLater(() -> CombosPanel.run(CombosPanel.this, new DisableCommand())));
        JButton enableCombosButton = new JButton("Enable all");
        enableCombosButton.addActionListener((ActionEvent e) -> SwingUtilities
                .invokeLater(() -> CombosPanel.run(CombosPanel.this, new EnableCommand())));
        JButton makeAllEditableButton = new JButton("Make all editable");
        makeAllEditableButton.addActionListener((ActionEvent e) -> SwingUtilities
                .invokeLater(() -> CombosPanel.run(CombosPanel.this, new EditAllowCommand())));
        JButton makeAllNonEditableButton = new JButton("Make all non-editable");
        makeAllNonEditableButton.addActionListener((ActionEvent e) -> SwingUtilities
                .invokeLater(() -> CombosPanel.run(CombosPanel.this, new EditDisallowCommand())));

        builder.append(disableCombosButton);
        builder.append(enableCombosButton);
        builder.append(makeAllNonEditableButton);
        builder.append(makeAllEditableButton);
        builder.append(checkEscape);

        this.controlPanel = builder.getPanel();

        this.isInitialized = true;
    }
}
