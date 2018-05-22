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
package org.pushingpixels.substance.api.painter.highlight;

import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.GlassFillPainter;

/**
 * Highlight painter that paints a glass gradient. This class is part of
 * officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 4.3
 */
public class GlassHighlightPainter implements SubstanceHighlightPainter {
	/**
	 * The display name for the highlight painters of this class.
	 */
	public static final String DISPLAY_NAME = "Glass";

	/**
	 * Single gradient painter instance.
	 */
	protected GlassFillPainter painter;

	/**
	 * Creates new classic title painter.
	 */
	public GlassHighlightPainter() {
		this.painter = new GlassFillPainter();
	}

    @Override
	public String getDisplayName() {
		return DISPLAY_NAME;
	}

	@Override
	public void paintHighlight(Graphics2D graphics, Component comp, int width,
			int height, SubstanceColorScheme colorScheme) {
		Graphics2D g2d = (Graphics2D) graphics.create();
		g2d.translate(-3, -3);
		this.painter
				.paintContourBackground(g2d, comp, width + 6, height + 6,
						new Rectangle(width + 6, height + 6), false,
						colorScheme, false);
		g2d.dispose();
	}
}
