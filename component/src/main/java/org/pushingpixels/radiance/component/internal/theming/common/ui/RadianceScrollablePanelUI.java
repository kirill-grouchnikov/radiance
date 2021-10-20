/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.JScrollablePanel;
import org.pushingpixels.radiance.component.internal.theming.common.TransitionAwareRadianceIcon;
import org.pushingpixels.radiance.component.internal.ui.common.BasicScrollablePanelUI;
import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.utils.ScaleAwareImageWrapperIcon;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceImageCreator;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.util.EnumSet;

/**
 * UI for {@link JScrollablePanel} components in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceScrollablePanelUI extends BasicScrollablePanelUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceScrollablePanelUI();
    }

    private RadianceScrollablePanelUI() {
    }

    @Override
    public void update(Graphics g, JComponent c) {
        if (!c.isShowing()) {
            return;
        }
        synchronized (c) {
            if (c.isOpaque()) {
                BackgroundPaintingUtils.update(g, c, false);
                super.paint(g, c);
            } else {
                super.paint(g, c);
            }
        }
    }

    @Override
    protected void configureLeadingScrollerButton(JCommandButton button) {
        final double scale = RadianceCommonCortex.getScaleFactor(button);
        final int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
        RadianceIcon arrowIcon = new TransitionAwareRadianceIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (scheme, width, height) -> {
                    ScaleAwareImageWrapperIcon doubleArrowIcon = RadianceImageCreator
                            .getDoubleArrowIcon(
                                    scale, width, height,
                                    RadianceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                    RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                    (scrollablePanel.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY)
                                            ? SwingUtilities.WEST
                                            : SwingUtilities.NORTH,
                                    scheme);
                    return doubleArrowIcon;
                }, new Dimension(arrowIconHeight, arrowIconWidth));
        button.setIcon(arrowIcon);
        RadianceThemingCortex.ComponentScope.setButtonStraightSides(button,
                (scrollablePanel.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY)
                        ? EnumSet.of(RadianceThemingSlices.Side.RIGHT)
                        : EnumSet.of(RadianceThemingSlices.Side.BOTTOM));

        button.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void configureTrailingScrollerButton(JCommandButton button) {
        final double scale = RadianceCommonCortex.getScaleFactor(button);
        final int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
        RadianceIcon arrowIcon = new TransitionAwareRadianceIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (scheme, width, height) -> {
                    ScaleAwareImageWrapperIcon doubleArrowIcon = RadianceImageCreator
                            .getDoubleArrowIcon(
                                    scale, width, height,
                                    RadianceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                    RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                    (scrollablePanel.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY)
                                            ? SwingUtilities.EAST
                                            : SwingUtilities.SOUTH,
                                    scheme);
                    return doubleArrowIcon;
                }, new Dimension(arrowIconHeight, arrowIconWidth));
        button.setIcon(arrowIcon);
        RadianceThemingCortex.ComponentScope.setButtonStraightSides(button,
                (scrollablePanel.getScrollType() == JScrollablePanel.ScrollType.HORIZONTALLY)
                        ? EnumSet.of(RadianceThemingSlices.Side.LEFT)
                        : EnumSet.of(RadianceThemingSlices.Side.TOP));

        button.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
}
