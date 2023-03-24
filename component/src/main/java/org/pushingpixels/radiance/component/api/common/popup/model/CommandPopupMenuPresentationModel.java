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
package org.pushingpixels.radiance.component.api.common.popup.model;

import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.popup.JCommandPopupMenuPanel;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonLayoutManagerMedium;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

public class CommandPopupMenuPresentationModel extends AbstractPopupMenuPresentationModel {
    public static final CommandButtonPresentationState DEFAULT_POPUP_MENU_PRESENTATION_STATE =
            new CommandButtonPresentationState("Popup menu", 16) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(JCommandButton commandButton) {
                    return new CommandButtonLayoutManagerMedium() {
                        @Override
                        protected float getIconTextGapFactor() {
                            return 2.0f;
                        }
                    };
                }
            };

    private CommandPopupMenuPanelPresentationModel panelPresentationModel;

    private CommandButtonPresentationState menuPresentationState;
    private RadianceThemingSlices.IconFilterStrategy menuActiveIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy menuEnabledIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy menuDisabledIconFilterStrategy;
    private Insets menuContentPadding;
    private CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger;
    private CommandButtonPresentationModel.SelectedStateHighlight menuSelectedStateHighlight;

    /**
     * Maximum number of menu items visible in this model. If more commands are
     * added with the
     * {@link CommandGroup#addCommand(Command)}
     * on one or more of the command groups in {@link CommandMenuContentModel}, the menu
     * part will show scroller buttons above the first and below the last menu command. If
     * the value is negative, there is no limitation on how many menu commands
     * are shown, and the entire
     * {@link JCommandPopupMenuPanel} can overflow the
     * monitor edges.
     */
    private int maxVisibleMenuCommands;
    private boolean toDismissOnCommandActivation;
    private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;

    private CommandPopupMenuPresentationModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommandPopupMenuPanelPresentationModel getPanelPresentationModel() {
        return this.panelPresentationModel;
    }

    public CommandButtonPresentationState getMenuPresentationState() {
        return this.menuPresentationState;
    }

    public RadianceThemingSlices.IconFilterStrategy getMenuActiveIconFilterStrategy() {
        return this.menuActiveIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getMenuEnabledIconFilterStrategy() {
        return this.menuEnabledIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getMenuDisabledIconFilterStrategy() {
        return this.menuDisabledIconFilterStrategy;
    }

    public Insets getMenuContentPadding() {
        return this.menuContentPadding;
    }

    public CommandButtonPresentationModel.PopupFireTrigger getMenuPopupFireTrigger() {
        return this.menuPopupFireTrigger;
    }

    public CommandButtonPresentationModel.SelectedStateHighlight getMenuSelectedStateHighlight() {
        return this.menuSelectedStateHighlight;
    }

    public int getMaxVisibleMenuCommands() {
        return this.maxVisibleMenuCommands;
    }

    public boolean isToDismissOnCommandActivation() {
        return this.toDismissOnCommandActivation;
    }

    public RadianceThemingSlices.PopupPlacementStrategy getPopupPlacementStrategy() {
        return this.popupPlacementStrategy;
    }

    public static class Builder {
        private CommandPopupMenuPanelPresentationModel panelPresentationModel;
        private CommandButtonPresentationState menuPresentationState =
                DEFAULT_POPUP_MENU_PRESENTATION_STATE;
        private RadianceThemingSlices.IconFilterStrategy menuActiveIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy menuEnabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy menuDisabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
        private Insets menuContentPadding =
                CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING;
        private CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger =
                CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER;
        private CommandButtonPresentationModel.SelectedStateHighlight menuSelectedStateHighlight =
                CommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY;
        private int maxVisibleMenuCommands = -1;
        private boolean toDismissOnCommandActivation = true;
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP;

        public Builder setPanelPresentationModel(
                CommandPopupMenuPanelPresentationModel panelPresentationModel) {
            this.panelPresentationModel = panelPresentationModel;
            return this;
        }

        public Builder setMenuPresentationState(
                CommandButtonPresentationState menuPresentationState) {
            this.menuPresentationState = menuPresentationState;
            return this;
        }

        public Builder setMenuIconFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy menuActiveIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy menuEnabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy menuDisabledIconFilterStrategy) {
            this.menuActiveIconFilterStrategy = menuActiveIconFilterStrategy;
            this.menuEnabledIconFilterStrategy = menuEnabledIconFilterStrategy;
            this.menuDisabledIconFilterStrategy = menuDisabledIconFilterStrategy;
            return this;
        }

        public Builder setMenuContentPadding(Insets menuContentPadding) {
            this.menuContentPadding = menuContentPadding;
            return this;
        }

        public Builder setMenuPopupFireTrigger(CommandButtonPresentationModel.PopupFireTrigger menuPopupFireTrigger) {
            this.menuPopupFireTrigger = menuPopupFireTrigger;
            return this;
        }

        public Builder setMenuSelectedStateHighlight(CommandButtonPresentationModel.SelectedStateHighlight menuSelectedStateHighlight) {
            this.menuSelectedStateHighlight = menuSelectedStateHighlight;
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

        public Builder setPopupPlacementStrategy(
                RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {
            this.popupPlacementStrategy = popupPlacementStrategy;
            return this;
        }

        public CommandPopupMenuPresentationModel build() {
            CommandPopupMenuPresentationModel presentationModel =
                    new CommandPopupMenuPresentationModel();
            presentationModel.panelPresentationModel = this.panelPresentationModel;
            presentationModel.menuPresentationState = this.menuPresentationState;
            presentationModel.menuActiveIconFilterStrategy = this.menuActiveIconFilterStrategy;
            presentationModel.menuEnabledIconFilterStrategy = this.menuEnabledIconFilterStrategy;
            presentationModel.menuDisabledIconFilterStrategy = this.menuDisabledIconFilterStrategy;
            presentationModel.menuContentPadding = this.menuContentPadding;
            presentationModel.menuPopupFireTrigger = this.menuPopupFireTrigger;
            presentationModel.menuSelectedStateHighlight = this.menuSelectedStateHighlight;
            presentationModel.maxVisibleMenuCommands = this.maxVisibleMenuCommands;
            presentationModel.toDismissOnCommandActivation = this.toDismissOnCommandActivation;
            presentationModel.popupPlacementStrategy = this.popupPlacementStrategy;
            return presentationModel;
        }
    }
}
