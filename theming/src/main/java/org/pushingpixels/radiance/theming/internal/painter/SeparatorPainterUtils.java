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
package org.pushingpixels.radiance.theming.internal.painter;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.Collection;
import java.util.Collections;

/**
 * Contains utility methods related to painting separators. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class SeparatorPainterUtils {
    /**
     * Paints a separator.
     *
     * @param c
     *         Component.
     * @param graphics
     *         Graphics context.
     * @param width
     *         Separator width.
     * @param height
     *         Separator height.
     * @param orientation
     *         Separator orientation.
     */
    public static void paintSeparator(Component c, Graphics graphics, int width, int height,
            int orientation) {
        paintSeparator(c, graphics, width, height, orientation, true, 10);
    }

    /**
     * Paints a separator.
     *
     * @param c
     *         Component.
     * @param graphics
     *         Graphics context.
     * @param width
     *         Separator width.
     * @param height
     *         Separator height.
     * @param orientation
     *         Separator orientation.
     * @param hasShadow
     *         If <code>true</code>, the separator painting will have shadow.
     * @param maxGradLength
     *         Specifies the maximum pixel length of "ramp" portions of the separator. The ramp
     *         portions are located on separator ends and allow providing a faded appearance on
     *         those ends.
     */
    public static void paintSeparator(Component c, Graphics graphics, int width, int height,
            int orientation, boolean hasShadow, int maxGradLength) {
        paintSeparator(c, graphics, width, height, orientation, hasShadow, maxGradLength,
                maxGradLength, false);
    }

    /**
     * Paints a separator.
     *
     * @param c
     *         Component.
     * @param g
     *         Graphics context.
     * @param width
     *         Separator width.
     * @param height
     *         Separator height.
     * @param orientation
     *         Separator orientation.
     * @param hasShadow
     *         If <code>true</code>, the separator painting will have shadow.
     * @param maxGradLengthStart
     *         Specifies the maximum pixel length of the starting "ramp" portion of the separator.
     *         The starting ramp portion is located on top / left separator end and allows providing
     *         a faded appearance on that end.
     * @param maxGradLengthEnd
     *         Specifies the maximum pixel length of the ending "ramp" portion of the separator. The
     *         ending ramp portion is located on bottom / right separator end and allows providing a
     *         faded appearance on that end.
     * @param toEnforceAlphaColors
     *         If <code>true</code>, the fade sequences will always use alpha colors. This may
     *         affect the performance.
     */
    public static void paintSeparator(Component c, Graphics g, int width, int height,
            int orientation, boolean hasShadow, int maxGradLengthStart, int maxGradLengthEnd,
            boolean toEnforceAlphaColors) {
        RadianceColorScheme compScheme = null;
        Component parent = c.getParent();
        boolean isParentAPopup = (parent instanceof JPopupMenu) ||
                ((parent instanceof JComponent) && ((JComponent) parent).getClientProperty(
                        DecorationPainterUtils.POPUP_ORIGINATOR_LINK) != null);
        if (isParentAPopup) {
            // For separators in popups, first see if we have a color
            // scheme explicitly registered for the SEPARATOR association kind.
            compScheme = RadianceColorSchemeUtilities.getDirectColorScheme(c,
                    RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);
            if (compScheme == null) {
                // Then get a background color scheme associated with the
                // decoration type of that separator
                compScheme = RadianceCoreUtilities.getSkin(c).getBackgroundColorScheme(
                        RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(c));
            }
        }
        if (compScheme == null) {
            // And finally, get the separator's color scheme via the regular
            // route that includes fall back in case there is no explicitly registered
            // color scheme for the SEPARATOR association kind.
            compScheme = RadianceColorSchemeUtilities.getColorScheme(c,
                    RadianceThemingSlices.ColorSchemeAssociationKind.SEPARATOR, ComponentState.ENABLED);
        }

        paintSeparator(c, g, compScheme, width, height, orientation, hasShadow, maxGradLengthStart,
                maxGradLengthEnd, toEnforceAlphaColors);
    }

    /**
     * Paints a separator.
     *
     * @param c
     *         Component.
     * @param g
     *         Graphics context.
     * @param scheme
     *         Color scheme.
     * @param width
     *         Separator width.
     * @param height
     *         Separator height.
     * @param orientation
     *         Separator orientation.
     * @param hasShadow
     *         If <code>true</code>, the separator painting will have shadow.
     * @param maxGradLengthStart
     *         Specifies the maximum pixel length of the starting "ramp" portion of the separator.
     *         The starting ramp portion is located on top / left separator end and allows providing
     *         a faded appearance on that end.
     * @param maxGradLengthEnd
     *         Specifies the maximum pixel length of the ending "ramp" portion of the separator. The
     *         ending ramp portion is located on bottom / right separator end and allows providing a
     *         faded appearance on that end.
     * @param toEnforceAlphaColors
     *         If <code>true</code>, the fade sequences will always use alpha colors. This may
     *         affect the performance.
     */
    public static void paintSeparator(Component c, Graphics g, RadianceColorScheme scheme,
            int width, int height, int orientation, boolean hasShadow, int maxGradLengthStart,
            int maxGradLengthEnd, boolean toEnforceAlphaColors) {

        if (orientation == JSeparator.HORIZONTAL) {
            height = 1;
        }
        if (orientation == JSeparator.VERTICAL) {
            width = 1;
        }

        if ((width == 0) || (height == 0)) {
            return;
        }


        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    RadianceThemingSlices.DecorationAreaType decorationAreaType =
                            RadianceThemingCortex.ComponentOrParentChainScope.getDecorationType(c);
                    RadianceSkin skin = RadianceCoreUtilities.getSkin(c);
                    // use alpha colors when the control is in a painted decoration area
                    // (where skin can use different background colors) or in a decoration
                    // area that has overlays.
                    boolean toUseAlphaColors =
                            (decorationAreaType == RadianceThemingSlices.DecorationAreaType.NONE)
                                    ? false
                                    : skin.isRegisteredAsDecorationArea(decorationAreaType)
                                    || (skin.getOverlayPainters(decorationAreaType).size() > 0);
                    toUseAlphaColors = toUseAlphaColors || toEnforceAlphaColors;

                    Color backgroundFill = RadianceColorUtilities.getBackgroundFillColor(c);
                    Color primary = scheme.getSeparatorPrimaryColor();
                    Color secondary = scheme.getSeparatorSecondaryColor();

                    Color primaryZero = toUseAlphaColors
                            ? RadianceColorUtilities.getAlphaColor(primary, 0)
                            : RadianceColorUtilities.getInterpolatedColor(primary, backgroundFill, 0.0f);
                    Color secondaryZero = toUseAlphaColors
                            ? RadianceColorUtilities.getAlphaColor(secondary, 0)
                            : RadianceColorUtilities.getInterpolatedColor(secondary, backgroundFill, 0.0f);
                    graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_ROUND));
                    if (orientation == JSeparator.VERTICAL) {
                        int gradStart = Math.min(maxGradLengthStart, scaledHeight / 2);
                        int gradEnd = Math.min(maxGradLengthEnd, scaledHeight / 2);
                        float gradStartFraction = (float) gradStart / scaledHeight;
                        float gradEndFraction = (float) (scaledHeight - gradEnd) / scaledHeight;
                        float regularX = Math.max(0, scaledWidth / 2.0f - 1.0f);

                        // Dynamically create the array of stop fractions and corresponding
                        // colors. If the start fraction is 0, we need to skip the 0-opacity
                        // first stop, as identical fractions in LinearGradientPaint lead to
                        // a crash. The same applies to end fraction 0, and identical start
                        // and end fraction values
                        int stopsCount = ((gradStartFraction > 0.0f) ? 1 : 0) + 1 +
                                ((gradEndFraction > gradStartFraction) ? 1 : 0) +
                                ((gradEndFraction < 1.0f) ? 1 : 0);
                        float[] stops = new float[stopsCount];
                        Color[] colors = new Color[stopsCount];
                        int stopIndex = 0;
                        if (gradStartFraction > 0.0f) {
                            stops[stopIndex] = 0.0f;
                            colors[stopIndex] = primaryZero;
                            stopIndex++;
                        }
                        stops[stopIndex] = gradStartFraction;
                        colors[stopIndex] = primary;
                        stopIndex++;
                        if (gradEndFraction > gradStartFraction) {
                            stops[stopIndex] = gradEndFraction;
                            colors[stopIndex] = primary;
                            stopIndex++;
                        }
                        if (gradEndFraction < 1.0f) {
                            stops[stopIndex] = 1.0f;
                            colors[stopIndex] = primaryZero;
                        }

                        LinearGradientPaint primaryPaint = new LinearGradientPaint(
                                0, 0, 0, scaledHeight,
                                stops, colors);
                        graphics1X.setPaint(primaryPaint);
                        graphics1X.draw(new Line2D.Float(regularX, 0, regularX, scaledHeight));

                        if (hasShadow) {
                            float shadowX = regularX + 1.0f;

                            stopIndex = 0;
                            if (gradStartFraction > 0.0f) {
                                stops[stopIndex] = 0.0f;
                                colors[stopIndex] = secondaryZero;
                                stopIndex++;
                            }
                            stops[stopIndex] = gradStartFraction;
                            colors[stopIndex] = secondary;
                            stopIndex++;
                            if (gradEndFraction > gradStartFraction) {
                                stops[stopIndex] = gradEndFraction;
                                colors[stopIndex] = secondary;
                                stopIndex++;
                            }
                            if (gradEndFraction < 1.0f) {
                                stops[stopIndex] = 1.0f;
                                colors[stopIndex] = secondaryZero;
                            }

                            LinearGradientPaint secondaryPaint = new LinearGradientPaint(
                                    0, 0, 0, scaledHeight,
                                    stops, colors);
                            graphics1X.setPaint(secondaryPaint);
                            graphics1X.draw(new Line2D.Float(shadowX, 0, shadowX, scaledHeight));
                        }
                    } else {
                        // HORIZONTAL
                        int gradStart = Math.min(maxGradLengthStart, scaledWidth / 2);
                        int gradEnd = Math.min(maxGradLengthEnd, scaledWidth / 2);
                        graphics1X.translate(0, Math.max(0, scaledHeight / 2 - 1));

                        float gradStartFraction = (float) gradStart / scaledWidth;
                        float gradEndFraction = (float) (scaledWidth - gradEnd) / scaledWidth;
                        float regularY = Math.max(0, scaledHeight / 2.0f - 1.0f);

                        // Dynamically create the array of stop fractions and corresponding
                        // colors. If the start fraction is 0, we need to skip the 0-opacity
                        // first stop, as identical fractions in LinearGradientPaint lead to
                        // a crash. The same applies to end fraction 0, and identical start
                        // and end fraction values
                        int stopsCount = ((gradStartFraction > 0.0f) ? 1 : 0) + 1 +
                                ((gradEndFraction > gradStartFraction) ? 1 : 0) +
                                ((gradEndFraction < 1.0f) ? 1 : 0);
                        float[] stops = new float[stopsCount];
                        Color[] colors = new Color[stopsCount];
                        int stopIndex = 0;
                        if (gradStartFraction > 0.0f) {
                            stops[stopIndex] = 0.0f;
                            colors[stopIndex] = primaryZero;
                            stopIndex++;
                        }
                        stops[stopIndex] = gradStartFraction;
                        colors[stopIndex] = primary;
                        stopIndex++;
                        if (gradEndFraction > gradStartFraction) {
                            stops[stopIndex] = gradEndFraction;
                            colors[stopIndex] = primary;
                            stopIndex++;
                        }
                        if (gradEndFraction < 1.0f) {
                            stops[stopIndex] = 1.0f;
                            colors[stopIndex] = primaryZero;
                        }

                        LinearGradientPaint primaryPaint = new LinearGradientPaint(
                                0, 0, scaledWidth, 0,
                                stops, colors);
                        graphics1X.setPaint(primaryPaint);
                        graphics1X.draw(new Line2D.Float(0, regularY, scaledWidth, regularY));

                        if (hasShadow) {
                            float shadowY = regularY + 1.0f;

                            stopIndex = 0;
                            if (gradStartFraction > 0.0f) {
                                stops[stopIndex] = 0.0f;
                                colors[stopIndex] = secondaryZero;
                                stopIndex++;
                            }
                            stops[stopIndex] = gradStartFraction;
                            colors[stopIndex] = secondary;
                            stopIndex++;
                            if (gradEndFraction > gradStartFraction) {
                                stops[stopIndex] = gradEndFraction;
                                colors[stopIndex] = secondary;
                                stopIndex++;
                            }
                            if (gradEndFraction < 1.0f) {
                                stops[stopIndex] = 1.0f;
                                colors[stopIndex] = secondaryZero;
                            }

                            LinearGradientPaint secondaryPaint = new LinearGradientPaint(
                                    0, 0, scaledWidth, 0,
                                    stops, colors);
                            graphics1X.setPaint(secondaryPaint);
                            graphics1X.draw(new Line2D.Float(0, shadowY, scaledWidth, shadowY));
                        }
                    }
                });
        graphics.dispose();
    }

    /**
     * Paints vertical separator lines.
     *
     * @param g
     *         Graphics context.
     * @param c
     *         Component.
     * @param scheme
     *         Color scheme for painting the vertical separator lines.
     * @param y
     *         The top Y coordinate of the lines.
     * @param x
     *         The X coordinates of the lines.
     * @param height
     *         The height of the lines.
     * @param fadeStartFraction
     *         The start fraction of the fade out sequence.
     */
    public static void paintVerticalLines(Graphics g, Component c, RadianceColorScheme scheme,
            int y, Collection<Integer> x, int height, float fadeStartFraction) {
        if (x.isEmpty()) {
            return;
        }

        int minX = Collections.min(x);
        int maxX = Collections.max(x);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(minX, y);
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, maxX - minX + 1, height,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    Color backgroundFill = RadianceColorUtilities.getBackgroundFillColor(c);
                    Color primary = scheme.getSeparatorPrimaryColor();
                    Color secondary = scheme.getSeparatorSecondaryColor();
                    Color primaryZero = RadianceColorUtilities.getInterpolatedColor(
                            primary, backgroundFill, 0.0f);
                    Color secondaryZero = RadianceColorUtilities.getInterpolatedColor(
                            secondary, backgroundFill, 0.0f);

                    graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_ROUND));

                    for (int lineX : x) {
                        int xOffset = (int) (scaleFactor * (lineX - minX));
                        LinearGradientPaint forePaint = new LinearGradientPaint(
                                0, 0, 0, scaledHeight,
                                new float[]{0.0f, fadeStartFraction, 1.0f},
                                new Color[]{primary, primary, primaryZero});
                        graphics1X.setPaint(forePaint);
                        graphics1X.drawLine(xOffset, 0, xOffset, scaledHeight);

                        LinearGradientPaint backPaint = new LinearGradientPaint(
                                0, 0, 0, scaledHeight,
                                new float[]{0.0f, fadeStartFraction, 1.0f},
                                new Color[]{secondary, secondary, secondaryZero});
                        graphics1X.setPaint(backPaint);
                        graphics1X.drawLine(xOffset + 1, 0, xOffset + 1, scaledHeight);
                    }
                });
    }

    /**
     * Paints horizontal separator lines.
     *
     * @param g
     *         Graphics context.
     * @param c
     *         Component.
     * @param scheme
     *         Color scheme for painting the horizontal separator lines.
     * @param x
     *         The left X coordinate of the lines.
     * @param y
     *         The Y coordinates of the lines.
     * @param width
     *         The width of the lines.
     * @param fadeStartFraction
     *         The start fraction of the fade out sequence.
     * @param isLtr
     *         If <code>true</code>, the lines are left-to-right and the fade out is on the right
     *         side. Otherwise, the fade out is on the left side.
     */
    public static void paintHorizontalLines(Graphics g, Component c, RadianceColorScheme scheme,
            int x, Collection<Integer> y, int width, float fadeStartFraction, boolean isLtr) {
        if (y.isEmpty()) {
            return;
        }

        int minY = Collections.min(y);
        int maxY = Collections.max(y);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, minY);
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, maxY - minY + 1,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    Color backgroundFill = RadianceColorUtilities.getBackgroundFillColor(c);
                    Color primary = scheme.getSeparatorPrimaryColor();
                    Color secondary = scheme.getSeparatorSecondaryColor();
                    Color primaryZero = RadianceColorUtilities.getInterpolatedColor(
                            primary, backgroundFill, 0.0f);
                    Color secondaryZero = RadianceColorUtilities.getInterpolatedColor(
                            secondary, backgroundFill, 0.0f);

                    graphics1X.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
                            BasicStroke.JOIN_ROUND));

                    for (int lineY : y) {
                        int yOffset = (int) (scaleFactor * (lineY - minY));
                        LinearGradientPaint forePaint = new LinearGradientPaint(
                                0, 0, scaledWidth, 0,
                                new float[]{0.0f, fadeStartFraction, 1.0f},
                                new Color[]{isLtr ? primary : primaryZero, primary,
                                        isLtr ? primaryZero : primary});
                        graphics1X.setPaint(forePaint);
                        graphics1X.drawLine(0, yOffset, scaledWidth, yOffset);

                        LinearGradientPaint backPaint = new LinearGradientPaint(
                                0, 0, scaledWidth, 0,
                                new float[]{0.0f, fadeStartFraction, 1.0f},
                                new Color[]{isLtr ? secondary : secondaryZero, secondary,
                                        isLtr ? secondaryZero : secondary});
                        graphics1X.setPaint(backPaint);
                        graphics1X.drawLine(0, yOffset + 1, scaledWidth, yOffset + 1);
                    }
                });
    }
}
