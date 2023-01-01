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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.AnimationConfigurationManager;

import javax.accessibility.AccessibleContext;
import javax.swing.*;

/**
 * Title button in <b>Radiance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
@RadianceInternalButton
public class RadianceTitleButton extends JButton {
	static {
		AnimationConfigurationManager.getInstance().disallowAnimations(
				RadianceThemingSlices.AnimationFacet.GHOSTING_BUTTON_PRESS,
				RadianceTitleButton.class);
		AnimationConfigurationManager.getInstance().disallowAnimations(
				RadianceThemingSlices.AnimationFacet.GHOSTING_ICON_ROLLOVER,
				RadianceTitleButton.class);
	}

	private String uiKey;

	public RadianceTitleButton(String uiKey) {
		this.uiKey = uiKey;
		this.setOpaque(false);
	}

	@Override
	public boolean isOpaque() {
		return false;
	}

	public RadianceTitleButton() {
		this("");
	}

	@Override
	public boolean isFocusable() {
		return false;
	}

	@Override
	public void requestFocus() {
	}

	@Override
	public AccessibleContext getAccessibleContext() {
		AccessibleContext ac = super.getAccessibleContext();
		if (uiKey != null) {
			ac.setAccessibleName(UIManager.getString(uiKey));
			uiKey = null;
		}
		return ac;
	}
}
