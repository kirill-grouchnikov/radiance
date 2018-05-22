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
package org.pushingpixels.substance.api.shaper;

import java.awt.Dimension;
import java.awt.Shape;

import javax.swing.AbstractButton;
import javax.swing.border.Border;

import org.pushingpixels.substance.api.trait.SubstanceTrait;

/**
 * Button shaper interface for <b>Substance</b> look and feel. This class is
 * part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public interface SubstanceButtonShaper extends SubstanceTrait {
	/**
	 * Returns the outline path for the specified button.
	 * 
	 * @param button
	 *            A button.
	 * @param extraInsets
	 *            Button insets.
	 * @param width
	 *            Button width.
	 * @param height
	 *            Button height.
	 * @param isInner
	 *            Indication whether the returned outline is used for the inner
	 *            contour.
	 * @return The outline path for the specified button.
	 */
	public Shape getButtonOutline(AbstractButton button, float extraInsets,
			float width, float height, boolean isInner);

	/**
	 * Returns the border for the specified button.
	 * 
	 * @param button
	 *            A button.
	 * @return The border for the specified button.
	 */
	public Border getButtonBorder(AbstractButton button);

	/**
	 * Returns the preferred size for the specified button.
	 * 
	 * @param button
	 *            A button.
	 * @param uiPreferredSize
	 *            Preferred size of the button under the regular conditions
	 *            (plain rectangular button).
	 * @return The preferred size for the specified button.
	 */
	public Dimension getPreferredSize(AbstractButton button,
			Dimension uiPreferredSize);

	/**
	 * Returns the boolean indication whether the shaper should maintain button
	 * proportions on the resize. This may be relevant for vector-based shapers
	 * (such as animals / other objects).
	 * 
	 * @return <code>true</code> if <code>this</code> shaper should maintain
	 *         button proportions on the resize, <code>false</code> otherwise.
	 * 
	 */
	public boolean isProportionate();
}
