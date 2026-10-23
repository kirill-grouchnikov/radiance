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

import org.pushingpixels.radiance.component.internal.utils.WeakPropertyChangeSupport;

import javax.swing.event.EventListenerList;
import java.beans.PropertyChangeListener;
import java.util.*;

/**
 * A group of commands that can be managed together.
 */
public class CommandGroup implements ContentModel, PropertyChangeAware {
    /**
     * Title of the group.
     */
    private String title;
    /**
     * List of commands in this group.
     */
    private List<Command> commands;

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();
    /**
     * Property change support.
     */
    private final WeakPropertyChangeSupport weakPropertyChangeSupport;

    /**
     * Listener for command group events.
     */
    public interface CommandGroupListener extends EventListener {
        /**
         * Invoked when a command is added.
         *
         * @param command The added command.
         */
        void onCommandAdded(Command command);

        /**
         * Invoked when a command is removed.
         *
         * @param command The removed command.
         */
        void onCommandRemoved(Command command);

        /**
         * Invoked when all commands are removed.
         *
         * @param commands The removed commands.
         */
        void onAllCommandsRemoved(List<Command> commands);
    }

    /**
     * Filter for matching commands.
     */
    public interface CommandFilter {
        /**
         * Returns whether the given command matches this filter.
         *
         * @param command The command to check.
         * @return {@code true} if the command matches.
         */
        boolean matches(Command command);
    }

    /**
     * Constructs a {@code CommandGroup} with the given commands.
     *
     * @param commands The commands.
     */
    public CommandGroup(Command... commands) {
        this(null, commands);
    }

    /**
     * Constructs a {@code CommandGroup} with the given commands.
     *
     * @param commands The commands.
     */
    public CommandGroup(List<Command> commands) {
        this(null, commands);
    }

    /**
     * Constructs a {@code CommandGroup} with the given title and commands.
     *
     * @param title The title.
     * @param commands The commands.
     */
    public CommandGroup(String title, Command... commands) {
        this(title, Arrays.asList(commands));
    }

    /**
     * Constructs a {@code CommandGroup} with the given title and commands.
     *
     * @param title The title.
     * @param commands The commands.
     */
    public CommandGroup(String title, List<Command> commands) {
        this.weakPropertyChangeSupport = new WeakPropertyChangeSupport(this);
        this.title = title;
        this.commands = new ArrayList<>(commands);
    }

    /**
     * Returns the group title.
     *
     * @return The title.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the group title.
     *
     * @param title The title.
     */
    public void setTitle(String title) {
        if (!this.title.equals(title)) {
            String old = this.title;
            this.title = title;
            this.weakPropertyChangeSupport.firePropertyChange("title", old, this.title);
        }
    }

    /**
     * Returns the commands as an unmodifiable list.
     *
     * @return The commands.
     */
    public List<Command> getCommands() {
        return Collections.unmodifiableList(this.commands);
    }

    /**
     * Finds the first command matching the given filter.
     *
     * @param filter The filter.
     * @return The first matching command, or {@code null}.
     */
    public Command findFirstMatch(CommandFilter filter) {
        for (Command command: this.commands) {
            if (filter.matches(command)) {
                return command;
            }
        }
        return null;
    }

    /**
     * Adds a command to this group.
     *
     * @param command The command to add.
     */
    public void addCommand(Command command) {
        if ((command != null) && !this.commands.contains(command)) {
            this.commands.add(command);
            this.fireCommandAdded(command);
        }
    }

    /**
     * Removes a command from this group.
     *
     * @param command The command to remove.
     */
    public void removeCommand(Command command) {
        if (this.commands.remove(command)) {
            this.fireCommandRemoved(command);
        }
    }

    /**
     * Removes all commands from this group.
     */
    public void removeAllCommands() {
        List<Command> removed = new ArrayList<>(this.commands);
        this.commands.clear();

        this.fireAllCommandsRemoved(removed);
    }

    /**
     * Adds a <code>CommandGroupListener</code> to the model.
     *
     * @param l the listener to add
     */
    public void addCommandGroupListener(CommandGroupListener l) {
        this.listenerList.add(CommandGroupListener.class, l);
    }

    /**
     * Removes a <code>CommandGroupListener</code> from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandGroupListener(CommandGroupListener l) {
        this.listenerList.remove(CommandGroupListener.class, l);
    }

    private void fireCommandAdded(Command command) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CommandGroupListener.class) {
                ((CommandGroupListener) listeners[i + 1]).onCommandAdded(command);
            }
        }
    }

    private void fireCommandRemoved(Command command) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CommandGroupListener.class) {
                ((CommandGroupListener) listeners[i + 1]).onCommandRemoved(command);
            }
        }
    }

    private void fireAllCommandsRemoved(List<Command> commands) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CommandGroupListener.class) {
                ((CommandGroupListener) listeners[i + 1]).onAllCommandsRemoved(commands);
            }
        }
    }

    /**
     * Adds a property change listener.
     *
     * @param l The listener.
     */
    public void addPropertyChangeListener(PropertyChangeListener l) {
        this.weakPropertyChangeSupport.addPropertyChangeListener(l);
    }

    /**
     * Removes a property change listener.
     *
     * @param l The listener.
     */
    public void removePropertyChangeListener(PropertyChangeListener l) {
        this.weakPropertyChangeSupport.removePropertyChangeListener(l);
    }
}
