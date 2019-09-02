/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.flamingo.api.ribbon.model;

import org.pushingpixels.flamingo.api.common.model.Command;
import org.pushingpixels.flamingo.api.common.model.CommandGroup;
import org.pushingpixels.flamingo.api.common.model.ContentModel;
import org.pushingpixels.neon.icon.ResizableIcon;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;
import java.util.List;

public class RibbonGalleryContentModel implements ContentModel {
    private List<CommandGroup> commandGroups;
    private List<CommandGroup> extraPopupCommandGroups;
    private Command selectedCommand;
    private ResizableIcon.Factory iconFactory;

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    /**
     * Listener for tracking command preview events.
     */
    public interface GalleryCommandActionPreview extends EventListener {
        /**
         * Invoked when the preview of a command in this gallery model is activated.
         *
         * @param command Command for which the preview has been activated.
         */
        void onCommandPreviewActivated(Command command);

        /**
         * Invoked when the command preview has been canceled.
         *
         * @param command Command for which the preview has been canceled.
         */
        void onCommandPreviewCanceled(Command command);
    }

    /**
     * Listener for tracking command activation events.
     */
    public interface GalleryCommandAction extends EventListener {
        /**
         * Invoked when a command in this gallery model is activated.
         *
         * @param command Command that has been activated.
         */
        void onCommandActivated(Command command);
    }

    private CommandGroup.CommandGroupListener commandGroupListener;

    public RibbonGalleryContentModel(ResizableIcon.Factory iconFactory,
            List<CommandGroup> commands) {
        this.iconFactory = iconFactory;
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

        this.extraPopupCommandGroups = new ArrayList<>();
    }

    public ResizableIcon.Factory getIconFactory() {
        return this.iconFactory;
    }

    public List<CommandGroup> getCommandGroups() {
        return Collections.unmodifiableList(this.commandGroups);
    }

    public CommandGroup getCommandGroupByTitle(String commandGroupTitle) {
        for (CommandGroup commandGroupModel : this.commandGroups) {
            if (commandGroupModel.getTitle().equals(commandGroupTitle)) {
                return commandGroupModel;
            }
        }
        return null;
    }

    public void addCommandGroup(CommandGroup commandGroupModel) {
        this.commandGroups.add(commandGroupModel);
        commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        this.fireStateChanged();
    }

    public void removeCommandGroup(CommandGroup commandGroupModel) {
        this.commandGroups.remove(commandGroupModel);
        commandGroupModel.removeCommandGroupListener(this.commandGroupListener);
        this.fireStateChanged();
    }

    public void addExtraPopupCommandGroup(CommandGroup commandGroupModel) {
        this.extraPopupCommandGroups.add(commandGroupModel);
    }

    public void removeExtraPopupCommandGroup(CommandGroup commandGroupModel) {
        this.extraPopupCommandGroups.remove(commandGroupModel);
    }

    public List<CommandGroup> getExtraPopupCommandGroups() {
        return Collections.unmodifiableList(this.extraPopupCommandGroups);
    }

    /**
     * Adds a {@link GalleryCommandActionPreview} to the model.
     *
     * @param l the listener to add
     */
    public void addCommandPreviewListener(GalleryCommandActionPreview l) {
        this.listenerList.add(GalleryCommandActionPreview.class, l);
    }

    /**
     * Removes a {@link GalleryCommandActionPreview} from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandPreviewListener(GalleryCommandActionPreview l) {
        this.listenerList.remove(GalleryCommandActionPreview.class, l);
    }

    /**
     * Adds a {@link GalleryCommandAction} to the model.
     *
     * @param l the listener to add
     */
    public void addCommandActivationListener(GalleryCommandAction l) {
        this.listenerList.add(GalleryCommandAction.class, l);
    }

    /**
     * Removes a {@link GalleryCommandAction} from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandActivationListener(GalleryCommandAction l) {
        this.listenerList.remove(GalleryCommandAction.class, l);
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
            if (listeners[i] == GalleryCommandAction.class) {
                ((GalleryCommandAction) listeners[i + 1]).onCommandActivated(command);
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
