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
 * module. It draws a dashed round rectangle border whose dash phase rotates
 * continuously, creating a tracing effect around the perimeter.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class TraceSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;
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

                    float dim = Math.min(scaledWidth, scaledHeight);

                    float strokeWidth = (float) (DEFAULT_STROKE_WIDTH * scaleFactor);
                    int halfStroke = (int) (strokeWidth / 2.0f);
                    float side = dim - strokeWidth;
                    float cornerRadius = 0.2f * dim;

                    // Perimeter of the round rectangle border
                    float perimeter = 4f * (side - 2 * cornerRadius) + 2f * (float) Math.PI * cornerRadius;
                    float dash = 0.8f * dim;

                    // Dash phase driven by the animated angle (0→360)
                    float phase = -(angleValues[0] / 360.0f) * perimeter;

                    // Draw the faint background border (alpha 0.2)
                    int bgAlpha = (int) Math.round(0.2f * 255);
                    Color bgColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), bgAlpha);
                    graphics1X.setColor(bgColor);
                    graphics1X.setStroke(new BasicStroke(strokeWidth, this.cap, BasicStroke.JOIN_ROUND));
                    drawRoundRectBorder(graphics1X, halfStroke, halfStroke, side, side, cornerRadius);

                    // Draw the animated dashed border
                    graphics1X.setColor(color);
                    drawDashedRoundRectBorder(graphics1X, halfStroke, halfStroke, side, side,
                        cornerRadius, strokeWidth, dash, perimeter - dash, phase);
                });

        graphics.dispose();
    }

    /**
     * Draws the border of a round rectangle using a solid stroke.
     */
    private void drawRoundRectBorder(Graphics2D g, int x0, int y0, float w, float h, float r) {
        g.drawRoundRect(
                (int) Math.round(x0), (int) Math.round(y0),
                (int) Math.round(w), (int) Math.round(h),
                (int) Math.round(r * 2), (int) Math.round(r * 2));
    }

    /**
     * Draws the border of a round rectangle with a dash pattern.
     * Simulates Compose's PathEffect.dashPathEffect by stepping along the
     * round rectangle perimeter and alternating between dash and gap segments.
     */
    private void drawDashedRoundRectBorder(Graphics2D g, int x0, int y0, float w, float h,
            float r, float strokeWidth, float dash, float gap, float phase) {

        // Build the round rectangle path as a series of line and arc segments
        // The perimeter consists of 4 straight edges and 4 corner arcs
        // Top edge: (r, 0) → (w-r, 0), length = w - 2r
        // Top-right corner arc: 90 degrees, length = π/2 * r
        // Right edge: (w, r) → (w, h-r), length = h - 2r
        // Bottom-right corner arc: 90 degrees, length = π/2 * r
        // Bottom edge: (w-r, h) → (r, h), length = w - 2r
        // Bottom-left corner arc: 90 degrees, length = π/2 * r
        // Left edge: (0, h-r) → (0, r), length = h - 2r
        // Top-left corner arc: 90 degrees, length = π/2 * r

        float topLen = w - 2 * r;
        float rightLen = h - 2 * r;
        float arcLen = (float) (Math.PI / 2.0) * r;

        // Total perimeter check
        // float perimeter = 2 * topLen + 2 * rightLen + 4 * arcLen;

        // Normalize phase to [0, perimeter)
        float perimeter = dash + gap;
        float p = phase % perimeter;
        if (p < 0) p += perimeter;

        // Collect segment boundaries along the perimeter
        // Each segment is either a straight line or an arc
        // We'll walk the perimeter and draw small line segments where we're in a "dash" region

        // Build a list of (startDistance, endDistance, type, params) for each edge
        // Type: 0 = horizontal line, 1 = vertical line, 2 = arc
        // We store segments as: startDist, endDist, then type-specific params

        // For simplicity, we'll sample the perimeter at small intervals and draw connected segments
        // This is the most reliable approach for dashed round rectangles in AWT

        // Determine which parts of the perimeter are "dash" vs "gap"
        // Walk the perimeter in small steps, tracking whether we're in a dash or gap

        float step = Math.max(1f, strokeWidth / 4f); // small step size for smooth rendering

        // Normalize phase: the dash starts at position -phase along the perimeter
        float normPhase = -phase;
        while (normPhase < 0) normPhase += perimeter;
        while (normPhase >= perimeter) normPhase -= perimeter;

        // Collect dash intervals along the perimeter [0, perimeter)
        // A dash starts at normPhase and lasts for 'dash' distance, then gap for 'gap' distance
        java.util.List<float[]> dashIntervals = new java.util.ArrayList<>();
        float pos = normPhase;
        while (pos < perimeter) {
            float dashEnd = Math.min(pos + dash, perimeter);
            dashIntervals.add(new float[]{(float) Math.round(pos), (float) Math.round(dashEnd)});
            pos = dashEnd + gap;
        }
        // Handle wrap-around: if the last dash extends past perimeter, wrap to start
        if (normPhase + dash > perimeter) {
            float wrapEnd = (normPhase + dash) - perimeter;
            dashIntervals.add(new float[]{0f, (float) Math.round(wrapEnd)});
        }

        // For each dash interval, draw the corresponding portion of the round rectangle border
        for (float[] interval : dashIntervals) {
            float startDist = interval[0];
            float endDist = interval[1];

            // Walk from startDist to endDist along the perimeter and draw small segments
            float d = startDist;
            float prevX = 0, prevY = 0;
            boolean first = true;

            while (d < endDist) {
                float dd = Math.min(d + step, endDist);
                float[] pos1 = distanceToPosition(dd, x0, y0, w, h, r, topLen, rightLen, arcLen);
                if (first) {
                    prevX = pos1[0];
                    prevY = pos1[1];
                    first = false;
                } else {
                    g.setColor(color);
                    g.setStroke(new BasicStroke(strokeWidth, this.cap, BasicStroke.JOIN_ROUND));
                    g.drawLine((int) Math.round(prevX), (int) Math.round(prevY),
                            (int) Math.round(pos1[0]), (int) Math.round(pos1[1]));
                    prevX = pos1[0];
                    prevY = pos1[1];
                }
                d = dd;
            }
        }
    }

    /**
     * Converts a distance along the round rectangle perimeter to an (x, y) position.
     * The perimeter starts at the top-left corner and goes clockwise.
     */
    private float[] distanceToPosition(float dist, int x0, int y0, float w, float h, float r,
            float topLen, float rightLen, float arcLen) {

        float perimeter = 2 * topLen + 2 * rightLen + 4 * arcLen;
        // Normalize distance
        while (dist < 0) dist += perimeter;
        while (dist >= perimeter) dist -= perimeter;

        float d = dist;

        // Top edge: from (x0 + r, y0) to (x0 + w - r, y0)
        if (d <= topLen) {
            float t = d / topLen;
            return new float[]{x0 + r + t * topLen, (float) y0};
        }
        d -= topLen;

        // Top-right corner arc: from angle -π/2 to 0 (centered at (x0 + w - r, y0 + r))
        if (d <= arcLen) {
            float t = d / arcLen;
            float angle = (float) (-Math.PI / 2.0 + t * Math.PI / 2.0);
            float cx = x0 + w - r;
            float cy = y0 + r;
            return new float[]{cx + r * (float) Math.cos(angle), cy + r * (float) Math.sin(angle)};
        }
        d -= arcLen;

        // Right edge: from (x0 + w, y0 + r) to (x0 + w, y0 + h - r)
        if (d <= rightLen) {
            float t = d / rightLen;
            return new float[]{(float) (x0 + w), y0 + r + t * rightLen};
        }
        d -= rightLen;

        // Bottom-right corner arc: from angle 0 to π/2 (centered at (x0 + w - r, y0 + h - r))
        if (d <= arcLen) {
            float t = d / arcLen;
            float angle = (float) (t * Math.PI / 2.0f);
            float cx = x0 + w - r;
            float cy = y0 + h - r;
            return new float[]{cx + r * (float) Math.cos(angle), cy + r * (float) Math.sin(angle)};
        }
        d -= arcLen;

        // Bottom edge: from (x0 + w - r, y0 + h) to (x0 + r, y0 + h)
        if (d <= topLen) {
            float t = d / topLen;
            return new float[]{x0 + w - r - t * topLen, (float) (y0 + h)};
        }
        d -= topLen;

        // Bottom-left corner arc: from angle π/2 to π (centered at (x0 + r, y0 + h - r))
        if (d <= arcLen) {
            float t = d / arcLen;
            float angle = (float) (Math.PI / 2.0 + t * Math.PI / 2.0);
            float cx = x0 + r;
            float cy = y0 + h - r;
            return new float[]{cx + r * (float) Math.cos(angle), cy + r * (float) Math.sin(angle)};
        }
        d -= arcLen;

        // Left edge: from (x0, y0 + h - r) to (x0, y0 + r)
        if (d <= rightLen) {
            float t = d / rightLen;
            return new float[]{(float) x0, y0 + h - r - t * rightLen};
        }
        d -= rightLen;

        // Top-left corner arc: from angle π to 3π/2 (centered at (x0 + r, y0 + r))
        if (d <= arcLen) {
            float t = d / arcLen;
            float angle = (float) (Math.PI + t * Math.PI / 2.0);
            float cx = x0 + r;
            float cy = y0 + r;
            return new float[]{cx + r * (float) Math.cos(angle), cy + r * (float) Math.sin(angle)};
        }

        // Fallback
        return new float[]{(float) x0, (float) y0};
    }
}
