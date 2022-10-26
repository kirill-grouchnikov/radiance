/*
 * Copyright (c) 2005-2022 Radiance Kirill Grouchnikov. All Rights Reserved.
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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.JCommandButton;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelRowFillSpec;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.event.ChangeListener;
import java.util.Objects;

public class CommandPanelPresentationModel implements MutablePresentationModel, ChangeAware {
    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    private PanelLayoutSpec layoutSpec = new PanelLayoutSpec.RowFill(new PanelRowFillSpec.Adaptive(48));

    /**
     * If <code>true</code>, the panel will show group labels.
     */
    private boolean toShowGroupLabels = true;

    private CommandButtonPresentationState commandPresentationState;

    private Integer commandIconDimension;

    private int commandHorizontalAlignment;
    private boolean isMenu;
    private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy;

    private CommandPanelPresentationModel() {
        this.weakChangeSupport = new WeakChangeSupport(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommandButtonPresentationState getCommandPresentationState() {
        return commandPresentationState;
    }

    public void setCommandPresentationState(CommandButtonPresentationState commandPresentationState) {
        if (commandPresentationState == null) {
            throw new IllegalArgumentException("Command presentation state cannot be null");
        }
        if (this.commandPresentationState != commandPresentationState) {
            this.commandPresentationState = commandPresentationState;
            if (this.commandPresentationState != CommandButtonPresentationState.FIT_TO_ICON) {
                this.commandIconDimension = -1;
            }
            this.fireStateChanged();
        }
    }

    public Integer getCommandIconDimension() {
        return commandIconDimension;
    }

    public void setCommandIconDimension(Integer commandIconDimension) {
        if (!Objects.equals(this.commandIconDimension, commandIconDimension)) {
            this.commandIconDimension = commandIconDimension;
            if (this.commandIconDimension != -1) {
                this.commandPresentationState = CommandButtonPresentationState.FIT_TO_ICON;
            }
            this.fireStateChanged();
        }
    }

    public PanelLayoutSpec getLayoutSpec() {
        return this.layoutSpec;
    }

    public void setLayoutSpec(PanelLayoutSpec layoutSpec) {
        if (layoutSpec == null) {
            throw new IllegalArgumentException("Layout spec cannot be null");
        }
        if (this.isToShowGroupLabels()
                && (layoutSpec instanceof PanelLayoutSpec.ColumnFill)) {
            throw new IllegalArgumentException(
                    "Column fill layout is not supported when group labels are shown");
        }
        if (this.layoutSpec != layoutSpec) {
            this.layoutSpec = layoutSpec;
            this.fireStateChanged();
        }
    }

    public boolean isToShowGroupLabels() {
        return this.toShowGroupLabels;
    }

    public void setToShowGroupLabels(boolean toShowGroupLabels) {
        if ((this.getLayoutSpec() instanceof PanelLayoutSpec.ColumnFill)
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

    public RadianceThemingSlices.PopupPlacementStrategy getPopupPlacementStrategy() {
        return this.popupPlacementStrategy;
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

    public static class Builder {
        private PanelLayoutSpec layoutSpec =
                new PanelLayoutSpec.RowFill(new PanelRowFillSpec.Adaptive(48));
        private boolean toShowGroupLabels = true;
        private CommandButtonPresentationState commandPresentationState =
                CommandButtonPresentationState.MEDIUM;
        private Integer commandIconDimension = -1;
        private int commandHorizontalAlignment = JCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT;
        private boolean isMenu = false;
        private RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy =
                RadianceThemingSlices.PopupPlacementStrategy.Downward.HALIGN_START;

        public Builder setLayoutSpec(PanelLayoutSpec layoutSpec) {
            if (layoutSpec == null) {
                throw new IllegalArgumentException("Layout spec cannot be null");
            }
            this.layoutSpec = layoutSpec;
            return this;
        }

        public Builder setToShowGroupLabels(boolean toShowGroupLabels) {
            this.toShowGroupLabels = toShowGroupLabels;
            return this;
        }

        public Builder setCommandPresentationState(
                CommandButtonPresentationState commandPresentationState) {
            if (commandPresentationState == null) {
                throw new IllegalArgumentException("Command presentation state cannot be null");
            }
            this.commandPresentationState = commandPresentationState;
            return this;
        }

        public Builder setCommandIconDimension(Integer commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            return this;
        }

        public Builder setCommandHorizontalAlignment(int commandHorizontalAlignment) {
            this.commandHorizontalAlignment = commandHorizontalAlignment;
            return this;
        }

        public Builder setPopupPlacementStrategy(
                RadianceThemingSlices.PopupPlacementStrategy popupPlacementStrategy) {
            if (popupPlacementStrategy == null) {
                throw new IllegalArgumentException("Popup placement strategy cannot be null");
            }
            this.popupPlacementStrategy = popupPlacementStrategy;
            return this;
        }

        public Builder setMenu(boolean isMenu) {
            this.isMenu = isMenu;
            return this;
        }

        public CommandPanelPresentationModel build() {
            CommandPanelPresentationModel presentationModel = new CommandPanelPresentationModel();
            presentationModel.layoutSpec = this.layoutSpec;
            presentationModel.toShowGroupLabels = this.toShowGroupLabels;
            presentationModel.commandIconDimension = this.commandIconDimension;
            presentationModel.commandPresentationState = this.commandPresentationState;
            presentationModel.commandHorizontalAlignment = this.commandHorizontalAlignment;
            presentationModel.isMenu = this.isMenu;
            presentationModel.popupPlacementStrategy = this.popupPlacementStrategy;
            return presentationModel;
        }
    }
}
