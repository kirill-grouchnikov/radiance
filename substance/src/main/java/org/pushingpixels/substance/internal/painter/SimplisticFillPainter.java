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
package org.pushingpixels.substance.internal.painter;

import java.awt.Color;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.StandardFillPainter;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

/**
 * Fill painter that returns images with simplistic appearance. This class is
 * <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class SimplisticFillPainter extends StandardFillPainter {
	/**
	 * Reusable instance of this painter.
	 */
	public static final SimplisticFillPainter INSTANCE = new SimplisticFillPainter();

	@Override
	public String getDisplayName() {
		return "Simplistic";
	}

	@Override
	public Color getTopFillColor(SubstanceColorScheme fillScheme) {
		return super.getMidFillColorTop(fillScheme);
	}

	@Override
	public Color getMidFillColorTop(SubstanceColorScheme fillScheme) {
		return SubstanceColorUtilities.getInterpolatedColor(super
				.getMidFillColorTop(fillScheme), super
				.getBottomFillColor(fillScheme), 0.5);
	}

	@Override
	public Color getTopShineColor(SubstanceColorScheme fillScheme) {
		return null;
	}

	@Override
	public Color getBottomShineColor(SubstanceColorScheme fillScheme) {
		return null;
	}
}
