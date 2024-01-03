/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.animation.kmusicapp.content

import org.pushingpixels.radiance.demo.animation.kmusicapp.AlbumOverviewComponent
import org.pushingpixels.radiance.demo.animation.kmusicapp.data.SearchResultRelease
import org.pushingpixels.radiance.demo.animation.kmusicapp.details.DetailsWindowManager
import org.pushingpixels.radiance.swing.ktx.addDelayedMouseListener
import org.pushingpixels.radiance.swing.ktx.swing.KeyboardActionScopeType
import org.pushingpixels.radiance.swing.ktx.swing.wireActionToKeyStrokes
import java.awt.Graphics
import java.util.*
import javax.swing.KeyStroke

/**
 * Adds the following functionality to the album scroller container:
 *
 * <ul>
 * <li>Adding album overview components</li>
 * <li>Scrolling overview components with mouse wheel and left / right arrow
 * keys</li>
 * </ul>
 *
 * @author Kirill Grouchnikov
 */
open class Stage2Components : Stage1LoadingProgress() {
    /**
     * The list of album overview components. Each component added with
     * [.addAlbumItem] is added to this list.
     */
    internal var comps: MutableList<AlbumOverviewComponent> = ArrayList()

    /**
     * Indicates which album overview component is displayed at the left edge of
     * this container. Note that while this specific class (in its
     * [.scrollToNext] and [.scrollToPrevious]) operate on the
     * integer values, the animated scrolling will result in fractional values
     * of the leading position.
     *
     * At the beginning the value is 0.0 - displaying the first entry in
     * [.comps] at the left edge. When scrolling to the next album, the
     * value will become 1.0 (effectively pushing the first album over the left
     * edge). If the scrolling is animated, this value will be gradually
     * interpolated from 0.0 to 1.0.
     *
     * This value is respected in the [.doLayout] to provide the
     * seamless scroll animation.
     */
    internal var leadingPosition = 0.0f
        set(value) {
            field = value
            revalidate()
        }


    /**
     * Creates the new container that can host album overview components.
     */
    init {
        // register the mouse wheel listener for scrolling content
        this.addMouseWheelListener { e ->
            if (e.wheelRotation > 0) {
                // next
                scrollToNext()
            } else {
                // previous
                scrollToPrevious()
            }
        }

        // handle the scrolling with left / right arrows
        this.wireActionToKeyStrokes("right",
                setOf(KeyStroke.getKeyStroke("RIGHT"), KeyStroke.getKeyStroke("KP_RIGHT")),
                KeyboardActionScopeType.WHEN_IN_FOCUSED_WINDOW_TYPE) {
            scrollToNext()
        }
        this.wireActionToKeyStrokes("left",
                setOf(KeyStroke.getKeyStroke("LEFT"), KeyStroke.getKeyStroke("KP_LEFT")),
                KeyboardActionScopeType.WHEN_IN_FOCUSED_WINDOW_TYPE) {
            scrollToPrevious()
        }

        // add a mouse listener to dispose the album details window
        // when the user clicks outside any album overview component.
        this.addDelayedMouseListener(
                onMouseClicked = { DetailsWindowManager.disposeCurrentlyShowing() })
    }

    /**
     * Adds the specified album item to this album container.
     *
     * @param album Description of the album item from the Amazon backend.
     * @return Thew matching album overview component.
     */
    @Synchronized
    fun addAlbumItem(album: SearchResultRelease): AlbumOverviewComponent {
        val comp = AlbumOverviewComponent(album)
        this.comps.add(comp)
        this.add(comp)
        return comp
    }

    @Synchronized
    override fun doLayout() {
        if (comps.size == 0)
            return

        for (i in this.comps.indices) {
            val delta = i - this.leadingPosition
            // compute the left X based on the current leading position
            val x = 10 + (delta * (AlbumOverviewComponent.DEFAULT_WIDTH + 10)).toInt()
            this.comps[i].setBounds(
                    x,
                    TITLE_HEIGHT + (height - TITLE_HEIGHT - AlbumOverviewComponent.DEFAULT_HEIGHT) / 2,
                    AlbumOverviewComponent.DEFAULT_WIDTH,
                    AlbumOverviewComponent.DEFAULT_HEIGHT)
        }
    }

    override fun paintChildren(g: Graphics) {
        // clip the graphics context
        g.clipRect(10, 10, width - 20, height - 20)
        super.paintChildren(g)
    }

    /**
     * Scrolls the albums to show the next album.
     */
    open fun scrollToNext() {
        if (this.leadingPosition < this.comps.size - 1) {
            this.leadingPosition++
            revalidate()
        }
    }

    /**
     * Scrolls the albums to show the previous album.
     */
    protected open fun scrollToPrevious() {
        if (this.leadingPosition > 0) {
            this.leadingPosition--
            revalidate()
        }
    }
}
