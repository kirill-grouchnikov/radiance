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
import java.awt.geom.Arc2D;
import java.awt.geom.Path2D;

/**
 * A Swing component that renders an animated clock spinner.
 *
 * <p>This is a migration of the {@code Clock} composable from the Aurora loading
 * module. It draws a clock-hand shaped polygon that continuously rotates 360°
 * against a semi-transparent circular background.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class ClockSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;

    private float angle;

    private SwingRepaintTimeline timeline;

    /**
     * Creates a new {@code ClockSpinner} with default color (black) and
     * default duration (1200 ms).
     */
    public ClockSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code ClockSpinner} with the specified color.
     *
     * @param color the color of the spinner
     */
    public ClockSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code ClockSpinner} with the specified color and
     * animation duration.
     *
     * @param color    the color of the spinner
     * @param duration the animation cycle duration in milliseconds
     */
    public ClockSpinner(Color color, int duration) {
        super(color, duration);
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
                                .from(0f).to(360f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (ClockSpinner.this.isDisplayable()) {
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

    private Path2D.Double createRoundedTriangleArc(double cx, double cy, double r, double startDeg, double sweepDeg, double k) {
        Path2D.Double path = new Path2D.Double();

        // Calculate angles in radians (Java Math functions expect radians)
        double a1 = Math.toRadians(startDeg);
        double a2 = Math.toRadians(startDeg + sweepDeg);
        double midAngle = Math.toRadians(startDeg + sweepDeg / 2.0);

        // 1. Calculate the three sharp ideal vertices of the triangular slice
        double xCenter = cx;
        double yCenter = cy;
        double xTip1 = cx + r * Math.cos(a1);
        double yTip1 = cy - r * Math.sin(a1); // Subtracted because Y extends downwards in Java2D
        double xTip2 = cx + r * Math.cos(a2);
        double yTip2 = cy - r * Math.sin(a2);

        // 2. Linearly interpolate offset points slightly away from vertices to start/end curves
        // Center vertex offsets
        double c_to_t1_x = xCenter + k * Math.cos(a1);
        double c_to_t1_y = yCenter - k * Math.sin(a1);
        double c_to_t2_x = xCenter + k * Math.cos(a2);
        double c_to_t2_y = yCenter - k * Math.sin(a2);

        // Tip 1 vertex offsets
        double t1_to_c_x = xTip1 - k * Math.cos(a1);
        double t1_to_c_y = yTip1 + k * Math.sin(a1);
        // Offset along the outer arc arc curvature facing Tip 2
        double t1_to_t2_x = xTip1 + k * Math.cos(a1 + Math.PI/2);
        double t1_to_t2_y = yTip1 - k * Math.sin(a1 + Math.PI/2);

        // Tip 2 vertex offsets
        double t2_to_c_x = xTip2 - k * Math.cos(a2);
        double t2_to_c_y = yTip2 + k * Math.sin(a2);
        // Offset along the outer arc curvature facing Tip 1
        double t2_to_t1_x = xTip2 - k * Math.cos(a2 - Math.PI/2);
        double t2_to_t1_y = yTip2 - k * Math.sin(a2 - Math.PI/2);

        // 3. Assemble the shape path using line segments and quadratic control points
        path.moveTo(c_to_t1_x, c_to_t1_y);

        // Straight line up the right leg toward Tip 1
        path.lineTo(t1_to_c_x, t1_to_c_y);

        // Round the corner at Tip 1 using the sharp tip point as the Bézier control anchor
        path.quadTo(xTip1, yTip1, t1_to_t2_x, t1_to_t2_y);

        // Large outer sweep arc connecting Tip 1's curve to Tip 2's curve
        // Using Arc2D append or an intermediate curve point provides a natural circle sweep
        double arcStart = startDeg + Math.toDegrees(k / r);
        double arcExtent = sweepDeg - 2 * Math.toDegrees(k / r);
        Arc2D.Double outerArc = new Arc2D.Double(cx - r, cy - r, r * 2, r * 2, arcStart, arcExtent, Arc2D.OPEN);
        path.append(outerArc, true);

        // Round the corner at Tip 2
        path.quadTo(xTip2, yTip2, t2_to_c_x, t2_to_c_y);

        // Straight line down the left leg returning toward the Center
        path.lineTo(c_to_t2_x, c_to_t2_y);

        // Round the back center pivot point to close the segment smoothly
        path.quadTo(xCenter, yCenter, c_to_t1_x, c_to_t1_y);

        path.closePath(); // Formally close the shape
        return path;
    }

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

                    float centerX = dx + dim / 2f;
                    float centerY = dy + dim / 2f;

                    // Background semi-transparent circle
                    int a = (int) (0.1f * 255);
                    graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));
                    graphics1X.fillOval((int) Math.round(centerX - dim / 2f), (int) Math.round(centerY - dim / 2f),
                            dim, dim);

                    // Rotated polygon
                    Graphics2D rotated = (Graphics2D) graphics1X.create();
                    rotated.rotate(Math.toRadians(angle), centerX, centerY);

                    Path2D.Double path = createRoundedTriangleArc(centerX, centerY, dim / 2.8f,
                        0f, 120f, dim / 10.0f);

                    rotated.setColor(color);
                    rotated.fill(path);

                    rotated.dispose();
                });

        graphics.dispose();
    }
}
