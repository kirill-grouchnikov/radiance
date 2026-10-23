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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Content model for a command panel.
 */
public class CommandPanelContentModel implements ContentModel, ChangeAware {
    /**
     * The command groups in this panel.
     */
    private List<CommandGroup> commandGroups;

    /**
     * Indicates the selection mode for the toggle commands in the panel.
     */
    private boolean isSingleSelectionMode;

    /**
     * Listener for command preview events.
     */
    private Command.CommandActionPreview commandPreviewListener;

    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    /**
     * Listener for command group events.
     */
    private CommandGroup.CommandGroupListener commandGroupListener;
    /**
     * Listener for command group property changes.
     */
    private PropertyChangeListener commandGroupPropertyChangeListener;
    /**
     * Listener for command property changes.
     */
    private PropertyChangeListener commandPropertyChangeListener;

    /**
     * The currently selected command.
     */
    private Command selectedCommand;

    /**
     * Constructs a {@code CommandPanelContentModel} with the given command groups.
     *
     * @param commands The command groups.
     */
    public CommandPanelContentModel(List<CommandGroup> commands) {
        this.weakChangeSupport = new WeakChangeSupport(this);
        this.commandGroups = new ArrayList<>(commands);

        this.commandPropertyChangeListener = evt -> {
            if (evt.getPropertyName().equals("isToggleSelected")) {
                SwingUtilities.invokeLater(this::syncSelectedCommand);
            }
        };

        this.commandGroupListener = new CommandGroup.CommandGroupListener() {
            @Override
            public void onCommandAdded(Command command) {
                command.addPropertyChangeListener(commandPropertyChangeListener);
                fireStateChanged();
            }

            @Override
            public void onCommandRemoved(Command command) {
                command.removePropertyChangeListener(commandPropertyChangeListener);
                fireStateChanged();
            }

            @Override
            public void onAllCommandsRemoved(List<Command> commands) {
                for (Command command: commands) {
                    command.removePropertyChangeListener(commandPropertyChangeListener);
                }
                fireStateChanged();
            }
        };
        this.commandGroupPropertyChangeListener = propertyChangeEvent -> fireStateChanged();
        for (CommandGroup commandGroupModel : this.commandGroups) {
            commandGroupModel.addCommandGroupListener(this.commandGroupListener);
            commandGroupModel.addPropertyChangeListener(this.commandGroupPropertyChangeListener);
            for (Command command: commandGroupModel.getCommands()) {
                command.addPropertyChangeListener(commandPropertyChangeListener);
            }
        }
    }

    /**
     * Adds a command group to this panel.
     *
     * @param commandGroupModel The command group to add.
     */
    public void addCommandGroup(CommandGroup commandGroupModel) {
        this.commandGroups.add(commandGroupModel);
        commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        commandGroupModel.addPropertyChangeListener(this.commandGroupPropertyChangeListener);
        for (Command command: commandGroupModel.getCommands()) {
            command.addPropertyChangeListener(commandPropertyChangeListener);
        }
        boolean firedStateChange = this.syncSelectedCommand();
        if (!firedStateChange) {
            this.fireStateChanged();
        }
    }

    /**
     * Removes a command group from this panel.
     *
     * @param commandGroupModel The command group to remove.
     */
    public void removeCommandGroup(CommandGroup commandGroupModel) {
        this.commandGroups.remove(commandGroupModel);
        commandGroupModel.removeCommandGroupListener(this.commandGroupListener);
        commandGroupModel.removePropertyChangeListener(this.commandGroupPropertyChangeListener);
        for (Command command: commandGroupModel.getCommands()) {
            command.removePropertyChangeListener(commandPropertyChangeListener);
        }
        boolean firedStateChange = this.syncSelectedCommand();
        if (!firedStateChange) {
            this.fireStateChanged();
        }
    }

    /**
     * Removes all command groups from this panel.
     */
    public void removeAllCommandGroups() {
        for (CommandGroup commandGroupModel : this.commandGroups) {
            commandGroupModel.removeCommandGroupListener(this.commandGroupListener);
            commandGroupModel.removePropertyChangeListener(this.commandGroupPropertyChangeListener);
            for (Command command: commandGroupModel.getCommands()) {
                command.removePropertyChangeListener(commandPropertyChangeListener);
            }
        }
        this.commandGroups.clear();
        boolean firedStateChange = this.syncSelectedCommand();
        if (!firedStateChange) {
            this.fireStateChanged();
        }
    }

    /**
     * Returns the command groups as an unmodifiable list.
     *
     * @return The command groups.
     */
    public List<CommandGroup> getCommandGroups() {
        return Collections.unmodifiableList(this.commandGroups);
    }

    /**
     * Returns the total number of commands across all groups.
     *
     * @return The command count.
     */
    public int getCommandCount() {
        int result = 0;
        for (CommandGroup commandGroupModel : this.getCommandGroups()) {
            result += commandGroupModel.getCommands().size();
        }
        return result;
    }

    /**
     * Finds the first command matching the given filter across all groups.
     *
     * @param commandFilter The filter.
     * @return The first matching command, or {@code null}.
     */
    public Command findFirstMatch(CommandGroup.CommandFilter commandFilter) {
        for (CommandGroup commandGroup : this.commandGroups) {
            Command result = commandGroup.findFirstMatch(commandFilter);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    /**
     * Sets the selection mode for this model. If <code>true</code> is passed as
     * the parameter, all toggle commands in this model are set to
     * belong to the same toggle group.
     *
     * @param isSingleSelectionMode If <code>true</code>, all toggle commands in this
     *                              model are set to belong to the same toggle group.
     */
    public void setSingleSelectionMode(boolean isSingleSelectionMode) {
        if (this.isSingleSelectionMode == isSingleSelectionMode) {
            return;
        }

        this.isSingleSelectionMode = isSingleSelectionMode;
        this.syncSelectedCommand();
        this.fireStateChanged();
    }

    /**
     * Returns the currently selected command.
     *
     * @return The selected command.
     */
    public Command getSelectedCommand() {
        return this.selectedCommand;
    }

    /**
     * Returns whether single selection mode is enabled.
     *
     * @return {@code true} if single selection mode is enabled.
     */
    public boolean isSingleSelectionMode() {
        return this.isSingleSelectionMode;
    }

    /**
     * Sets the command preview listener.
     *
     * @param commandPreviewListener The listener.
     */
    public void setCommandPreviewListener(Command.CommandActionPreview commandPreviewListener) {
        this.commandPreviewListener = commandPreviewListener;
    }

    /**
     * Returns the command preview listener.
     *
     * @return The listener.
     */
    public Command.CommandActionPreview getCommandPreviewListener() {
        return this.commandPreviewListener;
    }

    private boolean syncSelectedCommand() {
        Command previouslySelectedCommand = this.selectedCommand;
        if (!this.isSingleSelectionMode) {
            this.selectedCommand = null;
            if (previouslySelectedCommand != null) {
                this.fireStateChanged();
                return true;
            }
            return false;
        }

        for (CommandGroup commandGroup: this.commandGroups) {
            for (Command command: commandGroup.getCommands()) {
                if (command.isToggleSelected()) {
                    this.selectedCommand = command;
                    if (previouslySelectedCommand != this.selectedCommand) {
                        this.fireStateChanged();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Adds a change listener.
     *
     * @param l The listener.
     */
    public void addChangeListener(ChangeListener l) {
        this.weakChangeSupport.addChangeListener(l);
    }

    /**
     * Removes a change listener.
     *
     * @param l The listener.
     */
    @Override
    public void removeChangeListener(ChangeListener l) {
        this.weakChangeSupport.removeChangeListener(l);
    }

    /**
     * Fires a state changed event to all registered listeners.
     */
    private void fireStateChanged() {
        this.weakChangeSupport.fireStateChanged();
    }
}
