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
package org.pushingpixels.radiance.theming.api.painter.overlay;

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Overlay painter that paints a few pixel-high drop shadow at the bottom edge
 * of the relevant decoration area. This class is part of officially supported
 * API.
 * 
 * @author Kirill Grouchnikov
 */
public final class BottomShadowOverlayPainter implements RadianceOverlayPainter {
	private static final Map<Integer, BottomShadowOverlayPainter> MAP = new HashMap<>();

	private static final int DEFAULT_SHADOW_END_ALPHA = 128;
	private static final int MIN_SHADOW_END_ALPHA = 32;

	private int endAlpha = DEFAULT_SHADOW_END_ALPHA;

	/**
	 * Returns the single instance of this class.
	 * 
	 * @return Single instance of this class.
	 */
	public synchronized static BottomShadowOverlayPainter getInstance() {
		return getInstance(100);
	}

	/**
	 * Returns an instance of bottom shadow overlay painter with the requested strength.
	 *
	 * @param strength Drop shadow strength. Must be in [0..100] range.
	 * @return Bottom shadow overlay painter with the requested strength.
	 */
	public synchronized static BottomShadowOverlayPainter getInstance(int strength) {
		if ((strength < 0) || (strength > 100)) {
			throw new IllegalArgumentException("Strength must be in [0..100] range");
		}
		if (!MAP.containsKey(strength)) {
			BottomShadowOverlayPainter painter = new BottomShadowOverlayPainter();
			painter.endAlpha = MIN_SHADOW_END_ALPHA +
					(DEFAULT_SHADOW_END_ALPHA - MIN_SHADOW_END_ALPHA) * strength / 100;
			MAP.put(strength, painter);
		}
		return MAP.get(strength);
	}

	/**
	 * Private constructor to enforce that {@link #getInstance(int)} is the only
	 * way an application can get an instance of this class.
	 */
	private BottomShadowOverlayPainter() {
	}

	@Override
	public void paintOverlay(Graphics2D graphics, Component comp,
                             RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height,
                             RadianceSkin skin) {
		Color shadowColor = RadianceColorUtilities.deriveByBrightness(
				RadianceColorUtilities.getBackgroundFillColor(comp), -0.4f);

		Component topMostWithSameDecorationAreaType = RadianceCoreUtilities
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
				RadianceColorUtilities.getAlphaColor(shadowColor, 0), 0, topHeight,
				RadianceColorUtilities.getAlphaColor(shadowColor, this.endAlpha));
		fillGraphics.setPaint(fillPaint);
		fillGraphics.fillRect(0, topHeight - shadowHeight, width, shadowHeight);
		fillGraphics.dispose();
	}

	@Override
	public String getDisplayName() {
		return "Bottom Shadow";
	}

}
