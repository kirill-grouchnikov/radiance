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
package org.pushingpixels.radiance.component.api.common.popup.model;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.CommandButtonPresentationModel;

public class ColorSelectorPopupMenuPresentationModel extends BaseCommandPopupMenuPresentationModel {
    private int colorColumns;
    private CommandButtonPresentationState menuPresentationState;
    private CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger;
    private CommandButtonPresentationModel.SelectedStateHighlight selectedStateHighlight;

    private ColorSelectorPopupMenuPresentationModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getColorColumns() {
        return this.colorColumns;
    }

    public CommandButtonPresentationState getMenuPresentationState() {
        return this.menuPresentationState;
    }

    public CommandButtonPresentationModel.PopupFireTrigger getMenuPopupFireTrigger() {
        return this.menuPopupFireTrigger;
    }

    public CommandButtonPresentationModel.SelectedStateHighlight getSelectedStateHighlight() {
        return this.selectedStateHighlight;
    }

    public static class Builder {
        private int colorColumns = 10;
        private CommandButtonPresentationState menuPresentationState =
                CommandPopupMenuPresentationModel.DEFAULT_POPUP_MENU_PRESENTATION_STATE;
        private CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger =
            CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER;
        private CommandButtonPresentationModel.SelectedStateHighlight selectedStateHighlight =
                CommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY;

        public Builder setColorColumns(int colorColumns) {
            this.colorColumns = colorColumns;
            return this;
        }

        public Builder setMenuPresentationState(
                CommandButtonPresentationState menuPresentationState) {
            this.menuPresentationState = menuPresentationState;
            return this;
        }

        public Builder setMenuPopupFireTrigger(CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger) {
            this.menuPopupFireTrigger = menuPopupFireTrigger;
            return this;
        }

        public Builder setSelectedStateHighlight(CommandButtonPresentationModel.SelectedStateHighlight selectedStateHighlight) {
            this.selectedStateHighlight = selectedStateHighlight;
            return this;
        }

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
