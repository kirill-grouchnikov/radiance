/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.common.popup.model;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.internal.ui.common.CommandButtonLayoutManagerMedium;

public class CommandPopupMenuPresentationModel extends AbstractPopupMenuPresentationModel {
    public static final CommandButtonPresentationState DEFAULT_POPUP_MENU_PRESENTATION_STATE =
            new CommandButtonPresentationState("Popup menu", 16) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(
                        AbstractCommandButton commandButton) {
                    return new CommandButtonLayoutManagerMedium() {
                        @Override
                        protected float getIconTextGapFactor() {
                            return 2.0f;
                        }
                    };
                }
            };

    private CommandPanelPresentationModel panelPresentationModel;

    private CommandButtonPresentationState menuPresentationState;

    /**
     * Maximum number of menu items visible in this model. If more commands are
     * added with the
     * {@link CommandGroupModel#addCommand(Command)}
     * on one or more of the command groups in {@link CommandPopupMenuContentModel}, the menu
     * part will show scroller buttons above the first and below the last menu command. If
     * the value is negative, there is no limitation on how many menu commands
     * are shown, and the entire
     * {@link org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu} can overflow the
     * monitor edges.
     */
    private int maxVisibleMenuCommands;
    private boolean toDismissOnCommandActivation;
    private CommandPresentation.CommandButtonPopupOrientationKind popupOrientationKind;

    private CommandPopupMenuPresentationModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommandPanelPresentationModel getPanelPresentationModel() {
        return this.panelPresentationModel;
    }

    public CommandButtonPresentationState getMenuPresentationState() {
        return this.menuPresentationState;
    }

    public int getMaxVisibleMenuCommands() {
        return this.maxVisibleMenuCommands;
    }

    public boolean isToDismissOnCommandActivation() {
        return this.toDismissOnCommandActivation;
    }

    public CommandPresentation.CommandButtonPopupOrientationKind getPopupOrientationKind() {
        return this.popupOrientationKind;
    }

    public static class Builder {
        private CommandPanelPresentationModel panelPresentationModel;
        private CommandButtonPresentationState menuPresentationState =
                DEFAULT_POPUP_MENU_PRESENTATION_STATE;
        private int maxVisibleMenuCommands = -1;
        private boolean toDismissOnCommandActivation = true;
        private CommandPresentation.CommandButtonPopupOrientationKind popupOrientationKind =
                CommandPresentation.CommandButtonPopupOrientationKind.DOWNWARD;

        public Builder setPanelPresentationModel(
                CommandPanelPresentationModel panelPresentationModel) {
            this.panelPresentationModel = panelPresentationModel;
            return this;
        }

        public Builder setMenuPresentationState(
                CommandButtonPresentationState menuPresentationState) {
            this.menuPresentationState = menuPresentationState;
            return this;
        }

        public Builder setMaxVisibleMenuCommands(int maxVisibleMenuCommands) {
            this.maxVisibleMenuCommands = maxVisibleMenuCommands;
            return this;
        }

        public Builder setToDismissOnCommandActivation(boolean toDismissOnCommandActivation) {
            this.toDismissOnCommandActivation = toDismissOnCommandActivation;
            return this;
        }

        public Builder setPopupOrientationKind(
                CommandPresentation.CommandButtonPopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return this;
        }

        public CommandPopupMenuPresentationModel build() {
            CommandPopupMenuPresentationModel presentationModel =
                    new CommandPopupMenuPresentationModel();
            presentationModel.panelPresentationModel = this.panelPresentationModel;
            presentationModel.menuPresentationState = this.menuPresentationState;
            presentationModel.maxVisibleMenuCommands = this.maxVisibleMenuCommands;
            presentationModel.toDismissOnCommandActivation = this.toDismissOnCommandActivation;
            presentationModel.popupOrientationKind = this.popupOrientationKind;
            return presentationModel;
        }
    }
}
