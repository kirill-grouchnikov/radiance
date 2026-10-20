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
 * A Swing component that renders an animated trace spinner.
 *
 * <p>This is a migration of the {@code Trace} composable from the Aurora loading
 * module. It draws a rotating arc that leaves a fading trail behind it.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class TraceSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1000;
    private static final float DEFAULT_STROKE_WIDTH = 2.5f;

    private int cap;

    private float[] angleValues;

    private SwingRepaintTimeline timeline;

    public TraceSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    public TraceSpinner(Color color) {
        this(color, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    public TraceSpinner(Color color, int duration, int cap) {
        super(color, duration);
        this.cap = cap;
        this.angleValues = new float[]{0f};
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        int old = this.cap;
        this.cap = cap;
        firePropertyChange("cap", old, cap);
        repaint();
    }

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("angle")
                                .getWith((obj, fieldName) -> angleValues[0])
                                .setWith((obj, fieldName, value) -> angleValues[0] = value)
                                .from(0f).to(360f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (TraceSpinner.this.isDisplayable()) {
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
                    float radius = dim / 2f;

                    // Draw a fading trail arc
                    Graphics2D rotated = (Graphics2D) graphics1X.create();
                    rotated.rotate(Math.toRadians(angleValues[0]), center, centerY);

                    // Draw the trail as multiple segments with decreasing alpha
                    int segments = 30;
                    float arcAngle = 180f; // half circle trail
                    float anglePerSegment = arcAngle / segments;

                    for (int i = 0; i < segments; i++) {
                        float t = i / (float) segments;
                        float alpha = 1f - t; // fade from full to transparent
                        int a = (int) Math.round(alpha * 255);

                        rotated.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));
                        rotated.setStroke(new BasicStroke(strokeWidth, this.cap, BasicStroke.JOIN_ROUND));
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
