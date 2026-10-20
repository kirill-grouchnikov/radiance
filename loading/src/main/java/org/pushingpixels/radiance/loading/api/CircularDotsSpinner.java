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
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated circular dots spinner.
 *
 * <p>This is a migration of the {@code CircularDots} composable from the Aurora
 * loading module. It draws 8 dots arranged in a circle. A highlight travels
 * around the circle, with each dot's alpha fading based on its distance from
 * the highlight.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class CircularDotsSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 800;
    private static final int DOT_COUNT = 8;

    private float[] highlightValues;

    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code CircularDotsSpinner} with default color (black) and
     * default duration (800 ms).
     */
    public CircularDotsSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code CircularDotsSpinner} with the specified color.
     *
     * @param color the color of the dots
     */
    public CircularDotsSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code CircularDotsSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the dots
     * @param duration the animation cycle duration in milliseconds
     */
    public CircularDotsSpinner(Color color, int duration) {
        super(color, duration);
        this.highlightValues = new float[]{0f};
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) {
            return;
        }

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("highlight")
                                .getWith((obj, fieldName) -> highlightValues[0])
                                .setWith((obj, fieldName, value) -> highlightValues[0] = value)
                                .from(0f).to(1f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (CircularDotsSpinner.this.isDisplayable()) {
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

                    float scale = dim / 16f;
                    float dotR = 1.5f * scale;

                    float highlight = highlightValues[0];

                    for (int index = 0; index < DOT_COUNT; index++) {
                        float angle = index * (float) Math.PI / 4;
                        float distanceFromHighlight = ((highlight + index / 8f) % 1f);
                        float alpha = 1f - distanceFromHighlight * 0.8f;
                        alpha = Math.max(0f, Math.min(1f, alpha));

                        float cx = (8f + 6.5f * (float) Math.sin(angle)) * scale;
                        float cy = (8f + 6.5f * (float) Math.cos(angle)) * scale;

                        int a = (int) Math.round(alpha * 255);
                        graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));

                        float r = dotR;
                        graphics1X.fillOval((int) Math.round(cx - r), (int) Math.round(cy - r),
                                (int) Math.round(r * 2), (int) Math.round(r * 2));
                    }
                });

        graphics.dispose();
    }
}
