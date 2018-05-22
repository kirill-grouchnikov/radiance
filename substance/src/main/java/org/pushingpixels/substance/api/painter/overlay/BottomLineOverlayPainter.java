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
package org.pushingpixels.substance.api.painter.overlay;

import java.awt.BasicStroke;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

/**
 * Overlay painter that paints a single line at the bottom edge of the relevant
 * decoration area. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 5.3
 */
public final class BottomLineOverlayPainter implements SubstanceOverlayPainter {
	/**
	 * Used to compute the color of the line painted by this overlay painter.
	 */
	ColorSchemeSingleColorQuery colorSchemeQuery;

	/**
	 * Creates a new overlay painter that paints a single line at the bottom
	 * edge of the relevant decoration area
	 * 
	 * @param colorSchemeQuery
	 *            Used to compute the color of the line painted by this overlay
	 *            painter.
	 */
	public BottomLineOverlayPainter(ColorSchemeSingleColorQuery colorSchemeQuery) {
		this.colorSchemeQuery = colorSchemeQuery;
	}

	@Override
	public void paintOverlay(Graphics2D graphics, Component comp,
			DecorationAreaType decorationAreaType, int width, int height, SubstanceSkin skin) {
		Component topMostWithSameDecorationAreaType = SubstanceCoreUtilities
				.getTopMostParentWithDecorationAreaType(comp, decorationAreaType);

		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		graphics.setStroke(new BasicStroke(borderStrokeWidth));

		SubstanceColorScheme colorScheme = skin.getBackgroundColorScheme(decorationAreaType);
		graphics.setColor(this.colorSchemeQuery.query(colorScheme));
		float bottomY = topMostWithSameDecorationAreaType.getHeight() - borderStrokeWidth;
		Line2D.Float line = new Line2D.Float(0, bottomY, width, bottomY);
		graphics.draw(line);
	}

	@Override
	public String getDisplayName() {
		return "Bottom Line";
	}

}
