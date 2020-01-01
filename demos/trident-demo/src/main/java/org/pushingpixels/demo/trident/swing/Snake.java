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
import org.pushingpixels.trident.api.swing.SwingRepaintTimeline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Snake {
    public static class SnakePanelRectangle {
        private Color backgroundColor;

        private boolean isRollover;

        private Timeline rolloverTimeline;

        private SwingRepaintTimeline repaintTimeline;

        public SnakePanelRectangle(SwingRepaintTimeline repaintTimeline) {
            this.backgroundColor = Color.black;
            this.isRollover = false;

            this.rolloverTimeline = Timeline.builder(this)
                    .addPropertyToInterpolate("backgroundColor", Color.yellow, Color.black)
                    .setDuration(2500)
                    .build();

            this.repaintTimeline = repaintTimeline;
        }

        public void setRollover(boolean isRollover) {
            if (this.isRollover == isRollover)
                return;
            this.isRollover = isRollover;
            if (this.isRollover) {
                this.rolloverTimeline.replay();
            }
        }

        public void setBackgroundColor(Color backgroundColor) {
            this.backgroundColor = backgroundColor;
            this.repaintTimeline.forceRepaintOnNextPulse();
        }

        public Color getBackgroundColor() {
            return backgroundColor;
        }
    }

    private static class SnakePanel extends JPanel {

        private SnakePanelRectangle[][] grid;

        private int ROWS = 10;

        private int COLUMNS = 20;

        private int DIM = 20;

        public SnakePanel() {
            SwingRepaintTimeline repaintTimeline = SwingRepaintTimeline.repaintBuilder(this)
                    .setAutoRepaintMode(false).build();

            this.grid = new SnakePanelRectangle[COLUMNS][ROWS];
            for (int i = 0; i < COLUMNS; i++) {
                for (int j = 0; j < ROWS; j++) {
                    this.grid[i][j] = new SnakePanelRectangle(repaintTimeline);
                }
            }
            this.setPreferredSize(new Dimension(COLUMNS * (DIM + 1), ROWS * (DIM + 1)));

            repaintTimeline.playLoop(RepeatBehavior.LOOP);

            this.addMouseMotionListener(new MouseMotionAdapter() {
                int rowOld = -1;
                int colOld = -1;

                @Override
                public void mouseMoved(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();

                    int column = x / (DIM + 1);
                    int row = y / (DIM + 1);

                    if ((column != colOld) || (row != rowOld)) {
                        if ((colOld >= 0) && (rowOld >= 0))
                            grid[colOld][rowOld].setRollover(false);
                        grid[column][row].setRollover(true);
                    }
                    colOld = column;
                    rowOld = row;
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();

            g2d.setColor(Color.black);
            g2d.fillRect(0, 0, getWidth(), getHeight());

            for (int i = 0; i < COLUMNS; i++) {
                for (int j = 0; j < ROWS; j++) {
                    SnakePanelRectangle rect = this.grid[i][j];
                    Color backgr = rect.getBackgroundColor();

                    if (!Color.black.equals(backgr)) {
                        g2d.setColor(backgr);
                        g2d.fillRect(i * (DIM + 1), j * (DIM + 1), DIM, DIM);
                    }
                }
            }

            g2d.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Snake");
            frame.add(new SnakePanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
