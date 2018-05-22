/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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
package org.pushingpixels.substance.flamingo.ribbon.gallery.oob;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.internal.hidpi.UIUtil;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;

/**
 * Resizable icon for <b>Substance</b> themes.
 * 
 * @author Kirill Grouchnikov
 */
public class ColorSchemeResizableIcon implements ResizableIcon {
	/**
	 * Current width in pixels.
	 */
	private int currWidth;

	/**
	 * Current height in pixels.
	 */
	private int currHeight;

	/**
	 * Associated color scheme. Can be <code>null</code>.
	 */
	private SubstanceColorScheme scheme;

	/**
	 * Creates a new icon.
	 * 
	 * @param scheme
	 *            Associated color scheme (can be <code>null</code>).
	 * @param startWidth
	 *            Original width in pixels.
	 * @param startHeight
	 *            Original heigth in pixels.
	 */
	public ColorSchemeResizableIcon(SubstanceColorScheme scheme,
			int startWidth, int startHeight) {
		this.scheme = scheme;
		this.currWidth = startWidth;
		this.currHeight = startHeight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.jvnet.flamingo.common.ResizableIcon#setDimension(java.awt.Dimension)
	 */
	@Override
	public void setDimension(Dimension newDimension) {
		this.currWidth = newDimension.width;
		this.currHeight = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
	@Override
	public int getIconHeight() {
		return this.currHeight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
	@Override
	public int getIconWidth() {
		return this.currWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D graphics = (Graphics2D) g.create();
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		graphics.translate(x, y);

		double R = Math.max(3.0, this.currHeight / 10.0);
		double r = R / 2.0;
		double s = (this.currHeight - 2 * R) / 2.0;
		double cx = this.currWidth / 2.0;
		// double cy = this.currHeight / 2.0;
		double dx = s * Math.sqrt(3.0) / 2.0;
		// double ss = (this.currHeight - 2 * r) / 2.0;
		// double dxs = ss * Math.sqrt(3.0) / 2.0;

		R = Math.floor(R);

		Color color1 = (this.scheme == null) ? Color.red : this.scheme
				.getUltraDarkColor();
		Color color2 = (this.scheme == null) ? Color.yellow : this.scheme
				.getDarkColor();
		Color color3 = (this.scheme == null) ? Color.green : this.scheme
				.getMidColor();
		Color color4 = (this.scheme == null) ? Color.cyan : this.scheme
				.getLightColor();
		Color color5 = (this.scheme == null) ? Color.blue : this.scheme
				.getExtraLightColor();
		Color color6 = (this.scheme == null) ? Color.magenta : this.scheme
				.getUltraLightColor();

		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
				RenderingHints.VALUE_STROKE_PURE);
		graphics.setStroke(new BasicStroke(1.0f / (float) UIUtil.getScaleFactor(), 
				BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
		this.paintCircle(graphics, cx, R, R, color1, true);
		if (this.currHeight > 16)
			this.paintCircle(graphics, cx + dx, R + 0.5 * s, R, color2, true);
		this.paintCircle(graphics, cx + dx, R + 1.5 * s, R, color3, true);
		if (this.currHeight > 16)
			this.paintCircle(graphics, cx, this.currHeight - 1 - R, R, color4,
					true);
		this.paintCircle(graphics, cx + 1 - dx, R + 1.5 * s, R, color5, true);
		if (this.currHeight > 16)
			this.paintCircle(graphics, cx + 1 - dx, R + 0.5 * s, R, color6,
					true);

		if (r >= 2.0) {
			this.paintCircle(graphics, cx + 0.5 + dx / 2.0, R + 0.25 * s, r,
					color1, false);
			this.paintCircle(graphics, cx + dx, R + s, r, color2, false);
			this.paintCircle(graphics, cx + 0.5 + dx / 2.0, R
					+ (this.currHeight - 1 + 1.5 * s) / 2.0, r, color3, false);
			this.paintCircle(graphics, cx - 0.5 - dx / 2.0, R
					+ (this.currHeight - 1 + 1.5 * s) / 2.0, r, color4, false);
			this.paintCircle(graphics, cx - dx, R + s, r, color5, false);
			this.paintCircle(graphics, cx - 0.5 - dx / 2.0, R + 0.25 * s, r,
					color6, false);
		}

		graphics.dispose();
	}

	/**
	 * Paints a single circle.
	 * 
	 * @param graphics
	 *            Graphics context.
	 * @param xc
	 *            X coordinate of the circle center.
	 * @param yc
	 *            Y coordinate of the circle center.
	 * @param r
	 *            Circle radius.
	 * @param color
	 *            Circle color.
	 * @param toDrawOutline
	 *            Indication whether the circle outline should be drawn.
	 */
	private void paintCircle(Graphics2D graphics, double xc, double yc,
			double r, Color color, boolean toDrawOutline) {
		Shape shape = new Ellipse2D.Double(xc - r, yc - r, 2 * r, 2 * r);
		this.paintShape(graphics, shape, color, toDrawOutline);
	}

	/**
	 * Paints shape.
	 * 
	 * @param graphics
	 *            Graphics context.
	 * @param shape
	 *            Shape to draw.
	 * @param color
	 *            Circle color.
	 * @param toDrawOutline
	 *            Indication whether the shape outline should be drawn.
	 */
	private void paintShape(Graphics2D graphics, Shape shape, Color color,
			boolean toDrawOutline) {
		graphics.setColor(color);
		graphics.fill(shape);
		if (toDrawOutline) {
			graphics.setColor(color.darker());
			graphics.draw(shape);
		}
	}
}
