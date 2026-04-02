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
package org.pushingpixels.radiance.theming.internal.utils.border;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.UIResource;
import java.awt.*;

/**
 * Root pane and internal frame border in <b>Radiance</b> look and feel. This class is <b>for
 * internal use only</b>.
 * 
 * @author Kirill Grouchnikov
 */
public class RadiancePaneBorder extends AbstractBorder implements UIResource {
    /**
     * Default border thickness.
     */
    private static final int BORDER_THICKNESS = 4;

    /**
     * Default insets.
     */
    private static final Insets INSETS = new Insets(RadiancePaneBorder.BORDER_THICKNESS,
            RadiancePaneBorder.BORDER_THICKNESS, RadiancePaneBorder.BORDER_THICKNESS,
            RadiancePaneBorder.BORDER_THICKNESS);

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(c);
        if (skin == null) {
            return;
        }

        Component titlePaneComp = RadianceCoreUtilities.getTitlePaneComponent(
            SwingUtilities.windowForComponent(c));
        ContainerColorTokens titleContainerTokens = skin.getNeutralContainerTokens(titlePaneComp);

        Graphics2D graphics = (Graphics2D) g.create();
        graphics.translate(x, y);

        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, w, h,
            (graphics1X, scaleX, scaleY, scaledWidth, scaledHeight, scaleFactor) -> {

                int insideThickness = (int) (BORDER_THICKNESS * scaleFactor);

                // Inner part, as surface
                graphics1X.setColor(titleContainerTokens.getContainerSurface());
                // Left edge
                graphics1X.fillRect(0, 0, insideThickness, scaledHeight);
                // Right edge
                graphics1X.fillRect(scaledWidth - 1 - insideThickness, 0, insideThickness, scaledHeight);
                // Top edge
                graphics1X.fillRect(0, 0, scaledWidth, insideThickness);
                // Bottom edge
                graphics1X.fillRect(0, scaledHeight - 1 - insideThickness, scaledWidth, insideThickness);

                // top and left border as 40% mix of outline variant and outline
                graphics1X.setColor(RadianceColorUtilities.getInterpolatedColor(
                    titleContainerTokens.getContainerOutlineVariant(),
                    titleContainerTokens.getContainerOutline(), 0.4f));
                // Top edge
                graphics1X.drawLine(0, 0, scaledWidth, 0);
                graphics1X.drawLine(0, 1, scaledWidth, 1);
                // Left edge
                graphics1X.drawLine(0, 0, 0, scaledHeight);
                graphics1X.drawLine(1, 0, 1, scaledHeight);

                // bottom and right border as outline
                graphics1X.setColor(titleContainerTokens.getContainerOutline());
                // Bottom edge
                graphics1X.drawLine(0, scaledHeight - 1, scaledWidth, scaledHeight - 1);
                graphics1X.drawLine(0, scaledHeight - 2, scaledWidth, scaledHeight - 2);
                // Right edge
                graphics1X.drawLine(scaledWidth - 1, 0, scaledWidth - 1, scaledHeight);
                graphics1X.drawLine(scaledWidth - 2, 0, scaledWidth - 2, scaledHeight);
        });

        graphics.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return RadiancePaneBorder.INSETS;
    }

    @Override
    public Insets getBorderInsets(Component c, Insets newInsets) {
        newInsets.top = RadiancePaneBorder.INSETS.top;
        newInsets.left = RadiancePaneBorder.INSETS.left;
        newInsets.bottom = RadiancePaneBorder.INSETS.bottom;
        newInsets.right = RadiancePaneBorder.INSETS.right;
        return newInsets;
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
