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
package org.pushingpixels.radiance.theming.api.decorator.rootpane;

import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;

import java.awt.*;

public class DefaultRootPaneDecorator implements RadianceRootPaneDecorator {
    // Default border thickness in unscaled pixels.
    private static final int BORDER_THICKNESS = 4;

    // Default insets in unscaled pixels.
    private static final Insets INSETS = new Insets(BORDER_THICKNESS, BORDER_THICKNESS,
        BORDER_THICKNESS, BORDER_THICKNESS);

    @Override
    public Insets getRootPaneBorderInsets() {
        return INSETS;
    }

    @Override
    public void paintRootPaneBorder(Graphics2D graphics, Component comp, int width, int height,
        double scaleFactor, ContainerColorTokens colorTokens) {

        int insideThickness = (int) (BORDER_THICKNESS * scaleFactor);

        // Inner part, as surface
        graphics.setColor(colorTokens.getContainerSurface());
        // Left edge
        graphics.fillRect(0, 0, insideThickness, height);
        // Right edge
        graphics.fillRect(width - 1 - insideThickness, 0, insideThickness, height);
        // Top edge
        graphics.fillRect(0, 0, width, insideThickness);
        // Bottom edge
        graphics.fillRect(0, height - 1 - insideThickness, width, insideThickness);

        // top and left border as 40% mix of outline variant and outline
        graphics.setColor(RadianceColorUtilities.getInterpolatedColor(
            colorTokens.getContainerOutlineVariant(),
            colorTokens.getContainerOutline(), 0.4f));
        // Top edge
        graphics.drawLine(0, 0, width, 0);
        graphics.drawLine(0, 1, width, 1);
        // Left edge
        graphics.drawLine(0, 0, 0, height);
        graphics.drawLine(1, 0, 1, height);

        // bottom and right border as outline
        graphics.setColor(colorTokens.getContainerOutline());
        // Bottom edge
        graphics.drawLine(0, height - 1, width, height - 1);
        graphics.drawLine(0, height - 2, width, height - 2);
        // Right edge
        graphics.drawLine(width - 1, 0, width - 1, height);
        graphics.drawLine(width - 2, 0, width - 2, height);
    }
}
