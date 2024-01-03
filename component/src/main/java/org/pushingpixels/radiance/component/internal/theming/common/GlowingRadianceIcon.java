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
package org.pushingpixels.radiance.component.internal.theming.common;

import org.pushingpixels.radiance.common.api.AsynchronousLoading;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.internal.animation.IconGlowTracker;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedHashMap;
import java.util.Map;

public class GlowingRadianceIcon implements RadianceIcon {
    /**
     * Image cache to speed up rendering.
     */
    private Map<String, BufferedImage> cachedImages;

    /**
     * The main (pre-filtered) icon.
     */
    private RadianceIcon delegate;

    private IconGlowTracker iconGlowTracker;

    public GlowingRadianceIcon(RadianceIcon delegate, IconGlowTracker iconGlowTracker) {
        this.delegate = delegate;
        this.iconGlowTracker = iconGlowTracker;
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
    public boolean supportsColorFilter() {
        return delegate.supportsColorFilter();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        delegate.setColorFilter(colorFilter);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (this.delegate == null)
            return;
        double scale = RadianceCommonCortex.getScaleFactor(c);
        float fadePos = this.iconGlowTracker.getIconGlowPosition();
        String key = scale + ":" + fadePos + ":" + this.getIconWidth() + ":" + this.getIconHeight();
        if (!this.cachedImages.containsKey(key)) {
            // check if loading
            if (this.delegate instanceof AsynchronousLoading) {
                AsynchronousLoading asyncDelegate = (AsynchronousLoading) this.delegate;
                // if the delegate is still loading - do nothing
                if (asyncDelegate.isLoading()) {
                    return;
                }
            }
            BufferedImage offscreen = RadianceCoreUtilities.getBlankImage(scale,
                    this.getIconWidth(), this.getIconHeight());
            Graphics2D g2d = offscreen.createGraphics();
            this.delegate.paintIcon(c, g2d, 0, 0);
            g2d.dispose();

            int pixelWidth = offscreen.getWidth();
            int pixelHeight = offscreen.getHeight();
            for (int i = 0; i < pixelWidth; i++) {
                for (int j = 0; j < pixelHeight; j++) {
                    int rgba = offscreen.getRGB(i, j);
                    int transp = (rgba >>> 24) & 0xFF;
                    double coef = Math.sin(2.0 * Math.PI * fadePos / 2.0) / 3.0;
                    Color newColor = (coef >= 0.0)
                            ? RadianceColorUtilities.getLighterColor(new Color(rgba), coef)
                            : RadianceColorUtilities.getDarkerColor(new Color(rgba), -coef);
                    offscreen.setRGB(i, j, (transp << 24)
                            | (newColor.getRed() << 16)
                            | (newColor.getGreen() << 8) | newColor.getBlue());
                }
            }
            this.cachedImages.put(key, offscreen);
        }
        BufferedImage toDraw = this.cachedImages.get(key);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(x, y);
        RadianceCommonCortex.drawImageWithScale(g2d, scale, toDraw, 0, 0);
        g2d.dispose();
    }
}
