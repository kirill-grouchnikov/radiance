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
package org.pushingpixels.flamingo.api.common.popup.model;

import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.projection.CommandProjection;

import javax.swing.event.*;

public class CommandPopupMenuPresentationModel implements MutablePresentationModel {
    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    private CommandPanelPresentationModel panelPresentationModel;

    /**
     * Maximum number of menu items visible in this model. If more commands are
     * added with the
     * {@link CommandProjectionGroupModel#addCommandProjection(CommandProjection)}
     * on one or more of the command groups in {@link CommandPopupMenuContentModel}, the menu
     * part will show scroller buttons above the first and below the last menu command. If
     * the value is negative, there is no limitation on how many menu commands
     * are shown, and the entire
     * {@link org.pushingpixels.flamingo.api.common.popup.JCommandPopupMenu} can overflow the
     * monitor edges.
     */
    private int maxVisibleMenuCommands;
    private boolean toDismissOnCommandActivation;
    private CommandPresentation.CommandButtonPopupOrientationKind popupOrientationKind;
    private Command highlightedCommand;

    private CommandPopupMenuPresentationModel() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommandPanelPresentationModel getPanelPresentationModel() {
        return this.panelPresentationModel;
    }

    public int getMaxVisibleMenuCommands() {
        return this.maxVisibleMenuCommands;
    }

    public void setMaxVisibleMenuCommands(int maxVisibleMenuCommands) {
        if (this.maxVisibleMenuCommands != maxVisibleMenuCommands) {
            this.maxVisibleMenuCommands = maxVisibleMenuCommands;
            this.fireStateChanged();
        }
    }

    public boolean isToDismissOnCommandActivation() {
        return this.toDismissOnCommandActivation;
    }

    public void setToDismissOnCommandActivation(boolean toDismissOnCommandActivation) {
        if (this.toDismissOnCommandActivation != toDismissOnCommandActivation) {
            this.toDismissOnCommandActivation = toDismissOnCommandActivation;
            this.fireStateChanged();
        }
    }

    public CommandPresentation.CommandButtonPopupOrientationKind getPopupOrientationKind() {
        return this.popupOrientationKind;
    }

    public Command getHighlightedCommand() {
        return this.highlightedCommand;
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

    public static class Builder {
        private CommandPanelPresentationModel panelPresentationModel;
        private int maxVisibleMenuCommands = -1;
        private boolean toDismissOnCommandActivation = true;
        private CommandPresentation.CommandButtonPopupOrientationKind popupOrientationKind =
                CommandPresentation.CommandButtonPopupOrientationKind.DOWNWARD;
        private Command highlightedCommand;

        public Builder setPanelPresentationModel(
                CommandPanelPresentationModel panelPresentationModel) {
            this.panelPresentationModel = panelPresentationModel;
            return this;
        }

        public Builder setMaxVisibleMenuCommands(int maxVisibleMenuCommands) {
            this.maxVisibleMenuCommands = maxVisibleMenuCommands;
            return this;
        }

        public Builder setToDismissOnCommandActivation(boolean toDismissOnCommandActivation) {
            this.toDismissOnCommandActivation = toDismissOnCommandActivation;
            return this;
        }

        public Builder setPopupOrientationKind(
                CommandPresentation.CommandButtonPopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return this;
        }

        public Builder setHighlightedCommand(Command highlightedCommand) {
            this.highlightedCommand = highlightedCommand;
            return this;
        }

        public CommandPopupMenuPresentationModel build() {
            CommandPopupMenuPresentationModel presentationModel =
                    new CommandPopupMenuPresentationModel();
            presentationModel.panelPresentationModel = this.panelPresentationModel;
            presentationModel.maxVisibleMenuCommands = this.maxVisibleMenuCommands;
            presentationModel.toDismissOnCommandActivation = this.toDismissOnCommandActivation;
            presentationModel.popupOrientationKind = this.popupOrientationKind;
            presentationModel.highlightedCommand = this.highlightedCommand;
            return presentationModel;
        }
    }
}
