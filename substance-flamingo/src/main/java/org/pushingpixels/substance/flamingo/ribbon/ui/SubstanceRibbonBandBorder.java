/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.substance.flamingo.ribbon.ui;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.border.Border;

import org.pushingpixels.flamingo.api.ribbon.AbstractRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.utils.WidgetUtilities;

public class SubstanceRibbonBandBorder implements Border {

    @Override
    public Insets getBorderInsets(Component c) {
        return SubstanceSizeUtils
                .getDefaultBorderInsets(SubstanceSizeUtils.getComponentFontSize(c));
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        // failsafe for LAF change
        if (!SubstanceCoreUtilities.isCurrentLookAndFeel()) {
            return;
        }

        if ((width <= 0) || (height <= 0))
            return;

        Graphics2D graphics = (Graphics2D) g.create();
        float radius = this.getCornerRadius(c);

        float alpha = SubstanceColorSchemeUtilities.getAlpha(c, ComponentState.ENABLED);

        graphics.setComposite(WidgetUtilities.getAlphaComposite(c, alpha, g));

        AbstractRibbonBand band = (AbstractRibbonBand) c;
        int titleHeight = band.getUI().getBandTitleHeight();

        SubstanceColorScheme borderColorScheme = SubstanceColorSchemeUtilities.getColorScheme(c,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        SubstanceImageCreator.paintBorder(c, graphics, x, y, width, height, radius,
                borderColorScheme);

        if (!(band.getCurrentResizePolicy() instanceof IconRibbonBandResizePolicy)) {
            // bottom part - header color scheme
            graphics.clipRect(0, c.getHeight() - titleHeight, c.getWidth(), titleHeight);
            SubstanceColorScheme bottomColorScheme = SubstanceCortex.ComponentScope
                    .getCurrentSkin(c).getColorScheme(DecorationAreaType.HEADER,
                            ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
            graphics.setComposite(WidgetUtilities.getAlphaComposite(c, 0.75f, g));
            SubstanceImageCreator.paintBorder(c, graphics, x, y, width, height, radius,
                    bottomColorScheme);
        }
        graphics.dispose();
    }

    public float getCornerRadius(Component c) {
        return SubstanceSizeUtils
                .getClassicButtonCornerRadius(SubstanceSizeUtils.getComponentFontSize(c));
    }
}
