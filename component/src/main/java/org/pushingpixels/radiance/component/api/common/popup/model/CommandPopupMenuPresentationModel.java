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

import org.pushingpixels.radiance.component.api.common.CommandButtonLayoutManager;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.api.common.popup.JCommandPopupMenuPanel;
import org.pushingpixels.radiance.component.internal.ui.common.CommandButtonLayoutManagerMedium;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

/**
 * Presentation model for a command popup menu.
 */
public class CommandPopupMenuPresentationModel extends BaseCommandPopupMenuPresentationModel {
    /**
     * Default presentation state for popup menus.
     */
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

    /**
     * Presentation model for the popup menu panel.
     */
    private CommandPopupMenuPanelPresentationModel panelPresentationModel;

    /**
     * Presentation state for menu items.
     */
    private CommandButtonPresentationState itemPresentationState;
    /**
     * Icon filter strategy for menu items when active.
     */
    private RadianceThemingSlices.IconFilterStrategy itemActiveIconFilterStrategy;
    /**
     * Icon filter strategy for menu items when enabled.
     */
    private RadianceThemingSlices.IconFilterStrategy itemEnabledIconFilterStrategy;
    /**
     * Icon filter strategy for menu items when disabled.
     */
    private RadianceThemingSlices.IconFilterStrategy itemDisabledIconFilterStrategy;
    /**
     * Padding around menu item content.
     */
    private Insets itemContentPadding;
    /**
     * Sides for menu items.
     */
    private RadianceThemingSlices.Sides itemSides;
    /**
     * Horizontal alignment of menu items.
     */
    private HorizontalAlignment itemHorizontalAlignment;
    /**
     * Popup fire trigger for menu items.
     */
    private CommandButtonPresentationModel.PopupFireTrigger itemPopupFireTrigger;
    /**
     * Selected state highlight for menu items.
     */
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
    /**
     * Whether to dismiss the popup on command activation.
     */
    private boolean toDismissOnCommandActivation;
    /**
     * Strategy for positioning the popup.
     */
    private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;

    /**
     * Constructs a {@code CommandPopupMenuPresentationModel}.
     */
    private CommandPopupMenuPresentationModel() {
    }

    /**
     * Creates a new builder for {@link CommandPopupMenuPresentationModel}.
     *
     * @return A new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the presentation model for the popup menu panel.
     *
     * @return The panel presentation model.
     */
    public CommandPopupMenuPanelPresentationModel getPanelPresentationModel() {
        return this.panelPresentationModel;
    }

    /**
     * Returns the presentation state for menu items.
     *
     * @return The presentation state.
     */
    public CommandButtonPresentationState getItemPresentationState() {
        return this.itemPresentationState;
    }

    /**
     * Returns the icon filter strategy for menu items when active.
     *
     * @return The strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getItemActiveIconFilterStrategy() {
        return this.itemActiveIconFilterStrategy;
    }

    /**
     * Returns the icon filter strategy for menu items when enabled.
     *
     * @return The strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getItemEnabledIconFilterStrategy() {
        return this.itemEnabledIconFilterStrategy;
    }

    /**
     * Returns the icon filter strategy for menu items when disabled.
     *
     * @return The strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getItemDisabledIconFilterStrategy() {
        return this.itemDisabledIconFilterStrategy;
    }

    /**
     * Returns the padding around menu item content.
     *
     * @return The padding.
     */
    public Insets getItemContentPadding() {
        return this.itemContentPadding;
    }

    /**
     * Returns the sides for menu items.
     *
     * @return The sides.
     */
    public RadianceThemingSlices.Sides getItemSides() {
        return this.itemSides;
    }

    /**
     * Returns the horizontal alignment of menu items.
     *
     * @return The alignment.
     */
    public HorizontalAlignment getItemHorizontalAlignment() {
        return this.itemHorizontalAlignment;
    }

    /**
     * Returns the popup fire trigger for menu items.
     *
     * @return The popup fire trigger.
     */
    public CommandButtonPresentationModel.PopupFireTrigger getItemPopupFireTrigger() {
        return this.itemPopupFireTrigger;
    }

    /**
     * Returns the selected state highlight for menu items.
     *
     * @return The selected state highlight.
     */
    public CommandButtonPresentationModel.SelectedStateHighlight getItemSelectedStateHighlight() {
        return this.itemSelectedStateHighlight;
    }

    /**
     * Returns the maximum number of visible menu commands.
     *
     * @return The max visible menu commands.
     */
    public int getMaxVisibleMenuCommands() {
        return this.maxVisibleMenuCommands;
    }

    /**
     * Returns whether to dismiss the popup on command activation.
     *
     * @return {@code true} if dismiss on activation.
     */
    public boolean isToDismissOnCommandActivation() {
        return this.toDismissOnCommandActivation;
    }

    /**
     * Returns the popup placement strategy.
     *
     * @return The popup placement strategy.
     */
    public RadianceThemingSlices.PopupPlacementStrategy getPopupPlacementStrategy() {
        return this.popupPlacementStrategy;
    }

    /**
     * Builder for {@link CommandPopupMenuPresentationModel}.
     */
    public static class Builder {
        /**
         * Panel presentation model.
         */
        private CommandPopupMenuPanelPresentationModel panelPresentationModel;
        /**
         * Item presentation state.
         */
        private CommandButtonPresentationState itemPresentationState =
                DEFAULT_POPUP_MENU_PRESENTATION_STATE;
        /**
         * Active icon filter strategy.
         */
        private RadianceThemingSlices.IconFilterStrategy itemActiveIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        /**
         * Enabled icon filter strategy.
         */
        private RadianceThemingSlices.IconFilterStrategy itemEnabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        /**
         * Disabled icon filter strategy.
         */
        private RadianceThemingSlices.IconFilterStrategy itemDisabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_TOKENS;
        /**
         * Item content padding.
         */
        private Insets itemContentPadding =
                CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING;
        /**
         * Item sides.
         */
        private RadianceThemingSlices.Sides itemSides = RadianceThemingSlices.Sides.CLOSED_RECTANGLE;
        /**
         * Item horizontal alignment.
         */
        private HorizontalAlignment itemHorizontalAlignment = HorizontalAlignment.FILL;
        /**
         * Item popup fire trigger.
         */
        private CommandButtonPresentationModel.PopupFireTrigger itemPopupFireTrigger =
                CommandButtonPresentationModel.PopupFireTrigger.ON_ROLLOVER;
        /**
         * Item selected state highlight.
         */
        private CommandButtonPresentationModel.SelectedStateHighlight itemSelectedStateHighlight =
                CommandButtonPresentationModel.SelectedStateHighlight.ICON_ONLY;
        /**
         * Maximum visible items.
         */
        private int maxVisibleItems = -1;
        /**
         * Whether to dismiss on command activation.
         */
        private boolean toDismissOnCommandActivation = true;
        /**
         * Popup placement strategy.
         */
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                RadianceThemingSlices.PopupPlacementStrategy.Endward.VALIGN_TOP;

        /**
         * Constructs a {@code Builder}.
         */
        public Builder() {
        }

        /**
         * Sets the panel presentation model.
         *
         * @param panelPresentationModel The panel presentation model.
         * @return This builder.
         */
        public Builder setPanelPresentationModel(
                CommandPopupMenuPanelPresentationModel panelPresentationModel) {
            this.panelPresentationModel = panelPresentationModel;
            return this;
        }

        /**
         * Sets the item presentation state.
         *
         * @param itemPresentationState The presentation state.
         * @return This builder.
         */
        public Builder setItemPresentationState(
                CommandButtonPresentationState itemPresentationState) {
            this.itemPresentationState = itemPresentationState;
            return this;
        }

        /**
         * Sets the item filter strategies.
         *
         * @param menuActiveIconFilterStrategy The active state strategy.
         * @param menuEnabledIconFilterStrategy The enabled state strategy.
         * @param menuDisabledIconFilterStrategy The disabled state strategy.
         * @return This builder.
         */
        public Builder setItemFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy menuActiveIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy menuEnabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy menuDisabledIconFilterStrategy) {
            this.itemActiveIconFilterStrategy = menuActiveIconFilterStrategy;
            this.itemEnabledIconFilterStrategy = menuEnabledIconFilterStrategy;
            this.itemDisabledIconFilterStrategy = menuDisabledIconFilterStrategy;
            return this;
        }

        /**
         * Sets the item content padding.
         *
         * @param itemContentPadding The padding.
         * @return This builder.
         */
        public Builder setItemContentPadding(Insets itemContentPadding) {
            this.itemContentPadding = itemContentPadding;
            return this;
        }

        /**
         * Sets the item sides.
         *
         * @param itemSides The sides.
         * @return This builder.
         */
        public Builder setItemSides(RadianceThemingSlices.Sides itemSides) {
            this.itemSides = itemSides;
            return this;
        }

        /**
         * Sets the item horizontal alignment.
         *
         * @param itemHorizontalAlignment The alignment.
         * @return This builder.
         */
        public Builder setItemHorizontalAlignment(HorizontalAlignment itemHorizontalAlignment) {
            this.itemHorizontalAlignment = itemHorizontalAlignment;
            return this;
        }

        /**
         * Sets the item popup fire trigger.
         *
         * @param itemPopupFireTrigger The popup fire trigger.
         * @return This builder.
         */
        public Builder setItemPopupFireTrigger(CommandButtonPresentationModel.PopupFireTrigger itemPopupFireTrigger) {
            this.itemPopupFireTrigger = itemPopupFireTrigger;
            return this;
        }

        /**
         * Sets the item selected state highlight.
         *
         * @param itemSelectedStateHighlight The selected state highlight.
         * @return This builder.
         */
        public Builder setItemSelectedStateHighlight(CommandButtonPresentationModel.SelectedStateHighlight itemSelectedStateHighlight) {
            this.itemSelectedStateHighlight = itemSelectedStateHighlight;
            return this;
        }

        /**
         * Sets the maximum visible items.
         *
         * @param maxVisibleItems The max visible items.
         * @return This builder.
         */
        public Builder setMaxVisibleItems(int maxVisibleItems) {
            this.maxVisibleItems = maxVisibleItems;
            return this;
        }

        /**
         * Sets whether to dismiss on command activation.
         *
         * @param toDismissOnCommandActivation {@code true} to dismiss on activation.
         * @return This builder.
         */
        public Builder setToDismissOnCommandActivation(boolean toDismissOnCommandActivation) {
            this.toDismissOnCommandActivation = toDismissOnCommandActivation;
            return this;
        }

        /**
         * Sets the popup placement strategy.
         *
         * @param popupPlacementStrategy The strategy.
         * @return This builder.
         */
        public Builder setPopupPlacementStrategy(
                RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {
            this.popupPlacementStrategy = popupPlacementStrategy;
            return this;
        }

        /**
         * Builds the {@link CommandPopupMenuPresentationModel}.
         *
         * @return The built model.
         */
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
