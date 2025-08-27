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
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceInternalArrowButton;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.geom.Path2D;
import java.util.Arrays;

/**
 * Inlay outline painter that paints a double outline, with the inner one following the shape
 * of the outer one with no gaps between them.
 * 
 * @author Kirill Grouchnikov
 */
public class InlayOutlinePainter implements RadianceOutlinePainter {
	/**
	 * Display name of this outline painter.
	 */
	private String displayName;

    private float strokeWidth;

    /**
     * The fractions for the outer outline. If the constructor has not thrown an
     * {@link IllegalArgumentException}, the entries in this array are strictly
     * increasing, starting from 0.0 and ending at 1.0.
     */
    private float[] outerFractions;

    /**
     * The alphas for the outer outline. Each entry in this array corresponds to the matching entry
     * in {@link #outerFractions} and {@link #outerColorQueries}. Each entry is applied to the
     * matching {@link #outerColorQueries} entry to determine the final color at the
     * {@link #outerFractions} entry.
     */
    private int[] outerAlphas;

    /**
     * The color queries for the outer outline. Each entry in this array corresponds
     * to the matching index in the {@link #outerFractions}, specifying which color
     * will be used at the relevant gradient control point. If the constructor
     * has not thrown an {@link IllegalArgumentException}, the size of this
     * array is identical to the size of {@link #outerFractions}, and there are no
     * <code>null</code> entries in this array. Note that the application code
     * can still cause an exception at runtime by throwing it in the
     * implementation of the
     * {@link ContainerColorTokensSingleColorQuery#query(ContainerColorTokens)} method.
     */
    private ContainerColorTokensSingleColorQuery[] outerColorQueries;

    /**
     * The fractions for the inner outline. If the constructor has not thrown an
     * {@link IllegalArgumentException}, the entries in this array are strictly
     * increasing, starting from 0.0 and ending at 1.0.
     */
    private float[] innerFractions;

    /**
     * The alphas for the inner outline. Each entry in this array corresponds to the matching entry
     * in {@link #innerFractions} and {@link #innerColorQueries}. Each entry is applied to the
     * matching {@link #innerColorQueries} entry to determine the final color at the
     * {@link #innerFractions} entry.
     */
    private int[] innerAlphas;

    /**
     * The color queries for the inner outline. Each entry in this array corresponds
     * to the matching index in the {@link #innerFractions}, specifying which color
     * will be used at the relevant gradient control point. If the constructor
     * has not thrown an {@link IllegalArgumentException}, the size of this
     * array is identical to the size of {@link #innerFractions}, and there are no
     * <code>null</code> entries in this array. Note that the application code
     * can still cause an exception at runtime by throwing it in the
     * implementation of the
     * {@link ContainerColorTokensSingleColorQuery#query(ContainerColorTokens)} method.
     */
    private ContainerColorTokensSingleColorQuery[] innerColorQueries;

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String displayName = null;
        private float strokeWidth = 1.0f;
        private float[] outerFractions = new float[] {0.0f, 1.0f};
        private int[] outerAlphas = new int[] {255, 255};
        private ContainerColorTokensSingleColorQuery[] outerColorQueries =
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerOutline,
                ContainerColorTokens::getContainerOutline};
        private float[] innerFractions = new float[] {0.0f, 1.0f};
        private int[] innerAlphas = new int[] {64, 64};
        private ContainerColorTokensSingleColorQuery[] innerColorQueries =
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getComplementaryContainerOutline,
                ContainerColorTokens::getComplementaryContainerOutline
            };

        private Builder() {}

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder strokeWidth(float strokeWidth) {
            if (strokeWidth <= 0.0f) {
                throw new IllegalArgumentException("Unsupported stroke width " + strokeWidth);
            }
            this.strokeWidth = strokeWidth;
            return this;
        }

        private void verify(float[] fractions, int[] alphas,
            ContainerColorTokensSingleColorQuery[] colorQueries) {
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
        }

        private static int[] makeDefaultAlphas(int count) {
            int[] result = new int[count];
            Arrays.fill(result, 255);
            return result;
        }

        public Builder outer(ContainerColorTokensSingleColorQuery colorQuery) {
            this.outerColorQueries = new ContainerColorTokensSingleColorQuery[] {
                colorQuery,
                colorQuery
            };
            return this;
        }

        public Builder outer(float[] outerFractions, int[] outerAlphas,
            ContainerColorTokensSingleColorQuery[] outerColorQueries) {
            verify(outerFractions, outerAlphas, outerColorQueries);

            int length = outerFractions.length;
            this.outerFractions = new float[length];
            System.arraycopy(outerFractions, 0, this.outerFractions, 0, length);
            this.outerAlphas = new int[length];
            System.arraycopy(outerAlphas, 0, this.outerAlphas, 0, length);
            this.outerColorQueries = new ContainerColorTokensSingleColorQuery[length];
            System.arraycopy(outerColorQueries, 0, this.outerColorQueries, 0, length);

            return this;
        }

        public Builder outer(float[] outerFractions,
            ContainerColorTokensSingleColorQuery[] outerColorQueries) {

            return this.outer(outerFractions, makeDefaultAlphas(outerFractions.length),
                outerColorQueries);
        }

        public Builder inner(ContainerColorTokensSingleColorQuery colorQuery) {
            this.innerColorQueries = new ContainerColorTokensSingleColorQuery[] {
                colorQuery,
                colorQuery
            };
            return this;
        }

        public Builder inner(float[] innerFractions, int[] innerAlphas,
            ContainerColorTokensSingleColorQuery[] innerColorQueries) {
            verify(innerFractions, innerAlphas, innerColorQueries);

            int length = innerFractions.length;
            this.innerFractions = new float[length];
            System.arraycopy(innerFractions, 0, this.innerFractions, 0, length);
            this.innerAlphas = new int[length];
            System.arraycopy(innerAlphas, 0, this.innerAlphas, 0, length);
            this.innerColorQueries = new ContainerColorTokensSingleColorQuery[length];
            System.arraycopy(innerColorQueries, 0, this.innerColorQueries, 0, length);

            return this;
        }

        public Builder inner(float[] innerFractions,
            ContainerColorTokensSingleColorQuery[] innerColorQueries) {

            return this.inner(innerFractions, makeDefaultAlphas(innerFractions.length),
                innerColorQueries);
        }

        public InlayOutlinePainter build() {
            InlayOutlinePainter result = new InlayOutlinePainter();
            result.displayName = this.displayName;
            result.strokeWidth = this.strokeWidth;
            result.outerFractions = this.outerFractions;
            result.outerAlphas = this.outerAlphas;
            result.outerColorQueries = this.outerColorQueries;
            result.innerFractions = this.innerFractions;
            result.innerAlphas = this.innerAlphas;
            result.innerColorQueries = this.innerColorQueries;
            return result;
        }
    }

    private InlayOutlinePainter() {

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
        g2d.translate(0.5f, 0.5f);

        if (!skipInnerOutline) {
            g2d.translate(this.strokeWidth, this.strokeWidth);
            // In theory, the radius adjustment for the inner outline should be the full stroke
            // width - for perfect concentric rounded corners. In practice, for smaller corners,
            // reducing the inner outline radius by the full stroke width results in inner outline
            // corners that are too tight. This might be revisited in the future.
            float innerOutlineRadiusAdjustment = this.strokeWidth / 2.0f;
            paint(g2d, c, width - 2.0f * this.strokeWidth, height - 2.0f * strokeWidth,
                innerOutlineRadiusAdjustment, scaleFactor, shapeSupplier, colorTokens,
                this.strokeWidth, this.innerFractions, this.innerAlphas, this.innerColorQueries);
            g2d.translate(-this.strokeWidth, -this.strokeWidth);
        }
        paint(g2d, c, width, height, /* radiusAdjustment */ 0.0f,
            scaleFactor, shapeSupplier, colorTokens, this.strokeWidth,
            this.outerFractions, this.outerAlphas, this.outerColorQueries);
        g2d.dispose();
    }

    private static void paint(Graphics2D graphics, Component c, float width, float height,
        float radiusAdjustment, double scaleFactor, ShapeSuppler shapeSupplier,
        ContainerColorTokens colorTokens, float strokeWidth, float[] fractions, int[] alphas,
        ContainerColorTokensSingleColorQuery[] colorQueries) {

        Color[] drawColors = new Color[fractions.length];
        for (int i = 0; i < fractions.length; i++) {
            ContainerColorTokensSingleColorQuery colorQuery = colorQueries[i];
            Color fromQuery = colorQuery.query(colorTokens);
            int alpha = alphas[i];
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
        graphics.setStroke(new BasicStroke(strokeWidth, capKind, joinKind));

        MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, 0, height, fractions,
            drawColors, MultipleGradientPaint.CycleMethod.NO_CYCLE);
        graphics.setPaint(gradient);

        if (strokeWidth == 1.0f) {
            Shape outline = shapeSupplier.getShape(c, width, height, 0.0f, radiusAdjustment, scaleFactor);
            graphics.draw(outline);
        } else {
            Path2D outlinePath = new Path2D.Float(Path2D.WIND_EVEN_ODD);
            Shape outlineOuterShape = shapeSupplier.getShape(c, width, height, -0.5f,
                radiusAdjustment, scaleFactor);
            Shape outlineInnerShape = shapeSupplier.getShape(c, width, height, 1.5f,
                radiusAdjustment, scaleFactor);
            outlinePath.append(outlineOuterShape, false);
            outlinePath.append(outlineInnerShape, false);
            graphics.fill(outlinePath);
        }
    }

    @Override
    public float getOutlineInset(InsetKind insetKind) {
        if (insetKind == InsetKind.SURFACE) {
            // Ignore the inner outline, and treat surface to extend halfway into the outer outline
            return this.strokeWidth / 2.0f;
        }
        // For content, both outlines are considered. However, to preserve the layout alignment
        // between single outlines (from {@link FractionBasedOutlinePainter) and double outlines
        // from this painter - at default hairline stroke width - make a special case where only
        // the outer outline is considered for the content insets.
        if (this.strokeWidth <= 1.0f) {
            return this.strokeWidth;
        }
        return 2.0f * this.strokeWidth;
    }

    @Override
	public String getDisplayName() {
		return this.displayName;
	}
}
