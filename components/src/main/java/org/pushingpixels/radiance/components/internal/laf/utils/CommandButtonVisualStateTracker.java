/*
 * Copyright (c) 2005-2021 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.components.internal.laf.utils;

import org.pushingpixels.radiance.components.api.common.JCommandButton;
import org.pushingpixels.radiance.theming.internal.animation.StateTransitionTracker;

import java.beans.PropertyChangeListener;

public class CommandButtonVisualStateTracker {
    /**
     * Property change listener.
     */
    private PropertyChangeListener radiancePropertyListener;

    /**
     * Listener for transition animations on the action area.
     */
    private StateTransitionTracker actionStateTransitionTracker;

    /**
     * Listener for transition animations on the popup area.
     */
    private StateTransitionTracker popupStateTransitionTracker;

    public void installListeners(final JCommandButton b) {
        this.radiancePropertyListener = propertyChangeEvent -> {
            if ("actionModel".equals(propertyChangeEvent.getPropertyName())) {
                // action model has been changed
                actionStateTransitionTracker.setModel(b.getActionModel());
            }
            if ("popupModel".equals(propertyChangeEvent.getPropertyName())) {
                // popup model has been changed
                popupStateTransitionTracker.setModel(b.getPopupModel());
            }
        };
        b.addPropertyChangeListener(this.radiancePropertyListener);

        this.actionStateTransitionTracker = new StateTransitionTracker(b, b.getActionModel());
        this.actionStateTransitionTracker.registerModelListeners();

        this.popupStateTransitionTracker = new StateTransitionTracker(b, b.getPopupModel());
        this.popupStateTransitionTracker.registerModelListeners();
    }

    public void uninstallListeners(JCommandButton b) {
        b.removePropertyChangeListener(this.radiancePropertyListener);
        this.radiancePropertyListener = null;

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
