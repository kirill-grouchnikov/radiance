/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import javax.swing.event.*;

public class CommandStripPresentationModel implements ImmutablePresentationModel {
    public static final double DEFAULT_GAP_SCALE_FACTOR_PRIMARY_AXIS = 0.75;
    public static final double DEFAULT_GAP_SCALE_FACTOR_SECONDARY_AXIS = 1.0;

    /**
     * Button strip orientation.
     *
     * @author Kirill Grouchnikov
     */
    public enum StripOrientation {
        /**
         * Horizontal strip orientation.
         */
        HORIZONTAL,

        /**
         * Vertical strip orientation.
         */
        VERTICAL
    }

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    /**
     * Presentation state for the buttons in this button strip. Default state is
     * {@link CommandButtonPresentationState#SMALL}.
     */
    private CommandButtonPresentationState commandPresentationState;

    /**
     * Scale factor for horizontal gaps.
     */
    private double hgapScaleFactor;

    /**
     * Scale factor for vertical gaps.
     */
    private double vgapScaleFactor;

    /**
     * Orientation of <code>this</code> strip.
     */
    private StripOrientation orientation;

    private boolean isFlat;
    private boolean isFocusable;
    private boolean toDismissPopupsOnActivation;

    private CommandStripPresentationModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommandStripPresentationModel withDefaults() {
        return CommandStripPresentationModel.builder().build();
    }

    public CommandButtonPresentationState getCommandPresentationState() {
        return this.commandPresentationState;
    }

    public double getHorizontalGapScaleFactor() {
        return this.hgapScaleFactor;
    }

    public double getVerticalGapScaleFactor() {
        return this.vgapScaleFactor;
    }

    public StripOrientation getOrientation() {
        return this.orientation;
    }

    public boolean isFlat() {
        return this.isFlat;
    }

    public boolean isFocusable() {
        return this.isFocusable;
    }

    public boolean isToDismissPopupsOnActivation() {
        return this.toDismissPopupsOnActivation;
    }

    public static class Builder {
        private CommandButtonPresentationState commandPresentationState
                = CommandButtonPresentationState.SMALL;
        private double hgapScaleFactor = -1;
        private double vgapScaleFactor = -1;
        private StripOrientation orientation = StripOrientation.HORIZONTAL;
        private boolean isFlat = false;
        private boolean isFocusable = true;
        private boolean toDismissPopupsOnActivation = true;

        public Builder setCommandPresentationState(
                CommandButtonPresentationState commandPresentationState) {
            this.commandPresentationState = commandPresentationState;
            return this;
        }

        public Builder setHorizontalGapScaleFactor(double hgapScaleFactor) {
            this.hgapScaleFactor = hgapScaleFactor;
            return this;
        }

        public Builder setVerticalGapScaleFactor(double vgapScaleFactor) {
            this.vgapScaleFactor = vgapScaleFactor;
            return this;
        }

        public Builder setOrientation(StripOrientation orientation) {
            this.orientation = orientation;
            return this;
        }

        public Builder setFlat(boolean flat) {
            this.isFlat = flat;
            return this;
        }

        public Builder setFocusable(boolean focusable) {
            this.isFocusable = focusable;
            return this;
        }

        public Builder setToDismissPopupsOnActivation(boolean toDismissPopupsOnActivation) {
            this.toDismissPopupsOnActivation = toDismissPopupsOnActivation;
            return this;
        }

        public CommandStripPresentationModel build() {
            CommandStripPresentationModel presentationModel = new CommandStripPresentationModel();
            presentationModel.commandPresentationState = this.commandPresentationState;
            presentationModel.orientation = this.orientation;
            if (this.hgapScaleFactor < 0) {
                presentationModel.hgapScaleFactor =
                        (this.orientation == StripOrientation.HORIZONTAL)
                                ? DEFAULT_GAP_SCALE_FACTOR_PRIMARY_AXIS
                                : DEFAULT_GAP_SCALE_FACTOR_SECONDARY_AXIS;
            } else {
                presentationModel.hgapScaleFactor = this.hgapScaleFactor;
            }
            if (this.vgapScaleFactor < 0) {
                presentationModel.vgapScaleFactor =
                        (this.orientation == StripOrientation.VERTICAL)
                                ? DEFAULT_GAP_SCALE_FACTOR_PRIMARY_AXIS
                                : DEFAULT_GAP_SCALE_FACTOR_SECONDARY_AXIS;
            } else {
                presentationModel.vgapScaleFactor = this.vgapScaleFactor;
            }
            presentationModel.isFlat = this.isFlat;
            presentationModel.isFocusable = this.isFocusable;
            presentationModel.toDismissPopupsOnActivation = this.toDismissPopupsOnActivation;
            return presentationModel;
        }
    }
}
