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

import javax.swing.UIDefaults;

import org.pushingpixels.substance.internal.fonts.FontPolicies;

/**
 * Looks up and returns a FontSet.
 * 
 * @author Karsten Lentzsch
 * 
 * @see FontSet
 * @see FontPolicies
 * 
 * @since 2.0
 */
public interface FontPolicy {

	/**
	 * Looks up and returns a set of fonts that will be used by a Look&amp;Feel
	 * to set the default fonts for its components.
	 * <p>
	 * 
	 * This method is invoked during the L&amp;F component initialization. And
	 * the invoker hands over the UIDefaults object used to define the component
	 * settings. Hence, the UIDefaults object may be used to look up a font as
	 * initialized by a super Look&amp;Feel. For example the JGoodies Windows
	 * L&amp;F could use the defaults set by the super L&amp;F, the Sun Windows
	 * L&amp;F.
	 * 
	 * @param lafName
	 *            the name of the Look&amp;Feel that requests the fonts
	 * @param table
	 *            the UIDefaults table that can be used to look up fonts of a
	 *            super L&amp;F
	 * 
	 * @return a set of fonts used as default for the component.
	 */
	FontSet getFontSet(String lafName, UIDefaults table);

}
