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
package org.pushingpixels.tools.jitterbug;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.*;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;
import org.pushingpixels.tools.jitterbug.svg.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.regex.*;

public class JColorSchemeList extends JComponent {
    static final String LIST = "List";
    static final String INSTRUCTIONAL = "Instructional";
    private SubstanceSkin.ColorSchemes schemes;
    private JList<SubstanceColorScheme> schemeList;
    private JPanel cardPanel;
    private ColorSchemeListModel schemeListModel;
    private File schemesFile;

    private boolean isModified;

    private JButton moveUpButton;

    private JButton moveDownButton;

    private JButton renameButton;

    private JButton deleteButton;

    public JColorSchemeList() {
        this.schemes = new SubstanceSkin.ColorSchemes();

        this.schemeList = new JList<>();
        this.schemeListModel = new ColorSchemeListModel();
        this.schemeList.setModel(schemeListModel);
        this.schemeList.setCellRenderer(new ColorSchemeListRenderer());
        this.schemeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.schemeList.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            Object selected = schemeList.getSelectedValue();
            firePropertyChange("selectedColorScheme", null, selected);
        });

        JPanel bottomButtonsPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        JButton addColorScheme = new JButton();
        addColorScheme.setToolTipText("Adds a new color scheme");
        addColorScheme.setIcon(outline_add_24px.of(12, 12));
        addColorScheme.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            String newName = getNewColorSchemeName(null);
            if (newName == null) {
                return;
            }

            SubstanceColorScheme newScheme = new BaseLightColorScheme(newName) {
                @Override
                public Color getForegroundColor() { return Color.white; }

                @Override
                public Color getUltraLightColor() { return Color.white; }

                @Override
                public Color getExtraLightColor() { return Color.white; }

                @Override
                public Color getLightColor() { return Color.white; }

                @Override
                public Color getMidColor() { return Color.white; }

                @Override
                public Color getDarkColor() { return Color.white; }

                @Override
                public Color getUltraDarkColor() { return Color.white; }
            };

            schemes.add(newScheme);
            schemeListModel.fireContentsChanged();
            schemeList.setSelectedValue(newScheme, true);
            setModified(true);
        }));

        bottomButtonsPanel.add(addColorScheme);

        bottomButtonsPanel.add(Box.createHorizontalStrut(10));

        moveUpButton = new JButton();
        moveUpButton.setToolTipText("Moves the currently selected color scheme up");
        moveUpButton.setEnabled(false);
        moveUpButton.setIcon(outline_keyboard_arrow_up_24px.of(12, 12));
        moveUpButton.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            SubstanceColorScheme selected = (SubstanceColorScheme) schemeList.getSelectedValue();
            schemes.switchWithPrevious(selected.getDisplayName());
            schemeListModel.fireContentsChanged();
            schemeList.setSelectedValue(selected, true);
            setModified(true);
        }));
        bottomButtonsPanel.add(moveUpButton);

        moveDownButton = new JButton();
        moveDownButton.setToolTipText("Moves the currently selected color scheme down");
        moveDownButton.setEnabled(false);
        moveDownButton.setIcon(outline_keyboard_arrow_down_24px.of(12, 12));
        moveDownButton.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            SubstanceColorScheme selected = (SubstanceColorScheme) schemeList.getSelectedValue();
            schemes.switchWithNext(selected.getDisplayName());
            schemeListModel.fireContentsChanged();
            schemeList.setSelectedValue(selected, true);
            setModified(true);
        }));
        bottomButtonsPanel.add(moveDownButton);

        bottomButtonsPanel.add(Box.createHorizontalStrut(10));

        renameButton = new JButton();
        renameButton.setToolTipText("Renames the currently selected color scheme");
        renameButton.setEnabled(false);
        renameButton.setIcon(outline_edit_24px.of(12, 12));
        renameButton.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            SubstanceColorScheme selected = (SubstanceColorScheme) schemeList.getSelectedValue();
            String newName = getNewColorSchemeName(selected.getDisplayName());
            if (newName == null)
                return;

            if (newName.equals(selected.getDisplayName()))
                return;

            boolean isLight = !selected.isDark();

            SubstanceColorScheme renamedScheme = isLight
                    ? new BaseLightColorScheme(newName) {
                        @Override
                        public Color getForegroundColor() { return selected.getForegroundColor(); }

                        @Override
                        public Color getUltraLightColor() { return selected.getUltraLightColor(); }

                        @Override
                        public Color getExtraLightColor() { return selected.getExtraLightColor(); }

                        @Override
                        public Color getLightColor() { return selected.getLightColor(); }

                        @Override
                        public Color getMidColor() { return selected.getMidColor(); }

                        @Override
                        public Color getDarkColor() { return selected.getDarkColor(); }

                        @Override
                        public Color getUltraDarkColor() { return selected.getUltraDarkColor(); }
                    } : new BaseDarkColorScheme(newName) {
                        @Override
                        public Color getForegroundColor() { return selected.getForegroundColor(); }

                        @Override
                        public Color getUltraLightColor() { return selected.getUltraLightColor(); }

                        @Override
                        public Color getExtraLightColor() { return selected.getExtraLightColor(); }

                        @Override
                        public Color getLightColor() { return selected.getLightColor(); }

                        @Override
                        public Color getMidColor() { return selected.getMidColor(); }

                        @Override
                        public Color getDarkColor() { return selected.getDarkColor(); }

                        @Override
                        public Color getUltraDarkColor() { return selected.getUltraDarkColor(); }
                    };

            schemes.replace(selected.getDisplayName(), renamedScheme);
            schemeListModel.fireContentsChanged();
            schemeList.getSelectionModel().clearSelection();
            schemeList.setSelectedValue(renamedScheme, true);
            setModified(true);
        }));

        bottomButtonsPanel.add(renameButton);

        deleteButton = new JButton();
        deleteButton.setToolTipText("Removes the currently selected color scheme");
        deleteButton.setEnabled(false);
        deleteButton.setIcon(outline_delete_24px.of(12, 12));
        deleteButton.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
            SubstanceColorScheme selected = (SubstanceColorScheme) schemeList.getSelectedValue();
            schemes.delete(selected.getDisplayName());
            schemeListModel.fireContentsChanged();
            schemeList.getSelectionModel().clearSelection();
            setModified(true);
        }));

        bottomButtonsPanel.add(deleteButton);

        this.schemeList.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            int selectedIndex = schemeList.getSelectedIndex();
            boolean hasSelection = (selectedIndex >= 0);
            renameButton.setEnabled(hasSelection);
            deleteButton.setEnabled(hasSelection);

            moveUpButton.setEnabled(hasSelection && (selectedIndex > 0));
            moveDownButton.setEnabled(hasSelection && (selectedIndex < (schemes.size() - 1)));
        });

        JPanel mainControlPanel = new JPanel(new BorderLayout());
        mainControlPanel.add(new JScrollPane(this.schemeList), BorderLayout.CENTER);
        mainControlPanel.add(bottomButtonsPanel, BorderLayout.SOUTH);

        // Set up a card panel. It has two cards:
        // * instructional text
        // * list of color schemes with button controls
        this.cardPanel = new JPanel(new CardLayout());
        JTextArea textArea = new JTextArea(
                "List of color schemes. Use one of the following:\n   * Drag a .colorschemes file" +
                        " here\n   * Click the \"New\" button below");
        textArea.setBorder(new EmptyBorder(10, 8, 0, 8));
        textArea.setEditable(false);
        textArea.setOpaque(false);
        textArea.setRows(9);
        // textArea.setColumns(20);
        this.cardPanel.add(textArea, INSTRUCTIONAL);
        this.cardPanel.add(mainControlPanel, LIST);

        this.setLayout(new BorderLayout());
        this.add(this.cardPanel, BorderLayout.CENTER);

        // constrain the preferred size so that the layout doesn't
        // change once the control panel is shown
        this.setPreferredSize(textArea.getPreferredSize());
    }

    public void setColorSchemeList(File file) {
        if (!this.checkModifiedStateAndSaveIfNecessary()) {
            return;
        }
        try {
            this.schemesFile = file;
            if (file != null) {
                this.schemes = SubstanceSkin.getColorSchemes(file.toURI().toURL());
            } else {
                this.schemes = new SubstanceSkin.ColorSchemes();
            }
            // switch to the list view
            CardLayout cl = (CardLayout) (cardPanel.getLayout());
            cl.show(cardPanel, LIST);
            // let the view know that the model has changed
            schemeListModel.fireContentsChanged();
            // update the buttons state
            if (file == null) {
                moveUpButton.setEnabled(false);
                moveDownButton.setEnabled(false);
                deleteButton.setEnabled(false);
                renameButton.setEnabled(false);
            }
            this.setModified(false);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public boolean checkModifiedStateAndSaveIfNecessary() {
        if (!this.isModified) {
            return true;
        }

        // does the user want to save modifications?
        String fileName = (this.schemesFile == null) ? "Unsaved" : this.schemesFile.getName();
        int userSelection = JOptionPane.showConfirmDialog(SwingUtilities.getWindowAncestor(this),
                "Do you want to save the changes to '" + fileName + "'?", "Modified contents",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (userSelection == JOptionPane.CANCEL_OPTION) {
            return false;
        }
        if (userSelection == JOptionPane.YES_OPTION) {
            if (this.schemesFile != null) {
                // ask to save
                this.save();
            } else {
                this.saveAs();
            }
        }
        return true;
    }

    private String getFileNameForSaving() {
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Color scheme files",
                "colorschemes");
        jfc.setFileFilter(filter);
        int returnVal = jfc.showSaveDialog(SwingUtilities.getWindowAncestor(this));
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String res = jfc.getSelectedFile().getAbsolutePath();
            if (!res.endsWith(".colorschemes"))
                res += ".colorschemes";
            return res;
        }
        return null;
    }

    private String getNewColorSchemeName(String nameToStartWith) {
        String result = JOptionPane.showInputDialog(SwingUtilities.getWindowAncestor(this),
                "Type the color scheme name", nameToStartWith);
        if (result == null)
            return null;

        if (result.equals(nameToStartWith))
            return result;

        result = result.trim();

        // check characters
        Pattern pattern = Pattern.compile("[a-zA-Z ]+");
        Matcher matcher = pattern.matcher(result);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                    "Only use letters and spaces", "Name invalid", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        // check for uniqueness
        SubstanceColorScheme existing = this.schemes.get(result);
        if (existing != null) {
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                    "Name already exists", "Name clash", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return result;
    }

    public void save() {
        this.saveAs(this.schemesFile);
    }

    public void saveAs() {
        // ask for a filename for the save
        String fileName = this.getFileNameForSaving();
        if (fileName != null) {
            File file = new File(fileName);
            this.saveAs(file);
        }
    }

    private void saveAs(File file) {
        PrintStream printStream = null;

        try {
            printStream = new PrintStream(new FileOutputStream(file));
            for (int i = 0; i < this.schemes.size(); i++) {
                SubstanceColorScheme colorScheme = this.schemes.get(i);
                String encodedColorScheme = colorScheme.toString();
                printStream.println(encodedColorScheme);
                printStream.println();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        if (printStream != null) {
            printStream.close();
        }
        this.schemesFile = file;
        this.setModified(false);
    }

    public File getCurrentFile() {
        return this.schemesFile;
    }

    public void updateColorScheme(SubstanceColorScheme colorScheme) {
        SubstanceColorScheme existing = this.schemes.get(colorScheme.getDisplayName());
        if (existing == null)
            throw new IllegalArgumentException(
                    "Color scheme " + colorScheme.getDisplayName() + " not found");

        this.schemes.replace(colorScheme.getDisplayName(), colorScheme);
    }

    public boolean isModified() {
        return isModified;
    }

    public void setModified(boolean isModified) {
        if (this.isModified == isModified)
            return;

        boolean old = this.isModified;
        this.isModified = isModified;
        this.firePropertyChange("modified", old, isModified);
    }

    class ColorSchemeListModel extends AbstractListModel<SubstanceColorScheme> {
        @Override
        public int getSize() {
            return (schemes == null) ? 0 : schemes.size();
        }

        @Override
        public SubstanceColorScheme getElementAt(int index) {
            if (schemes == null)
                return null;
            return schemes.get(index);
        }

        void fireContentsChanged() {
            this.fireContentsChanged(schemeList, 0, getSize());
        }
    }

    class ColorSchemeListRenderer extends SubstanceDefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            SubstanceColorScheme scheme = (SubstanceColorScheme) value;
            return super.getListCellRendererComponent(list, scheme.getDisplayName(), index,
                    isSelected, cellHasFocus);
        }
    }
}
