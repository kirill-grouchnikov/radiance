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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.HorizontalAlignment;
import org.pushingpixels.radiance.component.api.common.icon.CommandButtonDefaultPopupIcon;
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.theming.api.ContainerColorTokensOverlay;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import java.awt.*;

/**
 * Base presentation model for command buttons.
 *
 * @param <MPM> The type of the popup menu presentation model.
 * @param <PM>  The self-referential presentation model type.
 */
public abstract class BaseCommandButtonPresentationModel<MPM extends BaseCommandPopupMenuPresentationModel,
        PM extends BaseCommandButtonPresentationModel<MPM, PM>> implements ImmutablePresentationModel {
    /**
     * Default horizontal alignment for button content.
     */
    public static final HorizontalAlignment DEFAULT_HORIZONTAL_ALIGNMENT = HorizontalAlignment.CENTER;
    /**
     * Default scale factor for gaps between button elements.
     */
    public static final double DEFAULT_GAP_SCALE_FACTOR = 1.0;

    /**
     * Default initial interval in milliseconds for auto-repeat actions.
     */
    public static final int DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS = 500;
    /**
     * Default subsequent interval in milliseconds for auto-repeat actions.
     */
    public static final int DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS = 100;

    /**
     * Content padding for wide buttons.
     */
    public static final Insets WIDE_BUTTON_CONTENT_PADDING = new Insets(3, 10, 2, 10);
    /**
     * Content padding for compact buttons.
     */
    public static final Insets COMPACT_BUTTON_CONTENT_PADDING = new Insets(3, 5, 2, 5);

    /**
     * Current presentation state of the button.
     */
    protected CommandButtonPresentationState presentationState;
    /**
     * Dimension of the button icon.
     */
    protected Dimension iconDimension;
    /**
     * Icon filter strategy when the button is in active state.
     */
    protected RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy;
    /**
     * Icon filter strategy when the button is enabled.
     */
    protected RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
    /**
     * Icon filter strategy when the button is disabled.
     */
    protected RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;
    /**
     * Whether to force allocating space for an icon even when no icon is present.
     */
    protected boolean forceAllocateSpaceForIcon;
    /**
     * Provider for container color tokens overlay.
     */
    protected ContainerColorTokensOverlay.Provider containerColorTokensOverlayProvider;
    /**
     * Strategy for rendering the button background appearance.
     */
    protected RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
    /**
     * Whether the button can receive focus.
     */
    protected boolean isFocusable;
    /**
     * Horizontal alignment of button content.
     */
    protected HorizontalAlignment horizontalAlignment;
    /**
     * Padding around button content.
     */
    protected Insets contentPadding;
    /**
     * Scale factor for horizontal gaps between button elements.
     */
    protected double horizontalGapScaleFactor;
    /**
     * Scale factor for vertical gaps between button elements.
     */
    protected double verticalGapScaleFactor;
    /**
     * Type of highlight shown when the button is selected.
     */
    protected SelectedStateHighlight selectedStateHighlight;
    /**
     * Font for button text.
     */
    protected Font font;
    /**
     * Strategy for positioning popup content.
     */
    protected RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;
    /**
     * Keyboard shortcut tip for the primary action.
     */
    protected String actionKeyTip;
    /**
     * Keyboard shortcut tip for the popup action.
     */
    protected String popupKeyTip;
    /**
     * Whether to dismiss open popups when this button is activated.
     */
    protected boolean toDismissPopupsOnActivation;
    /**
     * Whether to show the popup indicator icon.
     */
    protected boolean showPopupIcon;
    /**
     * Provider for popup anchor bounds on screen.
     */
    protected PopupAnchorBoundsProvider popupAnchorBoundsProvider;
    /**
     * Factory for creating the popup indicator icon.
     */
    protected RadianceIcon.Factory popupIconFactory;
    /**
     * Presentation model for the popup menu.
     */
    protected MPM popupMenuPresentationModel;
    /**
     * Action triggered when clicking the button text.
     */
    protected TextClick textClick;
    /**
     * Whether the button action auto-repeats on hold.
     */
    protected boolean isAutoRepeatAction;
    /**
     * Whether custom auto-repeat intervals have been set.
     */
    protected boolean hasAutoRepeatIntervalsSet;
    /**
     * Initial interval in milliseconds for auto-repeat.
     */
    protected int autoRepeatInitialInterval;
    /**
     * Subsequent interval in milliseconds for auto-repeat.
     */
    protected int autoRepeatSubsequentInterval;
    /**
     * Trigger condition for firing the primary action.
     */
    protected ActionFireTrigger actionFireTrigger;
    /**
     * Trigger condition for firing the popup.
     */
    protected PopupFireTrigger popupFireTrigger;
    /**
     * Rich tooltip presentation model for the primary action.
     */
    protected RichTooltipPresentationModel actionRichTooltipPresentationModel;
    /**
     * Rich tooltip presentation model for the popup.
     */
    protected RichTooltipPresentationModel popupRichTooltipPresentationModel;
    /**
     * Which sides of the button to render.
     */
    protected RadianceThemingSlices.Sides sides;

    /**
     * Constructs a {@code BaseCommandButtonPresentationModel}.
     */
    protected BaseCommandButtonPresentationModel() {
    }

    /**
     * Creates an overlay of this presentation model with the specified customizations.
     *
     * @param overlay The overlay configuration to apply.
     * @return A new presentation model with the overlay applied.
     */
    public abstract PM overlayWith(Overlay overlay);

    /**
     * Creates a new empty overlay builder for customizing presentation model properties.
     *
     * @return A new {@link Overlay} instance.
     */
    public static Overlay overlay() {
        return new Overlay();
    }

    /**
     * Returns the current presentation state of the button.
     *
     * @return The presentation state.
     */
    public CommandButtonPresentationState getPresentationState() {
        return this.presentationState;
    }

    /**
     * Returns the provider for container color tokens overlay.
     *
     * @return The container color tokens overlay provider.
     */
    public ContainerColorTokensOverlay.Provider getContainerColorTokensOverlayProvider() {
        return this.containerColorTokensOverlayProvider;
    }

    /**
     * Returns the background appearance strategy.
     *
     * @return The background appearance strategy.
     */
    public RadianceThemingSlices.BackgroundAppearanceStrategy getBackgroundAppearanceStrategy() {
        return this.backgroundAppearanceStrategy;
    }

    /**
     * Returns whether the button can receive focus.
     *
     * @return {@code true} if the button is focusable.
     */
    public boolean isFocusable() {
        return this.isFocusable;
    }

    /**
     * Returns the horizontal alignment of button content.
     *
     * @return The horizontal alignment.
     */
    public HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /**
     * Returns the padding around button content.
     *
     * @return The content padding.
     */
    public Insets getContentPadding() {
        return this.contentPadding;
    }

    /**
     * Returns the scale factor for horizontal gaps between button elements.
     *
     * @return The horizontal gap scale factor.
     */
    public double getHorizontalGapScaleFactor() {
        return this.horizontalGapScaleFactor;
    }

    /**
     * Returns the scale factor for vertical gaps between button elements.
     *
     * @return The vertical gap scale factor.
     */
    public double getVerticalGapScaleFactor() {
        return this.verticalGapScaleFactor;
    }

    /**
     * Returns the dimension of the button icon.
     *
     * @return The icon dimension.
     */
    public Dimension getIconDimension() {
        return this.iconDimension;
    }

    /**
     * Returns the icon filter strategy when the button is in active state.
     *
     * @return The active icon filter strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getActiveIconFilterStrategy() {
        return this.activeIconFilterStrategy;
    }

    /**
     * Returns the icon filter strategy when the button is enabled.
     *
     * @return The enabled icon filter strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getEnabledIconFilterStrategy() {
        return this.enabledIconFilterStrategy;
    }

    /**
     * Returns the icon filter strategy when the button is disabled.
     *
     * @return The disabled icon filter strategy.
     */
    public RadianceThemingSlices.IconFilterStrategy getDisabledIconFilterStrategy() {
        return this.disabledIconFilterStrategy;
    }

    /**
     * Returns whether to force allocating space for an icon even when no icon is present.
     *
     * @return {@code true} if space for icon is forced.
     */
    public boolean isForceAllocateSpaceForIcon() {
        return this.forceAllocateSpaceForIcon;
    }

    /**
     * Returns the font for button text.
     *
     * @return The font.
     */
    public Font getFont() {
        return this.font;
    }

    /**
     * Returns the strategy for positioning popup content.
     *
     * @return The popup placement strategy.
     */
    public RadianceThemingSlices.PopupPlacementStrategy getPopupPlacementStrategy() {
        return this.popupPlacementStrategy;
    }

    /**
     * Returns whether to show the popup indicator icon.
     *
     * @return {@code true} if the popup icon is shown.
     */
    public boolean isShowPopupIcon() {
        return this.showPopupIcon;
    }

    /**
     * Returns the factory for creating the popup indicator icon.
     *
     * @return The popup icon factory.
     */
    public RadianceIcon.Factory getPopupIconFactory() {
        return this.popupIconFactory;
    }

    /**
     * Returns the provider for popup anchor bounds on screen.
     *
     * @return The popup anchor bounds provider.
     */
    public PopupAnchorBoundsProvider getPopupAnchorBoundsProvider() {
        return this.popupAnchorBoundsProvider;
    }

    /**
     * Returns the type of highlight shown when the button is selected.
     *
     * @return The selected state highlight type.
     */
    public SelectedStateHighlight getSelectedStateHighlight() {
        return this.selectedStateHighlight;
    }

    /**
     * Returns whether to dismiss open popups when this button is activated.
     *
     * @return {@code true} if popups are dismissed on activation.
     */
    public boolean isToDismissPopupsOnActivation() {
        return this.toDismissPopupsOnActivation;
    }

    /**
     * Returns the presentation model for the popup menu.
     *
     * @return The popup menu presentation model.
     */
    public MPM getPopupMenuPresentationModel() {
        return this.popupMenuPresentationModel;
    }

    /**
     * Returns the keyboard shortcut tip for the primary action.
     *
     * @return The action key tip.
     */
    public String getActionKeyTip() {
        return this.actionKeyTip;
    }

    /**
     * Returns the keyboard shortcut tip for the popup action.
     *
     * @return The popup key tip.
     */
    public String getPopupKeyTip() {
        return this.popupKeyTip;
    }

    /**
     * Returns the action triggered when clicking the button text.
     *
     * @return The text click action.
     */
    public TextClick getTextClick() {
        return this.textClick;
    }

    /**
     * Returns the trigger condition for firing the primary action.
     *
     * @return The action fire trigger.
     */
    public ActionFireTrigger getActionFireTrigger() {
        return this.actionFireTrigger;
    }

    /**
     * Returns the trigger condition for firing the popup.
     *
     * @return The popup fire trigger.
     */
    public PopupFireTrigger getPopupFireTrigger() {
        return this.popupFireTrigger;
    }

    /**
     * Returns whether the button action auto-repeats on hold.
     *
     * @return {@code true} if auto-repeat is enabled.
     */
    public boolean isAutoRepeatAction() {
        return this.isAutoRepeatAction;
    }

    /**
     * Returns whether custom auto-repeat intervals have been set.
     *
     * @return {@code true} if custom intervals are set.
     */
    public boolean hasAutoRepeatIntervalsSet() {
        return this.hasAutoRepeatIntervalsSet;
    }

    /**
     * Returns the initial interval in milliseconds for auto-repeat.
     *
     * @return The initial interval, or -1 if not set.
     */
    public int getAutoRepeatInitialInterval() {
        return this.hasAutoRepeatIntervalsSet ? this.autoRepeatInitialInterval : -1;
    }

    /**
     * Returns the subsequent interval in milliseconds for auto-repeat.
     *
     * @return The subsequent interval, or -1 if not set.
     */
    public int getAutoRepeatSubsequentInterval() {
        return this.hasAutoRepeatIntervalsSet ? this.autoRepeatSubsequentInterval : -1;
    }

    /**
     * Returns the rich tooltip presentation model for the primary action.
     *
     * @return The action rich tooltip presentation model.
     */
    public RichTooltipPresentationModel getActionRichTooltipPresentationModel() {
        return this.actionRichTooltipPresentationModel;
    }

    /**
     * Returns the rich tooltip presentation model for the popup.
     *
     * @return The popup rich tooltip presentation model.
     */
    public RichTooltipPresentationModel getPopupRichTooltipPresentationModel() {
        return this.popupRichTooltipPresentationModel;
    }

    /**
     * Returns which sides of the button to render.
     *
     * @return The sides configuration.
     */
    public RadianceThemingSlices.Sides getSides() {
        return this.sides;
    }

    /**
     * Trigger for firing the command action.
     */
    public enum ActionFireTrigger {
        /**
         * Fire action on rollover.
         */
        ON_ROLLOVER,

        /**
         * Fire action on press.
         */
        ON_PRESSED,

        /**
         * Fire action on press release.
         */
        ON_PRESS_RELEASED
    }

    /**
     * Trigger condition for activating the popup.
     */
    public enum PopupFireTrigger {
        /**
         * Activate popup on rollover.
         */
        ON_ROLLOVER,

        /**
         * Activate popup on press.
         */
        ON_PRESSED
    }

    /**
     * Type of highlight shown when the button is in a selected state.
     */
    public enum SelectedStateHighlight {
        /** Selected state highlight is displayed around the button icon */
        ICON_ONLY,

        /** Selected state highlight is displayed over the full button area */
        FULL_SIZE
    }

    /**
     * Action triggered when clicking the button text.
     */
    public enum TextClick {
        /**
         * Clicking command text will activate the command action.
         */
        ACTION,

        /**
         * Clicking command text will activate the secondary content of the command.
         */
        POPUP
    }

    /**
     * Provider for the popup anchor bounds on screen.
     */
    public interface PopupAnchorBoundsProvider {
        /**
         * Returns the popup anchor bounds in screen coordinates.
         *
         * @return The rectangle defining the anchor bounds.
         */
        Rectangle getPopupAnchorBoundsOnScreen();
    }

    /**
     * Overlay configuration for customizing presentation model properties.
     */
    public static class Overlay {
        private CommandButtonPresentationState presentationState;
        private ContainerColorTokensOverlay.Provider containerColorTokensOverlayProvider;
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
        private Boolean isFocusable;
        private HorizontalAlignment horizontalAlignment;
        private Insets contentPadding;
        private Double horizontalGapScaleFactor;
        private Double verticalGapScaleFactor;
        private Dimension iconDimension;
        private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy;
        private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
        private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;
        private boolean forceAllocateSpaceForIcon;
        private SelectedStateHighlight selectedStateHighlight;
        private Font font;
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;
        private Boolean showPopupIcon;
        private RadianceIcon.Factory popupIconFactory;
        private PopupAnchorBoundsProvider popupAnchorBoundsProvider;
        private Boolean toDismissPopupsOnActivation;
        private String actionKeyTip;
        private String popupKeyTip;
        private BaseCommandPopupMenuPresentationModel popupMenuPresentationModel;
        private TextClick textClick;
        private Boolean isAutoRepeatAction;
        private Boolean hasAutoRepeatIntervalsSet;
        private Integer autoRepeatInitialInterval;
        private Integer autoRepeatSubsequentInterval;
        private ActionFireTrigger actionFireTrigger;
        private PopupFireTrigger popupFireTrigger;
        private RichTooltipPresentationModel actionRichTooltipPresentationModel;
        private RichTooltipPresentationModel popupRichTooltipPresentationModel;
        private RadianceThemingSlices.Sides sides;

        /**
         * Constructs an {@code Overlay}.
         */
        public Overlay() {
        }

        /**
         * Sets the container color tokens overlay provider.
         *
         * @param containerColorTokensOverlayProvider The provider.
         * @return This overlay.
         */
        public Overlay setContainerColorTokensOverlayProvider(
            ContainerColorTokensOverlay.Provider containerColorTokensOverlayProvider) {

            this.containerColorTokensOverlayProvider = containerColorTokensOverlayProvider;
            return this;
        }

        /**
         * Sets the background appearance strategy.
         *
         * @param backgroundAppearanceStrategy The strategy.
         * @return This overlay.
         */
        public Overlay setBackgroundAppearanceStrategy(
            RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {

            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return this;
        }

        /**
         * Sets whether the button can receive focus.
         *
         * @param focusable {@code true} to make the button focusable.
         * @return This overlay.
         */
        public Overlay setFocusable(boolean focusable) {
            this.isFocusable = focusable;
            return this;
        }

        /**
         * Sets the padding around button content.
         *
         * @param contentPadding The padding.
         * @return This overlay.
         */
        public Overlay setContentPadding(Insets contentPadding) {
            this.contentPadding = contentPadding;
            return this;
        }

        /**
         * Sets the horizontal alignment of button content.
         *
         * @param horizontalAlignment The alignment.
         * @return This overlay.
         */
        public Overlay setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        /**
         * Sets the scale factor for horizontal gaps.
         *
         * @param horizontalGapScaleFactor The scale factor.
         * @return This overlay.
         */
        public Overlay setHorizontalGapScaleFactor(double horizontalGapScaleFactor) {
            this.horizontalGapScaleFactor = horizontalGapScaleFactor;
            return this;
        }

        /**
         * Sets the scale factor for vertical gaps.
         *
         * @param verticalGapScaleFactor The scale factor.
         * @return This overlay.
         */
        public Overlay setVerticalGapScaleFactor(double verticalGapScaleFactor) {
            this.verticalGapScaleFactor = verticalGapScaleFactor;
            return this;
        }

        /**
         * Sets the presentation state of the button.
         *
         * @param presentationState The state.
         * @return This overlay.
         */
        public Overlay setPresentationState(CommandButtonPresentationState presentationState) {
            this.presentationState = presentationState;
            return this;
        }

        /**
         * Sets the dimension of the button icon.
         *
         * @param iconDimension The dimension.
         * @return This overlay.
         */
        public Overlay setIconDimension(Dimension iconDimension) {
            this.iconDimension = iconDimension;
            return this;
        }

        /**
         * Sets the icon filter strategies for active, enabled, and disabled states.
         *
         * @param activeIconFilterStrategy The active state strategy.
         * @param enabledIconFilterStrategy The enabled state strategy.
         * @param disabledIconFilterStrategy The disabled state strategy.
         * @return This overlay.
         */
        public Overlay setIconFilterStrategies(
            RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
            RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
            RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {

            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
            return this;
        }

        /**
         * Sets whether to force allocating space for an icon.
         *
         * @param forceAllocateSpaceForIcon {@code true} to force space allocation.
         * @return This overlay.
         */
        public Overlay setForceAllocateSpaceForIcon(boolean forceAllocateSpaceForIcon) {
            this.forceAllocateSpaceForIcon = forceAllocateSpaceForIcon;
            return this;
        }

        /**
         * Sets the font for button text.
         *
         * @param font The font.
         * @return This overlay.
         */
        public Overlay setFont(Font font) {
            this.font = font;
            return this;
        }

        /**
         * Sets the strategy for positioning popup content.
         *
         * @param popupPlacementStrategy The strategy.
         * @return This overlay.
         */
        public Overlay setPopupPlacementStrategy(
            RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {

            this.popupPlacementStrategy = popupPlacementStrategy;
            return this;
        }

        /**
         * Sets whether to show the popup indicator icon.
         *
         * @param showPopupIcon {@code true} to show the icon.
         * @return This overlay.
         */
        public Overlay setShowPopupIcon(boolean showPopupIcon) {
            this.showPopupIcon = showPopupIcon;
            return this;
        }

        /**
         * Sets the factory for creating the popup indicator icon.
         *
         * @param popupIconFactory The factory.
         * @return This overlay.
         */
        public Overlay setPopupIconFactory(RadianceIcon.Factory popupIconFactory) {
            this.popupIconFactory = popupIconFactory;
            return this;
        }

        /**
         * Sets the provider for popup anchor bounds on screen.
         *
         * @param popupAnchorBoundsProvider The provider.
         * @return This overlay.
         */
        public Overlay setPopupAnchorBoundsProvider(PopupAnchorBoundsProvider popupAnchorBoundsProvider) {
            this.popupAnchorBoundsProvider = popupAnchorBoundsProvider;
            return this;
        }

        /**
         * Sets the type of highlight shown when selected.
         *
         * @param selectedStateHighlight The highlight type.
         * @return This overlay.
         */
        public Overlay setSelectedStateHighlight(SelectedStateHighlight selectedStateHighlight) {
            this.selectedStateHighlight = selectedStateHighlight;
            return this;
        }

        /**
         * Sets whether to dismiss open popups on activation.
         *
         * @param toDismissPopupsOnActivation {@code true} to dismiss popups.
         * @return This overlay.
         */
        public Overlay setToDismissPopupsOnActivation(boolean toDismissPopupsOnActivation) {
            this.toDismissPopupsOnActivation = toDismissPopupsOnActivation;
            return this;
        }

        /**
         * Sets the presentation model for the popup menu.
         *
         * @param popupMenuPresentationModel The model.
         * @return This overlay.
         */
        public Overlay setPopupMenuPresentationModel(
            BaseCommandPopupMenuPresentationModel popupMenuPresentationModel) {

            this.popupMenuPresentationModel = popupMenuPresentationModel;
            return this;
        }

        /**
         * Sets the keyboard shortcut tip for the primary action.
         *
         * @param actionKeyTip The key tip.
         * @return This overlay.
         */
        public Overlay setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return this;
        }

        /**
         * Sets the keyboard shortcut tip for the popup action.
         *
         * @param popupKeyTip The key tip.
         * @return This overlay.
         */
        public Overlay setPopupKeyTip(String popupKeyTip) {
            this.popupKeyTip = popupKeyTip;
            return this;
        }

        /**
         * Sets the action triggered when clicking the button text.
         *
         * @param textClick The text click action.
         * @return This overlay.
         */
        public Overlay setTextClick(TextClick textClick) {
            this.textClick = textClick;
            return this;
        }

        /**
         * Sets whether the button action auto-repeats on hold.
         *
         * @param isAutoRepeatAction {@code true} to enable auto-repeat.
         * @return This overlay.
         */
        public Overlay setAutoRepeatAction(boolean isAutoRepeatAction) {
            this.isAutoRepeatAction = isAutoRepeatAction;
            return this;
        }

        /**
         * Sets custom auto-repeat intervals.
         *
         * @param initial The initial interval in milliseconds.
         * @param subsequent The subsequent interval in milliseconds.
         * @return This overlay.
         */
        public Overlay setAutoRepeatActionIntervals(int initial, int subsequent) {
            this.hasAutoRepeatIntervalsSet = true;
            this.autoRepeatInitialInterval = initial;
            this.autoRepeatSubsequentInterval = subsequent;
            return this;
        }

        /**
         * Sets the trigger condition for firing the primary action.
         *
         * @param actionFireTrigger The trigger.
         * @return This overlay.
         */
        public Overlay setActionFireTrigger(ActionFireTrigger actionFireTrigger) {
            this.actionFireTrigger = actionFireTrigger;
            return this;
        }

        /**
         * Sets the trigger condition for firing the popup.
         *
         * @param popupFireTrigger The trigger.
         * @return This overlay.
         */
        public Overlay setPopupFireTrigger(PopupFireTrigger popupFireTrigger) {
            this.popupFireTrigger = popupFireTrigger;
            return this;
        }

        /**
         * Sets the rich tooltip presentation model for the primary action.
         *
         * @param actionRichTooltipPresentationModel The model.
         * @return This overlay.
         */
        public Overlay setActionRichTooltipPresentationModel(
            RichTooltipPresentationModel actionRichTooltipPresentationModel) {

            this.actionRichTooltipPresentationModel = actionRichTooltipPresentationModel;
            return this;
        }

        /**
         * Sets the rich tooltip presentation model for the popup.
         *
         * @param popupRichTooltipPresentationModel The model.
         * @return This overlay.
         */
        public Overlay setPopupRichTooltipPresentationModel(
            RichTooltipPresentationModel popupRichTooltipPresentationModel) {

            this.popupRichTooltipPresentationModel = popupRichTooltipPresentationModel;
            return this;
        }

        /**
         * Sets which sides of the button to render.
         *
         * @param sides The sides configuration.
         * @return This overlay.
         */
        public Overlay setSides(RadianceThemingSlices.Sides sides) {
            this.sides = sides;
            return this;
        }

        /**
         * Returns the presentation state.
         *
         * @return The presentation state.
         */
        public CommandButtonPresentationState getPresentationState() {
            return this.presentationState;
        }

        /**
         * Returns the container color tokens overlay provider.
         *
         * @return The provider.
         */
        public ContainerColorTokensOverlay.Provider getContainerColorTokensOverlayProvider() {
            return this.containerColorTokensOverlayProvider;
        }

        /**
         * Returns the background appearance strategy.
         *
         * @return The strategy.
         */
        public RadianceThemingSlices.BackgroundAppearanceStrategy getBackgroundAppearanceStrategy() {
            return this.backgroundAppearanceStrategy;
        }

        /**
         * Returns whether the button is focusable.
         *
         * @return {@code true} if focusable.
         */
        public Boolean getFocusable() {
            return this.isFocusable;
        }

        /**
         * Returns the horizontal alignment.
         *
         * @return The alignment.
         */
        public HorizontalAlignment getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        /**
         * Returns the content padding.
         *
         * @return The padding.
         */
        public Insets getContentPadding() {
            return this.contentPadding;
        }

        /**
         * Returns the horizontal gap scale factor.
         *
         * @return The scale factor.
         */
        public Double getHorizontalGapScaleFactor() {
            return this.horizontalGapScaleFactor;
        }

        /**
         * Returns the vertical gap scale factor.
         *
         * @return The scale factor.
         */
        public Double getVerticalGapScaleFactor() {
            return this.verticalGapScaleFactor;
        }

        /**
         * Returns the icon dimension.
         *
         * @return The dimension.
         */
        public Dimension getIconDimension() {
            return this.iconDimension;
        }

        /**
         * Returns the active icon filter strategy.
         *
         * @return The strategy.
         */
        public RadianceThemingSlices.IconFilterStrategy getActiveIconFilterStrategy() {
            return this.activeIconFilterStrategy;
        }

        /**
         * Returns the enabled icon filter strategy.
         *
         * @return The strategy.
         */
        public RadianceThemingSlices.IconFilterStrategy getEnabledIconFilterStrategy() {
            return this.enabledIconFilterStrategy;
        }

        /**
         * Returns the disabled icon filter strategy.
         *
         * @return The strategy.
         */
        public RadianceThemingSlices.IconFilterStrategy getDisabledIconFilterStrategy() {
            return this.disabledIconFilterStrategy;
        }

        /**
         * Returns whether space for icon is forced.
         *
         * @return {@code true} if forced.
         */
        public Boolean isForceAllocateSpaceForIcon() {
            return this.forceAllocateSpaceForIcon;
        }

        /**
         * Returns the selected state highlight type.
         *
         * @return The highlight type.
         */
        public SelectedStateHighlight getSelectedStateHighlight() {
            return this.selectedStateHighlight;
        }

        /**
         * Returns the font.
         *
         * @return The font.
         */
        public Font getFont() {
            return this.font;
        }

        /**
         * Returns the popup placement strategy.
         *
         * @return The strategy.
         */
        public RadianceThemingSlices.PopupPlacementStrategy getPopupPlacementStrategy() {
            return this.popupPlacementStrategy;
        }

        /**
         * Returns whether popups are dismissed on activation.
         *
         * @return {@code true} if dismissed.
         */
        public Boolean getToDismissPopupsOnActivation() {
            return this.toDismissPopupsOnActivation;
        }

        /**
         * Returns whether the popup icon is shown.
         *
         * @return {@code true} if shown.
         */
        public Boolean isShowPopupIcon() {
            return this.showPopupIcon;
        }

        /**
         * Returns the popup icon factory.
         *
         * @return The factory.
         */
        public RadianceIcon.Factory getPopupIconFactory() {
            return this.popupIconFactory;
        }

        /**
         * Returns the popup anchor bounds provider.
         *
         * @return The provider.
         */
        public PopupAnchorBoundsProvider getPopupAnchorBoundsProvider() {
            return this.popupAnchorBoundsProvider;
        }

        /**
         * Returns the action key tip.
         *
         * @return The key tip.
         */
        public String getActionKeyTip() {
            return this.actionKeyTip;
        }

        /**
         * Returns the popup key tip.
         *
         * @return The key tip.
         */
        public String getPopupKeyTip() {
            return this.popupKeyTip;
        }

        /**
         * Returns the popup menu presentation model.
         *
         * @return The model.
         */
        public BaseCommandPopupMenuPresentationModel getPopupMenuPresentationModel() {
            return this.popupMenuPresentationModel;
        }

        /**
         * Returns the text click action.
         *
         * @return The action.
         */
        public TextClick getTextClick() {
            return this.textClick;
        }

        /**
         * Returns whether auto-repeat is enabled.
         *
         * @return {@code true} if enabled.
         */
        public Boolean getAutoRepeatAction() {
            return this.isAutoRepeatAction;
        }

        /**
         * Returns whether custom auto-repeat intervals are set.
         *
         * @return {@code true} if set.
         */
        public Boolean getHasAutoRepeatIntervalsSet() {
            return this.hasAutoRepeatIntervalsSet;
        }

        /**
         * Returns the auto-repeat initial interval.
         *
         * @return The interval in milliseconds.
         */
        public Integer getAutoRepeatInitialInterval() {
            return this.autoRepeatInitialInterval;
        }

        /**
         * Returns the auto-repeat subsequent interval.
         *
         * @return The interval in milliseconds.
         */
        public Integer getAutoRepeatSubsequentInterval() {
            return this.autoRepeatSubsequentInterval;
        }

        /**
         * Returns the action fire trigger.
         *
         * @return The trigger.
         */
        public ActionFireTrigger getActionFireTrigger() {
            return this.actionFireTrigger;
        }

        /**
         * Returns the popup fire trigger.
         *
         * @return The trigger.
         */
        public PopupFireTrigger getPopupFireTrigger() {
            return this.popupFireTrigger;
        }

        /**
         * Returns the action rich tooltip presentation model.
         *
         * @return The model.
         */
        public RichTooltipPresentationModel getActionRichTooltipPresentationModel() {
            return this.actionRichTooltipPresentationModel;
        }

        /**
         * Returns the popup rich tooltip presentation model.
         *
         * @return The model.
         */
        public RichTooltipPresentationModel getPopupRichTooltipPresentationModel() {
            return this.popupRichTooltipPresentationModel;
        }

        /**
         * Returns the sides configuration.
         *
         * @return The sides.
         */
        public RadianceThemingSlices.Sides getSides() {
            return this.sides;
        }
    }

    /**
     * Abstract builder for constructing BaseCommandButtonPresentationModel instances.
     *
     * @param <MPM> The type of the popup menu presentation model.
     * @param <PM>  The presentation model type.
     * @param <B>   The self-referential builder type.
     */
    public abstract static class BaseBuilder<MPM extends BaseCommandPopupMenuPresentationModel,
            PM extends BaseCommandButtonPresentationModel<MPM, PM>,
            B extends BaseBuilder<MPM, PM, B>> {
        private CommandButtonPresentationState presentationState =
                CommandButtonPresentationState.BIG_FIT_TO_ICON;
        private ContainerColorTokensOverlay.Provider containerColorTokensOverlayProvider = null;
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy =
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT;
        private boolean isFocusable = true;
        private HorizontalAlignment horizontalAlignment =
                BaseCommandButtonPresentationModel.DEFAULT_HORIZONTAL_ALIGNMENT;
        private Insets contentPadding =
                BaseCommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING;
        private double horizontalGapScaleFactor =
                BaseCommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR;
        private double verticalGapScaleFactor =
                BaseCommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR;
        private Dimension iconDimension = null;
        private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_TOKENS;
        private boolean forceAllocateSpaceForIcon = false;
        private SelectedStateHighlight selectedStateHighlight =
                SelectedStateHighlight.FULL_SIZE;
        private Font font = null;
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_START;
        private boolean showPopupIcon = true;
        private RadianceIcon.Factory popupIconFactory = CommandButtonDefaultPopupIcon::new;
        private PopupAnchorBoundsProvider popupAnchorBoundsProvider;
        private String actionKeyTip;
        private String popupKeyTip;
        private boolean toDismissPopupsOnActivation = true;
        private MPM popupMenuPresentationModel;
        private TextClick textClick = TextClick.ACTION;
        private boolean isAutoRepeatAction;
        private boolean hasAutoRepeatIntervalsSet;
        private int autoRepeatInitialInterval = DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS;
        private int autoRepeatSubsequentInterval = DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS;
        private ActionFireTrigger actionFireTrigger = ActionFireTrigger.ON_PRESS_RELEASED;
        private PopupFireTrigger popupFireTrigger = PopupFireTrigger.ON_PRESSED;
        private RichTooltipPresentationModel actionRichTooltipPresentationModel =
                RichTooltipPresentationModel.builder().build();
        private RichTooltipPresentationModel popupRichTooltipPresentationModel =
                RichTooltipPresentationModel.builder().build();
        private RadianceThemingSlices.Sides sides = null;

        /**
         * Constructs a {@code BaseBuilder}.
         */
        protected BaseBuilder() {
        }

        /**
         * Sets the container color tokens overlay provider.
         *
         * @param containerColorTokensOverlayProvider The provider.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setContainerColorTokensOverlayProvider(
            ContainerColorTokensOverlay.Provider containerColorTokensOverlayProvider) {

            this.containerColorTokensOverlayProvider = containerColorTokensOverlayProvider;
            return (B) this;
        }

        /**
         * Sets the background appearance strategy.
         *
         * @param backgroundAppearanceStrategy The strategy.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setBackgroundAppearanceStrategy(
            RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {

            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return (B) this;
        }

        /**
         * Sets whether the button can receive focus.
         *
         * @param focusable {@code true} to make the button focusable.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setFocusable(boolean focusable) {
            this.isFocusable = focusable;
            return (B) this;
        }

        /**
         * Sets the horizontal alignment of button content.
         *
         * @param horizontalAlignment The alignment.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return (B) this;
        }

        /**
         * Sets the padding around button content.
         *
         * @param contentPadding The padding.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setContentPadding(Insets contentPadding) {
            this.contentPadding = contentPadding;
            return (B) this;
        }

        /**
         * Sets the scale factor for horizontal gaps.
         *
         * @param horizontalGapScaleFactor The scale factor.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setHorizontalGapScaleFactor(
                double horizontalGapScaleFactor) {
            this.horizontalGapScaleFactor = horizontalGapScaleFactor;
            return (B) this;
        }

        /**
         * Sets the scale factor for vertical gaps.
         *
         * @param verticalGapScaleFactor The scale factor.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setVerticalGapScaleFactor(double verticalGapScaleFactor) {
            this.verticalGapScaleFactor = verticalGapScaleFactor;
            return (B) this;
        }

        /**
         * Sets the presentation state of the button.
         *
         * @param presentationState The state.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setPresentationState(CommandButtonPresentationState presentationState) {
            this.presentationState = presentationState;
            return (B) this;
        }

        /**
         * Sets the dimension of the button icon.
         *
         * @param iconDimension The dimension.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setIconDimension(Dimension iconDimension) {
            this.iconDimension = iconDimension;
            return (B) this;
        }

        /**
         * Sets the icon filter strategies for active, enabled, and disabled states.
         *
         * @param activeIconFilterStrategy The active state strategy.
         * @param enabledIconFilterStrategy The enabled state strategy.
         * @param disabledIconFilterStrategy The disabled state strategy.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setIconFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
            return (B) this;
        }

        /**
         * Sets whether to force allocating space for an icon.
         *
         * @param forceAllocateSpaceForIcon {@code true} to force space allocation.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setForceAllocateSpaceForIcon(boolean forceAllocateSpaceForIcon) {
            this.forceAllocateSpaceForIcon = forceAllocateSpaceForIcon;
            return (B) this;
        }

        /**
         * Sets the font for button text.
         *
         * @param font The font.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setFont(Font font) {
            this.font = font;
            return (B) this;
        }

        /**
         * Sets the strategy for positioning popup content.
         *
         * @param popupPlacementStrategy The strategy.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setPopupPlacementStrategy(
                RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {
            this.popupPlacementStrategy = popupPlacementStrategy;
            return (B) this;
        }

        /**
         * Sets whether to show the popup indicator icon.
         *
         * @param showPopupIcon {@code true} to show the icon.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setShowPopupIcon(boolean showPopupIcon) {
            this.showPopupIcon = showPopupIcon;
            return (B) this;
        }

        /**
         * Sets the provider for popup anchor bounds on screen.
         *
         * @param popupAnchorBoundsProvider The provider.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setPopupAnchorBoundsProvider(PopupAnchorBoundsProvider popupAnchorBoundsProvider) {
            this.popupAnchorBoundsProvider = popupAnchorBoundsProvider;
            return (B) this;
        }

        /**
         * Sets the factory for creating the popup indicator icon.
         *
         * @param popupIconFactory The factory (must not be null).
         * @return This builder.
         * @throws IllegalArgumentException if the factory is null.
         */
        @SuppressWarnings("unchecked")
        public B setPopupIconFactory(RadianceIcon.Factory popupIconFactory) {
            if (popupIconFactory == null) {
                throw new IllegalArgumentException("Cannot pass null popup icon factory");
            }
            this.popupIconFactory = popupIconFactory;
            return (B) this;
        }

        /**
         * Sets the type of highlight shown when selected.
         *
         * @param selectedStateHighlight The highlight type.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setSelectedStateHighlight(SelectedStateHighlight selectedStateHighlight) {
            this.selectedStateHighlight = selectedStateHighlight;
            return (B) this;
        }

        /**
         * Sets whether to dismiss open popups on activation.
         *
         * @param toDismissPopupsOnActivation {@code true} to dismiss popups.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setToDismissPopupsOnActivation(boolean toDismissPopupsOnActivation) {
            this.toDismissPopupsOnActivation = toDismissPopupsOnActivation;
            return (B) this;
        }

        /**
         * Sets the presentation model for the popup menu.
         *
         * @param popupMenuPresentationModel The model.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setPopupMenuPresentationModel(MPM popupMenuPresentationModel) {
            this.popupMenuPresentationModel = popupMenuPresentationModel;
            return (B) this;
        }

        /**
         * Sets the keyboard shortcut tip for the primary action.
         *
         * @param actionKeyTip The key tip.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return (B) this;
        }

        /**
         * Sets the keyboard shortcut tip for the popup action.
         *
         * @param popupKeyTip The key tip.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setPopupKeyTip(String popupKeyTip) {
            this.popupKeyTip = popupKeyTip;
            return (B) this;
        }

        /**
         * Sets the action triggered when clicking the button text.
         *
         * @param textClick The text click action.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setTextClick(TextClick textClick) {
            this.textClick = textClick;
            return (B) this;
        }

        /**
         * Sets whether the button action auto-repeats on hold.
         *
         * @param isAutoRepeatAction {@code true} to enable auto-repeat.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setAutoRepeatAction(boolean isAutoRepeatAction) {
            this.isAutoRepeatAction = isAutoRepeatAction;
            return (B) this;
        }

        /**
         * Sets custom auto-repeat intervals.
         *
         * @param initial The initial interval in milliseconds.
         * @param subsequent The subsequent interval in milliseconds.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setAutoRepeatActionIntervals(int initial, int subsequent) {
            this.hasAutoRepeatIntervalsSet = true;
            this.autoRepeatInitialInterval = initial;
            this.autoRepeatSubsequentInterval = subsequent;
            return (B) this;
        }

        /**
         * Sets the trigger condition for firing the primary action.
         *
         * @param actionFireTrigger The trigger.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setActionFireTrigger(ActionFireTrigger actionFireTrigger) {
            this.actionFireTrigger = actionFireTrigger;
            return (B) this;
        }

        /**
         * Sets the trigger condition for firing the popup.
         *
         * @param popupFireTrigger The trigger.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setPopupFireTrigger(PopupFireTrigger popupFireTrigger) {
            this.popupFireTrigger = popupFireTrigger;
            return (B) this;
        }

        /**
         * Sets the rich tooltip presentation model for the primary action.
         *
         * @param actionRichTooltipPresentationModel The model (must not be null).
         * @return This builder.
         * @throws IllegalArgumentException if the model is null.
         */
        @SuppressWarnings("unchecked")
        public B setActionRichTooltipPresentationModel(RichTooltipPresentationModel actionRichTooltipPresentationModel) {
            if (actionRichTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null presentation model");
            }
            this.actionRichTooltipPresentationModel = actionRichTooltipPresentationModel;
            return (B) this;
        }

        /**
         * Sets the rich tooltip presentation model for the popup.
         *
         * @param popupRichTooltipPresentationModel The model (must not be null).
         * @return This builder.
         * @throws IllegalArgumentException if the model is null.
         */
        @SuppressWarnings("unchecked")
        public B setPopupRichTooltipPresentationModel(RichTooltipPresentationModel popupRichTooltipPresentationModel) {
            if (popupRichTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null presentation model");
            }
            this.popupRichTooltipPresentationModel = popupRichTooltipPresentationModel;
            return (B) this;
        }

        /**
         * Sets which sides of the button to render.
         *
         * @param sides The sides configuration.
         * @return This builder.
         */
        @SuppressWarnings("unchecked")
        public B setSides(RadianceThemingSlices.Sides sides) {
            this.sides = sides;
            return (B) this;
        }

        /**
         * Applies the builder configuration to the given presentation model.
         *
         * @param presentationModel The model to configure.
         */
        protected void configureBaseCommandButtonPresentationModel(
                BaseCommandButtonPresentationModel<MPM, PM> presentationModel) {
            presentationModel.presentationState = this.presentationState;
            presentationModel.horizontalAlignment = this.horizontalAlignment;
            presentationModel.contentPadding = this.contentPadding;
            presentationModel.horizontalGapScaleFactor = this.horizontalGapScaleFactor;
            presentationModel.verticalGapScaleFactor = this.verticalGapScaleFactor;
            presentationModel.containerColorTokensOverlayProvider = this.containerColorTokensOverlayProvider;
            presentationModel.backgroundAppearanceStrategy = this.backgroundAppearanceStrategy;
            presentationModel.isFocusable = this.isFocusable;
            presentationModel.iconDimension = this.iconDimension;
            presentationModel.activeIconFilterStrategy = this.activeIconFilterStrategy;
            presentationModel.enabledIconFilterStrategy = this.enabledIconFilterStrategy;
            presentationModel.disabledIconFilterStrategy = this.disabledIconFilterStrategy;
            presentationModel.forceAllocateSpaceForIcon = this.forceAllocateSpaceForIcon;
            presentationModel.selectedStateHighlight = this.selectedStateHighlight;
            presentationModel.font = this.font;
            presentationModel.popupPlacementStrategy = this.popupPlacementStrategy;
            presentationModel.showPopupIcon = this.showPopupIcon;
            presentationModel.popupIconFactory = this.popupIconFactory;
            presentationModel.popupAnchorBoundsProvider = this.popupAnchorBoundsProvider;
            presentationModel.actionKeyTip = this.actionKeyTip;
            presentationModel.popupKeyTip = this.popupKeyTip;
            presentationModel.toDismissPopupsOnActivation = this.toDismissPopupsOnActivation;
            presentationModel.popupMenuPresentationModel = this.popupMenuPresentationModel;
            presentationModel.textClick = this.textClick;
            presentationModel.isAutoRepeatAction = this.isAutoRepeatAction;
            presentationModel.hasAutoRepeatIntervalsSet = this.hasAutoRepeatIntervalsSet;
            presentationModel.autoRepeatInitialInterval = this.autoRepeatInitialInterval;
            presentationModel.autoRepeatSubsequentInterval = this.autoRepeatSubsequentInterval;
            presentationModel.actionFireTrigger = this.actionFireTrigger;
            presentationModel.popupFireTrigger = this.popupFireTrigger;
            presentationModel.actionRichTooltipPresentationModel = this.actionRichTooltipPresentationModel;
            presentationModel.popupRichTooltipPresentationModel = this.popupRichTooltipPresentationModel;
            presentationModel.sides = this.sides;
        }
    }
}
