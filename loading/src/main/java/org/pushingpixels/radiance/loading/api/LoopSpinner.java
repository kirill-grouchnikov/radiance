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
 * A Swing component that renders an animated loop (infinity) spinner.
 *
 * <p>This is a migration of the {@code Loop} composable from the Aurora loading
 * module. It draws a figure-8 (infinity) path with a faint background and an
 * animated dashed segment that travels along the path.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class LoopSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1600;
    private static final float DEFAULT_STROKE_WIDTH = 2.5f;

    /** Stroke cap style. */
    private int cap;

    /** Animation offset value (0 → 1). */
    private float offset;

    /** Animation timeline. */
    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code LoopSpinner} with default color (black), default
     * duration (1600 ms) and round cap.
     */
    public LoopSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code LoopSpinner} with the specified color.
     *
     * @param color the color of the spinner
     */
    public LoopSpinner(Color color) {
        this(color, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code LoopSpinner} with the specified color, duration
     * and stroke cap.
     *
     * @param color    the color of the spinner
     * @param duration the animation cycle duration in milliseconds
     * @param cap      the stroke cap style
     */
    public LoopSpinner(Color color, int duration, int cap) {
        super(color, duration);
        this.cap = cap;
        this.offset = 0f;
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
        if (this.timeline != null && !this.timeline.isDone()) return;

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("offset")
                                .getWith((obj, fieldName) -> offset)
                                .setWith((obj, fieldName, value) -> offset = value)
                                .from(0f).to(1f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (LoopSpinner.this.isDisplayable()) {
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
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {

                    float strokeWidth = (float) (DEFAULT_STROKE_WIDTH * scaleFactor);
                    int dim = Math.min(scaledWidth, scaledHeight) - (int) strokeWidth - 1;
                    int dx = (scaledWidth - dim) / 2 + (int) strokeWidth / 2;
                    int dy = (scaledHeight - dim) / 2 + (int) strokeWidth / 2;

                    graphics1X.translate(dx, dy);

                    float scale = dim / 24f;

                    // Build the figure-8 path
                    GeneralPath path = buildFigureEightPath(scale);

                    // Path length approximation: 2 arcs of 180° (r=4) + 4 cubic beziers ≈ 53.364
                    float pathMeasure = 53.364f * scale;
                    float dash = 0.3f * pathMeasure;
                    float dashGap = 0.7f * pathMeasure;

                    // Background path
                    int a20 = Math.round(0.2f * 255);
                    graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(),
                            this.color.getBlue(), a20));
                    graphics1X.setStroke(new BasicStroke(strokeWidth, this.cap,
                            BasicStroke.JOIN_ROUND, 0, null, 0));
                    graphics1X.draw(path);

                    // Animated dashed path
                    graphics1X.setColor(color);
                    graphics1X.setStroke(new BasicStroke(strokeWidth, this.cap,
                            BasicStroke.JOIN_ROUND, 0,
                            new float[]{dash, dashGap},
                            offset * pathMeasure));
                    graphics1X.draw(path);
                });

        graphics.dispose();
    }

    /**
     * Builds the figure-8 (infinity) path matching the original SVG.
     * SVG: M12 12c-2-2.7-3.6-4-5.5-4a4 4 0 0 0 0 8c1.9 0 3.5-1.3 5.5-4
     *      s3.6-4 5.5-4a4 4 0 0 1 0 8c-1.9 0-3.5-1.3-5.5-4z
     * <p>The arcs are approximated with cubic beziers using the standard factor
     * k = r × 4/3 × tan(π/8) ≈ r × 0.5522847498 so the entire figure-8 is a
     * single continuous path without any SEG_MOVETO breaks — this is essential
     * for the dash-offset animation to travel smoothly along the full path.</p>
     */
    private static GeneralPath buildFigureEightPath(float scale) {
        // Cubic-bezier approximation factor for a quarter-circle of radius 4
        // k = r * 4/3 * tan(π/8) = 4 * 0.5522847498 = 2.2091389992
        float k = 2.2091389992f * scale;

        GeneralPath path = new GeneralPath();
        path.moveTo(12f * scale, 12f * scale);

        // Left lobe approach: cubic bezier from center to top of left circle
        path.curveTo(
            10f * scale, 9.3f * scale,
            8.4f * scale, 8f * scale,
            6.5f * scale, 8f * scale
        );

        // Left arc: 180° counter-clockwise from top (6.5, 8) to bottom (6.5, 16) via left side
        // Approximated with two cubic beziers (quarter-circle each)
        // First half: top → leftmost (2.5, 12)
        path.curveTo(
            (6.5f * scale - k), 8f * scale,
            2.5f * scale, (12f * scale - k),
            2.5f * scale, 12f * scale
        );
        // Second half: leftmost → bottom (6.5, 16)
        path.curveTo(
            2.5f * scale, (12f * scale + k),
            (6.5f * scale - k), 16f * scale,
            6.5f * scale, 16f * scale
        );

        // Return to center from left
        path.curveTo(
            8.4f * scale, 16f * scale,
            10f * scale, 14.7f * scale,
            12f * scale, 12f * scale
        );

        // Right lobe approach: cubic bezier from center to top of right circle
        path.curveTo(
            14f * scale, 9.3f * scale,
            15.6f * scale, 8f * scale,
            17.5f * scale, 8f * scale
        );

        // Right arc: 180° clockwise from top (17.5, 8) to bottom (17.5, 16) via right side
        // Approximated with two cubic beziers (quarter-circle each)
        // First half: top → rightmost (21.5, 12)
        path.curveTo(
            (17.5f * scale + k), 8f * scale,
            21.5f * scale, (12f * scale - k),
            21.5f * scale, 12f * scale
        );
        // Second half: rightmost → bottom (17.5, 16)
        path.curveTo(
            21.5f * scale, (12f * scale + k),
            (17.5f * scale + k), 16f * scale,
            17.5f * scale, 16f * scale
        );

        // Return to center from right
        path.curveTo(
            15.6f * scale, 16f * scale,
            14f * scale, 14.7f * scale,
            12f * scale, 12f * scale
        );

        return path;
    }
}
