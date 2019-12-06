/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.internal.utils;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.CommandButtonLayoutManager;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.SubstanceCortex;
import org.pushingpixels.substance.api.SubstanceSlices;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.border.SubstanceBorderPainter;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.utils.*;

import java.awt.*;
import java.awt.font.LineMetrics;
import java.util.Collection;

public class KeyTipRenderingUtilities {

    public static Dimension getPrefSize(FontMetrics fm, String keyTip) {
        int INSETS = 3;
        int prefWidth = fm.stringWidth(keyTip) + 2 * INSETS + 1;
        int prefHeight = fm.getHeight() + INSETS - 1;
        return new Dimension(prefWidth, prefHeight);
    }

    public static void renderKeyTip(Graphics g, Container c, Rectangle rect, String keyTip,
            boolean toPaintEnabled) {
        SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(c);
        SubstanceBorderPainter borderPainter = SubstanceCoreUtilities
                .getBorderPainter(c);

        ComponentState state =
                toPaintEnabled ? ComponentState.ENABLED : ComponentState.DISABLED_UNSELECTED;
        float alpha = SubstanceColorSchemeUtilities.getAlpha(c, state);
        SubstanceColorScheme fillScheme = SubstanceColorSchemeUtilities
                .getColorScheme(c, state);
        SubstanceColorScheme borderScheme = SubstanceColorSchemeUtilities
                .getColorScheme(c, SubstanceSlices.ColorSchemeAssociationKind.BORDER, state);
        float radius = SubstanceSizeUtils.getClassicButtonCornerRadius(
                SubstanceSizeUtils.getComponentFontSize(c));

        float borderDelta = SubstanceSizeUtils.getBorderStrokeWidth() / 2.0f;

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(WidgetUtilities.getAlphaComposite(c, alpha, g));
        g2d.translate(rect.x, rect.y);
        Shape contour = SubstanceOutlineUtilities.getBaseOutline(rect.width, rect.height, radius,
                null, borderDelta);
        fillPainter.paintContourBackground(g2d, c, rect.width, rect.height,
                contour, false, fillScheme, true);

        float borderThickness = SubstanceSizeUtils.getBorderStrokeWidth();
        Shape contourInner = SubstanceOutlineUtilities.getBaseOutline(rect.width, rect.height,
                radius, null, borderDelta + borderThickness);
        borderPainter.paintBorder(g2d, c, rect.width, rect.height, contour,
                contourInner, borderScheme);

        g2d.setColor(SubstanceColorSchemeUtilities.getColorScheme(c, state).getForegroundColor());
        Font font = SubstanceCortex.GlobalScope.getFontPolicy().getFontSet().
                getControlFont();
        font = font.deriveFont(font.getSize() + 1.0f);
        g2d.setFont(font);
        int strWidth = g2d.getFontMetrics().stringWidth(keyTip);

        LineMetrics lineMetrics = g2d.getFontMetrics().getLineMetrics(keyTip, g2d);
        int strHeight = (int) lineMetrics.getHeight();
        NeonCortex.installDesktopHints(g2d, font);
        g2d.drawString(keyTip, (rect.width - strWidth) / 2,
                (rect.height + strHeight) / 2 - g2d.getFontMetrics().getDescent());

        g2d.dispose();
    }

    public static void renderButtonKeyTips(Graphics g, AbstractCommandButton button,
            CommandButtonLayoutManager layoutManager) {
        Collection<KeyTipManager.KeyTipLink> currLinks = KeyTipManager.defaultManager()
                .getCurrentlyShownKeyTips();
        if (currLinks == null) {
            return;
        }

        boolean found = false;
        for (KeyTipManager.KeyTipLink link : currLinks) {
            found = (link.comp == button);
            if (found) {
                break;
            }
        }

        if (!found) {
            return;
        }

        // System.out.println("Painting key tip for " + menuButton.getText());

        CommandButtonLayoutManager.CommandButtonLayoutInfo layoutInfo =
                layoutManager.getLayoutInfo(button);
        String actionKeyTip = button.getActionKeyTip();
        if ((layoutInfo.actionClickArea.width > 0) && (actionKeyTip != null)) {
            Point actionPrefCenter = button.getUI().getActionKeyTipAnchorCenterPoint();
            Dimension pref = KeyTipRenderingUtilities.getPrefSize(g.getFontMetrics(), actionKeyTip);
            KeyTipRenderingUtilities.renderKeyTip(g, button,
                    new Rectangle(actionPrefCenter.x - pref.width / 2,
                            Math.min(actionPrefCenter.y - pref.height / 2,
                                    layoutInfo.actionClickArea.y + layoutInfo.actionClickArea.height
                                            - pref.height),
                            pref.width, pref.height),
                    actionKeyTip, button.getActionModel().isEnabled());
        }

        if (button instanceof JCommandButton) {
            JCommandButton commandButton = (JCommandButton) button;
            String popupKeyTip = commandButton.getPopupKeyTip();
            if ((layoutInfo.popupClickArea.width > 0) && (popupKeyTip != null)) {
                Point popupPrefCenter = button.getUI().getPopupKeyTipAnchorCenterPoint();
                Dimension pref = KeyTipRenderingUtilities.getPrefSize(g.getFontMetrics(),
                        popupKeyTip);
                if (commandButton.getPopupOrientationKind() ==
                        CommandButtonPresentationModel.PopupOrientationKind.SIDEWARD) {
                    if (commandButton.getCommandButtonKind() != CommandButtonKind.POPUP_ONLY) {
                        // vertically aligned with the action keytip along the right edge
                        KeyTipRenderingUtilities.renderKeyTip(g, button, new Rectangle(
                                        layoutInfo.popupClickArea.x + layoutInfo.popupClickArea.width
                                                - pref.width - 4,
                                        Math.min(popupPrefCenter.y - pref.height / 2,
                                                layoutInfo.actionClickArea.y +
                                                        layoutInfo.actionClickArea.height - pref.height),
                                        pref.width, pref.height), popupKeyTip,
                                commandButton.getPopupModel().isEnabled());
                    } else {
                        KeyTipRenderingUtilities.renderKeyTip(g, button, new Rectangle(
                                        popupPrefCenter.x - pref.width / 2,
                                        Math.min(popupPrefCenter.y - pref.height / 2,
                                                layoutInfo.popupClickArea.y +
                                                        layoutInfo.popupClickArea.height - pref.height),
                                        pref.width, pref.height), popupKeyTip,
                                commandButton.getPopupModel().isEnabled());
                    }
                } else {
                    // horizontally centered along the bottom edge
                    KeyTipRenderingUtilities.renderKeyTip(g, button, new Rectangle(
                                    (layoutInfo.popupClickArea.x + layoutInfo.popupClickArea.width
                                            - pref.width) / 2,
                                    layoutInfo.popupClickArea.y + layoutInfo.popupClickArea.height
                                            - pref.height,
                                    pref.width, pref.height), popupKeyTip,
                            commandButton.getPopupModel().isEnabled());
                }
            }
        }
    }
}
