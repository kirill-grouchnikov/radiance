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
 * A Swing component that renders an animated gather spinner.
 *
 * <p>This is a migration of the {@code Gather} composable from the Aurora loading
 * module. It draws four rounded rectangles that pull toward the center then
 * rotate 90°.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class GatherSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1600;

    /** Pull animation value (0-1). */
    private float pull;

    /** Turn animation value in degrees. */
    private float turn;

    /** Animation timelines for pull and turn. */
    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code GatherSpinner} with default color (black) and
     * default duration (1600 ms).
     */
    public GatherSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code GatherSpinner} with the specified color.
     *
     * @param color the color of the blocks
     */
    public GatherSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code GatherSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the blocks
     * @param duration the animation cycle duration in milliseconds
     */
    public GatherSpinner(Color color, int duration) {
        super(color, duration);
    }

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[2];
        }

        int d30 = duration * 3 / 10;
        int d50 = duration * 5 / 10;

        // Pull: 0→1 at 30%, stays at 1 until 50%, then 1→0
        float[] pullTimes = {0f, (float) d30 / duration, (float) d50 / duration, 1f};
        Float[] pullVals = {0f, 1f, 1f, 0f};
        KeyFrames<Float> pullKF = new KeyFrames<>(KeyValues.create(pullVals), new KeyTimes(pullTimes), new Linear());

        this.timelines[0] = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("pull")
                                .getWith((obj, fieldName) -> pull)
                                .setWith((obj, fieldName, value) -> pull = value)
                                .goingThrough(pullKF))
                .setDuration(this.duration)
                .build();

        // Turn: 0→0 at 30%, 0→90 at 60%, stays at 90
        float[] turnTimes = {0f, (float) d30 / duration, (float) d50 / duration, 1f};
        Float[] turnVals = {0f, 0f, 90f, 90f};
        KeyFrames<Float> turnKF = new KeyFrames<>(KeyValues.create(turnVals), new KeyTimes(turnTimes), new Linear());

        this.timelines[1] = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("turn")
                                .getWith((obj, fieldName) -> turn)
                                .setWith((obj, fieldName, value) -> turn = value)
                                .goingThrough(turnKF))
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (GatherSpinner.this.isDisplayable()) {
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

                    float center = dx + dim / 2f;
                    float centerY = dy + dim / 2f;

                    float defaultBlockGap = dim * 0.22f;
                    float blockSize = (dim - defaultBlockGap) / 2f;
                    float blockCornerRadius = dim * 0.14f;
                    float pullA = pull * blockSize / 3.0f;

                    Graphics2D rotated = (Graphics2D) graphics1X.create();
                    rotated.rotate(Math.toRadians(turn), center, centerY);

                    int arc = Math.round(blockCornerRadius * 2);
                    rotated.setColor(color);

                    float[] dxs = {1f, -1f, 1f, -1f};
                    float[] dys = {1f, 1f, -1f, -1f};

                    for (int i = 0; i < 4; i++) {
                        float xPos = dxs[i] * (blockSize / 2f + defaultBlockGap / 2f - pullA / 2f) - blockSize / 2f;
                        float yPos = dys[i] * (blockSize / 2f + defaultBlockGap / 2f - pullA / 2f) - blockSize / 2f;

                        rotated.fillRoundRect(
                                Math.round(center + xPos), Math.round(centerY + yPos),
                                Math.round(blockSize), Math.round(blockSize),
                                arc, arc);
                    }

                    rotated.dispose();
                });

        graphics.dispose();
    }
}
