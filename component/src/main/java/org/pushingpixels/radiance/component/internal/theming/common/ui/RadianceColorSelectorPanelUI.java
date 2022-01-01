/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.theming.common.ui;

import org.pushingpixels.radiance.component.internal.ui.common.popup.BasicColorSelectorPanelUI;
import org.pushingpixels.radiance.component.internal.ui.common.popup.JColorSelectorPanel;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.awt.geom.Line2D;

/**
 * UI for {@link JColorSelectorPanel} components in <b>Radiance</b> look and
 * feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceColorSelectorPanelUI extends BasicColorSelectorPanelUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceColorSelectorPanelUI();
    }

    private RadianceColorSelectorPanelUI() {
    }

    @Override
    protected void paintCaptionBackground(Graphics g, int x, int y, int width, int height) {
        RadianceColorScheme bgFillScheme = RadianceColorSchemeUtilities.getColorScheme(
                this.colorSelectorPanel, ColorSchemeAssociationKind.HIGHLIGHT,
                ComponentState.ENABLED);
        RadianceCoreUtilities.getFillPainter(this.colorSelectorPanel).paintContourBackground(g,
                this.colorSelectorPanel, width, height, new Rectangle(x, y, width, height), false,
                bgFillScheme, false);

        Color borderColor = RadianceCoreUtilities.getSkin(this.colorSelectorPanel).getOverlayColor(
                RadianceThemingSlices.ColorOverlayType.LINE,
                DecorationPainterUtils.getDecorationType(this.colorSelectorPanel), ComponentState.ENABLED);
        if (borderColor == null) {
            RadianceColorScheme bgBorderScheme = RadianceColorSchemeUtilities.getColorScheme(
                    this.colorSelectorPanel, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                    ComponentState.ENABLED);
            borderColor = bgBorderScheme.getLineColor();
        }
        float lineThickness = RadianceSizeUtils.getBorderStrokeWidth(this.colorSelectorPanel);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setStroke(new BasicStroke(lineThickness));
        g2d.setColor(borderColor);
        g2d.draw(new Line2D.Float(x, y, x + width, y));
        float bottomLineY = y + height - lineThickness;
        g2d.draw(new Line2D.Float(x, bottomLineY, x + width, bottomLineY));
        g2d.dispose();
    }

    @Override
    protected void paintBottomDivider(Graphics g, int x, int y, int width, int height) {
        Color borderColor = RadianceCoreUtilities.getSkin(this.colorSelectorPanel).getOverlayColor(
                RadianceThemingSlices.ColorOverlayType.LINE,
                DecorationPainterUtils.getDecorationType(this.colorSelectorPanel), ComponentState.ENABLED);
        if (borderColor == null) {
            RadianceColorScheme bgBorderScheme = RadianceColorSchemeUtilities.getColorScheme(
                    this.colorSelectorPanel, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                    ComponentState.ENABLED);
            borderColor = bgBorderScheme.getLineColor();
        }
        float lineThickness = RadianceSizeUtils.getBorderStrokeWidth(this.colorSelectorPanel);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setStroke(new BasicStroke(lineThickness));
        g2d.setColor(borderColor);
        float lineY = y + height - lineThickness;
        g2d.draw(new Line2D.Float(x, lineY, x + width, lineY));
        g2d.dispose();
    }

    @Override
    public void update(Graphics g, JComponent c) {
        BackgroundPaintingUtils.updateIfOpaque(g, c);
        this.paint(g, c);
    }

    @Override
    protected int getLayoutGap() {
        return (int) RadianceSizeUtils.getAdjustedSize(
                RadianceSizeUtils.getComponentFontSize(colorSelectorPanel), 4, 1, 0.25f);
    }
}
