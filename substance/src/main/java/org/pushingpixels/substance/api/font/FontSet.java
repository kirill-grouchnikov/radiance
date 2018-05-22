/*
 * Copyright (c) 2001-2006 JGoodies Karsten Lentzsch. All Rights Reserved.
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
 *  o Neither the name of JGoodies Karsten Lentzsch nor the names of 
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

package org.pushingpixels.substance.api.font;

import javax.swing.plaf.FontUIResource;

/**
 * Returns the Fonts used by a Look&amp;Feel or theme. These Fonts must
 * implement the UIResource marker interface.
 * 
 * @author Karsten Lentzsch
 * 
 * @since 2.0
 */
public interface FontSet {

	/**
	 * Returns the font used for all dialog components.
	 * 
	 * @return the font used for all dialog components.
	 */
	FontUIResource getControlFont();

	/**
	 * Returns the font used for the menu.
	 * 
	 * @return the font used for the menu.
	 */
	FontUIResource getMenuFont();

	/**
	 * Returns the font used for the title label in TitledBorders. This font is
	 * also used by JGoodies Forms titles, and titled separators.
	 * 
	 * @return the font used for TitledBorder titles.
	 */
	FontUIResource getTitleFont();

	/**
	 * Returns the font used for frame titles.
	 * 
	 * @return the font used for frame titles.
	 */
	FontUIResource getWindowTitleFont();

	/**
	 * Returns the font used for tool tips.
	 * 
	 * @return the tool tip font.
	 */
	FontUIResource getSmallFont();

	/**
	 * Returns the font used for message dialogs.
	 * 
	 * @return the font used for message dialogs.
	 */
	FontUIResource getMessageFont();

}
