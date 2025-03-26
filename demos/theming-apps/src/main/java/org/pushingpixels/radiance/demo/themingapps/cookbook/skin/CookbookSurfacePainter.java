/*
 * Copyright (c) 2005-2025 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.demo.themingapps.cookbook.skin;

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.ContainerColorTokens;
import org.pushingpixels.radiance.theming.api.palette.ContainerColorTokensSingleColorQuery;
import org.pushingpixels.radiance.theming.api.painter.decoration.RadianceDecorationPainter;
import org.pushingpixels.radiance.theming.api.painter.surface.FractionBasedSurfacePainter;
import org.pushingpixels.radiance.theming.api.painter.surface.RadianceSurfacePainter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CookbookSurfacePainter implements RadianceSurfacePainter {
    private RadianceSurfacePainter delegate;

    private RadianceSurfacePainter flatDelegate;

    public CookbookSurfacePainter() {
        this.delegate = new FractionBasedSurfacePainter("Cookbook Regular",
            new float[] {0.0f, 0.6f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurfaceBright,
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow});

        this.flatDelegate = new FractionBasedSurfacePainter("Cookbook Flat",
            new float[] {0.0f, 0.5f, 1.0f},
            new ContainerColorTokensSingleColorQuery[] {
                ContainerColorTokens::getContainerSurfaceHigh,
                ContainerColorTokens::getContainerSurface,
                ContainerColorTokens::getContainerSurfaceLow});
    }

    @Override
    public void paintContourBackground(Graphics g, Component comp, float width, float height,
        Shape contour, ContainerColorTokens colorTokens) {
        if (comp instanceof JScrollBar) {
            this.flatDelegate.paintContourBackground(g, comp, width, height, contour, colorTokens);
            return;
        }

        this.delegate.paintContourBackground(g, comp, width, height, contour, colorTokens);

        if (comp instanceof JCommandButton) {
            // special case - overlay the buttons with the watermark image
            // that corresponds to the decoration area of that button
            JCommandButton commandButton = (JCommandButton) comp;
            if (!commandButton.getActionModel().isSelected()
                && !commandButton.getActionModel().isPressed()
                && !commandButton.getActionModel().isRollover()
                && (commandButton.getPresentationModel().getBackgroundAppearanceStrategy() !=
                    RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT)) {
                DecorationAreaType decorationAreaType = ComponentOrParentChainScope
                    .getDecorationType(comp);
                RadianceDecorationPainter decoPainter = RadianceThemingCortex.ComponentScope
                    .getCurrentSkin(comp).getDecorationPainter();
                if (decoPainter instanceof CookbookDecorationPainter) {
                    BufferedImage watermark = ((CookbookDecorationPainter) decoPainter)
                        .getWatermarkImage(decorationAreaType);
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.clip(contour);
                    g2d.setComposite(AlphaComposite.SrcOver.derive(0.7f));
                    int dx = comp.getLocationOnScreen().x;
                    int dy = comp.getLocationOnScreen().y;
                    g2d.drawImage(watermark, -dx, -dy, null);
                }
            }
        }
    }

    @Override
    public String getDisplayName() {
        return "Cookbook";
    }

}
