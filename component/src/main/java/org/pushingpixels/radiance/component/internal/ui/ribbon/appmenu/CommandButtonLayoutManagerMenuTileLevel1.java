/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.internal.ui.ribbon.appmenu;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.BaseCommandButtonPresentationModel;
import org.pushingpixels.radiance.component.internal.utils.ComponentUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceMetricsUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CommandButtonLayoutManagerMenuTileLevel1 implements CommandButtonLayoutManager {

    @Override
    public Dimension getPreferredIconSize(JCommandButton commandButton) {
        int size = ComponentUtilities.getScaledSize(32, commandButton.getFont().getSize(), 2.0f, 4);
        return new Dimension(size, size);
    }

    @Override
    public Dimension getPreferredSize(JCommandButton commandButton) {
        Insets borderInsets = commandButton.getInsets();
        int bx = borderInsets.left + borderInsets.right;
        int by = borderInsets.top + borderInsets.bottom;
        FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                RadianceCommonCortex.getScaleFactor(commandButton), commandButton.getFont());
        JSeparator jsep = new JSeparator(JSeparator.VERTICAL);

        int titleWidth = fm.stringWidth(commandButton.getContentModel().getText());
        int layoutHGap = 2 * ComponentUtilities.getHLayoutGap(commandButton);
        int layoutVGap = 2 * ComponentUtilities.getVLayoutGap(commandButton);
        int widthMed = this.getPreferredIconSize(commandButton).width
                + 2 * layoutHGap
                + jsep.getPreferredSize().width
                + titleWidth
                + (commandButton.getContentModel().hasSecondaryContent()
                ? commandButton.getPresentationModel().getPopupIcon().getIconWidth()
                + 4 * layoutHGap + jsep.getPreferredSize().width
                : 0);
        return new Dimension(bx + widthMed,
                by + Math.max(this.getPreferredIconSize(commandButton).height,
                        2 * (fm.getAscent() + fm.getDescent()) + layoutVGap));
    }

    @Override
    public Point getActionKeyTipAnchorCenterPoint(JCommandButton commandButton) {
        CommandButtonLayoutInfo layoutInfo = this.getLayoutInfo(commandButton);
        if (commandButton.getComponentOrientation().isLeftToRight()) {
            // bottom-right corner of the icon area
            return new Point(layoutInfo.iconRect.x + layoutInfo.iconRect.width,
                    layoutInfo.actionClickArea.y + layoutInfo.actionClickArea.height);
        } else {
            // bottom-left corner of the icon area
            return new Point(layoutInfo.iconRect.x,
                    layoutInfo.actionClickArea.y + layoutInfo.actionClickArea.height);
        }
    }

    @Override
    public Point getPopupKeyTipAnchorCenterPoint(JCommandButton commandButton) {
        CommandButtonLayoutInfo layoutInfo = this.getLayoutInfo(commandButton);
        if (commandButton.getComponentOrientation().isLeftToRight()) {
            // bottom-left corner of the popup action area
            return new Point(layoutInfo.popupActionRect.x,
                    layoutInfo.popupClickArea.y + layoutInfo.popupClickArea.height);
        } else {
            // bottom-right corner of the popup action area
            return new Point(layoutInfo.popupActionRect.x + layoutInfo.popupActionRect.width,
                    layoutInfo.popupClickArea.y + layoutInfo.popupClickArea.height);
        }
    }

    @Override
    public CommandButtonLayoutInfo getLayoutInfo(JCommandButton commandButton) {
        BaseCommandButtonPresentationModel presentationModel = commandButton.getPresentationModel();

        CommandButtonLayoutInfo result = new CommandButtonLayoutInfo();

        result.actionClickArea = new Rectangle(0, 0, 0, 0);
        result.popupClickArea = new Rectangle(0, 0, 0, 0);

        Insets ins = commandButton.getInsets();

        result.iconRect = new Rectangle();
        result.popupActionRect = new Rectangle();

        int width = commandButton.getWidth();
        int height = commandButton.getHeight();

        FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                RadianceCommonCortex.getScaleFactor(commandButton), commandButton.getFont());
        int labelHeight = fm.getAscent() + fm.getDescent();

        JCommandButton.CommandButtonKind buttonKind = commandButton.getCommandButtonKind();

        if (buttonKind == JCommandButton.CommandButtonKind.ACTION_ONLY) {
            result.actionClickArea.x = 0;
            result.actionClickArea.y = 0;
            result.actionClickArea.width = width;
            result.actionClickArea.height = height;
            result.isTextInActionArea = true;
        }
        if (buttonKind == JCommandButton.CommandButtonKind.POPUP_ONLY) {
            result.popupClickArea.x = 0;
            result.popupClickArea.y = 0;
            result.popupClickArea.width = width;
            result.popupClickArea.height = height;
            result.isTextInActionArea = false;
        }

        JSeparator jsep = new JSeparator(JSeparator.VERTICAL);
        int layoutHGap = 2 * ComponentUtilities.getHLayoutGap(commandButton);

        boolean ltr = commandButton.getComponentOrientation().isLeftToRight();

        String buttonText = commandButton.getContentModel().getText();
        Dimension iconSize = getPreferredIconSize(commandButton);
        int iconWidth = iconSize.width;
        int iconHeight = iconSize.height;

        if (ltr) {
            int x = ins.left;
            // small icon, 1-line text, 1-line extra text and action arrow
            result.iconRect.x = x;
            result.iconRect.y = (height - iconHeight) / 2;
            result.iconRect.width = iconWidth;
            result.iconRect.height = iconHeight;

            x += iconWidth;
            if (buttonKind == JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP) {
                result.actionClickArea.x = 0;
                result.actionClickArea.y = 0;
                result.actionClickArea.width = x + layoutHGap;
                result.actionClickArea.height = height;

                result.popupClickArea.x = x + layoutHGap;
                result.popupClickArea.y = 0;
                result.popupClickArea.width = width - x - layoutHGap;
                result.popupClickArea.height = height;

                result.separatorOrientation = CommandButtonSeparatorOrientation.VERTICAL;
                result.separatorArea = new Rectangle();
                result.separatorArea.x = x + layoutHGap;
                result.separatorArea.y = 0;
                result.separatorArea.width = new JSeparator(JSeparator.VERTICAL)
                        .getPreferredSize().width;
                result.separatorArea.height = height;

                result.isTextInActionArea = false;
            }
            x += 2 * layoutHGap + jsep.getPreferredSize().width;

            TextLayoutInfo lineLayoutInfo = new TextLayoutInfo();
            lineLayoutInfo.text = buttonText;
            lineLayoutInfo.textRect = new Rectangle();

            lineLayoutInfo.textRect.x = x;
            lineLayoutInfo.textRect.y = (height - labelHeight) / 2;
            lineLayoutInfo.textRect.width = fm.stringWidth(buttonText);
            lineLayoutInfo.textRect.height = labelHeight;

            result.textLayoutInfoList = new ArrayList<>();
            result.textLayoutInfoList.add(lineLayoutInfo);

            x += fm.stringWidth(buttonText);
            if (buttonKind == JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION) {
                // popup click areas are right aligned
                result.actionClickArea.x = 0;
                result.actionClickArea.y = 0;
                result.actionClickArea.width = width - ins.right - labelHeight;
                result.actionClickArea.height = height;

                result.popupClickArea.x = width - ins.right - labelHeight;
                result.popupClickArea.y = 0;
                result.popupClickArea.width = labelHeight + ins.right;
                result.popupClickArea.height = height;

                result.separatorOrientation = CommandButtonSeparatorOrientation.VERTICAL;
                result.separatorArea = new Rectangle();
                result.separatorArea.x = width - ins.right - labelHeight;
                result.separatorArea.y = 0;
                result.separatorArea.width = new JSeparator(JSeparator.VERTICAL)
                        .getPreferredSize().width;
                result.separatorArea.height = height;

                result.isTextInActionArea = true;
            }

            if (commandButton.getContentModel().hasSecondaryContent()) {
                int popupIconWidth = presentationModel.getPopupIcon().getIconWidth();
                int popupIconHeight = presentationModel.getPopupIcon().getIconHeight();

                result.popupActionRect.x = width - ins.right - popupIconWidth;
                result.popupActionRect.y = (height - popupIconHeight) / 2;
                result.popupActionRect.width = popupIconWidth;
                result.popupActionRect.height = popupIconHeight;
            }
        } else {
            int x = commandButton.getWidth() - ins.right;
            // small icon, 1-line text, 1-line extra text and action arrow
            result.iconRect.x = x - iconWidth;
            result.iconRect.y = (height - iconHeight) / 2;
            result.iconRect.width = iconWidth;
            result.iconRect.height = iconHeight;

            x -= iconWidth;
            if (buttonKind == JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_POPUP) {
                result.actionClickArea.x = x + layoutHGap;
                result.actionClickArea.y = 0;
                result.actionClickArea.width = width - x - layoutHGap;
                result.actionClickArea.height = height;

                result.popupClickArea.x = 0;
                result.popupClickArea.y = 0;
                result.popupClickArea.width = x + layoutHGap;
                result.popupClickArea.height = height;

                result.separatorOrientation = CommandButtonSeparatorOrientation.VERTICAL;
                result.separatorArea = new Rectangle();
                result.separatorArea.x = x + layoutHGap;
                result.separatorArea.y = 0;
                result.separatorArea.width = new JSeparator(JSeparator.VERTICAL)
                        .getPreferredSize().width;
                result.separatorArea.height = height;

                result.isTextInActionArea = false;
            }
            x -= (2 * layoutHGap + jsep.getPreferredSize().width);

            TextLayoutInfo lineLayoutInfo = new TextLayoutInfo();
            lineLayoutInfo.text = buttonText;
            lineLayoutInfo.textRect = new Rectangle();

            lineLayoutInfo.textRect.width = fm.stringWidth(buttonText);
            lineLayoutInfo.textRect.x = x - lineLayoutInfo.textRect.width;
            lineLayoutInfo.textRect.y = (height - labelHeight) / 2;
            lineLayoutInfo.textRect.height = labelHeight;

            result.textLayoutInfoList = new ArrayList<>();
            result.textLayoutInfoList.add(lineLayoutInfo);

            if (buttonKind == JCommandButton.CommandButtonKind.ACTION_AND_POPUP_MAIN_ACTION) {
                // popup click areas are left aligned
                result.actionClickArea.x = labelHeight + ins.left;
                result.actionClickArea.y = 0;
                result.actionClickArea.width = width - ins.right - labelHeight;
                result.actionClickArea.height = height;

                result.popupClickArea.x = 0;
                result.popupClickArea.y = 0;
                result.popupClickArea.width = ins.left + labelHeight;
                result.popupClickArea.height = height;

                result.separatorOrientation = CommandButtonSeparatorOrientation.VERTICAL;
                result.separatorArea = new Rectangle();
                result.separatorArea.x = labelHeight + ins.left;
                result.separatorArea.y = 0;
                result.separatorArea.width = new JSeparator(JSeparator.VERTICAL)
                        .getPreferredSize().width;
                result.separatorArea.height = height;

                result.isTextInActionArea = true;
            }

            if (commandButton.getContentModel().hasSecondaryContent()) {
                int popupIconWidth = presentationModel.getPopupIcon().getIconWidth();
                int popupIconHeight = presentationModel.getPopupIcon().getIconHeight();

                result.popupActionRect.x = ins.left;
                result.popupActionRect.y = (height - popupIconHeight) / 2;
                result.popupActionRect.width = popupIconWidth;
                result.popupActionRect.height = popupIconHeight;
            }
        }

        return result;
    }
}
