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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.FlatBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.painter.SimplisticFillPainter;
import org.pushingpixels.radiance.theming.internal.utils.filters.ColorSchemeFilter;
import org.pushingpixels.radiance.theming.internal.utils.filters.ImageColorFilter;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

/**
 * Provides utility functions for creating various images for <b>Radiance</b> look and feel. This
 * class is <b>for internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public final class RadianceImageCreator {
    /**
     * Custom fill painter for filling the checkmarks of checkboxes and radio buttons.
     * 
     * @author Kirill Grouchnikov
     */
    public static class SimplisticSoftBorderReverseFillPainter extends SimplisticFillPainter {
        /**
         * Singleton instance.
         */
        public static final RadianceFillPainter INSTANCE = new SimplisticSoftBorderReverseFillPainter();

        /**
         * Private constructor.
         */
        private SimplisticSoftBorderReverseFillPainter() {
        }

        @Override
        public String getDisplayName() {
            return "Simplistic Soft Border Reverse";
        }

        @Override
        public Color getTopFillColor(RadianceColorScheme fillScheme) {
            return super.getBottomFillColor(fillScheme);
        }

        @Override
        public Color getBottomFillColor(RadianceColorScheme fillScheme) {
            return super.getTopFillColor(fillScheme);
        }
    }

    /**
     * Paints border instance of specified dimensions and status.
     * 
     * @param c
     *            Component.
     * @param graphics
     *            Graphics context.
     * @param x
     *            Component left X (in graphics context).
     * @param y
     *            Component top Y (in graphics context).
     * @param width
     *            Border width.
     * @param height
     *            Border height.
     * @param radius
     *            Border radius.
     * @param borderScheme
     *            Border color scheme.
     */
    public static void paintBorder(Component c, Graphics2D graphics, int x, float y, float width,
            float height, float radius, RadianceColorScheme borderScheme) {

        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(c);
        graphics.translate(x, y);
        float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(c) / 2.0f;
        Shape contour = RadianceOutlineUtilities.getBaseOutline(width, height, radius, null,
                borderDelta);
        float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(c);
        boolean skipInnerBorder = (c instanceof JTextComponent)
                || ((SwingUtilities.getAncestorOfClass(CellRendererPane.class, c) != null)
                        && (SwingUtilities.getAncestorOfClass(JFileChooser.class, c) != null));
        Shape contourInner = skipInnerBorder ? null
                : RadianceOutlineUtilities.getBaseOutline(width, height, radius - borderThickness,
                        null, borderThickness + borderDelta);
        borderPainter.paintBorder(graphics, c, width, height, contour, contourInner, borderScheme);
        graphics.translate(-x, -y);
    }

    /**
     * Returns arrow icon for the specified parameters.
     *
     * @param fontSize
     *            Font size.
     * @param direction
     *            Arrow direction.
     * @param colorScheme
     *            Arrow icon color scheme.
     * @return Arrow icon.
     */
    public static ScaleAwareImageWrapperIcon getArrowIcon(double scale, int fontSize, int direction,
            RadianceColorScheme colorScheme) {
        float origWidth = RadianceSizeUtils.getArrowIconWidth(fontSize);
        float origHeight = RadianceSizeUtils.getArrowIconHeight(fontSize);
        float width = origWidth;
        float height = origHeight;
        if (direction == SwingConstants.CENTER)
            height *= 2;
        float strokeWidth = RadianceSizeUtils.getArrowStrokeWidth(fontSize);
        ScaleAwareImageWrapperIcon result = new ScaleAwareImageWrapperIcon(
                getArrow(width, height, scale, strokeWidth, direction, colorScheme), scale);
        int finalWidth = (int) (Math.max(origWidth, origHeight) + 2);
        int finalHeight = (int) (Math.max(origWidth, height) + 2);
        result.setDimension(new Dimension(finalWidth, finalHeight));
        return result;
    }

    /**
     * Retrieves arrow icon.
     *
     * @param width
     *            Arrow width.
     * @param height
     *            Arrow height.
     * @param strokeWidth
     *            Stroke width.
     * @param direction
     *            Arrow direction.
     * @param scheme
     *            Color scheme for the arrow.
     * @return Arrow image.
     * @see SwingConstants#NORTH
     * @see SwingConstants#WEST
     * @see SwingConstants#SOUTH
     * @see SwingConstants#EAST
     */
    public static ScaleAwareImageWrapperIcon getArrowIcon(float width, float height, double scale,
            float strokeWidth, int direction, RadianceColorScheme scheme) {
        return new ScaleAwareImageWrapperIcon(
                getArrow(width, height, scale, strokeWidth, direction, scheme),
                scale);
    }

    /**
     * Retrieves arrow image.
     *
     * @param width
     *            Arrow width.
     * @param height
     *            Arrow height.
     * @param strokeWidth
     *            Stroke width.
     * @param direction
     *            Arrow direction.
     * @param scheme
     *            Color scheme for the arrow.
     * @return Arrow image.
     * @see SwingConstants#NORTH
     * @see SwingConstants#WEST
     * @see SwingConstants#SOUTH
     * @see SwingConstants#EAST
     * @see SwingConstants#CENTER
     */
    private static BufferedImage getArrow(float width, float height, double scale, float strokeWidth,
            int direction, RadianceColorScheme scheme) {
        if (direction == SwingConstants.EAST || direction == SwingConstants.WEST) {
            float tmp = width;
            width = height;
            height = tmp;
        }
        BufferedImage arrowImage = RadianceCoreUtilities.getBlankImage(scale,
                (int) Math.ceil(width), (int) Math.ceil(height));

        // System.out.println(width + ":" + height + ":" + strokeWidth);

        // get graphics and set hints
        Graphics2D graphics = (Graphics2D) arrowImage.getGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        // graphics.setColor(Color.green);
        // graphics.drawRect(0, 0, (int) width -1 , (int) height - 1);

        Color arrowColor = scheme.getMarkColor();

        graphics.setColor(arrowColor);
        Stroke stroke = new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        graphics.setStroke(stroke);

        if (direction == SwingConstants.CENTER) {
            float smallHeight = (height - strokeWidth) / 2;
            BufferedImage top = getArrow(width, smallHeight, scale, strokeWidth,
                    SwingConstants.NORTH, scheme);
            BufferedImage bottom = getArrow(width, smallHeight, scale, strokeWidth,
                    SwingConstants.SOUTH, scheme);
            RadianceCommonCortex.drawImageWithScale(graphics, scale, top, 0, 0);
            RadianceCommonCortex.drawImageWithScale(graphics, scale, bottom, 0, (int) (height / 2.0));
            return arrowImage;
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

            return arrowImage;
        }
    }

    /**
     * Retrieves arrow icon.
     *
     * @param fullWidth
     *            Full icon width.
     * @param fullHeight
     *            Full icon height.
     * @param strokeWidth
     *            Stroke width.
     * @param direction
     *            Arrow direction.
     * @param colorScheme
     *            Color scheme for the arrow.
     * @return Arrow image.
     * @see SwingConstants#NORTH
     * @see SwingConstants#WEST
     * @see SwingConstants#SOUTH
     * @see SwingConstants#EAST
     */
    public static ScaleAwareImageWrapperIcon getDoubleArrowIcon(double scale, float fullWidth,
            float fullHeight, float arrowGap, float strokeWidth, int direction,
            RadianceColorScheme colorScheme) {
        boolean toggle = (direction == SwingConstants.WEST) || (direction == SwingConstants.EAST);
        int singleArrowWidth = toggle ? (int) fullHeight : (int) fullWidth;
        int singleArrowHeight = toggle ? (int) (fullWidth - arrowGap)
                : (int) (fullHeight - arrowGap);
        BufferedImage downArrowImage = RadianceCoreUtilities.getBlankImage(scale,
                (int) fullWidth, (int) fullHeight);

        BufferedImage singleArrow = getArrow(singleArrowWidth, singleArrowHeight, scale,
                strokeWidth, direction, colorScheme);

        // get graphics and set hints
        Graphics2D graphics = (Graphics2D) downArrowImage.getGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        // graphics.setColor(new Color(255, 0, 0, 128));
        // graphics.fillRect(0, 0, downArrowImage.getWidth(), downArrowImage.getHeight());

        if (!toggle) {
            RadianceCommonCortex.drawImageWithScale(graphics, scale, singleArrow, 0, 0);
            RadianceCommonCortex.drawImageWithScale(graphics, scale, singleArrow, 0, (int) arrowGap);
        } else {
            RadianceCommonCortex.drawImageWithScale(graphics, scale, singleArrow, 0, 0);
            RadianceCommonCortex.drawImageWithScale(graphics, scale, singleArrow, (int) arrowGap, 0);
        }

        return new ScaleAwareImageWrapperIcon(downArrowImage, scale);
    }

    /**
     * Returns rotated image.
     *
     * @param bi
     *            Image to rotate.
     * @param quadrantClockwise
     *            Amount of quadrants to rotate in clockwise direction. The rotation angle is 90
     *            times this value.
     * @return Rotated image.
     */
    public static BufferedImage getRotated(double scale, BufferedImage bi, int quadrantClockwise) {
        if (quadrantClockwise == 0) {
            return bi;
        }
        quadrantClockwise = quadrantClockwise % 4;
        int width = bi.getWidth();
        int height = bi.getHeight();
        if ((quadrantClockwise == 1) || (quadrantClockwise == 3)) {
            width = bi.getHeight();
            height = bi.getWidth();
        }
        BufferedImage biRot = RadianceCoreUtilities.getBlankImage(scale,
                (int) (width / scale), (int) (height / scale));
        AffineTransform at = null;
        switch (quadrantClockwise) {
            case 1:
                at = AffineTransform.getTranslateInstance(width, 0);
                at.rotate(Math.PI / 2);
                break;
            case 2:
                at = AffineTransform.getTranslateInstance(width, height);
                at.rotate(Math.PI);
                break;
            case 3:
                at = AffineTransform.getTranslateInstance(0, height);
                at.rotate(-Math.PI / 2);
        }
        Graphics2D rotg = biRot.createGraphics();
        rotg.scale(1.0f / scale, 1.0f / scale);
        if (at != null) {
            rotg.setTransform(at);
        }
        rotg.drawImage(bi, 0, 0, bi.getWidth(), bi.getHeight(), null);
        rotg.dispose();
        return biRot;
    }

    private static AlphaComposite getAlphaComposite(float alpha) {
        // Fix for "alpha value out of range"
        float finalAlpha = alpha;
        if (finalAlpha < 0.0f)
            finalAlpha = 0.0f;
        else if (finalAlpha > 1.0f)
            finalAlpha = 1.0f;
        return AlphaComposite.getInstance(AlphaComposite.SRC_OVER, finalAlpha);
    }

    /**
     * Overlays light-colored echo below the specified image.
     * 
     * @param image
     *            The input image.
     * @param echoAlpha
     *            Alpha channel for the echo image.
     * @return Image with overlayed echo.
     */
    private static BufferedImage overlayEcho(double scale, BufferedImage image,
            float echoAlpha, Color echoColor) {
        int width = image.getWidth();
        int height = image.getHeight();

        int offsetX = 0, offsetY = 0;
        BufferedImage echo = new ImageColorFilter(echoColor).filter(image, null);
        int tweakedWidth = (int) (width / scale);
        int tweakedHeight = (int) (height / scale);
        BufferedImage result = RadianceCoreUtilities.getBlankImage(
                scale, tweakedWidth, tweakedHeight);
        Graphics2D graphics = (Graphics2D) result.getGraphics().create();
        graphics.setComposite(getAlphaComposite(0.2f * echoAlpha * echoAlpha * echoAlpha));
        graphics.drawImage(echo, offsetX - 1, offsetY - 1, tweakedWidth, tweakedHeight, null);
        graphics.drawImage(echo, offsetX + 1, offsetY - 1, tweakedWidth, tweakedHeight, null);
        graphics.drawImage(echo, offsetX - 1, offsetY + 1, tweakedWidth, tweakedHeight, null);
        graphics.drawImage(echo, offsetX + 1, offsetY + 1, tweakedWidth, tweakedHeight, null);
        graphics.setComposite(getAlphaComposite(0.7f * echoAlpha * echoAlpha * echoAlpha));
        graphics.drawImage(echo, offsetX, offsetY - 1, tweakedWidth, tweakedHeight, null);
        graphics.drawImage(echo, offsetX, offsetY + 1, tweakedWidth, tweakedHeight, null);
        graphics.drawImage(echo, offsetX - 1, offsetY, tweakedWidth, tweakedHeight, null);
        graphics.drawImage(echo, offsetX + 1, offsetY, tweakedWidth, tweakedHeight, null);

        graphics.setComposite(getAlphaComposite(1.0f));
        graphics.drawImage(image, 0, 0, tweakedWidth, tweakedHeight, null);

        graphics.dispose();
        return result;
    }

    /**
     * Returns <code>minimize</code> icon.
     * 
     * @param scheme
     *            Color scheme for the icon.
     * @return <code>Minimize</code> icon.
     */
    public static ScaleAwareImageWrapperIcon getMinimizeIcon(Component titlePane,
            RadianceColorScheme scheme) {
        int iSize = RadianceSizeUtils.getTitlePaneIconSize();
        return getMinimizeIcon(titlePane, iSize, scheme);
    }

    /**
     * Returns <code>minimize</code> icon.
     * 
     * @param iSize
     *            Icon dimension.
     * @param scheme
     *            Color scheme for the icon.
     * @return <code>Minimize</code> icon.
     */
    public static ScaleAwareImageWrapperIcon getMinimizeIcon(Component titlePane, int iSize,
            RadianceColorScheme scheme) {
        double scale = RadianceCommonCortex.getScaleFactor(titlePane);

        BufferedImage image = RadianceCoreUtilities.getBlankImage(scale, iSize, iSize);
        Graphics2D graphics = image.createGraphics();
        int start = iSize / 4 - 2;
        int end = 3 * iSize / 4;
        int size = end - start - 3;
        Color color = scheme.getMarkColor();
        graphics.setColor(color);
        graphics.fillRect(start + 2, end - 1, size, 3);
        graphics.dispose();

        Color echoColor = scheme.getEchoColor();

        int fgStrength = RadianceColorUtilities.getColorBrightness(color.getRGB());
        int echoStrength = RadianceColorUtilities.getColorBrightness(echoColor.getRGB());
        boolean noEcho = Math.abs(fgStrength - echoStrength) < 48;
        return new ScaleAwareImageWrapperIcon(RadianceImageCreator.overlayEcho(scale, image,
                noEcho ? 0 : RadianceColorUtilities.getColorStrength(color), echoColor), scale);
    }

    /**
     * Returns <code>restore</code> icon.
     * 
     * @param scheme
     *            Color scheme for the icon.
     * @return <code>Restore</code> icon.
     */
    public static ScaleAwareImageWrapperIcon getRestoreIcon(Component titlePane,
            RadianceColorScheme scheme) {
        double scale = RadianceCommonCortex.getScaleFactor(titlePane);

        int iSize = RadianceSizeUtils.getTitlePaneIconSize();
        BufferedImage image = RadianceCoreUtilities.getBlankImage(scale, iSize, iSize);
        Graphics2D graphics = image.createGraphics();
        int start = iSize / 4 - 1;
        int end = iSize - start;
        int smallSquareSize = end - start - 3;
        Color color = scheme.getMarkColor();
        graphics.setColor(color);

        // "Main" rectangle
        int mainStartX = start;
        int mainStartY = end - smallSquareSize;
        // top (thicker)
        graphics.fillRect(mainStartX, mainStartY, smallSquareSize, 2);
        // left
        graphics.fillRect(mainStartX, mainStartY, 1, smallSquareSize);
        // right
        graphics.fillRect(mainStartX + smallSquareSize - 1, mainStartY, 1, smallSquareSize);
        // bottom
        graphics.fillRect(mainStartX, mainStartY + smallSquareSize - 1, smallSquareSize, 1);

        // "Secondary rectangle"
        int secondaryStartX = mainStartX + 3;
        int secondaryStartY = mainStartY - 3;
        // top (thicker)
        graphics.fillRect(secondaryStartX, secondaryStartY, smallSquareSize, 2);
        // right
        graphics.fillRect(secondaryStartX + smallSquareSize - 1, secondaryStartY, 1,
                smallSquareSize);
        // bottom (partial)
        graphics.fillRect(mainStartX + smallSquareSize + 1, secondaryStartY + smallSquareSize - 1,
                2, 1);

        graphics.dispose();

        Color echoColor = scheme.getEchoColor();

        int fgStrength = RadianceColorUtilities.getColorBrightness(color.getRGB());
        int echoStrength = RadianceColorUtilities.getColorBrightness(echoColor.getRGB());
        boolean noEcho = Math.abs(fgStrength - echoStrength) < 48;
        return new ScaleAwareImageWrapperIcon(RadianceImageCreator.overlayEcho(scale, image,
                noEcho ? 0 : RadianceColorUtilities.getColorStrength(color), echoColor), scale);
    }

    /**
     * Returns <code>maximize</code> icon.
     * 
     * @param scheme
     *            Color scheme for the icon.
     * @return <code>Maximize</code> icon.
     */
    public static ScaleAwareImageWrapperIcon getMaximizeIcon(Component titlePane,
            RadianceColorScheme scheme) {
        int iSize = RadianceSizeUtils.getTitlePaneIconSize();
        return getMaximizeIcon(titlePane, iSize, scheme);
    }

    /**
     * Returns <code>maximize</code> icon.
     * 
     * @param iSize
     *            Icon dimension.
     * @param scheme
     *            Color scheme for the icon.
     * @return <code>Maximize</code> icon.
     */
    public static ScaleAwareImageWrapperIcon getMaximizeIcon(Component titlePane, int iSize,
            RadianceColorScheme scheme) {
        double scale = RadianceCommonCortex.getScaleFactor(titlePane);

        BufferedImage image = RadianceCoreUtilities.getBlankImage(scale, iSize, iSize);
        Graphics2D graphics = image.createGraphics();
        int start = iSize / 4 - 1;
        int end = iSize - start;
        Color color = scheme.getMarkColor();
        graphics.setColor(color);
        // top (thicker)
        graphics.fillRect(start, start, end - start, 2);
        // left
        graphics.fillRect(start, start, 1, end - start);
        // right
        graphics.fillRect(end - 1, start, 1, end - start);
        // bottom
        graphics.fillRect(start, end - 1, end - start, 1);
        graphics.dispose();

        Color echoColor = scheme.getEchoColor();

        int fgStrength = RadianceColorUtilities.getColorBrightness(color.getRGB());
        int echoStrength = RadianceColorUtilities.getColorBrightness(echoColor.getRGB());
        boolean noEcho = Math.abs(fgStrength - echoStrength) < 48;

        return new ScaleAwareImageWrapperIcon(RadianceImageCreator.overlayEcho(scale, image,
                noEcho ? 0 : RadianceColorUtilities.getColorStrength(color), echoColor), scale);
    }

    /**
     * Returns <code>close</code> icon.
     *
     * @param scheme
     *            Color scheme for the icon.
     * @return <code>Close</code> icon.
     */
    public static ScaleAwareImageWrapperIcon getCloseIcon(Component titlePane,
            RadianceColorScheme scheme) {
        return RadianceImageCreator.getCloseIcon(titlePane,
                RadianceSizeUtils.getTitlePaneIconSize(), scheme);
    }

    /**
     * Returns <code>close</code> icon.
     *
     * @param iSize
     *            Icon dimension.
     * @param scheme
     *            Color scheme for the icon.
     * @return <code>Close</code> icon.
     */
    public static ScaleAwareImageWrapperIcon getCloseIcon(Component titlePane, int iSize,
            RadianceColorScheme scheme) {
        double scale = RadianceCommonCortex.getScaleFactor(titlePane);

        BufferedImage image = RadianceCoreUtilities.getBlankImage(scale, iSize, iSize);
        Graphics2D graphics = image.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        int start = iSize / 4;
        int end = iSize - start;

        // System.out.println(iSize + ":" + start + ":" + end);

        Stroke stroke = new BasicStroke(RadianceSizeUtils.getCloseIconStrokeWidth(iSize),
                BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);

        graphics.setStroke(stroke);
        Color color = scheme.getMarkColor();
        graphics.setColor(color);
        graphics.drawLine(start, start, end, end);
        graphics.drawLine(start, end, end, start);
        graphics.dispose();

        Color echoColor = scheme.getEchoColor();

        int fgStrength = RadianceColorUtilities.getColorBrightness(color.getRGB());
        int echoStrength = RadianceColorUtilities.getColorBrightness(echoColor.getRGB());
        boolean noEcho = Math.abs(fgStrength - echoStrength) < 48;

        return new ScaleAwareImageWrapperIcon(RadianceImageCreator.overlayEcho(scale, image,
                noEcho ? 0 : RadianceColorUtilities.getColorStrength(color), echoColor), scale);
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
                    CycleMethod.REPEAT);
            graphics.setPaint(paint);
            graphics.fillRect(0, 0, width, height);
        } else {
            LinearGradientPaint paint = new LinearGradientPaint(0, 0, width, 0,
                    new float[] { 0.0f, 0.4f, 0.5f, 1.0f },
                    new Color[] { colorScheme.getUltraLightColor(), colorScheme.getLightColor(),
                                    colorScheme.getMidColor(), colorScheme.getUltraLightColor() },
                    CycleMethod.REPEAT);
            graphics.setPaint(paint);
            graphics.fillRect(0, 0, width, height);
        }

        if (borderAlpha > 0.0f) {
            Graphics2D g2d = (Graphics2D) graphics.create();
            g2d.setComposite(WidgetUtilities.getAlphaComposite(null, borderAlpha, graphics));

            paintSimpleBorderAliased(c, g2d, width, height, colorScheme);

            g2d.dispose();
        }
        graphics.dispose();
    }

    /**
     * Paints simple border.
     * 
     * @param g2d
     *            Graphics context.
     * @param width
     *            Border width.
     * @param height
     *            Border height.
     * @param borderColorScheme
     *            Border color scheme.
     */
    public static void paintSimpleBorder(Component c, Graphics2D g2d, float width, float height,
            RadianceColorScheme borderColorScheme) {
        float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(c);

        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(c);
        g2d.setColor(borderPainter.getRepresentativeColor(borderColorScheme));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        int joinKind = BasicStroke.JOIN_ROUND;
        int capKind = BasicStroke.CAP_BUTT;
        g2d.setStroke(new BasicStroke(borderThickness, capKind, joinKind));
        g2d.draw(new Rectangle2D.Float(borderThickness / 2.0f, borderThickness / 2.0f,
                width - borderThickness, height - borderThickness));
    }

    public static void paintSimpleBorderAliased(Component c, Graphics2D g2d, int width, int height,
            RadianceColorScheme colorScheme) {
        float borderThickness = RadianceSizeUtils.getBorderStrokeWidth(c);

        g2d.setColor(RadianceColorUtilities.getMidBorderColor(colorScheme));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        int joinKind = BasicStroke.JOIN_MITER;
        int capKind = BasicStroke.CAP_SQUARE;
        g2d.setStroke(new BasicStroke(borderThickness, capKind, joinKind));
        g2d.draw(new Rectangle2D.Float(borderThickness / 2.0f, borderThickness / 2.0f,
                width - borderThickness, height - borderThickness));
    }

    /**
     * Paints rectangular gradient background with spots and optional replicated stripe image.
     * 
     * @param g
     *            Graphics context.
     * @param startX
     *            X start coordinate.
     * @param startY
     *            Y start coordinate.
     * @param width
     *            Background width.
     * @param height
     *            Background height.
     * @param colorScheme
     *            Color scheme for the background.
     * @param stripeImage
     *            Stripe image to replicate.
     * @param stripeOffset
     *            Offset of the first stripe replication.
     * @param borderAlpha
     *            Border alpha.
     * @param isVertical
     *            Indication of horizontal / vertical orientation.
     */
    public static void paintRectangularStripedBackground(Component c, Graphics g, double scaleFactor,
            int startX, int startY, int width, int height, RadianceColorScheme colorScheme,
            BufferedImage stripeImage, int stripeOffset, float borderAlpha, boolean isVertical) {
        Graphics2D graphics = (Graphics2D) g.create(startX, startY, width, height);
        if (!isVertical) {
            LinearGradientPaint paint = new LinearGradientPaint(0, 0, 0, height,
                    new float[] { 0.0f, 0.2f, 0.5f, 0.8f, 1.0f },
                    new Color[] { colorScheme.getDarkColor(), colorScheme.getLightColor(),
                                    colorScheme.getMidColor(), colorScheme.getLightColor(),
                                    colorScheme.getDarkColor() },
                    CycleMethod.REPEAT);
            graphics.setPaint(paint);
            graphics.fillRect(0, 0, width, height);

            if (stripeImage != null) {
                int stripeSize = stripeImage.getHeight();
                int stripeCount = (int) (scaleFactor * width / stripeSize);
                stripeOffset = (int) (stripeOffset % (2 * stripeSize * scaleFactor));
                for (int stripe = -2; stripe <= stripeCount; stripe += 2) {
                    int stripePos = (int) (stripe * stripeSize / scaleFactor + stripeOffset);

                    RadianceCommonCortex.drawImageWithScale(graphics, scaleFactor, stripeImage, stripePos, 0);
                }
            }
        } else {
            LinearGradientPaint paint = new LinearGradientPaint(0, 0, width, 0,
                    new float[] { 0.0f, 0.2f, 0.5f, 0.8f, 1.0f },
                    new Color[] { colorScheme.getDarkColor(), colorScheme.getLightColor(),
                                    colorScheme.getMidColor(), colorScheme.getLightColor(),
                                    colorScheme.getDarkColor() },
                    CycleMethod.REPEAT);
            graphics.setPaint(paint);
            graphics.fillRect(0, 0, width, height);

            if (stripeImage != null) {
                int stripeSize = stripeImage.getWidth();
                int stripeCount = (int) (scaleFactor * height / stripeSize);
                stripeOffset = (int) (stripeOffset % (2 * stripeSize * scaleFactor));
                for (int stripe = -2; stripe <= stripeCount; stripe += 2) {
                    int stripePos = (int) (stripe * stripeSize / scaleFactor + stripeOffset);

                    RadianceCommonCortex.drawImageWithScale(graphics, scaleFactor, stripeImage, 0, stripePos);
                }
            }
        }

        if (borderAlpha > 0.0f) {
            Graphics2D g2d = (Graphics2D) graphics.create();
            g2d.setComposite(WidgetUtilities.getAlphaComposite(null, borderAlpha, graphics));

            paintSimpleBorderAliased(c, g2d, width, height, colorScheme);
            g2d.dispose();
        }
        graphics.dispose();
    }

    /**
     * Returns diagonal stripe image.
     * 
     * @param baseSize
     *            Stripe base in pixels.
     * @param color
     *            Stripe color.
     * @return Diagonal stripe image.
     */
    public static BufferedImage getStripe(double scale, int baseSize, Color color) {
        int width = (int) (1.8 * baseSize);
        int height = baseSize;
        BufferedImage intermediate = RadianceCoreUtilities.getBlankImage(scale, width, height);
        Graphics2D graphics = (Graphics2D) intermediate.getGraphics();

        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        Polygon polygon = new Polygon();
        polygon.addPoint(0, 0);
        polygon.addPoint(width - 1 - baseSize, 0);
        polygon.addPoint(width - 1, height - 1);
        polygon.addPoint(baseSize, height - 1);

        graphics.setColor(color);
        graphics.fillPolygon(polygon);
        graphics.drawPolygon(polygon);

        return intermediate;
    }

    /**
     * Returns drag bumps image.
     * 
     * @param c
     *            Component.
     * @param colorScheme
     *            Color scheme.
     * @param width
     *            Drag bumps width.
     * @param height
     *            Drag bumps height.
     * @param maxNumberOfStripes
     *            The maximum number of bump stripes (rows or columns).
     * @return Drag bumps image.
     */
    public static BufferedImage getDragImage(Component c, RadianceColorScheme colorScheme,
            int width, int height, int maxNumberOfStripes) {
        double scale = RadianceCommonCortex.getScaleFactor(c);
        BufferedImage result = RadianceCoreUtilities.getBlankImage(scale, width, height);
        Graphics2D graphics = (Graphics2D) result.getGraphics();

        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        Color primary = colorScheme.getSeparatorPrimaryColor();
        Color secondary = colorScheme.getSeparatorSecondaryColor();

        int componentFontSize = RadianceSizeUtils.getComponentFontSize(c);
        int bumpDotDiameter = RadianceSizeUtils.getDragBumpDiameter(componentFontSize);
        int bumpCellSize = (int) (1.5 * bumpDotDiameter + 1);
        int bumpRows = Math.max(1, height / bumpCellSize - 1);
        int bumpColumns = Math.max(1, (width - 2) / bumpCellSize);
        if (maxNumberOfStripes > 0) {
            if (height > width)
                bumpColumns = Math.min(bumpColumns, maxNumberOfStripes);
            else
                bumpRows = Math.min(bumpRows, maxNumberOfStripes);
        }

        int bumpRowOffset = (height - bumpCellSize * bumpRows) / 2;
        int bumpColOffset = 1 + (width - bumpCellSize * bumpColumns) / 2;

        for (int col = 0; col < bumpColumns; col++) {
            int cx = bumpColOffset + col * bumpCellSize;
            boolean isEvenCol = (col % 2 == 0);
            int offsetY = isEvenCol ? 0 : bumpDotDiameter;
            for (int row = 0; row < bumpRows; row++) {
                int cy = offsetY + bumpRowOffset + row * bumpCellSize;
                graphics.setColor(secondary);
                graphics.fillOval(cx + 1, cy + 1, bumpDotDiameter, bumpDotDiameter);
                graphics.setColor(primary);
                graphics.fillOval(cx, cy, bumpDotDiameter, bumpDotDiameter);
            }
        }
        return result;
    }

    /**
     * Paints the bump dots on the split pane dividers.
     * 
     * @param g
     *            Graphics context.
     * @param divider
     *            Split pane divider.
     * @param x
     *            X coordinate of the bump dots.
     * @param y
     *            Y coordinate of the bump dots.
     * @param width
     *            Width of the bump dots area.
     * @param height
     *            Height of the bump dots area.
     * @param isHorizontal
     *            Indicates whether the dots are horizontal.
     * @param colorScheme
     *            Color scheme.
     */
    public static void paintSplitDividerBumpImage(Graphics g, RadianceSplitPaneDivider divider,
            int x, int y, int width, int height, boolean isHorizontal,
            RadianceColorScheme colorScheme) {
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);

        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int componentFontSize = RadianceSizeUtils.getComponentFontSize(divider);
        int bumpDotDiameter = RadianceSizeUtils.getBigDragBumpDiameter(componentFontSize);
        int bumpCellSize = (int) (1.5 * bumpDotDiameter + 1);
        int bumpRows = isHorizontal ? 1 : Math.max(1, height / bumpCellSize - 1);
        int bumpColumns = isHorizontal ? Math.max(1, (width - 2) / bumpCellSize) : 1;

        int bumpRowOffset = (height - bumpCellSize * bumpRows) / 2;
        int bumpColOffset = 1 + (width - bumpCellSize * bumpColumns) / 2;

        double scale = RadianceCommonCortex.getScaleFactor(divider);
        BufferedImage singleDot = RadianceCoreUtilities.getBlankImage(
                scale, bumpDotDiameter, bumpDotDiameter);
        Graphics2D dotGraphics = (Graphics2D) singleDot.getGraphics();
        dotGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        dotGraphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);

        dotGraphics.setColor(colorScheme.getMarkColor());
        dotGraphics.fillOval(0, 0, bumpDotDiameter, bumpDotDiameter);

        dotGraphics.setComposite(getAlphaComposite(0.4f));
        RadianceBorderPainter borderPainter = RadianceCoreUtilities.getBorderPainter(divider);
        borderPainter.paintBorder(dotGraphics, divider, bumpDotDiameter, bumpDotDiameter,
                new Ellipse2D.Float(0, 0, bumpDotDiameter, bumpDotDiameter), null, colorScheme);

        graphics.setComposite(WidgetUtilities.getAlphaComposite(divider, 0.8f, g));
        for (int col = 0; col < bumpColumns; col++) {
            int cx = bumpColOffset + col * bumpCellSize;
            for (int row = 0; row < bumpRows; row++) {
                int cy = bumpRowOffset + row * bumpCellSize + (bumpCellSize - bumpDotDiameter) / 2;
                RadianceCommonCortex.drawImageWithScale(graphics, scale, singleDot, cx, cy);
            }
        }
        graphics.dispose();
    }

    /**
     * Retrieves tree icon.
     * 
     * @param tree
     *            Tree.
     * @param fillScheme
     *            Icon fill color scheme.
     * @param borderScheme
     *            Icon border color scheme.
     * @param isCollapsed
     *            Collapsed state.
     * @return Tree icon.
     */
    public static BufferedImage getTreeIcon(JTree tree, RadianceColorScheme fillScheme,
            RadianceColorScheme borderScheme, RadianceColorScheme markScheme,
            boolean isCollapsed) {
        double scale = RadianceCommonCortex.getScaleFactor(tree);
        int fontSize = RadianceSizeUtils.getComponentFontSize(tree);
        int dim = RadianceSizeUtils.getTreeIconSize(fontSize);
        BufferedImage result = RadianceCoreUtilities.getBlankImage(scale, dim, dim);
        Graphics2D graphics = (Graphics2D) result.getGraphics();

        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_OFF);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        RadianceFillPainter fillPainter = SimplisticSoftBorderReverseFillPainter.INSTANCE;
        RadianceBorderPainter fbp = new FlatBorderPainter();

        float borderDelta = RadianceSizeUtils.getBorderStrokeWidth(tree) / 2.0f;
        Shape contour = RadianceOutlineUtilities.getBaseOutline(dim, dim,
                RadianceSizeUtils.getClassicButtonCornerRadius(dim) / 1.5f, null, borderDelta);

        fillPainter.paintContourBackground(graphics, tree, dim, dim, contour, false, fillScheme,
                false);
        fbp.paintBorder(graphics, tree, dim, dim, contour, null, borderScheme);

        Color signColor = markScheme.getForegroundColor();
        graphics.setColor(signColor);
        float mid = dim / 2;
        float length = 7 * dim / 12;
        // Horizontal stroke
        graphics.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND));
        graphics.draw(new Line2D.Float(mid - length / 2, mid, mid + length / 2, mid));
        if (isCollapsed) {
            // Vertical stroke
            graphics.draw(new Line2D.Float(mid, mid - length / 2, mid, mid + length / 2));
        }

        return result;
    }

    /**
     * Retrieves a single crayon of the specified color and dimensions for the crayon panel in color
     * chooser.
     * 
     * @param mainColor
     *            Crayon main color.
     * @param width
     *            Crayon width.
     * @param height
     *            Crayon height.
     * @return Crayon image.
     */
    private static BufferedImage getSingleCrayon(double scale, Color mainColor,
            int width, int height) {
        BufferedImage image = RadianceCoreUtilities.getBlankImage(scale, width, height);

        int baseTop = (int) (0.2 * height);

        Graphics2D graphics = (Graphics2D) image.getGraphics().create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int r = mainColor.getRed();
        int g = mainColor.getGreen();
        int b = mainColor.getBlue();
        // light coefficient
        double lc = 0.8;
        int lr = (int) (r + (255 - r) * lc);
        int lg = (int) (g + (255 - g) * lc);
        int lb = (int) (b + (255 - b) * lc);
        // dark coefficient
        double dc = 0.05;
        int dr = (int) ((1.0 - dc) * r);
        int dg = (int) ((1.0 - dc) * g);
        int db = (int) ((1.0 - dc) * b);

        Color lightColor = new Color(lr, lg, lb);
        Color darkColor = new Color(dr, dg, db);

        LinearGradientPaint paint = new LinearGradientPaint(0, 0, width, 0,
                new float[] { 0.0f, 0.3f, 0.5f, 0.9f, 1.0f },
                new Color[] { lightColor, darkColor, darkColor, lightColor, lightColor },
                CycleMethod.REPEAT);
        graphics.setPaint(paint);
        graphics.fillRect(0, baseTop, width, height);

        int dbwr = lr;
        int dbwg = lg;
        int dbwb = lb;
        int lbwr = 128 + dr / 4;
        int lbwg = 128 + dg / 4;
        int lbwb = 128 + db / 4;

        Color lightStripeColor = new Color(lbwr, lbwg, lbwb);
        Color darkStripeColor = new Color(dbwr, dbwg, dbwb);

        int stripeTop = (int) (0.35 * height);
        int stripeHeight = (int) (0.04 * height);
        LinearGradientPaint stripePaint = new LinearGradientPaint(0, 0, width, 0,
                new float[] { 0.0f, 0.3f, 0.5f, 0.9f, 1.0f },
                new Color[] { lightStripeColor, darkStripeColor, darkStripeColor, lightStripeColor,
                                lightStripeColor },
                CycleMethod.REPEAT);
        graphics.setPaint(stripePaint);
        graphics.fillRect(0, stripeTop, width, stripeHeight);

        graphics.setColor(lightStripeColor);
        graphics.drawRect(0, stripeTop, width - 1, stripeHeight);

        // create cap path
        GeneralPath capPath = new GeneralPath();
        capPath.moveTo(0.5f * width - 3, 4);
        capPath.quadTo(0.5f * width, 0, 0.5f * width + 3, 4);
        capPath.lineTo(width - 3, baseTop);
        capPath.lineTo(2, baseTop);
        capPath.lineTo(0.5f * width - 3, 4);

        graphics.setClip(capPath);

        RadialGradientPaint capPaint = new RadialGradientPaint(width / 2, baseTop, baseTop,
                width / 2, 4 * baseTop / 3, new float[] { 0.0f, 0.1f, 1.0f },
                new Color[] { mainColor, mainColor, lightColor }, CycleMethod.NO_CYCLE);
        graphics.setPaint(capPaint);
        graphics.fillRect(0, 0, width, baseTop);

        graphics.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        graphics.setClip(null);
        graphics.setColor(new Color(64 + dr / 2, 64 + dg / 2, 64 + db / 2, 200));
        graphics.drawRect(0, baseTop, width - 1, height - baseTop - 1);
        graphics.draw(capPath);

        graphics.dispose();

        return image;
    }

    /**
     * Crayon colors.
     */
    private final static int[] crayonColors = { 0x800000, // Cayenne
                    0x808000, // Asparagus
                    0x008000, // Clover
                    0x008080, // Teal
                    0x000080, // Midnight
                    0x800080, // Plum
                    0x7f7f7f, // Tin
                    0x808080, // Nickel

                    0x804000, // Mocha
                    0x408000, // Fern
                    0x008040, // Moss
                    0x004080, // Ocean
                    0x400080, // Eggplant
                    0x800040, // Maroon
                    0x666666, // Steel
                    0x999999, // Aluminium

                    0xff0000, // Maraschino
                    0xffff00, // Lemon
                    0x00ff00, // Spring
                    0x00ffff, // Turquoise
                    0x0000ff, // Blueberry
                    0xff00ff, // Magenta
                    0x4c4c4c, // Iron
                    0xb3b3b3, // Magnesium

                    0xff8000, // Tangerine
                    0x80ff00, // Lime
                    0x00ff80, // Sea Foam
                    0x0080ff, // Aqua
                    0x8000ff, // Grape
                    0xff0080, // Strawberry
                    0x333333, // Tungsten
                    0xcccccc, // Silver

                    0xff6666, // Salmon
                    0xffff66, // Banana
                    0x66ff66, // Flora
                    0x66ffff, // Ice
                    0x6666ff, // Orchid
                    0xff66ff, // Bubblegum
                    0x191919, // Lead
                    0xe6e6e6, // Mercury

                    0xffcc66, // Cantaloupe
                    0xccff66, // Honeydew
                    0x66ffcc, // Spindrift
                    0x66ccff, // Sky
                    0xcc66ff, // Lavender
                    0xff6fcf, // Carnation
                    0x000000, // Licorice
                    0xffffff, // Snow
    };

    /**
     * Retrieves crayon X offset.
     * 
     * @param i
     *            Crayon index.
     * @return Crayon X offset.
     */
    private static int crayonX(int i) {
        return (i % 8) * 22 + 4 + ((i / 8) % 2) * 11;
    }

    /**
     * Retrieves crayon Y offset.
     * 
     * @param i
     *            Crayon index.
     * @return Crayon Y offset.
     */
    private static int crayonY(int i) {
        return (i / 8) * 20 + 23;
    }

    /**
     * Retrieves crayons image for the crayon panel of color chooser.
     * 
     * @return Crayons image.
     */
    public static Image getCrayonsImage(Color fillColor) {
        int iw = 195;
        int ih = 208;
        double scale = RadianceCommonCortex.getScaleFactor(null);
        Image image = RadianceCoreUtilities.getBlankImage(scale, iw, ih);
        Graphics2D graphics = (Graphics2D) image.getGraphics().create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);

        graphics.setColor(fillColor);
        graphics.fillRect(0, 0, iw, ih);

        for (int i = 0; i < RadianceImageCreator.crayonColors.length; i++) {
            Color crayonColor = new Color(0xff000000 | RadianceImageCreator.crayonColors[i]);
            BufferedImage crayonImage = RadianceImageCreator.getSingleCrayon(
                    scale, crayonColor, 22, 120);
            RadianceCommonCortex.drawImageWithScale(graphics, scale, crayonImage,
                    RadianceImageCreator.crayonX(i), RadianceImageCreator.crayonY(i));
        }

        graphics.dispose();
        return image;
    }

    /**
     * Returns small icon representation of the specified integer value. The remainder of dividing
     * the integer by 16 is translated to four circles arranged in 2*2 grid.
     * 
     * @param value
     *            Integer value to represent.
     * @param colorScheme
     *            Icon color scheme.
     * @return Icon representation of the specified integer value.
     */
    public static ScaleAwareImageWrapperIcon getHexaMarker(double scale, int value,
            RadianceColorScheme colorScheme) {
        BufferedImage result = RadianceCoreUtilities.getBlankImage(scale, 9, 9);
        if (colorScheme == null) {
            return new ScaleAwareImageWrapperIcon(result, scale);
        }

        value %= 16;
        boolean isDark = colorScheme.isDark();
        Color offColor = isDark
                ? RadianceColorUtilities.getInterpolatedColor(colorScheme.getUltraLightColor(),
                        Color.white, 0.7)
                : RadianceColorUtilities.deriveByBrightness(colorScheme.getMidColor(), -0.6f);
        Color onColor = isDark
                ? RadianceColorUtilities.getInterpolatedColor(colorScheme.getUltraLightColor(),
                        Color.white, 0.2)
                : colorScheme.getForegroundColor();

        boolean bit1 = ((value & 0x1) != 0);
        boolean bit2 = ((value & 0x2) != 0);
        boolean bit3 = ((value & 0x4) != 0);
        boolean bit4 = ((value & 0x8) != 0);

        Graphics2D graphics = (Graphics2D) result.getGraphics().create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        graphics.setColor(bit1 ? onColor : offColor);
        graphics.fillOval(5, 5, 4, 4);
        graphics.setColor(bit2 ? onColor : offColor);
        graphics.fillOval(5, 0, 4, 4);
        graphics.setColor(bit3 ? onColor : offColor);
        graphics.fillOval(0, 5, 4, 4);
        graphics.setColor(bit4 ? onColor : offColor);
        graphics.fillOval(0, 0, 4, 4);

        graphics.dispose();
        return new ScaleAwareImageWrapperIcon(result, scale);
    }

    /**
     * Returns a lock icon that matches the specified scheme.
     *
     * @param scheme
     *            Scheme instance.
     * @return Lock icon that matches the specified scheme.
     */
    public static Icon getSmallLockIcon(RadianceColorScheme scheme, Component c) {
        int componentFontSize = RadianceSizeUtils.getComponentFontSize(c);
        int extraPadding = RadianceSizeUtils.getExtraPadding(componentFontSize);
        int size = 9 + 2 * extraPadding;

        return RadianceThemingCortex.GlobalScope.getIconPack().getLockIcon(size, scheme);
    }

    /**
     * Returns a caps lock icon that matches the specified scheme.
     *
     * @param scheme
     *            Scheme instance.
     * @return Caps lock icon that matches the specified scheme.
     */
    public static Icon getCapsLockIcon(RadianceColorScheme scheme, Component c) {
        return RadianceThemingCortex.GlobalScope.getIconPack().getCapsLockIcon(32, scheme);
    }

    /**
     * Creates a new version of the specified icon that is rendered in the colors of the specified
     * color scheme.
     * 
     * @param comp
     *            Component.
     * @param original
     *            The original icon.
     * @param colorScheme
     *            Color scheme.
     * @return Scheme-based version of the original icon.
     */
    public static BufferedImage getColorSchemeImage(Component comp, Icon original,
            RadianceColorScheme colorScheme, float originalBrightnessFactor) {
        int w = original.getIconWidth();
        int h = original.getIconHeight();
        if ((w == 0) || (h == 0)) {
            return null;
        }
        double scale = RadianceCommonCortex.getScaleFactor(comp);
        BufferedImage origImage = RadianceCoreUtilities.getBlankImage(scale, w, h);
        Graphics2D g2d = (Graphics2D) origImage.getGraphics().create();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        original.paintIcon(comp, origImage.getGraphics(), 0, 0);
        g2d.dispose();

        BufferedImage result = getColorSchemeImage(origImage, colorScheme,
                originalBrightnessFactor, 1.0f);
        return result;
    }

    /**
     * Creates a new version of the specified image that is rendered in the colors of the specified
     * color scheme.
     * 
     * @param original
     *            The original image.
     * @param colorScheme
     *            Color scheme.
     * @param originalBrightnessFactor
     *            The original brightness factor.
     * @return Scheme-based version of the original icon.
     */
    public static BufferedImage getColorSchemeImage(BufferedImage original,
            RadianceColorScheme colorScheme, float originalBrightnessFactor,
            float alpha) {
        return ColorSchemeFilter.getColorSchemeFilter(colorScheme, originalBrightnessFactor, alpha)
                .filter(original, null);
    }

    public static BufferedImage getColorImage(Component comp, Icon original,
            Color color, float alpha) {
        int w = original.getIconWidth();
        int h = original.getIconHeight();
        if ((w == 0) || (h == 0)) {
            return null;
        }
        BufferedImage origImage = RadianceCoreUtilities.getBlankImage(
                RadianceCommonCortex.getScaleFactor(comp), w, h);
        Graphics2D g2d = (Graphics2D) origImage.getGraphics().create();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        original.paintIcon(comp, origImage.getGraphics(), 0, 0);
        g2d.dispose();

        return new ImageColorFilter(color, alpha).filter(origImage, null);
    }
}
