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
package org.pushingpixels.flamingo.internal.substance.common.ui;

import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JScrollablePanel;
import org.pushingpixels.flamingo.api.common.JScrollablePanel.ScrollType;
import org.pushingpixels.flamingo.internal.substance.common.TransitionAwareNeonIcon;
import org.pushingpixels.flamingo.internal.ui.common.BasicScrollablePanelUI;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.NeonIcon;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.utils.ScaleAwareImageWrapperIcon;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.util.EnumSet;

/**
 * UI for {@link JScrollablePanel} components in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceScrollablePanelUI extends BasicScrollablePanelUI {
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceScrollablePanelUI();
    }

    private SubstanceScrollablePanelUI() {
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
        final double scale = NeonCortex.getScaleFactor(button);
        final int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) SubstanceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        int arrowIconWidth = (int) SubstanceSizeUtils.getSmallArrowIconWidth(fontSize);
        NeonIcon arrowIcon = new TransitionAwareNeonIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (scheme, width, height) -> {
                    ScaleAwareImageWrapperIcon doubleArrowIcon = SubstanceImageCreator
                            .getDoubleArrowIcon(
                                    scale, width, height,
                                    SubstanceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                    SubstanceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                    (scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY)
                                            ? SwingUtilities.WEST
                                            : SwingUtilities.NORTH,
                                    scheme);
                    return doubleArrowIcon;
                }, new Dimension(arrowIconHeight, arrowIconWidth));
        button.setIcon(arrowIcon);
        SubstanceCortex.ComponentScope.setButtonStraightSides(button,
                (scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY)
                        ? EnumSet.of(SubstanceSlices.Side.RIGHT)
                        : EnumSet.of(SubstanceSlices.Side.BOTTOM));

        button.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void configureTrailingScrollerButton(JCommandButton button) {
        final double scale = NeonCortex.getScaleFactor(button);
        final int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) SubstanceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        int arrowIconWidth = (int) SubstanceSizeUtils.getSmallArrowIconWidth(fontSize);
        NeonIcon arrowIcon = new TransitionAwareNeonIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (scheme, width, height) -> {
                    ScaleAwareImageWrapperIcon doubleArrowIcon = SubstanceImageCreator
                            .getDoubleArrowIcon(
                                    scale, width, height,
                                    SubstanceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                    SubstanceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                    (scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY)
                                            ? SwingUtilities.EAST
                                            : SwingUtilities.SOUTH,
                                    scheme);
                    return doubleArrowIcon;
                }, new Dimension(arrowIconHeight, arrowIconWidth));
        button.setIcon(arrowIcon);
        SubstanceCortex.ComponentScope.setButtonStraightSides(button,
                (scrollablePanel.getScrollType() == ScrollType.HORIZONTALLY)
                        ? EnumSet.of(SubstanceSlices.Side.LEFT)
                        : EnumSet.of(SubstanceSlices.Side.TOP));

        button.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
}
