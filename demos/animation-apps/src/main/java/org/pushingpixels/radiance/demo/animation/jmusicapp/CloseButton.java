/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.animation.jmusicapp;

import org.pushingpixels.radiance.demo.animation.jmusicapp.details.DetailsWindowManager;
import org.pushingpixels.radiance.animation.api.Timeline;
import org.pushingpixels.radiance.animation.api.swing.SwingRepaintCallback;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

/**
 * The close button of the Music demo.
 *
 * @author Kirill Grouchnikov
 */
public class CloseButton extends JButton {
    /**
     * The alpha value of this button. Is updated in the fade-in timeline which
     * starts when this button becomes a part of the host window hierarchy.
     */
    float alpha;

    /**
     * Creates a new close button.
     */
    public CloseButton() {
        // mark the button as non-opaque since it will be
        // round shaped and translucent
        this.setOpaque(false);
        this.setForeground(new Color(158, 205, 255));
        this.alpha = 0.0f;

        this.addActionListener(actionEvent -> {
            SwingUtilities.invokeLater(() -> {
                // dispose the host window
                Window windowAncestor = SwingUtilities.getWindowAncestor(CloseButton.this);
                MusicAppUtils.fadeOutAndDispose(windowAncestor, 500);
                DetailsWindowManager.disposeCurrentlyShowing();
            });
        });

        // timeline for the rollover effect (interpolating the button's foreground color)
        final Timeline rolloverTimeline = Timeline.builder(this)
                .addPropertyToInterpolate("foreground", new Color(158, 205, 255),
                        new Color(64, 140, 255))
                .setDuration(200)
                .build();

        // and register a mouse listener to play the rollover
        // timeline
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                rolloverTimeline.play();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                rolloverTimeline.playReverse();
            }
        });

        // fade in the component once it's part of the window hierarchy
        this.addHierarchyListener(hierarchyEvent -> Timeline.builder(CloseButton.this)
                .addPropertyToInterpolate("alpha", 0.0f, 1.0f)
                .addCallback(new SwingRepaintCallback(CloseButton.this))
                .setDuration(500)
                .play());
    }

    /**
     * Sets the alpha value. Used by the fade-in timeline.
     *
     * @param alpha Alpha value for this button.
     */
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    @Override
    protected void paintBorder(Graphics g) {
        // overriden to remove the default border painting
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // use the current alpha
        g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));

        // paint the background - black fill and a dark outline
        // based on the current foreground color
        Shape contour = new Ellipse2D.Double(1, 1, getWidth() - 3, getHeight() - 3);
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2.0f));
        g2d.fill(contour);
        g2d.setColor(this.getForeground().darker().darker());
        g2d.draw(contour);

        // paint the outer cross (always white)
        g2d.setColor(Color.white);
        g2d.setStroke(new BasicStroke(6.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        int offset = getWidth() / 3;
        g2d.drawLine(offset, offset, getWidth() - offset - 1, getHeight() - offset - 1);
        g2d.drawLine(getWidth() - offset - 1, offset, offset, getHeight() - offset - 1);

        // paint the inner cross (using the current foreground color)
        g2d.setColor(this.getForeground());
        g2d.setStroke(new BasicStroke(4.2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawLine(offset, offset, getWidth() - offset - 1, getHeight() - offset - 1);
        g2d.drawLine(getWidth() - offset - 1, offset, offset, getHeight() - offset - 1);

        g2d.dispose();
    }
}
