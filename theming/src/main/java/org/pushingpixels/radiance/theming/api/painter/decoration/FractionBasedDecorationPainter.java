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

import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.FractionBasedPainter;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.util.HashSet;
import java.util.Set;

/**
 * Decoration painter with fraction-based stops and a color query associated
 * with each stop. This class allows creating multi-gradient decorations with
 * exact control over which color is used at every gradient control point.
 * 
 * @author Kirill Grouchnikov
 */
public class FractionBasedDecorationPainter extends FractionBasedPainter
		implements RadianceDecorationPainter {
	private Set<RadianceThemingSlices.DecorationAreaType> decoratedAreas;

	/**
	 * Creates a new fraction-based decoration painter.
	 * 
	 * @param displayName
	 *            The display name of this painter.
	 * @param fractions
	 *            The fractions of this painter. Must be strictly increasing,
	 *            starting from 0.0 and ending at 1.0.
	 * @param colorQueries
	 *            The color queries of this painter. Must have the same size as
	 *            the fractions array, and all entries must be non-
	 *            <code>null</code>.
	 */
	public FractionBasedDecorationPainter(String displayName,
			float[] fractions, ColorSchemeSingleColorQuery[] colorQueries) {
		this(displayName, fractions, colorQueries,
				RadianceThemingSlices.DecorationAreaType.PRIMARY_TITLE_PANE,
				RadianceThemingSlices.DecorationAreaType.SECONDARY_TITLE_PANE);
	}

	/**
	 * Creates a new fraction-based decoration painter.
	 * 
	 * @param displayName
	 *            The display name of this painter.
	 * @param fractions
	 *            The fractions of this painter. Must be strictly increasing,
	 *            starting from 0.0 and ending at 1.0.
	 * @param colorQueries
	 *            The color queries of this painter. Must have the same size as
	 *            the fractions array, and all entries must be non-
	 *            <code>null</code>.
	 * @param decorationAreas
	 *            Decoration areas that should be painted based on the color
	 *            queries. All the rest will be filled with a solid color from
	 *            the background color scheme of the matching decoration area.
	 */
	public FractionBasedDecorationPainter(String displayName,
			float[] fractions, ColorSchemeSingleColorQuery[] colorQueries,
			RadianceThemingSlices.DecorationAreaType... decorationAreas) {
		super(displayName, fractions, colorQueries);
		this.decoratedAreas = new HashSet<>();
		if (decorationAreas != null) {
			for (RadianceThemingSlices.DecorationAreaType decorationArea : decorationAreas) {
				this.decoratedAreas.add(decorationArea);
			}
		}
	}

	@Override
	public void paintDecorationArea(Graphics2D graphics, Component comp,
                                    RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height,
                                    RadianceSkin skin) {
	    RadianceColorScheme colorScheme = skin.getBackgroundColorScheme(decorationAreaType);
		if (this.decoratedAreas.contains(decorationAreaType)) {
			this.paintDecoratedBackground(graphics, comp, decorationAreaType,
					width, height, colorScheme);
		} else {
			this.paintSolidBackground(graphics, width, height, colorScheme);
		}
	}

	@Override
	public void paintDecorationArea(Graphics2D graphics, Component comp, RadianceThemingSlices.DecorationAreaType
			decorationAreaType, Shape contour, RadianceColorScheme colorScheme) {
        if (this.decoratedAreas.contains(decorationAreaType)) {
            this.paintDecoratedBackground(graphics, comp, decorationAreaType,
                    contour, colorScheme);
        } else {
            this.paintSolidBackground(graphics, contour, colorScheme);
        }
	}

	private void paintDecoratedBackground(Graphics2D graphics, Component comp,
                                          RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height,
                                          RadianceColorScheme scheme) {
		Graphics2D g2d = (Graphics2D) graphics.create();
		Color[] fillColors = new Color[this.fractions.length];
		for (int i = 0; i < this.fractions.length; i++) {
			ColorSchemeSingleColorQuery colorQuery = this.colorQueries[i];
			fillColors[i] = colorQuery.query(scheme);
		}

		Component topMostWithSameDecorationAreaType = RadianceCoreUtilities
				.getTopMostParentWithDecorationAreaType(comp,
						decorationAreaType);
		Point inTopMost = SwingUtilities.convertPoint(comp, new Point(0, 0),
				topMostWithSameDecorationAreaType);
		int dy = inTopMost.y;

		MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0,
				topMostWithSameDecorationAreaType.getHeight(), this.fractions,
				fillColors, CycleMethod.REPEAT);
		g2d.setPaint(gradient);
		g2d.translate(0, -dy);
		g2d.fillRect(0, 0, width, topMostWithSameDecorationAreaType.getHeight());

		g2d.dispose();
	}

	private void paintDecoratedBackground(Graphics2D graphics, Component comp,
                                          RadianceThemingSlices.DecorationAreaType decorationAreaType, Shape contour,
                                          RadianceColorScheme scheme) {
		Graphics2D g2d = (Graphics2D) graphics.create();
		Color[] fillColors = new Color[this.fractions.length];
		for (int i = 0; i < this.fractions.length; i++) {
			ColorSchemeSingleColorQuery colorQuery = this.colorQueries[i];
			fillColors[i] = colorQuery.query(scheme);
		}

		Component topMostWithSameDecorationAreaType = RadianceCoreUtilities
				.getTopMostParentWithDecorationAreaType(comp,
						decorationAreaType);
		Point inTopMost = SwingUtilities.convertPoint(comp, new Point(0, 0),
				topMostWithSameDecorationAreaType);
		int dy = inTopMost.y;

		MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0,
				topMostWithSameDecorationAreaType.getHeight(), this.fractions,
				fillColors, CycleMethod.REPEAT);
		g2d.setPaint(gradient);
		g2d.translate(0, -dy);
		g2d.fill(contour);

		g2d.dispose();
	}

	private void paintSolidBackground(Graphics2D graphics,
			int width, int height, RadianceColorScheme scheme) {
		graphics.setColor(scheme.getMidColor());
		graphics.fillRect(0, 0, width, height);
	}

	private void paintSolidBackground(Graphics2D graphics,
			Shape contour, RadianceColorScheme scheme) {
		graphics.setColor(scheme.getMidColor());
		graphics.fill(contour);
	}
}
