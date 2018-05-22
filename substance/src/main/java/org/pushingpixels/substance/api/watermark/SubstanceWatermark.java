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
package org.pushingpixels.substance.api.watermark;

import java.awt.Component;
import java.awt.Graphics;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.trait.SubstanceTrait;

/**
 * Interface for watermarks. This class is part of officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public interface SubstanceWatermark extends SubstanceTrait {
	/**
	 * Draws the watermark on the specified graphics context in the specified
	 * region.
	 * 
	 * @param graphics
	 *            Graphics context.
	 * @param c
	 *            Component that is painted.
	 * @param x
	 *            Left X of the region.
	 * @param y
	 *            Top Y of the region.
	 * @param width
	 *            Region width.
	 * @param height
	 *            Region height.
	 */
	public void drawWatermarkImage(Graphics graphics, Component c, int x,
			int y, int width, int height);

	/**
	 * Updates the current watermark image.
	 * 
	 * @param skin
	 *            Skin for the watermark.
	 * @return <code>true</code> if the watermark has been updated successfully,
	 *         <code>false</code> otherwise.
	 */
	public boolean updateWatermarkImage(SubstanceSkin skin);

	/**
	 * Draws the preview of the watermark image.
	 * 
	 * @param g
	 *            Graphic context.
	 * @param skin
	 *            Optional skin to use for the preview. Can be ignored by the
	 *            implementation.
	 * @param x
	 *            the <i>x</i> coordinate of the watermark to be drawn.
	 * @param y
	 *            The <i>y</i> coordinate of the watermark to be drawn.
	 * @param width
	 *            The width of the watermark to be drawn.
	 * @param height
	 *            The height of the watermark to be drawn.
	 */
	public void previewWatermark(Graphics g, SubstanceSkin skin, int x, int y,
			int width, int height);

	/**
	 * Disposes the memory associated with <code>this</code> watermark.
	 */
	public void dispose();
}
