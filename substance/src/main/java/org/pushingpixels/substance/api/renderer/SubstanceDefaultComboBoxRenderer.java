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
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Map;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.ListUI;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.ComponentStateFacet;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker.ModelStateInfo;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker.StateContributionInfo;
import org.pushingpixels.substance.internal.ui.SubstanceComboBoxUI;
import org.pushingpixels.substance.internal.ui.SubstanceListUI;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.SubstanceStripingUtils;
import org.pushingpixels.substance.internal.utils.SubstanceTextUtilities;
import org.pushingpixels.substance.internal.utils.UpdateOptimizationInfo;

/**
 * Renderer for combo boxes.
 * 
 * @author Kirill Grouchnikov
 */
@SubstanceRenderer
public class SubstanceDefaultComboBoxRenderer extends
		SubstanceDefaultListCellRenderer {
	/**
	 * The associated combo box.
	 */
	private JComboBox combo;

	/**
	 * Simple constructor.
	 * 
	 * @param combo
	 *            The associated combo box.
	 */
	public SubstanceDefaultComboBoxRenderer(JComboBox combo) {
		super();
		this.combo = combo;
		// this.setOpaque(true);

		Insets ins = SubstanceSizeUtils
				.getListCellRendererInsets(SubstanceSizeUtils
						.getComponentFontSize(combo));
		this
				.setBorder(new EmptyBorder(ins.top, ins.left, ins.bottom,
						ins.right));
		//
		// Insets i = b.getBorderInsets(combo);
		// System.out.println("Combo inner - " + combo.getFont().getSize() +" :
		// "
		// + i.top + ", " + i.left + ", " + i.bottom + ", " + i.right);
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {

		JComponent result = (JComponent) super.getListCellRendererComponent(
				list, value, index, isSelected, cellHasFocus);

		ListUI baseListUI = list.getUI();
		ComboBoxUI baseComboUI = combo.getUI();
		if ((baseListUI instanceof SubstanceListUI)
				&& (baseComboUI instanceof SubstanceComboBoxUI)) {
			SubstanceListUI listUI = (SubstanceListUI) baseListUI;
			SubstanceComboBoxUI comboUI = (SubstanceComboBoxUI) baseComboUI;

			// special case for the combobox. The selected value is
			// painted using the renderer of the list, and the index
			// is -1.
			if (index == -1) {
				StateTransitionTracker stateTransitionTracker = comboUI
						.getTransitionTracker();
				ModelStateInfo modelStateInfo = stateTransitionTracker
						.getModelStateInfo();
				ComponentState currState = modelStateInfo.getCurrModelState();
				float comboAlpha = SubstanceColorSchemeUtilities.getAlpha(
						combo, currState);
				Color fg = SubstanceTextUtilities
						.getForegroundColor(combo, ((JLabel) result).getText(),
								modelStateInfo, comboAlpha);
				result.setForeground(fg);
			} else {
				// use highlight color scheme for selected and rollover
				// elements in the drop down list
				StateTransitionTracker.ModelStateInfo modelStateInfo = listUI
						.getModelStateInfo(index, result);
				ComponentState currState = listUI.getCellState(index, result);
				if (modelStateInfo == null) {
					SubstanceColorScheme scheme = getColorSchemeForState(list,
							index, listUI, currState);
					// SubstanceColorScheme scheme =
					// SubstanceColorSchemeUtilities
					// .getColorScheme(list, kindForCurr, currState);
					result.setForeground(new ColorUIResource(scheme
							.getForegroundColor()));
				} else {
					Map<ComponentState, StateContributionInfo> activeStates = modelStateInfo
							.getStateContributionMap();
					SubstanceColorScheme colorScheme = getColorSchemeForState(
							list, index, listUI, currState);
					if (currState.isDisabled() || (activeStates == null)
							|| (activeStates.size() == 1)) {
						super.setForeground(new ColorUIResource(colorScheme
								.getForegroundColor()));
					} else {
						float aggrRed = 0.0f;
						float aggrGreen = 0.0f;
						float aggrBlue = 0.0f;
						for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : modelStateInfo
								.getStateContributionMap().entrySet()) {
							ComponentState activeState = activeEntry.getKey();
							float activeContribution = activeEntry.getValue()
									.getContribution();
							if (activeContribution == 0.0f)
								continue;

							SubstanceColorScheme scheme = getColorSchemeForState(
									list, index, listUI, activeState);
							// SubstanceColorScheme scheme = (activeState ==
							// ComponentState.DEFAULT) ? listUI
							// .getDefaultColorScheme()
							// : listUI.getHighlightColorScheme(activeState);
							// if (scheme == null) {
							// scheme = (activeState == ComponentState.DEFAULT)
							// ?
							// SubstanceColorSchemeUtilities
							// .getColorScheme(list, activeState)
							// : SubstanceColorSchemeUtilities
							// .getColorScheme(
							// list,
							// ColorSchemeAssociationKind.HIGHLIGHT,
							// activeState);
							// }
							Color schemeFg = scheme.getForegroundColor();
							aggrRed += schemeFg.getRed() * activeContribution;
							aggrGreen += schemeFg.getGreen()
									* activeContribution;
							aggrBlue += schemeFg.getBlue() * activeContribution;
						}
						result
								.setForeground(new ColorUIResource(new Color(
										(int) aggrRed, (int) aggrGreen,
										(int) aggrBlue)));
					}
				}
			}

			SubstanceStripingUtils.applyStripedBackground(list, index, this);
		}
		result.setEnabled(combo.isEnabled());
		return result;
	}

	private SubstanceColorScheme getColorSchemeForState(JList list, int index,
			SubstanceListUI listUI, ComponentState state) {
		boolean toUseHighlightKindForCurrState = (index >= 0)
				&& (state.isFacetActive(ComponentStateFacet.ROLLOVER) || state
						.isFacetActive(ComponentStateFacet.SELECTION));
		UpdateOptimizationInfo updateOptimizationInfo = listUI
				.getUpdateOptimizationInfo();
		if (toUseHighlightKindForCurrState) {
			if (updateOptimizationInfo == null) {
				return SubstanceColorSchemeUtilities.getColorScheme(list,
						ColorSchemeAssociationKind.HIGHLIGHT, state);
			} else {
				return updateOptimizationInfo.getHighlightColorScheme(state);
			}
		} else {
			if (updateOptimizationInfo == null) {
				return SubstanceColorSchemeUtilities
						.getColorScheme(list, state);
			} else {
				return updateOptimizationInfo.getDefaultScheme();
			}
		}
	}

	@Override
	public Dimension getPreferredSize() {
		Dimension size;

		if ((this.getText() == null) || (this.getText().equals(""))) {
			this.setText(" ");
			size = super.getPreferredSize();
			this.setText("");
		} else {
			size = super.getPreferredSize();
		}

		return size;
	}

	/**
	 * UI resource for renderer (does nothing yet).
	 * 
	 * @author Kirill Grouchnikov
	 */
	public static class SubstanceUIResource extends
			SubstanceDefaultComboBoxRenderer implements
			javax.swing.plaf.UIResource {
		/**
		 * Creates a new renderer resource.
		 * 
		 * @param combo
		 *            Combobox.
		 */
		public SubstanceUIResource(JComboBox combo) {
			super(combo);
		}
	}
}
