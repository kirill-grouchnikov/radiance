/*
 * Copyright (c) 2005-2019 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.internal.substance.ribbon.ui;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.internal.substance.common.TransitionAwareResizableIcon;
import org.pushingpixels.flamingo.internal.substance.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.BasicRibbonGalleryUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.JRibbonGallery;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.ColorSchemeAssociationKind;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.utils.SubstanceColorSchemeUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceImageCreator;
import org.pushingpixels.substance.internal.utils.SubstanceSizeUtils;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * UI delegate for {@link JRibbonGallery} component under Substance look-and-feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceRibbonGalleryUI extends BasicRibbonGalleryUI {
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceRibbonGalleryUI();
    }

    /**
     * Creates new UI delegate.
     */
    private SubstanceRibbonGalleryUI() {
    }

    @Override
    protected void paintRibbonGalleryBorder(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;
        SubstanceColorScheme borderColorScheme = SubstanceColorSchemeUtilities.getColorScheme(
                this.ribbonGallery, ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        SubstanceImageCreator.paintBorder(this.ribbonGallery, g2d, this.margin.left,
                this.margin.top,
                this.ribbonGallery.getWidth() - this.margin.left - this.margin.right,
                this.ribbonGallery.getHeight() - this.margin.top - this.margin.bottom,
                SubstanceSizeUtils.getClassicButtonCornerRadius(
                        SubstanceSizeUtils.getComponentFontSize(this.ribbonGallery)),
                borderColorScheme);
        g2d.dispose();
    }

    @Override
    protected void configureExpandButton(AbstractCommandButton button) {
        final int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) SubstanceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        int arrowIconWidth = (int) SubstanceSizeUtils.getSmallArrowIconWidth(fontSize);
        final ResizableIcon arrowIcon = new TransitionAwareResizableIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (SubstanceColorScheme scheme, int width, int height) -> SubstanceImageCreator
                        .getDoubleArrowIcon(
                                width, height, SubstanceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                SubstanceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                SwingConstants.SOUTH, scheme),
                new Dimension(arrowIconWidth, arrowIconHeight));
        button.setIcon(arrowIcon);
        SubstanceCortex.ComponentScope.setButtonStraightSide(button,
                ribbonGallery.getComponentOrientation().isLeftToRight()
                        ? SubstanceSlices.Side.LEFT
                        : SubstanceSlices.Side.RIGHT);
    }

    @Override
    protected void configureScrollDownButton(AbstractCommandButton button) {
        final int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) SubstanceSizeUtils.getSmallArrowIconHeight(fontSize);
        int arrowIconWidth = (int) SubstanceSizeUtils.getSmallArrowIconWidth(fontSize);
        final ResizableIcon arrowIcon = new TransitionAwareResizableIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (SubstanceColorScheme scheme, int width, int height) -> SubstanceImageCreator
                        .getArrowIcon(width, height,
                                SubstanceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                SwingConstants.SOUTH, scheme),
                new Dimension(arrowIconWidth, arrowIconHeight));
        button.setIcon(arrowIcon);
        SubstanceCortex.ComponentScope.setButtonStraightSide(button,
                ribbonGallery.getComponentOrientation().isLeftToRight()
                        ? SubstanceSlices.Side.LEFT
                        : SubstanceSlices.Side.RIGHT);
    }

    @Override
    protected void configureScrollUpButton(AbstractCommandButton button) {
        final int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) SubstanceSizeUtils.getSmallArrowIconHeight(fontSize);
        int arrowIconWidth = (int) SubstanceSizeUtils.getSmallArrowIconWidth(fontSize);
        final ResizableIcon arrowIcon = new TransitionAwareResizableIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (SubstanceColorScheme scheme, int width, int height) -> SubstanceImageCreator
                        .getArrowIcon(width, height,
                                SubstanceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                SwingConstants.NORTH, scheme),
                new Dimension(arrowIconWidth, arrowIconHeight));
        button.setIcon(arrowIcon);
        SubstanceCortex.ComponentScope.setButtonStraightSide(button,
                ribbonGallery.getComponentOrientation().isLeftToRight()
                        ? SubstanceSlices.Side.LEFT
                        : SubstanceSlices.Side.RIGHT);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        super.update(g, c);
        GhostPaintingUtils.paintGhostImages(c, g);
    }
}