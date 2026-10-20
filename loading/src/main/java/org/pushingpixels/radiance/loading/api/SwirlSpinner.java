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

/**
 * A Swing component that renders an animated swirl spinner.
 *
 * <p>This is a migration of the {@code Swirl} composable from the Aurora loading
 * module. It draws a spiral-like shape that rotates continuously.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class SwirlSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1000;
    private static final float DEFAULT_STROKE_WIDTH = 2.5f;

    private int cap;

    private float[] angleValues;

    private SwingRepaintTimeline timeline;

    public SwirlSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    public SwirlSpinner(Color color) {
        this(color, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    public SwirlSpinner(Color color, int duration, int cap) {
        super(color, duration);
        this.cap = cap;
        this.angleValues = new float[]{0f};
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        int old = this.cap;
        this.cap = cap;
        firePropertyChange("cap", old, cap);
        repaint();
    }

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

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
            if (SwirlSpinner.this.isDisplayable()) {
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Insets insets = getInsets();
        int width = getWidth() - insets.left - insets.right;
        int height = getHeight() - insets.top - insets.bottom;
        if (width <= 0 || height <= 0) return;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        float strokeWidth = DEFAULT_STROKE_WIDTH;
        int dim = Math.min(width, height) - (int) strokeWidth - 1;
        int dx = insets.left + (width - dim) / 2 + (int) strokeWidth / 2;
        int dy = insets.top + (height - dim) / 2 + (int) strokeWidth / 2;

        float center = dx + dim / 2f;
        float centerY = dy + dim / 2f;

        // Draw a swirl pattern using multiple arcs at different radii
        Graphics2D rotated = (Graphics2D) graphics.create();
        rotated.rotate(Math.toRadians(angleValues[0]), center, centerY);
        rotated.setColor(color);
        rotated.setStroke(new BasicStroke(DEFAULT_STROKE_WIDTH, this.cap, BasicStroke.JOIN_ROUND));

        // Draw 3 concentric arcs offset by 120 degrees
        for (int i = 0; i < 3; i++) {
            float radius = dim * (0.15f + i * 0.1f);
            float arcAngle = 240f;
            float startAngle = i * 120f;

            rotated.drawArc(
                    (int) Math.round(center - radius), (int) Math.round(centerY - radius),
                    (int) Math.round(radius * 2), (int) Math.round(radius * 2),
                    (int) Math.round(startAngle), (int) Math.round(arcAngle));
        }

        rotated.dispose();
        graphics.dispose();
    }
}
