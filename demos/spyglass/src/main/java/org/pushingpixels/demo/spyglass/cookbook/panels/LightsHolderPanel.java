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
package org.pushingpixels.demo.spyglass.cookbook.panels;

import org.pushingpixels.neon.NeonCortex;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class LightsHolderPanel extends JComponent {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(10, 5);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        float borderStrokeWidth = 1.0f / (float) NeonCortex.getScaleFactor();
        g2d.setStroke(new BasicStroke(borderStrokeWidth));

        LinearGradientPaint lgp = new LinearGradientPaint(0, 0, getWidth(), 0,
                new float[] { 0.0f, 0.5f, 1.0f }, new Color[] { new Color(228, 228, 228),
                                new Color(144, 144, 144), new Color(228, 228, 228) });
        g2d.setPaint(lgp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.setColor(Color.black);
        g2d.draw(new Rectangle2D.Float(0, -2, getWidth() - borderStrokeWidth,
                getHeight() - borderStrokeWidth + 2));

        LinearGradientPaint lgp2 = new LinearGradientPaint(0, 0, getWidth(), 0,
                new float[] { 0.0f, 0.2f, 0.7f, 1.0f },
                new Color[] { new Color(196, 196, 196), new Color(16, 16, 16),
                                new Color(32, 32, 32), new Color(228, 228, 228) });
        g2d.setPaint(lgp2);
        g2d.draw(new Line2D.Float(borderStrokeWidth, getHeight() - borderStrokeWidth,
                getWidth() - 2 * borderStrokeWidth, getHeight() - borderStrokeWidth));

        g2d.dispose();
    }

}
