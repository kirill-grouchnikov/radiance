/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;
import org.pushingpixels.radiance.theming.internal.blade.BladeContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.ui.RadianceListUI;
import org.pushingpixels.radiance.theming.internal.utils.CoreColorTokenUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
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
                    mergeIntoMutableColorTokens(mutableContainerTokens,
                        getContainerTokensForState(list, ui, currState), 1.0f);
                    for (Map.Entry<ComponentState, StateTransitionTracker.StateContributionInfo> activeEntry :
                        modelStateInfo.getStateContributionMap().entrySet()) {
                        ComponentState activeState = activeEntry.getKey();
                        if (activeState == currState) {
                            continue;
                        }
                        float contribution = activeEntry.getValue().getContribution();
                        mergeIntoMutableColorTokens(mutableContainerTokens,
                            getContainerTokensForState(list, ui, activeState), contribution);
                    }

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
            colorTokensForRenderer = null;
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

    private static void mergeIntoMutableColorTokens(
        BladeContainerColorTokens bladeContainerTokens,
        ContainerColorTokens contributionColorTokens,
        float amount
    ) {
        // Update the mutable color tokens with the interpolated colors
        bladeContainerTokens.containerSurfaceLowest =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceLowest,
            contributionColorTokens.getContainerSurfaceLowest(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceLow =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceLow,
                contributionColorTokens.getContainerSurfaceLow(), 1.0f - amount);
        bladeContainerTokens.containerSurface =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurface,
                contributionColorTokens.getContainerSurface(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceHigh =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceHigh,
                contributionColorTokens.getContainerSurfaceHigh(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceHighest =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceHighest,
                contributionColorTokens.getContainerSurfaceHighest(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceDim =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceDim,
                contributionColorTokens.getContainerSurfaceDim(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceBright =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerSurfaceBright,
                contributionColorTokens.getContainerSurfaceBright(), 1.0f - amount);
        bladeContainerTokens.onContainer =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.onContainer,
                contributionColorTokens.getOnContainer(), 1.0f - amount);
        bladeContainerTokens.onContainerVariant =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.onContainerVariant,
                contributionColorTokens.getOnContainerVariant(), 1.0f - amount);
        bladeContainerTokens.containerOutline =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerOutline,
                contributionColorTokens.getContainerOutline(), 1.0f - amount);
        bladeContainerTokens.containerOutlineVariant =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.containerOutlineVariant,
                contributionColorTokens.getContainerOutlineVariant(), 1.0f - amount);
        bladeContainerTokens.containerSurfaceEnabledAlpha =
            (1.0f - amount) * bladeContainerTokens.containerSurfaceEnabledAlpha +
                amount * contributionColorTokens.getContainerSurfaceEnabledAlpha();
        bladeContainerTokens.onContainerEnabledAlpha =
            (1.0f - amount) * bladeContainerTokens.onContainerEnabledAlpha +
                amount * contributionColorTokens.getOnContainerEnabledAlpha();
        bladeContainerTokens.containerOutlineEnabledAlpha =
            (1.0f - amount) * bladeContainerTokens.containerOutlineEnabledAlpha +
                amount * contributionColorTokens.getContainerOutlineEnabledAlpha();
        bladeContainerTokens.containerSurfaceDisabledAlpha =
            (1.0f - amount) * bladeContainerTokens.containerSurfaceDisabledAlpha +
                amount * contributionColorTokens.getContainerSurfaceDisabledAlpha();
        bladeContainerTokens.onContainerDisabledAlpha =
            (1.0f - amount) * bladeContainerTokens.onContainerDisabledAlpha +
                amount * contributionColorTokens.getOnContainerDisabledAlpha();
        bladeContainerTokens.containerOutlineDisabledAlpha =
            (1.0f - amount) * bladeContainerTokens.containerOutlineDisabledAlpha +
                amount * contributionColorTokens.getContainerOutlineDisabledAlpha();
        bladeContainerTokens.inverseContainerSurface =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.inverseContainerSurface,
                contributionColorTokens.getInverseContainerSurface(), 1.0f - amount);
        bladeContainerTokens.inverseOnContainer =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.inverseOnContainer,
                contributionColorTokens.getInverseOnContainer(), 1.0f - amount);
        bladeContainerTokens.inverseContainerOutline =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.inverseContainerOutline,
                contributionColorTokens.getInverseContainerOutline(), 1.0f - amount);
        bladeContainerTokens.complementaryOnContainer =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.complementaryOnContainer,
                contributionColorTokens.getComplementaryOnContainer(), 1.0f - amount);
        bladeContainerTokens.complementaryContainerOutline =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.complementaryContainerOutline,
                contributionColorTokens.getComplementaryContainerOutline(), 1.0f - amount);
        bladeContainerTokens.accentOnContainer =
            RadianceColorUtilities.getInterpolatedColor(bladeContainerTokens.accentOnContainer,
                contributionColorTokens.getAccentOnContainer(), 1.0f - amount);

        bladeContainerTokens.combinedName = bladeContainerTokens.hashCode() + ", [" +
            contributionColorTokens.hashCode() + ":" + amount + "]";

        bladeContainerTokens.isDark = bladeContainerTokens.isDark() && contributionColorTokens.isDark();
    }
}
