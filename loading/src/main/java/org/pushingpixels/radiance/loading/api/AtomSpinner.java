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
import org.pushingpixels.radiance.animation.api.interpolator.KeyFrames;
import org.pushingpixels.radiance.animation.api.interpolator.KeyTimes;
import org.pushingpixels.radiance.animation.api.interpolator.KeyValues;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated atom spinner.
 *
 * <p>This is a migration of the {@code Atom} composable from the Aurora loading
 * module. It draws a central circle with three inner elliptical orbits rotated
 * at 120° intervals. Each orbit animates between a collapsed and expanded state
 * in a staggered fashion, creating a pulsating atom-like effect.</p>
 *
 * <p>The animation uses the Radiance animation framework ({@link Timeline} with
 * {@link SwingRepaintTimeline} and {@link KeyFrames}) for smooth, infinite
 * looping animation of each orbit.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class AtomSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1000;
    private static final float OUTER_STROKE_WIDTH = 1.5f;
    private static final float INNER_STROKE_WIDTH = 0.8f;

    /*
     * Each orbit's animated value: 0.0 = fully expanded, 1.0 = fully collapsed.
     * Three orbits at 120° intervals, staggered in time.
     */
    private float[] orbitValues;

    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code AtomSpinner} with the default color (black) and
     * default animation duration (1000 ms).
     */
    public AtomSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code AtomSpinner} with the specified color and default
     * animation duration (1000 ms).
     *
     * @param color the color of the spinner
     */
    public AtomSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code AtomSpinner} with the specified color and animation
     * duration.
     *
     * @param color    the color of the spinner
     * @param duration the total duration of one full animation cycle in milliseconds
     */
    public AtomSpinner(Color color, int duration) {
        super(color, duration);
        this.orbitValues = new float[]{1f, 1f, 1f};
    }

    /**
     * Returns the current animation value for the specified orbit (0-2).
     * Value ranges from 0.0 (fully expanded) to 1.0 (fully collapsed).
     *
     * @param index the orbit index (0, 1, or 2)
     * @return the current orbit value
     */
    public float getOrbitValue(int index) {
        if (index < 0 || index > 2) {
            throw new IllegalArgumentException("Orbit index must be 0, 1, or 2");
        }
        return orbitValues[index];
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[3];
        }

        int animationDuration = this.duration * 2 / 3;
        int halfAnimation = animationDuration / 2;

        // Keyframes: 0.0 at 0ms, 1.0 at halfAnimation, 0.0 at animationDuration, 0.0 at duration
        // Normalized key times (0.0 - 1.0 range over the total duration)
        float keyTime0 = 0f;
        float keyTime1 = (float) halfAnimation / this.duration;
        float keyTime2 = (float) animationDuration / this.duration;
        float keyTime3 = 1.0f;

        KeyTimes keyTimes = new KeyTimes(new float[]{keyTime0, keyTime1, keyTime2, keyTime3});
        KeyValues<Float> keyValues = KeyValues.create(
                new Float[]{0.0f, 1.0f, 0.0f, 0.0f});
        KeyFrames<Float> keyFrames = new KeyFrames<>(keyValues, keyTimes, new Linear());

        for (int i = 0; i < 3; i++) {
            final int index = i;
            long initialDelay = (long) (i * (double) animationDuration / 2.0);

            SwingRepaintTimeline.Builder builder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("orbit" + index)
                                    .getWith((obj, fieldName) -> orbitValues[index])
                                    .setWith((obj, fieldName, value) -> orbitValues[index] = value)
                                    .goingThrough(keyFrames))
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay);

            this.timelines[index] = builder.build();
        }

        SwingUtilities.invokeLater(() -> {
            if (AtomSpinner.this.isDisplayable()) {
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
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {

                    float outerStroke = (float) (OUTER_STROKE_WIDTH * scaleFactor);
                    int diameter = Math.min(scaledWidth, scaledHeight) - (int) outerStroke - 1;
                    int dx = (scaledWidth - diameter) / 2 + (int) outerStroke / 2;
                    int dy = (scaledHeight - diameter) / 2 + (int) outerStroke / 2;

                    float radius = diameter / 2f;
                    float centerX = dx + radius;
                    float centerY = dy + radius;

                    graphics1X.setColor(color);

                    // Draw the outer circle
                    graphics1X.setStroke(new BasicStroke(outerStroke));
                    graphics1X.drawOval(dx, dy, diameter, diameter);

                    // Draw the three inner orbits
                    for (int i = 0; i < 3; i++) {
                        float orbitValue = orbitValues[i];

                        // Skip drawing when fully collapsed (orbitValue == 1.0 means stroke width is 0)
                        if (orbitValue >= 1.0f) {
                            continue;
                        }

                        // Rotate by index * 120 degrees
                        graphics1X.rotate(Math.toRadians(i * 120.0), centerX, centerY);

                        // Calculate ellipse bounds based on orbitValue
                        // When orbitValue=0: topLeft=(centerX, dy), size=(diameter, diameter) — full ellipse
                        // When orbitValue=1: topLeft=(centerX+radius, dy), size=(0, diameter) — collapsed
                        float topLeftX = dx + radius * orbitValue;
                        float ellipseWidth = diameter * (1.0f - orbitValue);

                        // Stroke width decreases as orbit collapses
                        float strokeWidth = (float) (INNER_STROKE_WIDTH * scaleFactor * (1.0f - orbitValue * orbitValue));
                        graphics1X.setStroke(new BasicStroke(strokeWidth));

                        graphics1X.drawOval(
                                (int) Math.round(topLeftX),
                                dy,
                                (int) Math.round(ellipseWidth),
                                diameter
                        );

                        // Undo the rotation for the next orbit
                        graphics1X.rotate(Math.toRadians(-i * 120.0), centerX, centerY);
                    }
                });

        graphics.dispose();
    }
}
