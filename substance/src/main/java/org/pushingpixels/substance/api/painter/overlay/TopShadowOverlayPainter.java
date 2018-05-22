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

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.SwingUtilities;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Overlay painter that paints a few pixel-high drop shadow at the top edge of
 * the relevant decoration area. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 5.3
 */
public final class TopShadowOverlayPainter implements SubstanceOverlayPainter {
	/**
	 * Singleton instance.
	 */
	private static TopShadowOverlayPainter INSTANCE;

	/**
	 * Returns the single instance of this class.
	 * 
	 * @return Single instance of this class.
	 */
	public synchronized static TopShadowOverlayPainter getInstance() {
		if (INSTANCE == null)
			INSTANCE = new TopShadowOverlayPainter();
		return INSTANCE;
	}

	/**
	 * Private constructor to enforce that {@link #getInstance()} is the only
	 * way an application can get an instance of this class.
	 */
	private TopShadowOverlayPainter() {
	}

	@Override
	public void paintOverlay(Graphics2D graphics, Component comp,
			DecorationAreaType decorationAreaType, int width, int height,
			SubstanceSkin skin) {
		Color shadowColor = SubstanceColorUtilities
				.getBackgroundFillColor(comp).darker();

		// need to handle components "embedded" in other components
		Component topMostWithSameDecorationAreaType = SubstanceCoreUtilities
				.getTopMostParentWithDecorationAreaType(comp,
						decorationAreaType);
		Point inTopMost = SwingUtilities.convertPoint(comp, new Point(0, 0),
				topMostWithSameDecorationAreaType);
		int dy = inTopMost.y;

		Graphics2D g2d = (Graphics2D) graphics.create();
		g2d.translate(0, -dy);
		g2d.setPaint(new GradientPaint(
				0, 0, SubstanceColorUtilities.getAlphaColor(shadowColor, 160), 
				0, 4, SubstanceColorUtilities.getAlphaColor(shadowColor, 16)));
		g2d.fillRect(0, 0, comp.getWidth(), 4);
		g2d.dispose();
	}

	@Override
	public String getDisplayName() {
		return "Top Shadow";
	}

}
