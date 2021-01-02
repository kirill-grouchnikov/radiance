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

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.trait.SubstanceTrait;

import java.awt.*;
import java.awt.image.BufferedImage;

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
	Color getForegroundColor();

	/**
	 * Retrieves the ultra-light color.
	 * 
	 * @return Ultra-light color.
	 */
	Color getUltraLightColor();

	/**
	 * Retrieves the extra color.
	 * 
	 * @return Extra color.
	 */
	Color getExtraLightColor();

	/**
	 * Retrieves the light color.
	 * 
	 * @return Light color.
	 */
	Color getLightColor();

	/**
	 * Retrieves the medium color.
	 * 
	 * @return Medium color.
	 */
	Color getMidColor();

	/**
	 * Retrieves the dark color.
	 * 
	 * @return Dark color.
	 */
	Color getDarkColor();

	/**
	 * Retrieves the ultra-dark color.
	 * 
	 * @return Ultra-dark color.
	 */
	Color getUltraDarkColor();

	default BufferedImage toImage() {
		BufferedImage result = NeonCortex.getBlankImage(240, 40);
		Graphics2D g2d = result.createGraphics();

		g2d.setColor(this.getUltraLightColor());
		g2d.fillRect(0, 0, 40, 40);
		g2d.setColor(this.getExtraLightColor());
		g2d.fillRect(40, 0, 40, 40);
		g2d.setColor(this.getLightColor());
		g2d.fillRect(80, 0, 40, 40);
		g2d.setColor(this.getMidColor());
		g2d.fillRect(120, 0, 40, 40);
		g2d.setColor(this.getDarkColor());
		g2d.fillRect(160, 0, 40, 40);
		g2d.setColor(this.getUltraDarkColor());
		g2d.fillRect(200, 0, 40, 40);

		g2d.dispose();
		return result;
	}
}
