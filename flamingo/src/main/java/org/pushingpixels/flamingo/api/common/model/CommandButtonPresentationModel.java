/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.common.model;

import org.pushingpixels.flamingo.api.common.CommandButtonPresentationState;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.popup.model.AbstractPopupMenuPresentationModel;
import org.pushingpixels.flamingo.api.common.projection.CommandButtonProjection;

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
    public static final int DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS = 500;
    public static final int DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS = 100;

    private CommandButtonPresentationState presentationState;
    private Integer iconDimension;
    private boolean isFlat;
    private boolean isFocusable;
    private int horizontalAlignment;
    private double horizontalGapScaleFactor;
    private double verticalGapScaleFactor;
    private boolean isMenu;
    private PopupOrientationKind popupOrientationKind;
    private PopupHorizontalGravity popupHorizontalGravity;
    private String actionKeyTip;
    private String popupKeyTip;
    private boolean toDismissPopupsOnActivation;
    private AbstractPopupMenuPresentationModel popupMenuPresentationModel;
    private boolean isTextClickAction;
    private boolean isTextClickPopup;
    private boolean isAutoRepeatAction;
    private boolean hasAutoRepeatIntervalsSet;
    private int autoRepeatInitialInterval;
    private int autoRepeatSubsequentInterval;
    private boolean isFireActionOnRollover;
    private boolean isFireActionOnPress;

    private CommandButtonPresentationModel() {
    }

    public CommandButtonPresentationModel overlayWith(Overlay overlay) {
        CommandButtonPresentationModel result = new CommandButtonPresentationModel();

        result.presentationState = (overlay.presentationState != null)
                ? overlay.presentationState : this.presentationState;
        result.isFlat = (overlay.isFlat != null) ? overlay.isFlat : this.isFlat;
        result.isFocusable = (overlay.isFocusable != null) ? overlay.isFocusable : this.isFocusable;
        result.horizontalAlignment = (overlay.horizontalAlignment != null)
                ? overlay.horizontalAlignment : this.horizontalAlignment;
        result.horizontalGapScaleFactor = (overlay.horizontalGapScaleFactor != null)
                ? overlay.horizontalGapScaleFactor : this.horizontalGapScaleFactor;
        result.verticalGapScaleFactor = (overlay.verticalGapScaleFactor != null)
                ? overlay.verticalGapScaleFactor : this.verticalGapScaleFactor;
        result.iconDimension = (overlay.iconDimension != null)
                ? overlay.iconDimension : this.iconDimension;
        result.isMenu = (overlay.isMenu != null) ? overlay.isMenu : this.isMenu;
        result.popupOrientationKind = (overlay.popupOrientationKind != null)
                ? overlay.popupOrientationKind : this.popupOrientationKind;
        result.popupHorizontalGravity = (overlay.popupHorizontalGravity != null)
                ? overlay.popupHorizontalGravity : this.popupHorizontalGravity;
        result.toDismissPopupsOnActivation = (overlay.toDismissPopupsOnActivation != null)
                ? overlay.toDismissPopupsOnActivation : this.toDismissPopupsOnActivation;
        result.popupMenuPresentationModel = (overlay.popupMenuPresentationModel != null)
                ? overlay.popupMenuPresentationModel : this.popupMenuPresentationModel;
        result.actionKeyTip = (overlay.actionKeyTip != null)
                ? overlay.actionKeyTip : this.actionKeyTip;
        result.popupKeyTip = (overlay.popupKeyTip != null)
                ? overlay.popupKeyTip : this.popupKeyTip;
        result.isTextClickAction = (overlay.isTextClickAction != null)
                ? overlay.isTextClickAction : this.isTextClickAction;
        result.isTextClickPopup = (overlay.isTextClickPopup != null)
                ? overlay.isTextClickPopup : this.isTextClickPopup;
        result.isAutoRepeatAction = (overlay.isAutoRepeatAction != null)
                ? overlay.isAutoRepeatAction : this.isAutoRepeatAction;
        result.hasAutoRepeatIntervalsSet = (overlay.hasAutoRepeatIntervalsSet != null)
                ? overlay.hasAutoRepeatIntervalsSet : this.hasAutoRepeatIntervalsSet;
        result.autoRepeatInitialInterval = (overlay.autoRepeatInitialInterval != null)
                ? overlay.autoRepeatInitialInterval : this.autoRepeatInitialInterval;
        result.autoRepeatSubsequentInterval = (overlay.autoRepeatSubsequentInterval != null)
                ? overlay.autoRepeatSubsequentInterval : this.autoRepeatSubsequentInterval;
        result.isFireActionOnRollover = (overlay.isFireActionOnRollover != null)
                ? overlay.isFireActionOnRollover : this.isFireActionOnRollover;
        result.isFireActionOnPress = (overlay.isFireActionOnPress != null)
                ? overlay.isFireActionOnPress : this.isFireActionOnPress;

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

    public boolean isFlat() {
        return this.isFlat;
    }

    public boolean isFocusable() {
        return this.isFocusable;
    }

    public int getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public double getHorizontalGapScaleFactor() {
        return this.horizontalGapScaleFactor;
    }

    public double getVerticalGapScaleFactor() {
        return this.verticalGapScaleFactor;
    }

    public Integer getIconDimension() {
        return this.iconDimension;
    }

    public PopupOrientationKind getPopupOrientationKind() {
        return this.popupOrientationKind;
    }

    public PopupHorizontalGravity getPopupHorizontalGravity() {
        return this.popupHorizontalGravity;
    }

    public boolean isMenu() {
        return this.isMenu;
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

    public boolean isTextClickAction() {
        return this.isTextClickAction;
    }

    public boolean isTextClickPopup() {
        return this.isTextClickPopup;
    }

    public boolean isFireActionOnRollover() {
        return this.isFireActionOnRollover;
    }

    public boolean isFireActionOnPress() {
        return this.isFireActionOnPress;
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

    /**
     * Orientation kind for the popup.
     *
     * @author Kirill Grouchnikov
     */
    public enum PopupOrientationKind {
        /**
         * Indicates that the popup should be displayed below the button.
         */
        DOWNWARD,

        /**
         * Indicates that the popup should be displayed to the side of the button.
         */
        SIDEWARD
    }

    /**
     * Popup horizontal gravity.
     *
     * @author Kirill Grouchnikov
     */
    public enum PopupHorizontalGravity {
        /**
         * Indicates that the popup should be horizontally aligned to the start edge of the button.
         */
        START,

        /**
         * Indicates that the popup should be horizontally aligned to the end edge of the button.
         */
        END
    }

    public static class Overlay {
        private CommandButtonPresentationState presentationState;
        private Boolean isFlat;
        private Boolean isFocusable;
        private Integer horizontalAlignment;
        private Double horizontalGapScaleFactor;
        private Double verticalGapScaleFactor;
        private Integer iconDimension;
        private Boolean isMenu;
        private PopupOrientationKind popupOrientationKind;
        private PopupHorizontalGravity popupHorizontalGravity;
        private Boolean toDismissPopupsOnActivation;
        private String actionKeyTip;
        private String popupKeyTip;
        private AbstractPopupMenuPresentationModel popupMenuPresentationModel;
        private Boolean isTextClickAction;
        private Boolean isTextClickPopup;
        private Boolean isAutoRepeatAction;
        private Boolean hasAutoRepeatIntervalsSet;
        private Integer autoRepeatInitialInterval;
        private Integer autoRepeatSubsequentInterval;
        private Boolean isFireActionOnRollover;
        private Boolean isFireActionOnPress;

        public Overlay setFlat(boolean flat) {
            this.isFlat = flat;
            return this;
        }

        public Overlay setFocusable(boolean focusable) {
            this.isFocusable = focusable;
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

        public Overlay setIconDimension(Integer iconDimension) {
            this.iconDimension = iconDimension;
            return this;
        }

        public Overlay setPopupOrientationKind(PopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return this;
        }

        public Overlay setPopupHorizontalGravity(PopupHorizontalGravity popupHorizontalGravity) {
            this.popupHorizontalGravity = popupHorizontalGravity;
            return this;
        }

        public Overlay setMenu(boolean isMenu) {
            this.isMenu = isMenu;
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

        public Overlay setTextClickAction() {
            this.isTextClickAction = true;
            return this;
        }

        public Overlay setTextClickPopup() {
            this.isTextClickPopup = true;
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

        public Overlay setFireActionOnRollover(boolean isFireActionOnRollover) {
            this.isFireActionOnRollover = isFireActionOnRollover;
            return this;
        }

        public Overlay setFireActionOnPress(boolean isFireActionOnPress) {
            this.isFireActionOnPress = isFireActionOnPress;
            return this;
        }
    }

    public static class Builder {
        private CommandButtonPresentationState presentationState =
                CommandButtonPresentationState.FIT_TO_ICON;
        private boolean isFlat = true;
        private boolean isFocusable = true;
        private int horizontalAlignment = JCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT;
        private double horizontalGapScaleFactor = JCommandButton.DEFAULT_GAP_SCALE_FACTOR;
        private double verticalGapScaleFactor = JCommandButton.DEFAULT_GAP_SCALE_FACTOR;
        private Integer iconDimension;
        private boolean isMenu = false;
        private PopupOrientationKind popupOrientationKind = PopupOrientationKind.DOWNWARD;
        private PopupHorizontalGravity popupHorizontalGravity = PopupHorizontalGravity.START;
        private String actionKeyTip;
        private String popupKeyTip;
        private boolean toDismissPopupsOnActivation = true;
        private AbstractPopupMenuPresentationModel popupMenuPresentationModel;
        private boolean isTextClickAction;
        private boolean isTextClickPopup;
        private boolean isAutoRepeatAction;
        private boolean hasAutoRepeatIntervalsSet;
        private int autoRepeatInitialInterval = DEFAULT_AUTO_REPEAT_INITIAL_INTERVAL_MS;
        private int autoRepeatSubsequentInterval = DEFAULT_AUTO_REPEAT_SUBSEQUENT_INTERVAL_MS;
        private boolean isFireActionOnRollover;
        private boolean isFireActionOnPress;

        public Builder setFlat(boolean flat) {
            this.isFlat = flat;
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

        public Builder setIconDimension(Integer iconDimension) {
            this.iconDimension = iconDimension;
            return this;
        }

        public Builder setPopupOrientationKind(PopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return this;
        }

        public Builder setPopupHorizontalGravity(PopupHorizontalGravity popupHorizontalGravity) {
            this.popupHorizontalGravity = popupHorizontalGravity;
            return this;
        }

        public Builder setMenu(boolean isMenu) {
            this.isMenu = isMenu;
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

        public Builder setTextClickAction() {
            this.isTextClickAction = true;
            return this;
        }

        public Builder setTextClickPopup() {
            this.isTextClickPopup = true;
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

        public Builder setFireActionOnRollover(boolean isFireActionOnRollover) {
            this.isFireActionOnRollover = isFireActionOnRollover;
            return this;
        }

        public Builder setFireActionOnPress(boolean isFireActionOnPress) {
            this.isFireActionOnPress = isFireActionOnPress;
            return this;
        }

        public CommandButtonPresentationModel build() {
            CommandButtonPresentationModel commandPresentation =
                    new CommandButtonPresentationModel();

            commandPresentation.presentationState = this.presentationState;
            commandPresentation.horizontalAlignment = this.horizontalAlignment;
            commandPresentation.horizontalGapScaleFactor = this.horizontalGapScaleFactor;
            commandPresentation.verticalGapScaleFactor = this.verticalGapScaleFactor;
            commandPresentation.isFlat = this.isFlat;
            commandPresentation.isFocusable = this.isFocusable;
            commandPresentation.iconDimension = this.iconDimension;
            commandPresentation.isMenu = this.isMenu;
            commandPresentation.popupOrientationKind = this.popupOrientationKind;
            commandPresentation.popupHorizontalGravity = this.popupHorizontalGravity;
            commandPresentation.actionKeyTip = this.actionKeyTip;
            commandPresentation.popupKeyTip = this.popupKeyTip;
            commandPresentation.toDismissPopupsOnActivation = this.toDismissPopupsOnActivation;
            commandPresentation.popupMenuPresentationModel = this.popupMenuPresentationModel;
            commandPresentation.isTextClickAction = this.isTextClickAction;
            commandPresentation.isTextClickPopup = this.isTextClickPopup;
            commandPresentation.isAutoRepeatAction = this.isAutoRepeatAction;
            commandPresentation.hasAutoRepeatIntervalsSet = this.hasAutoRepeatIntervalsSet;
            commandPresentation.autoRepeatInitialInterval = this.autoRepeatInitialInterval;
            commandPresentation.autoRepeatSubsequentInterval = this.autoRepeatSubsequentInterval;
            commandPresentation.isFireActionOnRollover = this.isFireActionOnRollover;
            commandPresentation.isFireActionOnPress = this.isFireActionOnPress;

            return commandPresentation;
        }
    }
}