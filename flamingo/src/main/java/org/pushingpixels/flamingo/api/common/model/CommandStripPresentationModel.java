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

import javax.swing.event.*;

public class CommandStripPresentationModel {
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

    private CommandStripPresentationModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommandButtonPresentationState getCommandPresentationState() {
        return this.commandPresentationState;
    }

    public void setCommandPresentationState(CommandButtonPresentationState commandPresentationState) {
        if (this.commandPresentationState != commandPresentationState) {
            this.commandPresentationState = commandPresentationState;
            this.fireStateChanged();
        }
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

    /**
     * Adds the specified change listener to track changes to the model.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to the model.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    /**
     * Notifies all registered listeners that the state of this model has changed.
     */
    private void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = this.listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent event = new ChangeEvent(this);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }

    public static class Builder {
        private CommandButtonPresentationState commandPresentationState
                = CommandButtonPresentationState.SMALL;
        private double hgapScaleFactor = -1;
        private double vgapScaleFactor = -1;
        private StripOrientation orientation = StripOrientation.HORIZONTAL;

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
            return presentationModel;
        }
    }
}
