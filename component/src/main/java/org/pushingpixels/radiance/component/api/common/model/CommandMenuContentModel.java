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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Content model for a command menu.
 */
public class CommandMenuContentModel implements BaseCommandMenuContentModel {
    /**
     * The panel content model.
     */
    private CommandPanelContentModel panelContentModel;
    /**
     * The command groups in this menu.
     */
    private List<CommandGroup> commandGroups;
    /**
     * The currently highlighted command.
     */
    private Command highlightedCommand;

    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    /**
     * Listener for command group events.
     */
    private CommandGroup.CommandGroupListener commandGroupListener;
    /**
     * Listener for panel content changes.
     */
    private ChangeListener panelContentChangeListener;

    /**
     * Constructs a {@code CommandMenuContentModel} with a single command group.
     *
     * @param commands The command group.
     */
    public CommandMenuContentModel(CommandGroup commands) {
        this(null, Collections.singletonList(commands));
    }

    /**
     * Constructs a {@code CommandMenuContentModel} with the given command groups.
     *
     * @param commandGroups The command groups.
     */
    public CommandMenuContentModel(CommandGroup... commandGroups) {
        this(null, Arrays.asList(commandGroups));
    }

    /**
     * Constructs a {@code CommandMenuContentModel} with the given command groups.
     *
     * @param commands The command groups.
     */
    public CommandMenuContentModel(List<CommandGroup> commands) {
        this(null, commands);
    }

    /**
     * Constructs a {@code CommandMenuContentModel}.
     *
     * @param panelContentModel The panel content model.
     * @param commands The command groups.
     */
    public CommandMenuContentModel(CommandPanelContentModel panelContentModel,
            List<CommandGroup> commands) {
        this.weakChangeSupport = new WeakChangeSupport(this);
        this.commandGroups = new ArrayList<>(commands);
        this.commandGroupListener = new CommandGroup.CommandGroupListener() {
            @Override
            public void onCommandAdded(Command command) {
                fireStateChanged();
            }

            @Override
            public void onCommandRemoved(Command command) {
                fireStateChanged();
            }

            @Override
            public void onAllCommandsRemoved(List<Command> commands) {
                fireStateChanged();
            }
        };
        for (CommandGroup commandGroupModel : this.commandGroups) {
            commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        }
        this.panelContentModel = panelContentModel;
        if (this.panelContentModel != null) {
            this.panelContentChangeListener = (ChangeEvent changeEvent) -> fireStateChanged();
            this.panelContentModel.addChangeListener(this.panelContentChangeListener);
        }
    }

    /**
     * Returns the panel content model.
     *
     * @return The panel content model.
     */
    public CommandPanelContentModel getPanelContentModel() {
        return this.panelContentModel;
    }

    /**
     * Adds a command group to this menu.
     *
     * @param commandGroupModel The command group to add.
     */
    public void addCommandGroup(CommandGroup commandGroupModel) {
        this.commandGroups.add(commandGroupModel);
        commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        this.fireStateChanged();
    }

    /**
     * Removes a command group from this menu.
     *
     * @param commandGroupModel The command group to remove.
     */
    public void removeCommandGroup(CommandGroup commandGroupModel) {
        this.commandGroups.remove(commandGroupModel);
        commandGroupModel.removeCommandGroupListener(this.commandGroupListener);
        this.fireStateChanged();
    }

    /**
     * Removes all command groups from this menu.
     */
    public void removeAllCommandGroups() {
        for (CommandGroup commandGroupModel : this.commandGroups) {
            commandGroupModel.removeCommandGroupListener(this.commandGroupListener);
        }
        this.commandGroups.clear();
        this.fireStateChanged();
    }

    /**
     * Returns the currently highlighted command.
     *
     * @return The highlighted command.
     */
    public Command getHighlightedCommand() {
        return this.highlightedCommand;
    }

    /**
     * Sets the highlighted command.
     *
     * @param highlightedCommand The highlighted command.
     */
    public void setHighlightedCommand(Command highlightedCommand) {
        this.highlightedCommand = highlightedCommand;
        this.fireStateChanged();
    }

    /**
     * Returns the command groups as an unmodifiable list.
     *
     * @return The command groups.
     */
    public List<CommandGroup> getCommandGroups() {
        return Collections.unmodifiableList(this.commandGroups);
    }

    @Override
    public boolean isEmpty() {
        boolean isPanelContentModelEmpty = (this.panelContentModel == null)
            || (this.panelContentModel.getCommandCount() == 0);
        int regularCommandCount = 0;
        for (CommandGroup group : this.getCommandGroups()) {
            regularCommandCount += group.getCommands().size();
        }
        return isPanelContentModelEmpty && (regularCommandCount == 0);
    }

    /**
     * Adds a change listener.
     *
     * @param l The listener.
     */
    @Override
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
