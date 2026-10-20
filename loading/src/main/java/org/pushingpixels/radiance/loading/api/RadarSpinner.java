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
import java.awt.geom.GeneralPath;

/**
 * A Swing component that renders an animated radar spinner.
 *
 * <p>This is a migration of the {@code Radar} composable from the Aurora loading
 * module. It draws concentric circles with a rotating radar beam that sweeps
 * 360°.</p>
 *
 * <p>This is a modified version of the original source code by Jakub Krehel
 * available under the MIT license.</p>
 *
 * @author Kirill Grouchnikov
 */
public class RadarSpinner extends BaseSpinner {

    private static final int DEFAULT_DURATION = 1500;

    private float[] beamAngleValues;

    private SwingRepaintTimeline timeline;

    public RadarSpinner() {
        this(Color.BLACK, DEFAULT_DURATION);
    }

    public RadarSpinner(Color color) {
        this(color, DEFAULT_DURATION);
    }

    public RadarSpinner(Color color, int duration) {
        super(color, duration);
        this.beamAngleValues = new float[]{0f};
    }

    @Override
    protected void startAnimations() {
        if (this.timeline != null && !this.timeline.isDone()) return;

        this.timeline = SwingRepaintTimeline.repaintBuilder(this)
                .addPropertyToInterpolate(
                        Timeline.<Float>property("beamAngle")
                                .getWith((obj, fieldName) -> beamAngleValues[0])
                                .setWith((obj, fieldName, value) -> beamAngleValues[0] = value)
                                .from(0f).to(360f))
                .setEase(new Linear())
                .setDuration(this.duration)
                .build();

        SwingUtilities.invokeLater(() -> {
            if (RadarSpinner.this.isDisplayable()) {
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

                    float strokeWidth = (float) (2.5f * scaleFactor);
                    int dim = Math.min(scaledWidth, scaledHeight) - (int) strokeWidth - 1;
                    int dx = (scaledWidth - dim) / 2 + (int) strokeWidth / 2;
                    int dy = (scaledHeight - dim) / 2 + (int) strokeWidth / 2;

                    float centerX = dx + dim / 2f;
                    float centerY = dy + dim / 2f;
                    float minX = centerX - dim / 2f;
                    float maxX = centerX + dim / 2f;
                    float minY = centerY - dim / 2f;
                    float maxY = centerY + dim / 2f;
                    float beamStart = dim / 5f;

                    // Background circles
                    int a20 = (int) (0.2f * 255);
                    graphics1X.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), a20));
                    graphics1X.fillOval((int) Math.round(centerX - dim / 2f), (int) Math.round(centerY - dim / 2f), dim, dim);

                    graphics1X.setStroke(new BasicStroke(strokeWidth));
                    graphics1X.drawOval((int) Math.round(centerX - dim / 3f), (int) Math.round(centerY - dim / 3f),
                            (int) Math.round(dim / 3f * 2), (int) Math.round(dim / 3f * 2));

                    // Rotating beam (wedge shape with gradient)
                    Graphics2D rotated = (Graphics2D) graphics1X.create();
                    rotated.rotate(Math.toRadians(beamAngleValues[0]), centerX, centerY);

                    rotated.setPaint(new RadialGradientPaint(
                        centerX, centerY, dim / 2,
                        new float[] { 0.0f, 0.4f, 1.0f },
                        new Color[] { this.color, this.color,
                            new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), 0.0f)}));

                    GeneralPath beam = new GeneralPath();
                    beam.moveTo(minX, centerY);
                    beam.lineTo(maxX, centerY);

                    // outer arc
                    beam.quadTo(maxX, maxY, centerX, maxY);

                    beam.lineTo(centerX, centerY + beamStart);

                    // inner arc
                    beam.quadTo(centerX + beamStart, centerY + beamStart, centerX + beamStart, centerY);

                    beam.closePath();

                    rotated.fill(beam);

                    rotated.dispose();

                    // Central dot
                    float dotR = dim / 8f;
                    graphics1X.setColor(color);
                    graphics1X.fillOval((int) Math.round(centerX - dotR), (int) Math.round(centerY - dotR),
                            (int) Math.round(dotR * 2), (int) Math.round(dotR * 2));
                });

        graphics.dispose();
    }
}
