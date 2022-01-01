/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.common.model;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.*;

/**
 * Group of toggle commands.
 *
 * @author Kirill Grouchnikov
 */
public class CommandToggleGroupModel {
    /**
     * Contains all group commands.
     */
    private Vector<Command> commands;

    /**
     * Map of registered model change listeners.
     */
    private Map<Command, ChangeListener> modelChangeListeners;

    /**
     * The currently selected command. Can be <code>null</code>.
     */
    private Command selection;

    /**
     * If <code>false</code>, the selection cannot be cleared. By default the
     * command group allows clearing the selection in {@link #clearSelection()}
     * or {@link #setSelected(Command, boolean)} (passing the
     * currently selected command and <code>false</code>).
     */
    private boolean allowsClearingSelection;

    /**
     * Creates a new command group.
     */
    public CommandToggleGroupModel() {
        this.commands = new Vector<>();
        this.modelChangeListeners = new HashMap<>();
        this.allowsClearingSelection = true;
    }

    /**
     * Returns an unmodifiable collection with all the commands tracked by this model.
     *
     * @return An unmodifiable collection with all the commands tracked by this model.
     */
    public Collection<Command> getCommands() {
        return Collections.unmodifiableCollection(this.commands);
    }

    /**
     * Sets the new value for clearing selection. If <code>true</code> is
     * passed, the selection can be cleared in {@link #clearSelection()} or
     * {@link #setSelected(Command, boolean)} (passing the
     * currently selected command and <code>false</code>).
     *
     * @param allowsClearingSelection The new value for clearing selection.
     */
    public void setAllowsClearingSelection(boolean allowsClearingSelection) {
        this.allowsClearingSelection = allowsClearingSelection;
    }

    /**
     * Returns the current value for clearing selection. <code>true</code> is
     * returned when selection can be cleared in {@link #clearSelection()} or
     * {@link #setSelected(Command, boolean)} (passing the
     * currently selected command and <code>false</code>).
     *
     * @return The current value for clearing selection.
     */
    public boolean isAllowsClearingSelection() {
        return allowsClearingSelection;
    }

    /**
     * Adds the specified command to the group. If the command is selected, and
     * the group has a selected command, the newly added command is marked as
     * unselected.
     *
     * @param command The command to be added.
     */
    public void add(final Command command) {
        if (command == null) {
            return;
        }
        commands.addElement(command);

        boolean wasSelectionNull = (this.selection == null);
        if (command.isToggleSelected()) {
            if (wasSelectionNull) {
                selection = command;
            } else {
                command.setToggleSelected(false);
            }
        }
        ChangeListener cl = new ChangeListener() {
            boolean wasSelected = command.isToggleSelected();

            @Override
            public void stateChanged(ChangeEvent e) {
                boolean isSelected = command.isToggleSelected();
                if (wasSelected != isSelected) {
                    setSelected(command, isSelected);
                }
                wasSelected = isSelected;
            }
        };

        command.addChangeListener(cl);
        this.modelChangeListeners.put(command, cl);
    }

    /**
     * Removes the specified command from the group.
     *
     * @param command The command to be removed
     */
    public void remove(Command command) {
        if (command == null) {
            return;
        }
        commands.removeElement(command);
        boolean wasSelected = (command == selection);
        if (wasSelected) {
            selection = null;
        }
        command.removeChangeListener(this.modelChangeListeners.get(command));
        this.modelChangeListeners.remove(command);
    }

    public void removeAll() {
        commands.clear();
        selection = null;
    }

    /**
     * Changes the selected status of the specified command.
     *
     * @param command    command.
     * @param isSelected Selection indication.
     */
    public void setSelected(Command command, boolean isSelected) {
        if (isSelected && command != null && command != selection) {
            Command oldSelection = selection;
            selection = command;
            if (oldSelection != null) {
                oldSelection.setToggleSelected(false);
            }
            command.setToggleSelected(true);
        }

        if (!isSelected && (command != null) && (command == selection)) {
            if (this.allowsClearingSelection) {
                selection = null;
                command.setToggleSelected(false);
            } else {
                // set the command back to selected
                command.setToggleSelected(true);
            }
        }
    }

    /**
     * Returns the selected command of this group model.
     *
     * @return The selected command of this group model. The result can be
     * <code>null</code>.
     */
    public Command getSelected() {
        return this.selection;
    }

    /**
     * Clears the selection of this command toggle group model.
     */
    public void clearSelection() {
        if (this.allowsClearingSelection && (this.selection != null)) {
            this.selection.setToggleSelected(false);
        }
    }
}
