/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.api.painter.decoration;

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import java.awt.*;

/**
 * Decoration painter that paints a flat appearance. This class is part of
 * officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class FlatDecorationPainter implements RadianceDecorationPainter {
	/**
	 * The display name for the decoration painters of this class.
	 */
	public static final String DISPLAY_NAME = "Flat";

    @Override
	public String getDisplayName() {
		return DISPLAY_NAME;
	}

    @Override
	public void paintDecorationArea(Graphics2D graphics, Component comp,
                                    RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height,
                                    RadianceSkin skin) {
		graphics.setColor(RadianceCoreUtilities.getBackgroundFill(
				skin, RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE));
//				skin.getBackgroundColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE)
//				.getBackgroundFillColor());
		graphics.fillRect(0, 0, width, height);
	}

	@Override
	public void paintDecorationArea(Graphics2D graphics, Component comp, RadianceThemingSlices.DecorationAreaType decorationAreaType,
			Shape contour, RadianceColorScheme colorScheme) {
        graphics.setColor(colorScheme.getBackgroundFillColor());
        graphics.fill(contour);
	}
}
