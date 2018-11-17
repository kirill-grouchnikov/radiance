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
package org.pushingpixels.flamingo.api.common.model;

import org.pushingpixels.flamingo.api.common.FlamingoCommand;

import javax.swing.event.EventListenerList;
import java.util.*;

public class CommandGroupModel {
    private String title;
    private List<FlamingoCommand> commandList;

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    public interface CommandGroupListener extends EventListener {
        void onCommandAdded(FlamingoCommand command);

        void onCommandRemoved(FlamingoCommand command);
    }

    public CommandGroupModel(FlamingoCommand... commands) {
        this(null, commands);
    }

    public CommandGroupModel(List<FlamingoCommand> commands) {
        this(null, commands);
    }

    public CommandGroupModel(String title, FlamingoCommand... commands) {
        this(title, Arrays.asList(commands));
    }

    public CommandGroupModel(String title, List<FlamingoCommand> commands) {
        this.title = title;
        this.commandList = new ArrayList<>(commands);
    }

    public String getTitle() {
        return this.title;
    }

    public List<FlamingoCommand> getCommandList() {
        return Collections.unmodifiableList(this.commandList);
    }

    public void addCommand(FlamingoCommand command) {
        if ((command != null) && !this.commandList.contains(command)) {
            this.commandList.add(command);
            this.fireCommandAdded(command);
        }
    }

    public void removeCommand(FlamingoCommand command) {
        if (this.commandList.remove(command)) {
            this.fireCommandRemoved(command);
        }
    }

    /**
     * Adds an <code>CommandGroupListener</code> to the model.
     *
     * @param l the listener to add
     */
    public void addCommandGroupListener(CommandGroupListener l) {
        this.listenerList.add(CommandGroupListener.class, l);
    }

    /**
     * Removes an <code>CommandGroupListener</code> from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandGroupListener(CommandGroupListener l) {
        this.listenerList.remove(CommandGroupListener.class, l);
    }

    private void fireCommandAdded(FlamingoCommand command) {
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

    private void fireCommandRemoved(FlamingoCommand command) {
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
}
