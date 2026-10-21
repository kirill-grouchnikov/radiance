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
 * A Swing component that renders an animated leap spinner.
 *
 * <p>This is a migration of the {@code Leap} composable from the Aurora loading
 * module. It draws three dots that translate horizontally and rotate, with
 * keyframe-based animations staggered by duration/3 for each dot.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class LeapSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1800;

    /** Number of animated dots */
    private static final int DOT_COUNT = 3;

    /**
     * Translate-axis keyframe positions for one cycle (value 0→-2 maps to horizontal offset).
     * The original animates from 0.0f to -2.0f, so keyframe values 0→0→1→2 map to 0→0→-1→-2,
     * moving dots from right to left.
     * Keyframes: 0.0 at 0%, 0.0 at 33%, -1.0 at 66%, -2.0 at 100%
     */
    private static final float[] TRANSLATE_KEY_TIMES = {
            0f, 1f / 3f, 2f / 3f, 1f
    };
    private static final float[] TRANSLATE_KEY_VALUES = {
            0f, 0f, -1f, -2f
    };

    /**
     * Rotate-axis keyframe positions for one cycle (value 0→180 degrees).
     * Keyframes: 0.0 at 0%, 180.0 at 33%, 180.0 at 100%
     */
    private static final float[] ROTATE_KEY_TIMES = {
            0f, 1f / 3f, 1f
    };
    private static final float[] ROTATE_KEY_VALUES = {
            0f, 180f, 180f
    };

    /** Per-dot translate animation values. */
    private float[] translateValues;

    /** Animation timelines for translate axis. */
    private SwingRepaintTimeline[] translateTimelines;

    /** Per-dot rotate animation values. */
    private float[] rotateValues;

    /** Animation timelines for rotate axis. */
    private SwingRepaintTimeline[] rotateTimelines;

    /**
     * Creates a new {@code LeapSpinner} with default color and duration.
     */
    public LeapSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code LeapSpinner} with the specified color and default duration.
     *
     * @param color the color of the spinner
     */
    public LeapSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code LeapSpinner} with the specified color and duration.
     *
     * @param color the color of the spinner
     * @param duration the duration of one full animation cycle in milliseconds
     */
    public LeapSpinner(Color color, int duration) {
        super(color, duration);
        this.translateValues = new float[]{0f, 0f, 0f};
        this.rotateValues = new float[]{0f, 0f, 0f};
    }

    @Override
    protected void startAnimations() {
        if (this.translateTimelines == null) {
            this.translateTimelines = new SwingRepaintTimeline[3];
        }
        if (this.rotateTimelines == null) {
            this.rotateTimelines = new SwingRepaintTimeline[3];
        }

        KeyTimes translateKeyTimes = new KeyTimes(
            0f, 1.0f / 3.0f, 2.0f / 3.0f, 1.0f);
        KeyValues<Float> translateKeyValues = KeyValues.create(
            0.0f, 0.0f, 1.0f, 2.0f);
        KeyFrames<Float> translateKeyFrames = new KeyFrames<>(translateKeyValues, translateKeyTimes, new Linear());

        for (int i = 0; i < 3; i++) {
            final int index = i;

            SwingRepaintTimeline.Builder builder = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                    Timeline.<Float>property("translate" + index)
                        .getWith((obj, fieldName) -> translateValues[index])
                        .setWith((obj, fieldName, value) -> translateValues[index] = value)
                        .goingThrough(translateKeyFrames))
                .setDuration(this.duration);

            this.translateTimelines[index] = builder.build();
        }

        KeyTimes rotateKeyTimes = new KeyTimes(
            0f, 1.0f / 3.0f, 1.0f);
        KeyValues<Float> rotateKeyValues = KeyValues.create(
            0.0f, 180.0f, 180.0f);
        KeyFrames<Float> rotateKeyFrames = new KeyFrames<>(rotateKeyValues, rotateKeyTimes, new Linear());

        for (int i = 0; i < 3; i++) {
            final int index = i;

            SwingRepaintTimeline.Builder builder = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                    Timeline.<Float>property("rotate" + index)
                        .getWith((obj, fieldName) -> rotateValues[index])
                        .setWith((obj, fieldName, value) -> rotateValues[index] = value)
                        .goingThrough(rotateKeyFrames))
                .setDuration(this.duration);

            this.rotateTimelines[index] = builder.build();
        }

        SwingUtilities.invokeLater(() -> {
            if (LeapSpinner.this.isDisplayable()) {
                for (int i = 0; i < translateTimelines.length; i++) {
                    SwingRepaintTimeline tl = translateTimelines[i];
                    if (tl != null) {
                        tl.playLoopSkipping(RepeatBehavior.LOOP, i * duration / 3);
                    }
                }
            }
        });
        SwingUtilities.invokeLater(() -> {
            if (LeapSpinner.this.isDisplayable()) {
                for (int i = 0; i < rotateTimelines.length; i++) {
                    SwingRepaintTimeline tl = rotateTimelines[i];
                    if (tl != null) {
                        tl.playLoopSkipping(RepeatBehavior.LOOP, i * duration / 3);
                    }
                }
            }
        });
    }

    @Override
    protected void stopAnimations() {
        if (this.translateTimelines != null) {
            for (SwingRepaintTimeline tl : this.translateTimelines) {
                if (tl != null) {
                    tl.abort();
                }
            }
        }
        if (this.rotateTimelines != null) {
            for (SwingRepaintTimeline tl : this.rotateTimelines) {
                if (tl != null) {
                    tl.abort();
                }
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
                    float dotDiameter = dim * 0.24f;
                    float gap = (dim - 3 * dotDiameter) / 2f;

                    graphics1X.setColor(color);

                    for (int index = 0; index < DOT_COUNT; index++) {
                        float translateValue = translateValues[index];
                        float rotateValue = rotateValues[index];

                        float cx = dim / 2f;
                        float cy = dim / 2f;

                        // Rotate around the dot's own center, matching original withTransform({ rotate(...) })
                        Graphics2D dotGraphics = (Graphics2D) graphics1X.create();
                        dotGraphics.rotate(Math.toRadians(rotateValue), cx, cy);
                        float offsetX = translateValue;
                        dotGraphics.fillOval(
                                Math.round(offsetX * (dotDiameter + gap)),
                                Math.round(cy - dotDiameter / 2f),
                                Math.round(dotDiameter),
                                Math.round(dotDiameter));
                        dotGraphics.dispose();
                    }
                });

        graphics.dispose();
    }
}
