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
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.combo.WidestComboPopupPrototype;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

/**
 * Test application panel for testing {@link JList} component.
 * 
 * @author Kirill Grouchnikov
 */
public class ListPanel extends ControllablePanel {

    /**
     * List model implementation with support for moving elements.
     * 
     * @author Kirill Grouchnikov
     */
    private static class MoveableListModel extends AbstractListModel {
        /**
         * The string list backing up the model.
         */
        protected List<String> model;

        /**
         * Creates a new model.
         */
        public MoveableListModel(int modelSize) {
            super();
            model = new ArrayList<String>();
            for (int i = 0; i < modelSize; i++) {
                model.add("element " + i);
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.ListModel#getElementAt(int)
         */
        public Object getElementAt(int index) {
            return model.get(index);
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.ListModel#getSize()
         */
        public int getSize() {
            return model.size();
        }

        /**
         * Moves the element at the specified index one position up.
         * 
         * @param index
         *            Element index.
         */
        public void moveUp(int index) {
            String entry = model.get(index);
            model.set(index, model.get(index - 1));
            model.set(index - 1, entry);
            fireContentsChanged(this, index - 1, index);
        }

        /**
         * Moves the element at the specified index one position down.
         * 
         * @param index
         *            Element index.
         */
        public void moveDown(int index) {
            String entry = model.get(index);
            model.set(index, model.get(index + 1));
            model.set(index + 1, entry);
            fireContentsChanged(this, index, index + 1);
        }

        /**
         * Deletes the element at the specified index.
         * 
         * @param index
         *            Element index.
         */
        public void delete(int index) {
            model.remove(index);
            fireIntervalRemoved(this, index, index);
        }
    }

    /**
     * List.
     */
    private JList list;

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

    /**
     * Creates a new list panel.
     */
    public ListPanel() {
        super();
        setLayout(new BorderLayout());
        list = new JList(new MoveableListModel(100));

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

        FormLayout lm = new FormLayout("right:pref, 4dlu, fill:pref:grow", "");
        DefaultFormBuilder builder = new DefaultFormBuilder(lm, new ScrollablePanel());
        builder.appendSeparator("General");

        final JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(list.isEnabled());
        isEnabled.addActionListener((ActionEvent e) -> list.setEnabled(isEnabled.isSelected()));
        builder.append("Enabled", isEnabled);

        final JSlider rowCountSlider = new JSlider(10, 1000, this.list.getModel().getSize());
        rowCountSlider.setPaintLabels(false);
        rowCountSlider.setPaintTicks(false);
        rowCountSlider.addChangeListener((ChangeEvent e) -> {
            if (rowCountSlider.getValueIsAdjusting())
                return;
            list.setModel(new MoveableListModel(rowCountSlider.getValue()));
        });
        builder.append("Row count", rowCountSlider);

        final JCheckBox watermarkBleed = new JCheckBox("watermark bleed");
        watermarkBleed.addActionListener((ActionEvent e) -> {
            SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(list,
                    watermarkBleed.isSelected());
            SubstanceCortex.ComponentOrParentChainScope.setWatermarkVisible(jsp,
                    watermarkBleed.isSelected());
            list.repaint();
        });
        builder.append("Watermark", watermarkBleed);

        bUp = new JButton("Move selected up");
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(bUp, true);

        bDown = new JButton("Move selected down");
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(bDown, true);

        bDelete = new JButton("Delete selected");
        SubstanceCortex.ComponentOrParentScope.setFlatBackground(bDelete, true);

        builder.append("Actions", bUp);
        builder.append("", bDown);
        builder.append("", bDelete);

        bUp.addActionListener((ActionEvent e) -> {
            int si = list.getSelectedIndex();
            MoveableListModel mlm = (MoveableListModel) list.getModel();
            mlm.moveUp(si);
            list.setSelectedIndex(si - 1);
        });

        bDown.addActionListener((ActionEvent e) -> {
            int si = list.getSelectedIndex();
            MoveableListModel mlm = (MoveableListModel) list.getModel();
            mlm.moveDown(si);
            list.setSelectedIndex(si + 1);
        });

        bDelete.addActionListener((ActionEvent e) -> {
            MoveableListModel mlm = (MoveableListModel) list.getModel();
            for (int i = list.getMaxSelectionIndex(); i >= list.getMinSelectionIndex(); i--) {
                if (list.isSelectedIndex(i)) {
                    mlm.delete(i);
                }
            }
            list.clearSelection();
        });

        synchronize();

        list.getSelectionModel().addListSelectionListener((ListSelectionEvent e) ->
                SwingUtilities.invokeLater(() -> synchronize()));

        final JComboBox selectionModelCb = new JComboBox(
                new Object[] { "single", "single interval", "multiple interval" });
        selectionModelCb.setSelectedIndex(0);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        SubstanceCortex.ComponentScope.setComboBoxPrototypeCallback(selectionModelCb,
                new WidestComboPopupPrototype());
        selectionModelCb.addActionListener((ActionEvent e) -> SwingUtilities.invokeLater(() -> {
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
        customBackgroundCb.addActionListener((ActionEvent e) -> {
            if (customBackgroundCb.isSelected()) {
                oldBackColor = list.getBackground();
                list.setBackground(new Color(255, 128, 128));
            } else {
                list.setBackground(oldBackColor);
            }
        });

        builder.append("Background", customBackgroundCb);

        builder.appendSeparator("Renderer");
        ButtonGroup listRendererGroup = new ButtonGroup();
        final JRadioButton substanceRenderer = new JRadioButton("Substance");
        substanceRenderer.setSelected(true);
        substanceRenderer.addActionListener((ActionEvent e) -> {
            if (substanceRenderer.isSelected())
                list.setCellRenderer(new SubstanceDefaultListCellRenderer());
        });
        final JRadioButton coreDefaultRenderer = new JRadioButton("Default core");
        coreDefaultRenderer.addActionListener((ActionEvent e) -> {
            if (coreDefaultRenderer.isSelected())
                list.setCellRenderer(new DefaultListCellRenderer());
        });
        final JRadioButton customRenderer = new JRadioButton("Custom");
        customRenderer.addActionListener((ActionEvent e) -> {
            if (customRenderer.isSelected())
                list.setCellRenderer(new MyListCellRenderer());
        });
        final JRadioButton customSubstanceRenderer = new JRadioButton("Custom Substance");
        customSubstanceRenderer.addActionListener((ActionEvent e) -> {
            if (customSubstanceRenderer.isSelected())
                list.setCellRenderer(new MySubstanceListCellRenderer());
        });
        listRendererGroup.add(substanceRenderer);
        listRendererGroup.add(coreDefaultRenderer);
        listRendererGroup.add(customRenderer);
        listRendererGroup.add(customSubstanceRenderer);
        builder.append("Select type", substanceRenderer);
        builder.append("", coreDefaultRenderer);
        builder.append("", customRenderer);
        builder.append("", customSubstanceRenderer);

        controlPanel = builder.getPanel();
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
        // this.bDelete.setEnabled(true);
    }
}
