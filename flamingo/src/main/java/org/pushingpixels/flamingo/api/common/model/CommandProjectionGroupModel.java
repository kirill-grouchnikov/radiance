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

import org.pushingpixels.flamingo.api.common.projection.CommandProjection;

import javax.swing.event.EventListenerList;
import java.util.*;

public class CommandProjectionGroupModel implements ContentModel {
    private String title;
    private List<CommandProjection> commandProjections;

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    public interface CommandProjectionGroupListener extends EventListener {
        void onCommandProjectionAdded(CommandProjection commandProjection);

        void onCommandProjectionRemoved(CommandProjection commandProjection);

        void onAllCommandProjectionsRemoved();
    }

    public CommandProjectionGroupModel(CommandProjection... commandProjections) {
        this(null, commandProjections);
    }

    public CommandProjectionGroupModel(List<CommandProjection> commandProjections) {
        this(null, commandProjections);
    }

    public CommandProjectionGroupModel(String title, CommandProjection... commandProjections) {
        this(title, Arrays.asList(commandProjections));
    }

    public CommandProjectionGroupModel(String title, List<CommandProjection> commandProjections) {
        this.title = title;
        this.commandProjections = new ArrayList<>(commandProjections);
    }

    public String getTitle() {
        return this.title;
    }

    public List<CommandProjection> getCommandProjections() {
        return Collections.unmodifiableList(this.commandProjections);
    }

    public void addCommandProjection(CommandProjection command) {
        if ((command != null) && !this.commandProjections.contains(command)) {
            this.commandProjections.add(command);
            this.fireCommandProjectionAdded(command);
        }
    }

    public void removeCommandProjection(CommandProjection command) {
        if (this.commandProjections.remove(command)) {
            this.fireCommandProjectionRemoved(command);
        }
    }

    public void removeAllCommandProjections() {
        this.fireAllCommandProjectionsRemoved();
    }

    /**
     * Adds an <code>CommandProjectionGroupListener</code> to the model.
     *
     * @param l the listener to add
     */
    public void addCommandGroupListener(CommandProjectionGroupListener l) {
        this.listenerList.add(CommandProjectionGroupListener.class, l);
    }

    /**
     * Removes an <code>CommandProjectionGroupListener</code> from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandGroupListener(CommandProjectionGroupListener l) {
        this.listenerList.remove(CommandProjectionGroupListener.class, l);
    }

    private void fireCommandProjectionAdded(CommandProjection projection) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CommandProjectionGroupListener.class) {
                ((CommandProjectionGroupListener) listeners[i + 1]).
                        onCommandProjectionAdded(projection);
            }
        }
    }

    private void fireCommandProjectionRemoved(CommandProjection projection) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CommandProjectionGroupListener.class) {
                ((CommandProjectionGroupListener) listeners[i + 1]).
                        onCommandProjectionRemoved(projection);
            }
        }
    }

    private void fireAllCommandProjectionsRemoved() {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == CommandProjectionGroupListener.class) {
                ((CommandProjectionGroupListener) listeners[i + 1]).
                        onAllCommandProjectionsRemoved();
            }
        }
    }
}
