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
 * A Swing component that renders an animated steps spinner.
 *
 * <p>This is a migration of the {@code Steps} composable from the Aurora loading
 * module. It draws four vertical bars that fade in and out with a staggered
 * delay, creating a sequential stepping effect.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class StepsSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1600;
    private static final int SEGMENT_COUNT = 4;
    private static final int SLOTS = 8; // SEGMENTS.length * 2

    /** Per-segment alpha animation values. */
    private float[] alphas;

    /** Animation timelines for each segment. */
    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code StepsSpinner} with default color (black) and default
     * duration (1600 ms).
     */
    public StepsSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code StepsSpinner} with the specified color.
     *
     * @param color the color of the bars
     */
    public StepsSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code StepsSpinner} with the specified color and duration.
     *
     * @param color    the color of the bars
     * @param duration the animation cycle duration in milliseconds
     */
    public StepsSpinner(Color color, int duration) {
        super(color, duration);
        this.alphas = new float[SEGMENT_COUNT];
        java.util.Arrays.fill(this.alphas, 1f);
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[SEGMENT_COUNT];
        }

        for (int i = 0; i < SEGMENT_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / SLOTS;

            // Key times: 0%, 55%, 60%, 100%
            // 0%-55%: opacity 1, 60%-100%: opacity 0.15
            KeyTimes keyTimes = new KeyTimes(new float[]{0f, 0.55f, 0.6f, 1f});
            KeyValues<Float> keyValues = KeyValues.create(new Float[]{1f, 1f, 0.15f, 0.15f});
            KeyFrames<Float> keyFrames = new KeyFrames<>(keyValues, keyTimes, new Linear());

            SwingRepaintTimeline.Builder builder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("alpha" + index)
                                    .getWith((obj, fieldName) -> alphas[index])
                                    .setWith((obj, fieldName, value) -> alphas[index] = value)
                                    .goingThrough(keyFrames))
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay);

            this.timelines[index] = builder.build();
        }

        SwingUtilities.invokeLater(() -> {
            if (StepsSpinner.this.isDisplayable()) {
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
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {

                    float scale = (float) scaleFactor;

                    // SEGMENTS: [1, 7, 13, 19] — x positions
                    float[] segments = {1f, 7f, 13f, 19f};
                    float rectWidth = 4f * scale;
                    float rectHeight = 6f * scale;
                    float cornerRadius = 1.25f * scale;

                    for (int index = 0; index < SEGMENT_COUNT; index++) {
                        float alpha = Math.max(0f, Math.min(1f, alphas[index]));
                        int a = Math.round(alpha * 255);
                        graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(),
                                this.color.getBlue(), a));

                        float segX = segments[index] * scale;
                        float segY = 9f * scale;

                        int arc = Math.round(cornerRadius * 2);
                        if (arc <= 0) {
                            graphics1X.fillRect(Math.round(segX), Math.round(segY),
                                    Math.round(rectWidth), Math.round(rectHeight));
                        } else {
                            graphics1X.fillRoundRect(Math.round(segX), Math.round(segY),
                                    Math.round(rectWidth), Math.round(rectHeight),
                                    arc, arc);
                        }
                    }
                });

        graphics.dispose();
    }
}
