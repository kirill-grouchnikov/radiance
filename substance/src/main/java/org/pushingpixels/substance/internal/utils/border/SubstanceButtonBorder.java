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
package org.pushingpixels.substance.internal.utils.border;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.border.Border;
import javax.swing.plaf.UIResource;

/**
 * Base class for button borders in <b>Substance </b> look-and-feel. This class
 * is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public abstract class SubstanceButtonBorder implements Border, UIResource {
	/**
	 * The associated button shaper class.
	 */
	private Class<?> buttonShaperClass;

	/**
	 * Simple constructor.
	 * 
	 * @param buttonShaperClass
	 *            The associated button shaper class.
	 */
	public SubstanceButtonBorder(Class<?> buttonShaperClass) {
		this.buttonShaperClass = buttonShaperClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.border.Border#isBorderOpaque()
	 */
	public boolean isBorderOpaque() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.border.Border#paintBorder(java.awt.Component,
	 * java.awt.Graphics, int, int, int, int)
	 */
	public void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height) {
	}

	/**
	 * Returns the associated button shaper class.
	 * 
	 * @return The associated button shaper class.
	 */
	public Class<?> getButtonShaperClass() {
		return this.buttonShaperClass;
	}
}
