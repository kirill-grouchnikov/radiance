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
 * A Swing component that renders an animated slide spinner.
 *
 * <p>This is a migration of the {@code Slide} composable from the Aurora loading
 * module. It draws three dots that slide in both X and Y directions with
 * keyframe-based animations using LinearEasing, staggered by duration/3
 * (FastForward) for each dot.</p>
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

    /** Per-dot X positions, indexed [dotIndex] */
    private float[] slideX;
    /** Per-dot Y positions, indexed [dotIndex] */
    private float[] slideY;

    private SwingRepaintTimeline[] slideXTimelines;
    private SwingRepaintTimeline[] slideYTimelines;

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
        if (this.slideXTimelines == null) {
            this.slideXTimelines = new SwingRepaintTimeline[DOT_COUNT];
        }
        if (this.slideYTimelines == null) {
            this.slideYTimelines = new SwingRepaintTimeline[DOT_COUNT];
        }

        // X-axis keyframes: 1.0 at 0%, 1.0 at 25%, 0.0 at 33%, 0.0 at 75%, 1.0 at 83%, 1.0 at 100%
        // All intervals use LinearEasing (matching original)
        KeyTimes slideXKeyTimes = new KeyTimes(
                0f, 0.25f, 1f / 3f, 0.75f, 5f / 6f, 1f
        );
        KeyValues<Float> slideXKeyValues = KeyValues.create(1f, 1f, 0f, 0f, 1f, 1f);
        KeyFrames<Float> slideXKeyFrames = new KeyFrames<>(slideXKeyValues, slideXKeyTimes);

        // Y-axis keyframes: 0.0 at 0%, 1.0 at 8.33%, 1.0 at 50%, 0.0 at 58.33%, 0.0 at 100%
        KeyTimes slideYKeyTimes = new KeyTimes(
                0f, 1f / 12f, 0.5f, 7f / 12f, 1f
        );
        KeyValues<Float> slideYKeyValues = KeyValues.create(0f, 1f, 1f, 0f, 0f);
        KeyFrames<Float> slideYKeyFrames = new KeyFrames<>(slideYKeyValues, slideYKeyTimes);

        for (int i = 0; i < DOT_COUNT; i++) {
            final int index = i;
            // FastForward stagger: each dot starts index * duration / 3 earlier
            long initialDelay = index * (long) duration / DOT_COUNT;

            // X-axis timeline
            this.slideXTimelines[index] = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("slideX" + index)
                                    .getWith((obj, fieldName) -> slideX[index])
                                    .setWith((obj, fieldName, value) -> slideX[index] = value)
                                    .goingThrough(slideXKeyFrames))
                    .setDuration(this.duration)
                    .build();

            // Y-axis timeline
            this.slideYTimelines[index] = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("slideY" + index)
                                    .getWith((obj, fieldName) -> slideY[index])
                                    .setWith((obj, fieldName, value) -> slideY[index] = value)
                                    .goingThrough(slideYKeyFrames))
                    .setDuration(this.duration)
                    .build();
        }

        SwingUtilities.invokeLater(() -> {
            if (SlideSpinner.this.isDisplayable()) {
                for (int i = 0; i < slideXTimelines.length; i++) {
                    SwingRepaintTimeline tl = slideXTimelines[i];
                    if (tl != null) {
                        tl.playLoopSkipping(RepeatBehavior.LOOP, i * duration / 3);
                    }
                }
            }
        });
        SwingUtilities.invokeLater(() -> {
            if (SlideSpinner.this.isDisplayable()) {
                for (int i = 0; i < slideYTimelines.length; i++) {
                    SwingRepaintTimeline tl = slideYTimelines[i];
                    if (tl != null) {
                        tl.playLoopSkipping(RepeatBehavior.LOOP, i * duration / 3);
                    }
                }
            }
        });
    }

    @Override
    protected void stopAnimations() {
        if (this.slideXTimelines != null) {
            for (SwingRepaintTimeline tl : this.slideXTimelines) {
                if (tl != null) tl.abort();
            }
        }
        if (this.slideYTimelines != null) {
            for (SwingRepaintTimeline tl : this.slideYTimelines) {
                if (tl != null) tl.abort();
            }
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

                    graphics1X.setColor(color);

                    for (int index = 0; index < DOT_COUNT; index++) {
                        float offsetX = slideX[index];
                        float offsetY = slideY[index];

                        float cx = padding + offsetX * (dotSize + gap) + dotSize / 2.0f;
                        float cy = padding + offsetY * (dotSize + gap) + dotSize / 2.0f;

                        graphics1X.fillOval(
                                Math.round(cx - dotSize / 2f),
                                Math.round(cy - dotSize / 2f),
                                Math.round(dotSize),
                                Math.round(dotSize)
                        );
                    }
                });

        graphics.dispose();
    }
}
