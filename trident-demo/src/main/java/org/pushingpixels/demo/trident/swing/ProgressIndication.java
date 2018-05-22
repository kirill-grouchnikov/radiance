/*
 * Copyright (c) 2005-2018 Trident Kirill Grouchnikov. All Rights Reserved.
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
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.pushingpixels.trident.Timeline;
import org.pushingpixels.trident.Timeline.RepeatBehavior;
import org.pushingpixels.trident.interpolator.KeyFrames;
import org.pushingpixels.trident.interpolator.KeyTimes;
import org.pushingpixels.trident.interpolator.KeyValues;
import org.pushingpixels.trident.swing.SwingRepaintTimeline;

public class ProgressIndication extends JFrame {
    public static class ProgressPanel extends JPanel {
        private static final int INNER_HEIGHT = 60;

        private static final int INNER_WIDTH = 300;

        private static final int HIGHLIGHTER_HEIGHT = 2;

        private static final int HIGHLIGHTER_WIDTH = 58;

        private int xPosition;

        private float alpha;

        private boolean started;

        private Timeline progressTimeline;

        public ProgressPanel() {
            this.xPosition = 0;
            this.alpha = 0;

            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (started)
                        return;

                    start();
                    started = true;
                }
            });

            this.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    if (started) {
                        progressTimeline.cancel();
                        start();
                    }
                }
            });

            new SwingRepaintTimeline(this).playLoop(RepeatBehavior.LOOP);
        }

        public void start() {
            progressTimeline = new Timeline(this);

            int startX = (getWidth() - INNER_WIDTH) / 2 + 18 + HIGHLIGHTER_WIDTH / 2;
            int endX = (getWidth() + INNER_WIDTH) / 2 - 18 - HIGHLIGHTER_WIDTH / 2;
            progressTimeline.addPropertyToInterpolate("xPosition", startX, endX);

            KeyValues<Float> alphaValues = KeyValues.create(0.0f, 1.0f, 1.0f, 0.0f);
            KeyTimes alphaTimes = new KeyTimes(0.0f, 0.3f, 0.7f, 1.0f);
            progressTimeline.addPropertyToInterpolate("alpha",
                    new KeyFrames<Float>(alphaValues, alphaTimes));

            progressTimeline.setDuration(1500);
            progressTimeline.playLoop(RepeatBehavior.LOOP);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            int w = getWidth();
            int h = getHeight();

            // Full background
            g2d.setColor(new Color(12, 12, 12));
            g2d.fillRect(0, 0, w, h);

            if (!started) {
                g2d.setColor(Color.white);
                g2d.setFont(new Font("Tahoma", Font.PLAIN, 18));
                String caption = "Click to start";
                g2d.drawString(caption, (w - g2d.getFontMetrics().stringWidth(caption)) / 2, h / 3);
            }

            // Inner gradient fill
            Shape innerContour = new RoundRectangle2D.Double((w - INNER_WIDTH) / 2.0,
                    (h - INNER_HEIGHT) / 2.0, INNER_WIDTH, INNER_HEIGHT, 10, 10);
            g2d.setPaint(new GradientPaint((w - INNER_WIDTH) / 2.0f, (h - INNER_HEIGHT) / 2.0f,
                    new Color(47, 47, 47), (w - INNER_WIDTH) / 2.0f, (h + INNER_HEIGHT) / 2.0f,
                    Color.black));
            g2d.fill(innerContour);

            // Inner contour
            g2d.setColor(new Color(67, 67, 67));
            g2d.draw(innerContour);

            // Progress track
            int trackWidth = INNER_WIDTH - 36;
            int trackHeight = 1;
            g2d.setColor(new Color(91, 91, 91));
            for (int i = 2; i >= 0; i--) {
                Shape trackContour = new RoundRectangle2D.Double((w - INNER_WIDTH) / 2 + 18 - i,
                        h / 2 - i - 1, trackWidth + i * 2, trackHeight + i * 2, 2 * i, 2 * i);
                float alpha = 1.0f;
                if (i == 1)
                    alpha = 0.3f;
                if (i == 2)
                    alpha = 0.1f;
                g2d.setComposite(AlphaComposite.SrcOver.derive(alpha));
                g2d.draw(trackContour);
            }

            // Highlighter
            g2d.setColor(new Color(13, 106, 206));
            g2d.setComposite(AlphaComposite.SrcOver.derive(0.1f * this.alpha));
            for (int i = 6; i >= 0; i--) {
                g2d.fillOval(this.xPosition - HIGHLIGHTER_WIDTH / 2 - i,
                        h / 2 - HIGHLIGHTER_HEIGHT / 2 - i, HIGHLIGHTER_WIDTH + 2 * i,
                        HIGHLIGHTER_HEIGHT + 2 * i);
            }

            // Highlighter on track
            g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));
            g2d.setColor(new Color(136, 182, 231));
            g2d.fillRect(this.xPosition - 28, h / 2 - 1, 56, 2);

            g2d.dispose();
        }

        public void setXPosition(int position) {
            xPosition = position;
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
        }
    }

    public ProgressIndication() {
        super("Swing progress");

        this.add(new ProgressPanel());

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProgressIndication().setVisible(true));
    }

}
