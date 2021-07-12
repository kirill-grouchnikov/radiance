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
package org.pushingpixels.flamingo.api.common.icon;

import org.pushingpixels.neon.api.AsynchronousLoading;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.NeonIcon;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implementation of {@link NeonIcon} that allows applying a
 * {@link BufferedImageOp} on another icon.
 *
 * @author Kirill Grouchnikov
 */
public class FilteredNeonIcon implements NeonIcon {
    /**
     * Image cache to speed up rendering.
     */
    private Map<String, BufferedImage> cachedImages;

    /**
     * The main (pre-filtered) icon.
     */
    private NeonIcon delegate;

    /**
     * Filter operation.
     */
    private BufferedImageOp operation;

    /**
     * Creates a new filtered icon.
     *
     * @param delegate  The main (pre-filtered) icon.
     * @param operation Filter operation.
     */
    private FilteredNeonIcon(NeonIcon delegate, BufferedImageOp operation) {
        super();
        this.delegate = delegate;
        this.operation = operation;
        this.cachedImages = new LinkedHashMap<String, BufferedImage>() {
            @Override
            protected boolean removeEldestEntry(
                    java.util.Map.Entry<String, BufferedImage> eldest) {
                return size() > 5;
            }
        };
    }

    @Override
    public int getIconHeight() {
        return delegate.getIconHeight();
    }

    @Override
    public int getIconWidth() {
        return delegate.getIconWidth();
    }

    @Override
    public void setDimension(Dimension newDimension) {
        delegate.setDimension(newDimension);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // check cache
        double scale = NeonCortex.getScaleFactor(c);
        String key = scale + ":" + this.getIconWidth() + ":" + this.getIconHeight();
        if (!this.cachedImages.containsKey(key)) {
            // check if loading
            if (this.delegate instanceof AsynchronousLoading) {
                AsynchronousLoading asyncDelegate = (AsynchronousLoading) this.delegate;
                // if the delegate is still loading - do nothing
                if (asyncDelegate.isLoading()) {
                    return;
                }
            }
            BufferedImage offscreen = NeonCortex.getBlankScaledImage(
                    scale, this.getIconWidth(), this.getIconHeight());
            Graphics2D g2d = offscreen.createGraphics();
            this.delegate.paintIcon(c, g2d, 0, 0);
            g2d.dispose();
            BufferedImage filtered = this.operation.filter(offscreen, null);
            this.cachedImages.put(key, filtered);
        }
        BufferedImage toDraw = this.cachedImages.get(key);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(x, y);
        // Note that here we shouldn't use NeonCortex.drawImage as the result of applying
        // a generic (non-NeonAbstractFilter) filter is not going to be a high-DPI wrapper.
        g2d.drawImage(toDraw, 0, 0, (int) (toDraw.getWidth(null) / scale),
                (int) (toDraw.getHeight(null) / scale), null);
        g2d.dispose();
    }

    public static Factory factory(Factory delegateFactory,
            BufferedImageOp operation) {
        return () -> new FilteredNeonIcon(delegateFactory.createNewIcon(), operation);
    }
}
