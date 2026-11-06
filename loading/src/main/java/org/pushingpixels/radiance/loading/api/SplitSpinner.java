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
 * A Swing component that renders an animated split spinner.
 *
 * <p>This is a migration of the {@code Split} composable from the Aurora loading
 * module. It draws two circles that start together, then split apart while
 * shrinking, before snapping back together.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class SplitSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1400;

    /** Split animation value (0 → 1). */
    private float split;

    /** Animation timeline. */
    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code SplitSpinner} with default color (black) and default
     * duration (1400 ms).
     */
    public SplitSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code SplitSpinner} with the specified color.
     *
     * @param color the color of the spinner
     */
    public SplitSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code SplitSpinner} with the specified color and duration.
     *
     * @param color    the color of the spinner
     * @param duration the animation cycle duration in milliseconds
     */
    public SplitSpinner(Color color, int duration) {
        super(color, duration);
        this.split = 0f;
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

        // Custom easing: 0.65, 0, 0.35, 1
        Spline spline = new Spline(0.65f, 0f, 0.35f, 1f);

        // Key times: 0%, 40%, 60%, 100%
        float kt0 = 0f;
        float kt1 = 0.4f;
        float kt2 = 0.6f;
        float kt3 = 1f;

        KeyTimes keyTimes = new KeyTimes(new float[]{kt0, kt1, kt2, kt3});
        KeyValues<Float> keyValues = KeyValues.create(new Float[]{0f, 1f, 1f, 0f});
        KeyFrames<Float> keyFrames = new KeyFrames<>(keyValues, keyTimes, spline);

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("split")
                                .getWith((obj, fieldName) -> split)
                                .setWith((obj, fieldName, value) -> split = value)
                                .goingThrough(keyFrames))
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (SplitSpinner.this.isDisplayable()) {
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
                    float dotRadius = 4f / 24f * dim;
                    float apart = 5f / 24f * dim;

                    // Compute translate and scale from split value
                    float translateX = split > 0.5f ? apart * split : 0f;
                    float scale = split > 0.5f ? 1.0f - 0.35f * (split - 0.5f) / 0.5f : 1.0f;

                    float r = dotRadius * scale;

                    graphics1X.setColor(color);

                    // Dot 0: moves left when split
                    graphics1X.fillOval(Math.round(center - translateX - r),
                            Math.round(center - r),
                            Math.round(r * 2), Math.round(r * 2));

                    // Dot 1: moves right when split
                    graphics1X.fillOval(Math.round(center + translateX - r),
                            Math.round(center - r),
                            Math.round(r * 2), Math.round(r * 2));
                });

        graphics.dispose();
    }
}
