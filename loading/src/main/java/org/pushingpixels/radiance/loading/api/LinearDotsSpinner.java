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
 * A Swing component that renders an animated linear dots spinner.
 *
 * <p>This is a migration of the {@code LinearDots} composable from the Aurora
 * loading module. It draws three dots in a row that fade in and out in a
 * staggered sequence.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class LinearDotsSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 900;
    private static final int DOT_COUNT = 3;

    private float[] fadeValues;

    private SwingRepaintTimeline[] timelines;

    public LinearDotsSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public LinearDotsSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public LinearDotsSpinner(Color color, int duration) {
        super(color, duration);
        this.fadeValues = new float[DOT_COUNT];
    }

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[DOT_COUNT];
        }

        int twoThirdsDuration = duration * 2 / 3;
        float[] times = {0f, (float) twoThirdsDuration / duration, 1f};
        Float[] vals = {1f, 0.5f, 1f};
        KeyFrames<Float> kf = new KeyFrames<>(KeyValues.create(vals), new KeyTimes(times), new Linear());

        for (int i = 0; i < DOT_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / 3;

            this.timelines[index] = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("fade" + index)
                                    .getWith((obj, fieldName) -> fadeValues[index])
                                    .setWith((obj, fieldName, value) -> fadeValues[index] = value)
                                    .goingThrough(kf))
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay)
                    .build();
        }

        SwingUtilities.invokeLater(() -> {
            if (LinearDotsSpinner.this.isDisplayable()) {
                for (SwingRepaintTimeline tl : timelines) {
                    if (tl != null) tl.playLoop(RepeatBehavior.LOOP);
                }
            }
        });
    }

    @Override
    protected void stopAnimations() {
        if (this.timelines != null) {
            for (SwingRepaintTimeline tl : this.timelines) {
                if (tl != null) tl.abort();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Insets insets = getInsets();
        int width = getWidth() - insets.left - insets.right;
        int height = getHeight() - insets.top - insets.bottom;
        if (width <= 0 || height <= 0) return;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int dim = Math.min(width, height);
        int dx = insets.left + (width - dim) / 2;
        int dy = insets.top + (height - dim) / 2;
        graphics.translate(dx, dy);

        float dotDiameter = dim * 0.24f;
        float gap = (dim - 3 * dotDiameter) / 2f;
        float centerY = dim / 2f;

        for (int index = 0; index < DOT_COUNT; index++) {
            float alpha = Math.max(0f, Math.min(1f, fadeValues[index]));
            int a = (int) Math.round(alpha * 255);
            graphics.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));

            float cx = index * (dotDiameter + gap) + dotDiameter / 2f;
            graphics.fillOval(
                    (int) Math.round(cx - dotDiameter / 2f),
                    (int) Math.round(centerY - dotDiameter / 2f),
                    (int) Math.round(dotDiameter),
                    (int) Math.round(dotDiameter));
        }

        graphics.dispose();
    }
}
