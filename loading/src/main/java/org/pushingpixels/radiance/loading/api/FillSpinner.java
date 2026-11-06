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
import org.pushingpixels.radiance.animation.api.ease.EasingFunctions;
import org.pushingpixels.radiance.animation.api.interpolator.KeyFrames;
import org.pushingpixels.radiance.animation.api.interpolator.KeyTimes;
import org.pushingpixels.radiance.animation.api.interpolator.KeyValues;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated fill spinner.
 *
 * <p>This is a migration of the {@code Fill} composable from the Aurora loading
 * module. It draws a faint background circle with an arc that first grows from
 * nothing to a full circle, then sweeps around and shrinks, creating a fill-and-drain
 * effect.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class FillSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1600;
    private static final float DEFAULT_STROKE_WIDTH = 2.5f;

    /** Animation progress value (0 → 1). */
    private float progress;

    /** Animation timeline. */
    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code FillSpinner} with default color (black) and default
     * duration (1600 ms).
     */
    public FillSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code FillSpinner} with the specified color.
     *
     * @param color the color of the spinner
     */
    public FillSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code FillSpinner} with the specified color and duration.
     *
     * @param color    the color of the spinner
     * @param duration the animation cycle duration in milliseconds
     */
    public FillSpinner(Color color, int duration) {
        super(color, duration);
        this.progress = 0f;
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

        int halfDuration = duration / 2;

        // Key times: 0%, 50%, 100%
        KeyTimes keyTimes = new KeyTimes(new float[]{0f, 0.5f, 1f});
        KeyValues<Float> keyValues = KeyValues.create(new Float[]{0f, 0.5f, 1f});
        KeyFrames<Float> keyFrames = new KeyFrames<>(keyValues, keyTimes, EasingFunctions.EASE_IN_OUT_CUBIC);

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("progress")
                                .getWith((obj, fieldName) -> progress)
                                .setWith((obj, fieldName, value) -> progress = value)
                                .goingThrough(keyFrames))
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (FillSpinner.this.isDisplayable()) {
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

                    int dim = Math.min(scaledWidth, scaledHeight);
                    int dx = (scaledWidth - dim) / 2;
                    int dy = (scaledHeight - dim) / 2;

                    graphics1X.translate(dx, dy);

                    float center = dim / 2f;
                    float outerRadius = 10.25f / 24f * dim;
                    float innerRadius = 7.0f / 24f * dim;
                    float outerStrokeWidth = (float) (DEFAULT_STROKE_WIDTH * scaleFactor);

                    // Background circle
                    int a20 = Math.round(0.2f * 255);
                    graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(),
                            this.color.getBlue(), a20));
                    graphics1X.setStroke(new BasicStroke(outerStrokeWidth));
                    graphics1X.drawOval(Math.round(center - outerRadius), Math.round(center - outerRadius),
                            Math.round(outerRadius * 2), Math.round(outerRadius * 2));

                    float startAngle, sweepAngle;
                    if (progress <= 0.5f) {
                        // Phase 1 — growing
                        startAngle = 0f;
                        sweepAngle = -360f * progress * 2.0f;
                    } else {
                        // Phase 2 — shrinking
                        startAngle = 360f - (progress - 0.5f) * 360f * 2.0f;
                        sweepAngle = -startAngle;
                    }

                    Graphics2D rotated = (Graphics2D) graphics1X.create();
                    // Fill arc — rotate -90° so fill starts from top
                    rotated.rotate(Math.toRadians(-90), center, center);
                    rotated.setColor(color);
                    rotated.fillArc(Math.round(center - innerRadius), Math.round(center - innerRadius),
                            Math.round(innerRadius * 2), Math.round(innerRadius * 2),
                            Math.round(startAngle), Math.round(sweepAngle));
                    rotated.dispose();
                });

        graphics.dispose();
    }
}
