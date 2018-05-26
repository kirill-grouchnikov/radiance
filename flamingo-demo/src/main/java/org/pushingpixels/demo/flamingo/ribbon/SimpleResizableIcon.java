/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.flamingo.ribbon;

import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;
import org.pushingpixels.neon.icon.ResizableIcon;

import java.awt.*;

public class SimpleResizableIcon implements ResizableIcon {
	private int currWidth;

	private int currHeight;

	private int origWidth;

	private int origHeight;

	private RibbonElementPriority priority;

	public SimpleResizableIcon(RibbonElementPriority priority, int startWidth,
			int startHeight) {
		this.origWidth = startWidth;
		this.origHeight = startHeight;
		this.priority = priority;
		this.currWidth = startWidth;
		this.currHeight = startHeight;
	}

	public void setDimension(Dimension newDimension) {
		this.currWidth = newDimension.width;
		this.currHeight = newDimension.height;
	}

	public int getIconHeight() {
		return this.currHeight;
	}

	public int getIconWidth() {
		return this.currWidth;
	}

	public void setHeight(int height) {
		double coef = (double) height / (double) this.currHeight;
		this.currWidth = (int) (coef * this.currWidth);
		this.currHeight = height;
	}

	public void setWidth(int width) {
		double coef = (double) width / (double) this.currWidth;
		this.currHeight = (int) (coef * this.currHeight);
		this.currWidth = width;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D graphics = (Graphics2D) g.create();
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		int rx = this.currWidth / 3;
		int ry = this.currHeight / 3;
		int cx = x + (this.currWidth / 2) - 1;
		int cy = y + (this.currHeight / 2) - 1;
		Color color = null;
		switch (this.priority) {
		case TOP:
			color = new Color(0, 0, 128);
			break;
		case MEDIUM:
			color = Color.blue;
			break;
		case LOW:
			color = new Color(128, 128, 255);
			break;
		}

		graphics.setColor(color);
		graphics.fillOval(cx - rx, cy - ry, 2 * rx, 2 * ry);
		graphics.setColor(color.darker());
		graphics.drawOval(cx - rx, cy - ry, 2 * rx, 2 * ry);
		graphics.drawRect(x, y, this.currWidth - 2, this.currHeight - 2);

		graphics.dispose();
	}

	public void revertToOriginalDimension() {
		this.currHeight = this.origHeight;
		this.currWidth = this.origWidth;
	}
}
