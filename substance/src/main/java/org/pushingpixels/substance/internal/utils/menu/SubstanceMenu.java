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
package org.pushingpixels.substance.internal.utils.menu;

import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JMenuItem;

/**
 * Base interface for all menu-related UI delegates.
 * 
 * @author Kirill Grouchnikov
 */
public interface SubstanceMenu {
	/**
	 * Returns the font of the accelerator string of <code>this</code> UI
	 * delegate.
	 * 
	 * @return The font of the accelerator string of <code>this</code> UI
	 *         delegate.
	 */
	public Font getAcceleratorFont();

	/**
	 * Returns the checkmark icon of <code>this</code> UI delegate.
	 * 
	 * @return The checkmark icon of <code>this</code> UI delegate.
	 */
	public Icon getCheckIcon();

	/**
	 * Returns the arrow icon of <code>this</code> UI delegate.
	 * 
	 * @return The arrow icon of <code>this</code> UI delegate.
	 */
	public Icon getArrowIcon();

	/**
	 * Returns the default gap between the icon and the text for
	 * <code>this</code> delegate.
	 * 
	 * @return The default gap between the icon and the text for
	 *         <code>this</code> delegate.
	 */
	public int getDefaultTextIconGap();

	/**
	 * Returns the associated menu item.
	 * 
	 * @return The associated menu item.
	 */
	public JMenuItem getAssociatedMenuItem();
	
	public void updateCheckIconIfNeeded();
}
