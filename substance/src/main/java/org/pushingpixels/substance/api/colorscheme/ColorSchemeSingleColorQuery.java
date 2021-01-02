/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.api.colorscheme;

import java.awt.*;

/**
 * Defines a query that returns a single color based on a color scheme.
 * 
 * @author Kirill Grouchnikov
 */
@FunctionalInterface
public interface ColorSchemeSingleColorQuery {
	/**
	 * Returns a single color based on the specified color scheme.
	 * 
	 * @param scheme
	 *            The color scheme.
	 * @return The color based on the specified color scheme.
	 */
	Color query(SubstanceColorScheme scheme);

	/**
	 * Core implementation of the {@link ColorSchemeSingleColorQuery} interface
	 * that returns the ultra light color of the specified color scheme.
	 */
	ColorSchemeSingleColorQuery ULTRALIGHT = SchemeBaseColors::getUltraLightColor;

	/**
	 * Core implementation of the {@link ColorSchemeSingleColorQuery} interface
	 * that returns the extra light color of the specified color scheme.
	 */
	ColorSchemeSingleColorQuery EXTRALIGHT = SchemeBaseColors::getExtraLightColor;

	/**
	 * Core implementation of the {@link ColorSchemeSingleColorQuery} interface
	 * that returns the light color of the specified color scheme.
	 */
	ColorSchemeSingleColorQuery LIGHT = SchemeBaseColors::getLightColor;

	/**
	 * Core implementation of the {@link ColorSchemeSingleColorQuery} interface
	 * that returns the mid color of the specified color scheme.
	 */
	ColorSchemeSingleColorQuery MID = SchemeBaseColors::getMidColor;

	/**
	 * Core implementation of the {@link ColorSchemeSingleColorQuery} interface
	 * that returns the dark color of the specified color scheme.
	 */
	ColorSchemeSingleColorQuery DARK = SchemeBaseColors::getDarkColor;

	/**
	 * Core implementation of the {@link ColorSchemeSingleColorQuery} interface
	 * that returns the ultra dark color of the specified color scheme.
	 */
	ColorSchemeSingleColorQuery ULTRADARK = SchemeBaseColors::getUltraDarkColor;

	/**
	 * Core implementation of the {@link ColorSchemeSingleColorQuery} interface
	 * that returns the foreground color of the specified color scheme.
	 */
	ColorSchemeSingleColorQuery FOREGROUND = SchemeBaseColors::getForegroundColor;

	static ColorSchemeSingleColorQuery composite(ColorSchemeSingleColorQuery base,
			ColorTransform... transforms) {
		return scheme -> {
			Color result = base.query(scheme);
			for (ColorTransform transform: transforms) {
				result = transform.transform(result);
			}
			return result;
		};
	}
}
