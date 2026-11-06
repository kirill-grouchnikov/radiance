/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.loading.api;

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior;
import org.pushingpixels.radiance.animation.api.ease.Linear;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

/**
 * A Swing component that renders an animated chevrons spinner.
 *
 * <p>This is a migration of the {@code Chevrons} composable from the Aurora loading
 * module. It draws three chevron (V-shaped) paths that fade in and out with a
 * staggered delay, creating a sequential wave effect.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class ChevronsSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1000;
    private static final int CHEVRON_COUNT = 3;

    /** Stroke cap style. */
    private int cap;

    /** Per-chevron alpha animation values. */
    private float[] alphas;

    /** Animation timelines for each chevron. */
    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code ChevronsSpinner} with default color (black), default
     * duration (1000 ms) and round cap.
     */
    public ChevronsSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code ChevronsSpinner} with the specified color.
     *
     * @param color the color of the chevrons
     */
    public ChevronsSpinner(Color color) {
        this(color, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code ChevronsSpinner} with the specified color, duration
     * and stroke cap.
     *
     * @param color    the color of the chevrons
     * @param duration the animation cycle duration in milliseconds
     * @param cap      the stroke cap style
     */
    public ChevronsSpinner(Color color, int duration, int cap) {
        super(color, duration);
        this.cap = cap;
        this.alphas = new float[CHEVRON_COUNT];
        java.util.Arrays.fill(this.alphas, 1f);
    }

    /**
     * Returns the stroke cap style.
     *
     * @return the cap style
     */
    public int getCap() {
        return cap;
    }

    /**
     * Sets the stroke cap style.
     *
     * @param cap the new cap style
     */
    public void setCap(int cap) {
        if (cap != BasicStroke.CAP_BUTT && cap != BasicStroke.CAP_ROUND && cap != BasicStroke.CAP_SQUARE) {
            throw new IllegalArgumentException(
                "Invalid cap style: " + cap + ". Must be one of BasicStroke.CAP_BUTT, BasicStroke.CAP_ROUND, or BasicStroke.CAP_SQUARE");
        }
        int old = this.cap;
        this.cap = cap;
        firePropertyChange("cap", old, cap);
        repaint();
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[CHEVRON_COUNT];
        }

        for (int i = 0; i < CHEVRON_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / CHEVRON_COUNT;

            SwingRepaintTimeline.Builder builder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("alpha" + index)
                                    .getWith((obj, fieldName) -> alphas[index])
                                    .setWith((obj, fieldName, value) -> alphas[index] = value)
                                    .from(1f).to(0.2f))
                    .setEase(new Linear())
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay);

            this.timelines[index] = builder.build();
        }

        SwingUtilities.invokeLater(() -> {
            if (ChevronsSpinner.this.isDisplayable()) {
                for (SwingRepaintTimeline tl : timelines) {
                    if (tl != null) {
                        tl.playLoop(RepeatBehavior.LOOP);
                    }
                }
            }
        });
    }

    @Override
    protected void stopAnimations() {
        if (this.timelines != null) {
            for (SwingRepaintTimeline tl : this.timelines) {
                if (tl != null) {
                    tl.abort();
                }
            }
        }
    }

    // ─── Painting ─────────────────────────────────────────────────────────

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        if (width <= 0 || height <= 0) {
            return;
        }

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);

        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {

                    float strokeWidth = 2.5f * (float) scaleFactor;
                    int dim = Math.min(scaledWidth, scaledHeight) - (int) strokeWidth - 1;
                    int dx = (scaledWidth - dim) / 2 + (int) strokeWidth / 2;
                    int dy = (scaledHeight - dim) / 2 + (int) strokeWidth / 2;

                    graphics1X.translate(dx, dy);

                    float scale = dim / 24f;

                    // Chevron x positions: [3.5, 9, 14.5]
                    float[] chevronsX = {3.5f, 9f, 14.5f};
                    float chevronsY = 6.5f;

                    for (int index = 0; index < CHEVRON_COUNT; index++) {
                        float alpha = Math.max(0f, Math.min(1f, alphas[index]));
                        int a = Math.round(alpha * 255);
                        graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(),
                                this.color.getBlue(), a));

                        float startX = chevronsX[index] * scale;
                        float startY = chevronsY * scale;

                        GeneralPath path = new GeneralPath();
                        path.moveTo(startX, startY);
                        path.lineTo((chevronsX[index] + 5.5f) * scale, (chevronsY + 5.5f) * scale);
                        path.lineTo(startX, (chevronsY + 11f) * scale);

                        graphics1X.setStroke(new BasicStroke(strokeWidth, this.cap,
                                BasicStroke.JOIN_ROUND, 0, null, 0));
                        graphics1X.draw(path);
                    }
                });

        graphics.dispose();
    }
}
