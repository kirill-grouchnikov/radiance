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
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated ripple spinner.
 *
 * <p>This is a migration of the {@code Ripple} composable from the Aurora loading
 * module. It draws three concentric circles whose radius and alpha animate
 * continuously, creating a ripple effect. The direction can be {@link RippleDirection#OUT}
 * (default, circles expand outward while fading) or {@link RippleDirection#IN}
 * (circles contract inward while appearing).</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class RippleSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;

    /** Number of concentric ripple rings */
    private static final int RIPPLE_COUNT = 3;

    /**
     * The direction of the ripple animation.
     * <p>{@link OUT} expands circles outward while fading (default, matching original default).
     * {@link IN} contracts circles inward while appearing.</p>
     */
    public enum RippleDirection {
        /** Circles expand outward while fading. */
        OUT,
        /** Circles contract inward while appearing. */
        IN
    }

    /** Animation position (0-1). */
    private float position;

    /** Animation timeline. */
    private SwingRepaintTimeline timeline;

    /** Ripple direction. */
    private RippleDirection direction;

    /**
     * Creates a new {@code RippleSpinner} with default color and duration.
     */
    public RippleSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code RippleSpinner} with the specified color and default duration.
     *
     * @param color the color of the spinner
     */
    public RippleSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code RippleSpinner} with the specified color and duration.
     *
     * @param color the color of the spinner
     * @param duration the duration of one full animation cycle in milliseconds
     */
    public RippleSpinner(Color color, int duration) {
        this(color, duration, RippleDirection.OUT);
    }

    /**
     * Creates a new {@code RippleSpinner} with the specified color, duration, and direction.
     *
     * @param color     the color of the ripples
     * @param duration  the animation cycle duration in milliseconds
     * @param direction the ripple direction (Out or In)
     */
    public RippleSpinner(Color color, int duration, RippleDirection direction) {
        super(color, duration);
        this.direction = direction;
    }

    /**
     * Returns the ripple direction.
     *
     * @return the current direction
     */
    public RippleDirection getDirection() {
        return direction;
    }

    /**
     * Sets the ripple direction.
     *
     * @param direction the new direction
     */
    public void setDirection(RippleDirection direction) {
        RippleDirection old = this.direction;
        this.direction = direction;
        firePropertyChange("direction", old, direction);
        repaint();
    }

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

        // We use a single timeline; the staggered ripple
        // positions are computed manually in paintComponent via modulo arithmetic,
        // matching the original: sp = ((position + i/3f) % 1f)
        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("position")
                                .getWith((obj, fieldName) -> position)
                                .setWith((obj, fieldName, value) -> {
                                    position = value;
                                })
                                .from(0f).to(1f))
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (RippleSpinner.this.isDisplayable()) {
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
                    float center = dim / 2f;

                    for (int i = 0; i < RIPPLE_COUNT; i++) {
                        // Staggered position: sp = ((position + i/3f) % 1f)
                        float sp = (position + i / 3f) % 1f;

                        // Scale and alpha depend on direction, matching original logic:
                        // Out: sc = sp, alpha = 1f - sp
                        // In:  sc = 1f - sp, alpha = sp
                        float sc, alpha;
                        if (this.direction == RippleDirection.OUT) {
                            sc = sp;
                            alpha = 1f - sp;
                        } else {
                            sc = 1f - sp;
                            alpha = sp;
                        }

                        // Stroke width varies with scale: strokeWidth = (1.0.dp + sc.dp).toPx()
                        float strokeWidth = (float) ((1f + sc) * scaleFactor);

                        // Alpha clamped to [0, 1], matching color.copy(alpha = alpha.coerceIn(0f, 1f))
                        alpha = Math.max(0f, Math.min(1f, alpha));
                        int a = Math.round(alpha * 255);
                        graphics1X.setColor(new Color(
                                this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a));
                        graphics1X.setStroke(new BasicStroke(strokeWidth));

                        // radius = dim / 2f * sc
                        float r = dim / 2f * sc;
                        graphics1X.drawOval(
                                Math.round(center - r),
                                Math.round(center - r),
                                Math.round(r * 2),
                                Math.round(r * 2));
                    }
                });

        graphics.dispose();
    }
}
