/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.internal.substance.common.ui;

import org.pushingpixels.flamingo.api.common.JCommandButtonPanel;
import org.pushingpixels.flamingo.internal.ui.common.BasicCommandButtonPanelUI;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.SubstanceSlices.Side;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.HighlightPainterUtils;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceColorUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.util.EnumSet;
import java.util.Set;

/**
 * UI for {@link JCommandButtonPanel} components in <b>Substance</b> look and
 * feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceCommandButtonPanelUI extends BasicCommandButtonPanelUI {
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceCommandButtonPanelUI();
    }

    private SubstanceCommandButtonPanelUI() {
    }

    @Override
    protected Insets getGroupInsets() {
        int extraPadding = SubstanceSizeUtils.getExtraPadding(SubstanceSizeUtils
                .getComponentFontSize(this.buttonPanel));
        Insets result = BasicCommandButtonPanelUI.GROUP_INSETS;
        return new Insets(result.top + extraPadding,
                result.left + extraPadding, result.bottom + extraPadding,
                result.right + extraPadding);
    }

    @Override
    protected int getGroupTitleHeight(int groupIndex) {
        int extraPadding = SubstanceSizeUtils.getExtraPadding(SubstanceSizeUtils
                .getComponentFontSize(this.buttonPanel));
        return this.groupLabels[groupIndex].getPreferredSize().height + 2 * extraPadding;
    }

    @Override
    protected void paintGroupBackground(Graphics g, int groupIndex, int x,
            int y, int width, int height) {
        Color background = SubstanceColorUtilities.getBackgroundFillColor(this.buttonPanel);
        if (groupIndex % 2 == 1) {
            background = SubstanceColorUtilities.getDarkerColor(background, 0.06);
        }

        BackgroundPaintingUtils.fillAndWatermark(g, this.buttonPanel,
                background, new Rectangle(x, y, width, height));
    }

    @Override
    protected void paintGroupTitleBackground(Graphics g, int groupIndex, int x,
            int y, int width, int height) {
        Set<SubstanceSlices.Side> openSides = EnumSet.of(Side.LEFT, Side.RIGHT);
        if (groupIndex == 0) {
            openSides.add(Side.TOP);
        }
        SubstanceColorScheme bgFillScheme = SubstanceColorSchemeUtilities.getColorScheme(
                this.buttonPanel, ColorSchemeAssociationKind.HIGHLIGHT,
                ComponentState.ENABLED);
        SubstanceColorScheme bgBorderScheme = SubstanceColorSchemeUtilities.getColorScheme(
                this.buttonPanel, ColorSchemeAssociationKind.HIGHLIGHT_BORDER,
                ComponentState.ENABLED);
        HighlightPainterUtils.paintHighlight(g, null, this.buttonPanel,
                new Rectangle(x, y, width, height), 1.0f, openSides,
                bgFillScheme, bgBorderScheme);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        BackgroundPaintingUtils.updateIfOpaque(g, c);
        this.paint(g, c);
    }
}
