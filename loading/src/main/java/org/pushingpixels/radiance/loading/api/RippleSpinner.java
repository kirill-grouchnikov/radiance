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
 * A Swing component that renders an animated ripple spinner.
 *
 * <p>This is a migration of the {@code Ripple} composable from the Aurora loading
 * module. It draws three concentric circles that expand outward while fading,
 * creating a ripple effect.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class RippleSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;
    private static final int RIPPLE_COUNT = 3;

    private float[] rippleValues;

    private SwingRepaintTimeline[] timelines;

    public RippleSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public RippleSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public RippleSpinner(Color color, int duration) {
        super(color, duration);
        this.rippleValues = new float[RIPPLE_COUNT];
    }

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[RIPPLE_COUNT];
        }

        for (int i = 0; i < RIPPLE_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / RIPPLE_COUNT;

            this.timelines[index] = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("ripple" + index)
                                    .getWith((obj, fieldName) -> rippleValues[index])
                                    .setWith((obj, fieldName, value) -> rippleValues[index] = value)
                                    .from(0f).to(1f))
                    .setEase(new Linear())
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay)
                    .build();
        }

        SwingUtilities.invokeLater(() -> {
            if (RippleSpinner.this.isDisplayable()) {
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

        float strokeWidth = 1f;
        int dim = Math.min(width, height) - (int) strokeWidth - 1;
        int dx = insets.left + (width - dim) / 2 + (int) strokeWidth / 2;
        int dy = insets.top + (height - dim) / 2 + (int) strokeWidth / 2;

        float center = dx + dim / 2f;
        float centerY = dy + dim / 2f;

        for (int index = 0; index < RIPPLE_COUNT; index++) {
            float position = rippleValues[index];
            float alpha = 0.4f * (1f - position);
            float sc = 0.25f + position * 0.75f;

            int a = (int) Math.round(Math.max(0f, Math.min(1f, alpha)) * 255);
            graphics.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));

            float r = dim / 2f * sc;
            graphics.drawOval((int) Math.round(center - r), (int) Math.round(centerY - r),
                    (int) Math.round(r * 2), (int) Math.round(r * 2));
        }

        graphics.dispose();
    }
}
