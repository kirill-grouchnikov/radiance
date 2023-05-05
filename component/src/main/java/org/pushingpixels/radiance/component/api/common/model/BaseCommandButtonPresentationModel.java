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
import org.pushingpixels.radiance.component.api.common.popup.model.BaseCommandPopupMenuPresentationModel;
import org.pushingpixels.radiance.component.api.common.projection.CommandButtonProjection;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.*;
import java.awt.*;

public abstract class BaseCommandButtonPresentationModel<MPM extends BaseCommandPopupMenuPresentationModel,
        PM extends BaseCommandButtonPresentationModel<MPM, PM>> implements ImmutablePresentationModel {
    public static final int DEFAULT_HORIZONTAL_ALIGNMENT = SwingConstants.CENTER;
    public static final double DEFAULT_GAP_SCALE_FACTOR = 1.0;

    public static final int DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS = 500;
    public static final int DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS = 100;

    public static final Insets WIDE_BUTTON_CONTENT_PADDING = new Insets(3, 10, 2, 10);
    public static final Insets COMPACT_BUTTON_CONTENT_PADDING = new Insets(3, 5, 2, 5);

    protected CommandButtonPresentationState presentationState;
    protected Dimension iconDimension;
    protected RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy;
    protected RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
    protected RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;
    protected RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
    protected boolean isFocusable;
    protected int horizontalAlignment;
    protected Insets contentPadding;
    protected double horizontalGapScaleFactor;
    protected double verticalGapScaleFactor;
    protected SelectedStateHighlight selectedStateHighlight;
    protected RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;
    protected String actionKeyTip;
    protected String popupKeyTip;
    protected boolean toDismissPopupsOnActivation;
    protected MPM popupMenuPresentationModel;
    protected TextClick textClick;
    protected boolean isAutoRepeatAction;
    protected boolean hasAutoRepeatIntervalsSet;
    protected int autoRepeatInitialInterval;
    protected int autoRepeatSubsequentInterval;
    protected ActionFireTrigger actionFireTrigger;
    protected PopupFireTrigger popupFireTrigger;
    protected RichTooltipPresentationModel actionRichTooltipPresentationModel;
    protected RichTooltipPresentationModel popupRichTooltipPresentationModel;
    protected RadianceThemingSlices.Sides sides;

    protected BaseCommandButtonPresentationModel() {
    }

    public abstract PM overlayWith(Overlay overlay);

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

    public BaseCommandPopupMenuPresentationModel getPopupMenuPresentationModel() {
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

    public RadianceThemingSlices.Sides getSides() {
        return this.sides;
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
                BaseCommandPopupMenuPresentationModel popupMenuPresentationModel) {
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

        public Overlay setSides(RadianceThemingSlices.Sides sides) {
            this.sides = sides;
            return this;
        }

        public CommandButtonPresentationState getPresentationState() {
            return this.presentationState;
        }

        public RadianceThemingSlices.BackgroundAppearanceStrategy getBackgroundAppearanceStrategy() {
            return this.backgroundAppearanceStrategy;
        }

        public Boolean getFocusable() {
            return this.isFocusable;
        }

        public Integer getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        public Insets getContentPadding() {
            return this.contentPadding;
        }

        public Double getHorizontalGapScaleFactor() {
            return this.horizontalGapScaleFactor;
        }

        public Double getVerticalGapScaleFactor() {
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

        public SelectedStateHighlight getSelectedStateHighlight() {
            return this.selectedStateHighlight;
        }

        public RadianceThemingSlices.PopupPlacementStrategy getPopupPlacementStrategy() {
            return this.popupPlacementStrategy;
        }

        public Boolean getToDismissPopupsOnActivation() {
            return this.toDismissPopupsOnActivation;
        }

        public String getActionKeyTip() {
            return this.actionKeyTip;
        }

        public String getPopupKeyTip() {
            return this.popupKeyTip;
        }

        public BaseCommandPopupMenuPresentationModel getPopupMenuPresentationModel() {
            return this.popupMenuPresentationModel;
        }

        public TextClick getTextClick() {
            return this.textClick;
        }

        public Boolean getAutoRepeatAction() {
            return this.isAutoRepeatAction;
        }

        public Boolean getHasAutoRepeatIntervalsSet() {
            return this.hasAutoRepeatIntervalsSet;
        }

        public Integer getAutoRepeatInitialInterval() {
            return this.autoRepeatInitialInterval;
        }

        public Integer getAutoRepeatSubsequentInterval() {
            return this.autoRepeatSubsequentInterval;
        }

        public ActionFireTrigger getActionFireTrigger() {
            return this.actionFireTrigger;
        }

        public PopupFireTrigger getPopupFireTrigger() {
            return this.popupFireTrigger;
        }

        public RichTooltipPresentationModel getActionRichTooltipPresentationModel() {
            return this.actionRichTooltipPresentationModel;
        }

        public RichTooltipPresentationModel getPopupRichTooltipPresentationModel() {
            return this.popupRichTooltipPresentationModel;
        }

        public RadianceThemingSlices.Sides getSides() {
            return this.sides;
        }
    }

    public abstract static class BaseBuilder<MPM extends BaseCommandPopupMenuPresentationModel,
            PM extends BaseCommandButtonPresentationModel<MPM, PM>,
            B extends BaseBuilder<MPM, PM, B>> {
        private CommandButtonPresentationState presentationState =
                CommandButtonPresentationState.BIG_FIT_TO_ICON;
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy =
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT;
        private boolean isFocusable = true;
        private int horizontalAlignment =
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
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
        private SelectedStateHighlight selectedStateHighlight =
                SelectedStateHighlight.FULL_SIZE;
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_START;
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

        @SuppressWarnings("unchecked")
        public B setBackgroundAppearanceStrategy(
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setFocusable(boolean focusable) {
            this.isFocusable = focusable;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setHorizontalAlignment(int horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setContentPadding(Insets contentPadding) {
            this.contentPadding = contentPadding;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setHorizontalGapScaleFactor(
                double horizontalGapScaleFactor) {
            this.horizontalGapScaleFactor = horizontalGapScaleFactor;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setVerticalGapScaleFactor(double verticalGapScaleFactor) {
            this.verticalGapScaleFactor = verticalGapScaleFactor;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setPresentationState(CommandButtonPresentationState presentationState) {
            this.presentationState = presentationState;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setIconDimension(Dimension iconDimension) {
            this.iconDimension = iconDimension;
            return (B) this;
        }

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

        @SuppressWarnings("unchecked")
        public B setPopupPlacementStrategy(
                RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {
            this.popupPlacementStrategy = popupPlacementStrategy;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setSelectedStateHighlight(SelectedStateHighlight selectedStateHighlight) {
            this.selectedStateHighlight = selectedStateHighlight;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setToDismissPopupsOnActivation(boolean toDismissPopupsOnActivation) {
            this.toDismissPopupsOnActivation = toDismissPopupsOnActivation;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setPopupMenuPresentationModel(MPM popupMenuPresentationModel) {
            this.popupMenuPresentationModel = popupMenuPresentationModel;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setPopupKeyTip(String popupKeyTip) {
            this.popupKeyTip = popupKeyTip;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setTextClick(TextClick textClick) {
            this.textClick = textClick;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setAutoRepeatAction(boolean isAutoRepeatAction) {
            this.isAutoRepeatAction = isAutoRepeatAction;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setAutoRepeatActionIntervals(int initial, int subsequent) {
            this.hasAutoRepeatIntervalsSet = true;
            this.autoRepeatInitialInterval = initial;
            this.autoRepeatSubsequentInterval = subsequent;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setActionFireTrigger(ActionFireTrigger actionFireTrigger) {
            this.actionFireTrigger = actionFireTrigger;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setPopupFireTrigger(PopupFireTrigger popupFireTrigger) {
            this.popupFireTrigger = popupFireTrigger;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setActionRichTooltipPresentationModel(RichTooltipPresentationModel actionRichTooltipPresentationModel) {
            if (actionRichTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null presentation model");
            }
            this.actionRichTooltipPresentationModel = actionRichTooltipPresentationModel;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setPopupRichTooltipPresentationModel(RichTooltipPresentationModel popupRichTooltipPresentationModel) {
            if (popupRichTooltipPresentationModel == null) {
                throw new IllegalArgumentException("Cannot pass null presentation model");
            }
            this.popupRichTooltipPresentationModel = popupRichTooltipPresentationModel;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B setSides(RadianceThemingSlices.Sides sides) {
            this.sides = sides;
            return (B) this;
        }

        protected void configureBaseCommandButtonPresentationModel(
                BaseCommandButtonPresentationModel<MPM, PM> presentationModel) {
            presentationModel.presentationState = this.presentationState;
            presentationModel.horizontalAlignment = this.horizontalAlignment;
            presentationModel.contentPadding = this.contentPadding;
            presentationModel.horizontalGapScaleFactor = this.horizontalGapScaleFactor;
            presentationModel.verticalGapScaleFactor = this.verticalGapScaleFactor;
            presentationModel.backgroundAppearanceStrategy = this.backgroundAppearanceStrategy;
            presentationModel.isFocusable = this.isFocusable;
            presentationModel.iconDimension = this.iconDimension;
            presentationModel.activeIconFilterStrategy = this.activeIconFilterStrategy;
            presentationModel.enabledIconFilterStrategy = this.enabledIconFilterStrategy;
            presentationModel.disabledIconFilterStrategy = this.disabledIconFilterStrategy;
            presentationModel.selectedStateHighlight = this.selectedStateHighlight;
            presentationModel.popupPlacementStrategy = this.popupPlacementStrategy;
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
