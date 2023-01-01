/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.utils.icon;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.internal.animation.IconGlowTracker;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.ScaleAwareImageWrapperIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class GlowingIcon implements Icon {
	private Icon delegate;

	private IconGlowTracker iconGlowTracker;

	private Map<Float, Icon> iconMap;

	private float glowDampeningFactor = 3.0f;
	
	public GlowingIcon(Icon delegate, IconGlowTracker iconGlowTracker) {
		this.delegate = delegate;
		this.iconGlowTracker = iconGlowTracker;
		this.iconMap = new HashMap<>();
	}
	
	public void setDampeningFactor(float dampeningFactor) {
	    glowDampeningFactor = dampeningFactor;
	}

	@Override
	public int getIconHeight() {
		return this.delegate.getIconHeight();
	}

	@Override
	public int getIconWidth() {
		return this.delegate.getIconWidth();
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (this.delegate == null)
			return;
		float fadePos = this.iconGlowTracker.getIconGlowPosition();
		// System.out.println(fadePos);
		Icon toPaint = this.iconMap.get(fadePos);
		if (toPaint == null) {
			int width = this.getIconWidth();
			int height = this.getIconHeight();
			double scale = RadianceCommonCortex.getScaleFactor(c);
			BufferedImage image = RadianceCoreUtilities.getBlankImage(scale, width, height);
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
					Color newColor = (coef >= 0.0) ? RadianceColorUtilities
							.getLighterColor(new Color(rgba), coef)
							: RadianceColorUtilities.getDarkerColor(new Color(
									rgba), -coef);
					image.setRGB(i, j, (transp << 24)
							| (newColor.getRed() << 16)
							| (newColor.getGreen() << 8) | newColor.getBlue());
				}
			}
			toPaint = new ScaleAwareImageWrapperIcon(image, scale);
			this.iconMap.put(fadePos, toPaint);
		}
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.translate(x, y);
		toPaint.paintIcon(c, g, 0, 0);
		g2d.dispose();
	}
}
