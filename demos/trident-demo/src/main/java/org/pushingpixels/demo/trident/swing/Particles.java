/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.trident.swing;

import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.Timeline.RepeatBehavior;
import org.pushingpixels.trident.api.Timeline.TimelineState;
import org.pushingpixels.trident.api.callback.TimelineCallbackAdapter;
import org.pushingpixels.trident.api.ease.Spline;
import org.pushingpixels.trident.api.swing.SwingRepaintTimeline;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.image.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Particles {
    /**
     * This class is based on Romain Guy's work from
     * http://www.jroller.com/gfx/entry/new_blendings_modes_for_java2d available
     * under BSD license.
     */
    private static final class AddContext implements CompositeContext {
        private Add add;

        public AddContext(Add add) {
            this.add = add;
        }

        @Override
        public void dispose() {
        }

        public void compose(Raster src, Raster dstIn, WritableRaster dstOut) {
            if (src.getSampleModel().getDataType() != DataBuffer.TYPE_INT
                    || dstIn.getSampleModel().getDataType() != DataBuffer.TYPE_INT
                    || dstOut.getSampleModel().getDataType() != DataBuffer.TYPE_INT) {
                throw new IllegalStateException("Source and destination must store pixels as INT.");
            }

            int width = Math.min(src.getWidth(), dstIn.getWidth());
            int height = Math.min(src.getHeight(), dstIn.getHeight());

            float alpha = this.add.alpha;

            int[] srcPixel = new int[4];
            int[] dstPixel = new int[4];
            int[] srcPixels = new int[width];
            int[] dstPixels = new int[width];

            for (int y = 0; y < height; y++) {
                src.getDataElements(0, y, width, 1, srcPixels);
                dstIn.getDataElements(0, y, width, 1, dstPixels);
                for (int x = 0; x < width; x++) {
                    int pixel = srcPixels[x];
                    srcPixel[0] = (pixel >>> 24) & 0xFF;
                    srcPixel[1] = (pixel >>> 16) & 0xFF;
                    srcPixel[2] = (pixel >>> 8) & 0xFF;
                    srcPixel[3] = (pixel) & 0xFF;

                    pixel = dstPixels[x];
                    dstPixel[0] = (pixel >>> 24) & 0xFF;
                    dstPixel[1] = (pixel >>> 16) & 0xFF;
                    dstPixel[2] = (pixel >>> 8) & 0xFF;
                    dstPixel[3] = (pixel) & 0xFF;

                    int[] result = new int[] { Math.min(255, srcPixel[0] + dstPixel[0]),
                            Math.min(255,
                                    srcPixel[1] * srcPixel[0] / 255
                                            + dstPixel[1] * dstPixel[0] / 255),
                            Math.min(255,
                                    srcPixel[2] * srcPixel[0] / 255
                                            + dstPixel[2] * dstPixel[0] / 255),
                            Math.min(255, srcPixel[3] * srcPixel[0] / 255
                                    + dstPixel[3] * dstPixel[0] / 255) };

                    dstPixels[x] = ((int) (dstPixel[0] + (result[0] - dstPixel[0]) * alpha)
                            & 0xFF) << 24
                            | ((int) (dstPixel[1] + (result[1] - dstPixel[1]) * alpha) & 0xFF) << 16
                            | ((int) (dstPixel[2] + (result[2] - dstPixel[2]) * alpha) & 0xFF) << 8
                            | (int) (dstPixel[3] + (result[3] - dstPixel[3]) * alpha) & 0xFF;
                }
                dstOut.setDataElements(0, y, width, 1, dstPixels);
            }
        }
    }

    public static class Add implements Composite {
        private float alpha;

        public Add(float alpha) {
            this.alpha = alpha;
        }

        @Override
        public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel,
                RenderingHints hints) {
            return new AddContext(this);
        }
    }

    public static class Particle {
        float x;

        float y;

        float opacity;

        float angle;

        int size;

        Color color;

        public Particle(float x, float y, int size, Color color, float angle) {
            this.x = x;
            this.y = y;
            this.size = size;
            this.opacity = 1.0f;
            this.angle = angle;
            this.color = color;
        }

        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setOpacity(float opacity) {
            this.opacity = opacity;
        }

        public void setAngle(float angle) {
            this.angle = angle;
        }

        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(new Add(this.opacity));

            g2d.translate(this.x, this.y);
            g2d.setPaint(new RadialGradientPaint(0, 0, this.size / 2.0f,
                    new float[] { 0.0f, 0.6f, 1.0f },
                    new Color[] { this.color, this.color, new Color(this.color.getRed(),
                            this.color.getGreen(), this.color.getBlue(), 96) }));

            g2d.fill(new Ellipse2D.Float(-this.size / 2.0f, -this.size / 2.0f, this.size,
                    this.size));

            float d1 = (float) (Math.cos(this.angle) * this.size / 3);
            float d2 = (float) (Math.sin(this.angle) * this.size / 3);
            GeneralPath rh = new GeneralPath();
            rh.moveTo(d1, d2);
            rh.lineTo(d2, -d1);
            rh.lineTo(-d1, -d2);
            rh.lineTo(-d2, d1);
            rh.closePath();

            g2d.setPaint(new RadialGradientPaint(0, 0, this.size / 3.0f, new float[] { 0.0f, 1.0f },
                    new Color[] { new Color(255, 255, 255, 96), new Color(255, 255, 255, 32) }));
            g2d.fill(rh);

            Color c1 = new Color(255, 255, 255, 16);
            Color c2 = new Color(255, 255, 255, 32);
            g2d.setPaint(new LinearGradientPaint(d1, d2, -d1, -d2, new float[] { 0.0f, 0.5f, 1.0f },
                    new Color[] { c1, c2, c1 }));
            g2d.drawLine((int) d1, (int) d2, -(int) d1, -(int) d2);
            g2d.setPaint(new LinearGradientPaint(-d2, d1, d2, -d1, new float[] { 0.0f, 0.5f, 1.0f },
                    new Color[] { c1, c2, c1 }));
            g2d.drawLine(-(int) d2, (int) d1, (int) d2, -(int) d1);

            g2d.dispose();
        }
    }

    public static class ParticlesPanel extends JPanel {
        private List<Particle> particles;

        boolean wasMouseInside;

        int lastX, lastY;

        public ParticlesPanel() {
            this.particles = new ArrayList<>();

            // Infinitely looping timeline to track the mouse
            Timeline.builder().addCallback(new TimelineCallbackAdapter() {
                @Override
                public void onTimelinePulse(float durationFraction, float timelinePosition) {
                    Point mouseLoc = MouseInfo.getPointerInfo().getLocation();
                    SwingUtilities.convertPointFromScreen(mouseLoc, ParticlesPanel.this);
                    boolean isInside = (mouseLoc.x >= 0) && (mouseLoc.y >= 0)
                            && (mouseLoc.x < getWidth()) && (mouseLoc.y < getHeight());
                    if (isInside) {
                        int x = mouseLoc.x;
                        int y = mouseLoc.y;
                        if (wasMouseInside) {
                            int dist = (int) Math
                                    .sqrt((lastX - x) * (lastX - x) + (lastY - y) * (lastY - y));
                            makeParticles(lastX, lastY, x, y, 1 + dist / 16);
                        }
                        lastX = x;
                        lastY = y;
                        wasMouseInside = true;
                    } else {
                        wasMouseInside = false;
                    }

                }
            }).playLoop(RepeatBehavior.LOOP);

            SwingRepaintTimeline.repaintBuilder(this).playLoop(RepeatBehavior.LOOP);
        }

        private synchronized void makeParticles(int x1, int y1, int x2, int y2, int numParticles) {

            Random randomizer = new Random();
            Color[] cs = new Color[] { Color.red, Color.blue, Color.green, Color.magenta,
                    Color.cyan, Color.yellow };
            for (int i = 0; i < numParticles; i++) {
                int size = 4 + randomizer.nextInt(44);
                int duration = (200 - size) * 3;
                int moveDistance = 4 + randomizer.nextInt(76 - size);
                double moveDirection = 2 * Math.PI * Math.random();

                int startX = x1 + i * (x2 - x1) / numParticles;
                int startY = y1 + i * (y2 - y1) / numParticles;
                int goalX = startX + (int) (moveDistance * Math.cos(moveDirection));
                int goalY = startY + (int) (moveDistance * Math.sin(moveDirection));
                float startAngle = (float) (2 * Math.PI * Math.random());
                float endAngle = (float) (startAngle + 4 * Math.PI * Math.random() - 2 * Math.PI);

                final Particle particle = new Particle(startX, startY, size,
                        cs[randomizer.nextInt(cs.length)], startAngle);
                this.particles.add(particle);

                Timeline.builder(particle)
                        .addPropertyToInterpolate("x", startX, goalX)
                        .addPropertyToInterpolate("y", startY, goalY)
                        .addPropertyToInterpolate("opacity", 1.0f, 0.0f)
                        .addPropertyToInterpolate("angle", startAngle, endAngle)
                        .addCallback(new TimelineCallbackAdapter() {
                            @Override
                            public void onTimelineStateChanged(TimelineState oldState,
                                    TimelineState newState, float durationFraction,
                                    float timelinePosition) {
                                if (newState == TimelineState.DONE) {
                                    synchronized (ParticlesPanel.this) {
                                        particles.remove(particle);
                                    }
                                }
                            }
                        })
                        .setDuration(duration)
                        .setEase(new Spline(1.0f))
                        .play();
            }
        }

        BufferedImage offscreen;

        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.black);
            int w = getWidth();
            int h = getHeight();
            g.fillRect(0, 0, w, h);

            if ((offscreen == null) || (offscreen.getWidth() != w)
                    || (offscreen.getHeight() != h)) {
                offscreen = GraphicsEnvironment.getLocalGraphicsEnvironment()
                        .getDefaultScreenDevice().getDefaultConfiguration()
                        .createCompatibleImage(w, h, BufferedImage.TRANSLUCENT);
            }

            Graphics2D g2d = offscreen.createGraphics();
            g2d.setColor(new Color(0, 0, 0, 0));
            g2d.setComposite(AlphaComposite.Src);
            g2d.fillRect(0, 0, w, h);

            synchronized (this) {
                for (Particle p : this.particles)
                    p.paint(offscreen.getGraphics());
            }

            g.drawImage(offscreen, 0, 0, null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame fr = new JFrame("Particles");
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ParticlesPanel panel = new ParticlesPanel();
            panel.setPreferredSize(new Dimension(400, 300));
            fr.add(panel);
            fr.pack();
            fr.setLocationRelativeTo(null);
            fr.setVisible(true);
        });
    }
}
