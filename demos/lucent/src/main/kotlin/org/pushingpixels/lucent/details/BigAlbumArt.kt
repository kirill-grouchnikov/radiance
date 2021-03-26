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

import org.pushingpixels.neon.api.NeonCortex
import java.awt.*
import java.awt.image.BufferedImage
import javax.swing.JComponent
import kotlin.math.min

/**
 * Shows the big album art for Amazon album items.
 *
 * @author Kirill Grouchnikov
 */
class BigAlbumArt : JComponent() {
    /**
     * The previously displayed album art. Is shown during the fade out stage,
     * controlled by the timeline launched after the call to
     * [.setAlbumArtImage].
     */
    private var oldImage: BufferedImage? = null

    /**
     * The album art image for the currently displayed Amazon album item.
     */
    private var image: BufferedImage? = null

    /**
     * The alpha value for [.image].
     */
    var imageAlpha = 0.0f

    /**
     * Creates a new component that shows album art.
     */
    init {
        this.isOpaque = false
        this.imageAlpha = 0.0f
    }

    /**
     * Sets the specified album art for the display.
     *
     * @param image Album art.
     */
    fun setAlbumArtImage(image: BufferedImage) {
        this.oldImage = this.image

        this.image = image
        this.imageAlpha = 0.0f
        val vFactor = ALBUM_ART_DIM.toFloat() / image.height.toFloat()
        val hFactor = ALBUM_ART_DIM.toFloat() / image.width.toFloat()
        val factor = min(1.0f, min(vFactor, hFactor))
        if (factor < 1.0f) {
            // scaled to fit available area
            this.image = NeonCortex.createThumbnail(
                NeonCortex.getScaleFactor(this),
                image, (factor * image.width).toInt()
            )
        }
    }

    override fun paintComponent(g: Graphics) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        )

        val w = width
        val h = height
        g2d.color = Color(192, 192, 192)
        g2d.fillRoundRect(0, 0, w - 1, h - 1, 4, 4)

        val scaleFactor = NeonCortex.getScaleFactor(this)
        if (this.imageAlpha < 1.0f) {
            val g2dImage = g2d.create() as Graphics2D
            g2dImage.composite = AlphaComposite.SrcOver
            if (this.oldImage != null) {
                // draw the original image
                val offsetX = ((this.width - this.oldImage!!.width / scaleFactor) / 2).toInt()
                val offsetY =
                    INSETS + ((ALBUM_ART_DIM - this.oldImage!!.height / scaleFactor) / 2).toInt()
                g2dImage.drawImage(
                    this.oldImage, offsetX, offsetY,
                    (this.oldImage!!.width / scaleFactor).toInt(),
                    (this.oldImage!!.height / scaleFactor).toInt(), null
                )
            }
            g2dImage.dispose()
        }

        if (this.imageAlpha > 0.0f) {
            val g2dImage = g2d.create() as Graphics2D
            g2dImage.composite = AlphaComposite.SrcOver.derive(this.imageAlpha)
            if (this.image != null) {
                // draw the original image
                val offsetX = ((this.width - this.image!!.width / scaleFactor) / 2).toInt()
                val offsetY =
                    INSETS + ((ALBUM_ART_DIM - this.image!!.height / scaleFactor) / 2).toInt()
                g2dImage.drawImage(
                    this.image, offsetX, offsetY,
                    (this.image!!.width / scaleFactor).toInt(),
                    (this.image!!.height / scaleFactor).toInt(), null
                )
            }
            g2dImage.dispose()
        }

        g2d.color = Color.white
        g2d.stroke = BasicStroke(2.0f)
        g2d.drawRoundRect(1, 1, w - 2, h - 2, 3, 3)
        g2d.color = Color(128, 128, 128)
        g2d.stroke = BasicStroke(1.0f)
        g2d.drawRoundRect(0, 0, w - 1, h - 1, 4, 4)

        g2d.dispose()
    }

    companion object {
        /**
         * The maximum dimension of the album art.
         */
        const val ALBUM_ART_DIM = 220

        /**
         * Album art insets.
         */
        const val INSETS = 3

        /**
         * The total dimension required to display album art and track listing side
         * by side.
         */
        val TOTAL_DIM = ALBUM_ART_DIM + INSETS * 2
    }
}
