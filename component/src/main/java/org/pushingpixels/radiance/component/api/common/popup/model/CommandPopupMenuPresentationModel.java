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
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.popup.JCommandPopupMenuPanel;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonLayoutManagerMedium;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

public class CommandPopupMenuPresentationModel extends BaseCommandPopupMenuPresentationModel {
    public static final CommandButtonPresentationState DEFAULT_POPUP_MENU_PRESENTATION_STATE =
            new CommandButtonPresentationState("Popup menu", 16) {
                @Override
                public CommandButtonLayoutManager createLayoutManager() {
                    return new CommandButtonLayoutManagerMedium() {
                        @Override
                        protected float getIconTextGapFactor() {
                            return 2.0f;
                        }
                    };
                }
            };

    private CommandPopupMenuPanelPresentationModel panelPresentationModel;

    private CommandButtonPresentationState itemPresentationState;
    private RadianceThemingSlices.IconFilterStrategy itemActiveIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy itemEnabledIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy itemDisabledIconFilterStrategy;
    private Insets itemContentPadding;
    private RadianceThemingSlices.Sides itemSides;
    private HorizontalAlignment itemHorizontalAlignment;
    private CommandButtonPresentationModel.PopupFireTrigger itemPopupFireTrigger;
    private CommandButtonPresentationModel.SelectedStateHighlight itemSelectedStateHighlight;

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

    public CommandButtonPresentationState getItemPresentationState() {
        return this.itemPresentationState;
    }

    public RadianceThemingSlices.IconFilterStrategy getItemActiveIconFilterStrategy() {
        return this.itemActiveIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getItemEnabledIconFilterStrategy() {
        return this.itemEnabledIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getItemDisabledIconFilterStrategy() {
        return this.itemDisabledIconFilterStrategy;
    }

    public Insets getItemContentPadding() {
        return this.itemContentPadding;
    }

    public RadianceThemingSlices.Sides getItemSides() {
        return this.itemSides;
    }

    public HorizontalAlignment getItemHorizontalAlignment() {
        return this.itemHorizontalAlignment;
    }

    public CommandButtonPresentationModel.PopupFireTrigger getItemPopupFireTrigger() {
        return this.itemPopupFireTrigger;
    }

    public CommandButtonPresentationModel.SelectedStateHighlight getItemSelectedStateHighlight() {
        return this.itemSelectedStateHighlight;
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
        private CommandButtonPresentationState itemPresentationState =
                DEFAULT_POPUP_MENU_PRESENTATION_STATE;
        private RadianceThemingSlices.IconFilterStrategy itemActiveIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy itemEnabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy itemDisabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
        private Insets itemContentPadding =
                CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING;
        private RadianceThemingSlices.Sides itemSides = RadianceThemingSlices.Sides.CLOSED_RECTANGLE;
        private HorizontalAlignment itemHorizontalAlignment = HorizontalAlignment.FILL;
        private CommandButtonPresentationModel.PopupFireTrigger itemPopupFireTrigger =
                CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER;
        private CommandButtonPresentationModel.SelectedStateHighlight itemSelectedStateHighlight =
                CommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY;
        private int maxVisibleItems = -1;
        private boolean toDismissOnCommandActivation = true;
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP;

        public Builder setPanelPresentationModel(
                CommandPopupMenuPanelPresentationModel panelPresentationModel) {
            this.panelPresentationModel = panelPresentationModel;
            return this;
        }

        public Builder setItemPresentationState(
                CommandButtonPresentationState itemPresentationState) {
            this.itemPresentationState = itemPresentationState;
            return this;
        }

        public Builder setItemFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy menuActiveIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy menuEnabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy menuDisabledIconFilterStrategy) {
            this.itemActiveIconFilterStrategy = menuActiveIconFilterStrategy;
            this.itemEnabledIconFilterStrategy = menuEnabledIconFilterStrategy;
            this.itemDisabledIconFilterStrategy = menuDisabledIconFilterStrategy;
            return this;
        }

        public Builder setItemContentPadding(Insets itemContentPadding) {
            this.itemContentPadding = itemContentPadding;
            return this;
        }

        public Builder setItemSides(RadianceThemingSlices.Sides itemSides) {
            this.itemSides = itemSides;
            return this;
        }

        public Builder setItemHorizontalAlignment(HorizontalAlignment itemHorizontalAlignment) {
            this.itemHorizontalAlignment = itemHorizontalAlignment;
            return this;
        }

        public Builder setItemPopupFireTrigger(CommandButtonPresentationModel.PopupFireTrigger itemPopupFireTrigger) {
            this.itemPopupFireTrigger = itemPopupFireTrigger;
            return this;
        }

        public Builder setItemSelectedStateHighlight(CommandButtonPresentationModel.SelectedStateHighlight itemSelectedStateHighlight) {
            this.itemSelectedStateHighlight = itemSelectedStateHighlight;
            return this;
        }

        public Builder setMaxVisibleItems(int maxVisibleItems) {
            this.maxVisibleItems = maxVisibleItems;
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
            presentationModel.itemPresentationState = this.itemPresentationState;
            presentationModel.itemActiveIconFilterStrategy = this.itemActiveIconFilterStrategy;
            presentationModel.itemEnabledIconFilterStrategy = this.itemEnabledIconFilterStrategy;
            presentationModel.itemDisabledIconFilterStrategy = this.itemDisabledIconFilterStrategy;
            presentationModel.itemContentPadding = this.itemContentPadding;
            presentationModel.itemSides = this.itemSides;
            presentationModel.itemHorizontalAlignment = this.itemHorizontalAlignment;
            presentationModel.itemPopupFireTrigger = this.itemPopupFireTrigger;
            presentationModel.itemSelectedStateHighlight = this.itemSelectedStateHighlight;
            presentationModel.maxVisibleMenuCommands = this.maxVisibleItems;
            presentationModel.toDismissOnCommandActivation = this.toDismissOnCommandActivation;
            presentationModel.popupPlacementStrategy = this.popupPlacementStrategy;
            return presentationModel;
        }
    }
}
