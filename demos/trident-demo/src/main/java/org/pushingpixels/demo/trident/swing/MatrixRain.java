/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.trident.*;
import org.pushingpixels.trident.Timeline.RepeatBehavior;
import org.pushingpixels.trident.swing.SwingRepaintTimeline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.InputStream;
import java.util.List;
import java.util.*;

public class MatrixRain {
    private static Font font;

    public static class Letter {
        private int x;

        private int y;

        private Color color;

        private float opacity;

        private char c;

        public Letter(int x, int y, char c) {
            this.x = x;
            this.y = y;
            this.c = c;
            this.color = Color.white;
            this.opacity = 0.0f;
        }

        public void setOpacity(float opacity) {
            this.opacity = opacity;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public void paint(Graphics g) {
            if (this.opacity == 0.0f)
                return;

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                    RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g2d.setFont(font);
            g2d.setColor(this.color);
            g2d.setComposite(AlphaComposite.SrcOver.derive(this.opacity));
            g2d.drawString("" + this.c, this.x, this.y);

            g2d.dispose();
        }
    }

    public static class Drop {
        private List<Letter> letters;

        public Drop() {
            this.letters = new ArrayList<Letter>();
        }

        public TimelineScenario getScenario(int x) {
            TimelineScenario result = new TimelineScenario.Parallel();
            Random randomizer = new Random();
            // how many letters will there be?
            int totalLetterCount = 5 + randomizer.nextInt(20);
            int initialDelay = randomizer.nextInt(1000);
            int duration = 1000 + randomizer.nextInt(100);
            for (int i = 0; i < totalLetterCount; i++) {
                int y = font.getSize() * i;
                // choose random katakana letter
                // int letterIndex = (int) (0x30A0 + Math.random()
                // * (0x30FF - 0x30A0));
                int start = 33;
                int delta = 95;
                char c = (char) (start + Math.random() * delta);
                Letter l = new Letter(x, y, c);
                this.letters.add(l);
                Timeline t = Timeline.builder(l)
                        .addPropertyToInterpolate("opacity", 1.0f, 0.0f)
                        .addPropertyToInterpolate("color", Color.white, Color.green)
                        .setDuration(duration)
                        .setInitialDelay(initialDelay + i * 120)
                        .build();
                result.addScenarioActor(t);
            }
            return result;
        }

        public void paint(Graphics g) {
            for (Letter l : this.letters)
                l.paint(g);
        }

    }

    private static class MatrixPanel extends JPanel {
        private List<Drop> drops;

        public MatrixPanel() {
            try {
                InputStream is = MatrixRain.class.getClassLoader().getResourceAsStream(
                        "fonts/katakana.ttf");
                Font kf = Font.createFont(Font.TRUETYPE_FONT, is);
                int fontSize = 14;
                font = kf.deriveFont(Font.BOLD, fontSize);
            } catch (Exception exc) {
                exc.printStackTrace();
            }

            SwingRepaintTimeline.repaintBuilder(this).playLoop(RepeatBehavior.LOOP);

            this.drops = new ArrayList<>();
            this.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    while (drops.size() < 40)
                        addDrop();
                }
            });
        }

        private synchronized void addDrop() {
            final Drop drop = new Drop();
            TimelineScenario scenario = drop.getScenario(new Random().nextInt(getWidth()));
            scenario.addCallback(() -> {
                synchronized (MatrixPanel.this) {
                    drops.remove(drop);
                    addDrop();
                }
            });
            this.drops.add(drop);
            scenario.play();
        }

        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.black);
            g.fillRect(0, 0, getWidth(), getHeight());

            synchronized (this) {
                for (Drop drop : this.drops)
                    drop.paint(g);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame fr = new JFrame("Matrix rain");
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            MatrixPanel panel = new MatrixPanel();
            panel.setPreferredSize(new Dimension(400, 300));
            fr.add(panel);
            fr.pack();
            fr.setLocationRelativeTo(null);
            fr.setVisible(true);
        });
    }
}
