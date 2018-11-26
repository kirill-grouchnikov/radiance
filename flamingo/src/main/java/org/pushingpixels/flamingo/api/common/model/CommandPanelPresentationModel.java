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

import org.pushingpixels.flamingo.api.common.*;

import javax.swing.event.*;

public class CommandPanelPresentationModel {
    /**
     * Stores the listeners on this model.
     */
    private EventListenerList listenerList = new EventListenerList();

    /**
     * Maximum number of columns for the panel. Relevant only when the layout
     * kind is {@link LayoutKind#ROW_FILL}.
     */
    private int maxColumns = -1;

    /**
     * Maximum number of rows for the panel. Relevant only when the layout kind
     * is {@link LayoutKind#COLUMN_FILL}.
     */
    private int maxRows = -1;

    /**
     * If <code>true</code>, the panel will show group labels.
     */
    private boolean toShowGroupLabels = true;

    /**
     * Layout kind of the panel.
     */
    private LayoutKind layoutKind = LayoutKind.ROW_FILL;

    private CommandButtonDisplayState commandDisplayState;

    private Integer commandIconDimension;

    private int commandHorizontalAlignment;
    private boolean isMenu;
    private JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind;

    /**
     * Enumerates the available layout kinds.
     *
     * @author Kirill Grouchnikov
     */
    public enum LayoutKind {
        /**
         * The buttons are laid out in rows respecting the available width.
         */
        ROW_FILL,

        /**
         * The buttons are laid out in columns respecting the available height.
         */
        COLUMN_FILL
    }

    private CommandPanelPresentationModel() {
    }

    public static CommandPanelPresentationModelBuilder builder() {
        return new CommandPanelPresentationModelBuilder();
    }

    public CommandButtonDisplayState getCommandDisplayState() {
        return commandDisplayState;
    }

    public void setCommandDisplayState(CommandButtonDisplayState commandDisplayState) {
        if (this.commandDisplayState != commandDisplayState) {
            this.commandDisplayState = commandDisplayState;
            if (this.commandDisplayState != CommandButtonDisplayState.FIT_TO_ICON) {
                this.commandIconDimension = -1;
            }
            this.fireStateChanged();
        }
    }

    public Integer getCommandIconDimension() {
        return commandIconDimension;
    }

    public void setCommandIconDimension(Integer commandIconDimension) {
        if (this.commandIconDimension != commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            if (this.commandIconDimension != -1) {
                this.commandDisplayState = CommandButtonDisplayState.FIT_TO_ICON;
            }
            this.fireStateChanged();
        }
    }

    public int getMaxColumns() {
        return this.maxColumns;
    }

    public void setMaxColumns(int maxColumns) {
        if (this.maxColumns != maxColumns) {
            this.maxColumns = maxColumns;
            this.fireStateChanged();
        }
    }

    public int getMaxRows() {
        return this.maxRows;
    }

    public void setMaxRows(int maxRows) {
        if (this.maxRows != maxRows) {
            this.maxRows = maxRows;
            this.fireStateChanged();
        }
    }

    public LayoutKind getLayoutKind() {
        return this.layoutKind;
    }

    public void setLayoutKind(LayoutKind layoutKind) {
        if (layoutKind == null) {
            throw new IllegalArgumentException("Layout kind cannot be null");
        }
        if ((layoutKind == LayoutKind.COLUMN_FILL)
                && this.isToShowGroupLabels()) {
            throw new IllegalArgumentException(
                    "Column fill layout is not supported when group labels are shown");
        }
        if (this.layoutKind != layoutKind) {
            this.layoutKind = layoutKind;
            this.fireStateChanged();
        }
    }

    public boolean isToShowGroupLabels() {
        return this.toShowGroupLabels;
    }

    public void setToShowGroupLabels(boolean toShowGroupLabels) {
        if ((this.getLayoutKind() == LayoutKind.COLUMN_FILL)
                && toShowGroupLabels) {
            throw new IllegalArgumentException(
                    "Column fill layout is not supported when group labels are shown");
        }
        if (this.toShowGroupLabels != toShowGroupLabels) {
            this.toShowGroupLabels = toShowGroupLabels;
            this.fireStateChanged();
        }
    }

    public int getCommandHorizontalAlignment() {
        return this.commandHorizontalAlignment;
    }

    public boolean isMenu() {
        return this.isMenu;
    }

    public JCommandButton.CommandButtonPopupOrientationKind getPopupOrientationKind() {
        return this.popupOrientationKind;
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

    public static class CommandPanelPresentationModelBuilder {
        private int maxColumns = -1;
        private int maxRows = -1;
        private boolean toShowGroupLabels = true;
        private LayoutKind layoutKind = LayoutKind.ROW_FILL;
        private CommandButtonDisplayState commandDisplayState;
        private Integer commandIconDimension = -1;
        private int commandHorizontalAlignment = AbstractCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT;
        private boolean isMenu = false;
        private JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind =
                JCommandButton.CommandButtonPopupOrientationKind.DOWNWARD;

        public CommandPanelPresentationModelBuilder setMaxColumns(int maxColumns) {
            this.maxColumns = maxColumns;
            return this;
        }

        public CommandPanelPresentationModelBuilder setMaxRows(int maxRows) {
            this.maxRows = maxRows;
            return this;
        }

        public CommandPanelPresentationModelBuilder setToShowGroupLabels(boolean toShowGroupLabels) {
            this.toShowGroupLabels = toShowGroupLabels;
            return this;
        }

        public CommandPanelPresentationModelBuilder setLayoutKind(
                LayoutKind layoutKind) {
            this.layoutKind = layoutKind;
            return this;
        }

        public CommandPanelPresentationModelBuilder setCommandDisplayState(
                CommandButtonDisplayState commandDisplayState) {
            this.commandDisplayState = commandDisplayState;
            return this;
        }

        public CommandPanelPresentationModelBuilder setCommandIconDimension(Integer commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            return this;
        }

        public CommandPanelPresentationModelBuilder setCommandHorizontalAlignment(int commandHorizontalAlignment) {
            this.commandHorizontalAlignment = commandHorizontalAlignment;
            return this;
        }

        public CommandPanelPresentationModelBuilder setPopupOrientationKind(
                JCommandButton.CommandButtonPopupOrientationKind popupOrientationKind) {
            this.popupOrientationKind = popupOrientationKind;
            return this;
        }

        public CommandPanelPresentationModelBuilder setMenu(boolean isMenu) {
            this.isMenu = isMenu;
            return this;
        }

        public CommandPanelPresentationModel build() {
            CommandPanelPresentationModel presentationModel = new CommandPanelPresentationModel();
            presentationModel.maxColumns = this.maxColumns;
            presentationModel.maxRows = this.maxRows;
            presentationModel.layoutKind = this.layoutKind;
            presentationModel.toShowGroupLabels = this.toShowGroupLabels;
            presentationModel.commandIconDimension = this.commandIconDimension;
            presentationModel.commandDisplayState = this.commandDisplayState;
            presentationModel.commandHorizontalAlignment = this.commandHorizontalAlignment;
            presentationModel.isMenu = this.isMenu;
            presentationModel.popupOrientationKind = this.popupOrientationKind;
            return presentationModel;
        }
    }
}
