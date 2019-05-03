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
 *  o Neither the name of Radiance Kirill Grouchnikov nor the names of
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

import org.pushingpixels.lucent.LucentUtils
import org.pushingpixels.lucent.data.SearchResultRelease
import org.pushingpixels.lucent.data.Track
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.NeonCortex
import java.awt.*
import java.awt.font.FontRenderContext
import java.awt.geom.AffineTransform
import java.awt.geom.Line2D
import java.util.*
import javax.swing.JPanel
import javax.swing.Scrollable
import javax.swing.border.EmptyBorder

/**
 * Component for showing track listing of a single album item.
 *
 * @author Kirill Grouchnikov
 */
class TrackListing : JPanel(), Scrollable {
    /**
     * The album item.
     */
    private var album: SearchResultRelease? = null

    /**
     * Album performer.
     */
    private var artist: String? = null

    /**
     * The title of the album.
     */
    private var albumTitle: String? = null

    /**
     * The release date of the album.
     */
    private var released: String? = null

    /**
     * List of the album tracks.
     */
    private var tracks: List<Track>? = null

    /**
     * Creates a new component that shows a list of all album tracks.
     */
    init {
        this.isOpaque = false
        this.border = EmptyBorder(6, 6, 6, 6)
    }

    /**
     * Sets the specified album item for the track display.
     *
     * @param album  Album item.
     * @param tracks Album tracks.
     */
    fun setAlbum(album: SearchResultRelease, tracks: List<Track>) {
        this.album = album
        this.artist = this.album!!.artist
        this.albumTitle = "\"" + this.album!!.title + "\""
        this.released = "Released " + this.album!!.date
        this.tracks = Collections.unmodifiableList(tracks)

        this.revalidate()
        this.parent.invalidate()
        this.parent.validate()
    }

    override fun getPreferredSize(): Dimension {
        if (this.album == null) {
            return super.getPreferredSize()
        }

        if (this.width < 0) {
            return super.getPreferredSize()
        }

        val controlFont = NeonCortex.getDefaultFontPolicy().fontSet.controlFont
        val keyFont = controlFont.deriveFont(15.0f)
        val detailsFont = controlFont.deriveFont(13.0f)

        val ins = this.insets
        val width = width - ins.left - ins.right

        val keyFontHeight = keyFont.getLineMetrics(this.artist!!,
                FontRenderContext(AffineTransform(), false, false)).height
        val detailsFontHeight = detailsFont.getLineMetrics(this.artist!!,
                FontRenderContext(AffineTransform(), false, false)).height

        var height = ins.top + keyFontHeight
        // performers
        height += LucentUtils.getMultilineTextHeight(keyFont, this.artist!!, width).toFloat()
        height += keyFontHeight / 3
        // title
        height += LucentUtils.getMultilineTextHeight(keyFont, this.albumTitle!!, width).toFloat()
        height += keyFontHeight / 3
        // release date
        height += LucentUtils.getMultilineTextHeight(detailsFont, this.released!!, width).toFloat()
        height += detailsFontHeight / 2

        // tracks
        height += detailsFontHeight / 2
        for (track in this.tracks!!) {
            height += LucentUtils.getMultilineTextHeight(detailsFont, track.title!!, width).toFloat()
            height += detailsFontHeight / 2
        }

        height += ins.bottom.toFloat()

        return Dimension(getWidth(), height.toInt())
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)

            if (this.artist == null) {
                return
            }

            val controlFont = NeonCortex.getDefaultFontPolicy().fontSet.controlFont
            val keyFont = controlFont.deriveFont(15.0f)
            val detailsFont = controlFont.deriveFont(13.0f)
            it.font = keyFont
            val keyFontHeight = keyFont.getLineMetrics(this.artist!!,
                    FontRenderContext(AffineTransform(), false, false)).height
            val detailsFontHeight = detailsFont.getLineMetrics(this.artist!!,
                    FontRenderContext(AffineTransform(), false, false)).height

            val ins = insets
            val width = width - ins.left - ins.right
            if (this.album != null) {
                var headerHeight = ins.top + keyFontHeight.toInt()
                // performer
                headerHeight += LucentUtils.getMultilineTextHeight(keyFont.deriveFont(Font.BOLD),
                        this.artist!!, width)
                headerHeight += (keyFontHeight / 3).toInt()
                // title
                headerHeight += LucentUtils.getMultilineTextHeight(keyFont, this.albumTitle!!, width)
                headerHeight += (keyFontHeight / 3).toInt()
                // release date
                headerHeight += LucentUtils.getMultilineTextHeight(detailsFont, this.released!!, width)
                headerHeight -= (detailsFontHeight / 3).toInt()
                headerHeight--

                it.color = Color.black
                it.fillRect(0, 0, getWidth(), headerHeight)

                val x = ins.left

                it.font = keyFont
                it.color = Color.white
                var y = ins.top + keyFontHeight.toInt()

                it.font = keyFont.deriveFont(Font.BOLD)
                y = LucentUtils.paintMultilineText(it, this.artist!!, x, width, y, -1)
                y += (keyFontHeight / 3).toInt()
                it.font = keyFont
                y = LucentUtils.paintMultilineText(it, this.albumTitle!!, x, width, y, -1)
                y += (keyFontHeight / 3).toInt()
                it.color = Color(64, 140, 255)
                it.font = detailsFont
                y = LucentUtils.paintMultilineText(it, this.released!!, x, width, y, -1)
                y += (detailsFontHeight / 3).toInt()

                // tracks
                y += (detailsFontHeight / 2).toInt()
                val borderThickness = 1.0f / NeonCortex.getScaleFactor()
                for (track in tracks!!) {
                    it.color = Color(44, 44, 44)
                    val topY = (y - detailsFontHeight.toInt() + 2).toFloat()
                    it.draw(Line2D.Float((x + 5).toFloat(), topY, (width - 10).toFloat(), topY))
                    it.color = Color(35, 35, 35)
                    val bottomY = y - detailsFontHeight.toInt() + 3 - borderThickness.toFloat()
                    it.draw(Line2D.Float((x + 5).toFloat(), bottomY, (width - 10).toFloat(), bottomY))

                    y += 4
                    it.color = Color(192, 192, 192)
                    y = LucentUtils.paintMultilineText(it, track.title!!, x, width, y, -1)
                    y += (detailsFontHeight / 2).toInt()
                }
            }
        }
    }

    override fun getPreferredScrollableViewportSize(): Dimension {
        return this.preferredSize
    }

    override fun getScrollableBlockIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int {
        return 30
    }

    override fun getScrollableTracksViewportHeight(): Boolean {
        return false
    }

    override fun getScrollableTracksViewportWidth(): Boolean {
        return true
    }

    override fun getScrollableUnitIncrement(visibleRect: Rectangle, orientation: Int, direction: Int): Int {
        return 10
    }
}
