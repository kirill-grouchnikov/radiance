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
package org.pushingpixels.lumen.details;

import org.pushingpixels.lumen.data.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.util.List;

/**
 * Scrollable viewer for the album track listing.
 *
 * @author Kirill Grouchnikov
 */
public class TrackListingScroller extends JPanel {
    /**
     * The scroller.
     */
    private JScrollPane listingScroller;

    /**
     * The view of the scroller.
     */
    private TrackListing listing;

    /**
     * Creates a new scrollable viewer for the album track listing.
     */
    public TrackListingScroller() {
        this.setLayout(new BorderLayout());

        // create the listing panel
        this.listing = new TrackListing();

        // create the scroll pane
        this.listingScroller = new JScrollPane(this.listing,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER) {
            @Override
            protected void paintComponent(Graphics g) {
                // custom painting for the scroll pane (rounded double border)
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                int w = getWidth();
                int h = getHeight();

                g2d.setColor(new Color(32, 32, 32));
                g2d.fillRoundRect(-4, 0, w + 3, h - 1, 4, 4);

                g2d.setColor(Color.white);
                g2d.setStroke(new BasicStroke(2.0f));
                g2d.drawRoundRect(-3, 1, w + 1, h - 3, 3, 3);
                g2d.setColor(new Color(128, 128, 128));
                g2d.setStroke(new BasicStroke(1.0f));
                g2d.drawRoundRect(-2, 0, w + 1, h - 1, 4, 4);

                g2d.dispose();
            }
        };
        this.listingScroller.setBorder(new EmptyBorder(3, 0, 3, 6));
        this.add(this.listingScroller, BorderLayout.CENTER);

        // mark scroll pane and related containers as non-opaque for nicer
        // visuals
        this.listingScroller.setOpaque(false);
        this.listingScroller.getViewport().setOpaque(false);
        this.setOpaque(false);

        // set custom UI delegate on the scroll bar.
        this.listingScroller.getVerticalScrollBar().setUI(
                new BasicScrollBarUI() {
                    @Override
                    protected JButton createDecreaseButton(int orientation) {
                        // decrease button will not show
                        JButton result = super
                                .createDecreaseButton(orientation);
                        result.setPreferredSize(new Dimension(0, 0));
                        result.setVisible(false);
                        return result;
                    }

                    @Override
                    protected JButton createIncreaseButton(int orientation) {
                        // increase button will not show
                        JButton result = super
                                .createIncreaseButton(orientation);
                        result.setPreferredSize(new Dimension(0, 0));
                        result.setVisible(false);
                        return result;
                    }

                    @Override
                    protected void paintThumb(Graphics g, JComponent c,
                            Rectangle thumbBounds) {
                        // custom thumb appearance
                        Graphics2D g2d = (Graphics2D) g.create();
                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);

                        Shape shape = new RoundRectangle2D.Double(
                                thumbBounds.x + 3, thumbBounds.y + 3,
                                thumbBounds.width - 7, thumbBounds.height - 7,
                                thumbBounds.width - 6, thumbBounds.width - 6);

                        g2d.setPaint(new Color(128, 128, 128));
                        g2d.fill(shape);
                        g2d.draw(shape);

                        g2d.dispose();
                    }

                    @Override
                    protected void paintTrack(Graphics g, JComponent c,
                            Rectangle trackBounds) {
                        // custom track appearance
                        Graphics2D g2d = (Graphics2D) g.create();
                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                RenderingHints.VALUE_ANTIALIAS_ON);

                        Shape shape = new RoundRectangle2D.Double(
                                trackBounds.x, trackBounds.y,
                                trackBounds.width - 1, trackBounds.height - 1,
                                trackBounds.width, trackBounds.width);

                        g2d.setPaint(new Color(71, 71, 71));
                        g2d.fill(shape);
                        g2d.draw(shape);

                        g2d.dispose();
                    }
                });
        this.listingScroller.getVerticalScrollBar().setOpaque(false);

        this.listingScroller.setLayout(new ScrollPaneLayout() {
            @Override
            public void layoutContainer(Container parent) {
                // make the vertical scroll bar 12 pixels wide
                int vScrollBarWidth = 12;
                Insets ins = parent.getInsets();
                int w = parent.getWidth();
                int h = parent.getHeight();
                viewport.setBounds(ins.left, ins.top, w - ins.left - ins.right
                        - vScrollBarWidth, h - ins.top - ins.bottom);
                vsb.setBounds(w - ins.right - vScrollBarWidth, ins.top,
                        vScrollBarWidth, h - ins.top - ins.bottom);
            }
        });
    }

    /**
     * Sets the specified album item for the track display.
     *
     * @param album  Album item.
     * @param tracks Album tracks.
     */
    public void setAlbumItem(SearchResultRelease album, List<Track> tracks) {
        this.listingScroller.getVerticalScrollBar().setValue(0);
        this.listing.setAlbum(album, tracks);
    }
}
