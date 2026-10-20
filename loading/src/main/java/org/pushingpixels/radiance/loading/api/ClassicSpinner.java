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
 * A Swing component that renders an animated classic spinner.
 *
 * <p>This is a migration of the {@code Classic} composable from the Aurora loading
 * module. It draws 12 bars arranged in a circle (like clock hands). A highlight
 * travels around the circle, with each bar's alpha fading based on its distance
 * from the highlight.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class ClassicSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;
    private static final int BAR_COUNT = 12;

    private float[] highlightValues;

    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code ClassicSpinner} with default color (black) and
     * default duration (1200 ms).
     */
    public ClassicSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code ClassicSpinner} with the specified color.
     *
     * @param color the color of the bars
     */
    public ClassicSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code ClassicSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the bars
     * @param duration the animation cycle duration in milliseconds
     */
    public ClassicSpinner(Color color, int duration) {
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
            if (ClassicSpinner.this.isDisplayable()) {
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

        float barThickness = 0.1f * dim;
        float strokeWidth = barThickness;
        int adjustedDim = dim - (int) strokeWidth - 1;
        int adjDx = dx + (dim - adjustedDim) / 2;
        int adjDy = dy + (dim - adjustedDim) / 2;

        graphics.translate(adjDx + adjustedDim / 2f, adjDy + adjustedDim / 2f);

        float barLength = 0.22f * adjustedDim;
        float offsetFromCenter = 0.28f * adjustedDim;

        float highlight = highlightValues[0];

        graphics.setStroke(new BasicStroke(barThickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        for (int index = 0; index < BAR_COUNT; index++) {
            float distanceFromHighlight = ((highlight + index / (float) BAR_COUNT) % 1f);
            float alpha = 1f - distanceFromHighlight * 0.8f;
            alpha = Math.max(0f, Math.min(1f, alpha));

            float angle = index * (float) Math.PI / 6f;

            float sx = offsetFromCenter * (float) Math.sin(angle);
            float sy = offsetFromCenter * (float) Math.cos(angle);
            float ex = (offsetFromCenter + barLength) * (float) Math.sin(angle);
            float ey = (offsetFromCenter + barLength) * (float) Math.cos(angle);

            int a = (int) Math.round(alpha * 255);
            graphics.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));
            graphics.drawLine((int) Math.round(sx), (int) Math.round(sy),
                    (int) Math.round(ex), (int) Math.round(ey));
        }

        graphics.dispose();
    }
}
