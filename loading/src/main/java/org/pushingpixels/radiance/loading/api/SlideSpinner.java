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
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated slide spinner.
 *
 * <p>This is a migration of the {@code Slide} composable from the Aurora loading
 * module. It draws three dots that slide in both X and Y directions with
 * keyframe-based animations, staggered by duration/3 for each dot.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class SlideSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 2400;

    /** Number of animated dots */
    private static final int DOT_COUNT = 3;

    /**
     * X-axis keyframe positions for one cycle (value 0→1 maps to animation progress).
     * Keyframes: 1.0 at 0%, 1.0 at 25%, 0.0 at 33%, 0.0 at 75%, 1.0 at 83%, 1.0 at 100%
     */
    private static final float[] SLIDE_X_KEY_TIMES = {
            0f, 0.25f, 1f / 3f, 0.75f, 5f / 6f, 1f
    };
    private static final float[] SLIDE_X_KEY_VALUES = {
            1f, 1f, 0f, 0f, 1f, 1f
    };

    /**
     * Y-axis keyframe positions for one cycle.
     * Keyframes: 0.0 at 0%, 1.0 at 8.33%, 1.0 at 50%, 0.0 at 58.33%, 0.0 at 100%
     */
    private static final float[] SLIDE_Y_KEY_TIMES = {
            0f, 1f / 12f, 0.5f, 7f / 12f, 1f
    };
    private static final float[] SLIDE_Y_KEY_VALUES = {
            0f, 1f, 1f, 0f, 0f
    };

    /** Per-dot X positions, indexed [dotIndex] */
    private float[] slideX;
    /** Per-dot Y positions, indexed [dotIndex] */
    private float[] slideY;

    private long startTime;

    private SwingRepaintTimeline timeline;

    public SlideSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public SlideSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public SlideSpinner(Color color, int duration) {
        super(color, duration);
        this.slideX = new float[DOT_COUNT];
        this.slideY = new float[DOT_COUNT];
    }

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

        // We use a single timeline that drives elapsed time; the keyframe evaluation
        // is done manually in paintComponent to support staggered start offsets.
        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("elapsed")
                                .getWith((obj, fieldName) -> 0f)
                                .setWith((obj, fieldName, value) -> {
                                    // no-op; we track time manually
                                })
                                .from(0f).to(1f))
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (SlideSpinner.this.isDisplayable()) {
                this.startTime = System.currentTimeMillis();
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

        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) return;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);

        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {

                    float dim = Math.min(scaledWidth, scaledHeight);
                    float dotSize = dim * 0.34f;
                    float gap = dim * 0.2f;
                    float padding = (dim - 2.0f * dotSize - gap) / 2.0f;

                    // Calculate elapsed progress for this cycle
                    long elapsed;
                    if (this.startTime > 0) {
                        elapsed = System.currentTimeMillis() - this.startTime;
                    } else {
                        elapsed = 0;
                    }
                    float cycleProgress = (elapsed % this.duration) / (float) this.duration;

                    graphics1X.setColor(color);

                    for (int index = 0; index < DOT_COUNT; index++) {
                        // Staggered start offset: each dot starts index * duration / 3 later
                        float offset = index * (1f / 3f);
                        float adjustedProgress = (cycleProgress + offset) % 1f;

                        float offsetX = evaluateKeyframes(SLIDE_X_KEY_TIMES, SLIDE_X_KEY_VALUES, adjustedProgress);
                        float offsetY = evaluateKeyframes(SLIDE_Y_KEY_TIMES, SLIDE_Y_KEY_VALUES, adjustedProgress);

                        float cx = padding + offsetX * (dotSize + gap) + dotSize / 2.0f;
                        float cy = padding + offsetY * (dotSize + gap) + dotSize / 2.0f;

                        graphics1X.fillOval(
                                (int) Math.round(cx - dotSize / 2f),
                                (int) Math.round(cy - dotSize / 2f),
                                (int) Math.round(dotSize),
                                (int) Math.round(dotSize)
                        );
                    }
                });

        graphics.dispose();
    }

    /**
     * Evaluates a value at {@code t} given parallel arrays of keyframe times and values.
     * Times are normalized to [0, 1]. Linear interpolation is used between keyframes.
     */
    private float evaluateKeyframes(float[] times, float[] values, float t) {
        // Clamp t to [0, 1]
        if (t <= 0f) return values[0];
        if (t >= 1f) return values[values.length - 1];

        // Find the surrounding keyframes
        for (int i = 0; i < times.length - 1; i++) {
            if (t >= times[i] && t <= times[i + 1]) {
                if (times[i + 1] == times[i]) {
                    return values[i];
                }
                float localT = (t - times[i]) / (times[i + 1] - times[i]);
                return values[i] + localT * (values[i + 1] - values[i]);
            }
        }
        return values[values.length - 1];
    }
}
