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
package org.pushingpixels.radiance.component.api.common.model;

import org.pushingpixels.radiance.component.api.common.CommandButtonPresentationState;
import org.pushingpixels.radiance.component.api.common.model.panel.MenuPopupPanelLayoutSpec;
import org.pushingpixels.radiance.component.internal.utils.WeakChangeSupport;
import org.pushingpixels.radiance.theming.api.RadianceThemingSlices;

import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Objects;

public class CommandPopupMenuPanelPresentationModel implements MutablePresentationModel {
    /**
     * Stores the listeners on this model.
     */
    private final WeakChangeSupport weakChangeSupport;

    private MenuPopupPanelLayoutSpec layoutSpec;

    private Insets contentPadding;
    private int contentGap;
    private boolean toShowGroupLabels = true;

    private CommandButtonPresentationState commandPresentationState;
    private Dimension commandIconDimension;
    private Insets commandContentPadding;
    private double commandHorizontalGapScaleFactor;
    private double commandVerticalGapScaleFactor;
    private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy;
    private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy;
    private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy;
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
            this.fireStateChanged();
        }
    }

    public Insets getCommandContentPadding() {
        return this.commandContentPadding;
    }

    public void setCommandContentPadding(Insets commandContentPadding) {
        if (commandContentPadding == null) {
            throw new IllegalArgumentException("Command content padding cannot be null");
        }
        if (this.commandContentPadding != commandContentPadding) {
            this.commandContentPadding = commandContentPadding;
            this.fireStateChanged();
        }
    }

    public Dimension getCommandIconDimension() {
        return commandIconDimension;
    }

    public void setCommandIconDimension(Dimension commandIconDimension) {
        if (this.commandIconDimension != commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
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

    public Insets getContentPadding() {
        return this.contentPadding;
    }

    public void setContentPadding(Insets contentPadding) {
        if (contentPadding == null) {
            throw new IllegalArgumentException("Content padding cannot be null");
        }
        if (!Objects.equals(this.contentPadding, contentPadding)) {
            this.contentPadding = contentPadding;
            this.fireStateChanged();
        }
    }

    public int getContentGap() {
        return this.contentGap;
    }

    public void setContentGap(int contentGap) {
        if (this.contentGap != contentGap) {
            this.contentGap = contentGap;
            this.fireStateChanged();
        }
    }

    public double getCommandHorizontalGapScaleFactor() {
        return this.commandHorizontalGapScaleFactor;
    }

    public void setCommandHorizontalGapScaleFactor(double commandHorizontalGapScaleFactor) {
        if (this.commandHorizontalGapScaleFactor != commandHorizontalGapScaleFactor) {
            this.commandHorizontalGapScaleFactor = commandHorizontalGapScaleFactor;
            this.fireStateChanged();
        }
    }

    public double getCommandVerticalGapScaleFactor() {
        return this.commandVerticalGapScaleFactor;
    }

    public void setCommandVerticalGapScaleFactor(double commandVerticalGapScaleFactor) {
        if (this.commandVerticalGapScaleFactor != commandVerticalGapScaleFactor) {
            this.commandVerticalGapScaleFactor = commandVerticalGapScaleFactor;
            this.fireStateChanged();
        }
    }

    public RadianceThemingSlices.BackgroundAppearanceStrategy getBackgroundAppearanceStrategy() {
        return this.backgroundAppearanceStrategy;
    }

    public void setBackgroundAppearanceStrategy(RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
        if (this.backgroundAppearanceStrategy != backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            this.fireStateChanged();
        }
    }

    public RadianceThemingSlices.IconFilterStrategy getActiveIconFilterStrategy() {
        return this.activeIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getEnabledIconFilterStrategy() {
        return this.enabledIconFilterStrategy;
    }

    public RadianceThemingSlices.IconFilterStrategy getDisabledIconFilterStrategy() {
        return this.disabledIconFilterStrategy;
    }

    public void setIconFilterStrategies(
            RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
            RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
            RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
        if ((this.activeIconFilterStrategy != activeIconFilterStrategy) ||
                (this.enabledIconFilterStrategy != enabledIconFilterStrategy) ||
                (this.disabledIconFilterStrategy != disabledIconFilterStrategy)) {
            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
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
        private Insets contentPadding = CommandPanelPresentationModel.DEFAULT_CONTENT_PADDING;
        private int contentGap = CommandPanelPresentationModel.DEFAULT_GAP;
        private boolean toShowGroupLabels = true;
        private CommandButtonPresentationState commandPresentationState;
        private Dimension commandIconDimension = null;
        private Insets commandContentPadding = CommandButtonPresentationModel.COMPACT_BUTTON_CONTENT_PADDING;
        private double commandHorizontalGapScaleFactor =
                CommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR;
        private double commandVerticalGapScaleFactor =
                CommandButtonPresentationModel.DEFAULT_GAP_SCALE_FACTOR;
        private RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy =
                RadianceThemingSlices.BackgroundAppearanceStrategy.FLAT;
        private RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.ORIGINAL;
        private RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy =
                RadianceThemingSlices.IconFilterStrategy.THEMED_FOLLOW_COLOR_SCHEME;
        private int commandHorizontalAlignment = CommandButtonPresentationModel.DEFAULT_HORIZONTAL_ALIGNMENT;

        public Builder setLayoutSpec(MenuPopupPanelLayoutSpec layoutSpec) {
            this.layoutSpec = layoutSpec;
            return this;
        }

        public Builder setContentPadding(Insets contentPadding) {
            if (commandContentPadding == null) {
                throw new IllegalArgumentException("Command content padding cannot be null");
            }
            this.contentPadding = contentPadding;
            return this;
        }

        public Builder setContentGap(int contentGap) {
            this.contentGap = contentGap;
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

        public Builder setCommandIconDimension(Dimension commandIconDimension) {
            this.commandIconDimension = commandIconDimension;
            return this;
        }

        public Builder setCommandContentPadding(Insets commandContentPadding) {
            if (commandContentPadding == null) {
                throw new IllegalArgumentException("Command content padding cannot be null");
            }
            this.commandContentPadding = commandContentPadding;
            return this;
        }

        public Builder setCommandHorizontalAlignment(int commandHorizontalAlignment) {
            this.commandHorizontalAlignment = commandHorizontalAlignment;
            return this;
        }

        public Builder setBackgroundAppearanceStrategy(
                RadianceThemingSlices.BackgroundAppearanceStrategy backgroundAppearanceStrategy) {
            this.backgroundAppearanceStrategy = backgroundAppearanceStrategy;
            return this;
        }

        public Builder setCommandHorizontalGapScaleFactor(double commandHorizontalGapScaleFactor) {
            this.commandHorizontalGapScaleFactor = commandHorizontalGapScaleFactor;
            return this;
        }

        public Builder setCommandVerticalGapScaleFactor(double commandVerticalGapScaleFactor) {
            this.commandVerticalGapScaleFactor = commandVerticalGapScaleFactor;
            return this;
        }

        public Builder setIconFilterStrategies(
                RadianceThemingSlices.IconFilterStrategy activeIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy enabledIconFilterStrategy,
                RadianceThemingSlices.IconFilterStrategy disabledIconFilterStrategy) {
            this.activeIconFilterStrategy = activeIconFilterStrategy;
            this.enabledIconFilterStrategy = enabledIconFilterStrategy;
            this.disabledIconFilterStrategy = disabledIconFilterStrategy;
            return this;
        }

        public CommandPopupMenuPanelPresentationModel build() {
            if (this.layoutSpec == null) {
                throw new IllegalArgumentException("Layout spec cannot be null");
            }

            CommandPopupMenuPanelPresentationModel presentationModel = new CommandPopupMenuPanelPresentationModel();
            presentationModel.layoutSpec = this.layoutSpec;
            presentationModel.contentPadding = this.contentPadding;
            presentationModel.contentGap = this.contentGap;
            presentationModel.toShowGroupLabels = this.toShowGroupLabels;
            presentationModel.commandIconDimension = this.commandIconDimension;
            presentationModel.commandPresentationState = this.commandPresentationState;
            presentationModel.commandContentPadding = this.commandContentPadding;
            presentationModel.commandHorizontalGapScaleFactor = this.commandHorizontalGapScaleFactor;
            presentationModel.commandVerticalGapScaleFactor = this.commandVerticalGapScaleFactor;
            presentationModel.backgroundAppearanceStrategy = this.backgroundAppearanceStrategy;
            presentationModel.activeIconFilterStrategy = this.activeIconFilterStrategy;
            presentationModel.enabledIconFilterStrategy = this.enabledIconFilterStrategy;
            presentationModel.disabledIconFilterStrategy = this.disabledIconFilterStrategy;
            presentationModel.commandHorizontalAlignment = this.commandHorizontalAlignment;
            return presentationModel;
        }
    }
}
