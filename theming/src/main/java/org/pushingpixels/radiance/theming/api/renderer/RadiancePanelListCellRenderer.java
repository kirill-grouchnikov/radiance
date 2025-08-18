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
import org.pushingpixels.radiance.theming.internal.ui.RadianceListUI;
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;
import org.pushingpixels.radiance.theming.internal.utils.UpdateOptimizationInfo;

import javax.swing.*;
import javax.swing.plaf.ListUI;
import java.awt.*;
import java.util.Map;

/**
 * Base class for list renderers that are more complex than what is provided by
 * {@link RadianceDefaultListCellRenderer}. Extend this class to have consistent
 * highlight visuals and animations under all Radiance skins.
 *
 * The abstract {@link #bindRenderer(JList, Object, int, ContainerColorTokens)} will be called
 * during the drawing phase, passing the color tokens that match the current list item state.
 * In your implementation of this method, bind the data (text, icon, etc), as well as colors.
 *
 * Note that {@link #getListCellRendererComponent(JList, Object, int, boolean, boolean)} in this
 * class is marked as final and can not be overriden in the application code.
 *
 * @param <T> Data model class.
 */
@RadianceRenderer
public abstract class RadiancePanelListCellRenderer<T> extends JPanel
        implements ListCellRenderer<T> {
    private BladeContainerColorTokens mutableContainerTokens = new BladeContainerColorTokens();

    public RadiancePanelListCellRenderer() {
        RadianceThemingCortex.ComponentOrParentChainScope.setColorizationFactor(this, 1.0);
    }

    @Override
    public final Component getListCellRendererComponent(JList<? extends T> list, T value, int index,
            boolean isSelected, boolean cellHasFocus) {
        this.setComponentOrientation(list.getComponentOrientation());

        ContainerColorTokens colorTokensForRenderer;
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
                if (currState.isDisabled() || (activeStates == null)
                        || (activeStates.size() == 1)) {
                    colorTokensForRenderer = getContainerTokensForState(list, ui, currState);
                } else {
                    BladeUtils.populateColorTokens(
                        mutableContainerTokens, list, modelStateInfo, currState,
                        RadianceThemingSlices.ContainerColorTokensAssociationKind.DEFAULT,
                        false, false, CoreColorTokenUtils.ContainerType.NEUTRAL);
                    colorTokensForRenderer = mutableContainerTokens;
                }
            } else {
                colorTokensForRenderer = getContainerTokensForState(list, ui, currState);
                if (isDropLocation) {
                    colorTokensForRenderer = CoreColorTokenUtils.getContainerTokens(list,
                        RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT,
                        currState, CoreColorTokenUtils.ContainerType.NEUTRAL);
                }
            }
        } else {
            colorTokensForRenderer = CoreColorTokenUtils.getContainerTokens(list,
                isSelected ? ComponentState.SELECTED : ComponentState.ENABLED,
                CoreColorTokenUtils.ContainerType.NEUTRAL);
        }

        this.setEnabled(list.isEnabled());
        this.setFont(list.getFont());

        this.bindRenderer(list, value, index, colorTokensForRenderer);

        return this;
    }

    protected abstract void bindRenderer(JList<? extends T> list, T value, int index,
        ContainerColorTokens colorTokens);

    private ContainerColorTokens getContainerTokensForState(JList list, RadianceListUI ui,
        ComponentState state) {
        UpdateOptimizationInfo updateOptimizationInfo = ui.getUpdateOptimizationInfo();
        if (state == ComponentState.ENABLED) {
            if (updateOptimizationInfo == null) {
                return CoreColorTokenUtils.getContainerTokens(list, state,
                    CoreColorTokenUtils.ContainerType.NEUTRAL);
            } else {
                return updateOptimizationInfo.getDefaultColorTokens();
            }
        } else {
            if (updateOptimizationInfo == null) {
                return CoreColorTokenUtils.getContainerTokens(list,
                    RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT, state,
                    CoreColorTokenUtils.ContainerType.NEUTRAL);
            } else {
                return updateOptimizationInfo.getHighlightColorTokens(state);
            }
        }
    }
}
