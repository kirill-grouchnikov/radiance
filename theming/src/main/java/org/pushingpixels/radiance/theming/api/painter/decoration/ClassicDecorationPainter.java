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
package org.pushingpixels.radiance.theming.api.painter.decoration;

import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.fill.ClassicFillPainter;

import java.awt.*;

/**
 * Decoration painter that paints a classic gradient. This class is part of
 * officially supported API.
 *
 * @author Kirill Grouchnikov
 */
public class ClassicDecorationPainter implements RadianceDecorationPainter {
	/**
	 * The display name for the decoration painters of this class.
	 */
	public static final String DISPLAY_NAME = "Classic";

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
                                    RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height,
                                    RadianceSkin skin) {
		RadianceColorScheme scheme = skin.getBackgroundColorScheme(decorationAreaType);
		this.internalPaint(graphics, comp, width, height, scheme);
	}

    @Override
    public void paintDecorationArea(Graphics2D graphics, Component comp, RadianceThemingSlices.DecorationAreaType
            decorationAreaType, Shape contour, RadianceColorScheme colorScheme) {
        Graphics2D g2d = (Graphics2D) graphics.create();
        g2d.translate(-3, -3);
        this.painter.paintContourBackground(g2d, comp, contour.getBounds().width,
                contour.getBounds().height, contour, colorScheme);
        g2d.dispose();
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
	 * @param scheme
	 *            Radiance color scheme for painting the area.
	 */
	protected void internalPaint(Graphics2D graphics, Component comp,
			int width, int height, RadianceColorScheme scheme) {
		Graphics2D g2d = (Graphics2D) graphics.create();
		g2d.translate(-3, -3);
		this.painter.paintContourBackground(g2d, comp, width + 6, height + 6,
				new Rectangle(width + 6, height + 6), scheme);
		g2d.dispose();
	}
}
