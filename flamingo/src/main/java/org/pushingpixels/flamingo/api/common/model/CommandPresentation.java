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
package org.pushingpixels.flamingo.api.common.model;

import org.pushingpixels.flamingo.api.common.*;

/**
 * Encapsulates presentation metadata for displaying commands. Use a new instance of
 * {@link Builder} to configure a new presentation, and
 * {@link Builder#build()} to build a presentation.
 *
 * <p>Note that you can use the same
 * {@link CommandPresentation} instance on multiple calls to
 * {@link Command#project(CommandPresentation)}. Use {@link #overlayWith(Overlay)} to create
 * a new presentation instance that overlays the presentation configuration with values
 * set on the passed {@link Overlay} object.</p>
 *
 * @author Kirill Grouchnikov
 * @see Command
 * @see CommandProjection
 */
public class CommandPresentation {
    private CommandButtonDisplayState commandDisplayState;
    private Integer commandIconDimension;
    private boolean isFlat;
    private int horizontalAlignment;
    private double horizontalGapScaleFactor;
    private double verticalGapScaleFactor;
    private boolean isMenu;
    private JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind;
    private String actionKeyTip;
    private String popupKeyTip;

    private CommandPresentation() {
    }

    public CommandPresentation overlayWith(Overlay overlay) {
        CommandPresentation result = new CommandPresentation();

        result.commandDisplayState = (overlay.commandDisplayState != null)
                ? overlay.commandDisplayState : this.commandDisplayState;
        result.isFlat = (overlay.isFlat != null) ? overlay.isFlat : this.isFlat;
        result.horizontalAlignment = (overlay.horizontalAlignment != null)
                ? overlay.horizontalAlignment : this.horizontalAlignment;
        result.horizontalGapScaleFactor = (overlay.horizontalGapScaleFactor != null)
                ? overlay.horizontalGapScaleFactor : this.horizontalGapScaleFactor;
        result.verticalGapScaleFactor = (overlay.verticalGapScaleFactor != null)
                ? overlay.verticalGapScaleFactor : this.verticalGapScaleFactor;
        result.commandIconDimension = (overlay.commandIconDimension != null)
                ? overlay.commandIconDimension : this.commandIconDimension;
        result.isMenu = (overlay.isMenu != null) ? overlay.isMenu : this.isMenu;
        result.popupOrientationKind = (overlay.popupOrientationKind != null)
                ? overlay.popupOrientationKind : this.popupOrientationKind;
        result.actionKeyTip = (overlay.actionKeyTip != null)
                ? overlay.actionKeyTip : this.actionKeyTip;
        result.popupKeyTip = (overlay.popupKeyTip != null)
                ? overlay.popupKeyTip : this.popupKeyTip;

        return result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Overlay overlay() {
        return new Overlay();
    }

    public CommandButtonDisplayState getCommandDisplayState() {
        return this.commandDisplayState;
    }

    public boolean isFlat() {
        return this.isFlat;
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

    public Integer getCommandIconDimension() {
        return this.commandIconDimension;
    }

    public JCommandButton.CommandButtonPopupOrientationKind getPopupOrientationKind() {
        return this.popupOrientationKind;
    }

    public boolean isMenu() {
        return this.isMenu;
    }

    public String getActionKeyTip() {
        return this.actionKeyTip;
    }

    public String getPopupKeyTip() {
        return this.popupKeyTip;
    }

    public static class Overlay {
        private CommandButtonDisplayState commandDisplayState;
        private Boolean isFlat;
        private Integer horizontalAlignment;
        private Double horizontalGapScaleFactor;
        private Double verticalGapScaleFactor;
        private Integer commandIconDimension;
        private Boolean isMenu;
        private JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind;
        private String actionKeyTip;
        private String popupKeyTip;

        public Overlay setFlat(boolean flat) {
            this.isFlat = flat;
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

        public Overlay setCommandDisplayState(CommandButtonDisplayState commandDisplayState) {
            this.commandDisplayState = commandDisplayState;
            return this;
        }

        public Overlay setCommandIconDimension(Integer commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            return this;
        }

        public Overlay setPopupOrientationKind(
                JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return this;
        }

        public Overlay setMenu(boolean isMenu) {
            this.isMenu = isMenu;
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
    }

    public static class Builder {
        private CommandButtonDisplayState commandDisplayState =
                CommandButtonDisplayState.FIT_TO_ICON;
        private boolean isFlat = true;
        private int horizontalAlignment = AbstractCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT;
        private double horizontalGapScaleFactor = AbstractCommandButton.DEFAULT_GAP_SCALE_FACTOR;
        private double verticalGapScaleFactor = AbstractCommandButton.DEFAULT_GAP_SCALE_FACTOR;
        private Integer commandIconDimension;
        private boolean isMenu = false;
        private JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind =
                JCommandButton.CommandButtonPopupOrientationKind.DOWNWARD;
        private String actionKeyTip;
        private String popupKeyTip;

        public Builder setFlat(boolean flat) {
            this.isFlat = flat;
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

        public Builder setCommandDisplayState(
                CommandButtonDisplayState commandDisplayState) {
            this.commandDisplayState = commandDisplayState;
            return this;
        }

        public Builder setCommandIconDimension(Integer commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            return this;
        }

        public Builder setPopupOrientationKind(
                JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return this;
        }

        public Builder setMenu(boolean isMenu) {
            this.isMenu = isMenu;
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

        public CommandPresentation build() {
            CommandPresentation commandDisplay = new CommandPresentation();
            commandDisplay.commandDisplayState = this.commandDisplayState;
            commandDisplay.horizontalAlignment = this.horizontalAlignment;
            commandDisplay.horizontalGapScaleFactor = this.horizontalGapScaleFactor;
            commandDisplay.verticalGapScaleFactor = this.verticalGapScaleFactor;
            commandDisplay.isFlat = this.isFlat;
            commandDisplay.commandIconDimension = this.commandIconDimension;
            commandDisplay.isMenu = this.isMenu;
            commandDisplay.popupOrientationKind = this.popupOrientationKind;
            commandDisplay.actionKeyTip = this.actionKeyTip;
            commandDisplay.popupKeyTip = this.popupKeyTip;
            return commandDisplay;
        }
    }
}