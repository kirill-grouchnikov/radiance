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

import org.pushingpixels.trident.Timeline.RepeatBehavior;
import org.pushingpixels.trident.TridentConfig;
import org.pushingpixels.trident.ease.Sine;
import org.pushingpixels.trident.interpolator.PropertyInterpolator;
import org.pushingpixels.trident.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CustomPropertyInterpolatorSource extends JFrame {
    private Ellipse2D ellipse;

    private static class Ellipse2DPropertyInterpolator implements PropertyInterpolator<Ellipse2D> {
        public Class getBasePropertyClass() {
            return Ellipse2D.class;
        }

        @Override
        public Ellipse2D interpolate(Ellipse2D from, Ellipse2D to, float timelinePosition) {
            double x = from.getX() + timelinePosition * (to.getX() - from.getX());
            double y = from.getY() + timelinePosition * (to.getY() - from.getY());
            double w = from.getWidth() + timelinePosition * (to.getWidth() - from.getWidth());
            double h = from.getHeight() + timelinePosition * (to.getHeight() - from.getHeight());
            return new Ellipse2D.Double(x, y, w, h);
        }
    }

    public CustomPropertyInterpolatorSource() {
        TridentConfig.getInstance().addPropertyInterpolator(new Ellipse2DPropertyInterpolator());

        Ellipse2D from = new Ellipse2D.Double(10, 10, 100, 50);
        Ellipse2D to = new Ellipse2D.Double(40, 40, 200, 120);
        this.ellipse = (Ellipse2D) from.clone();
        JPanel ellipsePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.red);
                g2d.fill(ellipse);

                g2d.dispose();
            }
        };
        ellipsePanel.setBackground(Color.black);

        SwingComponentTimeline.componentBuilder(this)
                .addPropertyToInterpolate("ellipse", from, to)
                .setEase(new Sine())
                .setDuration(2000)
                .playLoop(RepeatBehavior.REVERSE);

        SwingRepaintTimeline.repaintBuilder(ellipsePanel).playLoop(RepeatBehavior.LOOP);

        this.add(ellipsePanel);

        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setEllipse(Ellipse2D ellipse) {
        this.ellipse = ellipse;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CustomPropertyInterpolatorSource().setVisible(true));
    }
}
