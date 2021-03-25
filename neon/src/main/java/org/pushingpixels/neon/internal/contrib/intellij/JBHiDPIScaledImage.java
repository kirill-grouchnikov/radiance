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
package org.pushingpixels.neon.internal.contrib.intellij;

import java.awt.*;
import java.awt.image.*;

/**
 * @author Konstantin Bulenkov
 */
public class JBHiDPIScaledImage extends BufferedImage {
    private boolean ignoreScaling;
    private double scaleFactor;

    private JBHiDPIScaledImage(double scaleFactor, int width, int height, int type) {
        super(width, height, type);
        this.scaleFactor = scaleFactor;
    }

    private JBHiDPIScaledImage(double scaleFactor, ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied) {
        super(cm, raster, isRasterPremultiplied, null);
        this.scaleFactor = scaleFactor;
    }

    public static JBHiDPIScaledImage create(int width, int height, int type) {
        return create(UIUtil.getScaleFactor(), width, height, type);
    }

    public static JBHiDPIScaledImage create(double scaleFactor, int width, int height, int type) {
        return new JBHiDPIScaledImage(
                scaleFactor,
                (int) Math.ceil((scaleFactor * width)),
                (int) Math.ceil((scaleFactor * height)),
                type);
    }

    public static JBHiDPIScaledImage createUnscaled(int width, int height, int type) {
        JBHiDPIScaledImage result = new JBHiDPIScaledImage(1.0f, width, height, type);
        result.ignoreScaling = true;
        return result;
    }

    public static JBHiDPIScaledImage create(ColorModel cm, WritableRaster raster,
            boolean isRasterPremultiplied) {
        return new JBHiDPIScaledImage(1.0f, cm, raster, isRasterPremultiplied);
    }

    @Override
    public Graphics2D createGraphics() {
        Graphics2D g = super.createGraphics();
        if (!this.ignoreScaling) {
            g.scale(this.scaleFactor, this.scaleFactor);
        }
        return new HiDPIScaledGraphics(g);
    }
}
