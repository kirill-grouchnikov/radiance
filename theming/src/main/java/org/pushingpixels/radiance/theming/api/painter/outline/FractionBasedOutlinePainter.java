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
package org.pushingpixels.radiance.theming.api.painter.outline;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.painter.FractionBasedPainter;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceInternalArrowButton;

import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.geom.Path2D;

/**
 * Outline painter with fraction-based stops and a color query associated with
 * each stop. This class allows creating multi-gradient borders with exact
 * control over which color is used at every gradient control point.
 *
 * @author Kirill Grouchnikov
 */
public class FractionBasedOutlinePainter extends FractionBasedPainter
	implements RadianceOutlinePainter {

    private float strokeWidth = 1.0f;

	/**
	 * Creates a new fraction-based outline painter.
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
	public FractionBasedOutlinePainter(String displayName, float[] fractions,
		ContainerColorTokensSingleColorQuery[] colorQueries) {
		super(displayName, fractions, colorQueries);
	}

	/**
	 * Creates a new fraction-based outline painter.
	 *
	 * @param displayName
	 *            The display name of this painter.
	 * @param fractions
	 *            The fractions of this painter. Must be strictly increasing,
	 *            starting from 0.0 and ending at 1.0.
	 * @param alphas Alpha channels of this painter. Must have the same size as fractions.
	 * @param colorQueries
	 *            The color queries of this painter. Must have the same size as
	 *            the fractions array, and all entries must be non-
	 *            <code>null</code>.
	 */
	public FractionBasedOutlinePainter(String displayName, float[] fractions,
		int[] alphas, ContainerColorTokensSingleColorQuery[] colorQueries) {
		super(displayName, fractions, alphas, colorQueries);
	}

    public void setStrokeWidth(float strokeWidth) {
        if (strokeWidth <= 0.0f) {
            throw new IllegalArgumentException("Unsupported stroke width " + strokeWidth);
        }
        this.strokeWidth = strokeWidth;
    }

    @Override
    public void paintOutline(Graphics g, Component c, float width, float height,
        double scaleFactor, ShapeSupplier shapeSupplier, ContainerColorTokens colorTokens) {

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(0.5f, 0.5f);

        Color[] drawColors = new Color[this.fractions.length];
        for (int i = 0; i < this.fractions.length; i++) {
            ContainerColorTokensSingleColorQuery colorQuery = this.colorQueries[i];
            Color fromQuery = colorQuery.query(colorTokens);
            int alpha = this.alphas[i];
            int finalAlpha = fromQuery.getAlpha() * alpha / 255;
            Color finalColor = RadianceColorUtilities.getAlphaColor(fromQuery, finalAlpha);
            drawColors[i] = finalColor;
        }

        // issue 433 - the "c" can be null when painting
        // the border of a tree icon used outside the
        // JTree context.
        boolean isSpecialButton = (c != null) && c.getClass()
            .isAnnotationPresent(RadianceInternalArrowButton.class);
        int joinKind = isSpecialButton ? BasicStroke.JOIN_MITER : BasicStroke.JOIN_ROUND;
        int capKind = isSpecialButton ? BasicStroke.CAP_SQUARE : BasicStroke.CAP_BUTT;
        graphics.setStroke(new BasicStroke(this.strokeWidth, capKind, joinKind));

        MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0, height, this.fractions,
            drawColors, CycleMethod.NO_CYCLE);
        graphics.setPaint(gradient);

        if (strokeWidth == 1.0f) {
            Shape outline = shapeSupplier.getShape(c, width, height, 0.0f, 0.0f, scaleFactor);
            graphics.draw(outline);
        } else {
            Path2D outlinePath = new Path2D.Float(Path2D.WIND_EVEN_ODD);
            Shape outlineOuterShape = shapeSupplier.getShape(c, width, height, -0.5f,
                0.0f, scaleFactor);
            Shape outlineInnerShape = shapeSupplier.getShape(c, width, height, strokeWidth - 0.5f,
                0.0f, scaleFactor);
            outlinePath.append(outlineOuterShape, false);
            outlinePath.append(outlineInnerShape, false);
            graphics.fill(outlinePath);
        }
        graphics.dispose();
    }

    @Override
    public float getOutlineInset(InsetKind insetKind) {
        return (insetKind == InsetKind.SURFACE)
            ? this.strokeWidth / 2.0f
            : this.strokeWidth;
    }
}
