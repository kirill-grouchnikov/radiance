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
package org.pushingpixels.flamingo.internal.substance.ribbon.ui;

import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;
import org.pushingpixels.flamingo.api.common.projection.Projection;
import org.pushingpixels.flamingo.internal.substance.common.TransitionAwareResizableIcon;
import org.pushingpixels.flamingo.internal.substance.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.flamingo.internal.ui.common.FlamingoInternalButton;
import org.pushingpixels.flamingo.internal.ui.ribbon.BasicRibbonBandUI;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSkin;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.painter.BackgroundPaintingUtils;
import org.pushingpixels.substance.internal.painter.DecorationPainterUtils;
import org.pushingpixels.substance.internal.painter.SeparatorPainterUtils;
import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ComponentUI;
import java.awt.*;
import java.util.EnumSet;

/**
 * UI for ribbon bands in <b>Substance</b> look and feel.
 *
 * @author Kirill Grouchnikov
 */
public class SubstanceRibbonBandUI extends BasicRibbonBandUI {
    public static ComponentUI createUI(JComponent comp) {
        SubstanceCoreUtilities.testComponentCreationThreadingViolation(comp);
        return new SubstanceRibbonBandUI();
    }

    private SubstanceRibbonBandUI() {
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        ComponentOrParentChainScope.setDecorationType(this.ribbonBand, DecorationAreaType.CONTROL_PANE);

        Insets insets = SubstanceSizeUtils
                .getDefaultBorderInsets(SubstanceSizeUtils.getComponentFontSize(this.ribbonBand));
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
        Font controlFont = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet()
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

        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(this.ribbonBand);

        // compute the FG color for the ribbon band
        // SubstanceColorScheme fgColorScheme = skin.getColorScheme(
        // this.expandButton, ComponentState.ENABLED);

        // make the title color blend a little with the background
        Color bgFillColor = SubstanceCoreUtilities.getBackgroundFill(skin, DecorationAreaType.CONTROL_PANE);
        SubstanceColorScheme bgColorScheme = skin.getBackgroundColorScheme(DecorationAreaType.CONTROL_PANE);
        Color fgColor = bgColorScheme.getForegroundColor();
        fgColor = SubstanceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, 0.95f);

        g2d.setColor(fgColor);

        // restrict the title rectangle so that it's painted centered
        int deltaX = (titleRectangle.width - currLength) / 2;
        int deltaY = (titleRectangle.height - fm.getAscent() - fm.getDescent()) / 2;
        Rectangle smallTitleRectangle = new Rectangle(titleRectangle.x + deltaX,
                titleRectangle.y + deltaY, titleRectangle.width - 2 * deltaX,
                titleRectangle.height - 2 * deltaY);
        SubstanceTextUtilities.paintText(g2d, smallTitleRectangle, titleToPaint,
                -1, g2d.getFont(), g2d.getColor(), g2d.getClipBounds());

        g2d.dispose();
    }

    @Override
    public int getBandTitleHeight() {
        return 1 + SubstanceSizeUtils.getAdjustedSize(
                SubstanceSizeUtils.getComponentFontSize(this.ribbonBand), 17, 1, 1, false);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected JCommandButton createExpandButton() {
        CommandButtonProjection<Command> expandCommandProjection =
                new CommandButtonProjection<>(this.expandCommand,
                        CommandButtonPresentationModel.builder()
                                .setActionKeyTip(ribbonBand.getExpandButtonKeyTip())
                                .build());
        expandCommandProjection.setComponentSupplier(projection -> RibbonBandExpandButton::new);
        expandCommandProjection.setComponentCustomizer(button -> {
            // since paintBandTitleBackground uses CONTROL_PANE, mark this button with
            // CONTROL_PANE as well to sync the mark color
            ComponentOrParentChainScope.setDecorationType(button, DecorationAreaType.CONTROL_PANE);
            SubstanceSkin skin = SubstanceCoreUtilities.getSkin(this.ribbonBand);
            button.setIcon(getExpandButtonIcon(skin, button));
            // Mark the button as rectangular
            SubstanceCortex.ComponentScope.setButtonStraightSides(button,
                    EnumSet.allOf(SubstanceSlices.Side.class));
        });

        return expandCommandProjection.buildComponent();
    }

    @Override
    protected Command createExpandCommand() {
        return Command.builder()
                .setAction(ribbonBand.getExpandCommandListener())
                .setActionRichTooltip(ribbonBand.getExpandButtonRichTooltip()).build();
    }

    private ResizableIcon getExpandButtonIcon(final SubstanceSkin skin,
            final JCommandButton button) {
        final double scale = NeonCortex.getScaleFactor(button);
        final int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int arrowIconWidth = (int) SubstanceSizeUtils.getSmallArrowIconWidth(fontSize);
        int arrowIconHeight = (int) SubstanceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        final ResizableIcon arrowIcon = new TransitionAwareResizableIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (scheme, width, height) -> {
                    Color bgFillColor = SubstanceCoreUtilities.getBackgroundFill(skin, DecorationAreaType.CONTROL_PANE);
                    return SubstanceImageCreator.getDoubleArrowIcon(
                            scale, width, height,
                            SubstanceSizeUtils.getSmallDoubleArrowGap(fontSize),
                            SubstanceSizeUtils.getDoubleArrowStrokeWidth(fontSize),
                            ribbonBand.getComponentOrientation().isLeftToRight()
                                    ? SwingConstants.EAST : SwingConstants.WEST,
                            SubstanceColorSchemeUtilities.getShiftedScheme(scheme, bgFillColor,
                                    0.0f, bgFillColor, 0.3f));
                }, new Dimension(arrowIconHeight, arrowIconWidth));
        return arrowIcon;
    }

    @Override
    protected void syncExpandButtonIcon() {
        SubstanceSkin skin = SubstanceCoreUtilities.getSkin(this.ribbonBand);
        this.expandCommand.setIconFactory(() -> getExpandButtonIcon(skin, this.expandButton));
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, this.ribbonBand.getFont());
        GhostPaintingUtils.paintGhostImages(c, g2d);
        BackgroundPaintingUtils.update(g2d, c, false);
        this.paint(g2d, c);
        g2d.dispose();
    }

    @SubstanceInternalButton
    private static class RibbonBandExpandButton extends JCommandButton implements FlamingoInternalButton {
        private RibbonBandExpandButton(Projection<JCommandButton, Command,
                CommandButtonPresentationModel> projection) {
            super(projection);

            this.setBorder(new EmptyBorder(3, 2, 3, 2));
        }
    }
}
