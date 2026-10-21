/*
 * Copyright (c) 2005-2026 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.common.api.model;

import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;

/**
 * Model interface for a tri-state button that supports three selection states.
 */
public interface TriStateButtonModel {
    /**
     * The three possible selection states for a tri-state button.
     */
    enum SelectionState {
        /** The button is off (unselected). */
        OFF,
        /** The button is in a mixed (indeterminate) state. */
        MIXED,
        /** The button is on (selected). */
        ON
    }

    /**
     * Returns whether the button is enabled.
     *
     * @return Whether the button is enabled.
     */
    boolean isEnabled();
    /**
     * Returns whether the button is in the rollover state.
     *
     * @return Whether the button is in the rollover state.
     */
    boolean isRollover();
    /**
     * Returns the current selection state.
     *
     * @return The current selection state.
     */
    SelectionState getSelectionState();
    /**
     * Returns whether the button is currently pressed.
     *
     * @return Whether the button is currently pressed.
     */
    boolean isPressed();

    /**
     * Sets the enabled state of the button.
     *
     * @param enabled Whether the button should be enabled.
     */
    void setEnabled(boolean enabled);
    /**
     * Sets the rollover state of the button.
     *
     * @param rollover Whether the button should be in the rollover state.
     */
    void setRollover(boolean rollover);
    /**
     * Sets the selection state of the button.
     *
     * @param selectionState The new selection state.
     */
    void setSelectionState(SelectionState selectionState);
    /**
     * Sets the pressed state of the button.
     *
     * @param pressed Whether the button should be pressed.
     */
    void setPressed(boolean pressed);

    /**
     * Returns the selection cycler for this model.
     *
     * @return The selection cycler for this model.
     */
    TriStateSelectionCycler getSelectionCycler();
    /**
     * Sets the selection cycler for this model.
     *
     * @param selectionCycler The selection cycler.
     */
    void setSelectionCycler(TriStateSelectionCycler selectionCycler);

    /**
     * Adds an action listener to the model.
     *
     * @param actionListener The action listener to add.
     */
    void addActionListener(ActionListener actionListener);
    /**
     * Removes an action listener from the model.
     *
     * @param actionListener The action listener to remove.
     */
    void removeActionListener(ActionListener actionListener);
    /**
     * Adds a selection change listener to the model.
     *
     * @param itemListener The selection change listener to add.
     */
    void addSelectionChangeListener(TriStateSelectionChangeListener itemListener);
    /**
     * Removes a selection change listener from the model.
     *
     * @param itemListener The selection change listener to remove.
     */
    void removeSelectionChangeListener(TriStateSelectionChangeListener itemListener);
    /**
     * Adds a change listener to the model.
     *
     * @param changeListener The change listener to add.
     */
    void addChangeListener(ChangeListener changeListener);
    /**
     * Removes a change listener from the model.
     *
     * @param changeListener The change listener to remove.
     */
    void removeChangeListener(ChangeListener changeListener);
}
