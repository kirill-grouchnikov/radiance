/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.painter.fill;

import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;

/**
 * Fill painter that draws visuals with classic appearance. This class is part
 * of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class ClassicFillPainter extends StandardFillPainter {
	/**
	 * Reusable instance of this painter.
	 */
	public static final ClassicFillPainter INSTANCE = new ClassicFillPainter();

	/**
	 * Creates a new classic gradient painter.
	 */
	public ClassicFillPainter() {
	}

	@Override
	public String getDisplayName() {
		return "Classic";
	}

	@Override
	public Color getTopFillColor(RadianceColorScheme fillScheme) {
		return RadianceColorUtilities.getInterpolatedColor(super.getBottomFillColor(fillScheme),
				super.getMidFillColorTop(fillScheme), 0.5f);
	}

	@Override
	public Color getMidFillColorTop(RadianceColorScheme fillScheme) {
		return RadianceColorUtilities.getInterpolatedColor(super.getMidFillColorTop(fillScheme),
				super.getBottomFillColor(fillScheme), 0.7f);
	}
}
