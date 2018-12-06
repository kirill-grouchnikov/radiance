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

import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu;
import org.pushingpixels.flamingo.internal.substance.common.ui.SubstanceCommandMenuButtonUI;
import org.pushingpixels.neon.icon.ResizableIcon;

import java.awt.event.ActionEvent;

/**
 * A command button that can be placed in {@link JCommandPopupMenu}s and in the
 * primary / secondary panels of the ribbon application menu.
 *
 * @author Kirill Grouchnikov
 */
public class JCommandMenuButton extends JCommandButton {
    /**
     * The UI class ID string.
     */
    public static final String uiClassID = "CommandMenuButtonUI";

    public JCommandMenuButton(Command command, CommandPresentation presentation) {
        super(command, presentation);
    }

    /**
     * Adds a rollover action listener that will be called when the rollover
     * state of this button becomes active.
     *
     * @param l The rollover action listener to add.
     * @see #removeRolloverActionListener(RolloverActionListener)
     */
    public void addRolloverActionListener(RolloverActionListener l) {
        this.listenerList.add(RolloverActionListener.class, l);
    }

    /**
     * Removes the specified rollover action listener.
     *
     * @param l The listener to remove.
     * @see #addRolloverActionListener(RolloverActionListener)
     */
    public void removeRolloverActionListener(RolloverActionListener l) {
        this.listenerList.remove(RolloverActionListener.class, l);
    }

    @Override
    public String getUIClassID() {
        return uiClassID;
    }

    @Override
    public void updateUI() {
        setUI(SubstanceCommandMenuButtonUI.createUI(this));
    }

    @Override
    boolean canHaveBothKeyTips() {
        return true;
    }

    /**
     * Programmatically perform a "rollover" on the action area. This does the
     * same thing as if the user had moved the mouse over the action area of the
     * button.
     */
    public void doActionRollover() {
        ActionEvent ae = new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                this.getActionModel().getActionCommand());
        // Guaranteed to return a non-null array
        RolloverActionListener[] listeners = this.getListeners(RolloverActionListener.class);
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 1; i >= 0; i--) {
            (listeners[i]).actionPerformed(ae);
        }
    }
}
