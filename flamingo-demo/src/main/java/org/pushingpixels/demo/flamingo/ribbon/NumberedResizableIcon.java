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

import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.substance.internal.utils.filters.RenderingUtils;

import java.awt.*;

public class NumberedResizableIcon implements ResizableIcon {
	private int currWidth;

	private int currHeight;

	private int origWidth;

	private int origHeight;

	private int count;

	public NumberedResizableIcon(int count, int startWidth, int startHeight) {
		this.origWidth = startWidth;
		this.origHeight = startHeight;
		this.currWidth = startWidth;
		this.currHeight = startHeight;
		this.count = count;
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
		RenderingUtils.installDesktopHints(graphics, c);

		graphics.setColor(new Color(40, 70, 20));
		graphics.setFont(new Font("Tahoma", Font.BOLD, 14));
		String toPrint = "" + this.count;
		int strWidth = graphics.getFontMetrics().stringWidth(toPrint);
		int strHeight = graphics.getFontMetrics().getHeight();

		graphics.drawString(toPrint, x + (this.currWidth - strWidth) / 2, y
				+ (this.currHeight + strHeight) / 2);

		graphics.drawRect(x, y, this.currWidth - 2, this.currHeight - 2);

		graphics.dispose();
	}

	public void revertToOriginalDimension() {
		this.currHeight = this.origHeight;
		this.currWidth = this.origWidth;
	}
}
