/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.themingapps.cookbook.panels;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;

import javax.swing.*;
import java.awt.*;

public class ResizeGripper extends JComponent {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(8, 16);
    }

    @Override
    protected void paintComponent(Graphics g) {
        ContainerColorTokens tokens = RadianceThemingCortex.ComponentScope.getCurrentSkin(this)
            .getNeutralContainerTokens(this);

        Graphics2D g2d = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(g2d, 0, 0, getWidth(), getHeight(),
            (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                graphics1X.setStroke(new BasicStroke(2.0f));

                Color primary = tokens.getContainerOutlineVariant();
                Color secondary = tokens.getComplementaryContainerOutline();

                int x = scaledWidth - 3;
                for (int i = 0; i < 3; i++) {
                    graphics1X.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.75f));
                    graphics1X.setColor(primary);
                    graphics1X.drawLine(x, 0, x, scaledHeight);

                    graphics1X.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.45f));
                    graphics1X.setColor(secondary);
                    graphics1X.drawLine(x + 2, 0, x + 2, scaledHeight);

                    x -= (int) (scaleFactor * 4);
                }
            }
        );
        g2d.dispose();
    }
}
