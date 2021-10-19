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
package org.pushingpixels.radiance.theming.api.renderer;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker.StateContributionInfo;
import org.pushingpixels.radiance.theming.internal.ui.RadianceListUI;
import org.pushingpixels.radiance.theming.internal.utils.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ListUI;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Default renderer for list cells. Use {@link RadiancePanelListCellRenderer} for more
 * complex renderers that need more than one label for their content.
 *
 * @author Kirill Grouchnikov
 */
@RadianceRenderer
public class RadianceDefaultListCellRenderer extends DefaultListCellRenderer
        implements FilteredIconAwareRenderer {
    protected float rolloverArmAmount;

    protected Map<ComponentState, Float> activeContributions = new HashMap<>();

    /**
     * Constructs a default renderer object for an item in a list.
     */
    public RadianceDefaultListCellRenderer() {
        super();
        RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {
        this.setComponentOrientation(list.getComponentOrientation());
        this.rolloverArmAmount = 0.0f;
        this.activeContributions.clear();

        ListUI listUI = list.getUI();
        if (listUI instanceof RadianceListUI) {
            RadianceListUI ui = (RadianceListUI) listUI;

            StateTransitionTracker.ModelStateInfo modelStateInfo = ui.getModelStateInfo(index,
                    this);
            ComponentState currState = ui.getCellState(index, this);

            // special case for drop location
            JList.DropLocation dropLocation = list.getDropLocation();
            boolean isDropLocation = (dropLocation != null && !dropLocation.isInsert()
                    && dropLocation.getIndex() == index);

            if (!isDropLocation && (modelStateInfo != null)) {
                Map<ComponentState, StateContributionInfo> activeStates =
                        modelStateInfo.getStateContributionMap();
                RadianceColorScheme colorScheme = getColorSchemeForState(list, ui, currState);
                if (currState.isDisabled() || (activeStates == null)
                        || (activeStates.size() == 1)) {
                    super.setForeground(new ColorUIResource(colorScheme.getForegroundColor()));
                    this.rolloverArmAmount = 0.0f;
                } else {
                    float aggrRed = 0;
                    float aggrGreen = 0;
                    float aggrBlue = 0;

                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                            modelStateInfo.getStateContributionMap().entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        float contribution = activeEntry.getValue().getContribution();
                        if (activeState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ROLLOVER)
                                || activeState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ARM)) {
                            this.rolloverArmAmount = Math.max(this.rolloverArmAmount, contribution);
                            this.activeContributions.put(activeState, contribution);
                        }

                        RadianceColorScheme scheme = getColorSchemeForState(list, ui, activeState);
                        Color schemeFg = scheme.getForegroundColor();
                        aggrRed += schemeFg.getRed() * contribution;
                        aggrGreen += schemeFg.getGreen() * contribution;
                        aggrBlue += schemeFg.getBlue() * contribution;
                    }
                    super.setForeground(new ColorUIResource(
                            new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue)));
                }
            } else {
                RadianceColorScheme scheme = getColorSchemeForState(list, ui, currState);
                if (isDropLocation) {
                    scheme = RadianceColorSchemeUtilities.getColorScheme(list,
                            RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
                }
                boolean isActive = currState.isFacetActive(
                        RadianceThemingSlices.ComponentStateFacet.ROLLOVER) ||
                        currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.SELECTION) ||
                        currState.isFacetActive(RadianceThemingSlices.ComponentStateFacet.ARM);
                this.rolloverArmAmount = isActive ? 1.0f : 0.0f;
                this.activeContributions.put(currState, isActive ? 1.0f : 0.0f);
                super.setForeground(new ColorUIResource(scheme.getForegroundColor()));
            }
        } else {
            if (isSelected) {
                this.setForeground(list.getSelectionForeground());
            } else {
                this.setForeground(list.getForeground());
            }
        }

        if (RadianceCoreUtilities.isCurrentLookAndFeel()
                && (list.getLayoutOrientation() == JList.VERTICAL)) {
            RadianceStripingUtils.applyStripedBackground(list, index, this);
        }

        if (value instanceof Icon) {
            this.setIcon((Icon) value);
            this.setText("");
        } else {
            this.setIcon(null);
            this.setText((value == null) ? "" : value.toString());
        }

        this.setEnabled(list.isEnabled());
        this.setFont(list.getFont());

        Insets ins = RadianceSizeUtils.getListCellRendererInsets(list,
                RadianceSizeUtils.getComponentFontSize(list));
        this.setBorder(new EmptyBorder(ins.top, ins.left, ins.bottom, ins.right));

        this.setOpaque(false);
        return this;
    }

    @Override
    public Map<ComponentState, Float> getActiveContributions() {
        return this.activeContributions;
    }

    private RadianceColorScheme getColorSchemeForState(JList list, RadianceListUI ui,
            ComponentState state) {
        UpdateOptimizationInfo updateOptimizationInfo = ui.getUpdateOptimizationInfo();
        if (state == ComponentState.ENABLED) {
            if (updateOptimizationInfo == null) {
                return RadianceColorSchemeUtilities.getColorScheme(list, state);
            } else {
                return updateOptimizationInfo.getDefaultScheme();
            }
        } else {
            if (updateOptimizationInfo == null) {
                return RadianceColorSchemeUtilities.getColorScheme(list,
                        RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, state);
            } else {
                return updateOptimizationInfo.getHighlightColorScheme(state);
            }
        }
    }

    /**
     * UI resource for renderer (does nothing yet).
     *
     * @author Kirill Grouchnikov
     */
    public static class RadianceUIResource extends RadianceDefaultListCellRenderer
            implements javax.swing.plaf.UIResource {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
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
    public final void paintComponents(Graphics g) {
        super.paintComponents(g);
    }

    @Override
    protected final void paintBorder(Graphics g) {
        super.paintBorder(g);
    }
}
