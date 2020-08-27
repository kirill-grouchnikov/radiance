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
package org.pushingpixels.lucent.details

import org.pushingpixels.lucent.BackendConnector
import org.pushingpixels.lucent.data.SearchResultRelease
import org.pushingpixels.lucent.data.Track
import org.pushingpixels.meteor.awt.MeteorLayoutManager
import org.pushingpixels.torch.componentTimeline
import org.pushingpixels.torch.from
import org.pushingpixels.torch.fromCurrentTo
import org.pushingpixels.trident.api.TimelineRunnable
import org.pushingpixels.trident.api.TimelineScenario
import org.pushingpixels.trident.api.swing.TimelineSwingWorker
import java.awt.image.BufferedImage
import java.util.*
import javax.swing.JWindow

/**
 * Shows the details of the selected album, including bigger album art and a
 * scrollable list of album tracks.
 *
 * @author Kirill Grouchnikov
 */
class DetailsWindow : JWindow() {
    /**
     * Component that shows the album art.
     */
    private val albumArt: BigAlbumArt

    /**
     * Component that shows the scrollable list of album tracks.
     */
    private val trackListingScroller: TrackListingScroller

    /**
     * The scenario that is transitioning to the last selected album item.
     */
    private var currentShowAlbumDetailsScenario: TimelineScenario? = null

    /**
     * 0.0f - the album art and track listing are completely overlayed, 1.0f -
     * the album art and track listing are completely separate. Is updated in
     * the [.currentShowAlbumDetailsScenario].
     */
    var overlayPosition: Float = 0.0f
        set(value) {
            field = value
            contentPane.invalidate()
            contentPane.validate()
        }

    /**
     * Creates a new details window.
     */
    init {
        this.setSize(2 * BigAlbumArt.TOTAL_DIM, BigAlbumArt.TOTAL_DIM)

        this.albumArt = BigAlbumArt()
        this.trackListingScroller = TrackListingScroller()

        val contentPane = this.contentPane
        contentPane.layout = MeteorLayoutManager(
                onLayout = { parent ->
                    val w = parent.width
                    val h = parent.height

                    // respect the current overlay position to implement the sliding
                    // effect in steps 1 and 7 of currentShowAlbumDetailsScenario
                    val dim = BigAlbumArt.TOTAL_DIM
                    val dx = (overlayPosition * dim / 2).toInt()
                    albumArt.setBounds((w - dim) / 2 - dx, (h - dim) / 2, dim, dim)
                    trackListingScroller.setBounds((w - dim) / 2 + dx,
                            (h - dim) / 2 + 2, dim, dim - 4)
                })
        contentPane.add(albumArt)
        contentPane.add(trackListingScroller)

        contentPane.setComponentZOrder(trackListingScroller, 1)
        contentPane.setComponentZOrder(albumArt, 0)

        this.getRootPane().putClientProperty("Window.shadow", java.lang.Boolean.FALSE)
    }

    /**
     * Signals that details of the specified album item should be displayed in
     * this window. Note that this window can already display another album item
     * when this method is called.
     *
     * @param albumItem New album item to show in this window.
     */
    fun setAlbum(albumItem: SearchResultRelease) {
        if (this.currentShowAlbumDetailsScenario != null) {
            this.currentShowAlbumDetailsScenario!!.cancel()
        }

        this.currentShowAlbumDetailsScenario = this.getShowAlbumDetailsScenario(albumItem)
        this.currentShowAlbumDetailsScenario!!.play()
    }

    /**
     * Returns the timeline scenario that implements a transition from the
     * currently shown album item (which may be `null`) to the
     * specified album item.
     *
     * @param album The new album item to be shown in this window.
     * @return The timeline scenario that implements a transition from the
     * currently shown album item (which may be `null`) to
     * the specified album item.
     */
    private fun getShowAlbumDetailsScenario(album: SearchResultRelease): TimelineScenario {
        val scenario = TimelineScenario.RendezvousSequence()

        // step 1 - move album art and track listing to the same location
        val collapseArtAndTracks = this.componentTimeline {
            property(::overlayPosition fromCurrentTo 0.0f)
            duration = (500 * overlayPosition).toLong()
        }
        scenario.addScenarioActor(collapseArtAndTracks)

        // step 2 (in parallel) - load the new album art
        val albumArtHolder = arrayOfNulls<BufferedImage>(1)
        val loadNewAlbumArt = object : TimelineSwingWorker<Void, Void>() {
            @Throws(Exception::class)
            override fun doInBackground(): Void? {
                albumArtHolder[0] = BackendConnector.getLargeAlbumArt(album.asin!!)
                return null
            }
        }
        scenario.addScenarioActor(loadNewAlbumArt)

        // step 3 (in parallel) - load the track listing
        val tracks = ArrayList<Track>()
        val loadNewAlbumTrackList = object : TimelineSwingWorker<Void, Void>() {
            @Throws(Exception::class)
            override fun doInBackground(): Void? {
                tracks.addAll(BackendConnector.doTrackSearch(album.id!!))
                return null
            }
        }
        scenario.addScenarioActor(loadNewAlbumTrackList)
        scenario.rendezvous()

        // step 4 (wait for steps 1-3) - replace album art
        val replaceAlbumArt = object : TimelineRunnable() {
            override fun run() {
                albumArt.setAlbumArtImage(albumArtHolder[0]!!)
            }
        }
        scenario.addScenarioActor(replaceAlbumArt)

        // step 5 (in parallel) - replace the track listing
        val replaceTrackListing = object : TimelineRunnable() {
            override fun run() {
                trackListingScroller.setAlbumItem(album, tracks)
            }
        }
        scenario.addScenarioActor(replaceTrackListing)
        scenario.rendezvous()

        // step 6 (wait for steps 4 and 5) - cross fade album art from old to new
        val albumArtCrossfadeTimeline = this.albumArt.componentTimeline {
            property(albumArt::oldImageAlpha from 1.0f to 0.0f)
            property(albumArt::imageAlpha from 0.0f to 1.0f)
            repaintCallback()
            duration = 400
        }

        scenario.addScenarioActor(albumArtCrossfadeTimeline)
        scenario.rendezvous()

        // step 7 (wait for step 6) - move new album art and track listing to
        // be side by side.
        val separateArtAndTracks = this.componentTimeline {
            property(::overlayPosition from 0.0f to 1.0f)
            duration = 500
        }
        scenario.addScenarioActor(separateArtAndTracks)

        return scenario
    }
}
