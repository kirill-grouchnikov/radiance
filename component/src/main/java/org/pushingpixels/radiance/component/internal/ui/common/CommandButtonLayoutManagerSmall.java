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
package org.pushingpixels.radiance.component.internal.ui.common;

import org.pushingpixels.radiance.common.api.RadianceCommonCortex;
import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.BaseCommand;
import org.pushingpixels.radiance.component.api.common.model.BaseCommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.BaseCommandMenuContentModel;
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.BaseCommandButtonProjection;
import org.pushingpixels.radiance.component.internal.utils.ComponentUtilities;
import org.pushingpixels.radiance.theming.internal.utils.RadianceMetricsUtilities;

import javax.swing.*;
import java.awt.*;

public class CommandButtonLayoutManagerSmall implements CommandButtonLayoutManager {
    @Override
    public Dimension getPreferredIconSize(JCommandButton commandButton) {
        int size = ComponentUtilities.getCommandButtonSmallIconSize(commandButton.getFont().getSize());
        return new Dimension(size, size);
    }

    @Override
    public Dimension getPreferredSize(JCommandButton commandButton) {
        Insets borderInsets = commandButton.getInsets();
        // int bx = borderInsets.left + borderInsets.right;
        int by = borderInsets.top + borderInsets.bottom;
        FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                RadianceCommonCortex.getScaleFactor(commandButton), commandButton.getFont());

        int layoutHGap = ComponentUtilities.getHLayoutGap(commandButton);

        boolean hasIcon = (commandButton.getContentModel().getIconFactory() != null);
        boolean hasPopupIcon = ComponentUtilities.hasPopupAction(commandButton);

        int prefIconWidth = hasIcon ? this.getPreferredIconSize(commandButton).width : 0;
        int prefIconHeight = hasIcon ? this.getPreferredIconSize(commandButton).height : 0;

        // start with the left insets
        int width = borderInsets.left;
        // icon?
        if (hasIcon) {
            // padding before the icon
            width += layoutHGap;
            // icon width
            width += prefIconWidth;
            // padding after the icon
            width += layoutHGap;
        }
        // popup icon?
        if (hasPopupIcon && commandButton.getPresentationModel().isShowPopupIcon()) {
            // padding before the popup icon
            width += 2 * layoutHGap;
            // text width
            width += 1 + fm.getHeight() / 2;
            // padding after the popup icon
            width += 2 * layoutHGap;
        }

        JCommandButton.CommandButtonKind buttonKind = commandButton.getCommandButtonKind();
        if (hasIcon && buttonKind.hasAction() && buttonKind.hasPopup()) {
            // space for a vertical separator
            width += new JSeparator(JSeparator.VERTICAL).getPreferredSize().width;
        }

        // right insets
        width += borderInsets.right;

        // and remove the padding before the first and after the last elements
        width -= 2 * layoutHGap;

        return new Dimension(width, by
                + Math.max(prefIconHeight, fm.getAscent() + fm.getDescent()));
    }

    @Override
    public Point getActionKeyTipAnchorCenterPoint(JCommandButton commandButton) {
        CommandButtonLayoutInfo layoutInfo = this.getLayoutInfo(commandButton);
        int height = commandButton.getHeight();

        if (commandButton.getComponentOrientation().isLeftToRight()) {
            return new Point(layoutInfo.actionClickArea.x + layoutInfo.actionClickArea.width,
                    (height + layoutInfo.actionClickArea.height) / 2);
        } else {
            return new Point(layoutInfo.actionClickArea.x,
                    (height + layoutInfo.actionClickArea.height) / 2);
        }
    }

    @Override
    public Point getPopupKeyTipAnchorCenterPoint(JCommandButton commandButton) {
        CommandButtonLayoutInfo layoutInfo = this.getLayoutInfo(commandButton);
        int height = commandButton.getHeight();

        if (commandButton.getComponentOrientation().isLeftToRight()) {
            return new Point(layoutInfo.popupClickArea.x + layoutInfo.popupClickArea.width,
                    (height + layoutInfo.popupClickArea.height) / 2);
        } else {
            return new Point(layoutInfo.popupClickArea.x,
                    (height + layoutInfo.popupClickArea.height) / 2);
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

        boolean ltr = commandButton.getComponentOrientation().isLeftToRight();

        int width = commandButton.getWidth();
        int height = commandButton.getHeight();

        int prefWidth = this.getPreferredSize(commandButton).width;
        int shiftX = 0;
        if (width > prefWidth) {
            // We have more horizontal space than needed to display the content.
            // Consult the horizontal alignment attribute of the command button to see
            // how we should shift the content horizontally.
            switch (presentationModel.getHorizontalAlignment()) {
                case LEADING:
                case FILL:
                    break;
                case CENTER:
                    // shift everything to be centered horizontally
                    shiftX = (width - prefWidth) / 2;
                    break;
                case TRAILING:
                    // shift everything to the end of the button bounds
                    shiftX = width - prefWidth;
            }
        }

        boolean hasIcon = (commandButton.getContentModel().getIconFactory() != null);
        boolean hasPopupIcon = ComponentUtilities.hasPopupAction(commandButton);

        FontMetrics fm = RadianceMetricsUtilities.getFontMetrics(
                RadianceCommonCortex.getScaleFactor(commandButton), commandButton.getFont());
        int labelHeight = fm.getAscent() + fm.getDescent();

        JCommandButton.CommandButtonKind buttonKind = commandButton.getCommandButtonKind();
        int layoutHGap = ComponentUtilities.getHLayoutGap(commandButton);

        if (ltr) {
            int x = ins.left + shiftX - layoutHGap;

            // icon
            if (hasIcon) {
                x += layoutHGap;

                Dimension iconSize = getPreferredIconSize(commandButton);
                int iconHeight = iconSize.height;
                int iconWidth = iconSize.width;

                result.iconRect.x = x;
                result.iconRect.y = (height - iconHeight) / 2;
                result.iconRect.width = iconWidth;
                result.iconRect.height = iconHeight;

                x += (iconWidth + layoutHGap);
            }

            if (hasPopupIcon && presentationModel.isShowPopupIcon()) {
                int popupIconWidth = ComponentUtilities.getCommandButtonPopupIconWidth(
                        commandButton.getFont().getSize());
                if (hasIcon) {
                    if (presentationModel.getHorizontalAlignment() == HorizontalAlignment.FILL) {
                        // Under Fill alignment, popup icon goes all the way to the right edge
                        x = width - ins.right - popupIconWidth - 4;
                    } else {
                        // Otherwise, the popup icon is to the right of the texts
                        x += 2 * layoutHGap;
                    }
                } else {
                    // horizontally center the popup icon
                    x = (width - 2 * layoutHGap - popupIconWidth) / 2;
                }

                result.popupActionRect.x = x;
                result.popupActionRect.y = (height - labelHeight) / 2 - 1;
                result.popupActionRect.width = popupIconWidth;
                result.popupActionRect.height = labelHeight + 2;
            }

            int xBorderBetweenActionAndPopup = 0;
            int verticalSeparatorWidth = new JSeparator(JSeparator.VERTICAL)
                    .getPreferredSize().width;
            // compute the action and popup click areas
            switch (buttonKind) {
                case ACTION_ONLY:
                    result.actionClickArea.x = 0;
                    result.actionClickArea.y = 0;
                    result.actionClickArea.width = width;
                    result.actionClickArea.height = height;
                    result.isTextInActionArea = true;
                    break;
                case POPUP_ONLY:
                    result.popupClickArea.x = 0;
                    result.popupClickArea.y = 0;
                    result.popupClickArea.width = width;
                    result.popupClickArea.height = height;
                    result.isTextInActionArea = false;
                    break;
                case ACTION_AND_POPUP_MAIN_ACTION:
                case ACTION_AND_POPUP_MAIN_POPUP:
                    // 1. break after icon if button has icon
                    // 2. no break (all popup) if button has no icon
                    if (hasIcon) {
                        // shift popup action rectangle to the right
                        // to accommodate the vertical separator
                        result.popupActionRect.x += verticalSeparatorWidth;

                        xBorderBetweenActionAndPopup = result.iconRect.x
                                + result.iconRect.width + layoutHGap;

                        result.actionClickArea.x = 0;
                        result.actionClickArea.y = 0;
                        result.actionClickArea.width = xBorderBetweenActionAndPopup;
                        result.actionClickArea.height = height;

                        result.popupClickArea.x = xBorderBetweenActionAndPopup;
                        result.popupClickArea.y = 0;
                        result.popupClickArea.width = width
                                - xBorderBetweenActionAndPopup;
                        result.popupClickArea.height = height;

                        result.separatorOrientation = CommandButtonSeparatorOrientation.VERTICAL;
                        result.separatorArea = new Rectangle();
                        result.separatorArea.x = xBorderBetweenActionAndPopup;
                        result.separatorArea.y = 0;
                        result.separatorArea.width = verticalSeparatorWidth;
                        result.separatorArea.height = height;

                        result.isTextInActionArea = true;
                    } else {
                        result.popupClickArea.x = 0;
                        result.popupClickArea.y = 0;
                        result.popupClickArea.width = width;
                        result.popupClickArea.height = height;

                        result.isTextInActionArea = true;
                    }
                    break;
            }
        } else {
            int x = width - ins.right - shiftX + layoutHGap;

            // icon
            if (hasIcon) {
                x -= layoutHGap;

                Dimension iconSize = getPreferredIconSize(commandButton);
                int iconHeight = iconSize.height;
                int iconWidth = iconSize.width;

                result.iconRect.x = x - iconWidth;
                result.iconRect.y = (height - iconHeight) / 2;
                result.iconRect.width = iconWidth;
                result.iconRect.height = iconHeight;

                x -= (iconWidth + layoutHGap);
            }

            if (hasPopupIcon && presentationModel.isShowPopupIcon()) {
                int popupIconWidth = ComponentUtilities.getCommandButtonPopupIconWidth(
                        commandButton.getFont().getSize());
                if (hasIcon) {
                    if (presentationModel.getHorizontalAlignment() == HorizontalAlignment.FILL) {
                        // Under Fill alignment, popup icon goes all the way to the left edge
                        x = ins.left + 4;
                    } else {
                        // Otherwise, the popup icon is to the left of the texts
                        x -= 2 * layoutHGap;
                    }
                } else {
                    // horizontally center the popup icon
                    x -= (width - 2 * layoutHGap - 1 - popupIconWidth) / 2;
                }

                result.popupActionRect.width = popupIconWidth;
                result.popupActionRect.x = x - result.popupActionRect.width;
                result.popupActionRect.y = (height - labelHeight) / 2 - 1;
                result.popupActionRect.height = labelHeight + 2;
                x -= result.popupActionRect.width;
            }

            int xBorderBetweenActionAndPopup = 0;
            int verticalSeparatorWidth = new JSeparator(JSeparator.VERTICAL)
                    .getPreferredSize().width;
            // compute the action and popup click areas
            switch (buttonKind) {
                case ACTION_ONLY:
                    result.actionClickArea.x = 0;
                    result.actionClickArea.y = 0;
                    result.actionClickArea.width = width;
                    result.actionClickArea.height = height;
                    result.isTextInActionArea = true;
                    break;
                case POPUP_ONLY:
                    result.popupClickArea.x = 0;
                    result.popupClickArea.y = 0;
                    result.popupClickArea.width = width;
                    result.popupClickArea.height = height;
                    result.isTextInActionArea = false;
                    break;
                case ACTION_AND_POPUP_MAIN_ACTION:
                case ACTION_AND_POPUP_MAIN_POPUP:
                    // 1. break after icon if button has icon
                    // 2. no break (all popup) if button has no icon
                    if (hasIcon) {
                        // shift popup action rectangle to the left
                        // to accommodate the vertical separator
                        result.popupActionRect.x -= verticalSeparatorWidth;

                        xBorderBetweenActionAndPopup = result.iconRect.x
                                - layoutHGap;

                        result.actionClickArea.x = xBorderBetweenActionAndPopup;
                        result.actionClickArea.y = 0;
                        result.actionClickArea.width = width
                                - xBorderBetweenActionAndPopup;
                        result.actionClickArea.height = height;

                        result.popupClickArea.x = 0;
                        result.popupClickArea.y = 0;
                        result.popupClickArea.width = xBorderBetweenActionAndPopup;
                        result.popupClickArea.height = height;

                        result.separatorOrientation = CommandButtonSeparatorOrientation.VERTICAL;
                        result.separatorArea = new Rectangle();
                        result.separatorArea.x = xBorderBetweenActionAndPopup;
                        result.separatorArea.y = 0;
                        result.separatorArea.width = verticalSeparatorWidth;
                        result.separatorArea.height = height;

                        result.isTextInActionArea = true;
                    } else {
                        result.popupClickArea.x = 0;
                        result.popupClickArea.y = 0;
                        result.popupClickArea.width = width;
                        result.popupClickArea.height = height;

                        result.isTextInActionArea = true;
                    }
                    break;
            }
        }

        return result;
    }

    public static class FitToIcon extends CommandButtonLayoutManagerSmall {
        @Override
        public Dimension getPreferredIconSize(JCommandButton commandButton) {
            BaseCommandButtonPresentationModel presentationModel =
                    commandButton.getPresentationModel();
            Dimension preferredIconDimension = presentationModel.getIconDimension();
            if (preferredIconDimension != null) {
                return preferredIconDimension;
            }
            return super.getPreferredIconSize(commandButton);
        }
    }
}
