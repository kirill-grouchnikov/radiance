/*
 * Copyright (c) 2005-2018 Radiance Neon Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Radiance Neon Kirill Grouchnikov nor the names of
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
package org.pushingpixels.neon.icon;

import org.pushingpixels.neon.NeonUtil;
import org.pushingpixels.neon.internal.ColorFilter;
import org.pushingpixels.neon.internal.contrib.intellij.JBHiDPIScaledImage;
import org.pushingpixels.neon.internal.contrib.intellij.UIUtil;

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
 * @see NeonIcon
 */
public class NeonIconUIResource implements ResizableIcon, IsHiDpiAware, UIResource {
    private final double factor;
    private final boolean isHiDpiAwareSource;

    private BufferedImage imageSource;
    private Icon iconSource;

    private int width;
    private int height;

    public NeonIconUIResource(BufferedImage image) {
        this.imageSource = image;
        this.factor = UIUtil.getScaleFactor();
        this.isHiDpiAwareSource = image instanceof JBHiDPIScaledImage;
        this.width = getInternalWidth();
        this.height = getInternalHeight();
    }

    public NeonIconUIResource(Icon icon) {
        if (icon instanceof NeonIconUIResource) {
            throw new IllegalArgumentException(
                    "Can't wrap another instance of NeonIconUIResource");
        }
        this.iconSource = icon;
        this.factor = UIUtil.getScaleFactor();
        this.isHiDpiAwareSource = (icon instanceof IsHiDpiAware)
                && ((IsHiDpiAware) icon).isHiDpiAware();
        this.width = getInternalWidth();
        this.height = getInternalHeight();
    }

    @Override
    public void setDimension(Dimension newDimension) {
        this.width = newDimension.width;
        this.height = newDimension.height;
        if (this.iconSource instanceof ResizableIcon) {
            ((ResizableIcon) this.iconSource).setDimension(newDimension);
        }
    }

    @Override
    public boolean isHiDpiAware() {
        return this.isHiDpiAwareSource;
    }

    @Override
    public synchronized void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2d = (Graphics2D) g.create();
        int dx = (this.width - this.getInternalWidth()) / 2;
        int dy = (this.height - this.getInternalHeight()) / 2;
        g2d.translate(x + dx, y + dy);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        if (this.imageSource != null) {
            g2d.drawImage(this.imageSource, 0, 0, (int) (this.imageSource.getWidth() / this.factor),
                    (int) (this.imageSource.getHeight() / this.factor), null);
        } else if (this.iconSource != null) {
            this.iconSource.paintIcon(c, g2d, 0, 0);
        }
        g2d.dispose();
    }

    private int getInternalWidth() {
        if (this.imageSource != null) {
            return (int) (this.imageSource.getWidth() / this.factor);
        }
        if (this.iconSource != null) {
            return (int) (this.iconSource.getIconWidth()
                    / (this.isHiDpiAwareSource ? 1 : this.factor));
        }
        return 0;
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    private int getInternalHeight() {
        if (this.imageSource != null) {
            return (int) (this.imageSource.getHeight() / this.factor);
        }
        if (this.iconSource != null) {
            return (int) (this.iconSource.getIconHeight()
                    / (this.isHiDpiAwareSource ? 1 : this.factor));
        }
        return 0;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }

    public BufferedImage toImage() {
        BufferedImage result = NeonUtil.getBlankImage(this.getIconWidth(),
                this.getIconHeight());
        this.paintIcon(null, result.getGraphics(), 0, 0);
        return result;
    }

    public NeonIconUIResource colorize(Color color) {
        return new NeonIconUIResource(new ColorFilter(color).filter(this.toImage(), null));
    }

    public NeonIconUIResource colorize(Color color, float alpha) {
        return new NeonIconUIResource(
                new ColorFilter(new Color(color.getRed(), color.getGreen(), color.getBlue(), (int) (alpha * 255)))
                        .filter(this.toImage(), null));
    }

}
