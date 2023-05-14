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
package org.pushingpixels.radiance.component.api.ribbon.model;

import org.pushingpixels.radiance.common.api.icon.RadianceIcon;
import org.pushingpixels.radiance.component.api.common.model.*;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;

import javax.swing.event.ChangeListener;
import javax.swing.event.EventListenerList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;
import java.util.List;

public class RibbonGalleryContentModel implements ContentModel, ChangeAware {
    private List<CommandGroup> commandGroups;
    private List<CommandGroup> extraPopupCommandGroups;
    private Command selectedCommand;
    private RadianceIcon.Factory iconFactory;

    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;
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
        void onCommandPreviewActivated(BaseCommand command);

        /**
         * Invoked when the command preview has been canceled.
         *
         * @param command Command for which the preview has been canceled.
         */
        void onCommandPreviewCanceled(BaseCommand command);
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
        void onCommandActivated(BaseCommand command);
    }

    private CommandGroup.CommandGroupListener commandGroupListener;

    public RibbonGalleryContentModel(RadianceIcon.Factory iconFactory,
            List<CommandGroup> commands) {
        this.weakChangeSupport = new WeakChangeSupport(this);
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
            public void onAllCommandsRemoved(List<Command> commands) {
                fireStateChanged();
            }
        };
        for (CommandGroup commandGroupModel : this.commandGroups) {
            commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        }

        this.extraPopupCommandGroups = new ArrayList<>();
    }

    public RadianceIcon.Factory getIconFactory() {
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

    @Override
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

    public void activatePreview(BaseCommand<?> command) {
        fireCommandPreviewActivated(command);
    }

    public void cancelPreview(BaseCommand<?> command) {
        fireCommandPreviewCanceled(command);
    }

    private void fireCommandPreviewActivated(BaseCommand<?> command) {
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

    private void fireCommandPreviewCanceled(BaseCommand<?> command) {
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

    private void fireCommandSelected(BaseCommand<?> command) {
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
}
