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
package org.pushingpixels.flamingo.internal.ui.ribbon.appmenu;

import org.pushingpixels.flamingo.api.common.CommandButtonLayoutManager;
import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonFrame;
import org.pushingpixels.flamingo.api.ribbon.projection.RibbonApplicationMenuCommandButtonProjection;
import org.pushingpixels.flamingo.internal.ui.common.FlamingoInternalButton;
import org.pushingpixels.substance.internal.utils.SubstanceCoreUtilities;
import org.pushingpixels.substance.internal.utils.SubstanceMetricsUtilities;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * The main application menu button for {@link JRibbon} component placed in a
 * {@link JRibbonFrame}. This class is for internal use only.
 *
 * @author Kirill Grouchnikov
 */
public class JRibbonApplicationMenuButton extends JCommandButton
        implements FlamingoInternalButton {
    private final static CommandButtonPresentationState APP_MENU_BUTTON_STATE =
            new CommandButtonPresentationState("Ribbon Application Menu Button", 16) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(JCommandButton
                        commandButton) {
                    return new CommandButtonLayoutManager() {
                        @Override
                        public int getPreferredIconSize(JCommandButton commandButton) {
                            return 0;
                        }

                        @Override
                        public CommandButtonLayoutInfo getLayoutInfo(
                                JCommandButton commandButton) {
                            CommandButtonLayoutInfo result = new CommandButtonLayoutInfo();
                            result.actionClickArea = new Rectangle(0, 0, 0, 0);
                            result.popupActionRect = new Rectangle(0, 0, 0, 0);
                            result.isTextInActionArea = false;

                            FontMetrics fm = SubstanceMetricsUtilities.getFontMetrics(
                                    SubstanceCoreUtilities.getScaleFactor(commandButton),
                                    commandButton.getFont());
                            int labelHeight = fm.getAscent() + fm.getDescent();

                            int availableWidth = commandButton.getWidth();
                            int textWidth = fm.stringWidth(commandButton.getText());

                            TextLayoutInfo lineLayoutInfo = new TextLayoutInfo();
                            lineLayoutInfo.text = commandButton.getText();
                            lineLayoutInfo.textRect = new Rectangle();
                            result.textLayoutInfoList = new ArrayList<>();
                            result.textLayoutInfoList.add(lineLayoutInfo);

                            lineLayoutInfo.textRect.x = (availableWidth - textWidth) / 2;
                            lineLayoutInfo.textRect.y =
                                    (commandButton.getHeight() - labelHeight) / 2;
                            lineLayoutInfo.textRect.width = textWidth;
                            lineLayoutInfo.textRect.height = labelHeight;

                            result.popupClickArea = new Rectangle(0, 0, availableWidth,
                                    commandButton.getHeight());

                            return result;
                        }

                        @Override
                        public Dimension getPreferredSize(
                                JCommandButton commandButton) {
                            return new Dimension(40, 20);
                        }

                        @Override
                        public Point getActionKeyTipAnchorCenterPoint(
                                JCommandButton commandButton) {
                            return null;
                        }

                        @Override
                        public Point getPopupKeyTipAnchorCenterPoint(
                                JCommandButton commandButton) {
                            // center at the middle of the bottom edge to be consistent with
                            // the location of key tips of the task toggle buttons
                            return new Point(commandButton.getWidth() / 2,
                                    commandButton.getHeight());
                        }
                    };
                }
            };

    public JRibbonApplicationMenuButton(
            RibbonApplicationMenuCommandButtonProjection ribbonApplicationMenuCommandProjection) {
        // Reproject the command so that the button uses our custom state and centered text
        super(ribbonApplicationMenuCommandProjection.reproject(
                CommandButtonPresentationModel.builder()
                        .setPresentationState(APP_MENU_BUTTON_STATE)
                        .setHorizontalAlignment(SwingConstants.CENTER)
                        .build()));
    }
}
