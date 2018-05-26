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
package org.pushingpixels.tools.substance.jitterbug;

import org.pushingpixels.neon.NeonUtil;

import javax.swing.*;
import java.awt.*;

public class JHsvGraph extends JComponent {
	private static Color COLOR_HUE = new Color(159, 41, 54);
	private static Color COLOR_SAT = new Color(27, 88, 124);
	private static Color COLOR_BRI = new Color(241, 135, 23);

	private Color[] colors;

	public JHsvGraph() {
	}

	public void setColors(Color[] colors) {
		this.colors = colors;
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		int w = getWidth();
		int h = getHeight();

		Graphics2D g2d = (Graphics2D) g.create();
		NeonUtil.installDesktopHints(g2d, this);

		g2d.setColor(Color.black);

		int xOffset = g2d.getFontMetrics().stringWidth("255") + 5;
		int yOffset = 2 * g2d.getFontMetrics().getHeight();

		g2d.drawLine(xOffset, yOffset / 2, xOffset, h - yOffset);
		g2d.drawLine(xOffset, h - yOffset, w - 1, h - yOffset);

		String keys = "0123456789ABCDEF";
		for (int i = 0; i < keys.length(); i++) {
			String key = keys.charAt(i) + "F";
			int y = yOffset + (h - 2 * yOffset) - (h - 2 * yOffset) * (i + 1)
					/ 16;
			g2d.setColor(Color.lightGray);
			g2d.drawLine(xOffset + 1, y, w - 1, y);
			g2d.setColor(Color.gray);
			g2d.drawString(key, xOffset - 5
					- g2d.getFontMetrics().stringWidth(key), y
					+ g2d.getFontMetrics().getDescent());
		}

		if (this.colors != null) {
			float[] hue = new float[this.colors.length];
			float[] sat = new float[this.colors.length];
			float[] bri = new float[this.colors.length];
			int index = 0;
			for (Color c : this.colors) {
				float[] hsb = Color.RGBtoHSB(c.getRed(), c.getGreen(), c
						.getBlue(), null);
				hue[index] = hsb[0];
				sat[index] = hsb[1];
				bri[index] = hsb[2];
				index++;
			}

			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);

			// Hue
			g2d.setColor(COLOR_HUE);
			for (int i = 0; i < this.colors.length; i++) {
				int x = xOffset + 5 + (w - 1 - xOffset - 10) * i
						/ (this.colors.length - 1);
				int yHue = yOffset + (h - 2 * yOffset)
						- (int) ((h - 2 * yOffset) * hue[i]);
				g2d.fillRect(x - 2, yHue - 2, 5, 5);

				if (i > 0) {
					int prevHue = yOffset + (h - 2 * yOffset)
							- (int) ((h - 2 * yOffset) * hue[i - 1]);
					int xPrev = xOffset + 5 + (w - 1 - xOffset - 10) * (i - 1)
							/ (this.colors.length - 1);
					g2d.drawLine(xPrev, prevHue, x, yHue);
				}
			}

			// Saturation
			g2d.setColor(COLOR_SAT);
			for (int i = 0; i < this.colors.length; i++) {
				int x = xOffset + 5 + (w - 1 - xOffset - 10) * i
						/ (this.colors.length - 1);
				int ySat = yOffset + (h - 2 * yOffset)
						- (int) ((h - 2 * yOffset) * sat[i]);
				g2d.fillRect(x - 2, ySat - 2, 5, 5);

				if (i > 0) {
					int prevSat = yOffset + (h - 2 * yOffset)
							- (int) ((h - 2 * yOffset) * sat[i - 1]);
					int xPrev = xOffset + 5 + (w - 1 - xOffset - 10) * (i - 1)
							/ (this.colors.length - 1);
					g2d.drawLine(xPrev, prevSat, x, ySat);
				}
			}

			// Brightness
			g2d.setColor(COLOR_BRI);
			for (int i = 0; i < this.colors.length; i++) {
				int x = xOffset + 5 + (w - 1 - xOffset - 10) * i
						/ (this.colors.length - 1);
				int yBri = yOffset + (h - 2 * yOffset)
						- (int) ((h - 2 * yOffset) * bri[i]);
				g2d.fillRect(x - 2, yBri - 2, 5, 5);

				if (i > 0) {
					int prevBri = yOffset + (h - 2 * yOffset)
							- (int) ((h - 2 * yOffset) * bri[i - 1]);
					int xPrev = xOffset + 5 + (w - 1 - xOffset - 10) * (i - 1)
							/ (this.colors.length - 1);
					g2d.drawLine(xPrev, prevBri, x, yBri);
				}
			}

			g2d.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD));
			int labelWidth = g2d.getFontMetrics().stringWidth("WWW") + 20;
			int xLabel = xOffset + (w - xOffset - 3 * labelWidth) / 2;

			int lh = h - g2d.getFontMetrics().getAscent() / 2 + 2 - yOffset / 2;
			g2d.setColor(COLOR_HUE);
			g2d.drawLine(xLabel, lh, xLabel + 15, lh);
			g2d.fillRect(xLabel + 6, lh - 2, 5, 5);
			g2d.drawString("Hue", xLabel + 20, h - yOffset / 2);
			xLabel += labelWidth;

			g2d.setColor(COLOR_SAT);
			g2d.drawLine(xLabel, lh, xLabel + 15, lh);
			g2d.fillRect(xLabel + 6, lh - 2, 5, 5);
			g2d.drawString("Sat", xLabel + 20, h - yOffset / 2);
			xLabel += labelWidth;

			g2d.setColor(COLOR_BRI);
			g2d.drawLine(xLabel, lh, xLabel + 15, lh);
			g2d.fillRect(xLabel + 6, lh - 2, 5, 5);
			g2d.drawString("Bri", xLabel + 20, h - yOffset / 2);
			xLabel += labelWidth;
		}

		g2d.dispose();
	}
}
