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
package org.pushingpixels.substance.api.painter.decoration;

import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.ClassicFillPainter;
import org.pushingpixels.substance.internal.contrib.intellij.UIUtil;
import org.pushingpixels.substance.internal.utils.HashMapKey;
import org.pushingpixels.substance.internal.utils.LazyResettableHashMap;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Decoration painter that paints a classic gradient. This class is part of
 * officially supported API.
 * 
 * @author Kirill Grouchnikov
 * @since version 4.3
 */
public class ClassicDecorationPainter implements SubstanceDecorationPainter {
	/**
	 * The display name for the decoraion painters of this class.
	 */
	public static final String DISPLAY_NAME = "Classic";

	/**
	 * Cache for small objects.
	 */
	protected final static LazyResettableHashMap<BufferedImage> smallImageCache = new LazyResettableHashMap<BufferedImage>(
			"ClassicDecorationPainter");

	/**
	 * Single gradient painter instance.
	 */
	protected ClassicFillPainter painter;

	/**
	 * Creates new classic title painter.
	 */
	public ClassicDecorationPainter() {
		this.painter = new ClassicFillPainter();
	}

    @Override
	public String getDisplayName() {
		return DISPLAY_NAME;
	}

	@Override
	public void paintDecorationArea(Graphics2D graphics, Component comp,
			DecorationAreaType decorationAreaType, int width, int height,
			SubstanceSkin skin) {
		SubstanceColorScheme scheme = skin
				.getBackgroundColorScheme(decorationAreaType);
		if (width * height < 100000) {
			HashMapKey key = SubstanceCoreUtilities.getHashKey(width, height,
					scheme.getDisplayName());
			BufferedImage result = smallImageCache.get(key);
			if (result == null) {
				result = SubstanceCoreUtilities.getBlankImage(width, height);
				this.internalPaint((Graphics2D) result.getGraphics(), comp,
						width, height, scheme);
				smallImageCache.put(key, result);
			}
			double imageScale = UIUtil.getScaleFactor();
			graphics.drawImage(result, 0, 0, (int) (result.getWidth() / imageScale), 
			        (int) (result.getHeight() / imageScale), null);
			return;
		}

		this.internalPaint(graphics, comp, width, height, scheme);
	}

	/**
	 * Paints the specified area.
	 * 
	 * @param graphics
	 *            Graphics context.
	 * @param comp
	 *            Component.
	 * @param width
	 *            Width.
	 * @param height
	 *            Height.
	 * @param leftTitleX
	 *            Title start poisition.
	 * @param rightTitleX
	 *            Title end position.
	 * @param scheme
	 *            Substance color scheme for painting the area.
	 */
	protected void internalPaint(Graphics2D graphics, Component comp,
			int width, int height, SubstanceColorScheme scheme) {
		Graphics2D g2d = (Graphics2D) graphics.create();
		g2d.translate(-3, -3);
		this.painter.paintContourBackground(g2d, comp, width + 6, height + 6,
				new Rectangle(width + 6, height + 6), false, scheme, false);
		g2d.dispose();
	}
}
