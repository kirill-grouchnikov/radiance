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
import org.pushingpixels.flamingo.api.ribbon.*;

import javax.swing.event.*;
import java.util.*;

public class RibbonGalleryModel {
    private List<StringValuePair<List<FlamingoCommand>>> commands;
    private Map<RibbonElementPriority, Integer> preferredVisibleCommandCounts;

    /**
     * Preferred maximum number of button columns for the popup panel.
     */
    private int preferredPopupMaxCommandColumns;

    /**
     * Preferred maximum number of visible button rows for the popup panel.
     */
    private int preferredPopupMaxVisibleCommandRows;

    private CommandButtonDisplayState commandDisplayState;
    private JRibbonBand.RibbonGalleryPopupCallback popupCallback;

    private FlamingoCommand selectedCommand;

    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    public interface GalleryCommandPreviewListener extends EventListener {
        void onCommandPreviewActivated(FlamingoCommand command);

        void onCommandPreviewCanceled(FlamingoCommand command);
    }

    public interface GalleryCommandSelectionListener extends EventListener {
        void onCommandSelected(FlamingoCommand command);
    }

    public RibbonGalleryModel(List<StringValuePair<List<FlamingoCommand>>> commands,
            Map<RibbonElementPriority, Integer> preferredVisibleCommandCounts,
            int preferredPopupMaxCommandColumns, int preferredPopupMaxVisibleCommandRows,
            CommandButtonDisplayState commandDisplayState) {
        this.commands = new ArrayList<>(commands);
        this.preferredVisibleCommandCounts = preferredVisibleCommandCounts;
        this.preferredPopupMaxCommandColumns = preferredPopupMaxCommandColumns;
        this.preferredPopupMaxVisibleCommandRows = preferredPopupMaxVisibleCommandRows;
        this.commandDisplayState = commandDisplayState;
    }

    public List<StringValuePair<List<FlamingoCommand>>> getCommands() {
        return commands;
    }

    public Map<RibbonElementPriority, Integer> getPreferredVisibleCommandCounts() {
        return preferredVisibleCommandCounts;
    }

    public int getPreferredPopupMaxCommandColumns() {
        return preferredPopupMaxCommandColumns;
    }

    public int getPreferredPopupMaxVisibleCommandRows() {
        return preferredPopupMaxVisibleCommandRows;
    }

    public CommandButtonDisplayState getCommandDisplayState() {
        return commandDisplayState;
    }

    public void addRibbonGalleryCommands(String commandGroupName, FlamingoCommand... commands) {
        List<FlamingoCommand> commandList = new ArrayList<>();
        for (FlamingoCommand command : commands) {
            commandList.add(command);
        }
        this.commands.add(new StringValuePair<>(commandGroupName, commandList));
        this.fireStateChanged();
    }

    public void removeRibbonGalleryCommands(FlamingoCommand... commands) {
        for (FlamingoCommand command : commands) {
            for (StringValuePair<List<FlamingoCommand>> commandGrouping : this.commands) {
                commandGrouping.getValue().remove(command);
            }
        }
        this.fireStateChanged();
    }

    public void setRibbonGalleryCommandDisplayState(CommandButtonDisplayState displayState) {
        if (this.commandDisplayState != displayState) {
            this.commandDisplayState = displayState;
            this.fireStateChanged();
        }
    }

    // TODO: Replace callback with command list in 2.0
    public void setRibbonGalleryPopupCallback(
            JRibbonBand.RibbonGalleryPopupCallback popupCallback) {
        this.popupCallback = popupCallback;
    }

    public JRibbonBand.RibbonGalleryPopupCallback getRibbonGalleryPopupCallback() {
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
    public void addCommandSelectionListener(GalleryCommandSelectionListener l) {
        this.listenerList.add(GalleryCommandSelectionListener.class, l);
    }

    /**
     * Removes an <code>GalleryCommandSelectionListener</code> from the model.
     *
     * @param l the listener to remove
     */
    public void removeCommandSelectionListener(GalleryCommandSelectionListener l) {
        this.listenerList.remove(GalleryCommandSelectionListener.class, l);
    }

    /**
     * Adds the specified change listener to track changes to this model.
     *
     * @param l Change listener to add.
     * @see #removeChangeListener(ChangeListener)
     */
    public void addChangeListener(ChangeListener l) {
        this.listenerList.add(ChangeListener.class, l);
    }

    /**
     * Removes the specified change listener from tracking changes to this model.
     *
     * @param l Change listener to remove.
     * @see #addChangeListener(ChangeListener)
     */
    public void removeChangeListener(ChangeListener l) {
        this.listenerList.remove(ChangeListener.class, l);
    }

    public void setSelectedCommand(FlamingoCommand command) {
        if (this.selectedCommand != command) {
            this.selectedCommand = command;
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
            if (listeners[i] == GalleryCommandSelectionListener.class) {
                ((GalleryCommandSelectionListener) listeners[i + 1]).onCommandSelected(command);
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
