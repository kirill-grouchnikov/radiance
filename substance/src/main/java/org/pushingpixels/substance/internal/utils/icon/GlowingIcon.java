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
package org.pushingpixels.substance.internal.utils.icon;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;
import org.pushingpixels.substance.api.icon.SubstanceIconUIResource;
import org.pushingpixels.substance.internal.animation.IconGlowTracker;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

public class GlowingIcon implements Icon, IsHiDpiAware {
	protected Icon delegate;

	protected IconGlowTracker iconGlowTracker;

	protected Map<Float, Icon> iconMap;

	private float glowDampeningFactor = 3.0f;
	
	public GlowingIcon(Icon delegate, IconGlowTracker iconGlowTracker) {
		this.delegate = delegate;
		this.iconGlowTracker = iconGlowTracker;
		this.iconMap = new HashMap<Float, Icon>();
	}
	
	public void setDampeningFactor(float dampeningFactor) {
	    glowDampeningFactor = dampeningFactor;
	}
	
	@Override
	public boolean isHiDpiAware() {
		return (this.delegate instanceof IsHiDpiAware) && 
				((IsHiDpiAware) this.delegate).isHiDpiAware();
	}

	public Icon getDelegate() {
		return this.delegate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
	public int getIconHeight() {
		return this.delegate.getIconHeight();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
	public int getIconWidth() {
		return this.delegate.getIconWidth();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (this.delegate == null)
			return;
		float fadePos = this.iconGlowTracker.getIconGlowPosition();
		// System.out.println(fadePos);
		Icon toPaint = this.iconMap.get(fadePos);
		if (toPaint == null) {
			int width = this.getIconWidth();
			int height = this.getIconHeight();
			BufferedImage image = SubstanceCoreUtilities.getBlankImage(width,
					height);
			Graphics2D graphics = (Graphics2D) image.getGraphics();
			//graphics.scale(1.0f / scale, 1.0f / scale);
			this.delegate.paintIcon(c, graphics, 0, 0);
			int pixelWidth = image.getWidth();
			int pixelHeight = image.getHeight();
			for (int i = 0; i < pixelWidth; i++) {
				for (int j = 0; j < pixelHeight; j++) {
					int rgba = image.getRGB(i, j);
					int transp = (rgba >>> 24) & 0xFF;
					double coef = Math.sin(2.0 * Math.PI * fadePos / 2.0) / glowDampeningFactor;
					Color newColor = (coef >= 0.0) ? SubstanceColorUtilities
							.getLighterColor(new Color(rgba), coef)
							: SubstanceColorUtilities.getDarkerColor(new Color(
									rgba), -coef);
					image.setRGB(i, j, (transp << 24)
							| (newColor.getRed() << 16)
							| (newColor.getGreen() << 8) | newColor.getBlue());
				}
			}
			toPaint = isHiDpiAware() ? new SubstanceIconUIResource(image) : new ImageIcon(image);
			this.iconMap.put(fadePos, toPaint);
		}
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.translate(x, y);
		toPaint.paintIcon(c, g, 0, 0);
		g2d.dispose();
	}
}
