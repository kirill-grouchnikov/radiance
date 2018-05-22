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
package org.pushingpixels.substance.api.renderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.TableUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker.StateContributionInfo;
import org.pushingpixels.substance.internal.ui.SubstanceTableUI;
import org.pushingpixels.substance.internal.ui.SubstanceTableUI.TableCellId;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceStripingUtils;
import org.pushingpixels.substance.internal.utils.UpdateOptimizationInfo;
import org.pushingpixels.substance.internal.utils.border.SubstanceTableCellBorder;

/**
 * Default renderer for table cells.
 * 
 * @author Kirill Grouchnikov
 */
@SubstanceRenderer
public class SubstanceDefaultTableCellRenderer extends DefaultTableCellRenderer {
	/**
	 * Renderer for boolean columns.
	 * 
	 * @author Kirill Grouchnikov
	 */
	@SubstanceRenderer
	public static class BooleanRenderer extends JCheckBox implements
			TableCellRenderer {
		/**
		 * Border for cells that do not have focus.
		 */
		private static final Border noFocusBorder = new EmptyBorder(1, 1, 1, 1);

		/**
		 * Creates a new renderer for boolean columns.
		 */
		public BooleanRenderer() {
			super();
			this.setHorizontalAlignment(SwingConstants.CENTER);
			this.setBorderPainted(true);
		}

		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (isSelected) {
				this.setForeground(table.getSelectionForeground());
			} else {
				this.setForeground(table.getForeground());
			}
			SubstanceStripingUtils.applyStripedBackground(table, row, this);

			this.setSelected(((value != null) && ((Boolean) value)
					.booleanValue()));
			this.setEnabled(table.isEnabled());

			TableUI tableUI = table.getUI();
			if (tableUI instanceof SubstanceTableUI) {
				SubstanceTableUI ui = (SubstanceTableUI) tableUI;

				// Recompute the focus indication to prevent flicker - JTable
				// registers a listener on selection changes and repaints the
				// relevant cell before our listener (in TableUI) gets the
				// chance to start the fade sequence. The result is that the
				// first frame uses full opacity, and the next frame starts the
				// fade sequence. So, we use the UI delegate to compute the
				// focus indication.
				hasFocus = ui.isFocusedCell(row, column);

				TableCellId cellFocusId = new TableCellId(row, column);

				StateTransitionTracker stateTransitionTracker = ui
						.getStateTransitionTracker(cellFocusId);
				if (hasFocus || (stateTransitionTracker != null)) {
					SubstanceTableCellBorder border = new SubstanceTableCellBorder(
							new Insets(0, 0, 0, 0), ui, cellFocusId);
					if (stateTransitionTracker != null) {
						border.setAlpha(stateTransitionTracker
								.getFocusStrength(hasFocus));
					}
					this.setBorder(border);
				} else {
					this.setBorder(BooleanRenderer.noFocusBorder);
				}
			} else {
				if (hasFocus) {
					this.setBorder(UIManager
							.getBorder("Table.focusCellHighlightBorder"));
				} else {
					this.setBorder(BooleanRenderer.noFocusBorder);
				}
			}

			this.setOpaque(false);

			return this;
		}

		@Override
		public final void paint(Graphics g) {
			super.paint(g);
		}

		@Override
		protected final void paintComponent(Graphics g) {
			super.paintComponent(g);
		}

		@Override
		protected final void paintBorder(Graphics g) {
			super.paintBorder(g);
		}

		@Override
		public final void paintComponents(Graphics g) {
		}
	}

	/**
	 * Renderer for icon columns.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class IconRenderer extends SubstanceDefaultTableCellRenderer {
		/**
		 * Creates a new renderer for icon columns.
		 */
		public IconRenderer() {
			super();
			this.setHorizontalAlignment(SwingConstants.CENTER);
		}

		@Override
		public void setValue(Object value) {
			this.setIcon((value instanceof Icon) ? (Icon) value : null);
			this.setText(null);
		}
	}

	/**
	 * Renderer for number columns.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class NumberRenderer extends
			SubstanceDefaultTableCellRenderer {
		/**
		 * Creates a new renderer for number columns.
		 */
		public NumberRenderer() {
			super();
			this.setHorizontalAlignment(SwingConstants.RIGHT);
		}
	}

	/**
	 * Renderer for double columns.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class DoubleRenderer extends NumberRenderer {
		/**
		 * Number formatter for this renderer.
		 */
		NumberFormat formatter;

		/**
		 * Creates a new renderer for double columns.
		 */
		public DoubleRenderer() {
			super();
		}

		@Override
		public void setValue(Object value) {
			if (this.formatter == null) {
				this.formatter = NumberFormat.getInstance();
			}
			this.setText((value == null) ? "" : this.formatter.format(value));
		}
	}

	/**
	 * Renderer for date columns.
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class DateRenderer extends SubstanceDefaultTableCellRenderer {
		/**
		 * Date formatter for this renderer.
		 */
		DateFormat formatter;

		/**
		 * Creates a new renderer for date columns.
		 */
		public DateRenderer() {
			super();
		}

		@Override
		public void setValue(Object value) {
			if (this.formatter == null) {
				this.formatter = DateFormat.getDateInstance();
			}
			this.setText((value == null) ? "" : this.formatter.format(value));
		}
	}

	/**
	 * Creates a default opaque table cell renderer.
	 */
	public SubstanceDefaultTableCellRenderer() {
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		if (!SubstanceCoreUtilities.isCurrentLookAndFeel())
			return super.getTableCellRendererComponent(table, value,
					isSelected, hasFocus, row, column);

		TableUI tableUI = table.getUI();
		SubstanceTableUI ui = (SubstanceTableUI) tableUI;

		// Recompute the focus indication to prevent flicker - JTable
		// registers a listener on selection changes and repaints the
		// relevant cell before our listener (in TableUI) gets the
		// chance to start the fade sequence. The result is that the
		// first frame uses full opacity, and the next frame starts the
		// fade sequence. So, we use the UI delegate to compute the
		// focus indication.
		hasFocus = ui.isFocusedCell(row, column);

		TableCellId cellId = new TableCellId(row, column);

		StateTransitionTracker.ModelStateInfo modelStateInfo = ui
				.getModelStateInfo(cellId);
		ComponentState currState = ui.getCellState(cellId);
		// special case for drop location
		JTable.DropLocation dropLocation = table.getDropLocation();
		boolean isDropLocation = (dropLocation != null
				&& !dropLocation.isInsertRow()
				&& !dropLocation.isInsertColumn()
				&& dropLocation.getRow() == row && dropLocation.getColumn() == column);

		if (!isDropLocation && (modelStateInfo != null)) {
			if (ui.hasRolloverAnimations() || ui.hasSelectionAnimations()) {
				Map<ComponentState, StateContributionInfo> activeStates = modelStateInfo
						.getStateContributionMap();
				SubstanceColorScheme colorScheme = getColorSchemeForState(
						table, ui, currState);
				if (currState.isDisabled() || (activeStates == null)
						|| (activeStates.size() == 1)) {
					super.setForeground(new ColorUIResource(colorScheme
							.getForegroundColor()));
				} else {
					float aggrRed = 0;
					float aggrGreen = 0;
					float aggrBlue = 0;
					for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : modelStateInfo
							.getStateContributionMap().entrySet()) {
						ComponentState activeState = activeEntry.getKey();
						SubstanceColorScheme scheme = getColorSchemeForState(
								table, ui, activeState);
						Color schemeFg = scheme.getForegroundColor();
						float contribution = activeEntry.getValue()
								.getContribution();
						aggrRed += schemeFg.getRed() * contribution;
						aggrGreen += schemeFg.getGreen() * contribution;
						aggrBlue += schemeFg.getBlue() * contribution;
					}
					super.setForeground(new ColorUIResource(new Color(
							(int) aggrRed, (int) aggrGreen, (int) aggrBlue)));
				}
			} else {
				SubstanceColorScheme scheme = getColorSchemeForState(table, ui,
						currState);
				super.setForeground(new ColorUIResource(scheme
						.getForegroundColor()));
			}
		} else {
			SubstanceColorScheme scheme = getColorSchemeForState(table, ui,
					currState);
			if (isDropLocation) {
				scheme = SubstanceColorSchemeUtilities.getColorScheme(table,
						ColorSchemeAssociationKind.HIGHLIGHT_TEXT, currState);
			}
			super
					.setForeground(new ColorUIResource(scheme
							.getForegroundColor()));
		}

		SubstanceStripingUtils.applyStripedBackground(table, row, this);

		this.setFont(table.getFont());

		TableCellId cellFocusId = new TableCellId(row, column);

		StateTransitionTracker focusStateTransitionTracker = ui
				.getStateTransitionTracker(cellFocusId);

		Insets regInsets = ui.getCellRendererInsets();
		if (hasFocus || (focusStateTransitionTracker != null)) {
			SubstanceTableCellBorder border = new SubstanceTableCellBorder(
					regInsets, ui, cellFocusId);

			// System.out.println("[" + row + ":" + column + "] hasFocus : "
			// + hasFocus + ", focusState : " + focusState);
			if (focusStateTransitionTracker != null) {
				border.setAlpha(focusStateTransitionTracker
						.getFocusStrength(hasFocus));
			}

			// special case for tables with no grids
			if (!table.getShowHorizontalLines()
					&& !table.getShowVerticalLines()) {
				this.setBorder(new CompoundBorder(new EmptyBorder(table
						.getRowMargin() / 2, 0, table.getRowMargin() / 2, 0),
						border));
			} else {
				this.setBorder(border);
			}
		} else {
			this.setBorder(new EmptyBorder(regInsets.top, regInsets.left,
					regInsets.bottom, regInsets.right));
		}

		this.setValue(value);
		this.setOpaque(false);
		this.setEnabled(table.isEnabled());
		return this;
	}

	private SubstanceColorScheme getColorSchemeForState(JTable table,
			SubstanceTableUI ui, ComponentState state) {
		UpdateOptimizationInfo updateOptimizationInfo = ui
				.getUpdateOptimizationInfo();
		if (state == ComponentState.ENABLED) {
			if (updateOptimizationInfo == null) {
				return SubstanceColorSchemeUtilities.getColorScheme(table,
						state);
			} else {
				return updateOptimizationInfo.getDefaultScheme();
			}
		} else {
			if (updateOptimizationInfo == null) {
				return SubstanceColorSchemeUtilities.getColorScheme(table,
						ColorSchemeAssociationKind.HIGHLIGHT, state);
			} else {
				return updateOptimizationInfo.getHighlightColorScheme(state);
			}
		}
	}

	@Override
	public final void paint(Graphics g) {
		super.paint(g);
	}

	@Override
	protected final void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	protected final void paintBorder(Graphics g) {
		super.paintBorder(g);
	}

	@Override
	public final void paintComponents(Graphics g) {
	}
}
