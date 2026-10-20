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

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

/**
 * A Swing component that renders an animated clock spinner.
 *
 * <p>This is a migration of the {@code Clock} composable from the Aurora loading
 * module. It draws a clock-hand shaped polygon that continuously rotates 360°
 * against a semi-transparent circular background.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class ClockSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;

    private float[] angleValues;

    private SwingRepaintTimeline timeline;

    // Pre-computed polygon vertices (normalized to unit space)
    private static final float[] VERTICES = {
        (float) (Math.cos(Math.toRadians(330)) * 0.75), (float) (Math.sin(Math.toRadians(330)) * 0.75),
        0f, 0f,
        (float) (Math.cos(Math.toRadians(210)) * 0.75), (float) (Math.sin(Math.toRadians(210)) * 0.75),
        0f, (float) (-1.05)
    };

    /**
     * Creates a new {@code ClockSpinner} with default color (black) and
     * default duration (1200 ms).
     */
    public ClockSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code ClockSpinner} with the specified color.
     *
     * @param color the color of the spinner
     */
    public ClockSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code ClockSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the spinner
     * @param duration the animation cycle duration in milliseconds
     */
    public ClockSpinner(Color color, int duration) {
        super(color, duration);
        this.angleValues = new float[]{0f};
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) {
            return;
        }

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("angle")
                                .getWith((obj, fieldName) -> angleValues[0])
                                .setWith((obj, fieldName, value) -> angleValues[0] = value)
                                .from(0f).to(360f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (ClockSpinner.this.isDisplayable()) {
                timeline.playLoop(RepeatBehavior.LOOP);
            }
        });
    }

    @Override
    protected void stopAnimations() {
        if (this.timeline != null) {
            this.timeline.abort();
            this.timeline = null;
        }
    }

    // ─── Painting ─────────────────────────────────────────────────────────

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Insets insets = getInsets();
        int width = getWidth() - insets.left - insets.right;
        int height = getHeight() - insets.top - insets.bottom;

        if (width <= 0 || height <= 0) {
            return;
        }

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int dim = Math.min(width, height);
        int dx = insets.left + (width - dim) / 2;
        int dy = insets.top + (height - dim) / 2;

        float center = dx + dim / 2f;
        float centerY = dy + dim / 2f;

        // Background semi-transparent circle
        int a = (int) (0.1f * 255);
        graphics.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));
        graphics.fillOval((int) Math.round(center - dim / 2f), (int) Math.round(centerY - dim / 2f),
                dim, dim);

        // Rotated polygon
        Graphics2D rotated = (Graphics2D) graphics.create();
        rotated.rotate(Math.toRadians(angleValues[0]), center, centerY);

        float scale = dim * 0.5f;
        Path2D.Float path = new Path2D.Float();
        path.moveTo(VERTICES[0] * scale + center, VERTICES[1] * scale + centerY);
        path.lineTo(VERTICES[2] * scale + center, VERTICES[3] * scale + centerY);
        path.lineTo(VERTICES[4] * scale + center, VERTICES[5] * scale + centerY);
        path.lineTo(VERTICES[6] * scale + center, VERTICES[7] * scale + centerY);
        path.closePath();

        rotated.setColor(color);
        rotated.fill(path);

        rotated.dispose();
        graphics.dispose();
    }
}
