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
package org.pushingpixels.substance.extras.api.painterpack.fill;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.extras.api.colorschemepack.MixColorScheme;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Fill painter that wraps any other fill painter to support mixed color schemes
 * ({@link MixColorScheme}).
 * 
 * @author Kirill Grouchnikov
 */
public class MixDelegateFillPainter implements SubstanceFillPainter {
	/**
	 * Display name of <code>this</code> painter.
	 */
	protected String painterName;

	/**
	 * Mandatory delegate painter.
	 */
	protected SubstanceFillPainter delegate;

	/**
	 * Creates a new wave-overlaying painter.
	 * 
	 * @param painterName
	 *            Painter display name.
	 * @param delegate
	 *            Delegate painter.
	 */
	public MixDelegateFillPainter(String painterName,
			SubstanceFillPainter delegate) {
		this.painterName = painterName;
		this.delegate = delegate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pushingpixels.substance.painter.SubstanceGradientPainter#getDisplayName
	 * ()
	 */
	public String getDisplayName() {
		return this.painterName;
	}

	@Override
	public void paintContourBackground(Graphics g, Component comp, float width, float height,
	        Shape contour, boolean isFocused, SubstanceColorScheme fillScheme, boolean hasShine) {
		if (fillScheme instanceof MixColorScheme) {
			MixColorScheme mixColorScheme = (MixColorScheme) fillScheme;
			SubstanceColorScheme[] origSchemes = mixColorScheme
					.getOrigSchemes();

	        int iWidth = (int) Math.ceil(width);
	        int iHeight = (int) Math.ceil(height);
			BufferedImage[] components = new BufferedImage[origSchemes.length];
			for (int i = 0; i < origSchemes.length; i++) {
				components[i] = SubstanceCoreUtilities.getBlankImage(iWidth,
						iHeight);
				Graphics2D g2d = components[i].createGraphics();
				this.delegate.paintContourBackground(g2d, comp, width, height,
						contour, isFocused, origSchemes[i], hasShine);
				g2d.dispose();
			}

			// Let the blending begin
			BufferedImage current = components[0];
			for (int i = 1; i < components.length; i++) {
				double start = (i - 0.3) / components.length;
				double end = (i + 0.3) / components.length;
				current = SubstanceCoreUtilities.blendImagesHorizontal(current,
						components[i], start, end);
			}
			double scaleFactor = UIUtil.getScaleFactor();
			Graphics2D g2d = (Graphics2D) g.create();
			g2d.drawImage(current, 0, 0, (int) (current.getWidth() / scaleFactor),
			        (int) (current.getHeight() / scaleFactor), null);
			g2d.dispose();
			return;
		}

		this.delegate.paintContourBackground(g, comp, width, height, contour,
				isFocused, fillScheme, hasShine);
	}

}
