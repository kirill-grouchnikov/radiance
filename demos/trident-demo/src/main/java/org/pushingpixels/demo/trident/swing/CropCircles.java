/*
 * Copyright (c) 2005-2019 Trident Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Trident Kirill Grouchnikov nor the names of 
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

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.RepeatBehavior;
import org.pushingpixels.trident.TimelineScenario;
import org.pushingpixels.trident.ease.Spline;
import org.pushingpixels.trident.swing.SwingComponentTimeline;
import org.pushingpixels.trident.swing.SwingRepaintTimeline;

public class CropCircles {
    public static class CropCircle {
        private float xc;

        private float yc;

        private float radius;

        private float initialRadius;

        private float opacity;

        public CropCircle(float xc, float yc, float radius) {
            this.xc = xc;
            this.yc = yc;
            this.radius = 0.0f;
            this.initialRadius = radius;
            this.opacity = 0.0f;
        }

        public void paint(Graphics g) {
            if (this.opacity == 0.0f)
                return;

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setComposite(AlphaComposite.SrcOver.derive(this.opacity));
            g2d.setColor(new Color(241, 237, 190));
            g2d.fill(new Ellipse2D.Float(this.xc - this.radius, this.yc - this.radius,
                    2 * this.radius, 2 * this.radius));

            g2d.dispose();
        }

        public float getInitialRadius() {
            return initialRadius;
        }

        public void setOpacity(float opacity) {
            this.opacity = opacity;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }
    }

    private static class CropArc {
        private float xc;

        private float yc;

        private float radius;

        private java.util.List<CropCircle> cs;

        public CropArc(float x1, float y1, float x2, float y2, float x3, float y3) {
            float ma = (y2 - y1) / (x2 - x1);
            float mb = (y3 - y2) / (x3 - x2);
            this.xc = (ma * mb * (y1 - y3) + mb * (x1 + x2) - ma * (x2 + x3)) / (2 * (mb - ma));
            if (ma == 0.0) {
                this.yc = (y2 + y3) / 2 - (this.xc - (x2 + x3) / 2) / mb;
            } else {
                this.yc = (y1 + y2) / 2 - (this.xc - (x1 + x2) / 2) / ma;
            }
            this.radius = (float) Math
                    .sqrt((x1 - this.xc) * (x1 - this.xc) + (y1 - this.yc) * (y1 - this.yc));
        }

        public float getCenterX() {
            return this.xc;
        }

        public float getCenterY() {
            return this.yc;
        }

        public void populate(float startAngle, float startRadius, float factor) {
            this.cs = new ArrayList<CropCircle>();
            float currRad = startRadius;
            float currAngle = startAngle;
            while (currRad > 2) {
                double b = Math
                        .abs(Math.acos(1.0 - currRad * currRad / (2 * this.radius * this.radius)));

                currRad *= factor;
                double g = Math
                        .abs(Math.acos(1.0 - currRad * currRad / (2 * this.radius * this.radius)));
                currAngle -= (b + g);
                this.cs.add(new CropCircle(this.xc + this.radius * (float) Math.cos(currAngle),
                        this.yc - this.radius * (float) Math.sin(currAngle), currRad));
            }
        }

        public void paint(Graphics g) {
            // Graphics2D g2d = (Graphics2D) g.create();
            // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            // RenderingHints.VALUE_ANTIALIAS_ON);
            // g2d.setColor(Color.black);
            // g2d.draw(new Ellipse2D.Double(this.xc - this.radius, this.yc
            // - this.radius, 2 * this.radius, 2 * this.radius));

            if (this.cs != null) {
                for (CropCircle c : this.cs) {
                    c.paint(g);
                }
            }

            // g2d.dispose();
        }

        public java.util.List<CropCircle> getCircles() {
            return Collections.unmodifiableList(this.cs);
        }
    }

    public static class CropPanel extends JPanel {
        CropArc arc1;
        CropArc arc2;
        CropArc arc3;
        CropCircle center;
        CropCircle center1;
        CropCircle center2;
        CropCircle center3;
        float rotation;

        public CropPanel() {
            int xc = 300;
            int yc = 200;
            int rad = 80;

            float x1 = xc;
            float y1 = yc - rad * (float) Math.sin(-Math.PI / 2);

            float x2 = xc + rad * (float) Math.cos(5 * Math.PI / 6);
            float y2 = yc - rad * (float) Math.sin(5 * Math.PI / 6);

            float x3 = xc + rad * (float) Math.cos(Math.PI / 6);
            float y3 = yc - rad * (float) Math.sin(Math.PI / 6);

            this.arc1 = new CropArc(xc, yc, x2, y2, x3, y3);
            this.arc2 = new CropArc(xc, yc, x2, y2, x1, y1);
            this.arc3 = new CropArc(xc, yc, x3, y3, x1, y1);

            this.rotation = 0.0f;

            int startRadius = 46;
            float factor = 0.79f;
            this.arc1.populate((float) (-Math.PI / 2), startRadius, factor);
            this.arc2.populate((float) (Math.PI / 6), startRadius, factor);
            this.arc3.populate((float) (5 * Math.PI / 6), startRadius, factor);

            this.center = new CropCircle(xc, yc, startRadius - 2);

            int smallRadius = 15;
            this.center1 = new CropCircle(this.arc1.getCenterX(), this.arc1.getCenterY(),
                    smallRadius);
            this.center1.setRadius(smallRadius);
            this.center2 = new CropCircle(this.arc2.getCenterX(), this.arc2.getCenterY(),
                    smallRadius);
            this.center2.setRadius(smallRadius);
            this.center3 = new CropCircle(this.arc3.getCenterX(), this.arc3.getCenterY(),
                    smallRadius);
            this.center3.setRadius(smallRadius);
            Timeline pulseCenters = new Timeline();
            pulseCenters.addPropertyToInterpolate(
                    Timeline.<Float>property("opacity").on(this.center1).from(0.0f).to(1.0f));
            pulseCenters.addPropertyToInterpolate(
                    Timeline.<Float>property("opacity").on(this.center2).from(0.0f).to(1.0f));
            pulseCenters.addPropertyToInterpolate(
                    Timeline.<Float>property("opacity").on(this.center3).from(0.0f).to(1.0f));
            pulseCenters.setDuration(750);
            pulseCenters.setEase(new Spline(0.9f));
            pulseCenters.playLoop(RepeatBehavior.REVERSE);

            Timeline rotationTimeline = new SwingComponentTimeline(this);
            rotationTimeline.addPropertyToInterpolate("rotation", 0.0f, (float) (2 * Math.PI));
            rotationTimeline.setDuration(10000);
            rotationTimeline.playLoop(RepeatBehavior.LOOP);

            Timeline repaintTimeline = new SwingRepaintTimeline(this);
            repaintTimeline.playLoop(RepeatBehavior.LOOP);

            getScenario().playLoop();
        }

        private TimelineScenario getScenario() {
            final TimelineScenario.RendezvousSequence showScenario = new TimelineScenario.RendezvousSequence();
            java.util.List<CropCircle> circles1 = this.arc1.getCircles();
            java.util.List<CropCircle> circles2 = this.arc2.getCircles();
            java.util.List<CropCircle> circles3 = this.arc3.getCircles();
            int count = circles1.size();

            for (int i = count - 1; i >= 0; i--) {
                int duration = 200 + (count - i) * 70;

                CropCircle c1 = circles1.get(i);
                Timeline t1 = new Timeline(c1);
                t1.addPropertyToInterpolate("opacity", 0.0f, 1.0f);
                t1.addPropertyToInterpolate("radius", 0.0f, c1.getInitialRadius());
                t1.setDuration(duration);
                t1.setEase(new Spline(0.9f));

                CropCircle c2 = circles2.get(i);
                Timeline t2 = new Timeline(c2);
                t2.addPropertyToInterpolate("opacity", 0.0f, 1.0f);
                t2.addPropertyToInterpolate("radius", 0.0f, c2.getInitialRadius());
                t2.setDuration(duration);
                t2.setEase(new Spline(0.9f));

                CropCircle c3 = circles3.get(i);
                Timeline t3 = new Timeline(c3);
                t3.addPropertyToInterpolate("opacity", 0.0f, 1.0f);
                t3.addPropertyToInterpolate("radius", 0.0f, c3.getInitialRadius());
                t3.setDuration(duration);
                t3.setEase(new Spline(0.9f));

                showScenario.addScenarioActor(t1);
                showScenario.addScenarioActor(t2);
                showScenario.addScenarioActor(t3);

                showScenario.rendezvous();
            }

            Timeline tCenter = new Timeline(this.center);
            tCenter.addPropertyToInterpolate("opacity", 0.0f, 1.0f);
            tCenter.addPropertyToInterpolate("radius", 0.0f, this.center.getInitialRadius());
            tCenter.setDuration(800);
            showScenario.addScenarioActor(tCenter);
            showScenario.rendezvous();

            // fade out all circles after a small delay
            Timeline fadeOut = new Timeline(this);
            fadeOut.addPropertyToInterpolate("opacity", 1.0f, 0.0f);
            fadeOut.setInitialDelay(500);
            showScenario.addScenarioActor(fadeOut);

            // showScenario.addCallback(new TimelineScenarioCallback() {
            // @Override
            // public void onTimelineScenarioDone() {
            // getScenario().play();
            // }
            // });
            return showScenario;
        }

        public void setOpacity(float opacity) {
            for (CropCircle cc : arc1.getCircles())
                cc.setOpacity(opacity);
            for (CropCircle cc : arc2.getCircles())
                cc.setOpacity(opacity);
            for (CropCircle cc : arc3.getCircles())
                cc.setOpacity(opacity);
            center.setOpacity(opacity);
        }

        public void setRotation(float rotation) {
            this.rotation = rotation;
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(new Color(74, 86, 40));
            g.fillRect(0, 0, getWidth(), getHeight());

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(300, 200);
            g2d.rotate(this.rotation);
            g2d.translate(-300, -200);

            this.arc1.paint(g2d);
            this.arc2.paint(g2d);
            this.arc3.paint(g2d);
            this.center.paint(g2d);
            this.center1.paint(g2d);
            this.center2.paint(g2d);
            this.center3.paint(g2d);

            g2d.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame fr = new JFrame();
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            CropPanel panel = new CropPanel();
            panel.setPreferredSize(new Dimension(600, 400));
            fr.add(panel);
            fr.pack();
            fr.setLocationRelativeTo(null);
            fr.setVisible(true);
        });
    }
}
