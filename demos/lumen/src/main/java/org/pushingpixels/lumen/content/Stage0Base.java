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
package org.pushingpixels.lumen.content;

import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.trident.api.Timeline;
import org.pushingpixels.trident.api.swing.SwingRepaintCallback;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

/**
 * The basis of the album scroller container. Provides the functionality of:
 *
 * <ul>
 * <li>Fading in once it becomes a part of the host window hierarchy</li>
 * <li>Dragging the host window with the mouse</li>
 * <li>Painting a rounded translucent background</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
public class Stage0Base extends JComponent {
    static final int TITLE_HEIGHT = 24;

    /**
     * The alpha value for this container. Is updated in the fade-in timeline
     * which starts when this container becomes a part of the host window
     * hierarchy.
     */
    float alpha;

    /**
     * The search string.
     */
    String searchString;

    /**
     * Creates the basic container.
     */
    public Stage0Base() {
        this.setOpaque(false);
        this.alpha = 0.0f;

        // mouse listener for dragging the host window
        MouseAdapter adapter = new MouseAdapter() {
            int lastX;
            int lastY;

            @Override
            public void mousePressed(MouseEvent e) {
                Component source = (Component) e.getSource();

                Point eventLocationOnScreen = e.getLocationOnScreen();
                if (eventLocationOnScreen == null) {
                    eventLocationOnScreen = new Point(e.getX()
                            + source.getLocationOnScreen().x, e.getY()
                            + source.getLocationOnScreen().y);
                }

                lastX = eventLocationOnScreen.x;
                lastY = eventLocationOnScreen.y;
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                Component source = (Component) e.getSource();

                Point eventLocationOnScreen = e.getLocationOnScreen();
                if (eventLocationOnScreen == null) {
                    eventLocationOnScreen = new Point(e.getX()
                            + source.getLocationOnScreen().x, e.getY()
                            + source.getLocationOnScreen().y);
                }

                int dx = eventLocationOnScreen.x - lastX;
                int dy = eventLocationOnScreen.y - lastY;
                Window win = SwingUtilities.getWindowAncestor(Stage0Base.this);
                Point loc = win.getLocation();
                win.setLocation(loc.x + dx, loc.y + dy);
                lastX = eventLocationOnScreen.x;
                lastY = eventLocationOnScreen.y;
            }
        };
        this.addMouseListener(adapter);
        this.addMouseMotionListener(adapter);

        // fade in the container once it's part of the window hierarchy
        this.addHierarchyListener(hierarchyEvent ->
                Timeline.builder(Stage0Base.this)
                        .addPropertyToInterpolate("alpha", 0.0f, 0.9f)
                        .addCallback(new SwingRepaintCallback(Stage0Base.this))
                        .setDuration(500)
                        .play());
    }

    /**
     * Sets the alpha value. Used by the fade-in timeline.
     *
     * @param alpha Alpha value for this container.
     */
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        Shape clip = g2d.getClip();

        g2d.setStroke(new BasicStroke(1.0f));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int radius = 16;

        Shape contour = new RoundRectangle2D.Double(0, 0, getWidth() - 1,
                getHeight() - 1, radius, radius);
        Shape innerContour = new RoundRectangle2D.Double(1, 1, getWidth() - 3,
                getHeight() - 3, radius - 1, radius - 1);

        g2d.setComposite(AlphaComposite.SrcOver.derive(1.0f - (float) Math.pow(
                1.0f - alpha, 3.0)));

        // top part
        g2d.clipRect(0, 0, getWidth(), TITLE_HEIGHT);
        g2d.setPaint(new LinearGradientPaint(0, 0, 0, TITLE_HEIGHT,
                new float[] { 0.0f, 0.49999f, 0.5f, 1.0f }, new Color[] {
                new Color(119, 152, 251), new Color(80, 127, 250),
                new Color(48, 109, 250), new Color(10, 97, 250) }));
        g2d.fill(contour);
        g2d.setPaint(new GradientPaint(0, 0, new Color(151, 179, 253), 0,
                TITLE_HEIGHT, new Color(19, 92, 233)));
        g2d.draw(innerContour);
        g2d.setColor(new Color(11, 61, 200));
        g2d.draw(contour);

        g2d.setClip(clip);

        if (this.searchString != null) {
            g2d.setFont(NeonCortex.getDefaultFontPolicy().getFontSet().getControlFont()
                    .deriveFont(14.0f).deriveFont(Font.BOLD));
            NeonCortex.installDesktopHints(g2d, g2d.getFont());
            int fa = g2d.getFontMetrics().getAscent();
            int x = (getWidth() - g2d.getFontMetrics().stringWidth(this.searchString)) / 2;
            int y = (TITLE_HEIGHT + fa) / 2;
            g2d.setColor(new Color(31, 60, 114));
            g2d.drawString(this.searchString, x, y + 1);
            g2d.setColor(new Color(255, 255, 255));
            g2d.drawString(this.searchString, x, y);
        }

        // bottom part
        g2d.setComposite(AlphaComposite.SrcOver.derive(this.alpha));
        g2d.clipRect(0, TITLE_HEIGHT, getWidth(), getHeight() - TITLE_HEIGHT + 1);

        g2d.setColor(new Color(0, 0, 0));
        g2d.fill(contour);
        g2d.setPaint(new GradientPaint(0, TITLE_HEIGHT, new Color(57, 56, 57),
                0, getHeight() - TITLE_HEIGHT, new Color(50, 48, 50)));
        g2d.draw(innerContour);
        g2d.setPaint(new GradientPaint(0, TITLE_HEIGHT, new Color(13, 11, 15),
                0, getHeight() - TITLE_HEIGHT, new Color(15, 8, 13)));
        g2d.draw(contour);

        // separator
        g2d.setClip(clip);
        g2d.setColor(new Color(12, 11, 12));
        g2d.drawLine(1, TITLE_HEIGHT, getWidth() - 2, TITLE_HEIGHT);

        g2d.dispose();
    }
}
