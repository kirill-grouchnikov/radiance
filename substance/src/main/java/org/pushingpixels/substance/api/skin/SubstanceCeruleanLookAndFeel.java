/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov and contributing authors. All Rights Reserved.
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
 * Standalone look-and-feel that uses the <code>Cerulean</code> skin from
 * {@link org.pushingpixels.substance.api.skin.CeruleanSkin}. You can set this look-and-feel by:
 * <ul>
 * <li>
 * -Dswing.defaultlaf=org.pushingpixels.substance.api.skin.
 * SubstanceCeruleanLookAndFeel</li>
 * <li>UIManager.setLookAndFeel(
 * "org.pushingpixels.substance.api.skin.SubstanceCeruleanLookAndFeel" );</li>
 * <li>UIManager.setLookAndFeel(new SubstanceCeruleanLookAndFeel());</li>
 * </ul>
 *
 * @since version 7.0
 */
public class SubstanceCeruleanLookAndFeel extends SubstanceLookAndFeel {
	/**
	 * Creates a new <code>Cerulean</code> look-and-feel.
	 */
	public SubstanceCeruleanLookAndFeel() {
		super(new CeruleanSkin());
	}
}