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
package org.pushingpixels.radiance.component.internal.theming.ribbon.ui;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.internal.theming.common.TransitionAwareRadianceIcon;
import org.pushingpixels.radiance.component.internal.theming.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.radiance.component.internal.ui.ribbon.BasicRibbonGalleryUI;
import org.pushingpixels.radiance.component.internal.ui.ribbon.JRibbonGallery;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.ColorSchemeAssociationKind;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeDrawingUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorSchemeUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceImageCreator;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * UI delegate for {@link JRibbonGallery} component under Radiance look-and-feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceRibbonGalleryUI extends BasicRibbonGalleryUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceRibbonGalleryUI();
    }

    /**
     * Creates new UI delegate.
     */
    private RadianceRibbonGalleryUI() {
    }

    @Override
    protected void paintRibbonGalleryBorder(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;
        RadianceColorScheme borderColorScheme = RadianceColorSchemeUtilities.getColorScheme(
                this.ribbonGallery, ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);
        BladeDrawingUtils.paintBladeBorder(this.ribbonGallery, g2d, this.margin.left,
                this.margin.top,
                this.ribbonGallery.getWidth() - this.margin.left - this.margin.right,
                this.ribbonGallery.getHeight() - this.margin.top - this.margin.bottom,
                RadianceSizeUtils.getClassicButtonCornerRadius(
                        RadianceSizeUtils.getComponentFontSize(this.ribbonGallery)),
                borderColorScheme);
        g2d.dispose();
    }

    @Override
    protected void configureExpandButton(JCommandButton button) {
        final double scale = RadianceCommonCortex.getScaleFactor(button);
        final int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
        final RadianceIcon arrowIcon = new TransitionAwareRadianceIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (scheme, width, height) -> RadianceImageCreator.getDoubleArrowIcon(
                        scale, width, height,
                        RadianceSizeUtils.getSmallDoubleArrowGap(fontSize),
                        RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                        SwingConstants.SOUTH, scheme),
                new Dimension(arrowIconWidth, arrowIconHeight));
        button.setIcon(arrowIcon);
        RadianceThemingCortex.ComponentScope.setButtonStraightSide(button,
                ribbonGallery.getComponentOrientation().isLeftToRight()
                        ? RadianceThemingSlices.Side.LEFT
                        : RadianceThemingSlices.Side.RIGHT);
    }

    @Override
    protected void configureScrollDownButton(JCommandButton button) {
        final double scale = RadianceCommonCortex.getScaleFactor(this.ribbonGallery);
        final int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) RadianceSizeUtils.getSmallArrowIconHeight(fontSize);
        int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
        final RadianceIcon arrowIcon = new TransitionAwareRadianceIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (scheme, width, height) -> RadianceImageCreator.getArrowIcon(width, height, scale,
                        RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                        SwingConstants.SOUTH, scheme),
                new Dimension(arrowIconWidth, arrowIconHeight));
        button.setIcon(arrowIcon);
        RadianceThemingCortex.ComponentScope.setButtonStraightSide(button,
                ribbonGallery.getComponentOrientation().isLeftToRight()
                        ? RadianceThemingSlices.Side.LEFT
                        : RadianceThemingSlices.Side.RIGHT);
    }

    @Override
    protected void configureScrollUpButton(JCommandButton button) {
        final double scale = RadianceCommonCortex.getScaleFactor(this.ribbonGallery);
        final int fontSize = RadianceSizeUtils.getComponentFontSize(button);
        int arrowIconHeight = (int) RadianceSizeUtils.getSmallArrowIconHeight(fontSize);
        int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
        final RadianceIcon arrowIcon = new TransitionAwareRadianceIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (scheme, width, height) -> RadianceImageCreator.getArrowIcon(width, height, scale,
                        RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                        SwingConstants.NORTH, scheme),
                new Dimension(arrowIconWidth, arrowIconHeight));
        button.setIcon(arrowIcon);
        RadianceThemingCortex.ComponentScope.setButtonStraightSide(button,
                ribbonGallery.getComponentOrientation().isLeftToRight()
                        ? RadianceThemingSlices.Side.LEFT
                        : RadianceThemingSlices.Side.RIGHT);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        super.update(g, c);
        GhostPaintingUtils.paintGhostImages(c, g);
    }
}
