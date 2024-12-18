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
package org.pushingpixels.radiance.demo.theming.main.palette;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokens;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ContainerPreview extends JPanel {
    private ContainerColorTokens colorTokens;

    public ContainerPreview(ContainerColorTokens colorTokens, String text) {
        this.colorTokens = colorTokens;

        this.setLayout(new BorderLayout());
        this.setBorder(new EmptyBorder(4, 4, 4, 4));

        this.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

                int width = getWidth();
                int height = getHeight();
                int arc = 8;
                int strokeThickness = 2;

                g2d.setColor(colorTokens.getContainer());
                g2d.fillRoundRect(strokeThickness, strokeThickness,
                    width - 2 * strokeThickness + 1, height - 2 * strokeThickness + 1, arc, arc);

                g2d.setColor(colorTokens.getContainerOutline());
                g2d.setStroke(new BasicStroke(strokeThickness));
                g2d.drawRoundRect(1, 1, width - 2, height - 2, arc, arc);

                Font font =
                    RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().getTitleFont();
                g2d.setFont(font);
                RadianceCommonCortex.installDesktopHints(g2d, font);
                FontMetrics fm = g2d.getFontMetrics();
                int textWidth = fm.stringWidth(text);

                g2d.setColor(colorTokens.getOnContainer());
                g2d.drawString(text, (width - textWidth) / 2,
                    (height - fm.getHeight()) / 2 + fm.getAscent());

                g2d.dispose();
            }
        }, BorderLayout.CENTER);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(220, 50);
    }
}
