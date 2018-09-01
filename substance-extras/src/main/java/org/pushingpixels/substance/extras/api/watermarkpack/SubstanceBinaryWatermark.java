/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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

import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Implementation of
 * {@link org.pushingpixels.substance.api.watermark.SubstanceWatermark}, drawing random
 * binary (0-1) glyphs as watermark. This class is part of officially supported
 * API.
 *
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceBinaryWatermark implements SubstanceWatermark {
    /**
     * Watermark image (screen-sized).
     */
    private static BufferedImage watermarkImage = null;

    /**
     * Font size.
     */
    private static int fontSize = 14;

    /**
     * Font instance.
     */
    private static Font tahoma = new Font("Tahoma", Font.BOLD, fontSize);

    /**
     * Font instance for preview.
     */
    private static Font tahomaPreview = new Font("Tahoma", Font.BOLD,
            fontSize - 2);

    @Override
    public void drawWatermarkImage(Graphics graphics, Component c, int x,
            int y, int width, int height) {
        if (!c.isShowing())
            return;
        int dx = c.getLocationOnScreen().x;
        int dy = c.getLocationOnScreen().y;
        NeonCortex.drawImage(graphics, SubstanceBinaryWatermark.watermarkImage, x, y, width, height,
                dx, dy);
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
        SubstanceBinaryWatermark.watermarkImage = NeonCortex.getBlankImage(screenWidth,
                screenHeight);

        Graphics2D graphics = SubstanceBinaryWatermark.watermarkImage.createGraphics();
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

        Color stampColor = null;
        int fontWidth = 0;
        int fontHeight = 0;
        SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
        if (isPreview) {
            stampColor = scheme.isDark() ? Color.white : Color.black;
            graphics.setFont(tahomaPreview);
            fontWidth = fontSize - 6;
            fontHeight = fontSize - 4;
        } else {
            stampColor = scheme.getWatermarkStampColor();
            graphics.setFont(tahoma);
            fontWidth = fontSize - 4;
            fontHeight = fontSize - 2;
        }

        graphics.setColor(stampColor);

        int rows = height / fontHeight;
        int columns = width / fontWidth;
        for (int col = x; col <= (x + columns); col++) {
            for (int row = y; row <= (y + rows); row++) {
                // choose random 0/1 letter
                double val = isPreview ? Math.abs(Math.sin((2.8 + col + columns * row)))
                        : Math.random();
                char c = (val >= 0.5) ? '0' : '1';
                graphics.drawString("" + c, col * fontWidth, fontHeight * (row + 1));
            }
        }
        return true;
    }

    @Override
    public String getDisplayName() {
        return "Binary";
    }

    @Override
    public void dispose() {
        watermarkImage = null;
    }
}
