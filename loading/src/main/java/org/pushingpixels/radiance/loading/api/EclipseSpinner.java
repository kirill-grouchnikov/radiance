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
 * A Swing component that renders an animated eclipse spinner.
 *
 * <p>This is a migration of the {@code Eclipse} composable from the Aurora loading
 * module. It draws two circles that slide past each other while changing size
 * and opacity, simulating an eclipse effect.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class EclipseSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;
    private static final int DOT_COUNT = 2;

    private float[] slideValues;
    private float[] alphaValues;
    private float[] scaleValues;

    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code EclipseSpinner} with default color (black) and
     * default duration (1200 ms).
     */
    public EclipseSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code EclipseSpinner} with the specified color.
     *
     * @param color the color of the circles
     */
    public EclipseSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code EclipseSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the circles
     * @param duration the animation cycle duration in milliseconds
     */
    public EclipseSpinner(Color color, int duration) {
        super(color, duration);
        this.slideValues = new float[]{0.5f, 0.5f};
        this.alphaValues = new float[]{0.75f, 0.75f};
        this.scaleValues = new float[]{1f, 1f};
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[DOT_COUNT * 3];
        }

        int halfDuration = duration / 2;
        int quarterDuration = duration / 4;
        int threeQuarterDuration = duration * 3 / 4;

        // Key times normalized to [0, 1]
        float kt0 = 0f;
        float kt1 = (float) quarterDuration / duration;
        float kt2 = (float) halfDuration / duration;
        float kt3 = (float) threeQuarterDuration / duration;
        float kt4 = 1f;

        KeyTimes keyTimes = new KeyTimes(new float[]{kt0, kt1, kt2, kt3, kt4});

        for (int i = 0; i < DOT_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / 2;

            // Slide: 0.5 → -0.5 → 0.5
            KeyValues<Float> slideKV = KeyValues.create(new Float[]{0.5f, -0.5f, 0.5f});
            KeyTimes slideKT = new KeyTimes(new float[]{kt0, kt2, kt4});
            KeyFrames<Float> slideKF = new KeyFrames<>(slideKV, slideKT, new Linear());

            SwingRepaintTimeline.Builder slideBuilder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("slide" + index)
                                    .getWith((obj, fieldName) -> slideValues[index])
                                    .setWith((obj, fieldName, value) -> slideValues[index] = value)
                                    .goingThrough(slideKF))
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay);
            this.timelines[index * 3] = slideBuilder.build();

            // Alpha: 0.75 → 1.0 → 0.75 → 0.5 → 0.75
            KeyValues<Float> alphaKV = KeyValues.create(new Float[]{0.75f, 1.0f, 0.75f, 0.5f, 0.75f});
            KeyFrames<Float> alphaKF = new KeyFrames<>(alphaKV, keyTimes, new Linear());

            SwingRepaintTimeline.Builder alphaBuilder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("alpha" + index)
                                    .getWith((obj, fieldName) -> alphaValues[index])
                                    .setWith((obj, fieldName, value) -> alphaValues[index] = value)
                                    .goingThrough(alphaKF))
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay);
            this.timelines[index * 3 + 1] = alphaBuilder.build();

            // Scale: 1.0 → 1.3 → 1.0 → 0.7 → 1.0
            KeyValues<Float> scaleKV = KeyValues.create(new Float[]{1.0f, 1.3f, 1.0f, 0.7f, 1.0f});
            KeyFrames<Float> scaleKF = new KeyFrames<>(scaleKV, keyTimes, new Linear());

            SwingRepaintTimeline.Builder scaleBuilder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("scale" + index)
                                    .getWith((obj, fieldName) -> scaleValues[index])
                                    .setWith((obj, fieldName, value) -> scaleValues[index] = value)
                                    .goingThrough(scaleKF))
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay);
            this.timelines[index * 3 + 2] = scaleBuilder.build();
        }

        SwingUtilities.invokeLater(() -> {
            if (EclipseSpinner.this.isDisplayable()) {
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

                    int dim = Math.min(scaledWidth, scaledHeight);
                    int dx = (scaledWidth - dim) / 2;
                    int dy = (scaledHeight - dim) / 2;

                    graphics1X.translate(dx, dy);

                    float dotSize = dim * 0.4f;
                    float centerY = dim / 2f;

                    for (int index = 0; index < DOT_COUNT; index++) {
                        float offset = slideValues[index];
                        float alpha = Math.max(0f, Math.min(1f, alphaValues[index]));
                        float scale = scaleValues[index];

                        int a = (int) Math.round(alpha * 255);
                        graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));

                        float r = dotSize * scale / 2f;
                        float cx = dim / 2f + offset * dim * 0.6f;

                        graphics1X.fillOval((int) Math.round(cx - r), (int) Math.round(centerY - r),
                                (int) Math.round(r * 2), (int) Math.round(r * 2));
                    }
                });

        graphics.dispose();
    }
}
