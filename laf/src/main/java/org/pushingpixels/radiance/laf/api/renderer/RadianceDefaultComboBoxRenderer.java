/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.laf.api.renderer;

import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.laf.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.laf.internal.animation.StateTransitionTracker.ModelStateInfo;
import org.pushingpixels.radiance.laf.internal.animation.StateTransitionTracker.StateContributionInfo;
import org.pushingpixels.radiance.laf.internal.ui.RadianceComboBoxUI;
import org.pushingpixels.radiance.laf.internal.ui.RadianceListUI;
import org.pushingpixels.radiance.laf.internal.utils.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.ListUI;
import java.awt.*;
import java.util.Map;

/**
 * Renderer for combo boxes.
 *
 * @author Kirill Grouchnikov
 */
@RadianceRenderer
public class RadianceDefaultComboBoxRenderer extends RadianceDefaultListCellRenderer {
    /**
     * The associated combo box.
     */
    private final JComboBox<?> combo;

    /**
     * Simple constructor.
     *
     * @param combo The associated combo box.
     */
    public RadianceDefaultComboBoxRenderer(JComboBox<?> combo) {
        super();
        this.combo = combo;

        Insets ins = RadianceSizeUtils.getListCellRendererInsets(combo,
                RadianceSizeUtils.getComponentFontSize(combo));
        this.setBorder(new EmptyBorder(ins.top, ins.left, ins.bottom, ins.right));
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {

        JComponent result = (JComponent) super.getListCellRendererComponent(
                list, value, index, isSelected, cellHasFocus);

        ListUI baseListUI = list.getUI();
        ComboBoxUI baseComboUI = combo.getUI();
        if ((baseListUI instanceof RadianceListUI)
                && (baseComboUI instanceof RadianceComboBoxUI)) {
            RadianceListUI listUI = (RadianceListUI) baseListUI;
            RadianceComboBoxUI comboUI = (RadianceComboBoxUI) baseComboUI;

            // special case for the combobox. The selected value is
            // painted using the renderer of the list, and the index
            // is -1.
            if (index == -1) {
                StateTransitionTracker stateTransitionTracker = comboUI
                        .getTransitionTracker();
                ModelStateInfo modelStateInfo = stateTransitionTracker.getModelStateInfo();
                // Pass 1.0f as the alpha, even for disabled comboboxes. The alpha will be
                // applied at painting time of the label itself.
                Color fg = RadianceTextUtilities.getForegroundColor(combo,
                        ((JLabel) result).getText(), modelStateInfo, 1.0f);
                result.setForeground(fg);

                for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                        modelStateInfo.getStateContributionMap().entrySet()) {
                    ComponentState activeState = activeEntry.getKey();
                    float contribution = activeEntry.getValue().getContribution();
                    if (activeState.isFacetActive(RadianceLafSlices.ComponentStateFacet.SELECTION) ||
                            activeState.isFacetActive(RadianceLafSlices.ComponentStateFacet.ROLLOVER) ||
                            activeState.isFacetActive(RadianceLafSlices.ComponentStateFacet.ARM)) {
                        this.rolloverArmAmount = Math.max(this.rolloverArmAmount, contribution);
                        this.activeContributions.put(activeState, contribution);
                    }
                }
            } else {
                // use highlight color scheme for selected and rollover
                // elements in the drop down list
                StateTransitionTracker.ModelStateInfo modelStateInfo = listUI
                        .getModelStateInfo(index, result);
                ComponentState currState = listUI.getCellState(index, result);
                if (modelStateInfo == null) {
                    RadianceColorScheme scheme = getColorSchemeForState(list,
                            index, listUI, currState);
                    result.setForeground(new ColorUIResource(scheme
                            .getForegroundColor()));
                } else {
                    Map<ComponentState, StateContributionInfo> activeStates = modelStateInfo
                            .getStateContributionMap();
                    RadianceColorScheme colorScheme = getColorSchemeForState(
                            list, index, listUI, currState);
                    if (currState.isDisabled() || (activeStates == null)
                            || (activeStates.size() == 1)) {
                        super.setForeground(new ColorUIResource(colorScheme
                                .getForegroundColor()));
                    } else {
                        float aggrRed = 0.0f;
                        float aggrGreen = 0.0f;
                        float aggrBlue = 0.0f;
                        for (Map.Entry<ComponentState,
                                StateTransitionTracker.StateContributionInfo> activeEntry :
                                modelStateInfo.getStateContributionMap().entrySet()) {
                            ComponentState activeState = activeEntry.getKey();
                            float activeContribution = activeEntry.getValue().getContribution();
                            if (activeContribution == 0.0f)
                                continue;

                            RadianceColorScheme scheme = getColorSchemeForState(
                                    list, index, listUI, activeState);
                            Color schemeFg = scheme.getForegroundColor();
                            aggrRed += schemeFg.getRed() * activeContribution;
                            aggrGreen += schemeFg.getGreen() * activeContribution;
                            aggrBlue += schemeFg.getBlue() * activeContribution;
                        }
                        result.setForeground(new ColorUIResource(new Color(
                                (int) aggrRed, (int) aggrGreen, (int) aggrBlue)));
                    }
                }
            }

            RadianceStripingUtils.applyStripedBackground(list, index, this);
        }
        result.setEnabled(combo.isEnabled());
        return result;
    }

    private RadianceColorScheme getColorSchemeForState(JList list, int index,
            RadianceListUI listUI, ComponentState state) {
        boolean toUseHighlightKindForCurrState = (index >= 0)
                && (state.isFacetActive(RadianceLafSlices.ComponentStateFacet.ROLLOVER) || state
                .isFacetActive(RadianceLafSlices.ComponentStateFacet.SELECTION));
        UpdateOptimizationInfo updateOptimizationInfo = listUI
                .getUpdateOptimizationInfo();
        if (toUseHighlightKindForCurrState) {
            if (updateOptimizationInfo == null) {
                return RadianceColorSchemeUtilities.getColorScheme(list,
                        RadianceLafSlices.ColorSchemeAssociationKind.HIGHLIGHT, state);
            } else {
                return updateOptimizationInfo.getHighlightColorScheme(state);
            }
        } else {
            if (updateOptimizationInfo == null) {
                return RadianceColorSchemeUtilities
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
    public static class RadianceUIResource extends RadianceDefaultComboBoxRenderer implements
            javax.swing.plaf.UIResource {
        /**
         * Creates a new renderer resource.
         *
         * @param combo Combobox.
         */
        public RadianceUIResource(JComboBox combo) {
            super(combo);
        }
    }
}
