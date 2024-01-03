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
package org.pushingpixels.radiance.demo.animation.jmusicapp.details;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Shows the big album art for Amazon album items.
 *
 * @author Kirill Grouchnikov
 */
public class BigAlbumArt extends JComponent {
    /**
     * The maximum dimension of the album art.
     */
    public static final int ALBUM_ART_DIM = 220;
    /**
     * Album art insets.
     */
    public static final int INSETS = 3;
    /**
     * The total dimension required to display album art and track listing side
     * by side.
     */
    public static final int TOTAL_DIM = ALBUM_ART_DIM + INSETS * 2;
    /**
     * The previously displayed album art. Is shown during the fade out stage,
     * controlled by the timeline launched after the call to
     * {@link #setAlbumArtImage(BufferedImage)}.
     */
    private BufferedImage oldImage;
    /**
     * The album art image for the currently displayed Amazon album item.
     */
    private BufferedImage image;
    /**
     * The alpha value for {@link #image}.
     */
    private float imageAlpha;

    /**
     * Creates a new component that shows album art.
     */
    public BigAlbumArt() {
        this.setOpaque(false);
        this.imageAlpha = 0.0f;
    }

    /**
     * Sets the specified album art for the display.
     *
     * @param image Album art.
     */
    public void setAlbumArtImage(BufferedImage image) {
        this.oldImage = this.image;

        this.image = image;
        this.imageAlpha = 0.0f;
        float vFactor = (float) ALBUM_ART_DIM / (float) image.getHeight();
        float hFactor = (float) ALBUM_ART_DIM / (float) image.getWidth();
        float factor = Math.min(1.0f, Math.min(vFactor, hFactor));
        if (factor < 1.0f) {
            // scaled to fit available area
            this.image = RadianceCommonCortex.createThumbnail(RadianceCommonCortex.getScaleFactor(this),
                    image, (int) (factor * image.getWidth()));
        }
    }

    /**
     * Sets the new alpha value for the displayed album art.
     *
     * @param imageAlpha The new alpha value for the displayed album art.
     */
    public void setImageAlpha(float imageAlpha) {
        this.imageAlpha = imageAlpha;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();
        g2d.setColor(new Color(192, 192, 192));
        g2d.fillRoundRect(0, 0, w - 1, h - 1, 4, 4);

        double scaleFactor = RadianceCommonCortex.getScaleFactor(this);
        if (this.imageAlpha < 1.0f) {
            Graphics2D g2dImage = (Graphics2D) g2d.create();
            g2dImage.setComposite(AlphaComposite.SrcOver);
            if (this.oldImage != null) {
                // draw the original image
                int offsetX =
                        (int) ((this.getWidth() - this.oldImage.getWidth() / scaleFactor) / 2);
                int offsetY =
                        INSETS + (int) ((ALBUM_ART_DIM - this.oldImage.getHeight() / scaleFactor) / 2);
                g2dImage.drawImage(this.oldImage, offsetX, offsetY,
                        (int) (this.oldImage.getWidth() / scaleFactor),
                        (int) (this.oldImage.getHeight() / scaleFactor), null);
            }
            g2dImage.dispose();
        }

        if (this.imageAlpha > 0.0f) {
            Graphics2D g2dImage = (Graphics2D) g2d.create();
            g2dImage.setComposite(AlphaComposite.SrcOver.derive(this.imageAlpha));
            if (this.image != null) {
                // draw the original image
                int offsetX = (int) ((this.getWidth() - this.image.getWidth() / scaleFactor) / 2);
                int offsetY =
                        INSETS + (int) ((ALBUM_ART_DIM - this.image.getHeight() / scaleFactor) / 2);
                g2dImage.drawImage(this.image, offsetX, offsetY,
                        (int) (this.image.getWidth() / scaleFactor),
                        (int) (this.image.getHeight() / scaleFactor), null);
            }
            g2dImage.dispose();
        }

        g2d.setColor(Color.white);
        g2d.setStroke(new BasicStroke(2.0f));
        g2d.drawRoundRect(1, 1, w - 2, h - 2, 3, 3);
        g2d.setColor(new Color(128, 128, 128));
        g2d.setStroke(new BasicStroke(1.0f));
        g2d.drawRoundRect(0, 0, w - 1, h - 1, 4, 4);

        g2d.dispose();
    }
}
