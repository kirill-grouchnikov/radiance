/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.substance.main.check;

import org.pushingpixels.demo.substance.main.check.svg.flags.*;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultTableCellRenderer;
import org.pushingpixels.trident.api.Timeline.RepeatBehavior;
import org.pushingpixels.trident.api.swing.SwingComponentTimeline;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Test application panel for testing {@link JTable} component.
 *
 * @author Kirill Grouchnikov
 */
public class TablePanel extends ControllablePanel implements Deferrable {
    private boolean isInitialized;

    @Override
    public boolean isInitialized() {
        return this.isInitialized;
    }

    /**
     * The table.
     */
    private JTable table;

    /**
     * Custom renderer for columns that contain {@link Color} data.
     *
     * @author Kirill Grouchnikov
     */
    private static class MyColorTableRenderer extends SubstanceDefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            Color color = (Color) value;
            this.setForeground(color);
            this.setBackground(new Color(255 - color.getRed(), 255 - color.getGreen(),
                    255 - color.getBlue(), color.getAlpha()));
            this.setText("row " + row);
            return this;
        }
    }

    /**
     * Custom renderer for the columns that contain {@link Float} data.
     *
     * @author Kirill Grouchnikov
     */
    private static class MyFloatTableRenderer extends SubstanceDefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            int c = (10 * row) % 255;
            Color color = new Color(c, c, c);
            this.setForeground(new Color(255 - c, 0, 0));
            this.setBackground(color);
            if (value != null) {
                this.setText(value.toString());
            } else {
                this.setText("");
            }
            return this;
        }
    }

    /**
     * Custom table model.
     *
     * @author Kirill Grouchnikov
     */
    private static class MyTableModel extends AbstractTableModel {
        /**
         * The current row count.
         */
        private int rows;

        /**
         * The column count.
         */
        private int cols = 11;

        /**
         * The table data.
         */
        private Object[][] data;

        /**
         * The table column classes.
         */
        private Class<?>[] columns = new Class<?>[] {String.class, JComboBox.class,
                JComboBox.class, Boolean.class,
                Byte.class, Float.class, Double.class, String.class, Date.class,
                Color.class, ImageIcon.class};

        /**
         * Creates the custom table model.
         *
         * @param rows Initial number of rows.
         */
        public MyTableModel(int rows) {
            this.rows = rows;
            this.data = new Object[rows][this.cols];
            Icon[] icons = new Icon[] {br.of(16, 16), bg.of(16, 16), ca.of(16, 16), cn.of(16, 16),
                    dk.of(16, 16), fi.of(16, 16), fr.of(16, 16), de.of(16, 16),
                    gr.of(16, 16), hu.of(16, 16), il.of(16, 16), it.of(16, 16),
                    jp.of(16, 16), mx.of(16, 16), nl.of(16, 16), no.of(16, 16)};
            for (int i = 0; i < rows; i++) {
                this.data[i][0] = "cell " + i + ":" + 0;
                this.data[i][1] = "predef";
                this.data[i][2] = "predef";
                this.data[i][3] = (i % 2 == 0);
                this.data[i][4] = (byte) i;
                this.data[i][5] = (float) i;
                this.data[i][6] = (double) i;
                this.data[i][7] = "cell " + i + ":" + 6;

                Calendar cal = Calendar.getInstance();
                cal.set(2000 + i, 1 + i, 1 + i);
                this.data[i][8] = cal.getTime();

                int comp = i * 20;
                int red = (comp / 3) % 255;
                int green = (comp / 2) % 255;
                int blue = comp % 255;
                this.data[i][9] = new Color(red, green, blue);

                this.data[i][10] = icons[i % icons.length];
            }
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            return this.columns[columnIndex];
        }

        @Override
        public int getColumnCount() {
            return this.cols;
        }

        @Override
        public int getRowCount() {
            return this.rows;
        }

        @Override
        public Object getValueAt(int row, int col) {
            return this.data[row][col];
        }

        @Override
        public String getColumnName(int column) {
            return this.getColumnClass(column).getSimpleName();
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return (rowIndex % 2 == 0);
        }

        @Override
        public void setValueAt(Object value, int row, int col) {
            this.data[row][col] = value;
            this.fireTableCellUpdated(row, col);
        }
    }

    private class TheComboBoxEditor extends BasicComboBoxEditor {
        public TheComboBoxEditor() {
            editor.setEditable(false);
        }
    }

    /**
     * Creates a test panel with table.
     */
    public TablePanel() {
    }

    @SuppressWarnings("unchecked")
    public synchronized void initialize() {
        this.table = new JTable(new MyTableModel(20));

        this.table.setTransferHandler(new TransferHandler() {
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
        this.table.setDropMode(DropMode.ON);

        this.table.setDefaultRenderer(Color.class, new MyColorTableRenderer());
        this.table.setDefaultRenderer(Float.class, new MyFloatTableRenderer());
        final JScrollPane tableScrollpane = new JScrollPane(this.table);
        tableScrollpane.setName("Main table in table panel");

        JComboBox<String> combo = new JComboBox<>(new String[] {"aa", "bb", "cc"});
        combo.setBorder(null);
        this.table.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(combo));

        JComboBox<String> combo2 = new JComboBox<>(new String[] {"aa2", "bb2", "cc2"});
        combo2.setBorder(null);
        TheComboBoxEditor editor = new TheComboBoxEditor();
        combo2.setEditor(editor);
        combo2.setEditable(true);
        this.table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(combo2));

        this.table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        // We allow row selection as the default
        this.table.setCellSelectionEnabled(true);
        this.table.setRowSelectionAllowed(true);
        this.table.setColumnSelectionAllowed(false);

        this.table.setShowGrid(false);
        this.table.setDragEnabled(false);
        this.table.setTableHeader(new JTableHeader(this.table.getColumnModel()));

        this.table.getSelectionModel().addListSelectionListener(listSelectionEvent ->
                System.out.println("Selected rows " + Arrays.toString(table.getSelectedRows()) +
                        " selected columns " + Arrays.toString(table.getSelectedColumns())));

        this.setLayout(new BorderLayout());
        this.add(tableScrollpane, BorderLayout.CENTER);

        JLabel instructional = new JLabel("Every odd row is editable");
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(instructional, 1.0);
        this.add(instructional, BorderLayout.NORTH);

        // create a looping animation to change the label foreground to draw some attention.
        SwingComponentTimeline.componentBuilder(instructional)
                .addPropertyToInterpolate("foreground",
                        () -> SubstanceCortex.ComponentScope.getCurrentSkin(table)
                                .getColorScheme(table, ComponentState.ENABLED).getForegroundColor(),
                        () -> SubstanceCortex.GlobalScope.getCurrentSkin()
                                .getOptionPaneIconColorScheme(JOptionPane.WARNING_MESSAGE)
                                .getMidColor())
                .setDuration(1000)
                .playLoop(RepeatBehavior.REVERSE);

        TestFormLayoutBuilder builder = new TestFormLayoutBuilder(
                "right:pref, 4dlu, fill:pref:grow",
                2, 18);

        builder.appendSeparator("Table settings");
        final JCheckBox isEnabled = new JCheckBox("is enabled");
        isEnabled.setSelected(table.isEnabled());
        isEnabled.addActionListener(actionEvent -> table.setEnabled(isEnabled.isSelected()));
        builder.append("Enabled", isEnabled);

        JButton changeFirstColumn = new JButton("change 1st column");
        changeFirstColumn.addActionListener(actionEvent -> new Thread(() -> {
            for (int i = 0; i < table.getModel().getRowCount(); i++) {
                table.getModel().setValueAt(Thread.currentThread().getName() + " " + i, i, 0);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException exc) {
                }
            }
        }).start());
        builder.append("Change values", changeFirstColumn);

        final JSlider rowCountSlider = new JSlider(20, 10000, this.table.getModel().getRowCount());
        rowCountSlider.setPaintLabels(false);
        rowCountSlider.setPaintTicks(false);
        rowCountSlider.addChangeListener(changeEvent -> {
            if (rowCountSlider.getValueIsAdjusting())
                return;
            TablePanel.this.table.setModel(new MyTableModel(rowCountSlider.getValue()));
        });
        builder.append("Row count (->10K)", rowCountSlider);

        final JCheckBox areRowsSelectable = new JCheckBox("Rows selectable");
        areRowsSelectable.setSelected(this.table.getRowSelectionAllowed());
        areRowsSelectable.addActionListener(actionEvent -> TablePanel.this.table
                .setRowSelectionAllowed(areRowsSelectable.isSelected()));
        builder.append("Selectable", areRowsSelectable);

        final JCheckBox areColsSelectable = new JCheckBox("Cols selectable");
        areColsSelectable.setSelected(this.table.getColumnSelectionAllowed());
        areColsSelectable.addActionListener(actionEvent -> TablePanel.this.table
                .setColumnSelectionAllowed(areColsSelectable.isSelected()));
        builder.append("", areColsSelectable);

        final JCheckBox isSorted = new JCheckBox("Sorted");
        final JCheckBox toHideOddModelRows = new JCheckBox("Hide odd rows");
        isSorted.addActionListener(actionEvent -> {
            if (isSorted.isSelected()) {
                table.setRowSorter(new TableRowSorter<>(table.getModel()));
                toHideOddModelRows.setEnabled(true);
            } else {
                table.setRowSorter(null);
                toHideOddModelRows.setSelected(false);
                toHideOddModelRows.setEnabled(false);
            }
            table.repaint();
            table.getTableHeader().repaint();
        });
        builder.append("Sorted", isSorted);

        toHideOddModelRows.setEnabled(false);
        toHideOddModelRows.addActionListener(actionEvent -> {
            TableRowSorter<MyTableModel> rowSorter = (TableRowSorter<MyTableModel>) table.getRowSorter();
            if (toHideOddModelRows.isSelected()) {
                rowSorter.setRowFilter(new RowFilter<>() {
                    @Override
                    public boolean include(Entry entry) {
                        return (((Integer) entry.getIdentifier()) % 2 == 0);
                    }
                });
            } else {
                rowSorter.setRowFilter(new RowFilter<>() {
                    @Override
                    public boolean include(Entry entry) {
                        return true;
                    }
                });
            }
        });
        builder.append("", toHideOddModelRows);

        final JCheckBox customBackgroundCb = new JCheckBox("Has pink background");
        customBackgroundCb.addActionListener(new ActionListener() {
            Color oldBackColor;

            public void actionPerformed(ActionEvent e) {
                if (customBackgroundCb.isSelected()) {
                    oldBackColor = table.getBackground();
                    table.setBackground(new Color(255, 128, 128));
                } else {
                    table.setBackground(oldBackColor);
                }
            }
        });
        builder.append("Background", customBackgroundCb);

        final JCheckBox linesVertical = new JCheckBox("Vertical visible");
        linesVertical.setSelected(this.table.getShowVerticalLines());
        linesVertical.addActionListener(actionEvent -> TablePanel.this.table
                .setShowVerticalLines(linesVertical.isSelected()));
        builder.append("Lines", linesVertical);
        final JCheckBox linesHorizontal = new JCheckBox("Horizontal visible");
        linesHorizontal.setSelected(this.table.getShowHorizontalLines());
        linesHorizontal.addActionListener(actionEvent -> TablePanel.this.table
                .setShowHorizontalLines(linesHorizontal.isSelected()));
        builder.append("", linesHorizontal);

        final JComboBox resizeModeCombo = new FlexiComboBox<>(JTable.AUTO_RESIZE_OFF,
                JTable.AUTO_RESIZE_NEXT_COLUMN, JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS,
                JTable.AUTO_RESIZE_LAST_COLUMN, JTable.AUTO_RESIZE_ALL_COLUMNS) {
            @Override
            public String getCaption(Integer item) {
                int iv = item;
                switch (iv) {
                    case JTable.AUTO_RESIZE_OFF:
                        return "off";
                    case JTable.AUTO_RESIZE_NEXT_COLUMN:
                        return "next";
                    case JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS:
                        return "subsequent";
                    case JTable.AUTO_RESIZE_LAST_COLUMN:
                        return "last";
                    case JTable.AUTO_RESIZE_ALL_COLUMNS:
                        return "all";
                }
                return null;
            }
        };
        resizeModeCombo.setSelectedItem(this.table.getAutoResizeMode());

        resizeModeCombo.addActionListener(actionEvent -> {
            int selected = (Integer) resizeModeCombo.getSelectedItem();
            TablePanel.this.table.setAutoResizeMode(selected);
        });

        builder.append("Resize mode", resizeModeCombo);

        final JCheckBox hasRollovers = new JCheckBox("Has rollover effect");
        hasRollovers.setSelected(
                SubstanceCortex.ComponentScope.isAnimationAllowed(table, AnimationFacet.ROLLOVER));
        hasRollovers.addActionListener(actionEvent -> {
            if (hasRollovers.isSelected()) {
                SubstanceCortex.ComponentScope.allowAnimations(table, AnimationFacet.ROLLOVER);
            } else {
                SubstanceCortex.ComponentScope.disallowAnimations(table, AnimationFacet.ROLLOVER);
            }
        });
        builder.append("Rollovers", hasRollovers);

        final JCheckBox hasSelectionAnimations = new JCheckBox("Has selection effect");
        hasSelectionAnimations.setSelected(
                SubstanceCortex.ComponentScope.isAnimationAllowed(table, AnimationFacet.SELECTION));
        hasSelectionAnimations.addActionListener(actionEvent -> {
            if (hasSelectionAnimations.isSelected()) {
                SubstanceCortex.ComponentScope.allowAnimations(table, AnimationFacet.SELECTION);
            } else {
                SubstanceCortex.ComponentScope.disallowAnimations(table, AnimationFacet.SELECTION);
            }
        });
        builder.append("Selections", hasSelectionAnimations);

        builder.appendSeparator("Font settings");
        JButton tahoma12 = new JButton("Tahoma 12");
        tahoma12.addActionListener(actionEvent -> table.setFont(new Font("Tahoma", Font.PLAIN, 12)));
        builder.append("Set font", tahoma12);

        JButton tahoma13 = new JButton("Tahoma 13");
        tahoma13.addActionListener(actionEvent -> table.setFont(new Font("Tahoma", Font.PLAIN, 13)));
        builder.append("Set font", tahoma13);

        this.controlPanel = builder.build();
        this.isInitialized = true;
    }
}