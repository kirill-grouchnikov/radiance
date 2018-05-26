/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.samples.substance.cookbook;

import com.jhlabs.image.BlurFilter;
import com.jhlabs.image.CompoundFilter;
import com.jhlabs.image.InvertFilter;
import org.pushingpixels.flamingo.api.common.icon.FilteredResizableIcon;
import org.pushingpixels.neon.icon.ResizableIcon;

import java.awt.*;
import java.awt.image.BufferedImageOp;
import java.awt.image.Kernel;

public class EchoResizableIcon implements ResizableIcon {
    private ResizableIcon echo;

    private ResizableIcon original;

    static BufferedImageOp iconShadowFilter;
    {
        BlurFilter blurFilter = new BlurFilter();
        blurFilter.setUseAlpha(true);
        int kernelSide = 3;
        float[] kernelData = new float[kernelSide * kernelSide];
        for (int i = 0; i < kernelData.length; i++) {
            kernelData[i] = 1.0f;
        }
        blurFilter.setKernel(new Kernel(kernelSide, kernelSide, kernelData));
        iconShadowFilter = new CompoundFilter(blurFilter, new InvertFilter());
    }

    public EchoResizableIcon(ResizableIcon original) {
        this.original = original;
        this.echo = new FilteredResizableIcon(original, iconShadowFilter);
    }

    @Override
    public void setDimension(Dimension newDimension) {
        this.original.setDimension(newDimension);
        this.echo.setDimension(newDimension);
    }

    @Override
    public int getIconHeight() {
        return this.original.getIconHeight();
    }

    @Override
    public int getIconWidth() {
        return this.original.getIconWidth();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        this.echo.paintIcon(c, g, x, y);
        this.original.paintIcon(c, g, x, y);
    }

}