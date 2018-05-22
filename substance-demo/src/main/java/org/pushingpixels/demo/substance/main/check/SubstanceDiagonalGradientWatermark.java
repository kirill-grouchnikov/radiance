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
package org.pushingpixels.demo.substance.main.check;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.watermark.SubstanceWatermark;

/**
 * Implementation of {@link org.pushingpixels.substance.api.watermark.SubstanceWatermark}, drawing
 * diagonal gradient.
 * 
 * @author Kirill Grouchnikov
 */
public class SubstanceDiagonalGradientWatermark implements SubstanceWatermark {
    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.substance.watermark.SubstanceWatermark#drawWatermarkImage(java
     * .awt.Graphics, int, int, int, int)
     */
    public void drawWatermarkImage(Graphics g, Component c, int x, int y, int width, int height) {
        if (c != null)
            if (!c.isDisplayable() || !c.isShowing())
                return;

        Component parent = c;
        if (parent != null) {
            while (parent.getParent() != null)
                parent = parent.getParent();
        }
        if (!parent.isShowing())
            return;

        int dx = (parent != null) ? c.getLocationOnScreen().x - parent.getLocationOnScreen().x : 0;
        int dy = (parent != null) ? c.getLocationOnScreen().y - parent.getLocationOnScreen().y : 0;
        int dw = (parent != null) ? parent.getWidth() : width;
        int dh = (parent != null) ? parent.getHeight() : height;

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setPaint(new GradientPaint(x - dx, y - dy, Color.gray, x - dx + dw, y - dy + dh,
                SubstanceCortex.ComponentScope.getCurrentSkin(c)
                        .getColorScheme(c, ComponentState.ENABLED).getMidColor()));
        graphics.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
        graphics.fillRect(x, y, width, height);

        graphics.dispose();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.substance.watermark.SubstanceWatermark#updateWatermarkImage
     * (org.pushingpixels.substance.skin.SubstanceSkin)
     */
    public boolean updateWatermarkImage(SubstanceSkin skin) {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.substance.api.watermark.SubstanceWatermark#previewWatermark
     * (java.awt.Graphics, org.pushingpixels.substance.api.SubstanceSkin, int, int, int, int)
     */
    @Override
    public void previewWatermark(Graphics g, SubstanceSkin skin, int x, int y, int width,
            int height) {
        this.drawWatermarkImage(g, null, x, y, width, height);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.substance.watermark.SubstanceWatermark#getDisplayName()
     */
    public String getDisplayName() {
        return "Diagonal Gradient";
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.pushingpixels.substance.watermark.SubstanceWatermark#dispose()
     */
    public void dispose() {
    }
}
