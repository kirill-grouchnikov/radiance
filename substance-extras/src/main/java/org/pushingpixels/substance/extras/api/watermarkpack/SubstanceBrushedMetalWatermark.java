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

import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

/**
 * Simple implementation of {@link SubstanceWatermark}, drawing cross hatches as
 * watermark.
 *
 * @author Kirill Grouchnikov
 * @author Chris Hall
 */
public class SubstanceBrushedMetalWatermark implements SubstanceWatermark {
    /**
     * Watermark image (screen-sized).
     */
    private static BufferedImage watermarkImage = null;

    /**
     * A single brushed metal image tile.
     */
    private Image brushedMetalTile = null;

    /**
     * Creates a new <code>Brushed Metal</code> watermark.
     */
    public SubstanceBrushedMetalWatermark() {
        try {
            ClassLoader cl = SubstanceCoreUtilities.getClassLoaderForResources();
            URL metalUrl = cl
                    .getResource(
                            "org/pushingpixels/substance/extras/api/watermarkpack/brushed.gif");
            this.brushedMetalTile = ImageIO.read(metalUrl);
        } catch (Exception exc) {
            // ignore - probably specified incorrect file
            // or file is not image
        }
    }

    @Override
    public void drawWatermarkImage(Graphics graphics, Component c, int x,
            int y, int width, int height) {
        int dx = c.getLocationOnScreen().x;
        int dy = c.getLocationOnScreen().y;
        graphics.drawImage(SubstanceBrushedMetalWatermark.watermarkImage, x, y,
                x + width, y + height, x + dx, y + dy, x + dx + width, y + dy
                        + height, null);
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
        SubstanceBrushedMetalWatermark.watermarkImage = NeonCortex
                .getBlankImage(screenWidth, screenHeight);

        Graphics2D graphics = SubstanceBrushedMetalWatermark.watermarkImage.createGraphics();
        Composite comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.7f);
        graphics.setComposite(comp);

        boolean status = this.drawWatermarkImage(graphics, 0, 0, screenWidth,
                screenHeight, false);
        graphics.dispose();
        return status;
    }

    @Override
    public void previewWatermark(Graphics g, SubstanceSkin skin, int x, int y,
            int width, int height) {
        this.drawWatermarkImage((Graphics2D) g, x - 60, y - 120, 60 + width,
                120 + height, true);
    }

    /**
     * Draws watermark image.
     *
     * @param graphics  Graphics context.
     * @param x         X coordinate for painting the watermark.
     * @param y         Y coordinate for painting the watermark.
     * @param width     Width of the watermark region.
     * @param height    Height of the watermark region.
     * @param isPreview Indicates whether the drawing should paint the watermark
     *                  preview.
     * @return If <code>true</code>, the watermark painting has succeeded.
     */
    private boolean drawWatermarkImage(Graphics2D graphics, int x, int y,
            int width, int height, boolean isPreview) {
        if (this.brushedMetalTile == null)
            return false;

        for (int row = 0; row < height; row += this.brushedMetalTile.getWidth(null)) {
            for (int col = 0; col < width; col += this.brushedMetalTile.getHeight(null)) {
                graphics.drawImage(this.brushedMetalTile, x + col, y + row, null);
            }
        }
        return true;
    }

    @Override
    public String getDisplayName() {
        return "Brushed Metal";
    }

    @Override
    public void dispose() {
        watermarkImage = null;
    }
}
