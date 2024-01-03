/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.animation.api.callback.TimelineCallbackAdapter;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintTimeline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class ShapesFrame extends JFrame {
    public static final Color COLOR_BLUE = new Color(128, 128, 255);
    public static final Color COLOR_GREEN = new Color(128, 255, 128);

    public class ShapesPanel extends JComponent {
        private List<MyShape> shapes;
        private boolean toAddRectangle;

        private Color topColor;

        private Color bottomColor;

        public ShapesPanel() {
            this.shapes = new ArrayList<MyShape>();
            this.topColor = COLOR_BLUE;
            this.bottomColor = COLOR_GREEN;

            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    addShape(e.getPoint());
                }
            });

            // animate the gradient endpoint colors in an infinite timeline
            SwingRepaintTimeline.repaintBuilder(this)
                    .addPropertyToInterpolate("topColor", COLOR_BLUE, COLOR_GREEN)
                    .addPropertyToInterpolate("bottomColor", COLOR_GREEN, COLOR_BLUE)
                    .setDuration(1000)
                    .playLoop(RepeatBehavior.REVERSE);
        }

        public void setTopColor(Color topColor) {
            this.topColor = topColor;
        }

        public void setBottomColor(Color bottomColor) {
            this.bottomColor = bottomColor;
        }

        public void addShape(MyShape shape) {
            synchronized (this.shapes) {
                this.shapes.add(shape);
            }
        }

        public void removeShape(MyShape shape) {
            synchronized (this.shapes) {
                this.shapes.remove(shape);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setPaint(new GradientPaint(0, 0, this.topColor, 0, getHeight(), this.bottomColor));
            g2d.fillRect(0, 0, getWidth(), getHeight());

            synchronized (this.shapes) {
                for (MyShape shape : this.shapes) {
                    shape.paint(g2d);
                }
            }
            g2d.dispose();
        }

        private void addShape(Point point) {
            int x = point.x;
            int y = point.y;

            if (toAddRectangle) {
                final MyShape shape = new MyRectangle(x, y, 0, 0);
                addShape(shape);
                Timeline.builder(shape)
                        .addPropertyToInterpolate("x", x, x - 100)
                        .addPropertyToInterpolate("y", y, y - 100)
                        .addPropertyToInterpolate("width", 0, 200)
                        .addPropertyToInterpolate("height", 0, 200)
                        .addPropertyToInterpolate("rotation", 0, 180)
                        .addPropertyToInterpolate("opacity", 1.0f, 0.0f)
                        .addCallback(new TimelineCallbackAdapter() {
                            @Override
                            public void onTimelineStateChanged(TimelineState oldState,
                                    TimelineState newState, float durationFraction,
                                    float timelinePosition) {
                                if (newState == TimelineState.DONE)
                                    removeShape(shape);
                            }
                        })
                        .setDuration(1000)
                        .play();
            } else {
                final MyShape shape = new MyCircle(x, y, 0);
                addShape(shape);
                Timeline.builder(shape)
                        .addPropertyToInterpolate("radius", 0, 100)
                        .addPropertyToInterpolate("opacity", 1.0f, 0.0f)
                        .addCallback(new TimelineCallbackAdapter() {
                            @Override
                            public void onTimelineStateChanged(TimelineState oldState,
                                    TimelineState newState, float durationFraction,
                                    float timelinePosition) {
                                if (newState == TimelineState.DONE)
                                    removeShape(shape);
                            }
                        })
                        .setDuration(1000)
                        .play();
            }
            toAddRectangle = !toAddRectangle;
        }
    }

    public interface MyShape {
        public void paint(Graphics g);
    }

    public class MyRectangle implements MyShape {
        float x;

        float y;

        float width;

        float height;

        float opacity;

        float rotation;

        public MyRectangle(float x, float y, float width, float height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.opacity = 1.0f;
            this.rotation = 0.0f;
        }

        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setWidth(float width) {
            this.width = width;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public void setOpacity(float opacity) {
            this.opacity = opacity;
        }

        public void setRotation(float rotation) {
            this.rotation = rotation;
        }

        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.SrcOver.derive(this.opacity));
            g2d.setColor(COLOR_GREEN);
            float xc = this.x + this.width / 2;
            float yc = this.y + this.height / 2;
            g2d.translate((int) xc, (int) yc);
            g2d.rotate(this.rotation * Math.PI / 180.0);
            g2d.fill(new Rectangle2D.Float(-this.width / 2, -this.height / 2, this.width,
                    this.height));
            g2d.dispose();
        }
    }

    public class MyCircle implements MyShape {
        float x;

        float y;

        float radius;

        float opacity;

        public MyCircle(float x, float y, float radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.opacity = 1.0f;
        }

        public void setX(float x) {
            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }

        public void setOpacity(float opacity) {
            this.opacity = opacity;
        }

        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.SrcOver.derive(this.opacity));
            g2d.setColor(COLOR_GREEN);
            g2d.fill(new Ellipse2D.Float(this.x - this.radius, this.y - this.radius, 2 * radius,
                    2 * radius));
            g2d.dispose();
        }
    }

    public ShapesFrame() {
        super("Swing Shapes");
        ShapesPanel sPanel = new ShapesPanel();
        this.add(sPanel, BorderLayout.CENTER);

        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShapesFrame().setVisible(true));
    }
}
