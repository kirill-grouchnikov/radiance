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
 * A Swing component that renders an animated orbit spinner.
 *
 * <p>This is a migration of the {@code Orbit} composable from the Aurora loading
 * module. It draws a central dot with a rotating arc that has a gradient tail.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class OrbitSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 750;
    private static final float DEFAULT_STROKE_WIDTH = 2f;

    private float angle;

    private SwingRepaintTimeline timeline;

    public OrbitSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public OrbitSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public OrbitSpinner(Color color, int duration) {
        super(color, duration);
        this.angle = 0f;
    }

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("angle")
                                .getWith((obj, fieldName) -> angle)
                                .setWith((obj, fieldName, value) -> angle = value)
                                .from(0f).to(360f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (OrbitSpinner.this.isDisplayable()) {
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

                    float strokeWidth = (float) (DEFAULT_STROKE_WIDTH * scaleFactor);
                    int dim = Math.min(scaledWidth, scaledHeight) - (int) strokeWidth - 1;
                    int dx = (scaledWidth - dim) / 2 + (int) strokeWidth / 2;
                    int dy = (scaledHeight - dim) / 2 + (int) strokeWidth / 2;

                    float center = dx + dim / 2f;
                    float centerY = dy + dim / 2f;
                    float dotR = dim / 8f;

                    // Central dot
                    graphics1X.setColor(color);
                    graphics1X.fillOval((int) Math.round(center - dotR), (int) Math.round(centerY - dotR),
                            (int) Math.round(dotR * 2), (int) Math.round(dotR * 2));

                    // Rotating arc with gradient
                    float radius = dim / 2f - strokeWidth / 2f;
                    Graphics2D rotated = (Graphics2D) graphics1X.create();
                    rotated.rotate(Math.toRadians(angle), center, centerY);

                    int segments = 60;
                    float anglePerSegment = 360f / segments;
                    for (int i = 0; i < segments; i++) {
                        float t = i / (float) segments;
                        // Gradient: 0→0.5 transparent, 0.5→1.0 goes from 0 to full alpha
                        float alpha = t < 0.5f ? 0f : (t - 0.5f) * 2f;
                        if (alpha <= 0f) continue;

                        int a = (int) Math.round(alpha * 255);
                        rotated.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));
                        rotated.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                        rotated.drawArc(
                                (int) Math.round(center - radius), (int) Math.round(centerY - radius),
                                (int) Math.round(radius * 2), (int) Math.round(radius * 2),
                                (int) Math.round(i * anglePerSegment), (int) Math.round(anglePerSegment));
                    }

                    rotated.dispose();
                });

        graphics.dispose();
    }
}
