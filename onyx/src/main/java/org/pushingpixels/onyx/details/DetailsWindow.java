/*
 * Copyright (c) 2009-2018 Onyx Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Onyx Kirill Grouchnikov nor the names of
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
package org.pushingpixels.onyx.details;

import org.pushingpixels.onyx.BackendConnector;
import org.pushingpixels.onyx.data.*;
import org.pushingpixels.trident.*;
import org.pushingpixels.trident.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Shows the details of the selected album, including bigger album art and a
 * scrollable list of album tracks.
 *
 * @author Kirill Grouchnikov
 */
public class DetailsWindow extends JWindow {
    /**
     * Component that shows the album art.
     */
    private BigAlbumArt albumArt;

    /**
     * Component that shows the scrollable list of album tracks.
     */
    private TrackListingScroller trackListingScroller;

    /**
     * The scenario that is transitioning to the last selected album item.
     */
    private TimelineScenario currentShowAlbumDetailsScenario;

    /**
     * 0.0f - the album art and track listing are completely overlayed, 1.0f -
     * the album art and track listing are completely separate. Is updated in
     * the {@link #currentShowAlbumDetailsScenario}.
     */
    private float overlayPosition;

    /**
     * Creates a new details window.
     */
    public DetailsWindow() {
        this.setSize(2 * BigAlbumArt.TOTAL_DIM, BigAlbumArt.TOTAL_DIM);
        this.overlayPosition = 0.0f;

        this.albumArt = new BigAlbumArt();
        this.trackListingScroller = new TrackListingScroller();

        Container contentPane = this.getContentPane();
        contentPane.setLayout(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return null;
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                return null;
            }

            @Override
            public void layoutContainer(Container parent) {
                int w = parent.getWidth();
                int h = parent.getHeight();

                // respect the current overlay position to implement the sliding
                // effect in steps 1 and 6 of currentShowAlbumDetailsScenario
                int dim = BigAlbumArt.TOTAL_DIM;
                int dx = (int) (overlayPosition * dim / 2);
                albumArt.setBounds((w - dim) / 2 - dx, (h - dim) / 2, dim, dim);
                trackListingScroller.setBounds((w - dim) / 2 + dx,
                        (h - dim) / 2 + 2, dim, dim - 4);
            }
        });
        contentPane.add(albumArt);
        contentPane.add(trackListingScroller);

        contentPane.setComponentZOrder(trackListingScroller, 1);
        contentPane.setComponentZOrder(albumArt, 0);
    }

    /**
     * Signals that details of the specified album item should be displayed in
     * this window. Note that this window can already display another album item
     * when this method is called.
     *
     * @param albumItem New album item to show in this window.
     */
    public void setAlbum(Album albumItem) {
        if (this.currentShowAlbumDetailsScenario != null)
            this.currentShowAlbumDetailsScenario.cancel();

        this.currentShowAlbumDetailsScenario = this.getShowAlbumDetailsScenario(albumItem);
        this.currentShowAlbumDetailsScenario.play();
    }

    /**
     * Sets the new overlay position of the album art and track listing. This
     * method will also cause revalidation of the main window content pane.
     *
     * @param overlayPosition The new overlay position of the album art and track listing.
     */
    public void setOverlayPosition(float overlayPosition) {
        this.overlayPosition = overlayPosition;
        this.getContentPane().invalidate();
        this.getContentPane().validate();
    }

    /**
     * Returns the timeline scenario that implements a transition from the
     * currently shown album item (which may be <code>null</code>) to the
     * specified album item.
     *
     * @param album The new album item to be shown in this window.
     * @return The timeline scenario that implements a transition from the
     * currently shown album item (which may be <code>null</code>) to
     * the specified album item.
     */
    private TimelineScenario getShowAlbumDetailsScenario(final Album album) {
        TimelineScenario.RendezvousSequence scenario = new TimelineScenario.RendezvousSequence();

        // step 1 - move album art and track listing to the same location
        Timeline collapseArtAndTracks = new Timeline(this);
        collapseArtAndTracks.addPropertyToInterpolate("overlayPosition",
                this.overlayPosition, 0.0f);
        collapseArtAndTracks.setDuration((int) (500 * this.overlayPosition));
        scenario.addScenarioActor(collapseArtAndTracks);

        // step 2 (in parallel) - load the new album art
        final BufferedImage[] albumArtHolder = new BufferedImage[1];
        TimelineSwingWorker<Void, Void> loadNewAlbumArt = new TimelineSwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                albumArtHolder[0] = BackendConnector.getLargeAlbumArt(album.asin);
                return null;
            }
        };
        scenario.addScenarioActor(loadNewAlbumArt);

        // step 3 (in parallel) - load the track listing
        final java.util.List<Track> tracks = new ArrayList<>();
        TimelineSwingWorker<Void, Void> loadNewAlbumTrackList =
                new TimelineSwingWorker<Void, Void>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        tracks.addAll(BackendConnector.doTrackSearch(album.releaseID));
                        return null;
                    }
                };
        scenario.addScenarioActor(loadNewAlbumTrackList);
        scenario.rendezvous();

        // step 4 (wait for steps 1-3) - replace album art
        TimelineRunnable replaceAlbumArt = new TimelineRunnable() {
            @Override
            public void run() {
                albumArt.setAlbumArtImage(albumArtHolder[0]);
            }
        };
        scenario.addScenarioActor(replaceAlbumArt);

        // step 5 (in parallel) - replace the track listing
        TimelineRunnable replaceTrackListing = new TimelineRunnable() {
            @Override
            public void run() {
                trackListingScroller.setAlbumItem(album, tracks);
            }
        };
        scenario.addScenarioActor(replaceTrackListing);
        scenario.rendezvous();

        // step 6 (wait for steps 4 and 5) - cross fade album art from old to new
        Timeline albumArtCrossfadeTimeline = new Timeline(this.albumArt);
        albumArtCrossfadeTimeline.addPropertyToInterpolate("oldImageAlpha", 1.0f, 0.0f);
        albumArtCrossfadeTimeline.addPropertyToInterpolate("imageAlpha", 0.0f, 1.0f);
        albumArtCrossfadeTimeline.addCallback(new SwingRepaintCallback(this.albumArt));
        albumArtCrossfadeTimeline.setDuration(400);

        scenario.addScenarioActor(albumArtCrossfadeTimeline);
        scenario.rendezvous();

        // step 7 (wait for step 6) - move new album art and track listing to
        // be side by side.
        Timeline separateArtAndTracks = new Timeline(this);
        separateArtAndTracks.addPropertyToInterpolate("overlayPosition", 0.0f, 1.0f);
        separateArtAndTracks.setDuration(500);
        scenario.addScenarioActor(separateArtAndTracks);

        return scenario;
    }
}
