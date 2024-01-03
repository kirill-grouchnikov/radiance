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
package org.pushingpixels.radiance.component.internal.utils;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.theming.api.ComponentState;
import org.pushingpixels.radiance.theming.api.RadianceThemingCortex;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;
import org.pushingpixels.radiance.theming.api.colorscheme.RadianceColorScheme;
import org.pushingpixels.radiance.theming.api.painter.border.RadianceBorderPainter;
import org.pushingpixels.radiance.theming.api.painter.fill.RadianceFillPainter;
import org.pushingpixels.radiance.theming.internal.utils.*;

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
        RadianceFillPainter fillPainter = RadianceCoreUtilities.getFillPainter(c);
        RadianceBorderPainter borderPainter = RadianceCoreUtilities
                .getBorderPainter(c);

        ComponentState state =
                toPaintEnabled ? ComponentState.ENABLED : ComponentState.DISABLED_UNSELECTED;
        float alpha = RadianceColorSchemeUtilities.getAlpha(c, state);
        RadianceColorScheme fillScheme = RadianceColorSchemeUtilities.getColorScheme(c, state);
        RadianceColorScheme borderScheme = RadianceColorSchemeUtilities.getColorScheme(
                c, RadianceThemingSlices.ColorSchemeAssociationKind.BORDER, state);

        Graphics2D graphics = (Graphics2D) g.create();
        // Important - do not set KEY_STROKE_CONTROL to VALUE_STROKE_PURE, as that instructs AWT
        // to not normalize coordinates to paint at full pixels, and will result in blurry
        // outlines.
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        graphics.setComposite(WidgetUtilities.getAlphaComposite(c, alpha, g));
        graphics.translate(rect.x, rect.y);

        RadianceCommonCortex.paintAtScale1x(graphics, 0, 0, rect.width, rect.height,
                (graphics1X, x, y, scaledWidth, scaledHeight, scaleFactor) -> {
                    float radius = (float) scaleFactor * RadianceSizeUtils.getClassicButtonCornerRadius(
                            RadianceSizeUtils.getComponentFontSize(c));

                    Shape contour = RadianceOutlineUtilities.getBaseOutline(
                            c.getComponentOrientation(),
                            scaledWidth, scaledHeight, radius,
                            null, 1.0f);
                    fillPainter.paintContourBackground(graphics1X, c, scaledWidth, scaledHeight,
                            contour, fillScheme);

                    Shape contourInner = RadianceOutlineUtilities.getBaseOutline(
                            c.getComponentOrientation(),
                            scaledWidth, scaledHeight,
                            radius, null, 2.0f);
                    borderPainter.paintBorder(graphics1X, c, scaledWidth, scaledHeight, contour,
                            contourInner, borderScheme);
                });

        graphics.setColor(RadianceColorSchemeUtilities.getColorScheme(c, state).getForegroundColor());
        Font font = RadianceThemingCortex.GlobalScope.getFontPolicy().getFontSet().
                getControlFont();
        font = font.deriveFont(font.getSize() + 1.0f);
        graphics.setFont(font);
        int strWidth = graphics.getFontMetrics().stringWidth(keyTip);

        LineMetrics lineMetrics = graphics.getFontMetrics().getLineMetrics(keyTip, graphics);
        int strHeight = (int) lineMetrics.getHeight();
        RadianceCommonCortex.installDesktopHints(graphics, font);
        graphics.drawString(keyTip, (rect.width - strWidth) / 2,
                (rect.height + strHeight) / 2 - graphics.getFontMetrics().getDescent());

        graphics.dispose();
    }

    public static void renderButtonKeyTips(Graphics g, JCommandButton button,
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
        String actionKeyTip = button.getPresentationModel().getActionKeyTip();
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

        String popupKeyTip = button.getPresentationModel().getPopupKeyTip();
        if ((layoutInfo.popupClickArea.width > 0) && (popupKeyTip != null)) {
            Point popupPrefCenter = button.getUI().getPopupKeyTipAnchorCenterPoint();
            Dimension pref = KeyTipRenderingUtilities.getPrefSize(g.getFontMetrics(), popupKeyTip);
            KeyTipRenderingUtilities.renderKeyTip(g, button, new Rectangle(
                            popupPrefCenter.x - pref.width / 2,
                            Math.min(popupPrefCenter.y - pref.height / 2,
                                    layoutInfo.popupClickArea.y +
                                            layoutInfo.popupClickArea.height - pref.height),
                            pref.width, pref.height), popupKeyTip,
                    button.getPopupModel().isEnabled());
        }
    }
}
