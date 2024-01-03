/*
 * Copyright (c) 2005-2024 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;

public class DefaultTriStateButtonModel implements TriStateButtonModel {
    private boolean isEnabled;
    private boolean isRollover;
    private boolean isPressed;
    private SelectionState selectionState;
    private TriStateSelectionCycler selectionCycler;

    private EventListenerList listenerList = new EventListenerList();

    public DefaultTriStateButtonModel(TriStateSelectionCycler selectionCycler) {
        this.isEnabled = true;
        this.isRollover = false;
        this.isPressed = false;
        this.selectionState = SelectionState.OFF;
        this.selectionCycler = selectionCycler;
    }

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public void setEnabled(boolean isEnabled) {
        if (this.isEnabled == isEnabled) {
            return;
        }

        this.isEnabled = isEnabled;
        this.isPressed = false;
        this.isRollover = false;
        this.fireStateChanged();
    }

    @Override
    public boolean isRollover() {
        return this.isRollover;
    }

    @Override
    public void setRollover(boolean isRollover) {
        if (!this.isEnabled || (this.isRollover == isRollover)) {
            return;
        }

        this.isRollover = isRollover;
        this.fireStateChanged();
    }

    @Override
    public boolean isPressed() {
        return this.isPressed;
    }

    @Override
    public void setPressed(boolean isPressed) {
        if (!this.isEnabled || (this.isPressed == isPressed)) {
            return;
        }

        if (!this.isPressed) {
            this.selectionState = this.selectionCycler.getNextSelectionState(this.selectionState);
            this.fireItemStateChanged(new TriStateSelectionChangeEvent(this,
                    ItemEvent.ITEM_STATE_CHANGED,
                    this,
                    this.selectionState));
        }

        this.isPressed = isPressed;

        if (!this.isPressed) {
            int modifiers = 0;
            AWTEvent currentEvent = EventQueue.getCurrentEvent();
            if (currentEvent instanceof InputEvent) {
                modifiers = ((InputEvent) currentEvent).getModifiersEx();
            } else if (currentEvent instanceof ActionEvent) {
                modifiers = ((ActionEvent) currentEvent).getModifiers();
            }
            this.fireActionPerformed(
                    new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                            null,
                            EventQueue.getMostRecentEventTime(),
                            modifiers));
        }

        this.fireStateChanged();
    }

    @Override
    public SelectionState getSelectionState() {
        return this.selectionState;
    }

    @Override
    public void setSelectionState(SelectionState selectionState) {
        if (this.selectionState == selectionState) {
            return;
        }

        this.selectionState = selectionState;

        this.fireItemStateChanged(new TriStateSelectionChangeEvent(this,
                ItemEvent.ITEM_STATE_CHANGED,
                this,
                selectionState));

        this.fireStateChanged();
    }

    @Override
    public TriStateSelectionCycler getSelectionCycler() {
        return this.selectionCycler;
    }

    @Override
    public void setSelectionCycler(TriStateSelectionCycler selectionCycler) {
        if (this.selectionCycler != selectionCycler) {
            this.selectionCycler = selectionCycler;
        }
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
        this.listenerList.add(ChangeListener.class, changeListener);
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
        listenerList.remove(ChangeListener.class, changeListener);
    }

    private void fireStateChanged() {
        Object[] listeners = listenerList.getListenerList();
        ChangeEvent event = new ChangeEvent(this);
        // Process the listeners last to first
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }

    @Override
    public void addActionListener(ActionListener actionListener) {
        this.listenerList.add(ActionListener.class, actionListener);
    }

    @Override
    public void removeActionListener(ActionListener actionListener) {
        this.listenerList.remove(ActionListener.class, actionListener);
    }

    private void fireActionPerformed(ActionEvent e) {
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ActionListener.class) {
                ((ActionListener) listeners[i + 1]).actionPerformed(e);
            }
        }
    }

    @Override
    public void addSelectionChangeListener(TriStateSelectionChangeListener l) {
        this.listenerList.add(TriStateSelectionChangeListener.class, l);
    }

    @Override
    public void removeSelectionChangeListener(TriStateSelectionChangeListener l) {
        this.listenerList.remove(TriStateSelectionChangeListener.class, l);
    }

    private void fireItemStateChanged(TriStateSelectionChangeEvent e) {
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == TriStateSelectionChangeListener.class) {
                ((TriStateSelectionChangeListener) listeners[i + 1]).itemTriStateSelectionChanged(e);
            }
        }
    }
}
