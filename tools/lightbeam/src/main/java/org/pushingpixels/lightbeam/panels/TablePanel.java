/*
 * Copyright (c) 2008-2018 Lightbeam Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Lightbeam Kirill Grouchnikov nor the names of
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
package org.pushingpixels.lightbeam.panels;

import org.pushingpixels.lightbeam.*;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.*;

/**
 * Test application panel for testing {@link JTable} component.
 * 
 * @author Kirill Grouchnikov
 */
public class TablePanel extends JPanel {
	/**
	 * The table.
	 */
	private JTable table;

	/**
	 * Custom renderer for columns that contain {@link Color} data.
	 * 
	 * @author Kirill Grouchnikov
	 */
	private static class MyColorTableRenderer extends DefaultTableCellRenderer {
		@Override
		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			Color color = (Color) value;
			this.setForeground(color);
			this.setBackground(new Color(255 - color.getRed(), 255 - color
					.getGreen(), 255 - color.getBlue()));
			this.setText("row " + row);
			return this;
		}
	}

	/**
	 * Custom renderer for the columns that contain {@link Float} data.
	 * 
	 * @author Kirill Grouchnikov
	 */
	private static class MyFloatTableRenderer extends DefaultTableCellRenderer {
		@Override
		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			int c = (10 * row) % 255;
			Color color = new Color(c, c, c);
			this.setForeground(new Color(255 - c, 0, 0));
			this.setBackground(color);
			this.setText(value.toString());
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
		private int cols = 10;

		/**
		 * The table data.
		 */
		private ArrayList<Object[]> data;

		/**
		 * The table column classes.
		 */
		private Class<?>[] columns = new Class<?>[] { String.class,
				JComboBox.class, Boolean.class, Byte.class, Float.class,
				Double.class, String.class, Date.class, ImageIcon.class,
				Color.class };

		/**
		 * Creates the custom table model.
		 * 
		 * @param rows
		 * 		Initial number of rows.
		 */
		public MyTableModel(int rows) {
			this.rows = rows;
			this.data = new ArrayList<Object[]>();
			for (int i = 0; i < rows; i++) {
				Object[] row = new Object[this.cols];
				this.data.add(row);
				row[0] = "cell " + i + ":" + 0;
				row[1] = "predef";
				row[2] = new Boolean(i % 2 == 0);
				row[3] = new Byte((byte) i);
				row[4] = new Float(i);
				row[5] = new Double(i);
				row[6] = "cell " + i + ":" + 6;
				Calendar cal = Calendar.getInstance();
				cal.set(2000 + i, 1 + i, 1 + i);
				row[7] = cal.getTime();
				row[8] = IconManager.getRandomIcon();

				int comp = i * 20;
				int red = (comp / 3) % 255;
				int green = (comp / 2) % 255;
				int blue = comp % 255;
				row[9] = new Color(red, green, blue);
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
			return this.data.get(row)[col];
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
			this.data.get(row)[col] = value;
			this.fireTableCellUpdated(row, col);
		}

		public void deleteRows(int startIndex, int count) {
			int index = startIndex + count - 1;
			while (index >= startIndex) {
				this.data.remove(index);
				index--;
			}
			this.fireTableRowsDeleted(startIndex, startIndex + count - 1);
		}
	}

	/**
	 * Creates a test panel with table.
	 */
	public TablePanel() {
		this.table = new JTable(new MyTableModel(1000));
		this.table.setDefaultRenderer(Color.class, new MyColorTableRenderer());
		this.table.setDefaultRenderer(Float.class, new MyFloatTableRenderer());

		// this.table.setDefaultRenderer(Object.class, new NullTableRenderer());
		// this.table.setDefaultRenderer(Icon.class, new NullTableRenderer());
		// this.table.setDefaultRenderer(ImageIcon.class, new NullTableRenderer(
		// ));
		// this.table.setDefaultRenderer(Number.class, new NullTableRenderer());
		// this.table.setDefaultRenderer(Float.class, new NullTableRenderer());
		// this.table.setDefaultRenderer(Double.class, new NullTableRenderer());
		// this.table.setDefaultRenderer(Date.class, new NullTableRenderer());
		// this.table.setDefaultRenderer(Boolean.class, new NullTableRenderer())
		// ;

		JScrollPane tableScrollpane = new JScrollPane(this.table);
		tableScrollpane.setName("Main table in table panel");

		JComboBox combo = new JComboBox(new Object[] { "aa", "bb", "cc" });
		combo.setBorder(null);
		this.table.getColumnModel().getColumn(1).setCellEditor(
				new DefaultCellEditor(combo));

		this.table
				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		// We allow row selection as the default
		this.table.setCellSelectionEnabled(true);
		this.table.setRowSelectionAllowed(true);
		this.table.setColumnSelectionAllowed(false);

		this.table.setShowGrid(false);
		this.table.setDragEnabled(false);
		this.table
				.setTableHeader(new JTableHeader(this.table.getColumnModel()));

		this.setLayout(new BorderLayout());
		this.add(tableScrollpane, BorderLayout.CENTER);

		final JLabel instructional = new JLabel("Every odd row is editable");
		this.add(instructional, BorderLayout.NORTH);

	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getLargeScrollScenario() {
		return new PerformanceScenario() {
			int[] perms;

			@Override
			public String getName() {
				return "Scrolling large table";
			}

			@Override
			public void setup() {
				table.scrollRectToVisible(table.getCellRect(0, 0, true));
				table.getSelectionModel().clearSelection();
				table.getColumnModel().getSelectionModel().clearSelection();
				this.perms = LightbeamUtils.getPermutation(table.getRowCount(),
						this.getIterationCount());
			}

			@Override
			public int getIterationCount() {
				return 10;
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				table.scrollRectToVisible(table.getCellRect(
						this.perms[iterationNumber], 0, true));
				table.paintImmediately(table.getVisibleRect());
			}
		};
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getLargeRowSelectionScenario() {
		return new PerformanceScenario() {
			int[] perms;

			@Override
			public String getName() {
				return "Selecting rows in large table";
			}

			@Override
			public void setup() {
				table.scrollRectToVisible(table.getCellRect(0, 0, true));
				table.setRowSelectionAllowed(true);
				table.setColumnSelectionAllowed(false);
				table.getSelectionModel().clearSelection();
				table.getSelectionModel().setSelectionMode(
						ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				this.perms = LightbeamUtils.getPermutation(table.getRowCount(),
						this.getIterationCount() * 2);
			}

			@Override
			public int getIterationCount() {
				return 10;
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				ListSelectionModel selectionModel = table.getSelectionModel();
				int start = perms[2 * iterationNumber];
				int end = perms[2 * iterationNumber + 1];
				int startInt = Math.min(start, end);
				int endInt = Math.max(start, end);
				selectionModel.clearSelection();
				// scroll to the middle
				int selectionMiddle = (startInt + endInt) / 2;
				table.scrollRectToVisible(table.getCellRect(selectionMiddle, 0,
						true));
				// and select
				selectionModel.addSelectionInterval(startInt, endInt);
				table.paintImmediately(table.getVisibleRect());
			}
		};
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getLargeColumnSelectionScenario() {
		return new PerformanceScenario() {
			int[] perms;

			@Override
			public String getName() {
				return "Selecting columns in large table";
			}

			@Override
			public void setup() {
				table.scrollRectToVisible(table.getCellRect(0, 0, true));
				table.setRowSelectionAllowed(false);
				table.setColumnSelectionAllowed(true);
				table.getColumnModel().getSelectionModel().clearSelection();
				table.getColumnModel().getSelectionModel().setSelectionMode(
						ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				this.perms = LightbeamUtils.getPermutation(table
						.getColumnCount(), this.getIterationCount() * 2);
			}

			@Override
			public int getIterationCount() {
				return 10;
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				ListSelectionModel selectionModel = table.getColumnModel()
						.getSelectionModel();
				int start = perms[2 * iterationNumber];
				int end = perms[2 * iterationNumber + 1];
				int startInt = Math.min(start, end);
				int endInt = Math.max(start, end);
				selectionModel.clearSelection();
				selectionModel.addSelectionInterval(startInt, endInt);
				table.paintImmediately(table.getVisibleRect());
			}
		};
	}

	@PerformanceScenarioParticipant
	public PerformanceScenario getRowDeletionScenario() {
		return new PerformanceScenario() {
			int[] perms;

			int origRowCount;

			@Override
			public String getName() {
				return "Deleting rows in large table";
			}

			@Override
			public void setup() {
				table.scrollRectToVisible(table.getCellRect(0, 0, true));
				table.setRowSelectionAllowed(true);
				table.setColumnSelectionAllowed(false);
				table.getSelectionModel().clearSelection();
				table.getSelectionModel().setSelectionMode(
						ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				this.perms = LightbeamUtils.getPermutation(table.getRowCount()
						- 10 * this.getIterationCount(), this
						.getIterationCount());
				this.origRowCount = table.getRowCount();
			}

			@Override
			public int getIterationCount() {
				return 10;
			}

			@Override
			public void runSingleIteration(int iterationNumber) {
				MyTableModel model = (MyTableModel) table.getModel();
				int start = this.perms[iterationNumber];
				// scroll to the beginning
				table.scrollRectToVisible(table.getCellRect(start, 0, true));
				// and delete 10 rows
				model.deleteRows(start, 10);
				table.paintImmediately(table.getVisibleRect());
			}

			@Override
			public void tearDown() {
				table.setModel(new MyTableModel(this.origRowCount));
			}
		};
	}
}