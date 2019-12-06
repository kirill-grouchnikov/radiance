/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.demo.spyglass.cookbook.skin;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.ColorSchemeSingleColorQuery;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.decoration.SubstanceDecorationPainter;
import org.pushingpixels.substance.api.painter.fill.FractionBasedFillPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CookbookGradientPainter implements SubstanceFillPainter {
    private SubstanceFillPainter delegate;

    private SubstanceFillPainter flatDelegate;

    public CookbookGradientPainter() {
        this.delegate = new FractionBasedFillPainter("Cookbook Regular",
                new float[] { 0.0f, 0.5f, 1.0f },
                new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.EXTRALIGHT,
                                ColorSchemeSingleColorQuery.MID,
                                ColorSchemeSingleColorQuery.ULTRADARK });
        this.flatDelegate = new FractionBasedFillPainter("Cookbook Flat",
                new float[] { 0.0f, 0.5f, 1.0f },
                new ColorSchemeSingleColorQuery[] { ColorSchemeSingleColorQuery.LIGHT,
                                ColorSchemeSingleColorQuery.MID,
                                ColorSchemeSingleColorQuery.DARK });
    }

    @Override
    public void paintContourBackground(Graphics g, Component comp, float width, float height,
            Shape contour, boolean isFocused, SubstanceColorScheme fillScheme, boolean hasShine) {
        if (comp instanceof JScrollBar) {
            this.flatDelegate.paintContourBackground(g, comp, width, height, contour, isFocused,
                    fillScheme, hasShine);
            return;
        }

        this.delegate.paintContourBackground(g, comp, width, height, contour, isFocused, fillScheme,
                hasShine);

        if (comp instanceof AbstractCommandButton) {
            // special case - overlay the buttons with the watermark image
            // that corresponds to the decoration area of that button
            AbstractCommandButton commandButton = (AbstractCommandButton) comp;
            if (!commandButton.getActionModel().isSelected()
                    && !commandButton.getActionModel().isPressed()) {
                DecorationAreaType decorationAreaType = ComponentOrParentChainScope
                        .getDecorationType(comp);
                SubstanceDecorationPainter decoPainter = SubstanceCortex.ComponentScope
                        .getCurrentSkin(comp).getDecorationPainter();
                if (decoPainter instanceof CookbookDecorationPainter) {
                    BufferedImage watermark = ((CookbookDecorationPainter) decoPainter)
                            .getWatermarkImage(decorationAreaType);
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.clip(contour);
                    g2d.setComposite(AlphaComposite.SrcOver.derive(0.3f));
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
