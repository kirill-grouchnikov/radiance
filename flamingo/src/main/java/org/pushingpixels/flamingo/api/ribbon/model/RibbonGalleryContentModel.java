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

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.CommandGroupModel;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.neon.icon.ResizableIcon;

import javax.swing.event.*;
import java.util.*;

public class RibbonGalleryContentModel {
    private List<CommandGroupModel> commandGroups;
    private List<CommandGroupModel> extraPopupCommandGroups;
    private FlamingoCommand selectedCommand;
    private ResizableIcon icon;

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    public interface GalleryCommandPreviewListener extends EventListener {
        void onCommandPreviewActivated(FlamingoCommand command);

        void onCommandPreviewCanceled(FlamingoCommand command);
    }

    public interface GalleryCommandActivationListener extends EventListener {
        void onCommandActivated(FlamingoCommand command);
    }

    // Deprecated in favor of extraPopupCommandGroups
    // TODO - remove in 2.0
    @Deprecated
    private JRibbonBand.RibbonGalleryPopupCallback popupCallback;

    private CommandGroupModel.CommandGroupListener commandGroupListener;

    public RibbonGalleryContentModel(ResizableIcon icon, List<CommandGroupModel> commands) {
        this.icon = icon;
        this.commandGroups = new ArrayList<>(commands);

        this.commandGroupListener = new CommandGroupModel.CommandGroupListener() {
            @Override
            public void onCommandAdded(FlamingoCommand command) {
                fireStateChanged();
            }

            @Override
            public void onCommandRemoved(FlamingoCommand command) {
                fireStateChanged();
            }
        };
        for (CommandGroupModel commandGroupModel : this.commandGroups) {
            commandGroupModel.addCommandGroupListener(this.commandGroupListener);
        }

        this.extraPopupCommandGroups = new ArrayList<>();
    }

    public ResizableIcon getIcon() {
        return this.icon;
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

    /**
     * @deprecated Use {@link #addExtraPopupCommandGroup(CommandGroupModel)} instead
     */
    @Deprecated
    public void setPopupCallback(JRibbonBand.RibbonGalleryPopupCallback popupCallback) {
        this.popupCallback = popupCallback;
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
     * @deprecated Use {@link #addExtraPopupCommandGroup(CommandGroupModel)}
     * and {@link #getExtraPopupCommandGroups()}
     */
    public JRibbonBand.RibbonGalleryPopupCallback getPopupCallback() {
        return this.popupCallback;
    }

    /**
     * Adds an <code>GalleryCommandPreviewListener</code> to the model.
     *
     * @param l the listener to add
     */
    public void addCommandPreviewListener(GalleryCommandPreviewListener l) {
        this.listenerList.add(GalleryCommandPreviewListener.class, l);
    }

    /**
     * Removes an <code>GalleryCommandPreviewListener</code> from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandPreviewListener(GalleryCommandPreviewListener l) {
        this.listenerList.remove(GalleryCommandPreviewListener.class, l);
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

    public void setSelectedCommand(FlamingoCommand command) {
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

    public FlamingoCommand getSelectedCommand() {
        return this.selectedCommand;
    }

    public void activatePreview(FlamingoCommand command) {
        fireCommandPreviewActivated(command);
    }

    public void cancelPreview(FlamingoCommand command) {
        fireCommandPreviewCanceled(command);
    }

    private void fireCommandPreviewActivated(FlamingoCommand command) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == GalleryCommandPreviewListener.class) {
                ((GalleryCommandPreviewListener) listeners[i + 1]).
                        onCommandPreviewActivated(command);
            }
        }
    }

    private void fireCommandPreviewCanceled(FlamingoCommand command) {
        // Guaranteed to return a non-null array
        Object[] listeners = listenerList.getListenerList();
        // Process the listeners last to first, notifying
        // those that are interested in this event
        for (int i = listeners.length - 2; i >= 0; i -= 2) {
            if (listeners[i] == GalleryCommandPreviewListener.class) {
                ((GalleryCommandPreviewListener) listeners[i + 1]).
                        onCommandPreviewCanceled(command);
            }
        }
    }

    private void fireCommandSelected(FlamingoCommand command) {
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
