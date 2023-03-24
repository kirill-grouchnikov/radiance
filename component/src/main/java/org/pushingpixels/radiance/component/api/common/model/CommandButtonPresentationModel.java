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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.popup.model.AbstractPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.*;
import java.awt.*;

/**
 * Encapsulates presentation metadata for displaying commands as buttons. Use a new instance of
 * {@link Builder} to configure a new presentation, and {@link Builder#build()} to build a
 * presentation.
 *
 * <p>Note that you can use the same {@link CommandButtonPresentationModel} instance on multiple
 * calls to {@link Command#project(CommandButtonPresentationModel)}. Use
 * {@link #overlayWith(Overlay)} to create a new presentation instance that overlays the
 * presentation configuration with values set on the passed {@link Overlay} object.</p>
 *
 * @author Kirill Grouchnikov
 * @see Command
 * @see CommandButtonProjection
 */
public class CommandButtonPresentationModel implements ImmutablePresentationModel {
    public static final int DEFAULT_HORIZONTAL_ALIGNMENT = SwingConstants.CENTER;
    public static final double DEFAULT_GAP_SCALE_FACTOR = 1.0;

    public static final int DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS = 500;
    public static final int DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS = 100;

    public static final Insets WIDE_BUTTON_CONTENT_PADDING = new Insets(3, 10, 2, 10);
    public static final Insets COMPACT_BUTTON_CONTENT_PADDING = new Insets(3, 5, 2, 5);

    private CommandButtonPresentationState presentationState;
    private Dimension iconDimension;
    private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;
    private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
    private boolean isFocusable;
    private int horizontalAlignment;
    private Insets contentPadding;
    private double horizontalGapScaleFactor;
    private double verticalGapScaleFactor;
    private SelectedStateHighlight selectedStateHighlight;
    private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;
    private String actionKeyTip;
    private String popupKeyTip;
    private boolean toDismissPopupsOnActivation;
    private AbstractPopupMenuPresentationModel popupMenuPresentationModel;
    private TextClick textClick;
    private boolean isAutoRepeatAction;
    private boolean hasAutoRepeatIntervalsSet;
    private int autoRepeatInitialInterval;
    private int autoRepeatSubsequentInterval;
    private ActionFireTrigger actionFireTrigger;
    private PopupFireTrigger popupFireTrigger;
    private RichTooltipPresentationModel actionRichTooltipPresentationModel;
    private RichTooltipPresentationModel popupRichTooltipPresentationModel;

    private CommandButtonPresentationModel() {
    }

    public CommandButtonPresentationModel overlayWith(Overlay overlay) {
        CommandButtonPresentationModel result = new CommandButtonPresentationModel();

        result.presentationState = (overlay.presentationState != null)
                ? overlay.presentationState : this.presentationState;
        result.backgroundAppearanceStrategy = (overlay.backgroundAppearanceStrategy != null)
                ? overlay.backgroundAppearanceStrategy : this.backgroundAppearanceStrategy;
        result.isFocusable = (overlay.isFocusable != null) ? overlay.isFocusable : this.isFocusable;
        result.horizontalAlignment = (overlay.horizontalAlignment != null)
                ? overlay.horizontalAlignment : this.horizontalAlignment;
        result.contentPadding = (overlay.contentPadding != null)
                ? overlay.contentPadding : this.contentPadding;
        result.horizontalGapScaleFactor = (overlay.horizontalGapScaleFactor != null)
                ? overlay.horizontalGapScaleFactor : this.horizontalGapScaleFactor;
        result.verticalGapScaleFactor = (overlay.verticalGapScaleFactor != null)
                ? overlay.verticalGapScaleFactor : this.verticalGapScaleFactor;
        result.iconDimension = (overlay.iconDimension != null)
                ? overlay.iconDimension : this.iconDimension;
        result.activeIconFilterStrategy = (overlay.activeIconFilterStrategy != null)
                ? overlay.activeIconFilterStrategy : this.activeIconFilterStrategy;
        result.enabledIconFilterStrategy = (overlay.enabledIconFilterStrategy != null)
                ? overlay.enabledIconFilterStrategy : this.enabledIconFilterStrategy;
        result.disabledIconFilterStrategy = (overlay.disabledIconFilterStrategy != null)
                ? overlay.disabledIconFilterStrategy : this.disabledIconFilterStrategy;
        result.selectedStateHighlight = (overlay.selectedStateHighlight != null)
                ? overlay.selectedStateHighlight : this.selectedStateHighlight;
        result.popupPlacementStrategy = (overlay.popupPlacementStrategy != null)
                ? overlay.popupPlacementStrategy : this.popupPlacementStrategy;
        result.toDismissPopupsOnActivation = (overlay.toDismissPopupsOnActivation != null)
                ? overlay.toDismissPopupsOnActivation : this.toDismissPopupsOnActivation;
        result.popupMenuPresentationModel = (overlay.popupMenuPresentationModel != null)
                ? overlay.popupMenuPresentationModel : this.popupMenuPresentationModel;
        result.actionKeyTip = (overlay.actionKeyTip != null)
                ? overlay.actionKeyTip : this.actionKeyTip;
        result.popupKeyTip = (overlay.popupKeyTip != null)
                ? overlay.popupKeyTip : this.popupKeyTip;
        result.textClick = (overlay.textClick != null)
                ? overlay.textClick : this.textClick;
        result.isAutoRepeatAction = (overlay.isAutoRepeatAction != null)
                ? overlay.isAutoRepeatAction : this.isAutoRepeatAction;
        result.hasAutoRepeatIntervalsSet = (overlay.hasAutoRepeatIntervalsSet != null)
                ? overlay.hasAutoRepeatIntervalsSet : this.hasAutoRepeatIntervalsSet;
        result.autoRepeatInitialInterval = (overlay.autoRepeatInitialInterval != null)
                ? overlay.autoRepeatInitialInterval : this.autoRepeatInitialInterval;
        result.autoRepeatSubsequentInterval = (overlay.autoRepeatSubsequentInterval != null)
                ? overlay.autoRepeatSubsequentInterval : this.autoRepeatSubsequentInterval;
        result.actionFireTrigger = (overlay.actionFireTrigger != null)
                ? overlay.actionFireTrigger : this.actionFireTrigger;
        result.popupFireTrigger = (overlay.popupFireTrigger != null)
                ? overlay.popupFireTrigger : this.popupFireTrigger;
        result.actionRichTooltipPresentationModel = (overlay.actionRichTooltipPresentationModel != null)
                ? overlay.actionRichTooltipPresentationModel : this.actionRichTooltipPresentationModel;
        result.popupRichTooltipPresentationModel = (overlay.popupRichTooltipPresentationModel != null)
                ? overlay.popupRichTooltipPresentationModel : this.popupRichTooltipPresentationModel;

        return result;
    }

    public static CommandButtonPresentationModel withDefaults() {
        return CommandButtonPresentationModel.builder().build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Overlay overlay() {
        return new Overlay();
    }

    public CommandButtonPresentationState getPresentationState() {
        return this.presentationState;
    }

    public RadianceThemingSlices.BackgroundAppearanceStrategy getBackgroundAppearanceStrategy() {
        return this.backgroundAppearanceStrategy;
    }

    public boolean isFocusable() {
        return this.isFocusable;
    }

    public int getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public Insets getContentPadding() {
        return this.contentPadding;
    }

    public double getHorizontalGapScaleFactor() {
        return this.horizontalGapScaleFactor;
    }

    public double getVerticalGapScaleFactor() {
        return this.verticalGapScaleFactor;
    }

    public Dimension getIconDimension() {
        return this.iconDimension;
    }

    public RadianceThemingSlices.IconFilterStrategy getActiveIconFilterStrategy() {
        return this.activeIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getEnabledIconFilterStrategy() {
        return this.enabledIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getDisabledIconFilterStrategy() {
        return this.disabledIconFilterStrategy;
    }

    public RadianceThemingSlices.PopupPlacementStrategy getPopupPlacementStrategy() {
        return this.popupPlacementStrategy;
    }

    public SelectedStateHighlight getSelectedStateHighlight() {
        return this.selectedStateHighlight;
    }

    public boolean isToDismissPopupsOnActivation() {
        return this.toDismissPopupsOnActivation;
    }

    public AbstractPopupMenuPresentationModel getPopupMenuPresentationModel() {
        return this.popupMenuPresentationModel;
    }

    public String getActionKeyTip() {
        return this.actionKeyTip;
    }

    public String getPopupKeyTip() {
        return this.popupKeyTip;
    }

    public TextClick getTextClick() {
        return this.textClick;
    }

    public ActionFireTrigger getActionFireTrigger() {
        return this.actionFireTrigger;
    }

    public PopupFireTrigger getPopupFireTrigger() {
        return this.popupFireTrigger;
    }

    public boolean isAutoRepeatAction() {
        return this.isAutoRepeatAction;
    }

    public boolean hasAutoRepeatIntervalsSet() {
        return this.hasAutoRepeatIntervalsSet;
    }

    public int getAutoRepeatInitialInterval() {
        return this.hasAutoRepeatIntervalsSet ? this.autoRepeatInitialInterval : -1;
    }

    public int getAutoRepeatSubsequentInterval() {
        return this.hasAutoRepeatIntervalsSet ? this.autoRepeatSubsequentInterval : -1;
    }

    public RichTooltipPresentationModel getActionRichTooltipPresentationModel() {
        return this.actionRichTooltipPresentationModel;
    }

    public RichTooltipPresentationModel getPopupRichTooltipPresentationModel() {
        return this.popupRichTooltipPresentationModel;
    }

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

    public enum SelectedStateHighlight {
        /** Selected state highlight is displayed around the button icon */
        ICON_ONLY,

        /** Selected state highlight is displayed over the full button area */
        FULL_SIZE
    }

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

    public static class Overlay {
        private CommandButtonPresentationState presentationState;
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
        private Boolean isFocusable;
        private Integer horizontalAlignment;
        private Insets contentPadding;
        private Double horizontalGapScaleFactor;
        private Double verticalGapScaleFactor;
        private Dimension iconDimension;
        private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy;
        private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
        private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;
        private SelectedStateHighlight selectedStateHighlight;
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;
        private Boolean toDismissPopupsOnActivation;
        private String actionKeyTip;
        private String popupKeyTip;
        private AbstractPopupMenuPresentationModel popupMenuPresentationModel;
        private TextClick textClick;
        private Boolean isAutoRepeatAction;
        private Boolean hasAutoRepeatIntervalsSet;
        private Integer autoRepeatInitialInterval;
        private Integer autoRepeatSubsequentInterval;
        private ActionFireTrigger actionFireTrigger;
        private PopupFireTrigger popupFireTrigger;
        private RichTooltipPresentationModel actionRichTooltipPresentationModel;
        private RichTooltipPresentationModel popupRichTooltipPresentationModel;

        public Overlay setBackgroundAppearanceStrategy(
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return this;
        }

        public Overlay setFocusable(boolean focusable) {
            this.isFocusable = focusable;
            return this;
        }

        public Overlay setContentPadding(Insets contentPadding) {
            this.contentPadding = contentPadding;
            return this;
        }

        public Overlay setHorizontalAlignment(int horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public Overlay setHorizontalGapScaleFactor(double horizontalGapScaleFactor) {
            this.horizontalGapScaleFactor = horizontalGapScaleFactor;
            return this;
        }

        public Overlay setVerticalGapScaleFactor(double verticalGapScaleFactor) {
            this.verticalGapScaleFactor = verticalGapScaleFactor;
            return this;
        }

        public Overlay setPresentationState(CommandButtonPresentationState presentationState) {
            this.presentationState = presentationState;
            return this;
        }

        public Overlay setIconDimension(Dimension iconDimension) {
            this.iconDimension = iconDimension;
            return this;
        }

        public Overlay setIconFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
            return this;
        }

        public Overlay setPopupPlacementStrategy(RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {
            this.popupPlacementStrategy = popupPlacementStrategy;
            return this;
        }

        public Overlay setSelectedStateHighlight(SelectedStateHighlight selectedStateHighlight) {
            this.selectedStateHighlight = selectedStateHighlight;
            return this;
        }

        public Overlay setToDismissPopupsOnActivation(boolean toDismissPopupsOnActivation) {
            this.toDismissPopupsOnActivation = toDismissPopupsOnActivation;
            return this;
        }

        public Overlay setPopupMenuPresentationModel(
                AbstractPopupMenuPresentationModel popupMenuPresentationModel) {
            this.popupMenuPresentationModel = popupMenuPresentationModel;
            return this;
        }

        public Overlay setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return this;
        }

        public Overlay setPopupKeyTip(String popupKeyTip) {
            this.popupKeyTip = popupKeyTip;
            return this;
        }

        public Overlay setTextClick(TextClick textClick) {
            this.textClick = textClick;
            return this;
        }

        public Overlay setAutoRepeatAction(boolean isAutoRepeatAction) {
            this.isAutoRepeatAction = isAutoRepeatAction;
            return this;
        }

        public Overlay setAutoRepeatActionIntervals(int initial, int subsequent) {
            this.hasAutoRepeatIntervalsSet = true;
            this.autoRepeatInitialInterval = initial;
            this.autoRepeatSubsequentInterval = subsequent;
            return this;
        }

        public Overlay setActionFireTrigger(ActionFireTrigger actionFireTrigger) {
            this.actionFireTrigger = actionFireTrigger;
            return this;
        }

        public Overlay setPopupFireTrigger(PopupFireTrigger popupFireTrigger) {
            this.popupFireTrigger = popupFireTrigger;
            return this;
        }

        public Overlay setActionRichTooltipPresentationModel(RichTooltipPresentationModel actionRichTooltipPresentationModel) {
            this.actionRichTooltipPresentationModel = actionRichTooltipPresentationModel;
            return this;
        }

        public Overlay setPopupRichTooltipPresentationModel(RichTooltipPresentationModel popupRichTooltipPresentationModel) {
            this.popupRichTooltipPresentationModel = popupRichTooltipPresentationModel;
            return this;
        }
    }

    public static class Builder {
        private CommandButtonPresentationState presentationState =
                CommandButtonPresentationState.FIT_TO_ICON;
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy =
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT;
        private boolean isFocusable = true;
        private int horizontalAlignment =
                CommandButtonPresentationModel.DEFAULT_HORIZONTAL_ALIGNMENT;
        private Insets contentPadding =
                CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING;
        private double horizontalGapScaleFactor =
                CommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR;
        private double verticalGapScaleFactor =
                CommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR;
        private Dimension iconDimension = null;
        private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
        private SelectedStateHighlight selectedStateHighlight =
                SelectedStateHighlight.FULL_SIZE;
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_START;
        private String actionKeyTip;
        private String popupKeyTip;
        private boolean toDismissPopupsOnActivation = true;
        private AbstractPopupMenuPresentationModel popupMenuPresentationModel;
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

        public Builder setBackgroundAppearanceStrategy(
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return this;
        }

        public Builder setFocusable(boolean focusable) {
            this.isFocusable = focusable;
            return this;
        }

        public Builder setHorizontalAlignment(int horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public Builder setContentPadding(Insets contentPadding) {
            this.contentPadding = contentPadding;
            return this;
        }

        public Builder setHorizontalGapScaleFactor(
                double horizontalGapScaleFactor) {
            this.horizontalGapScaleFactor = horizontalGapScaleFactor;
            return this;
        }

        public Builder setVerticalGapScaleFactor(double verticalGapScaleFactor) {
            this.verticalGapScaleFactor = verticalGapScaleFactor;
            return this;
        }

        public Builder setPresentationState(CommandButtonPresentationState presentationState) {
            this.presentationState = presentationState;
            return this;
        }

        public Builder setIconDimension(Dimension iconDimension) {
            this.iconDimension = iconDimension;
            return this;
        }

        public Builder setIconFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
            return this;
        }

        public Builder setPopupPlacementStrategy(
                RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {
            this.popupPlacementStrategy = popupPlacementStrategy;
            return this;
        }

        public Builder setSelectedStateHighlight(SelectedStateHighlight selectedStateHighlight) {
            this.selectedStateHighlight = selectedStateHighlight;
            return this;
        }

        public Builder setToDismissPopupsOnActivation(boolean toDismissPopupsOnActivation) {
            this.toDismissPopupsOnActivation = toDismissPopupsOnActivation;
            return this;
        }

        public Builder setPopupMenuPresentationModel(
                AbstractPopupMenuPresentationModel popupMenuPresentationModel) {
            this.popupMenuPresentationModel = popupMenuPresentationModel;
            return this;
        }

        public Builder setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return this;
        }

        public Builder setPopupKeyTip(String popupKeyTip) {
            this.popupKeyTip = popupKeyTip;
            return this;
        }

        public Builder setTextClick(TextClick textClick) {
            this.textClick = textClick;
            return this;
        }

        public Builder setAutoRepeatAction(boolean isAutoRepeatAction) {
            this.isAutoRepeatAction = isAutoRepeatAction;
            return this;
        }

        public Builder setAutoRepeatActionIntervals(int initial, int subsequent) {
            this.hasAutoRepeatIntervalsSet = true;
            this.autoRepeatInitialInterval = initial;
            this.autoRepeatSubsequentInterval = subsequent;
            return this;
        }

        public Builder setActionFireTrigger(ActionFireTrigger actionFireTrigger) {
            this.actionFireTrigger = actionFireTrigger;
            return this;
        }

        public Builder setPopupFireTrigger(PopupFireTrigger popupFireTrigger) {
            this.popupFireTrigger = popupFireTrigger;
            return this;
        }

        public Builder setActionRichTooltipPresentationModel(RichTooltipPresentationModel actionRichTooltipPresentationModel) {
            if (actionRichTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null presentation model");
            }
            this.actionRichTooltipPresentationModel = actionRichTooltipPresentationModel;
            return this;
        }

        public Builder setPopupRichTooltipPresentationModel(RichTooltipPresentationModel popupRichTooltipPresentationModel) {
            if (popupRichTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null presentation model");
            }
            this.popupRichTooltipPresentationModel = popupRichTooltipPresentationModel;
            return this;
        }

        public CommandButtonPresentationModel build() {
            CommandButtonPresentationModel commandPresentation =
                    new CommandButtonPresentationModel();

            commandPresentation.presentationState = this.presentationState;
            commandPresentation.horizontalAlignment = this.horizontalAlignment;
            commandPresentation.contentPadding = this.contentPadding;
            commandPresentation.horizontalGapScaleFactor = this.horizontalGapScaleFactor;
            commandPresentation.verticalGapScaleFactor = this.verticalGapScaleFactor;
            commandPresentation.backgroundAppearanceStrategy = this.backgroundAppearanceStrategy;
            commandPresentation.isFocusable = this.isFocusable;
            commandPresentation.iconDimension = this.iconDimension;
            commandPresentation.activeIconFilterStrategy = this.activeIconFilterStrategy;
            commandPresentation.enabledIconFilterStrategy = this.enabledIconFilterStrategy;
            commandPresentation.disabledIconFilterStrategy = this.disabledIconFilterStrategy;
            commandPresentation.selectedStateHighlight = this.selectedStateHighlight;
            commandPresentation.popupPlacementStrategy = this.popupPlacementStrategy;
            commandPresentation.actionKeyTip = this.actionKeyTip;
            commandPresentation.popupKeyTip = this.popupKeyTip;
            commandPresentation.toDismissPopupsOnActivation = this.toDismissPopupsOnActivation;
            commandPresentation.popupMenuPresentationModel = this.popupMenuPresentationModel;
            commandPresentation.textClick = this.textClick;
            commandPresentation.isAutoRepeatAction = this.isAutoRepeatAction;
            commandPresentation.hasAutoRepeatIntervalsSet = this.hasAutoRepeatIntervalsSet;
            commandPresentation.autoRepeatInitialInterval = this.autoRepeatInitialInterval;
            commandPresentation.autoRepeatSubsequentInterval = this.autoRepeatSubsequentInterval;
            commandPresentation.actionFireTrigger = this.actionFireTrigger;
            commandPresentation.popupFireTrigger = this.popupFireTrigger;
            commandPresentation.actionRichTooltipPresentationModel = this.actionRichTooltipPresentationModel;
            commandPresentation.popupRichTooltipPresentationModel = this.popupRichTooltipPresentationModel;

            return commandPresentation;
        }
    }
}
