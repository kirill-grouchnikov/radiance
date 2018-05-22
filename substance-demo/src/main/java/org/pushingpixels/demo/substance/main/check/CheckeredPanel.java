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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of 
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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.UIManager;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;

final class CheckeredPanel extends ScrollablePanel {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();

        int w = this.getWidth();
        int h = this.getHeight();

        int cols = 1 + w / 10;
        int rows = 1 + h / 10;
        if ((UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel)
                && SubstanceCortex.ComponentScope.getCurrentSkin(this).getActiveColorScheme(
                        ComponentOrParentChainScope.getDecorationType(this)).isDark())
            graphics.setColor(Color.black);
        else
            graphics.setColor(Color.white);
        graphics.fillRect(0, 0, w, h);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (((i + j) % 2) == 0) {
                    float val = (i + j) / 100.f;
                    val -= Math.floor(val);
                    boolean isDark = (UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel)
                            ? SubstanceCortex.ComponentScope.getCurrentSkin(this)
                                    .getActiveColorScheme(
                                            ComponentOrParentChainScope.getDecorationType(this))
                                    .isDark()
                            : false;
                    float brightness = isDark ? 0.1f : 0.9f;
                    float saturation = 0.2f;
                    graphics.setColor(new Color(Color.HSBtoRGB(val, saturation, brightness)));
                    graphics.fillRect(i * 10, j * 10, 10, 10);
                }
            }
        }

        graphics.setColor(Color.gray);
        graphics.setFont(new Font("Arial", Font.PLAIN, 11));
        rows = 1 + h / 25;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < w / 25; j++) {
                graphics.drawString("" + (i + j), j * 25, 25 * i);
            }
        }
        graphics.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1200, 800);
    }
}