/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.internal.utils;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JComponent;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

public class UpdateOptimizationInfo {
	private JComponent component;

	public boolean toDrawWatermark;

	private Map<ComponentState, SubstanceColorScheme> highlightSchemeMap;

	private Map<ComponentState, SubstanceColorScheme> highlightBorderSchemeMap;

	private Map<ComponentState, SubstanceColorScheme> borderSchemeMap;

	private Map<ComponentState, SubstanceColorScheme> fillSchemeMap;

	private Map<ComponentState, Float> highlightAlphaMap;

	private SubstanceColorScheme defaultScheme;

	public DecorationAreaType decorationAreaType;

	public boolean isInDecorationArea;

	public UpdateOptimizationInfo(JComponent component) {
		this.component = component;

		this.toDrawWatermark = SubstanceCoreUtilities
				.toDrawWatermark(this.component);
		this.defaultScheme = SubstanceColorSchemeUtilities.getColorScheme(
				this.component, ComponentState.ENABLED);
		this.decorationAreaType = ComponentOrParentChainScope
				.getDecorationType(this.component);

		SubstanceSkin skin = SubstanceCoreUtilities.getSkin(this.component);
		this.isInDecorationArea = (this.decorationAreaType != null)
				&& skin.isRegisteredAsDecorationArea(this.decorationAreaType)
				&& SubstanceCoreUtilities.isOpaque(this.component);
	}

	public SubstanceColorScheme getHighlightColorScheme(ComponentState state) {
		if (this.highlightSchemeMap == null) {
			this.highlightSchemeMap = new HashMap<ComponentState, SubstanceColorScheme>();
					//ComponentState.class);
		}
		SubstanceColorScheme result = this.highlightSchemeMap.get(state);
		if (result == null) {
			result = SubstanceColorSchemeUtilities
					.getColorScheme(this.component,
							ColorSchemeAssociationKind.HIGHLIGHT_TEXT, state);
			this.highlightSchemeMap.put(state, result);
		}
		return result;
	}

	public SubstanceColorScheme getBorderColorScheme(ComponentState state) {
		if (this.borderSchemeMap == null) {
			this.borderSchemeMap = new HashMap<ComponentState, SubstanceColorScheme>();
					//ComponentState.class);
		}
		SubstanceColorScheme result = this.borderSchemeMap.get(state);
		if (result == null) {
			result = SubstanceColorSchemeUtilities.getColorScheme(
					this.component, ColorSchemeAssociationKind.BORDER, state);
			this.borderSchemeMap.put(state, result);
		}
		return result;
	}

	public SubstanceColorScheme getFillColorScheme(ComponentState state) {
		if (state == ComponentState.ENABLED) {
			return this.defaultScheme;
		}
		if (this.fillSchemeMap == null) {
			this.fillSchemeMap = new HashMap<ComponentState, SubstanceColorScheme>();
					//ComponentState.class);
		}
		SubstanceColorScheme result = this.fillSchemeMap.get(state);
		if (result == null) {
			result = SubstanceColorSchemeUtilities.getColorScheme(
					this.component, state);
			this.fillSchemeMap.put(state, result);
		}
		return result;
	}

	public SubstanceColorScheme getHighlightBorderColorScheme(
			ComponentState state) {
		if (this.highlightBorderSchemeMap == null) {
			this.highlightBorderSchemeMap = new HashMap<ComponentState, SubstanceColorScheme>();
					//ComponentState.class);
		}
		SubstanceColorScheme result = this.highlightBorderSchemeMap.get(state);
		if (result == null) {
			result = SubstanceColorSchemeUtilities.getColorScheme(
					this.component,
					ColorSchemeAssociationKind.HIGHLIGHT_BORDER, state);
			this.highlightBorderSchemeMap.put(state, result);
		}
		return result;
	}

	public float getHighlightAlpha(ComponentState state) {
		if (this.highlightAlphaMap == null) {
			this.highlightAlphaMap = new HashMap<ComponentState, Float>();
					//ComponentState.class);
		}
		if (!this.highlightAlphaMap.containsKey(state)) {
			this.highlightAlphaMap.put(state, SubstanceColorSchemeUtilities
					.getHighlightAlpha(this.component, state));
		}
		return this.highlightAlphaMap.get(state);
	}

	public SubstanceColorScheme getDefaultScheme() {
		return this.defaultScheme;
	}
}
