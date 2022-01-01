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
package org.pushingpixels.radiance.demo.component.icon;

import org.pushingpixels.radiance.common.api.AsynchronousLoadListener;
import org.pushingpixels.radiance.common.api.AsynchronousLoading;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Helper class to load images and expose them as icons of dynamic size.
 *
 * @author Kirill Grouchnikov
 */
abstract class ImageWrapperIcon implements Icon, AsynchronousLoading {
    /**
     * The original image.
     */
    protected BufferedImage originalImage;

    /**
     * The input stream of the original image.
     */
    protected InputStream imageInputStream;

    /**
     * The input stream of the original image.
     */
    protected Image image;

    /**
     * Contains all precomputed images.
     */
    protected Map<String, BufferedImage> cachedImages;

    /**
     * The width of the current image.
     */
    protected int width;

    /**
     * The height of the current image.
     */
    protected int height;

    /**
     * The listeners.
     */
    protected EventListenerList listenerList;

    /**
     * Create a new image-wrapper icon.
     *
     * @param inputStream The input stream to read the image from.
     * @param w           The width of the icon.
     * @param h           The height of the icon.
     */
    public ImageWrapperIcon(InputStream inputStream, int w, int h) {
        this.imageInputStream = inputStream;
        this.width = w;
        this.height = h;
        this.listenerList = new EventListenerList();
        this.cachedImages = new LinkedHashMap<String, BufferedImage>() {
            @Override
            protected boolean removeEldestEntry(
                    Map.Entry<String, BufferedImage> eldest) {
                return size() > 5;
            }

        };
        this.renderImage(this.width, this.height);
    }

    /**
     * Create a new image-wrapper icon.
     *
     * @param image The original image.
     * @param w     The width of the icon.
     * @param h     The height of the icon.
     */
    public ImageWrapperIcon(Image image, int w, int h) {
        this.image = image;
        this.width = w;
        this.height = h;
        this.listenerList = new EventListenerList();
        this.cachedImages = new LinkedHashMap<String, BufferedImage>() {
            @Override
            protected boolean removeEldestEntry(
                    Map.Entry<String, BufferedImage> eldest) {
                return size() > 5;
            }

        };
        this.renderImage(this.width, this.height);
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
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        BufferedImage image = this.cachedImages.get(this.getIconWidth() + ":"
                + this.getIconHeight());
        if (image != null) {
            double scale = RadianceCommonCortex.getScaleFactor(null);
            int dx = (this.width - (int) (image.getWidth() / scale)) / 2;
            int dy = (this.height - (int) (image.getHeight() / scale)) / 2;
            RadianceCommonCortex.drawImageWithScale(g, scale, image, x + dx, y + dy);
        }
    }

    /**
     * Sets the preferred size for <code>this</code> icon. The rendering is
     * scheduled automatically.
     *
     * @param dim Preferred size.
     */
    public synchronized void setPreferredSize(Dimension dim) {
        if ((dim.width == this.width) && (dim.height == this.height))
            return;
        this.width = dim.width;
        this.height = dim.height;

        this.renderImage(this.width, this.height);
    }

    /**
     * Renders the image.
     *
     * @param renderWidth  Requested rendering width.
     * @param renderHeight Requested rendering height.
     */
    protected synchronized void renderImage(final int renderWidth,
            final int renderHeight) {
        String key = renderWidth + ":" + renderHeight;
        if (this.cachedImages.containsKey(key)) {
            fireAsyncCompleted(true);
            return;
        }

        SwingWorker<BufferedImage, Void> worker = new SwingWorker<BufferedImage, Void>() {
            @Override
            protected BufferedImage doInBackground() throws Exception {
                if (imageInputStream != null) {
                    synchronized (imageInputStream) {
                        if (originalImage == null) {
                            // read original image
                            originalImage = ImageIO.read(imageInputStream);
                        }
                    }
                } else {
                    originalImage = RadianceCommonCortex.getBlankUnscaledImage(image.getWidth(null),
                            image.getHeight(null));
                    Graphics g = originalImage.createGraphics();
                    g.drawImage(image, 0, 0, null);
                    g.dispose();
                }

                BufferedImage result = originalImage;
                float scaleX = (float) originalImage.getWidth()
                        / (float) renderWidth;
                float scaleY = (float) originalImage.getHeight()
                        / (float) height;

                float scale = Math.max(scaleX, scaleY);
                if (scale > 1.0f) {
                    int finalWidth = (int) (originalImage.getWidth() / scale);
                    result = RadianceCommonCortex.createThumbnail(RadianceCommonCortex.getScaleFactor(null),
                            originalImage, finalWidth);
                }

                return result;
            }

            @Override
            protected void done() {
                try {
                    BufferedImage bufferedImage = get();
                    cachedImages.put(renderWidth + ":" + renderHeight, bufferedImage);
                    fireAsyncCompleted(true);
                } catch (Exception exc) {
                    fireAsyncCompleted(false);
                }
            }
        };
        worker.execute();
    }

    /**
     * Fires the asynchronous load event.
     *
     * @param event Event object.
     */
    protected void fireAsyncCompleted(Boolean event) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == AsynchronousLoadListener.class) {
                ((AsynchronousLoadListener) listeners[i + 1]).completed(event);
            }
        }
    }

    @Override
    public synchronized boolean isLoading() {
        BufferedImage image = this.cachedImages.get(this.getIconWidth() + ":"
                + this.getIconHeight());
        return (image == null);
    }
}
