/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.painter.FractionBasedPainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Decoration painter with fraction-based stops and a color query associated
 * with each stop. This class allows creating multi-gradient decorations with
 * exact control over which color is used at every gradient control point.
 * 
 * @author Kirill Grouchnikov
 */
public class FractionBasedDecorationPainter extends RadianceDecorationPainter {
	/**
	 * The display name of this painter.
	 */
	private String displayName;

	/**
	 * The fractions of this painter. If the constructor has not thrown an
	 * {@link IllegalArgumentException}, the entries in this array are strictly
	 * increasing, starting from 0.0 and ending at 1.0.
	 */
	protected float[] fractions;

	/**
	 * The alphas of this painter. Each entry in this array corresponds to the matching entry in
	 * {@link #fractions} and {@link #colorQueries}. Each entry is applied to the matching
	 * {@link #colorQueries} entry to determine the final color at the {@link #fractions} entry.
	 */
	protected int[] alphas;

	/**
	 * The color queries of this painter. Each entry in this array corresponds
	 * to the matching index in the {@link #fractions}, specifying which color
	 * will be used at the relevant gradient control point. If the constructor
	 * has not thrown an {@link IllegalArgumentException}, the size of this
	 * array is identical to the size of {@link #fractions}, and there are no
	 * <code>null</code> entries in this array. Note that the application code
	 * can still cause an exception at runtime by throwing it in the
	 * implementation of the
	 * {@link ContainerColorTokensSingleColorQuery#query(ContainerColorTokens)} method.
	 */
	protected ContainerColorTokensSingleColorQuery[] colorQueries;

	private Set<RadianceThemingSlices.DecorationAreaType> decoratedAreas;

	private static int[] makeDefaultAlphas(int count) {
		int[] result = new int[count];
		Arrays.fill(result, 255);
		return result;
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
	 */
	public FractionBasedDecorationPainter(String displayName,
			float[] fractions, ContainerColorTokensSingleColorQuery[] colorQueries) {
		this(displayName, fractions, makeDefaultAlphas(fractions.length), colorQueries,
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
	 *            the background color tokens of the matching decoration area.
	 */
	public FractionBasedDecorationPainter(String displayName, float[] fractions,
		int[] alphas, ContainerColorTokensSingleColorQuery[] colorQueries,
		RadianceThemingSlices.DecorationAreaType... decorationAreas) {
		this.displayName = displayName;
		if ((fractions == null) || (alphas == null) || (colorQueries == null)) {
			throw new IllegalArgumentException("Cannot pass null arguments");
		}
		if ((fractions.length != alphas.length) || (fractions.length != colorQueries.length)) {
			throw new IllegalArgumentException("Argument length does not match");
		}
		int length = fractions.length;
		if ((fractions[0] != 0.0f) || (fractions[length - 1] != 1.0f)) {
			throw new IllegalArgumentException(
				"End fractions must be 0.0 and 1.0");
		}
		for (int i = 0; i < length - 1; i++) {
			if (fractions[i + 1] <= fractions[i]) {
				throw new IllegalArgumentException(
					"Fractions must be strictly increasing");
			}
		}
		for (int i = 0; i < length; i++) {
			if (colorQueries[i] == null) {
				throw new IllegalArgumentException("Cannot pass null query");
			}
		}
		this.fractions = new float[length];
		System.arraycopy(fractions, 0, this.fractions, 0, length);
		this.alphas = new int[length];
		System.arraycopy(alphas, 0, this.alphas, 0, length);
		this.colorQueries = new ContainerColorTokensSingleColorQuery[length];
		System.arraycopy(colorQueries, 0, this.colorQueries, 0, length);

		this.decoratedAreas = new HashSet<>();
		if (decorationAreas != null) {
            this.decoratedAreas.addAll(Arrays.asList(decorationAreas));
		}
	}

	@Override
	public String getDisplayName() {
		return this.displayName;
	}

	@Override
	public void paintDecorationArea(Graphics2D graphics, Component comp,
			RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height,
			RadianceSkin skin) {
		ContainerColorTokens colorTokens =
			skin.getNeutralContainerTokens(decorationAreaType);
		if (this.decoratedAreas.contains(decorationAreaType)) {
			this.paintDecoratedBackground(graphics, comp, decorationAreaType,
					width, height, colorTokens);
		} else {
			this.paintSolidBackground(graphics, width, height, colorTokens);
		}
	}

    @Override
	public void paintDecorationArea(Graphics2D graphics, Component comp,
		RadianceThemingSlices.DecorationAreaType decorationAreaType, Shape outline,
		ContainerColorTokens colorTokens) {

		if (this.decoratedAreas.contains(decorationAreaType)) {
			this.paintDecoratedBackground(graphics, comp, decorationAreaType, outline, colorTokens);
		} else {
			this.paintSolidBackground(graphics, outline, colorTokens);
		}
	}

	private void paintDecoratedBackground(Graphics2D graphics, Component comp,
		RadianceThemingSlices.DecorationAreaType decorationAreaType, int width, int height,
		ContainerColorTokens colorTokens) {

		Graphics2D g2d = (Graphics2D) graphics.create();
		Color[] drawColors = new Color[this.fractions.length];
		for (int i = 0; i < this.fractions.length; i++) {
			ContainerColorTokensSingleColorQuery colorQuery = this.colorQueries[i];
			Color fromQuery = colorQuery.query(colorTokens);
			int alpha = this.alphas[i];
			int finalAlpha = fromQuery.getAlpha() * alpha / 255;
			Color finalColor = RadianceColorUtilities.getAlphaColor(fromQuery, finalAlpha);
			drawColors[i] = finalColor;
		}

		Component topMostWithSameDecorationAreaType = RadianceCoreUtilities
				.getTopMostParentWithDecorationAreaType(comp,
						decorationAreaType);
		Point inTopMost = SwingUtilities.convertPoint(comp, new Point(0, 0),
				topMostWithSameDecorationAreaType);
		int dy = inTopMost.y;

		MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0,
			topMostWithSameDecorationAreaType.getHeight(), this.fractions,
			drawColors, CycleMethod.NO_CYCLE);
		g2d.setPaint(gradient);
		g2d.translate(0, -dy);
		g2d.fillRect(0, 0, width, topMostWithSameDecorationAreaType.getHeight());

		g2d.dispose();
	}

	private void paintDecoratedBackground(Graphics2D graphics, Component comp,
		RadianceThemingSlices.DecorationAreaType decorationAreaType, Shape outline,
		ContainerColorTokens colorTokens) {

		Graphics2D g2d = (Graphics2D) graphics.create();
		Color[] drawColors = new Color[this.fractions.length];
		for (int i = 0; i < this.fractions.length; i++) {
			ContainerColorTokensSingleColorQuery colorQuery = this.colorQueries[i];
			Color fromQuery = colorQuery.query(colorTokens);
			int alpha = this.alphas[i];
			int finalAlpha = fromQuery.getAlpha() * alpha / 255;
			Color finalColor = RadianceColorUtilities.getAlphaColor(fromQuery, finalAlpha);
			drawColors[i] = finalColor;
		}

		Component topMostWithSameDecorationAreaType = RadianceCoreUtilities
				.getTopMostParentWithDecorationAreaType(comp,
						decorationAreaType);
		Point inTopMost = SwingUtilities.convertPoint(comp, new Point(0, 0),
				topMostWithSameDecorationAreaType);
		int dy = inTopMost.y;

		MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0,
			topMostWithSameDecorationAreaType.getHeight(), this.fractions,
			drawColors, CycleMethod.NO_CYCLE);
		g2d.setPaint(gradient);
		g2d.translate(0, -dy);
		g2d.fill(outline);

		g2d.dispose();
	}

	private void paintSolidBackground(Graphics2D graphics, int width, int height,
		ContainerColorTokens colorTokens) {

		graphics.setColor(colorTokens.getContainerSurface());
		graphics.fillRect(0, 0, width, height);
	}

	private void paintSolidBackground(Graphics2D graphics, Shape outline,
		ContainerColorTokens colorTokens) {

		graphics.setColor(colorTokens.getContainerSurface());
		graphics.fill(outline);
	}
}
