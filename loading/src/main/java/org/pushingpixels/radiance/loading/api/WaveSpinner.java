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
 * A Swing component that renders an animated wave spinner.
 *
 * <p>This is a migration of the {@code Wave} composable from the Aurora loading
 * module. It draws five vertical bars that oscillate in height, creating a
 * wave-like pattern.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class WaveSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1500;
    private static final int BAR_COUNT = 5;

    private float[] waveValues;

    private SwingRepaintTimeline[] timelines;

    public WaveSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public WaveSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public WaveSpinner(Color color, int duration) {
        super(color, duration);
        this.waveValues = new float[BAR_COUNT];
    }

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[BAR_COUNT];
        }

        for (int i = 0; i < BAR_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / BAR_COUNT;

            this.timelines[index] = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("wave" + index)
                                    .getWith((obj, fieldName) -> waveValues[index])
                                    .setWith((obj, fieldName, value) -> waveValues[index] = value)
                                    .from(0f).to(1f))
                    .setEase(new Linear())
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay)
                    .build();
        }

        SwingUtilities.invokeLater(() -> {
            if (WaveSpinner.this.isDisplayable()) {
                for (SwingRepaintTimeline tl : timelines) {
                    if (tl != null) tl.playLoop(RepeatBehavior.REVERSE);
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

        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) return;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                RenderingHints.VALUE_STROKE_PURE);

        int dim = Math.min(width, height);
        int dx = (width - dim) / 2;
        int dy = (height - dim) / 2;

        graphics.translate(dx, dy);

        float barWidth = dim * 0.1f;
        float gap = (dim - BAR_COUNT * barWidth) / (BAR_COUNT + 1);
        float maxBarHeight = dim * 0.8f;

        graphics.setColor(color);

        for (int index = 0; index < BAR_COUNT; index++) {
            float waveValue = waveValues[index];
            float barHeight = maxBarHeight * waveValue;

            float x = gap + index * (barWidth + gap);
            float y = (dim - barHeight) / 2f;

            float br = barWidth / 2f;
            int arc = (int) Math.round(br * 2);
            graphics.fillRoundRect((int) Math.round(x), (int) Math.round(y),
                    (int) Math.round(barWidth), (int) Math.round(barHeight),
                    arc, arc);
        }

        graphics.dispose();
    }
}
