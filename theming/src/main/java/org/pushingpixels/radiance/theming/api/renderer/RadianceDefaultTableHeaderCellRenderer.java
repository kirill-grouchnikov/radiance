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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.ui.RadianceTableHeaderUI;
import org.pushingpixels.radiance.theming.internal.ui.RadianceTableUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceImageCreator;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.TableHeaderUI;
import javax.swing.plaf.TableUI;
import javax.swing.plaf.UIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.Map;

/**
 * Default renderer for table header cells.
 *
 * @author Kirill Grouchnikov
 */
@RadianceRenderer
public class RadianceDefaultTableHeaderCellRenderer extends
        DefaultTableCellRenderer implements UIResource {
    /**
     * Creates a new cell renderer.
     */
    public RadianceDefaultTableHeaderCellRenderer() {
        setHorizontalAlignment(JLabel.CENTER);
        RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (table == null) {
            setBorder(DefaultTableCellRenderer.noFocusBorder);
            setValue(value);
            setOpaque(false);
            return this;
        }

        if (table.getTableHeader() == null) {
            return super.getTableCellRendererComponent(table, value,
                    isSelected, hasFocus, row, column);
        }

        JTableHeader tableHeader = table.getTableHeader();
        TableHeaderUI tableHeaderUI = tableHeader.getUI();
        if (RadianceCoreUtilities.isCurrentLookAndFeel()
                && (tableHeaderUI instanceof RadianceTableHeaderUI)) {
            RadianceTableHeaderUI ui = (RadianceTableHeaderUI) tableHeaderUI;

            StateTransitionTracker.ModelStateInfo modelStateInfo = ui
                    .getModelStateInfo(column);
            ComponentState currState = ui.getColumnState(column);

            if (modelStateInfo != null) {
                Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates = modelStateInfo
                        .getStateContributionMap();
                RadianceColorScheme colorScheme = getColorSchemeForState(tableHeader, currState);
                if (currState.isDisabled() || (activeStates == null)
                        || (activeStates.size() == 1)) {
                    super.setForeground(new ColorUIResource(colorScheme.getForegroundColor()));
                } else {
                    float aggrRed = 0;
                    float aggrGreen = 0;
                    float aggrBlue = 0;

                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                            modelStateInfo.getStateContributionMap().entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        RadianceColorScheme scheme = getColorSchemeForState(
                                tableHeader, activeState);
                        Color schemeFg = scheme.getForegroundColor();
                        float contribution = activeEntry.getValue().getContribution();
                        aggrRed += schemeFg.getRed() * contribution;
                        aggrGreen += schemeFg.getGreen() * contribution;
                        aggrBlue += schemeFg.getBlue() * contribution;
                    }
                    super.setForeground(new ColorUIResource(new Color(
                            (int) aggrRed, (int) aggrGreen, (int) aggrBlue)));
                }
            } else {
                RadianceColorScheme scheme = getColorSchemeForState(tableHeader, currState);
                super.setForeground(new ColorUIResource(scheme.getForegroundColor()));
            }
        } else {
            super.setForeground(table.getForeground());
        }

        this.setBackground(tableHeader.getBackground());

        // fix for issue 319 - using font from the table header
        if (tableHeader.getFont() != null) {
            setFont(tableHeader.getFont());
        } else {
            setFont(table.getFont());
        }

        TableUI tableUI = table.getUI();
        if (RadianceCoreUtilities.isCurrentLookAndFeel()
                && (tableUI instanceof RadianceTableUI)) {
            this.setBorder(new EmptyBorder(((RadianceTableUI) tableUI).getCellRendererInsets()));
        }

        this.setValue(value);
        this.setOpaque(false);

        this.setEnabled(tableHeader.isEnabled() && table.isEnabled());

        // fix for defect 242 - not showing sort icon
        if (RadianceCoreUtilities.isCurrentLookAndFeel()) {
            this.setIcon(null);
            RowSorter<? extends TableModel> rowSorter = table.getRowSorter();
            if (rowSorter != null) {
                setHorizontalTextPosition(JLabel.LEADING);
                java.util.List<? extends RowSorter.SortKey> sortKeys = rowSorter.getSortKeys();
                Icon sortIcon = null;
                RadianceColorScheme scheme = null;
                if (tableHeaderUI instanceof RadianceTableHeaderUI) {
                    RadianceTableHeaderUI ui = (RadianceTableHeaderUI) tableHeaderUI;
                    ComponentState state = ui.getColumnState(column);
                    RadianceThemingSlices.ColorSchemeAssociationKind colorSchemeAssociationKind =
                            (state == ComponentState.ENABLED) ? RadianceThemingSlices.ColorSchemeAssociationKind.MARK
                                    : RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT_MARK;
                    scheme = RadianceColorSchemeUtilities.getColorScheme(
                            tableHeader, colorSchemeAssociationKind, state);
                } else {
                    scheme = RadianceColorSchemeUtilities.getColorScheme(
                            tableHeader, ComponentState.ENABLED);
                }

                if (sortKeys.size() > 0
                        && (sortKeys.get(0).getColumn() ==
                        table.convertColumnIndexToModel(column))) {
                    double scale = RadianceCommonCortex.getScaleFactor(table);
                    switch (sortKeys.get(0).getSortOrder()) {
                        case ASCENDING:
                            sortIcon = RadianceImageCreator.getArrowIcon(scale,
                                    RadianceSizeUtils.getComponentFontSize(tableHeader),
                                    SwingConstants.NORTH, scheme);
                            break;
                        case DESCENDING:
                            sortIcon = RadianceImageCreator.getArrowIcon(scale,
                                    RadianceSizeUtils.getComponentFontSize(tableHeader),
                                    SwingConstants.SOUTH, scheme);
                            break;
                        case UNSORTED:
                            sortIcon = null;
                    }
                    this.setIcon(sortIcon);
                }
            }
        }

        return this;
    }

    private RadianceColorScheme getColorSchemeForState(
            JTableHeader tableHeader, ComponentState activeState) {
        RadianceColorScheme scheme = (activeState == ComponentState.ENABLED)
                ? RadianceColorSchemeUtilities.getColorScheme(tableHeader, activeState)
                : RadianceColorSchemeUtilities.getColorScheme(tableHeader,
                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, activeState);
        return scheme;
    }

    @Override
    public final void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    protected final void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
