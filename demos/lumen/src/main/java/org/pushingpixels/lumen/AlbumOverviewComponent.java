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
package org.pushingpixels.lumen;

import org.pushingpixels.lumen.data.SearchResultRelease;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.Timeline.RepeatBehavior;
import org.pushingpixels.trident.api.TimelineRunnable;
import org.pushingpixels.trident.api.TimelineScenario;
import org.pushingpixels.trident.api.ease.Spline;
import org.pushingpixels.trident.api.swing.SwingComponentTimeline;
import org.pushingpixels.trident.api.swing.SwingRepaintCallback;
import org.pushingpixels.trident.api.swing.TimelineSwingWorker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

/**
 * Displays the overview information on the specific album.
 *
 * @author Kirill Grouchnikov
 */
public class AlbumOverviewComponent extends JComponent {
    /**
     * The dimensions of the overview image.
     */
    public static final int OVERVIEW_IMAGE_DIM = 132;
    /**
     * Default width of this component.
     */
    public static final int DEFAULT_WIDTH = 160;
    /**
     * Default height of this component.
     */
    public static final int DEFAULT_HEIGHT = 200;
    /**
     * Component insets.
     */
    private static final int INSETS = 8;
    /**
     * The original album art.
     */
    private BufferedImage image;
    /**
     * Indicates whether the image loading is done.
     */
    private boolean imageLoadedDone;
    /**
     * The alpha value of the image. Is updated in the fade-in timeline which
     * starts after the image has been successfully loaded and scaled.
     */
    private float imageAlpha;
    /**
     * The alpha value of the border. Is updated in the fade-in timeline which
     * starts when the mouse moves over this component.
     */
    private float borderAlpha;
    /**
     * The album caption.
     */
    private String caption;
    /**
     * The album price.
     */
    private String releaseDate;
    /**
     * The alpha value of this component. Is updated in the fade-in timeline
     * which starts when this component becomes a part of the host window
     * hierarchy.
     */
    private float alpha;
    private Font labelFont;

    /**
     * Creates a new component that shows overview information on the specified
     * album.
     *
     * @param albumItem Information on an album.
     */
    public AlbumOverviewComponent(final SearchResultRelease albumItem) {
        this.caption = albumItem.title;
        this.releaseDate = albumItem.date;
        this.imageLoadedDone = false;
        this.imageAlpha = 0.0f;

        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setOpaque(false);
        this.alpha = 0.0f;

        // When the component is shown fade it in
        this.addHierarchyListener(hierarchyEvent ->
                SwingComponentTimeline.componentBuilder(AlbumOverviewComponent.this)
                        .addPropertyToInterpolate("alpha", 0.0f, 1.0f)
                        .addCallback(new SwingRepaintCallback(AlbumOverviewComponent.this))
                        .setDuration(1000)
                        .play());

        final Timeline rolloverTimeline = SwingComponentTimeline.componentBuilder(this)
                .addPropertyToInterpolate("borderAlpha", 0.0f, 0.6f)
                .addCallback(new SwingRepaintCallback(AlbumOverviewComponent.this))
                .setEase(new Spline(0.7f))
                .setDuration(800)
                .build();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                rolloverTimeline.playLoop(RepeatBehavior.REVERSE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                rolloverTimeline.playReverse();
            }
        });
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                if (borderAlpha > 0.0f) {
                    rolloverTimeline.playReverse();
                }
            }
        });

        this.labelFont = NeonCortex.getDefaultFontPolicy().getFontSet().getControlFont();

        SwingUtilities.invokeLater(() -> getLoadImageScenario(albumItem).play());
    }

    /**
     * Returns the timeline scenario that loads, scales and fades in the
     * associated album art.
     *
     * @param albumItem Album item.
     * @return The timeline scenario that loads, scaled and fades in the
     * associated album art.
     */
    private TimelineScenario getLoadImageScenario(final SearchResultRelease albumItem) {
        TimelineScenario loadScenario = new TimelineScenario.Sequence();

        // load the image
        TimelineSwingWorker<Void, Void> imageLoadWorker = new TimelineSwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                image = BackendConnector.getLargeAlbumArt(albumItem.asin);
                return null;
            }
        };
        loadScenario.addScenarioActor(imageLoadWorker);

        // scale if necessary
        TimelineRunnable scaler = new TimelineRunnable() {
            @Override
            public void run() {
                if (image != null) {
                    float vFactor = (float) OVERVIEW_IMAGE_DIM / (float) image.getHeight();
                    float hFactor = (float) OVERVIEW_IMAGE_DIM / (float) image.getWidth();
                    float factor = Math.min(1.0f, Math.min(vFactor, hFactor));
                    if (factor < 1.0f) {
                        // scaled to fit available area
                        image = NeonCortex.createThumbnail(image,
                                (int) (factor * image.getWidth()));
                    }

                    imageLoadedDone = true;
                }
            }
        };
        loadScenario.addScenarioActor(scaler);

        // and fade it in
        loadScenario.addScenarioActor(Timeline.builder(AlbumOverviewComponent.this)
                .addPropertyToInterpolate("imageAlpha", 0.0f, 1.0f)
                .addCallback(new SwingRepaintCallback(AlbumOverviewComponent.this))
                .setDuration(500)
                .build());

        return loadScenario;
    }

    /**
     * Sets the alpha value for the image. Used by the image fade-in timeline.
     *
     * @param imageAlpha Alpha value for the image.
     */
    public void setImageAlpha(float imageAlpha) {
        this.imageAlpha = imageAlpha;
    }

    /**
     * Sets the alpha value for the border. Used by the rollover timeline.
     *
     * @param borderAlpha Alpha value for the border.
     */
    public void setBorderAlpha(float borderAlpha) {
        this.borderAlpha = borderAlpha;
    }

    /**
     * Sets the alpha value. Used by the fade-in timeline.
     *
     * @param alpha Alpha value for this component.
     */
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        g2d.setPaint(new GradientPaint(0, 0, new Color(0, 0, 0, 196), 0,
                DEFAULT_HEIGHT, new Color(0, 0, 0, 0)));
        g2d.fillRoundRect(0, 0, DEFAULT_WIDTH - 1, DEFAULT_HEIGHT - 1, 18, 18);
        g2d.drawRoundRect(0, 0, DEFAULT_WIDTH - 1, DEFAULT_HEIGHT - 1, 18, 18);

        if (this.borderAlpha > 0.0f) {
            // show the pulsating bluish outline of the rollover album
            g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha * this.borderAlpha));
            g2d.setPaint(new GradientPaint(0, 0, new Color(64, 140, 255, 196),
                    0, DEFAULT_HEIGHT, new Color(64, 140, 255, 0)));
            g2d.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_ROUND));
            g2d.drawRoundRect(1, 1, DEFAULT_WIDTH - 2, DEFAULT_HEIGHT - 2, 17, 17);
            g2d.setStroke(new BasicStroke(1.0f));
            g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));
        }

        int contentHorizontalOffset = INSETS;
        if (this.imageLoadedDone) {
            Graphics2D g2dImage = (Graphics2D) g2d.create();
            g2dImage.setComposite(AlphaComposite.SrcOver.derive(this.alpha * this.imageAlpha));

            // draw the album art image
            double scaleFactor = NeonCortex.getScaleFactor();
            int imageWidth = this.image.getWidth();
            int imageHeight = this.image.getHeight();
            contentHorizontalOffset = (int) ((this.getWidth() - imageWidth / scaleFactor) / 2);
            int offsetY = INSETS + (int) ((OVERVIEW_IMAGE_DIM - imageHeight / scaleFactor) / 2);
            g2dImage.drawImage(this.image, contentHorizontalOffset, offsetY,
                    (int) (imageWidth / scaleFactor), (int) (imageHeight / scaleFactor), null);
            g2dImage.dispose();
        }

        g2d.setColor(Color.white);
        g2d.setFont(this.labelFont);

        FontMetrics fontMetrics = g2d.getFontMetrics();
        int textY = INSETS + OVERVIEW_IMAGE_DIM + fontMetrics.getHeight();
        int textWidth = DEFAULT_WIDTH - 2 * contentHorizontalOffset;
        LumenUtils.paintMultilineText(g2d, this.caption, contentHorizontalOffset,
                textWidth, textY, 2);

        g2d.setColor(new Color(64, 140, 255));
        LumenUtils.paintMultilineText(g2d, this.releaseDate, contentHorizontalOffset, textWidth,
                textY + 2 * g2d.getFontMetrics().getHeight(), 1);

        g2d.dispose();
    }
}
