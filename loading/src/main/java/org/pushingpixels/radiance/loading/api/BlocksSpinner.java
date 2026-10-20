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
 * A Swing component that renders an animated blocks spinner.
 *
 * <p>This is a migration of the {@code Blocks} composable from the Aurora loading
 * module. It draws a 3x3 grid of rounded rectangles that animate in a sweeping
 * pattern (by columns, rows, or diagonals). Each block scales up, holds, then
 * scales down in a staggered sequence.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class BlocksSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1300;
    private static final int GRID_SIZE = 3;

    private BlocksSweep sweep;

    private float[] sweepValues;

    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code BlocksSpinner} with default color (black), default
     * duration (1300 ms) and diagonal sweep.
     */
    public BlocksSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BlocksSweep.DIAGONAL);
    }

    /**
     * Creates a new {@code BlocksSpinner} with the specified color.
     *
     * @param color the color of the blocks
     */
    public BlocksSpinner(Color color) {
        this(color, DEFAULT_DURATION, BlocksSweep.DIAGONAL);
    }

    /**
     * Creates a new {@code BlocksSpinner} with the specified color, duration
     * and sweep direction.
     *
     * @param color   the color of the blocks
     * @param duration the animation cycle duration in milliseconds
     * @param sweep   the sweep direction
     */
    public BlocksSpinner(Color color, int duration, BlocksSweep sweep) {
        super(color, duration);
        this.sweep = sweep;
        int maxStep = getMaxStep(sweep);
        this.sweepValues = new float[maxStep];
    }

    public BlocksSweep getSweep() {
        return sweep;
    }

    public void setSweep(BlocksSweep sweep) {
        BlocksSweep old = this.sweep;
        this.sweep = sweep;
        int maxStep = getMaxStep(sweep);
        this.sweepValues = new float[maxStep];
        firePropertyChange("sweep", old, sweep);
        if (isVisible() && isDisplayable()) {
            stopAnimations();
            startAnimations();
        }
    }

    private static int getMaxStep(BlocksSweep sweep) {
        switch (sweep) {
            case COLUMNS: return GRID_SIZE;
            case DIAGONAL: return 2 * GRID_SIZE - 1;
            case ROWS: return GRID_SIZE;
            default: return 2 * GRID_SIZE - 1;
        }
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        int maxStep = getMaxStep(sweep);
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[maxStep];
        }

        for (int i = 0; i < maxStep; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / maxStep;

            SwingRepaintTimeline.Builder builder = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("sweep" + index)
                                    .getWith((obj, fieldName) -> sweepValues[index])
                                    .setWith((obj, fieldName, value) -> sweepValues[index] = value)
                                    .from(0f).to(1f))
                    .setEase(new Linear())
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay);

            this.timelines[index] = builder.build();
        }

        SwingUtilities.invokeLater(() -> {
            if (BlocksSpinner.this.isDisplayable()) {
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

        float gap = dim * 0.1f;
        float cellSize = (dim - gap * 2) / GRID_SIZE;
        float br = dim * 0.0625f;

        graphics.setColor(color);

        for (int index = 0; index < GRID_SIZE * GRID_SIZE; index++) {
            int column = index % GRID_SIZE;
            int row = index / GRID_SIZE;
            int step;
            switch (sweep) {
                case COLUMNS: step = column; break;
                case DIAGONAL: step = row + column; break;
                case ROWS: step = row; break;
                default: step = row + column;
            }

            float sweepValue = (step < sweepValues.length) ? sweepValues[step] : 0f;

            // Scale: 0% -> 0.0, 33% -> 1.0, 66% -> 1.0, 100% -> 0.0
            float scale;
            if (sweepValue < 1.0f / 3.0f) {
                scale = 3.0f * sweepValue;
            } else if (sweepValue < 2.0f / 3.0f) {
                scale = 1.0f;
            } else {
                scale = 3.0f * (1.0f - sweepValue);
            }

            float scaledSize = cellSize * scale;
            float x = column * (cellSize + gap) + (cellSize - scaledSize) / 2f;
            float y = row * (cellSize + gap) + (cellSize - scaledSize) / 2f;

            float actualBr = Math.max(0, br * scale);
            int arc = (int) Math.round(actualBr * 2);
            if (arc <= 0 || scaledSize <= 0) {
                graphics.fillRect((int) Math.round(x), (int) Math.round(y),
                        (int) Math.round(scaledSize), (int) Math.round(scaledSize));
            } else {
                graphics.fillRoundRect((int) Math.round(x), (int) Math.round(y),
                        (int) Math.round(scaledSize), (int) Math.round(scaledSize),
                        arc, arc);
            }
        }

        graphics.dispose();
    }
}
