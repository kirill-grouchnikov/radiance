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
package org.pushingpixels.radiance.component.api.common;

import org.pushingpixels.radiance.component.api.common.model.Command;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;
import org.pushingpixels.radiance.component.api.common.model.CommandMenuContentModel;
import org.pushingpixels.radiance.component.api.common.popup.PopupPanelCallback;
import org.pushingpixels.radiance.component.api.common.popup.model.AbstractPopupMenuPresentationModel;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

/**
 * Definition of a layout manager for {@link JCommandButton}s.
 *
 * @author Kirill Grouchnikov
 */
public interface CommandButtonLayoutManager extends PropertyChangeListener {
    /**
     * Enumerates the available values for separator orientations.
     *
     * @author Kirill Grouchnikov
     */
    enum CommandButtonSeparatorOrientation {
        /**
         * Vertical separator orientation.
         */
        VERTICAL,

        /**
         * Horizontal separator orientation.
         */
        HORIZONTAL
    }

    /**
     * Layout information on a single line of text.
     *
     * @author Kirill Grouchnikov
     */
    class TextLayoutInfo {
        /**
         * Text itself.
         */
        public String text;

        /**
         * The text rectangle.
         */
        public Rectangle textRect;
    }

    /**
     * Layout information on different visual parts of a single command button.
     *
     * @author Kirill Grouchnikov
     */
    class CommandButtonLayoutInfo {
        /**
         * The action area. A mouse click in this area will trigger all
         * listeners associated with the command button action model
         * {@link JCommandButton#addCommandListener(CommandAction)}
         */
        public Rectangle actionClickArea;

        /**
         * The popup area. A mouse click in this area will show the popup content
         * associated with the command button.
         *
         * @see JCommandButton#setPopupCallback(PopupPanelCallback)
         * @see Command.Builder#setSecondaryContentModel(CommandMenuContentModel)
         * @see CommandButtonPresentationModel.Builder#setPopupMenuPresentationModel(AbstractPopupMenuPresentationModel)
         */
        public Rectangle popupClickArea;

        /**
         * The separator area. If it's not empty, the command button will show a
         * separator between {@link #actionClickArea} and
         * {@link #popupClickArea} on mouse rollover - depending on the current
         * look-and-feel.
         */
        public Rectangle separatorArea;

        public CommandButtonSeparatorOrientation separatorOrientation;

        /**
         * Rectangle for the command button icon.
         */
        public Rectangle iconRect;

        /**
         * Layout information for the command button text (that can span
         * multiple lines).
         */
        public List<TextLayoutInfo> textLayoutInfoList;

        /**
         * Layout information for the command button extra text (that can span
         * multiple lines).
         */
        public List<TextLayoutInfo> extraTextLayoutInfoList;

        /**
         * Rectangle for the icon associated with the {@link #popupClickArea}.
         * This icon is usually a single or double arrow indicating that the
         * command button has a popup area.
         */
        public Rectangle popupActionRect;

        /**
         * Indication whether the command button text (rectangles in
         * {@link #textLayoutInfoList}) belongs in the action area.
         */
        public boolean isTextInActionArea;
    }

    /**
     * Returns the preferred size of the specified command button when it uses
     * this layout manager.
     *
     * @param commandButton Command button.
     * @return The preferred size of the specified command button when it uses
     * this layout manager.
     */
    Dimension getPreferredSize(JCommandButton commandButton);

    /**
     * Returns the preferred icon size of the specified command button when it uses
     * this layout manager.
     *
     * @param commandButton Command button.
     * @return The preferred icon size of the specified command button when it uses
     * this layout manager.
     */
    Dimension getPreferredIconSize(JCommandButton commandButton);

    /**
     * Returns the anchor center point of the action key tip of the specified command
     * button.
     *
     * @param commandButton Command button.
     * @return The anchor center point of the action key tip of the specified command
     * button.
     */
    Point getActionKeyTipAnchorCenterPoint(JCommandButton commandButton);

    /**
     * Returns the anchor center point of the popup key tip of the specified command
     * button.
     *
     * @param commandButton Command button.
     * @return The anchor center point of the popup key tip of the specified command
     * button.
     */
    Point getPopupKeyTipAnchorCenterPoint(JCommandButton commandButton);

    /**
     * Returns the layout information for the specified command button.
     *
     * @param commandButton Command button.
     * @return The layout information for the specified command button.
     */
    CommandButtonLayoutInfo getLayoutInfo(JCommandButton commandButton);

    @Override
    default void propertyChange(PropertyChangeEvent evt) {
    }
}
