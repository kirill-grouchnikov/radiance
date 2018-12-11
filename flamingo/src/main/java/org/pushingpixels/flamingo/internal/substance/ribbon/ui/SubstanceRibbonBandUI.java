/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
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

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.projection.*;
import org.pushingpixels.flamingo.internal.substance.common.TransitionAwareResizableIcon;
import org.pushingpixels.flamingo.internal.substance.common.ui.ActionPopupTransitionAwareUI;
import org.pushingpixels.flamingo.internal.ui.ribbon.*;
import org.pushingpixels.neon.NeonCortex;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.SubstanceCortex.ComponentOrParentChainScope;
import org.pushingpixels.substance.api.SubstanceSlices.DecorationAreaType;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.internal.painter.*;
import org.pushingpixels.substance.internal.utils.*;
import org.pushingpixels.substance.internal.widget.animation.effects.GhostPaintingUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.*;
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

    @Override
    protected void installDefaults() {
        super.installDefaults();
        ComponentOrParentChainScope.setDecorationType(this.ribbonBand,
                DecorationAreaType.GENERAL);

        Color backgr = this.ribbonBand.getBackground();
        if (backgr == null || backgr instanceof UIResource) {
            Color toSet = SubstanceColorSchemeUtilities
                    .getColorScheme(this.ribbonBand, ComponentState.ENABLED)
                    .getBackgroundFillColor();
            this.ribbonBand.setBackground(new ColorUIResource(toSet));
        }

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
    protected void installComponents() {
        super.installComponents();

        ComponentOrParentChainScope.setDecorationType(this.ribbonBand,
                DecorationAreaType.GENERAL);
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
        Font controlFont = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet(null)
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
        SubstanceColorScheme bgColorScheme = skin
                .getBackgroundColorScheme(DecorationAreaType.GENERAL);
        Color bgFillColor = bgColorScheme.getBackgroundFillColor();
        Color fgColor = bgColorScheme.getForegroundColor();
        fgColor = SubstanceColorUtilities.getInterpolatedColor(fgColor, bgFillColor, 0.95f);

        g2d.setColor(fgColor);

        // restrict the title rectangle so that it's painted centered
        int deltaX = (titleRectangle.width - currLength) / 2;
        int deltaY = (titleRectangle.height - fm.getAscent() - fm.getDescent()) / 2;
        Rectangle smallTitleRectangle = new Rectangle(titleRectangle.x + deltaX,
                titleRectangle.y + deltaY, titleRectangle.width - 2 * deltaX,
                titleRectangle.height - 2 * deltaY);
        SubstanceTextUtilities.paintText(g2d, this.ribbonBand, smallTitleRectangle, titleToPaint,
                -1, g2d.getFont(), g2d.getColor(), g2d.getClipBounds());

        g2d.dispose();
    }

    @Override
    public int getBandTitleHeight() {
        return 1 + SubstanceSizeUtils.getAdjustedSize(
                SubstanceSizeUtils.getComponentFontSize(this.ribbonBand), 17, 1, 1, false);
    }

    @Override
    protected AbstractCommandButton createExpandButton() {
        CommandProjection expandCommandProjection = new CommandProjection(this.expandCommand,
                CommandPresentation.builder()
                        .setFocusable(false)
                        .setActionKeyTip(ribbonBand.getExpandButtonKeyTip())
                        .build());
        expandCommandProjection.setComponentSupplier((Projection<AbstractCommandButton, Command,
                CommandPresentation> commandProjection) -> RibbonBandExpandButton::new);
        expandCommandProjection.setComponentCustomizer((AbstractCommandButton button) -> {
            // since paintBandTitleBackground uses GENERAL, mark this button with
            // GENERAL as well to sync the mark color
            ComponentOrParentChainScope.setDecorationType(button, DecorationAreaType.GENERAL);
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
            final AbstractCommandButton button) {
        final int fontSize = SubstanceSizeUtils.getComponentFontSize(button);
        int arrowIconWidth = (int) SubstanceSizeUtils.getSmallArrowIconWidth(fontSize);
        int arrowIconHeight = (int) SubstanceSizeUtils.getSmallDoubleArrowIconHeight(fontSize);
        final ResizableIcon arrowIcon = new TransitionAwareResizableIcon(button,
                () -> ((ActionPopupTransitionAwareUI) button.getUI()).getActionTransitionTracker(),
                (SubstanceColorScheme scheme, int width, int height) -> {
                    SubstanceColorScheme bgColorScheme = skin
                            .getBackgroundColorScheme(DecorationAreaType.GENERAL);
                    Color bgFillColor = bgColorScheme.getBackgroundFillColor();
                    return SubstanceImageCreator.getDoubleArrowIcon(
                            width, height,
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
        ResizableIcon icon = getExpandButtonIcon(skin, this.expandButton);
        this.expandCommand.setIcon(icon);
    }

    @Override
    public void update(Graphics g, JComponent c) {
        Graphics2D g2d = (Graphics2D) g.create();
        NeonCortex.installDesktopHints(g2d, c);
        GhostPaintingUtils.paintGhostImages(c, g2d);
        super.update(g2d, c);
        g2d.dispose();
    }

    @SubstanceInternalButton
    private class RibbonBandExpandButton extends JCommandButton {
        private RibbonBandExpandButton(Projection<AbstractCommandButton, Command,
                CommandPresentation> projection) {
            super(projection);

            this.setBorder(new EmptyBorder(3, 2, 3, 2));
        }
    }
}
