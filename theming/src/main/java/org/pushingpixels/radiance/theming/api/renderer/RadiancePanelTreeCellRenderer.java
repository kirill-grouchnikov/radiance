/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.blade.BladeUtils;
import org.pushingpixels.radiance.theming.internal.ui.RadianceTreeUI;
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;

import javax.swing.*;
import javax.swing.plaf.TreeUI;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;
import java.util.Map;

/**
 * Base class for tree renderers that are more complex than what is provided by
 * {@link RadianceDefaultTreeCellRenderer}. Extend this class to have consistent
 * highlight visuals and animations under all Radiance skins. The flow of layout and
 * data is:
 *
 * The abstract {@link #bindRenderer(JTree, Object, int, ContainerColorTokens)} will be called
 * during the drawing phase, passing the color tokens that match the current tree row state.
 * In your implementation of this method, bind the data (text, icon, etc), as well as colors.
 *
 * Note that {@link #getTreeCellRendererComponent(JTree, Object, boolean, boolean, boolean, int, boolean)}
 * in this class is marked as final and can not be overriden in the application code.
 */
@RadianceRenderer
public abstract class RadiancePanelTreeCellRenderer extends JPanel
        implements TreeCellRenderer {
    private BladeContainerColorTokens mutableContainerTokens = new BladeContainerColorTokens();

    public RadiancePanelTreeCellRenderer() {
        RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
    }

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        this.setComponentOrientation(tree.getComponentOrientation());

        ContainerColorTokens colorTokensForRenderer;
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
                if (currState.isDisabled() || (activeStates == null) || (activeStates.size() == 1)) {
                    colorTokensForRenderer = getContainerTokensForState(tree, ui, currState);
                } else {
                    BladeUtils.populateColorTokens(
                        mutableContainerTokens, tree, modelStateInfo, currState,
                        RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT,
                        false, false, CoreColorTokenUtils.ContainerType.NEUTRAL);
                    colorTokensForRenderer = mutableContainerTokens;
                }
            } else {
                colorTokensForRenderer = getContainerTokensForState(tree, ui, currState);
                if (isDropLocation) {
                    colorTokensForRenderer = CoreColorTokenUtils.getContainerTokens(tree,
                        RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                        currState, CoreColorTokenUtils.ContainerType.NEUTRAL);
                }
            }
        } else {
            colorTokensForRenderer = CoreColorTokenUtils.getContainerTokens(tree,
                selected ? ComponentState.SELECTED : ComponentState.ENABLED,
                CoreColorTokenUtils.ContainerType.NEUTRAL);
        }

        this.setEnabled(tree.isEnabled());
        this.setFont(tree.getFont());

        this.bindRenderer(tree, value, row, colorTokensForRenderer);

        return this;
    }

    protected abstract void bindRenderer(JTree tree, Object value, int row,
        ContainerColorTokens colorTokens);

    private ContainerColorTokens getContainerTokensForState(JTree tree, RadianceTreeUI ui,
        ComponentState activeState) {
        ContainerColorTokens colorTokens = (activeState == ComponentState.ENABLED)
            ? ui.getDefaultColorTokens()
            : CoreColorTokenUtils.getContainerTokens(tree,
            RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT, activeState,
            CoreColorTokenUtils.ContainerType.NEUTRAL);
        if (colorTokens == null) {
            colorTokens = CoreColorTokenUtils.getContainerTokens(tree,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT, activeState,
                CoreColorTokenUtils.ContainerType.NEUTRAL);
        }
        return colorTokens;
    }
}
