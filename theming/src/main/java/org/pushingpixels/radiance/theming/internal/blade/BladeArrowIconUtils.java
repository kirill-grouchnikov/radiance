/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class BladeArrowIconUtils {
    public static void drawArrow(Graphics2D g, int fontSize, Dimension boundingBox,
            int direction, RadianceColorScheme colorScheme) {
        float origWidth = RadianceSizeUtils.getArrowIconWidth(fontSize);
        float origHeight = RadianceSizeUtils.getArrowIconHeight(fontSize);
        float width = origWidth;
        float height = origHeight;
        if (direction == SwingConstants.CENTER)
            height *= 2;
        float strokeWidth = RadianceSizeUtils.getArrowStrokeWidth(fontSize);

        int dx = (int) (boundingBox.width - width) / 2;
        int dy = (int) (boundingBox.height - height) / 2;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(dx, dy);
        drawArrow(graphics, width, height, strokeWidth, direction, colorScheme);
        graphics.dispose();
    }

    public static void drawArrow(Graphics2D g, float width, float height,
            float strokeWidth, int direction, RadianceColorScheme scheme) {
        if (direction == SwingConstants.EAST || direction == SwingConstants.WEST) {
            float tmp = width;
            width = height;
            height = tmp;
        }

        // get graphics and set hints
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        Color arrowColor = scheme.getMarkColor();

        graphics.setColor(arrowColor);
        Stroke stroke = new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        graphics.setStroke(stroke);

        if (direction == SwingConstants.CENTER) {
            float smallHeight = (height - strokeWidth) / 2;
            drawArrow(graphics, width, smallHeight, strokeWidth,
                    SwingConstants.NORTH, scheme);
            graphics.translate(0, (int) (height / 2.0));
            drawArrow(graphics, width, smallHeight, strokeWidth,
                    SwingConstants.SOUTH, scheme);
        } else {
            float cushion = strokeWidth / 2.0f;
            GeneralPath gp = new GeneralPath();
            switch (direction) {
                case SwingConstants.SOUTH:
                    gp.moveTo(cushion, cushion);
                    gp.lineTo(0.5f * (width), height - cushion - 1);
                    gp.lineTo(width - cushion, cushion);
                    break;
                case SwingConstants.NORTH:
                    gp.moveTo(cushion, height - cushion - 1);
                    gp.lineTo(0.5f * (width), cushion);
                    gp.lineTo(width - cushion, height - cushion - 1);
                    break;
                case SwingConstants.EAST:
                    gp.moveTo(cushion, cushion);
                    gp.lineTo(width - 1 - cushion, 0.5f * (height));
                    gp.lineTo(cushion, height - cushion);
                    break;
                case SwingConstants.WEST:
                    gp.moveTo(width - 1 - cushion, cushion);
                    gp.lineTo(cushion, 0.5f * (height));
                    gp.lineTo(width - 1 - cushion, height - cushion);
                    break;
            }
            graphics.draw(gp);
        }
        graphics.dispose();
    }

    public static Dimension getArrowIconDimension(int fontSize, int direction) {
        float origWidth = RadianceSizeUtils.getArrowIconWidth(fontSize);
        float origHeight = RadianceSizeUtils.getArrowIconHeight(fontSize);
        float height = origHeight;
        if (direction == SwingConstants.CENTER) {
            height *= 2;
        }
        int finalWidth = (int) (Math.max(origWidth, origHeight) + 2);
        int finalHeight = (int) (Math.max(origWidth, height) + 2);
        return new Dimension(finalWidth, finalHeight);
    }

    public static Icon getArrowIcon(JComponent component, int direction,
            RadianceColorScheme scheme) {
        int fontSize = RadianceSizeUtils.getComponentFontSize(component);
        Dimension iconSize = BladeArrowIconUtils.getArrowIconDimension(fontSize, direction);
        return new Icon() {
            @Override
            public int getIconWidth() {
                return iconSize.width;
            }

            @Override
            public int getIconHeight() {
                return iconSize.height;
            }

            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                Graphics2D graphics = (Graphics2D) g.create();
                graphics.translate(x, y);
                BladeArrowIconUtils.drawArrow(graphics, fontSize, iconSize, direction, scheme);
                graphics.dispose();
            }
        };
    }

    public static void drawDoubleArrow(Graphics2D g, float fullWidth,
            float fullHeight, float arrowGap, float strokeWidth, int direction,
            RadianceColorScheme colorScheme) {
        boolean toggle = (direction == SwingConstants.WEST) || (direction == SwingConstants.EAST);
        int singleArrowWidth = toggle ? (int) fullHeight : (int) fullWidth;
        int singleArrowHeight = toggle ? (int) (fullWidth - arrowGap) : (int) (fullHeight - arrowGap);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        if (!toggle) {
            drawArrow(graphics, singleArrowWidth, singleArrowHeight, strokeWidth, direction, colorScheme);
            graphics.translate(0, (int) arrowGap);
            drawArrow(graphics, singleArrowWidth, singleArrowHeight, strokeWidth, direction, colorScheme);
        } else {
            drawArrow(graphics, singleArrowWidth, singleArrowHeight, strokeWidth, direction, colorScheme);
            graphics.translate((int) arrowGap, 0);
            drawArrow(graphics, singleArrowWidth, singleArrowHeight, strokeWidth, direction, colorScheme);
        }

        graphics.dispose();
    }
}
