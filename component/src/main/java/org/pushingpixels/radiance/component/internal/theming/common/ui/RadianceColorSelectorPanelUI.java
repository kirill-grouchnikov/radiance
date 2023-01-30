/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.internal.ui.common.popup.BasicColorSelectorPanelUI;
import org.pushingpixels.radiance.component.internal.ui.common.popup.JColorSelectorPanel;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.HighlightPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.util.EnumSet;
import java.util.Set;

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
        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    RadianceSkin skin = RadianceCoreUtilities.getSkin(this.colorSelectorPanel);
                    RadianceColorScheme scheme = skin.getBackgroundColorScheme(
                            DecorationPainterUtils.getDecorationType(this.colorSelectorPanel));
                    Color backgroundFill = scheme.getAccentedBackgroundFillColor();

                    Set<RadianceThemingSlices.Side> openSides =
                            EnumSet.of(RadianceThemingSlices.Side.LEADING,
                                    RadianceThemingSlices.Side.TRAILING);
                    graphics1X.setColor(backgroundFill);
                    graphics1X.fillRect(0, 0, scaledWidth, scaledHeight);
                    HighlightPainterUtils.paintHighlightBorder1X(graphics1X, this.colorSelectorPanel,
                            scaledWidth, scaledHeight,
                            1.0f, openSides, RadianceCoreUtilities.getBorderPainter(this.colorSelectorPanel),
                            RadianceColorSchemeUtilities.getColorScheme(
                                    this.colorSelectorPanel, ColorSchemeAssociationKind.BORDER,
                                    ComponentState.ENABLED));
                });
        graphics.dispose();
    }

    @Override
    protected void paintBottomDivider(Graphics g, int x, int y, int width, int height) {
        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, width, height,
                (graphics1X, scaledX, scaledY, scaledWidth, scaledHeight, scaleFactor) -> {
                    Color borderColor = RadianceCoreUtilities.getSkin(this.colorSelectorPanel)
                            .getOverlayColor(RadianceThemingSlices.ColorOverlayType.LINE,
                                    DecorationPainterUtils.getDecorationType(this.colorSelectorPanel),
                                    ComponentState.ENABLED);
                    if (borderColor == null) {
                        RadianceColorScheme bgBorderScheme = RadianceColorSchemeUtilities.getColorScheme(
                                this.colorSelectorPanel, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                                ComponentState.ENABLED);
                        borderColor = bgBorderScheme.getLineColor();
                    }

                    graphics1X.setColor(borderColor);
                    int lineY = scaledY + scaledHeight - 1;
                    graphics1X.drawLine(scaledX, lineY, scaledX + scaledWidth, lineY);
                });
        graphics.dispose();
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
