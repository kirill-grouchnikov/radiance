/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.common.popup.model;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;

/**
 * Presentation model for a color selector popup menu.
 */
public class ColorSelectorPopupMenuPresentationModel extends BaseCommandPopupMenuPresentationModel {
    /**
     * Number of columns for color display.
     */
    private int colorColumns;
    /**
     * Presentation state for menu buttons.
     */
    private CommandButtonPresentationState menuPresentationState;
    /**
     * Popup fire trigger for menu buttons.
     */
    private CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger;
    /**
     * Selected state highlight for menu buttons.
     */
    private CommandButtonPresentationModel.SelectedStateHighlight selectedStateHighlight;

    /**
     * Constructs a {@code ColorSelectorPopupMenuPresentationModel}.
     */
    private ColorSelectorPopupMenuPresentationModel() {
    }

    /**
     * Creates a new builder for {@link ColorSelectorPopupMenuPresentationModel}.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the number of columns for color display.
     *
     * @return The number of columns.
     */
    public int getColorColumns() {
        return this.colorColumns;
    }

    /**
     * Returns the presentation state for menu buttons.
     *
     * @return The presentation state.
     */
    public CommandButtonPresentationState getMenuPresentationState() {
        return this.menuPresentationState;
    }

    /**
     * Returns the popup fire trigger for menu buttons.
     *
     * @return The popup fire trigger.
     */
    public CommandButtonPresentationModel.PopupFireTrigger getMenuPopupFireTrigger() {
        return this.menuPopupFireTrigger;
    }

    /**
     * Returns the selected state highlight for menu buttons.
     *
     * @return The selected state highlight.
     */
    public CommandButtonPresentationModel.SelectedStateHighlight getSelectedStateHighlight() {
        return this.selectedStateHighlight;
    }

    /**
     * Builder for {@link ColorSelectorPopupMenuPresentationModel}.
     */
    public static class Builder {
        /**
         * Number of columns for color display.
         */
        private int colorColumns = 10;
        /**
         * Presentation state for menu buttons.
         */
        private CommandButtonPresentationState menuPresentationState =
                CommandPopupMenuPresentationModel.DEFAULT_POPUP_MENU_PRESENTATION_STATE;
        /**
         * Popup fire trigger for menu buttons.
         */
        private CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger =
            CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER;
        /**
         * Selected state highlight for menu buttons.
         */
        private CommandButtonPresentationModel.SelectedStateHighlight selectedStateHighlight =
                CommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY;

        /**
         * Constructs a {@code Builder}.
         */
        public Builder() {
        }

        /**
         * Sets the number of columns for color display.
         *
         * @param colorColumns The number of columns.
         * @return This builder.
         */
        public Builder setColorColumns(int colorColumns) {
            this.colorColumns = colorColumns;
            return this;
        }

        /**
         * Sets the presentation state for menu buttons.
         *
         * @param menuPresentationState The presentation state.
         * @return This builder.
         */
        public Builder setMenuPresentationState(
                CommandButtonPresentationState menuPresentationState) {
            this.menuPresentationState = menuPresentationState;
            return this;
        }

        /**
         * Sets the popup fire trigger for menu buttons.
         *
         * @param menuPopupFireTrigger The popup fire trigger.
         * @return This builder.
         */
        public Builder setMenuPopupFireTrigger(CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger) {
            this.menuPopupFireTrigger = menuPopupFireTrigger;
            return this;
        }

        /**
         * Sets the selected state highlight for menu buttons.
         *
         * @param selectedStateHighlight The selected state highlight.
         * @return This builder.
         */
        public Builder setSelectedStateHighlight(CommandButtonPresentationModel.SelectedStateHighlight selectedStateHighlight) {
            this.selectedStateHighlight = selectedStateHighlight;
            return this;
        }

        /**
         * Builds the {@link ColorSelectorPopupMenuPresentationModel}.
         *
         * @return The built model.
         */
        public ColorSelectorPopupMenuPresentationModel build() {
            ColorSelectorPopupMenuPresentationModel presentationModel =
                    new ColorSelectorPopupMenuPresentationModel();
            presentationModel.colorColumns = this.colorColumns;
            presentationModel.menuPresentationState = this.menuPresentationState;
            presentationModel.menuPopupFireTrigger = this.menuPopupFireTrigger;
            presentationModel.selectedStateHighlight = this.selectedStateHighlight;
            return presentationModel;
        }
    }
}
