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
package org.pushingpixels.radiance.laf.internal.utils;

import org.pushingpixels.radiance.laf.api.ComponentState;
import org.pushingpixels.radiance.laf.api.RadianceLafCortex;
import org.pushingpixels.radiance.laf.api.RadianceSkin;
import org.pushingpixels.radiance.laf.api.RadianceLafSlices;
import org.pushingpixels.radiance.laf.api.colorscheme.RadianceColorScheme;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class UpdateOptimizationInfo {
    private JComponent component;

    private Map<ComponentState, RadianceColorScheme> highlightSchemeMap;

    private Map<ComponentState, RadianceColorScheme> highlightBorderSchemeMap;

    private Map<ComponentState, RadianceColorScheme> borderSchemeMap;

    private Map<ComponentState, RadianceColorScheme> fillSchemeMap;

    private Map<ComponentState, Float> highlightAlphaMap;

    private RadianceColorScheme defaultScheme;

    public RadianceLafSlices.DecorationAreaType decorationAreaType;

    public boolean isInDecorationArea;

    public UpdateOptimizationInfo(JComponent component) {
        this.component = component;

        this.defaultScheme = RadianceColorSchemeUtilities.getColorScheme(
                this.component, ComponentState.ENABLED);
        this.decorationAreaType = RadianceLafCortex.ComponentOrParentChainScope.getDecorationType(this.component);

        RadianceSkin skin = RadianceCoreUtilities.getSkin(this.component);
        this.isInDecorationArea = (this.decorationAreaType != null)
                && skin.isRegisteredAsDecorationArea(this.decorationAreaType)
                && RadianceCoreUtilities.isOpaque(this.component);
    }

    public RadianceColorScheme getHighlightColorScheme(ComponentState state) {
        if (this.highlightSchemeMap == null) {
            this.highlightSchemeMap = new HashMap<>();
        }
        RadianceColorScheme result = this.highlightSchemeMap.get(state);
        if (result == null) {
            result = RadianceColorSchemeUtilities.getColorScheme(this.component,
                    RadianceLafSlices.ColorSchemeAssociationKind.HIGHLIGHT, state);
            this.highlightSchemeMap.put(state, result);
        }
        return result;
    }

    public RadianceColorScheme getBorderColorScheme(ComponentState state) {
        if (this.borderSchemeMap == null) {
            this.borderSchemeMap = new HashMap<>();
        }
        RadianceColorScheme result = this.borderSchemeMap.get(state);
        if (result == null) {
            result = RadianceColorSchemeUtilities.getColorScheme(
                    this.component, RadianceLafSlices.ColorSchemeAssociationKind.BORDER, state);
            this.borderSchemeMap.put(state, result);
        }
        return result;
    }

    public RadianceColorScheme getFillColorScheme(ComponentState state) {
        if (state == ComponentState.ENABLED) {
            return this.defaultScheme;
        }
        if (this.fillSchemeMap == null) {
            this.fillSchemeMap = new HashMap<>();
        }
        RadianceColorScheme result = this.fillSchemeMap.get(state);
        if (result == null) {
            result = RadianceColorSchemeUtilities.getColorScheme(
                    this.component, state);
            this.fillSchemeMap.put(state, result);
        }
        return result;
    }

    public RadianceColorScheme getHighlightBorderColorScheme(
            ComponentState state) {
        if (this.highlightBorderSchemeMap == null) {
            this.highlightBorderSchemeMap = new HashMap<>();
        }
        RadianceColorScheme result = this.highlightBorderSchemeMap.get(state);
        if (result == null) {
            result = RadianceColorSchemeUtilities.getColorScheme(
                    this.component,
                    RadianceLafSlices.ColorSchemeAssociationKind.HIGHLIGHT_BORDER, state);
            this.highlightBorderSchemeMap.put(state, result);
        }
        return result;
    }

    public float getHighlightAlpha(ComponentState state) {
        if (this.highlightAlphaMap == null) {
            this.highlightAlphaMap = new HashMap<>();
        }
        if (!this.highlightAlphaMap.containsKey(state)) {
            this.highlightAlphaMap.put(state, RadianceColorSchemeUtilities
                    .getHighlightAlpha(this.component, state));
        }
        return this.highlightAlphaMap.get(state);
    }

    public RadianceColorScheme getDefaultScheme() {
        return this.defaultScheme;
    }
}
