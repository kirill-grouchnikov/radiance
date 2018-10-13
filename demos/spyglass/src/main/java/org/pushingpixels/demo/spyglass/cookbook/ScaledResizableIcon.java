/*
 * Copyright (c) 2005-2018 Spyglass Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Spyglass Kirill Grouchnikov nor the names of
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
package org.pushingpixels.demo.spyglass.cookbook;

import org.pushingpixels.neon.icon.ResizableIcon;

import java.awt.*;

/**
 * Custom implementation of resizable icon that allows scaling down another
 * resizable icon during the painting.
 * 
 * @author Kirill Grouchnikov
 */
public class ScaledResizableIcon implements ResizableIcon {
	private ResizableIcon delegate;

	private double scaleFactor;

	public ScaledResizableIcon(ResizableIcon delegate, double scaleFactor) {
		this.delegate = delegate;
		this.scaleFactor = scaleFactor;
	}

	public int getIconHeight() {
		return delegate.getIconHeight();
	}

	public int getIconWidth() {
		return delegate.getIconWidth();
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		double dx = this.getIconWidth() * (1.0 - this.scaleFactor) / 2;
		double dy = this.getIconHeight() * (1.0 - this.scaleFactor) / 2;

		g2d.translate((int) dx, (int) dy);
		g2d.scale(this.scaleFactor, this.scaleFactor);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		delegate.paintIcon(c, g2d, x, y);

		g2d.dispose();
	}

	public void setDimension(Dimension newDimension) {
		delegate.setDimension(newDimension);
	}
}
