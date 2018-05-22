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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;
import javax.swing.UIManager;

import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;

/**
 * A simple panel that paints the current time on itself.
 * 
 * @author Kirill Grouchnikov
 */
public class NumberedPanel extends JPanel {
    /**
     * Panel that paints the current time and has a custom colored background.
     * 
     * @author Kirill Grouchnikov
     */
    protected static class ColoredNumberedPanel extends JPanel {
        /**
         * Panel ID number.
         */
        private int number;

        /**
         * Creates a new panel.
         * 
         * @param number
         *            Panel ID number.
         */
        public ColoredNumberedPanel(int number) {
            this.number = number;
            this.setBackground(new Color(255 - (int) (50.0 * Math.random()),
                    255 - (int) (50.0 * Math.random()), 255 - (int) (50.0 * Math.random())));
        }

        /*
         * (non-Javadoc)
         * 
         * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
         */
        @Override
        protected void paintComponent(Graphics g) {
            int w = this.getWidth();
            int h = this.getHeight();
            Graphics2D graphics = (Graphics2D) g.create();

            if ((UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel)
                    && SubstanceCortex.ComponentScope.getCurrentSkin(this)
                            .getActiveColorScheme(
                                    ComponentOrParentChainScope.getDecorationType(this))
                            .isDark())
                graphics.setColor(Color.black);
            else
                graphics.setColor(Color.white);
            graphics.fillRect(0, 0, w, h);
            graphics.setComposite(AlphaComposite.SrcOver.derive(0.6f));
            graphics.setColor(this.getBackground());
            graphics.fillRect(0, 0, w, h);
            graphics.setComposite(AlphaComposite.SrcOver);
            if ((UIManager.getLookAndFeel() instanceof SubstanceLookAndFeel)
                    && SubstanceCortex.ComponentScope.getCurrentSkin(this)
                            .getActiveColorScheme(
                                    ComponentOrParentChainScope.getDecorationType(this))
                            .isDark())
                graphics.setColor(Color.white);
            else
                graphics.setColor(Color.black);
            int size = Math.min(60, Math.min(w, h) / 2);
            graphics.setFont(new Font("Arial", Font.BOLD, size));
            graphics.drawString("" + number, (w - size) / 2, (h / 2 + size) / 2);

            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
            String currDate = sdf.format(new Date());

            int size2 = Math.min(50, Math.min(w, h) / 3);
            graphics.setFont(new Font("Arial", Font.BOLD, size2));
            int timeLen = graphics.getFontMetrics().stringWidth(currDate);
            graphics.drawString(currDate, (w - timeLen) / 2, (h + size) / 2);

            graphics.dispose();
        }
    }

    /**
     * Creates a new panel.
     * 
     * @param number
     *            Panel ID number.
     */
    public NumberedPanel(int number) {
        this.setLayout(new BorderLayout());
        this.add(new ColoredNumberedPanel(number));
    }
}