/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.animation.swing;

import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior;
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState;
import org.pushingpixels.radiance.animation.api.RadianceAnimationCortex;
import org.pushingpixels.radiance.animation.api.callback.TimelineCallbackAdapter;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Deque;
import java.util.LinkedList;

public class StarDust extends JFrame {
    public class Star {
        private double x;
        private double y;
        private float alpha;
        private double outerSpan;
        private Color color;
        private float rotation;

        public Star(double startX, double startY, double startOuterSpan) {
            this.x = startX;
            this.y = startY;
            this.outerSpan = startOuterSpan;
            this.color = Color.white;

            this.alpha = 1.0f;
            this.rotation = 0.0f;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
        }

        public void setRotation(float rotation) {
            this.rotation = rotation;
        }

        public void setOuterSpan(double outerSpan) {
            this.outerSpan = outerSpan;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public Shape getCurrentShape() {
            double innerSpan = this.outerSpan * (0.1f + 0.1f * outerSpan / 20);
            int POINTS = 5;
            GeneralPath result = new GeneralPath();
            for (int i = 0; i < POINTS; i++) {
                double outerAngle = this.rotation + i * 2 * Math.PI / POINTS;
                double xOuter = this.x + this.outerSpan * Math.cos(outerAngle);
                double yOuter = this.y + this.outerSpan * Math.sin(outerAngle);
                if (i == 0) {
                    result.moveTo(xOuter, yOuter);
                } else {
                    result.lineTo(xOuter, yOuter);
                }
                double innerAngle = outerAngle + Math.PI / POINTS;
                double xInner = this.x + innerSpan * Math.cos(innerAngle);
                double yInner = this.y + innerSpan * Math.sin(innerAngle);
                result.lineTo(xInner, yInner);
            }
            result.closePath();
            return result;
        }
    }

    private Deque<Star> stars;

    private class MainPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.black);
            g.fillRect(0, 0, getWidth(), getHeight());

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            synchronized (stars) {
                for (Star star : stars) {
                    g2d.setColor(star.color);
                    g2d.setComposite(AlphaComposite.SrcOver.derive(star.alpha));

                    Shape starShape = star.getCurrentShape();
                    g2d.fill(starShape);
                }
            }
            g2d.dispose();
        }
    }

    public StarDust() {
        super("Star dust");

        final MainPanel mainPanel = new MainPanel();
        this.add(mainPanel);

        // higher pulse rate to create 50 stars a second
        RadianceAnimationCortex.setPulseSource(new RadianceAnimationCortex.FixedRatePulseSource(20));

        this.stars = new LinkedList<>();

        // Timeline to spawn the stars
        Timeline.builder().addCallback(new TimelineCallbackAdapter() {
            private float currHue = 0.0f;

            @Override
            public void onTimelinePulse(float durationFraction, float timelinePosition) {
                Point mouseLoc = MouseInfo.getPointerInfo().getLocation();
                SwingUtilities.convertPointFromScreen(mouseLoc, mainPanel);
                double currX = mouseLoc.getX();
                double currY = mouseLoc.getY();
                if ((currX < 0) || (currY < 0) || (currX > mainPanel.getWidth())
                        || (currY > mainPanel.getHeight()))
                    return;

                double outerStartSpan = 5;
                double outerFinalSpan = 20;
                final Star star = new Star(currX, currY, outerStartSpan);
                synchronized (stars) {
                    stars.addFirst(star);
                }
                double angle = Math.random() * 2.0 * Math.PI;
                double distance = 20.0 + 30.0 * Math.random();

                Timeline.builder(star)
                        .addPropertyToInterpolate("x", currX, currX + distance * Math.cos(angle))
                        .addPropertyToInterpolate("y", currY, currY + distance * Math.sin(angle))
                        .addPropertyToInterpolate("alpha", 1.0f, 0.0f)
                        .addPropertyToInterpolate("rotation", 0.0f,
                                (float) (2 * Math.PI * Math.random()))
                        .addPropertyToInterpolate("outerSpan", outerStartSpan, outerFinalSpan)
                        .addPropertyToInterpolate("color", Color.white,
                                new Color(Color.HSBtoRGB(currHue, 0.8f, 0.7f)))
                        .addCallback(new TimelineCallbackAdapter() {
                            @Override
                            public void onTimelineStateChanged(TimelineState oldState,
                                    TimelineState newState, float durationFraction,
                                    float timelinePosition) {
                                if (newState == TimelineState.DONE) {
                                    // should be the last one in the list
                                    synchronized (stars) {
                                        stars.removeLast();
                                    }
                                }
                            }
                        })
                        .setDuration(3000)
                        .play();

                // Increment hue
                currHue += 0.01f;
                if (currHue > 1.0f) {
                    currHue = 0.0f;
                }
            }
        }).playLoop(RepeatBehavior.LOOP);

        SwingRepaintTimeline.repaintBuilder(mainPanel).playLoop(RepeatBehavior.LOOP);

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StarDust().setVisible(true));
    }
}
