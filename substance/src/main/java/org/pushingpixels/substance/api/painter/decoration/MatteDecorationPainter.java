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
package org.pushingpixels.substance.api.painter.decoration;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Point;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Implementation of {@link SubstanceDecorationPainter} that uses matte painting
 * on decoration areas.
 * 
 * @author Kirill Grouchnikov
 * @since version 4.3
 */
public class MatteDecorationPainter implements SubstanceDecorationPainter {
	/**
	 * The display name for the decoration painters of this class.
	 */
	public static final String DISPLAY_NAME = "Matte";

    @Override
	public String getDisplayName() {
		return DISPLAY_NAME;
	}

	@Override
	public void paintDecorationArea(Graphics2D graphics, Component comp,
			DecorationAreaType decorationAreaType, int width, int height, SubstanceSkin skin) {
		if ((decorationAreaType == DecorationAreaType.PRIMARY_TITLE_PANE)
				|| (decorationAreaType == DecorationAreaType.SECONDARY_TITLE_PANE)) {
			this.paintTitleBackground(graphics, comp, width, height,
					skin.getBackgroundColorScheme(decorationAreaType));
		} else {
			this.paintExtraBackground(graphics, comp, width, height,
					skin.getBackgroundColorScheme(decorationAreaType));
		}
	}

	/**
	 * Paints the title background.
	 * 
	 * @param graphics
	 *            Graphics context.
	 * @param comp
	 *            Component.
	 * @param width
	 *            Width.
	 * @param height
	 *            Height.
	 * @param scheme
	 *            Color scheme for painting the title background.
	 */
	private void paintTitleBackground(Graphics2D graphics, Component comp, int width, int height,
			SubstanceColorScheme scheme) {
		Graphics2D g2d = (Graphics2D) graphics.create();
		this.fill(g2d, comp, scheme, 0, 0, 0, width, height);
		g2d.dispose();
	}

	/**
	 * Paints the background of non-title decoration areas.
	 * 
	 * @param graphics
	 *            Graphics context.
	 * @param parent
	 *            Component ancestor for computing the correct offset of the
	 *            background painting.
	 * @param comp
	 *            Component.
	 * @param width
	 *            Width.
	 * @param height
	 *            Height.
	 * @param scheme
	 *            Color scheme for painting the title background.
	 */
	private void paintExtraBackground(Graphics2D graphics, Component comp, int width, int height,
			SubstanceColorScheme scheme) {
		Point offset = SubstanceCoreUtilities.getOffsetInRootPaneCoords(comp);
		Graphics2D g2d = (Graphics2D) graphics.create();
		this.fill(g2d, comp, scheme, offset.y, 0, 0, width, height);
		g2d.dispose();
	}

	/**
	 * Fills the relevant part with the gradient fill.
	 * 
	 * @param graphics
	 *            Graphics.
	 * @param comp
	 *            Component.
	 * @param scheme
	 *            Color scheme to use.
	 * @param offsetY
	 *            Vertical offset.
	 * @param x
	 *            X coordinate of the fill area.
	 * @param y
	 *            Y coordinate of the fill area.
	 * @param width
	 *            Fill area width.
	 * @param height
	 *            Fill area height.
	 */
	protected void fill(Graphics2D graphics, Component comp, SubstanceColorScheme scheme,
			int offsetY, int x, int y, int width, int height) {
		// System.out.println(comp.getClass().getName() + ":"
		// + scheme.getDisplayName());

		// 0 - 50 : light -> medium
		// 50 - : medium fill
		int flexPoint = 50;

		int startY = y + offsetY;
		if (startY < 0)
			startY = 0;
		int endY = startY + height;

		Color startColor = scheme.getLightColor();
		Color endColor = SubstanceColorUtilities.getInterpolatedColor(startColor,
				scheme.getMidColor(), 0.4f);

		int currStart = 0;
		if (flexPoint >= startY) {
			graphics.setPaint(new GradientPaint(x, currStart - offsetY, startColor, x,
					flexPoint - offsetY, endColor));
			graphics.fillRect(x, currStart - offsetY, width, flexPoint);
		}
		currStart += flexPoint;

		if (currStart > endY)
			return;

		graphics.setColor(endColor);
		graphics.fillRect(x, currStart - offsetY, width, endY - currStart + offsetY);
	}
}
