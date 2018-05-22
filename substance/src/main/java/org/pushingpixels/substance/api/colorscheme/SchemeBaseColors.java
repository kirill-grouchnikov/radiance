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
package org.pushingpixels.substance.api.colorscheme;

import java.awt.Color;

import org.pushingpixels.substance.api.trait.SubstanceTrait;

/**
 * Interface for base color scheme colors.
 * 
 * @author Kirill Grouchnikov
 */
public interface SchemeBaseColors extends SubstanceTrait {
	/**
	 * Retrieves the foreground color.
	 * 
	 * @return Foreground color.
	 */
	public Color getForegroundColor();

	/**
	 * Retrieves the ultra-light color.
	 * 
	 * @return Ultra-light color.
	 */
	public Color getUltraLightColor();

	/**
	 * Retrieves the extra color.
	 * 
	 * @return Extra color.
	 */
	public Color getExtraLightColor();

	/**
	 * Retrieves the light color.
	 * 
	 * @return Light color.
	 */
	public Color getLightColor();

	/**
	 * Retrieves the medium color.
	 * 
	 * @return Medium color.
	 */
	public Color getMidColor();

	/**
	 * Retrieves the dark color.
	 * 
	 * @return Dark color.
	 */
	public Color getDarkColor();

	/**
	 * Retrieves the ultra-dark color.
	 * 
	 * @return Ultra-dark color.
	 */
	public Color getUltraDarkColor();
}
