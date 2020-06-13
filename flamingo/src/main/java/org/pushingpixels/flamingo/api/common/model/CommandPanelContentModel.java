/*
 * Copyright (c) 2005-2020 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.common.model;

import org.pushingpixels.flamingo.internal.utils.WeakChangeSupport;

import javax.swing.event.ChangeListener;
import java.beans.PropertyChangeEvent;
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

    public CommandPanelContentModel(List<CommandGroup> commands) {
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
            public void onAllCommandsRemoved() {
                fireStateChanged();
            }
        };
        for (CommandGroup commandGroupModel : this.commandGroups) {
            commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        }
        this.commandGroupPropertyChangeListener = (PropertyChangeEvent evt) -> fireStateChanged();
        for (CommandGroup commandGroupModel : this.commandGroups) {
            commandGroupModel.addPropertyChangeListener(this.commandGroupPropertyChangeListener);
        }
    }

    public void addCommandGroup(CommandGroup commandGroupModel) {
        this.commandGroups.add(commandGroupModel);
        commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        commandGroupModel.addPropertyChangeListener(this.commandGroupPropertyChangeListener);
        this.fireStateChanged();
    }

    public void removeCommandGroup(CommandGroup commandGroupModel) {
        this.commandGroups.remove(commandGroupModel);
        commandGroupModel.removeCommandGroupListener(this.commandGroupListener);
        commandGroupModel.removePropertyChangeListener(this.commandGroupPropertyChangeListener);
        this.fireStateChanged();
    }

    public void removeAllCommandGroups() {
        for (CommandGroup commandGroupModel : this.commandGroups) {
            commandGroupModel.removeCommandGroupListener(this.commandGroupListener);
            commandGroupModel.removePropertyChangeListener(this.commandGroupPropertyChangeListener);
        }
        this.commandGroups.clear();
        this.fireStateChanged();
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
    /**
     * Sets the selection mode for the panel. If <code>true</code> is passed as
     * the parameter, all toggle commands in the panel are set to
     * belong to the same toggle group.
     *
     * @param isSingleSelectionMode If <code>true</code>, all toggle commands in this
     *                              panel are set to belong to the same toggle group.
     */
    public void setSingleSelectionMode(boolean isSingleSelectionMode) {
        if (this.isSingleSelectionMode == isSingleSelectionMode) {
            return;
        }

        this.isSingleSelectionMode = isSingleSelectionMode;
        this.fireStateChanged();
    }

    public boolean isSingleSelectionMode() {
        return this.isSingleSelectionMode;
    }

    public void setCommandPreviewListener(
            Command.CommandActionPreview commandPreviewListener) {
        this.commandPreviewListener = commandPreviewListener;
    }

    public Command.CommandActionPreview getCommandPreviewListener() {
        return this.commandPreviewListener;
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