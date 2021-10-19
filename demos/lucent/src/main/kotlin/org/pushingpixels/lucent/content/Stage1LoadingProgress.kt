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
package org.pushingpixels.lucent.content

import org.pushingpixels.meteor.awt.render
import org.pushingpixels.radiance.animation.kxt.componentTimeline
import org.pushingpixels.radiance.animation.kxt.from
import org.pushingpixels.radiance.animation.api.Timeline
import org.pushingpixels.radiance.animation.api.Timeline.RepeatBehavior
import org.pushingpixels.radiance.animation.api.Timeline.TimelineState
import java.awt.*
import java.awt.geom.RoundRectangle2D

/**
 * Adds the following functionality to the album scroller container:
 *
 * <ul>
 * <li>Overlaying an indefinite load progress indicator on top of the container
 * children</li>
 * <li>Changes in load progress indicator visibility are animated to fade in and
 * fade out</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
open class Stage1LoadingProgress : Stage0Base() {
    /**
     * The looping timeline to animate the indefinite load progress. When
     * [.setLoading] is called with `true`, this
     * timeline is started. When [.setLoading] is called with
     * `false`, this timeline is cancelled at the end of the
     * [.loadingBarFadeTimeline].
     */
    internal var loadingBarLoopTimeline: Timeline

    /**
     * The current position of the [.loadingBarLoopTimeline].
     */
    var loadingBarLoopPosition = 0.0f

    /**
     * The timeline for showing and hiding the loading progress bar. When
     * [.setLoading] is called with `true`, this
     * timeline is started. When [.setLoading] is called with
     * `false`, this timeline is started in reverse.
     */
    internal var loadingBarFadeTimeline: Timeline

    /**
     * The current alpha value of the loading progress bar. Is updated by the
     * [.loadingBarFadeTimeline].
     */
    var loadingBarAlpha = 0.0f

    /**
     * Creates a container with support for showing load progress.
     */
    init {
        // create the looping timeline
        this.loadingBarLoopTimeline = this.componentTimeline {
            property(::loadingBarLoopPosition from 0.0f to 1.0f)
            onTimelinePulse { _, _ ->
                // don't repaint the whole window
                val x = (width - PROGRESS_WIDTH) / 2
                val y = (height - PROGRESS_HEIGHT) / 2
                repaint(x - 5, y - 5, PROGRESS_WIDTH + 10, PROGRESS_HEIGHT + 10)
            }
            duration = 750
        }

        // create the fade timeline
        this.loadingBarFadeTimeline = this.componentTimeline {
            property(::loadingBarAlpha from 0.0f to 1.0f)
            onTimelineStateChanged { oldState, newState, _, _ ->
                if (oldState == TimelineState.PLAYING_REVERSE && newState == TimelineState.DONE) {
                    // after the loading progress is faded out, stop the loading
                    // animation
                    loadingBarLoopTimeline.cancel()
                }
            }
            duration = 500
        }
    }

    override fun paintChildren(g: Graphics) {
        super.paintChildren(g)

        if (this.loadingBarAlpha > 0.0f) {
            // paint the load progress over the children
            val x = (width - PROGRESS_WIDTH) / 2
            val y = (height - PROGRESS_HEIGHT) / 2

            g.render {
                it.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON)
                it.composite = AlphaComposite.SrcOver.derive(this.loadingBarAlpha)

                val currClip = it.clip
                it.clip(RoundRectangle2D.Double(x.toDouble(), y.toDouble(), PROGRESS_WIDTH.toDouble(),
                        PROGRESS_HEIGHT.toDouble(), 8.0, 8.0))
                it.paint = LinearGradientPaint(x.toFloat(), y.toFloat(),
                        x.toFloat(), (y + PROGRESS_HEIGHT).toFloat(),
                        floatArrayOf(0.0f, 0.49999f, 0.5f, 1.0f),
                        arrayOf(Color(156, 208, 221), Color(101, 183, 243), Color(67, 169, 241), Color(138, 201, 247)))
                it.fillRect(x, y, PROGRESS_WIDTH, PROGRESS_HEIGHT)

                val stripeCellWidth = 25
                it.paint = LinearGradientPaint(x.toFloat(), y.toFloat(),
                        x.toFloat(), (y + PROGRESS_HEIGHT).toFloat(),
                        floatArrayOf(0.0f, 0.49999f, 0.5f, 1.0f),
                        arrayOf(Color(36, 155, 239), Color(17, 145, 238), Color(15, 56, 200), Color(3, 133, 219)))
                it.stroke = BasicStroke(9.0f)
                var stripeX = x + (this.loadingBarLoopPosition * stripeCellWidth).toInt()
                while (stripeX < x + PROGRESS_WIDTH + PROGRESS_HEIGHT) {
                    it.drawLine(stripeX, y, stripeX - stripeCellWidth, y + PROGRESS_HEIGHT)
                    stripeX += stripeCellWidth
                }

                it.clip = currClip

                it.color = Color.lightGray
                it.stroke = BasicStroke(1.3f)
                it.drawRoundRect(x, y, PROGRESS_WIDTH, PROGRESS_HEIGHT, 8, 8)
            }
        }
    }

    /**
     * Starts or stops the loading progress animation.
     *
     * @param isLoading if `true`, this container will display a loading
     * progress animation, if `false`, the loading
     * progress animation will be stopped.
     */
    fun setLoading(isLoading: Boolean) {
        if (isLoading) {
            this.loadingBarFadeTimeline.play()
            this.loadingBarLoopTimeline.playLoop(RepeatBehavior.LOOP)
        } else {
            this.loadingBarFadeTimeline.playReverse()
        }
    }

    companion object {
        /**
         * The pixel width of the load progress visuals.
         */
        private const val PROGRESS_WIDTH = 300

        /**
         * The pixel height of the load progress visuals.
         */
        private const val PROGRESS_HEIGHT = 32
    }
}
