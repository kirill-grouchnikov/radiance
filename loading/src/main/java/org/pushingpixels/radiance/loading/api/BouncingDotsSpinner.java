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
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated bouncing dots spinner.
 *
 * <p>This is a migration of the {@code BouncingDots} composable from the Aurora
 * loading module. It draws three dots arranged horizontally that bounce up and
 * down in a staggered pattern.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class BouncingDotsSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 500;
    private static final int DOT_COUNT = 3;

    private float[] dotValues;

    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code BouncingDotsSpinner} with default color (black) and
     * default duration (500 ms).
     */
    public BouncingDotsSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code BouncingDotsSpinner} with the specified color.
     *
     * @param color the color of the dots
     */
    public BouncingDotsSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code BouncingDotsSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the dots
     * @param duration the animation cycle duration in milliseconds
     */
    public BouncingDotsSpinner(Color color, int duration) {
        super(color, duration);
        this.dotValues = new float[DOT_COUNT];
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[DOT_COUNT];
        }

        for (int i = 0; i < DOT_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / DOT_COUNT;

            SwingRepaintTimeline.Builder builder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("dot" + index)
                                    .getWith((obj, fieldName) -> dotValues[index])
                                    .setWith((obj, fieldName, value) -> dotValues[index] = value)
                                    .from(0f).to(1f))
                    .setEase(new Linear())
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay);

            this.timelines[index] = builder.build();
        }

        SwingUtilities.invokeLater(() -> {
            if (BouncingDotsSpinner.this.isDisplayable()) {
                for (SwingRepaintTimeline tl : timelines) {
                    if (tl != null) {
                        tl.playLoop(RepeatBehavior.REVERSE);
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

        float dotSize = dim * 0.25f;
        float gap = dim * 0.2f;
        float totalWidth = 3 * dotSize + 2 * gap;
        float startX = (dim - totalWidth) / 2f;

        graphics.setColor(color);

        for (int i = 0; i < DOT_COUNT; i++) {
            float dotValue = dotValues[i];
            float yOff = (0.28f - dotValue) * dotSize;
            float cx = startX + i * (dotSize + gap) + dotSize / 2f;
            float cy = dim / 2f + yOff;

            graphics.fillOval((int) Math.round(cx - dotSize / 2f),
                    (int) Math.round(cy - dotSize / 2f),
                    (int) Math.round(dotSize),
                    (int) Math.round(dotSize));
        }

        graphics.dispose();
    }
}
