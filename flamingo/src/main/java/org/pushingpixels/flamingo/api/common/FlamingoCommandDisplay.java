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
package org.pushingpixels.flamingo.api.common;

/**
 * Encapsulates display metadata associated with a single command. Use a new instance of
 * {@link FlamingoCommandDisplayBuilder} to configure a new command, and
 * {@link FlamingoCommandDisplayBuilder#build()} to build a command.
 *
 * @author Kirill Grouchnikov
 */
public class FlamingoCommandDisplay {
    private CommandButtonDisplayState state;
    private boolean isFlat;
    private int horizontalAlignment;
    private double horizontalGapScaleFactor;
    private double verticalGapScaleFactor;
    private Integer customDimension;
    private boolean isMenu;
    private JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind;
    private String actionKeyTip;
    private String popupKeyTip;

    private FlamingoCommandDisplay() {
    }

    public FlamingoCommandDisplay overlayWith(Overlay overlay) {
        FlamingoCommandDisplay result = new FlamingoCommandDisplay();

        result.state = (overlay.state != null) ? overlay.state : this.state;
        result.isFlat = (overlay.isFlat != null) ? overlay.isFlat : this.isFlat;
        result.horizontalAlignment = (overlay.horizontalAlignment != null)
                ? overlay.horizontalAlignment : this.horizontalAlignment;
        result.horizontalGapScaleFactor = (overlay.horizontalGapScaleFactor != null)
                ? overlay.horizontalGapScaleFactor : this.horizontalGapScaleFactor;
        result.verticalGapScaleFactor = (overlay.verticalGapScaleFactor != null)
                ? overlay.verticalGapScaleFactor : this.verticalGapScaleFactor;
        result.customDimension = (overlay.customDimension != null)
                ? overlay.customDimension : this.customDimension;
        result.isMenu = (overlay.isMenu != null) ? overlay.isMenu : this.isMenu;
        result.popupOrientationKind = (overlay.popupOrientationKind != null)
                ? overlay.popupOrientationKind : this.popupOrientationKind;
        result.actionKeyTip = (overlay.actionKeyTip != null)
                ? overlay.actionKeyTip : this.actionKeyTip;
        result.popupKeyTip = (overlay.popupKeyTip != null)
                ? overlay.popupKeyTip : this.popupKeyTip;

        return result;
    }

    public static FlamingoCommandDisplayBuilder builder() {
        return new FlamingoCommandDisplayBuilder();
    }

    public static Overlay overlay() {
        return new Overlay();
    }

    public CommandButtonDisplayState getState() {
        return this.state;
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

    public Integer getCustomDimension() {
        return this.customDimension;
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
        private CommandButtonDisplayState state;
        private Boolean isFlat;
        private Integer horizontalAlignment;
        private Double horizontalGapScaleFactor;
        private Double verticalGapScaleFactor;
        private Integer customDimension;
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

        public Overlay setState(CommandButtonDisplayState state) {
            this.state = state;
            return this;
        }

        public Overlay setCustomDimension(Integer customDimension) {
            this.customDimension = customDimension;
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

    public static class FlamingoCommandDisplayBuilder {
        private CommandButtonDisplayState state = CommandButtonDisplayState.FIT_TO_ICON;
        private boolean isFlat = true;
        private int horizontalAlignment = AbstractCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT;
        private double horizontalGapScaleFactor = AbstractCommandButton.DEFAULT_GAP_SCALE_FACTOR;
        private double verticalGapScaleFactor = AbstractCommandButton.DEFAULT_GAP_SCALE_FACTOR;
        private Integer customDimension;
        private boolean isMenu = false;
        private JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind =
                JCommandButton.CommandButtonPopupOrientationKind.DOWNWARD;
        private String actionKeyTip;
        private String popupKeyTip;

        public FlamingoCommandDisplayBuilder setFlat(boolean flat) {
            this.isFlat = flat;
            return this;
        }

        public FlamingoCommandDisplayBuilder setHorizontalAlignment(int horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public FlamingoCommandDisplayBuilder setHorizontalGapScaleFactor(double horizontalGapScaleFactor) {
            this.horizontalGapScaleFactor = horizontalGapScaleFactor;
            return this;
        }

        public FlamingoCommandDisplayBuilder setVerticalGapScaleFactor(double verticalGapScaleFactor) {
            this.verticalGapScaleFactor = verticalGapScaleFactor;
            return this;
        }

        public FlamingoCommandDisplayBuilder setState(CommandButtonDisplayState state) {
            this.state = state;
            return this;
        }

        public FlamingoCommandDisplayBuilder setCustomDimension(Integer customDimension) {
            this.customDimension = customDimension;
            return this;
        }

        public FlamingoCommandDisplayBuilder setPopupOrientationKind(
                JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return this;
        }

        public FlamingoCommandDisplayBuilder setMenu(boolean isMenu) {
            this.isMenu = isMenu;
            return this;
        }

        public FlamingoCommandDisplayBuilder setActionKeyTip(String actionKeyTip) {
            this.actionKeyTip = actionKeyTip;
            return this;
        }

        public FlamingoCommandDisplayBuilder setPopupKeyTip(String popupKeyTip) {
            this.popupKeyTip = popupKeyTip;
            return this;
        }

        public FlamingoCommandDisplay build() {
            FlamingoCommandDisplay commandDisplay = new FlamingoCommandDisplay();
            commandDisplay.state = this.state;
            commandDisplay.horizontalAlignment = this.horizontalAlignment;
            commandDisplay.horizontalGapScaleFactor = this.horizontalGapScaleFactor;
            commandDisplay.verticalGapScaleFactor = this.verticalGapScaleFactor;
            commandDisplay.isFlat = this.isFlat;
            commandDisplay.customDimension = this.customDimension;
            commandDisplay.isMenu = this.isMenu;
            commandDisplay.popupOrientationKind = this.popupOrientationKind;
            commandDisplay.actionKeyTip = this.actionKeyTip;
            commandDisplay.popupKeyTip = this.popupKeyTip;
            return commandDisplay;
        }
    }
}