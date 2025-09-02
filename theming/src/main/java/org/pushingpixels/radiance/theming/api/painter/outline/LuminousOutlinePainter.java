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
import org.pushingpixels.radiance.theming.internal.utils.RadianceInternalArrowButton;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;

/**
 * Inlay outline painter that paints an emulated outline of a 3D glass object lit from straight
 * above.
 * 
 * @author Kirill Grouchnikov
 */
public class LuminousOutlinePainter implements RadianceOutlinePainter {
    private static float outerStrokeWidth = 1.0f;
    private static float[] outerVerticalFractions = new float[] {0.0f, 0.5f, 1.0f};
    private static ContainerColorTokensSingleColorQuery[] outerVerticalColorQueries =
        new ContainerColorTokensSingleColorQuery[] {
            ContainerColorTokens::getContainerOutline,
            ContainerColorTokens::getContainerOutline,
            ContainerColorTokens::getContainerOutlineVariant};
    private static ContainerColorTokensSingleColorQuery[] outerVerticalColorQueriesSimplified =
        new ContainerColorTokensSingleColorQuery[] {
            ContainerColorTokens::getContainerOutline,
            ContainerColorTokens::getContainerOutline,
            ContainerColorTokens::getContainerOutline};

    private static float innerStrokeWidth = 2.0f;
    private static ContainerColorTokensSingleColorQuery[] innerHorizontalColorQueries =
        new ContainerColorTokensSingleColorQuery[] {
            ContainerColorTokens::getContainerOutlineVariant,
            ContainerColorTokens::getComplementaryContainerOutline,
            ContainerColorTokens::getComplementaryContainerOutline,
            ContainerColorTokens::getContainerOutlineVariant};
    private static ContainerColorTokensSingleColorQuery[] innerHorizontalColorQueriesSimplified =
        new ContainerColorTokensSingleColorQuery[] {
            ContainerColorTokens::getComplementaryContainerOutline,
            ContainerColorTokens::getComplementaryContainerOutline,
            ContainerColorTokens::getComplementaryContainerOutline,
            ContainerColorTokens::getComplementaryContainerOutline};

    public LuminousOutlinePainter() {
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
            g2d.translate(outerStrokeWidth, outerStrokeWidth);
            // In theory, the radius adjustment for the inner outline should be the full stroke
            // width - for perfect concentric rounded corners. In practice, for smaller corners,
            // reducing the inner outline radius by the full stroke width results in inner outline
            // corners that are too tight. This might be revisited in the future.
            float innerOutlineRadiusAdjustment = outerStrokeWidth / 2.0f;
            // Smaller components get simpler outline visuals
            ContainerColorTokensSingleColorQuery[] innerQueries =
                ((width / scaleFactor <= 16) || (height / scaleFactor <= 16))
                    ? innerHorizontalColorQueriesSimplified
                    : innerHorizontalColorQueries;
            paintHorizontal(g2d, c, width - 2.0f * outerStrokeWidth, height - 2.0f * outerStrokeWidth,
                innerOutlineRadiusAdjustment, scaleFactor, shapeSupplier, colorTokens,
                innerStrokeWidth, innerQueries);
            g2d.translate(-outerStrokeWidth, -outerStrokeWidth);
        }
        ContainerColorTokensSingleColorQuery[] outerQueries =
            skipInnerOutline ? outerVerticalColorQueriesSimplified : outerVerticalColorQueries;
        paintVertical(g2d, c, width, height, /* radiusAdjustment */ 0.0f,
            scaleFactor, shapeSupplier, colorTokens, outerStrokeWidth,
            outerVerticalFractions, outerQueries);
        g2d.dispose();
    }

    private static void paintVertical(Graphics2D graphics, Component c, float width, float height,
        float radiusAdjustment, double scaleFactor, ShapeSuppler shapeSupplier,
        ContainerColorTokens colorTokens, float strokeWidth, float[] fractions,
        ContainerColorTokensSingleColorQuery[] colorQueries) {

        Color[] drawColors = new Color[fractions.length];
        for (int i = 0; i < fractions.length; i++) {
            ContainerColorTokensSingleColorQuery colorQuery = colorQueries[i];
            drawColors[i] = colorQuery.query(colorTokens);
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
            Shape outlineInnerShape = shapeSupplier.getShape(c, width, height, strokeWidth - 0.5f,
                radiusAdjustment, scaleFactor);
            outlinePath.append(outlineOuterShape, false);
            outlinePath.append(outlineInnerShape, false);
            graphics.fill(outlinePath);
        }
    }

    private static void paintHorizontal(Graphics2D graphics, Component c, float width, float height,
        float radiusAdjustment, double scaleFactor, ShapeSuppler shapeSupplier,
        ContainerColorTokens colorTokens, float strokeWidth,
        ContainerColorTokensSingleColorQuery[] colorQueries) {

        Color[] drawColors = new Color[colorQueries.length];
        for (int i = 0; i < colorQueries.length; i++) {
            ContainerColorTokensSingleColorQuery colorQuery = colorQueries[i];
            drawColors[i] = colorQuery.query(colorTokens);
        }

        // issue 433 - the "c" can be null when painting
        // the border of a tree icon used outside the
        // JTree context.
        boolean isSpecialButton = (c != null) && c.getClass()
            .isAnnotationPresent(RadianceInternalArrowButton.class);
        int joinKind = isSpecialButton ? BasicStroke.JOIN_MITER : BasicStroke.JOIN_ROUND;
        int capKind = isSpecialButton ? BasicStroke.CAP_SQUARE : BasicStroke.CAP_BUTT;
        graphics.setStroke(new BasicStroke(strokeWidth, capKind, joinKind));

        if (strokeWidth == 1.0f) {
            Shape outline = shapeSupplier.getShape(c, width, height, 0.0f, radiusAdjustment, scaleFactor);

            double leftCornerRadius = 0.0;
            double rightCornerRadius = 0;
            if (outline instanceof RoundRectangle2D) {
                // This matches the logic in RadianceOutlineUtilities.getBaseOutline
                RoundRectangle2D rrOutline = (RoundRectangle2D) outline;
                leftCornerRadius = rrOutline.getArcWidth() / 2.0f;
                rightCornerRadius = rrOutline.getArcWidth() / 2.0f;
            } else if (outline instanceof Ellipse2D) {
                // This matches the logic in BladeIconUtils.drawRadioButton
                Ellipse2D ellOutline = (Ellipse2D) outline;
                leftCornerRadius = ellOutline.getWidth() / 2.0f;
                rightCornerRadius = ellOutline.getWidth() / 2.0f;
            }

            // Handle completely square corners
            if (leftCornerRadius == 0.0) {
                leftCornerRadius = 1.0f;
            }
            if (rightCornerRadius == 0.0) {
                rightCornerRadius = 1.0f;
            }

            // And clamp them to not be more than 10% of the overall width
            leftCornerRadius = Math.min(leftCornerRadius, 0.1f * width);
            rightCornerRadius = Math.min(rightCornerRadius, 0.1f * width);

            // Dynamically compute the gradient fractions to follow the corner radius on left
            // and right sides
            float[] fractions = new float[] { 0.0f,
                Math.min(0.499f, 0.5f * (float) leftCornerRadius / (width - 1.0f)),
                Math.max(0.501f, 1.0f - 0.5f * (float) rightCornerRadius / (width - 1.0f)),
                1.0f};
            MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, width - 1.0f, 0,
                fractions, drawColors, MultipleGradientPaint.CycleMethod.NO_CYCLE);
            graphics.setPaint(gradient);

            graphics.draw(outline);
        } else {
            Path2D outlinePath = new Path2D.Float(Path2D.WIND_EVEN_ODD);
            Shape outlineOuterShape = shapeSupplier.getShape(c, width, height, -0.5f,
                radiusAdjustment, scaleFactor);
            Shape outlineInnerShape = shapeSupplier.getShape(c, width, height, strokeWidth - 0.5f,
                radiusAdjustment, scaleFactor);
            outlinePath.append(outlineOuterShape, false);
            outlinePath.append(outlineInnerShape, false);

            double leftCornerRadius = 0;
            double rightCornerRadius = 0;
            if (outlineOuterShape instanceof RoundRectangle2D) {
                // This matches the logic in RadianceOutlineUtilities.getBaseOutline
                RoundRectangle2D rrOutline = (RoundRectangle2D) outlineOuterShape;
                leftCornerRadius = rrOutline.getArcWidth() / 2.0f;
                rightCornerRadius = rrOutline.getArcWidth() / 2.0f;
            } else if (outlineOuterShape instanceof Ellipse2D) {
                // This matches the logic in BladeIconUtils.drawRadioButton
                Ellipse2D ellOutline = (Ellipse2D) outlineOuterShape;
                leftCornerRadius = ellOutline.getWidth() / 2.0f;
                rightCornerRadius = ellOutline.getWidth() / 2.0f;
            }

            // Handle completely square corners
            if (leftCornerRadius <= 0.0) {
                leftCornerRadius = 1.0f;
            }
            if (rightCornerRadius <= 0.0) {
                rightCornerRadius = 1.0f;
            }

            // And clamp them to not be more than 10% of the overall width
            leftCornerRadius = Math.min(leftCornerRadius, 0.1f * width);
            rightCornerRadius = Math.min(rightCornerRadius, 0.1f * width);

            // Dynamically compute the gradient fractions to follow the corner radius on left
            // and right sides
            float[] fractions = new float[] { 0.0f,
                Math.min(0.499f, 0.5f * (float) leftCornerRadius / (width - 1.0f)),
                Math.max(0.501f, 1.0f - 0.5f * (float) rightCornerRadius / (width - 1.0f)),
                1.0f};
            MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, width - 1.0f, 0,
                fractions, drawColors, MultipleGradientPaint.CycleMethod.NO_CYCLE);
            graphics.setPaint(gradient);

            graphics.fill(outlinePath);
        }
    }

    @Override
    public float getOutlineInset(InsetKind insetKind) {
        if (insetKind == InsetKind.SURFACE) {
            // Treat surface to extend halfway into the outer outline
            return outerStrokeWidth + innerStrokeWidth / 2.0f;
        }
        // For content, both outlines are considered. However, to preserve the layout alignment
        // between single outlines (from {@link FractionBasedOutlinePainter) and double outlines
        // from this painter - at default hairline stroke width - make a special case where only
        // the outer outline is considered for the content insets.
        return outerStrokeWidth;
    }

    @Override
	public String getDisplayName() {
		return "Luminous";
	}
}
