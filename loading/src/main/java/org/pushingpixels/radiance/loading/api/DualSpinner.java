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
 * A Swing component that renders an animated dual spinner.
 *
 * <p>This is a migration of the {@code Dual} composable from the Aurora loading
 * module. It draws two concentric dashed arcs rotating in opposite directions.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class DualSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1000;
    private static final float DEFAULT_STROKE_WIDTH = 2.5f;
    private static final float DASH_RATIO_NUMERATOR = 18.0f;
    private static final float DASH_RATIO_DENOMINATOR = 18.0f + 44.8f;

    private int cap;

    private float[] angleValues;

    private SwingRepaintTimeline[] timelines;

    /**
     * Creates a new {@code DualSpinner} with default color (black) and
     * default duration (1000 ms).
     */
    public DualSpinner() {
        this(Color.BLACK, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code DualSpinner} with the specified color.
     *
     * @param color the color of the arcs
     */
    public DualSpinner(Color color) {
        this(color, DEFAULT_DURATION, BasicStroke.CAP_ROUND);
    }

    /**
     * Creates a new {@code DualSpinner} with the specified color, duration
     * and stroke cap.
     *
     * @param color    the color of the arcs
     * @param duration the animation cycle duration in milliseconds
     * @param cap      the stroke cap style
     */
    public DualSpinner(Color color, int duration, int cap) {
        super(color, duration);
        this.cap = cap;
        this.angleValues = new float[]{0f, 0f};
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

    // ─── Lifecycle ────────────────────────────────────────────────────────

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[2];
        }

        // Outer arc: 0→360
        SwingRepaintTimeline.Builder outerBuilder = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("angle0")
                                .getWith((obj, fieldName) -> angleValues[0])
                                .setWith((obj, fieldName, value) -> angleValues[0] = value)
                                .from(0f).to(360f))
                .setEase(new Linear())
                .setDuration(this.duration);
        this.timelines[0] = outerBuilder.build();

        // Inner arc: 0→-360 (opposite direction)
        SwingRepaintTimeline.Builder innerBuilder = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("angle1")
                                .getWith((obj, fieldName) -> angleValues[1])
                                .setWith((obj, fieldName, value) -> angleValues[1] = value)
                                .from(0f).to(-360f))
                .setEase(new Linear())
                .setDuration(this.duration);
        this.timelines[1] = innerBuilder.build();

        SwingUtilities.invokeLater(() -> {
            if (DualSpinner.this.isDisplayable()) {
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

                    float strokeWidth = (float) (DEFAULT_STROKE_WIDTH * scaleFactor);
                    int dim = Math.min(scaledWidth, scaledHeight) - (int) strokeWidth - 1;
                    int dx = (scaledWidth - dim) / 2 + (int) strokeWidth / 2;
                    int dy = (scaledHeight - dim) / 2 + (int) strokeWidth / 2;

                    float center = dx + dim / 2f;
                    float centerY = dy + dim / 2f;

                    graphics1X.setColor(color);

                    // Outer arc
                    float radiusOuter = 0.42f * dim;
                    float circumferenceOuter = 2f * (float) Math.PI * radiusOuter;
                    float dashOuter = DASH_RATIO_NUMERATOR * circumferenceOuter / DASH_RATIO_DENOMINATOR;

                    Graphics2D rotatedOuter = (Graphics2D) graphics1X.create();
                    rotatedOuter.rotate(Math.toRadians(angleValues[0]), center, centerY);
                    rotatedOuter.setColor(color);
                    rotatedOuter.setStroke(new BasicStroke(strokeWidth, this.cap,
                            BasicStroke.JOIN_ROUND, 0, new float[]{dashOuter, circumferenceOuter - dashOuter}, 0));
                    float arcDiameterOuter = 2f * radiusOuter;
                    rotatedOuter.drawArc((int) Math.round(center - radiusOuter), (int) Math.round(centerY - radiusOuter),
                            (int) Math.round(arcDiameterOuter), (int) Math.round(arcDiameterOuter), 0, 360);
                    rotatedOuter.dispose();

                    // Inner arc
                    float radiusInner = 0.23f * dim;
                    float circumferenceInner = 2f * (float) Math.PI * radiusInner;
                    float dashInner = DASH_RATIO_NUMERATOR * circumferenceInner / DASH_RATIO_DENOMINATOR;

                    Graphics2D rotatedInner = (Graphics2D) graphics1X.create();
                    rotatedInner.rotate(Math.toRadians(angleValues[1]), center, centerY);
                    rotatedInner.setColor(color);
                    rotatedInner.setStroke(new BasicStroke(strokeWidth, this.cap,
                            BasicStroke.JOIN_ROUND, 0, new float[]{dashInner, circumferenceInner - dashInner}, 0));
                    float arcDiameterInner = 2f * radiusInner;
                    rotatedInner.drawArc((int) Math.round(center - radiusInner), (int) Math.round(centerY - radiusInner),
                            (int) Math.round(arcDiameterInner), (int) Math.round(arcDiameterInner), 0, 360);
                    rotatedInner.dispose();
                });

        graphics.dispose();
    }
}
