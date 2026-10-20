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
 * A Swing component that renders an animated loading spinner.
 *
 * <p>This is a migration of the {@code Loading} composable from the Aurora loading
 * module. It draws a pattern of small rectangles arranged in a specific layout
 * that fade in sequence.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class LoadingSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1000;
    private static final int SEGMENT_COUNT = 8;

    private static final int[] SEGMENT_X = {10, 6, 2, 0, 2, 6, 10, 12};
    private static final int[] SEGMENT_Y = {2, 0, 2, 6, 10, 12, 10, 6};

    private float[] highlightValues;

    private SwingRepaintTimeline timeline;

    public LoadingSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public LoadingSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public LoadingSpinner(Color color, int duration) {
        super(color, duration);
        this.highlightValues = new float[]{0f};
    }

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

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
            if (LoadingSpinner.this.isDisplayable()) {
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

        float cellSize = dim / 15f;
        float highlight = highlightValues[0];

        for (int index = 0; index < SEGMENT_COUNT; index++) {
            float distanceFromHighlight = ((highlight + index / 8f) % 1f);
            float alpha = 1f - distanceFromHighlight * 0.8f;
            alpha = Math.max(0f, Math.min(1f, alpha));

            int a = (int) Math.round(alpha * 255);
            graphics.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));

            int x = SEGMENT_X[index];
            int y = SEGMENT_Y[index];
            int cs = (int) Math.round(cellSize);

            // Draw 4 rectangles per segment
            graphics.fillRect(x * cs, y * cs, cs, cs);
            graphics.fillRect((x + 2) * cs, y * cs, cs, cs);
            graphics.fillRect(x * cs, (y + 2) * cs, cs, cs);
            graphics.fillRect((x + 2) * cs, (y + 2) * cs, cs, cs);
        }

        graphics.dispose();
    }
}
