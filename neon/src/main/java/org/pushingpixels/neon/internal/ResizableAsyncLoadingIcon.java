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
package org.pushingpixels.neon.internal;

import org.pushingpixels.neon.api.AsynchronousLoadListener;
import org.pushingpixels.neon.api.AsynchronousLoading;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.ResizableIcon;

import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class ResizableAsyncLoadingIcon implements ResizableIcon, AsynchronousLoading {
    protected ResizableIcon.Factory sourceFactory;
    protected int width;
    protected int height;
    protected ResizableIcon currDelegate;
    protected BufferedImage currColorized;
    protected EventListenerList listenerList;

    public ResizableAsyncLoadingIcon(ResizableIcon.Factory sourceFactory) {
        this.sourceFactory = sourceFactory;
        this.listenerList = new EventListenerList();
    }

    protected abstract void makeColorized();

    @Override
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
        this.currDelegate = this.sourceFactory.createNewIcon();
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
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (this.currColorized != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.translate(x, y);
            double scaleFactor = NeonCortex.getScaleFactor(c);
            NeonCortex.drawImageWithScale(g2d, scaleFactor, this.currColorized, 0, 0);
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
