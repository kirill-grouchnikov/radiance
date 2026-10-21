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
import org.pushingpixels.radiance.animation.api.ease.EasingFunctions;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated compass spinner.
 *
 * <p>This is a migration of the {@code Compass} composable from the Aurora loading
 * module. It draws 4 bars arranged as compass points (N, S, E, W) that oscillate
 * back and forth, creating a spinning compass effect.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class CompassSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 500;
    private static final int BAR_COUNT = 4;

    /** Current rotation angle in degrees. */
    private float angle;

    /** Animation timeline. */
    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code CompassSpinner} with default color (black) and
     * default duration (500 ms).
     */
    public CompassSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code CompassSpinner} with the specified color.
     *
     * @param color the color of the bars
     */
    public CompassSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code CompassSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the bars
     * @param duration the animation cycle duration in milliseconds
     */
    public CompassSpinner(Color color, int duration) {
        super(color, duration);
        this.angle = 0f;
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) {
            return;
        }

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("angle")
                                .getWith((obj, fieldName) -> angle)
                                .setWith((obj, fieldName, value) -> angle = value)
                                .from(0f).to(90f))
                .setEase(EasingFunctions.EASE_IN_OUT)
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (CompassSpinner.this.isDisplayable()) {
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

                    float barThickness = 0.1f * dim;
                    float strokeWidth = barThickness;
                    int adjustedDim = dim - (int) strokeWidth - 1;
                    int adjDx = dx + (dim - adjustedDim) / 2;
                    int adjDy = dy + (dim - adjustedDim) / 2;

                    graphics1X.translate(adjDx + adjustedDim / 2f, adjDy + adjustedDim / 2f);

                    float barLength = 0.22f * adjustedDim;
                    float offsetFromCenter = 0.28f * adjustedDim;

                    float angleRad = angle * (float) Math.PI / 180f;

                    graphics1X.setStroke(new BasicStroke(barThickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    graphics1X.setColor(color);

                    for (int index = 0; index < BAR_COUNT; index++) {
                        float barAngle = index * (float) Math.PI / 2f - angleRad;

                        float sx = offsetFromCenter * (float) Math.sin(barAngle);
                        float sy = offsetFromCenter * (float) Math.cos(barAngle);
                        float ex = (offsetFromCenter + barLength) * (float) Math.sin(barAngle);
                        float ey = (offsetFromCenter + barLength) * (float) Math.cos(barAngle);

                        graphics1X.drawLine(Math.round(sx), Math.round(sy),
                                Math.round(ex), Math.round(ey));
                    }
                });

        graphics.dispose();
    }
}
