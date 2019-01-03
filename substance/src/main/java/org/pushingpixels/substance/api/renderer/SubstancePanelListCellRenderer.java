/*
 * Copyright (c) 2005-2019 Substance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.neon.icon.*;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;
import org.pushingpixels.substance.internal.ui.SubstanceListUI;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;
import java.util.*;

public abstract class SubstancePanelListCellRenderer<T> extends JPanel
        implements ListCellRenderer<T> {
    private static class IconData {
        private ResizableIconFactory iconFactory;
        private Dimension iconSize;

        public IconData(ResizableIconFactory iconFactory, Dimension iconSize) {
            this.iconFactory = iconFactory;
            this.iconSize = iconSize;
        }
    }

    private Set<JLabel> themeAwareLabels;
    private Map<JLabel, IconData> themeAwareLabelsWithIcons;

    public SubstancePanelListCellRenderer() {
        SubstanceCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
        this.themeAwareLabels = new HashSet<>();
        this.themeAwareLabelsWithIcons = new HashMap<>();
    }

    protected void registerThemeAwareLabels(JLabel... labels) {
        for (JLabel label: labels) {
            this.themeAwareLabels.add(label);
        }
    }

    protected void registerThemeAwareLabelWithIcon(JLabel label,
            ResizableIconFactory resizableIconFactory, Dimension iconDimension) {
        this.themeAwareLabelsWithIcons.put(label,
                new IconData(resizableIconFactory, iconDimension));
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends T> list, T value, int index,
            boolean isSelected, boolean cellHasFocus) {
        this.setComponentOrientation(list.getComponentOrientation());
        float rolloverArmAmount = 0.0f;

        Color labelForeground;
        ListUI listUI = list.getUI();
        if (listUI instanceof SubstanceListUI) {
            SubstanceListUI ui = (SubstanceListUI) listUI;

            StateTransitionTracker.ModelStateInfo modelStateInfo = ui.getModelStateInfo(index,
                    this);
            ComponentState currState = ui.getCellState(index, this);

            // special case for drop location
            JList.DropLocation dropLocation = list.getDropLocation();
            boolean isDropLocation = (dropLocation != null && !dropLocation.isInsert()
                    && dropLocation.getIndex() == index);

            if (!isDropLocation && (modelStateInfo != null)) {
                Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                        .getStateContributionMap();
                SubstanceColorScheme colorScheme = getColorSchemeForState(list, ui, currState);
                if (currState.isDisabled() || (activeStates == null)
                        || (activeStates.size() == 1)) {
                    labelForeground = new ColorUIResource(colorScheme.getForegroundColor());
                    rolloverArmAmount = 0.0f;
                } else {
                    float aggrRed = 0;
                    float aggrGreen = 0;
                    float aggrBlue = 0;

                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : modelStateInfo
                            .getStateContributionMap().entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        float contribution = activeEntry.getValue().getContribution();
                        if (activeState.isFacetActive(
                                SubstanceSlices.ComponentStateFacet.ROLLOVER) ||
                                activeState.isFacetActive(
                                        SubstanceSlices.ComponentStateFacet.ARM)) {
                            rolloverArmAmount = Math.max(rolloverArmAmount, contribution);
                        }

                        SubstanceColorScheme scheme = getColorSchemeForState(list, ui, activeState);
                        Color schemeFg = scheme.getForegroundColor();
                        aggrRed += schemeFg.getRed() * contribution;
                        aggrGreen += schemeFg.getGreen() * contribution;
                        aggrBlue += schemeFg.getBlue() * contribution;
                    }
                    labelForeground = new ColorUIResource(
                            new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue));
                }
            } else {
                SubstanceColorScheme scheme = getColorSchemeForState(list, ui, currState);
                if (isDropLocation) {
                    scheme = SubstanceColorSchemeUtilities.getColorScheme(list,
                            SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT_TEXT, currState);
                }
                rolloverArmAmount = currState.isFacetActive(
                        SubstanceSlices.ComponentStateFacet.ROLLOVER) ||
                        currState.isFacetActive(
                                SubstanceSlices.ComponentStateFacet.SELECTION) ||
                        currState.isFacetActive(
                                SubstanceSlices.ComponentStateFacet.ARM) ? 1.0f : 0.0f;
                labelForeground = new ColorUIResource(scheme.getForegroundColor());
            }
        } else {
            if (isSelected) {
                labelForeground = list.getSelectionForeground();
            } else {
                labelForeground = list.getForeground();
            }
        }

        this.setEnabled(list.isEnabled());
        this.setFont(list.getFont());

        this.bindData(list, value, index);

        for (JLabel themeAwareLabel: this.themeAwareLabels) {
            themeAwareLabel.setForeground(labelForeground);
        }

        for (Map.Entry<JLabel, IconData> themeAwareLabelsWithIcons:
                this.themeAwareLabelsWithIcons.entrySet()) {
            JLabel label = themeAwareLabelsWithIcons.getKey();
            IconData iconData = themeAwareLabelsWithIcons.getValue();

            ResizableIcon icon = SubstanceCortex.GlobalScope.colorizeIcon(
                    iconData.iconFactory, labelForeground);
            icon.setDimension(iconData.iconSize);

            label.setIcon(icon);
        }

        return this;
    }

    protected abstract void bindData(JList<? extends T> list, T value, int index);

    private SubstanceColorScheme getColorSchemeForState(JList list, SubstanceListUI ui,
            ComponentState state) {
        UpdateOptimizationInfo updateOptimizationInfo = ui.getUpdateOptimizationInfo();
        if (state == ComponentState.ENABLED) {
            if (updateOptimizationInfo == null) {
                return SubstanceColorSchemeUtilities.getColorScheme(list, state);
            } else {
                return updateOptimizationInfo.getDefaultScheme();
            }
        } else {
            if (updateOptimizationInfo == null) {
                return SubstanceColorSchemeUtilities.getColorScheme(list,
                        SubstanceSlices.ColorSchemeAssociationKind.HIGHLIGHT, state);
            } else {
                return updateOptimizationInfo.getHighlightColorScheme(state);
            }
        }
    }
}
