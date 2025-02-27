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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class UpdateOptimizationInfo {
    private JComponent component;

    private Map<ComponentState, ContainerColorTokens> highlightContainerTokens;

    private ContainerColorTokens defaultColorTokens;

    public RadianceThemingSlices.DecorationAreaType decorationAreaType;

    public boolean isInDecorationArea;

    public UpdateOptimizationInfo(JComponent component,
        RadianceThemingSlices.ContainerType inactiveContainerType) {
        this.component = component;

        RadianceSkin skin = RadianceCoreUtilities.getSkin(component);
        this.defaultColorTokens = RadianceColorSchemeUtilities.getContainerTokens(this.component,
            ComponentState.ENABLED, inactiveContainerType);
        this.decorationAreaType = RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(
            this.component);

        this.isInDecorationArea = (this.decorationAreaType != null)
                && skin.isRegisteredAsDecorationArea(this.decorationAreaType)
                && RadianceCoreUtilities.isOpaque(this.component);
    }

    public ContainerColorTokens getHighlightColorTokens(ComponentState state) {
        if (this.highlightContainerTokens == null) {
            this.highlightContainerTokens = new HashMap<>();
        }
        ContainerColorTokens result = this.highlightContainerTokens.get(state);
        if (result == null) {
            result = RadianceColorSchemeUtilities.getContainerTokens(this.component,
                RadianceThemingSlices.ContainerColorTokensAssociationKind.HIGHLIGHT, state,
                RadianceThemingSlices.ContainerType.NEUTRAL);
            this.highlightContainerTokens.put(state, result);
        }
        return result;
    }

    public float getHighlightAlpha(ComponentState state) {
        if ((state == ComponentState.ENABLED) || (state == ComponentState.DISABLED_UNSELECTED)) {
            return 0.0f;
        }
        return 1.0f;
    }

    public ContainerColorTokens getDefaultColorTokens() {
        return this.defaultColorTokens;
    }
}
