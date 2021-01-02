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
package org.pushingpixels.lucent

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import org.pushingpixels.lucent.data.SearchResultRelease
import org.pushingpixels.meteor.addDelayedComponentListener
import org.pushingpixels.meteor.addDelayedMouseListener
import org.pushingpixels.meteor.awt.render
import org.pushingpixels.neon.api.NeonCortex
import org.pushingpixels.torch.componentTimeline
import org.pushingpixels.torch.from
import org.pushingpixels.trident.api.Timeline.RepeatBehavior
import org.pushingpixels.trident.api.TimelineRunnable
import org.pushingpixels.trident.api.TimelineScenario
import org.pushingpixels.trident.api.ease.Spline
import org.pushingpixels.trident.api.swing.TimelineSwingWorker
import java.awt.*
import java.awt.image.BufferedImage
import javax.swing.JComponent
import kotlin.math.min

/**
 * Displays the overview information on the specific album.
 *
 * @author Kirill Grouchnikov
 */
class AlbumOverviewComponent(albumItem: SearchResultRelease) : JComponent() {
    /**
     * The original album art.
     */
    private var image: BufferedImage? = null

    /**
     * Indicates whether the image loading is done.
     */
    private var imageLoadedDone = false

    /**
     * The alpha value of the image. Is updated in the fade-in timeline which
     * starts after the image has been successfully loaded and scaled.
     */
    var imageAlpha = 0.0f

    /**
     * The alpha value of the border. Is updated in the fade-in timeline which
     * starts when the mouse moves over this component.
     */
    var borderAlpha = 0.0f

    /**
     * The album caption.
     */
    private val caption = albumItem.title

    /**
     * The album price.
     */
    private val releaseDate = albumItem.date

    /**
     * The alpha value of this component. Is updated in the fade-in timeline
     * which starts when this component becomes a part of the host window
     * hierarchy.
     */
    var alpha = 0.0f

    private val labelFont: Font

    init {
        this.cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
        this.isOpaque = false
        this.alpha = 0.0f

        // When the component is shown fade it in
        this.addHierarchyListener {
            this@AlbumOverviewComponent.componentTimeline {
                property(::alpha from 0.0f to 1.0f)
                repaintCallback()
                duration = 1000
            }.play()
        }

        // Timeline to "pulse" the border outline on mouse over
        val rolloverTimeline = this.componentTimeline {
            property(::borderAlpha from 0.0f to 0.6f)
            repaintCallback()
            ease = Spline(0.7f)
            duration = 800
        }

        this.addDelayedMouseListener(
                onMouseEntered = { rolloverTimeline.playLoop(RepeatBehavior.REVERSE) },
                onMouseExited = { rolloverTimeline.playReverse() })

        this.addDelayedComponentListener(onComponentResized = {
            if (borderAlpha > 0.0f) {
                rolloverTimeline.playReverse()
            }
        })

        this.labelFont = NeonCortex.getDefaultFontPolicy().fontSet.controlFont

        GlobalScope.launch(Dispatchers.Swing) { getLoadImageScenario(albumItem).play() }
    }

    /**
     * Returns the timeline scenario that loads, scales and fades in the
     * associated album art.
     *
     * @param albumItem Album item.
     * @return The timeline scenario that loads, scaled and fades in the
     * associated album art.
     */
    private fun getLoadImageScenario(albumItem: SearchResultRelease): TimelineScenario {
        val loadScenario = TimelineScenario.Sequence()

        // load the image
        val imageLoadWorker = object : TimelineSwingWorker<Void, Void>() {
            @Throws(Exception::class)
            override fun doInBackground(): Void? {
                image = BackendConnector.getLargeAlbumArt(albumItem.asin!!)
                return null
            }
        }
        loadScenario.addScenarioActor(imageLoadWorker)

        // scale if necessary
        val scaler = object : TimelineRunnable() {
            override fun run() {
                if (image != null) {
                    val vFactor = OVERVIEW_IMAGE_DIM.toFloat() / image!!.height.toFloat()
                    val hFactor = OVERVIEW_IMAGE_DIM.toFloat() / image!!.width.toFloat()
                    val factor = min(1.0f, min(vFactor, hFactor))
                    if (factor < 1.0f) {
                        // scaled to fit available area
                        image = NeonCortex.createThumbnail(image!!,
                                (factor * image!!.width).toInt())
                    }

                    imageLoadedDone = true
                }
            }
        }
        loadScenario.addScenarioActor(scaler)

        // and fade it in
        loadScenario.addScenarioActor(
                this.componentTimeline {
                    property(::imageAlpha from 0.0f to 1.0f)
                    repaintCallback()
                    duration = 500
                })

        return loadScenario
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.composite = AlphaComposite.SrcOver.derive(this.alpha)

            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON)
            it.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                    RenderingHints.VALUE_TEXT_ANTIALIAS_ON)

            it.paint = GradientPaint(0f, 0f, Color(0, 0, 0, 196), 0f,
                    DEFAULT_HEIGHT.toFloat(), Color(0, 0, 0, 0))
            it.fillRoundRect(0, 0, DEFAULT_WIDTH - 1, DEFAULT_HEIGHT - 1, 18, 18)
            it.drawRoundRect(0, 0, DEFAULT_WIDTH - 1, DEFAULT_HEIGHT - 1, 18, 18)

            if (this.borderAlpha > 0.0f) {
                // show the pulsating bluish outline of the rollover album
                it.composite = AlphaComposite.SrcOver.derive(this.alpha * this.borderAlpha)
                it.paint = GradientPaint(0f, 0f, Color(64, 140, 255, 196),
                        0f, DEFAULT_HEIGHT.toFloat(), Color(64, 140, 255, 0))
                it.stroke = BasicStroke(2.0f, BasicStroke.CAP_ROUND,
                        BasicStroke.JOIN_ROUND)
                it.drawRoundRect(1, 1, DEFAULT_WIDTH - 2, DEFAULT_HEIGHT - 2, 17, 17)
                it.stroke = BasicStroke(1.0f)
                it.composite = AlphaComposite.SrcOver.derive(this.alpha)
            }

            var contentHorizontalOffset = INSETS
            if (this.imageLoadedDone) {
                it.composite = AlphaComposite.SrcOver.derive(this.alpha * this.imageAlpha)

                // draw the album art image
                val scaleFactor = NeonCortex.getScaleFactor()
                val imageWidth = this.image!!.width
                val imageHeight = this.image!!.height
                contentHorizontalOffset = ((this.width - imageWidth / scaleFactor) / 2).toInt()
                val offsetY = INSETS + ((OVERVIEW_IMAGE_DIM - imageHeight / scaleFactor) / 2).toInt()
                it.drawImage(this.image, contentHorizontalOffset, offsetY,
                        (imageWidth / scaleFactor).toInt(), (imageHeight / scaleFactor).toInt(), null)
                it.composite = AlphaComposite.SrcOver.derive(this.alpha)
            }

            it.color = Color.white
            it.font = this.labelFont

            val fontMetrics = it.fontMetrics
            val textY = INSETS + OVERVIEW_IMAGE_DIM + fontMetrics.height
            val textWidth = DEFAULT_WIDTH - 2 * contentHorizontalOffset
            LucentUtils.paintMultilineText(it, this.caption!!, contentHorizontalOffset,
                    textWidth, textY, 2)

            it.color = Color(64, 140, 255)
            LucentUtils.paintMultilineText(it, this.releaseDate!!, contentHorizontalOffset, textWidth,
                    textY + 2 * it.fontMetrics.height, 1)
        }
    }

    companion object {
        /**
         * The dimensions of the overview image.
         */
        const val OVERVIEW_IMAGE_DIM = 132

        /**
         * Default width of this component.
         */
        const val DEFAULT_WIDTH = 160

        /**
         * Default height of this component.
         */
        const val DEFAULT_HEIGHT = 200

        /**
         * Component insets.
         */
        private const val INSETS = 8
    }
}
