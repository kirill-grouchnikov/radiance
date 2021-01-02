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
package org.pushingpixels.lucent.details

import org.pushingpixels.lucent.data.SearchResultRelease
import org.pushingpixels.lucent.data.Track
import org.pushingpixels.meteor.awt.render
import java.awt.*
import java.awt.geom.RoundRectangle2D
import javax.swing.*
import javax.swing.border.EmptyBorder
import javax.swing.plaf.basic.BasicScrollBarUI

/**
 * Scrollable viewer for the album track listing.
 *
 * @author Kirill Grouchnikov
 */
class TrackListingScroller : JPanel() {
    /**
     * The scroller.
     */
    private val listingScroller: JScrollPane

    /**
     * The view of the scroller.
     */
    private val listing: TrackListing

    /**
     * Creates a new scrollable viewer for the album track listing.
     */
    init {
        this.layout = BorderLayout()

        // create the listing panel
        this.listing = TrackListing()

        // create the scroll pane
        this.listingScroller = object : JScrollPane(this.listing,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER) {
            override fun paintComponent(g: Graphics) {
                // custom painting for the scroll pane (rounded double border)
                g.render {
                    it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON)

                    val w = width
                    val h = height

                    it.color = Color(32, 32, 32)
                    it.fillRoundRect(-4, 0, w + 3, h - 1, 4, 4)

                    it.color = Color.white
                    it.stroke = BasicStroke(2.0f)
                    it.drawRoundRect(-3, 1, w + 1, h - 3, 3, 3)
                    it.color = Color(128, 128, 128)
                    it.stroke = BasicStroke(1.0f)
                    it.drawRoundRect(-2, 0, w + 1, h - 1, 4, 4)
                }
            }
        }
        this.listingScroller.setBorder(EmptyBorder(3, 0, 3, 6))
        this.add(this.listingScroller, BorderLayout.CENTER)

        // mark scroll pane and related containers as non-opaque for nicer
        // visuals
        this.listingScroller.setOpaque(false)
        this.listingScroller.getViewport().isOpaque = false
        this.isOpaque = false

        // set custom UI delegate on the scroll bar.
        this.listingScroller.getVerticalScrollBar().setUI(
                object : BasicScrollBarUI() {
                    override fun createDecreaseButton(orientation: Int): JButton {
                        // decrease button will not show
                        val result = super.createDecreaseButton(orientation)
                        result.preferredSize = Dimension(0, 0)
                        result.isVisible = false
                        return result
                    }

                    override fun createIncreaseButton(orientation: Int): JButton {
                        // increase button will not show
                        val result = super.createIncreaseButton(orientation)
                        result.preferredSize = Dimension(0, 0)
                        result.isVisible = false
                        return result
                    }

                    override fun paintThumb(g: Graphics, c: JComponent?, thumbBounds: Rectangle) {
                        // custom thumb appearance
                        g.render {
                            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                    RenderingHints.VALUE_ANTIALIAS_ON)

                            val shape = RoundRectangle2D.Double(
                                    (thumbBounds.x + 3).toDouble(), (thumbBounds.y + 3).toDouble(),
                                    (thumbBounds.width - 7).toDouble(), (thumbBounds.height - 7).toDouble(),
                                    (thumbBounds.width - 6).toDouble(), (thumbBounds.width - 6).toDouble())

                            it.paint = Color(128, 128, 128)
                            it.fill(shape)
                            it.draw(shape)
                        }
                    }

                    override fun paintTrack(g: Graphics, c: JComponent?, trackBounds: Rectangle) {
                        // custom track appearance
                        g.render {
                            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                    RenderingHints.VALUE_ANTIALIAS_ON)

                            val shape = RoundRectangle2D.Double(
                                    trackBounds.x.toDouble(), trackBounds.y.toDouble(),
                                    (trackBounds.width - 1).toDouble(), (trackBounds.height - 1).toDouble(),
                                    trackBounds.width.toDouble(), trackBounds.width.toDouble())

                            it.paint = Color(71, 71, 71)
                            it.fill(shape)
                            it.draw(shape)
                        }
                    }
                })
        this.listingScroller.getVerticalScrollBar().isOpaque = false

        this.listingScroller.setLayout(object : ScrollPaneLayout() {
            override fun layoutContainer(parent: Container) {
                // make the vertical scroll bar 12 pixels wide
                val vScrollBarWidth = 12
                val ins = parent.insets
                val w = parent.width
                val h = parent.height
                viewport.setBounds(ins.left, ins.top,
                        w - ins.left - ins.right - vScrollBarWidth, h - ins.top - ins.bottom)
                vsb.setBounds(w - ins.right - vScrollBarWidth, ins.top,
                        vScrollBarWidth, h - ins.top - ins.bottom)
            }
        })
    }

    /**
     * Sets the specified album item for the track display.
     *
     * @param album  Album item.
     * @param tracks Album tracks.
     */
    fun setAlbumItem(album: SearchResultRelease, tracks: List<Track>) {
        this.listingScroller.verticalScrollBar.value = 0
        this.listing.setAlbum(album, tracks)
    }
}
