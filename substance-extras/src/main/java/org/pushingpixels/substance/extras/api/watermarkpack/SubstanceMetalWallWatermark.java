/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.api.watermarkpack;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Simple implementation of {@link SubstanceWatermark}, drawing cross hatches as
 * watermark. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceMetalWallWatermark implements SubstanceWatermark {
    /**
     * Watermark image (screen-sized).
     */
    private static BufferedImage watermarkImage = null;

    @Override
    public void drawWatermarkImage(Graphics graphics, Component c, int x,
            int y, int width, int height) {
        if (!c.isShowing())
            return;
        int dx = c.getLocationOnScreen().x;
        int dy = c.getLocationOnScreen().y;
        NeonCortex.drawImage(graphics, SubstanceMetalWallWatermark.watermarkImage, x, y, width,
                height, dx, dy);
    }

    @Override
    public boolean updateWatermarkImage(SubstanceSkin skin) {
        // fix by Chris for bug 67 - support for multiple screens
        Rectangle virtualBounds = new Rectangle();
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        GraphicsDevice[] gds = ge.getScreenDevices();
        for (GraphicsDevice gd : gds) {
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            virtualBounds = virtualBounds.union(gc.getBounds());
        }

        int screenWidth = virtualBounds.width;
        int screenHeight = virtualBounds.height;
        SubstanceMetalWallWatermark.watermarkImage = NeonCortex.getBlankImage(screenWidth, screenHeight);

        Graphics2D graphics = SubstanceMetalWallWatermark.watermarkImage.createGraphics();

        boolean status = this.drawWatermarkImage(skin, graphics, 0, 0,
                screenWidth, screenHeight, false);
        graphics.dispose();
        return status;
    }

    @Override
    public void previewWatermark(Graphics g, SubstanceSkin skin, int x, int y,
            int width, int height) {
        this.drawWatermarkImage(skin, (Graphics2D) g, x - 60, y - 120,
                60 + width, 120 + height, true);
    }

    /**
     * Draws the specified portion of the watermark image.
     *
     * @param skin      Skin to use for painting the watermark.
     * @param graphics  Graphic context.
     * @param x         the <i>x</i> coordinate of the watermark to be drawn.
     * @param y         The <i>y</i> coordinate of the watermark to be drawn.
     * @param width     The width of the watermark to be drawn.
     * @param height    The height of the watermark to be drawn.
     * @param isPreview Indication whether the result is a preview image.
     * @return Indication whether the draw succeeded.
     */
    private boolean drawWatermarkImage(SubstanceSkin skin, Graphics2D graphics,
            int x, int y, int width, int height, boolean isPreview) {
        Color stampColorDark = null;
        Color stampColorAll = null;
        SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
        if (isPreview) {
            stampColorDark = scheme.isDark() ? Color.white : Color.black;
            stampColorAll = Color.lightGray;
        } else {
            stampColorDark = scheme.getWatermarkDarkColor();
            stampColorAll = scheme.getWatermarkStampColor();
        }

        graphics.setColor(stampColorAll);
        graphics.fillRect(0, 0, width, height);

        Color c1 = stampColorDark;
        Color c2 = SubstanceColorUtilities.getInterpolatedColor(stampColorDark,
                stampColorAll, 0.5);

        BufferedImage tile = NeonCortex.getBlankUnscaledImage(128, 128);
        this.drawTilePolygon(tile, new Polygon(new int[] { 0, 49, 49, 0 },
                new int[] { 0, 0, 17, 17 }, 4), c1, c2);
        this.drawBolt(tile, 3, 3, c1, c2);
        this.drawBolt(tile, 44, 3, c1, c2);
        this.drawBolt(tile, 44, 12, c1, c2);
        this.drawBolt(tile, 3, 12, c1, c2);

        this.drawTilePolygon(tile, new Polygon(
                new int[] { 66, 85, 85, 49, 49 },
                new int[] { 0, 0, 30, 30, 17 }, 5), c1, c1);
        this.drawBolt(tile, 67, 3, c1, c2);
        this.drawBolt(tile, 80, 3, c1, c2);
        this.drawBolt(tile, 80, 25, c1, c2);
        this.drawBolt(tile, 51, 25, c1, c2);

        this.drawTilePolygon(tile, new Polygon(new int[] { 86, 102, 102, 86 },
                new int[] { 0, 0, 17, 17 }, 4), c1, c2);
        this.drawBolt(tile, 88, 3, c1, c2);
        this.drawBolt(tile, 97, 3, c1, c2);
        this.drawBolt(tile, 97, 11, c1, c2);
        this.drawBolt(tile, 88, 11, c1, c2);

        this.drawTilePolygon(tile, new Polygon(new int[] { -1, 9, 9, -1 },
                new int[] { 22, 22, 36, 36 }, 4), c1, c2);
        this.drawBolt(tile, 5, 24, c1, c2);
        this.drawBolt(tile, 5, 31, c1, c2);

        this.drawTilePolygon(tile, new Polygon(
                new int[] { 118, 128, 128, 118 }, new int[] { 22, 22, 36, 36 },
                4), c1, c2);
        this.drawBolt(tile, 120, 24, c1, c2);
        this.drawBolt(tile, 120, 31, c1, c2);

        this.drawTilePolygon(tile, new Polygon(new int[] { 49, 85, 85, 45, 45,
                        22, 0, 29 }, new int[] { 31, 31, 57, 57, 75, 75, 50, 50 }, 8),
                c1, c2);
        this.drawBolt(tile, 51, 33, c1, c2);
        this.drawBolt(tile, 80, 33, c1, c2);
        this.drawBolt(tile, 80, 52, c1, c2);
        this.drawBolt(tile, 51, 52, c1, c2);
        this.drawBolt(tile, 40, 70, c1, c2);
        this.drawBolt(tile, 24, 70, c1, c2);
        this.drawBolt(tile, 8, 52, c1, c2);
        this.drawBolt(tile, 30, 52, c1, c2);

        this.drawTilePolygon(tile, new Polygon(new int[] { 86, 96, 96, 86 },
                new int[] { 45, 45, 57, 57 }, 4), c1, c2);
        this.drawBolt(tile, 88, 47, c1, c2);
        this.drawBolt(tile, 88, 52, c1, c2);

        this.drawTilePolygon(tile, new Polygon(new int[] { 97, 118, 118, 127,
                127, 102, 102, 97 }, new int[] { 45, 45, 60, 60, 100, 69, 57,
                57 }, 8), c1, c2);
        this.drawBolt(tile, 99, 47, c1, c2);
        this.drawBolt(tile, 113, 47, c1, c2);
        this.drawBolt(tile, 119, 62, c1, c2);
        this.drawBolt(tile, 104, 67, c1, c2);
        this.drawBolt(tile, 115, 80, c1, c2);
        this.drawBolt(tile, 123, 91, c1, c2);

        this.drawTilePolygon(tile, new Polygon(new int[] { 46, 66, 66, 40, 40,
                32, 32, 0, 0, 22, 22, 46 }, new int[] { 58, 58, 85, 109, 127,
                127, 109, 109, 100, 100, 76, 76 }, 12), c1, c2);
        this.drawBolt(tile, 48, 58, c1, c2);
        this.drawBolt(tile, 61, 58, c1, c2);
        this.drawBolt(tile, 61, 82, c1, c2);
        this.drawBolt(tile, 34, 122, c1, c2);
        this.drawBolt(tile, 16, 102, c1, c2);
        this.drawBolt(tile, 3, 102, c1, c2);
        this.drawBolt(tile, 24, 77, c1, c2);
        this.drawBolt(tile, 43, 77, c1, c2);

        this.drawTilePolygon(tile, new Polygon(new int[] { 67, 102, 102, 85,
                85, 66, 66, 45 }, new int[] { 85, 85, 104, 104, 127, 127, 112,
                106 }, 8), c1, c2);
        this.drawBolt(tile, 68, 87, c1, c2);
        this.drawBolt(tile, 97, 87, c1, c2);
        this.drawBolt(tile, 97, 99, c1, c2);
        this.drawBolt(tile, 80, 104, c1, c2);
        this.drawBolt(tile, 80, 122, c1, c2);
        this.drawBolt(tile, 68, 122, c1, c2);
        this.drawBolt(tile, 52, 102, c1, c2);

        this.drawTilePolygon(tile, new Polygon(new int[] { 86, 127, 127, 102,
                93, 127, 127, 86 }, new int[] { 105, 105, 109, 109, 118, 117,
                127, 127 }, 8), c1, c2);
        this.drawBolt(tile, 88, 106, c1, c2);
        this.drawBolt(tile, 122, 122, c1, c2);
        this.drawBolt(tile, 88, 122, c1, c2);

        for (int row = 0; row < height; row += 127) {
            for (int col = 0; col < width; col += 127) {
                graphics.drawImage(tile, x + col, y + row, null);
            }
        }
        return true;
    }

    /**
     * Draws a single tile polygon.
     *
     * @param tile       Tile to draw on.
     * @param polygon    Polygon path.
     * @param colorLight Light color.
     * @param colorDark  Dark color.
     */
    private void drawTilePolygon(BufferedImage tile, Polygon polygon,
            Color colorLight, Color colorDark) {
        int minX = tile.getWidth();
        int maxX = 0;
        for (int x : polygon.xpoints) {
            minX = Math.min(x, minX);
            maxX = Math.max(x, maxX);
        }
        int minY = tile.getHeight();
        int maxY = 0;
        for (int y : polygon.ypoints) {
            minY = Math.min(y, minY);
            maxY = Math.max(y, maxY);
        }

        Graphics2D graphics = tile.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        graphics.setStroke(new BasicStroke(0.7f));
        graphics.setPaint(new GradientPaint(minX, minY, colorLight, maxX, maxY,
                colorDark));
        graphics.drawPolygon(polygon);
        graphics.setComposite(AlphaComposite.getInstance(
                AlphaComposite.SRC_OVER, 0.1f));
        graphics.fillPolygon(polygon);

        graphics.dispose();
    }

    /**
     * Draws a single bolt.
     *
     * @param tile       Tile to draw on.
     * @param x          Bolt X.
     * @param y          Bolt Y.
     * @param colorLight Light color.
     * @param colorDark  Dark color.
     */
    private void drawBolt(BufferedImage tile, int x, int y, Color colorLight,
            Color colorDark) {
        Graphics2D graphics = tile.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_OFF);
        graphics.setColor(colorDark);
        graphics.fillOval(x, y, 4, 4);
        graphics.setColor(colorLight);
        graphics.fillOval(x, y, 3, 3);
    }

    @Override
    public String getDisplayName() {
        return "Metal Wall";
    }

    @Override
    public void dispose() {
        watermarkImage = null;
    }
}
