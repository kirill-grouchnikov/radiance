/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.extras.api.painterpack.fill;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;

import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;

/**
 * Fill painter that returns images with flat appearance and wavy color areas. This class is part of
 * officially supported API.
 * 
 * @author Kirill Grouchnikov
 */
public class WaveFillPainter implements SubstanceFillPainter {
    @Override
    public String getDisplayName() {
        return "Wave";
    }

    @Override
    public void paintContourBackground(Graphics g, Component comp, float width, float height,
            Shape contour, boolean isFocused, SubstanceColorScheme fillScheme, boolean hasShine) {
        int iWidth = (int) Math.ceil(width);
        int iHeight = (int) Math.ceil(height);
        // create rectangular background and later draw it on
        // result image with contour clip.
        BufferedImage rectangular = SubstanceCoreUtilities.getBlankImage(iWidth, iHeight);
        Graphics2D rgraphics = (Graphics2D) rectangular.getGraphics();

        Color lightFillColor = fillScheme.getUltraLightColor();
        Color midFillColor = fillScheme.getLightColor();
        Color darkFillColor = fillScheme.getMidColor();

        // Fill background
        GradientPaint gradientTop = new GradientPaint(0, 0, lightFillColor, width / 4, height / 2,
                midFillColor);
        GeneralPath clipTop = new GeneralPath();
        clipTop.moveTo(0, 0);
        clipTop.lineTo(width, 0);
        clipTop.curveTo(5 * width / 6, height / 3, 3 * width / 4, height / 2, width / 2,
                height / 2);
        clipTop.curveTo(width / 3, height / 2, width / 4, height, 0, 7 * height / 8);
        clipTop.lineTo(0, 0);

        rgraphics.setClip(clipTop);
        rgraphics.setPaint(gradientTop);
        rgraphics.fillRect(0, 0, iWidth, iHeight);

        GradientPaint gradientBottom = new GradientPaint(2 * width / 3, 2 * height / 3,
                darkFillColor, width, height, midFillColor);

        GeneralPath clipBottom = new GeneralPath();
        clipBottom.moveTo(0, height);
        clipBottom.lineTo(width, height);
        clipBottom.lineTo(width, 0);
        clipBottom.curveTo(5 * width / 6, height / 3, 3 * width / 4, height / 2, width / 2,
                height / 2);
        clipBottom.curveTo(width / 3, height / 2, width / 4, height, 0, 7 * height / 8);
        clipBottom.lineTo(0, height);

        rgraphics.setClip(clipBottom);
        rgraphics.setPaint(gradientBottom);
        rgraphics.fillRect(0, 0, iWidth, iHeight);

        rgraphics.setClip(null);
        GeneralPath mid = new GeneralPath();
        mid.moveTo(width, 0);
        mid.curveTo(5 * width / 6, height / 3, 3 * width / 4, height / 2, width / 2, height / 2);
        mid.curveTo(width / 3, height / 2, width / 4, height, 0, 7 * height / 8);
        rgraphics.draw(mid);

        Graphics2D graphics = (Graphics2D) g.create();

        graphics.setClip(contour);
        graphics.drawImage(rectangular, 0, 0, null);
        graphics.dispose();
    }
}
