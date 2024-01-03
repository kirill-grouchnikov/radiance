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
package org.pushingpixels.radiance.component.api.common.icon;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;

import java.awt.*;

/**
 * Decorator icon that layers icons one on top of the other. The original icons
 * are drawn and resized together as one layered stack.
 *
 * @author Kirill Grouchnikov
 */
public class LayeredIcon implements RadianceIcon {
    /**
     * The layer icons.
     */
    protected RadianceIcon[] layers;

    /**
     * Creates a new layered icon.
     *
     * @param layers Layer icons.
     */
    public LayeredIcon(RadianceIcon... layers) {
        this.layers = layers;
    }

    @Override
    public void setDimension(Dimension newDimension) {
        for (RadianceIcon layer : this.layers) {
            layer.setDimension(newDimension);
        }
    }

    @Override
    public boolean supportsColorFilter() {
        for (RadianceIcon layer: this.layers) {
            if (!layer.supportsColorFilter()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        for (RadianceIcon layer : this.layers) {
            layer.setColorFilter(colorFilter);
        }
    }

    @Override
    public int getIconHeight() {
        return layers[0].getIconHeight();
    }

    @Override
    public int getIconWidth() {
        return layers[0].getIconWidth();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        for (RadianceIcon layer : layers) {
            layer.paintIcon(c, g, x, y);
        }
    }
}
