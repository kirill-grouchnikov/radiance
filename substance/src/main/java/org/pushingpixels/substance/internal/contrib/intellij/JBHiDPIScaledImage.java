/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pushingpixels.substance.internal.contrib.intellij;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

import org.pushingpixels.substance.api.icon.IsHiDpiAware;

/**
 * @author Konstantin Bulenkov
 */
public class JBHiDPIScaledImage extends BufferedImage implements IsHiDpiAware {
    private final Image myImage;
    private int myWidth; // == myImage.width / scale
    private int myHeight; // == myImage.height / scale
    private boolean ignoreScaling;

    public JBHiDPIScaledImage(int width, int height, int type) {
        this(null, (int) (UIUtil.getScaleFactor() * width),
                (int) (UIUtil.getScaleFactor() * height), type);
    }

    public JBHiDPIScaledImage(Image image, int width, int height, int type) {
        // In case there's a delegate image, create a dummy wrapper image of 1x1
        // size
        super(image != null ? 1 : width, image != null ? 1 : height, type);
        myImage = image;
        myWidth = width;
        myHeight = height;
    }

    public JBHiDPIScaledImage(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied,
            Hashtable<?, ?> properties, int width, int height) {
        super(cm, raster, isRasterPremultiplied, properties);
        myImage = null;
        myWidth = width;
        myHeight = height;
    }

    public void setIgnoreScaling() {
        this.ignoreScaling = true;
    }

    @Override
    public boolean isHiDpiAware() {
        return true;
    }

    public Image getDelegate() {
        return myImage;
    }

    @Override
    public int getWidth() {
        return myImage != null ? myWidth : super.getWidth();
    }

    @Override
    public int getHeight() {
        return myImage != null ? myHeight : super.getHeight();
    }

    @Override
    public int getWidth(ImageObserver observer) {
        return myImage != null ? myWidth : super.getWidth(observer);
    }

    @Override
    public int getHeight(ImageObserver observer) {
        return myImage != null ? myHeight : super.getHeight(observer);
    }

    @Override
    public Graphics2D createGraphics() {
        Graphics2D g = super.createGraphics();
        if (myImage == null) {
            if (!this.ignoreScaling) {
                double scaleFactor = UIUtil.getScaleFactor();
                g.scale(scaleFactor, scaleFactor);
            }
            return new HiDPIScaledGraphics(g);
        }
        return g;
    }
}
