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
package org.pushingpixels.demo.substance.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.pushingpixels.substance.api.colorscheme.AquaColorScheme;
import org.pushingpixels.substance.api.colorscheme.PurpleColorScheme;

/**
 * Image creator demo.
 * 
 * @author Kirill Grouchnikov
 */
public class JaxbwIconDemo {

	public static final int COLOR_CELL = 30;

	public static final int NAME_CELL = 120;

	private static final class IconFrame extends JFrame {
		/**
		 * Simple constructor. Creates all the icons.
		 */
		public IconFrame() {

			this.setLayout(new BorderLayout());
			this.add(new IconPanel(), BorderLayout.CENTER);

		}
	}

	/**
	 * Demo frame.
	 * 
	 * @author Kirill Grouchnikov
	 */
	private static final class IconPanel extends JPanel {
		/**
		 * Simple constructor. Creates all the icons.
		 */
		public IconPanel() {
			int width = 50;
			int height = 50;
			Dimension dim = new Dimension(width, height);
			this.setPreferredSize(dim);
			this.setMinimumSize(dim);
			this.setSize(dim);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.awt.Component#paint(java.awt.Graphics)
		 */
		public final void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g.create();
			g2.setColor(Color.white);
			g2.translate(15, 15);

			// g2.drawImage(SubstanceImageCreator.getRoundedBackground(16, 16,
			// 2,
			// ColorSchemeEnum.LIGHT_AQUA, 0, null), 0, 0, null);

			g2.setColor(new AquaColorScheme().getDarkColor());
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);

			g2.setColor(new PurpleColorScheme().getDarkColor());
			g2.setFont(new Font("Tahoma", Font.BOLD, 17));
			g2.drawString("J", 6.0f, 14.0f);
			g2.setColor(Color.BLACK);
			g2.setFont(new Font("Tahoma", Font.BOLD, 11));
			g2.drawString("w", 2.0f, 11.0f);

			// Stroke stroke = new BasicStroke(1.8f, BasicStroke.CAP_ROUND,
			// BasicStroke.JOIN_ROUND);
			// g2.setStroke(stroke);
			// GeneralPath path1 = new GeneralPath();
			// path1.moveTo(5.0f, 4.0f);
			// path1.quadTo(3.0f, 4.0f, 3.0f, 8.0f);
			// path1.quadTo(3.0f, 12.0f, 8.0f, 11.0f);
			// path1.moveTo(10.0f, 12.0f);
			// path1.quadTo(12.0f, 12.0f, 12.0f, 8.0f);
			// path1.quadTo(12.0f, 4.0f, 7.0f, 5.0f);
			// path1.lineTo(8.0f, 11.0f);
			// // path1.moveTo(8.0f, 8.0f);
			// g2.draw(path1);

			// g2.setColor(Color.BLACK);
			// g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
			// RenderingHints.VALUE_ANTIALIAS_OFF);
			// g2.drawRect(-1, -1, 18, 18);
			// Stroke stroke2 = new BasicStroke(1.0f, BasicStroke.CAP_ROUND,
			// BasicStroke.JOIN_ROUND);
			// g2.setStroke(stroke2);
		}
	}

	/**
	 * Main function for running <code>this</code> demo.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IconFrame icf = new IconFrame();
		icf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icf.pack();
		icf.setVisible(true);
	}
}
