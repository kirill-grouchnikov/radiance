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
package org.pushingpixels.radiance.theming.internal.utils;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

import javax.swing.*;
import javax.swing.plaf.UIResource;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * A {@link UIResource} variant of the resizable high-DPI aware implementation of the core
 * {@link Icon} interface that maintains crisp pixel-perfect appearance of icons across the entire
 * app.
 *
 * @author Kirill Grouchnikov
 */
public class ScaleAwareImageWrapperIcon implements RadianceIcon, UIResource {
    private final double scale;

    private BufferedImage imageSource;

    private int width;
    private int height;

    public ScaleAwareImageWrapperIcon(BufferedImage image, double scale) {
        this.imageSource = image;
        this.scale = scale;
        this.width = getInternalWidth();
        this.height = getInternalHeight();
    }

    @Override
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
    }

    @Override
    public boolean supportsColorFilter() {
        return false;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2d = (Graphics2D) g.create();
        int dx = (this.width - this.getInternalWidth()) / 2;
        int dy = (this.height - this.getInternalHeight()) / 2;
        g2d.translate(x + dx, y + dy);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g2d.drawImage(this.imageSource, 0, 0, (int) (this.imageSource.getWidth() / this.scale),
                (int) (this.imageSource.getHeight() / this.scale), null);
        g2d.dispose();
    }

    private int getInternalWidth() {
        return (int) (this.imageSource.getWidth() / this.scale);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    private int getInternalHeight() {
        return (int) (this.imageSource.getHeight() / this.scale);
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
