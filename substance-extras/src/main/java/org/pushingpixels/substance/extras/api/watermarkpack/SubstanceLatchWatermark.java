/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;

/**
 * Simple implementation of {@link SubstanceWatermark}, drawing cross hatches as
 * watermark. This class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceLatchWatermark implements SubstanceWatermark {
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
        NeonCortex.drawImage(graphics, SubstanceLatchWatermark.watermarkImage, x, y, width,
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
        SubstanceLatchWatermark.watermarkImage = NeonCortex
                .getBlankImage(screenWidth, screenHeight);

        Graphics2D graphics = SubstanceLatchWatermark.watermarkImage.createGraphics();

        boolean status = this.drawWatermarkImage(skin, graphics, 0, 0,
                screenWidth, screenHeight, false);
        graphics.dispose();
        return status;
    }

    @Override
    public void previewWatermark(Graphics g, SubstanceSkin skin, int x, int y,
            int width, int height) {
        this.drawWatermarkImage(skin, (Graphics2D) g, x, y, width, height, true);
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

        Color c1 = stampColorDark;
        Color c2 = SubstanceColorUtilities.getInterpolatedColor(stampColorDark,
                stampColorAll, 0.5);
        graphics.setColor(stampColorAll);
        graphics.fillRect(0, 0, width, height);

        int dimension = 12;
        BufferedImage tile = NeonCortex.getBlankUnscaledImage(dimension, dimension);
        GeneralPath latch1 = new GeneralPath();
        latch1.moveTo(0.45f * dimension, 0);
        latch1.quadTo(0.45f * dimension, 0.45f * dimension, 0.05f * dimension, 0.45f * dimension);
        latch1.quadTo(0.15f * dimension, 0.15f * dimension, 0.45f * dimension, 0);
        this.drawLatch(tile, latch1, c1, c2);

        GeneralPath latch2 = new GeneralPath();
        latch2.moveTo(0.55f * dimension, 0.55f * dimension);
        latch2.quadTo(0.75f * dimension, 0.4f * dimension, dimension, dimension);
        latch2.quadTo(0.4f * dimension, 0.75f * dimension, 0.5f * dimension, 0.5f * dimension);
        this.drawLatch(tile, latch2, c1, c2);

        for (int row = 0; row < height; row += dimension) {
            for (int col = 0; col < width; col += dimension) {
                graphics.drawImage(tile, x + col, y + row, null);
            }
        }
        return true;
    }

    /**
     * Draws a single latch.
     *
     * @param tile         Tile to draw on.
     * @param latchOutline Latch outline path.
     * @param colorLight   Light color.
     * @param colorDark    Dark color.
     */
    private void drawLatch(BufferedImage tile, GeneralPath latchOutline,
            Color colorLight, Color colorDark) {

        Graphics2D graphics = (Graphics2D) tile.getGraphics().create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        graphics.setColor(colorLight);
        graphics.draw(latchOutline);
        graphics.setColor(colorDark);
        graphics.setStroke(new BasicStroke(1.5f));
        graphics.fill(latchOutline);

        graphics.dispose();
    }

    @Override
    public String getDisplayName() {
        return "Latch";
    }

    @Override
    public void dispose() {
        watermarkImage = null;
    }
}
