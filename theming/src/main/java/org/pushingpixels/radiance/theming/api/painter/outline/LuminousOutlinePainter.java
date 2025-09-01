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
import java.awt.geom.Path2D;

/**
 * Inlay outline painter that paints an emulated outline of a 3D glass object lit from straight
 * above.
 * 
 * @author Kirill Grouchnikov
 */
public class LuminousOutlinePainter implements RadianceOutlinePainter {
    private static float outerStrokeWidth = 1.0f;
    private static float[] outerVerticalFractions = new float[] {0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
    private static ContainerColorTokensSingleColorQuery[] outerVerticalColorQueries =
        new ContainerColorTokensSingleColorQuery[] {
            ContainerColorTokens::getContainerOutline,
            ContainerColorTokens::getContainerOutline,
            ContainerColorTokens::getContainerOutlineVariant,
            ContainerColorTokens::getContainerOutline,
            ContainerColorTokens::getContainerOutline};

    private static float innerStrokeWidth = 2.0f;
    private static float[] innerHorizontalFractions = new float[] {0.0f, 0.06f, 0.94f, 1.0f};
    private static ContainerColorTokensSingleColorQuery[] innerHorizontalColorQueries =
        new ContainerColorTokensSingleColorQuery[] {
            ContainerColorTokens::getContainerOutline,
            ContainerColorTokens::getComplementaryContainerOutline,
            ContainerColorTokens::getComplementaryContainerOutline,
            ContainerColorTokens::getContainerOutline};

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
            paintHorizontal(g2d, c, width - 2.0f * outerStrokeWidth, height - 2.0f * outerStrokeWidth,
                innerOutlineRadiusAdjustment, scaleFactor, shapeSupplier, colorTokens,
                innerStrokeWidth, innerHorizontalFractions, innerHorizontalColorQueries);
            g2d.translate(-outerStrokeWidth, -outerStrokeWidth);
        }
        paintVertical(g2d, c, width, height, /* radiusAdjustment */ 0.0f,
            scaleFactor, shapeSupplier, colorTokens, outerStrokeWidth,
            outerVerticalFractions, outerVerticalColorQueries);
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

        MultipleGradientPaint gradient = new LinearGradientPaint(0, 0, width, 0, fractions,
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
