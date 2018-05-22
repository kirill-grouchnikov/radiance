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
 * Overlay painter that paints a few pixel-high drop shadow at the bottom edge
 * of the relevant decoration area. This class is part of officially supported
 * API.
 * 
 * @author Kirill Grouchnikov
 * @since version 5.3
 */
public final class BottomShadowOverlayPainter implements
		SubstanceOverlayPainter {
	/**
	 * Singleton instance.
	 */
	private static BottomShadowOverlayPainter INSTANCE;

	/**
	 * Returns the single instance of this class.
	 * 
	 * @return Single instance of this class.
	 */
	public synchronized static BottomShadowOverlayPainter getInstance() {
		if (INSTANCE == null)
			INSTANCE = new BottomShadowOverlayPainter();
		return INSTANCE;
	}

	/**
	 * Private constructor to enforce that {@link #getInstance()} is the only
	 * way an application can get an instance of this class.
	 */
	private BottomShadowOverlayPainter() {
	}

	@Override
	public void paintOverlay(Graphics2D graphics, Component comp,
			DecorationAreaType decorationAreaType, int width, int height,
			SubstanceSkin skin) {
		Color shadowColor = SubstanceColorUtilities
				.getBackgroundFillColor(comp).darker();

		Component topMostWithSameDecorationAreaType = SubstanceCoreUtilities
				.getTopMostParentWithDecorationAreaType(comp,
						decorationAreaType);
		int topHeight = topMostWithSameDecorationAreaType.getHeight();

		Point inTopMost = SwingUtilities.convertPoint(comp, new Point(0, 0),
				topMostWithSameDecorationAreaType);
		int dy = inTopMost.y;

		Graphics2D fillGraphics = (Graphics2D) graphics.create();
		fillGraphics.translate(0, -dy);

		int shadowHeight = 4;
		GradientPaint fillPaint = new GradientPaint(0, topHeight - shadowHeight, 
				SubstanceColorUtilities.getAlphaColor(shadowColor, 0), 0, topHeight,
				SubstanceColorUtilities.getAlphaColor(shadowColor, 128));
		fillGraphics.setPaint(fillPaint);
		fillGraphics.fillRect(0, topHeight - shadowHeight, width, shadowHeight);
		fillGraphics.dispose();
	}

	@Override
	public String getDisplayName() {
		return "Bottom Shadow";
	}

}
