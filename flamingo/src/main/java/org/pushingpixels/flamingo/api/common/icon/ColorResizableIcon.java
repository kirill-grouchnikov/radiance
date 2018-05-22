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
package org.pushingpixels.flamingo.api.common.icon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * Implementation of {@link ResizableIcon} that fills the icon with a solid
 * color.
 * 
 * @author Kirill Grouchnikov
 */
public class ColorResizableIcon implements ResizableIcon {
	/**
	 * The current icon width.
	 */
	protected int width;

	/**
	 * The current icon height.
	 */
	protected int height;

	/** Fill color */
	private final Color color;

	/**
	 * Creates a new empty color icon of the specified size and color.
	 * 
	 * @param initialDim
	 *            Initial dimension of the icon.
	 * @param color
	 *            fill color.
	 */
	public ColorResizableIcon(Dimension initialDim, Color color) {
		this.width = initialDim.width;
		this.height = initialDim.height;
		this.color = color;
	}

	/**
	 * Creates a new empty color icon of the specified size and color.
	 * 
	 * @param initialDim
	 *            Initial dimension of the icon.
	 * @param color
	 *            fill color.
	 */
	public ColorResizableIcon(int initialDim, Color color) {
		this(new Dimension(initialDim, initialDim), color);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jvnet.flamingo.common.icon.ResizableIcon#setDimension(java.awt.
	 * Dimension )
	 */
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
	public int getIconHeight() {
		return this.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
	public int getIconWidth() {
		return this.width;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.setColor(this.color);
		g.fillRect(x, y, this.getIconWidth(), this.getIconHeight());
	}
}
