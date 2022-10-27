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

import org.pushingpixels.radiance.component.api.common.JCommandButtonPanel;
import org.pushingpixels.radiance.component.internal.ui.common.BasicCommandButtonPanelUI;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.Side;
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
 * UI for {@link JCommandButtonPanel} components in <b>Radiance</b> look and
 * feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceCommandButtonPanelUI extends BasicCommandButtonPanelUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceCommandButtonPanelUI();
    }

    private RadianceCommandButtonPanelUI() {
    }

    @Override
    protected int getGroupTitleHeight(int groupIndex) {
        int extraPadding = RadianceSizeUtils.getExtraPadding(RadianceSizeUtils
                .getComponentFontSize(this.buttonPanel));
        return this.groupLabels[groupIndex].getPreferredSize().height + 2 * extraPadding;
    }

    @Override
    protected void paintGroupBackground(Graphics g, int groupIndex, int x,
            int y, int width, int height) {
        RadianceSkin skin = RadianceCoreUtilities.getSkin(this.buttonPanel);
        RadianceColorScheme scheme = skin.getBackgroundColorScheme(
                DecorationPainterUtils.getDecorationType(this.buttonPanel));
        Color background = (groupIndex % 2 == 0)
                ? scheme.getBackgroundFillColor()
                : scheme.getAccentedBackgroundFillColor();

        BackgroundPaintingUtils.fillBackground(g, this.buttonPanel,
                background, new Rectangle(x, y, width, height));
    }

    @Override
    protected void paintGroupTitleBackground(Graphics g, int groupIndex, int x,
            int y, int width, int height) {
        Set<RadianceThemingSlices.Side> openSides = EnumSet.of(Side.LEFT, Side.RIGHT);
        if (groupIndex == 0) {
            openSides.add(Side.TOP);
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(this.buttonPanel);
        RadianceColorScheme scheme = skin.getBackgroundColorScheme(
                DecorationPainterUtils.getDecorationType(this.buttonPanel));
        Color backgroundFill = scheme.getAccentedBackgroundFillColor();

        Graphics2D g2d = (Graphics2D) g.create(x, y, width, height);
        g2d.setColor(backgroundFill);
        g2d.fillRect(0, 0, width, height);
        HighlightPainterUtils.paintHighlightBorder1X(g2d, this.buttonPanel, width, height,
                1.0f, openSides, RadianceCoreUtilities.getBorderPainter(this.buttonPanel),
                RadianceColorSchemeUtilities.getColorScheme(
                        this.buttonPanel, ColorSchemeAssociationKind.BORDER,
                        ComponentState.ENABLED));
        g2d.dispose();
    }

    @Override
    public void update(Graphics g, JComponent c) {
        BackgroundPaintingUtils.updateIfOpaque(g, c);
        this.paint(g, c);
    }
}
