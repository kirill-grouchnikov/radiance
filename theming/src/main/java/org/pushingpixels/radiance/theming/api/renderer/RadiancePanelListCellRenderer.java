/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.ui.RadianceListUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.UpdateOptimizationInfo;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ListUI;
import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Base class for list renderers that are more complex than what is provided by
 * {@link RadianceDefaultListCellRenderer}. Extend this class to have consistent
 * highlight visuals and animations under all Radiance skins. The flow of layout and
 * data is:
 *
 * <ul>
 * <li>In the constructor, add all sub-components to your renderer and define the
 * layout logic.</li>
 * <li>In {@link #bindData(JList, Object, int)} bind the relevant data fields to those
 * sub-components.</li>
 * <li>Use {@link #registerThemeAwareLabelsWithText(JLabel...)} in the constructor
 * to "mark" those sub-component labels that should participate in highlight animations
 * on their text based on the current state (rollover, selection, etc). In case a specific
 * label is using a fixed foreground / text color for some of the rows in your list, use
 * {@link #registerThemeAwareLabelsWithText(JLabel...)} and
 * {@link #unregisterThemeAwareLabelsWithText(JLabel...)} in
 * {@link #onPreRender(JList, Object, int)} instead of in the constructor.</li>
 * <li>Use {@link #registerThemeAwareLabelWithIcon(JLabel, RadianceIcon.Factory, Dimension)}
 * in the constructor to "mark" those sub-component labels that should participate in highlight
 * animations on their icons based on the current state (rollover, selection, etc). In case a
 * specific label is using a fixed icon for some of the rows in your list or different icon
 * sources for different rows, use
 * {@link #registerThemeAwareLabelWithIcon(JLabel, RadianceIcon.Factory, Dimension)} and
 * {@link #unregisterThemeAwareLabelWithIcon(JLabel)} in
 * {@link #onPreRender(JList, Object, int)} instead of in the constructor.</li>
 * </ul>
 *
 * Note that {@link #getListCellRendererComponent(JList, Object, int, boolean, boolean)} in this
 * class is marked as final and can not be overriden in the application code.
 *
 * @param <T> Data model class.
 */
@RadianceRenderer
public abstract class RadiancePanelListCellRenderer<T> extends JPanel
        implements ListCellRenderer<T> {
    private static class IconData {
        private RadianceIcon.Factory iconFactory;
        private Dimension iconSize;

        private IconData(RadianceIcon.Factory iconFactory, Dimension iconSize) {
            this.iconFactory = iconFactory;
            this.iconSize = iconSize;
        }
    }

    private Set<JLabel> themeAwareLabels;
    private Map<JLabel, IconData> themeAwareLabelsWithIcons;

    public RadiancePanelListCellRenderer() {
        RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
        this.themeAwareLabels = new HashSet<>();
        this.themeAwareLabelsWithIcons = new HashMap<>();
    }

    protected void registerThemeAwareLabelsWithText(JLabel... labels) {
        for (JLabel label : labels) {
            this.themeAwareLabels.add(label);
        }
    }

    protected void unregisterThemeAwareLabelsWithText(JLabel... labels) {
        for (JLabel label : labels) {
            this.themeAwareLabels.remove(label);
        }
    }

    protected void registerThemeAwareLabelWithIcon(JLabel label,
            RadianceIcon.Factory radianceIconFactory, Dimension iconDimension) {
        this.themeAwareLabelsWithIcons.put(label,
                new IconData(radianceIconFactory, iconDimension));
    }

    protected void unregisterThemeAwareLabelWithIcon(JLabel label) {
        this.themeAwareLabelsWithIcons.remove(label);
    }

    @Override
    public final Component getListCellRendererComponent(JList<? extends T> list, T value, int index,
            boolean isSelected, boolean cellHasFocus) {
        this.setComponentOrientation(list.getComponentOrientation());

        Color labelForeground;
        ListUI listUI = list.getUI();
        if (listUI instanceof RadianceListUI) {
            RadianceListUI ui = (RadianceListUI) listUI;

            StateTransitionTracker.ModelStateInfo modelStateInfo = ui.getModelStateInfo(index);
            ComponentState currState = ui.getCellState(index, this);

            // special case for drop location
            JList.DropLocation dropLocation = list.getDropLocation();
            boolean isDropLocation = (dropLocation != null && !dropLocation.isInsert()
                    && dropLocation.getIndex() == index);

            if (!isDropLocation && (modelStateInfo != null)) {
                Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                        modelStateInfo.getStateContributionMap();
                RadianceColorScheme colorScheme = getColorSchemeForState(list, ui, currState);
                if (currState.isDisabled() || (activeStates == null)
                        || (activeStates.size() == 1)) {
                    labelForeground = new ColorUIResource(colorScheme.getForegroundColor());
                } else {
                    float aggrRed = 0;
                    float aggrGreen = 0;
                    float aggrBlue = 0;

                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry : modelStateInfo
                            .getStateContributionMap().entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        float contribution = activeEntry.getValue().getContribution();
                        RadianceColorScheme scheme = getColorSchemeForState(list, ui, activeState);
                        Color schemeFg = scheme.getForegroundColor();
                        aggrRed += schemeFg.getRed() * contribution;
                        aggrGreen += schemeFg.getGreen() * contribution;
                        aggrBlue += schemeFg.getBlue() * contribution;
                    }
                    labelForeground = new ColorUIResource(
                            new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue));
                }
            } else {
                RadianceColorScheme scheme = getColorSchemeForState(list, ui, currState);
                if (isDropLocation) {
                    scheme = RadianceColorSchemeUtilities.getColorScheme(list,
                            RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
                }
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

        this.onPreRender(list, value, index);

        for (JLabel themeAwareLabel : this.themeAwareLabels) {
            themeAwareLabel.setForeground(labelForeground);
        }

        for (Map.Entry<JLabel, IconData> themeAwareLabelsWithIcons :
                this.themeAwareLabelsWithIcons.entrySet()) {
            JLabel label = themeAwareLabelsWithIcons.getKey();
            IconData iconData = themeAwareLabelsWithIcons.getValue();

            RadianceIcon icon = iconData.iconFactory.createNewIcon();
            icon.setColorFilter(color -> labelForeground);
            icon.setDimension(iconData.iconSize);

            label.setIcon(icon);
        }

        return this;
    }

    protected abstract void bindData(JList<? extends T> list, T value, int index);

    protected void onPreRender(JList<? extends T> list, T value, int index) {
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
}
