/*
 * Copyright (c) 2005-2023 Radiance Kirill Grouchnikov. All Rights Reserved.
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

import javax.swing.event.ChangeListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandPanelContentModel implements ContentModel, ChangeAware {
    private List<CommandGroup> commandGroups;

    /**
     * Indicates the selection mode for the toggle commands in the panel.
     */
    private boolean isSingleSelectionMode;

    private Command.CommandActionPreview commandPreviewListener;

    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    private CommandGroup.CommandGroupListener commandGroupListener;
    private PropertyChangeListener commandGroupPropertyChangeListener;
    private PropertyChangeListener commandPropertyChangeListener;

    private Command selectedCommand;

    public CommandPanelContentModel(List<CommandGroup> commands) {
        this.weakChangeSupport = new WeakChangeSupport(this);
        this.commandGroups = new ArrayList<>(commands);

        this.commandPropertyChangeListener = evt -> {
            if (evt.getPropertyName().equals("isToggleSelected")) {
                syncSelectedCommand();
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

    public List<CommandGroup> getCommandGroups() {
        return Collections.unmodifiableList(this.commandGroups);
    }

    public int getCommandCount() {
        int result = 0;
        for (CommandGroup commandGroupModel : this.getCommandGroups()) {
            result += commandGroupModel.getCommands().size();
        }
        return result;
    }

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

    public Command getSelectedCommand() {
        return this.selectedCommand;
    }

    public boolean isSingleSelectionMode() {
        return this.isSingleSelectionMode;
    }

    public void setCommandPreviewListener(Command.CommandActionPreview commandPreviewListener) {
        this.commandPreviewListener = commandPreviewListener;
    }

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

    public void addChangeListener(ChangeListener l) {
        this.weakChangeSupport.addChangeListener(l);
    }

    @Override
    public void removeChangeListener(ChangeListener l) {
        this.weakChangeSupport.removeChangeListener(l);
    }

    private void fireStateChanged() {
        this.weakChangeSupport.fireStateChanged();
    }
}
