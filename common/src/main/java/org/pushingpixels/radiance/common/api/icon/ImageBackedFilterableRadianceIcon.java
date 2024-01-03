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
package org.pushingpixels.radiance.common.api.icon;

import org.pushingpixels.radiance.common.api.AsynchronousLoadListener;
import org.pushingpixels.radiance.common.api.AsynchronousLoading;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.filter.RadianceAbstractFilter;

import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Implementation of the {@link RadianceIcon} interface that supports color filtering of content
 * by drawing it into offscreen images and applying the requested
 * {@link RadianceIcon.ColorFilter}. Note that this is a heavy
 * operation that consumes additional memory resources. If your original icon returns
 * {@code true} from its {@link RadianceIcon#supportsColorFilter()}, do not use this class.
 */
public class ImageBackedFilterableRadianceIcon implements RadianceIcon, AsynchronousLoading {
    private RadianceIcon.Factory sourceFactory;
    private int width;
    private int height;
    private RadianceIcon currDelegate;
    private EventListenerList listenerList;

    private ColorFilter colorFilter;
    private BufferedImage currColorized;

    private class InternalColorFilter extends RadianceAbstractFilter {
        private RadianceIcon.ColorFilter colorFilter;

        public InternalColorFilter(RadianceIcon.ColorFilter colorFilter) {
            this.colorFilter = colorFilter;
        }

        @Override
        public BufferedImage filter(BufferedImage src, BufferedImage dst) {
            if (dst == null) {
                dst = createCompatibleDestImage(src, null);
            }

            int width = src.getWidth();
            int height = src.getHeight();

            int[] pixels = new int[width * height];
            getPixels(src, 0, 0, width, height, pixels);

            for (int i = 0; i < pixels.length; i++) {
                int argb = pixels[i];
                int a = (argb >>> 24) & 0xFF;
                int r = (argb >>> 16) & 0xFF;
                int g = (argb >>> 8) & 0xFF;
                int b = (argb >>> 0) & 0xFF;

                Color filtered = this.colorFilter.filter(new Color(r, g, b, a));

                pixels[i] = (a * filtered.getAlpha() / 256) << 24 | filtered.getRed() << 16 |
                        filtered.getGreen() << 8 | filtered.getBlue();
            }
            setPixels(dst, 0, 0, width, height, pixels);

            return dst;
        }
    }

    public ImageBackedFilterableRadianceIcon(RadianceIcon.Factory sourceFactory, ColorFilter colorFilter) {
        this.sourceFactory = sourceFactory;
        this.colorFilter = colorFilter;
        this.listenerList = new EventListenerList();
    }

    @Override
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
        this.currDelegate = this.sourceFactory.createNewIcon();
        if (this.currDelegate.supportsColorFilter()) {
            throw new IllegalStateException("Do not use this class for icons that support color filter directly");
        }
        this.currDelegate.setDimension(newDimension);
        AsynchronousLoading async = (AsynchronousLoading) this.currDelegate;
        if (async.isLoading()) {
            this.currColorized = null;
            async.addAsynchronousLoadListener(new AsynchronousLoadListener() {
                @Override
                public void completed(boolean success) {
                    if (success) {
                        makeColorized();
                    }
                    async.removeAsynchronousLoadListener(this);

                    Object[] listeners = listenerList.getListenerList();
                    // Process the listeners last to first, notifying
                    // those that are interested in this event
                    for (int i = listeners.length - 2; i >= 0; i -= 2) {
                        if (listeners[i] == AsynchronousLoadListener.class) {
                            ((AsynchronousLoadListener) listeners[i + 1]).completed(success);
                        }
                    }
                }
            });
        } else {
            // Already loaded
            makeColorized();
        }
    }

    @Override
    public boolean supportsColorFilter() {
        return true;
    }

    @Override
    public void setColorFilter(RadianceIcon.ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        if (!this.isLoading()) {
            makeColorized();
        }
    }

    private void makeColorized() {
        BufferedImage flat = RadianceCommonCortex.getBlankScaledImage(
                RadianceCommonCortex.getScaleFactor(null),
                this.width, this.height);
        this.currDelegate.paintIcon(null, flat.getGraphics(), 0, 0);
        this.currColorized = new InternalColorFilter(this.colorFilter).filter(flat, null);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (this.currColorized != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(x, y);
            double scaleFactor = RadianceCommonCortex.getScaleFactor(c);
            RadianceCommonCortex.drawImageWithScale(g2d, scaleFactor, this.currColorized, 0, 0);
            g2d.dispose();
        }
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    @Override
    public void addAsynchronousLoadListener(AsynchronousLoadListener l) {
        this.listenerList.add(AsynchronousLoadListener.class, l);
    }

    @Override
    public void removeAsynchronousLoadListener(AsynchronousLoadListener l) {
        this.listenerList.remove(AsynchronousLoadListener.class, l);
    }

    @Override
    public boolean isLoading() {
        return (this.currDelegate != null) &&
                ((AsynchronousLoading) this.currColorized).isLoading();
    }
}
