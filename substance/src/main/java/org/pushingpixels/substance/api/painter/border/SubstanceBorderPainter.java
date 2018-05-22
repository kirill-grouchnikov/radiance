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
package org.pushingpixels.substance.api.painter.border;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.api.trait.SubstanceTrait;

/**
 * Border painter interface for <b>Substance</b> look and feel. This class is
 * part of officially supported API.<br>
 * <br>
 * 
 * Starting from version 4.0, the borders of some controls (buttons, check
 * boxes, tabs, scroll bars etc) are painted by border painters. Up until
 * version 4.0 this has been done by gradient painters (
 * {@link SubstanceFillPainter}) instead. Note that a custom gradient painter
 * may continue painting the borders, but these will be overriden by the current
 * border painter.
 * 
 * @author Kirill Grouchnikov
 * @since version 4.0
 */
public interface SubstanceBorderPainter extends SubstanceTrait {
	/**
	 * Paints the control border.
	 * 
	 * @param g
	 *            Graphics.
	 * @param c
	 *            Component.
	 * @param width
	 *            Width of a UI component.
	 * @param height
	 *            Height of a UI component.
	 * @param contour
	 *            Contour of a UI component.
	 * @param innerContour
	 *            Inner contour of a UI component. May be ignored if the
	 *            specific implementation paints only the outside border.
	 * @param borderScheme
	 *            The border color scheme.
	 */
	public void paintBorder(Graphics g, Component c, float width, float height,
			Shape contour, Shape innerContour, SubstanceColorScheme borderScheme);

	/**
	 * Returns boolean indication whether this border painter is painting the
	 * inner contours.
	 * 
	 * @return <code>true</code> if this border painter is painting the inner
	 *         contours, <code>false</code> otherwise.
	 */
	public boolean isPaintingInnerContour();
	
	public Color getRepresentativeColor(SubstanceColorScheme borderScheme);
}
