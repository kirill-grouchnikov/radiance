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
package org.pushingpixels.lumen.details;

import org.pushingpixels.lumen.LumenUtils;
import org.pushingpixels.lumen.MainWindow;
import org.pushingpixels.lumen.data.SearchResultRelease;
import org.pushingpixels.trident.api.Timeline;

import java.awt.*;

/**
 * Utility manager for handling the functionality related to the details window.
 *
 * @author Kirill Grouchnikov
 */
public class DetailsWindowManager {
    /**
     * The currently shown details window.
     */
    static DetailsWindow currentlyShownWindow;

    /**
     * Disposes the currently shown details window.
     */
    public static void disposeCurrentlyShowing() {
        if ((currentlyShownWindow != null) && currentlyShownWindow.isVisible()) {
            LumenUtils.fadeOutAndDispose(currentlyShownWindow, 500);
        }
    }

    /**
     * Shows the details for the specified album item.
     *
     * @param mainWindow The main application window.
     * @param album      Album item details from Amazon.
     */
    public static void show(MainWindow mainWindow, SearchResultRelease album) {
        if ((currentlyShownWindow != null) && currentlyShownWindow.isVisible()) {
            currentlyShownWindow.setAlbum(album);
            return;
        }

        currentlyShownWindow = new DetailsWindow();
        currentlyShownWindow.setAlwaysOnTop(true);
        // place the details window centered along the bottom edge of the
        // main application window
        Point mainWindowLoc = mainWindow.getLocation();
        Dimension mainWindowDim = mainWindow.getSize();
        int x = mainWindowLoc.x + mainWindowDim.width / 2
                - currentlyShownWindow.getWidth() / 2;
        int y = mainWindowLoc.y + mainWindowDim.height
                - currentlyShownWindow.getHeight() / 2;
        currentlyShownWindow.setLocation(x, y);

        currentlyShownWindow.setOpacity(0.0f);

        currentlyShownWindow.setBackground(new Color(0, 0, 0, 0));
        currentlyShownWindow.setVisible(true);
        currentlyShownWindow.setAlbum(album);

        Timeline.builder(currentlyShownWindow)
                .addPropertyToInterpolate(Timeline.<Float>property("opacity").from(0.0f).to(1.0f))
                .setDuration(500)
                .play();
    }
}
