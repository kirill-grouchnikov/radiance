/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.animation.kmusicapp.details

import org.pushingpixels.radiance.demo.animation.kmusicapp.MusicAppUtils
import org.pushingpixels.radiance.demo.animation.kmusicapp.MainWindow
import org.pushingpixels.radiance.demo.animation.kmusicapp.data.SearchResultRelease
import org.pushingpixels.radiance.animation.ktx.RadianceWindow
import org.pushingpixels.radiance.animation.ktx.windowTimeline
import java.awt.Color

/**
 * Utility manager for handling the functionality related to the details window.
 *
 * @author Kirill Grouchnikov
 */
object DetailsWindowManager {
    /**
     * The currently shown details window.
     */
    internal var currentlyShownWindow: DetailsWindow? = null

    /**
     * Disposes the currently shown details window.
     */
    fun disposeCurrentlyShowing() {
        if (currentlyShownWindow != null && currentlyShownWindow!!.isVisible) {
            MusicAppUtils.fadeOutAndDispose(currentlyShownWindow!!, 500)
        }
    }

    /**
     * Shows the details for the specified album item.
     *
     * @param mainWindow The main application window.
     * @param album      Album item details from Amazon.
     */
    fun show(mainWindow: MainWindow, album: SearchResultRelease) {
        if (currentlyShownWindow != null && currentlyShownWindow!!.isVisible) {
            currentlyShownWindow!!.setAlbum(album)
            return
        }

        currentlyShownWindow = DetailsWindow()
        currentlyShownWindow!!.isAlwaysOnTop = true
        // place the details window centered along the bottom edge of the
        // main application window
        val mainWindowLoc = mainWindow.location
        val mainWindowDim = mainWindow.size
        val x = mainWindowLoc.x + mainWindowDim.width / 2 - currentlyShownWindow!!.width / 2
        val y = mainWindowLoc.y + mainWindowDim.height - currentlyShownWindow!!.height / 2
        currentlyShownWindow!!.setLocation(x, y)

        currentlyShownWindow!!.opacity = 0.0f

        currentlyShownWindow!!.background = Color(0, 0, 0, 0)
        currentlyShownWindow!!.isVisible = true
        currentlyShownWindow!!.setAlbum(album)

        currentlyShownWindow!!.windowTimeline {
            property(RadianceWindow.opacity from 0.0f to 1.0f)
            duration = 500
        }.play()
    }
}
