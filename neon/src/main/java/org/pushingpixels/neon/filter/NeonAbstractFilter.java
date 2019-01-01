/*
 * $Id: AbstractFilter.java 2254 2009-10-15 04:00:12Z kirillcool $
 *
 * Dual-licensed under LGPL (Sun and Romain Guy) and BSD (Romain Guy).
 *
 * Copyright 2005 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * Copyright (c) 2006 Romain Guy romain.guy@mac.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. The name of the author may not be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.pushingpixels.neon.filter;

import org.pushingpixels.neon.internal.contrib.intellij.JBHiDPIScaledImage;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

/**
 * <p>
 * Provides an abstract implementation of the <code>BufferedImageOp</code>
 * interface. This class can be used to created new image filters based on
 * <code>BufferedImageOp</code>.
 * </p>
 *
 * @author Romain Guy romain.guy@mac.com
 */

public abstract class NeonAbstractFilter implements BufferedImageOp {
    @Override
    public Rectangle2D getBounds2D(BufferedImage src) {
        return new Rectangle(0, 0, src.getWidth(), src.getHeight());
    }

    public static BufferedImage createCompatibleDestImageForFilter(BufferedImage src,
            ColorModel destCM) {
        if (destCM == null) {
            destCM = src.getColorModel();
        }

        WritableRaster raster = destCM.createCompatibleWritableRaster(
                src.getWidth(), src.getHeight());
        if (src instanceof JBHiDPIScaledImage) {
            return JBHiDPIScaledImage.create(destCM, raster, destCM.isAlphaPremultiplied());
        } else {
            return new BufferedImage(destCM, raster, destCM.isAlphaPremultiplied(), null);
        }
    }

    @Override
    public BufferedImage createCompatibleDestImage(BufferedImage src,
            ColorModel destCM) {
        return createCompatibleDestImageForFilter(src, destCM);
    }

    @Override
    public Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
        return (Point2D) srcPt.clone();
    }

    @Override
    public RenderingHints getRenderingHints() {
        return null;
    }

    protected int[] getPixels(BufferedImage img, int x, int y, int w, int h,
            int[] pixels) {
        if (w == 0 || h == 0) {
            return new int[0];
        }

        if (pixels == null) {
            pixels = new int[w * h];
        } else if (pixels.length < w * h) {
            throw new IllegalArgumentException("pixels array must have a length >= " + w * h);
        }

        int imageType = img.getType();
        if (imageType == BufferedImage.TYPE_INT_ARGB || imageType == BufferedImage.TYPE_INT_RGB) {
            Raster raster = img.getRaster();
            return (int[]) raster.getDataElements(x, y, w, h, pixels);
        }

        // Unmanages the image
        return img.getRGB(x, y, w, h, pixels, 0, w);
    }

    /**
     * <p>
     * Writes a rectangular area of pixels in the destination
     * <code>BufferedImage</code>. Calling this method on an image of type
     * different from <code>BufferedImage.TYPE_INT_ARGB</code> and
     * <code>BufferedImage.TYPE_INT_RGB</code> will unmanage the image.
     * </p>
     *
     * @param img    the destination image
     * @param x      the x location at which to start storing pixels
     * @param y      the y location at which to start storing pixels
     * @param w      the width of the rectangle of pixels to store
     * @param h      the height of the rectangle of pixels to store
     * @param pixels an array of pixels, stored as integers
     * @throws IllegalArgumentException is <code>pixels</code> is non-null and of length &lt; w*h
     */
    protected void setPixels(BufferedImage img, int x, int y, int w, int h,
            int[] pixels) {
        if (pixels == null || w == 0 || h == 0) {
            return;
        } else if (pixels.length < w * h) {
            throw new IllegalArgumentException("pixels array must have a length >= " + w * h);
        }

        int imageType = img.getType();
        if (imageType == BufferedImage.TYPE_INT_ARGB || imageType == BufferedImage.TYPE_INT_RGB) {
            WritableRaster raster = img.getRaster();
            raster.setDataElements(x, y, w, h, pixels);
        } else {
            // Unmanages the image
            img.setRGB(x, y, w, h, pixels, 0, w);
        }
    }
}
