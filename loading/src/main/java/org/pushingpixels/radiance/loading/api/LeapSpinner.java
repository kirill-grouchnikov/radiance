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

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated leap spinner.
 *
 * <p>This is a migration of the {@code Leap} composable from the Aurora loading
 * module. It draws three dots that leap past each other in a staggered sequence,
 * each rotating 180° as it moves.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class LeapSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1800;
    private static final int DOT_COUNT = 3;

    private float[] translateValues;
    private float[] rotateValues;

    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code LeapSpinner} with default color (black) and
     * default duration (1800 ms).
     */
    public LeapSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code LeapSpinner} with the specified color.
     *
     * @param color the color of the dots
     */
    public LeapSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code LeapSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the dots
     * @param duration the animation cycle duration in milliseconds
     */
    public LeapSpinner(Color color, int duration) {
        super(color, duration);
        this.translateValues = new float[DOT_COUNT];
        this.rotateValues = new float[DOT_COUNT];
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[DOT_COUNT * 2];
        }

        int thirdDuration = duration / 3;
        int twoThirdsDuration = duration * 2 / 3;

        float[] translateTimes = {0f, (float) thirdDuration / duration, (float) twoThirdsDuration / duration, 1f};
        Float[] translateVals = {0f, 0f, -1f, -2f};
        KeyFrames<Float> translateKF = new KeyFrames<>(KeyValues.create(translateVals), new KeyTimes(translateTimes), new Linear());

        float[] rotateTimes = {0f, (float) thirdDuration / duration, 1f};
        Float[] rotateVals = {0f, 180f, 180f};
        KeyFrames<Float> rotateKF = new KeyFrames<>(KeyValues.create(rotateVals), new KeyTimes(rotateTimes), new Linear());

        for (int i = 0; i < DOT_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / 3;

            this.timelines[index * 2] = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("translate" + index)
                                    .getWith((obj, fieldName) -> translateValues[index])
                                    .setWith((obj, fieldName, value) -> translateValues[index] = value)
                                    .goingThrough(translateKF))
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay)
                    .build();

            this.timelines[index * 2 + 1] = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("rotate" + index)
                                    .getWith((obj, fieldName) -> rotateValues[index])
                                    .setWith((obj, fieldName, value) -> rotateValues[index] = value)
                                    .goingThrough(rotateKF))
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay)
                    .build();
        }

        SwingUtilities.invokeLater(() -> {
            if (LeapSpinner.this.isDisplayable()) {
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

        Insets insets = getInsets();
        int width = getWidth() - insets.left - insets.right;
        int height = getHeight() - insets.top - insets.bottom;

        if (width <= 0 || height <= 0) {
            return;
        }

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int dim = Math.min(width, height);
        int dx = insets.left + (width - dim) / 2;
        int dy = insets.top + (height - dim) / 2;

        graphics.translate(dx, dy);

        float dotDiameter = dim * 0.24f;
        float gap = (dim - 3 * dotDiameter) / 2f;
        float centerY = dim / 2f;

        graphics.setColor(color);

        for (int index = 0; index < DOT_COUNT; index++) {
            float offsetX = translateValues[index];
            float rotAngle = rotateValues[index];

            Graphics2D dotGraphics = (Graphics2D) graphics.create();
            float cx = offsetX * (dotDiameter + gap) + dotDiameter / 2f;
            dotGraphics.rotate(Math.toRadians(rotAngle), cx, centerY);
            dotGraphics.fillOval(
                    (int) Math.round(cx - dotDiameter / 2f),
                    (int) Math.round(centerY - dotDiameter / 2f),
                    (int) Math.round(dotDiameter),
                    (int) Math.round(dotDiameter));
            dotGraphics.dispose();
        }

        graphics.dispose();
    }
}
