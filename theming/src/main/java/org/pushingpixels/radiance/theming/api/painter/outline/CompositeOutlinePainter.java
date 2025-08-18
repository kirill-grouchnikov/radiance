/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of the copyright holder nor the names of
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
package org.pushingpixels.radiance.theming.api.painter.outline;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

/**
 * Composite outline painter that delegates the painting of outer and inner
 * outlines.
 * 
 * @author Kirill Grouchnikov
 */
public class CompositeOutlinePainter implements RadianceOutlinePainter {
	/**
	 * Display name of this outline painter.
	 */
	private String displayName;

	/**
	 * Delegate painter for painting the inner outlines.
	 */
	private RadianceOutlinePainter inner;

	/**
	 * Delegate painter for painting the outer outlines.
	 */
	private RadianceOutlinePainter outer;

	/**
	 * Creates a new composite outline painter.
	 * 
	 * @param displayName
	 *            Display name.
	 * @param outer
	 *            Delegate painter for painting the outer outlines.
	 * @param inner
	 *            Delegate painter for painting the inner outlines.
	 */
	public CompositeOutlinePainter(String displayName,
			RadianceOutlinePainter outer, RadianceOutlinePainter inner) {
		this.displayName = displayName;
		this.outer = outer;
		this.inner = inner;
	}

    @Override
    public void paintOutline(Graphics g, Component c, float width, float height,
        double scaleFactor, ShapeSuppler shapeSupplier, ContainerColorTokens colorTokens) {

        // Skip inner outline in text components, scrollbars, and in renderer-hosted components in
        // the file chooser container
        boolean skipInnerOutline = (c instanceof JTextComponent)
            || (c instanceof JScrollBar)
            || ((SwingUtilities.getAncestorOfClass(CellRendererPane.class, c) != null)
            && (SwingUtilities.getAncestorOfClass(JFileChooser.class, c) != null));

        Graphics2D g2d = (Graphics2D) g.create();

        if (!skipInnerOutline) {
            g2d.translate(1, 1);
            this.inner.paintOutline(g2d, c, width - 2.0f, height - 2.0f, scaleFactor,
                shapeSupplier, colorTokens);
            g2d.translate(-1, -1);
        }
        this.outer.paintOutline(g2d, c, width, height, scaleFactor, shapeSupplier,
            colorTokens);
        g2d.dispose();
    }

    @Override
	public String getDisplayName() {
		return this.displayName;
	}

}
