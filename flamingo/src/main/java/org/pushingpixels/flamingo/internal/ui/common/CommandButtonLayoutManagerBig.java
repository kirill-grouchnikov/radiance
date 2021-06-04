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
package org.pushingpixels.flamingo.internal.ui.common;

import org.pushingpixels.flamingo.api.common.CommandButtonLayoutManager;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton.CommandButtonKind;
import org.pushingpixels.flamingo.internal.utils.FlamingoUtilities;
import org.pushingpixels.neon.api.NeonCortex;
import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.substance.internal.utils.SubstanceMetricsUtilities;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CommandButtonLayoutManagerBig implements CommandButtonLayoutManager {
    private JCommandButton commandButton;

    /**
     * The first part of (possibly) two-lined split of {@link #commandButton}'s
     * title.
     */
    protected String titlePart1;

    /**
     * The second part of (possibly) two-lined split of {@link #commandButton}'s
     * title.
     */
    protected String titlePart2;

    public CommandButtonLayoutManagerBig(JCommandButton commandButton) {
        this.commandButton = commandButton;
        this.updateTitleStrings();
    }

    @Override
    public int getPreferredIconSize(JCommandButton commandButton) {
        return FlamingoUtilities.getScaledSize(32, commandButton.getFont().getSize(), 2.0f, 4);
    }

    protected int getCurrentIconWidth(JCommandButton commandButton) {
        return (commandButton.getIcon() != null)
                ? this.getPreferredIconSize(commandButton)
                : 0;
    }

    protected int getCurrentIconHeight(JCommandButton commandButton) {
        return (commandButton.getIcon() != null)
                ? this.getPreferredIconSize(commandButton)
                : 0;
    }

    @Override
    public Dimension getPreferredSize(JCommandButton commandButton) {
        Insets borderInsets = (commandButton == null) ? new Insets(0, 0, 0, 0)
                : commandButton.getInsets();
        int bx = borderInsets.left + borderInsets.right;
        FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(
                NeonCortex.getScaleFactor(commandButton), commandButton.getFont());
        JSeparator jsep = new JSeparator(JSeparator.HORIZONTAL);
        int layoutHGap = FlamingoUtilities.getHLayoutGap(commandButton);
        int layoutVGap = FlamingoUtilities.getVLayoutGap(commandButton);

        boolean hasIcon = (commandButton.getIcon() != null);
        boolean hasText = (this.titlePart1 != null);
        boolean hasPopupIcon = FlamingoUtilities.hasPopupAction(commandButton);

        int title1Width = (this.titlePart1 == null) ? 0 : fm.stringWidth(this.titlePart1);
        int title2Width = (this.titlePart2 == null) ? 0 : fm.stringWidth(this.titlePart2);

        int width = Math.max(this.getCurrentIconWidth(commandButton),
                Math.max(title1Width, title2Width + 4 * layoutHGap
                        + jsep.getPreferredSize().height
                        + (FlamingoUtilities.hasPopupAction(commandButton) ? 1 + fm.getHeight() / 2 : 0)));

        // start height with the top inset
        int height = borderInsets.top;
        // icon?
        if (hasIcon) {
            // padding above the icon
            height += layoutVGap;
            // icon height
            height += this.getCurrentIconHeight(commandButton);
            // padding below the icon
            height += layoutVGap;
        }
        // text?
        if (hasText) {
            // padding above the text
            height += layoutVGap;
            // text height - two lines
            height += 2 * (fm.getAscent() + fm.getDescent());
            // padding below the text
            height += layoutVGap;
        }
        // popup icon (no text)?
        if (!hasText && hasPopupIcon) {
            // padding above the popup icon
            height += layoutVGap;
            // popup icon height - one line of text
            height += fm.getHeight();
            // padding below the popup icon
            height += layoutVGap;
        }

        // separator?
        CommandButtonKind buttonKind = this.commandButton.getCommandButtonKind();
        if (hasIcon && buttonKind.hasAction() && buttonKind.hasPopup()) {
            // space for a horizontal separator
            height += new JSeparator(JSeparator.HORIZONTAL).getPreferredSize().height;
        }

        // bottom insets
        height += borderInsets.bottom;

        // and remove the padding above the first and below the last elements
        height -= 2 * layoutVGap;

        return new Dimension(bx + width, height);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("text".equals(evt.getPropertyName()) || "font".equals(evt.getPropertyName())) {
            this.updateTitleStrings();
        }
    }

    /**
     * Updates the title strings for {@link CommandButtonPresentationState#BIG} and
     * other relevant states.
     */
    private void updateTitleStrings() {
        // Break the title in two parts (the second part may be empty),
        // finding the "inflection" point. The inflection point is a space
        // character that breaks the title in two parts, such that the maximal
        // length of the first part and the second part + action label icon
        // is minimal between all possible space characters
        FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(
                NeonCortex.getScaleFactor(commandButton), this.commandButton.getFont());

        String title = (this.commandButton == null) ? null : this.commandButton.getText();
        if (title != null) {
            StringTokenizer tokenizer = new StringTokenizer(title, " _-", true);
            if (tokenizer.countTokens() <= 1) {
                // single word
                this.titlePart1 = title;
                this.titlePart2 = null;
            } else {
                int currMaxLength = fm.stringWidth(this.commandButton.getText());
                int actionIconWidth = FlamingoUtilities.hasPopupAction(this.commandButton) ? 0
                        : 2 * FlamingoUtilities.getHLayoutGap(commandButton)
                        + (fm.getAscent() + fm.getDescent()) / 2;

                StringBuilder currLeading = new StringBuilder();
                while (tokenizer.hasMoreTokens()) {
                    currLeading.append(tokenizer.nextToken());
                    String part1 = currLeading.toString();
                    String part2 = title.substring(currLeading.length());

                    int len1 = fm.stringWidth(part1);
                    int len2 = fm.stringWidth(part2) + actionIconWidth;
                    int len = Math.max(len1, len2);

                    if (currMaxLength > len) {
                        currMaxLength = len;
                        this.titlePart1 = part1;
                        this.titlePart2 = part2;
                    }
                }
            }
        } else {
            this.titlePart1 = null;
            this.titlePart2 = null;
        }
    }

    @Override
    public Point getActionKeyTipAnchorCenterPoint(JCommandButton commandButton) {
        CommandButtonLayoutInfo layoutInfo = this.getLayoutInfo(commandButton);
        // horizontally centered at the bottom edge of the action click area
        return new Point(layoutInfo.actionClickArea.x + layoutInfo.actionClickArea.width / 2,
                layoutInfo.actionClickArea.y + layoutInfo.actionClickArea.height);
    }

    @Override
    public Point getPopupKeyTipAnchorCenterPoint(JCommandButton commandButton) {
        CommandButtonLayoutInfo layoutInfo = this.getLayoutInfo(commandButton);
        // horizontally centered at the bottom edge of the popup click area
        return new Point(layoutInfo.popupClickArea.x + layoutInfo.popupClickArea.width / 2,
                layoutInfo.popupClickArea.y + layoutInfo.popupClickArea.height);
    }

    @Override
    public CommandButtonLayoutInfo getLayoutInfo(JCommandButton commandButton) {
        CommandButtonLayoutInfo result = new CommandButtonLayoutInfo();

        result.actionClickArea = new Rectangle(0, 0, 0, 0);
        result.popupClickArea = new Rectangle(0, 0, 0, 0);

        Insets ins = commandButton.getInsets();

        result.iconRect = new Rectangle();
        result.popupActionRect = new Rectangle();

        int width = commandButton.getWidth();
        int height = commandButton.getHeight();

        int x = ins.left;

        boolean ltr = commandButton.getComponentOrientation().isLeftToRight();

        FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(
                NeonCortex.getScaleFactor(commandButton), commandButton.getFont());
        int labelHeight = fm.getAscent() + fm.getDescent();

        JCommandButton.CommandButtonKind buttonKind = commandButton.getCommandButtonKind();

        ResizableIcon buttonIcon = commandButton.getIcon();

        boolean hasIcon = (commandButton.getIcon() != null);
        boolean hasText = (this.titlePart1 != null);
        boolean hasPopupIcon = FlamingoUtilities.hasPopupAction(commandButton);

        int layoutHGap = FlamingoUtilities.getHLayoutGap(commandButton);
        int layoutVGap = FlamingoUtilities.getVLayoutGap(commandButton);

        int prefHeight = this.getPreferredSize(commandButton).height;
        int shiftY = 0;
        if (height > prefHeight) {
            shiftY = (height - prefHeight) / 2;
        }

        int y = ins.top + shiftY - layoutVGap;

        // icon
        if (hasIcon) {
            y += layoutVGap;

            int iconHeight = buttonIcon.getIconHeight();
            int iconWidth = buttonIcon.getIconWidth();

            result.iconRect.x = (width - iconWidth) / 2;
            result.iconRect.y = y;
            result.iconRect.width = iconWidth;
            result.iconRect.height = iconHeight;

            y += (iconHeight + layoutVGap);
        }

        // separator?
        // horizontal separator is always after the icon
        if (hasIcon && buttonKind.hasAction() && buttonKind.hasPopup()) {
            result.separatorOrientation =
                    CommandButtonLayoutManager.CommandButtonSeparatorOrientation.HORIZONTAL;

            result.separatorArea = new Rectangle(0, 0, 0, 0);
            result.separatorArea.x = 0;
            result.separatorArea.y = y;
            result.separatorArea.width = width;
            result.separatorArea.height = new JSeparator(JSeparator.HORIZONTAL)
                    .getPreferredSize().height;

            y += result.separatorArea.height;
        }

        int lastTextLineWidth = 0;
        // text
        if (hasText) {
            y += layoutVGap;
            lastTextLineWidth = (this.titlePart1 != null)
                    ? fm.stringWidth(this.titlePart1) : 0;

            TextLayoutInfo line1LayoutInfo = new TextLayoutInfo();
            line1LayoutInfo.text = this.titlePart1;
            line1LayoutInfo.textRect = new Rectangle();

            line1LayoutInfo.textRect.x = ins.left
                    + (width - lastTextLineWidth - ins.left - ins.right) / 2;
            line1LayoutInfo.textRect.y = y;
            line1LayoutInfo.textRect.width = lastTextLineWidth;
            line1LayoutInfo.textRect.height = labelHeight;

            if (this.titlePart1 != null) {
                y += labelHeight;
            }

            lastTextLineWidth = (this.titlePart2 != null)
                    ? fm.stringWidth(this.titlePart2) : 0;

            int extraWidth = hasPopupIcon ? 4 * layoutHGap + labelHeight / 2 : 0;

            if (ltr) {
                x = ins.left + (width - lastTextLineWidth - extraWidth - ins.left - ins.right) / 2;
            }
            if (!ltr) {
                x = width - ins.right - lastTextLineWidth
                        - (width - lastTextLineWidth - extraWidth - ins.left - ins.right) / 2;
            }

            TextLayoutInfo line2LayoutInfo = new TextLayoutInfo();
            line2LayoutInfo.text = this.titlePart2;
            line2LayoutInfo.textRect = new Rectangle();

            line2LayoutInfo.textRect.x = x;
            line2LayoutInfo.textRect.y = y;
            line2LayoutInfo.textRect.width = lastTextLineWidth;
            line2LayoutInfo.textRect.height = labelHeight;

            result.textLayoutInfoList = new ArrayList<TextLayoutInfo>();
            result.textLayoutInfoList.add(line1LayoutInfo);
            result.textLayoutInfoList.add(line2LayoutInfo);
        }

        if (hasPopupIcon) {
            if (lastTextLineWidth > 0) {
                if (ltr) {
                    x += 2 * layoutHGap;
                    x += lastTextLineWidth;
                } else {
                    x -= 2 * layoutHGap;
                    x -= labelHeight / 2;
                }
            } else {
                x = (width - 1 - labelHeight / 2) / 2;
            }

            result.popupActionRect.x = x;
            result.popupActionRect.y = y - 1;
            result.popupActionRect.width = 1 + labelHeight / 2;
            result.popupActionRect.height = labelHeight + 2;
        }

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
                    int yBorderBetweenActionAndPopupAreas = result.iconRect.y + result.iconRect.height
                            + layoutVGap;

                    result.actionClickArea.x = 0;
                    result.actionClickArea.y = 0;
                    result.actionClickArea.width = width;
                    result.actionClickArea.height = yBorderBetweenActionAndPopupAreas;

                    result.popupClickArea.x = 0;
                    result.popupClickArea.y = yBorderBetweenActionAndPopupAreas;
                    result.popupClickArea.width = width;
                    result.popupClickArea.height = height - yBorderBetweenActionAndPopupAreas;

                    result.isTextInActionArea = false;
                } else {
                    result.popupClickArea.x = 0;
                    result.popupClickArea.y = 0;
                    result.popupClickArea.width = width;
                    result.popupClickArea.height = height;

                    result.isTextInActionArea = false;
                }
        }

        return result;
    }
}
