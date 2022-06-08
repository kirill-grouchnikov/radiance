/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.theming.internal.blade;

import org.pushingpixels.radiance.common.internal.contrib.flatlaf.HiDPIUtils;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.colorscheme.SunfireRedColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceOutlineUtilities;
import org.pushingpixels.radiance.theming.internal.utils.WidgetUtilities;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class BladeDrawingUtils {
    public static void paintBladeBorder(Component c, Graphics2D g, int x, int y, int width,
            int height, float baseRadius, RadianceColorScheme borderScheme) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(c);
                    float scaledRadius = (float) scaleFactor * baseRadius;
                    Shape contour = RadianceOutlineUtilities.getBaseOutline(
                            scaledWidth - 1.0f, scaledHeight - 1.0f, scaledRadius, null, 0.0f);
                    boolean skipInnerBorder = (c instanceof JTextComponent)
                            || ((SwingUtilities.getAncestorOfClass(CellRendererPane.class, c) != null)
                            && (SwingUtilities.getAncestorOfClass(JFileChooser.class, c) != null));
                    Shape contourInner = skipInnerBorder ? null :
                            RadianceOutlineUtilities.getBaseOutline(scaledWidth - 1.0f, scaledHeight - 1.0f,
                                    Math.max(scaledRadius - 1.0f, 0.0f), null, 1.0f);
                    borderPainter.paintBorder(graphics1X, c, scaledWidth, scaledHeight, contour,
                            contourInner, borderScheme);
                });
        graphics.dispose();
    }

    public static void paintBladeSimpleBorder(Graphics2D g, int width, int height,
            float baseRadius, RadianceColorScheme colorScheme) {
        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        HiDPIUtils.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    graphics1X.setColor(RadianceColorUtilities.getMidBorderColor(colorScheme));
                    if (baseRadius == 0.0f) {
                        graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER));
                        graphics1X.draw(new Rectangle2D.Float(0.0f, 0.0f, scaledWidth - 1.0f, scaledHeight - 1.0f));
                    } else {
                        float scaledRadius = (float) scaleFactor * baseRadius;
                        graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
                        graphics1X.draw(new RoundRectangle2D.Float(
                                0.0f, 0.0f, scaledWidth - 1.0f, scaledHeight - 1.0f, scaledRadius, scaledRadius));
                    }
                });
    }

    /**
     * Paints rectangular gradient background.
     *
     * @param g
     *            Graphic context.
     * @param startX
     *            Background starting X coord.
     * @param startY
     *            Background starting Y coord.
     * @param width
     *            Background width.
     * @param height
     *            Background height.
     * @param colorScheme
     *            Color scheme for the background.
     * @param borderAlpha
     *            Border alpha.
     * @param isVertical
     *            if <code>true</code>, the gradient will be vertical, if <code>false</code>, the
     *            gradient will be horizontal.
     */
    public static void paintRectangularBackground(Component c, Graphics g, int startX, int startY,
            int width, int height, RadianceColorScheme colorScheme, float borderAlpha,
            boolean isVertical) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(startX, startY);

        if (!isVertical) {
            LinearGradientPaint paint = new LinearGradientPaint(0, 0, 0, height,
                    new float[] { 0.0f, 0.4f, 0.5f, 1.0f },
                    new Color[] { colorScheme.getUltraLightColor(), colorScheme.getLightColor(),
                                    colorScheme.getMidColor(), colorScheme.getUltraLightColor() },
                    MultipleGradientPaint.CycleMethod.REPEAT);
            graphics.setPaint(paint);
            graphics.fillRect(0, 0, width, height);
        } else {
            LinearGradientPaint paint = new LinearGradientPaint(0, 0, width, 0,
                    new float[] { 0.0f, 0.4f, 0.5f, 1.0f },
                    new Color[] { colorScheme.getUltraLightColor(), colorScheme.getLightColor(),
                                    colorScheme.getMidColor(), colorScheme.getUltraLightColor() },
                    MultipleGradientPaint.CycleMethod.REPEAT);
            graphics.setPaint(paint);
            graphics.fillRect(0, 0, width, height);
        }

        if (borderAlpha > 0.0f) {
            Graphics2D g2d = (Graphics2D) graphics.create();
            g2d.setComposite(WidgetUtilities.getAlphaComposite(null, borderAlpha, graphics));

            paintBladeSimpleBorder(g2d, width, height, 0.0f, colorScheme);

            g2d.dispose();
        }
        graphics.dispose();
    }
}
