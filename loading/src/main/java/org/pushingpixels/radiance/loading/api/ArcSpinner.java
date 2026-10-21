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

/**
 * A Swing component that renders an animated arc spinner.
 *
 * <p>This is a migration of the {@code Arc} composable from the Aurora loading
 * module. It draws a circular arc with a dash pattern that creates a single
 * visible segment, then continuously rotates it 360° to produce a spinning
 * loading indicator.</p>
 *
 * <p>The animation uses the Radiance animation framework ({@link Timeline} with
 * {@link SwingRepaintTimeline}) for smooth, infinite looping rotation.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class ArcSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 800;
    private static final float DEFAULT_STROKE_WIDTH = 2.5f;
    private static final float DASH_RATIO_NUMERATOR = 18.0f;
    private static final float DASH_RATIO_DENOMINATOR = 18.0f + 44.8f;

    /** Stroke cap style. */
    private int cap;

    /** Current rotation angle in degrees. */
    private float angle;

    /** Animation timeline. */
    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code ArcSpinner} with the default color (black) and
     * default animation duration (800 ms).
     */
    public ArcSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code ArcSpinner} with the specified color and default
     * animation duration (800 ms).
     *
     * @param arcColor the color of the arc
     */
    public ArcSpinner(Color arcColor) {
        this(arcColor, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code ArcSpinner} with the specified color, animation
     * duration, and stroke cap style.
     *
     * @param arcColor the color of the arc
     * @param duration the duration of one full rotation in milliseconds
     * @param cap      the stroke cap style (e.g. {@code BasicStroke.CAP_ROUND})
     */
    public ArcSpinner(Color arcColor, int duration, int cap) {
        super(arcColor, duration);
        this.cap = cap;
        this.angle = 0f;
    }

    /**
     * Returns the stroke cap style.
     *
     * @return the stroke cap (e.g. {@code BasicStroke.CAP_ROUND})
     */
    public int getCap() {
        return cap;
    }

    /**
     * Sets the stroke cap style.
     *
     * @param cap the new stroke cap (e.g. {@code BasicStroke.CAP_ROUND},
     *            {@code BasicStroke.CAP_BUTT}, {@code BasicStroke.CAP_SQUARE})
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

    /**
     * Returns the current rotation angle in degrees (0-360).
     *
     * @return the current angle
     */
    public float getAngle() {
        return angle;
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) {
            return; // already running
        }

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("angle")
                                .getWith((obj, fieldName) -> angle)
                                .setWith((obj, fieldName, value) -> angle = value)
                                .from(0f).to(360f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (ArcSpinner.this.isDisplayable()) {
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
                    int diameter = Math.min(scaledWidth, scaledHeight) -
                        (int) strokeWidth - 2;
                    int dx = (scaledWidth - diameter) / 2 + (int) strokeWidth / 2;
                    int dy = (scaledHeight - diameter) / 2 + (int) strokeWidth / 2;

                    float radius = diameter / 2f;
                    float circumference = 2f * (float) Math.PI * radius;
                    float dash = DASH_RATIO_NUMERATOR * circumference / DASH_RATIO_DENOMINATOR;

                    // Apply rotation transform
                    float centerX = dx + radius;
                    float centerY = dy + radius;
                    graphics1X.rotate(Math.toRadians(this.angle), centerX, centerY);

                    // Draw the dashed arc
                    graphics1X.setColor(this.color);
                    graphics1X.setStroke(new BasicStroke(strokeWidth, this.cap,
                        BasicStroke.JOIN_ROUND, 0, new float[]{dash, circumference - dash}, 0));

                    // Draw a full 360° arc (circle) — the dash pattern creates the visible segment
                    graphics1X.drawArc(dx, dy, diameter, diameter, 0, 360);
                });

        graphics.dispose();
    }
}
