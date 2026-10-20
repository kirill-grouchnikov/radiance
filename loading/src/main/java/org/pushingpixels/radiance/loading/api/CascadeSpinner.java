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
import org.pushingpixels.radiance.animation.api.ease.Spline;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated cascade spinner.
 *
 * <p>This is a migration of the {@code Cascade} composable from the Aurora loading
 * module. It draws three concentric dashed arcs that rotate at different speeds
 * with custom easing, creating a cascading ripple effect.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class CascadeSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1500;
    private static final float DEFAULT_STROKE_WIDTH = 1.6f;
    private static final int CASCADE_COUNT = 3;
    private static final float[] CASCADE_SCALES = {0.875f, 0.58f, 0.3f};

    private int cap;

    private float[] angles;

    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code CascadeSpinner} with default color (black) and
     * default duration (1500 ms).
     */
    public CascadeSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code CascadeSpinner} with the specified color.
     *
     * @param color the color of the arcs
     */
    public CascadeSpinner(Color color) {
        this(color, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code CascadeSpinner} with the specified color, duration
     * and stroke cap.
     *
     * @param color    the color of the arcs
     * @param duration the animation cycle duration in milliseconds
     * @param cap      the stroke cap style
     */
    public CascadeSpinner(Color color, int duration, int cap) {
        super(color, duration);
        this.cap = cap;
        this.angles = new float[CASCADE_COUNT];
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

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[CASCADE_COUNT];
        }

        for (int i = 0; i < CASCADE_COUNT; i++) {
            final int index = i;
            // Custom cubic bezier easing per cascade
            float y1 = -0.75f * (1.0f + 0.35f * (2 - index));
            Spline spline = new Spline(0.68f, y1, 0.265f, 1.75f);

            SwingRepaintTimeline.Builder builder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("angle" + index)
                                    .getWith((obj, fieldName) -> angles[index])
                                    .setWith((obj, fieldName, value) -> angles[index] = value)
                                    .from(0f).to(360f))
                    .setAllowsOvershoot(true)
                    .setEase(spline)
                    .setDuration(this.duration);

            this.timelines[index] = builder.build();
        }

        SwingUtilities.invokeLater(() -> {
            if (CascadeSpinner.this.isDisplayable()) {
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

        Insets insets = getInsets();
        int width = getWidth() - insets.left - insets.right;
        int height = getHeight() - insets.top - insets.bottom;

        if (width <= 0 || height <= 0) {
            return;
        }

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        float strokeWidth = DEFAULT_STROKE_WIDTH;
        int dim = Math.min(width, height) - (int) strokeWidth - 1;
        int dx = insets.left + (width - dim) / 2 + (int) strokeWidth / 2;
        int dy = insets.top + (height - dim) / 2 + (int) strokeWidth / 2;

        graphics.translate(dx, dy);

        float center = dim / 2f;
        graphics.setColor(color);

        for (int i = 0; i < CASCADE_COUNT; i++) {
            float scaledRadius = 0.5f * dim * CASCADE_SCALES[i];
            float circumference = 2f * (float) Math.PI * scaledRadius;
            float dash = 0.25f * circumference;

            float arcDiameter = 2f * scaledRadius;
            float arcX = center - scaledRadius;
            float arcY = center - scaledRadius;

            // Save and apply rotation
            Graphics2D rotated = (Graphics2D) graphics.create();
            rotated.rotate(Math.toRadians(90.0f + angles[i]), center, center);
            rotated.setColor(color);
            rotated.setStroke(new BasicStroke(DEFAULT_STROKE_WIDTH, this.cap,
                    BasicStroke.JOIN_ROUND, 0, new float[]{dash, circumference - dash}, 0));
            rotated.drawArc((int) Math.round(arcX), (int) Math.round(arcY),
                    (int) Math.round(arcDiameter), (int) Math.round(arcDiameter), 0, 360);
            rotated.dispose();
        }

        graphics.dispose();
    }
}
