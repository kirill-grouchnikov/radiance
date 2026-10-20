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
 * A Swing component that renders an animated swirl spinner.
 *
 * <p>This is a migration of the {@code Swirl} composable from the Aurora loading
 * module. It draws a 3×3 grid of rounded rectangles whose alpha values animate
 * in a swirl pattern around the center cell.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class SwirlSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;

    /**
     * Ring sequence that defines the swirl order through the 3×3 grid.
     * Index 4 (center) is null — the center cell is left empty.
     * Sequence: top-left(0) → top-center(1) → top-right(2) → bottom-left(7)
     *           → [center skipped] → middle-right(3) → bottom-center(6)
     *           → bottom-right(5) → middle-left(4)
     */
    private static final Integer[] RING = {0, 1, 2, 7, null, 3, 6, 5, 4};
    private static final int CELL_COUNT = 8;

    private float[] highlight;

    private SwingRepaintTimeline timeline;

    public SwirlSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public SwirlSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public SwirlSpinner(Color color, int duration) {
        super(color, duration);
        this.highlight = new float[]{0f};
    }

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("highlight")
                                .getWith((obj, fieldName) -> highlight[0])
                                .setWith((obj, fieldName, value) -> highlight[0] = value)
                                .from(0f).to(1f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (SwirlSpinner.this.isDisplayable()) {
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
                    float gap = dim * 5.0f / 32.0f;
                    float padding = dim / 16.0f;
                    float cellSize = (dim - 2 * padding - 2 * gap) / 3f;
                    float cornerRadius = dim / 16.0f;

                    float hl = highlight[0];

                    for (int index = 0; index < RING.length; index++) {
                        Integer gridPosition = RING[index];
                        if (gridPosition == null) continue;

                        int adjustedGridPosition = CELL_COUNT - gridPosition - 1;
                        float cellX = padding + (index % 3) * (cellSize + gap);
                        float cellY = padding + (index / 3) * (cellSize + gap);

                        float distanceFromHighlight = (hl + adjustedGridPosition / (float) CELL_COUNT) % 1f;
                        float alpha = 1f - distanceFromHighlight * 0.8f;
                        alpha = Math.max(0f, Math.min(1f, alpha));

                        int alphaInt = (int) (alpha * 255);
                        Color cellColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), alphaInt);

                        graphics1X.setColor(cellColor);
                        graphics1X.fillRoundRect(
                                (int) Math.round(cellX),
                                (int) Math.round(cellY),
                                (int) Math.round(cellSize),
                                (int) Math.round(cellSize),
                                (int) Math.round(cornerRadius * 2),
                                (int) Math.round(cornerRadius * 2)
                        );
                    }
                });

        graphics.dispose();
    }
}
