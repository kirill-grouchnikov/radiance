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
package org.pushingpixels.substance.api.skin;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;

/**
 * Standalone look-and-feel that uses the <code>Business Black Steel</code> skin
 * from {@link BusinessBlackSteelSkin}. You can set this look-and-feel by:
 * <ul>
 * <li>-Dswing.defaultlaf=org.pushingpixels.substance.api.skin.
 * SubstanceBusinessBlackSteelLookAndFeel</li>
 * <li>UIManager.setLookAndFeel(
 * "org.pushingpixels.substance.api.skin.SubstanceBusinessBlackSteelLookAndFeel" );</li>
 * <li>UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());</li>
 * </ul>
 * 
 * @author Kirill Grouchnikov
 * @since version 3.3
 */
public class SubstanceBusinessBlackSteelLookAndFeel extends
		SubstanceLookAndFeel {
	/**
	 * Creates a new <code>Business Black Steel</code> look-and-feel.
	 */
	public SubstanceBusinessBlackSteelLookAndFeel() {
		super(new BusinessBlackSteelSkin());
	}
}
