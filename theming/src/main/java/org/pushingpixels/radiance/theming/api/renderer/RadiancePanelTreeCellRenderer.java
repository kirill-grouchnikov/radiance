/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.internal.ui.RadianceTreeUI;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.TreeUI;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Base class for tree renderers that are more complex than what is provided by
 * {@link RadianceDefaultTreeCellRenderer}. Extend this class to have consistent
 * highlight visuals and animations under all Radiance skins. The flow of layout and
 * data is:
 *
 * <ul>
 * <li>In the constructor, add all sub-components to your renderer and define the
 * layout logic.</li>
 * <li>In {@link #bindData(JTree, Object, int)} bind the relevant data fields to those
 * sub-components.</li>
 * <li>Use {@link #registerThemeAwareLabelsWithText(JLabel...)} in the constructor
 * to "mark" those sub-component labels that should participate in highlight animations
 * on their text based on the current state (rollover, selection, etc). In case a specific
 * label is using a fixed foreground / text color for some of the rows in your tree, use
 * {@link #registerThemeAwareLabelsWithText(JLabel...)} and
 * {@link #unregisterThemeAwareLabelsWithText(JLabel...)} in
 * {@link #onPreRender(JTree, Object, int)} instead of in the constructor.</li>
 * <li>Use {@link #registerThemeAwareLabelWithIcon(JLabel, RadianceIcon.Factory, Dimension)}
 * in the constructor to "mark" those sub-component labels that should participate in highlight
 * animations on their icons based on the current state (rollover, selection, etc). In case a
 * specific label is using a fixed icon for some of the rows in your tree or different icon
 * sources for different rows, use
 * {@link #registerThemeAwareLabelWithIcon(JLabel, RadianceIcon.Factory, Dimension)} and
 * {@link #unregisterThemeAwareLabelWithIcon(JLabel)} in
 * {@link #onPreRender(JTree, Object, int)} instead of in the constructor.</li>
 * </ul>
 * <p>
 * Note that {@link #getTreeCellRendererComponent(JTree, Object, boolean, boolean, boolean, int, boolean)}
 * in this class is marked as final and can not be overriden in the application code.
 */
@RadianceRenderer
public abstract class RadiancePanelTreeCellRenderer extends JPanel
        implements TreeCellRenderer {
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

    public RadiancePanelTreeCellRenderer() {
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
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        this.setComponentOrientation(tree.getComponentOrientation());

        Color labelForeground;
        TreeUI treeUI = tree.getUI();
        if (treeUI instanceof RadianceTreeUI) {
            RadianceTreeUI ui = (RadianceTreeUI) treeUI;

            RadianceTreeUI.TreePathId pathId = new RadianceTreeUI.TreePathId(tree.getPathForRow(row));

            StateTransitionTracker.ModelStateInfo modelStateInfo = ui.getModelStateInfo(pathId);
            ComponentState currState = ui.getPathState(pathId);

            // special case for drop location
            JTree.DropLocation dropLocation = tree.getDropLocation();
            boolean isDropLocation = (dropLocation != null)
                    && (dropLocation.getChildIndex() == -1)
                    && (tree.getRowForPath(dropLocation.getPath()) == row);

            if (!isDropLocation && (modelStateInfo != null)) {
                Map<ComponentState, StateTransitionTracker.StateContributionInfo> activeStates =
                        modelStateInfo.getStateContributionMap();
                RadianceColorScheme colorScheme = getColorSchemeForState(tree, ui, currState);
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
                        RadianceColorScheme scheme = getColorSchemeForState(tree, ui, activeState);
                        Color schemeFg = scheme.getForegroundColor();
                        aggrRed += schemeFg.getRed() * contribution;
                        aggrGreen += schemeFg.getGreen() * contribution;
                        aggrBlue += schemeFg.getBlue() * contribution;
                    }
                    labelForeground = new ColorUIResource(
                            new Color((int) aggrRed, (int) aggrGreen, (int) aggrBlue));
                }
            } else {
                RadianceColorScheme scheme = getColorSchemeForState(tree, ui, currState);
                if (isDropLocation) {
                    scheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                            RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, currState);
                }
                labelForeground = new ColorUIResource(scheme.getForegroundColor());
            }
        } else {
            if (selected) {
                labelForeground = UIManager.getColor("Tree.selectionForeground");
            } else {
                labelForeground = UIManager.getColor("Tree.textForeground");
            }
        }

        this.setEnabled(tree.isEnabled());
        this.setFont(tree.getFont());

        this.bindData(tree, value, row);

        this.onPreRender(tree, value, row);

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

    protected abstract void bindData(JTree tree, Object value, int row);

    protected void onPreRender(JTree tree, Object value, int row) {
    }

    private RadianceColorScheme getColorSchemeForState(JTree tree, RadianceTreeUI ui,
            ComponentState activeState) {
        RadianceColorScheme scheme = (activeState == ComponentState.ENABLED)
                ? ui.getDefaultColorScheme()
                : RadianceColorSchemeUtilities.getColorScheme(tree,
                RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, activeState);
        if (scheme == null) {
            scheme = RadianceColorSchemeUtilities.getColorScheme(tree,
                    RadianceThemingSlices.ColorSchemeAssociationKind.HIGHLIGHT, activeState);
        }
        return scheme;
    }
}
