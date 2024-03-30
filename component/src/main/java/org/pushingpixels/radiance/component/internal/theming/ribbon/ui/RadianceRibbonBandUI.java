/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.icon.CommandButtonFollowColorSchemeIcon;
import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.component.internal.ui.ribbon.BasicRibbonBandUI;
import org.pushingpixels.radiance.theming.api.RadianceSkin;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex.ComponentOrParentChainScope;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices.DecorationAreaType;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.internal.blade.BladeArrowIconUtils;
import org.pushingpixels.radiance.theming.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.radiance.theming.internal.painter.DecorationPainterUtils;
import org.pushingpixels.radiance.theming.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceColorUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceCoreUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceSizeUtils;
import org.pushingpixels.radiance.theming.internal.utils.RadianceTextUtilities;
import org.pushingpixels.radiance.theming.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * UI for ribbon bands in <b>Radiance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class RadianceRibbonBandUI extends BasicRibbonBandUI {
    public static ComponentUI createUI(JComponent comp) {
        RadianceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new RadianceRibbonBandUI();
    }

    private RadianceRibbonBandUI() {
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        ComponentOrParentChainScope.setDecorationType(this.ribbonBand, DecorationAreaType.CONTROL_PANE);

        Insets insets = RadianceSizeUtils
                .getDefaultBorderInsets(RadianceSizeUtils.getComponentFontSize(this.ribbonBand));
        this.ribbonBand.setBorder(new EmptyBorder(0, insets.left, 0, insets.right));
    }

    @Override
    protected void uninstallDefaults() {
        DecorationPainterUtils.clearDecorationType(this.ribbonBand);
        super.uninstallDefaults();
    }

    @Override
    protected void paintBandTrailingSeparator(Graphics graphics, Rectangle toFill) {
        Graphics2D g2d = (Graphics2D) graphics.create();
        if (this.ribbonBand.getComponentOrientation() == ComponentOrientation.LEFT_TO_RIGHT) {
            g2d.translate(toFill.width - 2, 0);
        }
        SeparatorPainterUtils.paintSeparator(this.ribbonBand, g2d, 0, toFill.height,
                JSeparator.VERTICAL, true, 5);
        g2d.dispose();

    }

    @Override
    protected void paintBandTitle(Graphics graphics, Rectangle titleRectangle, String title) {
        // fix for issue 28 - empty ribbon band
        if (titleRectangle.width <= 0)
            return;

        Graphics2D g2d = (Graphics2D) graphics.create();
        Font controlFont = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet()
                .getControlFont();
        g2d.setFont(controlFont.deriveFont(controlFont.getSize2D() - 1.0f));

        FontMetrics fm = graphics.getFontMetrics();

        int currLength = (int) fm.getStringBounds(title, g2d).getWidth();
        String titleToPaint = title;
        while (currLength > titleRectangle.width) {
            title = title.substring(0, title.length() - 1);
            titleToPaint = title + "...";
            currLength = (int) fm.getStringBounds(titleToPaint, g2d).getWidth();
        }

        RadianceSkin skin = RadianceCoreUtilities.getSkin(this.ribbonBand);

        // make the title color blend a little with the background
        Color bgFillColor = RadianceCoreUtilities.getBackgroundFill(skin, DecorationAreaType.CONTROL_PANE);
        RadianceColorScheme bgColorScheme = skin.getBackgroundColorScheme(DecorationAreaType.CONTROL_PANE);
        Color fgColor = bgColorScheme.getForegroundColor();
        fgColor = RadianceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, 0.95f);

        g2d.setColor(fgColor);

        // restrict the title rectangle so that it's painted centered
        int deltaX = (titleRectangle.width - currLength) / 2;
        int deltaY = (titleRectangle.height - fm.getAscent() - fm.getDescent()) / 2;
        Rectangle smallTitleRectangle = new Rectangle(titleRectangle.x + deltaX,
                titleRectangle.y + deltaY, titleRectangle.width - 2 * deltaX,
                titleRectangle.height - 2 * deltaY);
        RadianceTextUtilities.paintText(g2d, smallTitleRectangle, titleToPaint,
                -1, g2d.getFont(), g2d.getColor(), g2d.getClipBounds());

        g2d.dispose();
    }

    @Override
    public int getBandTitleHeight() {
        return 1 + RadianceSizeUtils.getAdjustedSize(
                RadianceSizeUtils.getComponentFontSize(this.ribbonBand), 17, 1, 1, false);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected JCommandButton createExpandButton() {
        final int fontSize = RadianceSizeUtils.getComponentFontSize(null);
        int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
        int arrowIconHeight = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);

        CommandButtonProjection<Command> expandCommandProjection =
                new CommandButtonProjection<>(this.expandCommand,
                        CommandButtonPresentationModel.builder()
                                .setPresentationState(CommandButtonPresentationState.SMALL_FIT_TO_ICON)
                                .setIconDimension(new Dimension(arrowIconWidth, arrowIconHeight))
                                .setContentPadding(new Insets(3, 2, 3, 2))
                                .setSides(RadianceThemingSlices.Sides.CLOSED_RECTANGLE)
                                .setActionKeyTip(ribbonBand.getExpandButtonKeyTip())
                                .build());
        JCommandButton result = expandCommandProjection.buildComponent();
        // since paintBandTitleBackground uses CONTROL_PANE, mark this button with
        // CONTROL_PANE as well to sync the mark color
        ComponentOrParentChainScope.setDecorationType(result, DecorationAreaType.CONTROL_PANE);
        return result;
    }

    @Override
    protected Command createExpandCommand(ComponentOrientation componentOrientation) {
        final int fontSize = RadianceSizeUtils.getComponentFontSize(null);
        int arrowIconWidth = (int) RadianceSizeUtils.getSmallArrowIconWidth(fontSize);
        int arrowIconHeight = (int) RadianceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        return Command.builder()
                .setAction(ribbonBand.getExpandCommandListener())
                .setActionRichTooltip(ribbonBand.getExpandButtonRichTooltip())
                .setIconFactory(() -> new CommandButtonFollowColorSchemeIcon(
                        (g, scheme, alpha, width, height) -> {
                            BladeArrowIconUtils.drawDoubleArrow(g, width, height,
                                    RadianceSizeUtils.getSmallDoubleArrowGap(fontSize),
                                    RadianceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                                    componentOrientation.isLeftToRight()
                                            ? SwingConstants.EAST : SwingConstants.WEST,
                                    scheme, alpha);
                        }, new Dimension(arrowIconHeight, arrowIconWidth)))
                .build();
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        RadianceCommonCortex.installDesktopHints(g2d, this.ribbonBand.getFont());
        GhostPaintingUtils.paintGhostImages(c, g2d);
        BackgroundPaintingUtils.update(g2d, c, false);
        this.paint(g2d, c);
        g2d.dispose();
    }
}
