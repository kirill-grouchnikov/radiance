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
import org.pushingpixels.radiance.component.api.common.model.panel.MenuPopupPanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelLayoutSpec;
import org.pushingpixels.radiance.component.api.common.model.panel.PanelRowFillSpec;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;

import javax.swing.event.ChangeListener;

public class CommandPopupMenuPanelPresentationModel implements MutablePresentationModel, ChangeAware {
    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    private MenuPopupPanelLayoutSpec layoutSpec;

    /**
     * If <code>true</code>, the panel will show group labels.
     */
    private boolean toShowGroupLabels = true;

    private CommandButtonPresentationState commandPresentationState;

    private Integer commandIconDimension;

    private int commandHorizontalAlignment;

    private CommandPopupMenuPanelPresentationModel() {
        this.weakChangeSupport = new WeakChangeSupport(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public CommandButtonPresentationState getCommandPresentationState() {
        return commandPresentationState;
    }

    public void setCommandPresentationState(CommandButtonPresentationState commandPresentationState) {
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
        if (this.commandIconDimension != commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            if (this.commandIconDimension != -1) {
                this.commandPresentationState = CommandButtonPresentationState.FIT_TO_ICON;
            }
            this.fireStateChanged();
        }
    }

    public MenuPopupPanelLayoutSpec getLayoutSpec() {
        return this.layoutSpec;
    }

    public void setLayoutSpec(MenuPopupPanelLayoutSpec layoutSpec) {
        if (layoutSpec == null) {
            throw new IllegalArgumentException("Layout spec cannot be null");
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
        if (this.toShowGroupLabels != toShowGroupLabels) {
            this.toShowGroupLabels = toShowGroupLabels;
            this.fireStateChanged();
        }
    }

    public int getCommandHorizontalAlignment() {
        return this.commandHorizontalAlignment;
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
        private MenuPopupPanelLayoutSpec layoutSpec;
        private boolean toShowGroupLabels = true;
        private CommandButtonPresentationState commandPresentationState;
        private Integer commandIconDimension = -1;
        private int commandHorizontalAlignment = JCommandButton.DEFAULT_HORIZONTAL_ALIGNMENT;

        public Builder setLayoutSpec(MenuPopupPanelLayoutSpec layoutSpec) {
            this.layoutSpec = layoutSpec;
            return this;
        }

        public Builder setToShowGroupLabels(boolean toShowGroupLabels) {
            this.toShowGroupLabels = toShowGroupLabels;
            return this;
        }

        public Builder setCommandPresentationState(
                CommandButtonPresentationState commandPresentationState) {
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

        public CommandPopupMenuPanelPresentationModel build() {
            if (this.layoutSpec == null) {
                throw new IllegalArgumentException("Layout spec cannot be null");
            }

            CommandPopupMenuPanelPresentationModel presentationModel = new CommandPopupMenuPanelPresentationModel();
            presentationModel.layoutSpec = this.layoutSpec;
            presentationModel.toShowGroupLabels = this.toShowGroupLabels;
            presentationModel.commandIconDimension = this.commandIconDimension;
            presentationModel.commandPresentationState = this.commandPresentationState;
            presentationModel.commandHorizontalAlignment = this.commandHorizontalAlignment;
            return presentationModel;
        }
    }
}
