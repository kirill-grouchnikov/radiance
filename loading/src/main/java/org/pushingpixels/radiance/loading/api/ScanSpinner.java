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
import org.pushingpixels.radiance.animation.api.interpolator.KeyFrames;
import org.pushingpixels.radiance.animation.api.interpolator.KeyTimes;
import org.pushingpixels.radiance.animation.api.interpolator.KeyValues;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated scan spinner.
 *
 * <p>This is a migration of the {@code Scan} composable from the Aurora loading
 * module. It draws a faint rounded rectangle border with a horizontal scan line
 * that moves up and down inside it.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class ScanSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1800;
    private static final float DEFAULT_RECT_STROKE_WIDTH = 2f;
    private static final float DEFAULT_LINE_STROKE_WIDTH = 2.5f;

    /** Stroke cap style for the scan line. */
    private int cap;

    /** Scan line Y position animation value (0 → 1). */
    private float scanY;

    /** Animation timeline. */
    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code ScanSpinner} with default color (black), default
     * duration (1800 ms) and round cap.
     */
    public ScanSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code ScanSpinner} with the specified color.
     *
     * @param color the color of the spinner
     */
    public ScanSpinner(Color color) {
        this(color, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code ScanSpinner} with the specified color, duration
     * and stroke cap.
     *
     * @param color    the color of the spinner
     * @param duration the animation cycle duration in milliseconds
     * @param cap      the stroke cap style for the scan line
     */
    public ScanSpinner(Color color, int duration, int cap) {
        super(color, duration);
        this.cap = cap;
        this.scanY = 0f;
    }

    /**
     * Returns the stroke cap style for the scan line.
     *
     * @return the cap style
     */
    public int getCap() {
        return cap;
    }

    /**
     * Sets the stroke cap style for the scan line.
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

        int halfDuration = duration / 2;

        // Custom easing: 0.45, 0, 0.55, 1 (similar to standard ease-in-out)
        Spline spline = new Spline(0.45f, 0f, 0.55f, 1f);

        // Key times: 0%, 50%, 100% — scan goes down then back up
        KeyTimes keyTimes = new KeyTimes(new float[]{0f, 0.5f, 1f});
        KeyValues<Float> keyValues = KeyValues.create(new Float[]{0f, 1f, 0f});
        KeyFrames<Float> keyFrames = new KeyFrames<>(keyValues, keyTimes, spline);

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("scanY")
                                .getWith((obj, fieldName) -> scanY)
                                .setWith((obj, fieldName, value) -> scanY = value)
                                .goingThrough(keyFrames))
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (ScanSpinner.this.isDisplayable()) {
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
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {

                    float scale = (float) scaleFactor;

                    // Rounded rectangle: x=3, y=3, width=18, height=18, rx=4
                    float rectX = 3f * scale;
                    float rectY = 3f * scale;
                    float rectSize = 18f * scale;
                    float cornerRadius = 4f * scale;
                    float rectStrokeWidth = (float) (DEFAULT_RECT_STROKE_WIDTH * scale);

                    // Background rounded rect
                    int a20 = Math.round(0.2f * 255);
                    graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(),
                            this.color.getBlue(), a20));
                    graphics1X.setStroke(new BasicStroke(rectStrokeWidth));
                    graphics1X.drawRoundRect(Math.round(rectX), Math.round(rectY),
                            Math.round(rectSize), Math.round(rectSize),
                            Math.round(cornerRadius * 2), Math.round(cornerRadius * 2));

                    // Scan line: x1=7.5, x2=16.5, y moves from 6.5 to 6.5+11
                    float travel = 11f * scale;
                    float lineY = (6.5f * scale) + scanY * travel;
                    float lineStrokeWidth = (float) (DEFAULT_LINE_STROKE_WIDTH * scale);

                    graphics1X.setColor(color);
                    graphics1X.setStroke(new BasicStroke(lineStrokeWidth, this.cap,
                            BasicStroke.JOIN_ROUND, 0, null, 0));
                    graphics1X.drawLine(Math.round(7.5f * scale), Math.round(lineY),
                            Math.round(16.5f * scale), Math.round(lineY));
                });

        graphics.dispose();
    }
}
