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
package org.pushingpixels.flamingo.api.ribbon.model;

import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.neon.icon.ResizableIconFactory;

import javax.swing.event.*;
import java.util.*;

public class RibbonGalleryContentModel implements ContentModel {
    private List<CommandGroupModel> commandGroups;
    private List<CommandGroupModel> extraPopupCommandGroups;
    private Command selectedCommand;
    private ResizableIconFactory iconFactory;

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    public interface GalleryCommandActionPreview extends EventListener {
        void onCommandPreviewActivated(Command command);

        void onCommandPreviewCanceled(Command command);
    }

    public interface GalleryCommandActivationListener extends EventListener {
        void onCommandActivated(Command command);
    }

    private CommandGroupModel.CommandGroupListener commandGroupListener;

    public RibbonGalleryContentModel(ResizableIconFactory iconFactory,
            List<CommandGroupModel> commands) {
        this.iconFactory = iconFactory;
        this.commandGroups = new ArrayList<>(commands);

        this.commandGroupListener = new CommandGroupModel.CommandGroupListener() {
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
        for (CommandGroupModel commandGroupModel : this.commandGroups) {
            commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        }

        this.extraPopupCommandGroups = new ArrayList<>();
    }

    public ResizableIconFactory getIconFactory() {
        return this.iconFactory;
    }

    public List<CommandGroupModel> getCommandGroups() {
        return Collections.unmodifiableList(this.commandGroups);
    }

    public CommandGroupModel getCommandGroupByTitle(String commandGroupTitle) {
        for (CommandGroupModel commandGroupModel : this.commandGroups) {
            if (commandGroupModel.getTitle().equals(commandGroupTitle)) {
                return commandGroupModel;
            }
        }
        return null;
    }

    public void addCommandGroup(CommandGroupModel commandGroupModel) {
        this.commandGroups.add(commandGroupModel);
        commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        this.fireStateChanged();
    }

    public void removeCommandGroup(CommandGroupModel commandGroupModel) {
        this.commandGroups.remove(commandGroupModel);
        commandGroupModel.removeCommandGroupListener(this.commandGroupListener);
        this.fireStateChanged();
    }

    public void addExtraPopupCommandGroup(CommandGroupModel commandGroupModel) {
        this.extraPopupCommandGroups.add(commandGroupModel);
    }

    public void removeExtraPopupCommandGroup(CommandGroupModel commandGroupModel) {
        this.extraPopupCommandGroups.remove(commandGroupModel);
    }

    public List<CommandGroupModel> getExtraPopupCommandGroups() {
        return Collections.unmodifiableList(this.extraPopupCommandGroups);
    }

    /**
     * Adds an <code>GalleryCommandPreviewListener</code> to the model.
     *
     * @param l the listener to add
     */
    public void addCommandPreviewListener(GalleryCommandActionPreview l) {
        this.listenerList.add(GalleryCommandActionPreview.class, l);
    }

    /**
     * Removes an <code>GalleryCommandPreviewListener</code> from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandPreviewListener(GalleryCommandActionPreview l) {
        this.listenerList.remove(GalleryCommandActionPreview.class, l);
    }

    /**
     * Adds an <code>GalleryCommandSelectionListener</code> to the model.
     *
     * @param l the listener to add
     */
    public void addCommandActivationListener(GalleryCommandActivationListener l) {
        this.listenerList.add(GalleryCommandActivationListener.class, l);
    }

    /**
     * Removes an <code>GalleryCommandSelectionListener</code> from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandSelectionListener(GalleryCommandActivationListener l) {
        this.listenerList.remove(GalleryCommandActivationListener.class, l);
    }

    /**
     * Adds the specified change listener to track changes to the model.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to the model.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    public void setSelectedCommand(Command command) {
        if (this.selectedCommand != command) {
            if (this.selectedCommand != null) {
                this.selectedCommand.setToggleSelected(false);
            }
            this.selectedCommand = command;
            if (this.selectedCommand != null) {
                this.selectedCommand.setToggleSelected(true);
            }
            fireCommandSelected(this.selectedCommand);
        }
    }

    public Command getSelectedCommand() {
        return this.selectedCommand;
    }

    public void activatePreview(Command command) {
        fireCommandPreviewActivated(command);
    }

    public void cancelPreview(Command command) {
        fireCommandPreviewCanceled(command);
    }

    private void fireCommandPreviewActivated(Command command) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == GalleryCommandActionPreview.class) {
                ((GalleryCommandActionPreview) listeners[i + 1]).
                        onCommandPreviewActivated(command);
            }
        }
    }

    private void fireCommandPreviewCanceled(Command command) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == GalleryCommandActionPreview.class) {
                ((GalleryCommandActionPreview) listeners[i + 1]).
                        onCommandPreviewCanceled(command);
            }
        }
    }

    private void fireCommandSelected(Command command) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == GalleryCommandActivationListener.class) {
                ((GalleryCommandActivationListener) listeners[i + 1]).onCommandActivated(command);
            }
        }
    }

    /**
     * Notifies all registered listeners that the state of this model has changed.
     */
    private void fireStateChanged() {
        // Guaranteed to return a non-null array
        Object[] listeners = this.listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        ChangeEvent event = new ChangeEvent(this);
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == ChangeListener.class) {
                ((ChangeListener) listeners[i + 1]).stateChanged(event);
            }
        }
    }
}
