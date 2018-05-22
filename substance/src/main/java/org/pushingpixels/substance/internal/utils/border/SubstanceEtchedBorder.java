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
package org.pushingpixels.substance.internal.utils.border;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.border.Border;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

/**
 * Custom implementation of etched border.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceEtchedBorder implements Border {
	/**
	 * Returns the highlight color for the specified component.
	 * 
	 * @param c
	 *            Component.
	 * @return Matching highlight color.
	 */
	public Color getHighlightColor(Component c) {
		SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities
				.getColorScheme(c, ColorSchemeAssociationKind.SEPARATOR,
						ComponentState.ENABLED);
		boolean isDark = colorScheme.isDark();
		Color foreDark = isDark ? colorScheme.getExtraLightColor()
				: SubstanceColorUtilities.getInterpolatedColor(colorScheme
						.getMidColor(), colorScheme.getDarkColor(), 0.4);

		return SubstanceColorUtilities.getAlphaColor(foreDark, 196);
	}

	/**
	 * Returns the shadow color for the specified component.
	 * 
	 * @param c
	 *            Component.
	 * @return Matching shadow color.
	 */
	public Color getShadowColor(Component c) {
		SubstanceColorScheme colorScheme = SubstanceColorSchemeUtilities
				.getColorScheme(c, ColorSchemeAssociationKind.SEPARATOR,
						ComponentState.ENABLED);
		Color back = colorScheme.isDark() ? colorScheme.getDarkColor()
				: colorScheme.getUltraLightColor();
		return SubstanceColorUtilities.getAlphaColor(back, 196);
	}

	public boolean isBorderOpaque() {
		return false;
	}

	public void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height) {
		int w = width;
		int h = height;

		Graphics2D g2d = (Graphics2D) g.create();
		float strokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		g2d.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_ROUND));
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
				RenderingHints.VALUE_STROKE_PURE);

		g2d.translate(x, y);

		g2d.setColor(getShadowColor(c));

		// this is to prevent clipping of thick outer borders.
		float delta = strokeWidth / 2.0f;

		g2d.draw(new Rectangle2D.Float(delta, delta, w - delta - 2
				* strokeWidth, h - delta - 2 * strokeWidth));
		// g2d.drawRect(0, 0, w - 2, h - 2);

		g2d.setColor(getHighlightColor(c));
		g2d.draw(new Line2D.Float(strokeWidth, h - 3 * strokeWidth,
				strokeWidth, strokeWidth));
		// g2d.drawLine(1, h - 3, 1, 1);
		g2d.draw(new Line2D.Float(delta + strokeWidth, delta + strokeWidth, w
				- delta - 3 * strokeWidth, delta + strokeWidth));
		// g2d.drawLine(1, 1, w - 3, 1);

		g2d.draw(new Line2D.Float(delta, h - delta - strokeWidth, w - delta
				- strokeWidth, h - delta - strokeWidth));
		// g2d.drawLine(0, h - 1, w - 1, h - 1);
		g2d.draw(new Line2D.Float(w - delta - strokeWidth, h - delta
				- strokeWidth, w - delta - strokeWidth, delta));
		// g2d.drawLine(w - 1, h - 1, w - 1, 0);

		g2d.dispose();

		// this is a fix for defect 248 - in order to paint the TitledBorder
		// text respecting the AA settings of the display, we have to
		// set rendering hints on the passed Graphics object.
		RenderingUtils.installDesktopHints((Graphics2D) g, c);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.border.Border#getBorderInsets(java.awt.Component)
	 */
	public Insets getBorderInsets(Component c) {
		float borderStrokeWidth = SubstanceSizeUtils.getBorderStrokeWidth();
		int prefSize = (int) (Math.ceil(2.0 * borderStrokeWidth));
		return new Insets(prefSize, prefSize, prefSize, prefSize);
	}
}
