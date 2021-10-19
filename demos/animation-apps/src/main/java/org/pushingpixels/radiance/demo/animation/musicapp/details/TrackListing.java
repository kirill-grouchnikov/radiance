/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.animation.musicapp.details;

import org.pushingpixels.radiance.demo.animation.musicapp.MusicAppUtils;
import org.pushingpixels.radiance.demo.animation.musicapp.data.SearchResultRelease;
import org.pushingpixels.radiance.demo.animation.musicapp.data.Track;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Component for showing track listing of a single album item from Amazon.
 *
 * @author Kirill Grouchnikov
 */
public class TrackListing extends JPanel implements Scrollable {
    /**
     * The album item.
     */
    private SearchResultRelease album;

    /**
     * Album performer.
     */
    private String artist;

    /**
     * The title of the album.
     */
    private String albumTitle;

    /**
     * The release date of the album.
     */
    private String released;

    /**
     * List of the album tracks.
     */
    private List<Track> tracks;

    /**
     * Creates a new component that shows a list of all album tracks.
     */
    public TrackListing() {
        this.setOpaque(false);
        this.setBorder(new EmptyBorder(6, 6, 6, 6));
    }

    /**
     * Sets the specified album item for the track display.
     *
     * @param album  Album item.
     * @param tracks Album tracks.
     */
    public void setAlbum(SearchResultRelease album, List<Track> tracks) {
        this.album = album;
        this.artist = this.album.artist;
        this.albumTitle = "\"" + this.album.title + "\"";
        this.released = "Released " + this.album.date;
        this.tracks = Collections.unmodifiableList(tracks);

        this.revalidate();
        this.getParent().invalidate();
        this.getParent().validate();
    }

    @Override
    public Dimension getPreferredSize() {
        if (this.album == null) {
            return super.getPreferredSize();
        }

        if (this.getWidth() < 0) {
            return super.getPreferredSize();
        }

        Font controlFont = RadianceCommonCortex.getDefaultFontPolicy().getFontSet().getControlFont();
        Font keyFont = controlFont.deriveFont(15.0f);
        Font detailsFont = controlFont.deriveFont(13.0f);

        Insets ins = this.getInsets();
        int width = getWidth() - ins.left - ins.right;

        float keyFontHeight = keyFont.getLineMetrics(this.artist,
                new FontRenderContext(new AffineTransform(), false, false)).getHeight();
        float detailsFontHeight = detailsFont.getLineMetrics(this.artist,
                new FontRenderContext(new AffineTransform(), false, false)).getHeight();

        float height = ins.top + keyFontHeight;
        // performers
        height += MusicAppUtils.getMultilineTextHeight(keyFont, this.artist, width);
        height += keyFontHeight / 3;
        // title
        height += MusicAppUtils.getMultilineTextHeight(keyFont, this.albumTitle, width);
        height += keyFontHeight / 3;
        // release date
        height += MusicAppUtils.getMultilineTextHeight(detailsFont, this.released, width);
        height += detailsFontHeight / 2;

        // tracks
        height += detailsFontHeight / 2;
        for (Track track : this.tracks) {
            height += MusicAppUtils.getMultilineTextHeight(detailsFont, track.title, width);
            height += detailsFontHeight / 2;
        }

        height += ins.bottom;

        return new Dimension(getWidth(), (int) height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.artist == null) {
            return;
        }

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        Font controlFont = RadianceCommonCortex.getDefaultFontPolicy().getFontSet().getControlFont();
        Font keyFont = controlFont.deriveFont(15.0f);
        Font detailsFont = controlFont.deriveFont(13.0f);
        g2d.setFont(keyFont);
        float keyFontHeight = keyFont.getLineMetrics(this.artist,
                new FontRenderContext(new AffineTransform(), false, false)).getHeight();
        float detailsFontHeight = detailsFont.getLineMetrics(this.artist,
                new FontRenderContext(new AffineTransform(), false, false)).getHeight();

        Insets ins = getInsets();
        int width = getWidth() - ins.left - ins.right;
        if (this.album != null) {
            int headerHeight = ins.top + (int) keyFontHeight;
            // performer
            headerHeight += MusicAppUtils.getMultilineTextHeight(keyFont.deriveFont(Font.BOLD),
                    this.artist, width);
            headerHeight += keyFontHeight / 3;
            // title
            headerHeight += MusicAppUtils.getMultilineTextHeight(keyFont, this.albumTitle, width);
            headerHeight += keyFontHeight / 3;
            // release date
            headerHeight += MusicAppUtils.getMultilineTextHeight(detailsFont, this.released, width);
            headerHeight -= detailsFontHeight / 3;
            headerHeight--;

            g2d.setColor(Color.black);
            g2d.fillRect(0, 0, getWidth(), headerHeight);

            int x = ins.left;

            g2d.setFont(keyFont);
            g2d.setColor(Color.white);
            int y = ins.top + (int) keyFontHeight;

            g2d.setFont(keyFont.deriveFont(Font.BOLD));
            y = MusicAppUtils.paintMultilineText(g2d, this.artist, x, width, y, -1);
            y += keyFontHeight / 3;
            g2d.setFont(keyFont);
            y = MusicAppUtils.paintMultilineText(g2d, this.albumTitle, x, width, y, -1);
            y += keyFontHeight / 3;
            g2d.setColor(new Color(64, 140, 255));
            g2d.setFont(detailsFont);
            y = MusicAppUtils.paintMultilineText(g2d, this.released, x, width, y, -1);
            y += detailsFontHeight / 3;

            // tracks
            y += detailsFontHeight / 2;
            double borderThickness = 1.0f / RadianceCommonCortex.getScaleFactor(this);
            for (Track track : tracks) {
                g2d.setColor(new Color(44, 44, 44));
                float topY = y - (int) detailsFontHeight + 2;
                g2d.draw(new Line2D.Float(x + 5, topY, width - 10, topY));
                g2d.setColor(new Color(35, 35, 35));
                float bottomY = y - (int) detailsFontHeight + 3 - (float) borderThickness;
                g2d.draw(new Line2D.Float(x + 5, bottomY, width - 10, bottomY));

                y += 4;
                g2d.setColor(new Color(192, 192, 192));
                y = MusicAppUtils.paintMultilineText(g2d, track.title, x, width, y, -1);
                y += detailsFontHeight / 2;
            }
        }

        g2d.dispose();
    }

    public Dimension getPreferredScrollableViewportSize() {
        return this.getPreferredSize();
    }

    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 30;
    }

    public boolean getScrollableTracksViewportHeight() {
        return false;
    }

    public boolean getScrollableTracksViewportWidth() {
        return true;
    }

    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 10;
    }

    /**
     * Information on a single disc.
     *
     * @author Kirill Grouchnikov
     */
    private static class DiscInfo {
        /**
         * Disc caption.
         */
        private String caption;

        /**
         * Disc tracks.
         */
        private List<String> tracks = new ArrayList<String>();
    }
}
