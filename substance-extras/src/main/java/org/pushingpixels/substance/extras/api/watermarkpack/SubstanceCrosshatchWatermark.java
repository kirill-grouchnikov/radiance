/*
 * Copyright (c) 2005-2010 Substance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Simple implementation of {@link SubstanceWatermark}, drawing cross hatches as
 * watermark. This implementation is inspired by Office 12 background. This
 * class is part of officially supported API.
 *
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceCrosshatchWatermark implements SubstanceWatermark {
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
        NeonCortex.drawImage(graphics, SubstanceCrosshatchWatermark.watermarkImage, x, y, width,
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
        SubstanceCrosshatchWatermark.watermarkImage = NeonCortex.getBlankImage(screenWidth,
                screenHeight);

        Graphics2D graphics = SubstanceCrosshatchWatermark.watermarkImage.createGraphics();
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
        Color stampColorLight = null;
        SubstanceColorScheme scheme = skin.getWatermarkColorScheme();
        if (isPreview) {
            stampColorDark = scheme.isDark() ? Color.white : Color.black;
            stampColorAll = Color.lightGray;
            stampColorLight = scheme.isDark() ? Color.black : Color.white;
        } else {
            stampColorDark = scheme.getWatermarkDarkColor();
            stampColorAll = scheme.getWatermarkStampColor();
            stampColorLight = scheme.getWatermarkLightColor();
        }

        graphics.setColor(stampColorAll);
        graphics.fillRect(0, 0, width, height);

        BufferedImage tile = NeonCortex.getBlankUnscaledImage(4, 4);
        tile.setRGB(0, 0, stampColorDark.getRGB());
        tile.setRGB(2, 2, stampColorDark.getRGB());
        tile.setRGB(0, 1, stampColorLight.getRGB());
        tile.setRGB(2, 3, stampColorLight.getRGB());

        Graphics2D g2d = (Graphics2D) graphics.create();
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
                0.4f));
        for (int row = y; row < (y + height); row += 4) {
            for (int col = x; col < (x + width); col += 4) {
                g2d.drawImage(tile, col, row, null);
            }
        }
        g2d.dispose();
        return true;
    }

    @Override
    public String getDisplayName() {
        return SubstanceCrosshatchWatermark.getName();
    }

    /**
     * Returns the name of all watermarks of <code>this</code> class.
     *
     * @return The name of all watermarks of <code>this</code> class.
     */
    public static String getName() {
        return "Crosshatch";
    }

    @Override
    public void dispose() {
        watermarkImage = null;
    }
}
