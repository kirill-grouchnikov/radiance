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
package org.pushingpixels.radiance.theming.internal.painter;

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.painter.overlay.RadianceOverlayPainter;

import java.awt.*;
import java.util.List;

/**
 * Contains utility methods related to overlay painters. This class is for
 * internal use only.
 * 
 * @author Kirill Grouchnikov
 */
public class OverlayPainterUtils {
	/**
	 * Paints all registered overlays on the specified component. Overlay
	 * painters are registered with
	 * {@link RadianceSkin#addOverlayPainter(RadianceOverlayPainter, RadianceThemingSlices.DecorationAreaType...)}
	 * API.
	 * 
	 * @param g
	 *            Graphics context.
	 * @param c
	 *            Component.
	 * @param skin
	 *            Component skin.
	 * @param decorationAreaType
	 *            Component decoration area type.
	 */
	public static void paintOverlays(Graphics g, Component c, RadianceSkin skin,
			RadianceThemingSlices.DecorationAreaType decorationAreaType) {
		List<RadianceOverlayPainter> overlayPainters = skin.getOverlayPainters(decorationAreaType);
		if (overlayPainters.size() == 0) {
			return;
		}

		for (RadianceOverlayPainter overlayPainter : overlayPainters) {
			Graphics2D g2d = (Graphics2D) g.create();
			overlayPainter.paintOverlay(g2d, c, decorationAreaType, c.getWidth(), c.getHeight(), skin);
			g2d.dispose();
		}
	}
}
