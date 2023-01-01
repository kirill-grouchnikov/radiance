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
package org.pushingpixels.radiance.demo.theming.main.check;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.demo.theming.main.check.svg.flags.se;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.combo.WidestComboPopupPrototype;
import org.pushingpixels.radiance.theming.api.renderer.RadianceDefaultListCellRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;

/**
 * Test application panel for testing {@link JList} component.
 *
 * @author Kirill Grouchnikov
 */
public class ListPanel extends ControllablePanel {
    private static class ModelEntry {
        public String text;
        public RadianceIcon icon;

        public ModelEntry(String text, RadianceIcon icon) {
            this.text = text;
            this.icon = icon;
        }
    }

    /**
     * List model implementation with support for moving elements.
     *
     * @author Kirill Grouchnikov
     */
    private static class MoveableListModel extends AbstractListModel<ModelEntry> {
        /**
         * The string list backing up the model.
         */
        protected List<ModelEntry> model;

        /**
         * Creates a new model.
         */
        public MoveableListModel(int modelSize) {
            super();
            model = new ArrayList<>();
            for (int i = 0; i < modelSize; i++) {
                model.add(new ModelEntry("element " + i, se.of(16, 16)));
            }
        }

        @Override
        public ModelEntry getElementAt(int index) {
            return model.get(index);
        }

        @Override
        public int getSize() {
            return model.size();
        }

        /**
         * Moves the element at the specified index one position up.
         *
         * @param index Element index.
         */
        public void moveUp(int index) {
            ModelEntry entry = model.get(index);
            model.set(index, model.get(index - 1));
            model.set(index - 1, entry);
            fireContentsChanged(this, index - 1, index);
        }

        /**
         * Moves the element at the specified index one position down.
         *
         * @param index Element index.
         */
        public void moveDown(int index) {
            ModelEntry entry = model.get(index);
            model.set(index, model.get(index + 1));
            model.set(index + 1, entry);
            fireContentsChanged(this, index, index + 1);
        }

        /**
         * Deletes the element at the specified index.
         *
         * @param index Element index.
         */
        public void delete(int index) {
            model.remove(index);
            fireIntervalRemoved(this, index, index);
        }
    }

    /**
     * List.
     */
    private JList<ModelEntry> list;

    /**
     * Button to move the selected element up.
     */
    private JButton bUp;

    /**
     * Button to move the selected element down.
     */
    private JButton bDown;

    /**
     * Button to delete the selected element.
     */
    private JButton bDelete;

    /**
     * Old background color.
     */
    private Color oldBackColor;

    private boolean showIcons;

    /**
     * Creates a new list panel.
     */
    public ListPanel() {
        super();
        setLayout(new BorderLayout());
        list = new JList<>(new MoveableListModel(100));

        list.setTransferHandler(new TransferHandler() {
            @Override
            public boolean canImport(TransferSupport support) {
                return true;
            }

            @Override
            public boolean canImport(JComponent comp, DataFlavor[] transferFlavors) {
                return true;
            }

            @Override
            public boolean importData(JComponent comp, Transferable t) {
                return false;
            }

            @Override
            public boolean importData(TransferSupport support) {
                return false;
            }
        });
        list.setDropMode(DropMode.ON);

        final JScrollPane jsp = new JScrollPane(list);
        this.add(jsp, BorderLayout.CENTER);

        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "right:pref, 4dlu, fill:pref:grow", 2, 15);
        builder.appendSeparator("General");

        final JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(list.isEnabled());
        isEnabled.addActionListener(actionEvent -> list.setEnabled(isEnabled.isSelected()));
        builder.append("Enabled", isEnabled);

        final JSlider rowCountSlider = new JSlider(10, 1000, this.list.getModel().getSize());
        rowCountSlider.setPaintLabels(false);
        rowCountSlider.setPaintTicks(false);
        rowCountSlider.addChangeListener(changeEvent -> {
            if (rowCountSlider.getValueIsAdjusting())
                return;
            list.setModel(new MoveableListModel(rowCountSlider.getValue()));
        });
        builder.append("Row count", rowCountSlider);

        bUp = new JButton("Move selected up");
        RadianceThemingCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(bUp,
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT);

        bDown = new JButton("Move selected down");
        RadianceThemingCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(bDown,
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT);

        bDelete = new JButton("Delete selected");
        RadianceThemingCortex.ComponentOrParentScope.setBackgroundAppearanceStrategy(bDelete,
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT);

        builder.append("Actions", bUp);
        builder.append("", bDown);
        builder.append("", bDelete);

        bUp.addActionListener(actionEvent -> {
            int si = list.getSelectedIndex();
            MoveableListModel mlm = (MoveableListModel) list.getModel();
            mlm.moveUp(si);
            list.setSelectedIndex(si - 1);
        });

        bDown.addActionListener(actionEvent -> {
            int si = list.getSelectedIndex();
            MoveableListModel mlm = (MoveableListModel) list.getModel();
            mlm.moveDown(si);
            list.setSelectedIndex(si + 1);
        });

        bDelete.addActionListener(actionEvent -> {
            MoveableListModel mlm = (MoveableListModel) list.getModel();
            for (int i = list.getMaxSelectionIndex(); i >= list.getMinSelectionIndex(); i--) {
                if (list.isSelectedIndex(i)) {
                    mlm.delete(i);
                }
            }
            list.clearSelection();
        });

        synchronize();

        list.getSelectionModel().addListSelectionListener(listSelectionEvent ->
                SwingUtilities.invokeLater(this::synchronize));

        final JComboBox<String> selectionModelCb = new JComboBox<>(
                new String[] { "single", "single interval", "multiple interval" });
        selectionModelCb.setSelectedIndex(0);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        RadianceThemingCortex.ComponentScope.setComboBoxPrototypeCallback(selectionModelCb,
                new WidestComboPopupPrototype<>());
        selectionModelCb.addActionListener(actionEvent -> SwingUtilities.invokeLater(() -> {
            String selected = (String) selectionModelCb.getSelectedItem();
            if ("single".equals(selected))
                list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            if ("single interval".equals(selected))
                list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            if ("multiple interval".equals(selected))
                list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        }));

        builder.append("Selection", selectionModelCb);

        final JCheckBox customBackgroundCb = new JCheckBox("Has pink background");
        customBackgroundCb.addActionListener(actionEvent -> {
            if (customBackgroundCb.isSelected()) {
                oldBackColor = list.getBackground();
                list.setBackground(new Color(255, 128, 128));
            } else {
                list.setBackground(oldBackColor);
            }
        });
        builder.append("Background", customBackgroundCb);

        final JCheckBox showsIconsCb = new JCheckBox("Has icons");
        showsIconsCb.addActionListener(actionEvent -> {
            showIcons = showsIconsCb.isSelected();
            list.revalidate();
            list.repaint();
        });
        builder.append("Icons", showsIconsCb);

        builder.appendSeparator("Renderer");
        list.setCellRenderer(new DefaultRadianceRenderer());

        ButtonGroup listRendererGroup = new ButtonGroup();
        final JRadioButton defaultRadianceRenderer = new JRadioButton("Default Radiance");
        defaultRadianceRenderer.setSelected(true);
        defaultRadianceRenderer.addActionListener(actionEvent -> {
            if (defaultRadianceRenderer.isSelected()) {
                list.setCellRenderer(new DefaultRadianceRenderer());
            }
        });
        final JRadioButton defaultCoreRenderer = new JRadioButton("Default core");
        defaultCoreRenderer.addActionListener(actionEvent -> {
            if (defaultCoreRenderer.isSelected()) {
                list.setCellRenderer(new DefaultCoreRenderer());
            }
        });
        final JRadioButton customRadianceRenderer = new JRadioButton("Custom Radiance");
        customRadianceRenderer.addActionListener(actionEvent -> {
            if (customRadianceRenderer.isSelected()) {
                list.setCellRenderer(new CustomRadianceRenderer());
            }
        });
        final JRadioButton customCoreRenderer = new JRadioButton("Custom core");
        customCoreRenderer.addActionListener(actionEvent -> {
            if (customCoreRenderer.isSelected()) {
                list.setCellRenderer(new CustomCoreRenderer());
            }
        });
        listRendererGroup.add(defaultRadianceRenderer);
        listRendererGroup.add(defaultCoreRenderer);
        listRendererGroup.add(customRadianceRenderer);
        listRendererGroup.add(customCoreRenderer);
        builder.append("Select type", defaultRadianceRenderer);
        builder.append("", defaultCoreRenderer);
        builder.append("", customRadianceRenderer);
        builder.append("", customCoreRenderer);

        controlPanel = builder.build();
    }

    /**
     * Synchronizes the list selection and the enable / disable status of the control buttons.
     */
    public void synchronize() {
        int sc = list.getSelectedIndices().length;
        if (sc != 1) {
            bUp.setEnabled(false);
            bDown.setEnabled(false);
            return;
        }
        bDelete.setEnabled(sc > 0);

        int si = list.getSelectedIndex();
        bUp.setEnabled(si > 0);
        bDown.setEnabled(si < (list.getModel().getSize() - 1));
    }

    private class DefaultCoreRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            JLabel result = (JLabel) super.getListCellRendererComponent(list, value, index,
                    isSelected, cellHasFocus);
            ModelEntry entry = (ModelEntry) value;
            result.setText(entry.text);
            if (showIcons) {
                result.setIcon(entry.icon);
            } else {
                result.setIcon(null);
            }
            return result;
        }
    }

    private class CustomCoreRenderer extends JLabel implements ListCellRenderer<ModelEntry> {
        public CustomCoreRenderer() {
            super();
            setOpaque(true);
        }

        @Override
        public Component getListCellRendererComponent(JList list, ModelEntry value,
                int index, boolean isSelected, boolean cellHasFocus) {
            setText(value.text);
            if (showIcons) {
                setIcon(value.icon);
            } else {
                setIcon(null);
            }
            this.setForeground(list.getForeground());

            int comp = 156 + 10 * (index % 9);
            this.setBackground(
                    isSelected ? list.getSelectionBackground() : new Color(comp, comp, comp));

            return this;
        }
    }

    private class DefaultRadianceRenderer extends RadianceDefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            ModelEntry entry = (ModelEntry) value;
            JLabel result = (JLabel) super.getListCellRendererComponent(list, entry.text, index,
                    isSelected, cellHasFocus);
            if (showIcons) {
                result.setIcon(entry.icon);
            } else {
                result.setIcon(null);
            }
            return result;
        }
    }

    private class CustomRadianceRenderer extends RadianceDefaultListCellRenderer {
        public CustomRadianceRenderer() {
            super();
            setOpaque(true);
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            JLabel result = (JLabel) super.getListCellRendererComponent(list, value,
                    index, isSelected, cellHasFocus);
            result.setForeground(list.getForeground());

            int comp = 156 + 10 * (index % 9);
            int blue = 255 - (255 - comp) / 2;
            this.setBackground(
                    isSelected ? list.getSelectionBackground() : new Color(comp, comp, blue));

            ModelEntry entry = (ModelEntry) value;

            // mark every fifth row as disabled
            if ((index % 5) == 0) {
                result.setEnabled(false);
                ComponentState state = isSelected ? ComponentState.DISABLED_SELECTED
                        : ComponentState.DISABLED_UNSELECTED;
                result.setForeground(RadianceThemingCortex.ComponentScope.getCurrentSkin(list)
                        .getColorScheme(list, state).getForegroundColor());
                result.setBackground(new Color(255, 196, 196));
                result.setText(entry.text + " [disabled by renderer]");
            } else {
                result.setEnabled(true);
                result.setText(entry.text);
            }
            if (showIcons) {
                result.setIcon(entry.icon);
            } else {
                result.setIcon(null);
            }

            return result;
        }
    }
}
