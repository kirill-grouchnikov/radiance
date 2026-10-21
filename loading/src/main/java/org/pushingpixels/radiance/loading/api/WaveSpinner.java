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
import org.pushingpixels.radiance.animation.api.ease.EasingFunctions;
import org.pushingpixels.radiance.animation.api.interpolator.KeyFrames;
import org.pushingpixels.radiance.animation.api.interpolator.KeyTimes;
import org.pushingpixels.radiance.animation.api.interpolator.KeyValues;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated wave spinner.
 *
 * <p>This is a migration of the {@code Wave} composable from the Aurora loading
 * module. It draws five vertical bars whose heights animate in a wave pattern
 * using keyframes (0.3→1.0→0.3) with EaseIn/EaseOut easing, staggered by
 * a delay of duration/5 for each bar.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class WaveSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 900;
    private static final int BAR_COUNT = 5;

    /**
     * The vertical origin for bar placement.
     * <p>{@link CENTER} centers bars vertically (default, matching original default).
     * {@link BOTTOM} anchors bars at the bottom.</p>
     */
    public enum WaveOrigin {
        /** Bars are centered vertically. */
        CENTER,
        /** Bars are anchored at the bottom. */
        BOTTOM
    }

    /** Per-bar wave animation values. */
    private float[] waveValues;

    /** Animation timelines for each bar. */
    private SwingRepaintTimeline[] timelines;

    /** Vertical origin for bar placement. */
    private WaveOrigin origin;

    /**
     * Creates a new {@code WaveSpinner} with default color and duration.
     */
    public WaveSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code WaveSpinner} with the specified color and default duration.
     *
     * @param color the color of the spinner
     */
    public WaveSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    /**
     * Creates a new {@code WaveSpinner} with the specified color and duration.
     *
     * @param color the color of the spinner
     * @param duration the duration of one full animation cycle in milliseconds
     */
    public WaveSpinner(Color color, int duration) {
        this(color, duration, WaveOrigin.CENTER);
    }

    /**
     * Creates a new {@code WaveSpinner} with the specified color, duration, and origin.
     *
     * @param color   the color of the bars
     * @param duration the animation cycle duration in milliseconds
     * @param origin  the vertical origin for bar placement
     */
    public WaveSpinner(Color color, int duration, WaveOrigin origin) {
        super(color, duration);
        this.waveValues = new float[BAR_COUNT];
        this.origin = origin;
    }

    /**
     * Returns the vertical origin for bar placement.
     *
     * @return the current origin
     */
    public WaveOrigin getOrigin() {
        return origin;
    }

    /**
     * Sets the vertical origin for bar placement.
     *
     * @param origin the new origin
     */
    public void setOrigin(WaveOrigin origin) {
        WaveOrigin old = this.origin;
        this.origin = origin;
        firePropertyChange("origin", old, origin);
        repaint();
    }

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[BAR_COUNT];
        }

        // Keyframes: 0.3f at 0%, 1.0f at 50%, 0.3f at 100%
        // with EaseIn for the first half and EaseOut for the second half
        KeyTimes keyTimes = new KeyTimes(0f, 0.5f, 1f);
        KeyValues<Float> keyValues = KeyValues.create(0.3f, 1.0f, 0.3f);
        KeyFrames<Float> keyFrames = new KeyFrames<>(keyValues, keyTimes,
                EasingFunctions.EASE_IN, EasingFunctions.EASE_OUT);

        for (int i = 0; i < BAR_COUNT; i++) {
            final int index = i;
            long initialDelay = index * (long) duration / BAR_COUNT;

            this.timelines[index] = SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate(
                            Timeline.<Float>property("wave" + index)
                                    .getWith((obj, fieldName) -> waveValues[index])
                                    .setWith((obj, fieldName, value) -> waveValues[index] = value)
                                    .goingThrough(keyFrames))
                    .setEase(EasingFunctions.EASE_IN_OUT)
                    .setDuration(this.duration)
                    .setInitialDelay(initialDelay)
                    .build();
        }

        SwingUtilities.invokeLater(() -> {
            if (WaveSpinner.this.isDisplayable()) {
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
                    float barWidth = dim * 0.12f;
                    float gap = (dim - BAR_COUNT * barWidth) / 6f;

                    graphics1X.setColor(color);

                    for (int index = 0; index < BAR_COUNT; index++) {
                        float waveValue = waveValues[index];
                        float barHeight = dim * waveValue;

                        float xPos = gap + index * (barWidth + gap);
                        float yPos;
                        if (this.origin == WaveOrigin.BOTTOM) {
                            yPos = dim - barHeight;
                        } else {
                            yPos = (dim - barHeight) / 2f;
                        }

                        float cornerRadius = barWidth / 2f;
                        int arc = Math.round(cornerRadius * 2);
                        graphics1X.fillRoundRect(Math.round(xPos), Math.round(yPos),
                                Math.round(barWidth), Math.round(barHeight),
                                arc, arc);
                    }
                });

        graphics.dispose();
    }
}
