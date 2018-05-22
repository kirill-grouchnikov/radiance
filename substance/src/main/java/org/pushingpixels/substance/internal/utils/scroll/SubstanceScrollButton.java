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
package org.pushingpixels.substance.internal.utils.scroll;

import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.plaf.UIResource;

import org.pushingpixels.substance.api.SubstanceSlices.AnimationFacet;
import org.pushingpixels.substance.internal.AnimationConfigurationManager;
import org.pushingpixels.substance.internal.utils.SubstanceInternalArrowButton;
import org.pushingpixels.substance.internal.utils.SubstanceInternalButton;

/**
 * Scroll bar button in <b>Substance</b> look and feel.
 * 
 * @author Kirill Grouchnikov
 */
@SubstanceInternalButton
@SubstanceInternalArrowButton
public class SubstanceScrollButton extends JButton implements UIResource {
	static {
		AnimationConfigurationManager.getInstance().disallowAnimations(
				AnimationFacet.GHOSTING_BUTTON_PRESS,
				SubstanceScrollButton.class);
		AnimationConfigurationManager.getInstance().disallowAnimations(
				AnimationFacet.GHOSTING_ICON_ROLLOVER,
				SubstanceScrollButton.class);
	}

	/**
	 * Simple constructor.
	 * 
	 * @param scrollBarIcon
	 *            The icon.
	 * @param orientation
	 *            The button icon arrow orientation.
	 */
	public SubstanceScrollButton(int orientation) {
		super();
		this.setRequestFocusEnabled(false);
		this.setIconTextGap(0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Component#isFocusable()
	 */
	@Override
	public boolean isFocusable() {
		return false;
	}

	@Override
	public Insets getInsets() {
		return new Insets(0, 0, 0, 0);
	}
	
	@Override
	public Insets getInsets(Insets insets) {
        if (insets == null) {
            insets = new Insets(0, 0, 0, 0);
        } else {
        	insets.set(0, 0, 0, 0);
        }
		return insets;
	}
}
