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
import org.pushingpixels.radiance.animation.api.ease.TimelineEase;
import org.pushingpixels.radiance.animation.api.interpolator.KeyFrames;
import org.pushingpixels.radiance.animation.api.interpolator.KeyTimes;
import org.pushingpixels.radiance.animation.api.interpolator.KeyValues;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;

import javax.swing.*;
import java.awt.*;

/**
 * A Swing component that renders an animated morph spinner.
 *
 * <p>This is a migration of the {@code Morph} composable from the Aurora loading
 * module. It draws a rounded rectangle that morphs its corner radius while
 * rotating 90°.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class MorphSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1200;

    private float[] cornerRadiusValues;
    private float[] rotateValues;

    private SwingRepaintTimeline[] timelines;

    public MorphSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public MorphSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public MorphSpinner(Color color, int duration) {
        super(color, duration);
        this.cornerRadiusValues = new float[]{0.08f};
        this.rotateValues = new float[]{0f};
    }

    @Override
    protected void startAnimations() {
        if (this.timelines == null) {
            this.timelines = new SwingRepaintTimeline[2];
        }

        int d30 = duration * 3 / 10;
        int halfDuration = duration / 2;

        TimelineEase easeIn = EasingFunctions.EASE_IN;
        TimelineEase easeOut = EasingFunctions.EASE_OUT;

        // Corner radius: 0.08 → 0.5 at 30%, → 0.08 at 100%
        float[] crTimes = {0f, (float) d30 / duration, 1f};
        Float[] crVals = {0.08f, 0.5f, 0.08f};
        // Use a combined approach: just use Linear for simplicity
        KeyFrames<Float> crKF = new KeyFrames<>(KeyValues.create(crVals), new KeyTimes(crTimes), new org.pushingpixels.radiance.animation.api.ease.Linear());

        this.timelines[0] = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("cornerRadius")
                                .getWith((obj, fieldName) -> cornerRadiusValues[0])
                                .setWith((obj, fieldName, value) -> cornerRadiusValues[0] = value)
                                .goingThrough(crKF))
                .setDuration(this.duration)
                .build();

        // Rotate: 0 → 45 at 50%, → 90 at 100%
        float[] rotTimes = {0f, (float) halfDuration / duration, 1f};
        Float[] rotVals = {0f, 45f, 90f};
        KeyFrames<Float> rotKF = new KeyFrames<>(KeyValues.create(rotVals), new KeyTimes(rotTimes), new org.pushingpixels.radiance.animation.api.ease.Linear());

        this.timelines[1] = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("rotate")
                                .getWith((obj, fieldName) -> rotateValues[0])
                                .setWith((obj, fieldName, value) -> rotateValues[0] = value)
                                .goingThrough(rotKF))
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (MorphSpinner.this.isDisplayable()) {
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

        int dim = Math.min(width, height);
        int dx = (width - dim) / 2;
        int dy = (height - dim) / 2;

        float center = dx + dim / 2f;
        float centerY = dy + dim / 2f;

        float sq = dim * 0.64f;
        float cornerRadius = cornerRadiusValues[0] * sq;

        Graphics2D rotated = (Graphics2D) graphics.create();
        rotated.rotate(Math.toRadians(rotateValues[0]), center, centerY);

        int arc = (int) Math.round(cornerRadius * 2);
        rotated.setColor(color);
        rotated.fillRoundRect(
                (int) Math.round(center - sq / 2f), (int) Math.round(centerY - sq / 2f),
                (int) Math.round(sq), (int) Math.round(sq),
                arc, arc);

        rotated.dispose();
        graphics.dispose();
    }
}
