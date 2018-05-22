/*
 * Copyright (c) 2005-2018 Flamingo / Substance Kirill Grouchnikov. All Rights Reserved.
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
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of
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
package org.pushingpixels.substance.flamingo.utils;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.pushingpixels.flamingo.api.common.AbstractCommandButton;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.substance.internal.animation.StateTransitionTracker;

public class CommandButtonVisualStateTracker {
    /**
     * Property change listener.
     */
    protected PropertyChangeListener substancePropertyListener;

    /**
     * Listener for transition animations on the action area.
     */
    protected StateTransitionTracker actionStateTransitionTracker;

    /**
     * Listener for transition animations on the popup area.
     */
    protected StateTransitionTracker popupStateTransitionTracker;

    public void installListeners(final AbstractCommandButton b) {
        this.substancePropertyListener = (PropertyChangeEvent evt) -> {
            if ("actionModel".equals(evt.getPropertyName())) {
                // action model has been changed
                actionStateTransitionTracker.setModel(b.getActionModel());
            }
            if ("popupModel".equals(evt.getPropertyName())) {
                JCommandButton jcb = (JCommandButton) b;
                // popup model has been changed
                popupStateTransitionTracker.setModel(jcb.getPopupModel());
            }
        };
        b.addPropertyChangeListener(this.substancePropertyListener);

        this.actionStateTransitionTracker = new StateTransitionTracker(b, b.getActionModel());
        this.actionStateTransitionTracker.registerModelListeners();

        if (b instanceof JCommandButton) {
            JCommandButton jcb = (JCommandButton) b;
            this.popupStateTransitionTracker = new StateTransitionTracker(jcb, jcb.getPopupModel());
            this.popupStateTransitionTracker.registerModelListeners();
        }
    }

    public void uninstallListeners(AbstractCommandButton b) {
        b.removePropertyChangeListener(this.substancePropertyListener);
        this.substancePropertyListener = null;

        this.actionStateTransitionTracker.unregisterModelListeners();
        this.actionStateTransitionTracker = null;

        if (this.popupStateTransitionTracker != null) {
            this.popupStateTransitionTracker.unregisterModelListeners();
            this.popupStateTransitionTracker = null;
        }
    }

    public StateTransitionTracker getActionStateTransitionTracker() {
        return actionStateTransitionTracker;
    }

    public StateTransitionTracker getPopupStateTransitionTracker() {
        return popupStateTransitionTracker;
    }

}
